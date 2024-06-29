import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class41 {

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Z")
    public static boolean field635 = false;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Ljava/lang/String;")
    public static String field633 = "";

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "F")
    public static float field628;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field636;

    static {
        new class180("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 6)
    public static final String method317(byte arg0, long arg1) {
        field636++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            if (arg0 != 26) {
                field635 = true;
            }
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class103.field1640[(int) (var7 - arg1 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V", line = 46)
    public static final void method318(byte arg0) {
        field632++;
        for (int var1 = 0; var1 < class322.field4943; var1++) {
            int var2 = class101.field1623[var1];
            class13 var3 = class132.field2030[var2];
            if (var3 != null) {
                class192.method1314(var3.field210.field2214, var3, 53);
            }
        }
        if (arg0 >= -107) {
            method318((byte) 98);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(CB)Z", line = 77)
    public static final boolean method319(char arg0, byte arg1) {
        field634++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg1 == 1) {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)Z", line = 98)
    public static final boolean method320(byte arg0, int arg1) {
        field630++;
        if (arg0 != 101) {
            field631 = -123;
        }
        return arg1 == 2 || arg1 == 3;
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V", line = 109)
    public static final void method321(int arg0) {
        field629++;
        if (arg0 != 19735) {
            return;
        }
        int var1 = class466.field6852.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class466.field6852[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class356.field5386; var4++) {
                    if (class475.field6995[var4] == class274.field3954[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class475.field6995[class356.field5386] = class274.field3954[var2];
                    var3 = class356.field5386++;
                }
                class303 var5 = new class303(class466.field6852[var2]);
                int var6 = 0;
                while (var5.field4333 < class466.field6852[var2].length && var6 < 511 && class322.field4943 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1868(0);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class274.field3954[var2] >> 8) * 64 + var10 - class483.field7082;
                    int var13 = (class274.field3954[var2] & 0xFF) * 64 + var11 - class465.field6840;
                    class148 var14 = class500.field7358.method1605((byte) -117, var5.method1868(0));
                    if (class132.field2030[var7] == null && (var14.field2197 & 0x1) > 0 && class334.field5132 == var9 && var12 >= 0 && var14.field2214 + var12 < class237.field3436 && var13 >= 0 && (var14.field2214 + var13) < class83.field1366) {
                        class132.field2030[var7] = new class13();
                        class132.field2030[var7].field331 = var7;
                        class13 var15 = class132.field2030[var7];
                        class101.field1623[class322.field4943++] = var7;
                        var15.field313 = class180.field2734;
                        var15.method119(var14, arg0 - 19735);
                        var15.method195(var15.field210.field2214, (byte) 2);
                        var15.field385 = var15.field210.field2210 << 3;
                        if (var15.field385 == 0) {
                            var15.method186(15505, 0);
                        } else {
                            var15.method186(15505, var15.field210.field2177 + 4 << 11 & 0x3BB7);
                        }
                        var15.method120((byte) 89, true, var15.method184(1), var13, var12, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V", line = 204)
    public static void method322(int arg0) {
        if (arg0 != 0) {
            method321(-118);
        }
        field633 = null;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
    public abstract void method117(int arg0);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)Z")
    public abstract boolean method121(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIILqa;)Z")
    public abstract boolean method122(int arg0, int arg1, int arg2, class162 arg3);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Lqa;I)V")
    public abstract void method126(class162 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILqa;IZLha;I)V")
    public abstract void method111(int arg0, int arg1, class162 arg2, int arg3, boolean arg4, class41 arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILqa;)Lbw;")
    public abstract class482 method114(int arg0, class162 arg1);
}
