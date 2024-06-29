import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class96 extends class104 {

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public static int field1248 = 0;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int field1245 = -1;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public int field1246;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "Ljava/lang/String;")
    public String field1249;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)I", line = 5)
    public final int method580(byte arg0) {
        if (arg0 < 103) {
            return 16;
        } else {
            field1244++;
            return (int) (this.field5065 >>> 32 & 0xFFL);
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(B)V", line = 32)
    public final void method581(byte arg0) {
        if (arg0 >= -89) {
            this.method583((byte) 9);
        }
        this.field1344 |= Long.MIN_VALUE;
        field1251++;
        if (this.method585(-70) == 0L) {
            class63.field803.method495((byte) -114, this);
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V", line = 47)
    public final void method582(int arg0) {
        this.field1344 = this.field1344 & Long.MIN_VALUE | class200.method1375(-16185) + 500L;
        if (arg0 != -1) {
            this.method585(-1);
        }
        class257.field3906.method495((byte) -117, this);
        field1255++;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(B)I", line = 71)
    public final int method583(byte arg0) {
        field1242++;
        int var2 = -93 % ((-arg0 - 25) / 62);
        return (int) this.field5065;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V", line = 82)
    public static final void method584(int arg0, int arg1) {
        field1253++;
        class287 var2 = class184.field2662;
        synchronized (class184.field2662) {
            class35.field413 = arg0;
        }
        if (arg1 != -18573) {
            method584(-55, 79);
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(II)V", line = 93)
    public class96(int arg0, int arg1) {
        this.field5065 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)J", line = 106)
    public final long method585(int arg0) {
        if (arg0 > -22) {
            this.method583((byte) 18);
        }
        field1250++;
        return Long.MAX_VALUE & this.field1344;
    }
}
