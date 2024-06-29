import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class476 extends class47 {

    @OriginalMember(owner = "client!sp", name = "C", descriptor = "I")
    public static int field6744 = 0;

    @OriginalMember(owner = "client!sp", name = "G", descriptor = "I")
    public static int field6747 = -1;

    @OriginalMember(owner = "client!sp", name = "E", descriptor = "Lch;")
    public static class151 field6746 = new class151("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!sp", name = "B", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!sp", name = "H", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!sp", name = "I", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!sp", name = "L", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!sp", name = "M", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!sp", name = "O", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!sp", name = "Q", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!sp", name = "J", descriptor = "Ljava/lang/String;")
    public String field6750;

    @OriginalMember(owner = "client!sp", name = "D", descriptor = "[C")
    public char[] field6745;

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "[C")
    public char[] field6751;

    @OriginalMember(owner = "client!sp", name = "N", descriptor = "[I")
    public int[] field6754;

    @OriginalMember(owner = "client!sp", name = "P", descriptor = "[I")
    public int[] field6756;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BIIIIII)V", line = 4)
    public static final void method2815(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6748++;
        class172 var7 = class77.method678(arg1, -23, arg3);
        if (var7 == null) {
            return;
        }
        if (var7.field2516 != null) {
            class472 var8 = new class472();
            var8.field6649 = var7.field2516;
            var8.field6642 = var7;
            class457.method2745(var8);
        }
        if (arg0 != -98) {
            field6746 = null;
        }
        class182.field2751 = arg6;
        class124.field1679 = arg3;
        class132.field1809 = arg2;
        class4.field29 = arg1;
        class377.field5197 = arg5;
        class128.field1750 = var7.field2483;
        class450.field6405 = true;
        class95.field1336 = arg4;
        class184.method1314(var7, 127);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(CI)I", line = 37)
    public final int method2816(char arg0, int arg1) {
        field6753++;
        if (this.field6756 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field6756.length; var3++) {
            if (this.field6751[var3] == arg0) {
                return this.field6756[var3];
            }
        }
        if (arg1 != -1) {
            this.method2818(-44);
        }
        return -1;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z)V", line = 61)
    public static void method2817(boolean arg0) {
        if (arg0) {
            method2815((byte) 16, -106, 64, -28, -3, -1, -95);
        }
        field6746 = null;
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)V", line = 86)
    public final void method2818(int arg0) {
        if (this.field6756 != null) {
            for (int var2 = 0; var2 < this.field6756.length; var2++) {
                this.field6756[var2] = class142.method1024(this.field6756[var2], 32768);
            }
        }
        if (arg0 != 32768) {
            this.field6750 = null;
        }
        field6743++;
        if (this.field6754 != null) {
            for (int var3 = 0; var3 < this.field6754.length; var3++) {
                this.field6754[var3] = class142.method1024(this.field6754[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lkk;I)V", line = 122)
    public final void method2819(class161 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1172((byte) 85);
            if (var3 == 0) {
                field6752++;
                if (arg1 != 0) {
                    this.field6745 = null;
                    return;
                }
                return;
            }
            this.method2821(arg0, (byte) 37, var3);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IC)I", line = 143)
    public final int method2820(int arg0, char arg1) {
        field6757++;
        if (this.field6754 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field6754.length; var3++) {
            if (this.field6745[var3] == arg1) {
                return this.field6754[var3];
            }
        }
        if (arg0 != 21949) {
            this.method2821((class161) null, (byte) -12, 68);
        }
        return -1;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lkk;BI)V", line = 168)
    private final void method2821(class161 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field6750 = arg0.method1186(-1);
        } else if (arg2 == 2) {
            int var7 = arg0.method1172((byte) -124);
            this.field6745 = new char[var7];
            this.field6754 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field6754[var8] = arg0.method1134(-16848);
                byte var9 = arg0.method1152(-1910700904);
                this.field6745[var8] = var9 == 0 ? 0 : class441.method2681(16, var9);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method1172((byte) -115);
            this.field6756 = new int[var4];
            this.field6751 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6756[var5] = arg0.method1134(-16848);
                byte var6 = arg0.method1152(-1910700904);
                this.field6751[var5] = var6 == 0 ? 0 : class441.method2681(16, var6);
            }
        }
        int var10 = -86 % ((-arg1 - 21) / 58);
        field6749++;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(Z)V", line = 230)
    public static final void method2822(boolean arg0) {
        field6755++;
        if (class273.field3967 != null || !arg0) {
            return;
        }
        int var1 = class97.field1357;
        int var2 = class394.field5444;
        int var3 = class59.field847 - class364.field5007 - var1;
        int var4 = class297.field4191 - class431.field6099 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class467.field6587 == null) {
                var5 = class436.field6206.field960;
            } else {
                var5 = class467.field6587;
            }
            int var6 = 0;
            int var7 = 0;
            if (class467.field6587 == var5) {
                Insets var8 = class467.field6587.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class297.field4191);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class59.field847, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 - (var3 - class59.field847), var7, var3, class297.field4191);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class297.field4191 - var4, class59.field847, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }
}
