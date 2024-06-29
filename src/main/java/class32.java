import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class32 {

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "[I")
    public int[] field416 = new int[3];

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "[Lnb;")
    public class212[] field418 = new class212[8];

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "[Lug;")
    public class305[] field414 = new class305[100];

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "[I")
    public int[] field420 = new int[100];

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Z")
    public static boolean field421;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field413;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "[Ldp;")
    public static class319[] field423;

    static {
        new class332("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field422 = 0;
        field421 = false;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V", line = 5)
    public static final void method269(int arg0, int arg1, int arg2) {
        field417++;
        int var3 = -73 / ((-arg1 - 15) / 49);
        class186 var4 = class275.method1789(arg0, (byte) 123, 5);
        var4.method1285(0);
        var4.field2829 = arg2;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([Lje;IB)V", line = 30)
    public static final void method270(class178[] arg0, int arg1, byte arg2) {
        if (arg2 <= 6) {
            field421 = true;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class178 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field2655 == 0) {
                    if (var4.field2548 != null) {
                        method270(var4.field2548, arg1, (byte) 64);
                    }
                    class468 var5 = (class468) class466.field6564.method2305((long) var4.field2631, (byte) 110);
                    if (var5 != null) {
                        class231.method1517(var5.field6584, arg1, -1);
                    }
                }
                if (arg1 == 0 && var4.field2604 != null) {
                    class415 var6 = new class415();
                    var6.field5990 = var4;
                    var6.field5989 = var4.field2604;
                    class477.method2797(var6);
                }
                if (arg1 == 1 && var4.field2639 != null) {
                    if (var4.field2534 >= 0) {
                        class178 var7 = class493.method2885(var4.field2631, 65535);
                        if (var7 == null || var7.field2548 == null || var4.field2534 >= var7.field2548.length || var7.field2548[var4.field2534] != var4) {
                            continue;
                        }
                    }
                    class415 var8 = new class415();
                    var8.field5990 = var4;
                    var8.field5989 = var4.field2639;
                    class477.method2797(var8);
                }
            }
        }
        field419++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 107)
    public static void method271(int arg0) {
        field423 = null;
        if (arg0 != 12984) {
            field421 = false;
        }
    }
}
