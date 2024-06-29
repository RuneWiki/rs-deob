import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class193 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3064 = null;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3065 = "Loaded wordpack";

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "[I")
    public static int[] field3070 = new int[] { 6, 0, 0, 0, 0, 0, 0, 14, 0, 7, 2, 0, 0, 15, 0, 0, -2, 10, 0, 0, 7, 20, 0, 0, 0, 0, 0, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 9, -2, 12, -1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 1, 0, 0, 10, 0, 5, 3, 0, 0, 2, 0, 2, 0, -1, 10, 0, 0, 0, 0, 0, -1, 12, 0, -2, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -1, 0, 6, 6, 0, 0, 0, 0, 0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 0, 8, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, -1, -1, 0, 6, -1, 0, 0, 0, 0, 0, 0, -1, 0, 4, 0, 0, 0, 0, 0, 1, 3, 0, 0, 6, 0, 0, 0, 0, 2, -2, 0, 12, 5, 0, 6, 28, 4, 0, -2, 0, 0, 11, 0, 0, -2, 0, 2, -1, 5, 6, 0, 0, 12, 0, 0, 0, 6, 0, 17, 1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 6, 0, 14, 0, -1, 0, -1, 4, 10, 0, 8, 8, 0, 7, -2, 2, 0, 0, 0, -2, 0, 0, 0, 0, 7, 8, -2, 0, 0, 3, 0, -2, 2, 0, 0, 6, 8, 0, 0, 8, 4, 0, -2, 0, 0, 15, 3, -1, 0, 0, 0, 8, 0, 0, 0 };

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Z")
    public static final boolean method1356(int arg0) {
        field3068++;
        class56 var1 = class205.field3214;
        synchronized (class205.field3214) {
            if (class92.field1382 == class293.field4699) {
                return false;
            } else {
                class140.field2006 = class129.field1858[class293.field4699];
                class296.field4729 = class257.field4194[class293.field4699];
                class293.field4699 = class293.field4699 + arg0 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static void method1357(byte arg0) {
        field3065 = null;
        if (arg0 != 57) {
            field3064 = null;
        }
        field3064 = null;
        field3070 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILvl;Lvl;Lvl;)V")
    public static final void method1358(int arg0, class73 arg1, class73 arg2, class73 arg3) {
        field3066++;
        class186.field2930 = arg3;
        if (arg0 == 0) {
            class159.field2381 = arg1;
            class240.field3852 = arg2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IJ)V")
    public static final void method1359(int arg0, long arg1) {
        if (class158.field2370 == 1 || class158.field2370 == 5) {
            class146.method995(arg1, (byte) -21);
        } else if (class158.field2370 == 2) {
            class176.method1253(-123);
        } else {
            class186.method1313(1);
        }
        field3067++;
        if (!class311.field4995) {
            class192.field3056[0] = 1001;
            class186.field2925[0] = class58.field855;
            class163.field2495[0] = class288.field4653;
            class43.field521[0] = "";
            if (class150.field2210 != 0) {
                class24.field305 = class190.field2957;
                class46.field566 = class270.field4397;
            } else if (class235.field3796 == 0) {
                class24.field305 = class50.field633;
                class46.field566 = class71.field1042;
            } else {
                class46.field566 = class223.field3493;
                class24.field305 = class171.field2686;
            }
            class173.field2721 = 1;
        }
        class65.method431((long) class311.field4996);
        if (arg0 < 69) {
            field3070 = null;
        }
        if (class238.field3824 != -1) {
            class15.method91(class238.field3824, 97);
        }
        for (int var3 = 0; var3 < class254.field4142; var3++) {
            if (class302.field4808[var3]) {
                class195.field3092[var3] = true;
            }
            class278.field4553[var3] = class302.field4808[var3];
            class302.field4808[var3] = false;
        }
        class63.field918 = -1;
        class104.field1521 = null;
        class175.field2758 = class311.field4996;
        class66.field976 = null;
        class167.field2576 = -1;
        if (class238.field3824 != -1) {
            class254.field4142 = 0;
            class159.method1094(0);
        }
        class151.method1038();
        class199.method1386((byte) 120);
        if (class311.field4995) {
            if (class298.field4758) {
                class176.method1252(false);
            } else {
                class61.method390(1);
            }
        } else if (class66.field976 != null) {
            class249.method1772(12445, class66.field976, class205.field3216, class293.field4708);
        } else if (class63.field918 != -1) {
            class249.method1772(12445, (class231) null, class63.field918, class167.field2576);
        }
        int var4 = class311.field4995 ? -1 : class35.method186((byte) 43);
        if (var4 == -1) {
            var4 = class119.field1713;
        }
        class32.method164(26, var4);
        if (class184.field2895 == 1) {
            class184.field2895 = 2;
        }
        if (class266.field4321 == 1) {
            class266.field4321 = 2;
        }
        if (class164.field2544 == 3) {
            for (int var5 = 0; var5 < class254.field4142; var5++) {
                if (class278.field4553[var5]) {
                    class151.method1033(class28.field342[var5], class52.field735[var5], class113.field1652[var5], class16.field227[var5], 16711935, 128);
                } else if (class195.field3092[var5]) {
                    class151.method1033(class28.field342[var5], class52.field735[var5], class113.field1652[var5], class16.field227[var5], 16711680, 128);
                }
            }
        }
        class108.method726(-128, class135.field1949, class148.field2204, class214.field3347.field3920, class214.field3347.field3915);
        class135.field1949 = 0;
    }
}
