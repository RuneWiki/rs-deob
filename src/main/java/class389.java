import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class389 extends class222 {

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
    private int field5490;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    private int field5486;

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "I")
    private int field5488;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    private int field5484;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "Lkfa;")
    public static class603 field5485;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V", line = 8)
    public static final void method2268(int arg0, int arg1) {
        ++field5481;
        if (arg1 != 15233) {
            method2269(false);
        }
        class252 var2 = class150.method916(arg0, -103, 1);
        var2.method1497(0);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)V", line = 24)
    public static void method2269(boolean arg0) {
        field5485 = null;
        if (!arg0) {
            field5483 = 12;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lni;ZI)Lmv;", line = 34)
    public static final class377 method2270(class522 arg0, boolean arg1, int arg2) {
        ++field5489;
        byte[] var3 = arg0.method2873(arg2, -96);
        if (var3 == null) {
            return null;
        } else {
            if (!arg1) {
                method2269(false);
            }
            return new class377(var3);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)V", line = 52)
    public final void method1264(int arg0, int arg1, int arg2) {
        ++field5480;
        if (arg2 != -5515) {
            field5483 = 29;
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(IIIIII)V", line = 62)
    public class389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field5490 = arg0;
        this.field5486 = arg2;
        this.field5488 = arg3;
        this.field5484 = arg1;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BII)V", line = 74)
    public final void method1269(byte arg0, int arg1, int arg2) {
        ++field5487;
        int var4 = -102 % ((50 - arg0) / 38);
        int var5 = this.field5490 * arg2 >> 12;
        int var6 = this.field5486 * arg2 >> 12;
        int var7 = this.field5484 * arg1 >> 12;
        int var8 = this.field5488 * arg1 >> 12;
        class456.method2549(var6, super.field2868, var8, var7, var5, 21597);
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(III)V", line = 92)
    public final void method1268(int arg0, int arg1, int arg2) {
        int var4 = 26 % ((-3 - arg0) / 32);
        ++field5482;
    }
}
