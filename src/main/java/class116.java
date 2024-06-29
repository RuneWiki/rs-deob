import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class116 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1512 = 0;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lsr;")
    public static class167 field1514 = new class167();

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lsd;")
    public static class63 field1519 = new class63(10, 2, 2, 0);

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "F")
    public static float field1520;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLjava/awt/Frame;Lfq;)V")
    public static final void method697(byte arg0, Frame arg1, class137 arg2) {
        while (true) {
            class236 var3 = arg2.method837(arg1, 7);
            while (var3.field3149 == 0) {
                class316.method1873(10L, false);
            }
            if (var3.field3149 == 1) {
                field1511++;
                arg1.setVisible(false);
                arg1.dispose();
                if (arg0 <= 104) {
                    method699(101);
                    return;
                }
                return;
            }
            class316.method1873(100L, false);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBI)I")
    public static final int method698(int arg0, int arg1, byte arg2, int arg3) {
        field1515++;
        int var4 = arg1 & 0x3;
        if (arg2 != -70) {
            return -43;
        } else if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final void method699(int arg0) {
        if (class235.field3146 != null) {
            class235.field3146.method1049(256);
        }
        field1516++;
        if (arg0 != 3) {
            method702(-48, 48, -16, 33, -56, 67, 26, (byte) 5, 98, -45);
        }
        if (class153.field2005 != null) {
            class153.field2005.method1049(256);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static void method700(int arg0) {
        field1519 = null;
        if (arg0 == -1911903764) {
            field1514 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
    public static final void method701(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 122 / ((-arg1 - 12) / 44);
        if (class307.field4111 <= arg0 && arg0 <= class91.field1086) {
            int var6 = class406.method2491(class169.field2184, false, class386.field5620, arg3);
            int var7 = class406.method2491(class169.field2184, false, class386.field5620, arg4);
            class277.method1684(var7, var6, 0, arg0, arg2);
        }
        field1513++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIBII)V")
    public static final void method702(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        if (arg4 == arg8 && arg5 == arg9 && arg1 == arg3 && arg2 == arg6) {
            class87.method477(arg3, arg8, arg9, arg7 ^ 0xFFFFFFEB, arg0, arg6);
        } else {
            int var10 = arg8;
            int var11 = arg9;
            int var12 = arg8 * 3;
            int var13 = arg9 * 3;
            int var14 = arg4 * 3;
            int var15 = arg5 * 3;
            int var16 = arg1 * 3;
            int var17 = arg2 * 3;
            int var18 = arg3 + var14 - arg8 - var16;
            int var19 = arg6 + var15 - var17 - arg9;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg8;
                int var34 = (var28 + var30 + var32 >> 12) + arg9;
                class87.method477(var33, var10, var11, arg7 - 30, arg0, var34);
                var10 = var33;
                var11 = var34;
            }
        }
        field1517++;
        if (arg7 != -58) {
            field1514 = null;
        }
    }
}
