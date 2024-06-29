import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class332 extends class80 {

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "Lfg;")
    public static class83 field4527 = new class83("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "Lfg;")
    public static class83 field4529;

    @OriginalMember(owner = "client!ap", name = "G", descriptor = "Ltt;")
    public static class60 field4530;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "Lbj;")
    private class159 field4522;

    @OriginalMember(owner = "client!ap", name = "E", descriptor = "Lto;")
    public static class8 field4528;

    static {
        new class83("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field4529 = new class83("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");
        field4530 = new class60();
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIZLvh;)V", line = 6)
    public static final void method1843(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class240 arg6) {
        field4525++;
        class305.field4187 = arg5;
        class284.field3821 = arg3;
        class159.field2290 = arg6;
        class261.field3590 = arg4;
        class281.field3795 = arg1;
        class510.field7488 = 1;
        class362.field5020 = class45.field638.method2028(true) / arg0;
        int var7 = 67 / ((48 - arg2) / 43);
        if (class362.field5020 < 1) {
            class362.field5020 = 1;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)I", line = 31)
    public final int method1844(int arg0, int arg1, int arg2) {
        field4521++;
        if (this.field4522 == null) {
            return arg1;
        } else {
            int var4 = 11 / ((-arg0 - 42) / 59);
            class330 var5 = (class330) this.field4522.method979((byte) 28, (long) arg2);
            return var5 == null ? arg1 : var5.field4495;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 51)
    public final String method1845(int arg0, int arg1, String arg2) {
        field4520++;
        if (this.field4522 == null) {
            return arg2;
        } else {
            class48 var4 = (class48) this.field4522.method979((byte) 28, (long) arg1);
            int var5 = -88 % ((15 - arg0) / 32);
            return var4 == null ? arg2 : var4.field659;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V", line = 72)
    public static final void method1846(int arg0, int arg1) {
        if (arg1 < 20) {
            method1846(-73, 78);
        }
        class201.field2872 = arg0;
        class356.field4865 = -1;
        class517.field7596 = -1;
        field4524++;
        class510.method2997((byte) 79);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Llh;B)V", line = 86)
    public final void method1847(class365 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2099(255);
            if (var3 == 0) {
                field4526++;
                if (arg1 <= 26) {
                    this.method1844(-110, 79, 0);
                    return;
                }
                return;
            }
            this.method1849(var3, arg0, (byte) 58);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 106)
    public static void method1848(int arg0) {
        field4528 = null;
        field4527 = null;
        field4530 = null;
        if (arg0 >= 126) {
            field4529 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILlh;B)V", line = 124)
    private final void method1849(int arg0, class365 arg1, byte arg2) {
        field4523++;
        if (arg2 != 58) {
            this.method1845(114, 40, null);
        }
        if (arg0 != 249) {
            return;
        }
        int var4 = arg1.method2099(255);
        if (this.field4522 == null) {
            int var5 = class420.method2513(var4, 0);
            this.field4522 = new class159(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method2099(255) == 1;
            int var8 = arg1.method2111(arg2 - 60);
            class499 var9;
            if (var7) {
                var9 = new class48(arg1.method2106(-1));
            } else {
                var9 = new class330(arg1.method2056((byte) 108));
            }
            this.field4522.method990((long) var8, (byte) 17, var9);
        }
    }
}
