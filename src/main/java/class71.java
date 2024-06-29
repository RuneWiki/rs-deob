import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class71 {

    @OriginalMember(owner = "client!naa", name = "l", descriptor = "F")
    public float field754 = 0.25F;

    @OriginalMember(owner = "client!naa", name = "k", descriptor = "F")
    public float field753 = 1.0F;

    @OriginalMember(owner = "client!naa", name = "o", descriptor = "F")
    public float field757 = 1.0F;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "F")
    public float field745;

    @OriginalMember(owner = "client!naa", name = "i", descriptor = "F")
    public float field751;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "F")
    public float field743;

    @OriginalMember(owner = "client!naa", name = "s", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
    public int field747;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "Lkm;")
    public class353 field744;

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!naa", name = "n", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "client!naa", name = "t", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!naa", name = "m", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
    public static int field746 = 0;

    @OriginalMember(owner = "client!naa", name = "q", descriptor = "I")
    public static int field759 = -1;

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "F")
    public static float field750;

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!naa", name = "j", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!naa", name = "p", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!naa", name = "r", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lnaa;B)Z", line = 7)
    public final boolean method521(class71 arg0, byte arg1) {
        if (arg1 != 88) {
            this.field756 = 85;
        }
        field760++;
        return this.field762 == arg0.field762 && this.field743 == arg0.field743 && this.field751 == arg0.field751 && this.field745 == arg0.field745 && this.field754 == arg0.field754 && this.field757 == arg0.field757 && this.field753 == arg0.field753 && this.field749 == arg0.field749 && this.field747 == arg0.field747 && this.field744 == arg0.field744;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIIIIIII)V", line = 30)
    public static final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field752++;
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class480.field6868 + ((class489.field6977 - class480.field6868) * var8 / 100);
        class586.field8268 = class586.field8269 * var9 >> 8;
        int var10 = arg2 * var9 >> 8;
        int var11 = 16384 - arg3 & 0x3FFF;
        int var12 = 16384 - arg0 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class260.field3230[var11] * -var10 >> 14;
            var15 = class260.field3229[var11] * var10 >> 14;
        }
        if (~var12 != arg1) {
            var13 = class260.field3230[var12] * var15 >> 14;
            var15 = class260.field3229[var12] * var15 >> 14;
        }
        class522.field7423 = 0;
        class27.field281 = arg3;
        class152.field1670 = arg0;
        class590.field8319 = arg7 - var15;
        class204.field2409 = arg6 - var14;
        class167.field1855 = arg5 - var13;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(BLig;)V", line = 85)
    public final void method523(byte arg0, class244 arg1) {
        if (arg0 != 85) {
            this.field743 = -0.24899614F;
        }
        this.field757 = (float) (arg1.method1423(arg0 - 102) * 8) / 255.0F;
        field748++;
        this.field754 = (float) (arg1.method1423(-84) * 8) / 255.0F;
        this.field753 = (float) (arg1.method1423(arg0 ^ 0xFFFFFF9E) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "()V", line = 113)
    public class71() {
        this.field745 = 1.2F;
        this.field751 = 0.69921875F;
        this.field743 = 1.1523438F;
        this.field761 = -50;
        this.field747 = 0;
        this.field744 = class231.field2699;
        this.field749 = class66.field673;
        this.field756 = -60;
        this.field762 = class221.field2544;
        this.field755 = -50;
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lig;)V", line = 129)
    public class71(class244 arg0) {
        int var2 = arg0.method1423(-68);
        if (class654.field9334.field9844.method900(125) == 1 && class82.field858.method350() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field762 = class221.field2544;
            } else {
                this.field762 = arg0.method1438(102);
            }
            if ((var2 & 0x2) == 0) {
                this.field743 = 1.1523438F;
            } else {
                this.field743 = (float) arg0.method1476(-87) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field751 = 0.69921875F;
            } else {
                this.field751 = (float) arg0.method1476(12) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field745 = 1.2F;
            } else {
                this.field745 = (float) arg0.method1476(-93) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1438(98);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1476(91);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1476(-103);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1476(2);
            }
            this.field743 = 1.1523438F;
            this.field751 = 0.69921875F;
            this.field745 = 1.2F;
            this.field762 = class221.field2544;
        }
        if ((var2 & 0x10) == 0) {
            this.field756 = -60;
            this.field761 = -50;
            this.field755 = -50;
        } else {
            this.field761 = arg0.method1466((byte) 31);
            this.field756 = arg0.method1466((byte) 31);
            this.field755 = arg0.method1466((byte) 31);
        }
        if ((var2 & 0x20) == 0) {
            this.field749 = class66.field673;
        } else {
            this.field749 = arg0.method1438(88);
        }
        if ((var2 & 0x40) == 0) {
            this.field747 = 0;
        } else {
            this.field747 = arg0.method1476(-119);
        }
        if ((var2 & 0x80) == 0) {
            this.field744 = class231.field2699;
        } else {
            int var3 = arg0.method1476(-126);
            int var4 = arg0.method1476(-96);
            int var5 = arg0.method1476(51);
            int var6 = arg0.method1476(-116);
            int var7 = arg0.method1476(-110);
            int var8 = arg0.method1476(98);
            this.field744 = class78.method550(var5, var7, var4, var8, 30154, var6, var3);
        }
    }
}
