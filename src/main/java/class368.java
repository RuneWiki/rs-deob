import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class368 extends class7 implements class31 {

    @OriginalMember(owner = "client!st", name = "w", descriptor = "J")
    public static volatile long field5078;

    @OriginalMember(owner = "client!st", name = "v", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!st", name = "x", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lag;IZ[[I)V")
    public class368(class587 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class488.field6956, class194.field2874, arg1 * arg1 * 6, arg2);
        super.field69.method2632(this, 0);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method32(arg1, arg3[var5], var5 + 34069, arg1, 255);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method29((byte) -86), arg1, arg1, 0, class546.method3319(87, super.field63), super.field69.field8711, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "()V")
    public static final void method2208() {
        for (int var0 = 0; var0 < class635.field9298; ++var0) {
            class577 var1 = class583.field8562[var0];
            class607.method3571(var1);
            class583.field8562[var0] = null;
        }
        class635.field9298 = 0;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BI)I")
    public static final int method2209(byte arg0, int arg1) {
        ++field5079;
        if (arg0 < 101) {
            method2209((byte) -80, -14);
        }
        return arg1 >>> 10;
    }

    static {
        new class572("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        new class572("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field5078 = 0L;
    }
}
