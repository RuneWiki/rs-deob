import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class2 extends RuntimeException {

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "Ljava/lang/String;")
    public String field14;

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field8;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "Lia;")
    public static class15 field7 = class28.method196("Spinning Wheel", false);

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "Lia;")
    public static class15 field9 = class28.method196("Magic Shop", false);

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "Lia;")
    public static class15 field11 = class28.method196("Kebab Seller", false);

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "Lia;")
    public static class15 field10 = class28.method196("Helmet Shop", false);

    @OriginalMember(owner = "mapview!b", name = "i", descriptor = "Lia;")
    public static class15 field15 = class28.method196("Mining Shop", false);

    @OriginalMember(owner = "mapview!b", name = "g", descriptor = "Lia;")
    public static class15 field13 = class28.method196("overlay)3dat", false);

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "Lia;")
    public static class15 field12 = class28.method196("Altar", false);

    @OriginalMember(owner = "mapview!b", name = "l", descriptor = "I")
    public static int field18 = 0;

    @OriginalMember(owner = "mapview!b", name = "m", descriptor = "Lia;")
    public static class15 field19 = class28.method196("Hunter Store", false);

    @OriginalMember(owner = "mapview!b", name = "o", descriptor = "Lia;")
    public static class15 field21 = class28.method196("Mini)2Game", false);

    @OriginalMember(owner = "mapview!b", name = "p", descriptor = "Lia;")
    public static class15 field22 = class28.method196("Pub)4Bar", false);

    @OriginalMember(owner = "mapview!b", name = "q", descriptor = "[I")
    public static int[] field23 = new int[128];

    @OriginalMember(owner = "mapview!b", name = "k", descriptor = "[[[[B")
    public static byte[][][][] field17 = new byte[5][][][];

    @OriginalMember(owner = "mapview!b", name = "j", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "mapview!b", name = "n", descriptor = "[B")
    public static byte[] field20;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I)V", line = 31)
    public static void method12(int arg0) {
        field7 = null;
        field15 = null;
        field22 = null;
        field12 = null;
        field9 = null;
        field13 = null;
        field19 = null;
        field20 = null;
        int var1 = 101 / ((arg0 - 11) / 32);
        field21 = null;
        field11 = null;
        field10 = null;
        field23 = null;
        field17 = null;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ZLjava/lang/Object;I)[B", line = 76)
    public static final byte[] method13(boolean arg0, Object arg1, int arg2) {
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return arg0 ? class12.method64((byte) 127, var4) : var4;
        } else if (arg2 != -1694648602) {
            return (byte[]) null;
        } else if (arg1 instanceof class28) {
            class28 var3 = (class28) arg1;
            return var3.method195((byte) 4);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(BZIII)V", line = 114)
    public static final void method14(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            method13(false, null, 99);
        }
        int var5 = arg4 >> 6;
        int var6 = arg2 >> 6;
        if (field17[arg3][var6][var5] == null) {
            field17[arg3][var6][var5] = new byte[4096];
        }
        field17[arg3][var6][var5][class29.method201(63, arg4) + (class29.method201(63, arg2) << 6)] = arg0;
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 149)
    public class2(Throwable arg0, String arg1) {
        this.field14 = arg1;
        this.field8 = arg0;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(JI)V", line = 178)
    public static final void method15(long arg0, int arg1) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg1 <= 112) {
            field11 = null;
        }
        if (arg0 % 10L == 0L) {
            class10.method52(-125, arg0 - 1L);
            class10.method52(-122, 1L);
        } else {
            class10.method52(-124, arg0);
        }
    }
}
