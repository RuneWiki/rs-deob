import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class346 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "J")
    public long field4612;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lur;")
    private class377 field4611;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Lfo;")
    public static class361 field4613;

    static {
        new class305("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 3)
    public static void method2003(int arg0) {
        field4613 = null;
        if (arg0 != 12026) {
            method2003(42);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIILer;I)V", line = 20)
    public static final void method2004(int arg0, int arg1, int arg2, class70 arg3, int arg4) {
        field4614++;
        class325 var5 = (class325) class282.field3740.method970(12);
        if (arg4 != 1278907879) {
            return;
        }
        while (var5 != null) {
            if (var5.field4317 == arg2 && arg1 << 7 == var5.field4313 && (arg0 << 7) == var5.field4309 && var5.field4316.field834 == arg3.field834) {
                if (var5.field4314 != null) {
                    class465.field6928.method1114(var5.field4314);
                    var5.field4314 = null;
                }
                if (var5.field4324 != null) {
                    class465.field6928.method1114(var5.field4324);
                    var5.field4324 = null;
                }
                var5.method2674(true);
                return;
            }
            var5 = (class325) class282.field3740.method976((byte) -30);
        }
    }

    @OriginalMember(owner = "client!pi", name = "finalize", descriptor = "()V", line = 61)
    protected final void finalize() throws Throwable {
        this.field4611.method2258(this.field4612, -122);
        field4615++;
        super.finalize();
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lur;JI)V", line = 69)
    public class346(class377 arg0, long arg1, int arg2) {
        this.field4612 = arg1;
        this.field4611 = arg0;
    }
}
