import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class237 extends class223 {

    @OriginalMember(owner = "client!s", name = "V", descriptor = "[S")
    public static short[] field4365 = new short[256];

    @OriginalMember(owner = "client!s", name = "X", descriptor = "Lqk;")
    public static class207 field4367 = class24.method212(255, "::errortest");

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "I")
    public static int field4374 = 0;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "B")
    public byte field4366;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    public int field4369;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "Lv;")
    public class149 field4364;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)I")
    public final int method1181(int arg0) {
        if (arg0 != 7595) {
            method1688(-2);
        }
        ++field4362;
        return this.field4364 == null ? 0 : this.field4364.field2593 * 100 / (this.field4364.field2568.length + -this.field4366);
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
    public static final void method1687(int arg0, int arg1, int arg2) {
        ++class255.field4565;
        class261.field4645.method767(arg1, (byte) 45);
        class261.field4645.method1083(false, arg0);
        ++field4372;
        class261.field4645.method1085(arg2, (byte) 14);
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)[B")
    public final byte[] method1180(byte arg0) {
        ++field4361;
        if (arg0 != 39) {
            this.method1180((byte) 92);
        }
        if (!super.field4084 && ~(this.field4364.field2568.length + -this.field4366) >= ~this.field4364.field2593) {
            return this.field4364.field2568;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)Z")
    public static final boolean method1688(int arg0) {
        ++field4370;
        if (class24.field460) {
            try {
                if ((Boolean) class97.field1705.method1465(63, class20.field326.field4207)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 19805) {
            method1690((byte) -30);
        }
        return true;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(III)J")
    public static final long method1689(int arg0, int arg1, int arg2) {
        class174 var3 = class82.field1498[arg0][arg1][arg2];
        return var3 != null && var3.field3152 != null ? var3.field3152.field4464 : 0L;
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(B)V")
    public static void method1690(byte arg0) {
        field4365 = null;
        field4367 = null;
        if (arg0 != 76) {
            method1690((byte) 41);
        }
    }
}
