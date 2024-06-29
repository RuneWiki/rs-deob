import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class467 extends class529 {

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public int field7149;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    public int field7145;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "Lss;")
    public static class213 field7148 = new class213("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "I")
    public static int field7158 = 0;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "[B")
    public static byte[] field7156 = new byte[2048];

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "Lo;")
    public static class139 field7155;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "Lmn;")
    public static class162 field7157;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)Z")
    public final boolean method2909(boolean arg0) {
        field7146++;
        if (arg0) {
            return (this.field7149 >> 21 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)Z")
    public final boolean method2910(int arg0, int arg1) {
        field7151++;
        if (arg0 != -1) {
            this.method2914((byte) -21);
        }
        return (this.field7149 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)Z")
    public final boolean method2911(byte arg0) {
        field7147++;
        if (arg0 < 59) {
            this.method2914((byte) -30);
        }
        return (this.field7149 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
    public static void method2912(int arg0) {
        field7156 = null;
        field7155 = null;
        field7148 = null;
        if (arg0 <= 70) {
            field7148 = null;
        }
        field7157 = null;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(II)V")
    public class467(int arg0, int arg1) {
        this.field7149 = arg0;
        this.field7145 = arg1;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)I")
    public final int method2913(int arg0) {
        field7153++;
        if (arg0 >= -3) {
            field7157 = null;
        }
        return class446.method2819(-30, this.field7149);
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)Z")
    public final boolean method2914(byte arg0) {
        field7154++;
        if (arg0 > -62) {
            this.field7149 = 43;
        }
        return ((this.field7149 & 0x6959AC) >> 22) != 0;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)I")
    public final int method2915(int arg0) {
        field7150++;
        if (arg0 != -796955630) {
            this.method2913(77);
        }
        return (this.field7149 & 0x1ECD20) >> 18;
    }
}
