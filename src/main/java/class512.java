import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class512 implements class447 {

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public int field7294;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public int field7293;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public int field7292;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public int field7296;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "Ljg;")
    public class338 field7303;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public int field7300;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public int field7298;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public int field7306;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public int field7302;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public int field7301;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "Ljava/lang/String;")
    public String field7299;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public int field7307;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Ljha;")
    public class692 field7295;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "Lqca;")
    public static class115 field7309 = new class115(1, 2, 2, 0);

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "Lqaa;")
    public static class27 field7311 = new class27(20, -1);

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "[I")
    public static int[] field7313 = new int[120];

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "Ldm;")
    public static class50 field7312;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "Lkr;")
    public static class743 field7314;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field7313[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)Ljw;", line = 4)
    public final class551 method930(int arg0) {
        field7304++;
        if (arg0 != 17503) {
            this.method930(-83);
        }
        return class70.field1259;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIII)V", line = 20)
    public static final void method3059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7297++;
        int var7 = class498.method3000(false, class748.field10458, arg6, class558.field7940);
        int var8 = class498.method3000(false, class748.field10458, arg0, class558.field7940);
        if (arg2 != 255) {
            field7313 = null;
        }
        int var9 = class498.method3000(false, class612.field8854, arg1, class156.field2337);
        int var10 = class498.method3000(false, class612.field8854, arg5, class156.field2337);
        int var11 = class498.method3000(false, class748.field10458, arg6 + arg4, class558.field7940);
        int var12 = class498.method3000(false, class748.field10458, arg0 - arg4, class558.field7940);
        for (int var13 = var7; var13 < var11; var13++) {
            class399.method2472(arg2 ^ 0x6916, var9, var10, arg3, class329.field4651[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class399.method2472(27113, var9, var10, arg3, class329.field4651[var14]);
        }
        int var15 = class498.method3000(false, class612.field8854, arg1 + arg4, class156.field2337);
        int var16 = class498.method3000(false, class612.field8854, arg5 - arg4, class156.field2337);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class329.field4651[var17];
            class399.method2472(27113, var9, var15, arg3, var18);
            class399.method2472(27113, var16, var10, arg3, var18);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Leq;Z)V", line = 76)
    public static final void method3060(class209 arg0, boolean arg1) {
        class299.field4150 = 0;
        class555.field7775 = 0;
        field7305++;
        class460.field6633 = new class747();
        class510.field7277 = new class632[1024];
        class464.field6699 = new class753[class590.field8289[class508.field7250] + 1];
        if (!arg1) {
            class248.field3474 = 0;
            class172.field2498 = 0;
            class741.method4125(1, arg0);
            class354.method2219(0, arg0);
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V", line = 98)
    public static void method3061(int arg0) {
        if (arg0 != 20) {
            method3061(46);
        }
        field7312 = null;
        field7311 = null;
        field7313 = null;
        field7314 = null;
        field7309 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)I", line = 114)
    public static final int method3062(int arg0, int arg1) {
        field7310++;
        int var2 = 44 / ((6 - arg0) / 46);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Ljava/lang/String;Ljg;Ljha;IIIIIIIIII)V", line = 126)
    public class512(String arg0, class338 arg1, class692 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field7294 = arg6;
        this.field7293 = arg10;
        this.field7292 = arg11;
        this.field7296 = arg8;
        this.field7303 = arg1;
        this.field7300 = arg7;
        this.field7298 = arg3;
        this.field7306 = arg12;
        this.field7302 = arg5;
        this.field7301 = arg9;
        this.field7299 = arg0;
        this.field7307 = arg4;
        this.field7295 = arg2;
    }
}
