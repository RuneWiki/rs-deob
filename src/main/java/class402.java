import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class402 implements class549 {

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Lufa;")
    private class677 field5623;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "[Lql;")
    private class733[] field5614;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "Z")
    public static boolean field5621 = false;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Lqe;")
    public static class465 field5611 = new class465(7, 1);

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Lha;")
    private class58 field5624;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Lkr;")
    public static class743 field5612;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Z")
    private boolean field5622;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I", line = 6)
    public final int method1635(byte arg0) {
        field5615++;
        int var2 = 0;
        class733[] var3 = this.field5614;
        if (arg0 != 30) {
            field5611 = null;
        }
        for (int var4 = 0; var4 < var3.length; var4++) {
            class733 var5 = var3[var4];
            if (var5 == null || var5.method1176((byte) 125)) {
                var2++;
            }
        }
        return var2 * 100 / this.field5614.length;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZ)V", line = 33)
    public final void method1636(boolean arg0, boolean arg1) {
        boolean var3 = arg0;
        field5618++;
        class733[] var4 = this.field5614;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class733 var6 = var4[var5];
            if (var6 != null) {
                var6.method1172(var3 || this.field5622, 97);
            }
        }
        this.field5622 = false;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()V", line = 61)
    public static final void method2480() {
        byte var0 = 10;
        byte var1 = 30;
        if (class702.field9857 == 0 || class21.field268 == null) {
            return;
        }
        class497.field7089.method624(class496.field7077);
        for (int var2 = 0; var2 < class729.field10212.length; var2++) {
            class497.field7089.method569(false, class729.field10212[var2] + class371.field5197[var2], -256, class496.field7077[1], class496.field7077[3] - class496.field7077[1]);
        }
        for (int var3 = 0; var3 < class588.field8275; var3++) {
            class433 var11 = class217.field3094[var3];
            class497.field7089.method592(var11.field6047[0], var11.field6053[0], var11.field6045[0], class607.field8811);
            class497.field7089.method592(var11.field6047[1], var11.field6053[1], var11.field6045[1], class633.field9076);
            class497.field7089.method592(var11.field6047[2], var11.field6053[2], var11.field6045[2], class540.field7592);
            class497.field7089.method592(var11.field6047[3], var11.field6053[3], var11.field6045[3], class541.field7610);
            if (class607.field8811[2] != -1 && class633.field9076[2] != -1 && class540.field7592[2] != -1 && class541.field7610[2] != -1) {
                int var12 = -65536;
                if (var11.field6044 == 4) {
                    var12 = -16776961;
                }
                class497.field7089.method629(class633.field9076[1], false, class633.field9076[0], class607.field8811[0], var12, class607.field8811[1]);
                class497.field7089.method629(class540.field7592[1], false, class540.field7592[0], class633.field9076[0], var12, class633.field9076[1]);
                class497.field7089.method629(class541.field7610[1], false, class541.field7610[0], class540.field7592[0], var12, class540.field7592[1]);
                class497.field7089.method629(class607.field8811[1], false, class607.field8811[0], class541.field7610[0], var12, class541.field7610[1]);
                class497.field7089.method629(class540.field7592[1], false, class540.field7592[0], class607.field8811[0], var12, class607.field8811[1]);
            }
        }
        class21.field268.method665(var1, "Static Opaque: OW: " + class189.field2729[0] + "/" + class90.field1609[0] + " UW: " + class189.field2729[1] + "/" + class90.field1609[1], -16777216, var0, -16777216, -256);
        class21.field268.method665(var1 + 15, "Static Trans: OW: " + class444.field6176[0] + "/" + class750.field10476[0] + " UW: " + class444.field6176[1] + "/" + class750.field10476[1], -16777216, var0, -16777216, -256);
        class21.field268.method665(var1 + 30, "Static Anim: OW: " + class579.field8176[0] + "/" + class423.field5921[0] + " UW: " + class579.field8176[1] + "/" + class423.field5921[1], -16777216, var0, -16777216, -256);
        class21.field268.method665(var1 + 45, "Dynamic: " + class586.field8252 + "/" + 5000, -16777216, var0, -16777216, -256);
        class21.field268.method665(var1 + 60, "Total Opaque Onscreen: " + class431.field6032 + "/" + 10000, -16777216, var0, -16777216, -256);
        class21.field268.method665(var1 + 75, "Total Trans Onscreen: " + class237.field3355 + "/" + 5000, -16777216, var0, -16777216, -256);
        class21.field268.method665(var1 + 90, "Occluders: " + (class93.field1622 + class522.field7393) + " Active: " + class588.field8275, -16777216, var0, -16777216, -256);
        class21.field268.method665(var1 + 105, "Occluded: Ground:" + class115.field1836 + " Walls: " + class708.field9904 + " CPs: " + class503.field7188 + " Pixels: " + class671.field9405, -16777216, var0, -16777216, -256);
        class21.field268.method665(var1 + 120, "Occlude Calc Took: " + class606.field8796 / 1000L + "us", -16777216, var0, -16777216, -256);
        if (class702.field9857 != 2 || class458.field6612 == null) {
            return;
        }
        for (int var4 = 0; var4 < class458.field6612.length; var4++) {
            float var6 = (float) class458.field6612[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class458.field6612[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class743 var5 = class497.field7089.method561(class136.field2124, class458.field6612, 0, class136.field2124, 31, class312.field4397);
        var5.method86(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILdm;Z)V", line = 148)
    public static final void method2481(int arg0, int arg1, class50 arg2, boolean arg3) {
        if (class737.field10375) {
            class513 var4 = class41.field600 == -1 ? null : class285.field4042.method2993(class41.field600, (byte) 80);
            if (client.method1943(arg2).method2114(2) && (class464.field6709 & 0x20) != 0 && (var4 == null || arg2.method441(0, var4.field7315, class41.field600) != var4.field7315)) {
                class520.field7380++;
                class673.method3807((long) (arg2.field807 << 0 | arg2.field792), class623.field8966 + " -> " + arg2.field831, arg2.field807, (byte) -81, 0L, true, class322.field4580, 51, false, arg2.field792, false, class23.field299, arg2.field861);
            }
        }
        field5617++;
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class11.method62(arg2, 87, var5);
            if (var9 != null) {
                class673.method3807((long) (arg2.field807 << 0 | arg2.field792), arg2.field831, arg2.field807, (byte) -115, (long) (var5 + 1), true, var9, 1001, false, arg2.field792, false, class180.method1294(arg2, var5, 69), arg2.field861);
                class508.field7239++;
            }
        }
        String var6 = class317.method2041(88, arg2);
        if (var6 != null) {
            class673.method3807((long) (arg2.field792 | arg2.field807 << 0), arg2.field831, arg2.field807, (byte) -36, 0L, true, var6, 47, false, arg2.field792, false, arg2.field768, arg2.field861);
            class259.field3779++;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class11.method62(arg2, 65, var7);
            if (var8 != null) {
                class508.field7239++;
                class673.method3807((long) (arg2.field807 << 0 | arg2.field792), arg2.field831, arg2.field807, (byte) -44, (long) (var7 + 1), true, var8, 44, false, arg2.field792, false, class180.method1294(arg2, var7, 28), arg2.field861);
            }
        }
        if (!client.method1943(arg2).method2117(arg3)) {
            return;
        }
        class518.field7357++;
        if (arg2.field854 == null) {
            class673.method3807((long) (arg2.field807 << 0 | arg2.field792), "", arg2.field807, (byte) -34, 0L, true, class281.field3950.method1839((byte) 45, class744.field10426), 60, false, arg2.field792, false, -1, arg2.field861);
        } else {
            class673.method3807((long) (arg2.field807 << 0 | arg2.field792), "", arg2.field807, (byte) -123, 0L, true, arg2.field854, 60, false, arg2.field792, false, -1, arg2.field861);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V", line = 222)
    public final void method1634(boolean arg0) {
        if (class359.field5046 != this.field5624) {
            this.field5622 = true;
            this.field5624 = class359.field5046;
        }
        field5619++;
        this.field5624.method617(0);
        class733[] var2 = this.field5614;
        if (arg0) {
            field5621 = true;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class733 var4 = var2[var3];
            if (var4 != null) {
                var4.method1173(-118);
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 257)
    public final void method1642(int arg0) {
        field5616++;
        if (arg0 != 18105) {
            this.method1635((byte) 87);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(JI)Z", line = 267)
    public final boolean method1637(long arg0, int arg1) {
        if (arg1 >= -38) {
            return false;
        } else {
            field5620++;
            return (long) this.field5623.field9558 + arg0 <= class742.method4128(1);
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 278)
    public static void method2482(int arg0) {
        if (arg0 > -74) {
            field5621 = false;
        }
        field5612 = null;
        field5611 = null;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)I", line = 292)
    public final int method1647(int arg0) {
        if (arg0 != -4332) {
            this.field5622 = true;
        }
        field5613++;
        return this.field5623.field9555;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lufa;Lkb;)V", line = 306)
    public class402(class677 arg0, class687 arg1) {
        this.field5623 = arg0;
        this.field5614 = new class733[this.field5623.field9559.length];
        for (int var3 = 0; var3 < this.field5614.length; var3++) {
            this.field5614[var3] = arg1.method3866(-22, this.field5623.field9559[var3]);
        }
    }
}
