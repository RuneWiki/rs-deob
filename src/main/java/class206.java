import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class206 {

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lku;")
    public class347 field3152 = new class347();

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Laj;")
    public static class287 field3155 = new class287(4);

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field3160 = -1;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lsb;")
    public static class266 field3161 = new class266(41, -1);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lku;")
    private class347 field3159;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)Lku;")
    public final class347 method1446(byte arg0) {
        if (arg0 < 88) {
            this.field3152 = null;
        }
        field3154++;
        class347 var2 = this.field3152.field5168;
        if (this.field3152 == var2) {
            this.field3159 = null;
            return null;
        } else {
            this.field3159 = var2.field5168;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lku;B)V")
    public final void method1447(class347 arg0, byte arg1) {
        field3156++;
        if (arg0.field5165 != null) {
            arg0.method2253(-14315);
        }
        arg0.field5165 = this.field3152.field5165;
        arg0.field5168 = this.field3152;
        if (arg1 != -48) {
            this.method1449(-50);
        }
        arg0.field5165.field5168 = arg0;
        arg0.field5168.field5165 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
    public static void method1448(byte arg0) {
        field3161 = null;
        field3155 = null;
        if (arg0 != 106) {
            method1448((byte) 66);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)I")
    public final int method1449(int arg0) {
        field3151++;
        int var2 = 0;
        class347 var3 = this.field3152.field5168;
        if (arg0 < 36) {
            return 70;
        }
        while (this.field3152 != var3) {
            var3 = var3.field5168;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public final void method1450(int arg0) {
        if (arg0 != 15847) {
            return;
        }
        field3157++;
        while (true) {
            class347 var2 = this.field3152.field5168;
            if (this.field3152 == var2) {
                this.field3159 = null;
                return;
            }
            var2.method2253(-14315);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lru;BLru;)V")
    public static final void method1451(class177 arg0, byte arg1, class177 arg2) {
        int var3 = 122 / ((-arg1 - 81) / 37);
        field3150++;
        if (arg0.field2887 != null) {
            arg0.method1318(8);
        }
        arg0.field2887 = arg2.field2887;
        arg0.field2889 = arg2;
        arg0.field2887.field2889 = arg0;
        arg0.field2889.field2887 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)Lku;")
    public final class347 method1452(int arg0) {
        field3153++;
        class347 var2 = this.field3159;
        if (this.field3152 == var2) {
            this.field3159 = null;
            return null;
        } else {
            this.field3159 = var2.field5168;
            return arg0 == 26832 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class206() {
        this.field3152.field5165 = this.field3152;
        this.field3152.field5168 = this.field3152;
    }
}
