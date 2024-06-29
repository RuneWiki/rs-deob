import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class134 extends class212 {

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "Z")
    public static boolean field2343 = false;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    public static int field2337 = 4;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "[Lsg;")
    public static class33[] field2344 = new class33[50];

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "Lqe;")
    private static class168 field2339 = class66.method448("Continue", 74);

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "[I")
    public static int[] field2340 = new int[field2337];

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    public static int field2338 = 0;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "[[La;")
    public static class77[][] field2341 = new class77[field2337][500];

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "Lqe;")
    public static class168 field2351 = field2339;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!gh", name = "Z", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!gh", name = "ab", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "Lui;")
    private class236 field2348;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZLnh;I)V")
    private final void method900(boolean arg0, class112 arg1, int arg2) {
        if (!arg0) {
            return;
        }
        if (arg2 == 249) {
            int var4 = arg1.method758(true);
            if (this.field2348 == null) {
                int var5 = class98.method644((byte) 69, var4);
                this.field2348 = new class236(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method758(arg0) == 1;
                int var8 = arg1.method727(-27619);
                class190 var9;
                if (var7) {
                    var9 = new class253(arg1.method751((byte) -104));
                } else {
                    var9 = new class172(arg1.method769((byte) -86));
                }
                this.field2348.method1533((long) var8, -105, var9);
            }
        }
        field2353++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lnh;I)V")
    public final void method901(class112 arg0, int arg1) {
        field2349++;
        while (true) {
            int var3 = arg0.method758(true);
            if (var3 == 0) {
                if (arg1 <= 74) {
                    field2344 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method900(true, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
    public static final void method902(byte arg0) {
        if (arg0 <= 92) {
            field2351 = null;
        }
        field2346++;
        class131.field2310.method1497((byte) 77);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lqe;II)Lqe;")
    public final class168 method903(class168 arg0, int arg1, int arg2) {
        field2345++;
        if (this.field2348 == null) {
            return arg0;
        }
        class253 var4 = (class253) this.field2348.method1527((long) arg2, (byte) -124);
        if (var4 == null) {
            return arg0;
        } else if (arg1 < 52) {
            return null;
        } else {
            return var4.field4381;
        }
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)V")
    public static void method904(int arg0) {
        field2340 = null;
        field2344 = null;
        field2351 = null;
        field2339 = null;
        if (arg0 != -13152) {
            method905(null, -118, -44, 112);
        }
        field2341 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lhh;III)V")
    public static final void method905(class121 arg0, int arg1, int arg2, int arg3) {
        field2342++;
        if (arg0.field216 == arg2 && arg2 != -1) {
            class237 var4 = class213.method1370(-1, arg2);
            int var5 = var4.field4044;
            if (var5 == 1) {
                arg0.field168 = 0;
                arg0.field189 = 0;
                arg0.field174 = 0;
                arg0.field170 = arg1;
                class122.method830(class7.field85 == arg0, (byte) 106, arg0.field189, arg0.field190, arg0.field166, var4);
            }
            if (var5 == 2) {
                arg0.field168 = 0;
            }
        } else if (arg2 == -1 || arg0.field216 == -1 || class213.method1370(arg3 + 17430, arg2).field4043 >= class213.method1370(-1, arg0.field216).field4043) {
            arg0.field220 = arg0.field228;
            arg0.field168 = 0;
            arg0.field170 = arg1;
            arg0.field174 = 0;
            arg0.field189 = 0;
            arg0.field216 = arg2;
            if (arg0.field216 != -1) {
                class122.method830(class7.field85 == arg0, (byte) 114, arg0.field189, arg0.field190, arg0.field166, class213.method1370(-1, arg0.field216));
            }
        }
        if (arg3 != -17431) {
            method902((byte) 6);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Loe;III)[Lgd;")
    public static final class65[] method906(class256 arg0, int arg1, int arg2, int arg3) {
        field2352++;
        if (arg3 >= -39) {
            method905(null, -2, 102, -24);
        }
        return class9.method34(arg1, arg0, (byte) -16, arg2) ? class30.method199(600) : null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)I")
    public final int method907(int arg0, int arg1, int arg2) {
        field2347++;
        if (this.field2348 == null) {
            return arg0;
        } else {
            int var4 = -103 / ((arg1 + 12) / 56);
            class172 var5 = (class172) this.field2348.method1527((long) arg2, (byte) -81);
            return var5 == null ? arg0 : var5.field2991;
        }
    }
}
