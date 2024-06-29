import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 implements Runnable {

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Z")
    public boolean field1583 = true;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Ljava/lang/Object;")
    public Object field1582 = new Object();

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public int field1585 = 0;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "[I")
    public int[] field1584 = new int[500];

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "[I")
    public int[] field1586 = new int[500];

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Z")
    public static boolean field1571 = false;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lid;")
    private static class60 field1566 = class11.method72("You can(Wt add yourself to your own friend list", (byte) -127);

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Lid;")
    public static class60 field1572 = class11.method72("Lade Titelbild )2 ", (byte) 113);

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static volatile int field1574 = 0;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lid;")
    public static class60 field1568 = class11.method72("Mitglieder)2Welt", (byte) -68);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "[Z")
    public static boolean[] field1578 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lid;")
    public static class60 field1573 = field1566;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Lid;")
    public static class60 field1575 = class11.method72(")1j", (byte) -47);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static final void method488(int arg0) {
        field1580++;
        class144 var1 = (class144) class152.field3400.method496(10153);
        int var2 = 5 / ((-arg0 - 18) / 62);
        while (var1 != null) {
            if (var1.field3235 != null) {
                var1.method1108(29);
            }
            var1 = (class144) class152.field3400.method500(-1);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public static void method489(int arg0) {
        field1578 = null;
        field1572 = null;
        field1573 = null;
        field1566 = null;
        field1575 = null;
        if (arg0 != 500) {
            field1571 = false;
        }
        field1568 = null;
    }

    @OriginalMember(owner = "client!ja", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field1583) {
            Object var1 = this.field1582;
            synchronized (this.field1582) {
                if (this.field1585 < 500) {
                    this.field1586[this.field1585] = class43.field1153;
                    this.field1584[this.field1585] = class21.field494;
                    this.field1585++;
                }
            }
            class128.method1007((byte) 73, 50L);
        }
        field1579++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lpa;II)V")
    public static final void method490(class105 arg0, int arg1, int arg2) {
        field1569++;
        if (class153.field3422 == null) {
            class104.method857(255, (byte) 0, arg1, 255, (byte) 117, true, null);
            class151.field3381[arg2] = arg0;
        } else {
            class153.field3422.field2501 = arg2 * 8 + 5;
            int var3 = class153.field3422.method803(false);
            int var4 = class153.field3422.method803(false);
            arg0.method860(var3, 106, var4);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([BILic;I)V")
    public static final void method491(byte[] arg0, int arg1, class59 arg2, int arg3) {
        field1577++;
        class98 var4 = new class98();
        var4.field2399 = 0;
        var4.field2407 = arg2;
        var4.field2929 = arg3;
        var4.field2397 = arg0;
        class66 var5 = class47.field1243;
        synchronized (class47.field1243) {
            if (arg1 != -2273) {
                field1574 = 48;
            }
            class47.field1243.method508(var4, (byte) 109);
        }
        class157.method1210(false);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)Lub;")
    public static final class141 method492(byte arg0) {
        field1581++;
        int var1 = 9 / ((-arg0 - 25) / 61);
        try {
            return (class141) Class.forName("ud").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class18();
        }
    }
}
