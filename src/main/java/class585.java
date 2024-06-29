import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public abstract class class585 extends class577 {

    @OriginalMember(owner = "client!tv", name = "x", descriptor = "[Ltv;")
    public class585[] field8267;

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "Z")
    public boolean field8266;

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "Ljo;")
    public static class353 field8269 = new class353(16);

    @OriginalMember(owner = "client!tv", name = "D", descriptor = "[I")
    public static int[] field8273 = new int[2];

    @OriginalMember(owner = "client!tv", name = "B", descriptor = "F")
    public static float field8271;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public static int field8258;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    public static int field8259;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
    public int field8260;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!tv", name = "y", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!tv", name = "A", descriptor = "I")
    public static int field8270;

    @OriginalMember(owner = "client!tv", name = "C", descriptor = "I")
    public static int field8272;

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "Lqb;")
    public class235 field8265;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "Llf;")
    public class248 field8255;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(B)V")
    public void method935(byte arg0) {
        if (arg0 != -36) {
            this.method1361((byte) 14);
        }
        field8270++;
        if (this.field8266) {
            this.field8255.method1633(0);
            this.field8255 = null;
        } else {
            this.field8265.method1575(0);
            this.field8265 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IBI)V")
    public void method1360(int arg0, byte arg1, int arg2) {
        field8268++;
        int var4 = this.field8260 == 255 ? arg2 : this.field8260;
        if (this.field8266) {
            this.field8255 = new class248(var4, arg2, arg0);
        } else {
            this.field8265 = new class235(var4, arg2, arg0);
        }
        if (arg1 >= -85) {
            this.method58(false, 79);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)[I")
    public final int[] method3415(int arg0, int arg1, int arg2) {
        field8258++;
        if (arg0 > -126) {
            return null;
        } else if (this.field8267[arg1].field8266) {
            return this.field8267[arg1].method55(arg2, 127);
        } else {
            return this.field8267[arg1].method58(false, arg2)[0];
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(II)[I")
    public int[] method55(int arg0, int arg1) {
        if (arg1 <= 123) {
            this.method54(null, -47, 95);
        }
        field8262++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
    public void method52(int arg0) {
        field8257++;
        if (arg0 != -4096) {
            this.method3417(-19, 37, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)I")
    public int method936(int arg0) {
        if (arg0 <= 34) {
            this.method1360(8, (byte) 83, -6);
        }
        field8261++;
        return -1;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
    public static void method3416(boolean arg0) {
        field8269 = null;
        field8273 = null;
        if (!arg0) {
            field8271 = 0.6533522F;
        }
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(B)I")
    public int method1361(byte arg0) {
        if (arg0 != -96) {
            this.field8266 = true;
        }
        field8272++;
        return -1;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lso;II)V")
    public void method54(class494 arg0, int arg1, int arg2) {
        field8264++;
        if (arg1 != 1) {
            this.method3417(89, 32, (byte) 61);
        }
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(IZ)V")
    public class585(int arg0, boolean arg1) {
        this.field8267 = new class585[arg0];
        this.field8266 = arg1;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIB)[[I")
    public final int[][] method3417(int arg0, int arg1, byte arg2) {
        if (arg2 != 113) {
            this.field8267 = null;
        }
        field8263++;
        if (this.field8267[arg0].field8266) {
            int[] var4 = this.field8267[arg0].method55(arg1, 127);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field8267[arg0].method58(false, arg1);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZI)[[I")
    public int[][] method58(boolean arg0, int arg1) {
        if (arg0) {
            this.method3415(58, -89, -78);
        }
        field8256++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BI)Luh;")
    public static final class176 method3418(byte arg0, int arg1) {
        int var2 = -41 / ((arg0 + 60) / 46);
        field8259++;
        class176[] var3 = class458.method2727((byte) 76);
        for (int var4 = 0; var4 < var3.length; var4++) {
            if (var3[var4].field2732 == arg1) {
                return var3[var4];
            }
        }
        return null;
    }
}
