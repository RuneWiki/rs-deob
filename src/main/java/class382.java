import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class382 extends class5 {

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public int field5821;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public int field5820;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Lba;")
    public static class268 field5822;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2399(byte arg0) {
        field5823++;
        for (class228 var1 = (class228) class11.field184.method3040(false); var1 != null; var1 = (class228) class11.field184.method3043((byte) -125)) {
            var1.method1527();
        }
        if (arg0 > -45) {
            method2400((byte) 54);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V", line = 26)
    public static void method2400(byte arg0) {
        if (arg0 == -27) {
            field5822 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(II)V", line = 40)
    public class382(int arg0, int arg1) {
        this.field5821 = arg1;
        this.field5820 = arg0;
    }
}
