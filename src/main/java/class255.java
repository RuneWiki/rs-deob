import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class255 extends class273 {

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    private int field3975 = 4096;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    private int field3978 = 0;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "I")
    private int field3982 = 8192;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    private int field3985 = 2048;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    private int field3980 = 0;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    private int field3986 = 12288;

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
    private int field3992 = 2048;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "Leg;")
    public static class188 field3981 = new class188(64);

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    public static int field3984 = 0;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "I")
    public static int field3990 = 0;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "Ljava/lang/String;")
    public static String field3988 = null;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field3991 = "Loaded sprites";

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V", line = 5)
    public static void method1717(byte arg0) {
        field3991 = null;
        field3981 = null;
        field3988 = null;
        int var1 = -70 % ((arg0 + 13) / 49);
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(III)Z", line = 18)
    private final boolean method1718(int arg0, int arg1, int arg2) {
        int var4 = (arg0 - arg2) * this.field3986 >> 12;
        field3989++;
        if (arg1 != 1485859276) {
            this.method167((byte) -82, 76, (class303) null);
        }
        int var5 = class125.field1958[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field3986;
        int var7 = (var6 << 12) / this.field3982;
        int var8 = this.field3975 * var7 >> 12;
        return var8 > (arg0 + arg2) && (arg0 + arg2) > (-var8);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)V", line = 35)
    public static final void method1719(boolean arg0, int arg1) {
        field3976++;
        if (arg1 != 8192) {
            method1717((byte) -126);
        }
        if (class213.field3378 != arg0) {
            class213.field3378 = arg0;
            class19.method150(121);
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 50)
    public class255() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V", line = 56)
    public final void method349(int arg0) {
        if (arg0 != 1) {
            this.method349(15);
        }
        class27.method207((byte) -118);
        field3983++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[I", line = 74)
    public final int[] method331(int arg0, int arg1) {
        field3987++;
        if (arg1 != -14650) {
            return (int[]) null;
        }
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            int var4 = class96.field1473[arg0] - 2048;
            for (int var5 = 0; var5 < class27.field346; var5++) {
                int var6 = class151.field2384[var5] - 2048;
                int var7 = var6 + this.field3985;
                int var8 = var4 + this.field3980;
                int var9 = this.field3978 + var6;
                int var10 = var8 >= -2048 ? var8 : var8 + 4096;
                int var11 = var10 <= 2048 ? var10 : var10 - 4096;
                int var12 = var9 < -2048 ? var9 + 4096 : var9;
                int var13 = var7 >= -2048 ? var7 : var7 + 4096;
                int var14 = var4 + this.field3992;
                int var15 = var12 <= 2048 ? var12 : var12 - 4096;
                int var16 = var14 >= -2048 ? var14 : var14 + 4096;
                int var17 = var13 <= 2048 ? var13 : var13 - 4096;
                int var18 = var16 > 2048 ? var16 - 4096 : var16;
                var3[var5] = this.method1718(var11, 1485859276, var17) || this.method1720(var18, var15, 466653836) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(III)Z", line = 127)
    private final boolean method1720(int arg0, int arg1, int arg2) {
        int var4 = (arg0 + arg1) * this.field3986 >> 12;
        field3977++;
        int var5 = class125.field1958[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field3986;
        if (arg2 != 466653836) {
            this.field3982 = -74;
        }
        int var7 = (var6 << 12) / this.field3982;
        int var8 = this.field3975 * var7 >> 12;
        return var8 > (arg0 - arg1) && (arg0 - arg1) > (-var8);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BILgn;)V", line = 191)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field3979++;
        if (arg0 < 27) {
            return;
        }
        if (arg1 == 0) {
            this.field3985 = arg2.method1994(false);
        } else if (arg1 == 1) {
            this.field3980 = arg2.method1994(false);
        } else if (arg1 == 2) {
            this.field3978 = arg2.method1994(false);
        } else if (arg1 == 3) {
            this.field3992 = arg2.method1994(false);
        } else if (arg1 == 4) {
            this.field3986 = arg2.method1994(false);
        } else if (arg1 == 5) {
            this.field3975 = arg2.method1994(false);
        } else if (arg1 == 6) {
            this.field3982 = arg2.method1994(false);
        }
    }
}
