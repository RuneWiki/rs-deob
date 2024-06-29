import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class439 {

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "Lhc;")
    public static class368 field6193;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public int field6186;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    private int field6187;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public int field6192;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BILrg;I)V")
    private final void method2697(byte arg0, int arg1, class366 arg2, int arg3) {
        field6190++;
        if (arg3 == 1) {
            this.field6187 = arg2.method2297(13352);
        } else if (arg3 == 2) {
            this.field6186 = arg2.method2306((byte) 121);
            this.field6192 = arg2.method2306((byte) 120);
        }
        if (arg0 != 114) {
            field6194 = 67;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZI)V")
    public static final void method2698(boolean arg0, int arg1) {
        class408 var2 = class398.field5514;
        synchronized (class398.field5514) {
            class398.field5514.method2531(arg1, 112);
        }
        field6195++;
        if (!arg0) {
            field6193 = null;
        }
        class408 var3 = class354.field4769;
        synchronized (class354.field4769) {
            class354.field4769.method2531(arg1, 112);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)Lqf;")
    public static final class391 method2699(int arg0, int arg1) {
        field6189++;
        class391 var2 = (class391) class260.field3592.method2529(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class53.field684.method1926(0, arg0, 30);
        class391 var4 = new class391();
        if (var3 != null) {
            var4.method2431(new class366(var3), arg0, 45);
        }
        if (arg1 != -16514) {
            field6194 = 117;
        }
        class260.field3592.method2527(96, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method2700(int arg0, String arg1) throws ClassNotFoundException {
        field6188++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg0 != 30) {
            return null;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public static void method2701(int arg0) {
        field6193 = null;
        if (arg0 != 16186) {
            method2699(-81, -115);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLrg;I)V")
    public final void method2702(byte arg0, class366 arg1, int arg2) {
        if (arg0 != -44) {
            field6194 = 56;
        }
        field6191++;
        while (true) {
            int var4 = arg1.method2306((byte) 66);
            if (var4 == 0) {
                return;
            }
            this.method2697((byte) 114, arg2, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)Ljf;")
    public final class96 method2703(boolean arg0) {
        field6185++;
        if (!arg0) {
            return null;
        }
        class96 var2 = (class96) class339.field4590.method2529(0, (long) this.field6187);
        if (var2 != null) {
            return var2;
        }
        class96 var3 = class96.method739(class370.field5132, this.field6187, 0);
        if (var3 != null) {
            class339.field4590.method2527(-79, (long) this.field6187, var3);
        }
        return var3;
    }

    static {
        new class368("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field6194 = 0;
        field6193 = new class368("glow1:", "leuchten1:", "brillant1:", "brilho1:");
    }
}
