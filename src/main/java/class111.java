import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class111 {

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Lpca;")
    private class714 field1365 = new class714(64);

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public int field1369 = 0;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Lfp;")
    private class323 field1362;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public int field1367;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "[I")
    public static int[] field1363 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method785(int arg0) {
        field1363 = null;
        int var1 = 5 / ((72 - arg0) / 42);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)I")
    public static final int method786(byte arg0) {
        field1368++;
        return arg0 == 81 ? class530.field7471 : 96;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
    public static final void method787(byte arg0) {
        field1360++;
        class454.field6418 = 0;
        class210.field2763 = -1;
        class656.field8997 = -1;
        class674.field9143 = -1;
        int var1 = -39 % ((arg0 - 24) / 56);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public final void method788(int arg0) {
        class714 var2 = this.field1365;
        synchronized (this.field1365) {
            this.field1365.method4024(0);
        }
        field1366++;
        if (arg0 != -14494) {
            method790(67, null, (byte) 50);
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)V")
    public final void method789(byte arg0) {
        field1364++;
        class714 var2 = this.field1365;
        synchronized (this.field1365) {
            this.field1365.method4023((byte) 103);
            if (arg0 > -62) {
                this.field1362 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILjava/util/Random;B)I")
    public static final int method790(int arg0, Random arg1, byte arg2) {
        field1359++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class253.method1681(arg0, (byte) 125)) {
            return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            if (arg2 != -119) {
                field1363 = null;
            }
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class415.method2548(var4, arg0, false);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
    public final void method791(int arg0, int arg1) {
        field1358++;
        class714 var3 = this.field1365;
        synchronized (this.field1365) {
            this.field1365.method4016(arg0, (byte) -73);
            if (arg1 != 587437728) {
                method785(-108);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)Lme;")
    public final class192 method792(int arg0, int arg1) {
        field1361++;
        class714 var3 = this.field1365;
        class192 var4;
        synchronized (this.field1365) {
            var4 = (class192) this.field1365.method4022((long) arg1, (byte) 111);
            if (arg0 != 4) {
                this.field1369 = -28;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field1362;
        byte[] var6;
        synchronized (this.field1362) {
            var6 = this.field1362.method2100(arg1, (byte) 112, 4);
        }
        class192 var7 = new class192();
        var7.field2568 = arg1;
        var7.field2571 = this;
        if (var6 != null) {
            var7.method1195(new class675(var6), arg0 - 37);
        }
        var7.method1192((byte) 121);
        class714 var8 = this.field1365;
        synchronized (this.field1365) {
            this.field1365.method4018((byte) 126, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lsaa;ILfp;)V")
    public class111(class326 arg0, int arg1, class323 arg2) {
        this.field1362 = arg2;
        this.field1367 = this.field1362.method2084(4, 0);
    }
}
