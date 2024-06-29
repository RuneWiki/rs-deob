import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class114 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIII)V")
    public static final void method637(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 6) {
            return;
        }
        field1378++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class191.method1226(arg2 + arg3, class398.field5676, class298.field3995, 16);
        int var10 = class191.method1226(arg3 - arg2, class398.field5676, class298.field3995, 16);
        class653.method3620(var9, var10, false, arg0, class319.field4673[arg1]);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg1 - var6;
                int var12 = arg1 + var6;
                if (var12 >= class609.field8313 && var11 <= class19.field169) {
                    int var13 = class191.method1226(arg3 + var5, class398.field5676, class298.field3995, arg4 + 10);
                    int var14 = class191.method1226(arg3 - var5, class398.field5676, class298.field3995, 16);
                    if (class19.field169 >= var12) {
                        class653.method3620(var13, var14, false, arg0, class319.field4673[var12]);
                    }
                    if (class609.field8313 <= var11) {
                        class653.method3620(var13, var14, false, arg0, class319.field4673[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (var16 >= class609.field8313 && class19.field169 >= var15) {
                int var17 = class191.method1226(arg3 + var6, class398.field5676, class298.field3995, 16);
                int var18 = class191.method1226(arg3 - var6, class398.field5676, class298.field3995, 16);
                if (var16 <= class19.field169) {
                    class653.method3620(var17, var18, false, arg0, class319.field4673[var16]);
                }
                if (var15 >= class609.field8313) {
                    class653.method3620(var17, var18, false, arg0, class319.field4673[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1377++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IBI)Lsl;")
    public static final class245 method638(int arg0, byte arg1, int arg2) {
        if (arg1 > -55) {
            return null;
        }
        field1379++;
        class245 var3 = new class245();
        var3.field3308 = -1;
        var3.field3314 = arg2 + 6;
        var3.field3312 = -1;
        var3.field3306 = arg0 + 6;
        var3.field3300 = new int[var3.field3314][var3.field3306];
        var3.method1502(false);
        return var3;
    }
}
