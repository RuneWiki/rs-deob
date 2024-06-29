import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class745 extends class573 {

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "[I")
    public int[] field10237;

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "[I")
    public int[] field10241;

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "Lst;")
    public static class335 field10243 = new class335(13, 2);

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
    public static int field10238;

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "I")
    public static int field10239;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
    public static int field10240;

    @OriginalMember(owner = "client!ufa", name = "k", descriptor = "I")
    public static int field10242;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(III)I")
    public static final int method4145(int arg0, int arg1, int arg2) {
        field10238++;
        if (arg2 != 3) {
            method4145(23, 60, -31);
        }
        return arg1 == 1 || arg1 == 3 ? class118.field1555[arg0 & 0x3] : class433.field6045[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)[Lgga;")
    public static final class226[] method4146(byte arg0) {
        field10240++;
        if (arg0 <= 125) {
            method4147(56);
        }
        return new class226[] { class62.field893, class62.field898, class62.field907, class62.field909, class62.field910, class62.field911, class62.field912, class62.field913, class62.field914, class62.field915, class62.field916, class62.field917 };
    }

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "(I)V")
    public static void method4147(int arg0) {
        field10243 = null;
        if (arg0 != 4) {
            method4149(41, -119);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)V")
    public static final void method4148(int arg0, int arg1) {
        class709 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class341 var4 = class550.field7649[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class713.field9959; var5++) {
                    for (int var6 = 0; var6 < class61.field877; var6++) {
                        var2 = var4.method1032(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class371.field5241;
                            int var8 = var5 << class371.field5241;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class341 var10 = class550.field7649[var9];
                                if (var10 != null) {
                                    int var11 = var4.method2171(var5, var6, 31) - var10.method2171(var5, var6, 31);
                                    int var12 = var4.method2171(var5, var6 + 1, 31) - var10.method2171(var5, var6 + 1, 31);
                                    int var13 = var4.method2171(var5 + 1, var6 + 1, 31) - var10.method2171(var5 + 1, var6 + 1, 31);
                                    int var14 = var4.method2171(var5 + 1, var6, 31) - var10.method2171(var5 + 1, var6, 31);
                                    var10.method1042(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method4149(int arg0, int arg1) {
        field10242++;
        if (arg1 != 0) {
            field10243 = null;
        }
        class160 var2 = (class160) class131.field1826.method812(117, (long) arg0);
        if (var2 != null) {
            class164 var3 = var2.field2234.method3584(arg1 + 1);
            if (var3 != null) {
                double var4 = var2.field2234.method3578(arg1);
                if ((double) var3.method1017(-105) <= var4 && var4 <= (double) var3.method1019(1425)) {
                    return var3.method1020(116);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIB)Z")
    public static final boolean method4150(int arg0, int arg1, byte arg2) {
        if (arg2 == 86) {
            field10239++;
            return (arg1 & 0x20) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(II[I[I)V")
    public class745(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field10237 = arg2;
        this.field10241 = arg3;
    }
}
