import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class276 extends class422 {

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "[Lel;")
    public static class387[] field4170 = new class387[50];

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field4176 = new String[100];

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "Ls;")
    public static class186 field4174 = new class186(67, 8);

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "Lje;")
    public static class278 field4181 = new class278(14, 0, 4, 1);

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "Lla;")
    public static class317 field4179;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "[B")
    private byte[] field4173;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLjava/lang/String;Z)V")
    public static final void method1742(byte arg0, String arg1, boolean arg2) {
        field4180++;
        class127.field2169.field6834 = 1;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class135.field2271.field3879; var6++) {
            class12 var9 = class135.field2271.method1636(var6, -107);
            if ((!arg2 || var9.field215) && var9.field163 == -1 && var9.field204 == -1 && var9.field229 == 0 && var9.field192.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class207.field3324 = -1;
                    class274.field4165 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class207.field3324 = var5;
        class274.field4165 = var4;
        class283.field4266 = 0;
        String[] var7 = new String[class207.field3324];
        for (int var8 = 0; var8 < class207.field3324; var8++) {
            var7[var8] = class135.field2271.method1636(var4[var8], class509.method3048(arg0, 37)).field192;
        }
        class535.method3167(var7, -82, class274.field4165);
        class127.field2169.method2742(0);
        class127.field2169.field6834 = 2;
        if (arg0 != -75) {
            method1743(65, 75);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V")
    public static final void method1743(int arg0, int arg1) {
        class79.field1578 = -1;
        class322.field4926 = -1;
        if (arg1 != 0) {
            method1745(-78, -124, -117, null, null, -97, -124, -82, 73);
        }
        class71.field1437 = arg0;
        field4175++;
        class191.method1295(arg1 + 1130);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class276() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)V")
    public final void method1744(int arg0, int arg1, byte arg2) {
        field4178++;
        int var4 = arg0 * 2;
        if (arg1 >= -77) {
            field4181 = null;
        }
        byte var5 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        this.field4173[var4++] = var5;
        this.field4173[var4] = var5;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III[B[BIIII)V")
    public static final void method1745(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field4172++;
        if (arg1 != -31816) {
            return;
        }
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg4[var10001] += arg3[arg6++];
                int var14 = arg7++;
                arg4[var14] += arg3[arg6++];
                int var15 = arg7++;
                arg4[var15] += arg3[arg6++];
                int var16 = arg7++;
                arg4[var16] += arg3[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg4[var10001] += arg3[arg6++];
            }
            arg6 += arg5;
            arg7 += arg8;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V")
    public static void method1746(boolean arg0) {
        field4179 = null;
        field4176 = null;
        field4174 = null;
        field4181 = null;
        if (arg0) {
            field4170 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIB)[B")
    public final byte[] method1747(int arg0, int arg1, int arg2, byte arg3) {
        this.field4173 = new byte[arg0 * arg2 * arg1 * 2];
        field4177++;
        if (arg3 >= -117) {
            return null;
        } else {
            this.method1914(arg1, 0, arg2, arg0);
            return this.field4173;
        }
    }
}
