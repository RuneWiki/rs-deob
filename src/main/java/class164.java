import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class164 extends class297 {

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "[I")
    public static int[] field2665 = new int[14];

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "Lok;")
    public static class160 field2669 = new class160(128);

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2671 = "Cancel";

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IZ)I", line = 4)
    public static final int method1232(int arg0, boolean arg1) {
        if (arg1) {
            method1232(-116, true);
        }
        field2662++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V", line = 17)
    public static final void method1233(int arg0) {
        class96.field1550 = 0;
        class88.field1420 = 0;
        field2664++;
        class57.method479(10045);
        class293.method2056((byte) 57);
        class34.method312(-124);
        for (int var1 = 0; var1 < class96.field1550; var1++) {
            int var2 = class251.field3703[var1];
            if (class307.field4869 != class197.field3029[var2].field4673) {
                if (class197.field3029[var2].field1381.method673(false)) {
                    class207.method1527(class197.field3029[var2], (byte) -127);
                }
                class197.field3029[var2].method682(32090, (class84) null);
                class197.field3029[var2] = null;
            }
        }
        if (class128.field2060 != class80.field1248.field48) {
            throw new RuntimeException("gnp1 pos:" + class80.field1248.field48 + " psize:" + class128.field2060);
        }
        for (int var3 = arg0; var3 < class83.field1290; var3++) {
            if (class197.field3029[class76.field1192[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class83.field1290);
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 66)
    public class164() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I", line = 70)
    public static int method1234(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V", line = 79)
    public static final void method1235(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class172.field2762 == 1) {
            class135.field2166[class18.field349 / 100].method698(class36.field538 - 8, class44.field697 + -8);
        }
        field2668++;
        if (class172.field2762 == 2) {
            class135.field2166[class18.field349 / 100 + 4].method698(class36.field538 - 8, class44.field697 - 8);
        }
        class333.method2333(false);
        if (arg0 != 21633) {
            method1233(17);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)[I", line = 107)
    public final int[] method173(int arg0, boolean arg1) {
        if (!arg1) {
            method1232(-54, true);
        }
        field2667++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            int[][] var4 = this.method2105(arg0, 2, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            for (int var8 = 0; var8 < class31.field491; var8++) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILpk;)V", line = 145)
    public static final void method1236(int arg0, class120 arg1) {
        field2666++;
        class282.field4418 = arg1;
        if (arg0 < 15) {
            method1235(95, -62, -79, 53, -32);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)V", line = 156)
    public static void method1237(boolean arg0) {
        field2665 = null;
        field2669 = null;
        if (arg0) {
            field2670 = -83;
        }
        field2671 = null;
    }
}
