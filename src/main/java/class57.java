import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class57 extends class259 {

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    private int field675 = 0;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    private int field676 = -1;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    private int field679;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "Lnk;")
    public static class16 field677;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V", line = 6)
    public static final void method340(int arg0) {
        field681++;
        class151.field2392.method378(0);
        if (arg0 == 1) {
            class119.field1659.method378(arg0 - 1);
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(II)I", line = 18)
    public static final int method341(int arg0, int arg1) {
        field678++;
        if (arg1 <= 7) {
            method342(11);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V", line = 30)
    public static final void method342(int arg0) {
        if (arg0 != 28355) {
            field680 = 123;
        }
        field673++;
        class344.field5462.method383((byte) -48);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 45)
    public static final String method343(String arg0, int arg1) {
        field671++;
        int var2 = arg0.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        int var5 = 0;
        if (arg1 != 33) {
            method346(52, 80, 12, 4);
        }
        while (var2 > var5) {
            char var6 = arg0.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class342.method2351(181, var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
            var5++;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V", line = 99)
    public static void method344(int arg0) {
        if (arg0 != 29655) {
            field677 = (class16) null;
        }
        field677 = null;
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(I)V", line = 111)
    public final void method345(int arg0) {
        if (arg0 != 693) {
            this.method345(-74);
        }
        field674++;
        int var2 = class277.method1978(true);
        if ((var2 & 0x1) == 0) {
            class272.method1965(this.field676);
        }
        if ((var2 & 0x2) == 0) {
            class272.method1961(0);
        }
        if ((var2 & 0x4) == 0) {
            class272.method1947(0);
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I)V", line = 173)
    public class57(int arg0) {
        GL var2 = class272.field4310;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field676 = var3[0];
        this.field679 = class1.field3;
        class272.method1965(this.field676);
        int var4 = class104.field1440[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class1.field2 += var6.limit() - this.field675;
        this.field675 = var6.limit();
    }

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V", line = 138)
    protected final void finalize() throws Throwable {
        field672++;
        if (this.field676 != -1) {
            class1.method4(this.field676, this.field675, this.field679);
            this.field675 = 0;
            this.field676 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)V", line = 155)
    public static final void method346(int arg0, int arg1, int arg2, int arg3) {
        class196 var4 = class194.field2947[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class54 var5 = var4.field2994;
        if (var5 != null) {
            var5.field615 = var5.field615 * arg3 / 16;
            var5.field634 = var5.field634 * arg3 / 16;
        }
    }
}
