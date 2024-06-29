import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class248 {

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "F")
    public float field3855 = 0.25F;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "F")
    public float field3844 = 1.0F;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "F")
    public float field3853 = 1.0F;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "F")
    public float field3852;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public int field3850;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "F")
    public float field3848;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public int field3849;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public int field3843;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public int field3839;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "F")
    public float field3851;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public int field3847;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Ljba;")
    public class363 field3842;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "[B")
    public static byte[] field3857;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "Lnea;")
    public static class664 field3858;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "Lla;")
    public static class416 field3861;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "[I")
    public static int[] field3860;

    static {
        int var0 = 0;
        field3857 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3857[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field3858 = new class664(92, 1);
        field3859 = 100;
        field3862 = 0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILmo;)V", line = 9)
    public final void method1667(int arg0, class695 arg1) {
        field3845++;
        this.field3844 = (float) (arg0 * arg1.method3826(false)) / 255.0F;
        this.field3855 = (float) (arg1.method3826(false) * 8) / 255.0F;
        this.field3853 = (float) (arg1.method3826(false) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 24)
    public static void method1668(byte arg0) {
        field3857 = null;
        field3861 = null;
        field3858 = null;
        if (arg0 <= -70) {
            field3860 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)[Ltf;", line = 40)
    public static final class264[] method1669(int arg0) {
        if (arg0 == -34) {
            field3841++;
            return new class264[] { class577.field8128, class203.field2872, class462.field6647, class486.field6915, class595.field8419, class150.field2173, class382.field5391, class8.field77, class488.field6934, class294.field4325, class263.field3994, class360.field5168, class153.field2208, class360.field5174, class466.field6707 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V", line = 54)
    public static final void method1670(byte arg0) {
        if (arg0 >= 116) {
            field3856++;
            class127.method959(16);
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V", line = 132)
    public class248() {
        this.field3852 = 0.69921875F;
        this.field3850 = 0;
        this.field3848 = 1.2F;
        this.field3849 = class114.field1748;
        this.field3843 = -60;
        this.field3839 = -50;
        this.field3851 = 1.1523438F;
        this.field3847 = -50;
        this.field3846 = class571.field8044;
        this.field3842 = class53.field1050;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lmo;)V", line = 150)
    public class248(class695 arg0) {
        int var2 = arg0.method3826(false);
        if (class287.field4270.method1624(10814, class328.field4859) && class512.field7202.method173() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field3849 = class114.field1748;
            } else {
                this.field3849 = arg0.method3880(8);
            }
            if ((var2 & 0x2) == 0) {
                this.field3851 = 1.1523438F;
            } else {
                this.field3851 = (float) arg0.method3847((byte) 118) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field3852 = 0.69921875F;
            } else {
                this.field3852 = (float) arg0.method3847((byte) 118) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field3848 = 1.2F;
            } else {
                this.field3848 = (float) arg0.method3847((byte) 118) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method3880(8);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method3847((byte) 118);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method3847((byte) 118);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method3847((byte) 118);
            }
            this.field3851 = 1.1523438F;
            this.field3848 = 1.2F;
            this.field3849 = class114.field1748;
            this.field3852 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field3839 = -50;
            this.field3843 = -60;
            this.field3847 = -50;
        } else {
            this.field3847 = arg0.method3814(false);
            this.field3843 = arg0.method3814(false);
            this.field3839 = arg0.method3814(false);
        }
        if ((var2 & 0x20) == 0) {
            this.field3846 = class571.field8044;
        } else {
            this.field3846 = arg0.method3880(8);
        }
        if ((var2 & 0x40) == 0) {
            this.field3850 = 0;
        } else {
            this.field3850 = arg0.method3847((byte) 118);
        }
        if ((var2 & 0x80) == 0) {
            this.field3842 = class53.field1050;
        } else {
            int var3 = arg0.method3847((byte) 118);
            int var4 = arg0.method3847((byte) 118);
            int var5 = arg0.method3847((byte) 118);
            int var6 = arg0.method3847((byte) 118);
            int var7 = arg0.method3847((byte) 118);
            int var8 = arg0.method3847((byte) 118);
            this.field3842 = class202.method1338(var7, var6, var5, var8, true, var4, var3);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILgf;)Z", line = 71)
    public final boolean method1671(int arg0, class248 arg1) {
        field3854++;
        int var3 = -84 % ((-arg0 - 25) / 63);
        return this.field3849 == arg1.field3849 && this.field3851 == arg1.field3851 && this.field3852 == arg1.field3852 && this.field3848 == arg1.field3848 && this.field3855 == arg1.field3855 && this.field3844 == arg1.field3844 && this.field3853 == arg1.field3853 && this.field3846 == arg1.field3846 && this.field3850 == arg1.field3850 && this.field3842 == arg1.field3842;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 81)
    public static final String method1672(boolean arg0) {
        field3840++;
        if (class623.field8731 || class305.field4531 == null) {
            return "";
        } else {
            if (!arg0) {
                method1668((byte) 56);
            }
            return class305.field4531.field4210;
        }
    }
}
