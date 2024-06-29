import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class39 extends class73 {

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "Lli;")
    public static class185 field621 = class245.method1649("Shift)2click ENABLED(Q", 124);

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "Lli;")
    public static class185 field620 = class245.method1649("brillant1:", -124);

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "Lli;")
    public static class185 field622 = class245.method1649("hint_mapedge", -13);

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Lli;")
    public static class185 field617 = class245.method1649("Memory before cleanup=", 126);

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[B")
    public static final byte[] method244(int arg0, int arg1) {
        if (arg1 != 255) {
            return null;
        }
        field616++;
        class19 var2 = (class19) class194.field3571.method1615(-28166, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class255.method1729(var4, 3, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class19(var3);
            class194.field3571.method1620(var2, (byte) 49, (long) arg0);
        }
        return var2.field305;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([I[IIII)V")
    public static final void method245(int[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg3 > arg2) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var8;
            for (int var9 = arg2; var9 < arg3; var9++) {
                if (arg0[var9] > ((var9 & 0x1) + var7)) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    int var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var8;
            method245(arg0, arg1, arg2, var6 - 1, -1);
            method245(arg0, arg1, var6 + 1, arg3, arg4);
        }
        if (arg4 != -1) {
            method245((int[]) null, (int[]) null, 20, 53, -47);
        }
        field618++;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
    public static void method246(int arg0) {
        field620 = null;
        field617 = null;
        field621 = null;
        field622 = null;
        if (arg0 != 0) {
            field620 = null;
        }
    }
}
