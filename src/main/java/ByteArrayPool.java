import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class ByteArrayPool {

    @OriginalMember(owner = "mapview!l", name = "g", descriptor = "Lv;")
    public static JagString field183 = class1.method2(255, "Food Shop");

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "Lv;")
    public static JagString field177 = class1.method2(255, "75(U");

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "I")
    public static int field181 = 0;

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "[I")
    public static int[] field178 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!l", name = "i", descriptor = "[Z")
    public static boolean[] field185 = new boolean[112];

    @OriginalMember(owner = "mapview!l", name = "h", descriptor = "Lv;")
    public static JagString field184 = class1.method2(255, "_");

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "I")
    public static int maxCount;

    @OriginalMember(owner = "mapview!pa", name = "l", descriptor = "I")
    public static int midCount;

    @OriginalMember(owner = "mapview!sa", name = "c", descriptor = "I")
    public static int minCount;

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "Lea;")
    public static HashTable field180;

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field182;

    @OriginalMember(owner = "mapview!ja", name = "r", descriptor = "[[B")
    public static byte[][] maxPool;

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "[[B")
    public static byte[][] midPool;

    @OriginalMember(owner = "mapview!i", name = "f", descriptor = "[[B")
    public static byte[][] minPool;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 5)
    public static final String method64(int arg0, Throwable arg1) throws IOException {
        String var2;
        if (arg1 instanceof JagException) {
            JagException var3 = (JagException) arg1;
            arg1 = var3.field103;
            var2 = var3.field102 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg0 != -1) {
            field185 = null;
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var11 = var9.indexOf(40);
                int var12 = var9.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var9.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var2 = var2 + var15 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var11);
                }
                String var16 = var9.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var2 = var2 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(I)V", line = 82)
    public static void method65(int arg0) {
        field183 = null;
        field180 = null;
        field182 = null;
        if (arg0 != -20216) {
            alloc((byte) 28, -19);
        }
        field178 = null;
        field184 = null;
        field185 = null;
        field177 = null;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(BI)[B", line = 109)
    public static final synchronized byte[] alloc(byte arg0, int arg1) {
        if (arg1 == 100 && minCount > 0) {
            byte[] var2 = minPool[--minCount];
            minPool[minCount] = null;
            return var2;
        }
        if (arg0 < 40) {
            field182 = null;
        }
        if (arg1 == 5000 && midCount > 0) {
            byte[] var3 = midPool[--midCount];
            midPool[midCount] = null;
            return var3;
        } else if (arg1 == 30000 && maxCount > 0) {
            byte[] var4 = maxPool[--maxCount];
            maxPool[maxCount] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(II)Lv;", line = 182)
    public static final JagString method67(int arg0, int arg1) {
        if (arg1 != -3289) {
            field181 = -24;
        }
        JagString var2 = new JagString();
        var2.field474 = new byte[arg0];
        var2.field468 = 0;
        return var2;
    }
}
