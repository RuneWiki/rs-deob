import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class566 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public int field8123 = -1;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[[I")
    public static int[][] field8126 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Lhga;")
    public static class158 field8128 = new class158(34, -2);

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Luda;")
    public class417 field8133;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lii;")
    public static class514 field8134;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
    public int[] field8130;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field8124;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method3350(int arg0) {
        if (arg0 < 58) {
            field8126 = null;
        }
        field8134 = null;
        field8126 = null;
        field8128 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([BBIIII)Z")
    public static final boolean method3351(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 4 / ((-arg1 - 66) / 40);
        field8125++;
        boolean var7 = true;
        class6 var8 = new class6(arg0);
        int var9 = -1;
        label68: while (true) {
            int var10 = var8.method60(false);
            if (var10 == 0) {
                return var7;
            }
            var9 += var10;
            int var11 = 0;
            boolean var12 = false;
            while (true) {
                int var16;
                class698 var19;
                do {
                    int var17;
                    int var18;
                    do {
                        do {
                            do {
                                do {
                                    while (var12) {
                                        int var20 = var8.method88((byte) 90);
                                        if (var20 == 0) {
                                            continue label68;
                                        }
                                        var8.method70(-9059);
                                    }
                                    int var13 = var8.method88((byte) 90);
                                    if (var13 == 0) {
                                        continue label68;
                                    }
                                    var11 += var13 - 1;
                                    int var14 = var11 & 0x3F;
                                    int var15 = (var11 & 0xFCD) >> 6;
                                    var16 = var8.method70(-9059) >> 2;
                                    var17 = arg3 + var15;
                                    var18 = arg5 + var14;
                                } while (var17 <= 0);
                            } while (var18 <= 0);
                        } while (var17 >= (arg4 - 1));
                    } while (arg2 - 1 <= var18);
                    var19 = class213.field3537.method94(var9, (byte) -42);
                } while (var16 == 22 && !class17.field282.field4881 && var19.field9830 == 0 && var19.field9842 != 1 && !var19.field9785);
                var12 = true;
                if (!var19.method3941(true)) {
                    var7 = false;
                    class6.field80++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V")
    public static final void method3352(boolean arg0, int arg1) {
        if (arg0) {
            if (class528.field7706 != -1) {
                class20.method358(class528.field7706, 0);
            }
            for (class102 var2 = (class102) class486.field7115.method1556(76); var2 != null; var2 = (class102) class486.field7115.method1559(116)) {
                if (!var2.method708(50)) {
                    var2 = (class102) class486.field7115.method1556(88);
                    if (var2 == null) {
                        break;
                    }
                }
                class353.method2370(true, (byte) 0, false, var2);
            }
            class528.field7706 = -1;
            class486.field7115 = new class200(8);
            class40.method501(25664);
            class528.field7706 = class177.field2914;
            class351.method2359((byte) 114, false);
            class211.method1601(-20030);
            class142.method1208(class528.field7706);
        }
        if (arg1 != -1) {
            field8128 = null;
        }
        field8132++;
        class473.field7017 = true;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static final void method3353(int arg0) {
        if (arg0 != 1867386050) {
            method3354((byte) -113, null);
        }
        field8129++;
        class529.field7721.method342(((float) class17.field282.field4861 * 0.1F + 0.7F) * class493.field7209);
        class529.field7721.method296(class661.field9223, class641.field8990, class209.field3499, (float) (class422.field6436 << 2), (float) (class47.field638 << 2), (float) (class30.field446 << 2));
        class529.field7721.method264(class579.field8250);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method3354(byte arg0, String arg1) {
        field8131++;
        int var2 = 86 / ((arg0 + 5) / 33);
        return class213.method1606(122, true, 10, arg1);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)Ljava/lang/String;")
    public static final String method3355(int arg0) {
        if (arg0 != 17954) {
            method3355(123);
        }
        field8127++;
        return class453.field6808 || class572.field8178 == null ? "" : class572.field8178.field4623;
    }
}
