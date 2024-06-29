import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class30 {

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Lrb;")
    private class255 field561 = new class255();

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Lrg;")
    private class217 field564 = new class217();

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    private int field563;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    private int field562;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Laj;")
    private class46 field565;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Leb;")
    public static class230 field547 = class68.method589(0, "runes");

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field545 = 0;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Z")
    public static boolean field546 = false;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field559 = 0;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Leb;")
    public static class230 field560 = class68.method589(0, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Lkk;")
    public static class223 field548;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Loh;")
    public static class261 field556;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(JI)Lrb;")
    public final class255 method273(long arg0, int arg1) {
        field551++;
        class255 var4 = (class255) this.field565.method394(arg0, -21083);
        if (arg1 == 255) {
            if (var4 != null) {
                this.field564.method1494(-127, var4);
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Lki;")
    public final class61 method274(int arg0) {
        if (arg0 >= -114) {
            this.method274(-83);
        }
        field552++;
        return this.field565.method392(0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public final void method275(boolean arg0) {
        field549++;
        if (arg0) {
            field559 = 118;
        }
        this.field564.method1496((byte) 112);
        this.field565.method389((byte) -101);
        this.field561 = new class255();
        this.field563 = this.field562;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lrb;JI)V")
    public final void method276(class255 arg0, long arg1, int arg2) {
        field558++;
        if (this.field563 == 0) {
            class255 var5 = this.field564.method1498(0);
            var5.method518(105);
            var5.method1785(-110);
            if (this.field561 == var5) {
                class255 var6 = this.field564.method1498(0);
                var6.method518(120);
                var6.method1785(-96);
            }
        } else {
            this.field563--;
        }
        this.field565.method388(-1, arg1, arg0);
        this.field564.method1494(-127, arg0);
        if (arg2 >= -55) {
            field548 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)Lki;")
    public final class61 method277(int arg0) {
        if (arg0 < 97) {
            this.method275(false);
        }
        field554++;
        return this.field565.method390(-1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lki;Lki;I)V")
    public static final void method278(class61 arg0, class61 arg1, int arg2) {
        field550++;
        if (arg1.field1163 != null) {
            arg1.method518(112);
        }
        arg1.field1163 = arg0.field1163;
        arg1.field1169 = arg0;
        arg1.field1163.field1169 = arg1;
        if (arg2 > -93) {
            field548 = null;
        }
        arg1.field1169.field1163 = arg1;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public static void method279(int arg0) {
        field547 = null;
        field556 = null;
        field560 = null;
        field548 = null;
        if (arg0 > -81) {
            field555 = -82;
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)[Leh;")
    public static final class80[] method280(int arg0) {
        field557++;
        int var1 = -16 % ((-arg0 - 15) / 51);
        class80[] var2 = new class80[class194.field3434];
        for (int var3 = 0; var3 < class194.field3434; var3++) {
            int var4 = class7.field124[var3] * class273.field4806[var3];
            byte[] var5 = class215.field3725[var3];
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7] = class263.field4676[class189.method1350(var5[var7], 255)];
            }
            var2[var3] = new class10(class47.field839, class15.field346, class96.field1735[var3], class113.field2034[var3], class7.field124[var3], class273.field4806[var3], var6);
        }
        class78.method650(true);
        return var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIILka;Z)V")
    public static final void method281(int arg0, int arg1, int arg2, class245 arg3, boolean arg4) {
        field544++;
        if (arg1 != -32681) {
            method279(91);
        }
        int var5 = arg3.field4325;
        int var6 = arg3.field4307;
        if (arg3.field4273 == 0) {
            arg3.field4307 = arg3.field4266;
        } else if (arg3.field4273 == 1) {
            arg3.field4307 = arg0 - arg3.field4266;
        } else if (arg3.field4273 == 2) {
            arg3.field4307 = arg3.field4266 * arg0 >> 14;
        } else if (arg3.field4273 == 3) {
            if (arg3.field4306 == 2) {
                arg3.field4307 = (arg3.field4266 - 1) * arg3.field4367 + arg3.field4266 * 32;
            } else if (arg3.field4306 == 7) {
                arg3.field4307 = (arg3.field4266 - 1) * arg3.field4367 + arg3.field4266 * 12;
            }
        }
        if (arg3.field4345 == 0) {
            arg3.field4325 = arg3.field4251;
        } else if (arg3.field4345 == 1) {
            arg3.field4325 = arg2 - arg3.field4251;
        } else if (arg3.field4345 == 2) {
            arg3.field4325 = arg3.field4251 * arg2 >> 14;
        } else if (arg3.field4345 == 3) {
            if (arg3.field4306 == 2) {
                arg3.field4325 = (arg3.field4251 - 1) * arg3.field4344 + arg3.field4251 * 32;
            } else if (arg3.field4306 == 7) {
                arg3.field4325 = (arg3.field4251 - 1) * arg3.field4344 + arg3.field4251 * 115;
            }
        }
        if (arg3.field4345 == 4) {
            arg3.field4325 = arg3.field4307 * arg3.field4227 / arg3.field4275;
        }
        if (arg3.field4273 == 4) {
            arg3.field4307 = arg3.field4325 * arg3.field4275 / arg3.field4227;
        }
        if (class271.field4786 && (client.method1167(arg3) != 0 || arg3.field4306 == 0)) {
            if (arg3.field4307 < 5 && arg3.field4325 < 5) {
                arg3.field4307 = 5;
                arg3.field4325 = 5;
            } else {
                if (arg3.field4307 <= 0) {
                    arg3.field4307 = 5;
                }
                if (arg3.field4325 <= 0) {
                    arg3.field4325 = 5;
                }
            }
        }
        if (arg3.field4226 == 1337) {
            class203.field3575 = arg3;
        }
        if (arg4 && arg3.field4237 != null && arg3.field4325 != var5 || arg3.field4307 != var6) {
            class75 var7 = new class75();
            var7.field1364 = arg3.field4237;
            var7.field1354 = arg3;
            class123.field2161.method843(-5, var7);
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(I)V")
    public class30(int arg0) {
        this.field563 = arg0;
        this.field562 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field565 = new class46(var2);
    }
}
