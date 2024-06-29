import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class116 extends class516 {

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field1634;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "[I")
    public static int[] field1638;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Lhh;")
    public static class111 field1639;

    static {
        new class572((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
        field1634 = new String[5];
        field1632 = 0;
        field1638 = new int[5];
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lpb;II)V", line = 4)
    public final void method202(class563 arg0, int arg1, int arg2) {
        ++field1627;
        if (arg2 == -1) {
            super.field7353.method2632(arg0, 0);
            super.field7353.method2698(arg1, 1);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V", line = 16)
    public final void method200(int arg0, int arg1, int arg2) {
        int var4 = -44 / ((-41 - arg0) / 57);
        ++field1637;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)V", line = 25)
    public static void method831(byte arg0) {
        if (arg0 <= -98) {
            field1639 = null;
            field1638 = null;
            field1634 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V", line = 37)
    public static final void method832(int arg0) {
        ++field1636;
        if (class625.field9211 != -1 && ~class100.field1461 != 0) {
            int var1 = class416.field5643 - -((-class416.field5643 + class386.field5313) * class355.field4839 >> 16);
            class355.field4839 += var1;
            if (~class355.field4839 <= -65536) {
                if (!class518.field7388) {
                    class559.field8304 = true;
                } else {
                    class559.field8304 = false;
                }
                class355.field4839 = 65535;
                class518.field7388 = true;
            } else {
                class559.field8304 = false;
                class518.field7388 = false;
            }
            float var2 = (float) class355.field4839 / 65535.0F;
            float[] var3 = new float[arg0];
            int var4 = class352.field4800 * 2;
            for (int var5 = 0; ~var5 > -4; ++var5) {
                int var21 = class27.field300[class625.field9211][var4][var5] * 3;
                int var22 = class27.field300[class625.field9211][var4 + 1][var5] * 3;
                int var23 = (-class27.field300[class625.field9211][var4 + 3][var5] - -class27.field300[class625.field9211][var4 - -2][var5] + class27.field300[class625.field9211][var4 - -2][var5]) * 3;
                int var24 = class27.field300[class625.field9211][var4][var5];
                int var25 = -var21 + var22;
                int var26 = -(var22 * 2) - -var23 + var21;
                int var27 = class27.field300[class625.field9211][var4 + 2][var5] + -var23 - (-var22 + var24);
                var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
            }
            class125.field1760 = (int) var3[0] + -(class473.field6687 * 128);
            class214.field3161 = (int) var3[2] - class38.field463 * 128;
            class118.field1665 = (int) var3[1] * -1;
            float[] var6 = new float[3];
            int var7 = class20.field191 * 2;
            for (int var8 = 0; var8 < 3; ++var8) {
                int var14 = class27.field300[class100.field1461][var7][var8] * 3;
                int var15 = class27.field300[class100.field1461][var7 + 1][var8] * 3;
                int var16 = (class27.field300[class100.field1461][var7 - -2][var8] + -class27.field300[class100.field1461][var7 + 3][var8] + class27.field300[class100.field1461][var7 - -2][var8]) * 3;
                int var17 = class27.field300[class100.field1461][var7][var8];
                int var18 = var15 - var14;
                int var19 = -(var15 * 2) + var14 + var16;
                int var20 = class27.field300[class100.field1461][var7 + 2][var8] + var15 - var17 + -var16;
                var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
            }
            float var9 = var6[0] + -var3[0];
            float var10 = (var6[1] - var3[1]) * -1.0F;
            float var11 = var6[2] - var3[2];
            double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
            class517.field7371 = 16383 & (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D);
            class222.field3222 = 16383 & (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D);
            class234.field3396 = ((class27.field300[class625.field9211][var4 + 2][3] - class27.field300[class625.field9211][var4][3]) * class355.field4839 >> 16) + class27.field300[class625.field9211][var4][3];
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lcb;)V", line = 146)
    public class116(class444 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZ)V", line = 151)
    public final void method195(boolean arg0, boolean arg1) {
        ++field1628;
        if (!arg1) {
            method832(-61);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V", line = 170)
    public final void method197(boolean arg0) {
        ++field1630;
        super.field7353.method2566(arg0, (byte) 102);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)Z", line = 180)
    public final boolean method201(byte arg0) {
        ++field1631;
        if (arg0 >= -60) {
            field1634 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BZ)V", line = 191)
    public final void method199(byte arg0, boolean arg1) {
        int var3 = -57 / ((arg0 - 63) / 38);
        super.field7353.method2566(true, (byte) 74);
        ++field1635;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lqa;ILls;)I", line = 204)
    public static final int method833(class208 arg0, int arg1, class121 arg2) {
        ++field1633;
        if (~arg2.field1703 != 0) {
            return arg2.field1703;
        } else {
            if (arg2.field1698 != -1) {
                class471 var3 = arg0.field3092.method110(arg0.method499() ? arg2.field1698 : arg2.field1708, (byte) 125);
                if (!var3.field6653) {
                    return var3.field6642;
                }
            }
            if (arg1 <= 115) {
                field1639 = null;
            }
            return arg2.field1699;
        }
    }
}
