import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class45 {

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "J")
    public static long field543;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "J")
    public long field545;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "Ljca;")
    public class45 field547;

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "Ljca;")
    public class45 field548;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "([Ljava/lang/Object;I[I)V", line = 5)
    public static final void method240(Object[] arg0, int arg1, int[] arg2) {
        field541++;
        if (arg1 != 497) {
            field543 = 11L;
        }
        class658.method3761(arg2.length - 1, 0, arg1 - 497, arg0, arg2);
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(Z)Z", line = 17)
    public final boolean method241(boolean arg0) {
        if (!arg0) {
            this.field547 = null;
        }
        field544++;
        return this.field547 != null;
    }

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "(Z)V", line = 32)
    public final void method242(boolean arg0) {
        field542++;
        if (this.field547 == null) {
            return;
        }
        this.field547.field548 = this.field548;
        if (!arg0) {
            this.field545 = 124L;
        }
        this.field548.field547 = this.field547;
        this.field548 = null;
        this.field547 = null;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lir;[Lqea;)V", line = 54)
    public static final void method243(class27 arg0, class392[] arg1) {
        if (class237.field3133) {
            int var2 = arg0.method170(arg1, (byte) 70);
            class377.field4985.method1111(var2, arg1);
        }
        if (class446.field5914 == class246.field3214) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class29) {
                var5 = ((class29) arg0).field423;
                var6 = ((class29) arg0).field419;
            } else {
                var5 = arg0.field398 >> class62.field762;
                var6 = arg0.field397 >> class62.field762;
            }
            class377.field4985.method1064(class454.field5981[0].method1609(arg0.field398, arg0.field397, 97), class230.method1423(var5, var6), class56.method330(var5, var6), class257.method1553(var5, var6));
        }
        class329 var7 = arg0.method165((byte) 110, class377.field4985);
        if (var7 == null) {
            return;
        }
        var7.field4417 = arg0;
        if (class115.field1477) {
            class204 var8 = class694.field9791;
            synchronized (class694.field9791) {
                boolean var9 = false;
                for (class329 var10 = (class329) class694.field9791.method1298((byte) 40); var10 != null; var10 = (class329) class694.field9791.method1305((byte) -124)) {
                    if (arg0.field383 >= var10.field4417.field383) {
                        class375.method2148(var7, var10, true);
                        var9 = true;
                        break;
                    }
                }
                if (!var9) {
                    class694.field9791.method1300(var7, -1);
                }
                return;
            }
        }
        boolean var11 = false;
        for (class329 var12 = (class329) class694.field9791.method1298((byte) 40); var12 != null; var12 = (class329) class694.field9791.method1305((byte) -109)) {
            if (arg0.field383 >= var12.field4417.field383) {
                class375.method2148(var7, var12, true);
                var11 = true;
                break;
            }
        }
        if (!var11) {
            class694.field9791.method1300(var7, -1);
        }
    }
}
