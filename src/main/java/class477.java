import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class477 extends class323 {

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    private int field6835;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    private int field6831;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    private int field6842;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    private int field6843;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Ljn;")
    public static class117 field6828 = new class117(8);

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "Ljn;")
    public static class117 field6838 = new class117(8);

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field6841 = 0;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    private int field6825;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    private int field6829;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    private int field6836;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    private int field6837;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field6830;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "[B")
    private byte[] field6833;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIB)V", line = 7)
    public void method2791(int arg0, int arg1, byte arg2) {
        field6826++;
        this.field6833[arg0] = arg2;
        if (arg1 != -103) {
            this.method1931(38);
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V", line = 20)
    public static void method2792(int arg0) {
        if (arg0 >= -63) {
            method2792(76);
        }
        field6828 = null;
        field6830 = null;
        field6838 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)V", line = 36)
    public final void method1930(int arg0, int arg1, byte arg2) {
        field6832++;
        if (arg2 != -43) {
            this.field6825 = -113;
        }
        if (arg1 == 0) {
            this.field6829 = this.field6831 - (arg0 >= 0 ? arg0 : -arg0);
            this.field6837 = 4096;
            this.field6829 = this.field6829 * this.field6829 >> 12;
            this.field6825 = this.field6829;
            return;
        }
        this.field6837 = this.field6835 * this.field6829 >> 12;
        if (this.field6837 < 0) {
            this.field6837 = 0;
        } else if (this.field6837 > 4096) {
            this.field6837 = 4096;
        }
        this.field6829 = this.field6831 - (arg0 >= 0 ? arg0 : -arg0);
        this.field6829 = this.field6829 * this.field6829 >> 12;
        this.field6829 = this.field6837 * this.field6829 >> 12;
        this.field6825 += this.field6843 * this.field6829 >> 12;
        this.field6843 = this.field6843 * this.field6842 >> 12;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V", line = 75)
    public final void method1937(int arg0) {
        int var2 = -60 / ((-arg0 - 33) / 43);
        this.field6825 = 0;
        field6840++;
        this.field6836 = 0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 86)
    public static final String method2793(String arg0, int arg1) {
        if (arg1 != -15387) {
            field6828 = null;
        }
        field6839++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && var3 > (var4 + 2)) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + 10 - 'a';
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + 10 - 65;
                }
                int var9 = var8 * 16;
                char var10 = arg0.charAt(var4 + 2);
                int var11;
                if (var10 >= '0' && var10 <= '9') {
                    var11 = var10 + var9 - '0';
                } else if (var10 >= 'a' && var10 <= 'f') {
                    var11 = var10 + var9 + 10 - 97;
                } else {
                    if (var10 < 'A' || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var10 + var9 - 55;
                }
                if (var11 != 0 && class512.method3046(arg1 + 15259, (byte) var11)) {
                    var2.append(class409.method2446((byte) var11, -18082));
                }
                var4 += 2;
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIIIIFFF)V", line = 171)
    public class477(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6835 = (int) (arg7 * 4096.0F);
        this.field6831 = (int) (arg6 * 4096.0F);
        this.field6843 = this.field6842 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 192)
    public final void method1931(int arg0) {
        field6827++;
        this.field6843 = this.field6842;
        this.field6825 >>= 0x4;
        if (this.field6825 < 0) {
            this.field6825 = 0;
        } else if (this.field6825 > 255) {
            this.field6825 = 255;
        }
        if (arg0 >= 80) {
            this.method2791(this.field6836++, -103, (byte) this.field6825);
            this.field6825 = 0;
        }
    }
}
