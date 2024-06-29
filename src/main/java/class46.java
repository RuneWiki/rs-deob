import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class46 {

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "[S")
    public short[] field823;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "[Le;")
    public class191[] field825;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "[S")
    public short[] field826;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "[B")
    public byte[] field815;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "[I")
    public int[] field817;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Le;")
    public static class191 field821 = class54.method368("Bitte warten Sie)3)3)3", 2047);

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "[I")
    public static int[] field828 = new int[5];

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Lef;")
    public static class175 field813 = new class175();

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "Le;")
    private static class191 field830 = class54.method368("white:", 2047);

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "Le;")
    public static class191 field832 = field830;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "Le;")
    public static class191 field834 = field830;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "Le;")
    public static class191 field831 = class54.method368("Lade Titelbild )2 ", 2047);

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Lng;")
    public static class121 field812;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lng;")
    public static class121 field814;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "[I")
    public static int[] field818;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "[S")
    public static short[] field833;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)I")
    public final int method314(int arg0, byte arg1) {
        if (arg1 > -103) {
            return 82;
        } else {
            field829++;
            return this.field815[arg0] & 0x3;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(IB)Z")
    public static final boolean method315(int arg0, byte arg1) {
        field819++;
        if (arg1 == 66) {
            return (arg0 >> 31 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method316(String arg0, byte arg1) throws ClassNotFoundException {
        field824++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            if (arg1 != -37) {
                field828 = null;
            }
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)Z")
    public final boolean method317(boolean arg0, int arg1) {
        field822++;
        if (arg0) {
            field812 = null;
        }
        return (this.field815[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
    public static void method318(byte arg0) {
        field812 = null;
        field831 = null;
        field821 = null;
        field828 = null;
        field834 = null;
        field832 = null;
        field830 = null;
        if (arg0 != 66) {
            field814 = null;
        }
        field818 = null;
        field813 = null;
        field814 = null;
        field833 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static final void method319(int arg0) {
        class197.method1387();
        if (arg0 != 8206) {
            field833 = null;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class82.field1383[var1].method1497((byte) -12);
        }
        System.gc();
        field827++;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(I)V")
    public class46(int arg0) {
        this.field816 = arg0;
        this.field823 = new short[this.field816];
        this.field825 = new class191[this.field816];
        this.field826 = new short[this.field816];
        this.field815 = new byte[this.field816];
        this.field817 = new int[this.field816];
    }
}
