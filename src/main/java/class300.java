import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class300 extends class16 {

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "S")
    public static short field3930 = 1;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "Lvd;")
    public static class36 field3926 = new class36();

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!pba", name = "m", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!pba", name = "n", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "Ljo;")
    public static class303 field3924;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BZ)V")
    public final void method46(byte arg0, boolean arg1) {
        ++field3933;
        if (arg0 != -61) {
            this.method52(71);
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)Z")
    public final boolean method52(int arg0) {
        if (arg0 != 12733) {
            this.method50(true, (byte) 7);
        }
        ++field3928;
        return true;
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)V")
    public static void method1700(int arg0) {
        field3924 = null;
        if (arg0 >= -126) {
            method1700(-47);
        }
        field3926 = null;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIZ)V")
    public final void method42(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field3930 = 4;
        }
        ++field3925;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IILuda;)V")
    public final void method44(int arg0, int arg1, class412 arg2) {
        ++field3932;
        super.field141.method2388((byte) -22, arg2);
        if (arg1 != -1) {
            field3929 = -49;
        }
        super.field141.method2396(arg0, arg1);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)V")
    public final void method48(byte arg0) {
        super.field141.method2344(false, 9845);
        ++field3934;
        int var2 = 53 / ((arg0 - -29) / 51);
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(Z)V")
    public static final void method1701(boolean arg0) {
        if (!arg0) {
            method1700(118);
        }
        ++field3927;
        if (~class252.field3233 <= -1) {
            long var1 = class641.method3604(false);
            class252.field3233 = (int) ((long) class252.field3233 - (-class40.field427 + var1));
            if (class252.field3233 > 0) {
                int var3 = (class252.field3233 << 8) / class639.field9072;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class658.field9387 = ((16711935 & class665.field9459) * var3 + (class648.field9181.field7359 & 16711935) * var4 & -16711936) - -((class665.field9459 & 65280) * var3 + (65280 & class648.field9181.field7359) * var4 & 16711680) >>> 8;
                float var6 = 1.0F - var5;
                class365.field4778 = (class648.field9181.field7360 - class512.field7330) * var6 + class512.field7330;
                class32.field363 = class293.field3849 * var3 - -(class648.field9181.field7371 * var4) >> 8;
                class610.field8619 = (-class496.field7163 + class648.field9181.field7368) * var6 + class496.field7163;
                class365.field4777 = (-class95.field1056 + class648.field9181.field7365) * var6 + class95.field1056;
                class631.field8956 = (16711680 & (class38.field420 & 65280) * var3 + (65280 & class648.field9181.field7367) * var4) + (-16711936 & (class38.field420 & 16711935) * var3 + (class648.field9181.field7367 & 16711935) * var4) >>> 8;
                class593.field8429 = (-class448.field6153 + class648.field9181.field7358) * var6 + class448.field6153;
                class559.field7960 = (-class135.field1541 + class648.field9181.field7364) * var6 + class135.field1541;
                class172.field2052 = (class648.field9181.field7369 - class404.field5401) * var6 + class404.field5401;
                if (class270.field3402 != class648.field9181.field7374) {
                    class113.field1323 = class14.field135.method290(class270.field3402, class648.field9181.field7374, var6, class113.field1323);
                }
            } else {
                class365.field4778 = class648.field9181.field7360;
                class365.field4777 = class648.field9181.field7365;
                class593.field8429 = class648.field9181.field7358;
                class610.field8619 = class648.field9181.field7368;
                class631.field8956 = class648.field9181.field7367;
                class559.field7960 = class648.field9181.field7364;
                class172.field2052 = class648.field9181.field7369;
                class113.field1323 = class648.field9181.field7374;
                class32.field363 = class648.field9181.field7371;
                class252.field3233 = -1;
                class658.field9387 = class648.field9181.field7359;
            }
            class40.field427 = var1;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZB)V")
    public final void method50(boolean arg0, byte arg1) {
        ++field3931;
        if (arg1 != 42) {
            field3929 = -81;
        }
        super.field141.method2344(true, 9845);
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lap;)V")
    public class300(class435 arg0) {
        super(arg0);
    }
}
