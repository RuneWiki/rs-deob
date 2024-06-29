import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class5 extends class336 {

    @OriginalMember(owner = "client!no", name = "Mb", descriptor = "Ljava/lang/String;")
    public static String field74 = "Choose Option";

    @OriginalMember(owner = "client!no", name = "Fb", descriptor = "I")
    public static int field67 = 0;

    @OriginalMember(owner = "client!no", name = "Rb", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "client!no", name = "Db", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!no", name = "Eb", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!no", name = "Gb", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!no", name = "Hb", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!no", name = "Ib", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!no", name = "Jb", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!no", name = "Kb", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!no", name = "Lb", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!no", name = "Ob", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!no", name = "Pb", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!no", name = "Qb", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!no", name = "Sb", descriptor = "I")
    private int field80;

    @OriginalMember(owner = "client!no", name = "Nb", descriptor = "Lbm;")
    private class152 field75;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "(II)V", line = 4)
    public final void method26(int arg0, int arg1) {
        this.field5342[this.field5353++] = (byte) (this.field75.method1202(39) + arg0);
        field65++;
        if (arg1 != 7) {
            this.method30(43, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(IIB)V", line = 22)
    public static final void method27(int arg0, int arg1, byte arg2) {
        class255.field4115 = class304.field4825 - (arg0 - class259.field4201) - 1;
        if (arg2 < 84) {
            method27(-24, 84, (byte) 97);
        }
        field71++;
        class199.field3404 = arg1 - class341.field5444;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I[BII)V", line = 35)
    public final void method28(int arg0, byte[] arg1, int arg2, int arg3) {
        field78++;
        for (int var5 = arg2; var5 < arg0; var5++) {
            arg1[arg3 + var5] = (byte) (this.field5342[this.field5353++] - this.field75.method1202(49));
        }
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(Z)V", line = 57)
    public final void method29(boolean arg0) {
        this.field80 = this.field5353 * 8;
        field72++;
        if (!arg0) {
            this.method34(59, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(IB)I", line = 68)
    public final int method30(int arg0, byte arg1) {
        field69++;
        int var3 = -37 / ((-arg1 - 30) / 58);
        return arg0 * 8 - this.field80;
    }

    @OriginalMember(owner = "client!no", name = "n", descriptor = "(II)Lda;", line = 87)
    public static final class134 method31(int arg0, int arg1) {
        class134 var2 = (class134) class200.field3405.method467(true, (long) arg1);
        field70++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class158.field2795.method441(false, class128.method1069(arg1, 116), class280.method1916(arg1, 0));
        class134 var4 = new class134();
        var4.field2293 = arg1;
        if (var3 != null) {
            var4.method1104(new class336(var3), arg0 ^ 0x67377F0C);
        }
        var4.method1103((byte) 114);
        if (arg0 != -1731690365) {
            return (class134) null;
        }
        if (var4.field2290 != -1) {
            var4.method1100(method31(-1731690365, var4.field2334), method31(-1731690365, var4.field2290), 32678);
        }
        if (var4.field2308 != -1) {
            var4.method1095(method31(-1731690365, var4.field2308), method31(-1731690365, var4.field2351), (byte) 39);
        }
        if (!class258.field4175 && var4.field2319) {
            var4.field2330 = class238.field3904;
            var4.field2349 = false;
            var4.field2329 = 0;
            var4.field2345 = class342.field5460;
            var4.field2346 = class42.field635;
        }
        class200.field3405.method465(var4, (long) arg1, (byte) 105);
        return var4;
    }

    @OriginalMember(owner = "client!no", name = "u", descriptor = "(I)V", line = 129)
    public final void method32(int arg0) {
        if (arg0 != -24310) {
            field79 = -84;
        }
        this.field5353 = (this.field80 + 7) / 8;
        field73++;
    }

    @OriginalMember(owner = "client!no", name = "v", descriptor = "(I)V", line = 140)
    public static void method33(int arg0) {
        if (arg0 != -20952) {
            field79 = -52;
        }
        field74 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I[I)V", line = 153)
    public final void method34(int arg0, int[] arg1) {
        this.field75 = new class152(arg1);
        field76++;
        int var3 = 60 / ((-arg0 - 5) / 47);
    }

    @OriginalMember(owner = "client!no", name = "g", descriptor = "(IB)I", line = 171)
    public final int method35(int arg0, byte arg1) {
        field66++;
        int var3 = this.field80 >> 3;
        int var4 = 8 - (this.field80 & 0x7);
        int var5 = 0;
        this.field80 += arg0;
        while (var4 < arg0) {
            var5 += (class148.field2655[var4] & this.field5342[var3++]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (class148.field2655[var4] & this.field5342[var3]) + var5;
        } else {
            var6 = (this.field5342[var3] >> var4 - arg0 & class148.field2655[arg0]) + var5;
        }
        int var7 = 14 / ((-arg1 - 80) / 34);
        return var6;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(I)V", line = 200)
    public class5(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!no", name = "w", descriptor = "(I)I", line = 204)
    public final int method36(int arg0) {
        field68++;
        int var2 = 37 % ((-arg0 - 19) / 46);
        return this.field5342[this.field5353++] - this.field75.method1202(-67) & 0xFF;
    }

    @OriginalMember(owner = "client!no", name = "x", descriptor = "(I)V", line = 215)
    public static final void method37(int arg0) {
        class65.method625((long) class181.field3045);
        if (class311.field4933 != -1) {
            class212.method1571(class311.field4933, (byte) 26);
        }
        field77++;
        for (int var1 = 0; var1 < class215.field3602; var1++) {
            if (class272.field4337[var1]) {
                class224.field3746[var1] = true;
            }
            class127.field2211[var1] = class272.field4337[var1];
            class272.field4337[var1] = false;
        }
        if (arg0 != -24604) {
            field74 = (String) null;
        }
        class104.field1748 = -1;
        class262.field4249 = class181.field3045;
        class280.field4435 = -1;
        class166.field2902 = null;
        if (class43.field680) {
            class155.field2759 = true;
        }
        if (class311.field4933 != -1) {
            class215.field3602 = 0;
            class1.method6(-24489);
        }
        if (class43.field680) {
            class169.method1335();
        } else {
            class47.method403();
        }
        class31.field446 = 0;
    }
}
