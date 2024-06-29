import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class15 {

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public int field439 = -1;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Z")
    public boolean field452 = false;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "[I")
    private int[] field447 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Lvf;")
    public static class265 field433 = class87.method582(-46, "M");

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Lvf;")
    public static class265 field434 = class87.method582(-46, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "Z")
    public static boolean field450 = false;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field448 = 0;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "[I")
    private int[] field438;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "[S")
    private short[] field440;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "[S")
    private short[] field443;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "[S")
    private short[] field446;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "[S")
    private short[] field449;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "[[B")
    public static byte[][] field441;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Z")
    public final boolean method106(int arg0) {
        field444++;
        boolean var2 = true;
        if (arg0 < 18) {
            this.field449 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field447[var3] != -1 && !class107.field1885.method1310(this.field447[var3], 2, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
    public static void method107(int arg0) {
        field433 = null;
        field441 = null;
        if (arg0 != 0) {
            field433 = null;
        }
        field434 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field435++;
        int var8 = 2048 - arg2 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = -53 % ((-arg1 - 27) / 53);
        int var11 = 0;
        int var12 = 0;
        int var13 = arg7;
        if (var8 != 0) {
            int var14 = class247.field4289[var8];
            int var15 = class247.field4298[var8];
            var12 = -arg7 * var14 >> 16;
            var13 = arg7 * var15 >> 16;
        }
        if (var9 != 0) {
            int var16 = class247.field4298[var9];
            int var17 = class247.field4289[var9];
            var11 = var13 * var17 >> 16;
            var13 = var13 * var16 >> 16;
        }
        class17.field475 = arg3 - var12;
        class8.field272 = arg4;
        class202.field3613 = arg2;
        class112.field1976 = arg5 - var11;
        class69.field1309 = arg0 - var13;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method109(int arg0, Component arg1) {
        arg1.removeKeyListener(class94.field1673);
        field436++;
        arg1.removeFocusListener(class94.field1673);
        class72.field1388 = -1;
        if (arg0 < 108) {
            method107(-36);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Z")
    public final boolean method110(byte arg0) {
        field453++;
        if (this.field438 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field438.length; var3++) {
            if (!class107.field1885.method1310(this.field438[var3], 2, 0)) {
                var2 = false;
            }
        }
        if (arg0 <= 25) {
            this.field446 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)Lni;")
    public final class20 method111(boolean arg0) {
        field432++;
        class20[] var2 = new class20[5];
        int var3 = 0;
        int var4 = 0;
        if (!arg0) {
            return null;
        }
        while (var4 < 5) {
            if (this.field447[var4] != -1) {
                var2[var3++] = class20.method157(class107.field1885, this.field447[var4], 0);
            }
            var4++;
        }
        class20 var5 = new class20(var2, var3);
        if (this.field446 != null) {
            for (int var6 = 0; var6 < this.field446.length; var6++) {
                var5.method142(this.field446[var6], this.field440[var6]);
            }
        }
        if (this.field449 != null) {
            for (int var7 = 0; var7 < this.field449.length; var7++) {
                var5.method161(this.field449[var7], this.field443[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lng;II)V")
    private final void method112(class135 arg0, int arg1, int arg2) {
        field445++;
        if (~arg1 == arg2) {
            this.field439 = arg0.method920((byte) 113);
        } else if (arg1 == 2) {
            int var4 = arg0.method920((byte) 100);
            this.field438 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field438[var5] = arg0.method927(125);
            }
        } else if (arg1 == 3) {
            this.field452 = true;
        } else if (arg1 == 40) {
            int var8 = arg0.method920((byte) 92);
            this.field440 = new short[var8];
            this.field446 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field446[var9] = (short) arg0.method927(125);
                this.field440[var9] = (short) arg0.method927(127);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method920((byte) 108);
            this.field449 = new short[var6];
            this.field443 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field449[var7] = (short) arg0.method927(127);
                this.field443[var7] = (short) arg0.method927(126);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field447[arg1 - 60] = arg0.method927(126);
            return;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)Lni;")
    public final class20 method113(boolean arg0) {
        field437++;
        if (this.field438 == null) {
            return null;
        }
        class20[] var2 = new class20[this.field438.length];
        for (int var3 = 0; var3 < this.field438.length; var3++) {
            var2[var3] = class20.method157(class107.field1885, this.field438[var3], 0);
        }
        class20 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class20(var2, var2.length);
        }
        if (this.field446 != null) {
            for (int var5 = 0; var5 < this.field446.length; var5++) {
                var4.method142(this.field446[var5], this.field440[var5]);
            }
        }
        if (this.field449 != null) {
            for (int var6 = 0; var6 < this.field449.length; var6++) {
                var4.method161(this.field449[var6], this.field443[var6]);
            }
        }
        if (!arg0) {
            field434 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILng;)V")
    public final void method114(int arg0, class135 arg1) {
        if (arg0 != -1) {
            this.field439 = -17;
        }
        field442++;
        while (true) {
            int var3 = arg1.method920((byte) 96);
            if (var3 == 0) {
                return;
            }
            this.method112(arg1, var3, -2);
        }
    }
}
