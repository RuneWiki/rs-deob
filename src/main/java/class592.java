import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class592 extends class583 {

    @OriginalMember(owner = "client!nu", name = "t", descriptor = "I")
    public static int field8338 = 0;

    @OriginalMember(owner = "client!nu", name = "C", descriptor = "[[I")
    public static int[][] field8347 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "Las;")
    public static class151 field8344 = new class151(9, 0, 4, 1);

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
    public static int field8348 = 0;

    @OriginalMember(owner = "client!nu", name = "q", descriptor = "I")
    public static int field8335;

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
    public static int field8336;

    @OriginalMember(owner = "client!nu", name = "s", descriptor = "I")
    public int field8337;

    @OriginalMember(owner = "client!nu", name = "u", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!nu", name = "w", descriptor = "I")
    public int field8341;

    @OriginalMember(owner = "client!nu", name = "x", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!nu", name = "y", descriptor = "I")
    public int field8343;

    @OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
    public static int field8345;

    @OriginalMember(owner = "client!nu", name = "B", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!nu", name = "v", descriptor = "Ljava/lang/String;")
    public String field8340;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(B)I")
    public final int method3345(byte arg0) {
        if (arg0 >= -90) {
            this.method3351(73);
        }
        ++field8336;
        return (int) (255L & super.field2546 >>> 32);
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(B)V")
    public static void method3346(byte arg0) {
        field8347 = null;
        field8344 = null;
        int var1 = -3 / ((arg0 - 29) / 35);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)I")
    public final int method3347(int arg0) {
        ++field8335;
        return arg0 != 6 ? 5 : (int) super.field2546;
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)J")
    public final long method3348(int arg0) {
        ++field8339;
        return arg0 != 0 ? -64L : super.field8207 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)V")
    public static final void method3349(int arg0) {
        class20.method122(0);
        ++field8345;
        class89.field1072.field9146 = 0;
        class398.field5617 = 0;
        class383.field5465 = null;
        class48.field565 = 0;
        class294.field4138 = null;
        class187.field2519 = null;
        class561.field7879 = 0;
        class496.field7130 = null;
        class361.method2312(0);
        class413.method2538(false);
        int var1 = -37 / ((20 - arg0) / 38);
        for (int var2 = 0; var2 < 2048; ++var2) {
            class309.field4311[var2] = null;
        }
        class660.field9039 = null;
        for (int var3 = 0; ~var3 > ~class438.field6239; ++var3) {
            class468 var5 = class30.field399[var3].field10289;
            if (var5 != null) {
                var5.field8001 = -1;
            }
        }
        class510.method3016(true);
        class97.field1168 = 1;
        class218.field2850 = -1;
        class419.field5919 = -1;
        class60.method514(false, 10);
        for (int var4 = 0; var4 < 100; ++var4) {
            class583.field8210[var4] = true;
        }
        class383.method2433(-120);
        class606.field8532 = 0L;
        class401.field5699 = null;
    }

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "(I)V")
    public final void method3350(int arg0) {
        ++field8346;
        if (arg0 == 0) {
            super.field8207 = super.field8207 & Long.MIN_VALUE | class479.method2864((byte) -59) + 500L;
            class28.field372.method3999(this, 21934);
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(II)V")
    public class592(int arg0, int arg1) {
        super.field2546 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "(I)V")
    public final void method3351(int arg0) {
        super.field8207 |= Long.MIN_VALUE;
        ++field8342;
        if (~this.method3348(arg0) == -1L) {
            class1.field6.method3999(this, 21934);
        }
    }
}
