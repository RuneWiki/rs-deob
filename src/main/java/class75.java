import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class75 extends class237 {

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "[I")
    public int[] field944;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "[[I")
    public int[][] field934;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "[Z")
    public boolean[] field942;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "[I")
    public int[] field939;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "[I")
    public static int[] field940 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static volatile int field947 = 0;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "Leh;")
    public static class137 field938;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "[[Lwb;")
    public static class123[][] field937;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "[[[Ltl;")
    public static class246[][][] field943;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)I")
    public static final int method422(boolean arg0) {
        field948++;
        if (class209.field3336 == null) {
            return -1;
        } else if (arg0) {
            while (class216.field3470 < class209.field3336.field497) {
                if (class209.field3336.method219(class216.field3470, -119)) {
                    return class216.field3470++;
                }
                class216.field3470++;
            }
            return -1;
        } else {
            return -24;
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V")
    public static void method423(int arg0) {
        field943 = null;
        field940 = null;
        field938 = null;
        field937 = null;
        if (arg0 != -32384) {
            method423(93);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLeh;)I")
    public static final int method424(byte arg0, class137 arg1) {
        int var2 = 0;
        field935++;
        if (arg1.method938(class222.field3578, 843075268)) {
            var2++;
        }
        if (arg1.method938(class80.field993, 843075268)) {
            var2++;
        }
        if (arg1.method938(class240.field3957, 843075268)) {
            var2++;
        }
        if (arg1.method938(class155.field2489, arg0 ^ 0x32404EFD)) {
            var2++;
        }
        if (arg1.method938(class79.field987, 843075268)) {
            var2++;
        }
        if (arg0 != 57) {
            method423(60);
        }
        if (arg1.method938(class156.field2521, 843075268)) {
            var2++;
        }
        if (arg1.method938(class215.field3463, arg0 + 843075211)) {
            var2++;
        }
        if (arg1.method938(class90.field1129, arg0 + 843075211)) {
            var2++;
        }
        if (arg1.method938(class42.field523, arg0 + 843075211)) {
            var2++;
        }
        if (arg1.method938(class106.field1429, 843075268)) {
            var2++;
        }
        if (arg1.method938(class45.field578, 843075268)) {
            var2++;
        }
        if (arg1.method938(class25.field347, 843075268)) {
            var2++;
        }
        if (arg1.method938(class231.field3848, arg0 ^ 0x32404EFD)) {
            var2++;
        }
        if (arg1.method938(class70.field872, arg0 ^ 0x32404EFD)) {
            var2++;
        }
        if (arg1.method938(class136.field2152, 843075268)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I[B)V")
    public class75(int arg0, byte[] arg1) {
        this.field941 = arg0;
        class96 var3 = new class96(arg1);
        this.field945 = var3.method584(255);
        this.field944 = new int[this.field945];
        this.field934 = new int[this.field945][];
        this.field942 = new boolean[this.field945];
        this.field939 = new int[this.field945];
        for (int var4 = 0; var4 < this.field945; var4++) {
            this.field939[var4] = var3.method584(255);
        }
        for (int var5 = 0; var5 < this.field945; var5++) {
            this.field942[var5] = var3.method584(255) == 1;
        }
        for (int var6 = 0; var6 < this.field945; var6++) {
            this.field944[var6] = var3.method549(255);
        }
        for (int var7 = 0; var7 < this.field945; var7++) {
            this.field934[var7] = new int[var3.method584(255)];
        }
        for (int var8 = 0; var8 < this.field945; var8++) {
            for (int var9 = 0; var9 < this.field934[var8].length; var9++) {
                this.field934[var8][var9] = var3.method584(255);
            }
        }
    }
}
