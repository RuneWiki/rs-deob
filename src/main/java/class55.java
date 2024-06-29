import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class55 {

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "Ljn;")
    private class507 field633 = new class507();

    @OriginalMember(owner = "client!aw", name = "l", descriptor = "Lso;")
    private class330 field642 = new class330();

    @OriginalMember(owner = "client!aw", name = "m", descriptor = "I")
    private int field643;

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "I")
    private int field641;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "Lqh;")
    private class50 field640;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "[I")
    public static int[] field632 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "Lao;")
    public static class191 field635;

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "[[F")
    public static float[][] field638;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "[Lu;")
    public static class54[] field637;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "Lao;")
    public static class191 field639;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    public static int field636;

    static {
        new class305("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field635 = new class191(89, 8);
        field638 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };
        field637 = new class54[0];
        field639 = new class191(11, -2);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(JLjn;B)V", line = 4)
    public final void method322(long arg0, class507 arg1, byte arg2) {
        if (this.field643 == 0) {
            class507 var5 = this.field642.method1934((byte) 86);
            var5.method2674(true);
            var5.method3022((byte) 54);
            if (this.field633 == var5) {
                class507 var6 = this.field642.method1934((byte) -93);
                var6.method2674(true);
                var6.method3022((byte) 54);
            }
        } else {
            this.field643--;
        }
        field631++;
        this.field640.method291(arg0, arg1, -29);
        if (arg2 >= -44) {
            this.method323(-81);
        }
        this.field642.method1938(true, arg1);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V", line = 33)
    public final void method323(int arg0) {
        this.field642.method1933(arg0 ^ 0xFFFFFFA7);
        field634++;
        if (arg0 != 89) {
            this.method322(-41L, null, (byte) -118);
        }
        this.field640.method293((byte) 101);
        this.field633 = new class507();
        this.field643 = this.field641;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(JI)Ljn;", line = 47)
    public final class507 method324(long arg0, int arg1) {
        field636++;
        class507 var4 = (class507) this.field640.method295(arg0, -103);
        if (var4 != null) {
            this.field642.method1938(true, var4);
        }
        int var5 = 20 / ((arg1 - 67) / 56);
        return var4;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V", line = 73)
    public static void method325(int arg0) {
        field637 = null;
        if (arg0 >= -58) {
            field635 = null;
        }
        field635 = null;
        field639 = null;
        field632 = null;
        field638 = null;
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(I)V", line = 141)
    public class55(int arg0) {
        this.field643 = arg0;
        this.field641 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field640 = new class50(var2);
    }
}
