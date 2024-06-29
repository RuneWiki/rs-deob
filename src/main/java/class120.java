import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class120 extends class390 {

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLsc;)Z")
    public static final boolean method820(byte arg0, class193 arg1) {
        field1686++;
        class64 var2 = class375.method2395((byte) 5, arg1.method689((byte) -83));
        if (var2.field871 == -1) {
            return true;
        }
        class322 var3 = class171.method1123(var2.field871, 47);
        if (arg0 < 14) {
            return true;
        } else if (var3.field4421 == -1) {
            return true;
        } else {
            return var3.method2076(1);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(III)V")
    public static final void method821(int arg0, int arg1, int arg2) {
        field1691++;
        class269 var3 = class325.method2089(arg1, (byte) 58);
        if (arg0 < 65) {
            return;
        }
        int var4 = var3.field3744;
        int var5 = var3.field3746;
        int var6 = var3.field3750;
        int var7 = class48.field681[var6 - var5];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class89.method628(var4, class34.field532[var4] & ~var8 | var8 & arg2 << var5, -128);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public static final void method822(int arg0) {
        field1685++;
        class131 var1 = class39.field570;
        synchronized (class39.field570) {
            class39.field570.method900(arg0);
        }
        class131 var2 = class450.field6291;
        synchronized (class450.field6291) {
            class450.field6291.method900(0);
        }
        class131 var3 = class440.field6202;
        synchronized (class440.field6202) {
            class440.field6202.method900(0);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(II)V")
    public class120(int arg0, int arg1) {
        this.field1688 = arg0;
        this.field1687 = arg1;
    }

    static {
        new class442("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field1689 = 0;
        field1690 = 1;
        new class442("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
    }
}
