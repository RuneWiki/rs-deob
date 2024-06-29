import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class246 {

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    private int field3921 = 0;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public int field3909;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "[Lhl;")
    public class71[] field3907;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3899 = "flash1:";

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3904 = -1;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Ltl;")
    public static class222 field3900 = new class222(30);

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3919 = "glow1:";

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "[C")
    public static char[] field3917 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "J")
    private long field3903;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "Lhl;")
    private class71 field3915;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "Lhl;")
    private class71 field3920;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3908;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 6)
    public static void method1742(int arg0) {
        field3900 = null;
        field3917 = null;
        field3919 = null;
        if (arg0 != 0) {
            method1753(52, (class132) null);
        }
        field3899 = null;
        field3908 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(JB)Lhl;", line = 21)
    public final class71 method1743(long arg0, byte arg1) {
        this.field3903 = arg0;
        class71 var4 = this.field3907[(int) (arg0 & (long) (this.field3909 - 1))];
        this.field3915 = var4.field921;
        field3901++;
        while (this.field3915 != var4) {
            if (this.field3915.field916 == arg0) {
                class71 var5 = this.field3915;
                this.field3915 = this.field3915.field921;
                return var5;
            }
            this.field3915 = this.field3915.field921;
        }
        int var6 = 23 / ((arg1 - 56) / 39);
        this.field3915 = null;
        return null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)I", line = 50)
    public final int method1744(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3909; var3++) {
            class71 var4 = this.field3907[var3];
            for (class71 var5 = var4.field921; var5 != var4; var5 = var5.field921) {
                var2++;
            }
        }
        field3906++;
        if (arg0 < 71) {
            return -119;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V", line = 80)
    public final void method1745(int arg0) {
        if (arg0 >= -58) {
            this.method1746((byte) -109);
        }
        for (int var2 = 0; var2 < this.field3909; var2++) {
            class71 var3 = this.field3907[var2];
            while (true) {
                class71 var4 = var3.field921;
                if (var3 == var4) {
                    break;
                }
                var4.method465((byte) -122);
            }
        }
        this.field3920 = null;
        field3911++;
        this.field3915 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)Lhl;", line = 113)
    public final class71 method1746(byte arg0) {
        if (arg0 == -33) {
            this.field3921 = 0;
            field3902++;
            return this.method1749((byte) 99);
        } else {
            return (class71) null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)Lhl;", line = 126)
    public final class71 method1747(int arg0) {
        field3914++;
        if (this.field3915 == null) {
            return null;
        }
        if (arg0 != -11383) {
            method1751(-123);
        }
        class71 var2 = this.field3907[(int) ((long) (this.field3909 - 1) & this.field3903)];
        while (this.field3915 != var2) {
            if (this.field3915.field916 == this.field3903) {
                class71 var3 = this.field3915;
                this.field3915 = this.field3915.field921;
                return var3;
            }
            this.field3915 = this.field3915.field921;
        }
        this.field3915 = null;
        return null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)I", line = 164)
    public final int method1748(byte arg0) {
        field3918++;
        if (arg0 != 22) {
            method1742(-74);
        }
        return this.field3909;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)Lhl;", line = 184)
    public final class71 method1749(byte arg0) {
        field3916++;
        int var2 = 122 % ((22 - arg0) / 36);
        if (this.field3921 > 0 && this.field3907[this.field3921 - 1] != this.field3920) {
            class71 var3 = this.field3920;
            this.field3920 = var3.field921;
            return var3;
        }
        class71 var4;
        do {
            if (this.field3909 <= this.field3921) {
                return null;
            }
            var4 = this.field3907[this.field3921++].field921;
        } while (this.field3907[this.field3921 - 1] == var4);
        this.field3920 = var4.field921;
        return var4;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lhl;BJ)V", line = 231)
    public final void method1750(class71 arg0, byte arg1, long arg2) {
        field3913++;
        if (arg0.field908 != null) {
            arg0.method465((byte) -122);
        }
        if (arg1 < 118) {
            this.field3920 = (class71) null;
        }
        class71 var5 = this.field3907[(int) ((long) (this.field3909 - 1) & arg2)];
        arg0.field921 = var5;
        arg0.field916 = arg2;
        arg0.field908 = var5.field908;
        arg0.field908.field921 = arg0;
        arg0.field921.field908 = arg0;
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V", line = 255)
    public static final void method1751(int arg0) {
        class125.method867();
        if (arg0 > -67) {
            field3908 = (String) null;
        }
        class271.field4304 = null;
        field3912++;
        class149.field2288 = -1;
        class204.method1501(0);
        class156.field2389.method765(false);
        class338.field5241 = new class266();
        ((class270) class25.field365).method1926(-105);
        class268.method1916();
        class47.field633 = new class272[255];
        class47.field646 = 0;
        class75.method511();
        class32.method212();
        class21.method140(8);
        class116.method808(false, 4);
        class5.method23(true);
        class193.method1411((byte) -74);
        for (int var1 = 0; var1 < 2048; var1++) {
            class320 var2 = class100.field1523[var1];
            if (var2 != null) {
                var2.field1986 = null;
            }
        }
        if (class186.field2991) {
            class32.method211(104, 104);
            class37.method237(class263.field4174, (byte) -103);
            class167.method1150();
        }
        class263.method1878(class121.field1841, class149.field2248, (byte) -126);
        class114.method787(class149.field2248, true);
        class253.field4006 = null;
        class55.field726 = null;
        class151.field2318 = null;
        class281.field4419 = null;
        class314.field4897 = null;
        if (class144.field2159 == 5) {
            class326.method2263(class149.field2248, -119);
        }
        if (class144.field2159 == 10) {
            class224.method1635(Integer.MAX_VALUE, false);
        }
        if (class144.field2159 == 30) {
            class173.method1180(25, 65280);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([Lhl;I)I", line = 319)
    public final int method1752(class71[] arg0, int arg1) {
        field3905++;
        int var3 = 0;
        int var4 = 0;
        if (arg1 > -8) {
            this.method1746((byte) 108);
        }
        while (this.field3909 > var4) {
            class71 var5 = this.field3907[var4];
            for (class71 var6 = var5.field921; var6 != var5; var6 = var6.field921) {
                arg0[var3++] = var6;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILlg;)V", line = 350)
    public static final void method1753(int arg0, class132 arg1) {
        arg1.field1965 = false;
        if (arg1.field1994 != -1) {
            class80 var2 = class37.method236(arg1.field1994, arg0 ^ 0xFFFFBC2F);
            if (var2 == null || var2.field1209 == null) {
                arg1.field1994 = -1;
            } else {
                arg1.field1996++;
                if (arg1.field1987 < var2.field1209.length && var2.field1223[arg1.field1987] < arg1.field1996) {
                    arg1.field1996 = 1;
                    arg1.field1987++;
                    arg1.field2031++;
                    class253.method1789(arg0 + 22359, arg1.field1944, var2, arg1.field1987, arg1.field1980, class13.field159 == arg1);
                }
                if (arg1.field1987 >= var2.field1209.length) {
                    arg1.field1996 = 0;
                    arg1.field1987 = 0;
                    class253.method1789(arg0 ^ 0xFFFFB9B9, arg1.field1944, var2, arg1.field1987, arg1.field1980, class13.field159 == arg1);
                }
                arg1.field2031 = arg1.field1987 + 1;
                if (var2.field1209.length <= arg1.field2031) {
                    arg1.field2031 = 0;
                }
            }
        }
        field3910++;
        if (arg1.field2022 != -1 && class48.field648 >= arg1.field1945) {
            class20 var3 = class264.method1881((byte) 108, arg1.field2022);
            int var4 = var3.field302;
            if (var4 == -1) {
                arg1.field2022 = -1;
            } else {
                label312: {
                    class80 var5 = class37.method236(var4, 20254);
                    if (var3.field299) {
                        if (var5.field1200 == 3) {
                            if (arg1.field2001 > 0 && arg1.field1978 <= class48.field648 && class48.field648 > arg1.field1975) {
                                arg1.field2022 = -1;
                                break label312;
                            }
                        } else if (var5.field1200 == 1 && arg1.field2001 > 0 && class48.field648 >= arg1.field1978 && class48.field648 > arg1.field1975) {
                            arg1.field1945 = class48.field648 + 1;
                            break label312;
                        }
                    }
                    if (var5 == null || var5.field1209 == null) {
                        arg1.field2022 = -1;
                    } else {
                        if (arg1.field1957 < 0) {
                            arg1.field1957 = 0;
                            class253.method1789(19080, arg1.field1944, var5, 0, arg1.field1980, class13.field159 == arg1);
                        }
                        arg1.field1993++;
                        if (var5.field1209.length > arg1.field1957 && var5.field1223[arg1.field1957] < arg1.field1993) {
                            arg1.field1993 = 1;
                            arg1.field1957++;
                            class253.method1789(arg0 + 22359, arg1.field1944, var5, arg1.field1957, arg1.field1980, class13.field159 == arg1);
                        }
                        if (var5.field1209.length <= arg1.field1957) {
                            if (var3.field299) {
                                arg1.field1957 -= var5.field1196;
                                arg1.field1981++;
                                if (var5.field1195 <= arg1.field1981) {
                                    arg1.field2022 = -1;
                                } else if (arg1.field1957 >= 0 && arg1.field1957 < var5.field1209.length) {
                                    class253.method1789(19080, arg1.field1944, var5, arg1.field1957, arg1.field1980, class13.field159 == arg1);
                                } else {
                                    arg1.field2022 = -1;
                                }
                            } else {
                                arg1.field2022 = -1;
                            }
                        }
                        arg1.field2024 = arg1.field1957 + 1;
                        if (var5.field1209.length <= arg1.field2024) {
                            if (var3.field299) {
                                arg1.field2024 -= var5.field1196;
                                if ((arg1.field1981 + 1) >= var5.field1195) {
                                    arg1.field2024 = -1;
                                } else if (arg1.field2024 < 0 || var5.field1209.length <= arg1.field2024) {
                                    arg1.field2024 = -1;
                                }
                            } else {
                                arg1.field2024 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field1968 != -1 && arg1.field2002 <= 1) {
            class80 var6 = class37.method236(arg1.field1968, arg0 + 23533);
            if (var6.field1200 == 3) {
                if (arg1.field2001 > 0 && arg1.field1978 <= class48.field648 && arg1.field1975 < class48.field648) {
                    arg1.field1968 = -1;
                }
            } else if (var6.field1200 == 1 && arg1.field2001 > 0 && arg1.field1978 <= class48.field648 && arg1.field1975 < class48.field648) {
                arg1.field2002 = 1;
            }
        }
        if (arg0 != -3279) {
            method1742(-94);
        }
        if (arg1.field1968 != -1 && arg1.field2002 == 0) {
            class80 var7 = class37.method236(arg1.field1968, 20254);
            if (var7 == null || var7.field1209 == null) {
                arg1.field1968 = -1;
            } else {
                arg1.field1955++;
                if (var7.field1209.length > arg1.field1948 && arg1.field1955 > var7.field1223[arg1.field1948]) {
                    arg1.field1955 = 1;
                    arg1.field1948++;
                    class253.method1789(19080, arg1.field1944, var7, arg1.field1948, arg1.field1980, class13.field159 == arg1);
                }
                if (var7.field1209.length <= arg1.field1948) {
                    arg1.field1948 -= var7.field1196;
                    arg1.field2023++;
                    if (var7.field1195 <= arg1.field2023) {
                        arg1.field1968 = -1;
                    } else if (arg1.field1948 >= 0 && var7.field1209.length > arg1.field1948) {
                        class253.method1789(arg0 + 22359, arg1.field1944, var7, arg1.field1948, arg1.field1980, class13.field159 == arg1);
                    } else {
                        arg1.field1968 = -1;
                    }
                }
                arg1.field1960 = arg1.field1948 + 1;
                if (arg1.field1960 >= var7.field1209.length) {
                    arg1.field1960 -= var7.field1196;
                    if ((arg1.field2023 + 1) >= var7.field1195) {
                        arg1.field1960 = -1;
                    } else if (arg1.field1960 < 0 || arg1.field1960 >= var7.field1209.length) {
                        arg1.field1960 = -1;
                    }
                }
                arg1.field1965 = var7.field1212;
            }
        }
        if (arg1.field2002 > 0) {
            arg1.field2002--;
        }
        for (int var8 = 0; var8 < arg1.field2012.length; var8++) {
            class188 var9 = arg1.field2012[var8];
            if (var9 != null) {
                if (var9.field3048 > 0) {
                    var9.field3048--;
                } else {
                    class80 var10 = class37.method236(var9.field3058, arg0 ^ 0xFFFFBC2F);
                    if (var10 == null || var10.field1209 == null) {
                        arg1.field2012[var8] = null;
                    } else {
                        var9.field3055++;
                        if (var9.field3059 < var10.field1209.length && var9.field3055 > var10.field1223[var9.field3059]) {
                            var9.field3055 = 1;
                            var9.field3059++;
                            class253.method1789(19080, arg1.field1944, var10, var9.field3059, arg1.field1980, class13.field159 == arg1);
                        }
                        if (var9.field3059 >= var10.field1209.length) {
                            var9.field3057++;
                            var9.field3059 -= var10.field1196;
                            if (var9.field3057 >= var10.field1195) {
                                arg1.field2012[var8] = null;
                            } else if (var9.field3059 >= 0 && var9.field3059 < var10.field1209.length) {
                                class253.method1789(19080, arg1.field1944, var10, var9.field3059, arg1.field1980, class13.field159 == arg1);
                            } else {
                                arg1.field2012[var8] = null;
                            }
                        }
                        var9.field3052 = var9.field3059 + 1;
                        if (var10.field1209.length <= var9.field3052) {
                            var9.field3052 -= var10.field1196;
                            if (var10.field1195 <= (var9.field3057 + 1)) {
                                var9.field3052 = -1;
                            } else if (var9.field3052 < 0 || var10.field1209.length <= var9.field3052) {
                                var9.field3052 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(I)V", line = 649)
    public class246(int arg0) {
        this.field3909 = arg0;
        this.field3907 = new class71[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class71 var3 = this.field3907[var2] = new class71();
            var3.field908 = var3;
            var3.field921 = var3;
        }
    }
}
