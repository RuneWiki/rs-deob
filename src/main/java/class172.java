import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class172 {

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Ldb;")
    private class33 field3342 = new class33(256);

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Ldb;")
    private class33 field3350 = new class33(256);

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lnh;")
    private class133 field3332;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Lnh;")
    private class133 field3348;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Ljd;")
    public static class92 field3337 = class202.method1325((byte) 90, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Ljd;")
    public static class92 field3335 = class202.method1325((byte) 90, "Benutzername: ");

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Ljd;")
    public static class92 field3336 = class202.method1325((byte) 90, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3338 = 0;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3334 = 0;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "[Ljc;")
    public static class91[] field3347 = new class91[2048];

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Ljd;")
    public static class92 field3340 = class202.method1325((byte) 90, "(R");

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Ljd;")
    public static class92 field3346 = class202.method1325((byte) 90, "m");

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lsc;")
    public static class173 field3345;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1134(Component arg0, int arg1) {
        Method var2 = class169.field3298;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        field3339++;
        arg0.addKeyListener(class79.field1617);
        if (arg1 != 0) {
            field3345 = null;
        }
        arg0.addFocusListener(class79.field1617);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBI)V")
    public static final void method1135(int arg0, byte arg1, int arg2) {
        if (arg1 >= -87) {
            field3347 = null;
        }
        class205[] var3 = class135.field2711;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class205 var5 = var3[var4];
            if (var5 != null && var5.field3956 == 2) {
                class103.method707(-1, var5.field3954 * 2, (var5.field3944 - class115.field2343 << 7) + var5.field3948, (-class210.field4077 + var5.field3955 << 7) + var5.field3943);
                if (class185.field3498 > -1 && class158.field3150 % 20 < 10) {
                    class212.field4106[var5.field3951].method1097(arg0 + class185.field3498 - 12, arg2 - 28 + class53.field1109);
                }
            }
        }
        field3341++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[III)Lvf;")
    private final class203 method1136(int arg0, int[] arg1, int arg2, int arg3) {
        field3344++;
        int var5 = ((arg3 & 0xB0000FFF) << 4 | arg3 >>> 12) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class203 var9 = (class203) this.field3350.method216(-120, var7);
        if (arg0 > -69) {
            method1134(null, -27);
        }
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class24 var10 = (class24) this.field3342.method216(-99, var7);
            if (var10 == null) {
                var10 = class24.method149(this.field3348, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field3342.method210((byte) -53, var7, var10);
            }
            class203 var11 = var10.method157(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method1370(-70);
                this.field3350.method210((byte) -42, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[II)Lvf;")
    public final class203 method1137(int arg0, int[] arg1, int arg2) {
        field3331++;
        if (arg0 != 13557) {
            return null;
        } else if (this.field3332.method884((byte) -122) == 1) {
            return this.method1139(arg2, 0, arg1, (byte) -19);
        } else if (this.field3332.method886(-3, arg2) == 1) {
            return this.method1139(0, arg2, arg1, (byte) -19);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([III)Lvf;")
    public final class203 method1138(int[] arg0, int arg1, int arg2) {
        field3349++;
        if (this.field3348.method884((byte) -109) == 1) {
            return this.method1136(-123, arg0, arg2, 0);
        }
        if (arg1 != 21973) {
            this.method1136(29, null, -16, -116);
        }
        if (this.field3348.method886(11, arg2) != 1) {
            throw new RuntimeException();
        }
        return this.method1136(-96, arg0, 0, arg2);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[IB)Lvf;")
    private final class203 method1139(int arg0, int arg1, int[] arg2, byte arg3) {
        field3343++;
        int var5 = ((arg1 & 0x70000FFF) << 4 | arg1 >>> 12) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class203 var9 = (class203) this.field3350.method216(-128, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class23 var10 = class23.method144(this.field3332, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            if (arg3 != -19) {
                this.field3342 = null;
            }
            class203 var11 = var10.method146();
            this.field3350.method210((byte) -46, var7, var11);
            if (arg2 != null) {
                arg2[0] -= var11.field3926.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static void method1140(byte arg0) {
        field3335 = null;
        field3345 = null;
        field3337 = null;
        field3346 = null;
        field3340 = null;
        field3347 = null;
        if (arg0 >= 20) {
            field3336 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lh;IB)Ljd;")
    public static final class92 method1141(class70 arg0, int arg1, byte arg2) {
        field3333++;
        try {
            if (arg2 != -8) {
                return null;
            }
            class92 var3 = new class92();
            var3.field1838 = arg0.method430(true);
            if (arg1 < var3.field1838) {
                var3.field1838 = arg1;
            }
            var3.field1856 = new byte[var3.field1838];
            arg0.field1472 += class61.field1270.method1184(var3.field1856, (byte) -113, arg0.field1472, 0, var3.field1838, arg0.field1493);
            return var3;
        } catch (Exception var4) {
            return class88.field1735;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lnh;Lnh;)V")
    public class172(class133 arg0, class133 arg1) {
        this.field3332 = arg0;
        this.field3348 = arg1;
    }
}
