import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class118 extends class303 {

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lmga;")
    public static class739 field1688 = new class739(2, -1);

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "Ljw;")
    public static class581 field1714 = new class581(125, 8);

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
    public static int field1724 = -1;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "F")
    public float field1690;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "F")
    public float field1693;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "F")
    public float field1695;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "F")
    public float field1697;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "F")
    public float field1702;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "F")
    public float field1705;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "F")
    public float field1708;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "F")
    public float field1709;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "F")
    public float field1710;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "F")
    public float field1715;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "F")
    public float field1717;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "F")
    public float field1719;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()Luu;")
    public final class303 method963() {
        field1687++;
        class118 var1 = new class118();
        var1.field1709 = this.field1709;
        var1.field1690 = this.field1690;
        var1.field1710 = this.field1710;
        var1.field1695 = this.field1695;
        var1.field1705 = this.field1705;
        var1.field1715 = this.field1715;
        var1.field1717 = this.field1717;
        var1.field1697 = this.field1697;
        var1.field1702 = this.field1702;
        var1.field1693 = this.field1693;
        var1.field1708 = this.field1708;
        var1.field1719 = this.field1719;
        return var1;
    }

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)V")
    public static void method964(int arg0) {
        field1688 = null;
        field1714 = null;
        if (arg0 != 1) {
            method964(23);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BFFFIII)V")
    public final void method965(byte arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6) {
        if (arg6 == 0) {
            this.field1695 = this.field1690 = this.field1705 = this.field1715 = this.field1710 = this.field1717 = 0.0F;
            this.field1697 = arg4;
            this.field1708 = 1.0F;
            this.field1693 = arg5;
        } else {
            float var8 = class744.field10275[arg6 & 0x3FFF];
            float var9 = class744.field10272[arg6 & 0x3FFF];
            this.field1695 = (float) arg4 * var9;
            this.field1705 = (float) arg5 * -var9;
            this.field1708 = 1.0F;
            this.field1697 = (float) arg4 * var8;
            this.field1690 = this.field1715 = this.field1710 = this.field1717 = 0.0F;
            this.field1693 = (float) arg5 * var8;
        }
        if (arg0 <= -107) {
            field1722++;
            this.field1702 = arg3;
            this.field1719 = arg1;
            this.field1709 = arg2;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLuu;)V")
    public final void method966(byte arg0, class303 arg1) {
        field1720++;
        int var3 = 7 / ((75 - arg0) / 44);
        class118 var4 = (class118) arg1;
        this.field1705 = var4.field1695;
        this.field1697 = var4.field1697;
        this.field1710 = var4.field1690;
        this.field1717 = var4.field1715;
        this.field1695 = var4.field1705;
        this.field1690 = var4.field1710;
        this.field1693 = var4.field1693;
        this.field1702 = -(this.field1710 * var4.field1709 + this.field1705 * var4.field1719 + this.field1697 * var4.field1702);
        this.field1715 = var4.field1717;
        this.field1708 = var4.field1708;
        this.field1719 = -(this.field1717 * var4.field1709 + this.field1695 * var4.field1702 + this.field1693 * var4.field1719);
        this.field1709 = -(this.field1708 * var4.field1709 + this.field1715 * var4.field1719 + this.field1690 * var4.field1702);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()V")
    public final void method967() {
        field1706++;
        this.field1697 = this.field1693 = this.field1708 = 1.0F;
        this.field1695 = this.field1690 = this.field1705 = this.field1715 = this.field1710 = this.field1717 = this.field1702 = this.field1719 = this.field1709 = 0.0F;
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
    public final void method968(int arg0) {
        field1704++;
        float var2 = class744.field10275[arg0 & 0x3FFF];
        float var3 = class744.field10272[arg0 & 0x3FFF];
        float var4 = this.field1697;
        float var5 = this.field1705;
        float var6 = this.field1710;
        float var7 = this.field1702;
        this.field1697 = var2 * var4 - this.field1695 * var3;
        this.field1695 = this.field1695 * var2 + var3 * var4;
        this.field1705 = var2 * var5 - (this.field1693 * var3);
        this.field1710 = var2 * var6 - (this.field1717 * var3);
        this.field1693 = this.field1693 * var2 + var3 * var5;
        this.field1717 = this.field1717 * var2 + var3 * var6;
        this.field1702 = var2 * var7 - (this.field1719 * var3);
        this.field1719 = this.field1719 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
    public final void method969(int arg0) {
        field1696++;
        float var2 = class744.field10275[arg0 & 0x3FFF];
        float var3 = class744.field10272[arg0 & 0x3FFF];
        float var4 = this.field1697;
        float var5 = this.field1705;
        float var6 = this.field1710;
        float var7 = this.field1702;
        this.field1697 = this.field1690 * var3 + var2 * var4;
        this.field1705 = this.field1715 * var3 + var2 * var5;
        this.field1690 = this.field1690 * var2 - (var3 * var4);
        this.field1715 = this.field1715 * var2 - (var3 * var5);
        this.field1710 = this.field1708 * var3 + var2 * var6;
        this.field1708 = this.field1708 * var2 - var3 * var6;
        this.field1702 = this.field1709 * var3 + var2 * var7;
        this.field1709 = this.field1709 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)V")
    public final void method970(int arg0, int arg1, int arg2) {
        this.field1702 += arg0;
        this.field1709 += arg2;
        this.field1719 += arg1;
        field1712++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[FFFFF)V")
    public final void method971(int arg0, float[] arg1, float arg2, float arg3, float arg4, float arg5) {
        field1691++;
        if (arg0 != -27186) {
            this.method981(-117, -19, 37);
        }
        arg1[2] = this.field1708 * arg4 + this.field1715 * arg2 + this.field1690 * arg3;
        float var8;
        float var9;
        float var10;
        if ((arg3 > 0.00390625F) || (arg3 < -0.00390625F)) {
            float var12 = -arg5 / arg3;
            var10 = this.field1695 * var12 + this.field1719;
            var9 = this.field1690 * var12 + this.field1709;
            var8 = this.field1697 * var12 + this.field1702;
        } else if ((arg2 > 0.00390625F) || (arg2 < -0.00390625F)) {
            float var11 = -arg5 / arg2;
            var8 = this.field1705 * var11 + this.field1702;
            var10 = this.field1693 * var11 + this.field1719;
            var9 = this.field1715 * var11 + this.field1709;
        } else {
            float var7 = -arg5 / arg4;
            var8 = this.field1710 * var7 + this.field1702;
            var9 = this.field1708 * var7 + this.field1709;
            var10 = this.field1717 * var7 + this.field1719;
        }
        arg1[1] = this.field1717 * arg4 + this.field1695 * arg3 + this.field1693 * arg2;
        arg1[0] = this.field1710 * arg4 + this.field1705 * arg2 + this.field1697 * arg3;
        arg1[3] = -(arg1[2] * var9 + arg1[1] * var10 + arg1[0] * var8);
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V")
    public final void method972(int arg0) {
        this.field1697 = 1.0F;
        field1713++;
        this.field1693 = this.field1708 = class744.field10275[arg0 & 0x3FFF];
        this.field1715 = class744.field10272[arg0 & 0x3FFF];
        this.field1717 = -this.field1715;
        this.field1705 = this.field1710 = this.field1702 = this.field1695 = this.field1719 = this.field1690 = this.field1709 = 0.0F;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(III)V")
    public static final void method973(int arg0, int arg1, int arg2) {
        class670.field9427 = arg0;
        field1689++;
        if (arg2 <= 93) {
            method964(-33);
        }
        class564.field7561 = arg1;
        if (class669.field9399 == 0) {
            class756.field10491 = class670.field9427 + (class38.field584 * 2);
            class688.field9675 = class111.field1526 * 2 + class564.field7561;
        } else if (class669.field9399 == 1) {
            class40.field637 = class670.field9427 / class462.field6403 + class645.field8956 + 2;
            class704.field9863 = class564.field7561 / class639.field8876 + class265.field3925 + 2;
            class756.field10491 = class462.field6403 * class40.field637;
            class688.field9675 = class704.field9863 * class639.field8876;
            class38.field584 = class756.field10491 - class670.field9427 >> 1;
            class111.field1526 = class688.field9675 - class564.field7561 >> 1;
        } else if (class669.field9399 == 2) {
            class756.field10491 = class670.field9427;
            class688.field9675 = class564.field7561;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(III[I)V")
    public final void method974(int arg0, int arg1, int arg2, int[] arg3) {
        field1699++;
        arg3[1] = (int) ((float) arg2 * this.field1717 + (float) arg0 * this.field1695 + (float) arg1 * this.field1693);
        arg3[2] = (int) ((float) arg2 * this.field1708 + (float) arg0 * this.field1690 + (float) arg1 * this.field1715);
        arg3[0] = (int) ((float) arg2 * this.field1710 + (float) arg0 * this.field1697 + (float) arg1 * this.field1705);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[I)V")
    public final void method975(int arg0, int arg1, int arg2, int[] arg3) {
        field1723++;
        arg3[0] = (int) ((float) arg2 * this.field1710 + (float) arg0 * this.field1697 + (float) arg1 * this.field1705 + this.field1702);
        arg3[1] = (int) ((float) arg2 * this.field1717 + (float) arg0 * this.field1695 + (float) arg1 * this.field1693 + this.field1719);
        arg3[2] = (int) ((float) arg2 * this.field1708 + (float) arg0 * this.field1690 + (float) arg1 * this.field1715 + this.field1709);
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
    public final void method976(int arg0) {
        this.field1708 = 1.0F;
        field1694++;
        this.field1697 = this.field1693 = class744.field10275[arg0 & 0x3FFF];
        this.field1695 = class744.field10272[arg0 & 0x3FFF];
        this.field1705 = -this.field1695;
        this.field1710 = this.field1702 = this.field1717 = this.field1719 = this.field1690 = this.field1715 = this.field1709 = 0.0F;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)[F")
    public final float[] method977(byte arg0) {
        field1701++;
        class514.field7043[12] = 0.0F;
        class514.field7043[1] = this.field1695;
        class514.field7043[2] = this.field1690;
        class514.field7043[10] = this.field1708;
        class514.field7043[6] = this.field1715;
        if (arg0 != 76) {
            return null;
        }
        class514.field7043[5] = this.field1693;
        class514.field7043[14] = 0.0F;
        class514.field7043[0] = this.field1697;
        class514.field7043[8] = this.field1710;
        class514.field7043[4] = this.field1705;
        class514.field7043[13] = 0.0F;
        class514.field7043[9] = this.field1717;
        return class514.field7043;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    public final void method978(int arg0) {
        field1716++;
        float var2 = class744.field10275[arg0 & 0x3FFF];
        float var3 = class744.field10272[arg0 & 0x3FFF];
        float var4 = this.field1695;
        float var5 = this.field1693;
        float var6 = this.field1717;
        this.field1695 = var2 * var4 - (this.field1690 * var3);
        float var7 = this.field1719;
        this.field1690 = this.field1690 * var2 + var3 * var4;
        this.field1693 = var2 * var5 - this.field1715 * var3;
        this.field1715 = this.field1715 * var2 + var3 * var5;
        this.field1717 = var2 * var6 - this.field1708 * var3;
        this.field1708 = this.field1708 * var2 + var3 * var6;
        this.field1719 = var2 * var7 - this.field1709 * var3;
        this.field1709 = this.field1709 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(III[I)V")
    public final void method979(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg1 - this.field1719);
        int var6 = (int) ((float) arg0 - this.field1702);
        int var7 = (int) ((float) arg2 - this.field1709);
        field1692++;
        arg3[1] = (int) ((float) var7 * this.field1715 + (float) var5 * this.field1693 + (float) var6 * this.field1705);
        arg3[0] = (int) ((float) var7 * this.field1690 + (float) var5 * this.field1695 + (float) var6 * this.field1697);
        arg3[2] = (int) ((float) var7 * this.field1708 + (float) var5 * this.field1717 + (float) var6 * this.field1710);
    }

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "(I)V")
    public final void method980(int arg0) {
        this.field1708 = -this.field1708;
        field1707++;
        if (arg0 < 122) {
            this.method977((byte) 42);
        }
        this.field1719 = -this.field1719;
        this.field1715 = -this.field1715;
        this.field1693 = -this.field1693;
        this.field1709 = -this.field1709;
        this.field1690 = -this.field1690;
        this.field1717 = -this.field1717;
        this.field1695 = -this.field1695;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class118() {
        this.method967();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
    public final void method981(int arg0, int arg1, int arg2) {
        this.field1719 = arg1;
        this.field1697 = this.field1693 = this.field1708 = 1.0F;
        field1698++;
        this.field1709 = arg2;
        this.field1695 = this.field1690 = this.field1705 = this.field1715 = this.field1710 = this.field1717 = 0.0F;
        this.field1702 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([I)V")
    public final void method982(int[] arg0) {
        field1700++;
        float var2 = (float) arg0[0] - this.field1702;
        float var3 = (float) arg0[1] - this.field1719;
        float var4 = (float) arg0[2] - this.field1709;
        arg0[1] = (int) (this.field1715 * var4 + this.field1705 * var2 + this.field1693 * var3);
        arg0[0] = (int) (this.field1690 * var4 + this.field1697 * var2 + this.field1695 * var3);
        arg0[2] = (int) (this.field1708 * var4 + this.field1717 * var3 + this.field1710 * var2);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)[F")
    public final float[] method983(boolean arg0) {
        class514.field7043[13] = this.field1719;
        class514.field7043[6] = this.field1715;
        class514.field7043[8] = this.field1710;
        class514.field7043[0] = this.field1697;
        class514.field7043[4] = this.field1705;
        class514.field7043[12] = this.field1702;
        class514.field7043[2] = this.field1690;
        field1711++;
        class514.field7043[10] = this.field1708;
        if (arg0) {
            return null;
        }
        class514.field7043[9] = this.field1717;
        class514.field7043[14] = this.field1709;
        class514.field7043[5] = this.field1693;
        class514.field7043[1] = this.field1695;
        return class514.field7043;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIII)V")
    public final void method984(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1703++;
        float var7 = class744.field10275[arg3 & 0x3FFF];
        float var8 = class744.field10272[arg3 & 0x3FFF];
        float var9 = class744.field10275[arg4 & 0x3FFF];
        float var10 = class744.field10272[arg4 & 0x3FFF];
        float var11 = class744.field10275[arg5 & 0x3FFF];
        float var12 = class744.field10272[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1715 = -var8;
        this.field1717 = var9 * var13 + var10 * var12;
        this.field1710 = -var10 * var11 + var9 * var14;
        this.field1708 = var7 * var9;
        this.field1690 = var7 * var10;
        this.field1693 = var7 * var11;
        this.field1695 = -var9 * var12 + var10 * var13;
        this.field1697 = var9 * var11 + var10 * var14;
        this.field1705 = var7 * var12;
        this.field1702 = (float) (-arg0) * this.field1697 - (float) arg1 * this.field1705 - (float) arg2 * this.field1710;
        this.field1719 = (float) (-arg0) * this.field1695 - ((float) arg1 * this.field1693) - (float) arg2 * this.field1717;
        this.field1709 = (float) (-arg0) * this.field1690 - (float) arg1 * this.field1715 - ((float) arg2 * this.field1708);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public final void method985(int arg0) {
        this.field1693 = 1.0F;
        field1721++;
        this.field1697 = this.field1708 = class744.field10275[arg0 & 0x3FFF];
        this.field1710 = class744.field10272[arg0 & 0x3FFF];
        this.field1705 = this.field1702 = this.field1695 = this.field1717 = this.field1719 = this.field1715 = this.field1709 = 0.0F;
        this.field1690 = -this.field1710;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Luu;)V")
    public final void method986(class303 arg0) {
        field1718++;
        class118 var2 = (class118) arg0;
        this.field1705 = var2.field1705;
        this.field1709 = var2.field1709;
        this.field1702 = var2.field1702;
        this.field1693 = var2.field1693;
        this.field1708 = var2.field1708;
        this.field1719 = var2.field1719;
        this.field1695 = var2.field1695;
        this.field1715 = var2.field1715;
        this.field1710 = var2.field1710;
        this.field1690 = var2.field1690;
        this.field1697 = var2.field1697;
        this.field1717 = var2.field1717;
    }
}
