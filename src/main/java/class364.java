import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class364 {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Lka;")
    private class473 field5227 = new class473(64);

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Ldk;")
    private class421 field5233;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lub;")
    public static class301 field5230 = new class301("", 12);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Loc;")
    public static class417 field5236;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static void method2176(boolean arg0) {
        field5230 = null;
        field5236 = null;
        if (arg0) {
            field5230 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
    public final void method2177(boolean arg0) {
        class473 var2 = this.field5227;
        synchronized (this.field5227) {
            this.field5227.method2774((byte) 124);
            if (arg0) {
                this.field5233 = null;
            }
        }
        field5229++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
    public final void method2178(int arg0, int arg1) {
        class473 var3 = this.field5227;
        synchronized (this.field5227) {
            if (arg0 != -29639) {
                return;
            }
            this.field5227.method2779(arg0 ^ 0xFFFFB609, arg1);
        }
        field5231++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public final void method2179(int arg0) {
        if (arg0 != 0) {
            method2182(null, null);
        }
        class473 var2 = this.field5227;
        synchronized (this.field5227) {
            this.field5227.method2764(-769);
        }
        field5228++;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)[Lea;")
    public static final class115[] method2180(int arg0) {
        field5235++;
        return arg0 == 9 ? new class115[] { class245.field3353, class487.field7053, class455.field6645 } : null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)Lqf;")
    public final class145 method2181(byte arg0, int arg1) {
        field5226++;
        class473 var3 = this.field5227;
        class145 var4;
        synchronized (this.field5227) {
            var4 = (class145) this.field5227.method2767((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field5233;
        byte[] var6;
        synchronized (this.field5233) {
            var6 = this.field5233.method2512(11, (byte) -93, arg1);
        }
        class145 var7 = new class145();
        if (var6 != null) {
            var7.method1004((byte) -39, new class319(var6));
        }
        class473 var8 = this.field5227;
        synchronized (this.field5227) {
            if (arg0 <= 101) {
                return null;
            } else {
                this.field5227.method2777(-1025, var7, (long) arg1);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lmb;Lwr;)V")
    public static final void method2182(class224 arg0, class532 arg1) {
        if (!arg1.field7831) {
            return;
        }
        short var2 = arg1.field7837;
        short var3 = arg1.field7819;
        byte var4 = arg1.field7834;
        byte var5 = arg1.field7842;
        int var6 = (var2 << class295.field3991) + class392.field5656;
        int var7 = (var3 << class295.field3991) + class392.field5656;
        class532[][] var8 = class103.field1632[var4];
        float var9;
        if (class492.field7122 == class36.field554) {
            class77.field1093.method482(class348.field5000[0].method79(var6, var7), class55.method361(var2, var3), class76.method595(var2, var3), class308.method1782(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class77.field1093.method462(3000.0F, var9 * 1.5F);
        if (arg1.field7827) {
            if (class157.field2396) {
                if (var4 > 0) {
                    class532 var10 = class103.field1632[var4 - 1][var2][var3];
                    if (var10 != null && var10.field7831) {
                        return;
                    }
                }
                if (var2 <= class39.field578 && var2 > class164.field2525) {
                    class532 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field7831 && (var11.field7827 || (arg1.field7826 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class39.field578 && var2 < class245.field3356 - 1) {
                    class532 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field7831 && (var12.field7827 || (arg1.field7826 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class119.field1859 && var3 > class125.field1932) {
                    class532 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field7831 && (var13.field7827 || (arg1.field7826 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class119.field1859 && var3 < class215.field3054 - 1) {
                    class532 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field7831 && (var14.field7827 || (arg1.field7826 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class157.field2396 = true;
            }
            arg1.field7827 = false;
            if (arg1.field7829 != null) {
                class532 var15 = arg1.field7829;
                class77.field1093.method462(3000.0F, (201.5F - (float) (var15.field7842 + 1) * 50.0F) * 1.5F);
                if (!class491.method2908(var15.field7842, var2, var3)) {
                    class492.field7122[var15.field7842].method71(var2, var3);
                }
                class168 var16 = var15.field7830;
                if (var16 != null) {
                    if (class79.field1118) {
                        if ((var16.field2566 & arg1.field7839) == 0) {
                            class505.method2997(arg0, var4, var2, var3);
                        } else {
                            class94.method768(arg0, var16.field2566, var5, var2, var3);
                        }
                        class77.field1093.method503(arg0.field3164, arg0.field3166);
                    }
                    var16.method171((byte) -96, class77.field1093);
                }
                for (class201 var17 = var15.field7828; var17 != null; var17 = var17.field2918) {
                    class434 var18 = var17.field2915;
                    if (var18 != null) {
                        if (class79.field1118) {
                            class505.method2997(arg0, var4, var2, var3);
                            class77.field1093.method503(arg0.field3164, arg0.field3166);
                        }
                        var18.method171((byte) -96, class77.field1093);
                    }
                }
                class77.field1093.method462(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class491.method2908(var5, var2, var3);
            if (var19) {
                class492.field7122[var5].method71(var2, var3);
                class167 var20 = arg1.field7838;
                if (var20 != null && var20.field2552) {
                    if (var20.field2550) {
                        class77.field1093.method462(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class79.field1118) {
                        class505.method2997(arg0, var4, var2, var3);
                        class77.field1093.method503(arg0.field3164, arg0.field3166);
                    }
                    class121 var21 = var20.method171((byte) -96, class77.field1093);
                    if (var21 != null) {
                        var21.field1881 = var20;
                        var21.field1879 = var4;
                        var21.field1885 = var2;
                        var21.field1887 = var3;
                        class116.field1835.method2599(1256, var21);
                    }
                    if (var20.field2550) {
                        class77.field1093.method462(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class168 var24 = arg1.field7830;
            class63 var25 = arg1.field7833;
            if (var24 != null || var25 != null) {
                if (class39.field578 == var2) {
                    var22++;
                } else if (class39.field578 < var2) {
                    var22 += 2;
                }
                if (class119.field1859 == var3) {
                    var22 += 3;
                } else if (class119.field1859 > var3) {
                    var22 += 6;
                }
                var23 = class221.field3124[var22];
                arg1.field7839 = class54.field778[var22];
            }
            if (var24 != null) {
                if ((var24.field2566 & class81.field1159[var22]) == 0) {
                    arg1.field7818 = 0;
                } else if (var24.field2566 == 16) {
                    arg1.field7818 = 3;
                    arg1.field7832 = class140.field2098[var22];
                    arg1.field7840 = (byte) (3 - arg1.field7832);
                } else if (var24.field2566 == 32) {
                    arg1.field7818 = 6;
                    arg1.field7832 = class450.field6594[var22];
                    arg1.field7840 = (byte) (6 - arg1.field7832);
                } else if (var24.field2566 == 64) {
                    arg1.field7818 = 12;
                    arg1.field7832 = class4.field70[var22];
                    arg1.field7840 = (byte) (12 - arg1.field7832);
                } else {
                    arg1.field7818 = 9;
                    arg1.field7832 = class201.field2922[var22];
                    arg1.field7840 = (byte) (9 - arg1.field7832);
                }
                if ((var24.field2566 & var23) != 0 && !class387.method2294(var5, var2, var3, var24.field2566)) {
                    if (class79.field1118) {
                        class505.method2997(arg0, var4, var2, var3);
                        class77.field1093.method503(arg0.field3164, arg0.field3166);
                    }
                    class121 var26 = var24.method171((byte) -96, class77.field1093);
                    if (var26 != null) {
                        var26.field1881 = var24;
                        var26.field1879 = var4;
                        var26.field1885 = var2;
                        var26.field1887 = var3;
                        class116.field1835.method2599(1256, var26);
                    }
                }
                class168 var27 = arg1.field7822;
                if (var27 != null && (var27.field2566 & var23) != 0 && !class387.method2294(var5, var2, var3, var27.field2566)) {
                    if (class79.field1118) {
                        class505.method2997(arg0, var4, var2, var3);
                        class77.field1093.method503(arg0.field3164, arg0.field3166);
                    }
                    class121 var28 = var27.method171((byte) -96, class77.field1093);
                    if (var28 != null) {
                        var28.field1881 = var27;
                        var28.field1879 = var4;
                        var28.field1885 = var2;
                        var28.field1887 = var3;
                        class116.field1835.method2599(1256, var28);
                    }
                }
            }
            if (var25 != null && !class232.method1420(var5, var2, var3, var25.method419(-98))) {
                class63 var29 = arg1.field7835;
                class77.field1093.method462(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field909 & var23) != 0) {
                    if (class79.field1118) {
                        class505.method2997(arg0, var4, var2, var3);
                        class77.field1093.method503(arg0.field3164, arg0.field3166);
                    }
                    class121 var30 = var25.method171((byte) -96, class77.field1093);
                    if (var30 != null) {
                        var30.field1881 = var25;
                        var30.field1879 = var4;
                        var30.field1885 = var2;
                        var30.field1887 = var3;
                        class116.field1835.method2599(1256, var30);
                    }
                } else if (var25.field909 == 256) {
                    int var31 = var25.field906 - class104.field1714;
                    int var32 = var25.field910 - class257.field3495;
                    int var33 = var25.field918;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class79.field1118) {
                        class505.method2997(arg0, var4, var2, var3);
                        class77.field1093.method503(arg0.field3164, arg0.field3166);
                    }
                    if (var35 < var34) {
                        class121 var36 = var25.method171((byte) -96, class77.field1093);
                        if (var36 != null) {
                            var36.field1881 = var25;
                            var36.field1879 = var4;
                            var36.field1885 = var2;
                            var36.field1887 = var3;
                            class116.field1835.method2599(1256, var36);
                        }
                    } else if (var29 != null) {
                        class121 var37 = var29.method171((byte) -96, class77.field1093);
                        if (var37 != null) {
                            var37.field1881 = var29;
                            var37.field1879 = var4;
                            var37.field1885 = var2;
                            var37.field1887 = var3;
                            class116.field1835.method2599(1256, var37);
                        }
                    }
                }
                class77.field1093.method462(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class167 var38 = arg1.field7838;
                if (var38 != null && !var38.field2552) {
                    if (var38.field2550) {
                        class77.field1093.method462(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class79.field1118) {
                        class505.method2997(arg0, var4, var2, var3);
                        class77.field1093.method503(arg0.field3164, arg0.field3166);
                    }
                    class121 var39 = var38.method171((byte) -96, class77.field1093);
                    if (var39 != null) {
                        var39.field1881 = var38;
                        var39.field1879 = var4;
                        var39.field1885 = var2;
                        var39.field1887 = var3;
                        class116.field1835.method2599(1256, var39);
                    }
                    if (var38.field2550) {
                        class77.field1093.method462(3000.0F, var9 * 1.5F);
                    }
                }
                class151 var40 = arg1.field7825;
                if (var40 != null && !var40.field2320) {
                    if (class79.field1118) {
                        class505.method2997(arg0, var4, var2, var3);
                        class77.field1093.method503(arg0.field3164, arg0.field3166);
                    }
                    class121 var41 = var40.method171((byte) -96, class77.field1093);
                    if (var41 != null) {
                        var41.field1881 = var40;
                        var41.field1879 = var4;
                        var41.field1885 = var2;
                        var41.field1887 = var3;
                        class116.field1835.method2599(1256, var41);
                    }
                }
            }
            byte var42 = arg1.field7826;
            if (var42 != 0) {
                if (var2 < class39.field578 && (var42 & 0x4) != 0) {
                    class532 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field7831) {
                        class295.field3992.method40(-26704, var43);
                    }
                }
                if (var3 < class119.field1859 && (var42 & 0x2) != 0) {
                    class532 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field7831) {
                        class295.field3992.method40(-26704, var44);
                    }
                }
                if (var2 > class39.field578 && (var42 & 0x1) != 0) {
                    class532 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field7831) {
                        class295.field3992.method40(-26704, var45);
                    }
                }
                if (var3 > class119.field1859 && (var42 & 0x8) != 0) {
                    class532 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field7831) {
                        class295.field3992.method40(-26704, var46);
                    }
                }
            }
        }
        if (arg1.field7818 != 0) {
            boolean var47 = true;
            for (class201 var48 = arg1.field7828; var48 != null; var48 = var48.field2918) {
                if (class484.field6969 != var48.field2915.field6274 && (var48.field2917 & arg1.field7818) == arg1.field7832) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class168 var49 = arg1.field7830;
                if (!class387.method2294(var5, var2, var3, var49.field2566)) {
                    if (class79.field1118) {
                        label682: {
                            if (var49.field2566 >= 16) {
                                int var50 = var2 - class39.field578;
                                int var51 = var3 - class119.field1859;
                                if (var49.field2566 == 16) {
                                    int var52 = var50 - class392.field5656;
                                    int var53 = class392.field5656 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class177.field2664) {
                                        class505.method2997(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field2566 == 32) {
                                    int var54 = class392.field5656 + var50;
                                    int var55 = class392.field5656 + var51;
                                    if (var55 < -var54 && var2 < class124.field1916 && var3 < class177.field2664) {
                                        class505.method2997(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field2566 == 64) {
                                    int var56 = class392.field5656 + var50;
                                    int var57 = var51 - class392.field5656;
                                    if (var57 > var56 && var2 < class124.field1916 && var3 > 0) {
                                        class505.method2997(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field2566 == 128) {
                                    int var58 = var50 - class392.field5656;
                                    int var59 = var51 - class392.field5656;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class505.method2997(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class505.method2997(arg0, var4, var2, var3);
                        }
                        class77.field1093.method503(arg0.field3164, arg0.field3166);
                    }
                    class121 var60 = var49.method171((byte) -96, class77.field1093);
                    if (var60 != null) {
                        var60.field1881 = var49;
                        var60.field1879 = var4;
                        var60.field1885 = var2;
                        var60.field1887 = var3;
                        class116.field1835.method2599(1256, var60);
                    }
                }
                arg1.field7818 = 0;
            }
        }
        if (arg1.field7817) {
            try {
                arg1.field7817 = false;
                int var61 = 0;
                label625: for (class201 var62 = arg1.field7828; var62 != null; var62 = var62.field2918) {
                    class434 var63 = var62.field2915;
                    if (class484.field6969 != var63.field6274) {
                        for (int var64 = var63.field6290; var64 <= var63.field6288; var64++) {
                            for (int var65 = var63.field6277; var65 <= var63.field6282; var65++) {
                                class532 var66 = var8[var64][var65];
                                if (var66.field7827) {
                                    arg1.field7817 = true;
                                    continue label625;
                                }
                                if (var66.field7818 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field6290) {
                                        var67++;
                                    }
                                    if (var64 < var63.field6288) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field6277) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field6282) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field7818) == arg1.field7840) {
                                        arg1.field7817 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class39.field578 - var63.field6290;
                        int var69 = var63.field6288 - class39.field578;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class119.field1859 - var63.field6277;
                        int var71 = var63.field6282 - class119.field1859;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field3162[var61] = var63;
                        arg0.field3165[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class434 var75 = arg0.field3162[var74];
                        if (class484.field6969 != var75.field6274) {
                            int var76 = arg0.field3165[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field6284 - class104.field1714;
                                int var78 = var75.field6287 - class257.field3495;
                                int var79 = arg0.field3162[var73].field6284 - class104.field1714;
                                int var80 = arg0.field3162[var73].field6287 - class257.field3495;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class434 var81 = arg0.field3162[var73];
                    var81.field6274 = class484.field6969;
                    if (!class207.method1326(var5, var81.field6290, var81.field6288, var81.field6277, var81.field6282, var81.method836(-32768))) {
                        if (class79.field1118) {
                            if (var81.field6293 == 0) {
                                class224.method1390(arg0, var4, var81.field6290, var81.field6277, var81.field6288, var81.field6282);
                            } else {
                                class505.method2997(arg0, var4, var2, var3);
                                int var82 = var2 - class39.field578;
                                int var83 = var3 - class119.field1859;
                                if (var81.field6293 == 2) {
                                    if (var83 > -var82) {
                                        class219.method1371(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class219.method1371(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class219.method1371(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class219.method1371(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class77.field1093.method503(arg0.field3164, arg0.field3166);
                        }
                        class121 var84 = var81.method171((byte) -96, class77.field1093);
                        if (var84 != null) {
                            var84.field1881 = var81;
                            var84.field1879 = var4;
                            var84.field1885 = var81.field6290;
                            var84.field1887 = var81.field6277;
                            class116.field1835.method2599(1256, var84);
                        }
                    }
                    for (int var85 = var81.field6290; var85 <= var81.field6288; var85++) {
                        for (int var86 = var81.field6277; var86 <= var81.field6282; var86++) {
                            class532 var87 = var8[var85][var86];
                            if (var87.field7818 != 0) {
                                class295.field3992.method40(-26704, var87);
                            } else if ((var2 != var85 || var3 != var86) && var87.field7831) {
                                class295.field3992.method40(-26704, var87);
                            }
                        }
                    }
                }
                if (arg1.field7817) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field7817 = false;
            }
        }
        if (arg1.field7836 != null && (byte) (class490.field7078 & 0xFF) == arg1.field7841) {
            class334 var88 = arg1.field7836;
            int var89 = class492.field7122[var4].method85(var2, var3);
            int var90;
            if (var4 < class265.field3571 - 1) {
                var90 = class492.field7122[var4].method85(var2, var3) - class492.field7122[var4 + 1].method85(var2, var3);
            } else {
                var90 = 0x8 << class295.field3991;
            }
            class159.field2419.method946(var6, var89, var7, arg0.field3160);
            int var91 = arg0.field3160[2];
            class159.field2419.method946(var6, var89 - var90, var7, arg0.field3160);
            int var92 = arg0.field3160[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class97.field1554;
            int var96 = class97.field1554 + var94;
            var88.field4878 = var95;
            var88.field4881 = var96;
            var88.field4877 = true;
            class77.field1093.method533(var88);
        }
        if (!arg1.field7831) {
            return;
        }
        if (arg1.field7818 != 0) {
            return;
        }
        if (var2 <= class39.field578 && var2 > class164.field2525) {
            class532 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field7831) {
                return;
            }
        }
        if (var2 >= class39.field578 && var2 < class245.field3356 - 1) {
            class532 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field7831) {
                return;
            }
        }
        if (var3 <= class119.field1859 && var3 > class125.field1932) {
            class532 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field7831) {
                return;
            }
        }
        if (var3 >= class119.field1859 && var3 < class215.field3054 - 1) {
            class532 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field7831) {
                return;
            }
        }
        arg1.field7831 = false;
        class222.field3136--;
        class151 var101 = arg1.field7825;
        if (var101 != null && var101.field2320) {
            if (class79.field1118) {
                class505.method2997(arg0, var4, var2, var3);
                class77.field1093.method503(arg0.field3164, arg0.field3166);
            }
            class121 var102 = var101.method171((byte) -96, class77.field1093);
            if (var102 != null) {
                var102.field1881 = var101;
                var102.field1879 = var4;
                var102.field1885 = var2;
                var102.field1887 = var3;
                class116.field1835.method2599(1256, var102);
            }
        }
        if (arg1.field7839 != 0) {
            class63 var103 = arg1.field7833;
            if (var103 != null && !class232.method1420(var5, var2, var3, var103.method419(-110))) {
                if ((var103.field909 & arg1.field7839) != 0) {
                    if (class79.field1118) {
                        class505.method2997(arg0, var4, var2, var3);
                        class77.field1093.method503(arg0.field3164, arg0.field3166);
                    }
                    class121 var104 = var103.method171((byte) -96, class77.field1093);
                    if (var104 != null) {
                        var104.field1881 = var103;
                        var104.field1879 = var4;
                        var104.field1885 = var2;
                        var104.field1887 = var3;
                        class116.field1835.method2599(1256, var104);
                    }
                } else if (var103.field909 == 256) {
                    int var105 = var103.field906 - class104.field1714;
                    int var106 = var103.field910 - class257.field3495;
                    int var107 = var103.field918;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class79.field1118) {
                        class505.method2997(arg0, var4, var2, var3);
                        class77.field1093.method503(arg0.field3164, arg0.field3166);
                    }
                    class63 var110 = arg1.field7835;
                    if (var109 > var108) {
                        class121 var111 = var103.method171((byte) -96, class77.field1093);
                        if (var111 != null) {
                            var111.field1881 = var103;
                            var111.field1879 = var4;
                            var111.field1885 = var2;
                            var111.field1887 = var3;
                            class116.field1835.method2599(1256, var111);
                        }
                    } else if (var110 != null) {
                        class121 var112 = var110.method171((byte) -96, class77.field1093);
                        if (var112 != null) {
                            var112.field1881 = var110;
                            var112.field1879 = var4;
                            var112.field1885 = var2;
                            var112.field1887 = var3;
                            class116.field1835.method2599(1256, var112);
                        }
                    }
                }
            }
            class168 var113 = arg1.field7830;
            class168 var114 = arg1.field7822;
            if (var114 != null && (var114.field2566 & arg1.field7839) != 0 && !class387.method2294(var5, var2, var3, var114.field2566)) {
                if (class79.field1118) {
                    class94.method768(arg0, var114.field2566, var4, var2, var3);
                    class77.field1093.method503(arg0.field3164, arg0.field3166);
                }
                class121 var115 = var114.method171((byte) -96, class77.field1093);
                if (var115 != null) {
                    var115.field1881 = var114;
                    var115.field1879 = var4;
                    var115.field1885 = var2;
                    var115.field1887 = var3;
                    class116.field1835.method2599(1256, var115);
                }
            }
            if (var113 != null && (var113.field2566 & arg1.field7839) != 0 && !class387.method2294(var5, var2, var3, var113.field2566)) {
                if (class79.field1118) {
                    class94.method768(arg0, var113.field2566, var4, var2, var3);
                    class77.field1093.method503(arg0.field3164, arg0.field3166);
                }
                class121 var116 = var113.method171((byte) -96, class77.field1093);
                if (var116 != null) {
                    var116.field1881 = var113;
                    var116.field1879 = var4;
                    var116.field1885 = var2;
                    var116.field1887 = var3;
                    class116.field1835.method2599(1256, var116);
                }
            }
        }
        if (var4 < class265.field3571 - 1) {
            class532 var117 = class103.field1632[var4 + 1][var2][var3];
            if (var117 != null && var117.field7831) {
                class295.field3992.method51((byte) -103, var117);
            }
        }
        if (var2 < class39.field578) {
            class532 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field7831) {
                class295.field3992.method40(-26704, var118);
            }
        }
        if (var3 < class119.field1859) {
            class532 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field7831) {
                class295.field3992.method40(-26704, var119);
            }
        }
        if (var2 > class39.field578) {
            class532 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field7831) {
                class295.field3992.method40(-26704, var120);
            }
        }
        if (var3 > class119.field1859) {
            class532 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field7831) {
                class295.field3992.method40(-26704, var121);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lad;ILdk;)V")
    public class364(class12 arg0, int arg1, class421 arg2) {
        this.field5233 = arg2;
        if (this.field5233 != null) {
            this.field5233.method2509(0, 11);
        }
    }
}
