import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class89 extends class304 {

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
    private int field1260 = 10;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
    private int field1262 = 2048;

    @OriginalMember(owner = "client!jf", name = "cb", descriptor = "I")
    private int field1269 = 0;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
    public static int field1266 = 0;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "I")
    public static int field1268 = 0;

    @OriginalMember(owner = "client!jf", name = "eb", descriptor = "I")
    public static int field1271 = 0;

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!jf", name = "db", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "[I")
    private int[] field1258;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "[I")
    private int[] field1261;

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V", line = 8)
    public class89() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BIII)I", line = 23)
    public static final int method651(byte arg0, int arg1, int arg2, int arg3) {
        field1265++;
        int var4 = arg3 / arg2;
        if (arg0 != -34) {
            return 76;
        }
        int var5 = arg2 - 1 & arg3;
        int var6 = arg2 - 1 & arg1;
        int var7 = arg1 / arg2;
        int var8 = class307.method2105(var4, (byte) 86, var7);
        int var9 = class307.method2105(var4 + 1, (byte) 80, var7);
        int var10 = class307.method2105(var4, (byte) 83, var7 + 1);
        int var11 = class307.method2105(var4 + 1, (byte) 68, var7 + 1);
        int var12 = class212.method1516(var9, (byte) 106, arg2, var8, var5);
        int var13 = class212.method1516(var11, (byte) 74, arg2, var10, var5);
        return class212.method1516(var13, (byte) 41, arg2, var12, var6);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZB)V", line = 54)
    public static final void method652(boolean arg0, byte arg1) {
        field1259++;
        byte[][] var2;
        if (class73.field1058 && arg0) {
            var2 = class322.field4963;
        } else {
            var2 = class299.field4605;
        }
        if (arg1 != -95) {
            field1266 = -54;
        }
        int var3 = class137.field2069.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class139.field2087[var4] >> 8) * 64 - class327.field5054;
                int var7 = (class139.field2087[var4] & 0xFF) * 64 - class293.field4522;
                class293.method2025((byte) 94);
                class38.method294(arg0, var6, var7, -502116606, class91.field1323, var5);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lwm;II)V", line = 97)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field1264++;
        if (arg2 != -2828) {
            field1266 = -77;
        }
        if (arg1 == 0) {
            this.field1260 = arg0.method1774((byte) -96);
        } else if (arg1 == 1) {
            this.field1262 = arg0.method1755(false);
        } else if (arg1 == 2) {
            this.field1269 = arg0.method1774((byte) -125);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V", line = 140)
    public final void method100(boolean arg0) {
        this.method653((byte) -115);
        field1257++;
        if (!arg0) {
            this.method69((class254) null, -29, -9);
        }
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(B)V", line = 151)
    private final void method653(byte arg0) {
        field1263++;
        this.field1258 = new int[this.field1260 + 1];
        this.field1261 = new int[this.field1260 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field1260;
        int var4 = this.field1262 * var3 >> 12;
        if (arg0 > -84) {
            method651((byte) -93, -105, -123, 65);
        }
        for (int var5 = 0; var5 < this.field1260; var5++) {
            this.field1261[var5] = var2;
            this.field1258[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1261[this.field1260] = 4096;
        this.field1258[this.field1260] = this.field1258[0] + 4096;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[I", line = 185)
    public final int[] method71(int arg0, int arg1) {
        field1270++;
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (arg0 != 7) {
            this.method71(14, 96);
        }
        if (this.field4669.field5223) {
            int var4 = class84.field1225[arg1];
            if (this.field1269 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field1260; var6++) {
                    if (var4 >= this.field1261[var6] && var4 < this.field1261[var6 + 1]) {
                        if (this.field1258[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class126.method946(var3, 0, class218.field3333, var5);
            } else {
                for (int var7 = 0; var7 < class218.field3333; var7++) {
                    short var8 = 0;
                    int var9 = class162.field2631[var7];
                    int var10 = 0;
                    int var11 = this.field1269;
                    if (var11 == 1) {
                        var10 = var9;
                    } else if (var11 == 2) {
                        var10 = (var9 + var4 - 4096 >> 1) + 2048;
                    } else if (var11 == 3) {
                        var10 = (var9 - var4 >> 1) + 2048;
                    }
                    for (int var12 = 0; var12 < this.field1260; var12++) {
                        if (this.field1261[var12] <= var10 && this.field1261[var12 + 1] > var10) {
                            if (var10 < this.field1258[var12]) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var8;
                }
            }
        }
        return var3;
    }
}
