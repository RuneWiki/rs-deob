import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class689 {

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "Leda;")
    private class14 field9793 = new class14(64);

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "Leda;")
    public class14 field9796 = new class14(64);

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Lla;")
    public class422 field9790;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "Lla;")
    private class422 field9792;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "F")
    public static float field9787 = 0.25F;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "[Llk;")
    public static class249[] field9789 = new class249[14];

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field9783;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field9784;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field9786;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field9791;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field9794;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field9795;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public final void method3846(int arg0) {
        field9788++;
        class14 var2 = this.field9793;
        synchronized (this.field9793) {
            this.field9793.method71((byte) 44);
        }
        class14 var3 = this.field9796;
        synchronized (this.field9796) {
            int var4 = -103 % ((67 - arg0) / 36);
            this.field9796.method71((byte) 44);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9785++;
        if (class654.field9289.field5439.method155(3) != 0 && arg6 != 0 && class115.field1790 < 50 && arg4 != -1) {
            class374.field5649[class115.field1790++] = new class625((byte) 1, arg4, arg6, arg0, arg3, arg1, arg2, null);
        }
        if (arg5 != 64) {
            method3851(-6);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public final void method3848(int arg0) {
        field9786++;
        class14 var2 = this.field9793;
        synchronized (this.field9793) {
            this.field9793.method76(-108);
        }
        class14 var3 = this.field9796;
        synchronized (this.field9796) {
            this.field9796.method76(arg0 - 96);
            if (arg0 != 6) {
                this.method3846(106);
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V")
    public static final void method3849(int arg0, int arg1) {
        if (arg1 != -374) {
            field9787 = -1.0487823F;
        }
        field9791++;
        class118 var2 = class86.method755(true, 6, arg0);
        var2.method936(0);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)V")
    public final void method3850(int arg0, byte arg1) {
        class14 var3 = this.field9793;
        synchronized (this.field9793) {
            this.field9793.method68(-16878, arg0);
        }
        field9794++;
        if (arg1 != -6) {
            method3851(125);
        }
        class14 var4 = this.field9796;
        synchronized (this.field9796) {
            this.field9796.method68(-16878, arg0);
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
    public static void method3851(int arg0) {
        if (arg0 != -1) {
            method3849(-3, -34);
        }
        field9789 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)Lui;")
    public final class308 method3852(int arg0, boolean arg1) {
        field9783++;
        class14 var3 = this.field9793;
        class308 var4;
        synchronized (this.field9793) {
            var4 = (class308) this.field9793.method80((byte) -124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field9792;
        byte[] var6;
        synchronized (this.field9792) {
            var6 = this.field9792.method2624(0, 34, arg0);
        }
        class308 var7 = new class308();
        if (!arg1) {
            return null;
        }
        var7.field4663 = this;
        if (var6 != null) {
            var7.method2037(false, new class301(var6));
        }
        class14 var8 = this.field9793;
        synchronized (this.field9793) {
            this.field9793.method67((long) arg0, var7, -6772);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IBI)V")
    public final void method3853(int arg0, byte arg1, int arg2) {
        field9784++;
        this.field9793 = new class14(arg0);
        this.field9796 = new class14(arg2);
        if (arg1 != -12) {
            this.method3848(94);
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lcr;ILla;Lla;)V")
    public class689(class292 arg0, int arg1, class422 arg2, class422 arg3) {
        this.field9790 = arg3;
        this.field9792 = arg2;
        this.field9792.method2615(0, 34);
    }
}
