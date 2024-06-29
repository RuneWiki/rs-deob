import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class95 extends class77 {

    @OriginalMember(owner = "client!be", name = "y", descriptor = "Z")
    public static boolean field1325 = false;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field1336 = 0;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "[J")
    public static long[] field1327 = new long[1000];

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public int field1328;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "Ljava/lang/String;")
    public String field1332;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(B)I", line = 7)
    public final int method737(byte arg0) {
        field1333++;
        if (arg0 < 18) {
            this.field1329 = -95;
        }
        return (int) this.field1656;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V", line = 21)
    public final void method738(byte arg0) {
        field1324++;
        this.field1122 |= Long.MIN_VALUE;
        if (this.method739(true) == 0L) {
            class203.field2978.method2385(this, 14);
        }
        int var2 = -29 / ((arg0 + 57) / 47);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)J", line = 37)
    public final long method739(boolean arg0) {
        if (!arg0) {
            this.method738((byte) -58);
        }
        field1335++;
        return this.field1122 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V", line = 57)
    public static void method740(int arg0) {
        field1327 = null;
        if (arg0 != 1783164320) {
            field1327 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(I)I", line = 67)
    public final int method741(int arg0) {
        field1334++;
        return arg0 <= 69 ? 13 : (int) (this.field1656 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILsb;)Ljava/lang/String;", line = 78)
    public static final String method742(int arg0, int arg1, class190 arg2) {
        field1326++;
        if (arg0 > -19) {
            method742(96, 21, (class190) null);
        }
        try {
            int var3 = arg2.method1372(-127);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field2776 += class58.field853.method770(arg2.field2776, var4, 0, 0, arg2.field2718, var3);
            return class91.method719(false, var3, var4, 0);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!be", name = "h", descriptor = "(I)V", line = 113)
    public final void method743(int arg0) {
        this.field1122 = Long.MIN_VALUE & this.field1122 | class176.method1234(5574) + 500L;
        field1330++;
        if (arg0 != 0) {
            this.field1328 = 108;
        }
        class274.field4153.method2385(this, 14);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(II)V", line = 125)
    public class95(int arg0, int arg1) {
        this.field1656 = (long) arg0 << 32 | (long) arg1;
    }
}
