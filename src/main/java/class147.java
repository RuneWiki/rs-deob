import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class147 extends class215 {

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    public static int field2306 = -1;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public static volatile int field2312 = 0;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "Leh;")
    public static class137 field2302;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "Leh;")
    public static class137 field2310;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "Lql;")
    public static class291 field2303;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)I")
    public static final int method1014(int arg0) {
        ++field2311;
        if (class189.field3063) {
            return 0;
        } else if (!class226.method1599((byte) 88)) {
            return 1;
        } else if (arg0 < 58) {
            return 92;
        } else {
            return class137.field2207 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field2304;
        if (arg1 != 255) {
            method1015(false);
        }
        int[] var3 = super.field3445.method1755(arg0, (byte) 97);
        if (super.field3445.field4163) {
            int[] var4 = this.method1503(arg1 + -256, 0, arg0);
            for (int var5 = 0; var5 < class244.field4015; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method47(-44, -7);
        }
        int[][] var3 = super.field3461.method1126(1, arg1);
        if (super.field3461.field2591) {
            int[][] var4 = this.method1504(-119, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var3[1];
            int[] var7 = var4[1];
            int[] var8 = var3[2];
            int[] var9 = var4[2];
            int[] var10 = var3[0];
            for (int var11 = 0; ~class244.field4015 < ~var11; ++var11) {
                var10[var11] = -var5[var11] + 4096;
                var6[var11] = -var7[var11] + 4096;
                var8[var11] = -var9[var11] + 4096;
            }
        }
        ++field2309;
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public static void method1015(boolean arg0) {
        field2303 = null;
        field2310 = null;
        field2302 = null;
        if (!arg0) {
            field2312 = -91;
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(III)I")
    public static final int method1016(int arg0, int arg1, int arg2) {
        ++field2307;
        int var3 = 1;
        if (arg0 != -16367) {
            field2303 = null;
        }
        while (arg2 > 1) {
            if ((arg2 & 1) != 0) {
                var3 = arg1 * var3;
            }
            arg2 >>= 1;
            arg1 *= arg1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field2313;
        if (arg0 != 1521146348) {
            field2303 = null;
        }
        if (~arg1 == -1) {
            super.field3453 = ~arg2.method584(255) == -2;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method1017(Throwable arg0, byte arg1) throws IOException {
        if (arg1 != 74) {
            return null;
        } else {
            String var2;
            if (!(arg0 instanceof class292)) {
                var2 = "";
            } else {
                class292 var3 = (class292) arg0;
                var2 = var3.field4632 + " | ";
                arg0 = var3.field4633;
            }
            ++field2308;
            StringWriter var4 = new StringWriter();
            PrintWriter var5 = new PrintWriter(var4);
            arg0.printStackTrace(var5);
            var5.close();
            String var6 = var4.toString();
            BufferedReader var7 = new BufferedReader(new StringReader(var6));
            String var8 = var7.readLine();
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 - -1);
                String var12;
                if (~var10 != 0) {
                    var12 = var9.substring(0, var10);
                } else {
                    var12 = var9;
                }
                String var13 = var12.trim();
                String var14 = var13.substring(var13.lastIndexOf(32) - -1);
                String var15 = var14.substring(1 + var14.lastIndexOf(9));
                String var16 = var2 + var15;
                if (var10 != -1 && ~var11 != 0) {
                    int var17 = var9.indexOf(".java:", var10);
                    if (var17 >= 0) {
                        var16 = var16 + var9.substring(var17 - -5, var11);
                    }
                }
                var2 = var16 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method1018(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++field2305;
        int var8 = arg6 + arg7;
        int var9 = -arg7 + arg4;
        int var10 = arg3 - -arg7;
        int var11 = -64 % (-arg5 / 49);
        int var12 = -arg7 + arg0;
        for (int var13 = arg6; ~var13 > ~var8; ++var13) {
            class78.method433(arg0, arg3, class14.field186[var13], arg2, (byte) 123);
        }
        for (int var14 = arg4; var9 < var14; --var14) {
            class78.method433(arg0, arg3, class14.field186[var14], arg2, (byte) 123);
        }
        for (int var15 = var8; ~var15 >= ~var9; ++var15) {
            int[] var16 = class14.field186[var15];
            class78.method433(var10, arg3, var16, arg2, (byte) 123);
            class78.method433(var12, var10, var16, arg1, (byte) 123);
            class78.method433(arg0, var12, var16, arg2, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class147() {
        super(1, false);
    }
}
