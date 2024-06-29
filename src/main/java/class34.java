import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class34 extends class30 {

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public int field656 = 0;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    public int field672 = -1;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "Lia;")
    private static class257 field670 = class28.method234(98, "Loaded interfaces");

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "Lia;")
    private static class257 field666 = class28.method234(110, "Choose Option");

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "Lia;")
    public static class257 field669 = field670;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "Lia;")
    public static class257 field657 = field666;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "Lsf;")
    public static class33 field659 = new class33();

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "[Loe;")
    public static class210[] field674 = new class210[6];

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "Lvb;")
    public static class226 field660;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
    public static void method289(byte arg0) {
        field670 = null;
        field659 = null;
        field666 = null;
        field657 = null;
        field674 = null;
        field669 = null;
        field660 = null;
        if (arg0 != 55) {
            method289((byte) -16);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)I")
    public static final int method290(int arg0, int arg1, int arg2, int arg3) {
        field664++;
        if (arg3 != -256) {
            method289((byte) -105);
        }
        if (arg1 < arg2) {
            return arg2;
        } else if (arg0 < arg1) {
            return arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)[B")
    public static final byte[] method291(int arg0, int arg1) {
        if (arg1 != 255) {
            field670 = null;
        }
        class199 var2 = (class199) class181.field3145.method615(false, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class8.method112(var4, var7, arg1 ^ 0xFFFFFF72);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class199(var3);
            class181.field3145.method619((byte) -118, var2, (long) arg0);
        }
        field663++;
        return var2.field3413;
    }
}
