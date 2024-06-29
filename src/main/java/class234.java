import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class234 extends class5 {

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public int field3568;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "[I")
    public int[] field3570;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "[[I")
    public int[][] field3558;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "[I")
    public int[] field3566;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "[Z")
    public boolean[] field3565;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Z")
    public static boolean field3557 = false;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field3556 = 0;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field3563 = 0;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "[Ll;")
    public static class10[] field3564 = new class10[14];

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field3569 = 0;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "Lwn;")
    public static class330 field3567;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V", line = 8)
    public static final void method1638(int arg0) {
        field3560++;
        class241.method1673();
        class161.field2525 = null;
        class277.field4307 = -1;
        class267.method1874((byte) 63);
        class256.field3917.method737(3374);
        class233.field3552 = new class214();
        ((class265) class164.field2662).method1862(27891);
        class221.method1570();
        class315.field4885 = new class255[255];
        class315.field4879 = 0;
        class140.method1063();
        class125.method929();
        class94.method681(0);
        class267.method1873(false, (byte) -32);
        class230.method1620((byte) -118);
        class25.method201(121);
        for (int var1 = 0; var1 < 2048; var1++) {
            class270 var2 = class201.field3096[var1];
            if (var2 != null) {
                var2.field4729 = null;
            }
        }
        if (class73.field1058) {
            class125.method932(104, 104);
            class1.method8(256, class235.field3578);
            class249.method1703();
        }
        int var3 = 46 / ((arg0 + 38) / 51);
        class96.method722(class264.field4087, class250.field3766, (byte) 61);
        class148.method1115(0, class264.field4087);
        class284.field4425 = null;
        class280.field4353 = null;
        class224.field3429 = null;
        class34.field499 = null;
        class277.field4299 = null;
        if (class152.field2308 == 5) {
            class283.method1957(class264.field4087, -111);
        }
        if (class152.field2308 == 10) {
            class270.method1889(-1206115993, false);
        }
        if (class152.field2308 == 30) {
            class101.method758(124, 25);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 86)
    public static void method1639(boolean arg0) {
        field3564 = null;
        if (!arg0) {
            field3562 = 27;
        }
        field3567 = null;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I[B)V", line = 109)
    public class234(int arg0, byte[] arg1) {
        this.field3568 = arg0;
        class254 var3 = new class254(arg1);
        this.field3561 = var3.method1774((byte) -98);
        this.field3570 = new int[this.field3561];
        this.field3558 = new int[this.field3561][];
        this.field3566 = new int[this.field3561];
        this.field3565 = new boolean[this.field3561];
        for (int var4 = 0; var4 < this.field3561; var4++) {
            this.field3570[var4] = var3.method1774((byte) 115);
        }
        for (int var5 = 0; var5 < this.field3561; var5++) {
            this.field3565[var5] = var3.method1774((byte) 18) == 1;
        }
        for (int var6 = 0; var6 < this.field3561; var6++) {
            this.field3566[var6] = var3.method1755(false);
        }
        for (int var7 = 0; var7 < this.field3561; var7++) {
            this.field3558[var7] = new int[var3.method1774((byte) 103)];
        }
        for (int var8 = 0; var8 < this.field3561; var8++) {
            for (int var9 = 0; var9 < this.field3558[var8].length; var9++) {
                this.field3558[var8][var9] = var3.method1774((byte) -101);
            }
        }
    }
}
