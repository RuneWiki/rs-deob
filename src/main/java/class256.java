import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class256 {

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "J")
    public long field4330;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "Lih;")
    private class214 field4331;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "Lvv;")
    public static class313 field4327 = new class313(13, 20);

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "Llo;")
    public static class306 field4329 = new class306("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!eq", name = "finalize", descriptor = "()V", line = 15)
    protected final void finalize() throws Throwable {
        field4328++;
        this.field4331.method1414(true, this.field4330);
        super.finalize();
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lih;J[Laj;)V", line = 24)
    public class256(class214 arg0, long arg1, class303[] arg2) {
        this.field4330 = arg1;
        this.field4331 = arg0;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V", line = 35)
    public static void method1731(int arg0) {
        field4327 = null;
        if (arg0 <= 95) {
            method1731(97);
        }
        field4329 = null;
    }
}
