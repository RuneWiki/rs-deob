import jaclib.memory.Buffer;
import jaclib.memory.Source;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class459 extends class146 implements class633 {

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "[I")
    public static int[] field6265 = new int[500];

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "Ljava/util/Random;")
    public static Random field6266 = new Random();

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "B")
    private byte field6275;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!gt", name = "B", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!gt", name = "C", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!gt", name = "D", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "Lgn;")
    public static class702 field6276;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Z")
    public final boolean method2601(int arg0) {
        if (arg0 != -13472) {
            return false;
        } else {
            ++field6267;
            return super.method1101(-104, super.field2318.field2045);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    public final boolean method2600(int arg0, Source arg1, int arg2, int arg3) {
        ++field6274;
        if (arg2 != 24689) {
            return true;
        } else {
            this.field6275 = (byte) arg3;
            super.method1107(arg0, arg1, (byte) 31);
            return true;
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(IZ)V")
    public static final void method2605(int arg0, boolean arg1) {
        if (!arg1) {
            ++field6271;
            class127 var2 = class760.method4231(arg0, -874792672, 3);
            var2.method1002(-52);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "([BI)V")
    public static final void method2606(byte[] arg0, int arg1) {
        if (arg1 != 21870) {
            field6276 = null;
        }
        ++field6272;
        class677 var2 = new class677(arg0);
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = var2.method3821((byte) -124);
                if (~var4 == -1) {
                    if (var3) {
                        return;
                    }
                    if (class239.field3374 == null) {
                        class43.field571 = 4;
                        class239.field3374 = new int[4];
                        class176.field2656 = new int[4];
                    }
                    for (int var5 = 0; ~var5 > ~class239.field3374.length; ++var5) {
                        class239.field3374[var5] = 0;
                        class176.field2656[var5] = var5 * 20;
                    }
                    return;
                }
                if (~var4 == -2) {
                    if (class239.field3374 == null) {
                        class43.field571 = 4;
                        class239.field3374 = new int[4];
                        class176.field2656 = new int[4];
                    }
                    for (int var6 = 0; ~var6 > ~class239.field3374.length; ++var6) {
                        class239.field3374[var6] = var2.method3771((byte) -10);
                        class176.field2656[var6] = var2.method3771((byte) -10);
                    }
                    var3 = true;
                } else if (~var4 == -3) {
                    class141.field2263 = var2.method3807(-1);
                } else if (~var4 == -4) {
                    class43.field571 = var2.method3821((byte) 117);
                    class176.field2656 = new int[class43.field571];
                    class239.field3374 = new int[class43.field571];
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)I")
    public final int method590(int arg0) {
        if (arg0 != -1) {
            field6277 = 78;
        }
        ++field6269;
        return super.method590(-1);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
    public static void method2607(byte arg0) {
        field6265 = null;
        field6266 = null;
        field6276 = null;
        if (arg0 < 1) {
            method2607((byte) 23);
        }
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(B)I")
    public final int method2608(byte arg0) {
        if (arg0 >= -41) {
            this.field6275 = 5;
        }
        ++field6268;
        return this.field6275;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)Z")
    public final boolean method2603(int arg0, int arg1, int arg2) {
        ++field6273;
        this.field6275 = (byte) arg0;
        if (arg1 != -30987) {
            method2605(85, true);
        }
        super.method585(arg2, (byte) 102);
        return true;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Llaa;Z)V")
    public class459(class122 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V")
    public final void method588(boolean arg0) {
        super.method588(arg0);
        if (arg0) {
            field6265 = null;
        }
        ++field6264;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method2599(int arg0, boolean arg1) {
        if (arg0 != -4448) {
            field6276 = null;
        }
        ++field6270;
        return super.method1103(super.field2318.field2045, (byte) -119, arg1);
    }
}
