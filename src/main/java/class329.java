import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class329 {

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "Lku;")
    private class232 field4761 = new class232(64);

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "Lku;")
    private class232 field4766 = new class232(100);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Lb;")
    private class201 field4755;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "Lef;")
    public static class311 field4764 = new class311(14, 2);

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Lok;")
    public final class153 method2081(int arg0, int arg1) {
        field4756++;
        class232 var3 = this.field4761;
        class153 var4;
        synchronized (this.field4761) {
            var4 = (class153) this.field4761.method1479(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4755.method1257(class250.method1561(arg0, 0), class88.method492(16203, arg0), 24558);
        class153 var6 = new class153();
        var6.field2284 = arg0;
        var6.field2262 = this;
        if (var5 != null) {
            var6.method968(new class276(var5), (byte) 51);
        }
        var6.method965(arg1 + arg1);
        class232 var7 = this.field4761;
        synchronized (this.field4761) {
            this.field4761.method1473(var6, (long) arg0, arg1 + 125);
            return var6;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)Lvo;")
    public final class31 method2082(int arg0, int arg1) {
        field4765++;
        if (arg0 != -23748) {
            this.method2081(67, 7);
        }
        class232 var3 = this.field4766;
        class31 var4;
        synchronized (this.field4766) {
            var4 = (class31) this.field4766.method1479(0, (long) arg1);
            if (var4 == null) {
                var4 = new class31(arg1);
                this.field4766.method1473(var4, (long) arg1, -101);
            }
        }
        synchronized (var4) {
            return var4.method220(255) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)I")
    public static final int method2083(int arg0, int arg1, int arg2) {
        field4763++;
        int var3 = arg1 + (arg0 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + arg2;
        return (var5 & 0x7FB8424) >> 19;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public final void method2084(int arg0) {
        field4762++;
        class232 var2 = this.field4761;
        synchronized (this.field4761) {
            this.field4761.method1478((byte) -100);
        }
        class232 var3 = this.field4766;
        synchronized (this.field4766) {
            this.field4766.method1478((byte) -87);
        }
        if (arg0 != -18899) {
            this.method2084(39);
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
    public final void method2085(int arg0) {
        class232 var2 = this.field4761;
        synchronized (this.field4761) {
            this.field4761.method1475(0);
        }
        field4757++;
        if (arg0 == 100) {
            class232 var3 = this.field4766;
            synchronized (this.field4766) {
                this.field4766.method1475(0);
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)V")
    public final void method2086(int arg0, int arg1) {
        field4759++;
        class232 var3 = this.field4761;
        synchronized (this.field4761) {
            this.field4761.method1486(438127120, arg0);
        }
        class232 var4 = this.field4766;
        synchronized (this.field4766) {
            this.field4766.method1486(438127120, arg0);
        }
        if (arg1 != 255) {
            this.method2081(121, -35);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
    public static void method2087(byte arg0) {
        if (arg0 != 119) {
            field4767 = -34;
        }
        field4764 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BLir;[[B)V")
    public static final void method2088(byte arg0, class22 arg1, byte[][] arg2) {
        field4760++;
        int var3 = class114.field1462.length;
        int var4 = -58 / ((76 - arg0) / 47);
        for (int var5 = 0; var5 < var3; var5++) {
            byte[] var6 = arg2[var5];
            if (var6 != null) {
                int var7 = (class368.field5294[var5] >> 8) * 64 - class240.field3602;
                int var8 = (class368.field5294[var5] & 0xFF) * 64 - class360.field5180;
                class164.method1027(false);
                arg1.method147(var7, var8, (byte) 55, class141.field1878, var6, class422.field5918);
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lea;ILb;Lb;Lb;)V")
    public class329(class353 arg0, int arg1, class201 arg2, class201 arg3, class201 arg4) {
        this.field4755 = arg2;
        if (this.field4755 != null) {
            int var6 = this.field4755.method1233(-1) - 1;
            this.field4755.method1235(0, var6);
        }
        class118.method737(arg4, arg3, 127);
    }
}
