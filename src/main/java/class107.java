import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class107 {

    @OriginalMember(owner = "client!td", name = "k", descriptor = "[I")
    private int[] field1767;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "[B")
    private byte[] field1768;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "[I")
    private int[] field1757;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "[I")
    public static int[] field1766 = new int[128];

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field1772 = -1;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field1773 = 0;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field1769 = 0;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lpi;")
    public static class220 field1763;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1765;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBI)Z", line = 7)
    public static final boolean method944(int arg0, byte arg1, int arg2) {
        field1771++;
        class45 var3 = class451.method2812(120, arg0);
        if (arg1 > -14) {
            field1763 = null;
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method367(arg2, -16);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 28)
    public static final void method945(int arg0) {
        if (arg0 <= 47) {
            method947(true, (class258) null);
        }
        class416.field6028.method1614((byte) -111);
        field1762++;
        class242.field3527 = null;
        class439.field6387 = 1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[[[BIBII)V", line = 49)
    public static final void method946(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class365.field5205++;
        class324.field4689 = 0;
        for (int var6 = class406.field5909; var6 < class13.field218; var6++) {
            class168[][] var17 = class443.field6447[var6];
            for (int var18 = class175.field2608; var18 < class34.field491; var18++) {
                for (int var19 = class373.field5306; var19 < class187.field2778; var19++) {
                    class168 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class207.field3035[var18 + class46.field755 - class415.field6013][var19 + class46.field755 - class71.field1203] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field2511 = true;
                            var20.field2499 = true;
                            if (var20.field2488 == null) {
                                var20.field2508 = false;
                            } else {
                                var20.field2508 = true;
                            }
                            class324.field4689++;
                        } else {
                            var20.field2511 = false;
                            var20.field2499 = false;
                            var20.field2509 = 0;
                            if (var18 >= class415.field6013 - 16 && var18 <= class415.field6013 + 16 && var19 >= class71.field1203 - 16 && var19 <= class71.field1203 + 16 && (var20.field2505 != null || var20.field2510 != null || var20.field2506 != null || var20.field2507 != null || var20.field2501 != null || var20.field2488 != null)) {
                                class432.field6229.method468(var20, 5000);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class50.field816 == class18.field262;
        for (int var8 = class406.field5909; var8 < class13.field218; var8++) {
            float var9 = var7 ? 202.0F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class73.field1222.method707() && var8 >= arg2 && arg1 != null) {
                int var10 = class207.field3035.length;
                if (class207.field3035.length + class175.field2608 > class139.field2209) {
                    var10 -= class207.field3035.length + class175.field2608 - class139.field2209;
                }
                int var11 = class207.field3035[0].length;
                if (class207.field3035[0].length + class373.field5306 > class436.field6353) {
                    var11 -= class207.field3035[0].length + class373.field5306 - class436.field6353;
                }
                int var12 = class153.field2326;
                while (true) {
                    if (var12 >= var10) {
                        class432.field6229.method472(var9, (byte) 89, var8, true, class50.field816[var8]);
                        break;
                    }
                    int var13 = class175.field2608 + var12 - class153.field2326;
                    for (int var14 = class236.field3403; var14 < var11; var14++) {
                        class15.field229[var12][var14] = false;
                        if (class207.field3035[var12][var14]) {
                            int var15 = class373.field5306 + var14 - class236.field3403;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class443.field6447[var16][var13][var15] != null && class443.field6447[var16][var13][var15].field2504 == var8) {
                                    class15.field229[var12][var14] = class443.field6447[var16][var13][var15].field2511;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class432.field6229.method472(var9, (byte) 90, var8, false, class50.field816[var8]);
            }
            class432.field6229.method466(-124);
        }
        if (!class360.method2312(true)) {
            class360.method2312(false);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLmb;)V", line = 188)
    public static final void method947(boolean arg0, class258 arg1) {
        field1770++;
        if (class423.field6169 == arg1.field3896) {
            class254.field3685[arg1.field3885] = true;
        }
        if (!arg0) {
            method948((String) null, false);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;Z)J", line = 207)
    public static final long method948(String arg0, boolean arg1) {
        field1760++;
        int var2 = arg0.length();
        long var3 = 0L;
        int var5 = 0;
        if (arg1) {
            method947(true, (class258) null);
        }
        while (var5 < var2) {
            var3 = (var3 << 5) + (long) arg0.charAt(var5) - var3;
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIZ[B[BI)I", line = 234)
    public final int method949(int arg0, int arg1, boolean arg2, byte[] arg3, byte[] arg4, int arg5) {
        field1774++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg1;
        int var8 = 0;
        int var9 = arg5;
        if (arg2) {
            field1766 = null;
        }
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1757[var8];
            }
            int var11;
            if ((var11 = this.field1757[var8]) < 0) {
                arg4[arg1++] = (byte) (~var11);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1757[var8];
            }
            int var12;
            if ((var12 = this.field1757[var8]) < 0) {
                arg4[arg1++] = (byte) (~var12);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1757[var8];
            }
            int var13;
            if ((var13 = this.field1757[var8]) < 0) {
                arg4[arg1++] = (byte) (~var13);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1757[var8];
            }
            int var14;
            if ((var14 = this.field1757[var8]) < 0) {
                arg4[arg1++] = (byte) (~var14);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1757[var8];
            }
            int var15;
            if ((var15 = this.field1757[var8]) < 0) {
                arg4[arg1++] = (byte) (~var15);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1757[var8];
            }
            int var16;
            if ((var16 = this.field1757[var8]) < 0) {
                arg4[arg1++] = (byte) (~var16);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1757[var8];
            }
            int var17;
            if ((var17 = this.field1757[var8]) < 0) {
                arg4[arg1++] = (byte) (~var17);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1757[var8];
            }
            int var18;
            if ((var18 = this.field1757[var8]) < 0) {
                arg4[arg1++] = (byte) (~var18);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/lang/String;ZI)Z", line = 386)
    public static final boolean method950(byte arg0, String arg1, boolean arg2, int arg3) {
        field1759++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        if (arg0 <= 55) {
            method947(true, (class258) null);
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg3 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if (var10 / arg3 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([BIIII[B)I", line = 463)
    public final int method951(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field1758++;
        int var7 = 0;
        int var8 = arg1 + arg2;
        int var9 = arg4 << 3;
        while (var8 > arg2) {
            int var10 = arg0[arg2] & 0xFF;
            int var11 = this.field1767[var10];
            byte var12 = this.field1768[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 - (1 - var12) >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var7 = class439.method2744(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg5[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg5[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg5[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg5[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        if (arg3 != 24) {
            field1769 = -35;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 537)
    public static void method952(int arg0) {
        field1766 = null;
        field1765 = null;
        field1763 = null;
        if (arg0 != -1) {
            field1765 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V", line = 554)
    public class107(byte[] arg0) {
        int var2 = arg0.length;
        this.field1767 = new int[var2];
        this.field1768 = arg0;
        this.field1757 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1767[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class439.method2744(var12, var11);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1757[var14] == 0) {
                            this.field1757[var14] = var4;
                        }
                        var14 = this.field1757[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field1757.length <= var14) {
                        int[] var18 = new int[this.field1757.length * 2];
                        for (int var19 = 0; var19 < this.field1757.length; var19++) {
                            var18[var19] = this.field1757[var19];
                        }
                        this.field1757 = var18;
                    }
                }
                this.field1757[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
