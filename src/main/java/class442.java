import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class442 extends OutputStream {

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "[I")
    public static int[] field6492 = new int[14];

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lwl;")
    public static class452 field6494 = new class452(40, -2);

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Lwl;")
    public static class452 field6497 = new class452(101, 17);

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Liq;")
    public static class134 field6499;

    @OriginalMember(owner = "client!hh", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field6490++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public static void method2701(boolean arg0) {
        if (!arg0) {
            field6500 = 54;
        }
        field6499 = null;
        field6494 = null;
        field6492 = null;
        field6497 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BII)Z")
    public static final boolean method2702(byte arg0, int arg1, int arg2) {
        field6496++;
        if (!class306.field4628) {
            return false;
        }
        if (arg0 != 47) {
            method2701(false);
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class130.field1650[var3] == null || class130.field1650[var3][var4] == null) {
            return false;
        }
        class170 var5 = class130.field1650[var3][var4];
        if (arg2 == -1 && var5.field2558 == 0) {
            for (class306 var6 = (class306) class372.field5433.method2514((byte) 61); var6 != null; var6 = (class306) class372.field5433.method2511(113)) {
                if (var6.field4616 == 9 || var6.field4616 == 1006 || var6.field4616 == 25 || var6.field4616 == 60 || var6.field4616 == 21) {
                    for (class170 var7 = class168.method1020(var6.field4619, (byte) 103); var7 != null; var7 = class364.method2186(var7, (byte) -125)) {
                        if (var5.field2525 == var7.field2525) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class306 var8 = (class306) class372.field5433.method2514((byte) 61); var8 != null; var8 = (class306) class372.field5433.method2511(31)) {
                if (var8.field4618 == arg2 && var5.field2525 == var8.field4619 && (var8.field4616 == 9 || var8.field4616 == 1006 || var8.field4616 == 25 || var8.field4616 == 60 || var8.field4616 == 21)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2703(String arg0, int arg1) {
        field6495++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(arg1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)Lgg;")
    public static final class192 method2704(boolean arg0, int arg1) {
        field6491++;
        class192 var2 = (class192) class251.field3753.method1491((long) arg1, 0);
        if (arg0) {
            method2703((String) null, 43);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class388.field5754.method823(0, -20334, arg1);
        class192 var4 = new class192();
        if (var3 != null) {
            var4.method1158((byte) -96, new class385(var3));
        }
        var4.method1156((byte) 89);
        class251.field3753.method1488(128, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static final void method2705(int arg0) {
        class241 var1 = class17.field231;
        synchronized (class17.field231) {
            class17.field231.method1485(-22032);
        }
        field6493++;
        if (arg0 != 21) {
            method2703((String) null, 126);
        }
        class241 var2 = class358.field5281;
        synchronized (class358.field5281) {
            class358.field5281.method1485(-22032);
        }
        class241 var3 = class316.field4776;
        synchronized (class316.field4776) {
            class316.field4776.method1485(-22032);
        }
        class241 var4 = class37.field449;
        synchronized (class37.field449) {
            class37.field449.method1485(arg0 - 22053);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public static final void method2706(int arg0) {
        class241 var1 = class277.field4214;
        synchronized (class277.field4214) {
            class277.field4214.method1485(arg0 + 1913476928);
        }
        if (arg0 != -1913498960) {
            method2705(44);
        }
        field6489++;
    }

    static {
        new class151("From", "Von:", "De", "De");
        field6498 = 0;
    }
}
