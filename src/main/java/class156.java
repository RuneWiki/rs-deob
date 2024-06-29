import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class156 implements class142 {

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "[[S")
    public static short[][] field1897 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    public int field1894;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "Z")
    public boolean field1903;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "[Lod;")
    public static class429[] field1904;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)Lwt;")
    public static final class258 method858(int arg0) {
        if (arg0 != -27314) {
            field1897 = null;
        }
        field1895++;
        if (class353.field4597 == null || class119.field1507 == null) {
            return null;
        }
        class119.field1507.method3383(class353.field4597, 0);
        class258 var1 = (class258) class119.field1507.method3382(-19983);
        if (var1 == null) {
            return null;
        } else {
            class107 var2 = class353.field4587.method3245((byte) -119, var1.field3313);
            return var2 != null && var2.field1319 && var2.method621(false, class353.field4594) ? var1 : class129.method733(3);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V")
    public static void method859(byte arg0) {
        field1897 = null;
        field1904 = null;
        if (arg0 != -103) {
            method858(-5);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILada;)Z")
    public final boolean method783(int arg0, class142 arg1) {
        int var3 = -118 / ((31 - arg0) / 33);
        field1898++;
        if (!(arg1 instanceof class156)) {
            return false;
        }
        class156 var4 = (class156) arg1;
        if (this.field1900 != var4.field1900) {
            return false;
        } else if (this.field1901 != var4.field1901) {
            return false;
        } else if (this.field1899 != var4.field1899) {
            return false;
        } else if (this.field1894 != var4.field1894) {
            return false;
        } else if (this.field1902 != var4.field1902) {
            return false;
        } else if (this.field1896 == var4.field1896) {
            return this.field1903 == var4.field1903;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)J")
    public final long method782(int arg0) {
        field1905++;
        long[] var2 = class242.field3025;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field1900) & 0xFFL)];
        long var7 = var2[(int) ((var5 ^ (long) (this.field1901 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field1901 ^ var7) & 0xFFL)];
        long var11 = var2[(int) (((long) (this.field1899 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) (((long) (this.field1899 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) ((var13 ^ (long) (this.field1899 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field1899) & 0xFFL)];
        long var19 = var2[(int) (((long) this.field1894 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var19 >>> 8 ^ var2[(int) (((long) (this.field1902 >> 24) ^ var19) & 0xFFL)];
        if (arg0 != 5869) {
            this.field1896 = 98;
        }
        long var23 = var2[(int) ((var21 ^ (long) (this.field1902 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) ((var23 ^ (long) (this.field1902 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field1902 ^ var25) & 0xFFL)];
        long var29 = var2[(int) ((var27 ^ (long) this.field1896) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) ((var29 ^ (long) (this.field1903 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    static {
        new class180("clan_chat", "clanchat", "conversation_clan", "clan_chat");
    }
}
