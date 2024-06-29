import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class7 extends class365 {

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "Ljava/lang/Object;")
    private Object field47;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "J")
    public static long field44 = -1L;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "[I")
    public static int[] field51;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)V")
    public static void method37(int arg0) {
        field51 = null;
        if (arg0 != 21963) {
            field51 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)V")
    public static final void method38(byte arg0) {
        field45++;
        class324 var1 = null;
        try {
            if (arg0 >= 0) {
                return;
            }
            class275 var2 = class436.field6206.method596(0);
            while (var2.field3979 == 0) {
                class89.method752(0, 1L);
            }
            if (var2.field3979 == 1) {
                var1 = (class324) var2.field3984;
                byte[] var3 = new byte[(int) var1.method2045(118)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2047(0, var3.length - var4, var3, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class193.method1346(new class161(var3), (byte) 61);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2049(65);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)Z")
    public final boolean method39(int arg0) {
        field50++;
        if (arg0 != 30712) {
            method38((byte) 112);
        }
        return false;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class7(Object arg0, int arg1) {
        super(arg1);
        this.field47 = arg0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZIIIIIIII)V")
    public static final void method40(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field48++;
        if (arg0 || arg6 < 1 || arg7 < 1 || arg6 > (class36.field388 - 2) || class68.field998 - 2 < arg7) {
            return;
        }
        if (!class435.method2628(2) && !class190.method1339(0, arg7, class259.field3691, arg3, arg6)) {
            return;
        }
        if (class385.field5285 == null) {
            return;
        }
        class311.field4402.method2731(arg1, class374.field5152, arg6, arg3, 121, arg7, class300.field4249[arg3]);
        if (arg2 < 0) {
            return;
        }
        boolean var9 = class181.field2743;
        class181.field2743 = true;
        int var10 = arg3;
        if (arg3 < 3 && class94.method783(arg6, (byte) -78, arg7)) {
            var10 = arg3 + 1;
        }
        class311.field4402.method2732(arg4, arg5, class300.field4249[arg3], class374.field5152, arg7, arg2, arg6, var10, arg3, arg8, -30570);
        class181.field2743 = var9;
        return;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Z")
    public static final boolean method41(int arg0, int arg1) {
        if (arg0 != 0) {
            field44 = -38L;
        }
        field52++;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method42(int arg0) {
        if (arg0 != 5) {
            field44 = -67L;
        }
        field46++;
        return this.field47;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Z")
    public static final boolean method43(int arg0, int arg1, int arg2) {
        field49++;
        if (!class205.field3005) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class263.field3787[var3] == null || class263.field3787[var3][var4] == null) {
            return false;
        }
        class172 var5 = class263.field3787[var3][var4];
        if (arg1 == -1 && var5.field2602 == 0) {
            for (class73 var6 = (class73) class6.field38.method775(1); var6 != null; var6 = (class73) class6.field38.method763(0)) {
                if (var6.field1048 == 47 || var6.field1048 == 1002 || var6.field1048 == 2 || var6.field1048 == 13 || var6.field1048 == 59) {
                    for (class172 var7 = class361.method2217(var6.field1050, arg0 ^ 0xC0C5149E); var7 != null; var7 = class133.method988((byte) 111, var7)) {
                        if (var5.field2543 == var7.field2543) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class73 var8 = (class73) class6.field38.method775(arg0 ^ 0x3F2F); var8 != null; var8 = (class73) class6.field38.method763(0)) {
                if (var8.field1057 == arg1 && var5.field2543 == var8.field1050 && (var8.field1048 == 47 || var8.field1048 == 1002 || var8.field1048 == 2 || var8.field1048 == 13 || var8.field1048 == 59)) {
                    return true;
                }
            }
        }
        if (arg0 != 16174) {
            field44 = -51L;
        }
        return false;
    }

    static {
        new class151("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field51 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
    }
}
