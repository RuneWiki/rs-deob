import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class238 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "[I")
    private int[] field3814;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "F")
    public static float field3817 = 1.0F;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "[I")
    public static int[] field3816 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!km", name = "g", descriptor = "Lah;")
    public static class263 field3819 = new class263(5000);

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field3822 = 0;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "F")
    public static float field3815;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3820;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZI)I", line = 8)
    public final int method1646(boolean arg0, int arg1) {
        field3813++;
        if (arg0) {
            field3819 = null;
        }
        int var3 = (this.field3814.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field3814[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3814[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 37)
    public static void method1647(byte arg0) {
        field3819 = null;
        if (arg0 > 78) {
            field3816 = null;
            field3820 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "([I)V", line = 50)
    public class238(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field3814 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3814[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3814[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field3814[var5 + var5] = arg0[var4];
            this.field3814[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 86)
    public static final String method1648(Throwable arg0, int arg1) throws IOException {
        field3818++;
        String var3;
        if (arg0 instanceof class497) {
            class497 var2 = (class497) arg0;
            var3 = var2.field7150 + " | ";
            arg0 = var2.field7146;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        int var6 = -98 / ((45 - arg1) / 60);
        arg0.printStackTrace(var5);
        var5.close();
        String var7 = var4.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            String var10 = var8.readLine();
            if (var10 == null) {
                return var3 + "| " + var9;
            }
            int var11 = var10.indexOf(40);
            int var12 = var10.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var10;
            } else {
                var13 = var10.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var3 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var10.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var10.substring(var18 + 5, var12);
                }
            }
            var3 = var17 + ' ';
        }
    }
}
