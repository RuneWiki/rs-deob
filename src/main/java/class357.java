import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class357 extends class263 {

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public int field4602;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public int field4604;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lcga;")
    public static class449 field4597 = new class449(7, 16);

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "[F")
    public static float[] field4606 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "Lcga;")
    public static class449 field4603 = new class449(11, 8);

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field4610 = 64;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "Lpfa;")
    public static class275 field4609;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z[Lrr;I)V")
    public static final void method2037(boolean arg0, class337[] arg1, int arg2) {
        int var3 = 0;
        if (!arg0) {
            return;
        }
        while (arg1.length > var3) {
            class337 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field4212 == 0) {
                    if (var4.field4179 != null) {
                        method2037(true, var4.field4179, arg2);
                    }
                    class293 var5 = (class293) class216.field2530.method3828((long) var4.field4172, (byte) -91);
                    if (var5 != null) {
                        class654.method3657(var5.field3727, true, arg2);
                    }
                }
                if (arg2 == 0 && var4.field4210 != null) {
                    class402 var6 = new class402();
                    var6.field5154 = var4;
                    var6.field5153 = var4.field4210;
                    class620.method3450(var6);
                }
                if (arg2 == 1 && var4.field4243 != null) {
                    label62: {
                        if (var4.field4310 >= 0) {
                            class337 var7 = class442.method2421(var4.field4172, 79);
                            if (var7 == null || var7.field4179 == null || var4.field4310 >= var7.field4179.length || var7.field4179[var4.field4310] != var4) {
                                break label62;
                            }
                        }
                        class402 var8 = new class402();
                        var8.field5153 = var4.field4243;
                        var8.field5154 = var4;
                        class620.method3450(var8);
                    }
                }
            }
            var3++;
        }
        field4600++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)Z")
    public final boolean method2038(boolean arg0) {
        field4598++;
        if (arg0) {
            field4608 = 79;
        }
        return (this.field4604 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)I")
    public final int method2039(byte arg0) {
        field4599++;
        if (arg0 >= -32) {
            method2037(true, null, 89);
        }
        return (this.field4604 & 0x1D3CDE) >> 18;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
    public static void method2040(byte arg0) {
        field4597 = null;
        field4603 = null;
        if (arg0 != 23) {
            method2037(false, null, -21);
        }
        field4606 = null;
        field4609 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)Z")
    public final boolean method2041(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field4604 = 85;
        }
        field4601++;
        return (this.field4604 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)I")
    public final int method2042(int arg0) {
        if (arg0 > -119) {
            return -96;
        } else {
            field4607++;
            return class342.method1954(5121, this.field4604);
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(II)V")
    public class357(int arg0, int arg1) {
        this.field4602 = arg1;
        this.field4604 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)Z")
    public final boolean method2043(int arg0) {
        field4605++;
        if (arg0 < 53) {
            field4608 = 25;
        }
        return (this.field4604 & 0x344D34) >> 21 != 0;
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)Z")
    public final boolean method2044(int arg0) {
        field4596++;
        if (arg0 <= 80) {
            this.method2044(14);
        }
        return (this.field4604 & 0x1) != 0;
    }
}
