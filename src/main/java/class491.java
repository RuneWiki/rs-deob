import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class491 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "F")
    public float field7186 = 0.25F;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "F")
    public float field7197 = 1.0F;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "F")
    public float field7199 = 1.0F;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "F")
    public float field7192;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
    public int field7198;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    public int field7196;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "Ldd;")
    public class654 field7190;

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
    public int field7202;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public int field7191;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "F")
    public float field7195;

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "F")
    public float field7200;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public int field7193;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public int field7189;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "[Li;")
    public static class37[] field7187;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lr;I)V", line = 8)
    public static final void method3003(class167 arg0, int arg1) {
        class329.field5095 = class339.method2324(arg1 ^ 0x2E2F, class382.field5923, true, arg0);
        field7188++;
        class130.field2132 = class145.method1230(arg1 ^ 0xFFFFE6D8, class382.field5923, arg0);
        if (arg1 != -11799) {
            field7187 = null;
        }
        class573.field8183 = class339.method2324(-58, class666.field9430, true, arg0);
        class125.field2057 = class145.method1230(arg1 + 25928, class666.field9430, arg0);
        class246.field3928 = class339.method2324(arg1 + 11741, class471.field6978, true, arg0);
        class35.field508 = class145.method1230(14129, class471.field6978, arg0);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V", line = 28)
    public static void method3004(byte arg0) {
        field7187 = null;
        int var1 = -93 % ((-arg0 - 1) / 53);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILpt;)Z", line = 37)
    public final boolean method3005(int arg0, class491 arg1) {
        field7203++;
        if (arg0 != 11459) {
            this.field7200 = 0.694826F;
        }
        return this.field7191 == arg1.field7191 && this.field7192 == arg1.field7192 && this.field7200 == arg1.field7200 && this.field7195 == arg1.field7195 && this.field7186 == arg1.field7186 && this.field7197 == arg1.field7197 && this.field7199 == arg1.field7199 && this.field7202 == arg1.field7202 && this.field7189 == arg1.field7189 && this.field7190 == arg1.field7190;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V", line = 94)
    public class491() {
        this.field7192 = 1.1523438F;
        this.field7198 = -60;
        this.field7196 = -50;
        this.field7190 = class476.field7059;
        this.field7202 = class22.field349;
        this.field7191 = class11.field184;
        this.field7195 = 1.2F;
        this.field7200 = 0.69921875F;
        this.field7193 = -50;
        this.field7189 = 0;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lie;)V", line = 110)
    public class491(class6 arg0) {
        int var2 = arg0.method70(-9059);
        if (class17.field282.method2127(7525, class497.field7259) && class529.field7721.method267() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field7191 = class11.field184;
            } else {
                this.field7191 = arg0.method72(-26);
            }
            if ((var2 & 0x2) == 0) {
                this.field7192 = 1.1523438F;
            } else {
                this.field7192 = (float) arg0.method67(12021) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field7200 = 0.69921875F;
            } else {
                this.field7200 = (float) arg0.method67(12021) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field7195 = 1.2F;
            } else {
                this.field7195 = (float) arg0.method67(12021) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method72(-73);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method67(12021);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method67(12021);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method67(12021);
            }
            this.field7195 = 1.2F;
            this.field7191 = class11.field184;
            this.field7192 = 1.1523438F;
            this.field7200 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field7198 = -60;
            this.field7193 = -50;
            this.field7196 = -50;
        } else {
            this.field7196 = arg0.method45(-8652);
            this.field7198 = arg0.method45(-8652);
            this.field7193 = arg0.method45(-8652);
        }
        if ((var2 & 0x20) == 0) {
            this.field7202 = class22.field349;
        } else {
            this.field7202 = arg0.method72(-28);
        }
        if ((var2 & 0x40) == 0) {
            this.field7189 = 0;
        } else {
            this.field7189 = arg0.method67(12021);
        }
        if ((var2 & 0x80) == 0) {
            this.field7190 = class476.field7059;
        } else {
            int var3 = arg0.method67(12021);
            int var4 = arg0.method67(12021);
            int var5 = arg0.method67(12021);
            int var6 = arg0.method67(12021);
            int var7 = arg0.method67(12021);
            int var8 = arg0.method67(12021);
            this.field7190 = class247.method1764(var8, var3, 124, var6, var4, var5, var7);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLie;)V", line = 59)
    public final void method3006(byte arg0, class6 arg1) {
        this.field7197 = (float) (arg1.method70(arg0 ^ 0xFFFFDCF9) * 8) / 255.0F;
        field7201++;
        this.field7186 = (float) (arg1.method70(arg0 ^ 0xFFFFDCF9) * 8) / 255.0F;
        if (arg0 != 100) {
            this.field7202 = 39;
        }
        this.field7199 = (float) (arg1.method70(-9059) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)V", line = 75)
    public static final void method3007(int arg0, int arg1) {
        class97.field1570 = arg0;
        class55.field717 = -1;
        field7194++;
        class55.field717 = arg1;
        class555.method3320(-7733);
    }
}
