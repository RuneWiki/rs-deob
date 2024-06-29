import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class121 extends class215 {

    @OriginalMember(owner = "client!dh", name = "ab", descriptor = "I")
    private int field1719 = 2048;

    @OriginalMember(owner = "client!dh", name = "fb", descriptor = "I")
    private int field1724 = 10;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
    private int field1710 = 0;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "Z")
    public static boolean field1711 = true;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "[I")
    public static int[] field1709 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "Lwb;")
    public static class123 field1714 = null;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "Luf;")
    public static class171 field1717 = new class171(0, -1);

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!dh", name = "cb", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!dh", name = "eb", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!dh", name = "gb", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!dh", name = "hb", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!dh", name = "kb", descriptor = "J")
    public static long field1729;

    @OriginalMember(owner = "client!dh", name = "jb", descriptor = "Leh;")
    public static class137 field1728;

    @OriginalMember(owner = "client!dh", name = "ib", descriptor = "Lib;")
    public static class56 field1727;

    @OriginalMember(owner = "client!dh", name = "bb", descriptor = "[I")
    private int[] field1720;

    @OriginalMember(owner = "client!dh", name = "db", descriptor = "[I")
    private int[] field1722;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "[[B")
    public static byte[][] field1713;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(B)V")
    private final void method784(byte arg0) {
        this.field1722 = new int[this.field1724 + 1];
        this.field1720 = new int[this.field1724 - -1];
        ++field1718;
        int var2 = 0;
        int var3 = 4096 / this.field1724;
        int var4 = this.field1719 * var3 >> 12;
        if (arg0 > -25) {
            method785(true);
        }
        for (int var5 = 0; var5 < this.field1724; ++var5) {
            this.field1722[var5] = var2;
            this.field1720[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1722[this.field1724] = 4096;
        this.field1720[this.field1724] = this.field1720[0] + 4096;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != 255) {
            this.field1710 = -122;
        }
        int[] var3 = super.field3445.method1755(arg0, (byte) 127);
        ++field1712;
        if (super.field3445.field4163) {
            int var4 = class76.field956[arg0];
            if (this.field1710 == 0) {
                short var5 = 0;
                for (int var6 = 0; ~this.field1724 < ~var6; ++var6) {
                    if (var4 >= this.field1722[var6] && this.field1722[var6 + 1] > var4) {
                        if (var4 < this.field1720[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class72.method405(var3, 0, class244.field4015, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class244.field4015; ++var7) {
                    short var8 = 0;
                    int var9 = 0;
                    int var10 = class166.field2657[var7];
                    int var11 = this.field1710;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                var9 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var9 = 2048 - -(var10 - 4096 - -var4 >> 1);
                        }
                    } else {
                        var9 = var10;
                    }
                    for (int var12 = 0; ~this.field1724 < ~var12; ++var12) {
                        if (~var9 <= ~this.field1722[var12] && ~this.field1722[var12 + 1] < ~var9) {
                            if (this.field1720[var12] > var9) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var8;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
    public static void method785(boolean arg0) {
        if (arg0) {
            field1717 = null;
            field1713 = null;
            field1727 = null;
            field1714 = null;
            field1709 = null;
            field1728 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class121() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public static final void method786(int arg0, int arg1, boolean arg2, String arg3, String arg4, String arg5) {
        for (int var6 = 99; var6 > 0; --var6) {
            class237.field3915[var6] = class237.field3915[var6 - 1];
            class63.field821[var6] = class63.field821[var6 + -1];
            class47.field591[var6] = class47.field591[var6 + -1];
            class51.field667[var6] = class51.field667[var6 + -1];
            class165.field2620[var6] = class165.field2620[var6 + -1];
        }
        ++class11.field123;
        ++field1708;
        class73.field908 = class162.field2582;
        class237.field3915[0] = arg1;
        class165.field2620[0] = arg0;
        class63.field821[0] = arg5;
        class47.field591[0] = arg4;
        if (arg2) {
            method789((char) 65491, 28);
        }
        class51.field667[0] = arg3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (arg0 == 1521146348) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field1710 = arg2.method584(arg0 ^ 1521146131);
                    }
                } else {
                    this.field1719 = arg2.method549(arg0 ^ 1521146131);
                }
            } else {
                this.field1724 = arg2.method584(arg0 + -1521146093);
            }
            ++field1726;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(JB)V")
    public static final void method787(long arg0, byte arg1) {
        ++field1721;
        if (~arg0 != -1L) {
            if ((class88.field1091 < 100 || class224.field3602) && class88.field1091 < 200) {
                String var3 = class145.method1013(arg0, 125);
                for (int var4 = 0; ~var4 > ~class88.field1091; ++var4) {
                    if (class251.field4108[var4] == arg0) {
                        class211.method1487(var3 + class218.field3490, "", 0, (byte) -128);
                        return;
                    }
                }
                for (int var5 = 0; class198.field3141 > var5; ++var5) {
                    if (~class53.field684[var5] == ~arg0) {
                        class211.method1487(class238.field3937 + var3 + class178.field2827, "", 0, (byte) -126);
                        return;
                    }
                }
                if (var3.equals(class286.field4571.field4208)) {
                    class211.method1487(class230.field3828, "", 0, (byte) -127);
                } else {
                    ++class162.field2586;
                    class143.field2256[class88.field1091] = var3;
                    class251.field4108[class88.field1091] = arg0;
                    class188.field3055[class88.field1091] = 0;
                    class34.field443[class88.field1091] = "";
                    if (arg1 != 47) {
                        method789((char) 65412, 8);
                    }
                    client.field1605[class88.field1091] = 0;
                    class219.field3503[class88.field1091] = false;
                    ++class88.field1091;
                    class68.field856 = class162.field2582;
                    class4.field57.method1932(false, 75);
                    class4.field57.method590(arg0, 1027669520);
                }
            } else {
                class211.method1487(class134.field2110, "", 0, (byte) -121);
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V")
    public final void method331(byte arg0) {
        ++field1725;
        this.method784((byte) -101);
        if (arg0 != -49) {
            field1717 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BC)B")
    public static final byte method788(byte arg0, char arg1) {
        ++field1715;
        if (arg0 != 58) {
            return -120;
        } else {
            byte var2;
            if ((arg1 <= 0 || ~arg1 <= -129) && (arg1 < 160 || ~arg1 < -256)) {
                if (~arg1 == -8365) {
                    var2 = -128;
                } else if (~arg1 != -8219) {
                    if (~arg1 != -403) {
                        if (arg1 == 8222) {
                            var2 = -124;
                        } else if (arg1 != 8230) {
                            if (~arg1 == -8225) {
                                var2 = -122;
                            } else if (arg1 != 8225) {
                                if (~arg1 != -711) {
                                    if (arg1 != 8240) {
                                        if (arg1 == 352) {
                                            var2 = -118;
                                        } else if (arg1 == 8249) {
                                            var2 = -117;
                                        } else if (~arg1 != -339) {
                                            if (~arg1 != -382) {
                                                if (arg1 == 8216) {
                                                    var2 = -111;
                                                } else if (~arg1 == -8218) {
                                                    var2 = -110;
                                                } else if (~arg1 == -8221) {
                                                    var2 = -109;
                                                } else if (~arg1 != -8222) {
                                                    if (arg1 == 8226) {
                                                        var2 = -107;
                                                    } else if (~arg1 == -8212) {
                                                        var2 = -106;
                                                    } else if (~arg1 != -8213) {
                                                        if (arg1 == 732) {
                                                            var2 = -104;
                                                        } else if (arg1 != 8482) {
                                                            if (arg1 == 353) {
                                                                var2 = -102;
                                                            } else if (arg1 != 8250) {
                                                                if (arg1 != 339) {
                                                                    if (~arg1 != -383) {
                                                                        if (~arg1 != -377) {
                                                                            var2 = 63;
                                                                        } else {
                                                                            var2 = -97;
                                                                        }
                                                                    } else {
                                                                        var2 = -98;
                                                                    }
                                                                } else {
                                                                    var2 = -100;
                                                                }
                                                            } else {
                                                                var2 = -101;
                                                            }
                                                        } else {
                                                            var2 = -103;
                                                        }
                                                    } else {
                                                        var2 = -105;
                                                    }
                                                } else {
                                                    var2 = -108;
                                                }
                                            } else {
                                                var2 = -114;
                                            }
                                        } else {
                                            var2 = -116;
                                        }
                                    } else {
                                        var2 = -119;
                                    }
                                } else {
                                    var2 = -120;
                                }
                            } else {
                                var2 = -121;
                            }
                        } else {
                            var2 = -123;
                        }
                    } else {
                        var2 = -125;
                    }
                } else {
                    var2 = -126;
                }
            } else {
                var2 = (byte) arg1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(CI)Z")
    public static final boolean method789(char arg0, int arg1) {
        int var2 = -78 % ((arg1 - -61) / 57);
        ++field1716;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= 160 && ~arg0 >= -256) {
            return true;
        } else {
            return arg0 == 8364 || ~arg0 == -339 || arg0 == 8212 || ~arg0 == -340 || arg0 == 376;
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(II)V")
    public static final void method790(int arg0, int arg1) {
        if (arg1 < 2) {
            field1717 = null;
        }
        if (~arg0 != -38) {
            if (arg0 == 50) {
                class281.field4457 = 4.0F;
            } else if (arg0 != 75) {
                if (arg0 == 100) {
                    class281.field4457 = 8.0F;
                } else if (~arg0 == -201) {
                    class281.field4457 = 16.0F;
                }
            } else {
                class281.field4457 = 6.0F;
            }
        } else {
            class281.field4457 = 3.0F;
        }
        class166.field2666 = -1;
        class166.field2666 = -1;
        ++field1723;
    }
}
