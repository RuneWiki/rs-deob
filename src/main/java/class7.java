import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 {

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lid;")
    public static class149 field78 = class60.method382("violet:", (byte) 16);

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field76 = 0;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "Lid;")
    public static class149 field79 = class60.method382("Clientscript error )2 check log for details", (byte) 102);

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Lid;")
    public static class149 field85 = class60.method382("brillant1:", (byte) 55);

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Laj;")
    public static class47 field86 = null;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Lal;")
    public static class230 field77;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Ld;")
    public static class236 field82;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static final void method35(int arg0) {
        field87++;
        if (arg0 < 37) {
            field82 = null;
        }
        int var1 = class213.field3772;
        int var2 = class112.field1926;
        int var3 = class273.field4910 - class240.field4197 - var2;
        int var4 = class35.field530 - class218.field3851 - var1;
        if (var1 <= 0 && var4 <= 0 && var2 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class47.field756 != null) {
                var5 = class47.field756;
            } else if (class69.field1203 == null) {
                var5 = class272.field4900.field436;
            } else {
                var5 = class69.field1203;
            }
            int var6 = 0;
            int var7 = 0;
            if (class69.field1203 == var5) {
                Insets var8 = class69.field1203.getInsets();
                var7 = var8.left;
                var6 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var7, var6, var1, class273.field4910);
            }
            if (var2 > 0) {
                var9.fillRect(var7, var6, class35.field530, var2);
            }
            if (var4 > 0) {
                var9.fillRect(var7 + class35.field530 - var4, var6, var4, class273.field4910);
            }
            if (var3 > 0) {
                var9.fillRect(var7, var6 + class273.field4910 - var3, class35.field530, var3);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static void method36(int arg0) {
        field86 = null;
        field85 = null;
        if (arg0 < -107) {
            field78 = null;
            field77 = null;
            field79 = null;
            field82 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)Z")
    public static final boolean method37(int arg0, int arg1, int arg2) {
        int var3 = class162.field3017[arg0][arg1][arg2];
        if (-class96.field1704 == var3) {
            return false;
        } else if (class96.field1704 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class272.method1888(var4 + 1, class189.field3393[arg0][arg1][arg2], var5 + 1) && class272.method1888(var4 + 128 - 1, class189.field3393[arg0][arg1 + 1][arg2], var5 + 1) && class272.method1888(var4 + 128 - 1, class189.field3393[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class272.method1888(var4 + 1, class189.field3393[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class162.field3017[arg0][arg1][arg2] = class96.field1704;
                return true;
            } else {
                class162.field3017[arg0][arg1][arg2] = -class96.field1704;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILal;Lal;)V")
    public static final void method38(int arg0, class230 arg1, class230 arg2) {
        if (arg0 < -14) {
            class108.field1871 = arg1;
            field80++;
            class71.field1242 = arg2;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lal;ZLal;II)Lhf;")
    public static final class137 method39(class230 arg0, boolean arg1, class230 arg2, int arg3, int arg4) {
        field84++;
        boolean var5 = true;
        if (arg3 >= -113) {
            field85 = null;
        }
        int[] var6 = arg2.method1555(arg4, (byte) 27);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method1560(arg4, var6[var7], (byte) -121);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg1) {
                    var10 = arg0.method1560(0, var9, (byte) -109);
                } else {
                    var10 = arg0.method1560(var9, 0, (byte) 125);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class137(arg2, arg0, arg4, arg1);
        } catch (Exception var11) {
            return null;
        }
    }
}
