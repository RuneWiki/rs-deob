import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class20 extends class88 {

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public static int field263 = 2;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "Ljava/lang/String;")
    public String field255;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "[C")
    public char[] field256;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "[C")
    public char[] field262;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "[I")
    public int[] field257;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "[I")
    public int[] field260;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IC)I")
    public final int method109(int arg0, char arg1) {
        field250++;
        if (this.field260 == null) {
            return -1;
        }
        if (arg0 < 46) {
            this.method113((byte) -64, (class96) null);
        }
        for (int var3 = 0; var3 < this.field260.length; var3++) {
            if (this.field256[var3] == arg1) {
                return this.field260[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    public final void method110(boolean arg0) {
        if (this.field257 != null) {
            for (int var2 = 0; var2 < this.field257.length; var2++) {
                this.field257[var2] = class154.method1048(this.field257[var2], 32768);
            }
        }
        if (!arg0) {
            method111(69, (byte[]) null, false, -38);
        }
        field251++;
        if (this.field260 != null) {
            for (int var3 = 0; var3 < this.field260.length; var3++) {
                this.field260[var3] = class154.method1048(this.field260[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[BZI)I")
    public static final int method111(int arg0, byte[] arg1, boolean arg2, int arg3) {
        field252++;
        if (arg2) {
            return -19;
        }
        int var4 = -1;
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class274.field4380[(arg1[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(CI)I")
    public final int method112(char arg0, int arg1) {
        field254++;
        if (this.field257 == null) {
            return -1;
        }
        if (arg1 <= 14) {
            field253 = -114;
        }
        for (int var3 = 0; var3 < this.field257.length; var3++) {
            if (this.field262[var3] == arg0) {
                return this.field257[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLpd;)V")
    public final void method113(byte arg0, class96 arg1) {
        if (arg0 > -39) {
            return;
        }
        while (true) {
            int var3 = arg1.method584(255);
            if (var3 == 0) {
                field249++;
                return;
            }
            this.method114(arg1, (byte) 111, var3);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lpd;BI)V")
    private final void method114(class96 arg0, byte arg1, int arg2) {
        field258++;
        if (arg2 == 1) {
            this.field255 = arg0.method588(false);
        } else if (arg2 == 2) {
            int var4 = arg0.method584(255);
            this.field260 = new int[var4];
            this.field256 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field260[var5] = arg0.method549(255);
                byte var6 = arg0.method587(-86);
                this.field256[var5] = var6 == 0 ? 0 : class161.method1123((byte) -27, var6);
            }
        } else if (arg2 == 3) {
            int var7 = arg0.method584(255);
            this.field262 = new char[var7];
            this.field257 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field257[var8] = arg0.method549(255);
                byte var9 = arg0.method587(-14);
                this.field262[var8] = var9 == 0 ? 0 : class161.method1123((byte) -27, var9);
            }
        }
        if (arg1 < 98) {
            field253 = 22;
        }
    }
}
