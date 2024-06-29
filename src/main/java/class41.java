import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class41 {

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "Ljava/lang/String;")
    private String field442 = "null";

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "C")
    public char field447;

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "C")
    public char field449;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "Lmn;")
    public static class162 field448;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "Lru;")
    public class177 field432;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "Lru;")
    private class177 field446;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IBLhw;)V")
    private final void method246(int arg0, byte arg1, class208 arg2) {
        if (arg0 == 1) {
            this.field447 = class167.method1058(arg2.method1427(false), 255);
        } else if (arg0 == 2) {
            this.field449 = class167.method1058(arg2.method1427(false), 255);
        } else if (arg0 == 3) {
            this.field442 = arg2.method1448(65535);
        } else if (arg0 == 4) {
            this.field435 = arg2.method1436((byte) 124);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method1455(-3387);
            this.field432 = new class177(class123.method774(arg1 ^ 0xFFFFFFBA, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1436((byte) 106);
                class529 var7;
                if (arg0 == 5) {
                    var7 = new class446(arg2.method1448(65535));
                } else {
                    var7 = new class330(arg2.method1436((byte) 88));
                }
                this.field432.method1127(var7, (byte) 82, (long) var6);
            }
        }
        field441++;
        if (arg1 != 0) {
            this.method247((byte) 39);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
    private final void method247(byte arg0) {
        field445++;
        this.field446 = new class177(this.field432.method1129((byte) -125));
        if (arg0 >= -113) {
            method254(-99);
        }
        for (class446 var2 = (class446) this.field432.method1119(false); var2 != null; var2 = (class446) this.field432.method1121((byte) 28)) {
            class518 var3 = new class518(var2.field6916, (int) var2.field7780);
            this.field446.method1127(var3, (byte) 100, class266.method1813((byte) 114, var2.field6916));
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IB)I")
    public final int method248(int arg0, byte arg1) {
        field438++;
        if (this.field432 == null) {
            return this.field435;
        }
        if (arg1 != 126) {
            this.field442 = null;
        }
        class330 var3 = (class330) this.field432.method1122((byte) 59, (long) arg0);
        return var3 == null ? this.field435 : var3.field5185;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(III[B)[B")
    public static final byte[] method249(int arg0, int arg1, int arg2, byte[] arg3) {
        field433++;
        byte[] var4 = new byte[arg2];
        class324.method2166(arg3, arg1, var4, arg0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lgh;I)I")
    public static final int method250(class350 arg0, int arg1) {
        field439++;
        if (arg1 != -6) {
            return -83;
        }
        int var2 = arg0.field5435;
        class289 var3 = arg0.method418((byte) -41);
        if (arg0.field822) {
            var2 = arg0.field5447;
        } else if (arg0.field837 == var3.field4526 || arg0.field837 == var3.field4543 || arg0.field837 == var3.field4540 || arg0.field837 == var3.field4559) {
            var2 = arg0.field5436;
        } else if (arg0.field837 == var3.field4519 || arg0.field837 == var3.field4531 || arg0.field837 == var3.field4568 || arg0.field837 == var3.field4575) {
            var2 = arg0.field5452;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILhw;)V")
    public final void method251(int arg0, class208 arg1) {
        if (arg0 != -1) {
            this.method257(66);
        }
        while (true) {
            int var3 = arg1.method1445(-96);
            if (var3 == 0) {
                field440++;
                return;
            }
            this.method246(var3, (byte) 0, arg1);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)Z")
    public final boolean method252(int arg0, int arg1) {
        field443++;
        if (this.field432 == null) {
            return false;
        }
        if (this.field446 == null) {
            this.method257(29498);
        }
        if (arg1 == 32061) {
            class330 var3 = (class330) this.field446.method1122((byte) 59, (long) arg0);
            return var3 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method253(int arg0, int arg1) {
        field436++;
        if (this.field432 == null) {
            return this.field442;
        }
        class446 var3 = (class446) this.field432.method1122((byte) 59, (long) arg0);
        if (arg1 == 24667) {
            return var3 == null ? this.field442 : var3.field6916;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)[Ljd;")
    public static final class426[] method254(int arg0) {
        field437++;
        if (arg0 != -7) {
            field448 = null;
        }
        return new class426[] { class181.field2626, class180.field2622, class193.field2858, class257.field4151, class77.field1152, class506.field7562 };
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)V")
    public static void method255(byte arg0) {
        field448 = null;
        if (arg0 > -51) {
            field448 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method256(byte arg0, String arg1) {
        field434++;
        if (this.field432 == null) {
            return false;
        }
        if (this.field446 == null) {
            this.method247((byte) -124);
        }
        for (class518 var3 = (class518) this.field446.method1122((byte) 59, class266.method1813((byte) 119, arg1)); var3 != null; var3 = (class518) this.field446.method1124((byte) -82)) {
            if (var3.field7682.equals(arg1)) {
                return true;
            }
        }
        if (arg0 > -21) {
            this.method251(67, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
    private final void method257(int arg0) {
        this.field446 = new class177(this.field432.method1129((byte) 117));
        if (arg0 != 29498) {
            this.field442 = null;
        }
        field444++;
        for (class330 var2 = (class330) this.field432.method1119(false); var2 != null; var2 = (class330) this.field432.method1121((byte) 84)) {
            class330 var3 = new class330((int) var2.field7780);
            this.field446.method1127(var3, (byte) 86, (long) var2.field5185);
        }
    }

    static {
        new class213("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }
}
