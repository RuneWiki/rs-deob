import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class63 {

    @OriginalMember(owner = "client!r", name = "p", descriptor = "B")
    public byte field860 = 0;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "B")
    public byte field865;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "B")
    public byte field851;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "S")
    public short field849;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "S")
    public short field866;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field852 = 0;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Lhc;")
    public static class368 field848 = new class368("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!r", name = "r", descriptor = "B")
    public byte field862;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "B")
    public byte field864;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "B")
    public byte field869;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "B")
    public byte field872;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Lns;")
    public class174 field871;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Lje;")
    public class301 field854;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Lso;")
    public class312 field856;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Lal;")
    public class371 field859;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "Lal;")
    public class371 field861;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Ljk;")
    public class403 field863;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Ljk;")
    public class403 field867;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Lha;")
    public class48 field853;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "Lr;")
    public class63 field873;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "S")
    public short field870;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "Z")
    public boolean field855;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Z")
    public boolean field857;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Z")
    public boolean field858;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public final void method505(byte arg0) {
        if (arg0 > -10) {
            field852 = 37;
        }
        field868++;
        while (this.field853 != null) {
            class48 var2 = this.field853.field608;
            this.field853.method397((byte) 1);
            this.field853 = var2;
        }
        this.field860 = 0;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 256) {
            field874 = -102;
        }
        field846++;
        if (arg3 == arg6) {
            class65.method520(arg2, arg3, arg4, (byte) -117, arg5, arg7, arg0);
        } else if (class80.field1119 <= arg4 - arg3 && (arg3 + arg4) <= class430.field6003 && arg7 - arg6 >= class143.field2090 && class42.field543 >= arg7 + arg6) {
            class118.method922(arg5, arg4, arg3, arg0, arg2, arg6, 0, arg7);
        } else {
            class375.method2347(arg6, arg2, arg5, arg7, arg3, arg4, arg1 - 190, arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static final void method507(int arg0) {
        class80.field1104 = null;
        class302.field4124 = null;
        class163.field2329 = null;
        class81.field1124 = null;
        class436.field6155 = null;
        int var1 = 117 / ((15 - arg0) / 33);
        field850++;
        class334.field4530 = null;
        class408.field5694 = null;
        class278.field3794 = null;
        class25.field321 = null;
        class305.field4155 = null;
        class362.field4988 = null;
        class408.field5693 = null;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(III)V")
    public class63(int arg0, int arg1, int arg2) {
        this.field851 = this.field865 = (byte) arg0;
        this.field849 = (short) arg2;
        this.field866 = (short) arg1;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public static final void method508(int arg0) {
        field845++;
        int var1 = class75.field1068.method1146((byte) -74, 8);
        if (class11.field86 > var1) {
            for (int var2 = var1; var2 < class11.field86; var2++) {
                class405.field5609[class453.field6503++] = class18.field243[var2];
            }
        }
        if (class11.field86 < var1) {
            throw new RuntimeException("gppov1");
        }
        class11.field86 = 0;
        if (arg0 < 26) {
            method508(-125);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class18.field243[var3];
            class423 var5 = class87.field1227[var4];
            int var6 = class75.field1068.method1146((byte) -109, 1);
            if (var6 == 0) {
                class18.field243[class11.field86++] = var4;
                var5.field2575 = class246.field3467;
            } else {
                int var7 = class75.field1068.method1146((byte) -116, 2);
                if (var7 == 0) {
                    class18.field243[class11.field86++] = var4;
                    var5.field2575 = class246.field3467;
                    class251.field3505[class418.field5783++] = var4;
                } else if (var7 == 1) {
                    class18.field243[class11.field86++] = var4;
                    var5.field2575 = class246.field3467;
                    int var8 = class75.field1068.method1146((byte) -79, 3);
                    var5.method2616(22271, var8, 1);
                    int var9 = class75.field1068.method1146((byte) -69, 1);
                    if (var9 == 1) {
                        class251.field3505[class418.field5783++] = var4;
                    }
                } else if (var7 == 2) {
                    class18.field243[class11.field86++] = var4;
                    var5.field2575 = class246.field3467;
                    if (class75.field1068.method1146((byte) -122, 1) == 1) {
                        int var11 = class75.field1068.method1146((byte) -93, 3);
                        var5.method2616(22271, var11, 2);
                        int var12 = class75.field1068.method1146((byte) -119, 3);
                        var5.method2616(22271, var12, 2);
                    } else {
                        int var10 = class75.field1068.method1146((byte) -80, 3);
                        var5.method2616(22271, var10, 0);
                    }
                    int var13 = class75.field1068.method1146((byte) -71, 1);
                    if (var13 == 1) {
                        class251.field3505[class418.field5783++] = var4;
                    }
                } else if (var7 == 3) {
                    class405.field5609[class453.field6503++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public static void method509(byte arg0) {
        field848 = null;
        if (arg0 >= -38) {
            field848 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lij;B)V")
    public static final void method510(class316 arg0, byte arg1) {
        class251.field3508 = arg0;
        field847++;
        if (arg1 != 10) {
            method506(48, -107, 30, 113, -85, 24, 34, 104);
        }
        class83.field1155 = class251.field3508.method1934((byte) 28, 19);
    }
}
