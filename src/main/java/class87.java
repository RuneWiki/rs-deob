import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class87 extends class124 {

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field1184 = new String[100];

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "Lfa;")
    public static class156 field1180 = new class156(4);

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field1187 = 0;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field1186;

    static {
        new class331("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILqm;)Ljava/lang/String;", line = 8)
    public static final String method768(int arg0, class97 arg1) {
        if (arg0 >= -25) {
            field1180 = null;
        }
        ++field1179;
        return arg1.field1303 != null && arg1.field1303.length() > 0 ? arg1.field1300 + class85.field1160.method2031(true, class377.field5585) + arg1.field1303 : arg1.field1300;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZIIII)V", line = 24)
    public static final void method769(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1181;
        int var6 = -arg5 + arg4;
        int var7 = -arg3 + arg2;
        if (arg1) {
            method771(20, -111, 112, -8);
        }
        if (var6 != 0) {
            if (~var7 == -1) {
                class388.method2391(arg3, arg5, arg0, (byte) 96, arg4);
            } else {
                int var8 = (var7 << 12) / var6;
                int var9 = arg3 - (arg5 * var8 >> 12);
                int var10;
                int var11;
                if (~arg5 > ~class72.field992) {
                    var10 = (class72.field992 * var8 >> 12) + var9;
                    var11 = class72.field992;
                } else if (arg5 <= class126.field1842) {
                    var10 = arg3;
                    var11 = arg5;
                } else {
                    var11 = class126.field1842;
                    var10 = (class126.field1842 * var8 >> 12) + var9;
                }
                int var12;
                int var13;
                if (~arg4 > ~class72.field992) {
                    var12 = (class72.field992 * var8 >> 12) + var9;
                    var13 = class72.field992;
                } else if (class126.field1842 >= arg4) {
                    var13 = arg4;
                    var12 = arg2;
                } else {
                    var13 = class126.field1842;
                    var12 = (class126.field1842 * var8 >> 12) + var9;
                }
                if (class471.field6963 <= var12) {
                    if (var12 > class401.field5947) {
                        var12 = class401.field5947;
                        var13 = (class401.field5947 - var9 << 12) / var8;
                    }
                } else {
                    var12 = class471.field6963;
                    var13 = (-var9 + class471.field6963 << 12) / var8;
                }
                if (var10 >= class471.field6963) {
                    if (class401.field5947 < var10) {
                        var10 = class401.field5947;
                        var11 = (-var9 + class401.field5947 << 12) / var8;
                    }
                } else {
                    var11 = (class471.field6963 - var9 << 12) / var8;
                    var10 = class471.field6963;
                }
                class7.method49(var10, var11, arg0, var12, var13, -27);
            }
        } else {
            if (~var7 != -1) {
                class413.method2522(arg5, (byte) -44, arg3, arg2, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(IIIIIF)V", line = 129)
    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIB)V", line = 132)
    public final void method770(int arg0, int arg1, int arg2, byte arg3) {
        super.field1819 = arg1;
        super.field1807 = arg2;
        if (arg3 != 21) {
            field1180 = null;
        }
        super.field1812 = arg0;
        ++field1185;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V", line = 145)
    public static final void method771(int arg0, int arg1, int arg2, int arg3) {
        ++field1186;
        String var4 = "tele " + arg0 + "," + (arg3 >> 6) + "," + (arg2 >> 6) + "," + (63 & arg3) + "," + (arg1 & arg2);
        System.out.println(var4);
        class155.method1100(var4, true, arg1 + -60);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lis;Lya;B)I", line = 156)
    public static final int method772(class345 arg0, class38 arg1, byte arg2) {
        if (arg2 != -31) {
            return 10;
        } else {
            ++field1182;
            if (arg0.field4778 != -1) {
                return arg0.field4778;
            } else {
                if (~arg0.field4786 != 0) {
                    class104 var3 = arg1.field425.method1780(arg2 + -31274, arg1.method298() ? arg0.field4786 : arg0.field4783);
                    if (!var3.field1439) {
                        return var3.field1454;
                    }
                }
                return arg0.field4791;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IF)V", line = 182)
    public final void method773(int arg0, float arg1) {
        if (arg0 != 0) {
            method771(122, -20, -27, 0);
        }
        ++field1183;
        super.field1808 = arg1;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V", line = 193)
    public static void method774(int arg0) {
        field1184 = null;
        field1180 = null;
        if (arg0 != -7247) {
            field1184 = null;
        }
    }
}
