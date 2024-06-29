import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 implements class55 {

    @OriginalMember(owner = "client!a", name = "y", descriptor = "Lpb;")
    private class100 field25 = new class100();

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    private int field28 = 128;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "D")
    private double field29 = 1.0D;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    private int field31 = 0;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "Lnb;")
    private class88 field27;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    private int field26;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "[Lce;")
    private class20[] field17;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lvc;")
    private static class137 field1 = class45.method325("Prepared visibility map", -46);

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lvc;")
    private static class137 field11 = class45.method325("Enter object name", -46);

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Lvc;")
    public static class137 field15 = field1;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Lvc;")
    public static class137 field16 = class45.method325("Schlie-8en", -46);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Lvc;")
    private static class137 field2 = class45.method325("Please check your message)2centre for details)3", -46);

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Lvc;")
    public static class137 field21 = field11;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "Lvc;")
    private static class137 field24 = class45.method325("Remove", -46);

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lvc;")
    public static class137 field22 = field2;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "Lvc;")
    public static class137 field30 = class45.method325("k", -46);

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lvc;")
    public static class137 field8 = field24;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Loa;")
    public static class93 field4;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILnb;I)Z")
    public static final boolean method1(int arg0, class88 arg1, int arg2) {
        if (arg0 != -21847) {
            method1(-92, null, 49);
        }
        field14++;
        byte[] var3 = arg1.method658(118, arg2);
        if (var3 == null) {
            return false;
        } else {
            class128.method958((byte) -107, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)Z")
    public final boolean method2(int arg0, int arg1) {
        if (arg0 != 21518) {
            this.field27 = null;
        }
        field10++;
        return this.field17[arg1].field419;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public static void method3(boolean arg0) {
        field30 = null;
        field24 = null;
        field15 = null;
        field8 = null;
        field16 = null;
        field22 = null;
        field21 = null;
        field1 = null;
        field11 = null;
        field2 = null;
        field4 = null;
        if (arg0) {
            method1(-100, null, 19);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
    public final boolean method4(int arg0, int arg1) {
        field12++;
        if (arg0 == 26399) {
            return this.field28 == 64;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)V")
    public final void method5(int arg0, byte arg1) {
        int var3 = 0;
        int var4 = 99 / ((arg1 + 69) / 37);
        while (var3 < this.field17.length) {
            class20 var5 = this.field17[var3];
            if (var5 != null && var5.field414 != 0 && var5.field415) {
                var5.method176(arg0);
                var5.field415 = false;
            }
            var3++;
        }
        field13++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)[I")
    public final int[] method6(int arg0, boolean arg1) {
        class20 var3 = this.field17[arg0];
        if (arg1) {
            this.field29 = -1.3650957534939026D;
        }
        field5++;
        if (var3 != null) {
            if (var3.field422 != null) {
                this.field25.method722(15346, var3);
                var3.field415 = true;
                return var3.field422;
            }
            boolean var4 = var3.method175(this.field29, this.field28, this.field27);
            if (var4) {
                if (this.field31 == 0) {
                    class20 var5 = (class20) this.field25.method724(false);
                    var5.method173();
                } else {
                    this.field31--;
                }
                this.field25.method722(15346, var3);
                var3.field415 = true;
                return var3.field422;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static final void method7(byte arg0) {
        field23++;
        if (class89.field2134 != 0) {
            return;
        }
        class59.field1270 = 1;
        class29.field646[0] = class48.field1063;
        class78.field1721[0] = 1005;
        if (class80.field1777 != -1) {
            class39.field857 = -1;
            class10.field198 = -1;
            class132.method973(503, 0, class32.field693, class80.field1777, 765, 0, 90, class126.field2956, 0);
            class44.field981 = class10.field198;
            class49.field1106 = class39.field857;
            return;
        }
        class11.method72(-102);
        class10.field198 = -1;
        class39.field857 = -1;
        boolean var1 = false;
        if (class126.field2956 > 4 && class32.field693 > 4 && class126.field2956 < 516 && class32.field693 < 338) {
            if (class56.field1201 == -1) {
                class132.method970(4);
            } else {
                class132.method973(338, 4, class32.field693, class56.field1201, 516, 0, 103, class126.field2956, 4);
            }
        }
        class44.field981 = class10.field198;
        class49.field1106 = class39.field857;
        class10.field198 = -1;
        class39.field857 = -1;
        if (class126.field2956 > 553 && class32.field693 > 205 && class126.field2956 < 743 && class32.field693 < 466) {
            if (class112.field2670 != -1) {
                class132.method973(466, 553, class32.field693, class112.field2670, 743, 1, 70, class126.field2956, 205);
            } else if (class32.field679[class75.field1691] != -1) {
                class132.method973(466, 553, class32.field693, class32.field679[class75.field1691], 743, 1, 104, class126.field2956, 205);
            }
        }
        if (class48.field1086 != class10.field198) {
            class48.field1086 = class10.field198;
            class34.field737 = true;
        }
        class10.field198 = -1;
        if (arg0 < 107) {
            field4 = null;
        }
        if (class86.field2053 != class39.field857) {
            class34.field737 = true;
            class86.field2053 = class39.field857;
        }
        class39.field857 = -1;
        if (class126.field2956 > 17 && class32.field693 > 357 && class126.field2956 < 496 && class32.field693 < 453) {
            if (class73.field1543 != -1) {
                class132.method973(453, 17, class32.field693, class73.field1543, 496, 2, 120, class126.field2956, 357);
            } else if (class10.field221 != -1) {
                class132.method973(453, 17, class32.field693, class10.field221, 496, 3, -54, class126.field2956, 357);
            } else if (class32.field693 < 434 && class126.field2956 < 426) {
                class110.method844(class32.field693 - 357, -122, class126.field2956 - 17);
            }
        }
        if ((class73.field1543 != -1 || class10.field221 != -1) && class86.field2042 != class10.field198) {
            class80.field1825 = true;
            class86.field2042 = class10.field198;
        }
        if ((class73.field1543 != -1 || class10.field221 != -1) && class39.field857 != class131.field3040) {
            class131.field3040 = class39.field857;
            class80.field1825 = true;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class59.field1270 - 1; var2++) {
                if (class78.field1721[var2] < 1000 && class78.field1721[var2 + 1] > 1000) {
                    class137 var3 = class29.field646[var2];
                    var1 = false;
                    class29.field646[var2] = class29.field646[var2 + 1];
                    class29.field646[var2 + 1] = var3;
                    int var4 = class78.field1721[var2];
                    class78.field1721[var2] = class78.field1721[var2 + 1];
                    class78.field1721[var2 + 1] = var4;
                    int var5 = class56.field1198[var2];
                    class56.field1198[var2] = class56.field1198[var2 + 1];
                    class56.field1198[var2 + 1] = var5;
                    int var6 = class59.field1282[var2];
                    class59.field1282[var2] = class59.field1282[var2 + 1];
                    class59.field1282[var2 + 1] = var6;
                    int var7 = class139.field3240[var2];
                    class139.field3240[var2] = class139.field3240[var2 + 1];
                    class139.field3240[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZB)V")
    public static final void method8(boolean arg0, byte arg1) {
        if (arg1 >= -15) {
            return;
        }
        field7++;
        if (class139.field3225 == null) {
            return;
        }
        try {
            class109 var2 = new class109(4);
            var2.method837(56, arg0 ? 2 : 3);
            var2.method806(0, (byte) -78);
            class139.field3225.method440(0, 4, false, var2.field2547);
        } catch (IOException var4) {
            try {
                class139.field3225.method434(79);
            } catch (Exception var3) {
            }
            class139.field3225 = null;
            class24.field579++;
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)V")
    public static final void method9(int arg0, int arg1) {
        field6++;
        if (!class125.method936(arg1, (byte) 72)) {
            return;
        }
        class85[] var2 = class36.field795[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class85 var4 = var2[var3];
            if (var4 != null) {
                var4.field1970 = 0;
                var4.field1917 = 0;
            }
        }
        if (arg0 != -14824) {
            method13(null, (byte) 83, -9);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BD)V")
    public final void method10(byte arg0, double arg1) {
        this.field29 = arg1;
        field19++;
        this.method12(89);
        if (arg0 != 2) {
            method3(false);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)I")
    public final int method11(boolean arg0, int arg1) {
        if (!arg0) {
            method3(true);
        }
        field18++;
        return this.field17[arg1] == null ? 0 : this.field17[arg1].field417;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public final void method12(int arg0) {
        int var2 = 0;
        int var3 = -117 % ((39 - arg0) / 38);
        while (var2 < this.field17.length) {
            if (this.field17[var2] != null) {
                this.field17[var2].method173();
            }
            var2++;
        }
        this.field25 = new class100();
        field20++;
        this.field31 = this.field26;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lfc;BI)V")
    public static final void method13(class39 arg0, byte arg1, int arg2) {
        field9++;
        if (class91.field2147 != null) {
            class91.field2147.field2583 = arg2 * 4 + 5;
            int var3 = class91.field2147.method832(14722);
            arg0.method281(var3, (byte) 0);
            return;
        }
        class44.method312(true, (byte) 0, null, 255, -321970768, 0, 255);
        class30.field664[arg2] = arg0;
        if (arg1 <= 81) {
            field21 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lnb;Lnb;IDI)V")
    public class1(class88 arg0, class88 arg1, int arg2, double arg3, int arg4) {
        this.field27 = arg1;
        this.field28 = arg4;
        this.field26 = arg2;
        this.field29 = arg3;
        this.field31 = this.field26;
        int[] var7 = arg0.method659(0, -3);
        int var8 = var7.length;
        this.field17 = new class20[arg0.method651(0, true)];
        for (int var9 = 0; var9 < var8; var9++) {
            class109 var10 = new class109(arg0.method668(0, -214, var7[var9]));
            this.field17[var7[var9]] = new class20(var10);
        }
    }
}
