import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class193 {

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field3321 = -1;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "J")
    public static long field3323 = 0L;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field3325 = 3;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field3316 = 0;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field3319 = 0;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "Lda;")
    public static class275 field3318 = class255.method1672(105, "M");

    @OriginalMember(owner = "client!al", name = "l", descriptor = "Lda;")
    public static class275 field3327 = class255.method1672(114, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "Lmg;")
    public static class219 field3320;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
    public static void method1265(byte arg0) {
        int var1 = 122 / ((arg0 - 64) / 57);
        field3327 = null;
        field3320 = null;
        field3318 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IILfd;)Lda;")
    public static final class275 method1266(int arg0, int arg1, class229 arg2) {
        field3326++;
        if (!class182.method1221(128, client.method635(arg2), arg0) && arg2.field3914 == null) {
            return null;
        } else if (arg2.field4024 == null || arg0 >= arg2.field4024.length || arg2.field4024[arg0] == null || arg2.field4024[arg0].method1845(false).method1838(3) == 0) {
            return class143.field2518 ? class197.method1291(new class275[] { class248.field4371, class250.method1644(arg0, (byte) -115) }, -30025) : null;
        } else {
            if (arg1 >= -124) {
                field3321 = -39;
            }
            return arg2.field4024[arg0];
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Z")
    public static final boolean method1267(int arg0) {
        field3317++;
        if (class175.field3025) {
            try {
                class157.field2765.method1816((byte) 10, class3.field24.field970);
                return true;
            } catch (Throwable var2) {
            }
        }
        int var1 = 104 % ((arg0 - 53) / 41);
        return false;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)I")
    public static final int method1268(int arg0, int arg1) {
        field3324++;
        if (arg0 < 0) {
            return 0;
        }
        class248 var2 = (class248) class118.field2125.method1871(0, (long) arg0);
        if (var2 == null) {
            return class61.method387(5, arg0).field169;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field4372.length; var4++) {
            if (var2.field4372[var4] == -1) {
                var3++;
            }
        }
        int var5 = var3 + class61.method387(5, arg0).field169 - var2.field4372.length;
        if (arg1 <= 80) {
            method1265((byte) -59);
        }
        return var5;
    }
}
