import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class632 extends class648 {

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lej;")
    public static class104 field9244 = new class104("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field9247 = 0;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Lcba;")
    public static class471 field9246 = new class471(0, 8);

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field9238;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field9240;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field9242;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field9243;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method3674(byte arg0) {
        field9246 = null;
        if (arg0 == -9) {
            field9244 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLmw;I)V")
    public final void method942(byte arg0, class418 arg1, int arg2) {
        ++field9238;
        if (arg0 != -30) {
            field9247 = 62;
        }
        super.field9395.method3358(32886, arg1);
        super.field9395.method3396((byte) 115, arg2);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public final void method941(int arg0) {
        super.field9395.method3411(false, false);
        ++field9240;
        if (arg0 != 1) {
            method3674((byte) -76);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
    public final void method945(int arg0, int arg1, int arg2) {
        int var4 = -30 % ((arg2 - 30) / 56);
        ++field9245;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lgi;)V")
    public class632(class583 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BZ)V")
    public final void method944(byte arg0, boolean arg1) {
        if (arg0 >= -111) {
            field9247 = -98;
        }
        ++field9239;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Z")
    public final boolean method946(int arg0) {
        if (arg0 < 122) {
            field9246 = null;
        }
        ++field9243;
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
    public static final void method3675(byte arg0) {
        class111.field1715.method1247(0);
        ++field9241;
        if (arg0 == 64) {
            class451.field6368.method2201(87);
            class526.field7393.method2201(-119);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
    public final void method947(int arg0, boolean arg1) {
        if (arg0 != 17729) {
            field9246 = null;
        }
        super.field9395.method3411(false, true);
        ++field9242;
    }
}
