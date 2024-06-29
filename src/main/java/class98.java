import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class98 {

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "Lof;")
    private class328 field1403 = new class328(128);

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "Lof;")
    public class328 field1415 = new class328(64);

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "Lmn;")
    private class162 field1411;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "Lmn;")
    public class162 field1410;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "S")
    public static short field1402 = 256;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "[I")
    public static int[] field1407 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "[Z")
    public static boolean[] field1414 = new boolean[100];

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static final void method658(int arg0) {
        field1408++;
        if (arg0 != 4) {
            field1414 = null;
        }
        int var1 = class141.field1911.method1636(308, class452.field7013);
        if (var1 == 0) {
            class240.field3908 = null;
            class113.method727(arg0 ^ 0xFFFFFF85, 0);
        } else if (var1 == 1) {
            class521.method3119((byte) 0, -53);
            class113.method727(-128, 512);
            if (class416.field6309 != null) {
                class100.method674(arg0 + 98);
            }
        } else {
            class521.method3119((byte) (class479.field7323 - 4 & 0xFF), -102);
            class113.method727(-126, 2);
        }
        class50.field643 = class201.field3057;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)V")
    public final void method659(int arg0, int arg1) {
        if (arg0 != -10066) {
            field1407 = null;
        }
        field1405++;
        class328 var3 = this.field1403;
        synchronized (this.field1403) {
            this.field1403.method2202(0, arg1);
        }
        class328 var4 = this.field1415;
        synchronized (this.field1415) {
            this.field1415.method2202(0, arg1);
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        field1409++;
        class328 var2 = this.field1403;
        synchronized (this.field1403) {
            if (arg0 > -64) {
                this.method659(111, 15);
            }
            this.field1403.method2187(-1);
        }
        class328 var3 = this.field1415;
        synchronized (this.field1415) {
            this.field1415.method2187(-1);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V")
    public final void method661(int arg0, int arg1, int arg2) {
        this.field1403 = new class328(arg1);
        if (arg2 != 2) {
            this.method663(false);
        }
        field1412++;
        this.field1415 = new class328(arg0);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZ)Lqg;")
    public final class210 method662(int arg0, boolean arg1) {
        field1413++;
        if (!arg1) {
            return null;
        }
        class328 var3 = this.field1403;
        class210 var4;
        synchronized (this.field1403) {
            var4 = (class210) this.field1403.method2191((byte) -73, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field1411;
        byte[] var6;
        synchronized (this.field1411) {
            var6 = this.field1411.method1004(36, !arg1, arg0);
        }
        class210 var7 = new class210();
        var7.field3233 = arg0;
        var7.field3258 = this;
        if (var6 != null) {
            var7.method1492(0, new class208(var6));
        }
        var7.method1490((byte) -104);
        class328 var8 = this.field1403;
        synchronized (this.field1403) {
            this.field1403.method2188(-125, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)V")
    public final void method663(boolean arg0) {
        field1406++;
        class328 var2 = this.field1403;
        synchronized (this.field1403) {
            if (arg0) {
                method664(108);
            }
            this.field1403.method2189(arg0);
        }
        class328 var3 = this.field1415;
        synchronized (this.field1415) {
            this.field1415.method2189(arg0);
        }
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)V")
    public static void method664(int arg0) {
        if (arg0 >= 42) {
            field1414 = null;
            field1407 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lpr;ILmn;Lmn;)V")
    public class98(class236 arg0, int arg1, class162 arg2, class162 arg3) {
        this.field1411 = arg2;
        this.field1410 = arg3;
        this.field1411.method1008(36, (byte) -21);
    }
}
