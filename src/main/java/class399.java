import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class399 {

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Z")
    public static boolean field5720 = false;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Lka;")
    public static class473 field5721 = new class473(8);

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field5722 = 0;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field5724 = 0;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Ldk;")
    public static class421 field5723;

    static {
        new class157("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
        field5728 = 0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;ILor;II)Leq;", line = 3)
    public static final class509 method2362(Component arg0, int arg1, class173 arg2, int arg3, int arg4) {
        field5718++;
        int var5 = -126 / ((-arg4 - 3) / 39);
        if (class506.field7397 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class509 var6 = (class509) Class.forName("ei").getDeclaredConstructor().newInstance();
                var6.field7457 = arg1;
                var6.field7430 = new int[(class163.field2472 ? 2 : 1) * 256];
                var6.method957(arg0);
                var6.field7447 = (arg1 & 0xFFFFFC00) + 1024;
                if (var6.field7447 > 16384) {
                    var6.field7447 = 16384;
                }
                var6.method959(var6.field7447);
                if (class372.field5342 > 0 && class500.field7324 == null) {
                    class500.field7324 = new class122();
                    class500.field7324.field1892 = arg2;
                    arg2.method1182(class500.field7324, (byte) -121, class372.field5342);
                }
                if (class500.field7324 != null) {
                    if (class500.field7324.field1896[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class500.field7324.field1896[arg3] = var6;
                }
                return var6;
            } catch (Throwable var9) {
                try {
                    class132 var7 = new class132(arg2, arg3);
                    var7.field7430 = new int[(class163.field2472 ? 2 : 1) * 256];
                    var7.field7457 = arg1;
                    var7.method957(arg0);
                    var7.field7447 = 16384;
                    var7.method959(var7.field7447);
                    if (class372.field5342 > 0 && class500.field7324 == null) {
                        class500.field7324 = new class122();
                        class500.field7324.field1892 = arg2;
                        arg2.method1182(class500.field7324, (byte) -121, class372.field5342);
                    }
                    if (class500.field7324 != null) {
                        if (class500.field7324.field1896[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class500.field7324.field1896[arg3] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class509();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 87)
    public static void method2363(int arg0) {
        field5721 = null;
        if (arg0 == -5) {
            field5723 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Lql;", line = 98)
    public static final class121 method2364(int arg0, int arg1) {
        if (arg1 != -29752) {
            field5720 = false;
        }
        field5726++;
        class439[] var2 = class349.field5069;
        synchronized (class349.field5069) {
            class121 var3;
            if (arg0 >= class349.field5069.length || class349.field5069[arg0].method2598(-20475)) {
                var3 = new class121();
                var3.field1878 = new class305[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    var3.field1878[var4] = new class305();
                }
            } else {
                var3 = (class121) class349.field5069[arg0].method2595(0);
                var3.method2861((byte) 47);
                int var10002 = class103.field1640[arg0]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;II)I", line = 133)
    public static final int method2365(String arg0, int arg1, int arg2) {
        field5719++;
        if (arg1 >= -108) {
            field5727 = -38;
        }
        return class374.method2241(arg2, true, arg0, true);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)I", line = 144)
    public static final int method2366(int arg0, int arg1, int arg2) {
        field5717++;
        int var3 = arg1 >>> 31;
        if (arg2 <= 35) {
            field5722 = -37;
        }
        return (arg1 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBI)V", line = 159)
    public static final void method2367(int arg0, byte arg1, int arg2) {
        field5716++;
        if (arg1 > -113) {
            return;
        }
        class382 var3 = class119.field1860[arg2][arg0];
        if (var3 != null) {
            class402.field5757 = var3.field5475;
            class462.field6688 = var3.field5479;
            class314.field4247 = var3.field5483;
        }
        class307.method1776((byte) 26);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIFIIIIBFFII[F)V", line = 180)
    public static final void method2368(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, float arg8, float arg9, int arg10, int arg11, float[] arg12) {
        field5725++;
        int var13 = arg10 - arg1;
        if (arg7 >= -69) {
            field5721 = null;
        }
        int var14 = arg11 - arg4;
        int var15 = arg0 - arg6;
        float var16 = arg12[2] * (float) var13 + arg12[0] * (float) var14 + arg12[1] * (float) var15;
        float var17 = arg12[5] * (float) var13 + arg12[4] * (float) var15 + arg12[3] * (float) var14;
        float var18 = arg12[8] * (float) var13 + arg12[7] * (float) var15 + arg12[6] * (float) var14;
        float var19;
        float var20;
        if (arg5 == 0) {
            var19 = arg2 + var16 + 0.5F;
            var20 = arg8 + 0.5F - var18;
        } else if (arg5 == 1) {
            var19 = arg2 + var16 + 0.5F;
            var20 = arg8 + var18 + 0.5F;
        } else if (arg5 == 2) {
            var19 = arg2 + 0.5F - var16;
            var20 = arg9 + 0.5F - var17;
        } else if (arg5 == 3) {
            var19 = arg2 + var16 + 0.5F;
            var20 = arg9 + 0.5F - var17;
        } else if (arg5 == 4) {
            var19 = arg8 + var18 + 0.5F;
            var20 = arg9 + 0.5F - var17;
        } else {
            var19 = arg8 + 0.5F - var18;
            var20 = arg9 + 0.5F - var17;
        }
        if (arg3 == 1) {
            float var22 = var19;
            var19 = -var20;
            var20 = var22;
        } else if (arg3 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg3 == 3) {
            float var21 = var19;
            var19 = var20;
            var20 = -var21;
        }
        class307.field4170 = var19;
        class154.field2376 = var20;
    }
}
