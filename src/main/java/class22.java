import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class22 extends class137 {

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Ljava/lang/String;")
    public static String field409 = "Unable to find ";

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "Ljava/lang/String;")
    public static String field419 = "Loaded fonts";

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "[S")
    public static short[] field425 = new short[256];

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    public static int field424 = -1;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Lgi;")
    public static class164 field414;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZJ)V")
    public static final void method173(boolean arg0, long arg1) {
        if (class231.field3613 == 1 || class231.field3613 == 5) {
            class65.method428(arg1, false);
        } else if (class231.field3613 == 2) {
            class166.method1185(124);
        } else {
            class281.method1916((byte) -76);
        }
        field417++;
        if (!class41.field633) {
            class188.field3083[0] = class62.field908;
            class275.field4502[0] = class184.field3061;
            class291.field4776 = 1;
            class26.field478[0] = 1004;
            class226.field3550[0] = "";
            if (class269.field4346 != 0) {
                class148.field2368 = class121.field1918;
                class33.field539 = class210.field3341;
            } else if (class295.field4805 == 0) {
                class33.field539 = class287.field4640;
                class148.field2368 = class55.field797;
            } else {
                class33.field539 = class295.field4806;
                class148.field2368 = class16.field302;
            }
        }
        class181.method1276((long) class274.field4472);
        if (class68.field1089 != -1) {
            class155.method1048(-100, class68.field1089);
        }
        for (int var3 = 0; var3 < class128.field2054; var3++) {
            if (class259.field4249[var3]) {
                class197.field3170[var3] = true;
            }
            class21.field403[var3] = class259.field4249[var3];
            class259.field4249[var3] = false;
        }
        class311.field5032 = class274.field4472;
        class162.field2649 = -1;
        class214.field3387 = null;
        class259.field4244 = -1;
        class90.field1410 = null;
        if (class68.field1089 != -1) {
            class128.field2054 = 0;
            class292.method2015(true);
        }
        class94.method671();
        class24.method198((byte) 109);
        if (class41.field633) {
            if (class248.field3903) {
                class93.method654((byte) -72);
            } else {
                class72.method500(122);
            }
        } else if (class214.field3387 != null) {
            class44.method293(class214.field3387, 114, class265.field4317, class179.field2967);
        } else if (class259.field4244 != -1) {
            class44.method293((class248) null, 79, class259.field4244, class162.field2649);
        }
        int var4 = class41.field633 ? -1 : class197.method1364(-125);
        if (var4 == -1) {
            var4 = class274.field4428;
        }
        class108.method764(var4, (byte) -128);
        if (class123.field1959 == 1) {
            class123.field1959 = 2;
        }
        if (class285.field4620 == 1) {
            class285.field4620 = 2;
        }
        if (class306.field4975 == 3) {
            for (int var5 = 0; var5 < class128.field2054; var5++) {
                if (class21.field403[var5]) {
                    class94.method668(class270.field4353[var5], class248.field4071[var5], class169.field2779[var5], class165.field2732[var5], 16711935, 128);
                } else if (class197.field3170[var5]) {
                    class94.method668(class270.field4353[var5], class248.field4071[var5], class169.field2779[var5], class165.field2732[var5], 16711680, 128);
                }
            }
        }
        class263.method1771(class214.field3389, 3, class217.field3408.field994, class217.field3408.field929, class61.field883);
        class61.field883 = 0;
        if (!arg0) {
            field424 = -8;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)Z")
    public final boolean method174(byte arg0) {
        int var2 = 103 % ((75 - arg0) / 46);
        field415++;
        return (this.field427 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)Z")
    public final boolean method175(int arg0) {
        int var2 = 112 % ((-arg0 - 48) / 36);
        field418++;
        return (this.field427 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)I")
    public final int method176(int arg0) {
        field423++;
        if (arg0 != 2) {
            field424 = -76;
        }
        return class291.method2008(this.field427, true);
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)Z")
    public final boolean method177(byte arg0) {
        field412++;
        if (arg0 < 10) {
            field419 = null;
        }
        return (this.field427 & 0x69B535) >> 22 != 0;
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)Z")
    public final boolean method178(int arg0) {
        field416++;
        if (arg0 != 2875) {
            field419 = null;
        }
        return ((this.field427 & 0x3BAC927A) >> 29) != 0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)Z")
    public final boolean method179(byte arg0, int arg1) {
        int var3 = 81 % ((-arg0 - 44) / 59);
        field426++;
        return (this.field427 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)I")
    public final int method180(int arg0) {
        field410++;
        return arg0 == -8028 ? this.field427 >> 18 & 0x7 : -78;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V")
    public static void method181(byte arg0) {
        field414 = null;
        field425 = null;
        field409 = null;
        if (arg0 != 28) {
            field425 = null;
        }
        field419 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method182(String arg0, byte arg1) {
        int var2 = 50 / ((arg1 - 10) / 60);
        System.out.println("Error: " + class182.method1287(arg0, "%0a", (byte) -54, "\n"));
        field421++;
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(B)Z")
    public final boolean method183(byte arg0) {
        if (arg0 < 98) {
            return false;
        } else {
            field420++;
            return (this.field427 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)Z")
    public final boolean method184(boolean arg0) {
        field422++;
        if (!arg0) {
            this.method175(-103);
        }
        return (this.field427 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(B)Z")
    public final boolean method185(byte arg0) {
        int var2 = -45 % ((arg0 + 48) / 42);
        field408++;
        return ((this.field427 & 0x223C18) >> 21) != 0;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(II)V")
    public class22(int arg0, int arg1) {
        this.field411 = arg1;
        this.field427 = arg0;
    }
}
