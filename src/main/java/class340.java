import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class340 extends class254 {

    @OriginalMember(owner = "client!np", name = "j", descriptor = "Lqp;")
    public static class466 field4897 = new class466(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!np", name = "p", descriptor = "[I")
    public static int[] field4903 = new int[100];

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "Lnp;")
    public class340 field4898;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "Lnp;")
    public class340 field4899;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V", line = 4)
    public static void method2019(int arg0) {
        if (arg0 <= 51) {
            method2022(null, null, -124);
        }
        field4897 = null;
        field4903 = null;
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V", line = 16)
    public final void method2020(int arg0) {
        field4896++;
        if (this.field4898 == null) {
            return;
        }
        this.field4898.field4899 = this.field4899;
        this.field4899.field4898 = this.field4898;
        if (arg0 <= 37) {
            field4903 = null;
        }
        this.field4899 = null;
        this.field4898 = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)I", line = 41)
    public static final int method2021(byte arg0, int arg1) {
        field4902++;
        if (arg0 >= -34) {
            method2022(null, null, -107);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lmg;Lmg;I)I", line = 52)
    public static final int method2022(class101 arg0, class101 arg1, int arg2) {
        field4900++;
        int var3 = arg2;
        if (arg1.method747(class260.field3620, (byte) -68)) {
            var3 = arg2 + 1;
        }
        if (arg1.method747(class217.field3028, (byte) -68)) {
            var3++;
        }
        if (arg1.method747(class113.field1701, (byte) -68)) {
            var3++;
        }
        if (arg0.method747(class260.field3620, (byte) -68)) {
            var3++;
        }
        if (arg0.method747(class217.field3028, (byte) -68)) {
            var3++;
        }
        if (arg0.method747(class113.field1701, (byte) -68)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(III)V", line = 82)
    public static final void method2023(int arg0, int arg1, int arg2) {
        field4904++;
        class97 var3 = class348.method2064(arg0, arg1, -75);
        var3.method712((byte) -126);
        var3.field1468 = arg2;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(B)V", line = 94)
    public static final void method2024(byte arg0) {
        if (arg0 <= 98) {
            field4897 = null;
        }
        class495.field7226 = new class150[class136.field1958.method746(93)][];
        field4901++;
        class421.field6175 = new class150[class136.field1958.method746(54)][];
        class255.field3535 = new boolean[class136.field1958.method746(92)];
    }
}
