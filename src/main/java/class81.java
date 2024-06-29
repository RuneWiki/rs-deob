import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class81 extends class65 {

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public static int field1813 = 0;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "Lrc;")
    public static class105 field1819 = class43.method374("oder benutzen Sie eine andere Welt)3", 0);

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public static int field1817 = 0;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "Lrc;")
    public static class105 field1833 = class43.method374("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", 0);

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "I")
    public static int field1835 = 0;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "Lrc;")
    public static class105 field1830 = class43.method374("Lade Ignorieren)2Liste)3)3)3", 0);

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "Lrc;")
    private static class105 field1832 = class43.method374("slide:", 0);

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "Lrc;")
    public static class105 field1816 = class43.method374("Entfernen", 0);

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "Lrc;")
    public static class105 field1807 = field1832;

    @OriginalMember(owner = "client!nc", name = "ib", descriptor = "Lrc;")
    public static class105 field1843 = class43.method374(",Zffentlicher Chat", 0);

    @OriginalMember(owner = "client!nc", name = "jb", descriptor = "Lrc;")
    private static class105 field1844 = class43.method374("Account locked as we suspect it has been stolen)3", 0);

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "Lrc;")
    public static class105 field1815 = field1844;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public int field1808;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public int field1811;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public int field1821;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!nc", name = "hb", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "Lua;")
    public class121 field1831;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "Lvc;")
    public static class129 field1827;

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "Lfc;")
    public static class34 field1838;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "Lfd;")
    public static class35 field1825;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "Llb;")
    public class68 field1809;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "Llb;")
    public class68 field1828;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "[I")
    public int[] field1834;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V", line = 4)
    public final void method691(byte arg0) {
        field1841++;
        int var2 = this.field1808;
        class121 var3 = this.field1831.method978((byte) -116);
        if (arg0 > -106) {
            return;
        }
        if (var3 == null) {
            this.field1808 = -1;
            this.field1824 = 0;
            this.field1834 = null;
            this.field1840 = 0;
            this.field1821 = 0;
        } else {
            this.field1808 = var3.field2911;
            this.field1834 = var3.field2971;
            this.field1821 = var3.field2918;
            this.field1840 = var3.field2936 * 128;
            this.field1824 = var3.field2950;
        }
        if (this.field1808 != var2 && this.field1828 != null) {
            class34.field787.method1009(this.field1828);
            this.field1828 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)V", line = 59)
    public static final void method692(byte arg0) {
        field1836++;
        while (true) {
            label289: do {
                while (class14.method159(2)) {
                    if (class18.field418 != -1 && class39.field897 == class18.field418) {
                        if (class125.field3051 == 85 && class43.field1008.method863(-128) > 0) {
                            class43.field1008 = class43.field1008.method860(0, false, class43.field1008.method863(-121) - 1);
                        }
                        continue label289;
                    }
                    if (class85.field1901) {
                        if (class125.field3051 == 85 && class43.field1004.method863(-128) > 0) {
                            class43.field1004 = class43.field1004.method860(0, false, class43.field1004.method863(-123) - 1);
                            class90.field2064 = true;
                        }
                        if (class10.method130(19193, class16.field326) && class43.field1004.method863(-126) < 80) {
                            class43.field1004 = class43.field1004.method857(class16.field326, 114);
                            class90.field2064 = true;
                        }
                        if (class125.field3051 == 84) {
                            class85.field1901 = false;
                            class90.field2064 = true;
                            if (class118.field2750 == 1) {
                                long var10 = class43.field1004.method828(455);
                                class126.method1016(var10, -21650);
                            }
                            if (class118.field2750 == 2 && field1817 > 0) {
                                long var12 = class43.field1004.method828(455);
                                class76.method647(var12, -114);
                            }
                            if (class118.field2750 == 3 && class43.field1004.method863(-124) > 0) {
                                class66.field1472.method781(75, (byte) -62);
                                class66.field1472.method102((byte) 123, 0);
                                class17.field352++;
                                int var14 = class66.field1472.field143;
                                class66.field1472.method64(class93.field2170, -67);
                                class78.method677((byte) 117, class43.field1004, class66.field1472);
                                class66.field1472.method107((byte) 7, class66.field1472.field143 - var14);
                                if (class134.field3270 == 2) {
                                    class92.field2125++;
                                    class134.field3270 = 1;
                                    class37.field868 = true;
                                    class66.field1472.method781(26, (byte) -41);
                                    class66.field1472.method102((byte) 123, class17.field370);
                                    class66.field1472.method102((byte) 123, class134.field3270);
                                    class66.field1472.method102((byte) 123, class55.field1106);
                                }
                            }
                            if (class118.field2750 == 4 && class17.field361 < 100) {
                                long var15 = class43.field1004.method828(455);
                                class58.method464(var15, -4878);
                            }
                            if (class118.field2750 == 5 && class17.field361 > 0) {
                                long var17 = class43.field1004.method828(455);
                                class126.method1015(var17, 113);
                            }
                        }
                    } else if (class98.field2257 == 1) {
                        if (class125.field3051 == 85 && class43.field1003.method863(-122) > 0) {
                            class43.field1003 = class43.field1003.method860(0, false, class43.field1003.method863(-122) - 1);
                            class90.field2064 = true;
                        }
                        if (class16.method173(-3, class16.field326) && class43.field1003.method863(-127) < 10) {
                            class43.field1003 = class43.field1003.method857(class16.field326, 121);
                            class90.field2064 = true;
                        }
                        if (class125.field3051 == 84) {
                            if (class43.field1003.method863(-128) > 0) {
                                class14.field269++;
                                int var9 = 0;
                                if (class43.field1003.method845((byte) 15)) {
                                    var9 = class43.field1003.method833((byte) -100);
                                }
                                class66.field1472.method781(255, (byte) -90);
                                class66.field1472.method100(var9, false);
                            }
                            class90.field2064 = true;
                            class98.field2257 = 0;
                        }
                    } else if (class98.field2257 == 2) {
                        if (class125.field3051 == 85 && class43.field1003.method863(-122) > 0) {
                            class43.field1003 = class43.field1003.method860(0, false, class43.field1003.method863(-125) - 1);
                            class90.field2064 = true;
                        }
                        if ((class29.method276(class16.field326, 30952) || class16.field326 == 32) && class43.field1003.method863(-124) < 12) {
                            class43.field1003 = class43.field1003.method857(class16.field326, 122);
                            class90.field2064 = true;
                        }
                        if (class125.field3051 == 84) {
                            if (class43.field1003.method863(-126) > 0) {
                                class66.field1472.method781(160, (byte) -110);
                                class43.field986++;
                                class66.field1472.method64(class43.field1003.method828(455), -32);
                            }
                            class98.field2257 = 0;
                            class90.field2064 = true;
                        }
                    } else if (class98.field2257 == 3) {
                        if (class125.field3051 == 85 && class43.field1003.method863(-125) > 0) {
                            class43.field1003 = class43.field1003.method860(0, false, class43.field1003.method863(-128) - 1);
                            class90.field2064 = true;
                        }
                        if (class10.method130(19193, class16.field326) && class43.field1003.method863(-122) < 40) {
                            class43.field1003 = class43.field1003.method857(class16.field326, 118);
                            class90.field2064 = true;
                        }
                    } else if (class1.field4 == -1 && class95.field2191 == -1) {
                        if (class125.field3051 == 85 && class43.field997.method863(-127) > 0) {
                            class43.field997 = class43.field997.method860(0, false, class43.field997.method863(-128) - 1);
                            class90.field2064 = true;
                        }
                        if (class10.method130(19193, class16.field326) && class43.field997.method863(-122) < 80) {
                            class43.field997 = class43.field997.method857(class16.field326, 119);
                            class90.field2064 = true;
                        }
                        if (class125.field3051 == 84 && class43.field997.method863(-125) > 0) {
                            if (class110.field2560 == 2) {
                                if (class43.field997.method829(true, class118.field2754)) {
                                    class110.method909(-23359);
                                }
                                if (class43.field997.method829(true, class88.field2001)) {
                                    class127.field3070 = true;
                                }
                                if (class43.field997.method829(true, class102.field2319)) {
                                    class127.field3070 = false;
                                }
                                if (class43.field997.method829(true, class80.field1806)) {
                                    for (int var1 = 0; var1 < 4; var1++) {
                                        for (int var2 = 1; var2 < 103; var2++) {
                                            for (int var3 = 1; var3 < 103; var3++) {
                                                class116.field2717[var1].field2548[var2][var3] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class43.field997.method829(true, class86.field1967) && class28.field625 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class43.field997.method829(true, class76.field1710)) {
                                    class15.field314 = true;
                                }
                            }
                            if (class43.field997.method848(class41.field925, 0)) {
                                class130.field3152++;
                                class66.field1472.method781(127, (byte) -113);
                                class66.field1472.method102((byte) 123, class43.field997.method863(-127) - 1);
                                class66.field1472.method94(false, class43.field997.method862(2, (byte) -113));
                            } else {
                                class105 var4 = class43.field997.method858((byte) -27);
                                byte var5 = 0;
                                if (var4.method848(class50.field1059, 0)) {
                                    class43.field997 = class43.field997.method862(class50.field1059.method863(-126), (byte) 73);
                                    var5 = 0;
                                } else if (var4.method848(class42.field968, 0)) {
                                    var5 = 1;
                                    class43.field997 = class43.field997.method862(class42.field968.method863(-123), (byte) 125);
                                } else if (var4.method848(class30.field673, 0)) {
                                    class43.field997 = class43.field997.method862(class30.field673.method863(-125), (byte) -58);
                                    var5 = 2;
                                } else if (var4.method848(class31.field724, 0)) {
                                    var5 = 3;
                                    class43.field997 = class43.field997.method862(class31.field724.method863(-128), (byte) 106);
                                } else if (var4.method848(class98.field2253, 0)) {
                                    var5 = 4;
                                    class43.field997 = class43.field997.method862(class98.field2253.method863(-125), (byte) 73);
                                } else if (var4.method848(class26.field595, 0)) {
                                    class43.field997 = class43.field997.method862(class26.field595.method863(-122), (byte) 126);
                                    var5 = 5;
                                } else if (var4.method848(class23.field566, 0)) {
                                    var5 = 6;
                                    class43.field997 = class43.field997.method862(class23.field566.method863(-122), (byte) -89);
                                } else if (var4.method848(class39.field894, 0)) {
                                    class43.field997 = class43.field997.method862(class39.field894.method863(-127), (byte) -79);
                                    var5 = 7;
                                } else if (var4.method848(class61.field1343, 0)) {
                                    var5 = 8;
                                    class43.field997 = class43.field997.method862(class61.field1343.method863(-124), (byte) -59);
                                } else if (var4.method848(class104.field2366, 0)) {
                                    class43.field997 = class43.field997.method862(class104.field2366.method863(-126), (byte) 122);
                                    var5 = 9;
                                } else if (var4.method848(class100.field2290, 0)) {
                                    var5 = 10;
                                    class43.field997 = class43.field997.method862(class100.field2290.method863(-123), (byte) -120);
                                } else if (var4.method848(class126.field3057, 0)) {
                                    class43.field997 = class43.field997.method862(class126.field3057.method863(-123), (byte) -101);
                                    var5 = 11;
                                }
                                byte var6 = 0;
                                class105 var7 = class43.field997.method858((byte) -27);
                                class43.field975++;
                                if (var7.method848(class100.field2286, 0)) {
                                    var6 = 1;
                                    class43.field997 = class43.field997.method862(class100.field2286.method863(-127), (byte) 50);
                                } else if (var7.method848(class111.field2564, 0)) {
                                    class43.field997 = class43.field997.method862(class111.field2564.method863(-123), (byte) 122);
                                    var6 = 2;
                                } else if (var7.method848(class31.field717, 0)) {
                                    var6 = 3;
                                    class43.field997 = class43.field997.method862(class31.field717.method863(-128), (byte) 88);
                                } else if (var7.method848(class28.field647, 0)) {
                                    var6 = 4;
                                    class43.field997 = class43.field997.method862(class28.field647.method863(-121), (byte) -113);
                                } else if (var7.method848(field1807, 0)) {
                                    class43.field997 = class43.field997.method862(field1807.method863(-128), (byte) -59);
                                    var6 = 5;
                                }
                                class66.field1472.method781(48, (byte) -44);
                                class66.field1472.method102((byte) 123, 0);
                                int var8 = class66.field1472.field143;
                                class66.field1472.method102((byte) 123, var5);
                                class66.field1472.method102((byte) 123, var6);
                                class78.method677((byte) 36, class43.field997, class66.field1472);
                                class66.field1472.method107((byte) 7, class66.field1472.field143 - var8);
                                if (class17.field370 == 2) {
                                    class92.field2125++;
                                    class17.field370 = 3;
                                    class37.field868 = true;
                                    class66.field1472.method781(26, (byte) -23);
                                    class66.field1472.method102((byte) 123, class17.field370);
                                    class66.field1472.method102((byte) 123, class134.field3270);
                                    class66.field1472.method102((byte) 123, class55.field1106);
                                }
                            }
                            class43.field997 = class43.field992;
                            class90.field2064 = true;
                        }
                    }
                }
                if (arg0 < 76) {
                    field1813 = -12;
                    return;
                }
                return;
            } while (!class29.method276(class16.field326, 30952) && class16.field326 != 32);
            if (class43.field1008.method863(-123) < 12) {
                class43.field1008 = class43.field1008.method857(class16.field326, 118);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Lvd;", line = 554)
    public static final class130 method693(int arg0, int arg1) {
        class130 var2 = (class130) class60.field1340.method601((long) arg0, (byte) 118);
        field1814++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class126.field3066.method766(0, (byte) -45, arg0);
        class130 var4 = new class130();
        class7 var5 = new class7(var3);
        var5.field143 = var5.field117.length - 12;
        if (arg1 != 5) {
            method695(11, (byte) -14);
        }
        int var6 = var5.method104(-1699);
        var4.field3148 = var5.method101(2);
        int var7 = 0;
        var4.field3149 = var5.method101(2);
        var4.field3170 = var5.method101(arg1 ^ 0x7);
        var4.field3167 = var5.method101(2);
        var4.field3159 = new int[var6];
        var4.field3155 = new int[var6];
        var5.field143 = 0;
        var4.field3166 = new class105[var6];
        while (var5.field117.length - 12 > var5.field143) {
            int var8 = var5.method101(2);
            if (var8 == 3) {
                var4.field3166[var7] = var5.method62((byte) 55);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field3155[var7] = var5.method96(arg1 + 27018);
            } else {
                var4.field3155[var7] = var5.method104(-1699);
            }
            var4.field3159[var7++] = var8;
        }
        class60.field1340.method608((long) arg0, var4, (byte) 122);
        return var4;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V", line = 626)
    public static void method694(int arg0) {
        field1807 = null;
        field1838 = null;
        field1825 = null;
        field1843 = null;
        field1816 = null;
        field1815 = null;
        field1844 = null;
        field1830 = null;
        field1827 = null;
        field1833 = null;
        field1819 = null;
        field1832 = null;
        if (arg0 != 84) {
            field1816 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)V", line = 648)
    public static final void method695(int arg0, byte arg1) {
        field1839++;
        if (class74.field1634 == null) {
            return;
        }
        int var2 = -70 % ((-arg1 - 42) / 63);
        if (class67.field1518 != 0) {
            if (class112.field2619 == null) {
                return;
            }
            class18.field416 = arg0;
        } else if (class64.field1431 >= 0) {
            class64.field1431 = arg0;
            class74.field1634.method734(arg0, true, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLeb;II)V", line = 685)
    public static final void method696(boolean arg0, class27 arg1, int arg2, int arg3) {
        field1810++;
        if (!arg0) {
            return;
        }
        int var4 = arg2 * arg2 + arg3 * arg3;
        if (var4 <= 4225 || var4 >= 90000) {
            class65.method550(121, arg2, arg3, arg1);
            return;
        }
        int var5 = client.field432 + class12.field249 & 0x7FF;
        int var6 = class56.field1151[var5];
        int var7 = var6 * 256 / (class35.field807 + 256);
        int var8 = class56.field1159[var5];
        int var9 = var8 * 256 / (class35.field807 + 256);
        int var10 = arg2 * var7 + arg3 * var9 >> 16;
        int var11 = arg2 * var9 - arg3 * var7 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        class57.field1187.method263(var14 + 94 - 6, -var15 + 63, 20, 20, 15, 15, var12, 256);
    }
}
