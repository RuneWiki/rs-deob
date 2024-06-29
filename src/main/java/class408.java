import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class408 {

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "J")
    public static long field6192 = 0L;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)Z")
    public static final boolean method2527(int arg0, int arg1, int arg2) {
        field6195++;
        if (!class387.field5967) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (arg0 != -25286) {
            method2528(null, true);
        }
        if (class508.field7389[var3] == null || class508.field7389[var3][var4] == null) {
            return false;
        }
        class68 var5 = class508.field7389[var3][var4];
        if (arg2 == -1 && var5.field1086 == 0) {
            for (class162 var6 = (class162) class108.field1934.method2538(-3); var6 != null; var6 = (class162) class108.field1934.method2535((byte) -84)) {
                if (var6.field2576 == 51 || var6.field2576 == 1009 || var6.field2576 == 2 || var6.field2576 == 18 || var6.field2576 == 47) {
                    for (class68 var7 = class22.method115(7521, var6.field2581); var7 != null; var7 = class272.method1810(true, var7)) {
                        if (var5.field1059 == var7.field1059) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class162 var8 = (class162) class108.field1934.method2538(arg0 ^ 0x62C7); var8 != null; var8 = (class162) class108.field1934.method2535((byte) -62)) {
                if (var8.field2582 == arg2 && var5.field1059 == var8.field2581 && (var8.field2576 == 51 || var8.field2576 == 1009 || var8.field2576 == 2 || var8.field2576 == 18 || var8.field2576 == 47)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method2528(String arg0, boolean arg1) {
        field6194++;
        int var2 = arg0.length();
        int var3 = 0;
        int var4 = 0;
        if (arg1) {
            field6192 = 16L;
        }
        while (var4 < var2) {
            var3 = class376.method2389(arg0.charAt(var4), 352) + (var3 << 5) - var3;
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lqs;Lqs;Lqs;ILqs;)V")
    public static final void method2529(class496 arg0, class496 arg1, class496 arg2, int arg3, class496 arg4) {
        class226.field3889 = arg4;
        class162.field2580 = arg2;
        class516.field7637 = arg0;
        class268.field4475 = arg1;
        field6197++;
        if (arg3 != 8113) {
            field6192 = -13L;
        }
        class508.field7389 = new class68[class162.field2580.method2919((byte) 116)][];
        class406.field6157 = new boolean[class162.field2580.method2919((byte) -62)];
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public static final void method2530(int arg0) {
        if (arg0 != 17234) {
            field6192 = -92L;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class445.field6633[var1] = true;
        }
        field6193++;
    }
}
