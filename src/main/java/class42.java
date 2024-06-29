import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 extends class16 {

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "[B")
    public byte[] field792;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public static int field797 = 0;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field798 = 0;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "Lje;")
    public static class67 field799 = class85.method592(255, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "Lje;")
    public static class67 field796 = class85.method592(255, "Cabbage");

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "Lje;")
    public static class67 field793 = class85.method592(255, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "Lje;")
    public static class67 field791 = class85.method592(255, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "[I")
    public static int[] field804 = new int[2000];

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "Lfd;")
    public static class40 field794;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "[I")
    public static int[] field802;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
    public static final int method274(int arg0, int arg1) {
        field795++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg0 == 0) {
            int var4 = var3 | var3 >>> 4;
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        } else {
            return -84;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
    public static final void method275(int arg0) {
        int var1 = 46 / ((arg0 + 59) / 55);
        class66.field1284.method767(1);
        field805++;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
    public static void method276(byte arg0) {
        field793 = null;
        field804 = null;
        if (arg0 < 9) {
            return;
        }
        field796 = null;
        field802 = null;
        field794 = null;
        field791 = null;
        field799 = null;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([B)V")
    public class42(byte[] arg0) {
        this.field792 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZII[BI[Lee;I)V")
    public static final void method277(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4, class34[] arg5, int arg6) {
        field800++;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg2 + var12 > 0 && arg2 + var12 < 103 && arg1 + var13 > 0 && arg1 + var13 < 103) {
                        arg5[var7].field611[arg2 + var12][arg1 + var13] = class34.method213(arg5[var7].field611[arg2 + var12][arg1 + var13], -16777217);
                    }
                }
            }
        }
        class91 var8 = new class91(arg3);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class123.method960(arg6, (byte) -29, var8, 0, arg2 + var10, arg4, var9, var11 + arg1);
                }
            }
        }
        if (arg0) {
            field794 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BIIIIII)I")
    public static final int method278(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg5;
            arg5 = var7;
        }
        if (arg0 >= -72) {
            method276((byte) -74);
        }
        int var8 = arg3 & 0x3;
        field801++;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 7 + 1 - arg4 - arg1;
        } else if (var8 == 2) {
            return 1 + 7 - arg5 - arg2;
        } else {
            return arg4;
        }
    }
}
