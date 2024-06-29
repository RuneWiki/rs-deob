import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Lge;")
    public static class47 field963 = new class47(30);

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lge;")
    public static class47 field969 = new class47(500);

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lr;")
    private static class118 field971 = class153.method1136(121, "Unexpected server response)3");

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lr;")
    public static class118 field970 = field971;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Z")
    public static boolean field972;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method331(byte arg0) {
        field969 = null;
        field970 = null;
        field963 = null;
        if (arg0 == -119) {
            field971 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method332(byte arg0, Component arg1) {
        field965++;
        arg1.addMouseListener(class4.field68);
        arg1.addMouseMotionListener(class4.field68);
        arg1.addFocusListener(class4.field68);
        if (arg0 != 119) {
            method332((byte) -65, null);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[I[Lec;I[IB)V")
    public static final void method333(int arg0, int[] arg1, class32[] arg2, int arg3, int[] arg4, byte arg5) {
        if (arg5 != 20) {
            method332((byte) 102, null);
        }
        field967++;
        if (arg0 <= arg3) {
            return;
        }
        int var6 = arg3 - 1;
        int var7 = arg0 + 1;
        int var8 = (arg0 + arg3) / 2;
        class32 var9 = arg2[var8];
        arg2[var8] = arg2[arg3];
        arg2[arg3] = var9;
        while (var7 > var6) {
            boolean var10 = true;
            do {
                var7--;
                for (int var11 = 0; var11 < 4; var11++) {
                    int var12;
                    int var13;
                    if (arg1[var11] == 2) {
                        var12 = arg2[var7].field807;
                        var13 = var9.field807;
                    } else if (arg1[var11] == 1) {
                        var13 = var9.field799;
                        if (var13 == -1 && arg4[var11] == 1) {
                            var13 = 2001;
                        }
                        var12 = arg2[var7].field799;
                        if (var12 == -1 && arg4[var11] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg1[var11] == 3) {
                        var13 = var9.field804 ? 1 : 0;
                        var12 = arg2[var7].field804 ? 1 : 0;
                    } else {
                        var12 = arg2[var7].field805;
                        var13 = var9.field805;
                    }
                    if (var12 != var13) {
                        if ((arg4[var11] != 1 || var12 <= var13) && (arg4[var11] != 0 || var13 <= var12)) {
                            var10 = false;
                        }
                        break;
                    }
                    if (var11 == 3) {
                        var10 = false;
                    }
                }
            } while (var10);
            boolean var14 = true;
            do {
                var6++;
                for (int var15 = 0; var15 < 4; var15++) {
                    int var16;
                    int var17;
                    if (arg1[var15] == 2) {
                        var17 = var9.field807;
                        var16 = arg2[var6].field807;
                    } else if (arg1[var15] == 1) {
                        var16 = arg2[var6].field799;
                        if (var16 == -1 && arg4[var15] == 1) {
                            var16 = 2001;
                        }
                        var17 = var9.field799;
                        if (var17 == -1 && arg4[var15] == 1) {
                            var17 = 2001;
                        }
                    } else if (arg1[var15] == 3) {
                        var17 = var9.field804 ? 1 : 0;
                        var16 = arg2[var6].field804 ? 1 : 0;
                    } else {
                        var17 = var9.field805;
                        var16 = arg2[var6].field805;
                    }
                    if (var16 != var17) {
                        if ((arg4[var15] != 1 || var17 <= var16) && (arg4[var15] != 0 || var17 >= var16)) {
                            var14 = false;
                        }
                        break;
                    }
                    if (var15 == 3) {
                        var14 = false;
                    }
                }
            } while (var14);
            if (var7 > var6) {
                class32 var18 = arg2[var6];
                arg2[var6] = arg2[var7];
                arg2[var7] = var18;
            }
        }
        method333(var7, arg1, arg2, arg3, arg4, (byte) 20);
        method333(arg0, arg1, arg2, var7 + 1, arg4, (byte) 20);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lk;")
    public static final class69 method334(int arg0, int arg1) {
        class69 var2 = (class69) class92.field2204.method395((byte) -43, (long) arg0);
        field964++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 > -127) {
            method332((byte) 22, null);
        }
        byte[] var3 = class128.field2947.method350(8, -117, arg0);
        class69 var4 = new class69();
        if (var3 != null) {
            var4.method593(new class105(var3), 0);
        }
        class92.field2204.method391(var4, (long) arg0, true);
        return var4;
    }
}
