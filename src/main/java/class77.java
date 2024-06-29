import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class77 extends class304 {

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    private int field1116 = 8192;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    private int field1120 = 0;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    private int field1124 = 2048;

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
    private int field1128 = 12288;

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
    private int field1130 = 4096;

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "I")
    private int field1132 = 0;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
    private int field1133 = 2048;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "J")
    public static long field1117 = 0L;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1119 = "glow1:";

    @OriginalMember(owner = "client!m", name = "X", descriptor = "[I")
    public static int[] field1123 = new int[256];

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field1127 = "red:";

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!m", name = "db", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!m", name = "ib", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!m", name = "jb", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(IBI)Z", line = 7)
    private final boolean method604(int arg0, byte arg1, int arg2) {
        field1134++;
        int var4 = (arg0 - arg2) * this.field1128 >> 12;
        int var5 = -75 / ((arg1 + 80) / 42);
        int var6 = class264.field4074[(var4 * 255 & 0xFFC39) >> 12];
        int var7 = (var6 << 12) / this.field1128;
        int var8 = (var7 << 12) / this.field1116;
        int var9 = this.field1130 * var8 >> 12;
        return (arg2 + arg0) < var9 && (-var9) < (arg2 + arg0);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lwm;II)V", line = 24)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field1122++;
        if (arg1 == 0) {
            this.field1124 = arg0.method1755(false);
        } else if (arg1 == 1) {
            this.field1120 = arg0.method1755(false);
        } else if (arg1 == 2) {
            this.field1132 = arg0.method1755(false);
        } else if (arg1 == 3) {
            this.field1133 = arg0.method1755(false);
        } else if (arg1 == 4) {
            this.field1128 = arg0.method1755(false);
        } else if (arg1 == 5) {
            this.field1130 = arg0.method1755(false);
        } else if (arg1 == 6) {
            this.field1116 = arg0.method1755(false);
        }
        if (arg2 != -2828) {
            field1123 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(III)Z", line = 100)
    private final boolean method605(int arg0, int arg1, int arg2) {
        field1126++;
        int var4 = (arg0 + arg1) * this.field1128 >> 12;
        int var5 = class264.field4074[(arg2 * var4 & 0xFF707) >> 12];
        int var6 = (var5 << 12) / this.field1128;
        int var7 = (var6 << 12) / this.field1116;
        int var8 = this.field1130 * var7 >> 12;
        return arg1 - arg0 < var8 && (arg1 - arg0) > (-var8);
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(B)V", line = 115)
    public static final void method606(byte arg0) {
        class168 var1 = class121.field1857;
        synchronized (class121.field1857) {
            class28.field321++;
            class284.field4434 = class12.field158;
            if (class4.field60 >= 0) {
                while (class4.field60 != class260.field4008) {
                    int var2 = class190.field2977[class260.field4008];
                    class260.field4008 = class260.field4008 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class180.field2860[var2] = true;
                    } else {
                        class180.field2860[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class180.field2860[var3] = false;
                }
                class4.field60 = class260.field4008;
            }
            class12.field158 = class90.field1309;
        }
        if (arg0 < -52) {
            field1125++;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[I", line = 158)
    public final int[] method71(int arg0, int arg1) {
        field1129++;
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int var4 = class84.field1225[arg1] - 2048;
            for (int var5 = 0; var5 < class218.field3333; var5++) {
                int var6 = class162.field2631[var5] - 2048;
                int var7 = this.field1124 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = this.field1132 + var6;
                int var10 = var4 + this.field1120;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = var11 <= 2048 ? var11 : var11 - 4096;
                int var13 = var9 >= -2048 ? var9 : var9 + 4096;
                int var14 = var13 > 2048 ? var13 - 4096 : var13;
                int var15 = this.field1133 + var4;
                int var16 = var15 >= -2048 ? var15 : var15 + 4096;
                int var17 = var16 <= 2048 ? var16 : var16 - 4096;
                int var18 = var8 > 2048 ? var8 - 4096 : var8;
                var3[var5] = this.method604(var12, (byte) 76, var18) || this.method605(var14, var17, arg0 + 248) ? 4096 : 0;
            }
        }
        if (arg0 != 7) {
            this.field1133 = 51;
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 234)
    public class77() {
        super(0, true);
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(B)V", line = 252)
    public static void method607(byte arg0) {
        field1119 = null;
        field1123 = null;
        if (arg0 != 49) {
            method606((byte) -93);
        }
        field1127 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V", line = 272)
    public final void method100(boolean arg0) {
        class32.method251(-111);
        field1118++;
        if (!arg0) {
            this.method605(8, -70, -121);
        }
    }
}
