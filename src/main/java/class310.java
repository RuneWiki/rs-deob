import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class310 {

    @OriginalMember(owner = "client!qv", name = "x", descriptor = "I")
    public static int field4234 = 0;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public int field4211;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public int field4212;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public int field4213;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public int field4215;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public int field4216;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    public int field4217;

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
    public int field4219;

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    public int field4221;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
    public int field4222;

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "I")
    public int field4224;

    @OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "I")
    public int field4227;

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "I")
    public int field4229;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "I")
    public int field4230;

    @OriginalMember(owner = "client!qv", name = "v", descriptor = "I")
    public int field4232;

    @OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
    public int field4233;

    @OriginalMember(owner = "client!qv", name = "y", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!qv", name = "A", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!qv", name = "u", descriptor = "Ltj;")
    public static class132 field4231;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "[I")
    public static int[] field4218;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
    public static void method1793(int arg0) {
        if (arg0 == 0) {
            field4231 = null;
            field4218 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BB)V")
    public static final void method1794(byte arg0, byte arg1) {
        field4214++;
        if (arg0 != 118) {
            method1796(-89, null, -54, (byte) 124);
        }
        if (class475.field6931 == null) {
            class475.field6931 = new byte[4][class527.field7799][class422.field6182];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class527.field7799; var3++) {
                for (int var4 = 0; var4 < class422.field6182; var4++) {
                    class475.field6931[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method1795(int arg0, int arg1, String arg2, String arg3, int arg4, String arg5) {
        class424.method2519(-1, arg3, arg0, arg1, arg2, arg4 ^ 0xFFFFCFFF, null, arg5);
        field4228++;
        if (arg4 != 12406) {
            method1799((byte) -31);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILmg;IB)Ldq;")
    public static final class490 method1796(int arg0, class101 arg1, int arg2, byte arg3) {
        if (arg3 < 126) {
            return null;
        } else {
            field4225++;
            byte[] var4 = arg1.method727(arg0, arg2, 45);
            return var4 == null ? null : new class490(var4);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZI)Ltt;")
    public static final class61 method1797(boolean arg0, int arg1) {
        field4237++;
        if (arg0) {
            return null;
        } else if (class93.field1367 && arg1 >= class90.field1314 && class413.field6032 >= arg1) {
            return class126.field1884[arg1 - class90.field1314];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
    public static final void method1798(byte arg0) {
        if (arg0 <= 66) {
            method1794((byte) 26, (byte) 79);
        }
        field4226++;
        class485.field7085.method241(class109.field1641, class20.field269.field7653 ? class419.field6130 + 256 << 0 : -1, 256);
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)Lcd;")
    public static final class206 method1799(byte arg0) {
        field4223++;
        if (arg0 != 61) {
            method1794((byte) 53, (byte) 22);
        }
        try {
            return (class206) Class.forName("ll").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
