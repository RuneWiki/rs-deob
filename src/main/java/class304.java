import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class304 {

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public int field4157;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public int field4168;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public int field4158;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "B")
    public byte field4167;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    private int field4153;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Lvj;")
    public class304 field4161;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "[F")
    public static float[] field4165 = new float[4];

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "Lfg;")
    public static class83 field4163 = new class83("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "Lfg;")
    public static class83 field4170 = new class83("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field4173 = 0;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "F")
    public static float field4171;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public int field4149;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public int field4151;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public int field4154;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public int field4155;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public int field4156;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public int field4159;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public int field4162;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public int field4164;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public int field4166;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Lf;")
    public static class529 field4152;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)Ltg;", line = 8)
    public final class153 method1727(int arg0) {
        field4160++;
        if (arg0 >= -25) {
            field4171 = 0.64099985F;
        }
        return class465.method2729(this.field4153, false);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)Lvj;", line = 27)
    public final class304 method1728(int arg0, int arg1, int arg2, int arg3) {
        field4150++;
        return arg0 == -22685 ? new class304(this.field4153, arg2, arg3, arg1, this.field4167) : null;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(IIIIB)V", line = 53)
    public class304(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4157 = arg2;
        this.field4168 = arg3;
        this.field4158 = arg1;
        this.field4167 = arg4;
        this.field4153 = arg0;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V", line = 65)
    public static void method1729(int arg0) {
        field4165 = null;
        field4163 = null;
        field4152 = null;
        if (arg0 < 46) {
            field4165 = null;
        }
        field4170 = null;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lvj;I)V", line = 77)
    public class304(class304 arg0, int arg1) {
        this.field4161 = arg0;
        this.field4157 = this.field4161.field4157 + arg1;
        this.field4153 = this.field4161.field4153;
        this.field4168 = this.field4161.field4168 + arg1;
        this.field4167 = this.field4161.field4167;
        this.field4158 = this.field4161.field4158 + arg1;
    }
}
