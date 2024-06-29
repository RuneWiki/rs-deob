import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class31 {

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    private int field489 = -1;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    private int field500 = 0;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "Lli;")
    private class191 field505 = new class191();

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "Z")
    public boolean field508 = false;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "[[[I")
    private int[][][] field486;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "[Lc;")
    private class269[] field501;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field493 = 0;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "S")
    public static short field504 = 256;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "[I")
    public static int[] field485 = new int[256];

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field491 = 0;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "[I")
    public static int[] field503 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field499 = 0;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field481 = 0;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "Lng;")
    public static class139 field507;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "Lda;")
    public static class102 field506;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Lgf;")
    public static class7 field487;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Lgf;")
    public static class7 field488;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "[I")
    public static int[] field495;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)Lvf;")
    public static final class272 method204(byte arg0, int arg1) {
        field497++;
        class272 var2 = (class272) class1.field13.method826((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        if (arg0 <= 109) {
            field491 = 99;
        }
        byte[] var3 = class71.field1344.method41(-18328, 1, arg1);
        class272 var4 = new class272();
        if (var3 != null) {
            var4.method1795(256, new class190(var3), arg1);
        }
        class1.field13.method827(-3, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method205(int arg0) {
        field483++;
        if (this.field498 != this.field492) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == -20966) {
            for (int var2 = 0; var2 < this.field492; var2++) {
                this.field501[var2] = class261.field4659;
            }
            return this.field486;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static void method206(int arg0) {
        field506 = null;
        if (arg0 != -9) {
            field481 = 103;
        }
        field485 = null;
        field488 = null;
        field503 = null;
        field495 = null;
        field507 = null;
        field487 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lh;I)Lsd;")
    public static final class23 method207(class190 arg0, int arg1) {
        field502++;
        arg0.method1265(114);
        if (arg1 <= 33) {
            method206(10);
        }
        int var2 = arg0.method1265(121);
        class23 var3 = class189.method1229(false, var2);
        var3.field371 = arg0.method1265(114);
        int var4 = arg0.method1265(120);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1265(121);
            var3.method83(arg0, var6, true);
        }
        var3.method85((byte) -39);
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)V")
    public static final void method208(int arg0, byte arg1) {
        field494++;
        if (arg1 < 30) {
            method211(67, -58, -9);
        }
        class67.field1280.method835(1, arg0);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)[[I")
    public final int[][] method209(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method210(27);
        }
        field496++;
        if (this.field498 == this.field492) {
            this.field508 = this.field501[arg1] == null;
            this.field501[arg1] = class261.field4659;
            return this.field486[arg1];
        } else if (this.field492 == 1) {
            this.field508 = this.field489 != arg1;
            this.field489 = arg1;
            return this.field486[0];
        } else {
            class269 var3 = this.field501[arg1];
            if (var3 == null) {
                this.field508 = true;
                if (this.field492 <= this.field500) {
                    class269 var4 = (class269) this.field505.method1296(127);
                    var3 = new class269(arg1, var4.field4824);
                    this.field501[var4.field4823] = null;
                    var4.method349(0);
                } else {
                    var3 = new class269(arg1, this.field500);
                    this.field500++;
                }
                this.field501[arg1] = var3;
            } else {
                this.field508 = false;
            }
            this.field505.method1297((byte) 23, var3);
            return this.field486[var3.field4824];
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
    public final void method210(int arg0) {
        for (int var2 = arg0; var2 < this.field492; var2++) {
            this.field486[var2][0] = null;
            this.field486[var2][1] = null;
            this.field486[var2][2] = null;
            this.field486[var2] = null;
        }
        field490++;
        this.field501 = null;
        this.field486 = null;
        this.field505.method1293(false);
        this.field505 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Lkd;")
    public static final class63 method211(int arg0, int arg1, int arg2) {
        class120 var3 = class7.field122[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2124;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(III)V")
    public class31(int arg0, int arg1, int arg2) {
        this.field492 = arg0;
        this.field486 = new int[this.field492][3][arg2];
        this.field498 = arg1;
        this.field501 = new class269[this.field498];
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field485[var0] = var1;
        }
        field507 = new class139(500);
    }
}
