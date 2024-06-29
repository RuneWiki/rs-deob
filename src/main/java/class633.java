import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class633 implements class450 {

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "Lkv;")
    private class271 field8869;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Lhu;")
    private class132 field8861;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field8863 = 0;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "Lom;")
    public static class374 field8865;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lha;Lfo;IILtl;I)Z", line = 7)
    public static final boolean method3648(class60 arg0, class519 arg1, int arg2, int arg3, class622 arg4, int arg5) {
        field8864++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field7419 != null) {
            var6 = (arg1.field7417 + arg4.field8732 - class84.field1192) * (class84.field1189 - class84.field1199) / (class84.field1202 - class84.field1192) + class84.field1199;
            var7 = (class84.field1189 - class84.field1199) * (arg1.field7407 + arg4.field8732 - class84.field1192) / (class84.field1202 - class84.field1192) + class84.field1199;
            var8 = class84.field1191 - ((arg4.field8735 + arg1.field7442 - class84.field1203) * (class84.field1191 - class84.field1195) / (class84.field1209 - class84.field1203));
            var9 = class84.field1191 - ((arg1.field7416 + arg4.field8735 - class84.field1203) * (class84.field1191 - class84.field1195) / (class84.field1209 - class84.field1203));
        }
        class536 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg1.field7439 != -1) {
            if (arg4.field8726 && arg1.field7443 != -1) {
                var10 = arg1.method3057(arg0, true, (byte) 56);
            } else {
                var10 = arg1.method3057(arg0, false, (byte) 41);
            }
            if (var10 != null) {
                var11 = arg4.field8730 - (var10.method1504() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg4.field8730 + (var10.method1504() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg4.field8728 - (var10.method1514() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                var14 = arg4.field8728 + (var10.method1514() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class477 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        if (arg3 != 2) {
            return false;
        }
        int var22 = 0;
        int var23 = 0;
        if (arg1.field7424 != null) {
            var15 = class537.method3155(-18186, arg1.field7448);
            if (var15 != null) {
                var16 = class232.field3385.method584(class252.field3635, null, arg1.field7424, (byte) 117, null);
                int var24 = arg4.field8728 - (class84.field1191 - class84.field1195) * arg1.field7437 / (class84.field1209 - class84.field1203);
                var17 = (class84.field1189 - class84.field1199) * arg1.field7420 / (class84.field1202 - class84.field1192) + arg4.field8730;
                if (var10 == null) {
                    var18 = var24 - var16 * var15.method2879() / 2;
                } else {
                    var18 = var24 - ((var10.method1514() >> 1) + var16 * var15.method2878());
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class252.field3635[var25];
                    if (var16 - 1 > var25) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method2877(var26);
                    if (var19 < var27) {
                        var19 = var27;
                    }
                }
                var20 = var17 + arg2 - (var19 / 2);
                var21 = var19 / 2 + var17 + arg2;
                if (var20 < var6) {
                    var6 = var20;
                }
                if (var21 > var7) {
                    var7 = var21;
                }
                var22 = arg5 + var18;
                if (var22 < var8) {
                    var8 = var22;
                }
                var23 = arg5 + var18 + var16 * var15.method2878();
                if (var23 > var9) {
                    var9 = var23;
                }
            }
        }
        if (class84.field1199 > var7 || var6 > class84.field1189 || var9 < class84.field1195 || var8 > class84.field1191) {
            return true;
        }
        class84.method690(arg0, arg4, arg1);
        if (var10 != null) {
            if (class712.field10051 > 0 && (class601.field8510 != -1 && class601.field8510 == arg4.field8729 || class627.field8776 != -1 && class627.field8776 == arg1.field7412)) {
                int var28;
                if (class439.field6501 > 50) {
                    var28 = 200 - (class439.field6501 * 2);
                } else {
                    var28 = class439.field6501 * 2;
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg0.method492(var10.method1517() / 2 + 7, arg4.field8730, arg3 + 25771, var29, arg4.field8728);
                arg0.method492(var10.method1517() / 2 + 5, arg4.field8730, 25773, var29, arg4.field8728);
                arg0.method492(var10.method1517() / 2 + 3, arg4.field8730, 25773, var29, arg4.field8728);
                arg0.method492(var10.method1517() / 2 + 1, arg4.field8730, 25773, var29, arg4.field8728);
                arg0.method492(var10.method1517() / 2, arg4.field8730, 25773, var29, arg4.field8728);
            }
            var10.method3142(arg4.field8730 - (var10.method1504() >> 1), arg4.field8728 + -(var10.method1514() >> 1));
        }
        if (arg1.field7424 != null && var15 != null) {
            class110.method830(arg0, (byte) -124, var16, var15, var18, arg4, arg1, var17, var19);
        }
        if (arg1.field7439 != -1 || arg1.field7424 != null) {
            class299 var30 = new class299(arg4);
            var30.field4235 = var13;
            var30.field4236 = var22;
            var30.field4246 = var11;
            var30.field4234 = var14;
            var30.field4242 = var23;
            var30.field4248 = var20;
            var30.field4247 = var21;
            var30.field4238 = var12;
            class603.field8529.method1203(var30, (byte) 100);
        }
        return false;
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V", line = 195)
    public static void method3649(int arg0) {
        field8865 = null;
        if (arg0 != -10278) {
            field8865 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V", line = 206)
    public final void method1253(int arg0) {
        if (arg0 != 27444) {
            field8865 = null;
        }
        field8866++;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)V", line = 216)
    public final void method1249(int arg0, boolean arg1) {
        field8868++;
        class68 var3 = this.field8869.method1725(this.field8861.field1773, -1);
        if (arg0 != 7620) {
            field8863 = 19;
        }
        if (var3 == null) {
            return;
        }
        int var4 = this.field8861.field1777.method3778(class291.field4165, this.field8861.field1769, false) + this.field8861.field1767;
        int var5 = this.field8861.field1770.method4065((byte) -128, this.field8861.field1771, class344.field4988) + this.field8861.field1775;
        if (this.field8861.field1772) {
            class736.field10316.method525(var4, var5, this.field8861.field1769, this.field8861.field1771, this.field8861.field1766, 0);
        }
        int var6 = var5 + this.method3650(arg0 ^ 0x1DC4, class298.field4225, var5, var3.field970, 5, var4) * 12;
        int var9 = var6 + 8;
        if (this.field8861.field1772) {
            class736.field10316.method436(var4, var9, var4 + this.field8861.field1769 - 1, var9, this.field8861.field1766, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method3650(0, class298.field4225, var6, var3.field968, 5, var4) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method3650(arg0 ^ 0x1DC4, class298.field4225, var10, var3.field975, 5, var4) * 12;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILda;ILjava/lang/String;II)I", line = 255)
    private final int method3650(int arg0, class61 arg1, int arg2, String arg3, int arg4, int arg5) {
        field8867++;
        if (arg0 != 0) {
            this.field8869 = null;
        }
        return arg1.method551(0, null, -1, arg2 + arg4, this.field8861.field1765, 0, null, 0, arg3, 0, 0, this.field8861.field1771 - (arg4 * 2), -(arg4 * 2) + this.field8861.field1769, arg4 + arg5, this.field8861.field1778, null);
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)Z", line = 266)
    public static final boolean method3651(int arg0) {
        class352.field5129++;
        field8870++;
        class735.field10301 = true;
        return arg0 == 0 ? true : true;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)Z", line = 280)
    public final boolean method1251(int arg0) {
        field8860++;
        return arg0 == -24346 ? this.field8869.method1726(42) : false;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lkv;Lhu;)V", line = 292)
    public class633(class271 arg0, class132 arg1) {
        this.field8869 = arg0;
        this.field8861 = arg1;
    }
}
