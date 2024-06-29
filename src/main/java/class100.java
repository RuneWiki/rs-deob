import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class100 {

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lqc;")
    public class107 field2334 = new class107();

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2324 = 2;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lvc;")
    private static class137 field2327 = class45.method325("New User", -46);

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lvc;")
    public static class137 field2336 = field2327;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Lvc;")
    private static class137 field2341 = class45.method325("Prepared sound engine", -46);

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lvc;")
    public static class137 field2326 = field2341;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "[I")
    public static int[] field2344 = new int[1000];

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "Z")
    public static boolean field2345 = false;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "J")
    public static long field2331;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Lqc;")
    private class107 field2346;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "[[B")
    public static byte[][] field2329;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lqc;")
    public final class107 method721(int arg0) {
        field2343++;
        class107 var2 = this.field2334.field2499;
        if (this.field2334 == var2) {
            this.field2346 = null;
            return null;
        }
        if (arg0 != -21746) {
            this.method731((byte) -48);
        }
        this.field2346 = var2.field2499;
        return var2;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILqc;)V")
    public final void method722(int arg0, class107 arg1) {
        field2338++;
        if (arg0 != 15346) {
            return;
        }
        if (arg1.field2499 != null) {
            arg1.method776(0);
        }
        arg1.field2499 = this.field2334;
        arg1.field2500 = this.field2334.field2500;
        arg1.field2499.field2500 = arg1;
        arg1.field2500.field2499 = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Lqc;")
    public final class107 method723(int arg0) {
        field2333++;
        class107 var2 = this.field2334.field2500;
        if (this.field2334 == var2) {
            return null;
        }
        if (arg0 >= -29) {
            this.method728(-22);
        }
        var2.method776(0);
        return var2;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Lqc;")
    public final class107 method724(boolean arg0) {
        if (arg0) {
            return null;
        }
        field2339++;
        class107 var2 = this.field2334.field2499;
        if (this.field2334 == var2) {
            return null;
        } else {
            var2.method776(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lqc;")
    public final class107 method725(byte arg0) {
        if (arg0 != -38) {
            this.field2346 = null;
        }
        field2325++;
        class107 var2 = this.field2346;
        if (this.field2334 == var2) {
            this.field2346 = null;
            return null;
        } else {
            this.field2346 = var2.field2499;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)Lqc;")
    public final class107 method726(int arg0) {
        class107 var2 = this.field2334.field2500;
        if (arg0 != 0) {
            this.method731((byte) -123);
        }
        field2347++;
        if (this.field2334 == var2) {
            this.field2346 = null;
            return null;
        } else {
            this.field2346 = var2.field2500;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
    public static final void method727(int arg0) {
        if (arg0 != 3) {
            field2341 = null;
        }
        if (class78.field1747 == 1) {
            if (class36.field788 >= 6 && class36.field788 <= 106 && class38.field835 >= 467 && class38.field835 <= 499) {
                class116.field2762 = true;
                class91.field2145++;
                class21.field453 = (class21.field453 + 1) % 4;
                class80.field1825 = true;
                class72.field1527.method845(13, arg0 + 97);
                class72.field1527.method837(arg0 + 113, class21.field453);
                class72.field1527.method837(114, class71.field1510);
                class72.field1527.method837(96, class110.field2606);
            }
            if (class36.field788 >= 135 && class36.field788 <= 235 && class38.field835 >= 467 && class38.field835 <= 499) {
                class80.field1825 = true;
                class71.field1510 = (class71.field1510 + 1) % 3;
                class116.field2762 = true;
                class72.field1527.method845(13, 100);
                class91.field2145++;
                class72.field1527.method837(-109, class21.field453);
                class72.field1527.method837(-72, class71.field1510);
                class72.field1527.method837(71, class110.field2606);
            }
            if (class36.field788 >= 273 && class36.field788 <= 373 && class38.field835 >= 467 && class38.field835 <= 499) {
                class110.field2606 = (class110.field2606 + 1) % 3;
                class91.field2145++;
                class80.field1825 = true;
                class116.field2762 = true;
                class72.field1527.method845(13, 100);
                class72.field1527.method837(arg0 ^ 0xFFFFFF80, class21.field453);
                class72.field1527.method837(86, class71.field1510);
                class72.field1527.method837(arg0 ^ 0xFFFFFF93, class110.field2606);
            }
            if (class36.field788 >= 412 && class36.field788 <= 512 && class38.field835 >= 467 && class38.field835 <= 499) {
                if (class56.field1201 == -1) {
                    class2.method18(arg0 ^ 0xFFFFFFFC);
                    if (class19.field411 != -1) {
                        class45.field1022 = false;
                        class45.field1005 = class45.field999;
                        class141.field3327 = class56.field1201 = class19.field411;
                    }
                } else {
                    class109.method792(0, class98.field2290, arg0 - 7, class45.field999);
                    if (class93.field2205 != null) {
                        class109.method792(0, class93.field2205, -4, class45.field999);
                    }
                }
            }
        }
        field2337++;
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V")
    public final void method728(int arg0) {
        if (arg0 < 30) {
            return;
        }
        field2332++;
        while (true) {
            class107 var2 = this.field2334.field2500;
            if (this.field2334 == var2) {
                return;
            }
            var2.method776(0);
        }
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V")
    public static void method729(int arg0) {
        field2336 = null;
        field2344 = null;
        field2329 = null;
        field2327 = null;
        field2341 = null;
        field2326 = null;
        if (arg0 != 30330) {
            field2336 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(ILqc;)V")
    public final void method730(int arg0, class107 arg1) {
        field2335++;
        if (arg1.field2499 != null) {
            arg1.method776(0);
        }
        arg1.field2500 = this.field2334;
        if (arg0 == 467) {
            arg1.field2499 = this.field2334.field2499;
            arg1.field2499.field2500 = arg1;
            arg1.field2500.field2499 = arg1;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Lqc;")
    public final class107 method731(byte arg0) {
        field2340++;
        if (arg0 != -117) {
            field2329 = null;
        }
        class107 var2 = this.field2346;
        if (this.field2334 == var2) {
            this.field2346 = null;
            return null;
        } else {
            this.field2346 = var2.field2500;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class100() {
        this.field2334.field2499 = this.field2334;
        this.field2334.field2500 = this.field2334;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lqc;ILqc;)V")
    public final void method732(class107 arg0, int arg1, class107 arg2) {
        field2330++;
        if (arg0.field2499 != null) {
            arg0.method776(0);
        }
        arg0.field2499 = arg2.field2499;
        arg0.field2500 = arg2;
        arg0.field2499.field2500 = arg0;
        if (arg1 != -31501) {
            field2327 = null;
        }
        arg0.field2500.field2499 = arg0;
    }
}
