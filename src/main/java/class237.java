import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class class237 extends class274 {

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field3192 = 0;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "[I")
    public static int[] field3193 = new int[16384];

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "[I")
    public static int[] field3196 = new int[16384];

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "Lxa;")
    public static class511 field3201;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)Z")
    public final boolean method78(int arg0) {
        if (arg0 != 0) {
            this.method73(59, -6, null, 113, null, false, 49);
        }
        field3198++;
        return false;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IJ)V")
    public static final void method1496(int arg0, long arg1) {
        field3197++;
        class11 var3 = class421.method2423(-95);
        var3.field114.method2352(true, class206.field2659.field6068);
        var3.field114.method2391((byte) 110, arg1);
        var3.field114.method2352(true, class144.field1890);
        class100.method760(var3, arg0 - 16309);
        class291.field3766 = -3;
        class66.field906 = 0;
        if (arg0 != 16384) {
            field3193 = null;
        }
        class340.field4386 = 0;
        class45.field627 = 1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILoa;ILcq;ZI)V")
    public final void method73(int arg0, int arg1, class43 arg2, int arg3, class274 arg4, boolean arg5, int arg6) {
        field3190++;
        if (arg6 > -2) {
            field3196 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
    public final void method77(byte arg0) {
        field3188++;
        if (arg0 == 7) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)I")
    public abstract int method1497(int arg0);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1498(byte arg0, String arg1) {
        field3194++;
        if (arg1.equals("") || arg0 >= -51) {
            return;
        }
        class152.field1939++;
        class11 var2 = class130.method931(class649.field9035, (byte) 54, class5.field33);
        var2.field114.method2352(true, class367.method2111(2, arg1));
        var2.field114.method2374(arg1, -116);
        class100.method760(var2, -99);
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
    public static void method1499(int arg0) {
        field3193 = null;
        if (arg0 <= -56) {
            field3196 = null;
            field3201 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IIIIIII)V")
    public class237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3191 = arg6;
        this.field3189 = arg4;
        this.field3200 = arg3;
        this.field3187 = arg1;
        this.field3195 = arg0;
        this.field3186 = arg2;
        this.field3199 = arg5;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3193[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field3196[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
    }
}
