import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class133 {

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "[B")
    public byte[] field1487;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "[S")
    public short[] field1485;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "[S")
    public short[] field1486;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "[S")
    public short[] field1490;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 4)
    public static final void method748(String arg0, int arg1, boolean arg2) {
        field1488++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = (arg2 ? class83.field859.field5211 : class83.field859.field5210) + var6;
        if (arg1 != -31961) {
            method748(null, -71, false);
        }
        for (int var8 = var6; var8 < var7; var8++) {
            class290 var11 = class83.field859.method2211(var8, arg1 ^ 0x1765);
            if (var11.field3620 && var11.method1689(0).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class613.field8624 = -1;
                    class578.field8185 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class578.field8185 = var4;
        class220.field2625 = 0;
        class613.field8624 = var5;
        String[] var9 = new String[class613.field8624];
        for (int var10 = 0; var10 < class613.field8624; var10++) {
            var9[var10] = class83.field859.method2211(var4[var10], -27582).method1689(0);
        }
        class664.method3686(var9, (byte) 83, class578.field8185);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILtf;IB)Lss;", line = 79)
    public static final class440 method749(int arg0, class701 arg1, int arg2, byte arg3) {
        field1484++;
        class115 var4 = new class115(arg1.method3854((byte) 28, arg0, arg2));
        class440 var5 = new class440(arg2, var4.method626(111), var4.method626(110), var4.method631(false), var4.method631(false), var4.method620((byte) -128) == 1, var4.method620((byte) 4), var4.method620((byte) 61));
        if (arg3 != 38) {
            return null;
        }
        int var6 = var4.method620((byte) 65);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field6174.method3425(new class222(var4.method620((byte) 81), var4.method643((byte) -77), var4.method643((byte) -77), var4.method643((byte) -77), var4.method643((byte) -77), var4.method643((byte) -77), var4.method643((byte) -77), var4.method643((byte) -77), var4.method643((byte) -77)), false);
        }
        var5.method2536(12800);
        return var5;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V", line = 106)
    public static final void method750(byte arg0) {
        field1489++;
        if (class512.field7343 == null) {
            return;
        }
        class203.field2404 = new class546();
        class203.field2404.method3095(class512.field7343.field258.method1195((byte) 62, class504.field7267), class494.field7152, (byte) 82, class512.field7343.field254, class512.field7343);
        class648.field9137 = new Thread(class203.field2404, "");
        class648.field9137.start();
        if (arg0 < -115) {
            ;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V", line = 128)
    public static final void method751(int arg0) {
        if (arg0 == 0) {
            field1491++;
            class79.field806.method1929((byte) -101);
        }
    }
}
