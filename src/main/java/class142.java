import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class142 extends class171 {

    @OriginalMember(owner = "client!va", name = "t", descriptor = "Lok;")
    private static class146 field2365 = class235.method1724(-12908, "Walk here");

    @OriginalMember(owner = "client!va", name = "r", descriptor = "Lok;")
    public static class146 field2363 = field2365;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public int field2367;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public int field2370;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "Lfa;")
    public static class192 field2369;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "Ltg;")
    public static class307 field2368;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V", line = 17)
    public static void method1044(int arg0) {
        if (arg0 != 0) {
            field2368 = (class307) null;
        }
        field2363 = null;
        field2368 = null;
        field2369 = null;
        field2365 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method1045(boolean arg0) {
        field2371++;
        client.field4080.method1653(14051);
        int var1 = client.field4080.method1659(1, false);
        if (var1 == 0) {
            return;
        }
        int var2 = client.field4080.method1659(2, !arg0);
        if (var2 == 0) {
            class228.field3809[class182.field3045++] = 2047;
        } else if (var2 == 1) {
            int var10 = client.field4080.method1659(3, !arg0);
            class102.field1639.method2218(false, -95, var10);
            int var11 = client.field4080.method1659(1, false);
            if (var11 == 1) {
                class228.field3809[class182.field3045++] = 2047;
            }
        } else {
            if (!arg0) {
                field2368 = (class307) null;
            }
            if (var2 == 2) {
                int var3 = client.field4080.method1659(3, false);
                class102.field1639.method2218(true, -104, var3);
                int var4 = client.field4080.method1659(3, false);
                class102.field1639.method2218(true, -88, var4);
                int var5 = client.field4080.method1659(1, false);
                if (var5 == 1) {
                    class228.field3809[class182.field3045++] = 2047;
                }
            } else if (var2 == 3) {
                class203.field3387 = client.field4080.method1659(2, !arg0);
                int var6 = client.field4080.method1659(1, false);
                int var7 = client.field4080.method1659(7, false);
                int var8 = client.field4080.method1659(7, false);
                int var9 = client.field4080.method1659(1, !arg0);
                if (var9 == 1) {
                    class228.field3809[class182.field3045++] = 2047;
                }
                class102.field1639.method1718(var8, 111, var7, var6 == 1);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)[Lje;", line = 112)
    public static final class70[] method1046(int arg0) {
        class70[] var1 = new class70[class241.field4004];
        if (arg0 != 1) {
            return (class70[]) null;
        }
        for (int var2 = 0; var2 < class241.field4004; var2++) {
            int var3 = class238.field3967[var2] * class150.field2562[var2];
            byte[] var4 = class17.field353[var2];
            if (class110.field1763[var2]) {
                byte[] var7 = class63.field1089[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class138.method1013(class94.field1514[class82.method582(255, var4[var9])], class82.method582(var7[var9] << 24, -16777216));
                }
                if (class271.field4640) {
                    var1[var2] = new class10(class177.field3006, class242.field4027, class226.field3776[var2], class23.field424[var2], class238.field3967[var2], class150.field2562[var2], var8);
                } else {
                    var1[var2] = new class233(class177.field3006, class242.field4027, class226.field3776[var2], class23.field424[var2], class238.field3967[var2], class150.field2562[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class94.field1514[class82.method582(var4[var6], 255)];
                }
                if (class271.field4640) {
                    var1[var2] = new class8(class177.field3006, class242.field4027, class226.field3776[var2], class23.field424[var2], class238.field3967[var2], class150.field2562[var2], var5);
                } else {
                    var1[var2] = new class307(class177.field3006, class242.field4027, class226.field3776[var2], class23.field424[var2], class238.field3967[var2], class150.field2562[var2], var5);
                }
            }
        }
        field2366++;
        class301.method2122((byte) 0);
        return var1;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V", line = 177)
    public static final void method1047(int arg0, int arg1) {
        class11 var2 = class203.field3382[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class11 var4 = class203.field3382[var3][arg0][arg1] = class203.field3382[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field209--;
                for (int var5 = 0; var5 < var4.field218; var5++) {
                    class311 var6 = var4.field217[var5];
                    if ((var6.field5289 >> 29 & 0x3L) == 2L && var6.field5296 == arg0 && var6.field5294 == arg1) {
                        var6.field5292--;
                    }
                }
            }
        }
        if (class203.field3382[0][arg0][arg1] == null) {
            class203.field3382[0][arg0][arg1] = new class11(0, arg0, arg1);
        }
        class203.field3382[0][arg0][arg1].field208 = var2;
        class203.field3382[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 226)
    public static final String method1048(int arg0, Throwable arg1) throws IOException {
        field2362++;
        String var2;
        if ((arg1 instanceof class216)) {
            class216 var3 = (class216) arg1;
            arg1 = var3.field3572;
            var2 = var3.field3568 + " | ";
        } else {
            var2 = "";
        }
        int var4 = 79 % ((-arg0 - 63) / 58);
        StringWriter var5 = new StringWriter();
        PrintWriter var6 = new PrintWriter(var5);
        arg1.printStackTrace(var6);
        var6.close();
        String var7 = var5.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            while (true) {
                String var10 = var8.readLine();
                if (var10 == null) {
                    return var2 + "| " + var9;
                }
                int var12 = var10.indexOf(40);
                int var13 = var10.indexOf(41, var12 + 1);
                if (var12 >= 0 && var13 >= 0) {
                    String var14 = var10.substring(var12 + 1, var13);
                    int var15 = var14.indexOf(".java:");
                    if (var15 >= 0) {
                        String var16 = var14.substring(0, var15) + var14.substring(var15 + 5);
                        var2 = var2 + var16 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var12);
                }
                String var17 = var10.trim();
                String var18 = var17.substring(var17.lastIndexOf(32) + 1);
                String var19 = var18.substring(var18.lastIndexOf(9) + 1);
                var2 = var2 + var19 + ' ';
            }
        }
    }
}
