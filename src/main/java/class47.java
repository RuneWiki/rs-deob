import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class47 {

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field524 = -1;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "[B")
    public byte[] field523;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "[B")
    public byte[] field525;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)I", line = 5)
    public static final int method385(int arg0, int arg1) {
        field527++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = 49 / ((-arg1 - 56) / 54);
        int var5 = var3 | var3 >>> 2;
        int var6 = var5 | var5 >>> 4;
        int var7 = var6 | var6 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return arg0 & ~var8;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 25)
    public static final void method386(String arg0, boolean arg1, int arg2) {
        field531++;
        class17 var3 = class245.method1634(1, (long) arg2, 3);
        var3.method66((byte) 22);
        var3.field102 = arg0;
        if (arg1) {
            field524 = -75;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZBZLtca;)V", line = 39)
    public static final void method387(boolean arg0, byte arg1, boolean arg2, class610 arg3) {
        field518++;
        if (arg1 != 125) {
            field524 = 126;
        }
        int var4 = arg3.field8600;
        int var5 = (int) arg3.field762;
        arg3.method527(-11229);
        if (arg0) {
            class131.method891(arg1 - 234, var4);
        }
        class464.method2787(var4, 65535);
        class115 var6 = class384.method2387(false, var5);
        if (var6 != null) {
            class43.method336(-1, var6);
        }
        class675.method3843(126);
        if (!arg2 && class610.field8597 != -1) {
            class748.method4145(1, class610.field8597, 1);
        }
        class58 var7 = new class58(class278.field3993);
        for (class610 var8 = (class610) var7.method479((byte) 101); var8 != null; var8 = (class610) var7.method476(-1)) {
            if (!var8.method529((byte) 46)) {
                var8 = (class610) var7.method479((byte) -31);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field8598 == 3) {
                int var9 = (int) var8.field762;
                if (var9 >>> 16 == var4) {
                    method387(true, (byte) 125, arg2, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(II)Lfa;", line = 112)
    public static final class691 method388(int arg0, int arg1) {
        field530++;
        class691 var2 = (class691) class664.field9335.method312(arg1 ^ 0x1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class213.field2937.method1849(arg0, (byte) 29, arg1);
        class691 var4 = new class691();
        var4.field9640 = arg0;
        if (var3 != null) {
            var4.method3918(-94557789, new class511(var3));
        }
        var4.method3919(true);
        if (var4.field9645 == 2 && class175.field2209.method3669(false, (long) arg0) == null) {
            class175.field2209.method3666((byte) 65, (long) arg0, new class324(class623.field8738));
            class132.field1694[class623.field8738++] = var4;
        }
        class664.field9335.method305(var4, (long) arg0, 18320);
        return var4;
    }
}
