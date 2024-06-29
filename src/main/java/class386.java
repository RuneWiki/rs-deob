import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class386 extends class413 {

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "B")
    public byte field5886 = 5;

    @OriginalMember(owner = "client!sv", name = "x", descriptor = "Ljava/lang/String;")
    public static String field5884;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
    public int field5874;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
    public int field5875;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
    public int field5881;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
    public int field5883;

    @OriginalMember(owner = "client!sv", name = "y", descriptor = "I")
    public int field5885;

    @OriginalMember(owner = "client!sv", name = "A", descriptor = "I")
    public int field5887;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "Z")
    public boolean field5878;

    static {
        new class375("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field5884 = "";
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)V", line = 3)
    public static final void method2384(byte arg0) {
        if (class374.field5734 != null) {
            class374.field5734.method1594(false);
        }
        field5876++;
        if (class133.field1929 != null) {
            class133.field1929.method1594(false);
        }
        if (arg0 <= 62) {
            field5884 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([Ljava/lang/Object;I[IZI)V", line = 30)
    public static final void method2385(Object[] arg0, int arg1, int[] arg2, boolean arg3, int arg4) {
        if (arg4 > arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg1; var10 < arg4; var10++) {
                if (arg2[var10] < (var10 & var9) + var7) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    Object var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var8;
            method2385(arg0, arg1, arg2, true, var6 - 1);
            method2385(arg0, var6 + 1, arg2, true, arg4);
        }
        if (!arg3) {
            field5884 = null;
        }
        field5879++;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZLjava/lang/String;Z)V", line = 89)
    public static final void method2386(boolean arg0, String arg1, boolean arg2) {
        field5877++;
        class498.field7275.field6511 = 1;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        if (arg0) {
            field5882 = 60;
        }
        for (int var6 = 0; var6 < class84.field1154.field6053; var6++) {
            class61 var9 = class84.field1154.method2451(-1, var6);
            if ((!arg2 || var9.field862) && var9.field829 == -1 && var9.field802 == -1 && var9.field812 == 0 && var9.field827.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class257.field3596 = -1;
                    class480.field7011 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class257.field3596 = var5;
        class453.field6648 = 0;
        class480.field7011 = var4;
        String[] var7 = new String[class257.field3596];
        for (int var8 = 0; var8 < class257.field3596; var8++) {
            var7[var8] = class84.field1154.method2451(-1, var4[var8]).field827;
        }
        class530.method3127(var7, class480.field7011, (byte) 25);
        class498.field7275.method2625(-1);
        class498.field7275.field6511 = 2;
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)V", line = 168)
    public static void method2387(int arg0) {
        int var1 = -127 / ((arg0 - 58) / 48);
        field5884 = null;
    }
}
