import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class113 {

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "Lhc;")
    private class152 field1419 = new class152();

    @OriginalMember(owner = "client!qda", name = "n", descriptor = "Lut;")
    private class136 field1430 = new class136();

    @OriginalMember(owner = "client!qda", name = "k", descriptor = "I")
    private int field1427;

    @OriginalMember(owner = "client!qda", name = "l", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client!qda", name = "m", descriptor = "Ldj;")
    private class362 field1429;

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "Llja;")
    public static class744 field1423 = new class744(31, -1);

    @OriginalMember(owner = "client!qda", name = "h", descriptor = "I")
    public static int field1424 = 0;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!qda", name = "i", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!qda", name = "j", descriptor = "Leca;")
    public static class790 field1426;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(JLhc;Z)V", line = 4)
    public final void method897(long arg0, class152 arg1, boolean arg2) {
        if (this.field1428 == 0) {
            class152 var5 = this.field1430.method1006(24360);
            var5.method2219(13630);
            var5.method1088(4);
            if (this.field1419 == var5) {
                class152 var6 = this.field1430.method1006(24360);
                var6.method2219(13630);
                var6.method1088(4);
            }
        } else {
            this.field1428--;
        }
        field1418++;
        this.field1429.method2112(arg1, (byte) 6, arg0);
        if (arg2) {
            this.field1428 = -101;
        }
        this.field1430.method1005(-110, arg1);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZJ)V", line = 37)
    public final void method898(boolean arg0, long arg1) {
        field1422++;
        class152 var4 = (class152) this.field1429.method2121(85, arg1);
        if (arg0 && var4 != null) {
            var4.method2219(13630);
            var4.method1088(4);
            this.field1428++;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V", line = 56)
    public static void method899(int arg0) {
        field1426 = null;
        field1423 = null;
        if (arg0 != 0) {
            field1424 = 105;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V", line = 68)
    public static final void method900(byte arg0) {
        field1421++;
        for (int var1 = 0; var1 < class3.field42; var1++) {
            int var2 = class2.field29[var1];
            class273 var3 = (class273) class30.field444.method2121(80, (long) var2);
            if (var3 != null) {
                class388 var4 = var3.field3210;
                class123.method960(var4, (byte) -28, var4.field5003.field6710);
            }
        }
        if (arg0 <= 9) {
            method899(-10);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(JI)Lhc;", line = 102)
    public final class152 method901(long arg0, int arg1) {
        field1425++;
        class152 var4 = (class152) this.field1429.method2121(57, arg0);
        int var5 = 40 / ((arg1 - 34) / 55);
        if (var4 != null) {
            this.field1430.method1005(-41, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)V", line = 129)
    public final void method902(byte arg0) {
        this.field1430.method1000(31335);
        field1417++;
        this.field1429.method2115(0);
        this.field1419 = new class152();
        if (arg0 <= 11) {
            field1426 = null;
        }
        this.field1428 = this.field1427;
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V", line = 157)
    public static final void method903(int arg0) {
        class396.field5135 = class332.field4108.field3773 + class332.field4108.field3769 + 2;
        field1420++;
        class586.field7985 = class466.field6523.field3773 + class466.field6523.field3769 + 2;
        class75.field1041 = new String[500];
        if (arg0 == 11931) {
            for (int var1 = 0; var1 < class75.field1041.length; var1++) {
                class75.field1041[var1] = "";
            }
            class793.method4374(0, class637.field8673.method3584(class770.field10592, true));
        }
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(I)V", line = 191)
    public class113(int arg0) {
        this.field1427 = arg0;
        this.field1428 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field1429 = new class362(var2);
    }
}
