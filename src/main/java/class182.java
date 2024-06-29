import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class182 {

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lnj;")
    private class162 field2674 = new class162(128);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lmg;")
    private class101 field2675;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field2677 = -1;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lvu;")
    public final class223 method1165(int arg0, int arg1) {
        field2676++;
        class162 var3 = this.field2674;
        class223 var4;
        synchronized (this.field2674) {
            var4 = (class223) this.field2674.method1073((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2675.method727(class11.method53(3, arg0), class152.method1017((byte) -49, arg0), arg1 ^ 0x6CCD);
        class223 var6 = new class223();
        if (arg1 != 27894) {
            this.field2674 = null;
        }
        if (var5 != null) {
            var6.method1390((byte) 24, new class391(var5));
        }
        class162 var7 = this.field2674;
        synchronized (this.field2674) {
            this.field2674.method1072((long) arg0, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lal;ILmg;)V")
    public class182(class66 arg0, int arg1, class101 arg2) {
        this.field2675 = arg2;
        if (this.field2675 != null) {
            int var4 = this.field2675.method746(42) - 1;
            this.field2675.method753(var4, -69);
        }
    }

    static {
        new class466("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
    }
}
