import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class365 extends class443 {

    @OriginalMember(owner = "client!t", name = "v", descriptor = "Lbc;")
    public class103 field5396;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public static int field5399 = 0;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field5398 = 2;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1342(int arg0);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(B)Z")
    public abstract boolean method1343(byte arg0);

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
    public static final void method2412(int arg0) {
        field5397++;
        class8[] var1 = class280.field4114;
        synchronized (class280.field4114) {
            for (int var2 = arg0; var2 < class280.field4114.length; var2++) {
                class280.field4114[var2] = new class8();
                class430.field6246[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII)Lke;")
    public static final class295 method2413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5395++;
        long var7 = (long) arg5 * 32147369L ^ (long) arg4 * 475427L ^ (long) arg2 * 67481L ^ (long) arg6 * 97549L ^ (long) arg3 * 986053L ^ (long) arg0 * 76724863L;
        if (arg1 != 0) {
            return null;
        }
        class295 var9 = (class295) class240.field3359.method378((byte) 28, var7);
        if (var9 == null) {
            class295 var10 = class117.field1529.method516(arg2, arg6, arg4, arg3, arg5, arg0);
            class240.field3359.method367(var7, var10, true);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lbc;)V")
    public class365(class103 arg0) {
        this.field5396 = arg0;
    }
}
