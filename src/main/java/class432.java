import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class432 extends class492 {

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "[Lpc;")
    public static class456[] field6354;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    public static int field6353;

    static {
        new class423("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field6354 = new class456[50];
        field6355 = 1403;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 5)
    public static void method2529(byte arg0) {
        field6354 = null;
        int var1 = -25 % ((arg0 + 83) / 41);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 15)
    public static final void method2530(String arg0, byte arg1) {
        if (arg1 >= -94) {
            method2531((byte) -10);
        }
        field6352++;
        System.out.println("Error: " + class151.method978((byte) -42, "\n", arg0, "%0a"));
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V", line = 37)
    public static final void method2531(byte arg0) {
        int var1 = 16 / ((70 - arg0) / 47);
        class329.field4937.method1947(class73.field1311, class463.field7116.field2947 ? class400.field5826 + 256 << 0 : -1, 256);
        field6353++;
    }
}
