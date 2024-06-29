import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class27 {

    @OriginalMember(owner = "client!qaa", name = "m", descriptor = "I")
    private int field291 = -1;

    @OriginalMember(owner = "client!qaa", name = "l", descriptor = "I")
    private int field290 = 0;

    @OriginalMember(owner = "client!qaa", name = "i", descriptor = "Lbq;")
    private class289 field287 = new class289();

    @OriginalMember(owner = "client!qaa", name = "q", descriptor = "Z")
    public boolean field295 = false;

    @OriginalMember(owner = "client!qaa", name = "o", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client!qaa", name = "p", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client!qaa", name = "h", descriptor = "[Las;")
    private class152[] field286;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "[[[I")
    private int[][][] field279;

    @OriginalMember(owner = "client!qaa", name = "k", descriptor = "[[Ljava/lang/String;")
    public static String[][] field289 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "F")
    public static float field284;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!qaa", name = "j", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!qaa", name = "n", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BII)Z")
    public static final boolean method128(byte arg0, int arg1, int arg2) {
        if (arg0 >= -120) {
            method130(80, -31);
        }
        field292++;
        return class470.method2840(10115, arg1, arg2) | (arg1 & 0x40000) != 0 || class599.method3409(arg1, arg2, 55);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
    public final void method129(int arg0) {
        for (int var2 = 0; var2 < this.field294; var2++) {
            this.field279[var2][0] = null;
            this.field279[var2][1] = null;
            this.field279[var2][2] = null;
            this.field279[var2] = null;
        }
        field288++;
        this.field279 = null;
        this.field286 = null;
        this.field287.method1728(29632);
        int var3 = 110 % ((-arg0 - 19) / 58);
        this.field287 = null;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(II)Lgw;")
    public static final class170 method130(int arg0, int arg1) {
        field283++;
        class170 var2 = (class170) class685.field9675.method3538((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class190.field2244.method2481(0, arg0, (byte) 118);
        class170 var4 = new class170();
        if (arg1 != -128) {
            return null;
        }
        if (var3 != null) {
            var4.method1057(arg1 + 128, new class244(var3));
        }
        var4.method1058(65527);
        class685.field9675.method3537(arg1 ^ 0xFFFFFFEF, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method131(int arg0) {
        field282++;
        if (this.field294 != this.field293) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 2354) {
            method128((byte) -20, -20, 89);
        }
        for (int var2 = 0; var2 < this.field294; var2++) {
            this.field286[var2] = class41.field466;
        }
        return this.field279;
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(II)[[I")
    public final int[][] method132(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field286 = null;
        }
        field285++;
        if (this.field294 == this.field293) {
            this.field295 = this.field286[arg1] == null;
            this.field286[arg1] = class41.field466;
            return this.field279[arg1];
        } else if (this.field294 == 1) {
            this.field295 = this.field291 != arg1;
            this.field291 = arg1;
            return this.field279[0];
        } else {
            class152 var3 = this.field286[arg1];
            if (var3 == null) {
                this.field295 = true;
                if (this.field290 < this.field294) {
                    var3 = new class152(arg1, this.field290);
                    this.field290++;
                } else {
                    class152 var4 = (class152) this.field287.method1718(184887176);
                    var3 = new class152(arg1, var4.field1669);
                    this.field286[var4.field1672] = null;
                    var4.method864(12983);
                }
                this.field286[arg1] = var3;
            } else {
                this.field295 = false;
            }
            this.field287.method1731(var3, (byte) 123);
            return this.field279[var3.field1669];
        }
    }

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)V")
    public static void method133(int arg0) {
        if (arg0 != 0) {
            field289 = null;
        }
        field289 = null;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BI)Z")
    public static final boolean method134(byte arg0, int arg1) {
        field280++;
        int var2 = -109 % ((16 - arg1) / 42);
        int var3 = arg0 & 0xFF;
        if (var3 == 0) {
            return false;
        } else {
            return var3 < 128 || var3 >= 160 || class231.field2698[var3 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(III)V")
    public class27(int arg0, int arg1, int arg2) {
        this.field293 = arg1;
        this.field294 = arg0;
        this.field286 = new class152[this.field293];
        this.field279 = new int[this.field294][3][arg2];
    }
}
