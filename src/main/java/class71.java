import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class71 {

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Lho;")
    public static class103 field908 = new class103(30, 7);

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "[[I")
    public static int[][] field913 = new int[128][128];

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Lma;")
    public static class10 field912 = new class10();

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Z")
    public static boolean field915 = false;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Les;")
    public static class261 field914;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static void method420(byte arg0) {
        field913 = null;
        field912 = null;
        if (arg0 != -27) {
            field913 = null;
        }
        field908 = null;
        field914 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILug;)V")
    public static final void method421(int arg0, class396 arg1) {
        field911++;
        if (arg1.field5761.length - arg1.field5729 < 1) {
            return;
        }
        int var2 = arg1.method2388((byte) -121);
        if (~var2 > arg0 || var2 > 1 || arg1.field5761.length - arg1.field5729 < 2) {
            return;
        }
        int var3 = arg1.method2386(-23648);
        if ((var3 * 6) > (arg1.field5761.length - arg1.field5729)) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method2386(-23648);
            int var6 = arg1.method2406((byte) -92);
            if (class302.field3999.length > var5 && class272.field3636[var5] && (class323.field4296.method3133((byte) 51, var5).field6154 != '1' || var6 >= -1 && var6 <= 1)) {
                class302.field3999[var5] = var6;
            }
        }
    }
}
