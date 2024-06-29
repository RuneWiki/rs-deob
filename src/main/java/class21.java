import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class21 {

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public int field225 = 0;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "Lqv;")
    public static class316 field222 = new class316(35, -1);

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field226 = 0;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "[B")
    public static byte[] field227 = new byte[2048];

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[Ljava/lang/String;II[S)V")
    public static final void method116(int arg0, String[] arg1, int arg2, int arg3, short[] arg4) {
        if (arg3 != 1) {
            method120(-3, null);
        }
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if (var7 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].compareTo(var7)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var8;
            method116(arg0, arg1, var6 - 1, 1, arg4);
            method116(var6 + 1, arg1, arg2, 1, arg4);
        }
        field221++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lwn;I)V")
    public final void method117(class519 arg0, int arg1) {
        if (arg1 <= 8) {
            method116(-118, null, -12, 97, null);
        }
        while (true) {
            int var3 = arg0.method3072((byte) -122);
            if (var3 == 0) {
                field224++;
                return;
            }
            this.method118(-7923, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILwn;)V")
    private final void method118(int arg0, int arg1, class519 arg2) {
        field220++;
        if (arg1 == 5) {
            this.field225 = arg2.method3018(566990904);
        }
        if (arg0 != -7923) {
            this.field225 = 109;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method119(byte arg0) {
        field222 = null;
        if (arg0 < -13) {
            field227 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILwn;)V")
    public static final void method120(int arg0, class519 arg1) {
        field223++;
        if ((arg1.field7545.length - arg1.field7558) < 1) {
            return;
        }
        int var2 = arg1.method3072((byte) -119);
        if (var2 < 0 || var2 > 1 || (arg1.field7545.length - arg1.field7558) < 2) {
            return;
        }
        if (arg0 != 2) {
            method120(-72, null);
        }
        int var3 = arg1.method3018(566990904);
        if (var3 * 6 > arg1.field7545.length - arg1.field7558) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method3018(566990904);
            int var6 = arg1.method3053(-129);
            if (class288.field4270.length > var5 && class388.field5517[var5] && (class191.field2784.method13(var5, true).field7499 != '1' || var6 >= -1 && var6 <= 1)) {
                class288.field4270[var5] = var6;
            }
        }
    }
}
