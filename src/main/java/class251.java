import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class251 {

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field3955 = 0;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3944 = "Loaded interfaces";

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3947 = "flash3:";

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3963 = "Loading textures - ";

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public int field3949;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    private int field3961;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public int field3962;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "Lac;")
    public static class241 field3958;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Z")
    public static boolean field3951;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "[[B")
    public static byte[][] field3946;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)Lun;", line = 8)
    public final class190 method1797(int arg0) {
        field3948++;
        class190 var2 = (class190) class34.field498.method1351((long) this.field3961, 63);
        if (var2 != null) {
            return var2;
        }
        class190 var3 = class187.method1378(arg0, -117, class277.field4277, this.field3961);
        if (var3 != null) {
            class34.field498.method1347(var3, (long) this.field3961, (byte) -101);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z[Ljava/lang/String;)[Ljava/lang/String;", line = 26)
    public static final String[] method1798(boolean arg0, String[] arg1) {
        field3943++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        if (arg0) {
            field3958 = (class241) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lug;Lug;ILug;Lug;)V", line = 57)
    public static final void method1799(class253 arg0, class253 arg1, int arg2, class253 arg3, class253 arg4) {
        field3954++;
        class158.field2445 = arg4;
        class57.field795 = arg1;
        class206.field3277 = arg0;
        class326.field5115 = arg3;
        class269.field4182 = new class136[class57.field795.method1810(0)][];
        if (arg2 != -3) {
            method1798(true, (String[]) null);
        }
        class34.field505 = new boolean[class57.field795.method1810(arg2 ^ 0xFFFFFFFD)];
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 74)
    public static final String method1800(String arg0, boolean arg1) {
        field3950++;
        int var2 = class91.method662(0, arg0);
        if (arg1) {
            method1800((String) null, false);
        }
        return var2 == -1 ? "" : class110.method783(119, " ", "<br>", class278.field4290.field4246[var2]);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILvl;I)V", line = 94)
    private final void method1801(int arg0, int arg1, class6 arg2, int arg3) {
        if (arg3 != -25110) {
            method1800((String) null, true);
        }
        field3953++;
        if (arg0 == 1) {
            this.field3961 = arg2.method39((byte) 76);
        } else if (arg0 == 2) {
            this.field3949 = arg2.method58(-288140008);
            this.field3962 = arg2.method58(arg3 - 288114898);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)Z", line = 120)
    public static final boolean method1802(int arg0, byte arg1) {
        if (arg1 > -103) {
            field3955 = 29;
        }
        field3957++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 131)
    public static void method1803(int arg0) {
        field3947 = null;
        field3958 = null;
        field3963 = null;
        field3944 = null;
        int var1 = 51 % ((arg0 - 34) / 46);
        field3946 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILvl;B)V", line = 160)
    public final void method1804(int arg0, class6 arg1, byte arg2) {
        int var4 = 57 / ((arg2 + 26) / 60);
        while (true) {
            int var5 = arg1.method58(-288140008);
            if (var5 == 0) {
                field3960++;
                return;
            }
            this.method1801(var5, arg0, arg1, -25110);
        }
    }
}
