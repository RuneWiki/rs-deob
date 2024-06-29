import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class2 {

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Lsn;")
    public class187 field11 = new class187();

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "[Z")
    public static boolean[] field12 = new boolean[100];

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field25 = 0;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Lsn;")
    private class187 field19;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Lwf;")
    public static class306 field13;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Z")
    public static boolean field8;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "[[[Lsa;")
    public static class174[][][] field15;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 11)
    public final void method5(int arg0) {
        if (arg0 < 32) {
            field13 = (class306) null;
        }
        field17++;
        while (true) {
            class187 var2 = this.field11.field2846;
            if (this.field11 == var2) {
                this.field19 = null;
                return;
            }
            var2.method1284(0);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)Lsn;", line = 34)
    public final class187 method6(boolean arg0) {
        class187 var2 = this.field11.field2850;
        field23++;
        if (!arg0) {
            field12 = (boolean[]) null;
        }
        if (this.field11 == var2) {
            this.field19 = null;
            return null;
        } else {
            this.field19 = var2.field2850;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLsn;)V", line = 57)
    public final void method7(byte arg0, class187 arg1) {
        if (arg1.field2850 != null) {
            arg1.method1284(0);
        }
        field22++;
        arg1.field2846 = this.field11;
        arg1.field2850 = this.field11.field2850;
        arg1.field2850.field2846 = arg1;
        arg1.field2846.field2850 = arg1;
        if (arg0 != -51) {
            this.method13((byte) -96);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)Lsn;", line = 85)
    public final class187 method8(int arg0) {
        field24++;
        class187 var2 = this.field19;
        if (this.field11 == var2) {
            this.field19 = null;
            return null;
        }
        if (arg0 != 18820) {
            this.method13((byte) -127);
        }
        this.field19 = var2.field2850;
        return var2;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 203)
    public class2() {
        this.field11.field2850 = this.field11;
        this.field11.field2846 = this.field11;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V", line = 114)
    public static final void method9(int arg0) {
        if (arg0 != -13604) {
            field9 = -29;
        }
        field20++;
        for (class208 var1 = (class208) class203.field3069.method10((byte) 83); var1 != null; var1 = (class208) class203.field3069.method13((byte) -32)) {
            if (var1.field3320 > 0) {
                var1.field3320--;
            }
            if (var1.field3320 != 0) {
                if (var1.field3309 > 0) {
                    var1.field3309--;
                }
                if (var1.field3309 == 0 && var1.field3316 >= 1 && var1.field3322 >= 1 && var1.field3316 <= 102 && var1.field3322 <= 102 && (var1.field3311 < 0 || class82.method561(var1.field3318, var1.field3311, -116))) {
                    class6.method34((byte) 37, var1.field3316, var1.field3318, var1.field3323, var1.field3311, var1.field3305, var1.field3314, var1.field3322);
                    var1.field3309 = -1;
                    if (var1.field3311 == var1.field3308 && var1.field3308 == -1) {
                        var1.method1284(0);
                    } else if (var1.field3311 == var1.field3308 && var1.field3323 == var1.field3319 && var1.field3318 == var1.field3315) {
                        var1.method1284(0);
                    }
                }
            } else if (var1.field3308 < 0 || class82.method561(var1.field3315, var1.field3308, -116)) {
                class6.method34((byte) 37, var1.field3316, var1.field3315, var1.field3319, var1.field3308, var1.field3305, var1.field3314, var1.field3322);
                var1.method1284(arg0 + 13604);
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)Lsn;", line = 172)
    public final class187 method10(byte arg0) {
        field10++;
        if (arg0 <= 35) {
            field25 = 101;
        }
        class187 var2 = this.field11.field2846;
        if (this.field11 == var2) {
            this.field19 = null;
            return null;
        } else {
            this.field19 = var2.field2846;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)Z", line = 192)
    public final boolean method11(int arg0) {
        if (arg0 != 1) {
            this.field11 = (class187) null;
        }
        field16++;
        return this.field11.field2846 == this.field11;
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)Lsn;", line = 220)
    public final class187 method12(int arg0) {
        field7++;
        int var2 = 42 / ((arg0 - 8) / 46);
        class187 var3 = this.field11.field2846;
        if (this.field11 == var3) {
            return null;
        } else {
            var3.method1284(0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)Lsn;", line = 239)
    public final class187 method13(byte arg0) {
        field18++;
        class187 var2 = this.field19;
        if (this.field11 == var2) {
            this.field19 = null;
            return null;
        }
        this.field19 = var2.field2846;
        if (arg0 != -32) {
            this.method6(false);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lsn;I)V", line = 266)
    public final void method14(class187 arg0, int arg1) {
        field21++;
        if (arg0.field2850 != null) {
            arg0.method1284(0);
        }
        int var3 = -90 % ((arg1 + 70) / 54);
        arg0.field2850 = this.field11;
        arg0.field2846 = this.field11.field2846;
        arg0.field2850.field2846 = arg0;
        arg0.field2846.field2850 = arg0;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V", line = 283)
    public static void method15(boolean arg0) {
        if (arg0) {
            method15(false);
        }
        field13 = null;
        field12 = null;
        field15 = (class174[][][]) null;
    }
}
