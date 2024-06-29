import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class91 extends class224 {

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    private int field1399 = -1;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field1389 = 0;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "Z")
    public static boolean field1390 = false;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "[I")
    public static int[] field1394 = new int[5];

    @OriginalMember(owner = "client!od", name = "S", descriptor = "Z")
    public static boolean field1396 = false;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "Ltj;")
    public static class273 field1391;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "[I")
    public int[] field1387;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (~arg1 == -1) {
            this.field1399 = arg0.method190(-3);
        }
        if (arg2 > -46) {
            this.method16((class25) null, -76, (byte) -36);
        }
        ++field1392;
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
    public static final void method610(int arg0) {
        ++field1395;
        if (arg0 != 16975) {
            method610(79);
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class91() {
        super(0, false);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)[[I")
    public int[][] method15(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        } else {
            int[][] var3 = super.field3616.method1341(false, arg0);
            ++field1386;
            if (super.field3616.field3042 && this.method613(arg1 + 29)) {
                int[] var4 = var3[0];
                int var5 = this.field1385 * (class36.field471 != this.field1397 ? this.field1397 * arg0 / class36.field471 : arg0);
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (~class78.field1108 != ~this.field1385) {
                    for (int var8 = 0; class78.field1108 > var8; ++var8) {
                        int var9 = this.field1385 * var8 / class78.field1108;
                        int var10 = this.field1387[var5 + var9];
                        var7[var8] = class224.method1526(var10, 255) << 4;
                        var6[var8] = class224.method1526(var10, 65280) >> 4;
                        var4[var8] = class224.method1526(16711680, var10) >> 12;
                    }
                } else {
                    for (int var11 = 0; class78.field1108 > var11; ++var11) {
                        int var12 = this.field1387[var5++];
                        var7[var11] = class224.method1526(255, var12) << 4;
                        var6[var11] = class224.method1526(65280, var12) >> 4;
                        var4[var11] = class224.method1526(var12 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V")
    public static void method611(int arg0) {
        field1394 = null;
        field1391 = null;
        if (arg0 != 1047037348) {
            field1396 = false;
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(Z)V")
    public final void method300(boolean arg0) {
        super.method300(arg0);
        this.field1387 = null;
        ++field1398;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)I")
    public final int method612(boolean arg0) {
        ++field1400;
        return arg0 ? -96 : this.field1399;
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(I)Z")
    public final boolean method613(int arg0) {
        ++field1388;
        if (this.field1387 != null) {
            return true;
        } else if (arg0 < 8) {
            return false;
        } else if (~this.field1399 <= -1) {
            class12 var2 = ~class140.field2064 <= -1 ? class266.method1817(class140.field2064, (byte) -24, this.field1399, class73.field1039) : class71.method482(class73.field1039, this.field1399, (byte) -24);
            var2.method82();
            this.field1385 = var2.field3712;
            this.field1397 = var2.field3713;
            this.field1387 = var2.field152;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method614(int arg0, String arg1) {
        ++field1393;
        if (client.field2329 != null) {
            int var2 = 0;
            long var3 = class162.method1116(arg1, (byte) 6);
            if (arg0 != -28158) {
                method614(-55, (String) null);
            }
            if (~var3 != -1L) {
                while (var2 < client.field2329.length && client.field2329[var2].field1750 != var3) {
                    ++var2;
                }
                if (~var2 > ~client.field2329.length && client.field2329[var2] != null) {
                    ++class102.field1594;
                    class13.field165.method892(203, (byte) -97);
                    class13.field165.method206(arg0 + 23097, client.field2329[var2].field1750);
                }
            }
        }
    }
}
