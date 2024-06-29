import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class31 extends class106 {

    @OriginalMember(owner = "client!da", name = "K", descriptor = "Leh;")
    public static class47 field586 = class195.method1282((byte) -4, "Wordpack geladen)3");

    @OriginalMember(owner = "client!da", name = "O", descriptor = "I")
    public static volatile int field590 = 0;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "[J")
    public static long[] field593 = new long[200];

    @OriginalMember(owner = "client!da", name = "V", descriptor = "[[[Lea;")
    public static class40[][][] field597 = new class40[4][104][104];

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public static int field595 = 0;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "Leh;")
    private static class47 field591 = class195.method1282((byte) -4, "World");

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public static int field596 = 1;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "Leh;")
    public static class47 field584 = field591;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "Leh;")
    public static class47 field583 = field591;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "B")
    public byte field588;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "Lda;")
    public static class31 field587;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "Lfd;")
    public class52 field589;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILca;ZI)V")
    public static final void method274(int arg0, int arg1, int arg2, class22 arg3, boolean arg4, int arg5) {
        field594++;
        if (class35.field688 >= 50 || (arg3.field423 == null || arg3.field423.length <= arg1)) {
            return;
        }
        int var6 = arg3.field423[arg1];
        if (var6 == 0) {
            return;
        }
        int var7 = var6 >> 8;
        int var8 = var6 >> 4 & 0x7;
        int var9 = var6 & 0xF;
        if (var9 == 0) {
            if (arg4) {
                class22.method215((byte) -99, var8, 0, var7);
            }
        } else if (class159.field3099 != 0) {
            class21.field398[class35.field688] = var7;
            client.field553[class35.field688] = var8;
            int var10 = (arg2 - 64) / 128;
            class100.field2106[class35.field688] = 0;
            class52.field997[class35.field688] = null;
            int var11 = (arg5 - 64) / 128;
            class110.field2273[class35.field688] = (var10 << 16) + (var11 << 8) + var9;
            class35.field688++;
            if (arg0 != -31182) {
                method275((byte) -54);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static void method275(byte arg0) {
        int var1 = 46 % ((47 - arg0) / 54);
        field597 = null;
        field593 = null;
        field583 = null;
        field591 = null;
        field586 = null;
        field587 = null;
        field584 = null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
    public static final void method276(int arg0, int arg1, int arg2) {
        field585++;
        if (arg0 != -422071548) {
            method275((byte) 108);
        }
        int[] var3 = new int[4];
        var3[0] = arg2;
        int[] var4 = new int[4];
        int var5 = 1;
        var4[0] = arg1;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class110.field2286[var6] != arg2) {
                var3[var5] = class110.field2286[var6];
                var4[var5] = class125.field2515[var6];
                var5++;
            }
        }
        class110.field2286 = var3;
        class125.field2515 = var4;
        class118.method921(class69.field1520.length - 1, class110.field2286, 0, class125.field2515, class69.field1520, true);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III[[[I)V")
    public static final void method277(int arg0, int arg1, int arg2, int[][][] arg3) {
        class8.field167 = arg0;
        class103.field2156 = arg1;
        class100.field2102 = arg2;
        class173.field3351 = new class152[arg0][arg1][arg2];
        class106.field2215 = new int[arg0][arg1 + 1][arg2 + 1];
        class41.field821 = arg3;
        class135.method982();
    }
}
