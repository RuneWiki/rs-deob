import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class244 {

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Lof;")
    private class328 field3960 = new class328(64);

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Lof;")
    private class328 field3963 = new class328(100);

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Lmn;")
    private class162 field3955;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field3950 = 0;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "Z")
    public static boolean field3958 = false;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3961 = new CRC32();

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "[Lya;")
    public static class223[] field3956;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZ)Lnb;")
    public final class249 method1695(int arg0, boolean arg1) {
        field3953++;
        class328 var3 = this.field3963;
        class249 var4;
        synchronized (this.field3963) {
            var4 = (class249) this.field3963.method2191((byte) -73, (long) arg0);
            if (var4 == null) {
                var4 = new class249(arg0);
                this.field3963.method2188(-127, (long) arg0, var4);
            }
        }
        if (!arg1) {
            this.method1696(54, -41);
        }
        synchronized (var4) {
            return var4.method1723(59) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
    public final void method1696(int arg0, int arg1) {
        class328 var3 = this.field3960;
        synchronized (this.field3960) {
            if (arg1 != -1386) {
                this.method1697(57);
            }
            this.field3960.method2202(0, arg0);
        }
        field3952++;
        class328 var4 = this.field3963;
        synchronized (this.field3963) {
            this.field3963.method2202(0, arg0);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public final void method1697(int arg0) {
        class328 var2 = this.field3960;
        synchronized (this.field3960) {
            this.field3960.method2187(-1);
        }
        field3954++;
        if (arg0 > -55) {
            this.field3960 = null;
        }
        class328 var3 = this.field3963;
        synchronized (this.field3963) {
            this.field3963.method2187(-1);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static final void method1698(byte arg0) {
        if (arg0 != -5) {
            return;
        }
        for (int var1 = 0; var1 < class183.field2649.length; var1++) {
            for (int var2 = 0; var2 < class183.field2649[var1].length; var2++) {
                class183.field2649[var1][var2] = class148.field1996;
            }
        }
        field3957++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIBIII)Lmt;")
    public static final class321 method1699(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3951++;
        long var7 = (long) arg2 * 76724863L ^ (long) arg1 * 67481L ^ (long) arg6 * 97549L ^ (long) arg4 * 475427L ^ (long) arg5 * 986053L ^ (long) arg0 * 32147369L;
        class321 var9 = (class321) class260.field4197.method2191((byte) -73, var7);
        if (var9 != null) {
            return var9;
        }
        class321 var10 = class307.field4813.method1300(arg1, arg6, arg4, arg5, arg0, arg2);
        if (arg3 > -50) {
            method1700(107, -121, -123);
        }
        class260.field4197.method2188(-122, var7, var10);
        return var10;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)Z")
    public static final boolean method1700(int arg0, int arg1, int arg2) {
        int var3 = -16 / ((43 - arg2) / 50);
        field3959++;
        return class319.method2141(arg1, arg0, (byte) -119) || class262.method1798(arg0, arg1, (byte) -117);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
    public static void method1701(byte arg0) {
        field3961 = null;
        field3956 = null;
        if (arg0 != 58) {
            method1701((byte) -64);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public final void method1702(int arg0) {
        class328 var2 = this.field3960;
        synchronized (this.field3960) {
            this.field3960.method2189(false);
        }
        field3962++;
        class328 var3 = this.field3963;
        synchronized (this.field3963) {
            this.field3963.method2189(false);
        }
        int var4 = 60 / ((arg0 - 50) / 55);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)Lhg;")
    public final class363 method1703(int arg0, int arg1) {
        field3949++;
        class328 var3 = this.field3960;
        class363 var4;
        synchronized (this.field3960) {
            var4 = (class363) this.field3960.method2191((byte) -73, (long) arg0);
            if (arg1 != -12536) {
                method1699(61, 89, 27, (byte) -59, 62, 125, 11);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field3955;
        byte[] var6;
        synchronized (this.field3955) {
            var6 = this.field3955.method1004(class278.method1868(arg1 ^ 0xDA36F6EF, arg0), false, class181.method1146(arg0, (byte) -66));
        }
        class363 var7 = new class363();
        var7.field5606 = this;
        var7.field5611 = arg0;
        if (var6 != null) {
            var7.method2387(new class208(var6), 121);
        }
        var7.method2393(arg1 + 2391);
        class328 var8 = this.field3960;
        synchronized (this.field3960) {
            this.field3960.method2188(-125, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lpr;ILmn;Lmn;Lmn;)V")
    public class244(class236 arg0, int arg1, class162 arg2, class162 arg3, class162 arg4) {
        this.field3955 = arg2;
        if (this.field3955 != null) {
            int var6 = this.field3955.method1023(127) - 1;
            this.field3955.method1008(var6, (byte) -21);
        }
        class261.method1773(arg3, arg4, (byte) -47);
    }
}
