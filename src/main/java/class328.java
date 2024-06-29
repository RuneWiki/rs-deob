import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class328 extends class128 {

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    private int field5003 = 2048;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    private int field5001 = 1024;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    private int field5012 = 3072;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "[Lqb;")
    public static class109[] field5009 = new class109[2048];

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "I")
    public static int field5013 = 0;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "Ljava/lang/String;")
    public static String field5015 = "flash3:";

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "Lan;")
    public static class337 field5006 = new class337();

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field5017 = "Loaded update list";

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "[Z")
    public static boolean[] field5016;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(BI)[I", line = 8)
    public final int[] method126(byte arg0, int arg1) {
        if (arg0 <= 100) {
            this.method107((class107) null, -71, -17);
        }
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int[] var4 = this.method851((byte) -72, 0, arg1);
            for (int var5 = 0; var5 < class10.field141; var5++) {
                var3[var5] = (var4[var5] * this.field5003 >> 12) + this.field5001;
            }
        }
        field5002++;
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 38)
    public class328() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lp;II)V", line = 45)
    public final void method107(class107 arg0, int arg1, int arg2) {
        field5007++;
        if (arg2 > -85) {
            return;
        }
        if (arg1 == 0) {
            this.field5001 = arg0.method624(14612);
        } else if (arg1 == 1) {
            this.field5012 = arg0.method624(14612);
        } else if (arg1 == 2) {
            this.field1753 = arg0.method661(-1) == 1;
        }
    }

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)V", line = 91)
    public static void method2268(int arg0) {
        field5016 = null;
        field5017 = null;
        field5009 = null;
        if (arg0 != 14635) {
            method2270(114);
        }
        field5015 = null;
        field5006 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[[I", line = 108)
    public final int[][] method102(int arg0, int arg1) {
        if (arg1 != 5110) {
            return (int[][]) ((int[][]) null);
        }
        field5005++;
        int[][] var3 = this.field1755.method875(124, arg0);
        if (this.field1755.field1815) {
            int[][] var4 = this.method855(-3102, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class10.field141; var11++) {
                var7[var11] = this.field5001 + (var5[var11] * this.field5003 >> 12);
                var8[var11] = this.field5001 + (var6[var11] * this.field5003 >> 12);
                var9[var11] = (var10[var11] * this.field5003 >> 12) + this.field5001;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)[F", line = 155)
    public static final float[] method2269(int arg0, int arg1) {
        field5004++;
        float var2 = class64.method401() + class64.method400();
        int var3 = class64.method404();
        class218.field3064[3] = 1.0F;
        float var4 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var5 = (float) ((var3 & 0xFF00C3) >> 16) / 255.0F;
        float var6 = (float) (var3 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class218.field3064[0] = var7 * (float) (class229.method1613(16754215, arg1) >> 16) / 255.0F * var5 * var2;
        class218.field3064[1] = var4 * ((float) class229.method1613(255, arg1 >> 8) / 255.0F) * var7 * var2;
        class218.field3064[arg0] = var2 * var7 * (float) class229.method1613(255, arg1) / 255.0F * var6;
        return class218.field3064;
    }

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)V", line = 182)
    public static final void method2270(int arg0) {
        field5014++;
        class237.field3483.method1237((byte) -86);
        class191.field2748.method1237((byte) 13);
        if (arg0 != 0) {
            field4999 = -18;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(IZ)V", line = 198)
    public static final void method2271(int arg0, boolean arg1) {
        if (!arg1) {
            field5017 = (String) null;
        }
        field5000++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class165.method1081(-4441);
        } else if (arg0 == 2) {
            class276.method1989((byte) -103);
        } else if (arg0 == 3) {
            class106.method620(true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)V", line = 228)
    public final void method130(boolean arg0) {
        this.field5003 = this.field5012 - this.field5001;
        if (!arg0) {
            field5010++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)Ljava/lang/String;", line = 256)
    public static final String method2272(int arg0, int arg1) {
        if (arg1 <= 34) {
            return (String) null;
        } else {
            field5011++;
            return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFFB7F9) >> 16) + "." + ((arg0 & 0xFF0B) >> 8) + "." + (arg0 & 0xFF);
        }
    }
}
