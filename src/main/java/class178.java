import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class178 implements class237 {

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field2792 = -1;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field2800 = 0;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "[S")
    public static short[] field2801 = new short[] { 30, 6, 31, 29, 10, 44, 37, 57 };

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Lna;")
    public static class26 field2802 = class69.method505("<br>", (byte) -122);

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Lna;")
    public static class26 field2796 = class69.method505("hint_mapedge", (byte) -120);

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lna;")
    public static class26 field2795 = class69.method505("Gegenstand f-Ur Mitglieder", (byte) -128);

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lve;")
    public static class266 field2790;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILjava/lang/String;)V", line = 9)
    public static final void method1225(int arg0, String arg1) {
        field2791++;
        System.out.println("Error: " + class120.method830("%0a", "\n", 105, arg1));
        if (arg0 < 33) {
            field2795 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)Lbe;", line = 22)
    public static final class297 method1226(byte arg0, int arg1) {
        field2799++;
        int var2 = arg1 >> 16;
        if (arg0 < 108) {
            method1226((byte) 87, 19);
        }
        int var3 = arg1 & 0xFFFF;
        if (class86.field1416[var2] == null || class86.field1416[var2][var3] == null) {
            boolean var4 = class71.method509(var2, 104);
            if (!var4) {
                return null;
            }
        }
        return class86.field1416[var2][var3];
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 59)
    public static void method1227(byte arg0) {
        field2801 = null;
        field2790 = null;
        field2796 = null;
        field2802 = null;
        int var1 = 124 / ((arg0 - 28) / 41);
        field2795 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I[IIJ)Lna;", line = 72)
    public final class26 method1228(int arg0, int[] arg1, int arg2, long arg3) {
        field2798++;
        if (arg0 == 0) {
            class133 var7 = class264.method1858(arg1[0], true);
            return var7.method896((int) arg3, (byte) 120);
        } else if (arg0 == 1 || arg0 == 10) {
            class217 var6 = class45.method341((int) arg3, (byte) 82);
            return var6.field3422;
        } else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
            return class264.method1858(arg1[0], true).method896((int) arg3, (byte) -69);
        } else if (arg2 == 4936) {
            return null;
        } else {
            return (class26) null;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V", line = 116)
    public static final void method1229(byte arg0) {
        class28.method228(43, false);
        field2794++;
        System.gc();
        class193.method1302(25, 5);
        if (arg0 >= -80) {
            field2800 = -89;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIILth;IJ)Z", line = 129)
    public static final boolean method1230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class95.method715(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}
