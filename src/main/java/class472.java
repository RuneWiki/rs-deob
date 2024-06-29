import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class472 extends class337 {

    @OriginalMember(owner = "client!sv", name = "F", descriptor = "Luq;")
    public static class114 field6819 = null;

    @OriginalMember(owner = "client!sv", name = "H", descriptor = "Lak;")
    public static class234 field6821 = new class234("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6822 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!sv", name = "J", descriptor = "I")
    public static int field6823 = 2;

    @OriginalMember(owner = "client!sv", name = "B", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!sv", name = "C", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!sv", name = "D", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!sv", name = "G", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!sv", name = "E", descriptor = "[Lge;")
    private class503[] field6818;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IB)[I")
    public final int[] method179(int arg0, byte arg1) {
        ++field6816;
        int[] var3 = super.field5007.method512(arg0, arg1 + 11);
        if (super.field5007.field687) {
            this.method2844(false, super.field5007.method511(0));
        }
        if (arg1 != -11) {
            this.method179(-91, (byte) 101);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        if (arg1 == 0) {
            this.field6818 = new class503[arg2.method1515((byte) 127)];
            for (int var4 = 0; var4 < this.field6818.length; ++var4) {
                int var5 = arg2.method1515((byte) 121);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field6818[var4] = class8.method62(arg2, true);
                            }
                        } else {
                            this.field6818[var4] = class14.method101(8823, arg2);
                        }
                    } else {
                        this.field6818[var4] = class507.method3018(arg2, 35);
                    }
                } else {
                    this.field6818[var4] = class264.method1762(49, arg2);
                }
            }
        } else if (arg1 == 1) {
            super.field5019 = arg2.method1515((byte) 126) == 1;
        }
        ++field6817;
        int var7 = -79 % ((arg0 - 82) / 40);
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V")
    public class472() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(B)V")
    public static void method2843(byte arg0) {
        field6822 = null;
        field6821 = null;
        if (arg0 != -45) {
            field6822 = null;
        }
        field6819 = null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z[[I)V")
    private final void method2844(boolean arg0, int[][] arg1) {
        if (!arg0) {
            ++field6820;
            int var3 = class402.field5977;
            int var4 = class329.field4952;
            class353.method2215(arg1, 5);
            class108.method831(0, class446.field6541, 0, class123.field1843, (byte) 45);
            if (this.field6818 != null) {
                for (int var5 = 0; var5 < this.field6818.length; ++var5) {
                    class503 var6 = this.field6818[var5];
                    int var7 = var6.field7257;
                    int var8 = var6.field7261;
                    if (~var7 <= -1) {
                        if (var8 < 0) {
                            var6.method749(-19475, var3, var4);
                        } else {
                            var6.method747(var4, var3, (byte) 39);
                        }
                    } else if (~var8 <= -1) {
                        var6.method748(var3, (byte) 25, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)[[I")
    public final int[][] method673(int arg0, int arg1) {
        int var3 = 26 / ((arg1 - -41) / 49);
        ++field6815;
        int[][] var4 = super.field5011.method1410(arg0, 31649);
        if (super.field5011.field3346) {
            int var5 = class402.field5977;
            int var6 = class329.field4952;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field5011.method1404(false);
            this.method2844(false, var7);
            for (int var9 = 0; var9 < class329.field4952; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; ~var15 > ~class402.field5977; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class74.method644(var16 << 4, 4080);
                    var13[var15] = class74.method644(var16 >> 4, 4080);
                    var12[var15] = class74.method644(16711680, var16) >> 12;
                }
            }
        }
        return var4;
    }
}
