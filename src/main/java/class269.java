import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class269 extends class61 {

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public int field4823;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public int field4824;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Llc;")
    public static class143 field4817 = class66.method374(" <col=ffffff>", -1);

    @OriginalMember(owner = "client!c", name = "t", descriptor = "Llc;")
    public static class143 field4821 = class66.method374("blinken2:", -1);

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Llc;")
    public static class143 field4813 = class66.method374("Untersuchen", -1);

    @OriginalMember(owner = "client!c", name = "u", descriptor = "Llc;")
    public static class143 field4822 = class66.method374("::clientjs5drop", -1);

    @OriginalMember(owner = "client!c", name = "q", descriptor = "[Z")
    public static boolean[] field4818 = new boolean[200];

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "[Lvg;")
    public static class230[] field4815;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZII)V")
    public static final void method1780(int arg0, boolean arg1, int arg2, int arg3) {
        field4814++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg0 != -1) {
            field4818 = null;
        }
        class7.field134 = arg2;
        class190.field3494 = arg3;
        class83.field1509 = arg1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class206.method1429(arg4, 0);
        field4816++;
        int var7 = -126 / ((arg6 - 8) / 48);
        int var8 = 0;
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = -1;
        int var12 = arg4 - arg0;
        int[] var13 = class15.field268[arg5];
        int var14 = -1;
        if (var12 < 0) {
            var12 = 0;
        }
        int var15 = var12;
        int var16 = -var12;
        int var17 = arg1 + var12;
        int var18 = arg1 - var12;
        class289.method1927(var13, arg3, arg1 - arg4, -119, var18);
        class289.method1927(var13, arg2, var18, -63, var17);
        class289.method1927(var13, arg3, var17, -65, arg1 + arg4);
        while (var8 < var9) {
            var14 += 2;
            var11 += 2;
            var16 += var14;
            if (var16 >= 0 && var15 >= 1) {
                class16.field284[var15] = var8;
                var15--;
                var16 -= var15 << 1;
            }
            var8++;
            var10 += var11;
            if (var10 >= 0) {
                var9--;
                if (var9 >= var12) {
                    int[] var19 = class15.field268[arg5 + var9];
                    int var20 = arg1 - var8;
                    int var21 = arg1 + var8;
                    int[] var22 = class15.field268[arg5 - var9];
                    class289.method1927(var19, arg3, var20, -63, var21);
                    class289.method1927(var22, arg3, var20, -83, var21);
                } else {
                    int[] var23 = class15.field268[arg5 + var9];
                    int[] var24 = class15.field268[arg5 - var9];
                    int var25 = arg1 + var8;
                    int var26 = class16.field284[var9];
                    int var27 = arg1 - var26;
                    int var28 = arg1 + var26;
                    int var29 = arg1 - var8;
                    class289.method1927(var23, arg3, var29, -66, var27);
                    class289.method1927(var23, arg2, var27, -92, var28);
                    class289.method1927(var23, arg3, var28, -116, var25);
                    class289.method1927(var24, arg3, var29, -103, var27);
                    class289.method1927(var24, arg2, var27, -99, var28);
                    class289.method1927(var24, arg3, var28, -78, var25);
                }
                var10 -= var9 << 1;
            }
            int[] var30 = class15.field268[arg5 + var8];
            int[] var31 = class15.field268[arg5 - var8];
            int var32 = arg1 + var9;
            int var33 = arg1 - var9;
            if (var8 >= var12) {
                class289.method1927(var30, arg3, var33, -110, var32);
                class289.method1927(var31, arg3, var33, -90, var32);
            } else {
                int var34 = var8 > var15 ? class16.field284[var8] : var15;
                int var35 = arg1 + var34;
                int var36 = arg1 - var34;
                class289.method1927(var30, arg3, var33, -66, var36);
                class289.method1927(var30, arg2, var36, -85, var35);
                class289.method1927(var30, arg3, var35, -84, var32);
                class289.method1927(var31, arg3, var33, -118, var36);
                class289.method1927(var31, arg2, var36, -83, var35);
                class289.method1927(var31, arg3, var35, -107, var32);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method1782(boolean arg0) {
        field4822 = null;
        field4813 = null;
        field4815 = null;
        if (!arg0) {
            field4817 = null;
            field4818 = null;
            field4821 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V")
    public static final void method1783(boolean arg0) {
        field4811++;
        class268.field4809 = 0;
        class8.field158 = 0;
        class259.method1713(7);
        class52.method316(116);
        if (!arg0) {
            return;
        }
        class63.method362(-127);
        class173.method1140((byte) -114);
        for (int var1 = 0; var1 < class8.field158; var1++) {
            int var3 = class155.field2800[var1];
            if (class146.field2635 != class6.field97[var3].field4146) {
                if (class6.field97[var3].field543 > 0) {
                    class171.method1120(class6.field97[var3], 1);
                }
                class6.field97[var3] = null;
            }
        }
        if (class42.field708 != class161.field2902.field3487) {
            throw new RuntimeException("gpp1 pos:" + class161.field2902.field3487 + " psize:" + class42.field708);
        }
        for (int var2 = 0; var2 < class107.field1889; var2++) {
            if (class6.field97[class30.field467[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class107.field1889);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILjava/awt/Component;)Leh;")
    public static final class145 method1784(int arg0, int arg1, int arg2, Component arg3) {
        field4812++;
        try {
            Class var4 = Class.forName("rf");
            if (arg0 == 6985) {
                class145 var5 = (class145) var4.getDeclaredConstructor().newInstance();
                var5.method322(arg2, 116, arg1, arg3);
                return var5;
            } else {
                return null;
            }
        } catch (Throwable var7) {
            class53 var6 = new class53();
            var6.method322(arg2, arg0 ^ 0x1B13, arg1, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(II)V")
    public class269(int arg0, int arg1) {
        this.field4823 = arg0;
        this.field4824 = arg1;
    }
}
