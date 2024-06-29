import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class328 extends class199 {

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
    private int field4794 = 2048;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
    private int field4792 = 1024;

    @OriginalMember(owner = "client!sc", name = "ib", descriptor = "I")
    private int field4804 = 3072;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public static int field4789 = 0;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field4790 = null;

    @OriginalMember(owner = "client!sc", name = "jb", descriptor = "[Ljava/lang/String;")
    public static String[] field4805 = new String[500];

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!sc", name = "db", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!sc", name = "eb", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!sc", name = "hb", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!sc", name = "gb", descriptor = "Lfh;")
    public static class140 field4802;

    @OriginalMember(owner = "client!sc", name = "fb", descriptor = "Ltj;")
    public static class354 field4801;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)V", line = 6)
    public static final void method2267(int arg0) {
        class321.field4713.method2262(false);
        if (arg0 > -7) {
            method2271(93, (byte) -60);
        }
        field4798++;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V", line = 16)
    public class328() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[I", line = 28)
    public final int[] method190(int arg0, int arg1) {
        int[] var3 = this.field2802.method2502(arg1, -127);
        if (this.field2802.field5637) {
            int[] var4 = this.method1467(arg0 - 6029, arg1, 0);
            for (int var5 = 0; var5 < class95.field1235; var5++) {
                var3[var5] = (var4[var5] * this.field4794 >> 12) + this.field4792;
            }
        }
        if (arg0 != -1735) {
            this.field4794 = 38;
        }
        field4803++;
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V", line = 71)
    public static final void method2268(int arg0, boolean arg1) {
        field4788++;
        class323.method2235(false);
        if (class316.field4661 != 30 && class316.field4661 != 25) {
            return;
        }
        class5.field55++;
        if (class5.field55 < 50 && !arg1) {
            return;
        }
        class5.field55 = arg0;
        if (!class192.field2657 && class265.field3848 != null) {
            class251.field3681.method1309(23, 137);
            class238.field3439++;
            try {
                class265.field3848.method530(0, class251.field3681.field4350, class251.field3681.field4351, 30000);
                class251.field3681.field4351 = 0;
            } catch (IOException var3) {
                class192.field2657 = true;
            }
        }
        class323.method2235(false);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V", line = 101)
    public static void method2269(boolean arg0) {
        field4805 = null;
        if (!arg0) {
            method2267(19);
        }
        field4802 = null;
        field4801 = null;
        field4790 = null;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)[[I", line = 120)
    public final int[][] method215(int arg0, int arg1) {
        if (arg1 != -29869) {
            this.field4794 = -127;
        }
        int[][] var3 = this.field2796.method2187(arg0, -127);
        if (this.field2796.field4667) {
            int[][] var4 = this.method1459(0, arg0, (byte) -51);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class95.field1235; var11++) {
                var7[var11] = (var5[var11] * this.field4794 >> 12) + this.field4792;
                var9[var11] = (var6[var11] * this.field4794 >> 12) + this.field4792;
                var8[var11] = this.field4792 + (var10[var11] * this.field4794 >> 12);
            }
        }
        field4796++;
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZ)C", line = 164)
    public static final char method2270(char arg0, boolean arg1) {
        field4800++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else {
            if (arg1) {
                field4805 = (String[]) null;
            }
            if (arg0 == 'ß') {
                return 's';
            } else if (arg0 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg0 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(B)V", line = 199)
    public final void method189(byte arg0) {
        this.field4794 = this.field4804 - this.field4792;
        field4791++;
        int var2 = -41 % ((36 - arg0) / 44);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)Z", line = 209)
    public static final boolean method2271(int arg0, byte arg1) {
        if (arg1 > -47) {
            field4802 = (class140) null;
        }
        field4793++;
        return arg0 == 4 || arg0 == 8;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lfd;I)Lgg;", line = 224)
    public static final class176 method2272(class299 arg0, int arg1) {
        field4797++;
        if (arg1 != 0) {
            field4801 = (class354) null;
        }
        return new class176(arg0.method2043(true), arg0.method2043(true), arg0.method2043(true), arg0.method2043(true), arg0.method2085((byte) 74), arg0.method2085((byte) 99), arg0.method2096((byte) -122));
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLfd;I)V", line = 245)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4792 = arg1.method2083((byte) -45);
        } else if (arg2 == 1) {
            this.field4804 = arg1.method2083((byte) -127);
        } else if (arg2 == 2) {
            this.field2795 = arg1.method2096((byte) -122) == 1;
        }
        field4795++;
        if (arg0 != -43) {
            method2272((class299) null, 121);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lfd;I)Lde;", line = 278)
    public static final class313 method2273(class299 arg0, int arg1) {
        field4799++;
        int var2 = -35 % ((-arg1 - 22) / 34);
        return new class313(arg0.method2043(true), arg0.method2043(true), arg0.method2043(true), arg0.method2043(true), arg0.method2085((byte) 125), arg0.method2096((byte) -122));
    }
}
