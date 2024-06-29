import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class506 extends OutputStream {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2831(int arg0, String arg1) {
        if (arg0 != 28688) {
            field7056 = 77;
        }
        field7054++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class22.method125(124, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class447.field6284; var3++) {
            String var4 = class395.field5457[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class22.method125(59, var4);
            if (var5 != null && var5.equals(var2)) {
                class447.field6284--;
                for (int var6 = var3; var6 < class447.field6284; var6++) {
                    class395.field5457[var6] = class395.field5457[var6 + 1];
                    class71.field964[var6] = class71.field964[var6 + 1];
                    class337.field4722[var6] = class337.field4722[var6 + 1];
                    class610.field8767[var6] = class610.field8767[var6 + 1];
                    class489.field6800[var6] = class489.field6800[var6 + 1];
                    class215.field2761[var6] = class215.field2761[var6 + 1];
                }
                class277.field3625 = class591.field8533;
                class639.field9268++;
                class118.method650(true, class345.field4780);
                class272.field3457.method3060(class194.method1241(arg1, arg0 - 28814), -25098);
                class272.field3457.method3040(false, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z")
    public static final boolean method2832(int arg0, int arg1) {
        if (arg1 != 3) {
            field7056 = 8;
        }
        field7055++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BIII)I")
    public static final int method2833(byte arg0, int arg1, int arg2, int arg3) {
        field7058++;
        if (arg0 < 66) {
            field7056 = -3;
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!wh", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field7057++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(CI)Z")
    public static final boolean method2834(char arg0, int arg1) {
        if (arg1 < 98) {
            field7056 = -111;
        }
        field7053++;
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }
}
