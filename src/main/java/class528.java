import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class528 {

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "Lwg;")
    public static class450 field7163 = new class450(13, 0, 1, 0);

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public static int field7171 = 0;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "[I")
    public static int[] field7172 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    public static int field7169 = 0;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "Ljia;")
    public static class645 field7167 = new class645();

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method3002(int arg0, int arg1, int arg2) {
        if (arg0 != -28825) {
            field7163 = null;
        }
        field7168++;
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Z)V", line = 15)
    public static void method3003(boolean arg0) {
        field7163 = null;
        if (!arg0) {
            field7167 = null;
        }
        field7172 = null;
        field7167 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)Z", line = 27)
    public static final boolean method3004(byte arg0) {
        field7170++;
        try {
            return arg0 == 109 ? class485.method2770(true) : false;
        } catch (IOException var4) {
            class614.method3477((byte) 19);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class533.field7219 == null ? -1 : class533.field7219.method4275(-97)) + "," + (class152.field2502 == null ? -1 : class152.field2502.method4275(-82)) + "," + (class698.field9643 == null ? -1 : class698.field9643.method4275(100)) + " - " + class11.field179 + "," + (class235.field3379.field5304[0] + class217.field3198) + "," + (class235.field3379.field5308[0] + class400.field5510) + " - ";
            for (int var3 = 0; class11.field179 > var3 && var3 < 50; var3++) {
                var2 = var2 + class262.field3679.field1413[var3] + ",";
            }
            class281.method1820(var2, 28395, var5);
            class479.method2746(false, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V", line = 80)
    public static final void method3005(int arg0) {
        field7165++;
        if (class517.field7034 == 5) {
            class517.field7034 = arg0;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(III)I", line = 92)
    public final int method3006(int arg0, int arg1, int arg2) {
        field7173++;
        if (arg0 != 0) {
            this.toString();
        }
        int var4 = class732.field10098 > arg1 ? class732.field10098 : arg1;
        if (class554.field7830 == this) {
            return 0;
        } else if (class682.field9499 == this) {
            return var4 - arg2;
        } else if (class686.field9543 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III[F[IIIZ[FI[III)V", line = 115)
    public static final void method3007(int arg0, int arg1, int arg2, float[] arg3, int[] arg4, int arg5, int arg6, boolean arg7, float[] arg8, int arg9, int[] arg10, int arg11, int arg12) {
        field7166++;
        int var13 = arg0 * arg6 + arg11;
        if (arg7) {
            field7171 = -68;
        }
        int var14 = arg9 * arg12 + arg1;
        int var15 = arg0 - arg2;
        int var16 = arg9 - arg2;
        if (arg10 == null) {
            for (int var21 = 0; var21 < arg5; var21++) {
                int var22 = arg2 + var13;
                while (var13 < var22) {
                    arg3[var14++] = arg8[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        } else if (arg8 == null) {
            for (int var19 = 0; var19 < arg5; var19++) {
                int var20 = arg2 + var13;
                while (var13 < var20) {
                    arg4[var14++] = arg10[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        } else {
            for (int var17 = 0; var17 < arg5; var17++) {
                int var18 = arg2 + var13;
                while (var18 > var13) {
                    arg4[var14] = arg10[var13];
                    arg3[var14++] = arg8[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "toString", descriptor = "()Ljava/lang/String;", line = 203)
    public final String toString() {
        field7164++;
        throw new IllegalStateException();
    }
}
