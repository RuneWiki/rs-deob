import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class232 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "Llb;")
    public static class211 field3582;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILlb;II)Lvd;", line = 4)
    public static final class134 method1645(int arg0, class211 arg1, int arg2, int arg3) {
        if (arg0 != 1) {
            method1645(-124, (class211) null, -76, 120);
        }
        field3581++;
        return class297.method2093(arg2, arg3, (byte) -49, arg1) ? class173.method1264(116) : null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 24)
    public static void method1646(int arg0) {
        field3582 = null;
        if (arg0 != 3) {
            method1648(-29, -101);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 34)
    public static final void method1647(byte arg0) {
        if (!class67.field982) {
            class27.field307[0] = class167.field2505;
            class67.field994[0] = class323.field5016;
            class326.field5068[0] = 1004;
            class271.field4097[0] = "";
            if (class278.field4265 != 0) {
                class199.field3151 = class273.field4138;
                class322.field5002 = class187.field2982;
            } else if (class292.field4593 == 0) {
                class199.field3151 = class295.field4646;
                class322.field5002 = class273.field4129;
            } else {
                class322.field5002 = class97.field1446;
                class199.field3151 = class38.field573;
            }
            class6.field62 = 1;
        }
        field3583++;
        if (class319.field4972 != -1) {
            class302.method2117(class319.field4972, (byte) 127);
        }
        for (int var1 = 0; var1 < class112.field1762; var1++) {
            if (class40.field597[var1]) {
                class238.field3621[var1] = true;
            }
            class98.field1450[var1] = class40.field597[var1];
            class40.field597[var1] = false;
        }
        class304.field4763 = null;
        class231.field3574 = -1;
        class210.field3299 = class312.field4852;
        class99.field1467 = -1;
        if (class36.field534) {
            class142.field2186 = true;
        }
        class73.field1047 = null;
        if (arg0 >= -76) {
            method1647((byte) -31);
        }
        if (class319.field4972 != -1) {
            class112.field1762 = 0;
            class35.method296((byte) 9);
        }
        if (class36.field534) {
            class194.method1405();
        } else {
            class168.method1235();
        }
        class305.method2126(true);
        if (class67.field982) {
            if (class285.field4395) {
                class209.method1487(119);
            } else {
                class100.method780(-1);
            }
        } else if (class304.field4763 != null) {
            class265.method1831(class93.field1344, false, class132.field2066, class304.field4763);
        } else if (class99.field1467 != -1) {
            class265.method1831(class231.field3574, false, class99.field1467, (class184) null);
        }
        int var2 = class67.field982 ? -1 : class153.method1123((byte) 119);
        if (var2 == -1) {
            var2 = class105.field1617;
        }
        class271.method1888(var2, (byte) -96);
        if (class180.field2703 == 1) {
            class180.field2703 = 2;
        }
        if (class238.field3625 == 1) {
            class238.field3625 = 2;
        }
        if (class301.field4718 == 3) {
            for (int var3 = 0; var3 < class112.field1762; var3++) {
                if (class98.field1450[var3]) {
                    if (class36.field534) {
                        class194.method1412(class154.field2331[var3], class304.field4765[var3], class245.field3687[var3], class266.field3990[var3], 16711935, 128);
                    } else {
                        class168.method1226(class154.field2331[var3], class304.field4765[var3], class245.field3687[var3], class266.field3990[var3], 16711935, 128);
                    }
                } else if (class238.field3621[var3]) {
                    if (class36.field534) {
                        class194.method1412(class154.field2331[var3], class304.field4765[var3], class245.field3687[var3], class266.field3990[var3], 16711680, 128);
                    } else {
                        class168.method1226(class154.field2331[var3], class304.field4765[var3], class245.field3687[var3], class266.field3990[var3], 16711680, 128);
                    }
                }
            }
        }
        class50.method458(class88.field1297, (byte) -113, class235.field3602.field4496, class235.field3602.field4507, class50.field775);
        class88.field1297 = 0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)I", line = 187)
    public static final int method1648(int arg0, int arg1) {
        if (arg0 != 30003) {
            field3582 = (class211) null;
        }
        field3579++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)V", line = 200)
    public static final void method1649(byte arg0, int arg1) {
        class39.field584 = new int[arg1];
        class31.field401 = new int[arg1];
        if (arg0 <= -79) {
            class105.field1609 = new int[arg1];
            field3580++;
            class100.field1496 = new int[arg1];
            class321.field4991 = new int[arg1];
        }
    }
}
