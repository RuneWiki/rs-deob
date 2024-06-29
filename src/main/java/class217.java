import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class217 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3353 = -2;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Loh;")
    public static class281 field3355 = new class281(4);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public int field3357;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public int field3359;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public int field3361;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
    public static final boolean method1456(String arg0, String arg1, byte arg2) {
        field3354++;
        int var3 = arg0.length();
        int var4 = arg1.length();
        if (var3 < var4) {
            return false;
        }
        int var5 = -12 / ((-arg2 - 29) / 59);
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg0.charAt(var6);
            char var8 = arg1.charAt(var6);
            if (var7 != var8 && Character.toLowerCase(var7) != Character.toLowerCase(var8) && Character.toUpperCase(var7) != Character.toUpperCase(var8)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)V")
    public static final void method1457(byte arg0, int arg1) {
        field3356++;
        if (arg0 >= -32) {
            method1456((String) null, (String) null, (byte) -6);
        }
        class41 var2 = class221.method1492((byte) -42, arg1, 9);
        var2.method303(23981);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZII)I")
    public static final int method1458(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            return 102;
        }
        if (arg2 > 243) {
            arg0 >>= 0x4;
        } else if (arg2 > 217) {
            arg0 >>= 0x3;
        } else if (arg2 > 192) {
            arg0 >>= 0x2;
        } else if (arg2 > 179) {
            arg0 >>= 0x1;
        }
        field3360++;
        return (arg3 >> 2 << 10) - (-(arg0 >> 5 << 7) - (arg2 >> 1));
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILai;I)V")
    private final void method1459(int arg0, class88 arg1, int arg2) {
        if (arg2 == 1) {
            this.field3361 = arg1.method645(11596);
            this.field3357 = arg1.method633(75);
            this.field3359 = arg1.method633(83);
        }
        field3362++;
        int var4 = 16 % ((-arg0 - 2) / 63);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lai;I)V")
    public final void method1460(class88 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method633(arg1 ^ 0xFFFFA171);
            if (var3 == 0) {
                if (arg1 != -24290) {
                    return;
                }
                field3358++;
                return;
            }
            this.method1459(111, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static void method1461(byte arg0) {
        int var1 = -122 % ((arg0 - 47) / 35);
        field3355 = null;
    }
}
