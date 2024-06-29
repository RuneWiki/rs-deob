import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class534 extends class513 {

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public int field7238;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "J")
    public long field7235;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public int field7229;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public int field7236;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "Z")
    public boolean field7228;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "Ljava/lang/String;")
    public String field7233;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "J")
    public long field7231;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "Z")
    public boolean field7230;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "Z")
    public boolean field7237;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public int field7234;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public int field7223;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "Ljava/lang/String;")
    public String field7226;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Z")
    public static boolean field7222 = false;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "Ljava/lang/String;")
    public String field7227;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "[I")
    public static int[] field7232;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 4)
    public static void method3030(int arg0) {
        if (arg0 == 518) {
            field7232 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILgj;Lgj;Lpt;Llv;Lgj;)Z", line = 22)
    public static final boolean method3031(int arg0, class662 arg1, class662 arg2, class558 arg3, class470 arg4, class662 arg5) {
        class713.field9819 = arg1;
        class593.field8329 = arg5;
        field7220++;
        class191.field2931 = arg2;
        if (arg0 != 16) {
            field7222 = false;
        }
        class449.field6151 = arg4;
        class427.field5834 = new int[16];
        class500.field6844 = arg3;
        for (int var6 = 0; var6 < 16; var6++) {
            class427.field5834[var6] = 255;
        }
        return true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lqj;I)[I", line = 53)
    public static final int[] method3032(class537 arg0, int arg1) {
        field7225++;
        class93 var2 = new class93(518);
        int[] var3 = new int[4];
        for (int var4 = 0; var4 < 4; var4++) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method754(10, arg1 ^ 0x6F);
        var2.method759(var3[0], -25);
        var2.method759(var3[1], 121);
        var2.method759(var3[arg1], 127);
        var2.method759(var3[3], arg1 + 13);
        for (int var5 = 0; var5 < 10; var5++) {
            var2.method759((int) (Math.random() * 9.9999999E7D), arg1 + 118);
        }
        var2.method781(74, (int) (Math.random() * 9.9999999E7D));
        var2.method787(class767.field10576, class82.field1132, (byte) 109);
        arg0.field7295.method743(0, var2.field1442, var2.field1413, true);
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V", line = 96)
    public class534(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field7238 = arg2;
        this.field7235 = arg10;
        this.field7229 = arg3;
        this.field7236 = arg6;
        this.field7228 = arg11;
        this.field7233 = arg1;
        this.field7231 = arg5;
        this.field7230 = arg9;
        this.field7237 = arg8;
        this.field7234 = arg4;
        this.field7223 = arg7;
        this.field7226 = arg0;
    }
}
