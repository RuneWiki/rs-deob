import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class class775 {

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public int field10665;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public int field10661;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public int field10662;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "[I")
    public static int[] field10660 = new int[8];

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "S")
    public static short field10668 = 256;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field10664;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field10666;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field10667;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "Luq;")
    public static class172 field10663;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V", line = 5)
    public static void method4263(byte arg0) {
        field10663 = null;
        field10660 = null;
        if (arg0 != 84) {
            method4263((byte) 16);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BIZII)V", line = 17)
    public static final void method4264(byte arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field10666++;
        if (!arg2 && class759.field10402 == arg3 && class559.field7668 == arg1 && class786.field10794 == class184.field2420 || class125.field1721.field5155.method591(43) == 1) {
            return;
        }
        class559.field7668 = arg1;
        class786.field10794 = class184.field2420;
        class759.field10402 = arg3;
        if (class125.field1721.field5155.method591(43) == 1) {
            class786.field10794 = 0;
        }
        class170.method1148(arg4, -11239);
        class316.method2017(0, true, class58.field709.method365(class55.field647, (byte) 95), class375.field5490, class355.field5157, class166.field2202);
        int var5 = class120.field1625;
        class120.field1625 = (class759.field10402 - (class102.field1467 >> 4)) * 8;
        int var6 = class259.field3849;
        class259.field3849 = (class559.field7668 - (class393.field5663 >> 4)) * 8;
        class781.field10724 = class752.method4113(class759.field10402 * 8, class559.field7668 * 8);
        class498.field6992 = null;
        if (arg0 != -87) {
            method4265(null, 92, 109, -29, 28, -49);
        }
        int var7 = class120.field1625 - var5;
        int var8 = class259.field3849 - var6;
        if (arg4 == 11) {
            for (int var9 = 0; var9 < class181.field2380; var9++) {
                class316 var10 = class110.field1528[var9];
                if (var10 != null) {
                    class22 var11 = var10.field4455;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field6198[var12] -= var7;
                        var11.field6197[var12] -= var8;
                    }
                    var11.field2802 -= var7 * 512;
                    var11.field2810 -= var8 * 512;
                }
            }
        } else {
            boolean var13 = false;
            class178.field2352 = 0;
            int var14 = class102.field1467 * 512 - 512;
            int var15 = class393.field5663 * 512 - 512;
            for (int var16 = 0; var16 < class181.field2380; var16++) {
                class316 var30 = class110.field1528[var16];
                if (var30 != null) {
                    class22 var31 = var30.field4455;
                    var31.field2810 -= var8 * 512;
                    var31.field2802 -= var7 * 512;
                    if (var31.field2802 >= 0 && var14 >= var31.field2802 && var31.field2810 >= 0 && var15 >= var31.field2810) {
                        boolean var32 = true;
                        for (int var33 = 0; var33 < 10; var33++) {
                            var31.field6198[var33] -= var7;
                            var31.field6197[var33] -= var8;
                            if (var31.field6198[var33] < 0 || var31.field6198[var33] >= class102.field1467 || var31.field6197[var33] < 0 || var31.field6197[var33] >= class393.field5663) {
                                var32 = false;
                            }
                        }
                        if (var32) {
                            class245.field3206[class178.field2352++] = var31.field6146;
                        } else {
                            var31.method132((byte) -113, null);
                            var30.method1102((byte) 61);
                            var13 = true;
                        }
                    } else {
                        var31.method132((byte) -103, null);
                        var30.method1102((byte) 80);
                        var13 = true;
                    }
                }
            }
            if (var13) {
                class181.field2380 = class176.field2326.method1245((byte) 7);
                class176.field2326.method1242(class110.field1528, -1);
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class758 var28 = class84.field1204[var17];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field6198[var29] -= var7;
                    var28.field6197[var29] -= var8;
                }
                var28.field2810 -= var8 * 512;
                var28.field2802 -= var7 * 512;
            }
        }
        class436[] var18 = class681.field9112;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class436 var27 = var18[var19];
            if (var27 != null) {
                var27.field6300 -= var7 * 512;
                var27.field6302 -= var8 * 512;
            }
        }
        for (class608 var20 = (class608) class398.field5706.method679((byte) -86); var20 != null; var20 = (class608) class398.field5706.method681(-71)) {
            var20.field8232 -= var8;
            var20.field8230 -= var7;
            if (class389.field5637 != 4 && (var20.field8230 < 0 || var20.field8232 < 0 || var20.field8230 >= class102.field1467 || class393.field5663 <= var20.field8232)) {
                var20.method1102((byte) 57);
            }
        }
        for (class608 var21 = (class608) class518.field7196.method679((byte) -86); var21 != null; var21 = (class608) class518.field7196.method681(-125)) {
            var21.field8230 -= var7;
            var21.field8232 -= var8;
            if (class389.field5637 != 4 && (var21.field8230 < 0 || var21.field8232 < 0 || var21.field8230 >= class102.field1467 || var21.field8232 >= class393.field5663)) {
                var21.method1102((byte) 114);
            }
        }
        if (class389.field5637 != 4) {
            for (class769 var22 = (class769) class523.field7265.method1249((byte) -125); var22 != null; var22 = (class769) class523.field7265.method1246(true)) {
                int var23 = (int) (var22.field2146 & 0x3FFFL);
                int var24 = var23 - class120.field1625;
                int var25 = (int) (var22.field2146 >> 14 & 0x3FFFL);
                int var26 = var25 - class259.field3849;
                if (var24 < 0 || var26 < 0 || var24 >= class102.field1467 || class393.field5663 <= var26) {
                    var22.method1102((byte) 96);
                }
            }
        }
        if (class302.field4242 != 0) {
            class15.field148 -= var8;
            class302.field4242 -= var7;
        }
        class731.method4036(arg0 ^ 0xFFFFFFDD);
        if (arg4 != 11) {
            class342.field4791 -= var7;
            class223.field2892 -= var8 * 512;
            class435.field6273 -= var7 * 512;
            class594.field8105 -= var7;
            class278.field4013 -= var8;
            class507.field7102 -= var8;
            if (Math.abs(var7) > class102.field1467 || Math.abs(var8) > class393.field5663) {
                class697.method3787(-86);
            }
        } else if (class697.field9252 == 4) {
            class439.field6328 -= var7 * 512;
            class400.field5722 -= var8 * 512;
            class46.field479 -= var7 * 512;
            class265.field3902 -= var8 * 512;
        } else {
            class609.field8242 = -1;
            class702.field9303 = -1;
            class697.field9252 = 1;
        }
        class684.method3749(-3244);
        class630.method3478(-19580);
        class625.field8473.method690(20134);
        class397.field5692.method690(20134);
        class325.field4620.method2194(true);
        class9.method53(false);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "([BIIIII)V", line = 296)
    public static final void method4265(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 > -105) {
            return;
        }
        field10667++;
        if (arg1 >= arg4) {
            return;
        }
        int var6 = arg4 - arg1 >> 2;
        int var7 = arg1 + arg5;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg4 - arg1 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg0[var7++] = 1;
                }
            }
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)V", line = 332)
    public static final void method4266(byte arg0) {
        field10664++;
        if (class446.field6419 <= 0) {
            class753.field10200 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class614.field8305.length; var2++) {
                if (class614.field8305[var2].indexOf("--> ") != -1) {
                    var1++;
                    if (class446.field6419 == var1) {
                        class753.field10200 = class614.field8305[var2].substring(class614.field8305[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        }
        int var3 = 42 / ((arg0 - 44) / 62);
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(III)V", line = 371)
    public class775(int arg0, int arg1, int arg2) {
        this.field10665 = arg2;
        this.field10661 = arg1;
        this.field10662 = arg0;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
    public abstract void method111(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(III)V")
    public abstract void method110(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(III)V")
    public abstract void method109(int arg0, int arg1, int arg2);
}
