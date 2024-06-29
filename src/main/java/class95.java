import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class95 extends class346 {

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    private int field1284 = 3216;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "[I")
    private int[] field1287 = new int[3];

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    private int field1283 = 3216;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "I")
    private int field1300 = 4096;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "Ljava/lang/String;")
    public static String field1282 = "Members object";

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "S")
    public static short field1281 = 1;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field1298 = "Please remove ";

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "Lir;")
    public static class185 field1293;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "[I")
    public static int[] field1299;

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class95() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field1291;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            int var4 = class359.field5322 * this.field1300 >> 12;
            int[] var5 = this.method2294((byte) 54, arg0 + -1 & class215.field3000, 0);
            int[] var6 = this.method2294((byte) 54, arg0, 0);
            int[] var7 = this.method2294((byte) 54, class215.field3000 & arg0 + 1, 0);
            for (int var8 = 0; ~class134.field1753 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class188.field2572] - var6[class188.field2572 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class232.field3216[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field1287[0] * var14 >> 12;
                int var18 = this.field1287[2] * var16 >> 12;
                int var19 = this.field1287[1] * var15 >> 12;
                var3[var8] = var17 + var19 - -var18;
            }
        }
        if (arg1 != 3) {
            field1285 = 117;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lir;I)V")
    public static final void method757(class185 arg0, int arg1) {
        if (arg1 == 0) {
            ++field1295;
            class86.field1188 = arg0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BZ)C")
    public static final char method758(byte arg0, boolean arg1) {
        ++field1294;
        int var2 = arg0 & 255;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (arg1) {
                field1281 = 56;
            }
            if (var2 >= 128 && var2 < 160) {
                char var3 = class437.field6350[var2 + -128];
                if (var3 == 0) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)V")
    private final void method759(byte arg0) {
        ++field1292;
        double var2 = Math.cos((double) ((float) this.field1283 / 4096.0F));
        this.field1287[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field1284 / 4096.0F)));
        if (arg0 >= -73) {
            field1293 = null;
        }
        this.field1287[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field1284 / 4096.0F)));
        this.field1287[2] = (int) (4096.0D * Math.sin((double) ((float) this.field1283 / 4096.0F)));
        int var4 = this.field1287[0] * this.field1287[0] >> 12;
        int var5 = this.field1287[1] * this.field1287[1] >> 12;
        int var6 = this.field1287[2] * this.field1287[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var5 + var6 + var4 >> 12)));
        if (var7 != 0) {
            this.field1287[0] = (this.field1287[0] << 12) / var7;
            this.field1287[2] = (this.field1287[2] << 12) / var7;
            this.field1287[1] = (this.field1287[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)V")
    public static void method760(byte arg0) {
        if (arg0 == -3) {
            field1282 = null;
            field1298 = null;
            field1299 = null;
            field1293 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
    public static final void method761(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -68 / ((93 - arg1) / 33);
        ++field1290;
        class440 var5 = class186.method1241(arg3, 9, (byte) 56);
        var5.method2756(-1369656528);
        var5.field6374 = arg0;
        var5.field6375 = arg2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field1283 = arg0.method2239(-1076227960);
                }
            } else {
                this.field1284 = arg0.method2239(-1076227960);
            }
        } else {
            this.field1300 = arg0.method2239(-1076227960);
        }
        ++field1286;
        if (arg1) {
            this.field1283 = -125;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILir;I)Lvn;")
    public static final class431 method762(int arg0, class185 arg1, int arg2) {
        ++field1288;
        byte[] var3 = arg1.method1234(arg0, (byte) 76);
        if (var3 == null) {
            return null;
        } else {
            if (arg2 <= 3) {
                field1282 = null;
            }
            return new class431(var3);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public final void method237(byte arg0) {
        this.method759((byte) -102);
        if (arg0 >= -95) {
            field1298 = null;
        }
        ++field1289;
    }
}
