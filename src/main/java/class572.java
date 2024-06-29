import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class572 {

    @OriginalMember(owner = "client!hia", name = "d", descriptor = "Lst;")
    public static class335 field7901;

    @OriginalMember(owner = "client!hia", name = "f", descriptor = "J")
    public static long field7903;

    @OriginalMember(owner = "client!hia", name = "e", descriptor = "Lpb;")
    public static class79 field7902;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "I")
    public static int field7900;

    static {
        new class585("", 73);
        field7901 = new class335(70, 2);
        field7903 = 0L;
        field7902 = new class79(0);
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3353(int arg0) {
        field7900++;
        int var1 = class332.field4707.field4793.method2460(0);
        if (var1 == 0) {
            class343.field4884 = null;
            class164.method1021((byte) 0, 0);
        } else if (var1 == 1) {
            class646.method3608((byte) 126, (byte) 0);
            class164.method1021((byte) 0, 512);
            if (class692.field9623 != null) {
                class230.method1369(111);
            }
        } else {
            class646.method3608((byte) 126, (byte) (class428.field5973 - 4 & 0xFF));
            class164.method1021((byte) 0, 2);
        }
        if (arg0 <= -3) {
            class352.field5093 = class96.field1331;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 38)
    public static final String method3354(String arg0, int arg1) {
        field7899++;
        int var2 = arg0.length();
        if (arg1 != -61) {
            return null;
        }
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
        return var5.toString();
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(I[Ljava/lang/String;I[SI)V", line = 98)
    public static final void method3355(int arg0, String[] arg1, int arg2, short[] arg3, int arg4) {
        if (arg2 != -29023) {
            method3355(-62, null, -91, null, -112);
        }
        field7898++;
        if (arg4 <= arg0) {
            return;
        }
        int var5 = (arg0 + arg4) / 2;
        int var6 = arg0;
        String var7 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var7;
        short var8 = arg3[var5];
        arg3[var5] = arg3[arg4];
        arg3[arg4] = var8;
        for (int var9 = arg0; var9 < arg4; var9++) {
            if (var7 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].compareTo(var7)) {
                String var10 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg1[arg4] = arg1[var6];
        arg1[var6] = var7;
        arg3[arg4] = arg3[var6];
        arg3[var6] = var8;
        method3355(arg0, arg1, -29023, arg3, var6 - 1);
        method3355(var6 + 1, arg1, -29023, arg3, arg4);
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)V", line = 163)
    public static void method3356(byte arg0) {
        int var1 = -30 / ((arg0 + 77) / 41);
        field7902 = null;
        field7901 = null;
    }
}
