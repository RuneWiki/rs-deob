import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class285 {

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "Ltd;")
    public static class192 field4305 = new class192(16);

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4309 = "Prepared sound engine";

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "[B")
    public static byte[] field4308 = new byte[32896];

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 6)
    public static void method1982(int arg0) {
        field4305 = null;
        field4309 = null;
        field4308 = null;
        if (arg0 != 0) {
            field4309 = (String) null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)V", line = 20)
    public static final void method1983(boolean arg0, int arg1) {
        field4306++;
        class169 var2 = class101.method712(arg1, 6, 2089666400);
        var2.method1178((byte) 120);
        if (!arg0) {
            method1983(true, -99);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([BI)Lqb;", line = 33)
    public static final class89 method1984(byte[] arg0, int arg1) {
        field4300++;
        if (arg0 == null) {
            return null;
        } else if (arg1 < 87) {
            return (class89) null;
        } else {
            class89 var2;
            if (class117.field1817) {
                var2 = new class27(arg0, class203.field3039, class184.field2754, class203.field3051, class160.field2403, class205.field3083);
            } else {
                var2 = new class112(arg0, class203.field3039, class184.field2754, class203.field3051, class160.field2403, class205.field3083);
            }
            class10.method49((byte) 92);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([SI[Ljava/lang/String;II)V", line = 55)
    public static final void method1985(short[] arg0, int arg1, String[] arg2, int arg3, int arg4) {
        if (arg4 > arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (var7 == null || arg2[var9] != null && arg2[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var8;
            method1985(arg0, arg1 ^ 0x0, arg2, arg3, var6 - 1);
            method1985(arg0, -14393, arg2, var6 + 1, arg4);
        }
        if (arg1 != -14393) {
            method1982(-92);
        }
        field4301++;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V", line = 109)
    public static final void method1986(int arg0) {
        field4303++;
        if (arg0 < 106) {
            method1988(-57L, true);
        }
        for (int var1 = -1; var1 < class56.field706; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class20.field239[var1];
            }
            class195 var3 = class241.field3592[var2];
            if (var3 != null) {
                class226.method1576(var3.method696((byte) 117), var3, (byte) -61);
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V", line = 140)
    public static final void method1987(int arg0) {
        field4302++;
        class88.field1313.method2182(false);
        if (arg0 == 16) {
            class97.field1460.method2182(false);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(JZ)V", line = 152)
    public static final void method1988(long arg0, boolean arg1) {
        field4307++;
        if (arg0 != 0L) {
            class171.field2573++;
            class234.field3507.method28(104, arg1);
            class234.field3507.method1816(arg0, 21054);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4308[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
