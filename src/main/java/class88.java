import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class88 extends class354 {

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
    private int field1270 = 2048;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    private int field1261 = 0;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    private int field1265 = 10;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public static int field1262 = -1;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field1266 = null;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "Z")
    public static boolean field1272 = false;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "Lla;")
    public static class319 field1260 = new class319(110, 0);

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "Lok;")
    public static class170 field1269;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "[I")
    private int[] field1271;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "[I")
    private int[] field1276;

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "[S")
    public static short[] field1275;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)V")
    public static final void method593(boolean arg0) {
        class312.method1964(class203.field2716.field1175, (byte) 3);
        ++field1263;
        int var1 = (class331.field5162 >> 3) + (class199.field2646 >> 10);
        class367.field5618 = class56.field800.field1866 = 0;
        int var2 = (class328.field5099 >> 3) + (class140.field1869 >> 10);
        class56.field800.method635(8, 8, -1);
        byte var3 = 18;
        class402.field6119 = new byte[var3][];
        class441.field6657 = new int[var3];
        class510.field7488 = new byte[var3][];
        class263.field3688 = new byte[var3][];
        class410.field6233 = new int[var3];
        class423.field6449 = new int[var3];
        class140.field1870 = new byte[var3][];
        class44.field640 = new int[var3];
        class213.field3024 = new int[var3];
        class455.field6843 = new byte[var3][];
        class411.field6253 = new int[var3][4];
        class510.field7490 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class398.field6071 >> 4)) / 8; ~(((class398.field6071 >> 4) + var1) / 8) <= ~var5; ++var5) {
            for (int var8 = (-(class528.field7734 >> 4) + var2) / 8; ((class528.field7734 >> 4) + var2) / 8 >= var8; ++var8) {
                int var9 = (var5 << 8) + var8;
                class510.field7490[var4] = var9;
                class213.field3024[var4] = class79.field1131.method1265("m" + var5 + "_" + var8, 103);
                class410.field6233[var4] = class79.field1131.method1265("l" + var5 + "_" + var8, 112);
                class441.field6657[var4] = class79.field1131.method1265("n" + var5 + "_" + var8, 120);
                class423.field6449[var4] = class79.field1131.method1265("um" + var5 + "_" + var8, 84);
                class44.field640[var4] = class79.field1131.method1265("ul" + var5 + "_" + var8, 118);
                if (class441.field6657[var4] == -1) {
                    class213.field3024[var4] = -1;
                    class410.field6233[var4] = -1;
                    class423.field6449[var4] = -1;
                    class44.field640[var4] = -1;
                }
                ++var4;
            }
        }
        for (int var6 = var4; ~var6 > ~class441.field6657.length; ++var6) {
            class441.field6657[var6] = -1;
            class213.field3024[var6] = -1;
            class410.field6233[var6] = -1;
            class423.field6449[var6] = -1;
            class44.field640[var6] = -1;
        }
        byte var7;
        if (class435.field6596 != 1 && class435.field6596 != 2) {
            var7 = 7;
        } else {
            var7 = 3;
        }
        class175.method1178(var2, var7, (byte) -80, var1, arg0);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class88() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field1267;
        if (arg2 == 1638) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field1261 = arg0.method1087(false);
                    }
                } else {
                    this.field1270 = arg0.method1074(-635989152);
                }
            } else {
                this.field1265 = arg0.method1087(false);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field1274;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (arg0 >= -74) {
            this.method270((byte) -22, 31);
        }
        if (super.field5478.field6213) {
            int var4 = class350.field5392[arg1];
            if (~this.field1261 == -1) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field1265; ++var6) {
                    if (~var4 <= ~this.field1276[var6] && this.field1276[var6 + 1] > var4) {
                        if (~this.field1271[var6] < ~var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class192.method1300(var3, 0, class531.field7814, var5);
            } else {
                for (int var7 = 0; var7 < class531.field7814; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class195.field2616[var7];
                    int var11 = this.field1261;
                    if (~var11 != -2) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = 2048 - -(-var4 + var10 >> 1);
                            }
                        } else {
                            var8 = (var4 + -4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; this.field1265 > var12; ++var12) {
                        if (var8 >= this.field1276[var12] && ~this.field1276[var12 + 1] < ~var8) {
                            if (var8 < this.field1271[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
    public static void method594(byte arg0) {
        field1266 = null;
        field1260 = null;
        field1275 = null;
        if (arg0 < 74) {
            method593(false);
        }
        field1269 = null;
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)V")
    public final void method357(int arg0) {
        if (arg0 <= 28) {
            method593(false);
        }
        this.method595((byte) -18);
        ++field1273;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V")
    private final void method595(byte arg0) {
        ++field1268;
        int var2 = 0;
        this.field1276 = new int[this.field1265 + 1];
        this.field1271 = new int[this.field1265 + 1];
        int var3 = 4096 / this.field1265;
        int var4 = this.field1270 * var3 >> 12;
        for (int var5 = 0; var5 < this.field1265; ++var5) {
            this.field1276[var5] = var2;
            this.field1271[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field1276[this.field1265] = 4096;
        this.field1271[this.field1265] = 4096 - -this.field1271[0];
        if (arg0 != -18) {
            this.method272((class164) null, 98, 99);
        }
    }
}
