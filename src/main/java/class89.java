import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class89 extends class127 {

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "Lfb;")
    private class33 field2031;

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "Lle;")
    public static class71 field2044 = new class71(64);

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "Lrc;")
    public static class105 field2047 = class43.method374("backvmid1", 0);

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "J")
    public static long field2046 = 0L;

    @OriginalMember(owner = "client!oe", name = "lb", descriptor = "I")
    public static int field2055 = 0;

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
    public static int field2049 = -1;

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "Lrc;")
    private static class105 field2048 = class43.method374("Your profile will be transferred in:", 0);

    @OriginalMember(owner = "client!oe", name = "kb", descriptor = "Lrc;")
    public static class105 field2054 = field2048;

    @OriginalMember(owner = "client!oe", name = "jb", descriptor = "[Z")
    public static boolean[] field2053 = new boolean[5];

    @OriginalMember(owner = "client!oe", name = "mb", descriptor = "I")
    public static int field2056 = 1;

    @OriginalMember(owner = "client!oe", name = "ib", descriptor = "Lrc;")
    public static class105 field2052 = class43.method374(" ", 0);

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
    private int field2038;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!oe", name = "hb", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "Lgd;")
    private class40 field2042;

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "Lme;")
    public static class77 field2045;

    @OriginalMember(owner = "client!oe", name = "gb", descriptor = "Lpb;")
    public static class92 field2050;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "Z")
    private boolean field2032;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "Z")
    private boolean field2033;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "[B")
    private byte[] field2037;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V", line = 14)
    public static final void method729(byte arg0) {
        class121.field2963 = new int[104];
        class18.field410 = new byte[4][104][104];
        class45.field1017 = new int[104];
        class39.field903 = new int[105][105];
        if (arg0 != -123) {
            method729((byte) 115);
        }
        class132.field3206 = 99;
        class132.field3195 = new int[104];
        class71.field1553 = new byte[4][104][104];
        class14.field285 = new int[104];
        class127.field3100 = new byte[4][105][105];
        class26.field596 = new byte[4][104][104];
        class26.field602 = new byte[4][104][104];
        class66.field1495 = new int[104];
        client.field425 = new int[4][105][105];
        field2028++;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V", line = 48)
    public static void method730(byte arg0) {
        field2054 = null;
        field2044 = null;
        field2050 = null;
        field2048 = null;
        field2052 = null;
        field2045 = null;
        field2053 = null;
        if (arg0 == 78) {
            field2047 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V", line = 67)
    public final void method731(int arg0) {
        field2027++;
        if (arg0 > -122) {
            this.method734(-123, true, -9);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V", line = 77)
    public final void method732(boolean arg0) {
        field2034++;
        if (arg0) {
            method739((byte) -91);
        }
        if (this.field2042 == null || this.field2042.field916 == 0) {
            return;
        }
        if (this.field2042.field916 == 1) {
            class52 var2 = (class52) this.field2042.field918;
            try {
                var2.method407(this.field2037, 0, -115, this.field2037.length);
                var2.method406((byte) 26);
                try {
                    class63.method544(this.field2031.field767, 124, "midibox.loop=" + (this.field2033 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method405((byte) 21).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field2038 + ";");
                    this.field2032 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method406((byte) 26);
                } catch (Exception var3) {
                }
            }
        }
        this.field2042 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([BZII)V", line = 119)
    public final void method733(byte[] arg0, boolean arg1, int arg2, int arg3) {
        field2029++;
        this.field2042 = this.field2031.method310(true);
        if (this.field2042 == null) {
            return;
        }
        if (arg2 == 0) {
            arg2 = 1;
        }
        this.field2038 = class113.method929((byte) 126, arg2);
        this.field2033 = arg1;
        int var5 = 79 / ((arg3 + 24) / 50);
        this.field2037 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZI)V", line = 138)
    public final void method734(int arg0, boolean arg1, int arg2) {
        field2030++;
        if (arg0 == 0) {
            arg0 = 1;
        }
        int var4 = class113.method929((byte) 120, arg0) - arg2;
        if (this.field2042 != null) {
            this.field2038 = var4;
        } else if (this.field2032) {
            try {
                class63.method544(this.field2031.field767, 103, "midibox.volume=" + var4 + ";");
            } catch (Throwable var5) {
            }
        }
        if (!arg1) {
            method737(72, (byte) 17);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)V", line = 164)
    public final void method735(int arg0, boolean arg1) {
        if (arg1) {
            field2044 = null;
        }
        field2036++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZILfb;)Z", line = 174)
    public static final boolean method736(int arg0, boolean arg1, int arg2, class33 arg3) {
        if (arg2 != 27885) {
            method737(-71, (byte) -26);
        }
        field2040++;
        if (class95.method787(arg1, arg3, 8)) {
            if (arg0 > 0) {
                class132.field3184 = new class71(arg0);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)Lrc;", line = 201)
    public static final class105 method737(int arg0, byte arg1) {
        field2035++;
        class105 var2 = class75.method637(arg0, 8241);
        for (int var3 = var2.method863(-123) - 3; var3 > 0; var3 -= 3) {
            var2 = class108.method878(new class105[] { var2.method860(0, false, var3), class34.field794, var2.method862(var3, (byte) 71) }, 2867);
        }
        if (arg1 >= -14) {
            method739((byte) -91);
        }
        if (var2.method863(-124) > 8) {
            var2 = class108.method878(new class105[] { class58.field1243, var2.method860(0, false, var2.method863(-123) - 8), class102.field2325, class59.field1307, var2, class15.field312 }, 2867);
        } else if (var2.method863(-127) > 4) {
            var2 = class108.method878(new class105[] { class75.field1678, var2.method860(0, false, var2.method863(-122) - 4), class134.field3243, class59.field1307, var2, class15.field312 }, 2867);
        }
        return class108.method878(new class105[] { field2052, var2 }, 2867);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V", line = 231)
    public final void method738(byte arg0) {
        if (this.field2032) {
            try {
                class63.method544(this.field2031.field767, -20, "midibox.src=\"c:/silence.mid\";");
            } catch (Throwable var2) {
            }
            this.field2032 = false;
        }
        this.field2042 = null;
        field2043++;
        if (arg0 < 90) {
            field2048 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lfb;)V", line = 254)
    public class89(class33 arg0) {
        this.field2031 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(B)V", line = 268)
    public static final void method739(byte arg0) {
        field2039++;
        if (class75.field1674 != 0) {
            return;
        }
        class95.field2197[0] = class43.field1006;
        class15.field298[0] = 1005;
        if (arg0 >= -34) {
            field2054 = null;
        }
        class113.field2652 = 1;
        if (class95.field2191 != -1) {
            class24.field587 = -1;
            class16.field341 = -1;
            class126.method1017(class35.field816, 765, 9111, class95.field2191, 0, 0, 503, class75.field1664, 0);
            class123.field3029 = class16.field341;
            class120.field2889 = class24.field587;
            return;
        }
        class73.method617((byte) 102);
        class24.field587 = -1;
        class16.field341 = -1;
        if (class75.field1664 > 4 && class35.field816 > 4 && class75.field1664 < 516 && class35.field816 < 338) {
            if (class18.field418 == -1) {
                class104.method824((byte) 32);
            } else {
                class126.method1017(class35.field816, 516, 9111, class18.field418, 0, 4, 338, class75.field1664, 4);
            }
        }
        class123.field3029 = class16.field341;
        class16.field341 = -1;
        boolean var1 = false;
        class120.field2889 = class24.field587;
        class24.field587 = -1;
        if (class75.field1664 > 553 && class35.field816 > 205 && class75.field1664 < 743 && class35.field816 < 466) {
            if (client.field424 != -1) {
                class126.method1017(class35.field816, 743, 9111, client.field424, 1, 553, 466, class75.field1664, 205);
            } else if (class120.field2901[class134.field3265] != -1) {
                class126.method1017(class35.field816, 743, 9111, class120.field2901[class134.field3265], 1, 553, 466, class75.field1664, 205);
            }
        }
        if (class24.field587 != class18.field407) {
            class18.field407 = class24.field587;
            class80.field1805 = true;
        }
        class24.field587 = -1;
        if (class42.field949 != class16.field341) {
            class80.field1805 = true;
            class42.field949 = class16.field341;
        }
        class16.field341 = -1;
        if (class75.field1664 > 17 && class35.field816 > 357 && class75.field1664 < 496 && class35.field816 < 453) {
            if (class1.field4 != -1) {
                class126.method1017(class35.field816, 496, 9111, class1.field4, 2, 17, 453, class75.field1664, 357);
            } else if (class51.field1069 != -1) {
                class126.method1017(class35.field816, 496, 9111, class51.field1069, 3, 17, 453, class75.field1664, 357);
            } else if (class35.field816 < 434 && class75.field1664 < 426) {
                class60.method483(class75.field1664 - 17, class35.field816 + -357, 0);
            }
        }
        if ((class1.field4 != -1 || class51.field1069 != -1) && class37.field862 != class24.field587) {
            class90.field2064 = true;
            class37.field862 = class24.field587;
        }
        if ((class1.field4 != -1 || class51.field1069 != -1) && class76.field1692 != class16.field341) {
            class76.field1692 = class16.field341;
            class90.field2064 = true;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class113.field2652 - 1; var2++) {
                if (class15.field298[var2] < 1000 && class15.field298[var2 + 1] > 1000) {
                    var1 = false;
                    class105 var3 = class95.field2197[var2];
                    class95.field2197[var2] = class95.field2197[var2 + 1];
                    class95.field2197[var2 + 1] = var3;
                    int var4 = class15.field298[var2];
                    class15.field298[var2] = class15.field298[var2 + 1];
                    class15.field298[var2 + 1] = var4;
                    int var5 = class128.field3104[var2];
                    class128.field3104[var2] = class128.field3104[var2 + 1];
                    class128.field3104[var2 + 1] = var5;
                    int var6 = class96.field2225[var2];
                    class96.field2225[var2] = class96.field2225[var2 + 1];
                    class96.field2225[var2 + 1] = var6;
                    int var7 = class67.field1521[var2];
                    class67.field1521[var2] = class67.field1521[var2 + 1];
                    class67.field1521[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZLmd;BIIZI)V", line = 412)
    public static final void method740(boolean arg0, class76 arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2041++;
        long var7 = (long) ((arg6 << 16) + arg3);
        class108 var9 = (class108) class26.field594.method624((byte) 99, var7);
        if (var9 != null || arg5) {
            return;
        }
        class108 var10 = (class108) class43.field979.method624((byte) 95, var7);
        if (var10 != null) {
            return;
        }
        class108 var11 = (class108) class97.field2232.method624((byte) 127, var7);
        if (var11 == null) {
            if (!arg0) {
                class108 var12 = (class108) class107.field2453.method624((byte) 81, var7);
                if (var12 != null) {
                    return;
                }
            }
            class108 var13 = new class108();
            var13.field2475 = arg4;
            var13.field2483 = arg2;
            var13.field2470 = arg1;
            if (arg0) {
                class26.field594.method625((byte) 57, var13, var7);
                class110.field2526++;
            } else {
                class74.field1635.method182((byte) 92, var13);
                class97.field2232.method625((byte) -128, var13, var7);
                class12.field240++;
            }
        } else if (arg0) {
            var11.method874(true);
            class26.field594.method625((byte) -124, var11, var7);
            class110.field2526++;
            class12.field240--;
        }
    }
}
