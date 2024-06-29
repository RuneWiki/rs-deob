import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class643 {

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public int field9247 = class234.method1574(0);

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Ljava/lang/String;")
    public String field9237;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public int field9243;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Ljava/lang/String;")
    public String field9238;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Ljava/lang/String;")
    public String field9236;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Ljava/lang/String;")
    public String field9241;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public int field9244;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public int field9248;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Ljava/lang/String;")
    public String field9250;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public int field9249;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field9246 = 0;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Lju;")
    public static class111 field9240 = new class111("WTQA", 2);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field9235;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field9242;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V")
    public final void method3660(String arg0, byte arg1, String arg2, String arg3, String arg4, int arg5, String arg6, int arg7, int arg8) {
        this.field9247 = class234.method1574(0);
        field9245++;
        this.field9249 = arg8;
        this.field9238 = arg0;
        this.field9241 = arg4;
        this.field9237 = arg3;
        this.field9250 = arg2;
        this.field9244 = class336.field5031;
        if (arg1 < 113) {
            this.method3660(null, (byte) 122, null, null, null, -27, null, 79, 7);
        }
        this.field9243 = arg5;
        this.field9248 = arg7;
        this.field9236 = arg6;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method3661(byte arg0) {
        if (arg0 != -46) {
            field9240 = null;
        }
        field9240 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method3662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field9242++;
        int var7 = class107.method968(client.field4115, 118, class309.field4556, arg2);
        int var8 = class107.method968(client.field4115, 126, class309.field4556, arg1);
        int var9 = class107.method968(class379.field5612, 119, class704.field9911, arg0);
        int var10 = class107.method968(class379.field5612, 125, class704.field9911, arg5);
        int var11 = class107.method968(client.field4115, 120, class309.field4556, arg2 + arg4);
        int var12 = class107.method968(client.field4115, 124, class309.field4556, arg1 - arg4);
        for (int var13 = var7; var13 < var11; var13++) {
            class705.method3938(var10, arg3, 30336, var9, class582.field8429[var13]);
        }
        if (arg6 < 20) {
            field9246 = 51;
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class705.method3938(var10, arg3, 30336, var9, class582.field8429[var14]);
        }
        int var15 = class107.method968(class379.field5612, 115, class704.field9911, arg0 + arg4);
        int var16 = class107.method968(class379.field5612, 125, class704.field9911, arg5 - arg4);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class582.field8429[var17];
            class705.method3938(var15, arg3, 30336, var9, var18);
            class705.method3938(var10, arg3, 30336, var16, var18);
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class643(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field9237 = arg7;
        this.field9243 = arg6;
        this.field9238 = arg2;
        this.field9236 = arg4;
        this.field9241 = arg3;
        this.field9244 = class336.field5031;
        this.field9248 = arg1;
        this.field9250 = arg5;
        this.field9249 = arg0;
    }
}
