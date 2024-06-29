import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class87 {

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "Ld;")
    private class242 field1419 = new class242(64);

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Ld;")
    public class242 field1425 = new class242(64);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Lum;")
    public class83 field1417;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Lum;")
    private class83 field1418;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Ljp;")
    public static class55 field1424 = new class55(101, 2);

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "Lpn;")
    public static class49 field1427 = new class49(20, -1);

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "Lsc;")
    public static class270 field1429 = new class270(0, 2, 2, 1);

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "Leg;")
    public static class34 field1430 = new class34("", 14);

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field1428;

    static {
        new class179("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V", line = 3)
    public final void method768(int arg0, int arg1) {
        field1420++;
        class242 var3 = this.field1419;
        synchronized (this.field1419) {
            this.field1419.method1631(arg0, (byte) -19);
        }
        if (arg1 == 64) {
            class242 var4 = this.field1425;
            synchronized (this.field1425) {
                this.field1425.method1631(arg0, (byte) -19);
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)Lef;", line = 21)
    public final class444 method769(int arg0, int arg1) {
        field1422++;
        class242 var3 = this.field1419;
        class444 var4;
        synchronized (this.field1419) {
            var4 = (class444) this.field1419.method1634((long) arg0, 64);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field1418;
        byte[] var6;
        synchronized (this.field1418) {
            var6 = this.field1418.method731(arg1 - 34, arg0, arg1);
        }
        class444 var7 = new class444();
        var7.field6608 = this;
        if (var6 != null) {
            var7.method2738((byte) 48, new class194(var6));
        }
        class242 var8 = this.field1419;
        synchronized (this.field1419) {
            this.field1419.method1623((long) arg0, arg1 + 17587, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V", line = 52)
    public final void method770(boolean arg0) {
        class242 var2 = this.field1419;
        synchronized (this.field1419) {
            this.field1419.method1630(-27);
        }
        field1423++;
        class242 var3 = this.field1425;
        synchronized (this.field1425) {
            if (arg0) {
                field1428 = -50;
            }
            this.field1425.method1630(-35);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(Z)V", line = 75)
    public final void method771(boolean arg0) {
        class242 var2 = this.field1419;
        synchronized (this.field1419) {
            this.field1419.method1637((byte) 13);
        }
        field1421++;
        if (!arg0) {
            class242 var3 = this.field1425;
            synchronized (this.field1425) {
                this.field1425.method1637((byte) 13);
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 91)
    public static void method772(int arg0) {
        if (arg0 == 2) {
            field1424 = null;
            field1427 = null;
            field1430 = null;
            field1429 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lpt;ILum;Lum;)V", line = 146)
    public class87(class308 arg0, int arg1, class83 arg2, class83 arg3) {
        this.field1417 = arg3;
        this.field1418 = arg2;
        this.field1418.method748(34, 12408);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V", line = 111)
    public final void method773(int arg0, int arg1, int arg2) {
        field1426++;
        if (arg2 == 64) {
            this.field1419 = new class242(arg1);
            this.field1425 = new class242(arg0);
        }
    }
}
