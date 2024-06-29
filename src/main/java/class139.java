import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class139 {

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "Z")
    public boolean field1981;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Lkr;")
    public static class602 field1980 = new class602(113, -1);

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "Lsga;")
    public static class651 field1985 = new class651();

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1986 = new Rectangle[100];

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "Ljs;")
    public class174 field1973;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Ljs;")
    public class174 field1976;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "Z")
    public boolean field1977;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "[Lnha;")
    public static class689[] field1983;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ljk;")
    public static final class185 method915(Throwable arg0, String arg1) {
        field1975++;
        class185 var2;
        if ((arg0 instanceof class185)) {
            var2 = (class185) arg0;
            var2.field2533 = var2.field2533 + ' ' + arg1;
        } else {
            var2 = new class185(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static void method916(int arg0) {
        field1983 = null;
        field1986 = null;
        if (arg0 != 100) {
            field1982 = 112;
        }
        field1985 = null;
        field1980 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZJ)V")
    public static final void method917(boolean arg0, long arg1) {
        if (class137.field1948 != null) {
            if (class720.field10023 == 1 || class720.field10023 == 5) {
                class62.method441(arg1, false);
            } else if (class720.field10023 == 4) {
                class394.method2463(arg1, (byte) -81);
            }
        }
        field1979++;
        class626.method3525((long) class483.field6741, -57, class129.field1802);
        if (class544.field7545 != -1) {
            class323.method2075(-19180, class544.field7545);
        }
        for (int var3 = 0; var3 < class381.field5461; var3++) {
            if (class669.field9236[var3]) {
                class514.field7098[var3] = true;
            }
            class531.field7369[var3] = class669.field9236[var3];
            class669.field9236[var3] = false;
        }
        class430.field6016 = class483.field6741;
        class583.method3385((byte) 116, -1, null, -1);
        class480.method2924(null, -1, (byte) 66, -1);
        if (class544.field7545 != -1) {
            class381.field5461 = 0;
            class688.method3876(-15701);
        }
        class129.field1802.method1437();
        if (arg0) {
            field1986 = null;
        }
        class189.method1179(-1786233652, class129.field1802);
        int var4 = class479.method2920(arg0);
        if (var4 == -1) {
            var4 = class222.field3007;
        }
        if (var4 == -1) {
            var4 = class420.field5917;
        }
        class272.method1830(var4, (byte) 125);
        int var5 = class388.field5601.method662((byte) 15) << 8;
        class684.method3852(class449.field6216, class388.field5601.field4408, -1, class388.field5601.field4410 + var5, class388.field5601.field4418 + var5);
        class449.field6216 = 0;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
    public final void method918(int arg0) {
        field1978++;
        if (this.field1973 != null) {
            this.field1973.method970(-113);
        }
        if (arg0 > 66) {
            this.field1977 = false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Z")
    public final boolean method919(int arg0) {
        if (arg0 == 8693) {
            field1974++;
            return this.field1977 && !this.field1981;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V")
    public static final void method920(int arg0, int arg1, int arg2) {
        field1984++;
        if (class496.field6948 == null) {
            return;
        }
        if (arg2 != 1) {
            field1986 = null;
        }
        int var3 = class557.field7745;
        int var4 = class17.field172;
        class533.method3163(arg1, arg0, (byte) 67);
        if (class521.field7260 == 0) {
            class382.field5486 = null;
            class382.field5486 = class496.field6948.method311(class496.field6948.method299(class559.field7774, class239.field3574), class496.field6948.method317(class559.field7774, class239.field3574));
        } else if (class521.field7260 == 1 && (class634.field8539 == null || class557.field7745 != var3 || class17.field172 != var4)) {
            class634.field8539 = new class5[class557.field7745 * class17.field172];
            for (int var5 = 0; var5 < class634.field8539.length; var5++) {
                class634.field8539[var5] = class496.field6948.method311(class496.field6948.method299(class494.field6919, class319.field4441), class496.field6948.method317(class494.field6919, class319.field4441));
            }
            class114.field1525 = 1;
            class321.field4463 = new int[class557.field7745 * class17.field172];
        }
        class569.field7870 = true;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Z)V")
    public class139(boolean arg0) {
        this.field1981 = arg0;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Luq;ZZ)V")
    public static final void method921(class318 arg0, boolean arg1, boolean arg2) {
        arg0.field4421 = arg2;
        if (!class520.field7248) {
            class214.method1265(arg0, class303.field4289);
        } else if (arg1) {
            class690.field9610[class690.field9610.length - 1].method3949(127, arg0);
        } else {
            int var3 = class573.method3357(arg0.field4417);
            int var4 = class680.field9460[2] * arg0.method793((byte) -86) / arg0.field4409;
            int var5 = class573.method3357(arg0.field4417 - var4);
            int var6 = class573.method3357(arg0.field4417 + var4);
            if (var5 == var6) {
                class690.field9610[var3].method3949(127, arg0);
            } else if (var6 - var5 == 1) {
                class690.field9610[class515.field7130 + var5].method3949(127, arg0);
            } else {
                class690.field9610[class690.field9610.length - 1].method3949(127, arg0);
            }
        }
    }
}
