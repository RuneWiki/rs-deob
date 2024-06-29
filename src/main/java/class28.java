import java.awt.FontMetrics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class28 {

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "[B")
    public byte[] field386 = new byte[256];

    @OriginalMember(owner = "mapview!oa", name = "n", descriptor = "[[B")
    public byte[][] field395 = new byte[6][258];

    @OriginalMember(owner = "mapview!oa", name = "h", descriptor = "[B")
    public byte[] field389 = new byte[18002];

    @OriginalMember(owner = "mapview!oa", name = "j", descriptor = "[[I")
    public int[][] field391 = new int[6][258];

    @OriginalMember(owner = "mapview!oa", name = "x", descriptor = "[B")
    public byte[] field405 = new byte[4096];

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "[Z")
    public boolean[] field382 = new boolean[16];

    @OriginalMember(owner = "mapview!oa", name = "F", descriptor = "[Z")
    public boolean[] field413 = new boolean[256];

    @OriginalMember(owner = "mapview!oa", name = "E", descriptor = "[[I")
    public int[][] field412 = new int[6][258];

    @OriginalMember(owner = "mapview!oa", name = "f", descriptor = "[I")
    public int[] field387 = new int[6];

    @OriginalMember(owner = "mapview!oa", name = "M", descriptor = "[[I")
    public int[][] field420 = new int[6][258];

    @OriginalMember(owner = "mapview!oa", name = "L", descriptor = "I")
    public int field419 = 0;

    @OriginalMember(owner = "mapview!oa", name = "N", descriptor = "[I")
    public int[] field421 = new int[16];

    @OriginalMember(owner = "mapview!oa", name = "t", descriptor = "[B")
    public byte[] field401 = new byte[18002];

    @OriginalMember(owner = "mapview!oa", name = "Q", descriptor = "[I")
    public int[] field424 = new int[256];

    @OriginalMember(owner = "mapview!oa", name = "R", descriptor = "I")
    public int field425 = 0;

    @OriginalMember(owner = "mapview!oa", name = "S", descriptor = "[I")
    public int[] field426 = new int[257];

    @OriginalMember(owner = "mapview!oa", name = "r", descriptor = "Ld;")
    public static class7 field399 = class37.method242("50(U", 1333943984);

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "Ld;")
    public static class7 field385 = class37.method242("Farming patch", 1333943984);

    @OriginalMember(owner = "mapview!oa", name = "C", descriptor = "La;")
    public static class1 field410 = null;

    @OriginalMember(owner = "mapview!oa", name = "J", descriptor = "Z")
    public static volatile boolean field417 = false;

    @OriginalMember(owner = "mapview!oa", name = "p", descriptor = "Z")
    public static volatile boolean field397 = true;

    @OriginalMember(owner = "mapview!oa", name = "I", descriptor = "I")
    public static int field416 = 0;

    @OriginalMember(owner = "mapview!oa", name = "O", descriptor = "Ld;")
    public static class7 field422 = class37.method242("Shield Shop", 1333943984);

    @OriginalMember(owner = "mapview!oa", name = "P", descriptor = "Ld;")
    public static class7 field423 = class37.method242("Silk Trader", 1333943984);

    @OriginalMember(owner = "mapview!oa", name = "D", descriptor = "I")
    public static int field411 = 0;

    @OriginalMember(owner = "mapview!oa", name = "s", descriptor = "B")
    public byte field400;

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "mapview!oa", name = "g", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "mapview!oa", name = "i", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "mapview!oa", name = "k", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "mapview!oa", name = "m", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "mapview!oa", name = "u", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "mapview!oa", name = "v", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "mapview!oa", name = "w", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "mapview!oa", name = "y", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "mapview!oa", name = "z", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "mapview!oa", name = "A", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "mapview!oa", name = "B", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "mapview!oa", name = "G", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "mapview!oa", name = "q", descriptor = "Lc;")
    public static class5 field398;

    @OriginalMember(owner = "mapview!oa", name = "K", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field418;

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "[B")
    public byte[] field383;

    @OriginalMember(owner = "mapview!oa", name = "l", descriptor = "[B")
    public static byte[] field393;

    @OriginalMember(owner = "mapview!oa", name = "o", descriptor = "[B")
    public byte[] field396;

    @OriginalMember(owner = "mapview!oa", name = "H", descriptor = "[I")
    public static int[] field415;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(B)V", line = 80)
    public static void method207(byte arg0) {
        field422 = null;
        field398 = null;
        field385 = null;
        field418 = null;
        field399 = null;
        field415 = null;
        field393 = null;
        field423 = null;
        if (arg0 != -35) {
            field399 = null;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 128)
    public static final String method208(byte arg0, Throwable arg1) throws IOException {
        String var2;
        if (arg1 instanceof class8) {
            class8 var3 = (class8) arg1;
            var2 = var3.field92 + " | ";
            arg1 = var3.field95;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg0 < 83) {
            return (String) null;
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
}
