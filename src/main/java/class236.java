import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class236 {

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Lau;")
    private class692 field3104 = new class692(64);

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Lmv;")
    private class295 field3099;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "[I")
    public static int[] field3102 = new int[1];

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Lvg;")
    public static class622 field3098 = new class622(83, 11);

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Lmea;")
    public static class355 field3110 = new class355("", 17);

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "[I")
    public static int[] field3109;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public final void method1448(int arg0) {
        class692 var2 = this.field3104;
        synchronized (this.field3104) {
            int var3 = -28 / ((arg0 - 78) / 32);
            this.field3104.method3891(13747);
        }
        field3100++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Lck;")
    public final class208 method1449(int arg0, int arg1) {
        field3105++;
        class692 var3 = this.field3104;
        class208 var4;
        synchronized (this.field3104) {
            var4 = (class208) this.field3104.method3901((long) arg1, -65);
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field3099;
        byte[] var6;
        synchronized (this.field3099) {
            var6 = this.field3099.method1844(arg0, 31330, arg1);
        }
        class208 var7 = new class208();
        if (var6 != null) {
            var7.method1333(false, new class540(var6));
        }
        var7.method1332(105);
        class692 var8 = this.field3104;
        synchronized (this.field3104) {
            this.field3104.method3894(var7, (byte) 60, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)I")
    public static final int method1450(int arg0, int arg1) {
        field3103++;
        if (arg1 != 83) {
            method1450(-51, -5);
        }
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)V")
    public final void method1451(int arg0, int arg1) {
        field3108++;
        class692 var3 = this.field3104;
        synchronized (this.field3104) {
            this.field3104.method3900(arg1, 0);
            if (arg0 != 17) {
                field3102 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public static void method1452(int arg0) {
        if (arg0 <= -88) {
            field3102 = null;
            field3110 = null;
            field3098 = null;
            field3109 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public final void method1453(byte arg0) {
        field3107++;
        int var2 = 15 / ((arg0 - 19) / 61);
        class692 var3 = this.field3104;
        synchronized (this.field3104) {
            this.field3104.method3890(-1);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)Z")
    public static final boolean method1454(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field3101++;
            return (arg1 & 0x70000) != 0 | class252.method1521(arg2, arg1, 62) || class566.method3263(arg2, arg1, 127);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
    public static final void method1455(int arg0) {
        field3106++;
        class642.field9200.method3890(-1);
        if (arg0 != 1) {
            method1450(27, 33);
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lsea;ILmv;)V")
    public class236(class373 arg0, int arg1, class295 arg2) {
        this.field3099 = arg2;
        if (this.field3099 != null) {
            this.field3099.method1845(35, true);
        }
    }
}
