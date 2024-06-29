import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class330 extends class310 {

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    private int field5245 = 12288;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    private int field5247 = 0;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
    private int field5252 = 8192;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "I")
    private int field5251 = 2048;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    private int field5239 = 0;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    private int field5244 = 4096;

    @OriginalMember(owner = "client!hf", name = "cb", descriptor = "I")
    private int field5256 = 2048;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "[I")
    public static int[] field5248 = new int[2048];

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "[I")
    public static int[] field5253 = new int[1024];

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field5238 = new String[100];

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "Lml;")
    public static class17 field5242;

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "Lth;")
    public static class57 field5255;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)V", line = 11)
    public final void method553(byte arg0) {
        if (arg0 <= -82) {
            field5240++;
            class26.method169(-76);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lqm;II)V", line = 25)
    public final void method75(class227 arg0, int arg1, int arg2) {
        field5254++;
        if (arg2 == 0) {
            this.field5256 = arg0.method1765(true);
        } else if (arg2 == 1) {
            this.field5247 = arg0.method1765(true);
        } else if (arg2 == 2) {
            this.field5239 = arg0.method1765(true);
        } else if (arg2 == 3) {
            this.field5251 = arg0.method1765(true);
        } else if (arg2 == 4) {
            this.field5245 = arg0.method1765(true);
        } else if (arg2 == 5) {
            this.field5244 = arg0.method1765(true);
        } else if (arg2 == 6) {
            this.field5252 = arg0.method1765(true);
        }
        if (arg1 != -2470) {
            this.field5244 = -29;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[I", line = 112)
    public final int[] method77(int arg0, int arg1) {
        field5243++;
        int[] var3 = this.field4950.method930(arg0, 0);
        if (this.field4950.field2001) {
            int var4 = class230.field3818[arg0] - 2048;
            for (int var5 = 0; var5 < class261.field4405; var5++) {
                int var6 = class293.field4737[var5] - 2048;
                int var7 = this.field5256 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = this.field5239 + var6;
                int var10 = var8 <= 2048 ? var8 : var8 - 4096;
                int var11 = var9 < -2048 ? var9 + 4096 : var9;
                int var12 = this.field5251 + var4;
                int var13 = var4 + this.field5247;
                int var14 = var13 < -2048 ? var13 + 4096 : var13;
                int var15 = var11 > 2048 ? var11 - 4096 : var11;
                int var16 = var12 >= -2048 ? var12 : var12 + 4096;
                int var17 = var14 > 2048 ? var14 - 4096 : var14;
                int var18 = var16 <= 2048 ? var16 : var16 - 4096;
                var3[var5] = this.method2323(255, var17, var10) || this.method2322(var18, var15, (byte) 103) ? 4096 : 0;
            }
        }
        return arg1 == -13093 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;CB)I", line = 160)
    public static final int method2321(String arg0, char arg1, byte arg2) {
        field5250++;
        if (arg2 != 28) {
            field5255 = (class57) null;
        }
        int var3 = arg0.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            if (arg0.charAt(var5) == arg1) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIB)Z", line = 192)
    private final boolean method2322(int arg0, int arg1, byte arg2) {
        int var4 = 114 / ((41 - arg2) / 52);
        field5246++;
        int var5 = (arg0 + arg1) * this.field5245 >> 12;
        int var6 = class74.field1255[(var5 * 255 & 0xFF0E9) >> 12];
        int var7 = (var6 << 12) / this.field5245;
        int var8 = (var7 << 12) / this.field5252;
        int var9 = this.field5244 * var8 >> 12;
        return var9 > arg0 - arg1 && (-var9) < (arg0 - arg1);
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 245)
    public class330() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(III)Z", line = 221)
    private final boolean method2323(int arg0, int arg1, int arg2) {
        int var4 = (arg1 - arg2) * this.field5245 >> 12;
        field5241++;
        int var5 = class74.field1255[arg0 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field5245;
        int var7 = (var6 << 12) / this.field5252;
        int var8 = this.field5244 * var7 >> 12;
        return (arg1 + arg2) < var8 && arg1 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V", line = 249)
    public static void method2324(int arg0) {
        field5242 = null;
        field5253 = null;
        field5248 = null;
        if (arg0 != 2048) {
            method2321((String) null, '\r', (byte) 2);
        }
        field5238 = null;
        field5255 = null;
    }
}
