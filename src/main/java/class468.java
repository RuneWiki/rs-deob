import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class468 {

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "Lfba;")
    private class348 field6672 = new class348(64);

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "Lfba;")
    public class348 field6676 = new class348(50);

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "Lfba;")
    public class348 field6677 = new class348(5);

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "Lla;")
    private class423 field6673;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "Lmp;")
    public class315 field6666;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "Lla;")
    public class423 field6668;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "Z")
    public boolean field6659;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field6665 = 0;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public static int field6670 = -1;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
    public int field6678;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "[I")
    public static int[] field6657;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILha;Z)Lda;")
    public static final class400 method2821(int arg0, int arg1, class543 arg2, boolean arg3) {
        field6667++;
        class297 var4 = class218.method1536(arg2, arg0, arg1 ^ 0x8A113ABF, arg3);
        if (var4 == null) {
            return null;
        } else {
            if (arg1 != -1978582392) {
                method2821(-33, 121, null, true);
            }
            return var4.field4059;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)Lfha;")
    public final class521 method2822(int arg0, int arg1) {
        field6674++;
        class348 var3 = this.field6672;
        class521 var4;
        synchronized (this.field6672) {
            var4 = (class521) this.field6672.method2216(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field6673;
        byte[] var6;
        synchronized (this.field6673) {
            var6 = this.field6673.method2600(0, class93.method722(8230, arg0), class437.method2675(127, arg0));
        }
        class521 var7 = new class521();
        var7.field7560 = arg0;
        var7.field7543 = this;
        if (arg1 != 50) {
            this.field6673 = null;
        }
        if (var6 != null) {
            var7.method3174((byte) -48, new class479(var6));
        }
        var7.method3173(115);
        class348 var8 = this.field6672;
        synchronized (this.field6672) {
            this.field6672.method2213((byte) -16, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)Z")
    public static final boolean method2823(int arg0, int arg1, int arg2) {
        field6661++;
        if (arg2 != 976261473) {
            field6675 = 0;
        }
        return class125.method879(arg0, arg1, 7) || class487.method2968(arg0, arg1, arg2 - 976261472);
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)V")
    public final void method2824(int arg0, int arg1) {
        this.field6678 = arg0;
        field6660++;
        class348 var3 = this.field6676;
        synchronized (this.field6676) {
            this.field6676.method2220(false);
            if (arg1 != -77412414) {
                this.method2826(true, -67);
            }
        }
        class348 var4 = this.field6677;
        synchronized (this.field6677) {
            this.field6677.method2220(false);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lqk;Z)V")
    public static final void method2825(class146 arg0, boolean arg1) {
        if (arg0.field2112 == 5 && arg0.field2131 != -1) {
            class92.method712(arg0, (byte) -58, class211.field3164);
        }
        if (!arg1) {
            field6670 = 49;
        }
        field6664++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZI)V")
    public final void method2826(boolean arg0, int arg1) {
        field6671++;
        if (arg1 <= 43) {
            this.field6668 = null;
        }
        if (this.field6659 != arg0) {
            this.field6659 = arg0;
            this.method2832(-1);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
    public static void method2827(byte arg0) {
        if (arg0 > 96) {
            field6657 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    public final void method2828(int arg0) {
        class348 var2 = this.field6676;
        synchronized (this.field6676) {
            this.field6676.method2220(false);
        }
        if (arg0 < 17) {
            return;
        }
        field6662++;
        class348 var3 = this.field6677;
        synchronized (this.field6677) {
            this.field6677.method2220(false);
        }
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(II)I")
    public static final int method2829(int arg0, int arg1) {
        if (arg0 < 115) {
            method2823(115, -52, -82);
        }
        field6669++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)V")
    public final void method2830(byte arg0, int arg1) {
        class348 var3 = this.field6672;
        synchronized (this.field6672) {
            this.field6672.method2207(arg1, 1);
        }
        field6658++;
        class348 var4 = this.field6676;
        synchronized (this.field6676) {
            this.field6676.method2207(arg1, 1);
        }
        int var5 = 103 / ((-arg0 - 18) / 57);
        class348 var6 = this.field6677;
        synchronized (this.field6677) {
            this.field6677.method2207(arg1, 1);
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
    public final void method2831(int arg0) {
        field6656++;
        class348 var2 = this.field6672;
        synchronized (this.field6672) {
            this.field6672.method2219(arg0 - 1635834965);
        }
        class348 var3 = this.field6676;
        synchronized (this.field6676) {
            this.field6676.method2219(-5300);
        }
        class348 var4 = this.field6677;
        synchronized (this.field6677) {
            if (arg0 != 1635829665) {
                this.method2822(16, -41);
            }
            this.field6677.method2219(-5300);
        }
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
    public final void method2832(int arg0) {
        class348 var2 = this.field6672;
        synchronized (this.field6672) {
            this.field6672.method2220(false);
        }
        if (arg0 != -1) {
            return;
        }
        field6663++;
        class348 var3 = this.field6676;
        synchronized (this.field6676) {
            this.field6676.method2220(false);
        }
        class348 var4 = this.field6677;
        synchronized (this.field6677) {
            this.field6677.method2220(false);
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lmp;IZLla;Lla;)V")
    public class468(class315 arg0, int arg1, boolean arg2, class423 arg3, class423 arg4) {
        this.field6673 = arg3;
        this.field6666 = arg0;
        this.field6668 = arg4;
        this.field6659 = arg2;
        if (this.field6673 != null) {
            int var6 = this.field6673.method2623(-1) - 1;
            this.field6673.method2616(var6, 0);
        }
    }
}
