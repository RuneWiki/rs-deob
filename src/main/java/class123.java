import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class123 extends class424 {

    @OriginalMember(owner = "client!b", name = "U", descriptor = "I")
    private int field1858 = 2048;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    private int field1857 = 10;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    private int field1861 = 0;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "I")
    public static int field1850 = 0;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "[Lin;")
    public static class182[] field1854 = new class182[14];

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "[I")
    private int[] field1852;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "[I")
    private int[] field1859;

    static {
        new class368("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V", line = 4)
    public final void method113(int arg0) {
        if (arg0 != 3) {
            field1850 = -97;
        }
        ++field1855;
        this.method944(-1);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 21)
    public class123() {
        super(0, true);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)Z", line = 32)
    public static final boolean method943(byte arg0, int arg1) {
        ++field1853;
        if (arg0 != 62) {
            return true;
        } else {
            return ~arg1 == -3 || ~arg1 == -7 || arg1 == 1009 || ~arg1 == -6 || ~arg1 == -24;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(IB)[I", line = 43)
    public final int[] method43(int arg0, byte arg1) {
        ++field1849;
        if (arg1 != -10) {
            this.method113(-51);
        }
        int[] var3 = super.field5892.method783(arg0, (byte) -124);
        if (super.field5892.field1427) {
            int var4 = class409.field5711[arg0];
            if (~this.field1861 == -1) {
                short var5 = 0;
                for (int var6 = 0; ~var6 > ~this.field1857; ++var6) {
                    if (~var4 <= ~this.field1859[var6] && ~var4 > ~this.field1859[var6 + 1]) {
                        if (var4 < this.field1852[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class79.method642(var3, 0, class303.field4135, var5);
            } else {
                for (int var7 = 0; var7 < class303.field4135; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class332.field4478[var7];
                    int var11 = this.field1861;
                    if (~var11 != -2) {
                        if (var11 != 2) {
                            if (var11 == 3) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 + -4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; var12 < this.field1857; ++var12) {
                        if (~this.field1859[var12] >= ~var8 && this.field1859[var12 + 1] > var8) {
                            if (~var8 > ~this.field1852[var12]) {
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

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lrg;BI)V", line = 163)
    public final void method19(class366 arg0, byte arg1, int arg2) {
        ++field1862;
        if (arg1 != -48) {
            this.field1852 = null;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1861 = arg0.method2306((byte) 72);
                }
            } else {
                this.field1858 = arg0.method2297(13352);
            }
        } else {
            this.field1857 = arg0.method2306((byte) 81);
        }
    }

    @OriginalMember(owner = "client!b", name = "g", descriptor = "(I)V", line = 206)
    private final void method944(int arg0) {
        ++field1860;
        this.field1852 = new int[this.field1857 - arg0];
        this.field1859 = new int[this.field1857 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field1857;
        int var4 = this.field1858 * var3 >> 12;
        for (int var5 = 0; ~this.field1857 < ~var5; ++var5) {
            this.field1859[var5] = var2;
            this.field1852[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field1859[this.field1857] = 4096;
        this.field1852[this.field1857] = this.field1852[0] + 4096;
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "(I)V", line = 238)
    public static void method945(int arg0) {
        field1854 = null;
        if (arg0 != 4096) {
            method945(75);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(ZB)V", line = 251)
    public static final void method946(boolean arg0, byte arg1) {
        ++class160.field2275;
        class88.field1232.method1151(10, (byte) 101);
        ++field1856;
        if (arg1 != -60) {
            method943((byte) -85, 115);
        }
        for (class435 var2 = (class435) class171.field2415.method842((byte) -25); var2 != null; var2 = (class435) class171.field2415.method836(arg1 ^ 93)) {
            if (!var2.method1887(96)) {
                var2 = (class435) class171.field2415.method842((byte) -25);
                if (var2 == null) {
                    break;
                }
            }
            if (~var2.field6140 == -1) {
                class147.method1063((byte) 88, true, arg0, var2);
            }
        }
        if (class50.field640 != null) {
            class298.method1821((byte) -67, class50.field640);
            class50.field640 = null;
        }
    }
}
