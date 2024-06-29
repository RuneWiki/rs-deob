import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class573 {

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public int field8057;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public int field8072;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public int field8055;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public int field8070;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public int field8064;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Lgg;")
    public class176 field8059;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public int field8056;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "B")
    public byte field8069;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[S")
    public static short[] field8058 = new short[256];

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field8071 = 0;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field8061;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field8067;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "Lib;")
    public class155 field8066;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "Lcl;")
    public class269 field8060;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Lwi;")
    public class466 field8062;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "Lfw;")
    public class57 field8065;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 14)
    public static final void method3216(byte arg0) {
        if (class481.field6634 != -1) {
            class222.method1266(-1, false, class481.field6634, (byte) 89, -1);
            class481.field6634 = -1;
        }
        field8063++;
        int var1 = -57 % ((-arg0 - 17) / 39);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 34)
    public static void method3217(int arg0) {
        if (arg0 < 70) {
            method3218((byte) 10);
        }
        field8058 = null;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V", line = 44)
    public static final void method3218(byte arg0) {
        class232.field2995.method1563(15);
        field8068++;
        int var1 = 51 % ((18 - arg0) / 32);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLji;)Lij;", line = 60)
    public static final class424 method3219(byte arg0, class611 arg1) {
        field8067++;
        class203 var2 = class125.method804(arg0 - 95, arg1);
        if (arg0 != 94) {
            field8071 = 13;
        }
        int var3 = arg1.method3402((byte) 127);
        int var4 = arg1.method3402((byte) 127);
        int var5 = arg1.method3402((byte) 127);
        int var6 = arg1.method3402((byte) 127);
        int var7 = arg1.method3402((byte) 127);
        int var8 = arg1.method3402((byte) 127);
        return new class424(var2.field2408, var2.field2412, var2.field2403, var2.field2406, var2.field2415, var2.field2402, var2.field2407, var2.field2405, var2.field2414, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Z", line = 91)
    public final boolean method3220(int arg0) {
        if (arg0 != -4) {
            this.field8059 = null;
        }
        field8061++;
        return this.field8069 == 2 || this.field8069 == 3;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(BIIIIIILgg;)V", line = 102)
    public class573(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class176 arg7) {
        this.field8057 = arg3;
        this.field8072 = arg6;
        this.field8055 = arg1;
        this.field8070 = arg4;
        this.field8064 = arg5;
        this.field8059 = arg7;
        this.field8056 = arg2;
        this.field8069 = arg0;
    }
}
