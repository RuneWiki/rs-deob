import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class577 {

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "Luaa;")
    private class395 field8231 = new class395(64);

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "Lgp;")
    private class561 field8229;

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "Lgp;")
    private class561 field8232;

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "Lsq;")
    public static class442 field8230 = new class442();

    @OriginalMember(owner = "client!laa", name = "k", descriptor = "Z")
    public static boolean field8238 = false;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "I")
    public static int field8235;

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "I")
    public static int field8237;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIZIZ)V")
    public static final void method3297(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        if (class646.field9388 == 0) {
            class382.method2327(false, (byte) 114);
        } else {
            class545.field7582 = class646.field9388;
            class471.method2738(127, 0);
        }
        field8234++;
        class343.field4928 = arg2;
        if (arg4) {
            method3301(false);
        }
        class642.field9334 = arg0;
        class600.field8519 = arg1;
        class212.method1416(arg3);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lr;IIBI)Lkm;")
    public static final class120 method3298(class519 arg0, int arg1, int arg2, byte arg3, int arg4) {
        field8236++;
        if (arg0 == null) {
            return null;
        }
        class120 var5 = new class120(arg1, arg4, arg2, arg0.method1382(), arg0.method1392(), arg0.method1376(), arg0.method1390(), arg0.method1406(), arg0.method1378(), arg0.method1362());
        if (arg3 < 48) {
            field8230 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
    public static final void method3299(int arg0) {
        field8237++;
        class480.field6825 = 0;
        if (arg0 != -6551) {
            method3297(-58, -21, false, 127, false);
        }
        class432.field6356.method425(-31);
        class2.field20 = false;
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)V")
    public static final void method3300(int arg0) {
        field8233++;
        for (class17 var1 = (class17) class591.field8389.method950(29); var1 != null; var1 = (class17) class591.field8389.method950(arg0 ^ 0x7F82)) {
            class553.method3104((byte) -89, var1);
        }
        if (arg0 != 32767) {
            method3297(26, -8, false, 123, true);
        }
        int var2;
        int var3;
        if (class202.field2854.method2628((byte) 68, class646.field9388)) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class466.field6714;
            var2 = class466.field6714;
        }
        client.method3510();
        for (int var4 = var2; var4 <= var3; var4++) {
            client.method3522();
            client.method3511(var4);
            client.method3509(var4);
        }
        client.method3519();
        client.method3512();
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)V")
    public static void method3301(boolean arg0) {
        if (!arg0) {
            field8230 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(BI)Ldj;")
    public final class185 method3302(byte arg0, int arg1) {
        field8228++;
        class185 var3 = (class185) this.field8231.method2407(false, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field8229.method3175(arg1 & 0x7FFF, (byte) -53, 0);
        } else {
            var4 = this.field8232.method3175(arg1, (byte) -53, 0);
        }
        class185 var5 = new class185();
        if (arg0 != 31) {
            method3299(-18);
        }
        if (var4 != null) {
            var5.method1241(new class268(var4), false);
        }
        if (arg1 >= 32768) {
            var5.method1239(17064);
        }
        this.field8231.method2408(var5, (long) arg1, -124);
        return var5;
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(ILgp;Lgp;)V")
    public class577(int arg0, class561 arg1, class561 arg2) {
        this.field8229 = arg2;
        this.field8232 = arg1;
        if (this.field8232 != null) {
            this.field8232.method3164(0, true);
        }
        if (this.field8229 != null) {
            this.field8229.method3164(0, true);
        }
    }
}
