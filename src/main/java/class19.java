import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class19 {

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public int field291 = 1;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lfea;")
    public static class47 field286 = new class47();

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "C")
    public char field287;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)I", line = 3)
    public static final int method216(int arg0, byte arg1) {
        int var2 = 76 % ((82 - arg1) / 44);
        field293++;
        int var3 = arg0 >>> 1;
        int var4 = var3 | var3 >>> 1;
        int var5 = var4 | var4 >>> 2;
        int var6 = var5 | var5 >>> 4;
        int var7 = var6 | var6 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return ~var8 & arg0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjk;)I", line = 20)
    public static final int method217(int arg0, class170 arg1) {
        field292++;
        if (arg0 >= -109) {
            field290 = 52;
        }
        class432 var2 = arg1.field2492;
        if (var2.field6304 != null) {
            var2 = var2.method2582(0, class401.field6001);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field6343;
        class298 var4 = arg1.method772(0);
        if (arg1.field1489) {
            var3 = var2.field6360;
        } else if (arg1.field1531 == var4.field4275 || arg1.field1531 == var4.field4301 || arg1.field1531 == var4.field4297 || arg1.field1531 == var4.field4305) {
            var3 = var2.field6365;
        } else if (arg1.field1531 == var4.field4310 || arg1.field1531 == var4.field4283 || arg1.field1531 == var4.field4300 || arg1.field1531 == var4.field4282) {
            var3 = var2.field6325;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lco;ZI)V", line = 57)
    private final void method218(class268 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field287 = class149.method1074(arg0.method1714(-31536), -9345);
        } else if (arg2 == 2) {
            this.field291 = 0;
        }
        field289++;
        if (arg1) {
            field286 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ln;Lgp;I)V", line = 79)
    public static final void method219(class472 arg0, class561 arg1, int arg2) {
        if (arg2 != -3) {
            method216(37, (byte) -95);
        }
        class416.field6129 = arg1;
        field294++;
        class525.field7309 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lco;B)V", line = 95)
    public final void method220(class268 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1738(255);
            if (var3 == 0) {
                if (arg1 < 66) {
                    this.method220(null, (byte) -54);
                }
                field288++;
                return;
            }
            this.method218(arg0, false, var3);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 117)
    public static void method221(byte arg0) {
        field286 = null;
        int var1 = 7 % ((arg0 + 10) / 49);
    }
}
