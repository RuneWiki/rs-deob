import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class318 {

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Lbd;")
    private class334 field4956 = new class334();

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "Lem;")
    private class434 field4961 = new class434();

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    private int field4963;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    private int field4965;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Lru;")
    private class177 field4962;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Lqu;")
    public static class219 field4960 = new class219(3, 15);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIC)I")
    public static final int method2128(int arg0, int arg1, char arg2) {
        field4957++;
        if (arg1 != 0) {
            field4960 = null;
        }
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method2129(int arg0) {
        if (arg0 == 15) {
            field4960 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZJ)Lbd;")
    public final class334 method2130(boolean arg0, long arg1) {
        if (arg0) {
            this.field4956 = null;
        }
        field4958++;
        class334 var4 = (class334) this.field4962.method1122((byte) 59, arg1);
        if (var4 != null) {
            this.field4961.method2731(var4, (byte) 49);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public final void method2131(int arg0) {
        this.field4961.method2730(0);
        field4964++;
        if (arg0 == -29622) {
            this.field4962.method1128(-104);
            this.field4956 = new class334();
            this.field4965 = this.field4963;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lbd;JI)V")
    public final void method2132(class334 arg0, long arg1, int arg2) {
        field4959++;
        if (this.field4965 == 0) {
            class334 var5 = this.field4961.method2735((byte) -114);
            var5.method3149(120);
            var5.method2219(0);
            if (this.field4956 == var5) {
                class334 var6 = this.field4961.method2735((byte) -114);
                var6.method3149(85);
                var6.method2219(0);
            }
        } else {
            this.field4965--;
        }
        this.field4962.method1127(arg0, (byte) 84, arg1);
        this.field4961.method2731(arg0, (byte) 49);
        if (arg2 != 21826) {
            method2129(69);
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)[Lj;")
    public static final class235[] method2133(int arg0) {
        field4955++;
        if (arg0 != -32245) {
            field4960 = null;
        }
        return new class235[] { class6.field70, class206.field3149, class303.field4752 };
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(I)V")
    public class318(int arg0) {
        this.field4963 = arg0;
        this.field4965 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field4962 = new class177(var2);
    }
}
