import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class527 extends class467 {

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "[B")
    public byte[] field7782;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "[Z")
    public static boolean[] field7783 = new boolean[100];

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lpg;")
    public static class492 field7779 = new class492(57, -1);

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "Lpg;")
    public static class492 field7784 = new class492(80, 4);

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "Lcm;")
    public static class449 field7785;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Lui;")
    public static class375 field7786;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Leq;")
    public static class253 field7780;

    static {
        new class375("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field7785 = new class449(12, -1);
        field7787 = 0;
        field7786 = new class375("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 4)
    public static void method3117(int arg0) {
        field7780 = null;
        field7786 = null;
        field7784 = null;
        field7779 = null;
        field7785 = null;
        if (arg0 < -88) {
            field7783 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([B)V", line = 22)
    public class527(byte[] arg0) {
        this.field7782 = arg0;
    }
}
