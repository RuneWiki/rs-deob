import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class154 {

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "Lmb;")
    public static class96 field2716 = class243.method1708("Verbindung mit Update)2Server)3)3)3", (byte) 104);

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Lmb;")
    public static class96 field2712 = class243.method1708(" loggt sich aus)3", (byte) 92);

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "[Lcd;")
    public static class113[] field2711 = new class113[50];

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Lw;")
    public static class107 field2707;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "Lce;")
    public static class111 field2717;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "[I")
    public static int[] field2705;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "[I")
    public static int[] field2713;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "[Z")
    public static boolean[] field2715;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static final void method1125(int arg0) {
        if (arg0 <= 24) {
            method1129(-128, (byte) -102);
        }
        field2718++;
        for (class168 var1 = (class168) class34.field606.method1074(false); var1 != null; var1 = (class168) class34.field606.method1087((byte) 42)) {
            int var2 = var1.field2961;
            if (class225.method1534(-1, var2)) {
                boolean var3 = true;
                class107[] var4 = class100.field1704[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field1867;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field4304;
                    class107 var7 = class55.method408(var6, 251234864);
                    if (var7 != null) {
                        class53.method403(-61, var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lmb;B)I")
    public static final int method1126(class96 arg0, byte arg1) {
        field2706++;
        return arg1 == 0 ? arg0.method707(-121) + 1 : -35;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static final void method1127(byte arg0) {
        class196.field3404.method83(0);
        field2719++;
        if (arg0 != -51) {
            field2715 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(JIIIILmb;I)V")
    public static final void method1128(long arg0, int arg1, int arg2, int arg3, int arg4, class96 arg5, int arg6) {
        if (arg4 != 19909) {
            return;
        }
        class239 var8 = new class239(128);
        var8.method1652(10, (byte) 41);
        field2708++;
        var8.method1632(true, (int) (Math.random() * 99999.0D));
        var8.method1632(true, 520);
        var8.method1668(arg0, -117);
        var8.method1625((byte) 115, (int) (Math.random() * 9.9999999E7D));
        var8.method1644(arg5, -119);
        var8.method1625((byte) -119, (int) (Math.random() * 9.9999999E7D));
        var8.method1632(true, class73.field1255);
        var8.method1652(arg1, (byte) 41);
        var8.method1652(arg2, (byte) 41);
        var8.method1625((byte) 57, (int) (Math.random() * 9.9999999E7D));
        var8.method1632(true, arg6);
        var8.method1632(true, arg3);
        var8.method1625((byte) 106, (int) (Math.random() * 9.9999999E7D));
        var8.method1662(true, class200.field3474, class241.field4184);
        class140.field2505.field4124 = 0;
        class140.field2505.method1652(96, (byte) 41);
        class140.field2505.method1652(var8.field4124, (byte) 41);
        class140.field2505.method1621(0, var8.field4144, var8.field4124, -90);
        class77.field1322 = -3;
        class106.field1800 = 1;
        class187.field3258 = 0;
        class5.field107 = 0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)I")
    public static final int method1129(int arg0, byte arg1) {
        if (arg1 > -122) {
            return 9;
        } else {
            field2709++;
            return arg0 >>> 7;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
    public static final void method1130(int arg0, int arg1) {
        class15.field233.method82((byte) -109, arg1);
        field2714++;
        if (arg0 != 520) {
            method1127((byte) 104);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[BII)Lmb;")
    public static final class96 method1131(int arg0, byte[] arg1, int arg2, int arg3) {
        field2710++;
        class96 var4 = new class96();
        var4.field1580 = new byte[arg3];
        int var5 = -118 / ((arg0 + 9) / 63);
        var4.field1600 = 0;
        for (int var6 = arg2; var6 < arg2 + arg3; var6++) {
            if (arg1[var6] != 0) {
                var4.field1580[var4.field1600++] = arg1[var6];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static void method1132(boolean arg0) {
        field2717 = null;
        field2712 = null;
        field2711 = null;
        field2716 = null;
        field2715 = null;
        field2705 = null;
        if (!arg0) {
            field2713 = null;
            field2707 = null;
        }
    }
}
