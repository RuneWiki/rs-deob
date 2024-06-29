import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class114 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lbe;")
    public static class283 field1911 = class153.method941(126, "<br>(X");

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Ltf;")
    public static class242 field1913 = new class242(64);

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1915 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Z")
    public static boolean field1917 = false;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lbe;")
    public static class283 field1916 = class153.method941(126, "slr2)3ws?order=LPWM");

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1918 = 0;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "J")
    public static long field1919;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 4)
    public static void method740(int arg0) {
        field1913 = null;
        int var1 = 76 % ((-arg0 - 80) / 46);
        field1911 = null;
        field1916 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBII)I", line = 15)
    public static final int method741(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field1912++;
        if (arg1 != 29) {
            field1913 = (class242) null;
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II[III)V", line = 50)
    public static final void method742(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        int var11 = arg3 - 1;
        int var5 = var11 - 7;
        field1910++;
        arg1--;
        while (var5 > arg1) {
            int var6 = arg1 + 1;
            arg2[var6] = arg4;
            int var7 = var6 + 1;
            arg2[var7] = arg4;
            int var8 = var7 + 1;
            arg2[var8] = arg4;
            int var9 = var8 + 1;
            arg2[var9] = arg4;
            int var10 = var9 + 1;
            arg2[var10] = arg4;
            int var12 = var10 + 1;
            arg2[var12] = arg4;
            int var13 = var12 + 1;
            arg2[var13] = arg4;
            arg1 = var13 + 1;
            arg2[arg1] = arg4;
        }
        while (var11 > arg1) {
            arg1++;
            arg2[arg1] = arg4;
        }
        if (arg0 != 30197) {
            method742(-30, 32, (int[]) null, 34, 36);
        }
    }
}
