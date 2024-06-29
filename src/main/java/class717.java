import java.awt.Canvas;
import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public abstract class class717 extends class168 {

    @OriginalMember(owner = "client!pca", name = "j", descriptor = "Lkg;")
    public static class275 field9974 = new class275(49, 2);

    @OriginalMember(owner = "client!pca", name = "r", descriptor = "Lvda;")
    public static class184 field9982 = null;

    @OriginalMember(owner = "client!pca", name = "s", descriptor = "I")
    public static int field9983 = 0;

    @OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
    public int field9975;

    @OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
    public static int field9977;

    @OriginalMember(owner = "client!pca", name = "n", descriptor = "I")
    public static int field9978;

    @OriginalMember(owner = "client!pca", name = "o", descriptor = "I")
    public static int field9979;

    @OriginalMember(owner = "client!pca", name = "p", descriptor = "I")
    public int field9980;

    @OriginalMember(owner = "client!pca", name = "q", descriptor = "I")
    public static int field9981;

    @OriginalMember(owner = "client!pca", name = "t", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!pca", name = "l", descriptor = "[I")
    public int[] field9976;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "([Ljava/lang/Object;IIB[J)V")
    public static final void method4009(Object[] arg0, int arg1, int arg2, byte arg3, long[] arg4) {
        if (arg3 >= -40) {
            method4009(null, -19, 113, (byte) -112, null);
        }
        if (arg1 > arg2) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg2; var11 < arg1; var11++) {
                if ((var7 + ((long) (var11 & var10))) > arg4[var11]) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    Object var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var9;
            method4009(arg0, var6 - 1, arg2, (byte) -91, arg4);
            method4009(arg0, arg1, var6 + 1, (byte) -43, arg4);
        }
        field9979++;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIIIIILjava/awt/Graphics;I)V")
    public abstract void method3429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Graphics arg6, int arg7);

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Z")
    public static final boolean method4010(byte arg0) {
        field9981++;
        try {
            return arg0 < 111 ? false : class595.method3373(-11383);
        } catch (IOException var4) {
            class274.method1614((byte) 83);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class546.field7608 == null ? -1 : class546.field7608.method1626(-1)) + "," + (class154.field2099 == null ? -1 : class154.field2099.method1626(-1)) + "," + (class255.field3248 == null ? -1 : class255.field3248.method1626(-1)) + " - " + class440.field5868 + "," + (class332.field4232 + class380.field4847.field264[0]) + "," + (class447.field5936 + class380.field4847.field260[0]) + " - ";
            for (int var3 = 0; var3 < class440.field5868 && var3 < 50; var3++) {
                var2 = var2 + class609.field8448.field6180[var3] + ",";
            }
            class684.method3842(1, var5, var2);
            class98.method785((byte) 18, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
    public abstract void method3426(int arg0, int arg1, int arg2, Canvas arg3);

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILlea;)V")
    public static final void method4011(int arg0, class613 arg1) {
        field9978++;
        if (arg1.field8477 != null) {
            arg1.field8477.field2549 = 0;
        }
        int var2 = 37 / ((arg0 + 36) / 33);
        arg1.field8476 = false;
        for (class613 var3 = arg1.method317(); var3 != null; var3 = arg1.method327()) {
            method4011(-77, var3);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BI)I")
    public static final int method4012(byte arg0, int arg1) {
        int var2 = 51 / ((arg0 + 36) / 44);
        field9977++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
    public static void method4013(int arg0) {
        if (arg0 == -6132) {
            field9982 = null;
            field9974 = null;
        }
    }
}
