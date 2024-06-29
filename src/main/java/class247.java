import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class247 {

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "Lsw;")
    private class641 field3169 = new class641(64);

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "Lsw;")
    public class641 field3171 = new class641(30);

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "Ldn;")
    public class438 field3165;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "Ldn;")
    private class438 field3163;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!nba", name = "l", descriptor = "I")
    public int field3172;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "J")
    public static long field3170;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
    public final void method1389(int arg0) {
        if (arg0 != 30) {
            return;
        }
        field3161++;
        class641 var2 = this.field3169;
        synchronized (this.field3169) {
            this.field3169.method3687(1402);
        }
        class641 var3 = this.field3171;
        synchronized (this.field3171) {
            this.field3171.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(BI)V")
    public final void method1390(byte arg0, int arg1) {
        field3168++;
        class641 var3 = this.field3169;
        synchronized (this.field3169) {
            this.field3169.method3686((byte) 53, arg1);
            if (arg0 >= -99) {
                this.method1389(123);
            }
        }
        class641 var4 = this.field3171;
        synchronized (this.field3171) {
            this.field3171.method3686((byte) 53, arg1);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
    public final void method1391(byte arg0) {
        field3164++;
        class641 var2 = this.field3169;
        synchronized (this.field3169) {
            if (arg0 >= -38) {
                this.method1392(true, -86);
            }
            this.field3169.method3694(0);
        }
        class641 var3 = this.field3171;
        synchronized (this.field3171) {
            this.field3171.method3694(0);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZI)V")
    public final void method1392(boolean arg0, int arg1) {
        this.field3172 = arg1;
        field3166++;
        class641 var3 = this.field3171;
        synchronized (this.field3171) {
            this.field3171.method3687(1402);
        }
        if (!arg0) {
            this.method1391((byte) 5);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Lep;")
    public final class356 method1393(int arg0, int arg1) {
        field3167++;
        class641 var3 = this.field3169;
        class356 var4;
        synchronized (this.field3169) {
            var4 = (class356) this.field3169.method3682(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field3163;
        byte[] var6;
        synchronized (this.field3163) {
            var6 = this.field3163.method2558(arg0 + 36, class54.method305(84, arg1), class529.method3016(arg1, 1677232392));
            if (arg0 != 64) {
                this.field3163 = null;
            }
        }
        class356 var7 = new class356();
        var7.field4659 = arg1;
        var7.field4669 = this;
        if (var6 != null) {
            var7.method2010(new class374(var6), 0);
        }
        class641 var8 = this.field3169;
        synchronized (this.field3169) {
            this.field3169.method3684(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lre;ILdn;Ldn;)V")
    public class247(class515 arg0, int arg1, class438 arg2, class438 arg3) {
        this.field3165 = arg3;
        this.field3163 = arg2;
        int var5 = this.field3163.method2565((byte) -113) - 1;
        this.field3163.method2554(var5, 127);
    }

    static {
        new class180("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }
}
