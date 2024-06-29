import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field196 = -1;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "[I")
    public static int[] field208 = new int[25];

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public int field210;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "J")
    public long field201;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "J")
    public static long field211;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Lol;")
    public static class208 field204;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Lhi;")
    public class219 field203;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[I")
    public static int[] field198;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[Llg;")
    public static class13[] field199;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[[Z")
    public static boolean[][] field197;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)Lsb;")
    public static final class224 method116(byte arg0, int arg1) {
        if (arg0 != -8) {
            return null;
        }
        field205++;
        if (arg1 == 0) {
            return new class10();
        } else if (arg1 == 1) {
            return new class31();
        } else if (arg1 == 2) {
            return new class203();
        } else if (arg1 == 3) {
            return new class90();
        } else if (arg1 == 4) {
            return new class240();
        } else if (arg1 == 5) {
            return new class47();
        } else if (arg1 == 6) {
            return new class195();
        } else if (arg1 == 7) {
            return new class187();
        } else if (arg1 == 8) {
            return new class244();
        } else if (arg1 == 9) {
            return new class3();
        } else if (arg1 == 10) {
            return new class106();
        } else if (arg1 == 11) {
            return new class57();
        } else if (arg1 == 12) {
            return new class257();
        } else if (arg1 == 13) {
            return new class137();
        } else if (arg1 == 14) {
            return new class266();
        } else if (arg1 == 15) {
            return new class22();
        } else if (arg1 == 16) {
            return new class58();
        } else if (arg1 == 17) {
            return new class204();
        } else if (arg1 == 18) {
            return new class251();
        } else if (arg1 == 19) {
            return new class178();
        } else if (arg1 == 20) {
            return new class118();
        } else if (arg1 == 21) {
            return new class107();
        } else if (arg1 == 22) {
            return new class53();
        } else if (arg1 == 23) {
            return new class236();
        } else if (arg1 == 24) {
            return new class279();
        } else if (arg1 == 25) {
            return new class242();
        } else if (arg1 == 26) {
            return new class246();
        } else if (arg1 == 27) {
            return new class74();
        } else if (arg1 == 28) {
            return new class153();
        } else if (arg1 == 29) {
            return new class176();
        } else if (arg1 == 30) {
            return new class66();
        } else if (arg1 == 31) {
            return new class225();
        } else if (arg1 == 32) {
            return new class27();
        } else if (arg1 == 33) {
            return new class143();
        } else if (arg1 == 34) {
            return new class4();
        } else if (arg1 == 35) {
            return new class258();
        } else if (arg1 == 36) {
            return new class38();
        } else if (arg1 == 37) {
            return new class281();
        } else if (arg1 == 38) {
            return new class7();
        } else if (arg1 == 39) {
            return new class91();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static final void method117(int arg0) {
        if (arg0 != 13) {
            return;
        }
        field202++;
        if (class219.field3563 < 0) {
            class219.field3563 = 0;
            class57.field804 = -1;
            class94.field1463 = -1;
        }
        if (class165.field2565 < class219.field3563) {
            class219.field3563 = class165.field2565;
            class94.field1463 = -1;
            class57.field804 = -1;
        }
        if (class158.field2435 < 0) {
            class158.field2435 = 0;
            class94.field1463 = -1;
            class57.field804 = -1;
        }
        if (class104.field1611 < class158.field2435) {
            class57.field804 = -1;
            class94.field1463 = -1;
            class158.field2435 = class104.field1611;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V")
    public static final void method118(int arg0, int arg1, int arg2, int arg3) {
        class49 var4 = class90.field1382[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class264 var5 = var4.field631;
        if (var5 != null) {
            var5.field4250 = var5.field4250 * arg3 / 16;
            var5.field4262 = var5.field4262 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static final void method119(int arg0) {
        class118.field1728.method1420(-1);
        if (arg0 > -123) {
            method118(13, -70, 112, -120);
        }
        field209++;
        class111.field1682.method1420(-1);
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public static void method120(int arg0) {
        field208 = null;
        field204 = null;
        field197 = null;
        if (arg0 != -24) {
            field197 = null;
        }
        field198 = null;
        field199 = null;
    }
}
