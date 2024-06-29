import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public abstract class class165 extends class176 {

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "Lgi;")
    public class583 field2374;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field2376;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "[I")
    public static int[] field2378;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "Z")
    public static boolean field2380;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2373;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "Z")
    public boolean field2379;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Z")
    public final boolean method1059(int arg0) {
        field2372++;
        return arg0 == 1 ? this.field2379 : true;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
    public abstract void method696(int arg0);

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)I")
    public final int method1060(byte arg0) {
        if (arg0 < 90) {
            return 107;
        } else {
            field2375++;
            return 1;
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(III)V")
    public abstract void method702(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
    public static void method1061(boolean arg0) {
        field2376 = null;
        field2378 = null;
        if (!arg0) {
            method1061(false);
        }
        field2373 = null;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)Z")
    public abstract boolean method704(byte arg0);

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)I")
    public int method694(int arg0) {
        field2371++;
        return arg0 >= -124 ? -113 : 0;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
    public abstract void method698(int arg0, int arg1);

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)Z")
    public final boolean method1062(boolean arg0) {
        field2377++;
        if (!arg0) {
            this.method700(-124);
        }
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lgi;)V")
    public class165(class583 arg0) {
        this.field2374 = arg0;
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)Z")
    public abstract boolean method700(int arg0);

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lob;IILob;)V")
    public abstract void method693(class629 arg0, int arg1, int arg2, class629 arg3);

    static {
        new class104("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field2376 = new String[200];
        field2378 = new int[1];
        field2380 = false;
    }
}
