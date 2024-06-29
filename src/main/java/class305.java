import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class305 extends class110 {

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    private int field4643 = 4096;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    private int field4646 = 4096;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    private int field4649 = 4096;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field4648 = -1;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "Li;")
    public static class21 field4650 = new class21(0, -1);

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public static int field4656 = 0;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    public static int field4655 = -1;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public static int field4657 = -1;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "Lea;")
    public static class235 field4651;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "Lfa;")
    public static class95 field4644;

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 16)
    public class305() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)[[I", line = 21)
    public final int[][] method445(int arg0, boolean arg1) {
        if (arg1) {
            this.method445(87, false);
        }
        field4647++;
        int[][] var3 = this.field1701.method1477((byte) 49, arg0);
        if (this.field1701.field3255) {
            int[][] var4 = this.method770(arg0, (byte) 95, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class124.field1936; var11++) {
                int var12 = var6[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (var13 == var14 && var12 == var13) {
                    var8[var11] = this.field4643 * var14 >> 12;
                    var9[var11] = this.field4646 * var13 >> 12;
                    var10[var11] = this.field4649 * var12 >> 12;
                } else {
                    var8[var11] = this.field4643;
                    var9[var11] = this.field4646;
                    var10[var11] = this.field4649;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V", line = 89)
    public static final void method2109(byte arg0) {
        field4653++;
        if (class49.field626 == 0) {
            return;
        }
        int var1 = 17 % ((arg0 - 38) / 42);
        try {
            if (++class30.field406 > 1500) {
                if (class168.field2517 != null) {
                    class168.field2517.method1138(-16726864);
                    class168.field2517 = null;
                }
                if (class113.field1747 >= 1) {
                    class49.field626 = 0;
                    class170.field2555 = -5;
                    return;
                }
                class113.field1747++;
                if (class178.field2636 == class110.field1697) {
                    class178.field2636 = class76.field994;
                } else {
                    class178.field2636 = class110.field1697;
                }
                class30.field406 = 0;
                class49.field626 = 1;
            }
            if (class49.field626 == 1) {
                class224.field3411 = class274.field4200.method1777(class213.field3234, 0, class178.field2636);
                class49.field626 = 2;
            }
            if (class49.field626 == 2) {
                if (class224.field3411.field3456 == 2) {
                    throw new IOException();
                }
                if (class224.field3411.field3456 != 1) {
                    return;
                }
                class168.field2517 = new class161((Socket) class224.field3411.field3452, class274.field4200);
                class224.field3411 = null;
                class168.field2517.method1134(class234.field3507.field3986, true, class234.field3507.field4025, 0);
                if (class225.field3426 != null) {
                    class225.field3426.method1241((byte) -121);
                }
                if (class17.field211 != null) {
                    class17.field211.method1241((byte) -90);
                }
                int var2 = class168.field2517.method1141(65280);
                if (class225.field3426 != null) {
                    class225.field3426.method1241((byte) -103);
                }
                if (class17.field211 != null) {
                    class17.field211.method1241((byte) -101);
                }
                if (var2 != 101) {
                    class170.field2555 = var2;
                    class49.field626 = 0;
                    class168.field2517.method1138(-16726864);
                    class168.field2517 = null;
                    return;
                }
                class49.field626 = 3;
            }
            if (class49.field626 == 3) {
                if (class168.field2517.method1137(-2266) >= 2) {
                    int var3 = class168.field2517.method1141(65280) << 8 | class168.field2517.method1141(65280);
                    class196.method1351(var3, false);
                    if (class258.field3921 != -1) {
                        class49.field626 = 0;
                        class168.field2517.method1138(-16726864);
                        class168.field2517 = null;
                        class132.method971((byte) 48);
                        return;
                    }
                    class49.field626 = 0;
                    class170.field2555 = 6;
                    class168.field2517.method1138(-16726864);
                    class168.field2517 = null;
                    return;
                }
                return;
            }
        } catch (IOException var5) {
            if (class168.field2517 != null) {
                class168.field2517.method1138(-16726864);
                class168.field2517 = null;
            }
            if (class113.field1747 >= 1) {
                class49.field626 = 0;
                class170.field2555 = -4;
            } else {
                class30.field406 = 0;
                class113.field1747++;
                if (class178.field2636 == class110.field1697) {
                    class178.field2636 = class76.field994;
                } else {
                    class178.field2636 = class110.field1697;
                }
                class49.field626 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILre;I)V", line = 240)
    public final void method44(int arg0, class263 arg1, int arg2) {
        field4652++;
        if (arg0 == 0) {
            this.field4643 = arg1.method1830((byte) -77);
        } else if (arg0 == 1) {
            this.field4646 = arg1.method1830((byte) -77);
        } else if (arg0 == 2) {
            this.field4649 = arg1.method1830((byte) -77);
        }
        if (arg2 > -37) {
            field4657 = 107;
        }
    }

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "(I)V", line = 290)
    public static void method2110(int arg0) {
        field4644 = null;
        field4650 = null;
        field4651 = null;
        int var1 = 32 % ((arg0 + 34) / 49);
    }
}
