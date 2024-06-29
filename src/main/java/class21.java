import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class21 {

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Lrp;")
    private class288 field264 = new class288(64);

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Lrp;")
    private class288 field271 = new class288(100);

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "Llt;")
    private class458 field266;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "[Lcq;")
    public static class312[] field265 = new class312[14];

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field269 = 0;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lbg;")
    public static class310 field263 = new class310(3, 4);

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field270 = 0;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field272 = 104;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "F")
    public static float field273;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Lig;")
    public static class154 field274;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V", line = 5)
    public static void method104(boolean arg0) {
        field265 = null;
        if (arg0) {
            method104(false);
        }
        field263 = null;
        field274 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)V", line = 19)
    public final void method105(boolean arg0, int arg1) {
        class288 var3 = this.field264;
        synchronized (this.field264) {
            if (arg0) {
                this.field266 = null;
            }
            this.field264.method1760(arg1, 30398);
        }
        field267++;
        class288 var4 = this.field271;
        synchronized (this.field271) {
            this.field271.method1760(arg1, 30398);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Lfn;", line = 42)
    public final class87 method106(int arg0, int arg1) {
        field261++;
        class288 var3 = this.field264;
        class87 var4;
        synchronized (this.field264) {
            var4 = (class87) this.field264.method1752(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field266.method2715(class276.method1678(4515, arg1), class28.method141(arg1, 19), false);
        class87 var6 = new class87();
        var6.field1521 = arg1;
        if (arg0 >= -79) {
            field265 = null;
        }
        var6.field1513 = this;
        if (var5 != null) {
            var6.method617(12, new class40(var5));
        }
        var6.method613(false);
        class288 var7 = this.field264;
        synchronized (this.field264) {
            this.field264.method1758(1, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 75)
    public final void method107(int arg0) {
        field262++;
        class288 var2 = this.field264;
        synchronized (this.field264) {
            this.field264.method1761(-116);
        }
        class288 var3 = this.field271;
        synchronized (this.field271) {
            this.field271.method1761(-106);
        }
        if (arg0 <= 96) {
            this.field271 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Lcq;", line = 91)
    public final class312 method108(int arg0, int arg1) {
        field260++;
        class288 var3 = this.field271;
        class312 var4;
        synchronized (this.field271) {
            var4 = (class312) this.field271.method1752(0, (long) arg0);
            if (var4 == null) {
                var4 = new class312(arg0);
                this.field271.method1758(1, var4, (long) arg0);
            }
        }
        synchronized (var4) {
            if (!var4.method1868((byte) -118)) {
                return null;
            }
        }
        return arg1 == 3 ? var4 : null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 123)
    public final void method109(byte arg0) {
        class288 var2 = this.field264;
        synchronized (this.field264) {
            this.field264.method1749((byte) -35);
        }
        field268++;
        if (arg0 < 117) {
            method104(true);
        }
        class288 var3 = this.field271;
        synchronized (this.field271) {
            this.field271.method1749((byte) -53);
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lcm;ILlt;Llt;Llt;)V", line = 163)
    public class21(class491 arg0, int arg1, class458 arg2, class458 arg3, class458 arg4) {
        this.field266 = arg2;
        if (this.field266 != null) {
            int var6 = this.field266.method2738((byte) 109) - 1;
            this.field266.method2726((byte) 113, var6);
        }
        class117.method829((byte) 52, arg4, arg3);
    }
}
