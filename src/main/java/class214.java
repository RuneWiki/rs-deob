import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class214 extends class90 {

    @OriginalMember(owner = "client!le", name = "L", descriptor = "[I")
    public static int[] field3079 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    public static int field3082 = 0;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3087 = null;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "[I")
    public static int[] field3089 = new int[128];

    @OriginalMember(owner = "client!le", name = "X", descriptor = "I")
    public static int field3091 = 0;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "Ljava/lang/String;")
    public String field3074;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "[C")
    public char[] field3081;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "[C")
    public char[] field3090;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "[I")
    public int[] field3085;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "[I")
    public int[] field3088;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "[[[B")
    public static byte[][][] field3077;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lkl;B)V")
    public final void method1365(class114 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method760(false);
            if (var3 == 0) {
                field3075++;
                int var4 = 24 % ((arg1 - 6) / 55);
                return;
            }
            this.method1369(38, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IC)I")
    public final int method1366(int arg0, char arg1) {
        field3076++;
        if (this.field3085 == null) {
            return -1;
        }
        for (int var3 = arg0; var3 < this.field3085.length; var3++) {
            if (this.field3090[var3] == arg1) {
                return this.field3085[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
    public static void method1367(boolean arg0) {
        field3087 = null;
        field3077 = null;
        if (!arg0) {
            field3079 = null;
            field3089 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public final void method1368(byte arg0) {
        if (this.field3085 != null) {
            for (int var2 = 0; var2 < this.field3085.length; var2++) {
                this.field3085[var2] = class163.method1093(this.field3085[var2], 32768);
            }
        }
        field3078++;
        if (this.field3088 != null) {
            for (int var3 = 0; var3 < this.field3088.length; var3++) {
                this.field3088[var3] = class163.method1093(this.field3088[var3], 32768);
            }
        }
        if (arg0 != -46) {
            this.method1366(-52, '^');
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILkl;I)V")
    private final void method1369(int arg0, class114 arg1, int arg2) {
        field3073++;
        if (arg0 != 38) {
            method1367(true);
        }
        if (arg2 == 1) {
            this.field3074 = arg1.method753(-128);
        } else if (arg2 == 2) {
            int var4 = arg1.method760(false);
            this.field3088 = new int[var4];
            this.field3081 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3088[var5] = arg1.method756(-29901);
                byte var6 = arg1.method741(3083);
                this.field3081[var5] = var6 == 0 ? 0 : class188.method1210(var6, false);
            }
            return;
        } else if (arg2 == 3) {
            int var7 = arg1.method760(false);
            this.field3085 = new int[var7];
            this.field3090 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3085[var8] = arg1.method756(-29901);
                byte var9 = arg1.method741(arg0 ^ 0xC2D);
                this.field3090[var8] = var9 == 0 ? 0 : class188.method1210(var9, false);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(CB)I")
    public final int method1370(char arg0, byte arg1) {
        field3084++;
        if (this.field3088 == null) {
            return -1;
        } else if (arg1 == -125) {
            for (int var3 = 0; var3 < this.field3088.length; var3++) {
                if (this.field3081[var3] == arg0) {
                    return this.field3088[var3];
                }
            }
            return -1;
        } else {
            return 31;
        }
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "(I)V")
    public static final void method1371(int arg0) {
        if (arg0 > -126) {
            return;
        }
        field3092++;
        if (!class182.field2604 && class180.field2579 != 2) {
            try {
                class6.method74("tbrefresh", 26638, class80.field1237);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)V")
    public static final void method1372(byte arg0, int arg1) {
        field3083++;
        if (class10.field175 == null) {
            class10.field175 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class10.field175[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1 > -123) {
            field3079 = null;
        }
    }
}
