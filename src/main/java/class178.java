import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class178 {

    @OriginalMember(owner = "client!e", name = "e", descriptor = "[I")
    private int[] field2910;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field2908 = 0;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2911 = "Allocated memory";

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)I")
    public final int method1301(int arg0, byte arg1) {
        if (arg1 != 4) {
            this.field2910 = null;
        }
        field2909++;
        int var3 = (this.field2910.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field2910[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2910[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(JI)V")
    public static final void method1302(long arg0, int arg1) {
        field2906++;
        if (class120.field1919 == 1 || class120.field1919 == 5) {
            class246.method1644(arg0, 0);
        } else if (class120.field1919 == 2) {
            class152.method1042(-14769);
        } else if (class120.field1919 == 4) {
            class282.method1892(arg0, -20229);
        } else {
            class39.method247(10);
        }
        if (!class286.field4537) {
            class249.field3948[0] = class239.field3825;
            class192.field3103[0] = 1008;
            class83.field1384 = 1;
            class269.field4343[0] = "";
            class177.field2904[0] = class92.field1481;
            if (class46.field775 != 0) {
                class236.field3792 = class43.field624;
                class177.field2905 = class265.field4257;
            } else if (class20.field257 == 0) {
                class236.field3792 = class269.field4344;
                class177.field2905 = class77.field1281;
            } else {
                class177.field2905 = class42.field609;
                class236.field3792 = class309.field4941;
            }
        }
        class171.method1245((long) class29.field360);
        int var3 = 79 % ((42 - arg1) / 55);
        if (class22.field284 != -1) {
            class177.method1297(class22.field284, (byte) 100);
        }
        for (int var4 = 0; var4 < class250.field3971; var4++) {
            if (class73.field1227[var4]) {
                class85.field1415[var4] = true;
            }
            class177.field2902[var4] = class73.field1227[var4];
            class73.field1227[var4] = false;
        }
        class109.field1737 = null;
        class159.field2536 = class29.field360;
        class276.field4441 = -1;
        class29.field353 = -1;
        class271.field4359 = null;
        if (class22.field284 != -1) {
            class250.field3971 = 0;
            class53.method365(-122);
        }
        class127.method899();
        class186.method1331((byte) -104);
        if (class286.field4537) {
            if (class65.field1078) {
                class146.method1021(3);
            } else {
                class105.method745(109);
            }
        } else if (class271.field4359 != null) {
            class77.method518(class293.field4693, (byte) 23, class271.field4359, class133.field2106);
        } else if (class276.field4441 != -1) {
            class77.method518(class276.field4441, (byte) 23, (class211) null, class29.field353);
        }
        int var5 = class286.field4537 ? -1 : class306.method2045(-18104);
        if (var5 == -1) {
            var5 = class68.field1121;
        }
        class211.method1466(var5, false);
        if (class20.field250 == 1) {
            class20.field250 = 2;
        }
        if (class244.field3883 == 1) {
            class244.field3883 = 2;
        }
        if (class158.field2505 == 3) {
            for (int var6 = 0; var6 < class250.field3971; var6++) {
                if (class177.field2902[var6]) {
                    class127.method881(class74.field1241[var6], class132.field2088[var6], class15.field164[var6], class190.field3075[var6], 16711935, 128);
                } else if (class85.field1415[var6]) {
                    class127.method881(class74.field1241[var6], class132.field2088[var6], class15.field164[var6], class190.field3075[var6], 16711680, 128);
                }
            }
        }
        class160.method1102(class239.field3829.field710, 3, class223.field3630, class239.field3829.field637, class56.field941);
        class223.field3630 = 0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1303(String arg0, int arg1) {
        field2913++;
        long var2 = 0L;
        int var4 = arg0.length();
        if (arg1 >= -127) {
            method1303((String) null, 81);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILbc;I)V")
    public static final void method1304(int arg0, class299 arg1, int arg2) {
        field2912++;
        class107 var3 = (class107) class234.field3763.method1059(0, (long) arg0);
        if (var3 == null) {
            class267.method1797((byte) -78, 0, (class131) null, class56.field941, arg1.field704[0], arg1.field709[0], arg1, (class158) null, arg0);
        } else {
            var3.method765(0);
        }
        if (arg2 != 37) {
            method1306((byte) 56, (byte) 37);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static void method1305(int arg0) {
        field2911 = null;
        if (arg0 < 95) {
            method1303((String) null, 117);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BB)V")
    public static final void method1306(byte arg0, byte arg1) {
        if (class151.field2369 == null) {
            class151.field2369 = new byte[4][104][104];
        }
        field2907++;
        if (arg0 < 21) {
            method1304(-103, (class299) null, 33);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class151.field2369[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "([I)V")
    public class178(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field2910 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field2910[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2910[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2910[var5 + var5] = arg0[var4];
            this.field2910[var5 + var5 + 1] = var4++;
        }
    }
}
