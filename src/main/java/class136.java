import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class136 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Lnga;")
    private class510 field2117 = new class510(64);

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Leq;")
    private class209 field2121;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Luf;")
    public static class445 field2115 = new class445();

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lmp;")
    public static class758 field2123 = new class758(64);

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field2124 = -1;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lqaa;")
    public static class27 field2125 = new class27(26, 3);

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Leq;")
    public static class209 field2119;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)I")
    public static final int method1072(int arg0) {
        field2116++;
        if (arg0 == 27404) {
            class510 var1 = class496.field7066;
            synchronized (class496.field7066) {
                return class496.field7066.method3052(-77);
            }
        } else {
            return -65;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public static void method1073(int arg0) {
        field2115 = null;
        field2125 = null;
        field2123 = null;
        if (arg0 > -54) {
            method1072(-26);
        }
        field2119 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIBI)I")
    public static final int method1074(int arg0, int arg1, byte arg2, int arg3) {
        field2120++;
        int var4 = 255 - arg3;
        int var5 = ((arg0 & 0xFF00FF) * arg3 & 0xFF00FF00 | (arg0 & 0xFF00) * arg3 & 0xFF0000) >>> 8;
        return arg2 <= 77 ? 25 : (((arg1 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg1 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)Loe;")
    public final class198 method1075(byte arg0, int arg1) {
        field2122++;
        if (arg0 != -70) {
            field2115 = null;
        }
        class510 var3 = this.field2117;
        class198 var4;
        synchronized (this.field2117) {
            var4 = (class198) this.field2117.method3054((byte) -99, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field2121;
        byte[] var6;
        synchronized (this.field2121) {
            var6 = this.field2121.method1453(arg1, arg0 ^ 0xFFFFFFAC, 5);
        }
        class198 var7 = new class198();
        if (var6 != null) {
            var7.method1388((byte) 27, new class35(var6));
        }
        class510 var8 = this.field2117;
        synchronized (this.field2117) {
            this.field2117.method3047(false, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lcw;ILeq;)V")
    public class136(class179 arg0, int arg1, class209 arg2) {
        this.field2121 = arg2;
        this.field2121.method1477(0, 5);
    }
}
