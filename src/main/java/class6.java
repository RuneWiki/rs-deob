import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field45 = new Hashtable();

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public int field42;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "[Ltda;")
    public class637[] field43;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZBII)I", line = 6)
    public static final int method13(boolean arg0, byte arg1, int arg2, int arg3) {
        field41++;
        if (arg1 != -96) {
            method13(true, (byte) -78, 7, 22);
        }
        class369 var4 = class190.method1059(arg2, arg0, 6);
        if (var4 == null) {
            return 0;
        } else if (arg3 >= 0 && arg3 < var4.field5171.length) {
            return var4.field5171[arg3];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lhda;Lji;I)Ltda;", line = 26)
    private final class637 method14(class750 arg0, class611 arg1, int arg2) {
        field47++;
        if (class76.field925 == arg0) {
            return class696.method3928(arg1, -22);
        } else if (class208.field2506 == arg0) {
            return class468.method2635(arg1, -88);
        } else if (class50.field525 == arg0) {
            return class450.method2518(-2, arg1);
        } else if (class93.field1228 == arg0) {
            return class342.method2013(arg1, arg2 ^ 0xFFFFDDE6);
        } else {
            if (arg2 != -8829) {
                this.method16(87, null);
            }
            if (class268.field3558 == arg0) {
                return class60.method413(9342, arg1);
            } else if (class291.field3849 == arg0) {
                return class504.method2809(-36, arg1);
            } else if (class164.field2054 == arg0) {
                return class573.method3219((byte) 94, arg1);
            } else if (class659.field9196 == arg0) {
                return class752.method4187(arg1, true);
            } else if (class51.field535 == arg0) {
                return class761.method4236(arg1, 93);
            } else if (class360.field4762 == arg0) {
                return class341.method2009(1, arg1);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 84)
    public static void method15(int arg0) {
        if (arg0 != 0) {
            method15(-96);
        }
        field45 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILji;)V", line = 94)
    public final void method16(int arg0, class611 arg1) {
        field46++;
        this.field42 = arg1.method3385(-124);
        this.field44 = arg1.method3402((byte) 127);
        this.field43 = new class637[arg1.method3428((byte) 124)];
        class750[] var3 = class185.method1045(false);
        for (int var4 = arg0; var4 < this.field43.length; var4++) {
            this.field43[var4] = this.method14(var3[arg1.method3428((byte) -120)], arg1, -8829);
        }
    }
}
