import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class173 extends class366 {

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "Z")
    public boolean field2433 = true;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public int field2428 = 12800;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public int field2437 = -1;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public int field2434 = -1;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public int field2436 = 0;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public int field2444 = 0;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public int field2443 = 12800;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "Ljava/lang/String;")
    public String field2432;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public int field2435;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "Ljava/lang/String;")
    public String field2438;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "Lkn;")
    public class442 field2440;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "Lub;")
    public static class15 field2446 = new class15(64);

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2449 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "Ltj;")
    public static class108 field2448;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B[IIII)Z")
    public final boolean method1229(byte arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field2445++;
        if (arg0 <= 34) {
            field2446 = null;
        }
        for (class260 var6 = (class260) this.field2440.method2752(-78); var6 != null; var6 = (class260) this.field2440.method2754(-1)) {
            if (var6.method1797(arg4, arg3, -126, arg2)) {
                var6.method1796(arg2, 2, arg1, arg4);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[IIB)Z")
    public final boolean method1230(int arg0, int[] arg1, int arg2, byte arg3) {
        field2430++;
        for (class260 var5 = (class260) this.field2440.method2752(-107); var5 != null; var5 = (class260) this.field2440.method2754(-1)) {
            if (var5.method1795(1, arg0, arg2)) {
                var5.method1798(arg1, arg2, arg0, (byte) 92);
                return true;
            }
        }
        return arg3 <= 19;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIB)Z")
    public final boolean method1231(int arg0, int arg1, byte arg2) {
        field2429++;
        for (class260 var4 = (class260) this.field2440.method2752(-49); var4 != null; var4 = (class260) this.field2440.method2754(-1)) {
            if (var4.method1799((byte) -106, arg1, arg0)) {
                return true;
            }
        }
        if (arg2 > -118) {
            this.method1234((byte) -14);
        }
        return false;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1232(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2431++;
        if ((class320.field4692[0][arg2][arg1] & 0x2) != 0) {
            return true;
        } else if ((class320.field4692[arg0][arg2][arg1] & 0x10) != 0) {
            return false;
        } else if (arg4 == class434.method2713(arg1, arg2, arg0, (byte) -90)) {
            return true;
        } else {
            if (arg3 <= 112) {
                field2448 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IJ)V")
    public static final void method1233(int arg0, long arg1) {
        if (class385.field5449 != null) {
            if (class336.field4878 == 1 || class336.field4878 == 5) {
                class321.method2130(arg1, (byte) -50);
            } else if (class336.field4878 == 4) {
                class56.method366(arg1, (byte) -102);
            }
        }
        field2447++;
        class109.method663((byte) -53, class59.field786, (long) class34.field434);
        if (class265.field3898 != -1) {
            class178.method1283(3215, class265.field3898);
        }
        if (arg0 > -126) {
            method1233(-59, -49L);
        }
        for (int var3 = 0; var3 < class10.field129; var3++) {
            if (class353.field5126[var3]) {
                class336.field4875[var3] = true;
            }
            class396.field5576[var3] = class353.field5126[var3];
            class353.field5126[var3] = false;
        }
        class370.field5268 = class34.field434;
        if (class59.field786.method864()) {
            class311.field4515 = true;
        }
        if (class265.field3898 != -1) {
            class10.field129 = 0;
            class154.method1138((byte) 107);
        }
        class59.field786.method931();
        class261.method1803((byte) -68, class59.field786);
        int var4 = class222.method1558(-88);
        if (var4 == -1) {
            var4 = class2.field14;
        }
        class63.method404(var4, -115);
        class413.method2611(class158.field2302, -44, class239.field3529, class181.field2555.field4466, class181.field2555.field4463);
        class239.field3529 = 0;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
    public final void method1234(byte arg0) {
        this.field2443 = 12800;
        this.field2436 = 0;
        this.field2428 = 12800;
        field2439++;
        this.field2444 = 0;
        class260 var2 = (class260) this.field2440.method2752(-62);
        if (arg0 > -81) {
            this.method1229((byte) 63, (int[]) null, -40, -6, -117);
        }
        while (var2 != null) {
            if (this.field2436 < var2.field3837) {
                this.field2436 = var2.field3837;
            }
            if (this.field2443 > var2.field3846) {
                this.field2443 = var2.field3846;
            }
            if (this.field2444 < var2.field3851) {
                this.field2444 = var2.field3851;
            }
            if (this.field2428 > var2.field3841) {
                this.field2428 = var2.field3841;
            }
            var2 = (class260) this.field2440.method2754(-1);
        }
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(B)V")
    public static void method1235(byte arg0) {
        field2446 = null;
        field2449 = null;
        if (arg0 < 0) {
            field2446 = null;
        }
        field2448 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[I)Z")
    public final boolean method1236(int arg0, int arg1, int arg2, int[] arg3) {
        field2442++;
        for (class260 var5 = (class260) this.field2440.method2752(-83); var5 != null; var5 = (class260) this.field2440.method2754(-1)) {
            if (var5.method1799((byte) -106, arg2, arg1)) {
                var5.method1796(arg2, 2, arg3, arg1);
                return true;
            }
        }
        return arg0 != 5173;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class173(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field2433 = arg5;
        this.field2432 = arg1;
        this.field2441 = arg3;
        this.field2434 = arg4;
        this.field2437 = arg6;
        this.field2435 = arg0;
        this.field2438 = arg2;
        if (this.field2437 == 255) {
            this.field2437 = 0;
        }
        this.field2440 = new class442();
    }

    static {
        new class349("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
    }
}
