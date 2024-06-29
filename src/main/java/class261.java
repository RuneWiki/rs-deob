import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class261 {

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "[Lpp;")
    private class356[] field3315;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    private int field3319;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "Lpr;")
    public static class407 field3318 = new class407(68, -2);

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "Lce;")
    public static class278 field3322 = new class278();

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "J")
    private long field3320;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Lpp;")
    private class356 field3317;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 3)
    public static void method1483(int arg0) {
        if (arg0 == 68) {
            field3318 = null;
            field3322 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)Z", line = 14)
    public static final boolean method1484(int arg0, int arg1) {
        field3324++;
        class30.field353 = arg1 + 1 & 0xFFFF;
        class198.field2406 = true;
        if (arg0 <= 80) {
            field3322 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)Lpp;", line = 41)
    public final class356 method1485(int arg0) {
        field3323++;
        if (this.field3317 == null) {
            return null;
        }
        if (arg0 != 10522) {
            this.field3315 = null;
        }
        class356 var2 = this.field3315[(int) (this.field3320 & (long) (this.field3319 - 1))];
        while (this.field3317 != var2) {
            if (this.field3317.field4676 == this.field3320) {
                class356 var3 = this.field3317;
                this.field3317 = this.field3317.field4673;
                return var3;
            }
            this.field3317 = this.field3317.field4673;
        }
        this.field3317 = null;
        return null;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(JB)Lpp;", line = 77)
    public final class356 method1486(long arg0, byte arg1) {
        field3316++;
        if (arg1 <= 106) {
            this.field3317 = null;
        }
        this.field3320 = arg0;
        class356 var4 = this.field3315[(int) (arg0 & (long) (this.field3319 - 1))];
        for (this.field3317 = var4.field4673; this.field3317 != var4; this.field3317 = this.field3317.field4673) {
            if (this.field3317.field4676 == arg0) {
                class356 var5 = this.field3317;
                this.field3317 = this.field3317.field4673;
                return var5;
            }
        }
        this.field3317 = null;
        return null;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(I)V", line = 118)
    public class261(int arg0) {
        this.field3315 = new class356[arg0];
        this.field3319 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class356 var3 = this.field3315[var2] = new class356();
            var3.field4675 = var3;
            var3.field4673 = var3;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(JLpp;I)V", line = 140)
    public final void method1487(long arg0, class356 arg1, int arg2) {
        if (arg2 != 1) {
            this.method1485(-121);
        }
        field3321++;
        if (arg1.field4675 != null) {
            arg1.method1968((byte) -97);
        }
        class356 var5 = this.field3315[(int) ((long) (this.field3319 - 1) & arg0)];
        arg1.field4673 = var5;
        arg1.field4675 = var5.field4675;
        arg1.field4675.field4673 = arg1;
        arg1.field4673.field4675 = arg1;
        arg1.field4676 = arg0;
    }
}
