import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class168 extends class255 {

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "I")
    public int field2971 = 0;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "Leb;")
    private static class230 field2961 = class68.method589(0, "Loading title screen )2 ");

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "[S")
    public static short[] field2960 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "Leb;")
    public static class230 field2964 = field2961;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "[Lth;")
    public static class109[] field2963 = new class109[32768];

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "Leb;")
    private static class230 field2973 = class68.method589(0, "Starting 3d Library");

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "Leb;")
    private static class230 field2965 = class68.method589(0, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
    public static int field2970 = 0;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "Leb;")
    public static class230 field2959 = field2965;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "Leb;")
    public static class230 field2966 = field2973;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "[S")
    public static short[] field2969;

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "[[[I")
    public static int[][][] field2976;

    @OriginalMember(owner = "client!uf", name = "db", descriptor = "[[[S")
    public static short[][][] field2977;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(II)I")
    public static int method1239(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lfk;B)V")
    public final void method1240(class14 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method200(255);
            if (var3 == 0) {
                field2972++;
                int var4 = 96 / ((27 - arg1) / 37);
                return;
            }
            this.method1242(arg0, (byte) -33, var3);
        }
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(II)Lq;")
    public static final class123 method1241(int arg0, int arg1) {
        field2967++;
        if (arg0 != 22) {
            return null;
        } else if (arg1 == 0) {
            return new class162();
        } else if (arg1 == 1) {
            return new class52();
        } else if (arg1 == 2) {
            return new class130();
        } else if (arg1 == 3) {
            return new class68();
        } else if (arg1 == 4) {
            return new class62();
        } else if (arg1 == 5) {
            return new class60();
        } else if (arg1 == 6) {
            return new class134();
        } else if (arg1 == 7) {
            return new class51();
        } else if (arg1 == 8) {
            return new class214();
        } else if (arg1 == 9) {
            return new class17();
        } else if (arg1 == 10) {
            return new class85();
        } else if (arg1 == 11) {
            return new class54();
        } else if (arg1 == 12) {
            return new class218();
        } else if (arg1 == 13) {
            return new class166();
        } else if (arg1 == 14) {
            return new class179();
        } else if (arg1 == 15) {
            return new class26();
        } else if (arg1 == 16) {
            return new class15();
        } else if (arg1 == 17) {
            return new class190();
        } else if (arg1 == 18) {
            return new class262();
        } else if (arg1 == 19) {
            return new class160();
        } else if (arg1 == 20) {
            return new class185();
        } else if (arg1 == 21) {
            return new class47();
        } else if (arg1 == 22) {
            return new class1();
        } else if (arg1 == 23) {
            return new class125();
        } else if (arg1 == 24) {
            return new class16();
        } else if (arg1 == 25) {
            return new class180();
        } else if (arg1 == 26) {
            return new class182();
        } else if (arg1 == 27) {
            return new class78();
        } else if (arg1 == 28) {
            return new class136();
        } else if (arg1 == 29) {
            return new class18();
        } else if (arg1 == 30) {
            return new class72();
        } else if (arg1 == 31) {
            return new class227();
        } else if (arg1 == 32) {
            return new class167();
        } else if (arg1 == 33) {
            return new class187();
        } else if (arg1 == 34) {
            return new class238();
        } else if (arg1 == 35) {
            return new class104();
        } else if (arg1 == 36) {
            return new class240();
        } else if (arg1 == 37) {
            return new class204();
        } else if (arg1 == 38) {
            return new class53();
        } else if (arg1 == 39) {
            return new class264();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lfk;BI)V")
    private final void method1242(class14 arg0, byte arg1, int arg2) {
        if (arg1 != -33) {
            this.method1242((class14) null, (byte) 11, 68);
        }
        if (arg2 == 2) {
            this.field2971 = arg0.method161(4);
        }
        field2962++;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V")
    public static void method1243(int arg0) {
        field2973 = null;
        field2977 = null;
        field2960 = null;
        field2964 = null;
        field2959 = null;
        field2961 = null;
        field2976 = null;
        field2966 = null;
        if (arg0 != 0) {
            field2966 = null;
        }
        field2969 = null;
        field2965 = null;
        field2963 = null;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(B)V")
    public static final void method1244(byte arg0) {
        class216.field3736 = 0;
        field2974++;
        class105.field1911 = 0;
        class245.method1707(64);
        class272.method1859(28445);
        class26.method261(true);
        if (arg0 != -23) {
            method1241(-21, -125);
        }
        for (int var1 = 0; var1 < class216.field3736; var1++) {
            int var3 = class234.field4080[var1];
            if (class259.field4584 != field2963[var3].field2256) {
                if (field2963[var3].field1956.method826(arg0 ^ 0x48)) {
                    class182.method1308(field2963[var3], -4448);
                }
                field2963[var3].field1956 = null;
                field2963[var3] = null;
            }
        }
        if (class16.field368 != class183.field3182.field318) {
            throw new RuntimeException("gnp1 pos:" + class183.field3182.field318 + " psize:" + class16.field368);
        }
        for (int var2 = 0; var2 < class18.field393; var2++) {
            if (field2963[class167.field2956[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class18.field393);
            }
        }
    }
}
