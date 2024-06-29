import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class77 extends class34 {

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "Z")
    public static boolean field1451 = false;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "Lke;")
    public static class256 field1454 = class316.method2202("Ladevorgang )2 bitte warten Sie)3", 27626);

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "Lke;")
    public class256 field1462;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "[[B")
    public static byte[][] field1460;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)I", line = 4)
    public final int method581(boolean arg0) {
        field1461++;
        if (arg0) {
            method583(76);
        }
        return (int) (this.field2895 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)J", line = 15)
    public final long method582(byte arg0) {
        if (arg0 <= 114) {
            this.method584(-92);
        }
        field1456++;
        return Long.MAX_VALUE & this.field539;
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)V", line = 28)
    public static void method583(int arg0) {
        if (arg0 != 1471867872) {
            method583(52);
        }
        field1454 = null;
        field1460 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V", line = 39)
    public final void method584(int arg0) {
        field1457++;
        this.field539 |= Long.MIN_VALUE;
        if (this.method582((byte) 118) == 0L) {
            class70.field1284.method537(this, arg0 ^ 0xFFFFA62F);
        }
        if (arg0 != 22992) {
            this.field1462 = (class256) null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "(I)I", line = 71)
    public final int method585(int arg0) {
        field1458++;
        return arg0 == 255 ? (int) this.field2895 : 89;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V", line = 88)
    public final void method586(byte arg0) {
        field1452++;
        if (arg0 != 98) {
            this.method581(false);
        }
        this.field539 = this.field539 & Long.MIN_VALUE | class224.method1536(false) + 500L;
        class180.field3187.method537(this, -1);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(II)V", line = 108)
    public class77(int arg0, int arg1) {
        this.field2895 = (long) arg1 | (long) arg0 << 32;
    }
}
