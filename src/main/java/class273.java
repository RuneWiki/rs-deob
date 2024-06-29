import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class273 {

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Lrp;")
    private class288 field4143 = new class288(256);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Llt;")
    private class458 field4136;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Lka;")
    public static class315 field4146;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Lje;")
    public static class265 field4144;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Z")
    public static boolean field4147;

    static {
        new class423("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field4145 = 0;
        field4146 = new class315(8192);
        field4148 = 0;
        field4149 = 0;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 7)
    public static final void method1657(int arg0, int arg1, int arg2, Class arg3) {
        class268 var4 = class321.field4830[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class297 var5 = var4.field4045; var5 != null; var5 = var5.field4500) {
            class205 var6 = var5.field4505;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field3225 == arg1 && var6.field3219 == arg2) {
                class74.method553(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 35)
    public final void method1658(int arg0) {
        class288 var2 = this.field4143;
        synchronized (this.field4143) {
            if (arg0 != 4) {
                this.method1659(25, false);
            }
            this.field4143.method1761(-106);
        }
        field4142++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)Lal;", line = 50)
    public final class62 method1659(int arg0, boolean arg1) {
        field4137++;
        class288 var3 = this.field4143;
        class62 var4;
        synchronized (this.field4143) {
            var4 = (class62) this.field4143.method1752(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4136.method2715(arg0, 26, arg1);
        class62 var6 = new class62();
        if (var5 != null) {
            var6.method436((byte) 95, new class40(var5));
        }
        class288 var7 = this.field4143;
        synchronized (this.field4143) {
            this.field4143.method1758(1, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V", line = 77)
    public final void method1660(int arg0, int arg1) {
        field4138++;
        class288 var3 = this.field4143;
        synchronized (this.field4143) {
            this.field4143.method1760(arg1, arg0 ^ 0xFFFF8940);
            if (arg0 != -2) {
                this.field4143 = null;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)Loa;", line = 93)
    public static final class471 method1661(byte arg0) {
        field4141++;
        if (class486.field7402.length > class244.field3672) {
            return class486.field7402[class244.field3672++];
        } else if (arg0 > -52) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V", line = 108)
    public static void method1662(int arg0) {
        if (arg0 > 94) {
            field4146 = null;
            field4144 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V", line = 126)
    public final void method1663(int arg0) {
        class288 var2 = this.field4143;
        synchronized (this.field4143) {
            this.field4143.method1749((byte) 126);
        }
        int var3 = -122 / ((arg0 - 43) / 57);
        field4140++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIILqq;IZ)V", line = 140)
    public static final void method1664(int arg0, int arg1, int arg2, class318 arg3, int arg4, boolean arg5) {
        arg3.method1982(arg1, arg0, arg1 + arg4, arg0 + arg2);
        field4139++;
        arg3.method1943(arg1, -16777216, arg0, arg2, 1, arg4);
        if (class460.field7088 < 100) {
            return;
        }
        float var6 = (float) class492.field7485 / (float) class492.field7500;
        int var7 = arg4;
        int var8 = arg2;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg2 / var6);
        }
        int var9 = (arg2 - var8) / 2 + arg0;
        int var10 = (arg4 - var7) / 2 + arg1;
        if (class4.field33 == null || class4.field33.method1001() != arg4 || class4.field33.method993() != arg2) {
            class492.method2955(class492.field7497, class492.field7494 + class492.field7485, class492.field7497 - -class492.field7500, class492.field7494, var10, var9, var7 + var10, var8 + var9);
            class492.method2972(arg3);
            class4.field33 = arg3.method1930(var10, var9, var7, var8, false);
        }
        if (!arg5) {
            return;
        }
        class4.field33.method994(var10, var9);
        int var11 = class270.field4077 * var7 / class492.field7500;
        int var12 = class60.field1022 * var8 / class492.field7485;
        int var13 = class305.field4632 * var7 / class492.field7500 + var10;
        int var14 = var8 + var9 - (class22.field277 * var8 / class492.field7485) - var12;
        int var15 = -1996554240;
        if (class64.field1064 == class298.field4512) {
            var15 = -1996488705;
        }
        arg3.method1971(var13, var14, var11, var12, var15, 1);
        arg3.method1918(var13, var14, var11, var12, var15, 0);
        if (field4150 <= 0) {
            return;
        }
        int var16;
        if (class102.field1822 > 50) {
            var16 = 500 - (class102.field1822 * 5);
        } else {
            var16 = class102.field1822 * 5;
        }
        for (class334 var17 = (class334) class492.field7477.method8((byte) -98); var17 != null; var17 = (class334) class492.field7477.method17((byte) 127)) {
            class173 var18 = class492.field7472.method1840((byte) 38, var17.field4985);
            if (class387.method2304(var18, (byte) 125)) {
                if (class28.field358 == var17.field4985) {
                    int var19 = var17.field4980 * var7 / class492.field7500 + var10;
                    int var20 = (class492.field7485 - var17.field4989) * var8 / class492.field7485 + var9;
                    arg3.method1943(var19 - 2, var16 << 24 | 0xFFFF00, var20 - 2, 4, 1, 4);
                } else if (class462.field7107 != -1 && class462.field7107 == var18.field2684) {
                    int var21 = var10 + (var17.field4980 * var7 / class492.field7500);
                    int var22 = (class492.field7485 - var17.field4989) * var8 / class492.field7485 + var9;
                    arg3.method1943(var21 - 2, var16 << 24 | 0xFFFF00, var22 - 2, 4, 1, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lcm;ILlt;)V", line = 254)
    public class273(class491 arg0, int arg1, class458 arg2) {
        this.field4136 = arg2;
        this.field4136.method2726((byte) 113, 26);
    }
}
