import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class99 {

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Lri;")
    public static class73 field1451 = new class73(31, 28);

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field1453 = 1;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "[I")
    public static int[] field1447;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BII)Z")
    public static final boolean method606(byte arg0, int arg1, int arg2) {
        field1454++;
        if (arg0 < 92) {
            method613((byte) -27, -31, 8, -57, 34, -104, 0, 7, 23, -55);
        }
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I")
    public abstract int method607(int arg0, int arg1);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)Lbm;")
    public abstract class74 method608(boolean arg0);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method609(byte arg0) {
        if (arg0 != -63) {
            method610((byte) 47);
        }
        field1447 = null;
        field1451 = null;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
    public static final void method610(byte arg0) {
        if (arg0 >= -113) {
            field1447 = null;
        }
        class226 var1 = class263.field3855;
        synchronized (class263.field3855) {
            class263.field3855.method1540(0);
        }
        field1450++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V")
    public abstract void method611(int arg0, byte arg1);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lic;IIB)Lqc;")
    public static final class521 method612(class491 arg0, int arg1, int arg2, byte arg3) {
        field1448++;
        int var4 = -114 / ((arg3 - 45) / 38);
        byte[] var5 = arg0.method2945(arg2, arg1, true);
        return var5 == null ? null : new class521(var5);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BIIIIIIIII)V")
    public static final void method613(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1452++;
        if (!class525.method3102(arg8, -1)) {
            return;
        }
        if (class231.field3450[arg8] == null) {
            client.method1337(class185.field2754[arg8], -1, arg7, arg5, arg4, arg2, arg1, arg9, arg3, arg6);
        } else {
            client.method1337(class231.field3450[arg8], -1, arg7, arg5, arg4, arg2, arg1, arg9, arg3, arg6);
        }
        if (arg0 != -22) {
            method609((byte) 16);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)[B")
    public abstract byte[] method614(int arg0, boolean arg1);
}
