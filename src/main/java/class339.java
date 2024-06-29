import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class339 extends class183 {

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public int field5090;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public int field5098;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "[I")
    public int[] field5100;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "[I")
    public int[] field5094;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "[Z")
    public boolean[] field5091;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "[[I")
    public int[][] field5088;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "[I")
    public static int[] field5092 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5089 = "Connecting to update server";

    @OriginalMember(owner = "client!t", name = "v", descriptor = "[I")
    public static int[] field5097 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Lin;")
    public static class344 field5095;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILbo;)V", line = 10)
    public static final void method2344(int arg0, class256 arg1) {
        field5096++;
        if (class329.field4966 == arg1.field3701 || arg1.field3668 == -1 || arg1.field3762 != 0 || arg1.field3688 + 1 > class52.method361(true, arg1.field3668).field1706[arg1.field3684]) {
            int var2 = arg1.field3701 - arg1.field3758;
            int var3 = class329.field4966 - arg1.field3758;
            int var4 = arg1.field3694 * 128 + arg1.method1653(-1) * 64;
            int var5 = arg1.field3685 * 128 + arg1.method1653(-1) * 64;
            int var6 = arg1.field3735 * 128 + arg1.method1653(-1) * 64;
            int var7 = arg1.field3671 * 128 + (arg1.method1653(-1) * 64);
            arg1.field3745 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg1.field3679 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        arg1.field3662 = 0;
        if (arg1.field3705 == 0) {
            arg1.field3666 = 1024;
        }
        if (arg1.field3705 == 1) {
            arg1.field3666 = 1536;
        }
        if (arg1.field3705 == 2) {
            arg1.field3666 = 0;
        }
        if (arg1.field3705 == 3) {
            arg1.field3666 = 512;
        }
        arg1.field3746 = arg1.field3666;
        if (arg0 > -57) {
            method2344(-44, (class256) null);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B[F)[F", line = 58)
    public static final float[] method2345(byte arg0, float[] arg1) {
        if (arg0 <= 105) {
            return (float[]) null;
        }
        field5099++;
        if (arg1 == null) {
            return null;
        } else {
            float[] var2 = new float[arg1.length];
            class281.method1937(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 87)
    public static void method2346(int arg0) {
        field5092 = null;
        field5095 = null;
        int var1 = -117 / ((-arg0 - 47) / 37);
        field5089 = null;
        field5097 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 99)
    public static final int method2347(String arg0, byte arg1) {
        field5093++;
        int var2 = -26 % ((-arg1 - 34) / 60);
        for (int var3 = 0; var3 < class132.field1803.length; var3++) {
            if (class132.field1803[var3].equalsIgnoreCase(arg0)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 124)
    public static final void method2348(int arg0) {
        field5101++;
        if (arg0 != 21887) {
            field5089 = (String) null;
        }
        class122.field1647++;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(I[B)V", line = 138)
    public class339(int arg0, byte[] arg1) {
        this.field5090 = arg0;
        class316 var3 = new class316(arg1);
        this.field5098 = var3.method2219(16448);
        this.field5100 = new int[this.field5098];
        this.field5094 = new int[this.field5098];
        this.field5091 = new boolean[this.field5098];
        this.field5088 = new int[this.field5098][];
        for (int var4 = 0; var4 < this.field5098; var4++) {
            this.field5094[var4] = var3.method2219(16448);
        }
        for (int var5 = 0; var5 < this.field5098; var5++) {
            this.field5091[var5] = var3.method2219(16448) == 1;
        }
        for (int var6 = 0; var6 < this.field5098; var6++) {
            this.field5100[var6] = var3.method2220((byte) 45);
        }
        for (int var7 = 0; var7 < this.field5098; var7++) {
            this.field5088[var7] = new int[var3.method2219(16448)];
        }
        for (int var8 = 0; var8 < this.field5098; var8++) {
            for (int var9 = 0; var9 < this.field5088[var8].length; var9++) {
                this.field5088[var8][var9] = var3.method2219(16448);
            }
        }
    }
}
