import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class276 {

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "[J")
    public static long[] field4346 = new long[500];

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "[Z")
    public static boolean[] field4349 = new boolean[112];

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lvh;")
    public static class62 field4345 = new class62(64);

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lnk;")
    public static class16 field4350;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lnk;")
    public static class16 field4351;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lti;")
    public static class248 field4352;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 14)
    public static void method1975(int arg0) {
        if (arg0 >= -60) {
            method1975(102);
        }
        field4351 = null;
        field4345 = null;
        field4346 = null;
        field4349 = null;
        field4352 = null;
        field4350 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lhi;I)Lhi;", line = 30)
    public static final class323 method1976(class323 arg0, int arg1) {
        field4348++;
        int var2 = -42 / ((arg1 - 30) / 61);
        class323 var3 = client.method2016(arg0);
        if (var3 == null) {
            var3 = arg0.field5194;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 61)
    public static final void method1977(byte arg0) {
        class141.method979((long) class102.field1381);
        field4347++;
        if (class345.field5482 != -1) {
            class273.method1966(class345.field5482, (byte) 123);
        }
        int var1 = 0;
        if (arg0 != -93) {
            method1977((byte) -117);
        }
        while (class63.field765 > var1) {
            if (class302.field4702[var1]) {
                class135.field2012[var1] = true;
            }
            class93.field1212[var1] = class302.field4702[var1];
            class302.field4702[var1] = false;
            var1++;
        }
        if (class272.field4317) {
            class19.field232 = true;
        }
        class60.field703 = -1;
        class149.field2367 = -1;
        class242.field3759 = class102.field1381;
        class54.field623 = null;
        if (class345.field5482 != -1) {
            class63.field765 = 0;
            class281.method2035((byte) 116);
        }
        if (class272.field4317) {
            class239.method1656();
        } else {
            class343.method2379();
        }
        class266.field4193 = 0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
    public abstract int method1470(int arg0, int arg1);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)Lfc;")
    public abstract class250 method1474(boolean arg0);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)[B")
    public abstract byte[] method1476(boolean arg0, int arg1);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
    public abstract void method1464(int arg0, int arg1);
}
