import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class256 extends class324 {

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    private int field4121;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    private int field4127;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    private int field4123;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    private int field4126;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4125 = null;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "[B")
    public static byte[] field4129 = new byte[520];

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "Lnb;")
    public static class341 field4122 = new class341(64);

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "Llg;")
    public static class137 field4118;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "Lej;")
    public static class175 field4119;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "Lcg;")
    public static class49 field4131;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V", line = 14)
    public static void method1779(int arg0) {
        field4131 = null;
        field4122 = null;
        field4118 = null;
        field4125 = null;
        if (arg0 != 0) {
            method1780(false, -59, (String) null);
        }
        field4119 = null;
        field4129 = null;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(III)V", line = 29)
    public final void method347(int arg0, int arg1, int arg2) {
        if (arg1 >= 103) {
            field4124++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V", line = 39)
    public final void method344(int arg0, int arg1, int arg2) {
        if (arg2 <= -116) {
            field4120++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIB)V", line = 50)
    public final void method346(int arg0, int arg1, byte arg2) {
        field4128++;
        int var4 = -11 % ((arg2 + 20) / 39);
        int var5 = this.field4127 * arg0 >> 12;
        int var6 = this.field4126 * arg0 >> 12;
        int var7 = this.field4123 * arg1 >> 12;
        int var8 = this.field4121 * arg1 >> 12;
        class176.method1363(var7, this.field5149, var6, var5, var8, 22608);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIII)V", line = 72)
    public class256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4121 = arg1;
        this.field4127 = arg0;
        this.field4123 = arg3;
        this.field4126 = arg2;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 84)
    public static final void method1780(boolean arg0, int arg1, String arg2) {
        field4130++;
        String var3 = arg2.toLowerCase();
        int var4 = arg1;
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class8.field111; var6++) {
            class134 var7 = class5.method31(arg1 ^ 0x98C88083, var6);
            if ((!arg0 || var7.field2349) && var7.field2290 == -1 && var7.field2308 == -1 && var7.field2298 == 0 && var7.field2346.toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 250) {
                    class30.field442 = null;
                    class339.field5425 = -1;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var8 = new short[var5.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var5[var9];
                    }
                    var5 = var8;
                }
                var5[var4++] = (short) var6;
            }
        }
        class339.field5425 = var4;
        class283.field4489 = 0;
        class30.field442 = var5;
        String[] var10 = new String[class339.field5425];
        for (int var11 = 0; var11 < class339.field5425; var11++) {
            var10[var11] = class5.method31(-1731690365, var5[var11]).field2346;
        }
        client.method1889(-10, var10, class30.field442);
    }
}
