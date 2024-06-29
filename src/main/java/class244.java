import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class class244 extends class130 {

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public int field3685;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public int field3687;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "[I")
    public int[] field3684;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
    public abstract void method384(byte arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILza;)V")
    public static final void method1660(int arg0, class299 arg1) {
        int var2 = -39 % ((arg0 + 31) / 55);
        field3686++;
        if (class256.field4112) {
            class416.method2604(arg1, (byte) 65);
        } else {
            class359.method2285(2, arg1);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
    public abstract void method383(boolean arg0, Canvas arg1);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IILjava/awt/Graphics;ZII)V")
    public abstract void method381(int arg0, int arg1, Graphics arg2, boolean arg3, int arg4, int arg5);

    static {
        new class179("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
    }
}
