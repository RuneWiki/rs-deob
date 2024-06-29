import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class334 {

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "Lvs;")
    private class617 field4185 = new class617();

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "Lth;")
    private class288 field4192 = new class288();

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    private int field4191;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    private int field4193;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "Lwa;")
    private class661 field4190;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "[I")
    public static int[] field4183 = new int[6];

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "Z")
    public static boolean field4194 = false;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "Lpi;")
    public static class464 field4184;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "[Lsf;")
    public static class603[] field4188;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V", line = 7)
    public static void method1926(int arg0) {
        field4188 = null;
        field4184 = null;
        if (arg0 != 0) {
            method1926(-60);
        }
        field4183 = null;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(JI)Lvs;", line = 20)
    public final class617 method1927(long arg0, int arg1) {
        if (arg1 != 0) {
            this.field4191 = -29;
        }
        field4195++;
        class617 var4 = (class617) this.field4190.method3669(arg0, arg1 - 1);
        if (var4 != null) {
            this.field4192.method1680(10, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILvs;J)V", line = 46)
    public final void method1928(int arg0, class617 arg1, long arg2) {
        field4186++;
        if (this.field4193 == 0) {
            class617 var5 = this.field4192.method1678(true);
            var5.method1922(126);
            var5.method3443(107);
            if (this.field4185 == var5) {
                class617 var6 = this.field4192.method1678(true);
                var6.method1922(110);
                var6.method3443(98);
            }
        } else {
            this.field4193--;
        }
        int var7 = -10 / ((68 - arg0) / 58);
        this.field4190.method3671(false, arg1, arg2);
        this.field4192.method1680(58, arg1);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V", line = 92)
    public final void method1929(byte arg0) {
        this.field4192.method1682(0);
        field4189++;
        this.field4190.method3667(5488);
        this.field4185 = new class617();
        if (arg0 > -54) {
            field4184 = null;
        }
        this.field4193 = this.field4191;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(I)V", line = 125)
    public class334(int arg0) {
        this.field4191 = arg0;
        this.field4193 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4190 = new class661(var2);
    }
}
