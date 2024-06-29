import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class410 implements class299 {

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "Lcca;")
    private class229 field5540;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "[Lut;")
    private class113[] field5536;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "Lrt;")
    public static class212 field5539 = new class212();

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "[I")
    public static int[] field5541 = new int[200];

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "Lgt;")
    public static class425 field5542 = new class425();

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field5544 = 0;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Loa;")
    private class651 field5534;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "Lhk;")
    public static class91 field5535;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Z")
    private boolean field5538;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)I")
    public final int method1827(int arg0) {
        if (arg0 == 8717) {
            field5530++;
            return this.field5540.field3209;
        } else {
            return -9;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IJ)Z")
    public final boolean method1823(int arg0, long arg1) {
        field5543++;
        if (arg0 == -29765) {
            return ((long) this.field5540.field3206 + arg1) <= class681.method3802(-23600);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZB)V")
    public final void method1824(boolean arg0, byte arg1) {
        boolean var3 = true;
        field5531++;
        if (arg1 > -83) {
            method2347((byte) 62);
        }
        class113[] var4 = this.field5536;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class113 var6 = var4[var5];
            if (var6 != null) {
                var6.method912(var3 || this.field5538, -20667);
            }
        }
        this.field5538 = false;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public final void method1825(byte arg0) {
        if (arg0 < 35) {
            method2347((byte) -110);
        }
        field5533++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)I")
    public final int method1826(int arg0) {
        field5537++;
        int var2 = 0;
        class113[] var3 = this.field5536;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class113 var5 = var3[var4];
            if (var5 == null || var5.method913(arg0 ^ 0x8FF)) {
                var2++;
            }
        }
        if (arg0 != 2265) {
            field5544 = 12;
        }
        return var2 * 100 / this.field5536.length;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
    public static void method2347(byte arg0) {
        field5539 = null;
        field5542 = null;
        field5541 = null;
        if (arg0 >= -75) {
            method2347((byte) -121);
        }
        field5535 = null;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
    public final void method1828(byte arg0) {
        if (class10.field197 != this.field5534) {
            this.field5534 = class10.field197;
            this.field5538 = true;
        }
        field5532++;
        this.field5534.method87(0);
        class113[] var2 = this.field5536;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class113 var4 = var2[var3];
            if (var4 != null) {
                var4.method911((byte) -13);
            }
        }
        if (arg0 < 29) {
            this.method1827(99);
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lcca;Lpfa;)V")
    public class410(class229 arg0, class273 arg1) {
        this.field5540 = arg0;
        this.field5536 = new class113[this.field5540.field3210.length];
        for (int var3 = 0; var3 < this.field5536.length; var3++) {
            this.field5536[var3] = arg1.method1658(1, this.field5540.field3210[var3]);
        }
    }
}
