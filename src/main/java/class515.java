import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class515 {

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method2941(byte arg0, int arg1) {
        field7041++;
        if (arg0 <= 62) {
            method2941((byte) -103, 86);
        }
        if (arg1 != -1 && class210.field2970[arg1]) {
            class290.field3993.method3641(arg1, 0);
            class167.field2439[arg1] = null;
            class165.field2412[arg1] = null;
            class210.field2970[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V", line = 24)
    public static final void method2942(int arg0) {
        while (true) {
            if (class660.field9184.method2590(20065, class95.field1338) >= 15) {
                int var1 = class660.field9184.method2592((byte) 56, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    class393 var3 = (class393) class299.field4071.method970((byte) 89, (long) var1);
                    if (var3 == null) {
                        class61 var4 = new class61();
                        var4.field1697 = var1;
                        var3 = new class393(var4);
                        class299.field4071.method968((long) var1, var3, arg0 + 1);
                        class31.field400[class254.field3465++] = var3;
                        var2 = true;
                    }
                    class61 var5 = var3.field5552;
                    class636.field8790[class698.field9912++] = var1;
                    var5.field1716 = class186.field2697;
                    if (var5.field674 != null && var5.field674.method3247(false)) {
                        class8.method33(var5, 68);
                    }
                    int var6 = class660.field9184.method2592((byte) -92, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class660.field9184.method2592((byte) -123, 1);
                    if (var7 == 1) {
                        class85.field1255[class562.field7587++] = var1;
                    }
                    int var8 = class660.field9184.method2592((byte) -124, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = class660.field9184.method2592((byte) 20, 2);
                    int var10 = class660.field9184.method2592((byte) -92, 1);
                    var5.method500(class347.field4640.method2584(class660.field9184.method2592((byte) 87, 14), 1), -14527);
                    int var11 = (class660.field9184.method2592((byte) 76, 3) + 4 & 0x70A00007) << 11;
                    var5.method892(113, var5.field674.field8041);
                    var5.field1748 = var5.field674.field8075 << 3;
                    if (var2) {
                        var5.method894((byte) 110, true, var11);
                    }
                    var5.method502(var9, class143.field2063.field1801[0] + var6, (byte) 126, class143.field2063.field1807[0] + var8, var10 == 1, var5.method881(-115));
                    if (var5.field674.method3247(false)) {
                        class7.method22(null, var5.field1807[0], null, var5, var5.field1801[0], 0, 105, var5.field4053);
                    }
                    continue;
                }
            }
            field7042++;
            if (arg0 != -2) {
                method2942(-94);
            }
            class660.field9184.method2595(0);
            return;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 107)
    public static final void method2943(String arg0, boolean arg1, int arg2) {
        field7040++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        if (arg2 != 20803) {
            method2941((byte) 101, -25);
        }
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = var6 + (arg1 ? class213.field2984.field9922 : class213.field2984.field9919);
        for (int var8 = var6; var8 < var7; var8++) {
            class575 var11 = class213.field2984.method3922(var8, false);
            if (var11.field8126 && var11.method3287(0).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class495.field6745 = -1;
                    class657.field9135 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class495.field6745 = var5;
        class592.field8294 = 0;
        class657.field9135 = var4;
        String[] var9 = new String[class495.field6745];
        for (int var10 = 0; var10 < class495.field6745; var10++) {
            var9[var10] = class213.field2984.method3922(var4[var10], false).method3287(0);
        }
        class384.method2278(1, var9, class657.field9135);
    }
}
