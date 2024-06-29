import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class222 extends class151 {

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public int field3135 = -1;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public int field3128 = -1;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Lkc;")
    public static class157 field3138;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "Lrb;")
    public static class283 field3140;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "[I")
    public static int[] field3145;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public int field3130;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "[I")
    public static int[] field3144;

    static {
        new class157("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field3136 = 0;
        field3138 = new class157("Drop", "Fallen lassen", "Poser", "Largar");
        new class157("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field3140 = new class283(54, -2);
        field3143 = -1;
        field3145 = new int[8];
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)Lat;", line = 8)
    public static final class444 method1381(int arg0, int arg1, int arg2) {
        ++field3129;
        class444 var3 = class22.method138(70, arg0);
        if (arg1 == -1) {
            return var3;
        } else if (arg2 > -78) {
            return null;
        } else {
            return var3 != null && var3.field6491 != null && ~arg1 > ~var3.field6491.length ? var3.field6491[arg1] : null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLza;)Lql;", line = 43)
    public final class121 method171(byte arg0, class295 arg1) {
        ++field3139;
        class512 var3 = arg1.method541();
        if (arg0 != -96) {
            this.method166((class295) null, 58);
        }
        var3.method955(super.field2327, super.field2328, super.field2322);
        class121 var4 = class399.method2364(3, arg0 ^ 29800);
        if (~this.field3135 != 0) {
            class285 var5 = class534.field7872.method3089(this.field3135, arg0 + 220).method1723(2048, 0, arg1, (class291) null, 0, -1, false, this.field3132, (class55) null);
            if (var5 != null) {
                var5.method701(var3, var4.field1878[2], 0);
            }
        }
        if (~this.field3128 != 0) {
            class285 var6 = class534.field7872.method3089(this.field3128, -1).method1723(2048, 0, arg1, (class291) null, 0, -1, false, this.field3130, (class55) null);
            if (var6 != null) {
                var6.method701(var3, var4.field1878[1], 0);
            }
        }
        class285 var7 = class534.field7872.method3089(this.field3142, 116).method1723(2048, 0, arg1, (class291) null, 0, -1, false, this.field3137, (class55) null);
        if (var7 != null) {
            var7.method701(var3, var4.field1878[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V", line = 86)
    public static void method1382(byte arg0) {
        field3140 = null;
        field3145 = null;
        if (arg0 != -53) {
            field3138 = null;
        }
        field3138 = null;
        field3144 = null;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(III)Loa;", line = 100)
    public static final class168 method1383(int arg0, int arg1, int arg2) {
        class532 var3 = class103.field1632[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7822;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(Lza;I)V", line = 117)
    public final void method166(class295 arg0, int arg1) {
        if (arg1 < 7) {
            field3144 = null;
        }
        ++field3134;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBILza;)Z", line = 127)
    public final boolean method158(int arg0, byte arg1, int arg2, class295 arg3) {
        ++field3133;
        class512 var5 = arg3.method541();
        var5.method955(super.field2327, super.field2328, super.field2322);
        if (arg1 < 58) {
            method1381(94, -28, -116);
        }
        class285 var6 = class534.field7872.method3089(this.field3142, -109).method1723(131072, 0, arg3, (class291) null, 0, -1, false, this.field3137, (class55) null);
        if (var6 != null && var6.method684(arg2, arg0, var5, true)) {
            return true;
        } else {
            if (this.field3128 != -1) {
                class285 var7 = class534.field7872.method3089(this.field3128, 125).method1723(131072, 0, arg3, (class291) null, 0, -1, false, this.field3130, (class55) null);
                if (var7 != null && var7.method684(arg2, arg0, var5, true)) {
                    return true;
                }
            }
            if (~this.field3135 != 0) {
                class285 var8 = class534.field7872.method3089(this.field3135, 118).method1723(131072, 0, arg3, (class291) null, 0, -1, false, this.field3132, (class55) null);
                if (var8 != null && var8.method684(arg2, arg0, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Z", line = 163)
    public static final boolean method1384(int arg0, int arg1) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field3141;
            return ~arg1 == -7 || ~arg1 == -8 || arg1 == 8;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lza;BLdk;)V", line = 174)
    public static final void method1385(class295 arg0, byte arg1, class421 arg2) {
        ++field3131;
        if (!class332.field4519) {
            if (arg1 != -98) {
                field3145 = null;
            }
            arg0.method467(0);
            class61.field884 = arg0.method555(class396.method2350(arg2, field3143), true);
            class61.field884.method2142((class66.field953 - class61.field884.method204()) / 2, (class348.field5033 - class61.field884.method207()) / 2);
            class526.field7675 = arg0.method555(class396.method2350(arg2, class84.field1290), true);
            class526.field7675.method2142((class66.field953 - class526.field7675.method204()) / 2, 18);
            class332.field4519 = true;
        }
    }
}
