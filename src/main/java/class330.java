import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class330 {

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "Lgd;")
    public static class206 field4380 = new class206("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "Z")
    public static boolean field4382 = false;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "Z")
    public static boolean field4384 = false;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "Lmc;")
    public static class78 field4381 = new class78(8, 6);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "Lr;")
    public static class110 field4383;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V", line = 6)
    public static void method1833(byte arg0) {
        field4383 = null;
        int var1 = 24 % ((5 - arg0) / 42);
        field4381 = null;
        field4380 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[IIII)V", line = 19)
    public static final void method1834(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 25084) {
            return;
        }
        field4376++;
        arg3--;
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (arg3 < var5) {
            int var7 = arg3 + 1;
            arg1[var7] = arg2;
            int var8 = var7 + 1;
            arg1[var8] = arg2;
            int var9 = var8 + 1;
            arg1[var9] = arg2;
            int var10 = var9 + 1;
            arg1[var10] = arg2;
            int var11 = var10 + 1;
            arg1[var11] = arg2;
            int var12 = var11 + 1;
            arg1[var12] = arg2;
            int var13 = var12 + 1;
            arg1[var13] = arg2;
            arg3 = var13 + 1;
            arg1[arg3] = arg2;
        }
        while (arg3 < var6) {
            arg3++;
            arg1[arg3] = arg2;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILnp;)Z", line = 47)
    public static final boolean method1835(int arg0, class313 arg1) {
        field4377++;
        if (arg0 != 8) {
            return true;
        } else if (arg1 == null) {
            return false;
        } else if (!arg1.field4149) {
            return false;
        } else if (!arg1.method1714(class55.field728, (byte) 127)) {
            return false;
        } else if (class323.field4310.method1528((long) arg1.field4146, 77) == null) {
            return class30.field399.method1528((long) arg1.field4139, 73) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIILr;)Lvi;", line = 78)
    public static final class347 method1836(int arg0, int arg1, int arg2, class110 arg3) {
        if (arg0 == 0) {
            field4378++;
            byte[] var4 = arg3.method702((byte) -72, arg1, arg2);
            return var4 == null ? null : new class347(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)I", line = 96)
    public static final int method1837(int arg0, int arg1) {
        if (class280.field3743 != null) {
            class280.field3743.method2310(-109);
            class280.field3743 = null;
        }
        field4379++;
        class413.field5653++;
        if (class413.field5653 > 4) {
            class413.field5653 = 0;
            class222.field2947 = 0;
            return arg1;
        }
        class222.field2947 = arg0;
        if (class291.field3906 == class135.field1966) {
            class135.field1966 = class17.field237;
        } else {
            class135.field1966 = class291.field3906;
        }
        return -1;
    }
}
