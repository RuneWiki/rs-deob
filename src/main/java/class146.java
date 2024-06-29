import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class146 {

    @OriginalMember(owner = "client!br", name = "m", descriptor = "Ljo;")
    private class382 field2200 = new class382(64);

    @OriginalMember(owner = "client!br", name = "o", descriptor = "Ljo;")
    public class382 field2202 = new class382(2);

    @OriginalMember(owner = "client!br", name = "b", descriptor = "Lok;")
    private class74 field2189;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "Lok;")
    public class74 field2197;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "Lgo;")
    public static class310 field2193 = null;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "Ljo;")
    public static class382 field2199 = new class382(5);

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public static int field2203 = 0;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "Ltv;")
    public static class294 field2194;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "[I")
    public static int[] field2201;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method1059(int arg0, byte arg1) {
        field2192++;
        if (arg1 != -123) {
            field2193 = null;
        }
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        class111.field1696 = arg0;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 24)
    public final void method1060(int arg0) {
        int var2 = 28 / ((-arg0 - 45) / 63);
        class382 var3 = this.field2200;
        synchronized (this.field2200) {
            this.field2200.method2293(false);
        }
        field2196++;
        class382 var4 = this.field2202;
        synchronized (this.field2202) {
            this.field2202.method2293(false);
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V", line = 40)
    public static void method1061(int arg0) {
        field2199 = null;
        field2193 = null;
        if (arg0 != 5) {
            method1061(90);
        }
        field2194 = null;
        field2201 = null;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(IB)Lcg;", line = 54)
    public final class452 method1062(int arg0, byte arg1) {
        field2191++;
        class382 var3 = this.field2200;
        class452 var4;
        synchronized (this.field2200) {
            var4 = (class452) this.field2200.method2288((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field2189;
        byte[] var6;
        synchronized (this.field2189) {
            var6 = this.field2189.method541(arg0, 33, (byte) -122);
        }
        class452 var7 = new class452();
        var7.field6642 = this;
        if (var6 != null) {
            var7.method2632(new class468(var6), 0);
        }
        class382 var8 = this.field2200;
        synchronized (this.field2200) {
            if (arg1 > -64) {
                field2190 = 44;
            }
            this.field2200.method2290((long) arg0, var7, 98);
            return var7;
        }
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V", line = 91)
    public final void method1063(int arg0) {
        field2188++;
        class382 var2 = this.field2200;
        synchronized (this.field2200) {
            this.field2200.method2287(125);
            int var3 = 115 / ((arg0 - 19) / 44);
        }
        class382 var4 = this.field2202;
        synchronized (this.field2202) {
            this.field2202.method2287(116);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)V", line = 110)
    public final void method1064(int arg0, boolean arg1) {
        class382 var3 = this.field2200;
        synchronized (this.field2200) {
            this.field2200.method2294(arg0, true);
        }
        field2195++;
        if (arg1) {
            method1059(-55, (byte) -97);
        }
        class382 var4 = this.field2202;
        synchronized (this.field2202) {
            this.field2202.method2294(arg0, true);
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lkr;ILok;Lok;)V", line = 142)
    public class146(class262 arg0, int arg1, class74 arg2, class74 arg3) {
        this.field2189 = arg2;
        this.field2197 = arg3;
        this.field2189.method536(false, 33);
    }
}
