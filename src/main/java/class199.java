import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class199 {

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public int field2373;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Z")
    public boolean field2366;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public int field2368;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public int field2370;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "S")
    public short field2371;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "S")
    public short field2363;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "S")
    public short field2364;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "B")
    public byte field2369;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Lil;")
    public static class7 field2365 = new class7();

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "J")
    public static long field2360;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 6)
    public static final String method1100(String arg0, int arg1) {
        field2359++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        if (arg1 != 62) {
            method1102();
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZI)I", line = 55)
    public static final int method1101(int arg0, int arg1, boolean arg2, int arg3) {
        field2367++;
        class369 var4 = class190.method1059(arg0, arg2, 6);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var5 = 0;
            int var6 = -61 % ((-arg1 - 78) / 35);
            for (int var7 = 0; var7 < var4.field5171.length; var7++) {
                if (var4.field5172[var7] == arg3) {
                    var5 += var4.field5171[var7];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "()V", line = 94)
    public static final void method1102() {
        for (int var0 = 0; var0 < class532.field7227.length; var0++) {
            class532.field7227[var0].method3274();
        }
        class532.field7227 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V", line = 104)
    public static void method1103(byte arg0) {
        if (arg0 <= 34) {
            method1101(-115, -43, false, -122);
        }
        field2365 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILha;IIII)V", line = 123)
    public static final void method1104(int arg0, int arg1, class60 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -22275) {
            field2365 = null;
        }
        field2372++;
        if ((class513.field6946 == null || class559.field7871 == null || class704.field9880 == null) && class97.field1282.method2882(-69, class687.field9627) && class97.field1282.method2882(arg5 + 22240, class4.field36) && class97.field1282.method2882(-39, class472.field6540)) {
            class204 var7 = class204.method1129(class97.field1282, class4.field36, 0);
            class559.field7871 = arg2.method366(var7, true);
            var7.method1135();
            class120.field1576 = arg2.method366(var7, true);
            class513.field6946 = arg2.method366(class204.method1129(class97.field1282, class687.field9627, 0), true);
            class204 var8 = class204.method1129(class97.field1282, class472.field6540, 0);
            class704.field9880 = arg2.method366(var8, true);
            var8.method1135();
            class677.field9448 = arg2.method366(var8, true);
        }
        if (class513.field6946 == null || class559.field7871 == null || class704.field9880 == null) {
            return;
        }
        int var9 = (arg0 - (class704.field9880.method674() * 2)) / class513.field6946.method674();
        for (int var10 = 0; var10 < var9; var10++) {
            class513.field6946.method3859(arg4 + class704.field9880.method674() + class513.field6946.method674() * var10, -class513.field6946.method676() + arg3 + arg6);
        }
        int var11 = (arg6 - arg1 - class704.field9880.method676()) / class559.field7871.method676();
        for (int var12 = 0; var12 < var11; var12++) {
            class559.field7871.method3859(arg4, arg1 + arg3 + class559.field7871.method676() * var12);
            class120.field1576.method3859(arg0 + arg4 - class120.field1576.method674(), var12 * class559.field7871.method676() + arg1 + arg3);
        }
        class704.field9880.method3859(arg4, (arg3 + arg6) - class704.field9880.method676());
        class677.field9448.method3859(arg0 + arg4 - class704.field9880.method674(), arg3 - (-arg6 + class704.field9880.method676()));
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 186)
    public class199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field2361 = arg11;
        this.field2373 = arg1;
        this.field2366 = arg10;
        this.field2368 = arg0;
        this.field2370 = arg3;
        this.field2362 = arg2;
        this.field2371 = (short) arg4;
        this.field2363 = (short) arg5;
        this.field2364 = (short) arg6;
        this.field2369 = (byte) arg8;
    }
}
