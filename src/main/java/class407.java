import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class407 {

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "[S")
    public short[] field5893;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "J")
    public long field5896;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "[S")
    public short[] field5887;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
    public int[] field5892;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "[I")
    public static int[] field5889 = new int[4];

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5888 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field5895 = -1;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;B[BI)I")
    public static final int method2525(String arg0, byte arg1, byte[] arg2, int arg3) {
        field5891++;
        int var4 = arg3;
        int var5 = arg0.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class66.method570(arg0.charAt(var6), -1);
            int var8 = var5 <= (var6 + 1) ? -1 : class66.method570(arg0.charAt(var6 + 1), -1);
            int var9 = (var6 + 2) < var5 ? class66.method570(arg0.charAt(var6 + 2), -1) : -1;
            int var10 = var6 + 3 < var5 ? class66.method570(arg0.charAt(var6 + 3), -1) : -1;
            arg2[arg3++] = (byte) class213.method1409(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg2[arg3++] = (byte) class213.method1409(var9 >>> 2, class440.method2643(var8 << 4, 240));
            if (var10 == -1) {
                break;
            }
            arg2[arg3++] = (byte) class213.method1409(var10, class440.method2643(var9, 3) << 6);
        }
        if (arg1 < 21) {
            field5889 = null;
        }
        return arg3 - var4;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method2526(int arg0) {
        field5889 = null;
        int var1 = -49 / ((arg0 - 45) / 32);
        field5888 = null;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public static final void method2527(int arg0) {
        if (arg0 != 6812) {
            return;
        }
        for (int var1 = 0; var1 < class66.field931.length; var1++) {
            for (int var2 = 0; var2 < class66.field931[0].length; var2++) {
                for (int var3 = 0; var3 < class66.field931[0][0].length; var3++) {
                    class66.field931[var1][var2][var3] = 0;
                }
            }
        }
        field5890++;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(J[I[S[S)V")
    public class407(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field5893 = arg3;
        this.field5896 = arg0;
        this.field5887 = arg2;
        this.field5892 = arg1;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    protected class407() {
    }
}
