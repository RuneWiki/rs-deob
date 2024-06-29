import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public abstract class class423 implements class385 {

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "Lhda;")
    public class714 field5885;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "Lgga;")
    public class513 field5887;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "Lgga;")
    private class513 field5882;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
    public static int field5892 = 0;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public static int field5888 = 0;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    private int field5881;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "J")
    private long field5889;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "Lda;")
    private class443 field5893;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gt", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field5895;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2495(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V", line = 6)
    public void method20(int arg0) {
        field5879++;
        if (arg0 > -50) {
            method2492(90, 60, true, -122, null, false, null);
        }
        class470 var2 = class478.method2833(-113, this.field5882, this.field5885.field9962);
        this.field5893 = class686.field9702.method491(var2, class418.method2474(this.field5887, this.field5885.field9962), true);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)I", line = 22)
    public final int method2490(boolean arg0) {
        if (arg0) {
            this.field5885 = null;
        }
        field5890++;
        int var2 = class138.field2289.method2699(-1);
        int var3 = var2 * 100;
        if (this.field5881 == var2 && var2 != 0) {
            int var4 = class138.field2289.method2698((byte) -121);
            if (var4 > var2) {
                long var5 = this.field5889 - class138.field2289.method2712(arg0);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class337.method2062(false) - this.field5889) * 10000L;
                    if (var7 > var9) {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + (long) (var2 * 100));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field5881 = var2;
            this.field5889 = class337.method2062(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZI)V", line = 73)
    public final void method19(boolean arg0, int arg1) {
        field5880++;
        if (arg1 <= 44) {
            method2492(73, -127, true, 31, null, true, null);
        }
        int var3 = this.field5885.field9967.method3291(this.field5885.field9960, 0, class499.field6858) + this.field5885.field9958;
        int var4 = this.field5885.field9961.method2110(class381.field5334, this.field5885.field9968, -29133) + this.field5885.field9969;
        this.method786(arg0, var4, var3, (byte) 33);
        this.method784(arg0, var4, 57, var3);
        String var5 = class138.field2289.method2711((byte) 32);
        if (class337.method2062(false) - this.field5889 > 10000L) {
            var5 = var5 + " (" + class138.field2289.method2713(0).method2112(28235) + ")";
        }
        this.field5893.method2635(this.field5885.field9960 / 2 + var3, var5, this.field5885.field9959, 0, -1, this.field5885.field9968 / 2 + var4 + this.field5885.field9970 + 4);
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V", line = 102)
    public static final void method2491(int arg0) {
        if (arg0 != -482) {
            method2492(8, -25, false, 109, null, true, null);
        }
        for (class622 var1 = (class622) class108.field1547.method4254((byte) 8); var1 != null; var1 = (class622) class108.field1547.method4251(-81)) {
            if (var1.field8780) {
                var1.field8780 = false;
            } else {
                class523.method3073((byte) 74, var1.field8778);
            }
        }
        field5883++;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIZILgga;ZLof;)V", line = 128)
    public static final void method2492(int arg0, int arg1, boolean arg2, int arg3, class513 arg4, boolean arg5, class477 arg6) {
        class531.method3095(arg1, -61, arg3, arg4, arg0, arg5);
        field5886++;
        if (arg2) {
            method2493(-85);
        }
        class542.field7503 = arg6;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Z", line = 142)
    public boolean method17(int arg0) {
        field5894++;
        boolean var2 = true;
        if (!this.field5887.method3005(this.field5885.field9962, (byte) -69)) {
            var2 = false;
        }
        if (arg0 >= -93) {
            return false;
        } else {
            if (!this.field5882.method3005(this.field5885.field9962, (byte) -69)) {
                var2 = false;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)V", line = 162)
    public static final void method2493(int arg0) {
        field5891++;
        for (int var1 = 0; var1 < class600.field8557; var1++) {
            int var2 = class381.method2295(27328, class600.field8557, var1 + class754.field10490) * class448.field6176;
            for (int var3 = 0; var3 < class448.field6176; var3++) {
                int var4 = var2 + class381.method2295(27328, class448.field6176, class359.field5087 + var3);
                if (class770.field10633[var4] == class7.field98) {
                    class728.field10154[var4].method2161(0, 0, class657.field9274, class36.field432, class657.field9274 * var3, class36.field432 * var1, true, true);
                }
            }
        }
        if (arg0 != 96) {
            method2491(-105);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V", line = 199)
    public static final void method2494(byte arg0) {
        if (class336.field4775.field1588) {
            class139.field2293 = 96;
        } else {
            try {
                Method var1 = (field5895 == null ? (field5895 = method2495("java.lang.Runtime")) : field5895).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class139.field2293 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field5884++;
        if (arg0 != -97) {
            field5892 = 72;
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lgga;Lgga;Lhda;)V", line = 237)
    public class423(class513 arg0, class513 arg1, class714 arg2) {
        this.field5885 = arg2;
        this.field5887 = arg0;
        this.field5882 = arg1;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZIIB)V")
    public abstract void method786(boolean arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZIII)V")
    public abstract void method784(boolean arg0, int arg1, int arg2, int arg3);
}
