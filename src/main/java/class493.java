import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class493 extends class513 {

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Ljk;")
    public static class585 field6892 = new class585(31, -1);

    @OriginalMember(owner = "client!e", name = "p", descriptor = "[B")
    public static byte[] field6895;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "[Lf;")
    public static class701[] field6894;

    static {
        int var0 = 0;
        field6895 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field6895[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([Ljava/lang/String;[SZII)V", line = 4)
    public static final void method2865(String[] arg0, short[] arg1, boolean arg2, int arg3, int arg4) {
        if (arg4 < arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var8;
            method2865(arg0, arg1, false, var6 - 1, arg4);
            method2865(arg0, arg1, false, arg3, var6 + 1);
        }
        field6889++;
        if (arg2) {
            method2866((byte) 103, null);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 62)
    public static final String method2866(byte arg0, String arg1) {
        if (arg0 != 116) {
            method2866((byte) 44, null);
        }
        field6890++;
        if (class1.field7.startsWith("win")) {
            return arg1 + ".dll";
        } else if (class1.field7.startsWith("linux")) {
            return "lib" + arg1 + ".so";
        } else if (class1.field7.startsWith("mac")) {
            return "lib" + arg1 + ".dylib";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V", line = 89)
    public static void method2867(boolean arg0) {
        field6894 = null;
        field6895 = null;
        if (arg0) {
            method2865(null, null, false, -107, -128);
        }
        field6892 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 101)
    public static final void method2868(byte arg0) {
        if (arg0 < 76) {
            field6894 = null;
        }
        class155.field1900 = 0;
        class351.field4693 = 0;
        class412.field5854 = 0;
        class160.field1951 = 0;
        field6891++;
    }
}
