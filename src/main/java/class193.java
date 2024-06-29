import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class193 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "[I")
    private int[] field3338;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Lr;")
    public static class66 field3337 = class93.method641(43, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Lr;")
    public static class66 field3340 = class93.method641(43, "headicons_prayer");

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field3342 = 1;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "[S")
    public static short[] field3339 = new short[] { 24, 49, 20, 33, 19, 4, 26, 25 };

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "[Lga;")
    public static class165[] field3346 = new class165[4];

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field3347 = 0;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Ljk;")
    public static class196 field3349;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "Lcj;")
    public static class28 field3348;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Z")
    public static boolean field3341;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "[Ljb;")
    public static class256[] field3343;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "[[[B")
    public static byte[][][] field3350;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)I")
    public final int method1261(int arg0, int arg1) {
        field3344++;
        int var3 = (this.field3338.length >> 1) + arg1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field3338[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3338[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "([I)V")
    public class193(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field3338 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field3338[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3338[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field3338[var5 + var5] = arg0[var4];
            this.field3338[var5 - (-var5 - 1)] = var4++;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method1262(int arg0) {
        if (arg0 != 20) {
            method1262(-7);
        }
        field3340 = null;
        field3337 = null;
        field3349 = null;
        field3346 = null;
        field3343 = null;
        field3348 = null;
        field3350 = null;
        field3339 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLcj;)V")
    public static final void method1263(byte arg0, class28 arg1) {
        field3345++;
        class101.field1974 = arg1;
        class87.field1699 = class101.field1974.method152(16, 0);
        if (arg0 != -101) {
            method1262(26);
        }
    }
}
