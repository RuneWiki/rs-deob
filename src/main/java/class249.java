import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class249 {

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "Lad;")
    private class11 field3177 = new class11(64);

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Lad;")
    public class11 field3184 = new class11(64);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Ldn;")
    public class201 field3173;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Ldn;")
    private class201 field3178;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field3182 = 999999;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Lad;")
    public static class11 field3175 = new class11(200);

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IFFF)I")
    public static final int method1557(int arg0, float arg1, float arg2, float arg3) {
        if (arg0 != 2) {
            return -24;
        }
        field3183++;
        float var4 = (arg1 < 0.0F) ? -arg1 : arg1;
        float var5 = arg3 < 0.0F ? -arg3 : arg3;
        float var6 = (arg2 < 0.0F) ? -arg2 : arg2;
        if (var4 < var5 && var5 > var6) {
            return arg3 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg1 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
    public final void method1558(int arg0, int arg1) {
        field3180++;
        class11 var3 = this.field3177;
        synchronized (this.field3177) {
            this.field3177.method80(-73, arg0);
        }
        class11 var4 = this.field3184;
        synchronized (this.field3184) {
            if (arg1 == 0) {
                this.field3184.method80(-54, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBI)V")
    public final void method1559(int arg0, byte arg1, int arg2) {
        field3176++;
        int var4 = -34 % ((arg1 + 17) / 48);
        this.field3177 = new class11(arg2);
        this.field3184 = new class11(arg0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public final void method1560(int arg0) {
        class11 var2 = this.field3177;
        synchronized (this.field3177) {
            this.field3177.method84(-97);
        }
        field3174++;
        class11 var3 = this.field3184;
        synchronized (this.field3184) {
            this.field3184.method84(120);
        }
        if (arg0 >= -35) {
            this.method1558(-25, 125);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public final void method1561(byte arg0) {
        field3179++;
        class11 var2 = this.field3177;
        synchronized (this.field3177) {
            this.field3177.method90((byte) -27);
        }
        if (arg0 > -31) {
            this.method1562(-120, -85);
        }
        class11 var3 = this.field3184;
        synchronized (this.field3184) {
            this.field3184.method90((byte) -27);
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)Lsl;")
    public final class451 method1562(int arg0, int arg1) {
        field3181++;
        class11 var3 = this.field3177;
        class451 var4;
        synchronized (this.field3177) {
            var4 = (class451) this.field3177.method78((long) arg0, (byte) -114);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3178.method1313((byte) -128, 34, arg0);
        class451 var6 = new class451();
        if (arg1 != -18299) {
            return null;
        }
        var6.field6279 = this;
        if (var5 != null) {
            var6.method2671((byte) 106, new class88(var5));
        }
        class11 var7 = this.field3177;
        synchronized (this.field3177) {
            this.field3177.method88((long) arg0, 48, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    public static void method1563(byte arg0) {
        field3175 = null;
        if (arg0 >= -113) {
            method1557(-86, -2.3520577F, -0.3224442F, -0.63887244F);
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lgt;ILdn;Ldn;)V")
    public class249(class65 arg0, int arg1, class201 arg2, class201 arg3) {
        this.field3173 = arg3;
        this.field3178 = arg2;
        this.field3178.method1302(-77, 34);
    }
}
