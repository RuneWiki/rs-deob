import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class161 extends class206 {

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
    public static int field2600 = 0;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "[I")
    public static int[] field2601 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "[I")
    public static int[] field2604 = new int[100];

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field2593 = 0;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "Lmh;")
    public static class62 field2610 = class201.method1405(true, "::noclip");

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public int field2594;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    public int field2603;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
    public int field2605;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public int field2606;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "Lsg;")
    public class191 field2597;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "Lsg;")
    public class191 field2611;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "Lgi;")
    public static class285 field2609;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "Lmh;")
    public class62 field2596;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "Z")
    public boolean field2608;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field2598;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)I", line = 4)
    public static final int method1170(int arg0, int arg1) {
        field2602++;
        return arg1 == -21132 ? (arg0 & 0x3FD73) >> 11 : -28;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZ)V", line = 36)
    public static final void method1171(int arg0, boolean arg1) {
        for (class114 var2 = (class114) class38.field595.method334(-18673); var2 != null; var2 = (class114) class38.field595.method335((byte) 57)) {
            if (var2.field1898 != null) {
                class27.field331.method132(var2.field1898);
                var2.field1898 = null;
            }
            if (var2.field1905 != null) {
                class27.field331.method132(var2.field1905);
                var2.field1905 = null;
            }
            var2.method1444((byte) 89);
        }
        if (arg0 != 261491) {
            field2604 = (int[]) null;
        }
        if (arg1) {
            for (class114 var3 = (class114) class101.field1663.method334(-18673); var3 != null; var3 = (class114) class101.field1663.method335((byte) 113)) {
                if (var3.field1898 != null) {
                    class27.field331.method132(var3.field1898);
                    var3.field1898 = null;
                }
                var3.method1444((byte) 89);
            }
            for (class114 var4 = (class114) class243.field4134.method317(-83); var4 != null; var4 = (class114) class243.field4134.method314(arg0 ^ 0xFFFC029D)) {
                if (var4.field1898 != null) {
                    class27.field331.method132(var4.field1898);
                    var4.field1898 = null;
                }
                var4.method1444((byte) 89);
            }
        }
        field2599++;
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(B)V", line = 113)
    public static void method1172(byte arg0) {
        if (arg0 < -15) {
            field2604 = null;
            field2601 = null;
            field2610 = null;
            field2609 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Led;ILeb;)Lmk;", line = 145)
    public static final class224 method1173(class49 arg0, int arg1, class35 arg2) {
        if (arg1 != 0) {
            method1173((class49) null, 44, (class35) null);
        }
        field2607++;
        long var3 = ((long) arg2.field464 << 32) + ((long) arg2.field465 << 56) + (long) ((arg2.field461 - -1 << 16) + arg2.field463);
        class224 var5 = (class224) arg0.method311((byte) 114, var3);
        if (var5 == null) {
            var5 = new class224(arg2.field461, (float) arg2.field463, true, false, arg2.field464);
            arg0.method309(var5, var3, 1);
        }
        return var5;
    }
}
