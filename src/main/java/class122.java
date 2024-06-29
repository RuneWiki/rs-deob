import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class122 {

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "Lad;")
    private class19 field1358 = new class19(128);

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "Lad;")
    public class19 field1368 = new class19(64);

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Ltf;")
    public class701 field1362;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "Ltf;")
    private class701 field1355;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field1356 = 0;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Lcq;")
    public static class110 field1360 = new class110(41, 6);

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "Lsb;")
    public static class305 field1366 = new class305(72, 3);

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V", line = 5)
    public final void method700(int arg0) {
        field1364++;
        class19 var2 = this.field1358;
        synchronized (this.field1358) {
            if (arg0 != 6) {
                method701(7, (byte) -43, 122);
            }
            this.field1358.method80((byte) 55);
        }
        class19 var3 = this.field1368;
        synchronized (this.field1368) {
            this.field1368.method80((byte) 87);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IBI)V", line = 26)
    public static final void method701(int arg0, byte arg1, int arg2) {
        class453.field6485 = arg2 - class482.field6951;
        field1357++;
        class634.field8930 = arg0 - class482.field6943;
        int var3 = -14 / ((24 - arg1) / 50);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)V", line = 37)
    public final void method702(int arg0, int arg1) {
        field1363++;
        class19 var3 = this.field1358;
        synchronized (this.field1358) {
            if (arg1 != 0) {
                this.method705(96, 119);
            }
            this.field1358.method83((byte) -2, arg0);
        }
        class19 var4 = this.field1368;
        synchronized (this.field1368) {
            this.field1368.method83((byte) -2, arg0);
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V", line = 53)
    public final void method703(int arg0) {
        class19 var2 = this.field1358;
        synchronized (this.field1358) {
            this.field1358.method88(76);
        }
        field1365++;
        class19 var3 = this.field1368;
        synchronized (this.field1368) {
            this.field1368.method88(123);
        }
        if (arg0 != 6) {
            method701(-5, (byte) -85, 85);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIZ)V", line = 69)
    public final void method704(int arg0, int arg1, boolean arg2) {
        this.field1358 = new class19(arg0);
        field1359++;
        this.field1368 = new class19(arg1);
        if (!arg2) {
            this.method705(104, -59);
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(II)Lkca;", line = 86)
    public final class655 method705(int arg0, int arg1) {
        field1361++;
        class19 var3 = this.field1358;
        class655 var4;
        synchronized (this.field1358) {
            var4 = (class655) this.field1358.method78(0, (long) arg0);
        }
        if (arg1 >= -123) {
            field1369 = -69;
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field1355;
        byte[] var6;
        synchronized (this.field1355) {
            var6 = this.field1355.method3854((byte) 121, 36, arg0);
        }
        class655 var7 = new class655();
        var7.field9189 = this;
        var7.field9187 = arg0;
        if (var6 != null) {
            var7.method3643(5, new class115(var6));
        }
        var7.method3645(9124);
        class19 var8 = this.field1358;
        synchronized (this.field1358) {
            this.field1358.method92(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)V", line = 125)
    public static void method706(int arg0) {
        field1360 = null;
        field1366 = null;
        if (arg0 != 3) {
            field1367 = -7;
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lqh;ILtf;Ltf;)V", line = 152)
    public class122(class320 arg0, int arg1, class701 arg2, class701 arg3) {
        this.field1362 = arg3;
        this.field1355 = arg2;
        this.field1355.method3883(36, 0);
    }
}
