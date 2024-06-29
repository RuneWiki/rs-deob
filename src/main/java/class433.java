import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class433 extends class699 {

    @OriginalMember(owner = "client!ip", name = "G", descriptor = "Z")
    private boolean field5409 = false;

    @OriginalMember(owner = "client!ip", name = "U", descriptor = "I")
    private int field5422 = 0;

    @OriginalMember(owner = "client!ip", name = "X", descriptor = "I")
    public int field5425 = -1;

    @OriginalMember(owner = "client!ip", name = "W", descriptor = "I")
    public int field5424 = -1;

    @OriginalMember(owner = "client!ip", name = "J", descriptor = "I")
    public int field5412 = 0;

    @OriginalMember(owner = "client!ip", name = "K", descriptor = "[I")
    public static int[] field5413 = new int[6];

    @OriginalMember(owner = "client!ip", name = "S", descriptor = "Z")
    public static boolean field5420 = false;

    @OriginalMember(owner = "client!ip", name = "T", descriptor = "I")
    public static int field5421 = -1;

    @OriginalMember(owner = "client!ip", name = "M", descriptor = "I")
    public static int field5414 = 0;

    @OriginalMember(owner = "client!ip", name = "F", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!ip", name = "H", descriptor = "I")
    public int field5410;

    @OriginalMember(owner = "client!ip", name = "I", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!ip", name = "N", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!ip", name = "O", descriptor = "I")
    public int field5416;

    @OriginalMember(owner = "client!ip", name = "P", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!ip", name = "Q", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!ip", name = "R", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!ip", name = "V", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!ip", name = "Y", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!ip", name = "Z", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!ip", name = "ab", descriptor = "I")
    public int field5428;

    @OriginalMember(owner = "client!ip", name = "bb", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!ip", name = "cb", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!ip", name = "db", descriptor = "I")
    public int field5431;

    @OriginalMember(owner = "client!ip", name = "fb", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!ip", name = "eb", descriptor = "Lpl;")
    public static class612 field5432;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(ZLr;)V", line = 4)
    public final void method67(boolean arg0, class566 arg1) {
        if (arg0) {
            this.method71(38);
        }
        ++field5419;
    }

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "(I)I", line = 14)
    public final int method71(int arg0) {
        ++field5427;
        int var2 = 31 / ((arg0 - -43) / 59);
        return -10;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lr;I)Lsd;", line = 28)
    public final class362 method82(class566 arg0, int arg1) {
        if (arg1 != -1660704056) {
            this.field5416 = 20;
        }
        ++field5411;
        return null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 39)
    public static final byte[] method2278(String arg0, byte arg1) {
        ++field5417;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 != -47) {
            return null;
        } else {
            for (int var4 = 0; ~var4 > ~var2; ++var4) {
                char var5 = arg0.charAt(var4);
                if (var5 > 0 && ~var5 > -129 || var5 >= 160 && ~var5 >= -256) {
                    var3[var4] = (byte) var5;
                } else if (~var5 != -8365) {
                    if (var5 != 8218) {
                        if (~var5 != -403) {
                            if (var5 != 8222) {
                                if (~var5 != -8231) {
                                    if (var5 != 8224) {
                                        if (~var5 == -8226) {
                                            var3[var4] = -121;
                                        } else if (var5 != 710) {
                                            if (~var5 == -8241) {
                                                var3[var4] = -119;
                                            } else if (~var5 == -353) {
                                                var3[var4] = -118;
                                            } else if (var5 == 8249) {
                                                var3[var4] = -117;
                                            } else if (var5 != 338) {
                                                if (var5 != 381) {
                                                    if (~var5 != -8217) {
                                                        if (~var5 == -8218) {
                                                            var3[var4] = -110;
                                                        } else if (~var5 != -8221) {
                                                            if (var5 != 8221) {
                                                                if (var5 == 8226) {
                                                                    var3[var4] = -107;
                                                                } else if (var5 == 8211) {
                                                                    var3[var4] = -106;
                                                                } else if (~var5 == -8213) {
                                                                    var3[var4] = -105;
                                                                } else if (var5 != 732) {
                                                                    if (var5 != 8482) {
                                                                        if (var5 == 353) {
                                                                            var3[var4] = -102;
                                                                        } else if (var5 == 8250) {
                                                                            var3[var4] = -101;
                                                                        } else if (var5 == 339) {
                                                                            var3[var4] = -100;
                                                                        } else if (var5 == 382) {
                                                                            var3[var4] = -98;
                                                                        } else if (~var5 != -377) {
                                                                            var3[var4] = 63;
                                                                        } else {
                                                                            var3[var4] = -97;
                                                                        }
                                                                    } else {
                                                                        var3[var4] = -103;
                                                                    }
                                                                } else {
                                                                    var3[var4] = -104;
                                                                }
                                                            } else {
                                                                var3[var4] = -108;
                                                            }
                                                        } else {
                                                            var3[var4] = -109;
                                                        }
                                                    } else {
                                                        var3[var4] = -111;
                                                    }
                                                } else {
                                                    var3[var4] = -114;
                                                }
                                            } else {
                                                var3[var4] = -116;
                                            }
                                        } else {
                                            var3[var4] = -120;
                                        }
                                    } else {
                                        var3[var4] = -122;
                                    }
                                } else {
                                    var3[var4] = -123;
                                }
                            } else {
                                var3[var4] = -124;
                            }
                        } else {
                            var3[var4] = -125;
                        }
                    } else {
                        var3[var4] = -126;
                    }
                } else {
                    var3[var4] = -128;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "(B)Z", line = 177)
    public final boolean method83(byte arg0) {
        ++field5433;
        return arg0 != 23 ? true : this.field5409;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILjava/lang/String;ZIZLjava/lang/String;)V", line = 197)
    public static final void method2279(int arg0, int arg1, String arg2, boolean arg3, int arg4, boolean arg5, String arg6) {
        ++field5408;
        class673.field9472.field8600 = 1;
        String var7 = arg6.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (~arg4 != 0) {
            class207 var11 = class705.field9939.method2477((byte) 6, arg4);
            if (var11 == null || arg5 == !var11.method1245(0)) {
                return;
            }
            if (var11.method1245(0)) {
                var10 = var11.field2632;
            } else {
                var9 = var11.field2627;
            }
        }
        int var12 = 0;
        for (int var13 = 0; ~class633.field8881.field974 < ~var13; ++var13) {
            class3 var16 = class633.field8881.method434(12388, var13);
            if ((!arg3 || var16.field74) && ~var16.field38 == 0 && var16.field37 == -1 && var16.field92 == 0 && ~var16.field34.toLowerCase().indexOf(var7) != 0) {
                if (~arg4 != 0) {
                    if (arg5) {
                        if (!arg2.equals(var16.method16(var10, arg4, true))) {
                            continue;
                        }
                    } else if (~var16.method18(arg4, var9, -109) != ~arg0) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class530.field7163 = -1;
                    class182.field2328 = null;
                    return;
                }
                if (~var8.length >= ~var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; ~var18 > ~var12; ++var18) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class530.field7163 = var12;
        class467.field5936 = 0;
        class182.field2328 = var8;
        String[] var14 = new String[class530.field7163];
        for (int var15 = 0; var15 < class530.field7163; ++var15) {
            var14[var15] = class633.field8881.method434(12388, var8[var15]).field34;
        }
        if (arg1 != 339) {
            method2278((String) null, (byte) 15);
        }
        class356.method1953(class182.field2328, var14, 0);
        class673.field9472.method3355(-27756);
        class673.field9472.field8600 = 2;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(IIIII)V", line = 574)
    public class433(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZLr;)Log;", line = 316)
    public final class101 method73(boolean arg0, class566 arg1) {
        ++field5430;
        class138 var3 = class21.method146(super.field6470, super.field6461 >> class52.field775, super.field6464 >> class52.field775);
        if (var3 != null && var3.field1786.field2242) {
            int var4 = var3.field1786.method71(34);
            if (this.field5412 != var4) {
                super.field6458 -= this.field5412;
                super.field6458 += var4;
                this.field5412 = var4;
            }
        }
        class491 var5 = arg1.method995();
        var5.method918();
        if (var3 == null || !var3.field1786.field2242) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class272 var9 = class491.field6485[super.field6456];
            int var10 = this.field5422 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method1565(super.field6464 + var13, super.field6461 + var12, true);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method1565(super.field6464 + var16, super.field6461 + var15, !arg0);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method1565(super.field6464 + var19, super.field6461 + var18, !arg0);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method1565(super.field6464 - -var22, super.field6461 + var21, true);
            int var24 = var17 <= var14 ? var17 : var14;
            int var25 = var23 > var20 ? var20 : var23;
            int var26 = ~var23 < ~var17 ? var17 : var23;
            if (~var10 != -1) {
                int var27 = 16383 & (int) (Math.atan2((double) (-var25 + var24), (double) var10) * 2607.5945876176133D);
                if (var27 != 0) {
                    var5.method922(var27);
                }
            }
            int var28 = ~var14 > ~var20 ? var14 : var20;
            if (var10 != 0) {
                int var29 = 16383 & (int) (Math.atan2((double) (-var26 + var28), (double) var10) * 2607.5945876176133D);
                if (var29 != 0) {
                    var5.method924(-var29);
                }
            }
            int var30 = var14 - -var23;
            if (var17 + var20 < var30) {
                var30 = var17 - -var20;
            }
            int var31 = (var30 >> 1) - super.field6458;
            if (var31 != 0) {
                var5.method903(0, var31, 0);
            }
        }
        var5.method903(super.field6461, super.field6458 - 10, super.field6464);
        class101 var32 = class676.method3794(true, 3);
        this.field5422 = 0;
        this.field5409 = arg0;
        if (~this.field5424 != 0) {
            class474 var33 = class633.field8881.method434(12388, this.field5424).method31(0, arg1, 2048, (class395) null, 0, (class498) null, this.field5416, -1, 16777215);
            if (var33 != null) {
                if (class36.field498) {
                    var33.method751(var5, var32.field1361[2], class432.field5406, 0);
                } else {
                    var33.method717(var5, var32.field1361[2], 0);
                }
                this.field5409 |= var33.method740();
                this.field5422 = var33.method704();
            }
        }
        if (~this.field5425 != 0) {
            class474 var34 = class633.field8881.method434(12388, this.field5425).method31(0, arg1, 2048, (class395) null, 0, (class498) null, this.field5431, -1, 16777215);
            if (var34 != null) {
                if (!class36.field498) {
                    var34.method717(var5, var32.field1361[1], 0);
                } else {
                    var34.method751(var5, var32.field1361[1], class432.field5406, 0);
                }
                this.field5409 |= var34.method740();
                if (~var34.method704() < ~this.field5422) {
                    this.field5422 = var34.method704();
                }
            }
        }
        class474 var35 = class633.field8881.method434(12388, this.field5410).method31(0, arg1, 2048, (class395) null, 0, (class498) null, this.field5428, -1, 16777215);
        if (var35 != null) {
            if (!class36.field498) {
                var35.method717(var5, var32.field1361[0], 0);
            } else {
                var35.method751(var5, var32.field1361[0], class432.field5406, 0);
            }
            this.field5409 |= var35.method740();
            if (~var35.method704() < ~this.field5422) {
                this.field5422 = var35.method704();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "(B)Z", line = 479)
    public final boolean method68(byte arg0) {
        ++field5423;
        return arg0 <= 114;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Les;B)Lkk;", line = 490)
    public static final class158 method2280(class630 arg0, byte arg1) {
        ++field5418;
        class130 var2 = class413.method2200(-120, arg0);
        int var3 = arg0.method3483(74);
        int var4 = arg0.method3483(arg1 + 217);
        if (arg1 != -101) {
            field5420 = true;
        }
        return new class158(var2.field1625, var2.field1622, var2.field1623, var2.field1616, var2.field1621, var2.field1617, var2.field1619, var2.field1614, var2.field1618, var3, var4);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILr;I)Z", line = 510)
    public final boolean method75(int arg0, int arg1, class566 arg2, int arg3) {
        ++field5426;
        class491 var5 = arg2.method995();
        var5.method914(super.field6461, super.field6458 + -10, super.field6464);
        class474 var6 = class633.field8881.method434(arg3 + 2710, this.field5410).method31(0, arg2, 131072, (class395) null, 0, (class498) null, this.field5428, -1, 16777215);
        if (arg3 != 9678) {
            return true;
        } else if (var6 != null && (class36.field498 ? var6.method738(arg0, arg1, var5, true, class432.field5406) : var6.method744(arg0, arg1, var5, true))) {
            return true;
        } else {
            if (this.field5425 != -1) {
                class474 var7 = class633.field8881.method434(12388, this.field5425).method31(0, arg2, 131072, (class395) null, 0, (class498) null, this.field5431, -1, 16777215);
                if (var7 != null && (!class36.field498 ? var7.method744(arg0, arg1, var5, true) : var7.method738(arg0, arg1, var5, true, class432.field5406))) {
                    return true;
                }
            }
            if (this.field5424 != -1) {
                class474 var8 = class633.field8881.method434(arg3 ^ 5546, this.field5424).method31(0, arg2, 131072, (class395) null, 0, (class498) null, this.field5416, -1, arg3 + 16767537);
                if (var8 != null && (class36.field498 ? var8.method738(arg0, arg1, var5, true, class432.field5406) : var8.method744(arg0, arg1, var5, true))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V", line = 556)
    public static void method2281(boolean arg0) {
        field5413 = null;
        if (!arg0) {
            field5432 = null;
        }
        field5432 = null;
    }

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "(I)V", line = 584)
    public static final void method2282(int arg0) {
        ++field5415;
        if (class347.field4449 != null) {
            class407.field5098 = new class126();
            class407.field5098.method669(class347.field4449, (byte) -123, class472.field5996, class347.field4449.field2568, class347.field4449.field2564.method476((byte) 76, class250.field3068));
            class44.field581 = new Thread(class407.field5098, "");
            if (arg0 >= -118) {
                method2280((class630) null, (byte) 33);
            }
            class44.field581.start();
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)I", line = 606)
    public final int method72(int arg0) {
        ++field5429;
        if (arg0 != -22496) {
            this.field5412 = -45;
        }
        return this.field5422;
    }
}
