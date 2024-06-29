import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class13 extends class390 {

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Z")
    public boolean field259;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "[Ln;")
    public class13[] field250;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field264 = 1;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public int field257;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Llf;")
    public class130 field263;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lek;")
    public class296 field256;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)I")
    public int method220(int arg0) {
        field265++;
        int var2 = 53 % ((arg0 - 35) / 55);
        return -1;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
    public void method221(byte arg0) {
        if (arg0 > -7) {
            return;
        }
        if (this.field259) {
            this.field263.method892(-7814);
            this.field263 = null;
        } else {
            this.field256.method1929(127);
            this.field256 = null;
        }
        field266++;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
    public void method33(int arg0) {
        field255++;
        int var2 = 119 / ((arg0 - 2) / 51);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)[[I")
    public int[][] method222(int arg0, int arg1) {
        if (arg0 == -27832) {
            field251++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(III)[I")
    public final int[] method223(int arg0, int arg1, int arg2) {
        if (arg1 != -11541) {
            this.method226((byte) -16);
        }
        field254++;
        return this.field250[arg0].field259 ? this.field250[arg0].method29(true, arg2) : this.field250[arg0].method222(-27832, arg2)[0];
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lkh;BI)V")
    public void method31(class11 arg0, byte arg1, int arg2) {
        if (arg1 < 50) {
            this.method220(-31);
        }
        field253++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZII)V")
    public void method224(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.field256 = null;
        }
        field267++;
        int var4 = this.field257 == 255 ? arg1 : this.field257;
        if (this.field259) {
            this.field263 = new class130(var4, arg1, arg2);
        } else {
            this.field256 = new class296(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLms;)Ljava/lang/String;")
    public static final String method225(boolean arg0, class453 arg1) {
        field269++;
        if (client.method1091(arg1).method954(1) == 0) {
            return null;
        } else if (arg1.field6313 == null || arg1.field6313.trim().length() == 0) {
            return class293.field4106 ? "Hidden-use" : null;
        } else {
            if (arg0) {
                method225(true, (class453) null);
            }
            return arg1.field6313;
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(B)I")
    public int method226(byte arg0) {
        field252++;
        int var2 = 57 % ((-arg0 - 43) / 41);
        return -1;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IZ)V")
    public class13(int arg0, boolean arg1) {
        this.field259 = arg1;
        this.field250 = new class13[arg0];
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(ZII)[[I")
    public final int[][] method227(boolean arg0, int arg1, int arg2) {
        field260++;
        if (arg0) {
            this.field263 = null;
        }
        if (this.field250[arg2].field259) {
            int[] var4 = this.field250[arg2].method29(true, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field250[arg2].method222(-27832, arg1);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI)[I")
    public int[] method29(boolean arg0, int arg1) {
        if (!arg0) {
            this.method29(false, 72);
        }
        field261++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }
}
