import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 {

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Lgb;")
    private class45 field1674 = new class45();

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Ll;")
    private class76 field1680 = new class76();

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    private int field1678;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    private int field1679;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Lta;")
    private class131 field1681;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Ljb;")
    public static class64 field1675 = new class64(260);

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field1685 = 0;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Lkd;")
    public static class73 field1683 = class126.method1070((byte) -66, "blinken2:");

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Lkd;")
    public static class73 field1682 = class126.method1070((byte) -66, "Null");

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field1691 = 0;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "Lkd;")
    public static class73 field1688 = class126.method1070((byte) -66, ")4l");

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Lkd;")
    private static class73 field1686 = class126.method1070((byte) -66, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "Lkd;")
    public static class73 field1690 = class126.method1070((byte) -66, ")2");

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "Lkd;")
    public static class73 field1684 = field1686;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "Lkd;")
    public static class73 field1689 = class126.method1070((byte) -66, ": ");

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "Lkd;")
    public static class73 field1692 = class126.method1070((byte) -66, "(U5");

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static final void method532(int arg0) {
        if (arg0 != 25330) {
            return;
        }
        field1665++;
        if (class52.field1387 != 0 && class52.field1387 != 3 || class105.field2615 != 1) {
            return;
        }
        int var1 = class103.field2570 - 25 - 550;
        int var2 = class42.field1134 - 4 - 5;
        if (var1 < 0 || var2 < 0 || var1 >= 146 || var2 >= 151) {
            return;
        }
        var2 -= 75;
        var1 -= 73;
        int var3 = class55.field1490 + class84.field2123 & 0x7FF;
        int var4 = class29.field833[var3];
        int var5 = class29.field848[var3];
        int var6 = (class43.field1156 + 256) * var4 >> 8;
        int var7 = (class43.field1156 + 256) * var5 >> 8;
        int var8 = var2 * var7 - var1 * var6 >> 11;
        int var9 = var1 * var7 + var2 * var6 >> 11;
        int var10 = class73.field1901.field2277 + var9 >> 7;
        int var11 = class73.field1901.field2264 - var8 >> 7;
        boolean var12 = class49.method394(class73.field1901.field2304[0], 0, 0, 0, class73.field1901.field2280[0], -1, 1, var10, var11, 0, 0, true);
        if (!var12) {
            return;
        }
        class121.field3079.method956((byte) 10, var1);
        class121.field3079.method956((byte) 10, var2);
        class121.field3079.method947(class55.field1490, arg0 - 1669);
        class121.field3079.method956((byte) 10, 57);
        class121.field3079.method956((byte) 10, class84.field2123);
        class121.field3079.method956((byte) 10, class43.field1156);
        class121.field3079.method956((byte) 10, 89);
        class121.field3079.method947(class73.field1901.field2277, 23661);
        class121.field3079.method947(class73.field1901.field2264, 23661);
        class121.field3079.method956((byte) 10, class150.field3710);
        class121.field3079.method956((byte) 10, 63);
        return;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(La;I)V")
    public static final void method533(class1 arg0, int arg1) {
        field1670++;
        int var2 = arg0.field84;
        if (arg1 != 150) {
            return;
        }
        if (var2 >= 1 && var2 <= 100 || !(var2 < 701 || var2 > 800)) {
            if (class132.field3303 == 0) {
                if (var2 == 1) {
                    arg0.field30 = 0;
                    arg0.field29 = class119.field3048;
                    return;
                }
                if (var2 == 2) {
                    arg0.field29 = class71.field1788;
                    arg0.field30 = 0;
                    return;
                }
            }
            if (class132.field3303 == 1) {
                if (var2 == 1) {
                    arg0.field29 = class20.field567;
                    arg0.field30 = 0;
                    return;
                }
                if (var2 == 2) {
                    arg0.field29 = class71.field1792;
                    arg0.field30 = 0;
                    return;
                }
                if (var2 == 3) {
                    arg0.field30 = 0;
                    arg0.field29 = class11.field369;
                    return;
                }
            }
            if (var2 <= 700) {
                var2--;
            } else {
                var2 -= 601;
            }
            int var3 = class14.field431;
            if (class132.field3303 != 2) {
                var3 = 0;
            }
            if (var2 >= var3) {
                arg0.field30 = 0;
                arg0.field29 = class9.field298;
            } else {
                arg0.field29 = class137.field3424[var2];
                arg0.field30 = 1;
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 > 800) {
                var2 -= 701;
            } else {
                var2 -= 101;
            }
            int var4 = class14.field431;
            if (class132.field3303 != 2) {
                var4 = 0;
            }
            if (var2 >= var4) {
                arg0.field29 = class9.field298;
                arg0.field30 = 0;
            } else {
                if (class16.field497[var2] == 0) {
                    arg0.field29 = class32.method258(-90, new class73[] { class123.field3137, class112.field2796 });
                } else if (class16.field497[var2] < 5000) {
                    if (class16.field497[var2] == class115.field2906) {
                        arg0.field29 = class32.method258(arg1 - 222, new class73[] { class84.field2126, class102.field2555, class78.method676(class16.field497[var2], -119) });
                    } else {
                        arg0.field29 = class32.method258(-71, new class73[] { class5.field189, class102.field2555, class78.method676(class16.field497[var2], -47) });
                    }
                } else if (class16.field497[var2] == class115.field2906) {
                    arg0.field29 = class32.method258(-62, new class73[] { class84.field2126, class137.field3412, class78.method676(class16.field497[var2] - 5000, arg1 + -239) });
                } else {
                    arg0.field29 = class32.method258(-125, new class73[] { class5.field189, class137.field3412, class78.method676(class16.field497[var2] - 5000, -73) });
                }
                arg0.field30 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class14.field431;
            if (class132.field3303 != 2) {
                var5 = 0;
            }
            arg0.field93 = var5 * 15 + 20;
            if (arg0.field63 >= arg0.field93) {
                arg0.field93 = arg0.field63 + 1;
            }
        } else if (var2 >= 401 && var2 <= 500) {
            var2 -= 401;
            if (var2 == 0 && class132.field3303 == 0) {
                arg0.field30 = 0;
                arg0.field29 = class37.field1023;
            } else if (var2 == 1 && class132.field3303 == 0) {
                arg0.field29 = class71.field1788;
                arg0.field30 = 0;
            } else {
                int var6 = class126.field3231;
                if (class132.field3303 == 0) {
                    var6 = 0;
                }
                if (var6 <= var2) {
                    arg0.field29 = class9.field298;
                    arg0.field30 = 0;
                } else {
                    arg0.field29 = class84.method708(class102.field2558[var2], 126).method610(127);
                    arg0.field30 = 1;
                }
            }
        } else if (var2 == 503) {
            arg0.field93 = class126.field3231 * 15 + 20;
            if (arg0.field93 <= arg0.field63) {
                arg0.field93 = arg0.field63 + 1;
            }
        } else if (var2 == 324) {
            if (class24.field691 == -1) {
                class24.field691 = arg0.field44;
                class110.field2705 = arg0.field20;
            }
            if (class131.field3294.field1438) {
                arg0.field44 = class24.field691;
            } else {
                arg0.field44 = class110.field2705;
            }
        } else if (var2 == 325) {
            if (class24.field691 == -1) {
                class110.field2705 = arg0.field20;
                class24.field691 = arg0.field44;
            }
            if (class131.field3294.field1438) {
                arg0.field44 = class110.field2705;
            } else {
                arg0.field44 = class24.field691;
            }
        } else if (var2 == 327) {
            arg0.field19 = 150;
            arg0.field78 = (int) (Math.sin((double) class49.field1308 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field95 = 5;
            arg0.field39 = 0;
        } else if (var2 == 328) {
            arg0.field19 = 150;
            arg0.field78 = (int) (Math.sin((double) class49.field1308 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field95 = 5;
            arg0.field39 = 1;
        } else if (var2 == 600) {
            arg0.field29 = class32.method258(-93, new class73[] { class9.field312, class76.field1949 });
        } else if (var2 == 620) {
            if (field1691 < 1) {
                arg0.field29 = class9.field298;
            } else if (class50.field1316) {
                arg0.field29 = class1.field11;
                arg0.field111 = 16711680;
            } else {
                arg0.field111 = 16777215;
                arg0.field29 = class72.field1820;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public final void method534(byte arg0) {
        while (true) {
            class45 var2 = this.field1680.method661(-122);
            if (var2 == null) {
                int var3 = -97 / ((arg0 + 38) / 34);
                field1664++;
                this.field1679 = this.field1678;
                return;
            }
            var2.method1147((byte) -35);
            var2.method339(96);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
    public static void method535(byte arg0) {
        field1682 = null;
        field1690 = null;
        field1692 = null;
        field1675 = null;
        if (arg0 != -17) {
            method541(-92, 85, -51, null, -80, (byte) 28, true);
        }
        field1686 = null;
        field1689 = null;
        field1684 = null;
        field1683 = null;
        field1688 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;)I")
    public static final int method536(boolean arg0, KeyEvent arg1) {
        field1668++;
        int var2 = arg1.getKeyChar();
        if (!arg0) {
            field1685 = 41;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(JI)V")
    public final void method537(long arg0, int arg1) {
        field1673++;
        class45 var4 = (class45) this.field1681.method1099(108, arg0);
        if (var4 != null) {
            var4.method1147((byte) -89);
            var4.method339(110);
            this.field1679++;
        }
        if (arg1 < 82) {
            field1684 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IJ)Lgb;")
    public final class45 method538(int arg0, long arg1) {
        field1667++;
        class45 var4 = (class45) this.field1681.method1099(25, arg1);
        if (arg0 == 0) {
            if (var4 != null) {
                this.field1680.method659(var4, 4);
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1666++;
        int var8 = 54 / ((arg3 + 63) / 51);
        if (arg6 < 1 || arg2 < 1 || arg6 > 102 || arg2 > 102) {
            return;
        }
        if (class77.field1971 && class11.field320 != arg4) {
            return;
        }
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        int var12 = 0;
        if (arg0 == 0) {
            var12 = class34.field923.method81(arg4, arg6, arg2);
        }
        if (arg0 == 1) {
            var12 = class34.field923.method82(arg4, arg6, arg2);
        }
        if (arg0 == 2) {
            var12 = class34.field923.method63(arg4, arg6, arg2);
        }
        if (arg0 == 3) {
            var12 = class34.field923.method42(arg4, arg6, arg2);
        }
        if (var12 != 0) {
            int var13 = class34.field923.method62(arg4, arg6, arg2, var12);
            int var14 = var13 & 0x1F;
            int var15 = var12 >> 14 & 0x7FFF;
            int var16 = var13 >> 6 & 0x3;
            if (arg0 == 0) {
                class34.field923.method44(arg4, arg6, arg2);
                class149 var17 = class122.method1045(31, var15);
                if (var17.field3648 != 0) {
                    class70.field1780[arg4].method365(var17.field3646, var16, arg2, arg6, -1, var14);
                }
            }
            if (arg0 == 1) {
                class34.field923.method35(arg4, arg6, arg2);
            }
            if (arg0 == 2) {
                class34.field923.method65(arg4, arg6, arg2);
                class149 var18 = class122.method1045(31, var15);
                if (arg6 + var18.field3660 > 103 || arg2 + var18.field3660 > 103 || var18.field3643 + arg6 > 103 || arg2 + var18.field3643 > 103) {
                    return;
                }
                if (var18.field3648 != 0) {
                    class70.field1780[arg4].method380(arg6, var18.field3643, var16, arg2, -1, var18.field3660, var18.field3646);
                }
            }
            if (arg0 == 3) {
                class34.field923.method67(arg4, arg6, arg2);
                class149 var19 = class122.method1045(31, var15);
                if (var19.field3648 == 1) {
                    class70.field1780[arg4].method376(arg6, 62, arg2);
                }
            }
        }
        if (arg1 < 0) {
            return;
        }
        int var20 = arg4;
        if (arg4 < 3 && (class55.field1482[1][arg6][arg2] & 0x2) == 2) {
            var20 = arg4 + 1;
        }
        class131.method1100((byte) -81, var20, arg2, class34.field923, arg4, arg7, class70.field1780[arg4], arg1, arg6, arg5);
        return;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lq;BLq;)V")
    public static final void method540(class111 arg0, byte arg1, class111 arg2) {
        class11.field334 = arg0;
        if (arg1 == -107) {
            field1671++;
            class57.field1514 = arg2;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILua;IBZ)V")
    public static final void method541(int arg0, int arg1, int arg2, class137 arg3, int arg4, byte arg5, boolean arg6) {
        field1676++;
        long var7 = (long) ((arg2 << 16) + arg0);
        class122 var9 = (class122) class79.field2006.method1099(91, var7);
        if (var9 != null) {
            return;
        }
        class122 var10 = (class122) class38.field1040.method1099(122, var7);
        if (var10 != null) {
            return;
        }
        class122 var11 = (class122) class115.field2894.method1099(32, var7);
        if (var11 == null) {
            if (!arg6) {
                class122 var12 = (class122) class74.field1911.method1099(arg1 + 21, var7);
                if (var12 != null) {
                    return;
                }
            }
            class122 var13 = new class122();
            if (arg1 != 1) {
                method532(-19);
            }
            var13.field3116 = arg4;
            var13.field3115 = arg3;
            var13.field3127 = arg5;
            if (arg6) {
                class79.field2006.method1093((byte) -93, var13, var7);
                class57.field1512++;
            } else {
                class80.field2017.method659(var13, arg1 + 3);
                class115.field2894.method1093((byte) 31, var13, var7);
                class102.field2529++;
            }
        } else if (arg6) {
            var11.method339(88);
            class79.field2006.method1093((byte) -59, var11, var7);
            class102.field2529--;
            class57.field1512++;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(I)V")
    public class64(int arg0) {
        this.field1678 = arg0;
        this.field1679 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1681 = new class131(var2);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lgb;IJ)V")
    public final void method542(class45 arg0, int arg1, long arg2) {
        if (arg1 != -901) {
            field1686 = null;
        }
        field1669++;
        if (this.field1679 == 0) {
            class45 var5 = this.field1680.method661(-95);
            var5.method1147((byte) -117);
            var5.method339(102);
            if (this.field1674 == var5) {
                class45 var6 = this.field1680.method661(120);
                var6.method1147((byte) -61);
                var6.method339(126);
            }
        } else {
            this.field1679--;
        }
        this.field1681.method1093((byte) -115, arg0, arg2);
        this.field1680.method659(arg0, 4);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lq;ILq;)V")
    public static final void method543(class111 arg0, int arg1, class111 arg2) {
        class140.field3487 = arg2;
        field1672++;
        class36.field1005 = arg0;
        class72.field1822 = class140.field3487.method889(-1, 3);
        int var3 = 74 / ((54 - arg1) / 43);
    }
}
