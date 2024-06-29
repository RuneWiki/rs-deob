import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class13 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "B")
    public byte field141 = 0;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "B")
    public byte field154;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "B")
    public byte field150;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "S")
    public short field157;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "S")
    public short field148;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "[S")
    public static short[] field160 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lpf;")
    public static class425 field153 = new class425(59, 18);

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "B")
    public byte field147;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "B")
    public byte field156;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "B")
    public byte field158;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "B")
    public byte field161;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "Liq;")
    public static class134 field169;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Ldc;")
    public class13 field146;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "La;")
    public class233 field163;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "La;")
    public class233 field167;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "Lo;")
    public class316 field166;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Lkp;")
    public class337 field149;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "Lkp;")
    public class337 field164;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "Ltl;")
    public class376 field165;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Lwa;")
    public class439 field159;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lam;")
    public class466 field151;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "S")
    public short field145;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Z")
    public boolean field142;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Z")
    public boolean field144;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Z")
    public boolean field162;

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
    public class13(int arg0, int arg1, int arg2) {
        this.field150 = this.field154 = (byte) arg0;
        this.field157 = (short) arg1;
        this.field148 = (short) arg2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method77(int arg0) {
        field160 = null;
        field169 = null;
        if (arg0 > -43) {
            field153 = null;
        }
        field153 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Liq;Liq;B)I")
    public static final int method78(class134 arg0, class134 arg1, byte arg2) {
        field152++;
        int var3 = 0;
        if (arg0.method822(-34, class275.field4207)) {
            var3++;
        }
        if (arg0.method822(111, class458.field6782)) {
            var3++;
        }
        if (arg0.method822(-52, class376.field5485)) {
            var3++;
        }
        int var4 = 78 % ((-arg2 - 70) / 54);
        if (arg1.method822(-110, class275.field4207)) {
            var3++;
        }
        if (arg1.method822(125, class458.field6782)) {
            var3++;
        }
        if (arg1.method822(-74, class376.field5485)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
    public static final void method79(int arg0, int arg1, int arg2) {
        int var3 = 46 / ((arg0 + 65) / 59);
        field155++;
        class32 var4 = class136.method854(13, (byte) 114, arg2);
        var4.method194(false);
        var4.field404 = arg1;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public final void method80(byte arg0) {
        while (this.field151 != null) {
            class466 var2 = this.field151.field6853;
            this.field151.method2871(-30533);
            this.field151 = var2;
        }
        field168++;
        this.field141 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static final void method81(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field143++;
        for (class343 var1 = (class343) class192.field2875.method2514((byte) 61); var1 != null; var1 = (class343) class192.field2875.method2511(-121)) {
            if (var1.field5130 == -1) {
                var1.field5133 = 0;
                class91.method595(var1, 0);
            } else {
                var1.method625((byte) -50);
            }
        }
    }
}
