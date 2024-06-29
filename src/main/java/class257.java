import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class257 {

    @OriginalMember(owner = "client!aia", name = "i", descriptor = "I")
    public int field4040;

    @OriginalMember(owner = "client!aia", name = "e", descriptor = "I")
    public static int field4036 = -1;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!aia", name = "f", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!aia", name = "h", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!aia", name = "j", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "Lda;")
    public static class400 field4034;

    @OriginalMember(owner = "client!aia", name = "g", descriptor = "Ltc;")
    public static class73 field4038;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V")
    public static void method1729(int arg0) {
        field4034 = null;
        if (arg0 != -32177) {
            field4036 = -106;
        }
        field4038 = null;
    }

    @OriginalMember(owner = "client!aia", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4033++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(III)Z")
    public static final boolean method1730(int arg0, int arg1, int arg2) {
        field4041++;
        if (arg1 >= -51) {
            method1729(52);
        }
        return class314.method2066(arg0, arg2, (byte) -106) & ((arg2 & 0x2000) != 0 | class315.method2073(arg2, arg0, (byte) 109) | class424.method2648(-18044, arg0, arg2));
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)[Lvj;")
    public static final class26[] method1731(byte arg0) {
        field4039++;
        int var1 = -51 / ((arg0 + 22) / 36);
        return new class26[] { class567.field8047, class53.field848, class197.field3392, class33.field314, class263.field4077, class540.field7709, class306.field4641, class701.field9906, class70.field1085, class119.field1827 };
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZLcb;Lnp;)Lsr;")
    public static final class540 method1732(boolean arg0, class631 arg1, class752 arg2) {
        field4035++;
        class540 var3 = class292.method1903((byte) -83);
        var3.field7708 = arg1.field8873;
        var3.field7703 = arg1;
        if (var3.field7708 == -1) {
            var3.field7707 = new class702(260);
        } else if (var3.field7708 == -2) {
            var3.field7707 = new class702(10000);
        } else if (var3.field7708 <= 18) {
            var3.field7707 = new class702(20);
        } else if (var3.field7708 <= 98) {
            var3.field7707 = new class702(100);
        } else {
            var3.field7707 = new class702(260);
        }
        var3.field7707.method3903(-111, arg2);
        var3.field7707.method3906(var3.field7703.method3575(arg0), 26);
        var3.field7711 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)Ltda;")
    public static final class338 method1733(int arg0, int arg1) {
        field4032++;
        class338 var2 = (class338) class206.field3457.method80((byte) -18, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class72.field1094.method2624(0, 1, arg1);
        class338 var4 = new class338();
        var4.field4946 = arg1;
        if (var3 != null) {
            var4.method2155(new class301(var3), 123);
        }
        if (arg0 != -27721) {
            method1729(-58);
        }
        var4.method2154(91);
        if (var4.field4936 == 2 && class582.field8233.method3512(true, (long) arg1) == null) {
            class582.field8233.method3516(arg0 + 27976, (long) arg1, new class332(class394.field5875));
            class310.field4688[class394.field5875++] = var4;
        }
        class206.field3457.method67((long) arg1, var4, arg0 + 20949);
        return var4;
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public class257(String arg0, String arg1, String arg2, int arg3) {
        this.field4040 = arg3;
    }
}
