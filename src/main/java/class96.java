import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public abstract class class96 extends class508 {

    @OriginalMember(owner = "client!dw", name = "D", descriptor = "[Ldw;")
    public class96[] field1343;

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "Z")
    public boolean field1329;

    @OriginalMember(owner = "client!dw", name = "x", descriptor = "Z")
    public static boolean field1337 = false;

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!dw", name = "s", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!dw", name = "u", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!dw", name = "v", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!dw", name = "w", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!dw", name = "y", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!dw", name = "A", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!dw", name = "B", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!dw", name = "E", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!dw", name = "F", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!dw", name = "G", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!dw", name = "H", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!dw", name = "I", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!dw", name = "J", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!dw", name = "t", descriptor = "Lst;")
    public class103 field1333;

    @OriginalMember(owner = "client!dw", name = "C", descriptor = "Lvd;")
    public static class256 field1342;

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "Lln;")
    public class70 field1331;

    static {
        new class169("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)[[I", line = 5)
    public int[][] method36(int arg0, int arg1) {
        field1330++;
        if (arg0 != 3) {
            this.field1329 = true;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)I", line = 21)
    public int method654(int arg0) {
        if (arg0 != 0) {
            this.method655(101);
        }
        field1345++;
        return -1;
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)V", line = 33)
    public void method655(int arg0) {
        if (this.field1329) {
            this.field1331.method400((byte) 4);
            this.field1331 = null;
        } else {
            this.field1333.method692((byte) -117);
            this.field1333 = null;
        }
        field1339++;
        if (arg0 != -29967) {
            field1342 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IILbt;)V", line = 58)
    public void method31(int arg0, int arg1, class88 arg2) {
        field1346++;
        if (arg1 != -1) {
            this.field1343 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(B)V", line = 70)
    public static final void method656(byte arg0) {
        class56.field751.method2088((byte) 116);
        field1341++;
        if (arg0 > -47) {
            method660(true);
        }
        class465.field6839.method2862(97);
        class484.field7042.method2862(97);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)[I", line = 92)
    public final int[] method657(int arg0, int arg1, int arg2) {
        field1349++;
        if (arg2 != -1) {
            this.field1333 = null;
        }
        return this.field1343[arg0].field1329 ? this.field1343[arg0].method37(arg1, 255) : this.field1343[arg0].method36(3, arg1)[0];
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(III)Z", line = 115)
    public static final boolean method658(int arg0, int arg1, int arg2) {
        field1347++;
        if (arg0 > -115) {
            field1342 = null;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(III)[[I", line = 126)
    public final int[][] method659(int arg0, int arg1, int arg2) {
        field1336++;
        if (arg1 > -16) {
            this.method663(83);
        }
        if (this.field1343[arg0].field1329) {
            int[] var4 = this.field1343[arg0].method37(arg2, 255);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1343[arg0].method36(3, arg2);
        }
    }

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "(I)V", line = 159)
    public void method390(int arg0) {
        field1338++;
        if (arg0 < 15) {
            this.method31(123, 114, null);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)V", line = 174)
    public static void method660(boolean arg0) {
        if (!arg0) {
            field1342 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(B)V", line = 184)
    public static final void method661(byte arg0) {
        field1344++;
        if (arg0 == -69) {
            class91.field1263.method901(((float) class421.field5647.field7698 * 0.1F + 0.7F) * class234.field3055);
            class91.field1263.method840(class131.field1785, class21.field406, class475.field6948, (float) (class191.field2487 << 0), (float) (class64.field814 << 0), (float) (class424.field5838 << 0));
            class91.field1263.method862(class63.field810);
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(II)[I", line = 204)
    public int[] method37(int arg0, int arg1) {
        field1334++;
        if (arg1 == 255) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IZ)V", line = 215)
    public class96(int arg0, boolean arg1) {
        this.field1343 = new class96[arg0];
        this.field1329 = arg1;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIIIIII)V", line = 229)
    public static final void method662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != -1) {
            return;
        }
        field1348++;
        if (!class495.method2961(arg4, arg5 + 61)) {
            return;
        }
        if (class221.field2855[arg4] == null) {
            client.method3043(class296.field3842[arg4], -1, arg1, arg2, arg7, arg8, arg9, arg0, arg3, arg6);
        } else {
            client.method3043(class221.field2855[arg4], -1, arg1, arg2, arg7, arg8, arg9, arg0, arg3, arg6);
        }
    }

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "(I)I", line = 255)
    public int method663(int arg0) {
        field1340++;
        return arg0 == -1 ? -1 : 97;
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(III)V", line = 273)
    public void method664(int arg0, int arg1, int arg2) {
        field1332++;
        int var4 = this.field1335 == 255 ? arg0 : this.field1335;
        if (arg1 != 23124) {
            field1337 = false;
        }
        if (this.field1329) {
            this.field1331 = new class70(var4, arg0, arg2);
        } else {
            this.field1333 = new class103(var4, arg0, arg2);
        }
    }
}
