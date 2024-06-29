import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class469 {

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "Ldc;")
    private class5 field6788 = new class5(16);

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "Lhe;")
    private class239 field6789;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "Lhe;")
    public static class239 field6782;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V", line = 4)
    public static void method2742(byte arg0) {
        if (arg0 >= -40) {
            method2749(-3, (byte) -77);
        }
        field6782 = null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZI)V", line = 17)
    public static final void method2743(int arg0, boolean arg1, int arg2) {
        field6787++;
        if (!arg1 && class322.method1928(arg2, 7387)) {
            class427.method2545(arg0, class181.field2591[arg2], (byte) 69);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(BI)Lbd;", line = 40)
    public final class42 method2744(byte arg0, int arg1) {
        field6785++;
        int var3 = -41 / ((-arg0 - 33) / 61);
        class5 var4 = this.field6788;
        class42 var5;
        synchronized (this.field6788) {
            var5 = (class42) this.field6788.method40(0, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field6789.method1470(4, arg1, 30);
        class42 var7 = new class42();
        if (var6 != null) {
            var7.method311(23861, new class156(var6));
        }
        class5 var8 = this.field6788;
        synchronized (this.field6788) {
            this.field6788.method36(-20960, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IB)V", line = 66)
    public final void method2745(int arg0, byte arg1) {
        field6784++;
        class5 var3 = this.field6788;
        synchronized (this.field6788) {
            this.field6788.method39(false, arg0);
        }
        int var4 = 72 % ((arg1 - 18) / 49);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)V", line = 79)
    public final void method2746(boolean arg0) {
        field6786++;
        class5 var2 = this.field6788;
        synchronized (this.field6788) {
            this.field6788.method38((byte) -17);
            if (!arg0) {
                this.method2746(true);
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V", line = 92)
    public final void method2747(int arg0) {
        if (arg0 < 33) {
            this.method2745(106, (byte) -51);
        }
        field6781++;
        class5 var2 = this.field6788;
        synchronized (this.field6788) {
            this.field6788.method35((byte) -1);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lae;IB)Ljava/lang/String;", line = 106)
    public static final String method2748(class156 arg0, int arg1, byte arg2) {
        field6783++;
        try {
            int var3 = arg0.method953((byte) -40);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg0.field2018 += class408.field5988.method3037(var4, (byte) -37, arg0.field2041, var3, arg0.field2018, 0);
            String var5 = class311.method1862(var3, 0, var4, arg2 - 113);
            if (arg2 != 113) {
                field6782 = null;
            }
            return var5;
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lci;ILhe;)V", line = 153)
    public class469(class298 arg0, int arg1, class239 arg2) {
        this.field6789 = arg2;
        this.field6789.method1473(4309, 30);
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(IB)Lqp;", line = 139)
    public static final class450 method2749(int arg0, byte arg1) {
        field6780++;
        if (class464.field6730 && class161.field2097 <= arg0 && arg0 <= class219.field3083) {
            if (arg1 != 19) {
                method2749(7, (byte) -79);
            }
            return class479.field6928[arg0 - class161.field2097];
        } else {
            return null;
        }
    }
}
