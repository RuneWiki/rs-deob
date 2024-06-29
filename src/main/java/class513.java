import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class513 extends class148 {

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    private int field7502 = 32768;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)Lsc;")
    public static final class229 method3028(int arg0) {
        if (arg0 < 22) {
            return null;
        } else {
            ++field7503;
            class229 var1 = (class229) class263.field3857.method1875(100);
            if (var1 != null) {
                --class487.field7193;
                return var1;
            } else {
                return new class229();
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field2183 = arg1.method1428(32122) == 1;
            }
        } else {
            this.field7502 = arg1.method1450((byte) 48) << 4;
        }
        ++field7495;
        int var5 = -95 % ((arg2 - -88) / 33);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILic;)V")
    public static final void method3029(int arg0, class491 arg1) {
        ++field7496;
        int var2 = 59 / ((arg0 - 24) / 55);
        class35.field366 = arg1.method2940("titlebg", false);
        class331.field4692 = arg1.method2940("logo", false);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)I")
    public static final int method3030(int arg0, byte arg1, String arg2, String arg3) {
        ++field7497;
        int var4 = arg3.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > -var8 + var6 || var7 - var9 < var5) {
            if (var4 <= -var8 + var6) {
                return -1;
            }
            if (var5 <= -var9 + var7) {
                return 1;
            }
            char var22;
            if (var8 == 0) {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (~var9 == -1) {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class511.method3019(339, var22);
            var9 = class511.method3019(339, var24);
            char var26 = class494.method2968(arg0, -116, var22);
            char var27 = class494.method2968(arg0, -126, var24);
            if (~var26 != ~var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (~var28 != ~var29) {
                    return class504.method3004(17077, arg0, var28) - class504.method3004(17077, arg0, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; ~var10 < ~var11; ++var11) {
            int var16;
            int var17;
            if (arg0 != 2) {
                var16 = var11;
                var17 = var11;
            } else {
                var16 = var5 - 1 + -var11;
                var17 = -var11 + var4 - 1;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (~var18 != ~var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class504.method3004(17077, arg0, var20) + -class504.method3004(17077, arg0, var21);
                }
            }
        }
        int var12 = -var5 + var4;
        if (var12 != 0) {
            return var12;
        } else {
            for (int var13 = 0; ~var13 > ~var10; ++var13) {
                char var14 = arg3.charAt(var13);
                char var15 = arg2.charAt(var13);
                if (var14 != var15) {
                    return class504.method3004(17077, arg0, var14) - class504.method3004(17077, arg0, var15);
                }
            }
            if (arg1 < 113) {
                return -64;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field7498;
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            int[] var4 = this.method971(false, arg1, 1);
            int[] var5 = this.method971(false, arg1, 2);
            for (int var6 = 0; ~var6 > ~class320.field4579; ++var6) {
                int var7 = (4086 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field7502 >> 12;
                int var9 = class318.field4564[var7] * var8 >> 12;
                int var10 = class76.field1130[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class304.field4339;
                int var12 = class39.field569 & (var10 >> 12) + arg1;
                int[] var13 = this.method971(false, var12, 0);
                var3[var6] = var13[var11];
            }
        }
        return arg0 > -65 ? null : var3;
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
    public static final void method3031(int arg0) {
        for (class229 var1 = (class229) class230.field3442.method1875(32); var1 != null; var1 = (class229) class230.field3442.method1875(113)) {
            class123.method813((byte) 15, var1);
        }
        ++field7501;
        int var2;
        int var3;
        if (class426.field6401.method2532(arg0 + -2, class170.field2529)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class271.field3942;
            var3 = class271.field3942;
        }
        client.method1322();
        for (int var4 = var3; ~var2 <= ~var4; ++var4) {
            client.method1329();
            client.method1318(var4);
            client.method1321(var4);
        }
        client.method1335();
        client.method1323();
        if (arg0 != 3) {
            method3031(-22);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method27(boolean arg0, int arg1) {
        ++field7500;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (!arg0) {
            this.field7502 = -115;
        }
        if (super.field2189.field6033) {
            int[] var4 = this.method971(false, arg1, 1);
            int[] var5 = this.method971(false, arg1, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class320.field4579 < ~var9; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field7502 >> 12;
                int var12 = class318.field4564[var10] * var11 >> 12;
                int var13 = class76.field1130[var10] * var11 >> 12;
                int var14 = class304.field4339 & var9 - -(var12 >> 12);
                int var15 = class39.field569 & arg1 - -(var13 >> 12);
                int[][] var16 = this.method974(true, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class513() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        if (arg0 != -1285532468) {
            this.field7502 = 70;
        }
        ++field7499;
        class419.method2520(-117);
    }
}
