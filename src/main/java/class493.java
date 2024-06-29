import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class493 extends class66 {

    @OriginalMember(owner = "client!e", name = "r", descriptor = "F")
    public static float field7209;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "[Li;")
    public static class37[] field7208;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Loaa;)V")
    public static final void method3009(class263 arg0) {
        if (class343.field5536 >= 65535) {
            return;
        }
        class674 var1 = arg0.field4300;
        class529.field7714[class343.field5536] = arg0;
        class251.field4009[class343.field5536] = false;
        class343.field5536++;
        int var2 = arg0.field4302;
        if (arg0.field4289) {
            var2 = 0;
        }
        int var3 = arg0.field4302;
        if (arg0.field4301) {
            var3 = class524.field7649 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method3859((byte) 117) + class459.field6867 - var1.method3860((byte) -125) >> class439.field6699;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method3859((byte) 117) + var1.method3860((byte) -119) - class459.field6867 >> class439.field6699;
            if (var7 >= class541.field7896) {
                var7 = class541.field7896 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field4294[var5++];
                int var10 = (var1.method3857((byte) -35) + class459.field6867 - var1.method3860((byte) -121) >> class439.field6699) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class43.field597) {
                    var11 = class43.field597 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class99.field1601[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class99.field1601[var4][var12][var8] = var13 | (long) class343.field5536;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class99.field1601[var4][var12][var8] = var13 | (long) class343.field5536 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class99.field1601[var4][var12][var8] = var13 | (long) class343.field5536 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class99.field1601[var4][var12][var8] = var13 | (long) class343.field5536 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static void method3010(int arg0) {
        field7208 = null;
        if (arg0 != -31978) {
            field7209 = 0.38631275F;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)V")
    public static final void method3011(byte arg0, int arg1) {
        if (arg0 == 44) {
            field7210++;
            class413 var2 = class674.method3852(2, arg1, 124);
            var2.method2634(1065768928);
        }
    }
}
