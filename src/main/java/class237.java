import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class237 {

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Z")
    public boolean field4395 = true;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public int field4389;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public int field4391;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public int field4390;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public int field4403;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public int field4401;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Ldj;")
    public static class44 field4393 = class89.method650(255, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Ldj;")
    public static class44 field4394 = class89.method650(255, "");

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "[I")
    public static int[] field4402 = new int[500];

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field4399 = 0;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "Ldj;")
    public static class44 field4404 = class89.method650(255, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Lbc;")
    public static class15 field4397;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Lbc;")
    public static class15 field4400;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "[I")
    public static int[] field4388;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)Lbg;")
    public static final class19 method1539(byte arg0, int arg1) {
        if (arg0 != -52) {
            method1539((byte) -107, 79);
        }
        field4396++;
        class19 var2 = (class19) class90.field1704.method1178((long) arg1, arg0 ^ 0xFFFFC8AC);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class74.field1427.method1466(5, arg1, (byte) -122);
        class19 var4 = new class19();
        if (var3 != null) {
            var4.method152((byte) 127, new class66(var3));
        }
        class90.field1704.method1183((byte) 103, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method1540(int arg0) {
        field4404 = null;
        field4402 = null;
        field4397 = null;
        field4400 = null;
        field4393 = null;
        field4394 = null;
        field4388 = null;
        if (arg0 != 5) {
            method1541(76, null);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILfj;)Lhd;")
    public static final class81 method1541(int arg0, class66 arg1) {
        field4392++;
        return arg0 == 0 ? new class81(arg1.method514((byte) 117), arg1.method514((byte) -117), arg1.method514((byte) -74), arg1.method514((byte) -70), arg1.method514((byte) -117), arg1.method514((byte) -112), arg1.method514((byte) -124), arg1.method514((byte) 123), arg1.method480(111), arg1.method506(255)) : null;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4389 = arg4;
        this.field4391 = arg5;
        this.field4390 = arg2;
        this.field4403 = arg0;
        this.field4395 = arg6;
        this.field4401 = arg3;
        this.field4387 = arg1;
    }
}
