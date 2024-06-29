import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class546 {

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
    public int field8155;

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
    public int field8154;

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "I")
    public int field8156;

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
    public int field8152;

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "J")
    public static long field8153;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!tda", name = "h", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(ILaq;)I")
    public static final int method3319(int arg0, class141 arg1) {
        if (arg0 <= 29) {
            return 40;
        }
        field8150++;
        if (class245.field3536 == arg1) {
            return 6407;
        } else if (class488.field6956 == arg1) {
            return 6408;
        } else if (class613.field9072 == arg1) {
            return 6406;
        } else if (class609.field9043 == arg1) {
            return 6409;
        } else if (class540.field8108 == arg1) {
            return 6410;
        } else if (class272.field3847 == arg1) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(IIII)V")
    public class546(int arg0, int arg1, int arg2, int arg3) {
        this.field8155 = arg2;
        this.field8154 = arg0;
        this.field8156 = arg3;
        this.field8152 = arg1;
    }

    @OriginalMember(owner = "client!tda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8157++;
        throw new IllegalStateException();
    }

    static {
        new class572("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field8153 = -1L;
    }
}
