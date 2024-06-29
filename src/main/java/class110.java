import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class110 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Z")
    public static boolean field1445;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Z")
    public static boolean field1447;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lhe;")
    public static class239 field1443;

    static {
        new class194("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field1444 = 0;
        field1445 = false;
        field1447 = false;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Ljg;", line = 10)
    public static final class214 method654(byte arg0) {
        int var1 = -103 % ((arg0 + 1) / 40);
        field1446++;
        class214 var2 = (class214) class281.field4015.method241(100);
        if (var2 == null) {
            return new class214();
        } else {
            class486.field7084--;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIILfg;)V", line = 32)
    public static final void method655(int arg0, int arg1, int arg2, class79 arg3) {
        class468 var4 = class323.method1937(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field6761 = arg3;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V", line = 47)
    public static final void method656(boolean arg0) {
        class129.field1649.method254(56);
        field1448++;
        class475.field6857.method2738(122);
        class315.field4621.method1287(124);
        class114.field1471.method2136(30);
        class508.field7744.method563(0);
        class405.field5947.method1156((byte) -72);
        class286.field4083.method2604(0);
        class53.field820.method2432((byte) -90);
        class78.field1102.method442(0);
        class503.field7685.method1167(-76);
        class89.field1220.method479((byte) -112);
        class281.field4023.method1261((byte) -27);
        class96.field1295.method281(14240);
        class127.field1627.method1952(-17459);
        class228.field3209.method1537(26381);
        class75.field1067.method2824((byte) -95);
        class66.field988.method2746(true);
        class481.field6941.method1330(true);
        class337.field4911.method1593(109);
        class66.field989.method1385((byte) -32);
        class139.method877((byte) -122);
        class424.method2529(0);
        class53.method397((byte) 2);
        if (class371.field5567 != class339.field4941) {
            for (int var1 = 0; var1 < class179.field2567.length; var1++) {
                class179.field2567[var1] = null;
            }
            class53.field821 = 0;
        }
        class224.method1386(-25688);
        class409.method2444(0);
        class478.method2794(1);
        class487.method2909((byte) 53);
        class42.method312(90);
        class396.field5841.method38((byte) -109);
        class481.field6937.method739();
        class280.field3989.method2323(1);
        class246.method1534(117);
        class226.field3190.method1457(-3);
        class275.field3937.method1457(-3);
        class235.field3308.method1457(-3);
        class285.field4074.method1457(-3);
        class238.field3338.method1457(-3);
        class67.field1004.method1457(-3);
        class389.field5781.method1457(-3);
        class212.field3005.method1457(-3);
        class445.field6482.method1457(-3);
        class337.field4916.method1457(-3);
        class456.field6643.method1457(-3);
        class158.field2064.method1457(-3);
        class336.field4868.method1457(-3);
        class1.field1.method1457(-3);
        class469.field6782.method1457(-3);
        class380.field5671.method1457(-3);
        class211.field2979.method1457(-3);
        class70.field1035.method1457(-3);
        class192.field2719.method1457(-3);
        class8.field136.method1457(-3);
        if (arg0) {
            return;
        }
        class69.field1020.method1457(-3);
        class3.field47.method1457(-3);
        class271.field3784.method1457(-3);
        class56.field881.method1457(-3);
        class317.field4657.method1457(-3);
        class310.field4515.method1457(-3);
        class444.field6480.method1457(-3);
        class38.field589.method1457(-3);
        class184.field2614.method1457(-3);
        class411.field6026.method1457(-3);
        class399.field5876.method38((byte) -126);
        class468.field6754.method38((byte) -104);
        class141.field1846.method38((byte) -7);
        class413.field6116.method38((byte) -62);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 148)
    public static void method657(int arg0) {
        field1443 = null;
        if (arg0 != 20483) {
            field1444 = -10;
        }
    }
}
