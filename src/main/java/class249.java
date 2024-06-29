import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class249 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lok;")
    public static class41 field3964 = class137.method956("Verbindung abgebrochen)3", 45);

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Lok;")
    public static class41 field3970 = class137.method956("Lade Benutzeroberfl-=che )2 ", 45);

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lok;")
    public static class41 field3973 = class137.method956(")2", 45);

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Lok;")
    private static class41 field3971 = class137.method956("K", 45);

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lok;")
    public static class41 field3965 = field3971;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lok;")
    public static class41 field3967 = field3971;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "[Lka;")
    public static class279[] field3966;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)Z", line = 10)
    public static final boolean method1765(int arg0, boolean arg1) {
        if (!arg1) {
            field3968 = 117;
        }
        field3969++;
        return (arg0 & 0x26A775) >> 21 != 0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lnh;Z)V", line = 20)
    public static final void method1766(class308 arg0, boolean arg1) {
        class112.field1653.method1503(arg0, (byte) -107);
        while (true) {
            class308 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class308[][] var7;
            class308 var78;
            do {
                class308 var77;
                do {
                    class308 var76;
                    do {
                        class308 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class308) class112.field1653.method1497((byte) 125);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field5203);
                                            var3 = var2.field5204;
                                            var4 = var2.field5198;
                                            var5 = var2.field5192;
                                            var6 = var2.field5206;
                                            var7 = class205.field3312[var5];
                                            float var8 = 0.0F;
                                            if (class166.field2625) {
                                                if (class278.field4548 == class184.field3008) {
                                                    int var9 = class208.field3365[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class23.field349 != var10) {
                                                        class23.field349 = var10;
                                                        class180.method1287(var10, (byte) 91);
                                                        class58.method407(class52.method359(-68));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class278.field4559 != var11) {
                                                        class278.field4559 = var11;
                                                        class235.method1692(119, var11);
                                                    }
                                                    int var12 = class214.field3443[0][var3 + 1][var4] + class214.field3443[0][var3][var4] + class214.field3443[0][var3][var4 + 1] + class214.field3443[0][var3 + 1][var4 + 1] >> 2;
                                                    class274.method1934(3, -var12, (byte) -125);
                                                    var8 = 201.5F;
                                                    class166.method1164(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class166.method1164(var8);
                                                }
                                            }
                                            if (!var2.field5200) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class308 var13 = class205.field3312[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field5203) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class86.field1259 && var3 > class236.field3798) {
                                                    class308 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field5203 && (var14.field5200 || (var2.field5191 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class86.field1259 && var3 < class169.field2691 - 1) {
                                                    class308 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field5203 && (var15.field5200 || (var2.field5191 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class30.field429 && var4 > class238.field3816) {
                                                    class308 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field5203 && (var16.field5200 || (var2.field5191 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class30.field429 && var4 < class171.field2728 - 1) {
                                                    class308 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field5203 && (var17.field5200 || (var2.field5191 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field5200 = false;
                                            if (var2.field5205 != null) {
                                                class308 var18 = var2.field5205;
                                                if (class166.field2625) {
                                                    class166.method1164(201.5F - (float) (var18.field5206 + 1) * 50.0F);
                                                }
                                                if (var18.field5199 == null) {
                                                    if (var18.field5212 != null) {
                                                        if (class92.method651(0, var3, var4)) {
                                                            class173.method1239(var18.field5212, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var3, var4, true);
                                                        } else {
                                                            class173.method1239(var18.field5212, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class92.method651(0, var3, var4)) {
                                                    class160.method1133(var18.field5199, 0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var3, var4, true);
                                                } else {
                                                    class160.method1133(var18.field5199, 0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var3, var4, false);
                                                }
                                                class241 var19 = var18.field5210;
                                                if (var19 != null) {
                                                    if (class166.field2625) {
                                                        if ((var19.field3855 & var2.field5197) == 0) {
                                                            class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                                                        } else {
                                                            class179.method1277(var19.field3855, class140.field2155, class299.field4843, class302.field5027, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field3864.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var19.field3851 - class140.field2155, var19.field3859 - class299.field4843, var19.field3847 - class302.field5027, var19.field3856);
                                                }
                                                for (int var20 = 0; var20 < var18.field5193; var20++) {
                                                    class232 var21 = var18.field5201[var20];
                                                    if (var21 != null) {
                                                        if (class166.field2625) {
                                                            class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                                                        }
                                                        var21.field3674.method117(var21.field3662, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var21.field3658 - class140.field2155, var21.field3659 - class299.field4843, var21.field3664 - class302.field5027, var21.field3672);
                                                    }
                                                }
                                                if (class166.field2625) {
                                                    class166.method1164(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field5199 == null) {
                                                if (var2.field5212 != null) {
                                                    if (class92.method651(var6, var3, var4)) {
                                                        class173.method1239(var2.field5212, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class173.method1239(var2.field5212, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var3, var4, false);
                                                    }
                                                }
                                            } else if (class92.method651(var6, var3, var4)) {
                                                class160.method1133(var2.field5199, var6, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field5199.field4687 != 12345678 || class272.field4429 && var5 <= class286.field4655) {
                                                    class160.method1133(var2.field5199, var6, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class107 var23 = var2.field5207;
                                                if (var23 != null && (var23.field1508 & 0x80000000L) != 0L) {
                                                    if (class166.field2625 && var23.field1503) {
                                                        class166.method1164(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class166.field2625) {
                                                        class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                                                    }
                                                    var23.field1499.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var23.field1510 - class140.field2155, var23.field1504 - class299.field4843, var23.field1500 - class302.field5027, var23.field1508);
                                                    if (class166.field2625 && var23.field1503) {
                                                        class166.method1164(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class241 var26 = var2.field5210;
                                            class198 var27 = var2.field5208;
                                            if (var26 != null || var27 != null) {
                                                if (class86.field1259 == var3) {
                                                    var24++;
                                                } else if (class86.field1259 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class30.field429 == var4) {
                                                    var24 += 3;
                                                } else if (class30.field429 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class36.field545[var24];
                                                var2.field5197 = class269.field4345[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field3855 & class225.field3608[var24]) == 0) {
                                                    var2.field5196 = 0;
                                                } else if (var26.field3855 == 16) {
                                                    var2.field5196 = 3;
                                                    var2.field5202 = class113.field1672[var24];
                                                    var2.field5211 = 3 - var2.field5202;
                                                } else if (var26.field3855 == 32) {
                                                    var2.field5196 = 6;
                                                    var2.field5202 = class282.field4587[var24];
                                                    var2.field5211 = 6 - var2.field5202;
                                                } else if (var26.field3855 == 64) {
                                                    var2.field5196 = 12;
                                                    var2.field5202 = class239.field3819[var24];
                                                    var2.field5211 = 12 - var2.field5202;
                                                } else {
                                                    var2.field5196 = 9;
                                                    var2.field5202 = class140.field2160[var24];
                                                    var2.field5211 = 9 - var2.field5202;
                                                }
                                                if ((var26.field3855 & var25) != 0 && !class167.method1198(var6, var3, var4, var26.field3855)) {
                                                    if (class166.field2625) {
                                                        class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                                                    }
                                                    var26.field3864.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var26.field3851 - class140.field2155, var26.field3859 - class299.field4843, var26.field3847 - class302.field5027, var26.field3856);
                                                }
                                                if ((var26.field3860 & var25) != 0 && !class167.method1198(var6, var3, var4, var26.field3860)) {
                                                    if (class166.field2625) {
                                                        class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                                                    }
                                                    var26.field3854.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var26.field3851 - class140.field2155, var26.field3859 - class299.field4843, var26.field3847 - class302.field5027, var26.field3856);
                                                }
                                            }
                                            if (var27 != null && !class134.method939(var6, var3, var4, var27.field3177.method125())) {
                                                if (class166.field2625) {
                                                    class166.method1164(var8 - 0.5F);
                                                }
                                                if ((var27.field3185 & var25) != 0) {
                                                    if (class166.field2625) {
                                                        class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                                                    }
                                                    var27.field3177.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var27.field3174 + var27.field3175 - class140.field2155, var27.field3182 - class299.field4843, var27.field3186 + var27.field3181 - class302.field5027, var27.field3184);
                                                } else if (var27.field3185 == 256) {
                                                    int var28 = var27.field3174 - class140.field2155;
                                                    int var29 = var27.field3182 - class299.field4843;
                                                    int var30 = var27.field3186 - class302.field5027;
                                                    int var31 = var27.field3173;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class166.field2625) {
                                                            class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                                                        }
                                                        var27.field3177.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var27.field3175 + var28, var29, var27.field3181 + var30, var27.field3184);
                                                    } else if (var27.field3176 != null) {
                                                        if (class166.field2625) {
                                                            class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                                                        }
                                                        var27.field3176.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var28, var29, var30, var27.field3184);
                                                    }
                                                }
                                                if (class166.field2625) {
                                                    class166.method1164(var8);
                                                }
                                            }
                                            if (var22) {
                                                class107 var34 = var2.field5207;
                                                if (var34 != null && (var34.field1508 & 0x80000000L) == 0L) {
                                                    if (class166.field2625 && var34.field1503) {
                                                        class166.method1164(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class166.field2625) {
                                                        class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                                                    }
                                                    var34.field1499.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var34.field1510 - class140.field2155, var34.field1504 - class299.field4843, var34.field1500 - class302.field5027, var34.field1508);
                                                    if (class166.field2625 && var34.field1503) {
                                                        class166.method1164(var8);
                                                    }
                                                }
                                                class285 var35 = var2.field5209;
                                                if (var35 != null && var35.field4637 == 0) {
                                                    if (class166.field2625) {
                                                        class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                                                    }
                                                    if (var35.field4639 != null) {
                                                        var35.field4639.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var35.field4627 - class140.field2155, var35.field4633 - class299.field4843, var35.field4636 - class302.field5027, var35.field4625);
                                                    }
                                                    if (var35.field4635 != null) {
                                                        var35.field4635.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var35.field4627 - class140.field2155, var35.field4633 - class299.field4843, var35.field4636 - class302.field5027, var35.field4625);
                                                    }
                                                    if (var35.field4629 != null) {
                                                        var35.field4629.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var35.field4627 - class140.field2155, var35.field4633 - class299.field4843, var35.field4636 - class302.field5027, var35.field4625);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field5191;
                                            if (var36 != 0) {
                                                if (var3 < class86.field1259 && (var36 & 0x4) != 0) {
                                                    class308 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field5203) {
                                                        class112.field1653.method1503(var37, (byte) -122);
                                                    }
                                                }
                                                if (var4 < class30.field429 && (var36 & 0x2) != 0) {
                                                    class308 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field5203) {
                                                        class112.field1653.method1503(var38, (byte) -113);
                                                    }
                                                }
                                                if (var3 > class86.field1259 && (var36 & 0x1) != 0) {
                                                    class308 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field5203) {
                                                        class112.field1653.method1503(var39, (byte) -103);
                                                    }
                                                }
                                                if (var4 > class30.field429 && (var36 & 0x8) != 0) {
                                                    class308 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field5203) {
                                                        class112.field1653.method1503(var40, (byte) -119);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field5196 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field5193; var42++) {
                                                if (class259.field4133 != var2.field5201[var42].field3670 && (var2.field5195[var42] & var2.field5196) == var2.field5202) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class241 var43 = var2.field5210;
                                                if (!class167.method1198(var6, var3, var4, var43.field3855)) {
                                                    if (class166.field2625) {
                                                        label882: {
                                                            if ((var43.field3856 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field3851 - class140.field2155;
                                                                int var45 = var43.field3847 - class302.field5027;
                                                                int var46 = (int) (var43.field3856 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class65.field996 - 1) {
                                                                        class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class272.field4434 - 1 && var4 < class65.field996 - 1) {
                                                                        class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class272.field4434 - 1 && var4 > 0) {
                                                                        class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field3864.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var43.field3851 - class140.field2155, var43.field3859 - class299.field4843, var43.field3847 - class302.field5027, var43.field3856);
                                                }
                                                var2.field5196 = 0;
                                            }
                                        }
                                        if (!var2.field5194) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field5193;
                                            var2.field5194 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class232 var50 = var2.field5201[var49];
                                                if (class259.field4133 != var50.field3670) {
                                                    for (int var51 = var50.field3668; var51 <= var50.field3673; var51++) {
                                                        for (int var52 = var50.field3665; var52 <= var50.field3676; var52++) {
                                                            class308 var53 = var7[var51][var52];
                                                            if (var53.field5200) {
                                                                var2.field5194 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field5196 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field3668) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field3673) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field3665) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field3676) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field5196) == var2.field5211) {
                                                                    var2.field5194 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class310.field5226[var48++] = var50;
                                                    int var55 = class86.field1259 - var50.field3668;
                                                    int var56 = var50.field3673 - class86.field1259;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class30.field429 - var50.field3665;
                                                    int var58 = var50.field3676 - class30.field429;
                                                    if (var58 > var57) {
                                                        var50.field3657 = var55 + var58;
                                                    } else {
                                                        var50.field3657 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class232 var62 = class310.field5226[var61];
                                                    if (class259.field4133 != var62.field3670) {
                                                        if (var62.field3657 > var59) {
                                                            var59 = var62.field3657;
                                                            var60 = var61;
                                                        } else if (var62.field3657 == var59) {
                                                            int var63 = var62.field3658 - class140.field2155;
                                                            int var64 = var62.field3664 - class302.field5027;
                                                            int var65 = class310.field5226[var60].field3658 - class140.field2155;
                                                            int var66 = class310.field5226[var60].field3664 - class302.field5027;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class232 var67 = class310.field5226[var60];
                                                var67.field3670 = class259.field4133;
                                                if (!class57.method400(var6, var67.field3668, var67.field3673, var67.field3665, var67.field3676, var67.field3674.method125())) {
                                                    if (class166.field2625) {
                                                        if ((var67.field3672 & 0xFC000L) == 147456L) {
                                                            class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                                                            int var68 = var67.field3658 - class140.field2155;
                                                            int var69 = var67.field3664 - class302.field5027;
                                                            int var70 = (int) (var67.field3672 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class179.method1269(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class179.method1269(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class179.method1269(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class179.method1269(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class179.method1271(class140.field2155, class299.field4843, class302.field5027, var5, var67.field3668, var67.field3665, var67.field3673, var67.field3676);
                                                        }
                                                    }
                                                    var67.field3674.method117(var67.field3662, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var67.field3658 - class140.field2155, var67.field3659 - class299.field4843, var67.field3664 - class302.field5027, var67.field3672);
                                                }
                                                for (int var71 = var67.field3668; var71 <= var67.field3673; var71++) {
                                                    for (int var72 = var67.field3665; var72 <= var67.field3676; var72++) {
                                                        class308 var73 = var7[var71][var72];
                                                        if (var73.field5196 != 0) {
                                                            class112.field1653.method1503(var73, (byte) -122);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field5203) {
                                                            class112.field1653.method1503(var73, (byte) -75);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field5194) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field5194 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field5203);
                            } while (var2.field5196 != 0);
                            if (var3 > class86.field1259 || var3 <= class236.field3798) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field5203);
                        if (var3 < class86.field1259 || var3 >= class169.field2691 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field5203);
                    if (var4 > class30.field429 || var4 <= class238.field3816) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field5203);
                if (var4 < class30.field429 || var4 >= class171.field2728 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field5203);
            var2.field5203 = false;
            class132.field1971--;
            class285 var79 = var2.field5209;
            if (var79 != null && var79.field4637 != 0) {
                if (class166.field2625) {
                    class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                }
                if (var79.field4639 != null) {
                    var79.field4639.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var79.field4627 - class140.field2155, var79.field4633 - class299.field4843 - var79.field4637, var79.field4636 - class302.field5027, var79.field4625);
                }
                if (var79.field4635 != null) {
                    var79.field4635.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var79.field4627 - class140.field2155, var79.field4633 - class299.field4843 - var79.field4637, var79.field4636 - class302.field5027, var79.field4625);
                }
                if (var79.field4629 != null) {
                    var79.field4629.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var79.field4627 - class140.field2155, var79.field4633 - class299.field4843 - var79.field4637, var79.field4636 - class302.field5027, var79.field4625);
                }
            }
            if (var2.field5197 != 0) {
                class198 var80 = var2.field5208;
                if (var80 != null && !class134.method939(var6, var3, var4, var80.field3177.method125())) {
                    if ((var80.field3185 & var2.field5197) != 0) {
                        if (class166.field2625) {
                            class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                        }
                        var80.field3177.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var80.field3174 + var80.field3175 - class140.field2155, var80.field3182 - class299.field4843, var80.field3186 + var80.field3181 - class302.field5027, var80.field3184);
                    } else if (var80.field3185 == 256) {
                        int var81 = var80.field3174 - class140.field2155;
                        int var82 = var80.field3182 - class299.field4843;
                        int var83 = var80.field3186 - class302.field5027;
                        int var84 = var80.field3173;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class166.field2625) {
                                class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                            }
                            var80.field3177.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var80.field3175 + var81, var82, var80.field3181 + var83, var80.field3184);
                        } else if (var80.field3176 != null) {
                            if (class166.field2625) {
                                class179.method1275(class140.field2155, class299.field4843, class302.field5027, var5, var3, var4);
                            }
                            var80.field3176.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var81, var82, var83, var80.field3184);
                        }
                    }
                }
                class241 var87 = var2.field5210;
                if (var87 != null) {
                    if ((var87.field3860 & var2.field5197) != 0 && !class167.method1198(var6, var3, var4, var87.field3860)) {
                        if (class166.field2625) {
                            class179.method1277(var87.field3860, class140.field2155, class299.field4843, class302.field5027, var6, var3, var4);
                        }
                        var87.field3854.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var87.field3851 - class140.field2155, var87.field3859 - class299.field4843, var87.field3847 - class302.field5027, var87.field3856);
                    }
                    if ((var87.field3855 & var2.field5197) != 0 && !class167.method1198(var6, var3, var4, var87.field3855)) {
                        if (class166.field2625) {
                            class179.method1277(var87.field3855, class140.field2155, class299.field4843, class302.field5027, var6, var3, var4);
                        }
                        var87.field3864.method117(0, class196.field3162, class178.field2885, class128.field1905, class286.field4659, var87.field3851 - class140.field2155, var87.field3859 - class299.field4843, var87.field3847 - class302.field5027, var87.field3856);
                    }
                }
            }
            if (var5 < class308.field5184 - 1) {
                class308 var88 = class205.field3312[var5 + 1][var3][var4];
                if (var88 != null && var88.field5203) {
                    class112.field1653.method1503(var88, (byte) -126);
                }
            }
            if (var3 < class86.field1259) {
                class308 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field5203) {
                    class112.field1653.method1503(var89, (byte) -114);
                }
            }
            if (var4 < class30.field429) {
                class308 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field5203) {
                    class112.field1653.method1503(var90, (byte) -124);
                }
            }
            if (var3 > class86.field1259) {
                class308 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field5203) {
                    class112.field1653.method1503(var91, (byte) -128);
                }
            }
            if (var4 > class30.field429) {
                class308 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field5203) {
                    class112.field1653.method1503(var92, (byte) -68);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([Ljava/lang/Object;Z[III)V", line = 1011)
    public static final void method1767(Object[] arg0, boolean arg1, int[] arg2, int arg3, int arg4) {
        if (!arg1) {
            field3973 = (class41) null;
        }
        field3972++;
        if (arg4 <= arg3) {
            return;
        }
        int var5 = arg3;
        int var6 = (arg3 + arg4) / 2;
        int var7 = arg2[var6];
        arg2[var6] = arg2[arg4];
        arg2[arg4] = var7;
        Object var8 = arg0[var6];
        arg0[var6] = arg0[arg4];
        arg0[arg4] = var8;
        for (int var9 = arg3; var9 < arg4; var9++) {
            if (arg2[var9] < ((var9 & 0x1) + var7)) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var5];
                arg2[var5] = var10;
                Object var11 = arg0[var9];
                arg0[var9] = arg0[var5];
                arg0[var5++] = var11;
            }
        }
        arg2[arg4] = arg2[var5];
        arg2[var5] = var7;
        arg0[arg4] = arg0[var5];
        arg0[var5] = var8;
        method1767(arg0, arg1, arg2, arg3, var5 - 1);
        method1767(arg0, true, arg2, var5 + 1, arg4);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lbc;I)V", line = 1067)
    public static final void method1768(class302 arg0, int arg1) {
        class302 var2 = class94.method669(arg0, 0);
        field3963++;
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class188.field3055;
            var4 = class14.field182;
        } else {
            var3 = var2.field4936;
            var4 = var2.field4949;
        }
        class75.method552(-1338, false, var4, var3, arg0);
        if (arg1 != 4) {
            method1767((Object[]) null, true, (int[]) null, -14, 97);
        }
        class141.method984(arg0, var3, var4, -1);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 1121)
    public static void method1769(int arg0) {
        if (arg0 != 0) {
            field3966 = (class279[]) null;
        }
        field3965 = null;
        field3967 = null;
        field3973 = null;
        field3964 = null;
        field3966 = null;
        field3971 = null;
        field3970 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lte;I)Lte;")
    public abstract class221 method947(class221 arg0, int arg1);
}
