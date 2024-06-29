import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class19 {

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "J")
    public long field244 = 0L;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Lte;")
    public static class244 field243 = new class244(64);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public int field233;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public int field242;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public int field246;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Leh;")
    public static class137 field231;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lpb;")
    public class264 field234;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Z")
    public static boolean field238;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method103(boolean arg0, byte[] arg1) {
        field229++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class72.method403(arg1, 0, var3, 0, var2);
        if (arg0) {
            field243 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method104(int arg0) {
        field243 = null;
        int var1 = -107 % ((68 - arg0) / 49);
        field231 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)Lri;")
    public static final class39 method105(int arg0, boolean arg1) {
        field247++;
        class39 var2 = (class39) class137.field2174.method1693((long) arg0, 115);
        if (var2 != null) {
            return var2;
        }
        class39 var3 = class115.method751(class35.field456, 116, arg0, arg1, class76.field954);
        if (var3 != null) {
            class137.field2174.method1694(true, (long) arg0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
    public static final void method106(int arg0, int arg1) {
        field232++;
        int var2 = -17 / ((9 - arg1) / 50);
        class287.field4577.method1695(arg0, 0);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)V")
    public static final void method107(int arg0, int arg1) {
        for (class237 var2 = class25.field345.method710((byte) -17); var2 != null; var2 = class25.field345.method709(false)) {
            if (((long) arg1) == (var2.field3923 >> 48 & 0xFFFFL)) {
                var2.method1673(14510);
            }
        }
        field237++;
        if (arg0 != -24783) {
            method103(true, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)J")
    public static final long method108(int arg0, int arg1, int arg2) {
        class246 var3 = class46.field585[arg0][arg1][arg2];
        return var3 == null || var3.field4054 == null ? 0L : var3.field4054.field2051;
    }
}
