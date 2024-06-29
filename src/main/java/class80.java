import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class80 extends class23 {

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    private int field1412 = 3216;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    private int field1415 = 4096;

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "[I")
    private int[] field1425 = new int[3];

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
    private int field1426 = 3216;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "Ldc;")
    private static class37 field1411 = class185.method1233((byte) 86, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field1410 = -2;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "[I")
    public static int[] field1418 = new int[5];

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field1416 = 0;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "Ldc;")
    public static class37 field1422 = class185.method1233((byte) 86, "Clientscript error in: ");

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "[Ldc;")
    public static class37[] field1420 = new class37[200];

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "Ldc;")
    public static class37 field1423 = field1411;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "Lwa;")
    public static class238 field1409;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        int[] var3 = super.field405.method1461(arg1, (byte) -107);
        ++field1424;
        if (super.field405.field4114) {
            int var4 = class119.field2136 * this.field1415 >> 12;
            int[] var5 = this.method162(class5.field44 & arg1 - 1, 0, (byte) 18);
            int[] var6 = this.method162(arg1, 0, (byte) 18);
            int[] var7 = this.method162(class5.field44 & arg1 - -1, 0, (byte) 18);
            for (int var8 = 0; var8 < class199.field3705; ++var8) {
                int var9 = (var6[var8 + -1 & class215.field4008] - var6[var8 + 1 & class215.field4008]) * var4 >> 12;
                int var10 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                int var12 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class91.field1570[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = this.field1425[2] * var14 >> 12;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field1425[0] * var16 >> 12;
                int var18 = var10 * var13 >> 8;
                int var19 = this.field1425[1] * var18 >> 12;
                var3[var8] = var15 + var19 + var17;
            }
        }
        if (arg0 != 0) {
            method548((class37[]) null, 74);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        ++field1414;
        if (arg2 == 1000) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field1412 = arg0.method230((byte) -123);
                    }
                } else {
                    this.field1426 = arg0.method230((byte) -114);
                }
            } else {
                this.field1415 = arg0.method230((byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V")
    private final void method546(boolean arg0) {
        if (arg0) {
            double var2 = Math.cos((double) ((float) this.field1412 / 4096.0F));
            ++field1419;
            this.field1425[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field1426 / 4096.0F)));
            this.field1425[1] = (int) (var2 * Math.cos((double) ((float) this.field1426 / 4096.0F)) * 4096.0D);
            this.field1425[2] = (int) (4096.0D * Math.sin((double) ((float) this.field1412 / 4096.0F)));
            int var4 = this.field1425[0] * this.field1425[0] >> 12;
            int var5 = this.field1425[1] * this.field1425[1] >> 12;
            int var6 = this.field1425[2] * this.field1425[2] >> 12;
            int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
            if (~var7 != -1) {
                this.field1425[0] = (this.field1425[0] << 12) / var7;
                this.field1425[1] = (this.field1425[1] << 12) / var7;
                this.field1425[2] = (this.field1425[2] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
    public final void method53(int arg0) {
        if (arg0 != -21746) {
            field1416 = 44;
        }
        this.method546(true);
        ++field1417;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lce;Ldc;I)I")
    public static final int method547(class28 arg0, class37 arg1, int arg2) {
        ++field1413;
        int var3 = arg0.field526;
        arg0.method221(arg1.field733, 15549);
        arg0.field526 += class149.field2816.method1572(arg2 ^ -1323418753, arg2, arg1.field743, arg1.field733, arg0.field526, arg0.field502);
        return -var3 + arg0.field526;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([Ldc;I)Ldc;")
    public static final class37 method548(class37[] arg0, int arg1) {
        ++field1421;
        if (arg1 > -5) {
            return null;
        } else if (~arg0.length > -3) {
            throw new IllegalArgumentException();
        } else {
            return class192.method1282(arg0, -32768, 0, arg0.length);
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V")
    public static final void method549(byte arg0) {
        ++field1408;
        if (arg0 > 90) {
            if (class21.field357.toLowerCase().indexOf("microsoft") == -1) {
                class184.field3395[47] = 73;
                class184.field3395[46] = 72;
                class184.field3395[44] = 71;
                class184.field3395[45] = 26;
                class184.field3395[61] = 27;
                class184.field3395[59] = 57;
                class184.field3395[92] = 74;
                class184.field3395[93] = 43;
                class184.field3395[91] = 42;
                if (class21.field355 != null) {
                    class184.field3395[520] = 59;
                    class184.field3395[222] = 58;
                    class184.field3395[192] = 28;
                } else {
                    class184.field3395[192] = 58;
                    class184.field3395[222] = 59;
                }
            } else {
                class184.field3395[190] = 72;
                class184.field3395[192] = 58;
                class184.field3395[219] = 42;
                class184.field3395[186] = 57;
                class184.field3395[222] = 59;
                class184.field3395[191] = 73;
                class184.field3395[223] = 28;
                class184.field3395[220] = 74;
                class184.field3395[189] = 26;
                class184.field3395[188] = 71;
                class184.field3395[221] = 43;
                class184.field3395[187] = 27;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class80() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(Z)V")
    public static void method550(boolean arg0) {
        field1409 = null;
        field1411 = null;
        field1418 = null;
        field1420 = null;
        field1423 = null;
        field1422 = null;
        if (!arg0) {
            field1418 = null;
        }
    }
}
