import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class325 {

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "Lvg;")
    public static class52 field4145 = class312.method1853(-116);

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1934(int arg0, int arg1, byte arg2) {
        field4146++;
        if (arg2 <= 77) {
            field4145 = null;
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!hs", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4150++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILwd;)I")
    public static final int method1935(int arg0, class272 arg1) {
        int var2 = -50 / ((arg0 - 7) / 48);
        field4148++;
        if (class430.field6247 == arg1) {
            return 6407;
        } else if (class102.field1058 == arg1) {
            return 6408;
        } else if (class252.field3039 == arg1) {
            return 6406;
        } else if (class23.field209 == arg1) {
            return 6409;
        } else if (class147.field1639 == arg1) {
            return 6410;
        } else if (class411.field5613 == arg1) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIII)I")
    public static final int method1936(int arg0, int arg1, int arg2, int arg3) {
        field4151++;
        int var4 = arg3 & 0x3;
        if (arg2 >= -99) {
            field4145 = null;
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
    public static void method1937(int arg0) {
        field4145 = null;
        if (arg0 != 6145) {
            method1938((byte) 64, null);
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(II)V")
    public class325(int arg0, int arg1) {
        this.field4147 = arg1;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1938(byte arg0, byte[] arg1) {
        field4149++;
        class244 var2 = new class244(arg1);
        int var3 = var2.method1423(-52);
        if (arg0 < 80) {
            method1936(-49, -47, -78, 0);
        }
        int var4 = var2.method1438(89);
        if (var4 < 0 || class396.field5424 != 0 && class396.field5424 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1461(824, 0, var5, var4);
            return var5;
        } else {
            int var6 = var2.method1438(102);
            if (var6 < 0 || class396.field5424 != 0 && class396.field5424 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class528.method3102(var7, var6, arg1, var4, 9);
            } else {
                class70 var8 = class494.field6999;
                synchronized (class494.field6999) {
                    class494.field6999.method515((byte) 51, var7, var2);
                }
            }
            return var7;
        }
    }
}
