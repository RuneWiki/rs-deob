import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class178 {

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Lpr;")
    public static class324 field2151;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Lsd;")
    public static class74 field2156;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public int field2143;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public int field2145;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public int field2146;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public int field2147;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public int field2148;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Ltt;")
    public static class403 field2157;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "[[S")
    public static short[][] field2155;

    static {
        new class40("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        new class40("Select", "Auswählen", "Sélectionner", "Selecionar");
        field2150 = 0;
        field2151 = new class324();
        field2156 = new class74(87, 17);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZI)I", line = 10)
    public static final int method874(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 > 243) {
            arg3 >>= 0x4;
        } else if (arg0 > 217) {
            arg3 >>= 0x3;
        } else if (arg0 > 192) {
            arg3 >>= 0x2;
        } else if (arg0 > 179) {
            arg3 >>= 0x1;
        }
        field2149++;
        return arg2 ? -77 : (arg0 >> 1) + (arg3 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 48)
    public static void method875(int arg0) {
        field2155 = null;
        if (arg0 == 24181) {
            field2157 = null;
            field2156 = null;
            field2151 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 70)
    public static final void method876(int arg0) {
        field2153++;
        int var1 = 0;
        int var2 = 0;
        if (arg0 < 112) {
            field2154 = 81;
        }
        while (class159.field1895 > var2) {
            for (int var3 = 0; var3 < class289.field4316; var3++) {
                if (class283.method1774(class293.field4356, var2, true, var3, 1, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
            var2++;
        }
    }
}
