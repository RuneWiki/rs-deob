import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class373 {

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field5321 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "Lnea;")
    public static class664 field5325 = new class664(95, 6);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public int field5315;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public int field5318;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public int field5319;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public int field5320;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "Lfa;")
    public static class209 field5324;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)S", line = 4)
    public static final short method2250(byte arg0, int arg1) {
        field5317++;
        int var2 = (arg1 & 0xFCC2) >> 10;
        int var3 = (arg1 & 0x380) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        if (arg0 <= 17) {
            method2254(111, null);
        }
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Lbga;", line = 32)
    public static final class324 method2251(int arg0, int arg1) {
        field5316++;
        if (arg0 != 0) {
            return null;
        }
        if (arg1 == 0) {
            if ((double) class25.field343 == 3.0D) {
                return class218.field3055;
            }
            if ((double) class25.field343 == 4.0D) {
                return class300.field4468;
            }
            if ((double) class25.field343 == 6.0D) {
                return class371.field5299;
            }
            if ((double) class25.field343 >= 8.0D) {
                return class80.field1360;
            }
        } else if (arg1 == 1) {
            if ((double) class25.field343 == 3.0D) {
                return class371.field5299;
            }
            if ((double) class25.field343 == 4.0D) {
                return class80.field1360;
            }
            if ((double) class25.field343 == 6.0D) {
                return class652.field9167;
            }
            if ((double) class25.field343 >= 8.0D) {
                return class85.field1405;
            }
        } else if (arg1 == 2) {
            if ((double) class25.field343 == 3.0D) {
                return class652.field9167;
            }
            if ((double) class25.field343 == 4.0D) {
                return class85.field1405;
            }
            if ((double) class25.field343 == 6.0D) {
                return class617.field8596;
            }
            if ((double) class25.field343 >= 8.0D) {
                return class268.field4044;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 100)
    public static final void method2252(byte arg0) {
        if (arg0 != -93) {
            method2252((byte) 58);
        }
        class565.field7967.method2510(arg0 ^ 0x6C);
        field5322++;
        class514.method2941(false);
        class500.field7082 = 0;
        class550.field7778 = null;
        class164.field2361 = null;
        class139.field2017 = null;
        class523.field7392.field9761 = 0;
        class593.field8378 = 0;
        class21.method247(0);
        class248.field3862 = 0;
        class142.field2091 = 0;
        class433.field6341 = 0;
        class165.field2366 = null;
        class564.field7965 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 124)
    public static void method2253(int arg0) {
        field5325 = null;
        if (arg0 != -12124) {
            method2254(30, null);
        }
        field5324 = null;
        field5321 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILpda;)V", line = 143)
    public static final void method2254(int arg0, class582 arg1) {
        field5323++;
        if (arg1.field8193 != null) {
            arg1.field8193.field4281 = 0;
        }
        if (arg0 == 0) {
            arg1.field8192 = false;
            for (class582 var2 = arg1.method397(); var2 != null; var2 = arg1.method403()) {
                method2254(0, var2);
            }
        }
    }
}
