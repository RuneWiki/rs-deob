import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class160 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "F")
    public float field1913 = 0.25F;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "F")
    public float field1912 = 1.0F;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "F")
    public float field1924 = 1.0F;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public int field1927;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public int field1922;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public int field1919;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public int field1925;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public int field1915;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "F")
    public float field1923;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "F")
    public float field1911;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "F")
    public float field1916;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Laj;")
    public class77 field1920;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Lud;")
    public static class2 field1921 = new class2("RC", 1);

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field1928 = 0;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "Lco;")
    public static class210 field1926 = new class210(32);

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "Lg;")
    public static class470 field1929;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLqe;)Z")
    public final boolean method770(byte arg0, class160 arg1) {
        field1917++;
        if (arg0 == -68) {
            return this.field1922 == arg1.field1922 && this.field1923 == arg1.field1923 && this.field1916 == arg1.field1916 && this.field1911 == arg1.field1911 && this.field1913 == arg1.field1913 && this.field1924 == arg1.field1924 && this.field1912 == arg1.field1912 && this.field1927 == arg1.field1927 && this.field1919 == arg1.field1919 && this.field1920 == arg1.field1920;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILvt;)V")
    public final void method771(int arg0, class179 arg1) {
        this.field1924 = (float) (arg1.method895((byte) -115) * 8) / 255.0F;
        if (arg0 == -13284) {
            field1918++;
            this.field1913 = (float) (arg1.method895((byte) -80) * 8) / 255.0F;
            this.field1912 = (float) (arg1.method895((byte) -90) * 8) / 255.0F;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
    public static final Object method772(int arg0, byte[] arg1, boolean arg2) {
        field1914++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != -30710) {
            field1928 = 47;
        }
        if (arg1.length > 136 && !class468.field6578) {
            try {
                class375 var3 = (class375) Class.forName("hk").getDeclaredConstructor().newInstance();
                var3.method1226(arg1, true);
                return var3;
            } catch (Throwable var4) {
                class468.field6578 = true;
            }
        }
        return arg2 ? class231.method1275(-100, arg1) : arg1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method773(int arg0) {
        field1921 = null;
        if (arg0 != 0) {
            field1928 = -31;
        }
        field1929 = null;
        field1926 = null;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class160() {
        this.field1927 = class481.field6798;
        this.field1922 = class172.field2065;
        this.field1919 = 0;
        this.field1925 = -50;
        this.field1910 = -50;
        this.field1915 = -60;
        this.field1923 = 1.1523438F;
        this.field1911 = 1.2F;
        this.field1916 = 0.69921875F;
        this.field1920 = class12.field180;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lvt;)V")
    public class160(class179 arg0) {
        int var2 = arg0.method895((byte) -91);
        if (class27.field359 && class274.field3912.method1345() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field1922 = class172.field2065;
            } else {
                this.field1922 = arg0.method939((byte) -61);
            }
            if ((var2 & 0x2) == 0) {
                this.field1923 = 1.1523438F;
            } else {
                this.field1923 = (float) arg0.method916(21933) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field1916 = 0.69921875F;
            } else {
                this.field1916 = (float) arg0.method916(21933) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field1911 = 1.2F;
            } else {
                this.field1911 = (float) arg0.method916(21933) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method939((byte) -95);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method916(21933);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method916(21933);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method916(21933);
            }
            this.field1916 = 0.69921875F;
            this.field1911 = 1.2F;
            this.field1923 = 1.1523438F;
            this.field1922 = class172.field2065;
        }
        if ((var2 & 0x10) == 0) {
            this.field1925 = -50;
            this.field1915 = -60;
            this.field1910 = -50;
        } else {
            this.field1925 = arg0.method906(-32);
            this.field1915 = arg0.method906(-52);
            this.field1910 = arg0.method906(-22);
        }
        if ((var2 & 0x20) == 0) {
            this.field1927 = class481.field6798;
        } else {
            this.field1927 = arg0.method939((byte) -124);
        }
        if ((var2 & 0x40) == 0) {
            this.field1919 = 0;
        } else {
            this.field1919 = arg0.method916(21933);
        }
        if ((var2 & 0x80) == 0) {
            this.field1920 = class12.field180;
        } else {
            this.field1920 = class453.method2650(arg0.method916(21933), arg0.method916(21933), arg0.method916(21933), arg0.method916(21933), arg0.method916(21933), false, arg0.method916(21933));
        }
    }

    static {
        new class40("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
    }
}
