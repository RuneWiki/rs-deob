import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class508 {

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "Lhi;")
    public static class131 field7687;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "[I")
    public static int[] field7688;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public int field7682;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "Ldq;")
    public class472 field7680;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "[I")
    public int[] field7683;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "[I")
    public static int[] field7685;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "[Lqg;")
    public static class308[] field7681;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lqq;)V")
    public static final void method3037(class318 arg0) {
        for (int var1 = class273.field4149; var1 < class483.field7381; var1++) {
            for (int var2 = 0; var2 < class377.field5492; var2++) {
                for (int var3 = 0; var3 < class347.field5132; var3++) {
                    class268 var4 = class321.field4830[var1][var2][var3];
                    if (var4 != null) {
                        class455 var5 = var4.field4059;
                        class455 var6 = var4.field4063;
                        if (var5 != null && var5.method164(0)) {
                            class82.method591(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method164(0)) {
                                class82.method591(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method165(0, arg0, var5, false, true, 0, 0);
                                var6.method168(80);
                            }
                            var5.method168(-115);
                        }
                        for (class297 var7 = var4.field4045; var7 != null; var7 = var7.field4500) {
                            class205 var9 = var7.field4505;
                            if (var9 != null && var9.method164(0)) {
                                class82.method591(arg0, var9, var1, var2, var3, var9.field3227 + 1 - var9.field3225, var9.field3220 - var9.field3219 + 1);
                                var9.method168(42);
                            }
                        }
                        class376 var8 = var4.field4042;
                        if (var8 != null && var8.method164(0)) {
                            class474.method2854(arg0, var8, var1, var2, var3);
                            var8.method168(-118);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)Luo;")
    public static final class389 method3038(int arg0, int arg1) {
        field7679++;
        if (arg0 <= 90) {
            return null;
        }
        class389 var2 = (class389) class458.field7049.method1752(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class467.field7166.method2715(arg1, 0, false);
        class389 var4 = new class389();
        if (var3 != null) {
            var4.method2313(new class40(var3), -4);
        }
        var4.method2314(-34);
        class458.field7049.method1758(1, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public static final void method3039(int arg0) {
        field7686++;
        class429.field6298 = null;
        class314.field4742 = null;
        class96.field1739 = null;
        class187.field2965 = false;
        class447.field6877 = null;
        if (arg0 == 1) {
            class241.field3634 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)V")
    public static final void method3040(int arg0, int arg1) {
        if (class322.field4842 == 0) {
            class194.field3056.method621(arg1, 80);
        } else {
            class15.field207 = arg1;
        }
        field7684++;
        if (arg0 != -28375) {
            method3039(69);
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
    public static void method3041(int arg0) {
        field7687 = null;
        field7681 = null;
        field7685 = null;
        if (arg0 != 13) {
            field7681 = null;
        }
        field7688 = null;
    }

    static {
        new class423("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field7687 = new class131(13, 0, 1, 0);
        field7688 = new int[100];
    }
}
