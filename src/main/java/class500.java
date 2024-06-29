import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class500 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Luk;")
    public static class263 field6722 = new class263("WTI", "office", "_wti", 5);

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Lle;")
    public static class311 field6725 = new class311();

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method2817(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6723++;
        if (!class499.field6715 || !class557.field7336) {
            return false;
        } else if (class462.field6335 < arg4) {
            return false;
        } else if (class336.method2023((byte) -98, arg2, arg3, arg0)) {
            int var5 = arg3 << class140.field2224;
            int var6 = arg0 << class140.field2224;
            if (class703.method3958(class384.field5377, arg1, class507.field6771[arg2].method1742(arg3, arg4 - 4, arg0), var6, var5, 25, class384.field5377)) {
                class589.field7689++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method2818(byte arg0) {
        field6725 = null;
        if (arg0 == 60) {
            field6722 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lww;B)V")
    public static final void method2819(class733 arg0, byte arg1) {
        arg0.field10152 = null;
        field6726++;
        if (arg1 != 31) {
            field6722 = null;
        }
        int var2 = arg0.field10150.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field10150[var3].field5117 = false;
        }
        class687[] var4 = class690.field9596;
        synchronized (class690.field9596) {
            if (class690.field9596.length > var2 && class596.field7752[var2] < 200) {
                class690.field9596[var2].method3870(arg0, 0);
                int var10002 = class596.field7752[var2]++;
            }
        }
    }
}
