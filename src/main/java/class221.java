import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class221 extends class115 {

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "Ldp;")
    public static class347 field3157;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field3156;

    static {
        new class347("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field3157 = new class347("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILjava/lang/String;IBI)V", line = 5)
    public static final void method1401(int arg0, String arg1, int arg2, byte arg3, int arg4) {
        field3156++;
        class310 var5 = class406.method2442((byte) -64, arg0, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field4790 != null) {
            class120 var6 = new class120();
            var6.field1829 = arg1;
            var6.field1835 = arg4;
            var6.field1832 = var5.field4790;
            var6.field1833 = var5;
            class64.method449(var6);
        }
        if (class411.field6213 != 9) {
            return;
        }
        boolean var7 = true;
        if (var5.field4680 != 0) {
            var7 = class368.method2196(-12285, var5);
        }
        if (!var7 || !client.method3039(var5).method2407((byte) -122, arg4 - 1)) {
            return;
        }
        if (arg4 == 1) {
            class276.field4113++;
            class97.method758(class409.field6165, false);
            class195.method1291(-2, var5.field4665, arg2, arg0);
        }
        if (arg4 == 2) {
            class97.method758(class228.field3211, false);
            class481.field7110++;
            class195.method1291(-2, var5.field4665, arg2, arg0);
        }
        if (arg4 == 3) {
            class480.field7107++;
            class97.method758(class8.field71, false);
            class195.method1291(-2, var5.field4665, arg2, arg0);
        }
        if (arg3 != -115) {
            method1403(-112);
        }
        if (arg4 == 4) {
            class413.field6234++;
            class97.method758(class264.field3938, false);
            class195.method1291(-2, var5.field4665, arg2, arg0);
        }
        if (arg4 == 5) {
            class97.method758(class385.field5802, false);
            class224.field3163++;
            class195.method1291(-2, var5.field4665, arg2, arg0);
        }
        if (arg4 == 6) {
            class97.method758(class252.field3436, false);
            class210.field3028++;
            class195.method1291(-2, var5.field4665, arg2, arg0);
        }
        if (arg4 == 7) {
            class175.field2567++;
            class97.method758(class129.field1919, false);
            class195.method1291(arg3 ^ 0x73, var5.field4665, arg2, arg0);
        }
        if (arg4 == 8) {
            class97.method758(class535.field7869, false);
            class154.field2342++;
            class195.method1291(-2, var5.field4665, arg2, arg0);
        }
        if (arg4 == 9) {
            class399.field5956++;
            class97.method758(class509.field7483, false);
            class195.method1291(-2, var5.field4665, arg2, arg0);
        }
        if (arg4 == 10) {
            class525.field7767++;
            class97.method758(class187.field2751, false);
            class195.method1291(arg3 ^ 0x73, var5.field4665, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V", line = 129)
    public static void method1402(byte arg0) {
        field3157 = null;
        if (arg0 > -116) {
            method1402((byte) -37);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 139)
    public static final void method1403(int arg0) {
        field3154++;
        if (class254.field3443 < 1024.0F) {
            class254.field3443 = 1024.0F;
        }
        if (class254.field3443 > 3072.0F) {
            class254.field3443 = 3072.0F;
        }
        while (class311.field4836 >= 16384.0F) {
            class311.field4836 -= 16384.0F;
        }
        while (class311.field4836 < 0.0F) {
            class311.field4836 += 16384.0F;
        }
        int var1 = class295.field4416 >> 7;
        int var2 = class125.field1880 >> 7;
        int var3 = class50.method373(class521.field7651, arg0 + 14970, class125.field1880, class295.field4416);
        int var4 = 0;
        if (~var1 < arg0 && var2 > 3 && var1 < (class50.field640 - 4) && var2 < (class448.field6611 - 4)) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class521.field7651;
                    if (var7 < 3 && class252.method1506(0, var6, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class238.field3331.field6751 != null && class238.field3331.field6751[var7] != null) {
                        var8 = (class238.field3331.field6751[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 + var3 - class249.field3405[var7].method707(var5, var6);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class196.field2881) {
            class196.field2881 += (var10 - class196.field2881) / 24;
        } else if (var10 < class196.field2881) {
            class196.field2881 += (var10 - class196.field2881) / 80;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 223)
    public class221() {
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V", line = 234)
    public class221(int arg0) {
        this.field3155 = arg0;
    }
}
