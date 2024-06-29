import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class108 {

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1509 = 0;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1510 = -1;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lob;")
    public static class521 field1511 = new class521(55, 3);

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lak;")
    public static class234 field1513 = new class234("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "[F")
    public static float[] field1515 = new float[4];

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 5)
    public static void method829(int arg0) {
        if (arg0 == 16383) {
            field1511 = null;
            field1513 = null;
            field1515 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILhp;)V", line = 18)
    public static final void method830(int arg0, int arg1, class217 arg2) {
        if (arg1 != 1392) {
            return;
        }
        if (class313.field4700 != null) {
            try {
                class313.field4700.method3052(arg1 ^ 0x570, 0L);
                class313.field4700.method3051(arg0, arg2.field3572, 24, (byte) -72);
            } catch (Exception var3) {
            }
        }
        field1507++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIB)V", line = 38)
    public static final void method831(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class184.field2777 = arg1;
        field1508++;
        if (arg4 == 45) {
            class433.field6414 = arg3;
            class404.field5987 = arg0;
            class327.field4931 = arg2;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I", line = 59)
    public static final int method832(int arg0, int arg1) {
        if (arg0 <= 45) {
            return -109;
        } else {
            field1505++;
            return arg1 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lah;Z)V", line = 80)
    public static final void method833(class263 arg0, boolean arg1) {
        arg0.method1756(101);
        field1512++;
        if (arg1) {
            return;
        }
        int var2 = class261.field4008;
        class177 var3 = class398.field5947 = class26.field319[var2] = new class177();
        var3.field1881 = var2;
        int var4 = arg0.method1760(30, true);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFCEF1) >> 14;
        int var7 = var4 & 0x3FFF;
        var3.field1978[0] = var6 - class390.field5842;
        var3.field5837 = (var3.field1978[0] << 7) + (var3.method953(-87) << 6);
        var3.field1976[0] = var7 - class176.field2613;
        var3.field5833 = (var3.field1976[0] << 7) + (var3.method953(-47) << 6);
        class154.field2286 = var3.field5826 = var5;
        if (class6.field69[var2] != null) {
            var3.method1187((byte) -68, class6.field69[var2]);
        }
        class111.field1558 = 0;
        class318.field4804[class111.field1558++] = var2;
        class428.field6363[var2] = 0;
        class150.field2245 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method1760(18, !arg1);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class443 var13 = class131.field2005[var8] = new class443();
                var13.field6509 = 0;
                var13.field6513 = (var10 << 28) + (var11 << 14) + var12;
                var13.field6515 = false;
                var13.field6512 = -1;
                class450.field6577[class150.field2245++] = var8;
                class428.field6363[var8] = 0;
            }
        }
        arg0.method1757(-125);
    }
}
