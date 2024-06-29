import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class646 extends class461 {

    @OriginalMember(owner = "client!eo", name = "y", descriptor = "F")
    public static float field9007;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    public static int field9000;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
    public static int field9008;

    @OriginalMember(owner = "client!eo", name = "A", descriptor = "I")
    public static int field9009;

    @OriginalMember(owner = "client!eo", name = "D", descriptor = "I")
    public static int field9012;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "Lxa;")
    private class511 field8997;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "Lxa;")
    private class511 field8999;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "Lxa;")
    private class511 field9001;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "Lxa;")
    private class511 field9004;

    @OriginalMember(owner = "client!eo", name = "B", descriptor = "Lxa;")
    public class511 field9010;

    @OriginalMember(owner = "client!eo", name = "C", descriptor = "Lxa;")
    private class511 field9011;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "Lgf;")
    public static class61 field8998;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "[I")
    public static int[] field9002;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZIB)V")
    public final void method553(int arg0, boolean arg1, int arg2, byte arg3) {
        if (arg1) {
            int[] var5 = new int[4];
            class520.field6799.method356(var5);
            class520.field6799.method376(arg2, arg0, super.field6043.field584 + arg2, arg0 - -super.field6043.field585);
            int var6 = this.field9001.method602();
            int var7 = this.field9001.method595();
            int var8 = this.field8999.method602();
            int var9 = this.field8999.method595();
            this.field9001.method2751(arg2, arg0 - -((-var7 + super.field6043.field585) / 2));
            this.field8999.method2751(-var8 + super.field6043.field584 + arg2, arg0 - -((-var9 + super.field6043.field585) / 2));
            class520.field6799.method376(arg2, arg0, super.field6043.field584 + arg2, this.field8997.method595() + arg0);
            this.field8997.method2756(arg2 + var6, arg0, -var6 + super.field6043.field584 + -var8, super.field6043.field585);
            int var10 = this.field9011.method595();
            class520.field6799.method376(arg2, arg0 - -super.field6043.field585 + -var10, super.field6043.field584 + arg2, arg0 - -super.field6043.field585);
            this.field9011.method2756(arg2 + var6, super.field6043.field585 + arg0 - var10, -var8 + super.field6043.field584 - var6, super.field6043.field585);
            class520.field6799.method376(var5[0], var5[1], var5[2], var5[3]);
        }
        ++field9008;
        if (arg3 > -79) {
            this.method444((byte) 13);
        }
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
    public static void method3555(int arg0) {
        field8998 = null;
        if (arg0 == 4) {
            field9002 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIII)V")
    public void method2168(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9000;
        this.field9010.method2756(arg1, arg3, arg4, arg2);
        int var6 = 33 / ((68 - arg0) / 32);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public final void method449(int arg0) {
        ++field9006;
        super.method449(-98);
        class485 var2 = (class485) super.field6043;
        this.field9010 = class53.method462(26513, var2.field6461, super.field6049);
        this.field9004 = class53.method462(26513, var2.field6460, super.field6049);
        this.field9001 = class53.method462(26513, var2.field6459, super.field6049);
        this.field8999 = class53.method462(26513, var2.field6458, super.field6049);
        this.field8997 = class53.method462(26513, var2.field6462, super.field6049);
        this.field9011 = class53.method462(26513, var2.field6465, super.field6049);
        int var3 = -103 / ((arg0 - 65) / 45);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method3556(byte[] arg0, boolean arg1) {
        ++field8996;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class443.method2514(arg0, 0, var2, 0, arg0.length);
            if (!arg1) {
                field9002 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lpe;Lpe;Lrw;)V")
    public class646(class615 arg0, class615 arg1, class485 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method3557(byte arg0, int arg1, String arg2) {
        if (arg0 <= 62) {
            field9007 = 1.3846911F;
        }
        class518.method2790(0);
        ++field9003;
        class408.method2323((byte) 9);
        class368.method2118((byte) 20);
        class510.method2747(arg1, 9472, arg2);
        class534.method2838(-122);
        class386.method2200(-97, class520.field6799);
        class91.method686(30806, class520.field6799);
        class407.method2304(0, class520.field6799, class90.field1186);
        class418.method2408(112);
        class564.method3015(class497.field6553, (byte) 91);
        class211.method1355(-21784);
        class24.method129(28260);
        if (class566.field7391 == 3) {
            class442.method2508(4, 1);
        } else if (~class566.field7391 == -8) {
            class442.method2508(8, 1);
        } else if (~class566.field7391 == -11) {
            class442.method2508(11, 1);
        } else {
            if (class566.field7391 == 1 || class566.field7391 == 2) {
                class122.method904((byte) 62);
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)Z")
    public final boolean method444(byte arg0) {
        ++field9005;
        if (!super.method444((byte) -21)) {
            return false;
        } else {
            class485 var2 = (class485) super.field6043;
            if (!super.field6049.method3362(var2.field6461, -99)) {
                return false;
            } else {
                if (arg0 >= -10) {
                    this.field9001 = null;
                }
                if (!super.field6049.method3362(var2.field6460, -114)) {
                    return false;
                } else if (!super.field6049.method3362(var2.field6459, -100)) {
                    return false;
                } else if (!super.field6049.method3362(var2.field6458, -117)) {
                    return false;
                } else if (!super.field6049.method3362(var2.field6462, -108)) {
                    return false;
                } else {
                    return super.field6049.method3362(var2.field6465, -123);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZIII)V")
    public final void method552(boolean arg0, int arg1, int arg2, int arg3) {
        ++field9009;
        int var5 = this.field9001.method602() + arg3;
        int var6 = arg3 - (-super.field6043.field584 - -this.field8999.method602());
        int var7 = this.field8997.method595() + arg1;
        int var8 = arg1 - (-super.field6043.field585 - -this.field9011.method595());
        int var9 = -var5 + var6;
        int var10 = var8 - var7;
        int var11 = var9 * this.method2586((byte) 93) / 10000;
        int[] var12 = new int[4];
        class520.field6799.method356(var12);
        class520.field6799.method376(var5, var7, var5 + var11, var8);
        int var13 = -52 % ((-83 - arg2) / 41);
        this.method2168(110, var5, var10, var7, var9);
        class520.field6799.method376(var5 + var11, var7, var6, var8);
        this.field9004.method2756(var5, var7, var9, var10);
        class520.field6799.method376(var12[0], var12[1], var12[2], var12[3]);
    }
}
