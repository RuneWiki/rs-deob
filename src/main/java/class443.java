import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class443 implements class143 {

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "Lwu;")
    private class346 field5583;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "[Les;")
    private class355[] field5579;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Loa;")
    private class650 field5576;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Z")
    private boolean field5584;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZZ)V", line = 5)
    public final void method900(boolean arg0, boolean arg1) {
        boolean var3 = arg1;
        field5585++;
        class355[] var4 = this.field5579;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class355 var6 = var4[var5];
            if (var6 != null) {
                var6.method513(var3 || this.field5584, (byte) 89);
            }
        }
        this.field5584 = false;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 29)
    public final void method903(byte arg0) {
        field5575++;
        if (arg0 != 67) {
            method2435(-76, -65, -20, -92);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)I", line = 43)
    public static final int method2433(byte arg0, int arg1) {
        field5577++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else {
            int var2 = -111 / ((arg0 + 62) / 51);
            if (arg1 == 6410 || arg1 == 34847) {
                return 6410;
            } else if (arg1 == 6402) {
                return 6402;
            } else {
                throw new IllegalArgumentException("");
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)I", line = 76)
    public final int method905(int arg0) {
        if (arg0 != -15038) {
            this.field5583 = null;
        }
        field5586++;
        int var2 = 0;
        class355[] var3 = this.field5579;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class355 var5 = var3[var4];
            if (var5 == null || var5.method516(-6191)) {
                var2++;
            }
        }
        return var2 * 100 / this.field5579.length;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V", line = 110)
    public final void method901(boolean arg0) {
        field5582++;
        if (class309.field3898 != this.field5576) {
            this.field5584 = true;
            this.field5576 = class309.field3898;
        }
        this.field5576.method315(0);
        class355[] var2 = this.field5579;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class355 var4 = var2[var3];
            if (var4 != null) {
                var4.method518(-841);
            }
        }
        if (!arg0) {
            method2433((byte) -4, 50);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(JI)Z", line = 142)
    public final boolean method902(long arg0, int arg1) {
        field5581++;
        if (arg1 <= 125) {
            this.field5576 = null;
        }
        return (arg0 + ((long) this.field5583.field4453)) <= class321.method1854(-39);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)I", line = 153)
    public final int method904(int arg0) {
        if (arg0 != -26721) {
            method2433((byte) 92, -24);
        }
        field5587++;
        return this.field5583.field4458;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V", line = 166)
    public static final void method2434(boolean arg0) {
        field5580++;
        if (class135.field1639 || arg0) {
            return;
        }
        class531.field6707 = true;
        class135.field1639 = true;
        if (class611.field8310.field8695) {
            class23.field266 = ((int) class23.field266 - 17 & 0xFFFFFFF0);
        } else {
            class441.field5547 += (-12.0F - class441.field5547) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lwu;Llo;)V", line = 191)
    public class443(class346 arg0, class705 arg1) {
        this.field5583 = arg0;
        this.field5579 = new class355[this.field5583.field4457.length];
        for (int var3 = 0; var3 < this.field5579.length; var3++) {
            this.field5579[var3] = arg1.method3891(this.field5583.field4457[var3], 7);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)Lmc;", line = 210)
    public static final class124 method2435(int arg0, int arg1, int arg2, int arg3) {
        field5574++;
        class124 var4 = null;
        if (arg0 == 0) {
            class67.field801++;
            var4 = class336.method1924(class219.field2548, class636.field8620, (byte) 2);
        }
        if (arg0 == 1) {
            var4 = class336.method1924(class546.field6869, class636.field8620, (byte) 97);
            class489.field6110++;
        }
        var4.field1516.method3065(-1, class522.field6612 + arg3);
        var4.field1516.method3051(true, class227.field2938 + arg1);
        var4.field1516.method3090(class307.field3884.method1592((byte) -120, 82) ? 1 : 0, 3);
        if (arg2 > -17) {
            method2433((byte) -48, 28);
        }
        class435.field5478 = false;
        class536.field6752 = arg3;
        class295.field3763 = arg1;
        class706.method3896(1);
        return var4;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 243)
    public static final void method2436(int arg0) {
        field5578++;
        class325.field4062 = new class337[class276.field3526.method1642(arg0 - 87)][];
        class79.field1035 = new class337[class276.field3526.method1642(114)][];
        class492.field6136 = new boolean[class276.field3526.method1642(arg0 + 99)];
        if (arg0 != 0) {
            method2435(-87, -118, 104, 35);
        }
    }
}
