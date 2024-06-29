import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class50 extends class310 {

    @OriginalMember(owner = "client!so", name = "P", descriptor = "Z")
    private boolean field794 = true;

    @OriginalMember(owner = "client!so", name = "S", descriptor = "Z")
    private boolean field797 = true;

    @OriginalMember(owner = "client!so", name = "N", descriptor = "[I")
    public static int[] field792 = new int[500];

    @OriginalMember(owner = "client!so", name = "K", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!so", name = "L", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!so", name = "O", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!so", name = "Q", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!so", name = "R", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!so", name = "T", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!so", name = "M", descriptor = "Lth;")
    public static class57 field791;

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V", line = 9)
    public class50() {
        super(1, false);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIII)V", line = 15)
    public static final void method390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg1; var6 <= (arg1 + arg4); var6++) {
            for (int var7 = arg0; var7 <= (arg0 + arg2); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class74.field1267[arg3][var7][var6] = 127;
                }
            }
        }
        field798++;
        if (arg5 != -14636) {
            field790 = -28;
        }
        for (int var8 = arg1; var8 < arg1 + arg4; var8++) {
            for (int var9 = arg0; var9 < (arg0 + arg2); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class101.field1656[arg3][var9][var8] = arg3 > 0 ? class101.field1656[arg3 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var10 = arg1 + 1; var10 < (arg1 + arg4); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class101.field1656[arg3][arg0][var10] = class101.field1656[arg3][arg0 - 1][var10];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var11 = arg0 + 1; var11 < arg0 + arg2; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class101.field1656[arg3][var11][arg1] = class101.field1656[arg3][var11][arg1 - 1];
                }
            }
        }
        if (arg0 < 0 || arg1 < 0 || arg0 >= 104 || arg1 >= 104) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 > 0 && class101.field1656[arg3][arg0 - 1][arg1] != 0) {
                class101.field1656[arg3][arg0][arg1] = class101.field1656[arg3][arg0 - 1][arg1];
            } else if (arg1 > 0 && class101.field1656[arg3][arg0][arg1 - 1] != 0) {
                class101.field1656[arg3][arg0][arg1] = class101.field1656[arg3][arg0][arg1 - 1];
            } else if (arg0 > 0 && arg1 > 0 && class101.field1656[arg3][arg0 - 1][arg1 - 1] != 0) {
                class101.field1656[arg3][arg0][arg1] = class101.field1656[arg3][arg0 - 1][arg1 - 1];
            }
        } else if (arg0 > 0 && class101.field1656[arg3 - 1][arg0 - 1][arg1] != class101.field1656[arg3][arg0 - 1][arg1]) {
            class101.field1656[arg3][arg0][arg1] = class101.field1656[arg3][arg0 - 1][arg1];
        } else if (arg1 > 0 && class101.field1656[arg3 - 1][arg0][arg1 - 1] != class101.field1656[arg3][arg0][arg1 - 1]) {
            class101.field1656[arg3][arg0][arg1] = class101.field1656[arg3][arg0][arg1 - 1];
        } else if (arg0 > 0 && arg1 > 0 && class101.field1656[arg3][arg0 - 1][arg1 - 1] != class101.field1656[arg3 - 1][arg0 - 1][arg1 - 1]) {
            class101.field1656[arg3][arg0][arg1] = class101.field1656[arg3][arg0 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)[I", line = 138)
    public final int[] method77(int arg0, int arg1) {
        int[] var3 = this.field4950.method930(arg0, 0);
        field796++;
        if (arg1 != -13093) {
            return (int[]) null;
        }
        if (this.field4950.field2001) {
            int[] var4 = this.method2200(0, this.field797 ? class113.field1861 - arg0 : arg0, (byte) 74);
            if (this.field794) {
                for (int var5 = 0; var5 < class261.field4405; var5++) {
                    var3[var5] = var4[class98.field1628 - var5];
                }
            } else {
                class242.method1842(var4, 0, var3, 0, class261.field4405);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lqm;II)V", line = 175)
    public final void method75(class227 arg0, int arg1, int arg2) {
        field795++;
        if (arg2 == 0) {
            this.field794 = arg0.method1720((byte) -20) == 1;
        } else if (arg2 == 1) {
            this.field797 = arg0.method1720((byte) -118) == 1;
        } else if (arg2 == 2) {
            this.field4940 = arg0.method1720((byte) -112) == 1;
        }
        if (arg1 != -2470) {
            this.field797 = false;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IZ)[[I", line = 223)
    public final int[][] method391(int arg0, boolean arg1) {
        field793++;
        if (!arg1) {
            field792 = (int[]) null;
        }
        int[][] var3 = this.field4942.method10((byte) -118, arg0);
        if (this.field4942.field30) {
            int[][] var4 = this.method2199(21101, this.field797 ? class113.field1861 - arg0 : arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var3[1];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            if (this.field794) {
                for (int var12 = 0; var12 < class261.field4405; var12++) {
                    var8[var12] = var5[class98.field1628 - var12];
                    var6[var12] = var7[class98.field1628 - var12];
                    var10[var12] = var9[class98.field1628 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class261.field4405; var11++) {
                    var8[var11] = var5[var11];
                    var6[var11] = var7[var11];
                    var10[var11] = var9[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!so", name = "e", descriptor = "(B)V", line = 290)
    public static void method392(byte arg0) {
        field792 = null;
        if (arg0 <= -43) {
            field791 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lci;BII)V", line = 305)
    public static final void method393(class327 arg0, byte arg1, int arg2, int arg3) {
        class206.field3260.method2301(-23);
        field789++;
        if (class227.field3799 || arg1 != -128) {
            return;
        }
        for (class59 var4 = (class59) arg0.method2300((byte) 102); var4 != null; var4 = (class59) arg0.method2306(-23)) {
            class213 var5 = class169.method1315(var4.field1011, 127);
            if (class98.method761(var5, -126)) {
                class16.method86(var4, arg2, 1011, var5, arg3);
                if (var4.field1013) {
                    class352.method2489(0, var4, var5);
                }
            }
        }
    }
}
