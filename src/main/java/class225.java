import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class225 {

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    private int field3733 = 0;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    private int field3719 = -1;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lvj;")
    private class115 field3718 = new class115();

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Z")
    public boolean field3734 = false;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    private int field3721;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[Lca;")
    private class264[] field3722;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    private int field3726;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[[I")
    private int[][] field3728;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "[Lqi;")
    public static class129[] field3724 = new class129[14];

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field3731 = 0;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field3732 = 0;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3729 = " has logged in.";

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)[[I")
    public final int[][] method1581(byte arg0) {
        field3730++;
        if (this.field3726 != this.field3721) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 116) {
            field3732 = 53;
        }
        for (int var2 = 0; var2 < this.field3726; var2++) {
            this.field3722[var2] = class288.field4546;
        }
        return this.field3728;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg2 - arg6;
        int var9 = arg4 - arg6;
        int var10 = arg3 + arg6;
        for (int var11 = arg3; var11 < var10; var11++) {
            class56.method420(class29.field452[var11], arg0, -7, arg7, arg4);
        }
        for (int var12 = arg2; var12 > var8; var12--) {
            class56.method420(class29.field452[var12], arg0, -7, arg7, arg4);
        }
        field3717++;
        int var13 = arg6 + arg7;
        int var14 = var10;
        if (arg5 != 1652) {
            return;
        }
        while (var14 <= var8) {
            int[] var15 = class29.field452[var14];
            class56.method420(var15, arg0, -7, arg7, var13);
            class56.method420(var15, arg1, -7, var13, var9);
            class56.method420(var15, arg0, -7, var9, arg4);
            var14++;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)I")
    public static final int method1583(int arg0, int arg1, int arg2, int arg3) {
        field3727++;
        if (class124.field2012 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg1 & 0x7F;
        if (arg3 != 0) {
            method1586(-101);
        }
        int var7 = arg2;
        int var8 = arg0 & 0x7F;
        if (arg2 < 3 && (class201.field3198[1][var4][var5] & 0x2) == 2) {
            var7 = arg2 + 1;
        }
        int var9 = (128 - var6) * class124.field2012[var7][var4][var5] + class124.field2012[var7][var4 + 1][var5] * var6 >> 7;
        int var10 = (128 - var6) * class124.field2012[var7][var4][var5 + 1] + (class124.field2012[var7][var4 + 1][var5 + 1] * var6) >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public final void method1584(byte arg0) {
        for (int var2 = 0; var2 < this.field3726; var2++) {
            this.field3728[var2] = null;
        }
        if (arg0 <= 124) {
            return;
        }
        this.field3728 = null;
        field3723++;
        this.field3722 = null;
        this.field3718.method854(true);
        this.field3718 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)[I")
    public final int[] method1585(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method1584((byte) 64);
        }
        field3725++;
        if (this.field3726 == this.field3721) {
            this.field3734 = this.field3722[arg1] == null;
            this.field3722[arg1] = class288.field4546;
            return this.field3728[arg1];
        } else if (this.field3726 == 1) {
            this.field3734 = this.field3719 != arg1;
            this.field3719 = arg1;
            return this.field3728[0];
        } else {
            class264 var3 = this.field3722[arg1];
            if (var3 == null) {
                this.field3734 = true;
                if (this.field3726 <= this.field3733) {
                    class264 var4 = (class264) this.field3718.method847(arg0 + 1);
                    var3 = new class264(arg1, var4.field4211);
                    this.field3722[var4.field4213] = null;
                    var4.method1388(arg0 ^ 0x7D);
                } else {
                    var3 = new class264(arg1, this.field3733);
                    this.field3733++;
                }
                this.field3722[arg1] = var3;
            } else {
                this.field3734 = false;
            }
            this.field3718.method846((byte) 127, var3);
            return this.field3728[var3.field4211];
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1586(int arg0) {
        field3729 = null;
        field3724 = null;
        if (arg0 != -1271523481) {
            field3732 = -38;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(III)V")
    public class225(int arg0, int arg1, int arg2) {
        this.field3721 = arg1;
        this.field3722 = new class264[this.field3721];
        this.field3726 = arg0;
        this.field3728 = new int[this.field3726][arg2];
    }
}
