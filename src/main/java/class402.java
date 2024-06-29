import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class402 extends class15 {

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field5821;

    @OriginalMember(owner = "client!cv", name = "u", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!cv", name = "v", descriptor = "Lho;")
    public static class103 field5823;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!cv", name = "w", descriptor = "I")
    public static int field5824;

    static {
        new class305("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        new class305("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field5822 = 0;
        field5823 = new class103(46, -1);
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(Z)V", line = 4)
    public final void method2482(boolean arg0) {
        this.field5821.method2739();
        if (arg0) {
            method2484(117);
        }
        field5820++;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IB)I", line = 20)
    public static final int method2483(int arg0, byte arg1) {
        field5824++;
        if (arg1 != -43) {
            method2485(null, (byte) 9, null);
        }
        return (arg0 & 0x3FB61) >> 11;
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(I)V", line = 40)
    public static void method2484(int arg0) {
        if (arg0 == 9771) {
            field5823 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(I)V", line = 49)
    public class402(int arg0) {
        this.field5821 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "([SB[Ljava/lang/String;)V", line = 63)
    public static final void method2485(short[] arg0, byte arg1, String[] arg2) {
        field5819++;
        if (arg1 < -56) {
            class63.method377(0, arg0, arg2.length - 1, 0, arg2);
        }
    }
}
