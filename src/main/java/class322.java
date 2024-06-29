import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class322 {

    @OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
    private int field4699 = 0;

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
    public int field4685;

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "[Ldu;")
    public class381[] field4693;

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "[I")
    public static int[] field4686 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!efa", name = "h", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!efa", name = "i", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!efa", name = "k", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!efa", name = "m", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "J")
    private long field4697;

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "Ldu;")
    private class381 field4696;

    @OriginalMember(owner = "client!efa", name = "q", descriptor = "Ldu;")
    private class381 field4698;

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "Lks;")
    public static class421 field4691;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)Ldu;", line = 4)
    public final class381 method1993(int arg0) {
        field4683++;
        this.field4699 = 0;
        return arg0 >= -61 ? null : this.method1997(9831);
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "([Ldu;B)I", line = 17)
    public final int method1994(class381[] arg0, byte arg1) {
        field4690++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4685; var4++) {
            class381 var5 = this.field4693[var4];
            for (class381 var6 = var5.field5737; var6 != var5; var6 = var6.field5737) {
                arg0[var3++] = var6;
            }
        }
        if (arg1 <= 93) {
            this.method1995((byte) 71);
        }
        return var3;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V", line = 48)
    public final void method1995(byte arg0) {
        field4689++;
        if (arg0 != -123) {
            method2003(5, 86);
        }
        for (int var2 = 0; var2 < this.field4685; var2++) {
            class381 var3 = this.field4693[var2];
            while (true) {
                class381 var4 = var3.field5737;
                if (var3 == var4) {
                    break;
                }
                var4.method2360((byte) 66);
            }
        }
        this.field4698 = null;
        this.field4696 = null;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)I", line = 82)
    public final int method1996(byte arg0) {
        field4694++;
        int var2 = 0;
        if (arg0 > -49) {
            this.method1993(-12);
        }
        for (int var3 = 0; var3 < this.field4685; var3++) {
            class381 var4 = this.field4693[var3];
            for (class381 var5 = var4.field5737; var5 != var4; var5 = var5.field5737) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)Ldu;", line = 115)
    public final class381 method1997(int arg0) {
        field4687++;
        if (arg0 != 9831) {
            return null;
        } else if (this.field4699 <= 0 || this.field4693[this.field4699 - 1] == this.field4698) {
            while (this.field4699 < this.field4685) {
                class381 var3 = this.field4693[this.field4699++].field5737;
                if (this.field4693[this.field4699 - 1] != var3) {
                    this.field4698 = var3.field5737;
                    return var3;
                }
            }
            return null;
        } else {
            class381 var2 = this.field4698;
            this.field4698 = var2.field5737;
            return var2;
        }
    }

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "(I)I", line = 149)
    public final int method1998(int arg0) {
        if (arg0 == -30138) {
            field4692++;
            return this.field4685;
        } else {
            return 102;
        }
    }

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "(I)Ldu;", line = 165)
    public final class381 method1999(int arg0) {
        field4684++;
        if (this.field4696 == null) {
            return null;
        }
        class381 var2 = this.field4693[(int) ((long) (this.field4685 - 1) & this.field4697)];
        while (this.field4696 != var2) {
            if (this.field4696.field5740 == this.field4697) {
                class381 var4 = this.field4696;
                this.field4696 = this.field4696.field5737;
                return var4;
            }
            this.field4696 = this.field4696.field5737;
        }
        int var3 = -35 / ((arg0 - 36) / 41);
        this.field4696 = null;
        return null;
    }

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "(I)V", line = 201)
    public static void method2000(int arg0) {
        field4691 = null;
        if (arg0 != 3) {
            field4686 = null;
        }
        field4686 = null;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILdu;J)V", line = 219)
    public final void method2001(int arg0, class381 arg1, long arg2) {
        field4695++;
        if (arg1.field5735 != null) {
            arg1.method2360((byte) 66);
        }
        class381 var5 = this.field4693[(int) (arg2 & (long) (this.field4685 - 1))];
        arg1.field5737 = var5;
        arg1.field5735 = var5.field5735;
        int var6 = 80 / ((arg0 + 30) / 48);
        arg1.field5735.field5737 = arg1;
        arg1.field5737.field5735 = arg1;
        arg1.field5740 = arg2;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(BJ)Ldu;", line = 241)
    public final class381 method2002(byte arg0, long arg1) {
        this.field4697 = arg1;
        field4682++;
        class381 var4 = this.field4693[(int) (arg1 & (long) (this.field4685 - 1))];
        for (this.field4696 = var4.field5737; this.field4696 != var4; this.field4696 = this.field4696.field5737) {
            if (this.field4696.field5740 == arg1) {
                class381 var5 = this.field4696;
                this.field4696 = this.field4696.field5737;
                return var5;
            }
        }
        this.field4696 = null;
        if (arg0 >= -105) {
            method2003(78, 95);
        }
        return null;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(II)V", line = 270)
    public static final void method2003(int arg0, int arg1) {
        field4688++;
        if (arg0 != 0) {
            method2003(-47, 111);
        }
        if (class264.field3451 == arg1) {
            return;
        }
        if (arg1 == 13) {
            if (class119.field1771 == null) {
                class370.method2292(arg0 - 94, class239.field3137, class11.field278, class642.field9203);
            } else {
                class685.method3841(114, class642.field9203);
            }
        }
        if (arg1 != 13 && class546.field8061 != null) {
            class546.field8061.method1362((byte) 30);
            class546.field8061 = null;
        }
        if (arg1 == 3) {
            class153.method1086(class567.field8270 != class537.field7871, (byte) -84);
        }
        if (arg1 == 7) {
            class106.method750(1911967790, class630.field9125 != class567.field8270);
        }
        if (arg1 == 5) {
            if (class119.field1771 == null) {
                class42.method241(class239.field3137, class11.field278, arg0 ^ 0xFFFFEFC9);
            } else {
                class272.method1622(0);
            }
        } else if (arg1 == 6) {
            if (class119.field1771 == null) {
                class370.method2292(arg0 - 52, class239.field3137, class11.field278, class642.field9203);
            } else {
                class685.method3841(122, class642.field9203);
            }
        } else if (arg1 == 9) {
            if (class119.field1771 == null) {
                class370.method2292(arg0 - 36, class239.field3137, class11.field278, class642.field9203);
            } else {
                class685.method3841(119, class642.field9203);
            }
        } else if (arg1 == 12) {
            if (class119.field1771 == null) {
                class42.method241(class239.field3137, class11.field278, -4151);
            } else {
                class272.method1622(0);
            }
        }
        if (class474.method2730(arg0 + 98, class264.field3451)) {
            class223.field2947.field4344 = 2;
            class654.field9365.field4344 = 2;
            class554.field8140.field4344 = 2;
            class425.field6216.field4344 = 2;
            class394.field5968.field4344 = 2;
            class224.field2958.field4344 = 2;
            class56.field878.field4344 = 2;
        }
        if (class474.method2730(118, arg1)) {
            class65.field1040 = 0;
            class30.field518 = 0;
            class318.field4626 = 1;
            class194.field2608 = 1;
            class520.field7295 = 0;
            class61.method379((byte) -101, true);
            class223.field2947.field4344 = 1;
            class654.field9365.field4344 = 1;
            class554.field8140.field4344 = 1;
            class425.field6216.field4344 = 1;
            class394.field5968.field4344 = 1;
            class224.field2958.field4344 = 1;
            class56.field878.field4344 = 1;
        }
        if (arg1 == 11 || arg1 == 3) {
            class153.method1087(arg0 - 16823);
        }
        boolean var2 = arg1 == 2 || class591.method3368(arg1, arg0 + 26386) || class261.method1566((byte) 5, arg1);
        boolean var3 = class264.field3451 == 2 || class591.method3368(class264.field3451, 26386) || class261.method1566((byte) 5, class264.field3451);
        if (var3 != var2) {
            if (var2) {
                class443.field6426 = class572.field8309;
                if (class335.field4872.field9486 == 0) {
                    class489.method2795(2, (byte) -68);
                } else {
                    class489.method2794(class335.field4872.field9486, 0, false, class18.field360, 2, class572.field8309, false);
                    class613.method3488(17299);
                }
                class212.field2856.method2848((byte) -124, false);
            } else {
                class489.method2795(2, (byte) -68);
                class212.field2856.method2848((byte) -128, true);
            }
        }
        if (class474.method2730(104, arg1) || arg1 == 13) {
            class332.field4821.method642();
        }
        class264.field3451 = arg1;
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(I)V", line = 419)
    public class322(int arg0) {
        this.field4685 = arg0;
        this.field4693 = new class381[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class381 var3 = this.field4693[var2] = new class381();
            var3.field5735 = var3;
            var3.field5737 = var3;
        }
    }
}
