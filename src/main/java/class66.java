import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class66 {

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Lrd;")
    public static class114 field1434 = class84.method656("*6n", (byte) 124);

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Lrd;")
    public static class114 field1433 = class84.method656("backvmid3", (byte) 116);

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Lrd;")
    public static class114 field1427 = class84.method656("Keine Antwort vom Anmelde)2Server)3", (byte) 123);

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1423 = 0;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field1435 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "Lhe;")
    public static class54 field1428;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field1425;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
    public int[] field1418;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "[Lhe;")
    public static class54[] field1424;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method526(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static void method527(byte arg0) {
        field1427 = null;
        int var1 = 31 / ((37 - arg0) / 49);
        field1434 = null;
        field1428 = null;
        field1424 = null;
        field1433 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public final void method528(int arg0) {
        field1432++;
        if (arg0 == -1926) {
            class59.method437(this.field1418, this.field1421, this.field1420);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
    public static final void method529(int arg0, byte arg1) {
        field1426++;
        class132 var2 = (class132) class132.field3197.method783(-1, (long) arg0);
        int var3 = -48 / ((49 - arg1) / 38);
        if (var2 != null) {
            var2.method540(-26669);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BJ)V")
    public static final void method530(byte arg0, long arg1) {
        field1422++;
        if (arg1 == 0L) {
            return;
        }
        if (class89.field1986 >= 100) {
            class86.method660(class72.field1610, class131.field3168, true, 0);
            return;
        }
        class114 var3 = class42.method295(-26567, arg1).method863(-74);
        if (arg0 > -127) {
            field1427 = null;
        }
        for (int var4 = 0; var4 < class89.field1986; var4++) {
            if (class84.field1874[var4] == arg1) {
                class86.method660(class72.field1610, class101.method786((byte) 125, new class114[] { var3, class70.field1548 }), true, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class128.field3058; var5++) {
            if (class18.field338[var5] == arg1) {
                class86.method660(class72.field1610, class101.method786((byte) 125, new class114[] { class49.field1023, var3, class82.field1844 }), true, 0);
                return;
            }
        }
        if (var3.method881(class7.field103.field3018, false)) {
            return;
        }
        class82.field1843++;
        class84.field1874[class89.field1986++] = arg1;
        class24.field460 = true;
        class61.field1303.method1054(8, 90);
        class61.field1303.method455(arg1, 2);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    protected class66() {
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method531(Component arg0, int arg1) {
        field1430++;
        Method var2 = class43.field896;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class90.field2084);
        arg0.addFocusListener(class90.field2084);
        int var3 = 93 / ((arg1 + 49) / 35);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    public static final void method532(byte arg0) {
        if (arg0 < 48) {
            field1435 = 109;
        }
        field1416++;
        if (!class73.field1637) {
            return;
        }
        class8.field123 = null;
        class124.field2959 = null;
        class127.field3051 = null;
        class20.field347 = null;
        class73.field1640 = null;
        class120.field2799 = null;
        class64.field1381 = null;
        class25.field491 = null;
        class63.field1356 = null;
        class96.field2200 = null;
        class74.field1683 = null;
        class25.field498 = null;
        class112.field2629 = null;
        class70.field1539 = null;
        class20.field358 = null;
        class42.field852 = null;
        class77.field1749 = null;
        class64.field1360 = null;
        class116.field2697 = null;
        class77.field1754 = null;
        class63.field1354 = null;
        class61.field1304 = null;
        class78.method622(10, (byte) 13);
        class84.method643((byte) 101, true);
        class73.field1637 = false;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method533(int arg0, int arg1, int arg2, Component arg3);
}
