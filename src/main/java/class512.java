import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class512 extends class78 {

    @OriginalMember(owner = "client!lu", name = "E", descriptor = "I")
    private int field7446;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "I")
    private int field7437;

    @OriginalMember(owner = "client!lu", name = "D", descriptor = "I")
    private int field7445;

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "Lbt;")
    private class33 field7436;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
    private int field7438;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "I")
    private int field7439;

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "I")
    private int field7434;

    @OriginalMember(owner = "client!lu", name = "B", descriptor = "[S")
    public static short[] field7443 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "Ldh;")
    public static class216 field7448;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!lu", name = "A", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "Lhp;")
    private class221 field7435;

    @OriginalMember(owner = "client!lu", name = "y", descriptor = "Lgm;")
    public static class81 field7440;

    static {
        new class44("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field7447 = 0;
        field7448 = new class216(14, 19);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method2993(int arg0, int arg1, int arg2) {
        field7441++;
        int var3 = -128 % ((arg2 + 38) / 44);
        return class431.method2557(arg0, false, arg1) | (arg1 & 0x40000) != 0 || class437.method2573(arg0, (byte) -68, arg1);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lqa;)V", line = 18)
    public static final void method2994(class167 arg0) {
        for (int var1 = class70.field1150; var1 < class251.field3740; var1++) {
            for (int var2 = 0; var2 < class394.field5608; var2++) {
                for (int var3 = 0; var3 < class337.field5000; var3++) {
                    class188 var4 = class461.field6675[var1][var2][var3];
                    if (var4 != null) {
                        class468 var5 = var4.field2764;
                        class468 var6 = var4.field2751;
                        if (var5 != null && var5.method556(-1)) {
                            class336.method2130(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method556(-1)) {
                                class336.method2130(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method558(0, 0, 0, arg0, false, var5, false);
                                var6.method549(false);
                            }
                            var5.method549(false);
                        }
                        for (class317 var7 = var4.field2773; var7 != null; var7 = var7.field4709) {
                            class478 var9 = var7.field4711;
                            if (var9 != null && var9.method556(-1)) {
                                class336.method2130(arg0, var9, var1, var2, var3, var9.field6970 + 1 - var9.field6971, var9.field6959 - var9.field6962 + 1);
                                var9.method549(false);
                            }
                        }
                        class108 var8 = var4.field2756;
                        if (var8 != null && var8.method556(-1)) {
                            class399.method2395(arg0, var8, var1, var2, var3);
                            var8.method549(false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)Lhp;", line = 93)
    public final class221 method599(int arg0) {
        field7444++;
        if (arg0 != 79) {
            method2994(null);
        }
        if (this.field7435 == null) {
            class63.field1093[2] = this.field7437;
            class16 var2 = this.field7436.field2505;
            class63.field1093[3] = this.field7446;
            class63.field1093[5] = this.field7438;
            class63.field1093[4] = this.field7434;
            class63.field1093[1] = this.field7439;
            class63.field1093[0] = this.field7445;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method92(12624, class63.field1093[var5])) {
                    return null;
                }
                class39 var7 = var2.method93((byte) -79, class63.field1093[var5]);
                int var8 = var7.field823 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field824 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class63.field1092[var6] = var2.method94((byte) 84, 1.0F, false, var4, var4, class63.field1093[var6]);
            }
            this.field7435 = new class221(this.field7436, 6407, var4, var3, class63.field1092);
        }
        return this.field7435;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 155)
    public static final long method2995(String arg0, int arg1) {
        field7432++;
        long var2 = (long) arg1;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZ)V", line = 195)
    public static final void method2996(int arg0, boolean arg1) {
        if (arg1) {
            if (class188.field2765 != -1) {
                class409.method2430(class188.field2765, arg0 - 101);
            }
            for (class541 var2 = (class541) class220.field3370.method2285(122); var2 != null; var2 = (class541) class220.field3370.method2283((byte) 11)) {
                if (!var2.method416((byte) -102)) {
                    var2 = (class541) class220.field3370.method2285(38);
                    if (var2 == null) {
                        break;
                    }
                }
                class126.method937(true, var2, true, false);
            }
            class188.field2765 = -1;
            class220.field3370 = new class375(8);
            class69.method540((byte) 96);
            class188.field2765 = class241.field3613;
            class198.method1343(false, -1);
            class531.method3148(arg0 ^ 0xFFFFFFAD);
            class281.method1815(class188.field2765);
        }
        field7442++;
        class161.field2456 = false;
        class18.field206 = "";
        class339.field5024 = "";
        class501.method2927((byte) -65);
        class276.field4122 = -1;
        class253.method1635(class306.field4543, 0);
        class364.field5293 = new class510();
        class364.field5293.field343[0] = class69.field1139 / 2;
        class364.field5293.field6961 = class69.field1139 * 128 / 2;
        class364.field5293.field6965 = class255.field3763 * 128 / 2;
        class364.field5293.field344[arg0] = class255.field3763 / 2;
        class397.field5649 = 0;
        class315.field4688 = 0;
        if (class294.field4381 == 2) {
            class315.field4688 = class530.field7811 << 7;
            class397.field5649 = class370.field5338 << 7;
        } else {
            class31.method173(arg0 ^ 0xFFFFB244);
        }
        class199.method1355(false);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZII)V", line = 257)
    public static final void method2997(boolean arg0, int arg1, int arg2) {
        if (arg1 != -16937) {
            field7440 = null;
        }
        field7433++;
        class304 var3 = class75.method579(arg0, true, arg2);
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field4506.length; var4++) {
                var3.field4506[var4] = -1;
                var3.field4510[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(I)V", line = 289)
    public static void method2998(int arg0) {
        field7448 = null;
        if (arg0 == 1) {
            field7440 = null;
            field7443 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lbt;IIIIII)V", line = 307)
    public class512(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7446 = arg4;
        this.field7437 = arg3;
        this.field7445 = arg1;
        this.field7436 = arg0;
        this.field7438 = arg6;
        this.field7439 = arg2;
        this.field7434 = arg5;
    }
}
