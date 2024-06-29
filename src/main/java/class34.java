import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class34 extends class279 {

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "Lrm;")
    public static class184 field498 = new class184(2);

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public static int field507 = -1;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "Ljava/lang/String;")
    public String field504;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "[I")
    public static int[] field508;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "[Z")
    public static boolean[] field505;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "[[Lel;")
    public static class247[][] field493;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)I", line = 8)
    public final int method303(byte arg0) {
        field495++;
        if (arg0 != -118) {
            method309(1, 21);
        }
        return (int) this.field4430;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)J", line = 19)
    public final long method304(byte arg0) {
        if (arg0 > -7) {
            return 95L;
        } else {
            field496++;
            return this.field4294 & Long.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V", line = 30)
    public static void method305(boolean arg0) {
        field505 = null;
        field508 = null;
        if (!arg0) {
            field498 = (class184) null;
        }
        field493 = (class247[][]) null;
        field498 = null;
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V", line = 44)
    public final void method306(int arg0) {
        field503++;
        if (arg0 != 13) {
            method305(false);
        }
        this.field4294 = class219.method1609(-898) + 500L | Long.MIN_VALUE & this.field4294;
        class79.field1082.method2197((byte) -105, this);
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V", line = 58)
    public final void method307(int arg0) {
        field499++;
        this.field4294 |= Long.MIN_VALUE;
        if (arg0 != -19063) {
            field498 = (class184) null;
        }
        if (this.method304((byte) -36) == 0L) {
            class224.field3555.method2197((byte) -105, this);
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(II)V", line = 81)
    public class34(int arg0, int arg1) {
        this.field4430 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "(I)I", line = 90)
    public final int method308(int arg0) {
        if (arg0 != -9047) {
            this.method304((byte) -40);
        }
        field494++;
        return (int) (this.field4430 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)Llc;", line = 104)
    public static final class294 method309(int arg0, int arg1) {
        field501++;
        if (arg1 != 255) {
            field508 = (int[]) null;
        }
        return (class294) class283.field4383.method2168((long) arg0, (byte) -90);
    }
}
