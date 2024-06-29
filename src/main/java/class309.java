import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class309 {

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
    public int[] field4153 = new int[6];

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[[B")
    public byte[][] field4155 = new byte[6][258];

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "[B")
    public byte[] field4161 = new byte[18002];

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "[B")
    public byte[] field4160 = new byte[256];

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "[Z")
    public boolean[] field4159 = new boolean[16];

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "[I")
    public int[] field4163 = new int[256];

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "[Z")
    public boolean[] field4167 = new boolean[256];

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
    public int[] field4151 = new int[16];

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "[[I")
    public int[][] field4169 = new int[6][258];

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "[B")
    public byte[] field4170 = new byte[18002];

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public int field4165 = 0;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public int field4178 = 0;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "[[I")
    public int[][] field4177 = new int[6][258];

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "[[I")
    public int[][] field4166 = new int[6][258];

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "[B")
    public byte[] field4174 = new byte[4096];

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "[I")
    public int[] field4186 = new int[257];

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field4164 = 0;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4180 = new CRC32();

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field4185 = 1403;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "[I")
    public static int[] field4188 = new int[2];

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "Lbr;")
    public static class192 field4187 = new class192("", 17);

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "B")
    public byte field4154;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public int field4148;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public int field4150;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public int field4152;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public int field4157;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public int field4158;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public int field4162;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public int field4172;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public int field4173;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public int field4176;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public int field4181;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public int field4182;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public int field4184;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[B")
    public byte[] field4156;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "[B")
    public byte[] field4168;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method1820(int arg0, int arg1, int arg2) {
        if (arg2 != 25442) {
            method1821((byte) -117, -55);
        }
        field4179++;
        return class583.method3216(arg0, (byte) 109, arg1) | (arg0 & 0x70000) != 0 || class400.method2291(6410, arg0, arg1);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V", line = 41)
    public static final void method1821(byte arg0, int arg1) {
        class206.field2757.method2179(false, arg1);
        field4149++;
        class315.field4217.method2179(false, arg1);
        if (arg0 == 102) {
            class615.field8516.method2179(false, arg1);
            class302.field3992.method2179(false, arg1);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 61)
    public static void method1822(int arg0) {
        field4187 = null;
        field4188 = null;
        field4180 = null;
        if (arg0 != 2) {
            field4187 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIIII)Z", line = 78)
    public static final boolean method1823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4171++;
        if (!class593.method3282(arg6, -2, arg1, arg7)) {
            return false;
        }
        int var10 = class506.field6999[0];
        int var11 = class506.field6999[1];
        int var12 = class506.field6999[arg0];
        if (!class593.method3282(arg9, -2, arg5, arg4)) {
            return false;
        }
        int var13 = class506.field6999[2];
        int var14 = class506.field6999[1];
        int var15 = class506.field6999[0];
        if (class593.method3282(arg8, -2, arg2, arg3)) {
            int var16 = class506.field6999[0];
            int var17 = class506.field6999[1];
            int var18 = class506.field6999[2];
            return class234.method1447(var15, var14, var13, var18, var17, true, var11, var10, var16, var12);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLgba;Ljava/lang/String;BZ)V", line = 117)
    public static final void method1824(boolean arg0, class388 arg1, String arg2, byte arg3, boolean arg4) {
        if (arg3 > -74) {
            return;
        }
        field4183++;
        if (!arg0) {
            class608.method3375(arg2, 3, arg1, 24573);
            return;
        }
        if (class388.field5196.startsWith("win") && arg1.field5176) {
            String var5 = null;
            if (class516.field7178 != null) {
                var5 = class516.field7178.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class661 var6 = class608.method3375(arg2, 0, arg1, 24573);
                class414.field5426 = var6;
                class592.field8167 = arg1;
                class613.field8503 = arg2;
                return;
            }
        }
        if (class388.field5196.startsWith("mac")) {
            String var7 = null;
            if (class516.field7178 != null) {
                var7 = class516.field7178.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg4) {
                class608.method3375(arg2, 1, arg1, 24573);
                return;
            }
        }
        class608.method3375(arg2, 2, arg1, 24573);
    }
}
