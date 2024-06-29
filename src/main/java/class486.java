import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class486 {

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public int field6570;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!sj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6569++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lfl;I[IB)V")
    public static final void method2777(class771 arg0, int arg1, int[] arg2, byte arg3) {
        if (arg0.field5214 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field5214.length; var5++) {
                if (arg0.field5214[var5] != arg2[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field5230 != -1) {
                class200 var6 = class108.field1696.method1279((byte) 92, arg0.field5230);
                int var7 = var6.field3031;
                if (var7 == 1) {
                    arg0.field5296 = arg1;
                    arg0.field5238 = 0;
                    arg0.field5251 = 0;
                    arg0.field5270 = 0;
                    arg0.field5242 = 1;
                    if (!arg0.field5229) {
                        class189.method1394(arg0, 256, var6, arg0.field5270);
                    }
                }
                if (var7 == 2) {
                    arg0.field5251 = 0;
                }
            }
        }
        field6568++;
        boolean var8 = true;
        if (arg3 >= -70) {
            return;
        }
        for (int var9 = 0; var9 < arg2.length; var9++) {
            if (arg2[var9] != -1) {
                var8 = false;
            }
            if (arg0.field5214 == null || arg0.field5214[var9] == -1 || class108.field1696.method1279((byte) 92, arg2[var9]).field3038 >= class108.field1696.method1279((byte) 92, arg0.field5214[var9]).field3038) {
                arg0.field5296 = arg1;
                arg0.field5214 = arg2;
                break;
            }
        }
        if (var8) {
            arg0.field5296 = arg1;
            arg0.field5214 = arg2;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(II)V")
    public class486(int arg0, int arg1) {
        this.field6570 = arg0;
    }
}
