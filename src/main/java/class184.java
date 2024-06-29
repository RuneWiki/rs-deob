import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class184 extends class116 {

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field3154 = 0;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "Lda;")
    public static class275 field3147 = class255.method1672(95, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "Lda;")
    public static class275 field3157 = class255.method1672(118, "::qa_op_test");

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "[J")
    public static long[] field3156 = new long[1000];

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public int field3145;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "Lfd;")
    public static class229 field3159;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "Lda;")
    public class275 field3146;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
    public final void method1226(byte arg0) {
        ++field3153;
        super.field2057 |= Long.MIN_VALUE;
        if (arg0 != 26) {
            this.method1228((byte) 85);
        }
        if (this.method1232((byte) -127) == 0L) {
            class174.field3011.method1282(this, (byte) 15);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)V")
    public static final void method1227(boolean arg0, int arg1) {
        ++field3149;
        byte var2 = 4;
        byte[][] var3 = class248.field4369;
        if (arg1 != -18643) {
            field3157 = null;
        }
        int var4 = var3.length;
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            int var11 = (class61.field1031[var5] & 255) * 64 + -class234.field4083;
            int var12 = (class61.field1031[var5] >> 8) * 64 + -class16.field237;
            byte[] var13 = var3[var5];
            if (var13 != null) {
                class160.method1116(true);
                class50.method316(var12, class66.field1085 * 8 + -48, (byte) 124, var11, class173.field3003, var13, class54.field921 * 8 + -48, arg0);
            }
        }
        for (int var6 = 0; ~var4 < ~var6; ++var6) {
            int var7 = (class61.field1031[var6] >> 8) * 64 - class16.field237;
            int var8 = (class61.field1031[var6] & 255) * 64 + -class234.field4083;
            byte[] var9 = var3[var6];
            if (var9 == null && ~class66.field1085 > -801) {
                class160.method1116(true);
                for (int var10 = 0; var10 < var2; ++var10) {
                    class67.method452(64, arg1 + 29331, var7, 64, var10, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)I")
    public final int method1228(byte arg0) {
        ++field3150;
        if (arg0 != 98) {
            field3154 = -105;
        }
        return (int) super.field1707;
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V")
    public static void method1229(int arg0) {
        field3157 = null;
        field3156 = null;
        if (arg0 == 0) {
            field3159 = null;
            field3147 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V")
    public final void method1230(int arg0) {
        super.field2057 = 500L + class121.method888((byte) -119) | super.field2057 & Long.MIN_VALUE;
        ++field3144;
        if (arg0 == 1000) {
            class4.field54.method1282(this, (byte) 15);
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(B)I")
    public final int method1231(byte arg0) {
        if (arg0 != 114) {
            field3156 = null;
        }
        ++field3152;
        return (int) (255L & super.field1707 >>> 32);
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(B)J")
    public final long method1232(byte arg0) {
        ++field3143;
        int var2 = -126 / ((arg0 - -61) / 63);
        return super.field2057 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(II)V")
    public class184(int arg0, int arg1) {
        super.field1707 = (long) arg0 << 32 | (long) arg1;
    }
}
