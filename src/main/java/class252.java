import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class252 extends class266 {

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
    public int field4175 = 0;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "Lma;")
    private static class5 field4169 = class12.method119("Loaded sprites", (byte) 62);

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "Lma;")
    public static class5 field4178 = field4169;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "Ltj;")
    public static class73 field4177 = new class73(50);

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "Lma;")
    public static class5 field4180 = class12.method119("details", (byte) 104);

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "Lma;")
    public static class5 field4181 = class12.method119("(Y<)4col>", (byte) 103);

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "Lni;")
    public static class202 field4179;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V", line = 11)
    public static void method1758(byte arg0) {
        field4179 = null;
        field4178 = null;
        field4169 = null;
        field4177 = null;
        if (arg0 >= 18) {
            field4181 = null;
            field4180 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)V", line = 31)
    public static final void method1759(int arg0) {
        class57.field904 = null;
        class37.field583 = (byte[][][]) null;
        field4174++;
        int var1 = 68 / ((arg0 + 60) / 62);
        class283.field4803 = null;
        class279.field4733 = (byte[][][]) null;
        class78.field1213 = (byte[][][]) null;
        class181.field2754 = null;
        class278.field4718 = (int[][][]) null;
        class111.field1641 = (byte[][][]) null;
        class286.field4829 = null;
        class91.field1364 = null;
        class152.field2235 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)Z", line = 54)
    public static final boolean method1760(int arg0, byte arg1) {
        if (arg1 < 117) {
            field4180 = (class5) null;
        }
        field4168++;
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLii;I)V", line = 67)
    private final void method1761(byte arg0, class221 arg1, int arg2) {
        if (arg2 == 2) {
            this.field4175 = arg1.method1524((byte) 66);
        }
        if (arg0 != 40) {
            this.method1761((byte) -30, (class221) null, 100);
        }
        field4176++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLeb;)Z", line = 84)
    public static final boolean method1762(byte arg0, class253 arg1) {
        field4172++;
        if (arg1.field4238 == 205) {
            class74.field1168 = 250;
            return true;
        } else {
            return arg0 >= -43;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILii;)V", line = 110)
    public final void method1763(int arg0, class221 arg1) {
        int var3 = 28 / ((arg0 + 21) / 55);
        while (true) {
            int var4 = arg1.method1509(true);
            if (var4 == 0) {
                field4171++;
                return;
            }
            this.method1761((byte) 40, arg1, var4);
        }
    }
}
