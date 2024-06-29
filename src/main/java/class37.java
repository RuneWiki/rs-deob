import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class37 {

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    private int field565 = 0;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public int field553;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "[Lwk;")
    public class172[] field558;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "Loj;")
    public static class207 field560 = new class207();

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "Ljava/lang/String;")
    public static String field571 = "";

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
    public static int field574 = 0;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "J")
    private long field564;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "Lwk;")
    private class172 field561;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "Lwk;")
    private class172 field567;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "Lrn;")
    public static class18 field569;

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "[I")
    public static int[] field572;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "[[B")
    public static byte[][] field570;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "[[Lmi;")
    public static class125[][] field557;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V", line = 4)
    public static void method368(boolean arg0) {
        field570 = (byte[][]) null;
        field572 = null;
        if (arg0) {
            method369(-78, 107);
        }
        field557 = (class125[][]) null;
        field569 = null;
        field560 = null;
        field571 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)I", line = 19)
    public static final int method369(int arg0, int arg1) {
        if (arg0 == 0) {
            field568++;
            return (arg1 & 0x3FB75) >> 11;
        } else {
            return -107;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BJ)Lwk;", line = 31)
    public final class172 method370(byte arg0, long arg1) {
        if (arg0 != -120) {
            field557 = (class125[][]) ((class125[][]) null);
        }
        this.field564 = arg1;
        field555++;
        class172 var4 = this.field558[(int) (arg1 & (long) (this.field553 - 1))];
        for (this.field561 = var4.field2737; this.field561 != var4; this.field561 = this.field561.field2737) {
            if (this.field561.field2734 == arg1) {
                class172 var5 = this.field561;
                this.field561 = this.field561.field2737;
                return var5;
            }
        }
        this.field561 = null;
        return null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)Lwk;", line = 69)
    public final class172 method371(int arg0) {
        if (arg0 != -19139) {
            this.method375((class172) null, 27L, 119);
        }
        field552++;
        this.field565 = 0;
        return this.method378((byte) -105);
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)I", line = 83)
    public final int method372(int arg0) {
        field549++;
        return arg0 == 32721 ? this.field553 : -89;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)V", line = 95)
    public static final void method373(byte arg0, int arg1) {
        field551++;
        class138 var2 = class149.method1242(arg1, 0, 9);
        int var3 = 96 % ((arg0 + 58) / 37);
        var2.method1152(124);
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V", line = 111)
    public final void method374(int arg0) {
        if (arg0 != 15975) {
            field569 = (class18) null;
        }
        for (int var2 = 0; var2 < this.field553; var2++) {
            class172 var3 = this.field558[var2];
            while (true) {
                class172 var4 = var3.field2737;
                if (var3 == var4) {
                    break;
                }
                var4.method1357(arg0 + 947631035);
            }
        }
        this.field561 = null;
        field563++;
        this.field567 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lwk;JI)V", line = 149)
    public final void method375(class172 arg0, long arg1, int arg2) {
        field559++;
        int var5 = 69 % ((-arg2 - 38) / 34);
        if (arg0.field2740 != null) {
            arg0.method1357(947647010);
        }
        class172 var6 = this.field558[(int) (arg1 & (long) (this.field553 - 1))];
        arg0.field2734 = arg1;
        arg0.field2740 = var6.field2740;
        arg0.field2737 = var6;
        arg0.field2740.field2737 = arg0;
        arg0.field2737.field2740 = arg0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)V", line = 168)
    public static final void method376(int arg0, int arg1, int arg2) {
        class197.field3081 = true;
        class207.field3190 = arg0;
        class226.field3533 = arg1;
        class91.field1352 = arg2;
        class282.field4366 = -1;
        class274.field4254 = -1;
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)Lwk;", line = 177)
    public final class172 method377(int arg0) {
        field556++;
        if (this.field561 == null) {
            return null;
        }
        class172 var2 = this.field558[(int) ((long) (this.field553 + arg0) & this.field564)];
        while (this.field561 != var2) {
            if (this.field561.field2734 == this.field564) {
                class172 var3 = this.field561;
                this.field561 = this.field561.field2737;
                return var3;
            }
            this.field561 = this.field561.field2737;
        }
        this.field561 = null;
        return null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)Lwk;", line = 209)
    public final class172 method378(byte arg0) {
        field548++;
        if (this.field565 > 0 && this.field558[this.field565 - 1] != this.field567) {
            class172 var2 = this.field567;
            this.field567 = var2.field2737;
            return var2;
        }
        if (arg0 > -50) {
            this.method370((byte) 17, 72L);
        }
        class172 var3;
        do {
            if (this.field553 <= this.field565) {
                return null;
            }
            var3 = this.field558[this.field565++].field2737;
        } while (this.field558[this.field565 - 1] == var3);
        this.field567 = var3.field2737;
        return var3;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(I)V", line = 241)
    public class37(int arg0) {
        this.field553 = arg0;
        this.field558 = new class172[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class172 var3 = this.field558[var2] = new class172();
            var3.field2740 = var3;
            var3.field2737 = var3;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "([Lwk;I)I", line = 266)
    public final int method379(class172[] arg0, int arg1) {
        field550++;
        if (arg1 != -6454) {
            this.field565 = -88;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field553; var4++) {
            class172 var5 = this.field558[var4];
            for (class172 var6 = var5.field2737; var6 != var5; var6 = var6.field2737) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)I", line = 302)
    public final int method380(byte arg0) {
        field562++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field553; var3++) {
            class172 var4 = this.field558[var3];
            class172 var5 = var4.field2737;
            while (var4 != var5) {
                var5 = var5.field2737;
                var2++;
            }
        }
        int var6 = -68 / ((arg0 - 5) / 35);
        return var2;
    }
}
