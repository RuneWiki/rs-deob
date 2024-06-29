import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class378 extends class478 {

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "[[I")
    public static int[][] field5119 = new int[128][128];

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "[B")
    public static byte[] field5120;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "Ljava/lang/String;")
    public static String field5122;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "Ljava/lang/String;")
    public static String field5123;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Lcq;")
    public static class110 field5125;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "Leo;")
    public static class560 field5124;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        field5121++;
        if (arg1 != -11323) {
            this.method35(118, -125);
        }
        return class684.field9645;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class378() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public static void method2184(int arg0) {
        field5125 = null;
        field5122 = null;
        field5119 = null;
        field5124 = null;
        field5120 = null;
        if (arg0 != 18458) {
            method2184(-126);
        }
        field5123 = null;
    }

    static {
        int var0 = 0;
        field5120 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field5120[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var14) {
        }
        var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var13) {
        }
        var4.toLowerCase();
        String var5 = "Unknown";
        try {
            var5 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var12) {
        }
        field5122 = var5.toLowerCase();
        String var6 = "Unknown";
        try {
            var6 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var11) {
        }
        field5123 = var6.toLowerCase();
        String var7 = "Unknown";
        try {
            var7 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var10) {
        }
        var7.toLowerCase();
        String var8 = "~/";
        try {
            var8 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var9) {
        }
        new File(var8);
        field5125 = new class110(103, 7);
    }
}
