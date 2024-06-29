import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class132 extends class115 {

    @OriginalMember(owner = "client!di", name = "N", descriptor = "F")
    public static float field1937;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!di", name = "P", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "Lve;")
    public static class233 field1936;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        ++field1935;
        int[][] var3 = super.field1716.method6(arg1, (byte) -94);
        if (arg0 >= -33) {
            field1936 = null;
        }
        if (super.field1716.field23) {
            int[][] var4 = this.method798(0, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class77.field1178; ++var11) {
                var9[var11] = -var5[var11] + 4096;
                var8[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IBII)V")
    public static final void method904(int arg0, byte arg1, int arg2, int arg3) {
        ++field1940;
        class270 var4 = class190.method1213(25702, arg3, 9);
        if (arg1 > -80) {
            field1939 = 87;
        }
        var4.method1808((byte) 62);
        var4.field4230 = arg0;
        var4.field4226 = arg2;
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)V")
    public static final void method905(int arg0) {
        ++field1933;
        int var1 = class272.field4319.length;
        for (int var2 = arg0; ~var2 > ~var1; ++var2) {
            if (class272.field4319[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; class274.field4399 > var4; ++var4) {
                    if (~class23.field303[var2] == ~class185.field2640[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class185.field2640[class274.field4399] = class23.field303[var2];
                    var3 = class274.field4399++;
                }
                class114 var5 = new class114(class272.field4319[var2]);
                int var6 = 0;
                while (var5.field1673 < class272.field4319[var2].length && var6 < 511) {
                    int var7 = var5.method756(-29901);
                    int var8 = var7 >> 14;
                    int var9 = var3 | var6++ << 6;
                    int var10 = (var7 & 8075) >> 7;
                    int var11 = var7 & 63;
                    int var12 = (class23.field303[var2] >> 8) * 64 + -class113.field1615 + var10;
                    int var13 = (255 & class23.field303[var2]) * 64 + -class95.field1445 + var11;
                    class271 var14 = class14.method115(var5.method756(-29901), (byte) -113);
                    if (class82.field1268[var9] == null && (1 & var14.field4271) > 0 && class31.field456 == var8 && ~var12 <= -1 && var12 - -var14.field4283 < 104 && var13 >= 0 && var14.field4283 + var13 < 104) {
                        class82.field1268[var9] = new class72();
                        class72 var15 = class82.field1268[var9];
                        class67.field1049[class51.field756++] = var9;
                        var15.field85 = class82.field1267;
                        var15.method487((byte) -3, var14);
                        var15.method67(var15.field1119.field4283, 17505);
                        var15.field127 = var15.field104 = class203.field2944[var15.field1119.field4241];
                        var15.field66 = var15.field1119.field4272;
                        var15.field107 = var15.field1119.field4254;
                        if (~var15.field66 == -1) {
                            var15.field104 = 0;
                        }
                        var15.method65(true, var13, var15.method57(0), (byte) 1, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
    public class132() {
        super(1, false);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (arg2 == 0) {
            super.field1713 = arg1.method760(false) == 1;
        }
        if (arg0 == -1) {
            ++field1934;
        }
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V")
    public static void method906(int arg0) {
        if (arg0 == 1) {
            field1936 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        if (arg0 != 242152972) {
            this.method168(30, (class114) null, 55);
        }
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            int[] var4 = this.method797(0, arg1, 115);
            for (int var5 = 0; ~class77.field1178 < ~var5; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        ++field1938;
        return var3;
    }
}
