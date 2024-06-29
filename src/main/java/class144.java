import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class144 extends class61 {

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Llc;")
    public static class143 field2569 = class66.method374("gleiten:", -1);

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field2568 = 0;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Llc;")
    public static class143 field2577 = class66.method374("(R", -1);

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Lng;")
    public static class139 field2572 = new class139(50);

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "Llc;")
    public static class143 field2587 = class66.method374("blinken3:", -1);

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "Llc;")
    public static class143 field2590 = class66.method374("(Udns", -1);

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    public static int field2594 = 0;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field2588 = 50;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "[I")
    public static int[] field2592 = new int[field2588];

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "[I")
    public static int[] field2595 = new int[field2588];

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "[Llc;")
    public static class143[] field2589 = new class143[field2588];

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "[I")
    public static int[] field2586 = new int[field2588];

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "[I")
    public static int[] field2597 = new int[field2588];

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "[I")
    public static int[] field2598 = new int[field2588];

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "[I")
    public static int[] field2596 = new int[field2588];

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "[I")
    public static int[] field2583 = new int[field2588];

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public int field2573;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "[I")
    public int[] field2578;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "[I")
    public int[] field2581;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "[I")
    public int[] field2582;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "[Lia;")
    public class181[] field2575;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "[Lia;")
    public class181[] field2591;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "[[[B")
    public byte[][][] field2574;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)V")
    public static final void method915(byte arg0, int arg1) {
        field2580++;
        class166 var2 = class262.method1746(-67, arg1, 9);
        var2.method1098((byte) -126);
        if (arg0 != 37) {
            field2595 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)I")
    public static final int method916(boolean arg0) {
        if (arg0) {
            return 73;
        } else {
            field2576++;
            return 6;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILgf;)V")
    public static final void method917(int arg0, class7 arg1) {
        class23.field381 = class122.method739(class49.field959, arg1, 1);
        field2593++;
        if (arg0 != -1562678904) {
            return;
        }
        class99.field1784 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) (class59.field1142[var2] >> 16 & 0xFF);
            int var5 = (class59.field1142[var2 + 1] & 0xFF0000) >> 16;
            float var6 = ((float) var5 - var4) / 64.0F;
            float var7 = (float) (class59.field1142[var2] >> 8 & 0xFF);
            int var8 = class59.field1142[var2 + 1] >> 8 & 0xFF;
            float var9 = (float) (class59.field1142[var2] & 0xFF);
            float var10 = ((float) var8 - var7) / 64.0F;
            int var11 = class59.field1142[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var9) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class99.field1784[var2 * 64 + var13] = class119.method729((int) var9, class119.method729((int) var7 << 8, (int) var4 << 16));
                var4 += var6;
                var9 += var12;
                var7 += var10;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class99.field1784[var3] = class59.field1142[3];
        }
        class63.field1197 = new int[32768];
        class228.field4135 = new int[32768];
        class266.method1770(-90, (class100) null);
        class67.field1268 = new int[32768];
        class190.field3488 = new int[32768];
        class283.field4988 = new class160(128, 254);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)[Lvg;")
    public static final class230[] method918(byte arg0) {
        if (arg0 != 91) {
            return null;
        }
        class230[] var1 = new class230[class167.field2986];
        field2571++;
        for (int var2 = 0; var2 < class167.field2986; var2++) {
            int var3 = class41.field697[var2] * class153.field2766[var2];
            byte[] var4 = class282.field4961[var2];
            if (class44.field900[var2]) {
                byte[] var7 = class32.field546[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class119.method729(class129.method777(var7[var9] << 24, -16777216), class111.field1961[class129.method777(var4[var9], 255)]);
                }
                var1[var2] = new class253(class257.field4628, class70.field1332, class126.field2226[var2], class32.field536[var2], class41.field697[var2], class153.field2766[var2], var8);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class111.field1961[class129.method777(255, var4[var6])];
                }
                var1[var2] = new class160(class257.field4628, class70.field1332, class126.field2226[var2], class32.field536[var2], class41.field697[var2], class153.field2766[var2], var5);
            }
        }
        class258.method1708(0);
        return var1;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    public static final void method919(int arg0) {
        class186.field3380.method824(-123);
        if (arg0 != 13620) {
            method918((byte) 99);
        }
        field2570++;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
    public static void method920(int arg0) {
        field2569 = null;
        field2596 = null;
        field2595 = null;
        field2589 = null;
        field2592 = null;
        field2583 = null;
        if (arg0 != -27076) {
            return;
        }
        field2590 = null;
        field2572 = null;
        field2577 = null;
        field2586 = null;
        field2587 = null;
        field2597 = null;
        field2598 = null;
    }
}
