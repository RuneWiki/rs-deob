import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class541 {

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "Lbi;")
    private class449 field7131;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "[Z")
    private boolean[] field7132;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "[[I")
    private int[][] field7130;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    private int field7124;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "[Lto;")
    public static class8[] field7123 = new class8[2048];

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "[[B")
    public static byte[][] field7127 = new byte[50][];

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "Lbi;")
    public static class449 field7122;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method2985(Throwable arg0, byte arg1) throws IOException {
        field7121++;
        String var2;
        if ((arg0 instanceof class209)) {
            class209 var3 = (class209) arg0;
            arg0 = var3.field2990;
            var2 = var3.field2993 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                String var18 = var2 + "| " + var8;
                int var19 = 84 / ((35 - arg1) / 60);
                return var18;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
    public static void method2986(int arg0) {
        field7122 = null;
        field7123 = null;
        field7127 = null;
        if (arg0 != 14144) {
            method2986(11);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZJ)V")
    public static final void method2987(boolean arg0, long arg1) {
        field7129++;
        if (class703.field9899 != null) {
            if (class140.field2254 == 1 || class140.field2254 == 5) {
                class375.method2205((byte) -128, arg1);
            } else if (class140.field2254 == 4) {
                class259.method1587(arg1, -114);
            }
        }
        class613.method3353(-91, (long) class642.field8626, class10.field197);
        if (class251.field3463 != -1) {
            class397.method2279(class251.field3463, 2);
        }
        if (!arg0) {
            return;
        }
        for (int var3 = 0; var3 < class172.field2661; var3++) {
            if (class511.field6834[var3]) {
                class209.field2994[var3] = true;
            }
            class87.field1313[var3] = class511.field6834[var3];
            class511.field6834[var3] = false;
        }
        class546.field7285 = class642.field8626;
        if (class10.field197.method396()) {
            class703.field9904 = true;
        }
        if (class251.field3463 != -1) {
            class172.field2661 = 0;
            class415.method2376(0);
        }
        class10.field197.method435();
        class639.method3525((byte) 122, class10.field197);
        int var4 = class221.method1396((byte) 81);
        if (var4 == -1) {
            var4 = class428.field5883;
        }
        if (var4 == -1) {
            var4 = class587.field7786;
        }
        class16.method169(var4, -1);
        class134.method1002(class199.field2897.field8609, class199.field2897.field8620, 1, class199.field2897.field8612, class104.field1561);
        class104.field1561 = 0;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)[I")
    public final int[] method2988(byte arg0, int arg1) {
        field7128++;
        if (arg1 < 0 || this.field7130.length <= arg1) {
            return this.field7124 == -1 ? new int[0] : new int[] { this.field7124 };
        } else if (this.field7132[arg1] && this.field7130[arg1].length > 1) {
            int var3 = this.field7124 == -1 ? 0 : 1;
            if (arg0 != -67) {
                this.method2989(-65, -97);
            }
            Random var4 = new Random();
            int[] var5 = new int[this.field7130[arg1].length];
            class83.method682(this.field7130[arg1], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class660.method3697(arg0 ^ 0xFFFFFFBD, var5.length - var3, var4) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field7130[arg1];
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)Lcca;")
    public final class229 method2989(int arg0, int arg1) {
        field7125++;
        byte[] var3 = this.field7131.method2537(false, 1, arg0);
        if (arg1 > -20) {
            return null;
        } else {
            class229 var4 = new class229();
            var4.method1428(new class335(var3), -119);
            return var4;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)Z")
    public final boolean method2990(byte arg0) {
        field7126++;
        if (arg0 == 109) {
            return this.field7124 != -1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lpca;ILbi;)V")
    public class541(class671 arg0, int arg1, class449 arg2) {
        this.field7131 = arg2;
        this.field7131.method2527(0, 1);
        class335 var4 = new class335(this.field7131.method2537(false, 0, 0));
        int var5 = var4.method2034(255);
        if (var5 > 3) {
            this.field7132 = new boolean[0];
            this.field7130 = new int[0][];
            this.field7124 = -1;
        } else {
            int var6 = var4.method2034(255);
            class412[] var7 = class360.method2134((byte) -67);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method2034(255);
                    if (var7[var9].field5655 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method2034(255);
                int var12 = var4.method2034(255);
                if (var5 <= 2) {
                    this.field7124 = -1;
                } else {
                    this.field7124 = var4.method2022(-29089);
                }
                this.field7132 = new boolean[var12 + 1];
                this.field7130 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method2034(255);
                    this.field7132[var15] = var4.method2034(255) == 1;
                    int var16 = var4.method2001((byte) -83);
                    if (this.field7124 == -1) {
                        this.field7130[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field7130[var15][var18] = var4.method2001((byte) -83);
                        }
                    } else {
                        this.field7130[var15] = new int[var16 + 1];
                        this.field7130[var15][0] = this.field7124;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field7130[var15][var17 + 1] = var4.method2001((byte) -83);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field7130[var14] == null) {
                        if (this.field7124 == -1) {
                            this.field7130[var14] = new int[0];
                        } else {
                            this.field7130[var14] = new int[] { this.field7124 };
                        }
                    }
                }
            } else {
                this.field7132 = new boolean[0];
                this.field7130 = new int[0][];
                this.field7124 = -1;
            }
        }
    }
}
