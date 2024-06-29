import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class434 extends class648 {

    @OriginalMember(owner = "client!rba", name = "t", descriptor = "Lno;")
    private class704 field6457;

    @OriginalMember(owner = "client!rba", name = "l", descriptor = "Lpba;")
    private class333 field6449;

    @OriginalMember(owner = "client!rba", name = "u", descriptor = "Ldw;")
    private class720 field6458;

    @OriginalMember(owner = "client!rba", name = "m", descriptor = "Log;")
    public static class651 field6450 = new class651();

    @OriginalMember(owner = "client!rba", name = "v", descriptor = "I")
    public static int field6459 = -1;

    @OriginalMember(owner = "client!rba", name = "A", descriptor = "[[I")
    public static int[][] field6464 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!rba", name = "x", descriptor = "Lmia;")
    public static class63 field6461 = new class63(58, -1);

    @OriginalMember(owner = "client!rba", name = "n", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!rba", name = "o", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!rba", name = "p", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!rba", name = "q", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!rba", name = "r", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!rba", name = "s", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!rba", name = "w", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!rba", name = "y", descriptor = "[I")
    public static int[] field6462;

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "(I)V")
    public final void method1450(int arg0) {
        if (arg0 >= -67) {
            this.field6449 = null;
        }
        ++field6452;
        super.field9139.method2329(0, (byte) -125, class331.field4759);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lbca;II)V")
    public final void method1455(class663 arg0, int arg1, int arg2) {
        ++field6453;
        if (arg1 != 12885) {
            this.method1449(-99);
        }
    }

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "(B)V")
    public static void method2687(byte arg0) {
        field6450 = null;
        field6462 = null;
        int var1 = -16 / ((arg0 - 81) / 37);
        field6461 = null;
        field6464 = null;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(BII)V")
    public final void method1453(byte arg0, int arg1, int arg2) {
        if (arg0 > 33) {
            ++field6455;
            if (!this.field6449.field4782) {
                int var4 = super.field9139.field5552 % 4000 * 16 / 4000;
                super.field9139.method2294(this.field6449.field4779[var4], -2);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
            } else {
                float var5 = (float) (super.field9139.field5552 % 4000) / 4000.0F;
                super.field9139.method2294(this.field6449.field4775, -2);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "(I)Z")
    public final boolean method1449(int arg0) {
        if (arg0 != 13003) {
            this.field6458 = null;
        }
        ++field6451;
        return this.field6458 != null;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZI)V")
    public final void method1448(boolean arg0, int arg1) {
        ++field6454;
        super.field9139.method2300(class661.field9242, class499.field7099, arg1);
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZZ)V")
    public final void method1451(boolean arg0, boolean arg1) {
        ++field6456;
        OpenGL.glBindProgramARB(34336, this.field6458.field10100);
        if (arg0) {
            this.method1448(false, -36);
        }
        OpenGL.glEnable(34336);
        super.field9139.method2329(0, (byte) -127, class328.field4670);
    }

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "(I)V")
    public static final void method2688(int arg0) {
        ++field6460;
        class194 var1 = (class194) class154.field2501.method2283(false);
        if (arg0 >= -86) {
            field6464 = null;
        }
        while (var1 != null) {
            class755.method4212(false, var1.field2934);
            var1 = (class194) class154.field2501.method2282((byte) 107);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(II)V")
    public static final void method2689(int arg0, int arg1) {
        class350.method2210(arg0 ^ 84);
        ++field6463;
        int var2 = class538.field7691.method1319(arg1, (byte) 57).field8952;
        if (~var2 != -1) {
            int var3 = class83.field1160.field6176[arg1];
            if (arg0 == var2) {
                class190.field2881 = var3;
            }
            if (var2 == 6) {
                class461.field6795 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lno;Lvd;Lpba;)V")
    public class434(class704 arg0, class39 arg1, class333 arg2) {
        super(arg0);
        this.field6457 = arg0;
        this.field6449 = arg2;
        if (arg1 != null && this.field6449.method2102(0) && this.field6457.field9917) {
            this.field6458 = class234.method1558(34336, arg1.method233(-104, "gl", "transparent_water"), true, this.field6457);
        } else {
            this.field6458 = null;
        }
    }
}
