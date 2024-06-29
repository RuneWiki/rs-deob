import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public abstract class class108 {

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "Lao;")
    public static class188 field1676 = new class188(17, 14);

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "[I")
    public static int[] field1684 = new int[14];

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "[I")
    public static int[] field1685 = new int[25];

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "Lgf;")
    public static class180 field1682 = new class180("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "Lqe;")
    public static class326 field1681;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "Lnk;")
    public static class500 field1683;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "[Lbj;")
    public static class159[] field1680;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public static void method803(int arg0) {
        field1682 = null;
        field1676 = null;
        field1685 = null;
        field1681 = null;
        field1680 = null;
        field1684 = null;
        field1683 = null;
        if (arg0 != 55) {
            method803(-20);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I[I[Ljava/lang/Object;II)V")
    public static final void method804(int arg0, int[] arg1, Object[] arg2, int arg3, int arg4) {
        field1674++;
        if (arg3 < arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            Object var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg3; var10 < arg0; var10++) {
                if (((var9 & var10) + var7) > arg1[var10]) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    Object var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method804(var6 - 1, arg1, arg2, arg3, -32);
            method804(arg0, arg1, arg2, var6 + 1, -95);
        }
        if (arg4 > -8) {
            field1685 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)Z")
    public static final boolean method805(int arg0, int arg1, int arg2) {
        if (arg1 > -26) {
            return false;
        }
        field1679++;
        if (class465.method2774(5966, arg0, arg2)) {
            return (arg0 & 0xB000) != 0 | class91.method742((byte) -108, arg0, arg2) | class416.method2562(arg2, (byte) -97, arg0) ? true : (arg2 & 0x37) == 0 & (class145.method1041(arg2, (byte) 108, arg0) | class213.method1416(16555, arg0, arg2));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)V")
    public abstract void method306(byte arg0, int arg1);

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII)I")
    public static final int method806(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field1675++;
        if (arg2 != -73) {
            method805(-123, 43, -75);
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)I")
    public abstract int method310(int arg0, int arg1);

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)Llb;")
    public abstract class378 method313(int arg0);

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method316(int arg0, byte arg1);

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZ)V")
    public static final void method807(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        if (!class397.field5830.field145) {
            arg0 = -1;
        }
        field1678++;
        if (class272.field3936 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class241 var2 = class230.field3355.method2763(10, arg0);
            class158 var3 = var2.method1559(0);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class112.field1785.method1968(var3.method1144(), var3.method1141(), -21560, var3.method1132(), new Point(var2.field3504, var2.field3503), class31.field503);
                class272.field3936 = arg0;
            }
        }
        if (arg0 == -1 && class272.field3936 != -1) {
            class112.field1785.method1968(-1, null, -21560, -1, new Point(), class31.field503);
            class272.field3936 = -1;
        }
    }
}
