import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class174 extends class181 {

    @OriginalMember(owner = "client!o", name = "I", descriptor = "[I")
    public static int[] field3179 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field3188 = 0;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "[I")
    public static int[] field3180 = new int[50];

    @OriginalMember(owner = "client!o", name = "R", descriptor = "[I")
    public static int[] field3187 = new int[2048];

    @OriginalMember(owner = "client!o", name = "X", descriptor = "[I")
    public static int[] field3193 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public int field3190;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "Lli;")
    public class185 field3183;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "[[B")
    public static byte[][] field3182;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
    public final void method1233(int arg0) {
        ++field3181;
        super.field3318 |= Long.MIN_VALUE;
        if (this.method1238((byte) -125) == (long) arg0) {
            class241.field4307.method436((byte) -86, this);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public final void method1234(byte arg0) {
        ++field3194;
        super.field3318 = super.field3318 & Long.MIN_VALUE | 500L + class244.method1644((byte) -125);
        class276.field4883.method436((byte) -86, this);
        if (arg0 > -9) {
            field3188 = -78;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)I")
    public final int method1235(byte arg0) {
        int var2 = -11 / ((arg0 - 51) / 40);
        ++field3189;
        return (int) (255L & super.field1278 >>> 32);
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
    public static void method1236(byte arg0) {
        field3187 = null;
        field3193 = null;
        field3182 = null;
        if (arg0 != -12) {
            method1236((byte) -35);
        }
        field3179 = null;
        field3180 = null;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(B)I")
    public final int method1237(byte arg0) {
        if (arg0 <= 39) {
            return 105;
        } else {
            ++field3191;
            return (int) super.field1278;
        }
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(B)J")
    public final long method1238(byte arg0) {
        ++field3185;
        if (arg0 >= -124) {
            this.field3186 = -62;
        }
        return super.field3318 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLli;)I")
    public static final int method1239(byte arg0, class185 arg1) {
        ++field3195;
        int var2 = 0;
        int var3 = 67 / ((-9 - arg0) / 57);
        while (~var2 > ~class28.field472.length) {
            if (class28.field472[var2].method1312(arg1, -30055)) {
                return var2;
            }
            ++var2;
        }
        return -1;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(II)V")
    public class174(int arg0, int arg1) {
        super.field1278 = (long) arg1 | (long) arg0 << 32;
    }
}
