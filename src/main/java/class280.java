import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class280 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lbe;")
    public static class283 field4672 = class153.method941(125, "overlay");

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4678 = 0;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "[S")
    public static short[] field4680 = new short[256];

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "[I")
    public static int[] field4679 = new int[50];

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "[Lnh;")
    public static class107[] field4677;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[Lnh;")
    public static class107[] field4683;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V", line = 14)
    public static final void method1867(int arg0, int arg1, int arg2) {
        field4676++;
        class6.field63[arg0] = arg2;
        int var3 = 105 % ((-arg1 - 7) / 52);
        class254 var4 = (class254) class82.field1391.method1612((long) arg0, 105);
        if (var4 == null) {
            class254 var5 = new class254(class216.method1426(255) + 500L);
            class82.field1391.method1611(var5, -1, (long) arg0);
        } else {
            var4.field4288 = class216.method1426(255) + 500L;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILgf;Lgf;IIIIJ)V", line = 46)
    public static final void method1868(int arg0, int arg1, int arg2, int arg3, class7 arg4, class7 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class291 var12 = new class291();
        var12.field4931 = arg10;
        var12.field4942 = arg1 * 128 + 64;
        var12.field4935 = arg2 * 128 + 64;
        var12.field4934 = arg3;
        var12.field4943 = arg4;
        var12.field4941 = arg5;
        var12.field4938 = arg6;
        var12.field4937 = arg7;
        var12.field4929 = arg8;
        var12.field4944 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class86.field1459[var13][arg1][arg2] == null) {
                class86.field1459[var13][arg1][arg2] = new class160(var13, arg1, arg2);
            }
        }
        class86.field1459[arg0][arg1][arg2].field2642 = var12;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lfe;I)V", line = 78)
    public static final void method1869(class229 arg0, int arg1) {
        field4673++;
        byte[] var2 = new byte[24];
        if (class37.field543 != null) {
            try {
                class37.field543.method1180((byte) -37, 0L);
                class37.field543.method1187(var2, (byte) 121);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var7) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method1530(0, 24, true, var2);
        int var6 = -27 / ((-arg1 - 12) / 40);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 131)
    public static void method1870(int arg0) {
        field4680 = null;
        field4679 = null;
        if (arg0 != 128) {
            method1870(-56);
        }
        field4677 = null;
        field4672 = null;
        field4683 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V", line = 149)
    public static final void method1871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class187.field3205 = arg0;
        class119.field2001 = arg1;
        class272.field4576 = arg2;
        class12.field102 = arg4;
        class288.field4902 = arg5;
        if (arg3 != -377) {
            field4678 = -25;
        }
        field4682++;
        if (class288.field4902 >= 100) {
            int var6 = class187.field3205 * 128 + 64;
            int var7 = class119.field2001 * 128 + 64;
            int var8 = class42.method254(class61.field850, var7, var6, -20341) - class12.field102;
            int var9 = var7 - class135.field2273;
            int var10 = var6 - class116.field1976;
            int var11 = var8 - class63.field876;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class150.field2450 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class295.field5011 = (int) (Math.atan2((double) var10, (double) var9) * -325.949D) & 0x7FF;
            if (class150.field2450 < 128) {
                class150.field2450 = 128;
            }
            if (class150.field2450 > 383) {
                class150.field2450 = 383;
            }
        }
        class26.field377 = 2;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZLek;ZLqc;Lek;)V", line = 210)
    public static final void method1872(boolean arg0, class172 arg1, boolean arg2, class4 arg3, class172 arg4) {
        class195.field3326 = arg0;
        class205.field3489 = arg1;
        if (arg2) {
            method1871(111, 2, -39, 35, 13, 114);
        }
        class306.field5262 = arg4;
        int var5 = class306.field5262.method1117(-1) - 1;
        field4675++;
        class72.field1259 = class306.field5262.method1108(var5, -120) + var5 * 256;
        class225.field3766 = arg3;
    }
}
