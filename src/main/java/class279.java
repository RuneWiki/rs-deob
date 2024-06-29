import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public abstract class class279 extends class287 {

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "Z")
    public boolean field4789;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "[Lvd;")
    public class279[] field4774;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Ltl;")
    public static class59 field4773 = class85.method639("null", 9588);

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "Ltl;")
    public static class59 field4782 = class85.method639("Spieler kann nicht gefunden werden: ", 9588);

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "Ltl;")
    public static class59 field4792 = class85.method639("Verbindung abgebrochen)3", 9588);

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public int field4775;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "Ldi;")
    public class198 field4786;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Loi;")
    public class26 field4781;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)[I", line = 6)
    public int[] method44(boolean arg0, int arg1) {
        if (arg0) {
            return (int[]) null;
        } else {
            field4776++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I", line = 20)
    public static final int method1954(int arg0, int arg1) {
        field4778++;
        return arg0 == -537128537 ? arg1 >>> 7 : 6;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)Ltl;", line = 32)
    public static final class59 method1955(int arg0, int arg1) {
        field4788++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException();
        }
        class59 var2 = new class59();
        var2.field863 = 1;
        var2.field889 = new byte[1];
        if (arg0 != 3896) {
            method1957(true);
        }
        var2.field889[0] = (byte) arg1;
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)I", line = 58)
    public int method255(int arg0) {
        field4791++;
        return arg0 == 32 ? -1 : -34;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIB)[[I", line = 74)
    public final int[][] method1956(int arg0, int arg1, byte arg2) {
        field4772++;
        if (arg2 != -112) {
            method1955(-37, -87);
        }
        if (this.field4774[arg0].field4789) {
            int[] var4 = this.field4774[arg0].method44(false, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4774[arg0].method87(-7523, arg1);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V", line = 110)
    public static void method1957(boolean arg0) {
        field4773 = null;
        field4782 = null;
        field4792 = null;
        if (!arg0) {
            method1959(-35, -11, false, true, (class263) null);
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)[[I", line = 122)
    public int[][] method87(int arg0, int arg1) {
        if (arg0 != -7523) {
            this.field4789 = true;
        }
        field4787++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V", line = 136)
    public final void method1958(int arg0, int arg1, int arg2) {
        int var4 = this.field4775 == arg2 ? arg0 : this.field4775;
        field4783++;
        if (this.field4789) {
            this.field4781 = new class26(var4, arg0, arg1);
        } else {
            this.field4786 = new class198(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZZLma;)V", line = 155)
    public static final void method1959(int arg0, int arg1, boolean arg2, boolean arg3, class263 arg4) {
        int var5 = arg4.field4467;
        int var6 = arg4.field4420;
        if (arg4.field4441 == 0) {
            arg4.field4467 = arg4.field4478;
        } else if (arg4.field4441 == 1) {
            arg4.field4467 = arg1 - arg4.field4478;
        } else if (arg4.field4441 == 2) {
            arg4.field4467 = arg4.field4478 * arg1 >> 14;
        } else if (arg4.field4441 == 3) {
            if (arg4.field4468 == 2) {
                arg4.field4467 = (arg4.field4478 - 1) * arg4.field4514 + arg4.field4478 * 32;
            } else if (arg4.field4468 == 7) {
                arg4.field4467 = (arg4.field4478 - 1) * arg4.field4514 + arg4.field4478 * 12;
            }
        }
        field4771++;
        if (arg3) {
            field4773 = (class59) null;
        }
        if (arg4.field4389 == 0) {
            arg4.field4420 = arg4.field4388;
        } else if (arg4.field4389 == 1) {
            arg4.field4420 = arg0 - arg4.field4388;
        } else if (arg4.field4389 == 2) {
            arg4.field4420 = arg4.field4388 * arg0 >> 14;
        } else if (arg4.field4389 == 3) {
            if (arg4.field4468 == 2) {
                arg4.field4420 = (arg4.field4388 - 1) * arg4.field4439 + arg4.field4388 * 32;
            } else if (arg4.field4468 == 7) {
                arg4.field4420 = (arg4.field4388 - 1) * arg4.field4439 + arg4.field4388 * 115;
            }
        }
        if (arg4.field4389 == 4) {
            arg4.field4420 = arg4.field4517 * arg4.field4467 / arg4.field4540;
        }
        if (arg4.field4441 == 4) {
            arg4.field4467 = arg4.field4540 * arg4.field4420 / arg4.field4517;
        }
        if (class39.field592 && (client.method278(arg4) != 0 || arg4.field4468 == 0)) {
            if (arg4.field4467 < 5 && arg4.field4420 < 5) {
                arg4.field4420 = 5;
                arg4.field4467 = 5;
            } else {
                if (arg4.field4467 <= 0) {
                    arg4.field4467 = 5;
                }
                if (arg4.field4420 <= 0) {
                    arg4.field4420 = 5;
                }
            }
        }
        if (arg4.field4472 == 1337) {
            class185.field3110 = arg4;
        }
        if (arg2 && arg4.field4529 != null && (arg4.field4420 != var6 || arg4.field4467 != var5)) {
            class128 var7 = new class128();
            var7.field2103 = arg4.field4529;
            var7.field2110 = arg4;
            class262.field4373.method532(106, var7);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)[I", line = 260)
    public final int[] method1960(int arg0, int arg1, int arg2) {
        field4780++;
        if (arg0 > -120) {
            this.method87(127, -40);
        }
        return this.field4774[arg2].field4789 ? this.field4774[arg2].method44(false, arg1) : this.field4774[arg2].method87(-7523, arg1)[0];
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)I", line = 292)
    public int method956(int arg0) {
        field4777++;
        return arg0 >= -56 ? 51 : -1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 303)
    public void method319(byte arg0) {
        field4784++;
        if (arg0 >= -9) {
            method1957(true);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V", line = 324)
    public void method254(byte arg0) {
        if (this.field4789) {
            this.field4781.method166(-20016);
            this.field4781 = null;
        } else {
            this.field4786.method1428(0);
            this.field4786 = null;
        }
        field4790++;
        if (arg0 < 11) {
            this.field4781 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILs;)V", line = 350)
    public void method51(int arg0, int arg1, class170 arg2) {
        field4779++;
        if (arg0 > -125) {
            this.field4789 = false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(IZ)V", line = 366)
    public class279(int arg0, boolean arg1) {
        this.field4789 = arg1;
        this.field4774 = new class279[arg0];
    }
}
