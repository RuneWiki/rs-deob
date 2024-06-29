import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class499 extends class42 {

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "[Lql;")
    public static class515[] field6901 = new class515[2048];

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Lfr;")
    public static class282 field6899 = new class282(1);

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "J")
    public long field6896;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Lge;")
    public class499 field6900;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "Lge;")
    public class499 field6903;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
    public static void method2855(int arg0) {
        field6901 = null;
        if (arg0 != 30115) {
            method2857((byte) -12);
        }
        field6899 = null;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
    public final void method2856(int arg0) {
        field6904++;
        if (this.field6900 == null) {
            return;
        }
        this.field6900.field6903 = this.field6903;
        if (arg0 == 0) {
            this.field6903.field6900 = this.field6900;
            this.field6903 = null;
            this.field6900 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
    public static final void method2857(byte arg0) {
        field6902++;
        for (int var1 = 0; var1 < class421.field5766; var1++) {
            int var2 = class255.field3376[var1];
            class117 var3 = class291.field3822[var2];
            int var4 = class481.field6632.method2238(255);
            if ((var4 & 0x4) != 0) {
                var4 += class481.field6632.method2238(255) << 8;
            }
            if ((var4 & 0x40) != 0) {
                var3.field6195 = class481.field6632.method2218(-95);
                var3.field6245 = 100;
            }
            if ((var4 & 0x8) != 0) {
                var3.field6202 = class481.field6632.method2207(47);
                if (var3.field6202 == 65535) {
                    var3.field6202 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var5 = class481.field6632.method2199((byte) 98);
                int var6 = class481.field6632.method2238(255);
                var3.method2588(4, var5, class31.field516, var6);
                var3.field6165 = class31.field516 + 300;
                var3.field6241 = class481.field6632.method2238(255);
            }
            if ((var4 & 0x1) != 0) {
                int var7 = class481.field6632.method2207(-125);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = class481.field6632.method2240(255);
                class128.method918(var8, var3, var7, 122);
            }
            if ((var4 & 0x1000) != 0) {
                var3.field6162 = class481.field6632.method2194(-1);
                var3.field6178 = class481.field6632.method2231((byte) 85);
                var3.field6196 = class481.field6632.method2197((byte) 120);
                var3.field6193 = (byte) class481.field6632.method2240(255);
                var3.field6220 = class31.field516 + class481.field6632.method2245(255);
                var3.field6184 = class31.field516 + class481.field6632.method2233((byte) -113);
            }
            if ((var4 & 0x200) != 0) {
                int var9 = class481.field6632.method2233((byte) -117);
                var3.field6227 = class481.field6632.method2217((byte) 111);
                var3.field6247 = class481.field6632.method2240(255);
                var3.field6243 = (var9 & 0x8000) != 0;
                var3.field6210 = var9 & 0x7FFF;
                var3.field6191 = class31.field516 + var3.field6210 + var3.field6227;
            }
            if ((var4 & 0x100) != 0) {
                var3.field1671 = class481.field6632.method2245(255);
                var3.field1658 = class481.field6632.method2207(-124);
            }
            if ((var4 & 0x2) != 0) {
                int var10 = class481.field6632.method2207(-117);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = class481.field6632.method2232((byte) 127);
                int var12 = class481.field6632.method2222(-128);
                var3.method2598((byte) -23, false, var10, var11, var12);
            }
            if ((var4 & 0x800) != 0) {
                int var13 = class481.field6632.method2212((byte) 83);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class481.field6632.method2243(false);
                int var15 = class481.field6632.method2238(255);
                var3.method2598((byte) -23, true, var13, var14, var15);
            }
            if ((var4 & 0x400) != 0) {
                var3.field6221 = class481.field6632.method2231((byte) 85);
                var3.field6223 = class481.field6632.method2194(-1);
                var3.field6168 = class481.field6632.method2213(true);
                var3.field6249 = class481.field6632.method2197((byte) 120);
                var3.field6179 = class481.field6632.method2245(255) + class31.field516;
                var3.field6171 = class481.field6632.method2212((byte) 83) + class31.field516;
                var3.field6225 = class481.field6632.method2222(-127);
                var3.field6249 += var3.field6266[0];
                var3.field6257 = 1;
                var3.field6168 += var3.field6261[0];
                var3.field6259 = 0;
                var3.field6221 += var3.field6261[0];
                var3.field6223 += var3.field6266[0];
            }
            if ((var4 & 0x20) != 0) {
                int var16 = class481.field6632.method2199((byte) 50);
                int var17 = class481.field6632.method2240(255);
                var3.method2588(4, var16, class31.field516, var17);
            }
            if ((var4 & 0x2000) != 0) {
                int var18 = class481.field6632.method2240(255);
                int[] var19 = new int[var18];
                int[] var20 = new int[var18];
                int[] var21 = new int[var18];
                for (int var22 = 0; var22 < var18; var22++) {
                    int var23 = class481.field6632.method2207(-111);
                    if (var23 == 65535) {
                        var23 = -1;
                    }
                    var19[var22] = var23;
                    var20[var22] = class481.field6632.method2240(255);
                    var21[var22] = class481.field6632.method2245(255);
                }
                class301.method1755(var21, var20, 20201, var3, var19);
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field1661.method2889(115)) {
                    class526.method3092(2, var3);
                }
                var3.method803(class206.field2849.method2554(119, class481.field6632.method2212((byte) 83)), (byte) 116);
                var3.method2589(var3.field1661.field6956, (byte) -125);
                var3.field6177 = var3.field1661.field6963 << 3;
                if (var3.field1661.method2889(-100)) {
                    class229.method1430(null, 120, null, var3, var3.field6261[0], 0, var3.field573, var3.field6266[0]);
                }
            }
        }
        if (arg0 < 69) {
            method2857((byte) 91);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)Z")
    public final boolean method2858(byte arg0) {
        field6895++;
        if (this.field6900 == null) {
            return false;
        } else {
            if (arg0 != -57) {
                this.field6896 = 88L;
            }
            return true;
        }
    }
}
