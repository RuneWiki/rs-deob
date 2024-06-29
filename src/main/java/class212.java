import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class212 {

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Lada;")
    public static class144 field3118 = new class144(93, 3);

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "Llu;")
    public static class610 field3121 = new class610(18, -1);

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field3122 = 0;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "Lfj;")
    public static class564 field3123;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BIII)I")
    public static final int method1393(byte arg0, int arg1, int arg2, int arg3) {
        field3119++;
        int var4 = arg1 / arg3;
        int var5 = arg1 & arg3 - 1;
        int var6 = arg2 / arg3;
        int var7 = arg3 - 1 & arg2;
        int var8 = class61.method397(var4, var6, -1);
        int var9 = class61.method397(var4 + 1, var6, -1);
        if (arg0 != 67) {
            return -40;
        }
        int var10 = class61.method397(var4, var6 + 1, arg0 ^ 0xFFFFFFBC);
        int var11 = class61.method397(var4 + 1, var6 - -1, -1);
        int var12 = class266.method1685(var8, arg3, (byte) -14, var9, var5);
        int var13 = class266.method1685(var10, arg3, (byte) -14, var11, var5);
        return class266.method1685(var12, arg3, (byte) -14, var13, var7);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
    public static void method1394(boolean arg0) {
        field3121 = null;
        field3118 = null;
        field3123 = null;
        if (arg0) {
            method1393((byte) -28, 122, -1, -47);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IB)V")
    public static final void method1395(int arg0, byte arg1) {
        if (class383.field5270 == null) {
            class383.field5270 = new byte[4][class146.field2125][class410.field5609];
        }
        int var2 = -28 % ((arg0 + 67) / 32);
        field3120++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < class146.field2125; var4++) {
                for (int var5 = 0; var5 < class410.field5609; var5++) {
                    class383.field5270[var3][var4][var5] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)Z")
    public static final boolean method1396(int arg0, int arg1, int arg2) {
        if (arg1 > -89) {
            field3123 = null;
        }
        field3117++;
        return (arg0 & 0x20) != 0;
    }
}
