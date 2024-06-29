import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class736 extends class634 {

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    private int field10283 = 1024;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    private int field10288 = 2048;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
    private int field10292 = 3072;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    public static int field10289 = 0;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "Lbt;")
    public static class42 field10284 = new class42();

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "Ldh;")
    public static class320 field10293 = new class320(2, 1);

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public static int field10295 = 1;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field10285;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    public static int field10286;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public static int field10287;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public static int field10290;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public static int field10291;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fl", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field10296;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "Ljava/lang/Thread;")
    public static Thread field10294;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4104(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V", line = 6)
    public final void method87(byte arg0) {
        if (arg0 > 65) {
            ++field10290;
            this.field10288 = -this.field10283 + this.field10292;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)[[I", line = 17)
    public final int[][] method7(byte arg0, int arg1) {
        int var3 = 78 / ((arg0 - -56) / 53);
        ++field10285;
        int[][] var4 = super.field9126.method132(0, arg1);
        if (super.field9126.field295) {
            int[][] var5 = this.method3642(0, arg1, true);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class635.field9139; ++var12) {
                var9[var12] = this.field10283 - -(var6[var12] * this.field10288 >> 12);
                var10[var12] = (var7[var12] * this.field10288 >> 12) + this.field10283;
                var11[var12] = (var8[var12] * this.field10288 >> 12) + this.field10283;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 114)
    public class736() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILig;Z)V", line = 66)
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (!arg2) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        super.field9121 = ~arg1.method1423(-12) == -2;
                    }
                } else {
                    this.field10292 = arg1.method1476(57);
                }
            } else {
                this.field10283 = arg1.method1476(-88);
            }
            ++field10287;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(BI)[I", line = 117)
    public final int[] method13(byte arg0, int arg1) {
        ++field10286;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (super.field9114.field3897) {
            int[] var4 = this.method3641(arg1, 20604, 0);
            for (int var5 = 0; ~var5 > ~class635.field9139; ++var5) {
                var3[var5] = this.field10283 - -(var4[var5] * this.field10288 >> 12);
            }
        }
        if (arg0 > -55) {
            this.field10292 = -92;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Z", line = 151)
    public static final boolean method4102(Class arg0, String arg1, int arg2) {
        ++field10291;
        Class var3 = (Class) class124.field1306.get(arg1);
        if (arg2 != -3) {
            field10295 = 114;
        }
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        } else {
            File var4 = null;
            if (var4 == null) {
                var4 = (File) class326.field4234.get(arg1);
            }
            if (var4 != null) {
                try {
                    var4 = new File(var4.getCanonicalPath());
                    Class var5 = Class.forName("java.lang.Runtime");
                    Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                    var7.invoke(var8, Boolean.TRUE);
                    var8.invoke(Runtime.getRuntime(), arg0, var4.getPath());
                    var7.invoke(var8, Boolean.FALSE);
                    class124.field1306.put(arg1, arg0);
                    return true;
                } catch (NoSuchMethodException var9) {
                    System.load(var4.getPath());
                    class124.field1306.put(arg1, field10296 != null ? field10296 : (field10296 = method4104("mi")));
                    return true;
                } catch (Throwable var10) {
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)V", line = 222)
    public static void method4103(int arg0) {
        field10293 = null;
        if (arg0 <= -125) {
            field10284 = null;
            field10294 = null;
        }
    }
}
