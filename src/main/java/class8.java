import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class164 {

    @OriginalMember(owner = "client!to", name = "A", descriptor = "Ltia;")
    public static class266 field124 = new class266();

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!to", name = "z", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!to", name = "D", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!to", name = "E", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "Loia;")
    public class88 field113;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "Loia;")
    private class88 field114;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "Loia;")
    private class88 field120;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "Loia;")
    private class88 field122;

    @OriginalMember(owner = "client!to", name = "B", descriptor = "Loia;")
    private class88 field125;

    @OriginalMember(owner = "client!to", name = "C", descriptor = "Loia;")
    private class88 field126;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V", line = 5)
    public static void method48(int arg0) {
        field124 = null;
        if (arg0 != 11) {
            method54(-44, -122, -13, true);
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lfp;Lfp;Loq;)V", line = 15)
    public class8(class323 arg0, class323 arg1, class358 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)Z", line = 18)
    public final boolean method49(int arg0) {
        ++field128;
        if (!super.method49(arg0)) {
            return false;
        } else {
            class358 var2 = (class358) super.field2256;
            if (!super.field2249.method2088(var2.field5096, -28)) {
                return false;
            } else if (!super.field2249.method2088(var2.field5089, arg0 + 32343)) {
                return false;
            } else if (!super.field2249.method2088(var2.field5093, arg0 + 32346)) {
                return false;
            } else if (!super.field2249.method2088(var2.field5098, 92)) {
                return false;
            } else if (!super.field2249.method2088(var2.field5090, 125)) {
                return false;
            } else {
                return super.field2249.method2088(var2.field5091, 109);
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)I", line = 55)
    public static final int method50(int arg0, int arg1, int arg2) {
        ++field116;
        double var3 = Math.log((double) arg1) / Math.log(2.0D);
        if (arg0 >= -64) {
            return 103;
        } else {
            double var5 = Math.log((double) arg2) / Math.log(2.0D);
            double var7 = Math.random() * (-var5 + var3) + var5;
            return (int) (Math.pow(2.0D, var7) + 0.5D);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZIBI)V", line = 80)
    public final void method51(boolean arg0, int arg1, byte arg2, int arg3) {
        ++field123;
        if (arg0) {
            int[] var5 = new int[4];
            class268.field3831.method398(var5);
            class268.field3831.method469(arg1, arg3, super.field2256.field2873 + arg1, arg3 - -super.field2256.field2874);
            int var6 = this.field126.method656();
            int var7 = this.field126.method670();
            int var8 = this.field125.method656();
            int var9 = this.field125.method670();
            this.field126.method658(arg1, (-var7 + super.field2256.field2874) / 2 + arg3);
            this.field125.method658(-var8 + arg1 + super.field2256.field2873, arg3 - -((super.field2256.field2874 - var9) / 2));
            class268.field3831.method469(arg1, arg3, super.field2256.field2873 + arg1, arg3 - -this.field120.method670());
            this.field120.method666(arg1 + var6, arg3, super.field2256.field2873 - var6 + -var8, super.field2256.field2874);
            int var10 = this.field114.method670();
            class268.field3831.method469(arg1, arg3 - -super.field2256.field2874 + -var10, super.field2256.field2873 + arg1, arg3 - -super.field2256.field2874);
            this.field114.method666(arg1 + var6, -var10 + super.field2256.field2874 + arg3, -var8 + super.field2256.field2873 + -var6, super.field2256.field2874);
            class268.field3831.method469(var5[0], var5[1], var5[2], var5[3]);
        }
        if (arg2 != -104) {
            this.field114 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIZB)V", line = 120)
    public final void method52(int arg0, int arg1, boolean arg2, byte arg3) {
        ++field127;
        int var5 = arg1 - -this.field126.method656();
        if (arg3 >= -88) {
            this.method53(-84, -116, 82, -14, 4);
        }
        int var6 = super.field2256.field2873 + arg1 - this.field125.method656();
        int var7 = this.field120.method670() + arg0;
        int var8 = arg0 - -super.field2256.field2874 - this.field114.method670();
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = this.method1081(2) * var9 / 10000;
        int[] var12 = new int[4];
        class268.field3831.method398(var12);
        class268.field3831.method469(var5, var7, var5 + var11, var8);
        this.method53(var7, 11, var10, var9, var5);
        class268.field3831.method469(var5 + var11, var7, var6, var8);
        this.field122.method666(var5, var7, var9, var10);
        class268.field3831.method469(var12[0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIII)V", line = 153)
    public void method53(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field113.method666(arg4, arg0, arg3, arg2);
        ++field121;
        if (arg1 != 11) {
            this.method53(10, -6, 10, 39, -124);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIZ)V", line = 170)
    public static final void method54(int arg0, int arg1, int arg2, boolean arg3) {
        ++field118;
        if (!arg3) {
            field115 = 88;
        }
        class592 var4 = class682.method3825(-652872096, 11, arg1);
        var4.method3351(0);
        var4.field8343 = arg2;
        var4.field8337 = arg0;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V", line = 187)
    public final void method55(int arg0) {
        if (arg0 == 11133) {
            ++field117;
            super.method55(arg0);
            class358 var2 = (class358) super.field2256;
            this.field113 = class674.method3686(-20770, super.field2249, var2.field5096);
            this.field122 = class674.method3686(-20770, super.field2249, var2.field5089);
            this.field126 = class674.method3686(-20770, super.field2249, var2.field5093);
            this.field125 = class674.method3686(-20770, super.field2249, var2.field5098);
            this.field120 = class674.method3686(-20770, super.field2249, var2.field5090);
            this.field114 = class674.method3686(-20770, super.field2249, var2.field5091);
        }
    }
}
