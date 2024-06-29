import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class58 {

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    private int field607 = 0;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "[Lgl;")
    public class338[] field604;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field592 = "Connection lost.";

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field593 = 0;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "Lph;")
    public static class114 field601 = new class114(64);

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "J")
    private long field605;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Lam;")
    public static class286 field598;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lgl;")
    private class338 field587;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Lgl;")
    private class338 field608;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Z")
    public static boolean field609;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public final void method307(byte arg0) {
        field589++;
        if (arg0 != 115) {
            return;
        }
        for (int var2 = 0; var2 < this.field591; var2++) {
            class338 var3 = this.field604[var2];
            while (true) {
                class338 var4 = var3.field4505;
                if (var3 == var4) {
                    break;
                }
                var4.method1967(-1);
            }
        }
        this.field587 = null;
        this.field608 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(JB)Lgl;")
    public final class338 method308(long arg0, byte arg1) {
        int var4 = 121 / ((-arg1 - 54) / 38);
        this.field605 = arg0;
        field606++;
        class338 var5 = this.field604[(int) (arg0 & (long) (this.field591 - 1))];
        for (this.field587 = var5.field4505; this.field587 != var5; this.field587 = this.field587.field4505) {
            if (this.field587.field4510 == arg0) {
                class338 var6 = this.field587;
                this.field587 = this.field587.field4505;
                return var6;
            }
        }
        this.field587 = null;
        return null;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
    public static void method309(byte arg0) {
        if (arg0 != 45) {
            method309((byte) 42);
        }
        field592 = null;
        field598 = null;
        field601 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)Lgl;")
    public final class338 method310(int arg0) {
        if (arg0 >= -63) {
            this.method311(-23);
        }
        field588++;
        if (this.field607 > 0 && this.field604[this.field607 - 1] != this.field608) {
            class338 var2 = this.field608;
            this.field608 = var2.field4505;
            return var2;
        }
        while (this.field607 < this.field591) {
            class338 var3 = this.field604[this.field607++].field4505;
            if (this.field604[this.field607 - 1] != var3) {
                this.field608 = var3.field4505;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)I")
    public final int method311(int arg0) {
        field595++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field591; var3++) {
            class338 var4 = this.field604[var3];
            for (class338 var5 = var4.field4505; var5 != var4; var5 = var5.field4505) {
                var2++;
            }
        }
        if (arg0 == 3369) {
            return var2;
        } else {
            return -118;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)Lgl;")
    public final class338 method312(int arg0) {
        field597++;
        if (this.field587 == null) {
            return null;
        }
        class338 var2 = this.field604[(int) ((long) (this.field591 + arg0) & this.field605)];
        while (this.field587 != var2) {
            if (this.field587.field4510 == this.field605) {
                class338 var3 = this.field587;
                this.field587 = this.field587.field4505;
                return var3;
            }
            this.field587 = this.field587.field4505;
        }
        this.field587 = null;
        return null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lvm;ILam;)V")
    public static final void method313(class322 arg0, int arg1, class286 arg2) {
        field600++;
        class241[] var3 = class241.method1291(arg2, class123.field1579, 0);
        class111.field1371 = new class20[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class111.field1371[var4] = arg0.method1633(var3[var4], true);
        }
        class241[] var5 = class241.method1291(arg2, class99.field1172, 0);
        class272.field3677 = new class20[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class272.field3677[var6] = arg0.method1633(var5[var6], true);
        }
        class241[] var7 = class241.method1291(arg2, class259.field3520, 0);
        class105.field1294 = new class20[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class105.field1294[var8] = arg0.method1633(var7[var8], true);
        }
        class241[] var9 = class241.method1291(arg2, class140.field1795, 0);
        class437.field6391 = new class20[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class437.field6391[var10] = arg0.method1633(var9[var10], true);
        }
        class241[] var11 = class241.method1291(arg2, class206.field2781, 0);
        class270.field3662 = new class20[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class270.field3662[var12] = arg0.method1633(var11[var12], true);
        }
        class241[] var13 = class241.method1291(arg2, class188.field2367, 0);
        class209.field2845 = new class20[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class209.field2845[var14] = arg0.method1633(var13[var14], true);
        }
        int var15 = -75 / ((8 - arg1) / 46);
        class241[] var16 = class241.method1291(arg2, class132.field1710, 0);
        class131.field1696 = new class20[var16.length];
        for (int var17 = 0; var17 < var16.length; var17++) {
            class131.field1696[var17] = arg0.method1633(var16[var17], true);
        }
        class241[] var18 = class241.method1291(arg2, class154.field1946, 0);
        class119.field1480 = new class20[var18.length];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class119.field1480[var19] = arg0.method1633(var18[var19], true);
        }
        class241[] var20 = class241.method1291(arg2, class36.field349, 0);
        class382.field5446 = new class20[var20.length];
        for (int var21 = 0; var21 < var20.length; var21++) {
            class382.field5446[var21] = arg0.method1633(var20[var21], true);
        }
        class241[] var22 = class241.method1291(arg2, class298.field4072, 0);
        class32.field319 = new class20[var22.length];
        for (int var23 = 0; var23 < var22.length; var23++) {
            class32.field319[var23] = arg0.method1633(var22[var23], true);
        }
        class241[] var24 = class241.method1291(arg2, class23.field217, 0);
        class211.field2865 = new class20[var24.length];
        for (int var25 = 0; var25 < var24.length; var25++) {
            class211.field2865[var25] = arg0.method1633(var24[var25], true);
        }
        class241[] var26 = class241.method1291(arg2, class98.field1163, 0);
        class88.field999 = new class20[var26.length];
        for (int var27 = 0; var27 < var26.length; var27++) {
            class88.field999[var27] = arg0.method1633(var26[var27], true);
        }
        class241[] var28 = class241.method1291(arg2, class75.field842, 0);
        class220.field2943 = new class20[var28.length];
        for (int var29 = 0; var29 < var28.length; var29++) {
            class220.field2943[var29] = arg0.method1633(var28[var29], true);
        }
        class411.field5943 = arg0.method1633(class241.method1289(arg2, class110.field1360, 0), true);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(JLgl;I)V")
    public final void method314(long arg0, class338 arg1, int arg2) {
        if (arg1.field4506 != null) {
            arg1.method1967(-1);
        }
        field596++;
        class338 var5 = this.field604[(int) (arg0 & (long) (this.field591 - 1))];
        arg1.field4506 = var5.field4506;
        arg1.field4505 = var5;
        arg1.field4506.field4505 = arg1;
        arg1.field4505.field4506 = arg1;
        if (arg2 == 7079) {
            arg1.field4510 = arg0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)Lgl;")
    public final class338 method315(byte arg0) {
        if (arg0 >= -56) {
            return null;
        } else {
            field603++;
            this.field607 = 0;
            return this.method310(-66);
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)V")
    public static final void method316(byte arg0) {
        field602++;
        if (arg0 != -16) {
            field593 = -64;
        }
        if (class327.field4353 != null && class204.field2764 != null) {
            return;
        }
        class327.field4353 = new int[256];
        class204.field2764 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class327.field4353[var1] = (int) (Math.sin(var2) * 4096.0D);
            class204.field2764[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)I")
    public final int method317(byte arg0) {
        int var2 = -98 % ((-arg0 - 18) / 57);
        field599++;
        return this.field591;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
    public class58(int arg0) {
        this.field604 = new class338[arg0];
        this.field591 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class338 var3 = this.field604[var2] = new class338();
            var3.field4505 = var3;
            var3.field4506 = var3;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([Lgl;B)I")
    public final int method318(class338[] arg0, byte arg1) {
        field610++;
        int var3 = -98 / ((arg1 - 42) / 51);
        int var4 = 0;
        for (int var5 = 0; var5 < this.field591; var5++) {
            class338 var6 = this.field604[var5];
            for (class338 var7 = var6.field4505; var7 != var6; var7 = var7.field4505) {
                arg0[var4++] = var7;
            }
        }
        return var4;
    }
}
