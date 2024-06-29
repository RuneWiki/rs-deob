import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class323 {

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field4538 = 0;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lsl;")
    public static class318 field4540 = new class318(69, 0);

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "F")
    public static float field4542 = 0.0F;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "[I")
    public static int[] field4544 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Lgk;")
    public static class331 field4543 = new class331("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    private int field4541;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public int field4545;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "[[I")
    public static int[][] field4549;

    static {
        new class331("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field4550 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 6)
    public static void method1993(int arg0) {
        if (arg0 == 2) {
            field4544 = null;
            field4549 = null;
            field4540 = null;
            field4543 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)I", line = 19)
    public final int method1994(int arg0) {
        field4546++;
        if (arg0 >= -93) {
            field4538 = -4;
        }
        return this.field4545 & 0x3FFF;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V", line = 36)
    public final void method1995(int arg0, int arg1) {
        this.field4545 = arg0;
        field4548++;
        this.field4541 = 0;
        int var3 = -7 / ((arg1 - 51) / 55);
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V", line = 48)
    public static final void method1996(int arg0) {
        field4537++;
        if (class225.field3300 != null) {
            class111.field1573.method2953(43);
            class496.method2971();
            class489.method2941(arg0 ^ 0xFFFFFF8F);
            class40.method400((byte) 126);
            class393.method2407(false);
            class461.method2764(0);
            if (class423.field6245 != null) {
                class423.field6245.method1840(arg0 ^ 0xFFFFF000);
            }
            class199.method1399(arg0 - 1);
            class180.method1264((byte) 124);
            class464.method2783(false);
            class75.method709(arg0 + 4095, false);
            class230.method1546(64);
            for (int var1 = 0; var1 < 2048; var1++) {
                class364 var5 = class384.field5647[var1];
                if (var5 != null) {
                    var5.field1780 = null;
                    for (int var6 = 0; var6 < var5.field1781.length; var6++) {
                        var5.field1781[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class250.field3690.length; var2++) {
                class461 var3 = class250.field3690[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1781.length; var4++) {
                        var3.field1781[var4] = null;
                    }
                }
            }
            class225.field3300.method333(true);
            class225.field3300 = null;
        }
        if (arg0 != 0) {
            field4544 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)V", line = 122)
    public static final void method1997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class413 var7 = new class413();
        var7.field6133 = arg1 >> class527.field7754;
        var7.field6131 = arg2 >> class527.field7754;
        var7.field6121 = arg3 >> class527.field7754;
        var7.field6124 = arg4 >> class527.field7754;
        var7.field6127 = arg0;
        var7.field6122 = arg1;
        var7.field6139 = arg2;
        var7.field6126 = arg3;
        var7.field6123 = arg4;
        var7.field6136 = arg5;
        var7.field6129 = arg6;
        class382.field5621[class209.field3030++] = var7;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V", line = 141)
    public final void method1998(boolean arg0) {
        if (arg0) {
            field4544 = null;
        }
        field4547++;
        this.field4545 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)Z", line = 166)
    public final boolean method1999(int arg0, int arg1, int arg2, int arg3) {
        field4539++;
        int var5 = this.field4541;
        if (this.field4545 == arg3 && this.field4541 == 0) {
            return false;
        }
        boolean var8;
        if (this.field4541 == 0) {
            if (this.field4545 < arg3 && (this.field4545 + arg0) >= arg3 || this.field4545 > arg3 && this.field4545 - arg0 <= arg3) {
                this.field4545 = arg3;
                return false;
            }
            var8 = true;
        } else if (this.field4541 > 0 && arg3 > this.field4545) {
            int var6 = this.field4541 * this.field4541 / (arg0 * 2);
            int var7 = this.field4545 + var6;
            if (var7 < arg3 && this.field4545 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field4541 < 0 && this.field4545 > arg3) {
            int var9 = this.field4541 * this.field4541 / (arg0 * 2);
            int var10 = this.field4545 - var9;
            if (arg3 < var10 && var10 <= this.field4545) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg3 <= this.field4545) {
                this.field4541 -= arg0;
                if (arg1 != 0 && this.field4541 < -arg1) {
                    this.field4541 = -arg1;
                }
            } else {
                this.field4541 += arg0;
                if (arg1 != 0 && arg1 < this.field4541) {
                    this.field4541 = arg1;
                }
            }
            if (this.field4541 != var5) {
                int var11 = this.field4541 * this.field4541 / (arg0 * 2);
                if (this.field4545 < arg3) {
                    if (this.field4545 + var11 > arg3) {
                        this.field4541 = var5;
                    }
                } else if (arg3 < this.field4545 && arg3 > this.field4545 - var11) {
                    this.field4541 = var5;
                }
            }
        } else if (this.field4541 > 0) {
            this.field4541 -= arg0;
            if (this.field4541 < 0) {
                this.field4541 = 0;
            }
        } else {
            this.field4541 += arg0;
            if (this.field4541 > 0) {
                this.field4541 = 0;
            }
        }
        this.field4545 += this.field4541 + var5 >> 1;
        return arg2 < 111 ? true : var8;
    }
}
