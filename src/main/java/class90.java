import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class90 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1308 = "green:";

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[Lal;")
    public static class323[] field1309 = new class323[4];

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1315 = "K";

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 17)
    public static void method726(byte arg0) {
        int var1 = -90 / ((3 - arg0) / 44);
        field1315 = null;
        field1308 = null;
        field1309 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 33)
    public static final void method727(String arg0, int arg1, byte arg2) {
        String var3 = class77.method618(1, class243.method1684(arg0, true));
        field1310++;
        if (arg2 > -127) {
            method726((byte) -30);
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < class262.field3900; var5++) {
            class121 var6 = class319.field4964[class225.field3504[var5]];
            if (var6 != null && var6.field1895 != null && var6.field1895.equalsIgnoreCase(var3)) {
                var4 = true;
                class328.method2241(1, class235.field3602.field4470[0], 2, 0, (byte) 12, false, class235.field3602.field4477[0], 1, 0, 0, var6.field4470[0], var6.field4477[0]);
                if (arg1 == 1) {
                    class108.field1654++;
                    class159.field2372.method59(196, (byte) 73);
                    class159.field2372.method280(class225.field3504[var5], (byte) 126);
                } else if (arg1 == 4) {
                    class76.field1069++;
                    class159.field2372.method59(141, (byte) 73);
                    class159.field2372.method257(class225.field3504[var5], true);
                } else if (arg1 == 5) {
                    class43.field681++;
                    class159.field2372.method59(211, (byte) 73);
                    class159.field2372.method280(class225.field3504[var5], (byte) 124);
                } else if (arg1 == 6) {
                    class167.field2514++;
                    class159.field2372.method59(154, (byte) 73);
                    class159.field2372.method263(class225.field3504[var5], (byte) 106);
                } else if (arg1 == 7) {
                    class159.field2372.method59(122, (byte) 73);
                    class243.field3666++;
                    class159.field2372.method280(class225.field3504[var5], (byte) 108);
                }
                break;
            }
        }
        if (!var4) {
            class38.method352(false, 0, class287.field4414 + var3, "");
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILlb;IILlb;)Lje;", line = 108)
    public static final class74 method728(int arg0, class211 arg1, int arg2, int arg3, class211 arg4) {
        field1314++;
        if (arg3 != -28809) {
            method726((byte) 60);
        }
        return class297.method2093(arg2, arg0, (byte) 102, arg1) ? class130.method992((byte) 38, arg4.method1507(arg0, (byte) -127, arg2)) : null;
    }
}
