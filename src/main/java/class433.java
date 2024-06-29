import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class433 {

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lvi;")
    private class560 field6004 = new class560(64);

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "Lpq;")
    private class159 field6009;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "Lnn;")
    public static class446 field6007 = new class446(12, 3);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static void method2489(int arg0) {
        field6007 = null;
        int var1 = -84 % ((arg0 + 32) / 46);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lpq;I)V")
    public static final void method2490(class159 arg0, int arg1) {
        class249.field3348 = arg0;
        field6005++;
        int var2 = -107 % ((51 - arg1) / 32);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
    public final void method2491(int arg0) {
        field6002++;
        class560 var2 = this.field6004;
        synchronized (this.field6004) {
            if (arg0 != 0) {
                this.field6004 = null;
            }
            this.field6004.method3142(false);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
    public final void method2492(boolean arg0) {
        class560 var2 = this.field6004;
        synchronized (this.field6004) {
            this.field6004.method3144(arg0);
        }
        field6003++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lkg;BI)V")
    public static final void method2493(class208 arg0, byte arg1, int arg2) {
        field6006++;
        if (class104.field1268) {
            class104.field1268 = false;
            arg2 = 0;
        }
        if (arg1 != 63 || class388.field5603 != null && class388.field5603.method1303(arg0, (byte) 54)) {
            return;
        }
        class388.field5603 = arg0;
        class257.field3571 = class669.method3713(0);
        class653.field9250 = arg2;
        class453.field6186 = arg2;
        if (class453.field6186 == 0) {
            class627.method3423((byte) 54);
            return;
        }
        class546.field7483 = class629.field8552;
        class525.field7258 = class436.field6017;
        class460.field6257 = class79.field1006;
        class39.field485 = class74.field946;
        class286.field3872 = class575.field7956;
        class219.field2846 = class539.field7389;
        class462.field6304 = class509.field6871;
        class240.field3149 = class494.field6685;
        class356.field5172 = class38.field420;
        class190.field2473 = class250.field3380;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Lkaa;")
    public final class646 method2494(int arg0, int arg1) {
        field6008++;
        class560 var3 = this.field6004;
        class646 var4;
        synchronized (this.field6004) {
            var4 = (class646) this.field6004.method3134((long) arg1, -44);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field6009;
        byte[] var6;
        synchronized (this.field6009) {
            var6 = this.field6009.method1087(arg0, arg1, 1);
        }
        class646 var7 = new class646();
        if (var6 != null) {
            var7.method3592(new class138(var6), false);
        }
        class560 var8 = this.field6004;
        synchronized (this.field6004) {
            this.field6004.method3130((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2495(String arg0, int arg1) {
        field6001++;
        if (arg1 != 0) {
            method2489(-69);
        }
        return class223.method1363(true, 10, arg0, (byte) -128);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)V")
    public final void method2496(int arg0, int arg1) {
        if (arg0 > -115) {
            field6007 = null;
        }
        field6000++;
        class560 var3 = this.field6004;
        synchronized (this.field6004) {
            this.field6004.method3129(arg1, 14583);
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Luea;ILpq;)V")
    public class433(class484 arg0, int arg1, class159 arg2) {
        this.field6009 = arg2;
        this.field6009.method1076(31, 0);
    }
}
