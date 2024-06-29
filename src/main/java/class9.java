import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 extends class67 {

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public int field169;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "Led;")
    public static class43 field160 = class191.method1219("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", false);

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "[Z")
    public static boolean[] field165 = new boolean[100];

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "[I")
    public static int[] field168 = new int[50];

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "Z")
    public static boolean field163 = false;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    public static int field170 = -1;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "[I")
    public static int[] field167 = new int[] { 0, 1, -2, 0, 0, 0, 0, 6, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 6, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 2, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 2, 0, 6, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 6, 0, 3, 0, 0, -2, 20, 0, 2, 2, 0, 0, 0, 0, 0, 3, 0, 0, 2, 0, 15, 0, 0, 5, -1, -2, -2, 0, 0, 0, 14, 6, -1, 0, -1, -1, 0, 0, 0, 0, 12, 0, 10, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 5, 4, 0, 24, 5, 0, 4, 0, 0, 0, 0, 0, 1, 0, 0, -2, 0, 0, 0, -2, 4, 5, 0, 7, 4, 0, 0, 0, 6, 0, 0, 8, 0, 0, 0, 0, 0, 6, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 11, 0, 0, 0, 7, 0, 6, 0, 0, 6, 0, 0, 0, 3, 0, 3, 0, -2, 0, 10, 0, 0, -2, 0, 0, 4, 0, 6, 0, 0, 0, 0, 0, 4 };

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "Z")
    public static boolean field171 = false;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "Led;")
    public static class43 field172 = class191.method1219("W-=hlen Sie eine Welt", false);

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public static int field166 = 0;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "J")
    public static long field162;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "Lnb;")
    public static class120 field161;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(JB)Led;")
    public static final class43 method47(long arg0, byte arg1) {
        field158++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else if (arg1 > -76) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class129.field2612[(int) (var8 - arg0 * 37L)];
            }
            class43 var7 = new class43();
            var7.field844 = var6;
            var7.field818 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
    public static void method48(int arg0) {
        field172 = null;
        field167 = null;
        field161 = null;
        if (arg0 == 28403) {
            field168 = null;
            field160 = null;
            field165 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(II)V")
    public class9(int arg0, int arg1) {
        this.field169 = arg1;
        this.field164 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static final void method49(byte arg0) {
        class30.field568.method1108((byte) -90);
        int var1 = -23 % ((arg0 + 49) / 57);
        field159++;
    }
}
