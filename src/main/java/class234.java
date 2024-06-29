import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class234 extends class84 {

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "[Z")
    public static boolean[] field3888 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "[I")
    public static int[] field3884 = new int[2];

    @OriginalMember(owner = "client!dj", name = "db", descriptor = "[I")
    public static int[] field3893 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!dj", name = "bb", descriptor = "I")
    public int field3891;

    @OriginalMember(owner = "client!dj", name = "eb", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!dj", name = "fb", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "Lja;")
    public class302 field3890;

    @OriginalMember(owner = "client!dj", name = "cb", descriptor = "[B")
    public byte[] field3892;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBI)I", line = 8)
    public static final int method1803(int arg0, byte arg1, int arg2) {
        field3882++;
        if (arg1 > -31) {
            field3883 = -82;
        }
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)[B", line = 20)
    public final byte[] method676(byte arg0) {
        if (arg0 >= -73) {
            return (byte[]) null;
        }
        field3895++;
        if (this.field1434) {
            throw new RuntimeException();
        }
        return this.field3892;
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)V", line = 53)
    public static final void method1804(int arg0) {
        if (arg0 > -68) {
            return;
        }
        for (class304 var1 = (class304) class156.field2468.method2300((byte) 102); var1 != null; var1 = (class304) class156.field2468.method2306(-23)) {
            if (var1.field4877 == -1) {
                var1.field4869 = 0;
                class209.method1580((byte) -98, var1);
            } else {
                var1.method330(15);
            }
        }
        field3894++;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)I", line = 87)
    public final int method675(byte arg0) {
        field3889++;
        if (this.field1434) {
            return 0;
        } else if (arg0 < 78) {
            return -25;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(B)V", line = 102)
    public static void method1805(byte arg0) {
        field3888 = null;
        if (arg0 == -66) {
            field3884 = null;
            field3893 = null;
        }
    }
}
