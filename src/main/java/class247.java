import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class247 extends class61 {

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "J")
    public long field4383;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Lv;")
    public static class147 field4381 = new class147(30);

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "Leb;")
    public static class230 field4393 = class68.method589(0, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "B")
    public static byte field4389;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "Lkk;")
    public static class223 field4390;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "[[I")
    public static int[][] field4392;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILkk;)Lge;")
    public static final class69 method1720(int arg0, int arg1, int arg2, class223 arg3) {
        if (arg0 >= -108) {
            return null;
        } else {
            field4391++;
            return class205.method1440(arg2, arg1, 2, arg3) ? class225.method1556(0) : null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILrc;III)V")
    public static final void method1721(int arg0, int arg1, class66 arg2, int arg3, int arg4, int arg5) {
        field4388++;
        if (arg2.field1255 == -1 && arg2.field1242 == null) {
            return;
        }
        int var6 = 0;
        if (arg4 > arg2.field1257) {
            var6 += arg4 - arg2.field1257;
        } else if (arg4 < arg2.field1233) {
            var6 += arg2.field1233 - arg4;
        }
        if (arg5 > arg2.field1237) {
            var6 += arg5 - arg2.field1237;
        } else if (arg2.field1231 > arg5) {
            var6 += arg2.field1231 - arg5;
        }
        if (arg2.field1258 == 0 || arg2.field1258 < var6 - 64 || class231.field4020 == 0 || arg2.field1259 != arg1) {
            if (arg2.field1235 != null) {
                class117.field2096.method1682(arg2.field1235);
                arg2.field1235 = null;
            }
            if (arg2.field1250 != null) {
                class117.field2096.method1682(arg2.field1250);
                arg2.field1250 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg2.field1258 - var6) * class231.field4020 / arg2.field1258;
        if (arg3 != 100) {
            return;
        }
        if (arg2.field1235 != null) {
            arg2.field1235.method571(var7);
        } else if (arg2.field1255 >= 0) {
            class137 var8 = class137.method1056(class40.field733, arg2.field1255, 0);
            if (var8 != null) {
                class148 var9 = var8.method1059().method1130(class189.field3323);
                class64 var10 = class64.method537(var9, 100, var7);
                var10.method535(-1);
                class117.field2096.method1676(var10);
                arg2.field1235 = var10;
            }
        }
        if (arg2.field1250 != null) {
            arg2.field1250.method571(var7);
            if (arg2.field1250.method523((byte) -127)) {
                return;
            }
            arg2.field1250 = null;
        } else if (arg2.field1242 != null && (arg2.field1251 -= arg0) <= 0) {
            int var11 = (int) (Math.random() * (double) arg2.field1242.length);
            class137 var12 = class137.method1056(class40.field733, arg2.field1242[var11], 0);
            if (var12 != null) {
                class148 var13 = var12.method1059().method1130(class189.field3323);
                class64 var14 = class64.method537(var13, 100, var7);
                var14.method535(0);
                class117.field2096.method1676(var14);
                arg2.field1250 = var14;
                arg2.field1251 = (int) ((double) (arg2.field1249 - arg2.field1253) * Math.random()) + arg2.field1253;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(B)Lmf;")
    public static final class10 method1722(byte arg0) {
        field4384++;
        if (arg0 < 74) {
            field4393 = null;
        }
        byte[] var1 = class215.field3725[0];
        int var2 = class7.field124[0] * class273.field4806[0];
        class10 var6;
        if (class271.field4794[0]) {
            byte[] var3 = class254.field4527[0];
            int[] var4 = new int[var2];
            for (int var5 = 0; var5 < var2; var5++) {
                var4[var5] = class177.method1290(class263.field4676[class189.method1350(255, var1[var5])], class189.method1350(var3[var5] << 24, -16777216));
            }
            var6 = new class211(class47.field839, class15.field346, class96.field1735[0], class113.field2034[0], class7.field124[0], class273.field4806[0], var4);
        } else {
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class263.field4676[class189.method1350(255, var1[var8])];
            }
            var6 = new class10(class47.field839, class15.field346, class96.field1735[0], class113.field2034[0], class7.field124[0], class273.field4806[0], var7);
        }
        class78.method650(true);
        return var6;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(II)Leb;")
    public static final class230 method1723(int arg0, int arg1) {
        field4387++;
        if (arg1 < 100000) {
            return class173.method1267((byte) 59, new class230[] { class125.field2193, class37.method340(arg1, (byte) -26), class15.field355 });
        } else if (arg0 == -11076) {
            return arg1 < 10000000 ? class173.method1267((byte) 59, new class230[] { class60.field1153, class37.method340(arg1 / 1000, (byte) -26), class252.field4515, class15.field355 }) : class173.method1267((byte) 59, new class230[] { class131.field2350, class37.method340(arg1 / 1000000, (byte) -26), class55.field1006, class15.field355 });
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)Z")
    public static final boolean method1724(boolean arg0) {
        field4386++;
        try {
            if (arg0) {
                return true;
            }
            if (class173.field3058 == 2) {
                if (class65.field1228 == null) {
                    class65.field1228 = class63.method529(class141.field2533, class144.field2587, class61.field1179);
                    if (class65.field1228 == null) {
                        return false;
                    }
                }
                if (class135.field2436 == null) {
                    class135.field2436 = new class82(class49.field866, class55.field968);
                }
                if (class210.field3663.method458(class215.field3723, class135.field2436, 22050, class65.field1228, -76)) {
                    class210.field3663.method465((byte) -87);
                    class210.field3663.method451(-716317374, class168.field2975);
                    class210.field3663.method432(class210.field3666, class65.field1228, 2097152);
                    class135.field2436 = null;
                    class65.field1228 = null;
                    class173.field3058 = 0;
                    class141.field2533 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class210.field3663.method462(-14333);
            class135.field2436 = null;
            class65.field1228 = null;
            class141.field2533 = null;
            class173.field3058 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)Lbl;")
    public static final class33 method1725(byte arg0, int arg1) {
        field4382++;
        class33 var2 = (class33) class183.field3208.method1125((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        if (arg0 >= -79) {
            method1725((byte) -98, 52);
        }
        byte[] var3 = class30.field548.method1546(arg1, (byte) -100, 3);
        class33 var4 = new class33();
        if (var3 != null) {
            var4.method302(new class14(var3), (byte) 98);
        }
        class183.field3208.method1129((long) arg1, true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class247() {
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public static void method1726(int arg0) {
        if (arg0 != -100001) {
            field4393 = null;
        }
        field4390 = null;
        field4392 = null;
        field4393 = null;
        field4381 = null;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(J)V")
    public class247(long arg0) {
        this.field4383 = arg0;
    }
}
