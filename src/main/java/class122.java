import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class122 extends class152 {

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    private int field2032 = 1;

    @OriginalMember(owner = "client!w", name = "ab", descriptor = "I")
    private int field2041 = 1;

    @OriginalMember(owner = "client!w", name = "mb", descriptor = "I")
    private int field2053 = 204;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "[I")
    public static int[] field2033 = new int[128];

    @OriginalMember(owner = "client!w", name = "Z", descriptor = "[I")
    public static int[] field2040 = new int[100];

    @OriginalMember(owner = "client!w", name = "W", descriptor = "Lce;")
    public static class126 field2037 = class206.method1445(-7923, "welle:");

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    public static int field2034 = 0;

    @OriginalMember(owner = "client!w", name = "cb", descriptor = "Lwd;")
    public static class112 field2043 = null;

    @OriginalMember(owner = "client!w", name = "gb", descriptor = "Lce;")
    private static class126 field2047 = class206.method1445(-7923, "shake:");

    @OriginalMember(owner = "client!w", name = "db", descriptor = "Lce;")
    public static class126 field2044 = field2047;

    @OriginalMember(owner = "client!w", name = "jb", descriptor = "Lce;")
    public static class126 field2050 = class206.method1445(-7923, "");

    @OriginalMember(owner = "client!w", name = "hb", descriptor = "Lce;")
    public static class126 field2048 = field2047;

    @OriginalMember(owner = "client!w", name = "kb", descriptor = "I")
    public static int field2051 = 0;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!w", name = "eb", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!w", name = "fb", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!w", name = "nb", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!w", name = "lb", descriptor = "Lwd;")
    public static class112 field2052;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "[I")
    public static int[] field2038;

    @OriginalMember(owner = "client!w", name = "ib", descriptor = "[I")
    public static int[] field2049;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "[[[B")
    public static byte[][][] field2036;

    @OriginalMember(owner = "client!w", name = "bb", descriptor = "[[[B")
    public static byte[][][] field2042;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V", line = 3)
    public static final void method798(int arg0) {
        class238.field4013 = arg0;
        for (int var1 = 0; var1 < class197.field3377; var1++) {
            for (int var2 = 0; var2 < class65.field1094; var2++) {
                if (class297.field4940[arg0][var1][var2] == null) {
                    class297.field4940[arg0][var1][var2] = new class5(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)Lem;", line = 26)
    public static final class88 method799(byte arg0, int arg1) {
        if (arg0 < 87) {
            method802(-71);
        }
        field2035++;
        return class46.field712 && arg1 >= class12.field167 && arg1 <= class23.field315 ? class281.field4669[arg1 - class12.field167] : null;
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(II)V", line = 47)
    public static final void method800(int arg0, int arg1) {
        field2045++;
        if (arg1 == -1 || !class13.method75(arg1, (byte) -51)) {
            return;
        }
        class112[] var2 = class291.field4825[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class112 var4 = var2[var3];
            if (var4.field1876 != null) {
                class282 var5 = new class282();
                var5.field4697 = var4;
                var5.field4699 = var4.field1876;
                class172.method1253(2000000, true, var5);
            }
        }
        if (arg0 != 1) {
            field2047 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V", line = 224)
    public class122() {
        super(0, true);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V", line = 89)
    public static void method801(boolean arg0) {
        field2049 = null;
        field2042 = (byte[][][]) null;
        if (arg0) {
            return;
        }
        field2050 = null;
        field2036 = (byte[][][]) null;
        field2038 = null;
        field2052 = null;
        field2044 = null;
        field2048 = null;
        field2033 = null;
        field2043 = null;
        field2040 = null;
        field2037 = null;
        field2047 = null;
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V", line = 116)
    public static final void method802(int arg0) {
        field2046++;
        class48.method304();
        class218.field3658 = null;
        class73.field1180 = arg0;
        class57.method393(-31678);
        class104.field1653.method307(0);
        class259.field4334 = new class21();
        ((class232) class236.field3987).method1578(7);
        class256.field4312 = new class209[255];
        class256.field4301 = 0;
        class62.method425();
        class66.method488();
        class16.method88((byte) -76);
        class322.method2236(false, 0);
        class257.method1742(0);
        for (int var1 = 0; var1 < 2048; var1++) {
            class301 var2 = class85.field1352[var1];
            if (var2 != null) {
                var2.field4980 = null;
            }
        }
        if (class56.field846) {
            class66.method483(104, 104);
            class211.method1476();
        }
        class44.method274((byte) 77, class127.field2170, class274.field4612);
        class286.method1901(class127.field2170, 0);
        class41.field652 = null;
        class186.field3225 = null;
        class78.field1271 = null;
        class241.field4063 = null;
        class131.field2244 = null;
        if (class280.field4662 == 5) {
            class294.method1958(80, class127.field2170);
        }
        if (class280.field4662 == 10) {
            class144.method1054((byte) 5, false);
        }
        if (class280.field4662 == 30) {
            class280.method1872(arg0 - 107, 25);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILbb;)V", line = 179)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg0 != 8) {
            field2044 = (class126) null;
        }
        if (arg1 == 0) {
            this.field2041 = arg2.method948(arg0 ^ 0xFFFFFF8D);
        } else if (arg1 == 1) {
            this.field2032 = arg2.method948(-121);
        } else if (arg1 == 2) {
            this.field2053 = arg2.method942(true);
        }
        field2039++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)[I", line = 251)
    public final int[] method6(boolean arg0, int arg1) {
        field2054++;
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (!arg0) {
            field2044 = (class126) null;
        }
        if (this.field2776.field4516) {
            for (int var4 = 0; var4 < class244.field4133; var4++) {
                int var5 = class29.field406[var4];
                int var6 = field2038[arg1];
                int var7 = this.field2041 * var5 >> 12;
                int var8 = var5 % (4096 / this.field2041) * this.field2041;
                int var9 = this.field2032 * var6 >> 12;
                int var10 = var6 % (4096 / this.field2032) * this.field2032;
                if (var10 < this.field2053) {
                    for (var7 -= var9; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field2053 > var8) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field2053 > var8) {
                    int var11;
                    for (var11 = var7 - var9; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }
}
