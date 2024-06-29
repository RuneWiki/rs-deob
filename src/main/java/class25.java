import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 extends class376 {

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "Lbg;")
    public static class324 field300 = new class324(76, 7);

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "I")
    public static int field301 = 0;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "Lib;")
    private class106 field296;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "Lfs;")
    public static class387 field302;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "[I")
    public static int[] field297;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Liv;II)V")
    private final void method215(class65 arg0, int arg1, int arg2) {
        field303++;
        if (arg1 != arg2) {
            return;
        }
        int var4 = arg0.method577(arg2 ^ 0x6);
        if (this.field296 == null) {
            int var5 = class118.method934(var4, arg2 + 269172808);
            this.field296 = new class106(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method577(255) == 1;
            int var8 = arg0.method580((byte) 29);
            class223 var9;
            if (var7) {
                var9 = new class75(arg0.method624((byte) -40));
            } else {
                var9 = new class389(arg0.method616((byte) 90));
            }
            this.field296.method878((long) var8, -2301, var9);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILiv;)V")
    public final void method216(int arg0, class65 arg1) {
        if (arg0 != 76) {
            this.method216(-30, null);
        }
        while (true) {
            int var3 = arg1.method577(255);
            if (var3 == 0) {
                field304++;
                return;
            }
            this.method215(arg1, var3, 249);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method217(int arg0) {
        field300 = null;
        field297 = null;
        field302 = null;
        if (arg0 != 7) {
            field300 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)I")
    public final int method218(int arg0, int arg1, int arg2) {
        field298++;
        if (this.field296 == null) {
            return arg0;
        }
        if (arg1 != 76) {
            this.method216(-36, null);
        }
        class389 var4 = (class389) this.field296.method875((long) arg2, 126);
        return var4 == null ? arg0 : var4.field5750;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
    public final String method219(int arg0, String arg1, int arg2) {
        field299++;
        if (arg0 != -16471) {
            field297 = null;
        }
        if (this.field296 == null) {
            return arg1;
        } else {
            class75 var4 = (class75) this.field296.method875((long) arg2, 123);
            return var4 == null ? arg1 : var4.field1020;
        }
    }
}
