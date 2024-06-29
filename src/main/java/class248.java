import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class248 extends class134 {

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public int field4145 = -1;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public int field4142 = 0;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "Lpf;")
    public static class17 field4139 = new class17(16);

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4144 = "";

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
    public static volatile int field4151 = -1;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "S")
    public static short field4153 = 256;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public int field4132;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public int field4133;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public int field4134;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public int field4140;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public int field4141;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public int field4143;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public int field4146;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public int field4148;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public int field4154;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "Loj;")
    public static class177 field4147;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "[Lmd;")
    public static class273[] field4149;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "[Lec;")
    public static class301[] field4150;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
    public static void method1757(boolean arg0) {
        field4147 = null;
        field4144 = null;
        field4139 = null;
        field4149 = null;
        if (arg0) {
            field4149 = null;
        }
        field4150 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III[B)Ljava/lang/String;")
    public static final String method1758(int arg0, int arg1, int arg2, byte[] arg3) {
        field4135++;
        char[] var4 = new char[arg1];
        if (arg2 != 18532) {
            field4149 = null;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg3[arg0 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class169.field2742[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)V")
    public static final void method1759(int arg0, int arg1, int arg2) {
        field4136++;
        if (arg1 == 0) {
            class36 var3 = class136.method1013(12, arg0, (byte) -90);
            var3.method224(false);
            var3.field577 = arg2;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1760(byte arg0, String[] arg1) {
        field4152++;
        String[] var2 = new String[5];
        if (arg0 <= 118) {
            return null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }
}
