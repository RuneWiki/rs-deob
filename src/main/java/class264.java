import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class264 extends class623 {

    @OriginalMember(owner = "client!mda", name = "v", descriptor = "D")
    public double field3285;

    @OriginalMember(owner = "client!mda", name = "w", descriptor = "[[S")
    public short[][] field3286;

    @OriginalMember(owner = "client!mda", name = "x", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)J", line = 5)
    public final long method1593(byte arg0) {
        if (arg0 < 59) {
            method1594(null, true);
        }
        field3287++;
        return (long) (this.field3286.length << 0 | this.field3286[0].length);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lcs;Z)Z", line = 18)
    public static final boolean method1594(class340 arg0, boolean arg1) {
        boolean var2 = class504.field7120 == class159.field1758;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method1069(38);
        if (arg0.field4395 < 0 || arg0.field4387 < 0 || arg0.field4390 >= class284.field3473 || arg0.field4402 >= class151.field1664) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field4395; var7 <= arg0.field4390; var7++) {
            for (int var11 = arg0.field4387; var11 <= arg0.field4402; var11++) {
                class691 var12 = class510.method3014(arg0.field4628, var7, var11);
                if (var12 != null) {
                    class398 var13 = class568.method3307(30103, arg0);
                    class398 var14 = var12.field9739;
                    if (var14 == null) {
                        var12.field9739 = var13;
                    } else {
                        while (var14.field5451 != null) {
                            var14 = var14.field5451;
                        }
                        var14.field5451 = var13;
                    }
                    if (var2 && (class248.field3011[var7][var11] & 0xFF000000) != 0) {
                        var3 = class248.field3011[var7][var11];
                        var4 = class648.field9262[var7][var11];
                        var5 = class703.field9910[var7][var11];
                    }
                    if (!arg1 && var12.field9736 != null && var12.field9736.field2233 > var6) {
                        var6 = var12.field9736.field2233;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field4395; var8 <= arg0.field4390; var8++) {
                for (int var9 = arg0.field4387; var9 <= arg0.field4402; var9++) {
                    if ((class248.field3011[var8][var9] & 0xFF000000) == 0) {
                        class248.field3011[var8][var9] = var3;
                        class648.field9262[var8][var9] = var4;
                        class703.field9910[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class139.field1560[class485.field6894++] = arg0;
        } else {
            int var10 = class504.field7120 == class159.field1758 ? 1 : 0;
            if (!arg0.method986(-120)) {
                arg0.field4634 = class228.field2626[var10];
                class228.field2626[var10] = arg0;
            } else if (arg0.method989(-121)) {
                arg0.field4634 = class300.field3729[var10];
                class300.field3729[var10] = arg0;
            } else {
                arg0.field4634 = class436.field6357[var10];
                class436.field6357[var10] = arg0;
                class568.field8076 = true;
            }
        }
        if (arg1) {
            arg0.field4627 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "([[SD)V", line = 144)
    public class264(short[][] arg0, double arg1) {
        this.field3285 = arg1;
        this.field3286 = arg0;
    }
}
