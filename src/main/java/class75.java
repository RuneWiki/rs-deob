import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class75 extends class107 {

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    private int field1202 = 204;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    private int field1200 = 1;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    private int field1209 = 1;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "[I")
    public static int[] field1207 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!td", name = "F", descriptor = "Lwa;")
    public static class280 field1201 = new class280();

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "[Lwk;")
    public static class294[] field1212 = new class294[14];

    @OriginalMember(owner = "client!td", name = "R", descriptor = "Lti;")
    public static class5 field1213 = new class5(64);

    @OriginalMember(owner = "client!td", name = "S", descriptor = "[I")
    public static int[] field1214 = new int[1000];

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "[I")
    public static int[] field1199;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(II)V")
    public static final void method541(int arg0, int arg1) {
        ++field1203;
        class291 var2 = class61.method389(arg0, 3, 0);
        var2.method2010(0);
        if (arg1 > -25) {
            field1211 = 102;
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
    public static final void method542(int arg0) {
        class88.field1373.method1876((byte) 119);
        ++field1206;
        class158.field2570.method1876((byte) 123);
        if (arg0 != 2) {
            field1213 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BIIII)I")
    public static final int method543(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1205;
        int var5 = -class136.field2193[arg1 * 1024 / arg3] + 65536 >> 1;
        return arg0 != -119 ? 89 : ((-var5 + 65536) * arg2 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field1204;
        if (arg2 != 28) {
            field1199 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field1202 = arg1.method1837(252);
                }
            } else {
                this.field1200 = arg1.method1849(255);
            }
        } else {
            this.field1209 = arg1.method1849(arg2 + 227);
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(B)V")
    public static void method544(byte arg0) {
        int var1 = -46 % ((arg0 - 34) / 60);
        field1213 = null;
        field1207 = null;
        field1214 = null;
        field1201 = null;
        field1199 = null;
        field1212 = null;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class75() {
        super(0, true);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field1208;
        int var3 = -40 / ((arg0 - -34) / 49);
        int[] var4 = super.field1661.method894(118, arg1);
        if (super.field1661.field2115) {
            for (int var5 = 0; var5 < class24.field443; ++var5) {
                int var6 = class221.field3486[var5];
                int var7 = class259.field4254[arg1];
                int var8 = this.field1209 * var6 >> 12;
                int var9 = this.field1200 * var7 >> 12;
                int var10 = var7 % (4096 / this.field1200) * this.field1200;
                int var11 = var6 % (4096 / this.field1209) * this.field1209;
                if (var10 < this.field1202) {
                    for (var8 -= var9; ~var8 > -1; var8 += 4) {
                    }
                    while (~var8 < -4) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var4[var5] = 0;
                        continue;
                    }
                    if (var11 < this.field1202) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                if (this.field1202 > var11) {
                    int var12;
                    for (var12 = var8 - var9; ~var12 > -1; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (~var12 < -1) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                var4[var5] = 4096;
            }
        }
        return var4;
    }
}
