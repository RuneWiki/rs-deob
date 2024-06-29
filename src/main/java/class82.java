import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class82 {

    @OriginalMember(owner = "client!th", name = "k", descriptor = "[B")
    private byte[] field1314;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "[I")
    private int[] field1309;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "[I")
    private int[] field1316;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Lok;")
    public static class146 field1304 = class235.method1724(-12908, "headicons_pk");

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lok;")
    public static class146 field1308 = class235.method1724(-12908, "Sprites charg-Bs");

    @OriginalMember(owner = "client!th", name = "i", descriptor = "Lok;")
    public static class146 field1312 = class235.method1724(-12908, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "Lig;")
    public static class172 field1315;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V", line = 7)
    public static final void method579(int arg0, int arg1) {
        field1313++;
        class280.field4809.method794(-17435, arg1);
        class122.field2001.method794(-17435, arg1);
        if (arg0 >= -92) {
            method579(-89, 70);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)Z", line = 31)
    public static final boolean method580(int arg0, int arg1) {
        field1310++;
        if (arg1 > -114) {
            method581(false);
        }
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V", line = 43)
    public static void method581(boolean arg0) {
        field1308 = null;
        field1315 = null;
        field1312 = null;
        field1304 = null;
        if (arg0) {
            method579(-65, 93);
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(II)I", line = 63)
    public static int method582(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lok;II)V", line = 81)
    public static final void method583(class146 arg0, int arg1, int arg2) {
        field1307++;
        class146 var3 = arg0.method1107((byte) -116).method1104((byte) 106);
        boolean var4 = false;
        for (int var5 = 0; var5 < class158.field2670; var5++) {
            class234 var6 = class75.field1215[class112.field1791[var5]];
            if (var6 != null && var6.field3891 != null && var6.field3891.method1106(var3, 124)) {
                var4 = true;
                class305.method2148(false, 1, 2, class102.field1639.field5432[0], var6.field5419[0], 0, var6.field5432[0], 0, 1, class102.field1639.field5419[0], true, 0);
                if (arg1 == 1) {
                    class272.field4664++;
                    class47.field820.method1656(47, 16);
                    class47.field820.method342((byte) -124, class112.field1791[var5]);
                } else if (arg1 == 4) {
                    class72.field1179++;
                    class47.field820.method1656(233, arg2 ^ 0xFFFFFFEF);
                    class47.field820.method330(class112.field1791[var5], 128);
                } else if (arg1 == 5) {
                    class215.field3557++;
                    class47.field820.method1656(103, 16);
                    class47.field820.method342((byte) -128, class112.field1791[var5]);
                } else if (arg1 == 6) {
                    class140.field2321++;
                    class47.field820.method1656(146, arg2 ^ 0xFFFFFFEF);
                    class47.field820.method330(class112.field1791[var5], 128);
                } else if (arg1 == 7) {
                    class165.field2793++;
                    class47.field820.method1656(124, arg2 ^ 0xFFFFFFEF);
                    class47.field820.method342((byte) -126, class112.field1791[var5]);
                }
                break;
            }
        }
        if (arg2 == -1 && !var4) {
            class316.method2209(false, class112.method758(-76, new class146[] { class273.field4693, var3 }), 0, class161.field2740);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIB[B[B)I", line = 158)
    public final int method584(int arg0, int arg1, int arg2, byte arg3, byte[] arg4, byte[] arg5) {
        field1317++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = arg0 + arg1;
        if (arg3 > -9) {
            return 48;
        }
        int var8 = 0;
        int var9 = arg2;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var8 = this.field1316[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field1316[var8]) < 0) {
                arg5[arg0++] = (byte) (~var11);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1316[var8];
            }
            int var12;
            if ((var12 = this.field1316[var8]) < 0) {
                arg5[arg0++] = (byte) (~var12);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1316[var8];
            }
            int var13;
            if ((var13 = this.field1316[var8]) < 0) {
                arg5[arg0++] = (byte) (~var13);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1316[var8];
            }
            int var14;
            if ((var14 = this.field1316[var8]) < 0) {
                arg5[arg0++] = (byte) (~var14);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1316[var8];
            }
            int var15;
            if ((var15 = this.field1316[var8]) < 0) {
                arg5[arg0++] = (byte) (~var15);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1316[var8];
            }
            int var16;
            if ((var16 = this.field1316[var8]) < 0) {
                arg5[arg0++] = (byte) (~var16);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1316[var8];
            }
            int var17;
            if ((var17 = this.field1316[var8]) < 0) {
                arg5[arg0++] = (byte) (~var17);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1316[var8];
            }
            int var18;
            if ((var18 = this.field1316[var8]) < 0) {
                arg5[arg0++] = (byte) (~var18);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(II)Lok;", line = 310)
    public static final class146 method585(int arg0, int arg1) {
        if (arg0 != 14744) {
            field1312 = (class146) null;
        }
        field1305++;
        return class164.method1282(false, 10, arg0 - 24246, arg1);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([BZ[BIII)I", line = 325)
    public final int method586(byte[] arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field1306++;
        int var7 = arg3 << 3;
        int var8 = arg4 + arg5;
        int var9 = 0;
        while (arg4 < var8) {
            int var10 = arg0[arg4] & 0xFF;
            byte var11 = this.field1314[var10];
            int var12 = this.field1309[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var7 >> 3;
            int var14 = var7 & 0x7;
            var7 += var11;
            int var15 = var9 & -var14 >> 31;
            int var16 = var13 + (var11 + var14 - 1 >> 3);
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var9 = class138.method1013(var15, var12 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg2[var13] = (byte) (var9 = var12 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var9 = var12 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var9 = var12 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var9 = var12 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        if (!arg1) {
            method580(28, -29);
        }
        return (var7 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "([B)V", line = 396)
    public class82(byte[] arg0) {
        int var2 = arg0.length;
        this.field1314 = arg0;
        this.field1309 = new int[var2];
        this.field1316 = new int[8];
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field1309[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class138.method1013(var12, var11);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field1316[var14] == 0) {
                            this.field1316[var14] = var3;
                        }
                        var14 = this.field1316[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field1316.length <= var14) {
                        int[] var18 = new int[this.field1316.length * 2];
                        for (int var19 = 0; var19 < this.field1316.length; var19++) {
                            var18[var19] = this.field1316[var19];
                        }
                        this.field1316 = var18;
                    }
                }
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
                this.field1316[var14] = ~var5;
            }
        }
    }
}
