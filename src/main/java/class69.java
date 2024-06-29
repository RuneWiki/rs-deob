import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class69 extends class196 {

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
    public static int field1109 = 0;

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "[I")
    public static int[] field1119 = new int[2];

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "Ldf;")
    public static class51 field1118 = class46.method233("unzap", 100);

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "Ldf;")
    public static class51 field1116 = class46.method233("(R", 100);

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "Ldf;")
    public static class51 field1115 = null;

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "I")
    public static int field1120 = 0;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!vg", name = "eb", descriptor = "Lu;")
    public static class111 field1121;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "Lji;")
    public static class39 field1110;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "[S")
    public static short[] field1117;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 10565) {
            this.method45(-85, 109);
        }
        ++field1112;
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            int var4 = class161.field2639[arg0];
            for (int var5 = 0; ~class49.field767 < ~var5; ++var5) {
                var3[var5] = this.method481(var4, -22425, class211.field3510[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(III)I")
    public static final int method478(int arg0, int arg1, int arg2) {
        ++field1107;
        class136 var3 = (class136) class7.field77.method1453((long) arg1, 1);
        if (var3 == null) {
            return 0;
        } else if (~arg0 == 0) {
            return 0;
        } else {
            int var4 = 0;
            if (arg2 != 503) {
                field1108 = -45;
            }
            for (int var5 = 0; var5 < var3.field2256.length; ++var5) {
                if (var3.field2258[var5] == arg0) {
                    var4 += var3.field2256[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(B)V")
    public static void method479(byte arg0) {
        field1118 = null;
        field1121 = null;
        field1119 = null;
        field1116 = null;
        field1110 = null;
        field1115 = null;
        if (arg0 == 25) {
            field1117 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIILu;)Z")
    public static final boolean method480(int arg0, int arg1, int arg2, class111 arg3) {
        ++field1113;
        byte[] var4 = arg3.method828(arg0, (byte) 101, arg2);
        if (arg1 != 57) {
            return false;
        } else if (var4 == null) {
            return false;
        } else {
            class138.method1004(var4, 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(III)I")
    private final int method481(int arg0, int arg1, int arg2) {
        int var4 = arg0 * 57 + arg2;
        if (arg1 != -22425) {
            field1116 = null;
        }
        int var5 = var4 ^ var4 << 1;
        ++field1114;
        return 4096 - (Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lu;Lu;ZLqb;I)V")
    public static final void method482(class111 arg0, class111 arg1, boolean arg2, class54 arg3, int arg4) {
        class8.field93 = arg2;
        field1121 = arg0;
        class118.field1982 = arg1;
        int var5 = -1 + field1121.method818((byte) 64);
        if (arg4 >= 31) {
            ++field1111;
            class19.field270 = field1121.method821(false, var5) + var5 * 256;
            class92.field1519 = arg3;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class69() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(III)Lmj;")
    public static final class105 method483(int arg0, int arg1, int arg2) {
        class97 var3 = class27.field395[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class105 var4 = var3.field1611;
            var3.field1611 = null;
            return var4;
        }
    }
}
