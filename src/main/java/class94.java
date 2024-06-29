import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public abstract class class94 extends class4 {

    @OriginalMember(owner = "client!nd", name = "pb", descriptor = "I")
    public int field2153 = 1000;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "Loa;")
    private static class98 field2137 = class38.method349(255, "Walk here");

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "Loa;")
    public static class98 field2135 = class38.method349(255, "backbase1");

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "I")
    public static int field2140 = 0;

    @OriginalMember(owner = "client!nd", name = "mb", descriptor = "Loa;")
    public static class98 field2150 = field2137;

    @OriginalMember(owner = "client!nd", name = "nb", descriptor = "Z")
    public static boolean field2151 = false;

    @OriginalMember(owner = "client!nd", name = "fb", descriptor = "[I")
    public static int[] field2143 = new int[256];

    @OriginalMember(owner = "client!nd", name = "ob", descriptor = "I")
    public static int field2152 = -1;

    @OriginalMember(owner = "client!nd", name = "lb", descriptor = "Loa;")
    private static class98 field2149 = class38.method349(255, "Connecting to update server");

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "Loa;")
    public static class98 field2141 = field2149;

    @OriginalMember(owner = "client!nd", name = "qb", descriptor = "Loa;")
    public static class98 field2154;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!nd", name = "gb", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!nd", name = "hb", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!nd", name = "ib", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!nd", name = "jb", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!nd", name = "kb", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "Ltb;")
    public static class130 field2139;

    @OriginalMember(owner = "client!nd", name = "eb", descriptor = "Lkd;")
    public static class73 field2142;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)V")
    public static final void method750(int arg0, boolean arg1) {
        field2144++;
        class21.method190((byte) -39);
        if (arg0 > -119) {
            field2137 = null;
        }
        class1.field9++;
        if (class1.field9 < 50 && !arg1) {
            return;
        }
        class1.field9 = 0;
        if (class20.field443 || class139.field3394 == null) {
            return;
        }
        class132.field3116.method177(6624, 74);
        try {
            class139.field3394.method278(class132.field3116.field132, (byte) -119, class132.field3116.field182, 0);
            class132.field3116.field182 = 0;
        } catch (IOException var2) {
            class20.field443 = true;
        }
        class105.field2388++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I")
    public static int method751(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ltb;IIZIII)V")
    public static final void method752(class130 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class3.field36 = arg3;
        if (arg5 < 65) {
            method750(98, false);
        }
        class139.field3400 = arg4;
        class71.field1483 = 1;
        field2136++;
        client.field513 = arg2;
        class55.field1213 = arg0;
        client.field510 = arg1;
        class71.field1481 = arg6;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(B)Lt;")
    public class128 method273(byte arg0) {
        field2145++;
        if (arg0 <= 104) {
            field2139 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIII)V")
    public void method753(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2138++;
        class128 var10 = this.method273((byte) 113);
        if (var10 != null) {
            this.field2153 = var10.field2153;
            var10.method753(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(B)V")
    public static void method754(byte arg0) {
        field2149 = null;
        field2141 = null;
        field2142 = null;
        field2154 = null;
        field2143 = null;
        field2135 = null;
        field2137 = null;
        field2150 = null;
        field2139 = null;
        if (arg0 != 56) {
            method754((byte) 78);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2143[var0] = var1;
        }
        field2154 = class38.method349(255, "p12_full");
    }
}
