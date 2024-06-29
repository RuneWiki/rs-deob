import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class47 {

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static volatile int field722 = -1;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public int field719;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 10)
    public static final void method420(byte arg0) {
        int var1 = -5 % ((arg0 - 72) / 43);
        field727++;
        class58.field862.method1433(30);
        class146.field2223.method1433(30);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;ZB)V", line = 28)
    public static final void method421(String arg0, boolean arg1, byte arg2) {
        field721++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class182.field2726.method438(arg0, 250);
        if (arg2 < 8) {
            method420((byte) 100);
        }
        int var6 = var3 + 6;
        int var7 = class182.field2726.method442(arg0, 250) * 13;
        if (class36.field534) {
            class194.method1413(var6 - var3, -var3 + var4, var3 + var5 + var3, var3 + var7 + var3, 0);
            class194.method1406(var6 - var3, -var3 + var4, var3 + var5 + var3, var3 + var7 + var3, 16777215);
        } else {
            class168.method1224(var6 - var3, -var3 + var4, var3 + var3 + var5, var3 + var7 + var3, 0);
            class168.method1228(var6 - var3, -var3 + var4, var3 + var5 + var3, var3 + var7 - -var3, 16777215);
        }
        class182.field2726.method427(arg0, var6, var4, var5, var7, 16777215, -1, 1, 1, 0);
        class141.method1064(var5 - (-var3 - var3), -var3 + var6, var4 - var3, var3 + var7 + var3, (byte) 105);
        if (!arg1) {
            class135.method1032(var5, 116, var4, var6, var7);
        } else if (class36.field534) {
            class36.method327();
        } else {
            try {
                Graphics var8 = class171.field2548.getGraphics();
                class128.field2023.method623(0, var8, 0, -101);
            } catch (Exception var10) {
                class171.field2548.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIIII)V", line = 89)
    public static final void method422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 == arg6 && arg1 == arg5 && arg0 == arg2 && arg3 == arg9) {
            class51.method469(arg2, arg6, arg1, arg3, arg8, true);
        } else {
            int var10 = arg6;
            int var11 = arg1;
            int var12 = arg6 * 3;
            int var13 = arg1 * 3;
            int var14 = arg4 * 3;
            int var15 = arg5 * 3;
            int var16 = arg0 * 3;
            int var17 = arg9 * 3;
            int var18 = arg2 + var14 - var16 - arg6;
            int var19 = arg3 + var15 - arg1 - var17;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var14 - var12;
            int var22 = var13 + var17 - var15 - var15;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var22 * var25;
                int var30 = var23 * var24;
                int var31 = (var28 + var30 + var29 >> 12) + arg1;
                int var32 = var21 * var24;
                int var33 = var20 * var25;
                int var34 = (var33 + var32 + var27 >> 12) + arg6;
                class51.method469(var34, var10, var11, var31, arg8, true);
                var11 = var31;
                var10 = var34;
            }
        }
        field723++;
        if (arg7 > -31) {
            method423(-101);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 165)
    public static final void method423(int arg0) {
        field728++;
        if (arg0 > -22) {
            field722 = 8;
        }
        class53.field810.method1428(10935);
    }
}
