import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class316 {

    @OriginalMember(owner = "client!at", name = "f", descriptor = "Z")
    public boolean field4031 = false;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "Lsw;")
    private class641 field4028 = new class641(64);

    @OriginalMember(owner = "client!at", name = "t", descriptor = "Lsw;")
    public class641 field4045 = new class641(500);

    @OriginalMember(owner = "client!at", name = "v", descriptor = "Lsw;")
    public class641 field4047 = new class641(30);

    @OriginalMember(owner = "client!at", name = "w", descriptor = "Lsw;")
    public class641 field4048 = new class641(50);

    @OriginalMember(owner = "client!at", name = "r", descriptor = "Ldn;")
    public class438 field4043;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "Z")
    public boolean field4032;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "Ldn;")
    private class438 field4036;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "Lrg;")
    public static class548 field4029 = new class548(15, 7);

    @OriginalMember(owner = "client!at", name = "s", descriptor = "Lrp;")
    public static class369 field4044 = new class369();

    @OriginalMember(owner = "client!at", name = "u", descriptor = "Lcea;")
    public static class180 field4046 = new class180("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!at", name = "a", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!at", name = "x", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IZ)V")
    public final void method1747(int arg0, boolean arg1) {
        this.field4049 = arg0;
        field4026++;
        class641 var3 = this.field4045;
        synchronized (this.field4045) {
            this.field4045.method3687(1402);
        }
        class641 var4 = this.field4047;
        synchronized (this.field4047) {
            this.field4047.method3687(1402);
        }
        class641 var5 = this.field4048;
        synchronized (this.field4048) {
            this.field4048.method3687(1402);
            if (arg1) {
                this.field4047 = null;
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
    public static void method1748(byte arg0) {
        if (arg0 > -124) {
            method1757(true, 110, -104, 107, (byte) -49, null, -72);
        }
        field4029 = null;
        field4046 = null;
        field4044 = null;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
    public final void method1749(int arg0) {
        field4033++;
        class641 var2 = this.field4028;
        synchronized (this.field4028) {
            this.field4028.method3687(1402);
        }
        class641 var3 = this.field4045;
        synchronized (this.field4045) {
            this.field4045.method3687(1402);
            if (arg0 != -15616) {
                this.field4031 = false;
            }
        }
        class641 var4 = this.field4047;
        synchronized (this.field4047) {
            this.field4047.method3687(1402);
        }
        class641 var5 = this.field4048;
        synchronized (this.field4048) {
            this.field4048.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V")
    public final void method1750(int arg0, int arg1) {
        if (arg0 < 37) {
            this.method1755(false, (byte) -98);
        }
        this.field4028 = new class641(arg1);
        field4039++;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V")
    public static final void method1751(int arg0) {
        field4027++;
        int var1 = -107 % ((7 - arg0) / 46);
        class474.field6653 = true;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(IZ)V")
    public final void method1752(int arg0, boolean arg1) {
        field4040++;
        if (arg1 != this.field4032) {
            this.field4032 = arg1;
            int var3 = 56 / ((arg0 - 52) / 63);
            this.method1749(-15616);
        }
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)V")
    public final void method1753(int arg0) {
        class641 var2 = this.field4028;
        synchronized (this.field4028) {
            this.field4028.method3694(0);
        }
        if (arg0 != -63) {
            this.field4049 = 38;
        }
        field4037++;
        class641 var3 = this.field4045;
        synchronized (this.field4045) {
            this.field4045.method3694(0);
        }
        class641 var4 = this.field4047;
        synchronized (this.field4047) {
            this.field4047.method3694(0);
        }
        class641 var5 = this.field4048;
        synchronized (this.field4048) {
            this.field4048.method3694(0);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IB)V")
    public final void method1754(int arg0, byte arg1) {
        if (arg1 != -65) {
            this.field4048 = null;
        }
        field4042++;
        class641 var3 = this.field4028;
        synchronized (this.field4028) {
            this.field4028.method3686((byte) 53, arg0);
        }
        class641 var4 = this.field4045;
        synchronized (this.field4045) {
            this.field4045.method3686((byte) 53, arg0);
        }
        class641 var5 = this.field4047;
        synchronized (this.field4047) {
            this.field4047.method3686((byte) 53, arg0);
        }
        class641 var6 = this.field4048;
        synchronized (this.field4048) {
            this.field4048.method3686((byte) 53, arg0);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZB)V")
    public final void method1755(boolean arg0, byte arg1) {
        int var3 = -47 / ((-arg1 - 62) / 58);
        field4041++;
        if (arg0 != this.field4031) {
            this.field4031 = arg0;
            this.method1749(-15616);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1756(String arg0, int arg1) {
        field4034++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        if (arg1 != 0) {
            method1756(null, -41);
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZIIIBLdn;I)V")
    public static final void method1757(boolean arg0, int arg1, int arg2, int arg3, byte arg4, class438 arg5, int arg6) {
        class121.field1518 = arg0;
        class527.field7382 = arg5;
        class175.field2117 = arg2;
        class503.field6979 = arg1;
        class578.field8436 = 1;
        class442.field6104 = arg6;
        class79.field923 = arg3;
        field4030++;
        if (arg4 != 80) {
            method1748((byte) -86);
        }
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(I)[Lil;")
    public static final class7[] method1758(int arg0) {
        if (arg0 != -13806) {
            method1751(24);
        }
        field4035++;
        return new class7[] { class507.field7033, class85.field1037, class63.field624, class114.field1428, class578.field8435, class622.field8967 };
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZI)Lcn;")
    public final class437 method1759(boolean arg0, int arg1) {
        field4038++;
        class641 var3 = this.field4028;
        class437 var4;
        synchronized (this.field4028) {
            var4 = (class437) this.field4028.method3682(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field4036;
        byte[] var6;
        synchronized (this.field4036) {
            var6 = this.field4036.method2558(100, class445.method2602(arg1, arg0), class617.method3547((byte) -92, arg1));
        }
        class437 var7 = new class437();
        var7.field5973 = this;
        var7.field5996 = arg1;
        if (var6 != null) {
            var7.method2534(new class374(var6), (byte) 104);
        }
        var7.method2546(-127);
        if (var7.field6015) {
            var7.field6000 = 0;
            var7.field5979 = false;
        }
        if (!this.field4032 && var7.field5991) {
            var7.field5967 = null;
            var7.field5942 = null;
        }
        class641 var8 = this.field4028;
        synchronized (this.field4028) {
            this.field4028.method3684(var7, 0, (long) arg1);
        }
        return arg0 ? null : var7;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lre;IZLdn;Ldn;)V")
    public class316(class515 arg0, int arg1, boolean arg2, class438 arg3, class438 arg4) {
        this.field4043 = arg4;
        this.field4032 = arg2;
        this.field4036 = arg3;
        if (this.field4036 != null) {
            int var6 = this.field4036.method2565((byte) 96) - 1;
            this.field4036.method2554(var6, 123);
        }
    }
}
