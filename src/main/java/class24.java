import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class24 extends class539 implements class302 {

    @OriginalMember(owner = "client!fba", name = "B", descriptor = "Z")
    private boolean field376;

    @OriginalMember(owner = "client!fba", name = "W", descriptor = "S")
    private short field396;

    @OriginalMember(owner = "client!fba", name = "U", descriptor = "B")
    private byte field394;

    @OriginalMember(owner = "client!fba", name = "R", descriptor = "Z")
    private boolean field391;

    @OriginalMember(owner = "client!fba", name = "eb", descriptor = "Z")
    private boolean field404;

    @OriginalMember(owner = "client!fba", name = "T", descriptor = "Z")
    private boolean field393;

    @OriginalMember(owner = "client!fba", name = "O", descriptor = "Lha;")
    private class54 field388;

    @OriginalMember(owner = "client!fba", name = "J", descriptor = "Lda;")
    private class55 field383;

    @OriginalMember(owner = "client!fba", name = "cb", descriptor = "I")
    public static int field402 = -1;

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "Leu;")
    public static class444 field379 = new class444(0, 1);

    @OriginalMember(owner = "client!fba", name = "jb", descriptor = "Lko;")
    public static class466 field409 = new class466();

    @OriginalMember(owner = "client!fba", name = "A", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!fba", name = "C", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!fba", name = "E", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!fba", name = "G", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!fba", name = "I", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!fba", name = "K", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!fba", name = "L", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!fba", name = "M", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!fba", name = "N", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!fba", name = "P", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!fba", name = "Q", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!fba", name = "S", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!fba", name = "V", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!fba", name = "X", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!fba", name = "Y", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!fba", name = "Z", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!fba", name = "ab", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!fba", name = "bb", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!fba", name = "db", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!fba", name = "fb", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!fba", name = "hb", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!fba", name = "ib", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!fba", name = "kb", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!fba", name = "gb", descriptor = "Lll;")
    private class334 field406;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZILr;I)Z", line = 6)
    public final boolean method392(boolean arg0, int arg1, class167 arg2, int arg3) {
        ++field377;
        class55 var5 = this.method397(-1, 131072, arg2);
        if (var5 != null) {
            class393 var6 = arg2.method339();
            var6.method503(super.field9696, super.field9701, super.field9705);
            return !class534.field7778 ? var5.method648(arg3, arg1, var6, false) : var5.method598(arg3, arg1, var6, false, class609.field8652);
        } else {
            if (arg0) {
                method405(-28, -66, -90);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "(I)I", line = 34)
    public final int method393(int arg0) {
        if (arg0 != 0) {
            return 95;
        } else {
            ++field384;
            return this.field383 == null ? 0 : this.field383.method623();
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)I", line = 45)
    public final int method394(byte arg0) {
        int var2 = 30 % ((-14 - arg0) / 51);
        ++field390;
        return 65535 & this.field396;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)Z", line = 55)
    public final boolean method395(int arg0) {
        if (arg0 != -29400) {
            return false;
        } else {
            ++field405;
            return this.field393;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILr;)V", line = 67)
    public final void method396(int arg0, class167 arg1) {
        ++field380;
        Object var3 = null;
        class54 var5;
        if (this.field388 == null && this.field393) {
            class564 var4 = this.method400(arg0 + 32720, 262144, true, arg1);
            var5 = var4 != null ? var4.field8103 : null;
        } else {
            var5 = this.field388;
            this.field388 = null;
        }
        if (var5 != null) {
            class143.method1214(var5, super.field9703, super.field9696, super.field9705, (boolean[]) null);
        }
        if (arg0 != -32646) {
            this.field404 = true;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILr;)Lda;", line = 95)
    private final class55 method397(int arg0, int arg1, class167 arg2) {
        ++field378;
        if (this.field383 != null && ~arg2.method323(this.field383.method651(), arg1) == -1) {
            return this.field383;
        } else if (arg0 != -1) {
            return null;
        } else {
            class564 var4 = this.method400(-121, arg1, false, arg2);
            return var4 == null ? null : var4.field8102;
        }
    }

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "(B)Z", line = 116)
    public final boolean method398(byte arg0) {
        if (arg0 >= -92) {
            this.field406 = null;
        }
        ++field410;
        return this.field376;
    }

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "(B)Z", line = 128)
    public static final boolean method399(byte arg0) {
        ++field401;
        if (arg0 >= -66) {
            return true;
        } else {
            try {
                if (class20.field332 == 2) {
                    if (class220.field3585 == null) {
                        class220.field3585 = class509.method3090(class386.field6000, class419.field6421, class20.field326);
                        if (class220.field3585 == null) {
                            return false;
                        }
                    }
                    if (class273.field4402 == null) {
                        class273.field4402 = new class262(class527.field7694, class300.field4692);
                    }
                    class16 var1 = class252.field4036;
                    if (class474.field7018 != null) {
                        var1 = class474.field7018;
                    }
                    if (var1.method242(class220.field3585, class414.field6351, 65, 22050, class273.field4402)) {
                        class252.field4036 = var1;
                        class252.field4036.method243(-124);
                        if (~class466.field6944 < -1) {
                            class20.field332 = 3;
                            class252.field4036.method209(826987791, ~class490.field7168 <= ~class466.field6944 ? class466.field6944 : class490.field7168);
                            for (int var2 = 0; var2 < class255.field4052.length; ++var2) {
                                class252.field4036.method204(class255.field4052[var2], var2, 17849);
                                class255.field4052[var2] = 255;
                            }
                        } else {
                            class20.field332 = 0;
                            class252.field4036.method209(826987791, class490.field7168);
                            for (int var3 = 0; ~var3 > ~class255.field4052.length; ++var3) {
                                class252.field4036.method204(class255.field4052[var3], var3, 17849);
                                class255.field4052[var3] = 255;
                            }
                        }
                        if (class474.field7018 == null) {
                            if (class105.field1708 > 0L) {
                                class252.field4036.method212(class105.field1708, class338.field5487, class220.field3585, true, -32);
                            } else {
                                class252.field4036.method222(class220.field3585, (byte) -29, class338.field5487);
                            }
                        }
                        if (class655.field9151 != null) {
                            class655.field9151.method1754(class252.field4036, (byte) 28);
                        }
                        class105.field1708 = 0L;
                        class474.field7018 = null;
                        class273.field4402 = null;
                        class386.field6000 = null;
                        class220.field3585 = null;
                        return true;
                    }
                }
            } catch (Exception var5) {
                var5.printStackTrace();
                class252.field4036.method232(-27382);
                class386.field6000 = null;
                class273.field4402 = null;
                class220.field3585 = null;
                class20.field332 = 0;
                class474.field7018 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIZLr;)Lraa;", line = 231)
    private final class564 method400(int arg0, int arg1, boolean arg2, class167 arg3) {
        ++field387;
        int var5 = -117 % ((arg0 - 18) / 54);
        class698 var6 = class213.field3537.method94(this.field396 & 65535, (byte) -42);
        class37 var7;
        class37 var8;
        if (this.field404) {
            var7 = class491.field7187[0];
            var8 = class493.field7208[super.field9703];
        } else {
            if (~super.field9703 <= -4) {
                var7 = null;
            } else {
                var7 = class491.field7187[super.field9703 + 1];
            }
            var8 = class491.field7187[super.field9703];
        }
        return var6.method3933(super.field9696, var8, arg3, arg1, var7, this.field394, -1, arg2, super.field9701, 22, super.field9705);
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(B)I", line = 262)
    public final int method401(byte arg0) {
        if (arg0 <= 50) {
            return -85;
        } else {
            ++field400;
            return this.field394;
        }
    }

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "(I)Z", line = 275)
    public final boolean method402(int arg0) {
        ++field408;
        if (arg0 != 623404585) {
            field402 = -75;
        }
        return this.field383 == null ? false : this.field383.method614();
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(ILr;)Lod;", line = 290)
    public final class468 method403(int arg0, class167 arg1) {
        ++field397;
        if (this.field383 == null) {
            return null;
        } else {
            class393 var3 = arg1.method339();
            var3.method503(super.field9696, super.field9701, super.field9705);
            class468 var4 = null;
            if (this.field391) {
                var4 = class429.method2720(1, 0);
            }
            if (arg0 >= -38) {
                return null;
            } else {
                if (!class534.field7778) {
                    this.field383.method606(var3, var4 != null ? var4.field6948[0] : null, 0);
                } else {
                    this.field383.method613(var3, var4 != null ? var4.field6948[0] : null, class609.field8652, 0);
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "(B)V", line = 323)
    public final void method404(byte arg0) {
        ++field398;
        if (arg0 >= -40) {
            this.field393 = true;
        }
        this.field376 = false;
        if (this.field383 != null) {
            this.field383.method629(-65537 & this.field383.method651());
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(III)Z", line = 339)
    public static final boolean method405(int arg0, int arg1, int arg2) {
        ++field395;
        if (arg2 >= -6) {
            return false;
        } else {
            return class182.method1482(arg1, arg0, (byte) -4) | (arg1 & 393216) != 0 || class136.method1170(-1, arg0, arg1) || class198.method1551(-13118, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "(B)I", line = 351)
    public final int method406(byte arg0) {
        ++field403;
        if (arg0 < 108) {
            method416((byte) 67);
        }
        return this.field383 != null ? this.field383.method612() : 0;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lr;I)V", line = 363)
    public final void method407(class167 arg0, int arg1) {
        ++field399;
        int var3 = 116 / ((arg1 - -10) / 40);
        Object var4 = null;
        class54 var6;
        if (this.field388 == null && this.field393) {
            class564 var5 = this.method400(124, 262144, true, arg0);
            var6 = var5 != null ? var5.field8103 : null;
        } else {
            var6 = this.field388;
            this.field388 = null;
        }
        if (var6 != null) {
            class458.method2871(var6, super.field9703, super.field9696, super.field9705, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BLr;)Lll;", line = 389)
    public final class334 method408(byte arg0, class167 arg1) {
        ++field389;
        if (arg0 != 111) {
            this.method396(-96, (class167) null);
        }
        if (this.field406 == null) {
            this.field406 = class166.method1342(this.method397(-1, 0, arg1), super.field9705, super.field9696, super.field9701, arg0 + 30529);
        }
        return this.field406;
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)V", line = 406)
    public final void method409(int arg0) {
        ++field381;
        if (this.field383 != null) {
            this.field383.method626();
        }
        if (arg0 != -7728) {
            this.method393(-86);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILlr;Lsp;IIIBLpba;)V", line = 422)
    public static final void method410(int arg0, class698 arg1, class589 arg2, int arg3, int arg4, int arg5, byte arg6, class304 arg7) {
        ++field382;
        class119 var8 = new class119();
        var8.field1902 = arg3 << 9;
        var8.field1904 = arg0 << 9;
        int var9 = 0 / ((-21 - arg6) / 55);
        var8.field1914 = arg5;
        if (arg1 == null) {
            if (arg2 == null) {
                if (arg7 != null) {
                    var8.field1907 = arg7;
                    var8.field1924 = arg3 - -arg7.method1841(20744) << 9;
                    var8.field1925 = arg7.method1841(20744) + arg0 << 9;
                    var8.field1923 = class174.method1418((byte) -121, arg7);
                    var8.field1916 = 256;
                    var8.field1910 = 256;
                    var8.field1928 = arg7.field4766;
                    var8.field1920 = arg7.field4786;
                    var8.field1929 = arg7.field4761 << 9;
                    class415.field6359.method1564((long) arg7.field4197, var8, (byte) 88);
                    return;
                }
            } else {
                var8.field1918 = arg2;
                class705 var10 = arg2.field8354;
                if (var10.field9912 != null) {
                    var8.field1927 = true;
                    var10 = var10.method3973(true, class539.field7869);
                }
                if (var10 != null) {
                    var8.field1924 = var10.field9949 + arg3 << 9;
                    var8.field1925 = var10.field9949 + arg0 << 9;
                    var8.field1923 = class20.method361(106, arg2);
                    var8.field1928 = var10.field9976;
                    var8.field1920 = var10.field9933;
                    var8.field1910 = var10.field9963;
                    var8.field1916 = var10.field9977;
                    var8.field1929 = var10.field9932 << 9;
                }
                class235.field3738.method3463((byte) -87, var8);
            }
        } else {
            var8.field1906 = arg1;
            int var11 = arg1.field9851;
            int var12 = arg1.field9829;
            if (arg4 == 1 || ~arg4 == -4) {
                var12 = arg1.field9851;
                var11 = arg1.field9829;
            }
            var8.field1913 = arg1.field9789;
            var8.field1929 = arg1.field9781 << 9;
            var8.field1916 = arg1.field9814;
            var8.field1919 = arg1.field9779;
            var8.field1923 = arg1.field9800;
            var8.field1924 = arg3 + var11 << 9;
            var8.field1925 = arg0 + var12 << 9;
            var8.field1920 = arg1.field9795;
            var8.field1910 = arg1.field9833;
            var8.field1928 = arg1.field9815;
            var8.field1901 = arg1.field9817;
            var8.field1926 = arg1.field9797;
            if (arg1.field9826 != null) {
                var8.field1927 = true;
                var8.method1069(-121);
            }
            if (var8.field1919 != null) {
                var8.field1905 = var8.field1901 - -((int) ((double) (-var8.field1901 + var8.field1926) * Math.random()));
            }
            class675.field9520.method3463((byte) -87, var8);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 518)
    public static final byte[] method411(int arg0, String arg1) {
        int var2 = -53 / ((15 - arg0) / 53);
        ++field392;
        int var3 = arg1.length();
        byte[] var4 = new byte[var3];
        for (int var5 = 0; ~var3 < ~var5; ++var5) {
            char var6 = arg1.charAt(var5);
            if ((~var6 >= -1 || var6 >= 128) && (~var6 > -161 || ~var6 < -256)) {
                if (~var6 != -8365) {
                    if (~var6 != -8219) {
                        if (~var6 != -403) {
                            if (~var6 != -8223) {
                                if (~var6 != -8231) {
                                    if (~var6 != -8225) {
                                        if (var6 == 8225) {
                                            var4[var5] = -121;
                                        } else if (var6 == 710) {
                                            var4[var5] = -120;
                                        } else if (~var6 == -8241) {
                                            var4[var5] = -119;
                                        } else if (~var6 == -353) {
                                            var4[var5] = -118;
                                        } else if (~var6 == -8250) {
                                            var4[var5] = -117;
                                        } else if (~var6 != -339) {
                                            if (var6 != 381) {
                                                if (~var6 == -8217) {
                                                    var4[var5] = -111;
                                                } else if (var6 != 8217) {
                                                    if (var6 != 8220) {
                                                        if (~var6 == -8222) {
                                                            var4[var5] = -108;
                                                        } else if (~var6 == -8227) {
                                                            var4[var5] = -107;
                                                        } else if (var6 == 8211) {
                                                            var4[var5] = -106;
                                                        } else if (~var6 != -8213) {
                                                            if (~var6 == -733) {
                                                                var4[var5] = -104;
                                                            } else if (~var6 != -8483) {
                                                                if (var6 != 353) {
                                                                    if (~var6 != -8251) {
                                                                        if (var6 == 339) {
                                                                            var4[var5] = -100;
                                                                        } else if (var6 != 382) {
                                                                            if (var6 == 376) {
                                                                                var4[var5] = -97;
                                                                            } else {
                                                                                var4[var5] = 63;
                                                                            }
                                                                        } else {
                                                                            var4[var5] = -98;
                                                                        }
                                                                    } else {
                                                                        var4[var5] = -101;
                                                                    }
                                                                } else {
                                                                    var4[var5] = -102;
                                                                }
                                                            } else {
                                                                var4[var5] = -103;
                                                            }
                                                        } else {
                                                            var4[var5] = -105;
                                                        }
                                                    } else {
                                                        var4[var5] = -109;
                                                    }
                                                } else {
                                                    var4[var5] = -110;
                                                }
                                            } else {
                                                var4[var5] = -114;
                                            }
                                        } else {
                                            var4[var5] = -116;
                                        }
                                    } else {
                                        var4[var5] = -122;
                                    }
                                } else {
                                    var4[var5] = -123;
                                }
                            } else {
                                var4[var5] = -124;
                            }
                        } else {
                            var4[var5] = -125;
                        }
                    } else {
                        var4[var5] = -126;
                    }
                } else {
                    var4[var5] = -128;
                }
            } else {
                var4[var5] = (byte) var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lr;Z)V", line = 655)
    public final void method412(class167 arg0, boolean arg1) {
        ++field385;
        if (arg1) {
            field402 = -70;
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(B)I", line = 665)
    public final int method413(byte arg0) {
        if (arg0 != 11) {
            this.method407((class167) null, 70);
        }
        ++field386;
        return 22;
    }

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "(I)Z", line = 682)
    public final boolean method414(int arg0) {
        ++field375;
        if (arg0 != 0) {
            this.method414(70);
        }
        return true;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIILr;ZILpn;)V", line = 694)
    public final void method415(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, int arg5, class692 arg6) {
        if (arg2 != 1) {
            this.field394 = 119;
        }
        if (arg6 instanceof class24) {
            class24 var8 = (class24) arg6;
            if (this.field383 != null && var8.field383 != null) {
                this.field383.method641(var8.field383, arg1, arg0, arg5, arg4);
            }
        }
        ++field407;
    }

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "(B)V", line = 720)
    public static void method416(byte arg0) {
        field379 = null;
        if (arg0 != -70) {
            field402 = 23;
        }
        field409 = null;
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lr;Llr;IIIIIZIZ)V", line = 736)
    public class24(class167 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field9771);
        super.field9696 = arg4;
        this.field376 = arg9;
        super.field9705 = arg6;
        this.field396 = (short) arg1.field9825;
        this.field394 = (byte) arg8;
        this.field391 = ~arg1.field9830 != -1 && !arg7;
        this.field404 = arg7;
        this.field393 = arg0.method262() && arg1.field9812 && !this.field404 && class17.field282.method2133(true, class497.field7259) != 0;
        int var11 = 2048;
        if (this.field376) {
            var11 |= 65536;
        }
        class564 var12 = this.method400(125, var11, this.field393, arg0);
        if (var12 != null) {
            this.field388 = var12.field8103;
            this.field383 = var12.field8102;
            if (this.field376) {
                this.field383 = this.field383.method609((byte) 0, var11, false);
                return;
            }
        }
    }
}
