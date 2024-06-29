import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class63 extends class196 {

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "[I")
    public static int[] field831 = new int[200];

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "C")
    private char field829;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "Ljava/lang/String;")
    public String field827;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)Z", line = 7)
    public final boolean method413(byte arg0) {
        if (arg0 != -105) {
            this.field829 = (char) 65467;
        }
        field832++;
        return this.field829 == 's';
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLre;)V", line = 21)
    public final void method414(boolean arg0, class263 arg1) {
        while (true) {
            int var3 = arg1.method1787(!arg0);
            if (var3 == 0) {
                field836++;
                if (!arg0) {
                    method415((byte) 77, -80);
                }
                return;
            }
            this.method419(arg1, var3, 117);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)Z", line = 44)
    public static final boolean method415(byte arg0, int arg1) {
        field835++;
        if (arg1 >= 0 && class301.field4601.length > arg1) {
            int var2 = 62 / ((arg0 - 24) / 58);
            return class301.field4601[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V", line = 73)
    public static void method416(byte arg0) {
        field831 = null;
        if (arg0 != -114) {
            method416((byte) 55);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B[I)[I", line = 85)
    public static final int[] method417(byte arg0, int[] arg1) {
        field838++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            int var3 = 97 / ((arg0 + 8) / 46);
            class85.method594(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIBI)V", line = 105)
    public static final void method418(boolean arg0, int arg1, byte arg2, int arg3) {
        field828++;
        if (arg2 != 110) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class230.field3480 = arg1;
        class242.field3627 = arg0;
        class248.field3696 = arg3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lre;II)V", line = 124)
    private final void method419(class263 arg0, int arg1, int arg2) {
        int var4 = -53 % ((arg2 - 59) / 42);
        if (arg1 == 1) {
            this.field829 = class166.method1164(arg0.method1810((byte) 110), (byte) 55);
        } else if (arg1 == 2) {
            this.field837 = arg0.method1826(-206227536);
        } else if (arg1 == 5) {
            this.field827 = arg0.method1801(-30054);
        }
        field833++;
    }
}
