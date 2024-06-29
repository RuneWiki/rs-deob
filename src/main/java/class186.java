import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class186 extends class137 {

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "Ltl;")
    public static class59 field3116 = class85.method639("Lade Texturen )2 ", 9588);

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "Ltl;")
    private static class59 field3122 = class85.method639("Walk here", 9588);

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "Ltl;")
    public static class59 field3120 = field3122;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "I")
    public int field3123;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "Ltl;")
    public class59 field3113;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)J", line = 4)
    public final long method1375(int arg0) {
        field3119++;
        int var2 = 102 / ((-arg0 - 14) / 47);
        return this.field2264 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lme;II)[Llj;", line = 16)
    public static final class5[] method1376(class295 arg0, int arg1, int arg2) {
        if (arg2 <= 51) {
            method1379((byte) 98);
        }
        field3115++;
        return class96.method727(arg1, (byte) -32, arg0) ? class145.method1054((byte) -99) : null;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)I", line = 45)
    public final int method1377(boolean arg0) {
        if (!arg0) {
            this.method1377(false);
        }
        field3118++;
        return (int) (this.field4932 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)I", line = 60)
    public final int method1378(int arg0) {
        if (arg0 != 0) {
            this.method1381(false);
        }
        field3111++;
        return (int) this.field4932;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V", line = 86)
    public static void method1379(byte arg0) {
        field3120 = null;
        field3116 = null;
        field3122 = null;
        if (arg0 != 3) {
            field3122 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V", line = 99)
    public final void method1380(int arg0) {
        this.field2264 |= Long.MIN_VALUE;
        if (arg0 != 3293) {
            this.method1381(false);
        }
        field3124++;
        if (this.method1375(-75) == 0L) {
            class207.field3380.method6(this, arg0 - 3412);
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(Z)V", line = 115)
    public final void method1381(boolean arg0) {
        if (!arg0) {
            this.field3117 = -84;
        }
        field3121++;
        this.field2264 = class205.method1451(32) + 500L | Long.MIN_VALUE & this.field2264;
        class97.field1547.method6(this, -115);
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(II)V", line = 127)
    public class186(int arg0, int arg1) {
        this.field4932 = (long) arg0 << 32 | (long) arg1;
    }
}
