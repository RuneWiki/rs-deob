import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class104 {

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Lau;")
    private class692 field1554 = new class692(64);

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "Lau;")
    public class692 field1559 = new class692(2);

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Lmv;")
    public class295 field1552;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Lmv;")
    private class295 field1547;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "Liba;")
    public static class211 field1549 = new class211(44, -1);

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Lcq;")
    public static class273 field1553 = new class273(0, 2, 2, 1);

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljw;I)I", line = 4)
    public static final int method739(class426 arg0, int arg1) {
        field1557++;
        String var2 = class443.method2616(arg0, 124);
        int[] var3 = null;
        if (class56.method352(arg0.field6223, (byte) -91)) {
            var3 = class259.field3355.method2382((int) arg0.field6231, (byte) 28).field5842;
        } else if (arg0.field6227 != -1) {
            var3 = class259.field3355.method2382(arg0.field6227, (byte) 28).field5842;
        } else if (class160.method1140(false, arg0.field6223)) {
            class177 var4 = (class177) class271.field3550.method2002((byte) -106, (long) ((int) arg0.field6231));
            if (var4 != null) {
                class53 var5 = var4.field2476;
                class76 var6 = var5.field805;
                if (var6.field1212 != null) {
                    var6 = var6.method443(class308.field4545, (byte) 109);
                }
                if (var6 != null) {
                    var3 = var6.field1174;
                }
            }
        } else if (class643.method3664(arg0.field6223, false)) {
            Object var7 = null;
            class289 var8;
            if (arg0.field6223 == 1007) {
                var8 = class60.field965.method2596(0, (int) arg0.field6231);
            } else {
                var8 = class60.field965.method2596(arg1 ^ 0xFFFFD26E, (int) (arg0.field6231 >>> 32 & 0x7FFFFFFFL));
            }
            if (var8.field4213 != null) {
                var8 = var8.method1788(class308.field4545, -88);
            }
            if (var8 != null) {
                var3 = var8.field4247;
            }
        }
        if (var3 != null) {
            var2 = var2 + class365.method2237(var3, -16907);
        }
        if (arg1 != -11666) {
            method740(124, false, 76);
        }
        int var9 = class141.field2042.method3456(class386.field5772, var2, 60);
        if (arg0.field6221) {
            var9 += class547.field8065.method48() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZI)I", line = 75)
    public static final int method740(int arg0, boolean arg1, int arg2) {
        field1551++;
        int var3 = arg2 >>> 31;
        return arg1 ? (arg2 + var3) / arg0 - var3 : -8;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 88)
    public final void method741(byte arg0) {
        class692 var2 = this.field1554;
        synchronized (this.field1554) {
            this.field1554.method3891(13747);
        }
        field1555++;
        class692 var3 = this.field1559;
        synchronized (this.field1559) {
            this.field1559.method3891(13747);
        }
        int var4 = 63 % ((44 - arg0) / 60);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Lev;", line = 104)
    public final class144 method742(int arg0, int arg1) {
        field1558++;
        class692 var3 = this.field1554;
        class144 var4;
        synchronized (this.field1554) {
            var4 = (class144) this.field1554.method3901((long) arg0, -87);
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field1547;
        byte[] var6;
        synchronized (this.field1547) {
            if (arg1 <= 64) {
                this.method742(32, 98);
            }
            var6 = this.field1547.method1844(33, 31330, arg0);
        }
        class144 var7 = new class144();
        var7.field2077 = this;
        if (var6 != null) {
            var7.method1001(new class540(var6), 0);
        }
        class692 var8 = this.field1554;
        synchronized (this.field1554) {
            this.field1554.method3894(var7, (byte) 60, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 136)
    public static void method743(int arg0) {
        field1553 = null;
        if (arg0 != 0) {
            method740(64, true, 60);
        }
        field1549 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)V", line = 149)
    public final void method744(byte arg0, int arg1) {
        class692 var3 = this.field1554;
        synchronized (this.field1554) {
            this.field1554.method3900(arg1, 0);
        }
        field1548++;
        class692 var4 = this.field1559;
        synchronized (this.field1559) {
            this.field1559.method3900(arg1, arg0 ^ 0x4E);
        }
        if (arg0 != 78) {
            this.method741((byte) -38);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V", line = 172)
    public final void method745(boolean arg0) {
        class692 var2 = this.field1554;
        synchronized (this.field1554) {
            this.field1554.method3890(-1);
        }
        field1550++;
        class692 var3 = this.field1559;
        synchronized (this.field1559) {
            this.field1559.method3890(-1);
            if (!arg0) {
                this.field1552 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lcaa;)V", line = 195)
    public static final void method746(class538 arg0) {
        class503.field7110.method620(arg0.field7895, arg0.field7894 + (arg0.method271(false) >> 1), arg0.field7896, class153.field2165);
        arg0.field7902 = class153.field2165[0];
        arg0.field7906 = class153.field2165[1];
        arg0.field7901 = class153.field2165[2];
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lsea;ILmv;Lmv;)V", line = 212)
    public class104(class373 arg0, int arg1, class295 arg2, class295 arg3) {
        this.field1552 = arg3;
        this.field1547 = arg2;
        this.field1547.method1845(33, true);
    }
}
