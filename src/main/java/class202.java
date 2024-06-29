import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class202 extends class117 {

    @OriginalMember(owner = "client!lp", name = "O", descriptor = "Llm;")
    public static class84 field2896 = new class84("", 10);

    @OriginalMember(owner = "client!lp", name = "P", descriptor = "I")
    public static int field2897 = -1;

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!lp", name = "H", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!lp", name = "I", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!lp", name = "J", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!lp", name = "K", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!lp", name = "N", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!lp", name = "Q", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!lp", name = "R", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "Ljava/lang/String;")
    public String field2886;

    @OriginalMember(owner = "client!lp", name = "C", descriptor = "[C")
    public char[] field2884;

    @OriginalMember(owner = "client!lp", name = "L", descriptor = "[C")
    public char[] field2893;

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "[I")
    public int[] field2885;

    @OriginalMember(owner = "client!lp", name = "M", descriptor = "[I")
    public int[] field2894;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Llk;I)V")
    public final void method1280(class425 arg0, int arg1) {
        if (arg1 != 0) {
            method1283(true);
        }
        while (true) {
            int var3 = arg0.method2503(true);
            if (var3 == 0) {
                field2892++;
                return;
            }
            this.method1282(116, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(CI)I")
    public final int method1281(char arg0, int arg1) {
        field2888++;
        if (this.field2885 == null) {
            return -1;
        } else if (arg1 < 104) {
            return 115;
        } else {
            for (int var3 = 0; var3 < this.field2885.length; var3++) {
                if (this.field2893[var3] == arg0) {
                    return this.field2885[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILlk;I)V")
    private final void method1282(int arg0, class425 arg1, int arg2) {
        if (arg0 < 28) {
            return;
        }
        if (arg2 == 1) {
            this.field2886 = arg1.method2464(false);
        } else if (arg2 == 2) {
            int var4 = arg1.method2503(true);
            this.field2894 = new int[var4];
            this.field2884 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2894[var5] = arg1.method2508(true);
                byte var6 = arg1.method2480(-8315);
                this.field2884[var5] = var6 == 0 ? 0 : class104.method665(var6, (byte) 89);
            }
        } else if (arg2 == 3) {
            int var7 = arg1.method2503(true);
            this.field2893 = new char[var7];
            this.field2885 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2885[var8] = arg1.method2508(true);
                byte var9 = arg1.method2480(-8315);
                this.field2893[var8] = var9 == 0 ? 0 : class104.method665(var9, (byte) 72);
            }
        }
        field2890++;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)V")
    public static void method1283(boolean arg0) {
        field2896 = null;
        if (arg0) {
            field2896 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "(I)V")
    public static final void method1284(int arg0) {
        if (arg0 != -24613) {
            method1285(-55, -112, -83, -72);
        }
        field2895++;
        if (class250.field3508) {
            return;
        }
        class343.field4704 = true;
        if (class104.field1498) {
            class356.field4959 = (float) ((int) class356.field4959 + 47 & 0xFFFFFFF0);
        } else {
            class388.field5465 += (12.0F - class388.field5465) / 2.0F;
        }
        class250.field3508 = true;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(IIII)I")
    public static final int method1285(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 114 / ((-arg2 - 60) / 53);
        field2891++;
        if ((class205.field2947[arg1][arg3][arg0] & 0x8) == 0) {
            return arg1 <= 0 || (class205.field2947[1][arg3][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IC)I")
    public final int method1286(int arg0, char arg1) {
        field2889++;
        if (this.field2894 == null) {
            return -1;
        }
        for (int var3 = arg0; var3 < this.field2894.length; var3++) {
            if (this.field2884[var3] == arg1) {
                return this.field2894[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(B)V")
    public final void method1287(byte arg0) {
        field2887++;
        if (arg0 != 40) {
            return;
        }
        if (this.field2885 != null) {
            for (int var2 = 0; var2 < this.field2885.length; var2++) {
                this.field2885[var2] = class366.method2215(this.field2885[var2], 32768);
            }
        }
        if (this.field2894 != null) {
            for (int var3 = 0; var3 < this.field2894.length; var3++) {
                this.field2894[var3] = class366.method2215(this.field2894[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIZLfc;III)V")
    public static final void method1288(int arg0, int arg1, boolean arg2, class343 arg3, int arg4, int arg5, int arg6) {
        class344.field4708 = arg2;
        class70.field1040 = 1;
        if (arg0 != -1) {
            return;
        }
        class174.field2565 = arg6;
        class18.field302 = arg5;
        field2898++;
        class351.field4802 = arg4;
        class351.field4805 = arg3;
        class71.field1041 = arg1;
    }
}
