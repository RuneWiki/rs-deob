import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class128 {

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lwj;")
    public class217 field2021 = new class217();

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field2020 = 0;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field2027 = 0;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lah;")
    public static class206 field2023;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Lwj;")
    private class217 field2026;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Lwj;", line = 13)
    public final class217 method974(int arg0) {
        field2010++;
        if (arg0 != 0) {
            return (class217) null;
        }
        class217 var2 = this.field2021.field3424;
        if (this.field2021 == var2) {
            this.field2026 = null;
            return null;
        } else {
            this.field2026 = var2.field3424;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZLhb;IIIIII)V", line = 37)
    public static final void method975(int arg0, boolean arg1, class35 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2016++;
        if (arg8 >= 0 && arg8 < 104 && arg0 >= 0 && arg0 < 104) {
            if (!arg1) {
                class208.field3272[arg5][arg8][arg0] = 0;
            }
            while (true) {
                int var9 = arg2.method273(65280);
                if (var9 == 0) {
                    if (arg1) {
                        class41.field612[0][arg8][arg0] = class258.field3844[0][arg8][arg0];
                    } else if (arg5 == 0) {
                        class41.field612[0][arg8][arg0] = -class55.method487(556238 - (-arg0 - arg3), arg8 + 932731 + arg4, -1) * 8;
                    } else {
                        class41.field612[arg5][arg8][arg0] = class41.field612[arg5 - 1][arg8][arg0] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg2.method273(65280);
                    if (arg1) {
                        class41.field612[0][arg8][arg0] = var10 * 8 + class258.field3844[0][arg8][arg0];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg5 == 0) {
                            class41.field612[0][arg8][arg0] = -var10 * 8;
                        } else {
                            class41.field612[arg5][arg8][arg0] = class41.field612[arg5 - 1][arg8][arg0] - var10 * 8;
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class323.field5018[arg5][arg8][arg0] = arg2.method242((byte) -93);
                    class65.field963[arg5][arg8][arg0] = (byte) ((var9 - 2) / 4);
                    class272.field4118[arg5][arg8][arg0] = (byte) class142.method1078(var9 + arg7 - 2, 3);
                } else if (var9 > 81) {
                    class314.field4872[arg5][arg8][arg0] = (byte) (var9 - 81);
                } else if (!arg1) {
                    class208.field3272[arg5][arg8][arg0] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg2.method273(65280);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg2.method273(arg6 + 65279);
                    break;
                }
                if (var11 <= 49) {
                    arg2.method273(65280);
                }
            }
        }
        if (arg6 != 1) {
            field2020 = 20;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V", line = 145)
    public static final void method976(int arg0, int arg1) {
        class80.field1124 = 1000 / arg1;
        if (arg0 != -6588) {
            field2024 = -22;
        }
        field2018++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILwj;)V", line = 156)
    public final void method977(int arg0, class217 arg1) {
        field2028++;
        if (arg0 != 4) {
            method987(-35, (class26) null);
        }
        if (arg1.field3424 != null) {
            arg1.method1554((byte) -116);
        }
        arg1.field3424 = this.field2021.field3424;
        arg1.field3419 = this.field2021;
        arg1.field3424.field3419 = arg1;
        arg1.field3419.field3424 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 178)
    public static void method978(int arg0) {
        int var1 = -88 / ((arg0 + 4) / 61);
        field2023 = null;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)Lwj;", line = 188)
    public final class217 method979(int arg0) {
        field2012++;
        if (arg0 != 49) {
            field2023 = (class206) null;
        }
        class217 var2 = this.field2021.field3419;
        if (this.field2021 == var2) {
            return null;
        } else {
            var2.method1554((byte) -80);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V", line = 206)
    public final void method980(int arg0) {
        if (arg0 != 1) {
            this.field2026 = (class217) null;
        }
        while (true) {
            class217 var2 = this.field2021.field3419;
            if (this.field2021 == var2) {
                this.field2026 = null;
                field2022++;
                return;
            }
            var2.method1554((byte) -100);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)Lmi;", line = 227)
    public static final class270 method981(int arg0, int arg1) {
        field2011++;
        if (arg0 < 99) {
            method975(-82, false, (class35) null, -26, -69, 42, -56, 62, -73);
        }
        class270 var2 = (class270) class222.field3467.method816((long) arg1, (byte) 73);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class228.field3530.method1507(arg1 & 0x7FFF, (byte) -127, 0);
        } else {
            var3 = class315.field4903.method1507(arg1, (byte) 82, 0);
        }
        class270 var4 = new class270();
        if (var3 != null) {
            var4.method1881(-116, new class35(var3));
        }
        if (arg1 >= 32768) {
            var4.method1875((byte) -120);
        }
        class222.field3467.method817(var4, (long) arg1, (byte) -98);
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)Lwj;", line = 263)
    public final class217 method982(int arg0) {
        field2013++;
        if (arg0 != 14877) {
            this.method984((class217) null, (byte) -24);
        }
        class217 var2 = this.field2026;
        if (this.field2021 == var2) {
            this.field2026 = null;
            return null;
        } else {
            this.field2026 = var2.field3419;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 425)
    public class128() {
        this.field2021.field3419 = this.field2021;
        this.field2021.field3424 = this.field2021;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V", line = 291)
    public static final void method983(byte arg0, int arg1) {
        if (arg0 != 104) {
            field2027 = 76;
        }
        field2019++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class41.method362(-1);
        } else if (arg1 == 2) {
            class270.method1880(-120);
        } else if (arg1 == 3) {
            class181.method1310(false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lwj;B)V", line = 318)
    public final void method984(class217 arg0, byte arg1) {
        field2015++;
        if (arg0.field3424 != null) {
            arg0.method1554((byte) -57);
        }
        arg0.field3424 = this.field2021;
        if (arg1 > 108) {
            arg0.field3419 = this.field2021.field3419;
            arg0.field3424.field3419 = arg0;
            arg0.field3419.field3424 = arg0;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Lwj;", line = 337)
    public final class217 method985(byte arg0) {
        field2014++;
        class217 var2 = this.field2026;
        if (arg0 != 84) {
            this.method974(3);
        }
        if (this.field2021 == var2) {
            this.field2026 = null;
            return null;
        } else {
            this.field2026 = var2.field3424;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)Lwj;", line = 357)
    public final class217 method986(boolean arg0) {
        field2017++;
        class217 var2 = this.field2021.field3419;
        if (arg0) {
            this.field2021 = (class217) null;
        }
        if (this.field2021 == var2) {
            this.field2026 = null;
            return null;
        } else {
            this.field2026 = var2.field3419;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILna;)V", line = 388)
    public static final void method987(int arg0, class26 arg1) {
        class275 var2 = null;
        field2025++;
        try {
            class233 var3 = arg1.method175("runescape", (byte) -66);
            while (var3.field3585 == 0) {
                class97.method768(1L, 41);
            }
            if (arg0 != 0) {
                method975(-26, false, (class35) null, 107, 27, -108, -75, 125, -52);
            }
            if (var3.field3585 == 1) {
                var2 = (class275) var3.field3590;
                class35 var4 = class59.method531(arg0 ^ 0x1);
                var2.method1920(arg0 + 1709, var4.field455, 0, var4.field437);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1921(arg0 ^ 0x0);
            }
        } catch (Exception var7) {
        }
    }
}
