import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class302 extends class406 {

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
    public int field4257;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "Ljava/lang/String;")
    public String field4248;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "J")
    public long field4250;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "I")
    public int field4254;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    public int field4247;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public int field4253;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "Ljava/lang/String;")
    public String field4249;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field4242 = -1;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "[[Z")
    public static boolean[][] field4252 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "[I")
    public static int[] field4251 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "Ljj;")
    public static class60 field4256;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1988(byte arg0, String arg1) {
        field4255++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg1.charAt(var4) - var3;
        }
        int var5 = -66 % ((arg0 - 3) / 53);
        return var3;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V")
    public static final void method1989(byte arg0) {
        field4245++;
        if (arg0 > -89) {
            method1990(-106, (byte) -116, 112);
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class442.field6335[var1] = false;
        }
        class218.field3074 = -1;
        class392.field5532 = 0;
        class434.field6241 = -1;
        class98.field1193 = 0;
        class129.field1568 = 1;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBI)I")
    public static final int method1990(int arg0, byte arg1, int arg2) {
        if (arg1 != -17) {
            method1992(109, -112, (byte) 21);
        }
        field4244++;
        return arg0 == 1 || arg0 == 3 ? class28.field352[arg2 & 0x3] : class264.field3753[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V")
    public static void method1991(int arg0) {
        field4256 = null;
        if (arg0 != 24352) {
            field4256 = null;
        }
        field4251 = null;
        field4252 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1992(int arg0, int arg1, byte arg2) {
        int var3 = 79 / ((arg2 - 23) / 60);
        field4243++;
        if (!class435.field6270) {
            return false;
        }
        int var4 = arg0 >> 16;
        int var5 = arg0 & 0xFFFF;
        if (class98.field1194[var4] == null || class98.field1194[var4][var5] == null) {
            return false;
        }
        class184 var6 = class98.field1194[var4][var5];
        if (arg1 == -1 && var6.field2524 == 0) {
            for (class302 var7 = (class302) class393.field5547.method506((byte) -128); var7 != null; var7 = (class302) class393.field5547.method514(true)) {
                if (var7.field4247 == 17 || var7.field4247 == 1006 || var7.field4247 == 23 || var7.field4247 == 5 || var7.field4247 == 48) {
                    for (class184 var8 = class282.method1863(var7.field4254, -25835); var8 != null; var8 = class351.method2241(var8, -710324528)) {
                        if (var6.field2584 == var8.field2584) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class302 var9 = (class302) class393.field5547.method506((byte) -128); var9 != null; var9 = (class302) class393.field5547.method514(true)) {
                if (var9.field4253 == arg1 && var6.field2584 == var9.field4254 && (var9.field4247 == 17 || var9.field4247 == 1006 || var9.field4247 == 23 || var9.field4247 == 5 || var9.field4247 == 48)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
    public class302(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        this.field4257 = arg2;
        this.field4248 = arg1;
        this.field4250 = arg4;
        this.field4254 = arg6;
        this.field4247 = arg3;
        this.field4253 = arg5;
        this.field4249 = arg0;
    }
}
