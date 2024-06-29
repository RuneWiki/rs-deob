import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class166 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Ljd;")
    public static class92 field3259 = class202.method1325((byte) 90, "Lade)3)3)3");

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field3262 = 0;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Ljd;")
    public static class92 field3265 = class202.method1325((byte) 90, " loggt sich ein)3");

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field3269 = 0;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "[S")
    public static short[] field3270 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!re", name = "i", descriptor = "[I")
    public static int[] field3267 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field3273 = 0;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field3266 = 0;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "[I")
    public static int[] field3271;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[Ljd;)[Ljd;")
    public static final class92[] method1078(int arg0, class92[] arg1) {
        class92[] var2 = new class92[5];
        if (arg0 <= 12) {
            method1079(42);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class77.method529(-3, new class92[] { class142.method938(var3, false), class31.field703 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class77.method529(-3, new class92[] { var2[var3], arg1[var3] });
            }
        }
        field3268++;
        return var2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method1079(int arg0) {
        field3271 = null;
        field3265 = null;
        field3267 = null;
        int var1 = -105 % ((61 - arg0) / 60);
        field3270 = null;
        field3259 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLa;)La;")
    public static final class1 method1080(boolean arg0, class1 arg1) {
        class1 var2 = class209.method1359(arg1, -12051);
        if (arg0) {
            return null;
        }
        field3261++;
        if (var2 == null) {
            var2 = arg1.field30;
        }
        return var2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(JB)V")
    public static final void method1081(long arg0, byte arg1) {
        field3274++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < field3273; var3++) {
            if (class93.field1878[var3] == arg0) {
                class120.field2435++;
                field3273--;
                for (int var4 = var3; var4 < field3273; var4++) {
                    class27.field603[var4] = class27.field603[var4 + 1];
                    class148.field2936[var4] = class148.field2936[var4 + 1];
                    class34.field776[var4] = class34.field776[var4 + 1];
                    class93.field1878[var4] = class93.field1878[var4 + 1];
                    class116.field2346[var4] = class116.field2346[var4 + 1];
                }
                class136.field2732 = class186.field3516;
                class99.field2000.method405(68, 7);
                class99.field2000.method459(false, arg0);
                break;
            }
        }
        if (arg1 != 104) {
            field3262 = 101;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)V")
    public static final void method1082(int arg0, byte arg1) {
        field3260++;
        class116 var2 = (class116) class29.field637.method216(-80, (long) arg0);
        if (var2 != null) {
            int var3 = -117 % ((arg1 + 23) / 46);
            var2.method1370(-86);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(IB)[B")
    public static final synchronized byte[] method1083(int arg0, byte arg1) {
        if (arg1 != -19) {
            method1084(124, -125, 106);
        }
        field3272++;
        if (arg0 == 100 && class212.field4107 > 0) {
            byte[] var2 = class89.field1760[--class212.field4107];
            class89.field1760[class212.field4107] = null;
            return var2;
        } else if (arg0 == 5000 && class136.field2722 > 0) {
            byte[] var3 = class60.field1243[--class136.field2722];
            class60.field1243[class136.field2722] = null;
            return var3;
        } else if (arg0 == 30000 && class64.field1305 > 0) {
            byte[] var4 = class118.field2401[--class64.field1305];
            class118.field2401[class64.field1305] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)I")
    public static final int method1084(int arg0, int arg1, int arg2) {
        field3263++;
        long var3 = (long) ((arg0 << 16) + arg2);
        if (class208.field4000 != null && class208.field4000.field4079 == var3) {
            if (arg1 != 0) {
                method1082(-10, (byte) 37);
            }
            return class116.field2351.field1472 * 99 / (class116.field2351.field1493.length - class208.field4000.field3031) + 1;
        } else {
            return 0;
        }
    }
}
