import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class122 {

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1778 = "glow2:";

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Loe;")
    public static class110 field1772 = new class110();

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public int field1774;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public int field1775;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public int field1776;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public int field1780;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[B")
    public byte[] field1771;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "[B")
    public byte[] field1779;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static void method831(byte arg0) {
        field1772 = null;
        field1778 = null;
        if (arg0 != 3) {
            method831((byte) 36);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIZ)V")
    public static final void method832(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1777++;
        class114.field1681 = (long) arg0;
        boolean var5 = false;
        int var6 = class24.method178(-16648);
        if (var6 > 0 == arg3 <= 0) {
            var5 = true;
        }
        if (arg3 == 3 || var6 == 3) {
            arg4 = true;
        }
        if (class83.field1270.startsWith("mac") && arg3 > 0) {
            arg4 = true;
        }
        if (arg4 && arg3 > 0) {
            var5 = true;
        }
        class173.method1141(arg3, var5, var6, arg2, arg4, arg1, true);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V")
    public static final void method833(boolean arg0, int arg1) {
        field1770++;
        byte[][] var2 = class263.field3961;
        int var3 = class255.field3870.length;
        if (arg1 != -4) {
            field1778 = null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class23.field303[var4] >> 8) * 64 - class113.field1615;
                int var7 = (class23.field303[var4] & 0xFF) * 64 - class95.field1445;
                class270.method1804(10288);
                class142.method944(class246.field3681, var5, var6, arg0, (byte) -88, var7);
            }
        }
    }
}
