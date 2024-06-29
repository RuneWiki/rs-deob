import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class341 extends class269 {

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Ljava/lang/Object;")
    private Object field4862;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "Lea;")
    public static class474 field4857 = new class474("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!df", name = "G", descriptor = "Lig;")
    public static class206 field4867 = new class206(3, 6);

    @OriginalMember(owner = "client!df", name = "H", descriptor = "Z")
    public static boolean field4868;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field4866;

    static {
        new class474("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field4868 = false;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method1430(int arg0) {
        field4855++;
        if (arg0 != 120) {
            this.field4862 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!df", name = "i", descriptor = "(I)V", line = 16)
    public static void method2191(int arg0) {
        if (arg0 == 512) {
            field4857 = null;
            field4867 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 29)
    public final Object method1429(int arg0) {
        field4858++;
        int var2 = -32 % ((arg0 + 23) / 38);
        return this.field4862;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Loa;I)V", line = 40)
    public static final void method2192(class605 arg0, int arg1) {
        field4860++;
        if (!(class111.field1359 >= 2 || class169.field2063) || class39.field425 != null) {
            return;
        }
        int var2 = 12 / ((arg1 - 33) / 38);
        String var3;
        if (class169.field2063 && class111.field1359 < 2) {
            var3 = class442.field6600 + class448.field6683.method2902(class35.field396, -20139) + class180.field2210 + " ->";
        } else if (class565.field8057 && class280.field3915.method284(66, 81) && class111.field1359 > 2) {
            var3 = class159.method920(-12510, (class631) class436.field6487.field1413.field4677.field4677);
        } else {
            class631 var4 = (class631) class436.field6487.field1413.field4677;
            var3 = class159.method920(-12510, var4);
            int[] var5 = null;
            if (class14.method81(var4.field9100, (byte) -102)) {
                var5 = class622.field8999.method25((int) var4.field9099, -74).field2396;
            } else if (var4.field9104 != -1) {
                var5 = class622.field8999.method25(var4.field9104, -106).field2396;
            } else if (class288.method1864((byte) -82, var4.field9100)) {
                class411 var8 = (class411) class42.field456.method524((byte) 83, (long) ((int) var4.field9099));
                if (var8 != null) {
                    class78 var9 = var8.field6254;
                    class566 var10 = var9.field864;
                    if (var10.field8121 != null) {
                        var10 = var10.method3287(112, class23.field243);
                    }
                    if (var10 != null) {
                        var5 = var10.field8136;
                    }
                }
            } else if (class513.method3048(var4.field9100, -119)) {
                Object var6 = null;
                class385 var7;
                if (var4.field9100 == 1008) {
                    var7 = class575.field8301.method1499(-7532, (int) var4.field9099);
                } else {
                    var7 = class575.field8301.method1499(-7532, (int) (var4.field9099 >>> 32 & 0x7FFFFFFFL));
                }
                if (var7.field5793 != null) {
                    var7 = var7.method2453(class23.field243, 0);
                }
                if (var7 != null) {
                    var5 = var7.field5863;
                }
            }
            if (var5 != null) {
                var3 = var3 + class177.method1000(var5, (byte) -83);
            }
        }
        if (class111.field1359 > 2) {
            var3 = var3 + "<col=ffffff> / " + (class111.field1359 - 2) + class644.field9280.method2902(class35.field396, -20139);
        }
        if (class360.field5104 != null) {
            class181 var11 = class360.field5104.method3465(false, arg0);
            if (var11 == null) {
                var11 = class472.field6992;
            }
            var11.method1033(class13.field115, class286.field3960, class360.field5104.field8518, class360.field5104.field8617, class19.field194, class360.field5104.field8570, class229.field3233, class360.field5104.field8506, class547.field7823, class360.field5104.field8638, class360.field5104.field8599, class437.field6499, class515.field7508, (byte) 126, var3);
            class465.method2848(class547.field7823[0], class547.field7823[1], class547.field7823[3], (byte) -68, class547.field7823[2]);
        } else if (class15.field130 != null && class325.field4688 == class184.field2291) {
            int var12 = class472.field6992.method1044(class426.field6340 + 16, 16777215, var3, class437.field6499, class19.field194, (byte) 78, class384.field5787 + 4, class286.field3960, 0, class229.field3233);
            class465.method2848(class384.field5787 + 4, class426.field6340, 16, (byte) -50, class281.field3921.method2554(var3, (byte) 0) + var12);
        }
    }

    @OriginalMember(owner = "client!df", name = "j", descriptor = "(I)V", line = 147)
    public static final void method2193(int arg0) {
        field4864++;
        class637 var1 = (class637) class276.field3851.method719(false);
        if (arg0 != 0) {
            return;
        }
        while (var1 != null) {
            class640 var2 = var1.field9166;
            if (var2.field9197 < class287.field3982) {
                var1.method2108(true);
                var2.method3648(-1249465271);
            } else if (var2.field9193 <= class287.field3982) {
                if (var2.field9220 > 0) {
                    class411 var3 = (class411) class42.field456.method524((byte) 104, (long) (var2.field9220 - 1));
                    if (var3 != null) {
                        class78 var4 = var3.field6254;
                        if (var4.field1764 >= 0 && var4.field1764 < class90.field1032 * 512 && var4.field1768 >= 0 && var4.field1768 < (class30.field349 * 512)) {
                            var2.method3646(-1, var4.field1764, class399.method2547(var4.field1768, var4.field1764, (byte) 78, var2.field1757) - var2.field9223, class287.field3982, var4.field1768);
                        }
                    }
                }
                if (var2.field9220 < 0) {
                    int var5 = -var2.field9220 - 1;
                    class655 var6;
                    if (class244.field3460 == var5) {
                        var6 = class439.field6548;
                    } else {
                        var6 = class142.field1749[var5];
                    }
                    if (var6 != null && var6.field1764 >= 0 && var6.field1764 < class90.field1032 * 512 && var6.field1768 >= 0 && var6.field1768 < class30.field349 * 512) {
                        var2.method3646(-1, var6.field1764, class399.method2547(var6.field1768, var6.field1764, (byte) 88, var2.field1757) - var2.field9223, class287.field3982, var6.field1768);
                    }
                }
                var2.method3653(class529.field7661, -1);
                class367.method2355(var2, true);
            }
            var1 = (class637) class276.field3851.method716(arg0 + 14);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIII)V", line = 218)
    public static final void method2194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 0) {
            field4865 = -9;
        }
        if (arg7 >= class113.field1385 && arg0 <= class4.field43 && class418.field6298 <= arg2 && class461.field6877 >= arg1) {
            method2195(arg7, arg0, arg1, arg5, false, arg6, arg2, arg3);
        } else {
            class62.method442(arg5, arg6, arg7, arg3, arg2, 1, arg1, arg0);
        }
        field4866++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIZIII)V", line = 235)
    private static final void method2195(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field4859++;
        int var8 = arg6 + arg3;
        int var9 = arg2 - arg3;
        for (int var10 = arg6; var10 < var8; var10++) {
            class645.method3675(116, class402.field6087[var10], arg7, arg0, arg1);
        }
        int var11 = arg0 + arg3;
        for (int var12 = arg2; var12 > var9; var12--) {
            class645.method3675(94, class402.field6087[var12], arg7, arg0, arg1);
        }
        int var13 = arg1 - arg3;
        if (arg4) {
            method2192(null, -115);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class402.field6087[var14];
            class645.method3675(107, var15, arg7, arg0, var11);
            class645.method3675(90, var15, arg5, var11, var13);
            class645.method3675(120, var15, arg7, var13, arg1);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZZ)Z", line = 280)
    public static boolean method2196(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)Z", line = 288)
    public static final boolean method2197(int arg0, byte arg1) {
        int var2 = -82 / ((11 - arg1) / 34);
        field4863++;
        return arg0 == 50 || arg0 == 13 || arg0 == 1003 || arg0 == 20 || arg0 == 58;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Luk;Ljava/lang/Object;I)V", line = 299)
    public class341(class221 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field4862 = arg1;
    }
}
