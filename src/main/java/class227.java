import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class227 extends class203 {

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
    public static int field3944 = 0;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "Lmh;")
    public static class62 field3952 = class201.method1405(true, "gleiten:");

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "Lmh;")
    public static class62 field3945 = null;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
    public static int field3947 = 0;

    @OriginalMember(owner = "client!kl", name = "T", descriptor = "Lmh;")
    public static class62 field3957 = class201.method1405(true, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "Lmh;")
    private static class62 field3956 = class201.method1405(true, "Loaded update list");

    @OriginalMember(owner = "client!kl", name = "U", descriptor = "Lmh;")
    public static class62 field3958 = field3956;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
    public int field3946;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
    private int field3954;

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "Lmh;")
    public class62 field3953;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(B)Z", line = 20)
    public final boolean method1604(byte arg0) {
        field3955++;
        if (arg0 != 43) {
            method1608((byte) -121);
        }
        return this.field3954 == 115;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V", line = 33)
    public static void method1605(int arg0) {
        field3957 = null;
        field3956 = null;
        if (arg0 != 2) {
            method1607((byte) -82, 111, -85);
        }
        field3958 = null;
        field3945 = null;
        field3952 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILmi;)V", line = 52)
    public final void method1606(int arg0, class92 arg1) {
        field3951++;
        while (true) {
            int var3 = arg1.method702(-1);
            if (var3 == 0) {
                int var4 = 46 % ((38 - arg0) / 55);
                return;
            }
            this.method1609(var3, arg1, 11747);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BII)V", line = 79)
    public static final void method1607(byte arg0, int arg1, int arg2) {
        field3948++;
        if (class195.field3293 < 2 && class263.field4429 == 0 && !class106.field1728) {
            return;
        }
        class62 var3;
        if (class263.field4429 == 1 && class195.field3293 < 2) {
            var3 = class254.method1772(new class62[] { class73.field1113, class113.field1872, class216.field3671, class133.field2164 }, 0);
        } else if (class106.field1728 && class195.field3293 < 2) {
            var3 = class254.method1772(new class62[] { class121.field2015, class113.field1872, class281.field4805, class133.field2164 }, 0);
        } else {
            var3 = class2.method14(class195.field3293 - 1, true);
        }
        if (class195.field3293 > 2) {
            var3 = class254.method1772(new class62[] { var3, class245.field4165, class42.method284(class195.field3293 - 2, -118), class37.field503 }, 0);
        }
        if (arg0 >= -108) {
            method1605(6);
        }
        int var4 = class296.field5047.method2026(var3, arg2 + 4, arg1 + 15, 16777215, 0, class182.field2905, class22.field236);
        class267.method1840(arg2 + 4, 15, arg1, 0, class296.field5047.method2040(var3) + var4);
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "(B)V", line = 122)
    public static final void method1608(byte arg0) {
        int var1 = 1 / ((arg0 + 14) / 37);
        class275.field4713 = new class191[class165.field2692.method151((byte) 74)][];
        class307.field5266 = new boolean[class165.field2692.method151((byte) 74)];
        field3949++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILmi;I)V", line = 133)
    private final void method1609(int arg0, class92 arg1, int arg2) {
        if (arg0 == 1) {
            this.field3954 = arg1.method702(arg2 ^ 0xFFFFD21C);
        } else if (arg0 == 2) {
            this.field3946 = arg1.method704(arg2 ^ 0x59FFD473);
        } else if (arg0 == 5) {
            this.field3953 = arg1.method696((byte) 114);
        }
        field3950++;
        if (arg2 != 11747) {
            field3945 = (class62) null;
        }
    }
}
