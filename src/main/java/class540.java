import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class class540 {

    @OriginalMember(owner = "client!of", name = "d", descriptor = "[I")
    public static int[] field7232 = new int[] { 25000, 2000 };

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Z")
    public static boolean field7234 = false;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "[I")
    public static int[] field7233 = new int[2];

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[[I")
    public static int[][] field7230;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2921(int arg0) {
        class475.field6026 = null;
        field7229++;
        class600.field8418 = null;
        class568.field7963 = null;
        class133.field1729 = null;
        class372.field4697 = null;
        class250.field3072 = null;
        if (arg0 > -35) {
            return;
        }
        class104.field1392 = null;
        class575.field8015 = null;
        class622.field8705 = null;
        class160.field2107 = null;
        class27.field400 = null;
        class49.field687 = null;
        class677.field9502 = null;
        class65.field889 = null;
        class528.field7139 = null;
        class128.field1606 = null;
        class462.field5888 = null;
        class291.field3621 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)Z", line = 39)
    public final boolean method2922(byte arg0) {
        field7231++;
        if (arg0 == 9) {
            return this.method945(-30249) || this.method943(2000) || this.method947(2000);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V", line = 65)
    public static void method2923(boolean arg0) {
        if (arg0) {
            field7230 = null;
            field7232 = null;
            field7233 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)I")
    public abstract int method941(int arg0);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)Z")
    public abstract boolean method943(int arg0);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)Lew;")
    public abstract class368 method942(boolean arg0);

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)I")
    public abstract int method944(int arg0);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
    public abstract void method950(byte arg0);

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(I)Z")
    public abstract boolean method947(int arg0);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(Z)V")
    public abstract void method949(boolean arg0);

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(I)Z")
    public abstract boolean method945(int arg0);
}
