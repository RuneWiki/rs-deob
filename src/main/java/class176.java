import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class176 extends class154 {

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public int field3161;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "[I")
    public static int[] field3162 = new int[2];

    @OriginalMember(owner = "client!im", name = "t", descriptor = "Loh;")
    public static class258 field3165 = class153.method1046("Untersuchen", 122);

    @OriginalMember(owner = "client!im", name = "v", descriptor = "Lha;")
    public static class194 field3167 = new class194();

    @OriginalMember(owner = "client!im", name = "y", descriptor = "[I")
    public static int[] field3170 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!im", name = "z", descriptor = "Loh;")
    public static class258 field3171 = class153.method1046(")3runescape)3com)4l=", 122);

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lgb;II)Ldb;", line = 5)
    public static final class41 method1210(class213 arg0, int arg1, int arg2) {
        field3164++;
        if (class286.method2016(arg0, false, arg1)) {
            if (arg2 != 17846) {
                field3170 = (int[]) null;
            }
            return class49.method392(8);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IBI)I", line = 27)
    public static final int method1211(int arg0, byte arg1, int arg2) {
        field3168++;
        if (arg0 == -2) {
            return 12345678;
        }
        int var3 = 76 / ((61 - arg1) / 47);
        if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        }
        int var4 = (arg0 & 0x7F) * arg2 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg0 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 64)
    public static void method1212(int arg0) {
        field3171 = null;
        field3167 = null;
        field3165 = null;
        if (arg0 != 2) {
            field3165 = (class258) null;
        }
        field3162 = null;
        field3170 = null;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V", line = 83)
    public static final void method1213(int arg0) {
        class179.field3200.method1157(arg0 + 14458);
        field3160++;
        if (arg0 != -14454) {
            method1211(-124, (byte) -3, 20);
        }
        class51.field803.method1157(4);
        class265.field4609.method1157(4);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Lki;", line = 101)
    public static final class167 method1214(int arg0, int arg1) {
        field3166++;
        class167 var2 = (class167) class233.field4036.method1159((byte) 125, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        int var3 = 104 / ((1 - arg0) / 55);
        byte[] var4 = class146.field2484.method1453(16, (byte) -47, arg1);
        class167 var5 = new class167();
        if (var4 != null) {
            var5.method1111(new class235(var4), -1);
        }
        class233.field4036.method1163(var5, -1, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(II)V", line = 144)
    public class176(int arg0, int arg1) {
        this.field3161 = arg0;
        this.field3169 = arg1;
    }
}
