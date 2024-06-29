import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class475 {

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field6698 = 0;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Z")
    public static boolean field6702 = false;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[B")
    public byte[] field6699;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "[S")
    public short[] field6701;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "[S")
    public short[] field6703;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "[S")
    public short[] field6704;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lqa;ZLraa;Lbl;)V")
    public static final void method2698(class167 arg0, boolean arg1, class625 arg2, class297 arg3) {
        field6697++;
        class116 var4 = arg3.method1823((byte) -62, arg0);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method637();
        if (var5 < var4.method630()) {
            var5 = var4.method630();
        }
        byte var6 = 10;
        int var7 = arg2.field9042;
        int var8 = arg2.field9040;
        int var9 = 0;
        if (arg1) {
            method2699(51, -33, true);
        }
        int var10 = 0;
        int var11 = 0;
        if (arg3.field3872 != null) {
            var9 = class389.field5395.method859(arg3.field3872, null, null, 62, class148.field1909);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class148.field1909[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class342.field4757.method2167(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class342.field4757.method2166() * var9 + (class342.field4757.method2165() / 2);
        }
        int var15 = var5 / 2 + arg2.field9042;
        if (var7 < (class614.field8854 + var5)) {
            var7 = class614.field8854;
            var15 = var10 / 2 + class614.field8854 + 5 - (-(var5 / 2) - var6);
        } else if (class614.field8846 - var5 < var7) {
            var15 = class614.field8846 - (var10 / 2) - (var5 / 2) - var6 - 5;
            var7 = class614.field8846 - var5;
        }
        int var16 = arg2.field9040;
        if (class614.field8857 + var5 > var8) {
            var8 = class614.field8857;
            var16 = var5 / 2 + class614.field8857 + var6;
        } else if (var8 > (class614.field8860 - var5)) {
            var16 = class614.field8860 - var6 - (var5 / 2) - var11;
            var8 = class614.field8860 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg2.field9042), (double) (var8 - arg2.field9040)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method619((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field3872 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var21 = class342.field4757.method2166() * var9 + var16 + 3;
            var20 = var18 + var10 + 10;
            if (arg3.field3867 != 0) {
                arg0.method974(arg3.field3867, 1, var21 - var16, var18, var20 - var18, var16);
            }
            if (arg3.field3892 != 0) {
                arg0.method919(var18, var21 - var16, -var18 + var20, (byte) 0, arg3.field3892, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class148.field1909[var22];
                if (var22 < (var9 - 1)) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class342.field4757.method2164(arg0, var23, var15, var16, arg3.field3861, true);
                var16 += class342.field4757.method2166();
            }
        }
        if (arg3.field3862 == -1 && arg3.field3872 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class525 var25 = new class525(arg2);
        var25.field7304 = var8 + var24;
        var25.field7301 = var18;
        var25.field7305 = var7 + var24;
        var25.field7309 = var8 - var24;
        var25.field7311 = var19;
        var25.field7314 = var20;
        var25.field7303 = var21;
        var25.field7302 = var7 - var24;
        class612.field8795.method3181(var25, true);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2699(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field6700++;
            return class411.method2457(arg0, arg1, true) & class605.method3466(-26619, arg1, arg0);
        } else {
            return false;
        }
    }
}
