import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class200 extends class242 {

    @OriginalMember(owner = "client!qh", name = "eb", descriptor = "I")
    private int field3507 = 585;

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "[I")
    public static int[] field3497 = new int[200];

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "[Lvj;")
    public static class114[] field3499 = new class114[4];

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "Lp;")
    private static class280 field3495 = class18.method140((byte) -120, "purple:");

    @OriginalMember(owner = "client!qh", name = "bb", descriptor = "Z")
    public static boolean field3504 = false;

    @OriginalMember(owner = "client!qh", name = "Z", descriptor = "Lp;")
    public static class280 field3502 = field3495;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "Lp;")
    private static class280 field3494 = class18.method140((byte) -128, "Members object");

    @OriginalMember(owner = "client!qh", name = "ab", descriptor = "Lp;")
    public static class280 field3503 = field3494;

    @OriginalMember(owner = "client!qh", name = "hb", descriptor = "Lp;")
    public static class280 field3510 = class18.method140((byte) -117, "Memory after cleanup=");

    @OriginalMember(owner = "client!qh", name = "cb", descriptor = "Lp;")
    public static class280 field3505 = field3495;

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!qh", name = "X", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!qh", name = "Y", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!qh", name = "db", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!qh", name = "gb", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "Loi;")
    public static class80 field3498;

    @OriginalMember(owner = "client!qh", name = "fb", descriptor = "[I")
    public static int[] field3508;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        int[] var3 = super.field4251.method1417((byte) 99, arg0);
        int var4 = 91 / ((arg1 - 73) / 41);
        ++field3509;
        if (super.field4251.field3655) {
            int var5 = class117.field2106[arg0];
            for (int var6 = 0; var6 < class264.field4654; ++var6) {
                int var7 = class102.field1701[var6];
                if (~var7 < ~this.field3507 && ~(-this.field3507 + 4096) < ~var7 && ~var5 < ~(-this.field3507 + 2048) && ~(this.field3507 + 2048) < ~var5) {
                    int var8 = -var7 + 2048;
                    int var9 = var8 < 0 ? -var8 : var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (-this.field3507 + 2048);
                    var3[var6] = -var11 + 4096;
                } else if (var7 > -this.field3507 + 2048 && ~var7 > ~(this.field3507 + 2048)) {
                    int var12 = var5 + -2048;
                    int var13 = var12 >= 0 ? var12 : -var12;
                    int var14 = var13 - this.field3507;
                    int var15 = var14 << 12;
                    var3[var6] = var15 / (-this.field3507 + 2048);
                } else if (var5 >= this.field3507 && ~(4096 - this.field3507) <= ~var5) {
                    if (~var7 <= ~this.field3507 && -this.field3507 + 4096 >= var7) {
                        var3[var6] = 0;
                    } else {
                        int var16 = 2048 - var5;
                        int var17 = var16 >= 0 ? var16 : -var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (-this.field3507 + 2048);
                        var3[var6] = 4096 - var19;
                    }
                } else {
                    int var20 = var7 + -2048;
                    int var21 = var20 >= 0 ? var20 : -var20;
                    int var22 = var21 - this.field3507;
                    int var23 = var22 << 12;
                    var3[var6] = var23 / (2048 - this.field3507);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg0 > -119) {
            this.method54(19, 51);
        }
        if (arg1 == 0) {
            this.field3507 = arg2.method193((byte) 77);
        }
        ++field3496;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZILp;)V")
    public static final void method1373(boolean arg0, int arg1, class280 arg2) {
        ++field3506;
        int var3 = class101.field1651.method511(arg2, 250);
        byte var4 = 4;
        int var5 = 13 * class101.field1651.method533(arg2, 250);
        int var6 = 6 - -var4;
        int var7 = arg1 - -var4;
        class151.method1057(var7 - var4, -var4 + var6, var3 + var4 + var4, var4 + var5 + var4, 0);
        class151.method1060(-var4 + var7, -var4 + var6, var3 + var4 + var4, var4 + var5 + var4, 16777215);
        class101.field1651.method530(arg2, var7, var6, var3, var5, 16777215, -1, 1, 1, 0);
        class49.method365(-var4 + var6, var7 - var4, (byte) -65, var3 + var4 + var4, var4 + var5 - -var4);
        if (!arg0) {
            class30.method264(var6, -74, var7, var3, var5);
        } else {
            try {
                Graphics var8 = class41.field707.getGraphics();
                class152.field2629.method300(arg1 + -14418, 0, var8, 0);
            } catch (Exception var9) {
                class41.field707.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLjava/awt/Component;II)Luc;")
    public static final class38 method1374(byte arg0, Component arg1, int arg2, int arg3) {
        ++field3500;
        try {
            if (arg0 != 111) {
                return null;
            } else {
                Class var4 = Class.forName("lc");
                class38 var5 = (class38) var4.newInstance();
                var5.method301(arg1, arg3, arg2, true);
                return var5;
            }
        } catch (Throwable var7) {
            class66 var6 = new class66();
            var6.method301(arg1, arg3, arg2, true);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "(I)V")
    public static void method1375(int arg0) {
        field3494 = null;
        field3502 = null;
        field3498 = null;
        field3495 = null;
        field3497 = null;
        field3503 = null;
        field3508 = null;
        field3505 = null;
        field3510 = null;
        if (arg0 != 0) {
            method1373(false, -114, (class280) null);
        }
        field3499 = null;
    }

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "(I)V")
    public static final void method1376(int arg0) {
        ++field3501;
        class132.field2351.method1481(false);
        int var1 = -27 / ((arg0 - -14) / 34);
        class252.field4407.method1481(false);
        class192.field3358.method1481(false);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class200() {
        super(0, true);
    }
}
