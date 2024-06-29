import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class60 extends class77 {

    @OriginalMember(owner = "client!qu", name = "r", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
    private int field1017;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
    private int field1015;

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "I")
    private int field1016;

    @OriginalMember(owner = "client!qu", name = "t", descriptor = "I")
    private int field1020;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "Lbl;")
    private class442 field1012;

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
    public static int field1014 = 0;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "[Laa;")
    public static class322[] field1010 = new class322[2048];

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!qu", name = "s", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!qu", name = "v", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "Lsl;")
    private class304 field1013;

    @OriginalMember(owner = "client!qu", name = "u", descriptor = "Llt;")
    public static class458 field1021;

    static {
        new class423("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V", line = 16)
    public static void method422(int arg0) {
        field1021 = null;
        if (arg0 != -10342) {
            method422(-51);
        }
        field1010 = null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)Lsl;", line = 32)
    public final class304 method423(int arg0) {
        field1019++;
        if (arg0 != 37) {
            this.method423(-43);
        }
        if (this.field1013 == null) {
            class161.field2528[2] = this.field1018;
            class161.field2528[3] = this.field1016;
            class161.field2528[0] = this.field1020;
            class161.field2528[1] = this.field1017;
            class161.field2528[5] = this.field1015;
            class11 var2 = this.field1012.field4784;
            class161.field2528[4] = this.field1009;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method61(class161.field2528[var5], (byte) -118)) {
                    return null;
                }
                class48 var7 = var2.method59(class161.field2528[var5], 21645);
                int var8 = var7.field735 ? 64 : 128;
                if (var7.field730 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class315.field4752[var6] = var2.method60(var4, false, class161.field2528[var6], 1.0F, 101, var4);
            }
            this.field1013 = new class304(this.field1012, 6407, var4, var3, class315.field4752);
        }
        return this.field1013;
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lbl;IIIIII)V", line = 94)
    public class60(class442 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1018 = arg3;
        this.field1017 = arg2;
        this.field1015 = arg6;
        this.field1016 = arg4;
        this.field1020 = arg1;
        this.field1009 = arg5;
        this.field1012 = arg0;
    }
}
