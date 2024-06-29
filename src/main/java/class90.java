import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class90 extends class466 {

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    private int field1400 = 4096;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "Lgn;")
    public static class600 field1398;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eg", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field1402;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
    public static final void method653(int arg0) {
        if (arg0 != -18808) {
            method654((byte) -53);
        }
        if (~class288.field3965 != -3) {
            try {
                Method var1 = (field1402 != null ? field1402 : (field1402 = method656("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class366.field4987 = 1 + (int) (var3 / 1048576L);
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        } else {
            class366.field4987 = 96;
        }
        ++field1401;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class90() {
        super(1, true);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
    public static void method654(byte arg0) {
        if (arg0 <= -84) {
            field1398 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        ++field1396;
        if (arg1 == -5062) {
            if (arg2 == 0) {
                this.field1400 = arg0.method93((byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
    public static final void method655(byte arg0) {
        class555[] var1 = class251.field3485;
        synchronized (class251.field3485) {
            int var2 = 0;
            while (true) {
                if (~class251.field3485.length >= ~var2) {
                    break;
                }
                class251.field3485[var2] = new class555();
                class472.field6630[var2] = 0;
                ++var2;
            }
        }
        if (arg0 < 5) {
            field1398 = null;
        }
        ++field1399;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field1397;
        int[] var3 = super.field6557.method565(arg0, arg1 + -24728);
        if (arg1 != 0) {
            field1398 = null;
        }
        if (super.field6557.field1163) {
            int[] var4 = this.method2721(0, class105.field1581 & arg0 + -1, arg1 + 2);
            int[] var5 = this.method2721(0, arg0, 2);
            int[] var6 = this.method2721(0, class105.field1581 & arg0 + 1, arg1 ^ 2);
            for (int var7 = 0; class312.field4207 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field1400;
                int var9 = (var5[class340.field4582 & var7 + 1] + -var5[var7 + -1 & class340.field4582]) * this.field1400;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method656(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
