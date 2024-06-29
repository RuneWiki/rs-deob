import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class91 extends Canvas {

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field1084;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "Lao;")
    public static class191 field1088;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "[I")
    public static int[] field1090;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field1092;

    static {
        new class305("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field1086 = 100;
        field1088 = new class191(44, -1);
        field1090 = new int[200];
    }

    @OriginalMember(owner = "client!vr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 20)
    public final void paint(Graphics arg0) {
        field1091++;
        this.field1084.paint(arg0);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIZ)V", line = 30)
    public static final void method504(int arg0, int arg1, int arg2, boolean arg3) {
        field1089++;
        if (arg3) {
            method506((byte) -26);
        }
        if (arg1 == 1007) {
            class432.method2650(class53.field622, arg0, arg2);
        } else if (arg1 == 1001) {
            class432.method2650(class357.field4862, arg0, arg2);
        } else if (arg1 == 1010) {
            class432.method2650(class146.field1933, arg0, arg2);
        } else if (arg1 == 1003) {
            class432.method2650(class518.field7636, arg0, arg2);
        } else if (arg1 == 1004) {
            class432.method2650(class59.field689, arg0, arg2);
            return;
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 61)
    public class91(Component arg0) {
        this.field1084 = arg0;
    }

    @OriginalMember(owner = "client!vr", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 71)
    public final void update(Graphics arg0) {
        field1087++;
        this.field1084.update(arg0);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V", line = 79)
    public static final void method505(byte arg0) {
        class57.method345(arg0 ^ 0x7A, 10);
        field1092++;
        class528.method3134((byte) 124);
        System.gc();
        if (arg0 != 123) {
            field1090 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)V", line = 92)
    public static void method506(byte arg0) {
        field1090 = null;
        field1088 = null;
        if (arg0 >= -82) {
            field1090 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B[I)Ljava/lang/String;", line = 103)
    public static final String method507(byte arg0, int[] arg1) {
        field1085++;
        if (arg0 != 27) {
            method505((byte) -4);
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = class479.field7089;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class29 var5 = class468.field6947.method1083(-88, arg1[var4]);
            if (var5.field289 != -1) {
                class24 var6 = (class24) class266.field3565.method3032(3589, (long) var5.field289);
                if (var6 == null) {
                    class491 var7 = class491.method2969(class282.field3733, var5.field289, 0);
                    if (var7 != null) {
                        var6 = class343.field4596.method1236(var7, true);
                        class266.field3565.method3046((long) var5.field289, var6, arg0 ^ 0x1A);
                    }
                }
                if (var6 != null) {
                    class512.field7462[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }
}
