import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class418 {

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "Lds;")
    private class225 field6183 = new class225();

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "Lql;")
    private class346 field6194 = new class346();

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    private int field6193;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    private int field6192;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "Lvk;")
    private class56 field6190;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "J")
    public static long field6185 = 0L;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "[Z")
    public static boolean[] field6191 = new boolean[8];

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "Z")
    public static boolean field6196 = false;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V", line = 6)
    public final void method2672(byte arg0) {
        field6188++;
        this.field6194.method2251(arg0 - 53);
        this.field6190.method391(arg0 ^ 0x4A);
        this.field6183 = new class225();
        this.field6193 = this.field6192;
        if (arg0 != 59) {
            this.method2673(66L, (class225) null, -21);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(JLds;I)V", line = 28)
    public final void method2673(long arg0, class225 arg1, int arg2) {
        if (this.field6193 == 0) {
            class225 var5 = this.field6194.method2246((byte) -122);
            var5.method322(arg2 ^ 0x2CC2);
            var5.method1302(true);
            if (this.field6183 == var5) {
                class225 var6 = this.field6194.method2246((byte) -128);
                var6.method322(arg2 - 11454);
                var6.method1302(true);
            }
        } else {
            this.field6193--;
        }
        field6184++;
        this.field6190.method381(true, arg1, arg0);
        this.field6194.method2245(arg1, (byte) -58);
        if (arg2 != 11465) {
            this.field6194 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(JI)Lds;", line = 60)
    public final class225 method2674(long arg0, int arg1) {
        field6187++;
        if (arg1 != 22300) {
            method2675((byte) 111, -71);
        }
        class225 var4 = (class225) this.field6190.method384(arg0, true);
        if (var4 != null) {
            this.field6194.method2245(var4, (byte) -96);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)Lga;", line = 84)
    public static final class277 method2675(byte arg0, int arg1) {
        field6186++;
        class277 var2 = (class277) class447.field6551.method2674((long) arg1, 22300);
        if (var2 != null) {
            return var2;
        }
        int var3 = -101 / ((15 - arg0) / 51);
        byte[] var4 = class17.field250.method2261(method2677(arg1, 23664), class142.method905(101, arg1), 96);
        class277 var5 = new class277();
        if (var4 != null) {
            var5.method1915(-29998, new class228(var4));
        }
        class447.field6551.method2673((long) arg1, var5, 11465);
        return var5;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V", line = 113)
    public static void method2676(boolean arg0) {
        if (!arg0) {
            field6191 = null;
        }
        field6191 = null;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(I)V", line = 190)
    public class418(int arg0) {
        this.field6193 = arg0;
        this.field6192 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field6190 = new class56(var2);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)I", line = 128)
    private static final int method2677(int arg0, int arg1) {
        field6195++;
        return arg1 == 23664 ? arg0 & 0xFF : -66;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)Lcm;", line = 145)
    public static final class379 method2678(int arg0, int arg1) {
        field6189++;
        class379 var2 = (class379) class130.field1793.method2674((long) arg0, 22300);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class225.field2956.method2261(arg0 & 0x7FFF, 1, 77);
        } else {
            var3 = class397.field5911.method2261(arg0, 1, 56);
        }
        class379 var4 = new class379();
        if (var3 != null) {
            var4.method2452(new class228(var3), (byte) 108);
        }
        if (arg0 >= 32768) {
            var4.method2451(32768);
        }
        class130.field1793.method2673((long) arg0, var4, arg1 - 2852);
        if (arg1 != 14317) {
            method2676(false);
        }
        return var4;
    }
}
