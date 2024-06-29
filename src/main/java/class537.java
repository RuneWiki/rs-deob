import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class537 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field7208 = null;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[I")
    public static int[] field7210 = new int[128];

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "[I")
    public static int[] field7218;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "[I")
    public static int[] field7216;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "S")
    public static short field7219;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    private int field7214;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public int field7215;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method2910(int arg0) {
        field7218 = null;
        field7210 = null;
        field7208 = null;
        if (arg0 != -11808) {
            method2912((byte) 77, null);
        }
        field7216 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I")
    public final int method2911(byte arg0) {
        field7220++;
        return arg0 == 67 ? this.field7215 & 0x3FFF : 4;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method2912(byte arg0, String arg1) {
        field7207++;
        return arg0 <= 47 ? false : class288.method1622((byte) 8, arg1, true, 10);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public final void method2913(boolean arg0) {
        if (!arg0) {
            field7208 = null;
        }
        field7211++;
        this.field7215 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static final void method2914(int arg0) {
        field7213++;
        int var1 = -87 % ((arg0 + 85) / 39);
        int var2 = class277.field3474.length;
        for (int var3 = 0; var3 < var2; var3++) {
            if (class277.field3474[var3] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class629.field8753; var5++) {
                    if (class564.field7842[var3] == class296.field3659[var5]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class296.field3659[class629.field8753] = class564.field7842[var3];
                    var4 = class629.field8753++;
                }
                class630 var6 = new class630(class277.field3474[var3]);
                int var7 = 0;
                while (class277.field3474[var3].length > var6.field8812 && var7 < 511 && class470.field5974 < 1023) {
                    int var8 = var4 | var7++ << 6;
                    int var9 = var6.method3470(13111);
                    int var10 = var9 >> 14;
                    int var11 = var9 >> 7 & 0x3F;
                    int var12 = var9 & 0x3F;
                    int var13 = (class564.field7842[var3] >> 8) * 64 + var11 - class145.field1879;
                    int var14 = (class564.field7842[var3] & 0xFF) * 64 + var12 - class630.field8817;
                    class586 var15 = class287.field3581.method1490(var6.method3470(13111), (byte) -121);
                    class206 var16 = (class206) class180.field2318.method399(-32748, (long) var8);
                    if (var16 == null && (var15.field8192 & 0x1) > 0 && class667.field9402 == var10 && var13 >= 0 && (var15.field8210 + var13) < class431.field5395 && var14 >= 0 && class452.field5802 > (var15.field8210 + var14)) {
                        class307 var17 = new class307();
                        var17.field9676 = var8;
                        class206 var18 = new class206(var17);
                        class180.field2318.method402(var18, (byte) -80, (long) var8);
                        class518.field7076[class441.field5585++] = var18;
                        class153.field1958[class470.field5974++] = var8;
                        var17.field9659 = class133.field1735;
                        var17.method1781(var15, 0);
                        var17.method3863(var17.field3902.field8210, 0);
                        var17.field9716 = var17.field3902.field8214 << 3;
                        var17.method3873(var17.field3902.field8219 + 4 << 11 & 0x3967, 1003, true);
                        var17.method1772(true, var14, (byte) -107, var17.method2785(-1), var10, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)Liw;")
    public static final class532 method2915(int arg0, boolean arg1) {
        if (!arg1) {
            field7218 = null;
        }
        field7217++;
        return class65.field881 && class557.field7741 <= arg0 && arg0 <= class268.field3386 ? class415.field5190[arg0 - class557.field7741] : null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
    public final void method2916(int arg0, int arg1) {
        field7212++;
        int var3 = 73 / ((69 - arg0) / 45);
        this.field7215 = arg1;
        this.field7214 = 0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIB)Z")
    public final boolean method2917(int arg0, int arg1, int arg2, byte arg3) {
        field7209++;
        if (arg3 < 44) {
            field7218 = null;
        }
        int var5 = this.field7214;
        if (this.field7215 == arg1 && this.field7214 == 0) {
            return false;
        }
        boolean var6;
        if (this.field7214 == 0) {
            if (arg1 > this.field7215 && (this.field7215 + arg2) >= arg1 || this.field7215 > arg1 && (this.field7215 - arg2) <= arg1) {
                this.field7215 = arg1;
                return false;
            }
            var6 = true;
        } else if (this.field7214 > 0 && arg1 > this.field7215) {
            int var7 = this.field7214 * this.field7214 / (arg2 * 2);
            int var8 = this.field7215 + var7;
            if (var8 < arg1 && this.field7215 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field7214 < 0 && this.field7215 > arg1) {
            int var9 = this.field7214 * this.field7214 / (arg2 * 2);
            int var10 = this.field7215 - var9;
            if (arg1 < var10 && var10 <= this.field7215) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field7215 < arg1) {
                this.field7214 += arg2;
                if (arg0 != 0 && arg0 < this.field7214) {
                    this.field7214 = arg0;
                }
            } else {
                this.field7214 -= arg2;
                if (arg0 != 0 && this.field7214 < -arg0) {
                    this.field7214 = -arg0;
                }
            }
            if (this.field7214 != var5) {
                int var11 = this.field7214 * this.field7214 / (arg2 * 2);
                if (this.field7215 >= arg1) {
                    if (arg1 < this.field7215 && arg1 > (this.field7215 - var11)) {
                        this.field7214 = var5;
                    }
                } else if (arg1 < (this.field7215 + var11)) {
                    this.field7214 = var5;
                }
            }
        } else if (this.field7214 > 0) {
            this.field7214 -= arg2;
            if (this.field7214 < 0) {
                this.field7214 = 0;
            }
        } else {
            this.field7214 += arg2;
            if (this.field7214 > 0) {
                this.field7214 = 0;
            }
        }
        this.field7215 += this.field7214 + var5 >> 1;
        return var6;
    }

    static {
        for (int var0 = 0; var0 < field7210.length; var0++) {
            field7210[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field7210[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field7210[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field7210[var3] = var3 + 52 - 48;
        }
        field7210[45] = field7210[47] = 63;
        field7210[42] = field7210[43] = 62;
        field7218 = new int[8];
        field7216 = new int[] { 1, 2, 4, 8 };
        field7219 = 205;
    }
}
