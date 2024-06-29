import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class77 implements class274 {

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "Lgca;")
    public static class627 field1192 = new class627();

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lsj;B)V", line = 7)
    public static final void method605(class373 arg0, byte arg1) {
        field1190++;
        arg0.method2229((byte) 126);
        int var2 = class609.field8749;
        class270 var3 = class103.field1708 = class76.field1186[var2] = new class270();
        var3.field2427 = var2;
        int var4 = 81 / ((arg1 + 13) / 37);
        int var5 = arg0.method2231(30, 113);
        byte var6 = (byte) (var5 >> 28);
        int var7 = (var5 & 0xFFFF2FF) >> 14;
        int var8 = var5 & 0x3FFF;
        var3.field2454[0] = var7 - class143.field2474;
        var3.field3155 = (var3.field2454[0] << 9) + (var3.method1108(127) << 8);
        var3.field2459[0] = var8 - class63.field917;
        var3.field3154 = (var3.field2459[0] << 9) + (var3.method1108(90) << 8);
        class416.field5926 = var3.field3158 = var3.field3163 = var6;
        if (class151.method1151(var3.field2459[0], var3.field2454[0], (byte) -49)) {
            var3.field3163++;
        }
        if (class565.field8277[var2] != null) {
            var3.method1709((byte) -111, class565.field8277[var2]);
        }
        class643.field9134 = 0;
        class98.field1458[class643.field9134++] = var2;
        class332.field4622[var2] = 0;
        class418.field5942 = 0;
        for (int var9 = 1; var9 < 2048; var9++) {
            if (var2 != var9) {
                int var10 = arg0.method2231(18, 83);
                int var11 = var10 >> 16;
                int var12 = (var10 & 0xFF89) >> 8;
                int var13 = var10 & 0xFF;
                class359 var14 = class340.field4725[var9] = new class359();
                var14.field5007 = -1;
                var14.field5006 = 0;
                var14.field5010 = (var11 << 28) + (var12 << 14) + var13;
                var14.field5008 = false;
                class57.field855[class418.field5942++] = var9;
                class332.field4622[var9] = 0;
            }
        }
        arg0.method2228(118);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IZI)V", line = 80)
    public static final void method606(int arg0, boolean arg1, int arg2) {
        field1193++;
        class569 var3 = class198.method1392(arg0, arg1, Integer.MIN_VALUE);
        if (var3 != null) {
            for (int var4 = arg2; var4 < var3.field8318.length; var4++) {
                var3.field8318[var4] = -1;
                var3.field8313[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(II[BI)[B", line = 103)
    public static final byte[] method607(int arg0, int arg1, byte[] arg2, int arg3) {
        field1188++;
        byte[] var4;
        if (arg3 <= 0) {
            var4 = arg2;
        } else {
            var4 = new byte[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                var4[var5] = arg2[arg3 + var5];
            }
        }
        class190 var6 = new class190();
        var6.method1350(0);
        if (arg1 < 11) {
            method608(-113, -61, -3, -93, 106, -73, 3);
        }
        var6.method1349((long) (arg0 * 8), var4, 255);
        byte[] var7 = new byte[64];
        var6.method1347(0, var7, (byte) -37);
        return var7;
    }

    @OriginalMember(owner = "client!jda", name = "toString", descriptor = "()Ljava/lang/String;", line = 142)
    public final String toString() {
        field1194++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIIIII)V", line = 153)
    public static final void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -669192498) {
            method605(null, (byte) 35);
        }
        field1187++;
        if (class512.field7620 <= arg0 - arg2 && class94.field1398 >= arg0 + arg2 && (arg5 - arg2) >= class198.field3084 && arg2 + arg5 <= class627.field8931) {
            class684.method3868(arg2, arg6, arg4, arg1, arg5, -80, arg0);
        } else {
            class668.method3768(arg2, arg0, arg4, arg1, true, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 169)
    public class77(String arg0, int arg1) {
        this.field1189 = arg1;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V", line = 180)
    public static void method609(byte arg0) {
        field1192 = null;
        if (arg0 != 0) {
            method606(-30, false, 67);
        }
    }
}
