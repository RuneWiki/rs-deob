import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class465 {

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "B")
    public byte field6900 = 0;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "S")
    public short field6899;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "S")
    public short field6914;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "B")
    public byte field6893;

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "B")
    public byte field6916;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "Z")
    public static boolean field6891 = false;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "[I")
    public static int[] field6911 = new int[13];

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "Lvv;")
    public static class313 field6892 = new class313(103, 3);

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "B")
    public byte field6894;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "B")
    public byte field6896;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "B")
    public byte field6903;

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "B")
    public byte field6918;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "Lhh;")
    public class125 field6913;

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "Lql;")
    public class129 field6909;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "Lf;")
    public class192 field6904;

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "Lf;")
    public class192 field6908;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "Lqk;")
    public class1 field6898;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "Lhc;")
    public class218 field6901;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "Lhc;")
    public class218 field6907;

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "Lut;")
    public class465 field6912;

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "Ld;")
    public class66 field6910;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "S")
    public short field6906;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "Z")
    public boolean field6902;

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "Z")
    public boolean field6919;

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "Z")
    public boolean field6920;

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "[J")
    public static long[] field6915;

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(III)V")
    public class465(int arg0, int arg1, int arg2) {
        this.field6899 = (short) arg2;
        this.field6914 = (short) arg1;
        this.field6916 = this.field6893 = (byte) arg0;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
    public final void method2765(int arg0) {
        int var2 = -34 / ((arg0 - 8) / 33);
        while (this.field6898 != null) {
            class1 var3 = this.field6898.field2;
            this.field6898.method3(false);
            this.field6898 = var3;
        }
        field6897++;
        this.field6900 = 0;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lnv;I)[Lme;")
    public static final class502[] method2766(class493 arg0, int arg1) {
        field6921++;
        if (!arg0.method2871(-81)) {
            return new class502[0];
        }
        class169 var2 = arg0.method2878(true);
        while (var2.field2692 == 0) {
            class444.method2667(-28210, 10L);
        }
        if (arg1 >= -118) {
            return null;
        } else if (var2.field2692 == 2) {
            return new class502[0];
        } else {
            int[] var3 = (int[]) var2.field2695;
            class502[] var4 = new class502[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class502 var6 = new class502();
                var4[var5] = var6;
                var6.field7332 = var3[var5 << 2];
                var6.field7330 = var3[(var5 << 2) + 1];
                var6.field7331 = var3[(var5 << 2) + 2];
                var6.field7333 = var3[(var5 << 2) + 3];
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZI)V")
    public static final void method2767(boolean arg0, int arg1) {
        field6905++;
        class337.field5290.method1603((byte) -117, arg1);
        class530.field7787.method1603((byte) -106, arg1);
        class387.field5964.method1603((byte) -126, arg1);
        class112.field1976.method1603((byte) -121, arg1);
        class435.field6505.method1603((byte) -111, arg1);
        if (arg0) {
            field6892 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IBLch;ILp;ILbl;I)V")
    public static final void method2768(int arg0, byte arg1, class166 arg2, int arg3, class39 arg4, int arg5, class265 arg6, int arg7) {
        field6917++;
        class451 var8 = new class451();
        var8.field6740 = arg7 << 7;
        var8.field6716 = arg5 << 7;
        var8.field6727 = arg0;
        if (arg4 != null) {
            var8.field6718 = arg4;
            int var9 = arg4.field611;
            int var10 = arg4.field647;
            if (arg3 == 1 || arg3 == 3) {
                var9 = arg4.field647;
                var10 = arg4.field611;
            }
            var8.field6735 = arg5 + var9 << 7;
            var8.field6738 = arg4.field645;
            var8.field6720 = arg4.field650;
            var8.field6717 = arg4.field627;
            var8.field6730 = arg4.field653;
            var8.field6726 = arg4.field629 << 7;
            var8.field6729 = arg4.field637;
            var8.field6721 = arg7 + var10 << 7;
            if (arg4.field575 != null) {
                var8.field6731 = true;
                var8.method2702(0);
            }
            if (var8.field6738 != null) {
                var8.field6725 = var8.field6717 + ((int) ((double) (var8.field6720 - var8.field6717) * Math.random()));
            }
            class305.field4874.method2541(0, var8);
        } else if (arg6 != null) {
            var8.field6728 = arg6;
            class510 var11 = arg6.field4430;
            if (var11.field7448 != null) {
                var8.field6731 = true;
                var11 = var11.method3000(1, class327.field5160);
            }
            if (var11 != null) {
                var8.field6721 = arg7 + var11.field7416 << 7;
                var8.field6735 = var11.field7416 + arg5 << 7;
                var8.field6730 = class30.method235(arg6, (byte) -76);
                var8.field6726 = var11.field7443 << 7;
                var8.field6729 = var11.field7415;
            }
            class511.field7481.method2541(0, var8);
        } else if (arg2 != null) {
            var8.field6724 = arg2;
            var8.field6735 = arg2.method1143(0) + arg5 << 7;
            var8.field6721 = arg7 + arg2.method1143(0) << 7;
            var8.field6730 = class112.method802(-44, arg2);
            var8.field6729 = arg2.field2625;
            var8.field6726 = arg2.field2633 << 7;
            class101.field1683.method2517(var8, (long) arg2.field3130, (byte) -127);
        }
        int var12 = -83 / ((arg1 + 55) / 51);
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V")
    public static void method2769(int arg0) {
        if (arg0 == -28164) {
            field6915 = null;
            field6892 = null;
            field6911 = null;
        }
    }
}
