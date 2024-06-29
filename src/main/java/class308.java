import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class308 extends class287 {

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public int field5230;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public int field5228;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "Lmh;")
    public static class128 field5233 = class22.method156(127, "M");

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "Ldh;")
    public static class159 field5235 = new class159();

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field5236 = 0;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "[[[I")
    public static int[][][] field5227;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 4)
    public static void method2099(int arg0) {
        field5227 = (int[][][]) null;
        field5235 = null;
        field5233 = null;
        if (arg0 != 0) {
            method2102(-31);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIZ)V", line = 35)
    public static final void method2100(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class297.field5067 = arg1;
        class155.field2670 = arg2;
        class96.field1634 = arg3;
        class96.field1632 = new class150[arg0][class297.field5067][class155.field2670];
        class267.field4626 = new int[arg0][class297.field5067 + 1][class155.field2670 + 1];
        if (class247.field4247) {
            class38.field762 = new class154[4][];
        }
        if (arg4) {
            class260.field4495 = new class150[1][class297.field5067][class155.field2670];
            class91.field1557 = new int[class297.field5067][class155.field2670];
            field5227 = new int[1][class297.field5067 + 1][class155.field2670 + 1];
            if (class247.field4247) {
                class146.field2502 = new class154[1][];
            }
        } else {
            class260.field4495 = (class150[][][]) null;
            class91.field1557 = (int[][]) null;
            field5227 = (int[][][]) null;
            class146.field2502 = (class154[][]) null;
        }
        class156.method1031(false);
        class266.field4612 = new class96[500];
        class240.field4094 = 0;
        class144.field2472 = new class96[500];
        class226.field3955 = 0;
        class289.field4943 = new int[arg0][class297.field5067 + 1][class155.field2670 + 1];
        class298.field5087 = new class5[5000];
        class134.field2335 = 0;
        class30.field677 = new class5[100];
        class183.field3211 = new boolean[class96.field1634 + class96.field1634 + 1][class96.field1634 + class96.field1634 + 1];
        class268.field4659 = new boolean[class96.field1634 + class96.field1634 + 2][class96.field1634 + class96.field1634 + 2];
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V", line = 77)
    public static final void method2101(byte arg0) {
        field5231++;
        if (arg0 <= 113) {
            field5236 = -86;
        }
        class47.field937.method1834(17);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(II)V", line = 87)
    public class308(int arg0, int arg1) {
        this.field5230 = arg1;
        this.field5228 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V", line = 98)
    public static final void method2102(int arg0) {
        class314.field5335 = 0;
        class8.field188 = arg0;
        class212.method1457(arg0 ^ 0x40);
        class266.method1861(1);
        class167.method1097(true);
        field5229++;
        for (int var1 = 0; var1 < class8.field188; var1++) {
            int var2 = class207.field3637[var1];
            if (class293.field5011 != class201.field3560[var2].field477) {
                if (class201.field3560[var2].field1934.method1435((byte) 60)) {
                    class302.method2055(class201.field3560[var2], -1);
                }
                class201.field3560[var2].field1934 = null;
                class201.field3560[var2] = null;
            }
        }
        if (class102.field1749 != class54.field1051.field3380) {
            throw new RuntimeException("gnp1 pos:" + class54.field1051.field3380 + " psize:" + class102.field1749);
        }
        for (int var3 = 0; var3 < class37.field749; var3++) {
            if (class201.field3560[class39.field839[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class37.field749);
            }
        }
    }
}
