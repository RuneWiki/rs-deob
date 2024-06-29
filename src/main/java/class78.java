import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class78 extends class123 {

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
    private int field1408 = 2048;

    @OriginalMember(owner = "client!ld", name = "fb", descriptor = "I")
    private int field1412 = 0;

    @OriginalMember(owner = "client!ld", name = "mb", descriptor = "I")
    private int field1419 = 10;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field1404 = 0;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "Leb;")
    public static class230 field1407 = class68.method589(0, "huffman");

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "Leb;")
    public static class230 field1409 = class68.method589(0, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!ld", name = "eb", descriptor = "Z")
    public static boolean field1411 = true;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ld", name = "db", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ld", name = "gb", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ld", name = "ib", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ld", name = "jb", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ld", name = "kb", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ld", name = "nb", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ld", name = "ob", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ld", name = "pb", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!ld", name = "qb", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ld", name = "lb", descriptor = "J")
    public static long field1418;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "[I")
    private int[] field1405;

    @OriginalMember(owner = "client!ld", name = "hb", descriptor = "[I")
    private int[] field1414;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(II)V")
    public static final void method647(int arg0, int arg1) {
        ++field1421;
        short var2 = 256;
        if (~arg0 < ~var2) {
            arg0 = var2;
        }
        if (~arg0 < -11) {
            arg0 = 10;
        }
        class155.field2769 += arg0 * 128;
        if (~class246.field4380.length > ~class155.field2769) {
            int var3 = (int) (12.0D * Math.random());
            class155.field2769 -= class246.field4380.length;
            class105.method878(arg1 ^ -936, class40.field736[var3]);
        }
        int var4 = (-arg0 + var2) * arg1;
        int var5 = 0;
        int var6 = arg0 * 128;
        for (int var7 = 0; ~var7 > ~var4; ++var7) {
            int var26 = class209.field3655[var5 - -var6] + -(class246.field4380[class246.field4380.length + -1 & class155.field2769 + var5] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class209.field3655[var5++] = var26;
        }
        for (int var8 = -arg0 + var2; ~var8 > ~var2; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; ~var24 > -129; ++var24) {
                int var25 = (int) (Math.random() * 100.0D);
                if (~var25 > -51 && ~var24 < -11 && ~var24 > -119) {
                    class209.field3655[var24 - -var23] = 255;
                } else {
                    class209.field3655[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; -arg0 + var2 > var9; ++var9) {
            class209.field3659[var9] = class209.field3659[arg0 + var9];
        }
        for (int var10 = -arg0 + var2; ~var2 < ~var10; ++var10) {
            class209.field3659[var10] = (int) (Math.sin((double) class166.field2936 / 14.0D) * 16.0D + Math.sin((double) class166.field2936 / 15.0D) * 14.0D + Math.sin((double) class166.field2936 / 16.0D) * 12.0D);
            ++class166.field2936;
        }
        class60.field1156 += arg0;
        int var11 = ((1 & class259.field4584) + arg0) / 2;
        if (~var11 < -1) {
            for (int var12 = 0; ~class60.field1156 < ~var12; ++var12) {
                int var21 = 2 + (int) (Math.random() * 124.0D);
                int var22 = (int) (Math.random() * 128.0D) - -128;
                class209.field3655[(var22 << 7) + var21] = 192;
            }
            class60.field1156 = 0;
            for (int var13 = 0; var2 > var13; ++var13) {
                int var18 = 0;
                int var19 = var13 * 128;
                for (int var20 = -var11; ~var20 > -129; ++var20) {
                    if (var11 + var20 < 128) {
                        var18 += class209.field3655[var20 - -var11 + var19];
                    }
                    if (~(var20 + -1 + -var11) <= -1) {
                        var18 -= class209.field3655[-var11 - 1 + (var20 - -var19)];
                    }
                    if (~var20 <= -1) {
                        class118.field2106[var19 + var20] = var18 / (var11 * 2 - -1);
                    }
                }
            }
            for (int var14 = 0; var14 < 128; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; var16 < var2; ++var16) {
                    int var17 = var16 * 128;
                    if (~(var16 - -var11) > ~var2) {
                        var15 += class118.field2106[var11 * 128 + var17 + var14];
                    }
                    if (~(var16 + -1 + -var11) <= -1) {
                        var15 -= class118.field2106[var14 + var17 - (var11 * 128 - -128)];
                    }
                    if (var16 >= 0) {
                        class209.field3655[var14 - -var17] = var15 / (var11 * 2 + 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg2 != 1876195788) {
            field1411 = true;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field1412 = arg1.method200(255);
                }
            } else {
                this.field1408 = arg1.method161(4);
            }
        } else {
            this.field1419 = arg1.method200(255);
        }
        ++field1406;
    }

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V")
    private final void method648(int arg0) {
        int var2 = 0;
        int var3 = 4096 / this.field1419;
        int var4 = this.field1408 * var3 >> 12;
        ++field1410;
        this.field1405 = new int[this.field1419 + 1];
        this.field1414 = new int[this.field1419 + 1];
        int var5 = 0;
        if (arg0 != -3) {
            method650(true);
        }
        while (~var5 > ~this.field1419) {
            this.field1414[var5] = var2;
            this.field1405[var5] = var2 + var4;
            var2 += var3;
            ++var5;
        }
        this.field1414[this.field1419] = 4096;
        this.field1405[this.field1419] = 4096 - -this.field1405[0];
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class78() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)V")
    public static final void method649(byte arg0) {
        ++field1413;
        class24 var1 = class22.field431;
        synchronized (class22.field431) {
            if (arg0 != -69) {
                field1409 = null;
            }
            ++class264.field4693;
            class134.field2419 = class218.field3758;
            class34.field620 = class197.field3520;
            class251.field4497 = class92.field1654;
            class96.field1727 = class109.field1957;
            class225.field3886 = class95.field1717;
            class92.field1657 = class237.field4097;
            class142.field2541 = class48.field855;
            class109.field1957 = 0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        ++field1420;
        int var3 = 73 % ((arg1 - -24) / 57);
        int[] var4 = super.field2160.method1323((byte) 43, arg0);
        if (super.field2160.field3243) {
            int var5 = class154.field2753[arg0];
            if (~this.field1412 == -1) {
                short var6 = 0;
                for (int var7 = 0; this.field1419 > var7; ++var7) {
                    if (~var5 <= ~this.field1414[var7] && var5 < this.field1414[var7 + 1]) {
                        if (this.field1405[var7] > var5) {
                            var6 = 4096;
                        }
                        break;
                    }
                }
                class43.method373(var4, 0, class140.field2505, var6);
            } else {
                for (int var8 = 0; var8 < class140.field2505; ++var8) {
                    int var9 = 0;
                    short var10 = 0;
                    int var11 = class214.field3705[var8];
                    int var12 = this.field1412;
                    if (~var12 != -2) {
                        if (var12 != 2) {
                            if (~var12 == -4) {
                                var9 = (-var5 + var11 >> 1) + 2048;
                            }
                        } else {
                            var9 = (var11 - -var5 - 4096 >> 1) + 2048;
                        }
                    } else {
                        var9 = var11;
                    }
                    for (int var13 = 0; var13 < this.field1419; ++var13) {
                        if (var9 >= this.field1414[var13] && this.field1414[var13 - -1] > var9) {
                            if (this.field1405[var13] > var9) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var4[var8] = var10;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V")
    public static final void method650(boolean arg0) {
        class263.field4676 = null;
        class96.field1735 = null;
        class113.field2034 = null;
        class215.field3725 = null;
        class273.field4806 = null;
        ++field1415;
        class7.field124 = null;
        if (!arg0) {
            method650(true);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILka;B)Leb;")
    public static final class230 method651(int arg0, class245 arg1, byte arg2) {
        ++field1416;
        if (!class204.method1433(arg0, arg2 ^ -3468, client.method1167(arg1)) && arg1.field4316 == null) {
            return null;
        } else {
            if (arg2 != 91) {
                method649((byte) -78);
            }
            if (arg1.field4202 != null && ~arg0 > ~arg1.field4202.length && arg1.field4202[arg0] != null && ~arg1.field4202[arg0].method1628(12348).method1635(-73) != -1) {
                return arg1.field4202[arg0];
            } else {
                return class271.field4786 ? class173.method1267((byte) 59, new class230[] { class214.field3713, class37.method340(arg0, (byte) -26) }) : null;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIII)I")
    public static final int method652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1423;
        int var7 = arg4 & 3;
        int var8 = 86 % ((66 - arg2) / 34);
        if ((1 & arg3) == 1) {
            int var9 = arg0;
            arg0 = arg6;
            arg6 = var9;
        }
        if (var7 == 0) {
            return arg5;
        } else if (~var7 == -2) {
            return arg1;
        } else {
            return ~var7 == -3 ? -arg0 + 7 + 1 + -arg5 : -arg6 - (-1 - (7 - arg1));
        }
    }

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)V")
    public static void method653(int arg0) {
        if (arg0 == -1031) {
            field1407 = null;
            field1409 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public final void method257(int arg0) {
        this.method648(-3);
        ++field1417;
        if (arg0 != 0) {
            method651(-111, (class245) null, (byte) -30);
        }
    }
}
