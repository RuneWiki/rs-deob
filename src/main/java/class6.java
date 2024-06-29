import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class class6 {

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "Lee;")
    public static class442 field59;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "[[Z")
    public static boolean[][] field62;

    static {
        new class368("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        new class368("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;", line = 5)
    public static final String[] method27(byte arg0, String arg1, char arg2) {
        field64++;
        if (arg0 < 43) {
            method33(-97);
        }
        int var3 = class393.method2441(arg1, (byte) -98, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2 != arg1.charAt(var8); var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)Z", line = 44)
    public final boolean method32(byte arg0) {
        if (arg0 <= 109) {
            return false;
        } else {
            field61++;
            return this.method31(71) || this.method39((byte) 126) || this.method28(30711);
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V", line = 56)
    public static final void method33(int arg0) {
        field63++;
        for (int var1 = -1; var1 < class11.field86; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class18.field243[var1];
            }
            class423 var6 = class87.field1227[var5];
            if (var6 != null && var6.field2598 > 0) {
                var6.field2598--;
                if (var6.field2598 == 0) {
                    var6.field2589 = null;
                }
            }
        }
        int var2 = 0;
        if (arg0 >= -37) {
            method40(false, (class108) null, false);
        }
        while (var2 < class53.field674) {
            int var3 = class228.field3187[var2];
            class419 var4 = class428.field5951[var3];
            if (var4 != null && var4.field2598 > 0) {
                var4.field2598--;
                if (var4.field2598 == 0) {
                    var4.field2589 = null;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)V", line = 116)
    public static void method35(byte arg0) {
        field59 = null;
        if (arg0 != -33) {
            field65 = 38;
        }
        field62 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZLrg;)Lpg;", line = 133)
    public static final class112 method36(boolean arg0, class366 arg1) {
        field58++;
        return arg0 ? new class112(arg1.method2257((byte) 110), arg1.method2257((byte) 110), arg1.method2257((byte) 110), arg1.method2257((byte) 110), arg1.method2263((byte) 10), arg1.method2263((byte) 10), arg1.method2306((byte) 95)) : null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZLvg;Z)V", line = 161)
    public static final void method40(boolean arg0, class108 arg1, boolean arg2) {
        field60++;
        int var3 = arg1.field1543 == 0 ? arg1.field1568 : arg1.field1543;
        int var4 = arg1.field1629 == 0 ? arg1.field1577 : arg1.field1629;
        class87.method691(arg1.field1631, arg0, var4, var3, class103.field1425[arg1.field1631 >> 16], 127);
        if (arg1.field1651 != null) {
            class87.method691(arg1.field1631, arg0, var4, var3, arg1.field1651, -56);
        }
        if (arg2) {
            method40(true, (class108) null, true);
        }
        class435 var5 = (class435) class171.field2415.method837((byte) -72, (long) arg1.field1631);
        if (var5 != null) {
            class210.method1413((byte) -30, var4, var5.field6146, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lgg;IIII)V", line = 186)
    public static final void method41(class313 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class133.method992(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class284.field3862) {
            class133.method992(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class133.method992(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class354.field4768) {
            class133.method992(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class354.field4768) {
            class133.method992(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class284.field3862 && arg4 <= class354.field4768) {
            class133.method992(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class133.method992(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class284.field3862 && arg4 > 0) {
            class133.method992(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Z")
    public abstract boolean method28(int arg0);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
    public abstract void method29(boolean arg0);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)I")
    public abstract int method30(byte arg0);

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)Z")
    public abstract boolean method31(int arg0);

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)I")
    public abstract int method34(boolean arg0);

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)Lmp;")
    public abstract class21 method37(int arg0);

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)V")
    public abstract void method38(int arg0);

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(B)Z")
    public abstract boolean method39(byte arg0);
}
