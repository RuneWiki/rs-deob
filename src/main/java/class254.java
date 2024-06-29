import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class254 {

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "Z")
    public static boolean field3526 = false;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "Lvh;")
    public static class240 field3528;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "Lhv;")
    public static class359 field3531;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "([I[Ljava/lang/Object;III)V")
    public static final void method1492(int[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= 52) {
            method1493(false, null);
        }
        if (arg2 < arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg2;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg2; var10 < arg4; var10++) {
                if (arg0[var10] < (var10 & var9) + var7) {
                    int var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    Object var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method1492(arg0, arg1, arg2, 54, var6 - 1);
            method1492(arg0, arg1, var6 + 1, 104, arg4);
        }
        field3529++;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method1493(boolean arg0, byte[] arg1) {
        field3532++;
        class365 var2 = new class365(arg1);
        int var3 = var2.method2099(255);
        int var4 = var2.method2056((byte) -127);
        if (var4 < 0 || !(class520.field7661 == 0 || class520.field7661 >= var4)) {
            throw new RuntimeException();
        }
        if (arg0) {
            method1493(false, null);
        }
        if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method2071(var7, var4, 0, -713458872);
            return var7;
        }
        int var5 = var2.method2056((byte) -58);
        if (var5 < 0 || !(class520.field7661 == 0 || class520.field7661 >= var5)) {
            throw new RuntimeException();
        }
        byte[] var6 = new byte[var5];
        if (var3 == 1) {
            class291.method1667(var6, var5, arg1, var4, 9);
        } else {
            class528.field7771.method1803(var6, -20285, var2);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
    public static void method1494(int arg0) {
        field3528 = null;
        field3531 = null;
        if (arg0 != -1) {
            method1494(102);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIII)I")
    public static final int method1495(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -13) {
            field3528 = null;
        }
        field3527++;
        int var5 = arg2 & 0xF;
        int var6 = var5 >= 8 ? arg4 : arg0;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg0 : arg1) : arg4;
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }
}
