import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class56 {

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "Z")
    public boolean field770 = false;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Ljt;")
    private class106 field775 = new class106(64);

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "Ljt;")
    public class106 field786 = new class106(500);

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "Ljt;")
    public class106 field787 = new class106(30);

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "Ljt;")
    public class106 field788 = new class106(50);

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "Z")
    public boolean field776;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "Lvd;")
    public class39 field784;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "Lvd;")
    private class39 field779;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Lsu;")
    public final class211 method388(int arg0, int arg1) {
        field783++;
        class106 var3 = this.field775;
        class211 var4;
        synchronized (this.field775) {
            var4 = (class211) this.field775.method803(arg1 + 7, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field779;
        byte[] var6;
        synchronized (this.field779) {
            var6 = this.field779.method211(true, class214.method1456(95, arg0), class686.method3908(false, arg0));
        }
        class211 var7 = new class211();
        var7.field3158 = arg0;
        var7.field3126 = this;
        if (var6 != null) {
            var7.method1428((byte) 19, new class645(var6));
        }
        var7.method1427(0);
        if (arg1 != 100) {
            return null;
        }
        if (!this.field776 && var7.field3146) {
            var7.field3098 = null;
            var7.field3180 = null;
        }
        if (var7.field3174) {
            var7.field3145 = 0;
            var7.field3178 = false;
        }
        class106 var8 = this.field775;
        synchronized (this.field775) {
            this.field775.method801(1, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static final void method389(byte arg0) {
        class567.field8049 = 0;
        class344.field4987 = -1;
        field777++;
        class390.field5885 = -1;
        class445.field6615 = -1;
        int var1 = 65 % ((arg0 + 48) / 35);
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
    public final void method390(byte arg0) {
        field772++;
        class106 var2 = this.field775;
        synchronized (this.field775) {
            int var3 = 0 % ((arg0 - 33) / 49);
            this.field775.method800(107);
        }
        class106 var4 = this.field786;
        synchronized (this.field786) {
            this.field786.method800(110);
        }
        class106 var5 = this.field787;
        synchronized (this.field787) {
            this.field787.method800(103);
        }
        class106 var6 = this.field788;
        synchronized (this.field788) {
            this.field788.method800(117);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "()V")
    public static final void method391() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class449.field6662.length; var1++) {
                if (class449.field6662[var1].method1388()) {
                    class600.field8498[var1] = class449.field6662[var1].method1384();
                } else {
                    synchronized (class449.field6662[var1]) {
                        class449.field6662[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class449.field6662[class449.field6662.length - 1].method1386();
                class175.method1247(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class449.field6662.length - 1; var4++) {
                        if (!class449.field6662[var4].method1388()) {
                            synchronized (class449.field6662[var4]) {
                                class449.field6662[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class449.field6662.length - 2; var6++) {
                            class449.field6662[var6].method1386();
                        }
                        class175.method1247(2);
                        while (!class449.field6662[0].method1388()) {
                            synchronized (class449.field6662[0]) {
                                class449.field6662[0].notify();
                            }
                            try {
                                class277.method1759(1L, 123);
                            } catch (Exception var9) {
                            }
                        }
                        class449.field6662[0].method1386();
                        return;
                    }
                    try {
                        class277.method1759(1L, 107);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class277.method1759(1L, -121);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static final void method392(int arg0) {
        field771++;
        class418.method2637(-123);
        if (arg0 != -1) {
            method396(null);
        }
        int var1 = class63.field916.field10194.method1327(17503);
        if (var1 == 2) {
            class81.method656((byte) -108, 100, class510.field7263, 100, class736.field10316, class501.field7123);
        } else if (var1 == 3) {
            class705.method4011(2, class501.field7123, class510.field7263, 26, class736.field10316, 2, class35.field370, class66.field943);
        }
        if (class63.field916.field10194.method1326(-114)) {
            class396.method2527(1, class106.field1476);
        }
        if (class736.field10316 != null) {
            class149.method1106(-3);
        }
        class418.field6258 = class63.field916.field10194.method1327(arg0 + 17504) != 0;
        class419.field6265 = class63.field916.field10194.method1326(-118);
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)V")
    public final void method393(int arg0, int arg1) {
        class106 var3 = this.field775;
        synchronized (this.field775) {
            this.field775.method807(arg1, -1);
        }
        field780++;
        class106 var4 = this.field786;
        synchronized (this.field786) {
            this.field786.method807(arg1, -1);
        }
        class106 var5 = this.field787;
        synchronized (this.field787) {
            this.field787.method807(arg1, -1);
        }
        class106 var6 = this.field788;
        synchronized (this.field788) {
            int var7 = -64 % ((-arg0 - 60) / 58);
            this.field788.method807(arg1, -1);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BZ)V")
    public final void method394(byte arg0, boolean arg1) {
        field781++;
        if (this.field770 == arg1) {
            return;
        }
        this.field770 = arg1;
        if (arg0 >= -22) {
            this.field775 = null;
        }
        this.method400(-4);
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(II)Z")
    public static final boolean method395(int arg0, int arg1) {
        if (arg1 == -10) {
            field782++;
            return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lvs;)V")
    public static final void method396(class593 arg0) {
        class118.field1620.method421(arg0.field8423, arg0.field8421 + (arg0.method315((byte) 106) >> 1), arg0.field8428, class289.field4124);
        arg0.field8424 = class289.field4124[0];
        arg0.field8420 = class289.field4124[1];
        arg0.field8425 = class289.field4124[2];
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(II)V")
    public final void method397(int arg0, int arg1) {
        this.field775 = new class106(arg1);
        if (arg0 == -8513) {
            field778++;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)V")
    public final void method398(boolean arg0, int arg1) {
        this.field789 = arg1;
        field774++;
        class106 var3 = this.field786;
        synchronized (this.field786) {
            this.field786.method809(true);
        }
        class106 var4 = this.field787;
        synchronized (this.field787) {
            this.field787.method809(arg0);
        }
        class106 var5 = this.field788;
        synchronized (this.field788) {
            this.field788.method809(arg0);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)V")
    public final void method399(int arg0, boolean arg1) {
        field785++;
        if (arg0 != 1) {
            this.field770 = false;
        }
        if (this.field776 != arg1) {
            this.field776 = arg1;
            this.method400(-4);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public final void method400(int arg0) {
        field773++;
        class106 var2 = this.field775;
        synchronized (this.field775) {
            this.field775.method809(true);
        }
        class106 var3 = this.field786;
        synchronized (this.field786) {
            this.field786.method809(true);
        }
        class106 var4 = this.field787;
        synchronized (this.field787) {
            this.field787.method809(true);
        }
        class106 var5 = this.field788;
        synchronized (this.field788) {
            if (arg0 != -4) {
                this.field787 = null;
            }
            this.field788.method809(true);
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lqg;IZLvd;Lvd;)V")
    public class56(class464 arg0, int arg1, boolean arg2, class39 arg3, class39 arg4) {
        this.field776 = arg2;
        this.field784 = arg4;
        this.field779 = arg3;
        if (this.field779 != null) {
            int var6 = this.field779.method222((byte) -4) - 1;
            this.field779.method229(var6, 0);
        }
    }
}
