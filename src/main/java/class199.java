import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class199 {

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Lr;")
    private class250 field3361 = new class250();

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    private int field3366;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    private int field3371;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Led;")
    private class49 field3355;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "J")
    public static long field3353 = 0L;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "Lmh;")
    public static class62 field3351 = class201.method1405(true, "<col=ff0000>");

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Lmh;")
    public static class62 field3354 = class201.method1405(true, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "Lmh;")
    public static class62 field3358 = class201.method1405(true, "http:)4)4");

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field3368 = 0;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field3367 = 0;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public static int field3370 = 0;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "[I")
    public static int[] field3362 = new int[100];

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILhi;)Lwg;", line = 6)
    public static final class24 method1388(int arg0, int arg1, class26 arg2) {
        if (arg0 == -27057) {
            field3357++;
            return class248.method1728(arg2, arg1, (byte) 90) ? class96.method778((byte) 118) : null;
        } else {
            return (class24) null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 20)
    public static void method1389(int arg0) {
        field3362 = null;
        field3358 = null;
        if (arg0 < 37) {
            field3368 = 67;
        }
        field3351 = null;
        field3354 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V", line = 34)
    public final void method1390(int arg0, int arg1) {
        field3360++;
        if (arg1 > -48) {
            field3354 = (class62) null;
        }
        if (class66.field995 == null) {
            return;
        }
        for (class106 var3 = (class106) this.field3361.method1742(255); var3 != null; var3 = (class106) this.field3361.method1739((byte) 122)) {
            if (var3.method15(3)) {
                if (var3.method16((byte) 118) == null) {
                    var3.method1444((byte) 89);
                    var3.method1421(-105);
                    this.field3366++;
                }
            } else if (((long) arg0) < (++var3.field3426)) {
                class106 var4 = class66.field995.method1197(-27322, var3);
                this.field3355.method309(var4, var3.field3499, 1);
                class1.method3(var4, (byte) 121, var3);
                var3.method1444((byte) 89);
                var3.method1421(-102);
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lwf;I)V", line = 83)
    public static final void method1391(class18 arg0, int arg1) {
        if (arg0.field177 != null) {
            arg0.field177.field4786 = 0;
        }
        field3365++;
        if (arg1 > -48) {
            method1394(-115, 30);
        }
        arg0.field178 = false;
        for (class18 var2 = arg0.method74(); var2 != null; var2 = arg0.method68()) {
            method1391(var2, -125);
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V", line = 108)
    public final void method1392(int arg0) {
        if (arg0 != 0) {
            field3370 = -68;
        }
        for (class106 var2 = (class106) this.field3361.method1742(arg0 ^ 0xFF); var2 != null; var2 = (class106) this.field3361.method1739((byte) 82)) {
            if (var2.method15(3)) {
                var2.method1444((byte) 89);
                var2.method1421(-85);
                this.field3366++;
            }
        }
        field3356++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(JI)V", line = 136)
    public final void method1393(long arg0, int arg1) {
        field3369++;
        class106 var4 = (class106) this.field3355.method311((byte) 114, arg0);
        if (arg1 < 113) {
            method1391((class18) null, 119);
        }
        if (var4 != null) {
            var4.method1444((byte) 89);
            var4.method1421(39);
            this.field3366++;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)[B", line = 163)
    public static final byte[] method1394(int arg0, int arg1) {
        field3364++;
        class122 var2 = (class122) class114.field1892.method263(2013, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class73.method525(var7, var4, true);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class122(var3);
            class114.field1892.method257(false, var2, (long) arg0);
        }
        return arg1 == 0 ? var2.field2031 : (byte[]) null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 216)
    public final void method1395(byte arg0) {
        field3352++;
        this.field3361.method1735(-3739);
        if (arg0 == -43) {
            this.field3355.method315(arg0 ^ 0xFFFFFFD5);
            this.field3366 = this.field3371;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 233)
    public final Object method1396(int arg0, long arg1) {
        field3363++;
        class106 var4 = (class106) this.field3355.method311((byte) 114, arg1);
        if (var4 == null) {
            return null;
        }
        if (arg0 != 0) {
            this.method1392(-74);
        }
        Object var5 = var4.method16((byte) 125);
        if (var5 == null) {
            var4.method1444((byte) 89);
            var4.method1421(-80);
            this.field3366++;
            return null;
        }
        if (var4.method15(3)) {
            class232 var6 = new class232(var5);
            this.field3355.method309(var6, var4.field3499, 1);
            this.field3361.method1737(var6, 94);
            var6.field3426 = 0L;
            var4.method1444((byte) 89);
            var4.method1421(-111);
        } else {
            this.field3361.method1737(var4, -20);
            var4.field3426 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(JLjava/lang/Object;Z)V", line = 284)
    public final void method1397(long arg0, Object arg1, boolean arg2) {
        this.method1393(arg0, 123);
        field3359++;
        if (this.field3366 == 0) {
            class106 var5 = (class106) this.field3361.method1740((byte) -118);
            var5.method1444((byte) 89);
            var5.method1421(53);
        } else {
            this.field3366--;
        }
        class232 var6 = new class232(arg1);
        this.field3355.method309(var6, arg0, 1);
        this.field3361.method1737(var6, 126);
        if (arg2) {
            var6.field3426 = 0L;
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(I)V", line = 330)
    public class199(int arg0) {
        this.field3366 = arg0;
        this.field3371 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3355 = new class49(var2);
    }
}
