import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class275 {

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "[J")
    public static long[] field4814 = new long[256];

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Loh;")
    public static class263 field4816 = class253.method1681(-117, "Angreifen");

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "Loh;")
    public static class263 field4818;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "[[[I")
    public static int[][][] field4823;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Loh;")
    public static class263 field4817;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Lw;")
    public static class141 field4819;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "[I")
    public static int[] field4825;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "[[[B")
    public static byte[][][] field4821;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIILph;BII)Lph;")
    public static final class76 method1870(int arg0, int arg1, int arg2, class76 arg3, byte arg4, int arg5, int arg6) {
        field4812++;
        long var7 = (long) arg2;
        int var9 = -115 / ((-arg4 - 73) / 44);
        class76 var10 = (class76) class12.field312.method828(0, var7);
        if (var10 == null) {
            class242 var11 = class242.method1635(class53.field1128, arg2, 0);
            if (var11 == null) {
                return null;
            }
            var10 = var11.method1621(64, 768, -50, -10, -50);
            class12.field312.method826(var7, 9815, var10);
        }
        int var12 = arg3.method509();
        int var13 = arg3.method511();
        int var14 = arg3.method518();
        int var15 = arg3.method503();
        class76 var16 = var10.method510(true, true);
        if (arg6 != 0) {
            var16.method521(arg6);
        }
        class167 var17 = (class167) var16;
        if (class120.method781(class12.field321, arg1 + var12, false, arg0 + var14) != arg5 || arg5 != class120.method781(class12.field321, arg1 + var13, false, arg0 + var15)) {
            for (int var18 = 0; var18 < var17.field3033; var18++) {
                var17.field3054[var18] += class120.method781(class12.field321, var17.field3076[var18] + arg1, false, var17.field3032[var18] + arg0) - arg5;
            }
            var17.field3037 = false;
        }
        return var16;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
    public static final void method1871(int arg0, int arg1) {
        field4813++;
        class64 var2 = class84.method563(9, arg0, -87);
        if (arg1 < 108) {
            field4814 = null;
        }
        var2.method393(-95);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method1872(byte arg0) {
        field4821 = null;
        if (arg0 != 110) {
            return;
        }
        field4814 = null;
        field4819 = null;
        field4816 = null;
        field4818 = null;
        field4825 = null;
        field4823 = null;
        field4817 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
    public static final void method1873(boolean arg0) {
        field4815++;
        if (!arg0 && class271.field4786 == 30) {
            class244.method1659(25, 26473);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4814[var0] = var1;
        }
        field4818 = class253.method1681(-127, "Verbindung zum Update)2Server hergestellt)3");
        field4823 = new int[2][][];
        field4817 = class253.method1681(-127, "(U0a )2 via: ");
    }
}
