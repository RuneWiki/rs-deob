import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class83 {

    @OriginalMember(owner = "client!dha", name = "l", descriptor = "Lal;")
    public class107 field923 = new class107();

    @OriginalMember(owner = "client!dha", name = "m", descriptor = "I")
    public static int field924 = 0;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!dha", name = "e", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!dha", name = "f", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!dha", name = "g", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!dha", name = "h", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!dha", name = "i", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!dha", name = "j", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!dha", name = "k", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!dha", name = "n", descriptor = "Lal;")
    private class107 field925;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(BLal;)V", line = 3)
    public final void method626(byte arg0, class107 arg1) {
        field922++;
        if (arg1.field1598 != null) {
            arg1.method827(3);
        }
        arg1.field1598 = this.field923.field1598;
        arg1.field1600 = this.field923;
        arg1.field1598.field1600 = arg1;
        arg1.field1600.field1598 = arg1;
        int var3 = 80 % ((arg0 + 55) / 44);
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)V", line = 19)
    public static final void method627(int arg0) {
        class393.method2430((byte) -94);
        if (arg0 != 808) {
            return;
        }
        field918++;
        int var1 = class21.field353.field10082.method4067(-108);
        if (var1 == 2) {
            class743.method4142(100, 100, class37.field491, class714.field9895, class428.field5825, false);
        } else if (var1 == 3) {
            class41.method314(class236.field3553, -122, 2, class37.field491, 2, class207.field3208, class428.field5825, class714.field9895);
        }
        if (class21.field353.field10082.method4066(false)) {
            class512.method3093(class629.field8819, (byte) -26);
        }
        if (class37.field491 != null) {
            class74.method590(false);
        }
        class576.field8120 = class21.field353.field10082.method4067(-95) != 0;
        class195.field2997 = class21.field353.field10082.method4066(false);
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "()V", line = 67)
    public static final void method628() {
        class510.field7211 = class510.field7212;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Z)V", line = 78)
    public final void method629(boolean arg0) {
        if (arg0) {
            this.method626((byte) 60, null);
        }
        field912++;
        while (true) {
            class107 var2 = this.field923.field1600;
            if (this.field923 == var2) {
                this.field925 = null;
                return;
            }
            var2.method827(3);
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(B)V", line = 100)
    public static final void method630(byte arg0) {
        if (arg0 <= 27) {
            method628();
        }
        field916++;
        if (class779.field10694 != null) {
            return;
        }
        class779.field10694 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFF55) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x38D) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - var6 * var8;
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (0.6666666666666666D - var24) * (var16 - var18) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class779.field10694[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(B)V", line = 215)
    public static final void method631(byte arg0) {
        field921++;
        if (arg0 >= -109) {
            method635((byte) 52, -115, 64, 6, 110);
        }
        class284.field4193 = new class746(class620.field8665.method3580(class140.field2081, 12), "", class275.field3980, 1012, -1, 0L, 0, 0, true, false, 0L, true);
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(I)I", line = 229)
    public final int method632(int arg0) {
        field915++;
        int var2 = 0;
        class107 var3 = this.field923.field1600;
        while (this.field923 != var3) {
            var3 = var3.field1600;
            var2++;
        }
        if (arg0 <= 46) {
            method630((byte) 36);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "(I)Lal;", line = 256)
    public final class107 method633(int arg0) {
        field920++;
        class107 var2 = this.field923.field1600;
        if (this.field923 == var2) {
            return null;
        }
        var2.method827(3);
        if (arg0 != 18801) {
            this.field923 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(BLjs;)V", line = 275)
    public static final void method634(byte arg0, class349 arg1) {
        if (arg0 != -37) {
            return;
        }
        for (int var2 = 0; var2 < class725.field10029; var2++) {
            int var3 = class436.field5881[var2];
            class702 var4 = class767.field10560[var3];
            int var5 = arg1.method2964((byte) 124);
            if ((var5 & 0x20) != 0) {
                var5 += arg1.method2964((byte) 86) << 8;
            }
            if ((var5 & 0x2000) != 0) {
                var5 += arg1.method2964((byte) 78) << 16;
            }
            class576.method3380((byte) -48, var3, arg1, var5, var4);
        }
        field914++;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(BIIII)V", line = 306)
    public static final void method635(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class329.field4573 = arg4;
        field917++;
        class328.field4569 = arg3;
        if (arg0 == 52) {
            class789.field10829 = arg2;
            class394.field5430 = arg1;
        }
    }

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "(I)Lal;", line = 322)
    public final class107 method636(int arg0) {
        field913++;
        if (arg0 != 256) {
            this.field925 = null;
        }
        class107 var2 = this.field923.field1600;
        if (this.field923 == var2) {
            this.field925 = null;
            return null;
        } else {
            this.field925 = var2.field1600;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "()V", line = 366)
    public class83() {
        this.field923.field1598 = this.field923;
        this.field923.field1600 = this.field923;
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(Z)Lal;", line = 346)
    public final class107 method637(boolean arg0) {
        field919++;
        class107 var2 = this.field925;
        if (this.field923 == var2) {
            this.field925 = null;
            return null;
        }
        if (arg0) {
            this.method636(45);
        }
        this.field925 = var2.field1600;
        return var2;
    }
}
