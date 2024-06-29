import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class84 {

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "Lmg;")
    public class159 field1194 = new class159();

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "Lfga;")
    public static class269 field1198 = new class269();

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "[Lcm;")
    public static class758[] field1204 = new class758[2048];

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "Lmg;")
    private class159 field1202;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "Ltd;")
    public static class478 field1201;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(BLmg;Lqw;)V")
    private final void method677(byte arg0, class159 arg1, class84 arg2) {
        field1189++;
        class159 var4 = this.field1194.field2144;
        this.field1194.field2144 = arg1.field2144;
        arg1.field2144.field2139 = this.field1194;
        if (arg0 < 35) {
            this.method678(false);
        }
        if (this.field1194 != arg1) {
            arg1.field2144 = arg2.field1194.field2144;
            arg1.field2144.field2139 = arg1;
            var4.field2139 = arg2.field1194;
            arg2.field1194.field2144 = var4;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Z)Lmg;")
    public final class159 method678(boolean arg0) {
        if (arg0) {
            this.method682(null, -45);
        }
        field1199++;
        class159 var2 = this.field1194.field2144;
        if (this.field1194 == var2) {
            this.field1202 = null;
            return null;
        } else {
            this.field1202 = var2.field2144;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)Lmg;")
    public final class159 method679(byte arg0) {
        field1193++;
        class159 var2 = this.field1194.field2139;
        if (this.field1194 == var2) {
            this.field1202 = null;
            return null;
        }
        if (arg0 != -86) {
            field1204 = null;
        }
        this.field1202 = var2.field2139;
        return var2;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIB)Z")
    public static final boolean method680(int arg0, int arg1, byte arg2) {
        field1191++;
        if (class729.method4032(2048, arg0, arg1)) {
            int var3 = 93 / (-arg2 / 57);
            return class469.method2751(0, arg1, arg0) | (arg1 & 0xB000) != 0 | class73.method596(arg0, arg1, (byte) -2) ? true : (arg0 & 0x37) == 0 & (class791.method4325(arg1, arg0, (byte) 104) | class744.method4086(arg1, arg0, -95));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)Lmg;")
    public final class159 method681(int arg0) {
        if (arg0 >= -11) {
            this.method681(97);
        }
        field1190++;
        class159 var2 = this.field1202;
        if (this.field1194 == var2) {
            this.field1202 = null;
            return null;
        } else {
            this.field1202 = var2.field2139;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lqw;I)V")
    public final void method682(class84 arg0, int arg1) {
        this.method677((byte) 108, this.field1194.field2139, arg0);
        field1192++;
        if (arg1 != 0) {
            field1201 = null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)V")
    public static void method683(byte arg0) {
        if (arg0 < -80) {
            field1198 = null;
            field1201 = null;
            field1204 = null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)I")
    public final int method684(int arg0) {
        field1200++;
        int var2 = 0;
        if (arg0 > 0) {
            this.field1202 = null;
        }
        class159 var3 = this.field1194.field2139;
        while (this.field1194 != var3) {
            var3 = var3.field2139;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "(I)Lmg;")
    public final class159 method685(int arg0) {
        field1203++;
        class159 var2 = this.field1202;
        if (this.field1194 == var2) {
            this.field1202 = null;
            return null;
        } else {
            this.field1202 = var2.field2144;
            int var3 = -83 % ((-arg0 - 15) / 38);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILmg;)V")
    public final void method686(int arg0, class159 arg1) {
        if (arg1.field2144 != null) {
            arg1.method1102((byte) 109);
        }
        if (arg0 != -1) {
            this.method681(29);
        }
        field1187++;
        arg1.field2144 = this.field1194;
        arg1.field2139 = this.field1194.field2139;
        arg1.field2144.field2139 = arg1;
        arg1.field2139.field2144 = arg1;
    }

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "(B)Lmg;")
    public final class159 method687(byte arg0) {
        field1196++;
        if (arg0 > -54) {
            this.method689(null, 38);
        }
        class159 var2 = this.field1194.field2139;
        if (this.field1194 == var2) {
            return null;
        } else {
            var2.method1102((byte) 83);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "(I)Z")
    public final boolean method688(int arg0) {
        int var2 = -35 / ((55 - arg0) / 49);
        field1188++;
        return this.field1194.field2139 == this.field1194;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lmg;I)V")
    public final void method689(class159 arg0, int arg1) {
        field1197++;
        if (arg0.field2144 != null) {
            arg0.method1102((byte) 123);
        }
        arg0.field2144 = this.field1194.field2144;
        arg0.field2139 = this.field1194;
        int var3 = -56 % ((54 - arg1) / 44);
        arg0.field2144.field2139 = arg0;
        arg0.field2139.field2144 = arg0;
    }

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "(I)V")
    public final void method690(int arg0) {
        while (true) {
            class159 var2 = this.field1194.field2139;
            if (this.field1194 == var2) {
                field1195++;
                if (arg0 != 20134) {
                    field1201 = null;
                }
                this.field1202 = null;
                return;
            }
            var2.method1102((byte) 71);
        }
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "()V")
    public class84() {
        this.field1194.field2144 = this.field1194;
        this.field1194.field2139 = this.field1194;
    }
}
