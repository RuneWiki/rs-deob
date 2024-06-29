import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class132 extends class665 {

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public int field1943;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Luc;")
    public static class27 field1947 = new class27("", 17);

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "Ldg;")
    public static class376 field1953 = new class376(67, 7);

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "Lnea;")
    public static class664 field1955 = new class664(85, 10);

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "Ldg;")
    public static class376 field1958 = new class376(45, 2);

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "[I")
    public static int[] field1959 = new int[14];

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "[Lfg;")
    public static class113[] field1957;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z")
    public final boolean method972(int arg0, int arg1) {
        field1946++;
        if (arg1 != -22640) {
            this.method973(11);
        }
        return (this.field1943 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I")
    public final int method973(int arg0) {
        if (arg0 <= 20) {
            return -34;
        } else {
            field1944++;
            return this.field1943 >> 18 & 0x7;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)I")
    public final int method974(int arg0) {
        field1951++;
        if (arg0 != -2090995594) {
            this.method979((byte) -74);
        }
        return class678.method3763(this.field1943, -125);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)Z")
    public final boolean method975(byte arg0) {
        if (arg0 != -18) {
            this.method979((byte) 42);
        }
        field1945++;
        return (this.field1943 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
    public static final void method976(byte arg0) {
        int var1 = -115 % ((31 - arg0) / 45);
        field1950++;
        if (class189.field2720) {
            return;
        }
        class688.method3792(class448.field6480, (byte) -62);
        if (class634.field8979 != null) {
            class688.method3792(class634.field8979, (byte) -82);
        }
        class189.field2720 = true;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
    public static void method977(int arg0) {
        field1953 = null;
        field1947 = null;
        field1959 = null;
        field1955 = null;
        if (arg0 != 2416949) {
            method977(67);
        }
        field1957 = null;
        field1958 = null;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)Z")
    public final boolean method978(byte arg0) {
        if (arg0 >= -45) {
            field1958 = null;
        }
        field1948++;
        return (this.field1943 & 0x24E135) >> 21 != 0;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)Z")
    public final boolean method979(byte arg0) {
        field1949++;
        int var2 = -57 % ((arg0 + 51) / 62);
        return ((this.field1943 & 0x4C03D5) >> 22) != 0;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(II)V")
    public class132(int arg0, int arg1) {
        this.field1952 = arg1;
        this.field1943 = arg0;
    }
}
