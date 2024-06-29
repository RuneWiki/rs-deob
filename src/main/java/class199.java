import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class199 extends class114 {

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "[B")
    public byte[] field3413;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field3407 = 0;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field3404 = 0;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "[I")
    public static int[] field3412 = new int[32768];

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "Z")
    public static boolean field3401;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "[[[B")
    public static byte[][][] field3411;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BJ)Lia;")
    public static final class257 method1334(byte arg0, long arg1) {
        field3402++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class229.field3843[(int) (var8 - (arg1 * 37L))];
            }
            if (arg0 >= -70) {
                field3407 = 78;
            }
            class257 var7 = new class257();
            var7.field4407 = var6;
            var7.field4447 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
    public static void method1335(byte arg0) {
        if (arg0 != -54) {
            field3411 = null;
        }
        field3412 = null;
        field3411 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)Z")
    public static final boolean method1336(byte arg0, int arg1) {
        if (arg0 <= 108) {
            field3407 = 81;
        }
        field3403++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)I")
    public static final int method1337(int arg0) {
        if (arg0 != 1) {
            method1340(81);
        }
        field3409++;
        return class54.field1161;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)V")
    public static final void method1338(long arg0, int arg1) {
        field3408++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class138.field2462 < 100 || class74.field1436 == 1) || class138.field2462 >= 200) {
            class197.method1317(-118, 0, class59.field1252, class17.field378);
            return;
        }
        class257 var3 = method1334((byte) -83, arg0).method1717(arg1 - 125);
        for (int var4 = 0; var4 < class138.field2462; var4++) {
            if (class243.field4216[var4] == arg0) {
                class197.method1317(-57, 0, class233.method1528(new class257[] { var3, class120.field2170 }, 0), class17.field378);
                return;
            }
        }
        for (int var5 = arg1; var5 < class185.field3215; var5++) {
            if (class175.field2981[var5] == arg0) {
                class197.method1317(-107, 0, class233.method1528(new class257[] { class138.field2465, var3, class158.field2777 }, 0), class17.field378);
                return;
            }
        }
        if (var3.method1706(class137.field2441.field3140, -1)) {
            class197.method1317(arg1 - 25, 0, class255.field4370, class17.field378);
            return;
        }
        class250.field4306++;
        class185.field3218[class138.field2462] = var3;
        class243.field4216[class138.field2462] = arg0;
        class80.field1568[class138.field2462] = 0;
        client.field1536[class138.field2462] = class17.field378;
        class55.field1182[class138.field2462] = 0;
        class91.field1744[class138.field2462] = false;
        class138.field2462++;
        class188.field3252 = class111.field2038;
        class205.field3524.method908(false, 159);
        class205.field3524.method1044(false, arg0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lqe;I)I")
    public static final int method1339(class197 arg0, int arg1) {
        class198 var2 = arg0.field3322;
        field3406++;
        if (var2.field3393 != null) {
            var2 = var2.method1324((byte) 125);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = -29 % (-arg1 / 36);
        int var4 = var2.field3370;
        if (arg0.field4170 == arg0.field4165) {
            var4 = var2.field3381;
        } else if (arg0.field4170 == arg0.field4135) {
            var4 = var2.field3354;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
    public static final void method1340(int arg0) {
        field3405++;
        class21.field435.method833(0);
        if (arg0 >= -69) {
            method1340(104);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)V")
    public static final void method1341(int arg0, int arg1) {
        if (arg0 == -15999) {
            class71.field1391.method831(arg1, -128);
            field3410++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "([B)V")
    public class199(byte[] arg0) {
        this.field3413 = arg0;
    }
}
