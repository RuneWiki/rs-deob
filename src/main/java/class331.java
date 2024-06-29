import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class331 {

    @OriginalMember(owner = "client!du", name = "l", descriptor = "S")
    public short field4112;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "B")
    public byte field4111;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public int field4107;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "S")
    public short field4105;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public int field4108;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "S")
    public short field4109;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "Z")
    public boolean field4110;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public int field4115;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "[I")
    public static int[] field4103 = new int[14];

    @OriginalMember(owner = "client!du", name = "d", descriptor = "Lhm;")
    public static class208 field4104 = new class208(20);

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BLoa;)V")
    public static final void method1896(byte arg0, class650 arg1) {
        field4113++;
        if (class129.field1566 == class67.field815.field8010 || class407.field5237 == null) {
            return;
        }
        if (arg0 > -76) {
            method1899(84);
        }
        if (class280.method1682((byte) -78, arg1, class67.field815.field8010)) {
            class129.field1566 = class67.field815.field8010;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(III)I")
    public static final int method1897(int arg0, int arg1, int arg2) {
        field4114++;
        if (arg0 > -125) {
            method1899(97);
        }
        return arg2 == 4 || arg2 == 5 ? class71.field916[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIILap;)V")
    public static final void method1898(int arg0, int arg1, int arg2, class445 arg3) {
        class565 var4 = class417.method2319(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field7085 = arg3;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public static final void method1899(int arg0) {
        class93.method689(arg0 - 1);
        field4116++;
        class33.method230(class611.field8310.field8714, 2, 22050, (byte) 106);
        class506.field6334 = class520.method2815((byte) 88, class472.field5828, class386.field4955, 22050, 0);
        class506.field6334.method1755(5221, class653.field8905);
        class502.field6253 = class520.method2815((byte) -110, class472.field5828, class386.field4955, 2048, arg0);
        class502.field6253.method1755(5221, class314.field3941);
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field4112 = (short) arg6;
        this.field4111 = (byte) arg8;
        this.field4107 = arg1;
        this.field4105 = (short) arg4;
        this.field4102 = arg3;
        this.field4108 = arg11;
        this.field4106 = arg2;
        this.field4109 = (short) arg5;
        this.field4110 = arg10;
        this.field4115 = arg0;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V")
    public static final void method1900(boolean arg0) {
        field4101++;
        if (class72.field940) {
            return;
        }
        class531.field6707 = arg0;
        if (class611.field8310.field8695) {
            class689.field9561 = ((int) class689.field9561 - 65 & 0xFFFFFF80);
        } else {
            class350.field4524 += (-class350.field4524 - 24.0F) / 2.0F;
        }
        class72.field940 = true;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
    public static void method1901(int arg0) {
        if (arg0 < 1) {
            method1896((byte) 47, null);
        }
        field4104 = null;
        field4103 = null;
    }
}
