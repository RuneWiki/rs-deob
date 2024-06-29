import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class391 {

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
    public int field5840;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "Lrs;")
    private class166 field5838;

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "F")
    public static float field5839;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!ica", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field5838.method1314(this.field5840, 4994);
        field5843++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2441(int arg0, String arg1) {
        field5837++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class519.method3095(arg1, false);
        if (var2 == null || arg0 != 1) {
            return;
        }
        for (int var3 = 0; var3 < class468.field6818; var3++) {
            String var4 = class562.field7961[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class519.method3095(var4, false);
            if (var5 != null && var5.equals(var2)) {
                class468.field6818--;
                for (int var6 = var3; var6 < class468.field6818; var6++) {
                    class562.field7961[var6] = class562.field7961[var6 + 1];
                    class624.field8745[var6] = class624.field8745[var6 + 1];
                    class412.field6077[var6] = class412.field6077[var6 + 1];
                    class492.field7133[var6] = class492.field7133[var6 + 1];
                    class152.field2375[var6] = class152.field2375[var6 + 1];
                    class271.field4168[var6] = class271.field4168[var6 + 1];
                }
                class651.field9247++;
                class70.field1084 = class180.field3060;
                class540 var7 = class257.method1732(true, class411.field6063, class655.field9332);
                var7.field7707.method1926(class16.method101(-92, arg1), 65280);
                var7.field7707.method1931(122, arg1);
                class756.method4211(var7, 126);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lrs;II)V")
    public class391(class166 arg0, int arg1, int arg2) {
        this.field5840 = arg2;
        this.field5838 = arg0;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lpe;I)V")
    public static final void method2442(class109 arg0, int arg1) {
        field5842++;
        if ((arg0 instanceof class461)) {
            class461 var3 = (class461) arg0;
            if (var3.field6688 != null) {
                class559.method3247(var3, false, class145.field2251.field9470 != var3.field9470);
            }
        } else if (arg0 instanceof class573) {
            class573 var2 = (class573) arg0;
            class48.method483(class145.field2251.field9470 != var2.field9470, var2, 77);
        }
        if (arg1 > -25) {
            method2442(null, -91);
        }
    }
}
