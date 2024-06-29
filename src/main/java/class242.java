import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public abstract class class242 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "[I")
    public static int[] field3106 = new int[1];

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field3110 = 0;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "Lhb;")
    public static class250 field3107 = new class250(21, 2);

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "[I")
    public static int[] field3112 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "Ljb;")
    public static class374 field3113;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 4)
    public static final void method1519(int arg0, String arg1, int arg2) {
        field3111++;
        int var3 = class206.field2684;
        int[] var4 = class143.field1892;
        boolean var5 = false;
        for (int var6 = arg2; var6 < var3; var6++) {
            class518 var7 = class76.field952[var4[var6]];
            if (var7 != null && class37.field573 != var7 && var7.field7630 != null && var7.field7630.equalsIgnoreCase(arg1)) {
                var5 = true;
                if (arg0 == 1) {
                    class103.field1412++;
                    class420.method2472((byte) -101, class319.field4113);
                    class319.field4112.method559(0, (byte) 124);
                    class319.field4112.method566(arg2 - 12633, var4[var6]);
                } else if (arg0 == 4) {
                    class414.field5500++;
                    class420.method2472((byte) -101, class177.field2272);
                    class319.field4112.method560(false, var4[var6]);
                    class319.field4112.method598(0, (byte) 121);
                } else if (arg0 == 5) {
                    class513.field7544++;
                    class420.method2472((byte) -101, class420.field5630);
                    class319.field4112.method594(arg2 ^ 0x8F9, 0);
                    class319.field4112.method609(var4[var6], arg2 - 85);
                } else if (arg0 == 6) {
                    class420.method2472((byte) -101, class81.field1012);
                    class43.field632++;
                    class319.field4112.method598(0, (byte) 125);
                    class319.field4112.method560(false, var4[var6]);
                } else if (arg0 == 7) {
                    class64.field813++;
                    class420.method2472((byte) -101, class423.field5783);
                    class319.field4112.method560(false, var4[var6]);
                    class319.field4112.method598(0, (byte) 127);
                }
                break;
            }
        }
        if (!var5) {
            class360.method2120(class499.field7343.method1127(class379.field4920, false) + arg1, 124);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IBI)V", line = 96)
    public static final void method1520(int arg0, byte arg1, int arg2) {
        if (arg1 != -99) {
            field3110 = -38;
        }
        field3109++;
        class436 var3 = class459.method2712(15, 0, arg1 ^ 0x68DBEDFD);
        var3.method2574((byte) 106);
        var3.field5980 = arg2;
        var3.field5977 = arg0;
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)V", line = 118)
    public static void method1521(int arg0) {
        if (arg0 != 10240) {
            field3112 = null;
        }
        field3113 = null;
        field3106 = null;
        field3107 = null;
        field3112 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZILqa;)Z")
    public abstract boolean method179(int arg0, boolean arg1, int arg2, class129 arg3);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLrn;ZIILqa;I)V")
    public abstract void method174(byte arg0, class242 arg1, boolean arg2, int arg3, int arg4, class129 arg5, int arg6);

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(Lqa;B)Lvs;")
    public abstract class465 method172(class129 arg0, byte arg1);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
    public abstract void method173(byte arg0);

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)Z")
    public abstract boolean method177(int arg0);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLqa;)V")
    public abstract void method175(byte arg0, class129 arg1);
}
