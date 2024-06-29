import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class506 {

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "[Las;")
    public class415[] field7563 = new class415[8];

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "[I")
    public int[] field7560 = new int[3];

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "[Ltm;")
    public class423[] field7564 = new class423[100];

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "[I")
    public int[] field7565 = new int[100];

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "Ljd;")
    public static class426 field7562 = new class426("WTI", 5);

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public static int field7569 = -1;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public int field7561;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field7567;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
    public static void method3071(byte arg0) {
        field7562 = null;
        if (arg0 != -98) {
            method3071((byte) 42);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(JIBI)V")
    public static final void method3072(long arg0, int arg1, byte arg2, int arg3) {
        field7566++;
        int var5 = ((int) arg0 & 0x7FC8C) >> 14;
        if (arg2 >= -111) {
            return;
        }
        int var6 = ((int) arg0 & 0x3032FF) >> 20;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class83.method585(arg1, 0, 0, arg3, var5, (byte) -82, var6, 0, true);
            return;
        }
        class156 var8 = class454.field7029.method3002(-1, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field2139;
            var9 = var8.field2123;
        } else {
            var9 = var8.field2139;
            var10 = var8.field2123;
        }
        int var11 = var8.field2108;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class83.method585(arg1, var11, var10, arg3, 0, (byte) -82, 0, var9, true);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZI)V")
    public static final void method3073(boolean arg0, int arg1) {
        field7571++;
        if (arg0) {
            method3073(true, -62);
        }
        if (class174.field2565 == 0) {
            class453.field7022.method387((byte) -128, arg1);
        } else {
            class170.field2489 = arg1;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;")
    public static final String[] method3074(byte arg0, String arg1, char arg2) {
        field7570++;
        if (arg0 <= 121) {
            field7568 = -34;
        }
        int var3 = class301.method2027(arg1, (byte) 10, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2 != arg1.charAt(var8); var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }
}
