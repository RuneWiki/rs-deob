import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class417 {

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "Ltn;")
    public static class109 field5771 = new class109(64);

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "Lcp;")
    public static class399 field5773 = new class399();

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "[J")
    public static long[] field5775 = new long[32];

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "Lij;")
    public static class316 field5774;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIB)I")
    public static final int method2574(int arg0, int arg1, byte arg2) {
        field5772++;
        if (arg2 > -68) {
            field5771 = null;
        }
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILne;Ljava/lang/String;B)Lbc;")
    public static final class285 method2575(int arg0, class76 arg1, String arg2, byte arg3) {
        if (arg3 >= -58) {
            field5775 = null;
        }
        field5776++;
        if (arg0 == 0) {
            return arg1.method613(true, arg2);
        } else if (arg0 == 1) {
            try {
                class9.method48("openjs", new Object[] { (new URL(arg1.field1086.getCodeBase(), arg2)).toString() }, (byte) 114, arg1.field1086);
                class285 var4 = new class285();
                var4.field3875 = 1;
                return var4;
            } catch (Throwable var10) {
                class285 var5 = new class285();
                var5.field3875 = 2;
                return var5;
            }
        } else if (arg0 == 2) {
            try {
                arg1.field1086.getAppletContext().showDocument(new URL(arg1.field1086.getCodeBase(), arg2), "_blank");
                class285 var6 = new class285();
                var6.field3875 = 1;
                return var6;
            } catch (Exception var11) {
                class285 var7 = new class285();
                var7.field3875 = 2;
                return var7;
            }
        } else if (arg0 == 3) {
            try {
                class9.method49(arg1.field1086, "loggedout", -114);
            } catch (Throwable var13) {
            }
            try {
                arg1.field1086.getAppletContext().showDocument(new URL(arg1.field1086.getCodeBase(), arg2), "_top");
                class285 var8 = new class285();
                var8.field3875 = 1;
                return var8;
            } catch (Exception var12) {
                class285 var9 = new class285();
                var9.field3875 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2576(String arg0, int arg1) {
        field5770++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class68.method547((byte) 46, arg0);
        if (var2 == null) {
            return;
        }
        if (arg1 != 1) {
            method2574(41, 102, (byte) 118);
        }
        for (int var3 = 0; var3 < class353.field4751; var3++) {
            String var4 = class196.field2851[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class68.method547((byte) 46, var4);
            if (var5 != null && var5.equals(var2)) {
                class353.field4751--;
                for (int var6 = var3; var6 < class353.field4751; var6++) {
                    class196.field2851[var6] = class196.field2851[var6 + 1];
                    class328.field4461[var6] = class328.field4461[var6 + 1];
                    class323.field4388[var6] = class323.field4388[var6 + 1];
                    class220.field3089[var6] = class220.field3089[var6 + 1];
                    class1.field8[var6] = class1.field8[var6 + 1];
                    class408.field5681[var6] = class408.field5681[var6 + 1];
                }
                class418.field5784 = class260.field3595;
                class127.field1909++;
                class88.field1232.method1151(219, (byte) 105);
                class88.field1232.method2280(class82.method662(12189, arg0), arg1 ^ 0x5BA9AC89);
                class88.field1232.method2285(arg0, (byte) -97);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
    public static void method2577(int arg0) {
        if (arg0 != 2) {
            method2576((String) null, -58);
        }
        field5775 = null;
        field5771 = null;
        field5774 = null;
        field5773 = null;
    }

    static {
        new class368("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
    }
}
