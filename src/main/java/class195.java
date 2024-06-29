import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class195 {

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "J")
    public long field3190 = 0L;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "[S")
    public static short[] field3199 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lsb;")
    public static class124 field3196;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lci;")
    public class60 field3185;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lci;")
    public class60 field3187;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "[Lta;")
    public static class190[] field3194;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
    public static final int method1330(int arg0, int arg1) {
        field3188++;
        if (arg0 < 0) {
            return 0;
        }
        class194 var2 = (class194) class139.field2322.method1063((byte) -120, (long) arg0);
        if (arg1 != 4626) {
            method1334(-38, -42);
        }
        if (var2 == null) {
            return class295.method1979(arg0, arg1 ^ 0x1217).field1501;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field3179.length; var4++) {
            if (var2.field3179[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class295.method1979(arg0, 5).field1501 - var2.field3179.length);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lcc;")
    public static final class195 method1331(int arg0, int arg1, int arg2) {
        class129 var3 = class26.field455[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class195 var4 = var3.field2143;
            var3.field2143 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lsb;I)V")
    public static final void method1332(class124 arg0, int arg1) {
        field3184++;
        class34.field567 = class287.method1933((byte) -128, arg0, 0, class278.field4408);
        class3.field39 = class199.method1349(0, 0, class82.field1368, arg0);
        class277.field4402 = class199.method1349(0, 0, class169.field2762, arg0);
        class250.field3982 = class199.method1349(0, 0, class6.field72, arg0);
        class151.field2467 = class199.method1349(0, 0, class249.field3971, arg0);
        class223.field3555 = class199.method1349(0, 0, class169.field2761, arg0);
        class171.field2882 = class199.method1349(0, 0, class118.field1984, arg0);
        class157.field2558 = class236.method1565(0, arg0, -10, class89.field1417);
        class207.field3326 = class85.method673(class210.field3373, arg0, true, 0);
        class38.field656 = class85.method673(class259.field4130, arg0, true, 0);
        class253.field4024 = class293.method1964(arg0, class217.field3489, 0, 0);
        class101.field1550 = class293.method1964(arg0, class283.field4503, 0, 0);
        class198.field3231.method570(class101.field1550, (int[]) null);
        class106.field1617.method570(class101.field1550, (int[]) null);
        class23.field362.method570(class101.field1550, (int[]) null);
        class17 var2 = class8.method44(class116.field1940, arg0, (byte) -89, 0);
        var2.method130();
        class252.field4002 = var2;
        class17[] var3 = class287.method1933((byte) -127, arg0, 0, class35.field599);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method130();
        }
        class60.field1028 = var3;
        if (arg1 >= 0) {
            field3194 = null;
        }
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        for (int var9 = 0; var9 < class34.field567.length; var9++) {
            class34.field567[var9].method121(var5 + var6, var6 + var8, var6 + var7);
        }
        class49.field890 = class34.field567;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Z")
    public static final boolean method1333(int arg0, int arg1) {
        class148.field2428 = true;
        class167.field2757 = arg1 + 1 & 0xFFFF;
        field3198++;
        if (arg0 <= 54) {
            field3196 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)V")
    public static final void method1334(int arg0, int arg1) {
        if (arg0 <= 72) {
            field3196 = null;
        }
        class37.field630.method1163(arg1, false);
        field3183++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method1335(int arg0) {
        field3199 = null;
        field3196 = null;
        field3194 = null;
        if (arg0 != -15576) {
            method1332((class124) null, 83);
        }
    }
}
