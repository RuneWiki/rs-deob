import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class112 extends class314 {

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public int field2061;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public int field2066;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "[[I")
    public int[][] field2068;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "[I")
    public int[] field2055;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "[Z")
    public boolean[] field2063;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "[I")
    public int[] field2054;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "Lud;")
    public static class279 field2064 = class130.method1024("hitbar_default", 255);

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "Lud;")
    public static class279 field2065 = class130.method1024("<col=00ffff>", 255);

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public static int field2067 = 0;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "Lok;")
    public static class149 field2056;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "Ljava/awt/Font;")
    public static Font field2057;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "[Lbn;")
    public static class66[] field2069;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIILsf;JZ)V", line = 3)
    public static final void method911(int arg0, int arg1, int arg2, int arg3, class108 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class243 var8 = new class243();
        var8.field4316 = arg4;
        var8.field4326 = arg1 * 128 + 64;
        var8.field4318 = arg2 * 128 + 64;
        var8.field4313 = arg3;
        var8.field4325 = arg5;
        var8.field4319 = arg6;
        if (class24.field619[arg0][arg1][arg2] == null) {
            class24.field619[arg0][arg1][arg2] = new class191(arg0, arg1, arg2);
        }
        class24.field619[arg0][arg1][arg2].field3440 = var8;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)I", line = 24)
    public static final int method912(byte arg0, int arg1) {
        field2060++;
        int var2 = -73 % ((-arg0 - 59) / 44);
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IJII)Z", line = 53)
    public static final boolean method913(int arg0, long arg1, int arg2, int arg3) {
        field2062++;
        int var5 = ((int) arg1 & 0x7D907) >> 14;
        int var6 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        int var7 = ((int) arg1 & 0x3D57FA) >> 20;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class264 var8 = class252.method1808(var6, (byte) 4);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var10 = var8.field4733;
                var9 = var8.field4766;
            } else {
                var9 = var8.field4733;
                var10 = var8.field4766;
            }
            int var11 = var8.field4714;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class315.method2228(arg2, 2, class72.field1420.field34[0], -22495, 0, var11, var9, 0, true, var10, class72.field1420.field11[0], arg3);
        } else {
            class315.method2228(arg2, 2, class72.field1420.field34[0], -22495, var5 + 1, 0, 0, var7, true, 0, class72.field1420.field11[0], arg3);
        }
        class185.field3396 = class232.field4074;
        class200.field3578 = class64.field1307;
        class312.field5514 = arg0;
        class140.field2554 = 2;
        return true;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BZLud;)V", line = 119)
    public static final void method914(byte arg0, boolean arg1, class279 arg2) {
        field2059++;
        if (arg1) {
            if (class97.field1824 && class84.field1592) {
                try {
                    class197.method1470("openjs", -32634, class110.field2022.field5418, new Object[] { arg2.method2004(class178.field3227.getCodeBase(), arg0 ^ 0xFFFFF7B2).toString() });
                    return;
                } catch (Throwable var8) {
                }
            }
            try {
                class178.field3227.getAppletContext().showDocument(arg2.method2004(class178.field3227.getCodeBase(), 2102), "_blank");
            } catch (Exception var7) {
            }
        } else {
            try {
                class178.field3227.getAppletContext().showDocument(arg2.method2004(class178.field3227.getCodeBase(), arg0 ^ 0xFFFFF7B2), "_top");
            } catch (Exception var6) {
            }
        }
        if (arg0 != -124) {
            field2067 = -84;
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(B)V", line = 159)
    public static final void method915(byte arg0) {
        if (arg0 == -92) {
            class301.field5356.method1338((byte) -126);
            field2053++;
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(B)V", line = 170)
    public static void method916(byte arg0) {
        field2056 = null;
        field2064 = null;
        field2057 = null;
        field2069 = null;
        field2065 = null;
        if (arg0 <= 26) {
            field2067 = 122;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(I[B)V", line = 188)
    public class112(int arg0, byte[] arg1) {
        this.field2061 = arg0;
        class53 var3 = new class53(arg1);
        this.field2066 = var3.method483(-127);
        this.field2068 = new int[this.field2066][];
        this.field2055 = new int[this.field2066];
        this.field2063 = new boolean[this.field2066];
        this.field2054 = new int[this.field2066];
        for (int var4 = 0; var4 < this.field2066; var4++) {
            this.field2054[var4] = var3.method483(-107);
        }
        for (int var5 = 0; var5 < this.field2066; var5++) {
            this.field2063[var5] = var3.method483(-125) == 1;
        }
        for (int var6 = 0; var6 < this.field2066; var6++) {
            this.field2055[var6] = var3.method468(28214);
        }
        for (int var7 = 0; var7 < this.field2066; var7++) {
            this.field2068[var7] = new int[var3.method483(-105)];
        }
        for (int var8 = 0; var8 < this.field2066; var8++) {
            for (int var9 = 0; var9 < this.field2068[var8].length; var9++) {
                this.field2068[var8][var9] = var3.method483(-109);
            }
        }
    }
}
