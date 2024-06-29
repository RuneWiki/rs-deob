import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class215 {

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    private int field3556 = 0;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    private int field3564 = -1;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Le;")
    private class86 field3552 = new class86();

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "Z")
    public boolean field3565 = false;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    private int field3553;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    private int field3554;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "[[I")
    private int[][] field3562;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "[Lma;")
    private class172[] field3563;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "[J")
    public static long[] field3551 = new long[500];

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Lij;")
    public static class50 field3555 = class78.method578(125, "m");

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)V")
    public static final void method1425(int arg0, int arg1, int arg2, int arg3) {
        class65 var4 = class59.field1089[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class139 var5 = var4.field1235;
        if (var5 != null) {
            var5.field2423 = var5.field2423 * arg3 / 16;
            var5.field2431 = var5.field2431 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLij;B)V")
    public static final void method1426(boolean arg0, class50 arg1, byte arg2) {
        if (arg2 <= 66) {
            return;
        }
        if (arg0) {
            try {
                class182.field3004.getAppletContext().showDocument(arg1.method372((byte) 27, class182.field3004.getCodeBase()), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class182.field3004.getAppletContext().showDocument(arg1.method372((byte) 27, class182.field3004.getCodeBase()), "_top");
            } catch (Exception var3) {
            }
        }
        field3550++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)[I")
    public final int[] method1427(int arg0, int arg1) {
        field3560++;
        if (arg0 != -21281) {
            this.field3565 = true;
        }
        if (this.field3554 == this.field3553) {
            this.field3565 = this.field3563[arg1] == null;
            this.field3563[arg1] = class166.field2815;
            return this.field3562[arg1];
        } else if (this.field3554 == 1) {
            this.field3565 = this.field3564 != arg1;
            this.field3564 = arg1;
            return this.field3562[0];
        } else {
            class172 var3 = this.field3563[arg1];
            if (var3 == null) {
                this.field3565 = true;
                if (this.field3556 >= this.field3554) {
                    class172 var4 = (class172) this.field3552.method687(0);
                    var3 = new class172(arg1, var4.field2857);
                    this.field3563[var4.field2859] = null;
                    var4.method267(arg0 ^ 0x536D);
                } else {
                    var3 = new class172(arg1, this.field3556);
                    this.field3556++;
                }
                this.field3563[arg1] = var3;
            } else {
                this.field3565 = false;
            }
            this.field3552.method677(var3, -1);
            return this.field3562[var3.field2857];
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)[[I")
    public final int[][] method1428(int arg0) {
        field3561++;
        if (this.field3554 != this.field3553) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3554; var2++) {
            this.field3563[var2] = class166.field2815;
        }
        return arg0 == 128 ? this.field3562 : null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static void method1429(byte arg0) {
        field3555 = null;
        if (arg0 <= -127) {
            field3551 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 64) {
            return;
        }
        class43.field789 = arg3;
        field3557++;
        class174.field2914 = arg4;
        class137.field2371 = arg5;
        class106.field1915 = arg2;
        class109.field1963 = arg1;
        if (class43.field789 >= 100) {
            int var6 = class174.field2914 * 128 + 64;
            int var7 = class109.field1963 * 128 + 64;
            int var8 = class187.method1260((byte) 105, var6, var7, class201.field3312) - class137.field2371;
            int var9 = var8 - class129.field2268;
            int var10 = var7 - class1.field15;
            int var11 = var6 - class32.field644;
            int var12 = (int) Math.sqrt((double) (var11 * var11 + (var10 * var10)));
            class221.field3723 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class68.field1286 = (int) (-325.949D * Math.atan2((double) var11, (double) var10)) & 0x7FF;
            if (class221.field3723 < 128) {
                class221.field3723 = 128;
            }
            if (class221.field3723 > 383) {
                class221.field3723 = 383;
            }
        }
        class130.field2291 = 2;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public final void method1431(int arg0) {
        for (int var2 = 0; var2 < this.field3554; var2++) {
            this.field3562[var2] = null;
        }
        if (arg0 > -51) {
            return;
        }
        field3558++;
        this.field3562 = null;
        this.field3563 = null;
        this.field3552.method680((byte) -68);
        this.field3552 = null;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(III)V")
    public class215(int arg0, int arg1, int arg2) {
        this.field3553 = arg1;
        this.field3554 = arg0;
        this.field3562 = new int[this.field3554][arg2];
        this.field3563 = new class172[this.field3553];
    }
}
