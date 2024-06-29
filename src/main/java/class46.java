import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class46 extends class171 implements class21 {

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    private int field728;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "Llt;")
    public static class475 field730 = new class475("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "Lvp;")
    public static class123 field732 = new class123();

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "[C")
    public static char[] field733 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "Lef;")
    public static class336 field734 = new class336(14, 1);

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "Lef;")
    public static class336 field735 = new class336(15, 4);

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "Lef;")
    public static class336 field736 = new class336(16, -2);

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "Lef;")
    public static class336 field737 = new class336(17, 0);

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "Lef;")
    public static class336 field738 = new class336(18, -2);

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "Lef;")
    public static class336 field739 = new class336(20, 6);

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "Lef;")
    public static class336 field740 = new class336(21, 8);

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "Lef;")
    public static class336 field741 = new class336(22, -2);

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "Lef;")
    public static class336 field742 = new class336(23, 4);

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "Lef;")
    public static class336 field743 = new class336(24, -1);

    @OriginalMember(owner = "client!qr", name = "w", descriptor = "[Lef;")
    private static class336[] field744 = new class336[32];

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "([BIII)V")
    public final void method139(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 44) {
            method289(-118);
        }
        this.method1179(arg0, arg1);
        ++field731;
        this.field728 = arg2;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)I")
    public static final int method288(int arg0, int arg1) {
        return class180.field2647 != null ? class180.field2647[arg0][arg1] & 255 : 0;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)I")
    public final int method140(int arg0) {
        ++field727;
        if (arg0 >= -42) {
            this.method137((byte) 26);
        }
        return this.field728;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
    public static void method289(int arg0) {
        field734 = null;
        if (arg0 == 16) {
            field738 = null;
            field736 = null;
            field730 = null;
            field732 = null;
            field742 = null;
            field733 = null;
            field739 = null;
            field743 = null;
            field741 = null;
            field737 = null;
            field735 = null;
            field740 = null;
            field744 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lod;I[BI)V")
    public class46(class349 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field728 = arg1;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lod;ILjaggl/memory/NativeBuffer;)V")
    public class46(class349 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field728 = arg1;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)I")
    public final int method137(byte arg0) {
        if (arg0 != 52) {
            method289(85);
        }
        ++field725;
        return 0;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZI)V")
    public static final void method290(boolean arg0, int arg1) {
        ++field726;
        if (class159.field2352 == null || ~class159.field2352.length > ~arg1) {
            class159.field2352 = new int[arg1];
        }
        if (!arg0) {
            method288(-123, -54);
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)V")
    public static final void method291(int arg0, int arg1) {
        ++field729;
        class338 var2 = class230.method1580(arg0, arg0 ^ -1332166312, arg1);
        var2.method2052(arg0 + 84);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)J")
    public final long method138(boolean arg0) {
        ++field724;
        return !arg0 ? -40L : super.field2533.method2633();
    }

    static {
        class336[] var0 = class176.method1198((byte) 84);
        for (int var1 = 0; ~var1 > ~var0.length; ++var1) {
            field744[var0[var1].field4730] = var0[var1];
        }
    }
}
