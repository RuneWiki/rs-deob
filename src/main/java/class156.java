import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class156 {

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    private int field3578 = 0;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "[Lv;")
    private class146[] field3576;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    private int field3566;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lec;")
    private static class32 field3560 = class73.method594("To play on this world move to a free area first", true);

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Lec;")
    public static class32 field3574 = class73.method594("Das ist eine Mitglieder)2Welt(Q", true);

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lec;")
    private static class32 field3568 = class73.method594("Could not complete login)3", true);

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lec;")
    public static class32 field3565 = field3560;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lec;")
    public static class32 field3563 = field3568;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "[[B")
    public static byte[][] field3577 = new byte[50][];

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Lec;")
    public static class32 field3575 = class73.method594("Okay", true);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "J")
    private long field3569;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Lv;")
    private class146 field3564;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Lv;")
    private class146 field3579;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Lhb;")
    public static class51 field3567;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "[Lhb;")
    public static class51[] field3558;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(JB)Lv;")
    public final class146 method1198(long arg0, byte arg1) {
        field3571++;
        if (arg1 != -106) {
            this.field3578 = 102;
        }
        this.field3569 = arg0;
        class146 var4 = this.field3576[(int) (arg0 & (long) (this.field3566 - 1))];
        for (this.field3564 = var4.field3322; this.field3564 != var4; this.field3564 = this.field3564.field3322) {
            if (this.field3564.field3326 == arg0) {
                class146 var5 = this.field3564;
                this.field3564 = this.field3564.field3322;
                return var5;
            }
        }
        this.field3564 = null;
        return null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static final void method1199(boolean arg0) {
        class158.field3614.method352(8);
        field3557++;
        int var1 = class158.field3614.method353(1, (byte) 69);
        if (!arg0 || var1 == 0) {
            return;
        }
        int var2 = class158.field3614.method353(2, (byte) 69);
        if (var2 == 0) {
            class62.field1419[class61.field1353++] = 2047;
        } else if (var2 == 1) {
            int var3 = class158.field3614.method353(3, (byte) 69);
            class20.field373.method902(var3, false, 0);
            int var4 = class158.field3614.method353(1, (byte) 69);
            if (var4 == 1) {
                class62.field1419[class61.field1353++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class158.field3614.method353(3, (byte) 69);
            class20.field373.method902(var5, true, 0);
            int var6 = class158.field3614.method353(3, (byte) 69);
            class20.field373.method902(var6, true, 0);
            int var7 = class158.field3614.method353(1, (byte) 69);
            if (var7 == 1) {
                class62.field1419[class61.field1353++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class158.field3614.method353(7, (byte) 69);
            int var9 = class158.field3614.method353(7, (byte) 69);
            int var10 = class158.field3614.method353(1, (byte) 69);
            if (var10 == 1) {
                class62.field1419[class61.field1353++] = 2047;
            }
            class43.field990 = class158.field3614.method353(2, (byte) 69);
            int var11 = class158.field3614.method353(1, (byte) 69);
            class20.field373.method904(var8, 19403, var11 == 1, var9);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static void method1200(byte arg0) {
        field3565 = null;
        field3575 = null;
        field3567 = null;
        field3577 = null;
        field3568 = null;
        field3574 = null;
        field3560 = null;
        field3563 = null;
        int var1 = -52 % ((60 - arg0) / 56);
        field3558 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lv;")
    public final class146 method1201(int arg0) {
        field3562++;
        int var2 = 70 / ((-arg0 - 22) / 58);
        if (this.field3578 > 0 && this.field3576[this.field3578 - 1] != this.field3579) {
            class146 var3 = this.field3579;
            this.field3579 = var3.field3322;
            return var3;
        }
        while (this.field3578 < this.field3566) {
            class146 var4 = this.field3576[this.field3578++].field3322;
            if (this.field3576[this.field3578 - 1] != var4) {
                this.field3579 = var4.field3322;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBII)Z")
    public static final boolean method1202(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg3 >> 14 & 0x7FFF;
        field3570++;
        int var5 = class159.field3659.method1123(class43.field990, arg2, arg0, arg3);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class53 var8 = class5.method22(47, var4);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var9 = var8.field1234;
                var10 = var8.field1223;
            } else {
                var9 = var8.field1223;
                var10 = var8.field1234;
            }
            int var11 = var8.field1193;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class94.method749(true, 0, class20.field373.field2738[0], -1, 0, var9, arg2, class20.field373.field2761[0], var11, arg0, var10, 2);
        } else {
            class94.method749(true, var7, class20.field373.field2738[0], -1, var6 + 1, 0, arg2, class20.field373.field2761[0], 0, arg0, 0, 2);
        }
        if (arg1 != 90) {
            field3567 = null;
        }
        class27.field499 = class9.field166;
        class154.field3547 = class66.field1590;
        class154.field3545 = 0;
        class135.field3149 = 2;
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZJLv;)V")
    public final void method1203(boolean arg0, long arg1, class146 arg2) {
        if (arg2.field3318 != null) {
            arg2.method1093(0);
        }
        class146 var5 = this.field3576[(int) ((long) (this.field3566 - 1) & arg1)];
        arg2.field3322 = var5;
        if (!arg0) {
            field3567 = null;
        }
        arg2.field3318 = var5.field3318;
        arg2.field3318.field3322 = arg2;
        field3561++;
        arg2.field3322.field3318 = arg2;
        arg2.field3326 = arg1;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)Lv;")
    public final class146 method1204(byte arg0) {
        field3559++;
        if (this.field3564 == null) {
            return null;
        }
        if (arg0 != -36) {
            method1200((byte) 5);
        }
        class146 var2 = this.field3576[(int) ((long) (this.field3566 - 1) & this.field3569)];
        while (this.field3564 != var2) {
            if (this.field3564.field3326 == this.field3569) {
                class146 var3 = this.field3564;
                this.field3564 = this.field3564.field3322;
                return var3;
            }
            this.field3564 = this.field3564.field3322;
        }
        this.field3564 = null;
        return null;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)Lv;")
    public final class146 method1205(byte arg0) {
        field3573++;
        this.field3578 = 0;
        if (arg0 <= 49) {
            field3574 = null;
        }
        return this.method1201(-116);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V")
    public class156(int arg0) {
        this.field3576 = new class146[arg0];
        this.field3566 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class146 var3 = this.field3576[var2] = new class146();
            var3.field3322 = var3;
            var3.field3318 = var3;
        }
    }
}
