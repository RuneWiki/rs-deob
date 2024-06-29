import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public abstract class class91 extends class179 {

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "Lbl;")
    public class442 field1635;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "Lsk;")
    public static class423 field1634 = new class423("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "[I")
    public static int[] field1640 = new int[32];

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "Lft;")
    public static class4 field1638 = new class4();

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "[Lea;")
    public static class367[] field1641 = new class367[4];

    @OriginalMember(owner = "client!mr", name = "v", descriptor = "I")
    public static int field1642 = 0;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "Z")
    public boolean field1636;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I", line = 4)
    public int method678(byte arg0) {
        field1631++;
        if (arg0 != -96) {
            field1640 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZ)I", line = 16)
    public static final int method680(int arg0, boolean arg1) {
        field1633++;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else if (arg1) {
            return 3;
        } else {
            return 38;
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)I", line = 33)
    public final int method681(byte arg0) {
        if (arg0 == -120) {
            field1630++;
            return 1;
        } else {
            return -74;
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)Z", line = 45)
    public final boolean method682(byte arg0) {
        field1632++;
        if (arg0 != 46) {
            field1639 = 94;
        }
        return false;
    }

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)Z", line = 56)
    public final boolean method683(int arg0) {
        if (arg0 < 125) {
            this.field1635 = null;
        }
        field1637++;
        return this.field1636;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)Lcf;", line = 73)
    public static final class412 method684(int arg0, int arg1, int arg2) {
        class268 var3 = class321.field4830[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class412 var4 = var3.field4056;
            var3.field4056 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lbl;)V", line = 93)
    public class91(class442 arg0) {
        this.field1635 = arg0;
    }

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "(I)V", line = 101)
    public static void method689(int arg0) {
        if (arg0 != 24909) {
            method689(30);
        }
        field1638 = null;
        field1640 = null;
        field1641 = null;
        field1634 = null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLsg;ILsg;)V")
    public abstract void method677(byte arg0, class262 arg1, int arg2, class262 arg3);

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)V")
    public abstract void method679(int arg0);

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(III)V")
    public abstract void method685(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(B)Z")
    public abstract boolean method686(byte arg0);

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "(I)Z")
    public abstract boolean method687(int arg0);

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(IZ)V")
    public abstract void method688(int arg0, boolean arg1);
}
