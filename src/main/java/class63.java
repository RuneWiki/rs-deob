import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class63 extends class28 {

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    private int field857;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "Z")
    public static boolean field859 = false;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "Z")
    public static boolean field862 = true;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "Lpe;")
    public static class615 field864;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "[Leea;")
    public class163[] field855;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "[[B")
    private byte[][] field860;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method529(boolean arg0) {
        field858++;
        if (this.field855 != null) {
            return true;
        }
        if (this.field860 == null) {
            if (!class196.field2565.method3342(this.field857, -18212)) {
                return false;
            }
            int[] var2 = class196.field2565.method3369((byte) -101, this.field857);
            this.field860 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field860[var3] = class196.field2565.method3346(-1, this.field857, var2[var3]);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field860.length; var5++) {
            byte[] var15 = this.field860[var5];
            class418 var16 = new class418(var15);
            var16.field5367 = 1;
            int var17 = var16.method2393(-30727);
            var4 &= class47.field670.method3362(var17, -116);
        }
        if (!var4) {
            return false;
        }
        class364 var6 = new class364();
        int var7 = class196.field2565.method3341(this.field857, -19046);
        this.field855 = new class163[var7];
        int[] var8 = class196.field2565.method3369((byte) -101, this.field857);
        int var9 = 0;
        if (arg0) {
            return false;
        }
        while (var9 < var8.length) {
            byte[] var10 = this.field860[var9];
            class418 var11 = new class418(var10);
            var11.field5367 = 1;
            int var12 = var11.method2393(-30727);
            class174 var13 = null;
            for (class174 var14 = (class174) var6.method2090(true); var14 != null; var14 = (class174) var6.method2088(-152)) {
                if (var14.field2181 == var12) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == null) {
                var13 = new class174(var12, class47.field670.method3365(var12, (byte) 120));
                var6.method2087(var13, 103);
            }
            this.field855[var8[var9]] = new class163(var10, var13);
            var9++;
        }
        this.field860 = null;
        return true;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Z", line = 106)
    public final boolean method530(int arg0, int arg1) {
        if (arg1 < 41) {
            return false;
        } else {
            field856++;
            return this.field855[arg0].field2021;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Z", line = 122)
    public final boolean method531(int arg0, int arg1) {
        if (arg0 == 5858) {
            field854++;
            return this.field855[arg1].field2027;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)Z", line = 141)
    public final boolean method532(int arg0, byte arg1) {
        field863++;
        return arg1 < 88 ? true : this.field855[arg0].field2029;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I)V", line = 157)
    public class63(int arg0) {
        this.field857 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 165)
    public static void method533(byte arg0) {
        if (arg0 == -30) {
            field864 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILta;Lfa;IIILsga;IIILtc;Ljava/lang/String;)V", line = 175)
    public static final void method534(int arg0, class597 arg1, class619 arg2, int arg3, int arg4, int arg5, class547 arg6, int arg7, int arg8, int arg9, class477 arg10, String arg11) {
        field861++;
        int var12;
        if (class704.field9810 == 4) {
            var12 = (int) class141.field1859 & 0x3FFF;
        } else {
            var12 = (int) class141.field1859 + class7.field56 & 0x3FFF;
        }
        int var13 = Math.max(arg10.field6372 / 2, arg10.field6224 / 2) + 10;
        int var14 = arg0 * arg0 + arg5 * arg5;
        if ((var13 * var13) < var14) {
            return;
        }
        if (arg7 <= 36) {
            field862 = false;
        }
        int var15 = class237.field3193[var12];
        int var16 = class237.field3196[var12];
        if (class704.field9810 != 4) {
            var16 = var16 * 256 / (class279.field3653 + 256);
            var15 = var15 * 256 / (class279.field3653 + 256);
        }
        int var17 = arg0 * var15 + arg5 * var16 >> 14;
        int var18 = arg0 * var16 - (arg5 * var15) >> 14;
        int var19 = arg6.method2898(null, 100, -5633, arg11);
        int var20 = var17 - var19 / 2;
        int var21 = arg6.method2904(0, 100, arg11, -1, null);
        if (var20 >= (-arg10.field6372) && arg10.field6372 >= var20 && (-arg10.field6224) <= var18 && var18 <= arg10.field6224) {
            arg1.method3256(arg3, arg4, 50, arg10.field6224 / 2 + arg3 - arg9 - var18 - var21, arg10.field6372 / 2 + arg8 + var20, 0, arg11, arg2, 70, null, 0, null, arg8, var19, 1, 0);
        }
    }
}
