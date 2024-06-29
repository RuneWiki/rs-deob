import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class273 {

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Lfl;")
    public static class248 field4108 = new class248(new byte[5000]);

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4112 = "cyan:";

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "Ljl;")
    public static class253 field4110 = new class253(16);

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field4113 = 0;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Lga;")
    public static class174 field4109;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Lng;")
    public static class78 field4111;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "S")
    public short field4105;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Z")
    public boolean field4098;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Z")
    public boolean field4099;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Z")
    public boolean field4102;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Z")
    public boolean field4106;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[I")
    public static int[] field4104;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method1807(int arg0) {
        class282.method1863(false, true);
        field4100++;
        System.gc();
        class203.method1292(25, false);
        if (arg0 != 23752) {
            field4109 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILpf;Z)Lmc;")
    public static final class201 method1808(int arg0, int arg1, class294 arg2, boolean arg3) {
        field4097++;
        if (!arg3) {
            method1810((byte) 42, (class294) null, (class294) null);
        }
        return class66.method451(arg2, arg0, 2048, arg1) ? class62.method415((byte) -39) : null;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static void method1809(int arg0) {
        field4111 = null;
        field4112 = null;
        field4110 = null;
        field4109 = null;
        field4104 = null;
        field4108 = null;
        if (arg0 != 5000) {
            method1811(false, 35, 45);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLpf;Lpf;)I")
    public static final int method1810(byte arg0, class294 arg1, class294 arg2) {
        field4101++;
        int var3 = 0;
        if (arg1.method1960(class215.field3247, (byte) 127)) {
            var3++;
        }
        if (arg1.method1960(class83.field1333, (byte) 122)) {
            var3++;
        }
        if (arg1.method1960(class13.field176, (byte) 118)) {
            var3++;
        }
        int var4 = -102 % ((arg0 - 57) / 51);
        if (arg2.method1960(class215.field3247, (byte) 125)) {
            var3++;
        }
        if (arg2.method1960(class83.field1333, (byte) 119)) {
            var3++;
        }
        if (arg2.method1960(class13.field176, (byte) 126)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZII)V")
    public static final void method1811(boolean arg0, int arg1, int arg2) {
        field4107++;
        if (class294.method1943((byte) 110, arg1)) {
            class72.method491(class234.field3532[arg1], arg2, 119);
            if (!arg0) {
                method1810((byte) 36, (class294) null, (class294) null);
            }
        }
    }
}
