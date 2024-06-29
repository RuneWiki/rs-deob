import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class45 {

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    private int field641;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "[Lpf;")
    public static class487[] field642 = new class487[2048];

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field643;

    static {
        new class157("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 4)
    public static final void method301(int arg0, int arg1, int arg2, Class arg3) {
        class532 var4 = class103.field1632[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class201 var5 = var4.field7828; var5 != null; var5 = var5.field2918) {
            class434 var6 = var5.field2915;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6290 == arg1 && var6.field6277 == arg2) {
                class387.method2300(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 35)
    public static void method302(int arg0) {
        if (arg0 == 2048) {
            field642 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "toString", descriptor = "()Ljava/lang/String;", line = 45)
    public final String toString() {
        field639++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)I", line = 53)
    public final int method303(int arg0) {
        if (arg0 == 2048) {
            field640++;
            return this.field641;
        } else {
            return -81;
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(II)V", line = 71)
    public class45(int arg0, int arg1) {
        this.field641 = arg0;
    }
}
