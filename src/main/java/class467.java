import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class class467 extends class487 {

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Lqv;")
    public static class316 field6784;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public int field6782;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public int field6783;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public int field6789;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Z")
    public boolean field6785;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)Z")
    public final boolean method556(int arg0) {
        if (arg0 == -1) {
            field6790++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIILog;)V")
    public static final void method2772(int arg0, int arg1, int arg2, int arg3, class467 arg4) {
        class188 var5 = class53.method468(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field6782 = (arg1 << class322.field4795) + class185.field2738;
        arg4.field6789 = arg3;
        arg4.field6783 = (arg2 << class322.field4795) + class185.field2738;
        for (class317 var7 = var5.field2773; var7 != null; var7 = var7.field4709) {
            if (var7.field4711.field6964) {
                int var8 = var7.field4711.method1792(false);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field6789 += var6;
            arg4.field6785 = true;
        } else if (var5.field2756 != null) {
            arg4.field6789 -= var5.field2756.field1623;
        }
        var5.field2753 = arg4;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static void method2773(byte arg0) {
        field6784 = null;
        if (arg0 <= 105) {
            field6788 = -30;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIILqa;ZLee;Z)V")
    public final void method558(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, class487 arg5, boolean arg6) {
        field6787++;
        if (!arg4) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    public final void method549(boolean arg0) {
        if (arg0) {
            method2773((byte) 65);
        }
        field6786++;
        throw new IllegalStateException();
    }

    static {
        new class44("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field6784 = new class316(28, 4);
        field6788 = -1;
    }
}
