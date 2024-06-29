import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class129 {

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Z")
    public static boolean field1968 = false;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLsi;I)I", line = 19)
    public static final int method841(byte arg0, class264 arg1, int arg2) {
        field1967++;
        if (arg1.field4241 == null || arg2 >= arg1.field4241.length) {
            return -2;
        }
        if (arg0 >= -15) {
            field1970 = 62;
        }
        try {
            int var3 = 0;
            int[] var4 = arg1.field4241[arg2];
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = 0;
                int var8 = var4[var5++];
                byte var9 = 0;
                if (var8 == 0) {
                    return var3;
                }
                if (var8 == 1) {
                    var7 = class90.field1302[var4[var5++]];
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 2) {
                    var7 = class110.field1636[var4[var5++]];
                }
                if (var8 == 3) {
                    var7 = class327.field5354[var4[var5++]];
                }
                if (var8 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class264 var12 = class94.method629(5386, var11);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class322.method2311(var13, -96).field1601 || class312.field5106)) {
                        for (int var14 = 0; var14 < var12.field4330.length; var14++) {
                            if ((var13 + 1) == var12.field4330[var14]) {
                                var7 += var12.field4321[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var7 = class170.field2650[var4[var5++]];
                }
                if (var8 == 6) {
                    var7 = class78.field1166[class110.field1636[var4[var5++]] - 1];
                }
                if (var8 == 7) {
                    var7 = class170.field2650[var4[var5++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var7 = class329.field5388.field591;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class111.field1651[var15]) {
                            var7 += class110.field1636[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class264 var18 = class94.method629(5386, var17);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class322.method2311(var19, -114).field1601 || class312.field5106)) {
                        for (int var20 = 0; var20 < var18.field4330.length; var20++) {
                            if (var19 + 1 == var18.field4330[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var7 = class209.field3175;
                }
                if (var8 == 12) {
                    var7 = class221.field3380;
                }
                if (var8 == 13) {
                    int var21 = class170.field2650[var4[var5++]];
                    int var22 = var4[var5++];
                    var7 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var4[var5++];
                    var7 = class44.method338(var23, (byte) -120);
                }
                if (var8 == 18) {
                    var7 = (class329.field5388.field4796 >> 7) + class215.field3313;
                }
                if (var8 == 19) {
                    var7 = (class329.field5388.field4783 >> 7) + class150.field2420;
                }
                if (var8 == 20) {
                    var7 = var4[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var3 += var7;
                    }
                    if (var6 == 1) {
                        var3 -= var7;
                    }
                    if (var6 == 2 && var7 != 0) {
                        var3 /= var7;
                    }
                    if (var6 == 3) {
                        var3 *= var7;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }
}
