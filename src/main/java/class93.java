import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class93 {

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "Ltq;")
    private class536 field1282 = new class536(64);

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "Ltq;")
    public class536 field1292 = new class536(60);

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "Lwm;")
    public class30 field1286;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "Lwm;")
    private class30 field1283;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "Lrn;")
    public static class633 field1281 = new class633(87, -1);

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "Lob;")
    public static class4 field1291;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V", line = 11)
    public static void method558(int arg0) {
        field1291 = null;
        field1281 = null;
        if (arg0 != -9104) {
            field1281 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V", line = 23)
    public final void method559(byte arg0) {
        field1285++;
        class536 var2 = this.field1282;
        synchronized (this.field1282) {
            if (arg0 < 63) {
                return;
            }
            this.field1282.method2919(0);
        }
        class536 var3 = this.field1292;
        synchronized (this.field1292) {
            this.field1292.method2919(0);
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V", line = 41)
    public final void method560(int arg0) {
        class536 var2 = this.field1282;
        synchronized (this.field1282) {
            this.field1282.method2932((byte) 80);
        }
        field1288++;
        class536 var3 = this.field1292;
        synchronized (this.field1292) {
            this.field1292.method2932((byte) 80);
            if (arg0 < 80) {
                field1281 = null;
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(BI)V", line = 57)
    public final void method561(byte arg0, int arg1) {
        field1287++;
        class536 var3 = this.field1282;
        synchronized (this.field1282) {
            this.field1282.method2928(true, arg1);
        }
        class536 var4 = this.field1292;
        synchronized (this.field1292) {
            if (arg0 == 31) {
                this.field1292.method2928(true, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(BI)Ltm;", line = 78)
    public final class353 method562(byte arg0, int arg1) {
        field1284++;
        class536 var3 = this.field1282;
        class353 var4;
        synchronized (this.field1282) {
            var4 = (class353) this.field1282.method2931((long) arg1, (byte) -98);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field1283;
        byte[] var6;
        synchronized (this.field1283) {
            var6 = this.field1283.method139(class740.method4025(321171297, arg1), (byte) -94, class615.method3291(arg1, (byte) -121));
        }
        class353 var7 = new class353();
        if (arg0 != 102) {
            this.method562((byte) 3, -18);
        }
        var7.field4299 = this;
        var7.field4306 = arg1;
        if (var6 != null) {
            var7.method2034(new class234(var6), 20344);
        }
        class536 var8 = this.field1282;
        synchronized (this.field1282) {
            this.field1282.method2918((long) arg1, var7, 127);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IB)V", line = 110)
    public final void method563(int arg0, byte arg1) {
        field1289++;
        this.field1293 = arg0;
        class536 var3 = this.field1292;
        synchronized (this.field1292) {
            this.field1292.method2919(0);
            if (arg1 != 29) {
                this.method559((byte) 83);
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lega;ILwm;Lwm;)V", line = 136)
    public class93(class473 arg0, int arg1, class30 arg2, class30 arg3) {
        this.field1286 = arg3;
        this.field1283 = arg2;
        int var5 = this.field1283.method143((byte) 106) - 1;
        this.field1283.method138(0, var5);
    }
}
