import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class25 {

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "Lia;")
    public static class15 field355 = class28.method196("General Store", false);

    @OriginalMember(owner = "mapview!na", name = "g", descriptor = "Lia;")
    public static class15 field359 = class28.method196("Switch to ", false);

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "Z")
    public static boolean field353 = true;

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "Lia;")
    public static class15 field356 = class28.method196("Farming shop", false);

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "[[B")
    public static byte[][] field357 = new byte[250][];

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "Lia;")
    private static class15 field354 = class28.method196("Overview", false);

    @OriginalMember(owner = "mapview!na", name = "l", descriptor = "Lia;")
    public static class15 field364 = class28.method196("Find", false);

    @OriginalMember(owner = "mapview!na", name = "k", descriptor = "Lia;")
    public static class15 field363 = class28.method196("POH Portal", false);

    @OriginalMember(owner = "mapview!na", name = "m", descriptor = "Z")
    public static boolean field365 = false;

    @OriginalMember(owner = "mapview!na", name = "i", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "mapview!na", name = "j", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "mapview!na", name = "h", descriptor = "J")
    public static long field360;

    @OriginalMember(owner = "mapview!na", name = "f", descriptor = "[I")
    public static int[] field358;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(II[Lia;B)V", line = 4)
    public static final void method173(int arg0, int arg1, class15[] arg2, byte arg3) {
        if (arg0 == 1) {
            arg2[0].method114(-66);
        } else {
            class6.method28(arg1, arg2, -122, arg0).method114(103);
        }
        if (arg3 >= -15) {
            field356 = null;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(B)V", line = 22)
    public static void method174(byte arg0) {
        field357 = null;
        field356 = null;
        field355 = null;
        field363 = null;
        field358 = null;
        field364 = null;
        field354 = null;
        if (arg0 < 72) {
            method174((byte) 51);
        }
        field359 = null;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Z)[Lia;", line = 44)
    public static final class15[] method175(boolean arg0) {
        if (arg0) {
            field360 = 88L;
        }
        return new class15[] { field354, class17.field176, class6.field58, class4.field38, class29.field407, class4.field39, class5.field43, class26.field371, class36.field498, class9.field75, class36.field501, class36.field500, class20.field230, class39.field514 };
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "([BB)[B", line = 69)
    public static final byte[] method176(byte[] arg0, byte arg1) {
        if (arg1 != -15) {
            field362 = -86;
        }
        class1 var2 = new class1(arg0);
        int var3 = var2.method5(-2);
        int var4 = var2.method7(arg1 + 18826);
        if (var4 < 0 || class10.field92 != 0 && class10.field92 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method6(var5, 128, 0, var4);
            return var5;
        } else {
            int var6 = var2.method7(arg1 ^ 0xFFFFB68A);
            if (var6 < 0 || class10.field92 != 0 && var6 > class10.field92) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class41.method267(var7, var6, arg0, var4, 9);
            } else {
                mapview.field299.method135((byte) -117, var2, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 148)
    public static final String method177(Throwable arg0, int arg1) throws IOException {
        String var3;
        if (arg0 instanceof class2) {
            class2 var2 = (class2) arg0;
            arg0 = var2.field8;
            var3 = var2.field14 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg1 != -1) {
            return (String) null;
        }
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var11 = var9.indexOf(40);
                int var12 = var9.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var9.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var11);
                }
                String var16 = var9.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }
}
