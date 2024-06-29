import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class98 extends class518 {

    @OriginalMember(owner = "client!wja", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field1333 = new String[] { method969(method968("\rz\u001eg)R")), method969(method968("\rz\u001eg(R")), method969(method968("\rz\u001eg+R")), method969(method968("Zl_")), method969(method968("Tz\u001e?\r@")), method969(method968("\u00060")), method969(method968("\rz\u001eg*R")) };

    @OriginalMember(owner = "client!wja", name = "K", descriptor = "Lmv;")
    public static class125 field1327 = new class125(58, 4);

    @OriginalMember(owner = "client!wja", name = "M", descriptor = "Lsb;")
    public static class261 field1328 = new class261(39, 4);

    @OriginalMember(owner = "client!wja", name = "F", descriptor = "[[I")
    public static int[][] field1332 = new int[6][];

    @OriginalMember(owner = "client!wja", name = "L", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!wja", name = "D", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!wja", name = "J", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!wja", name = "H", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!wja", name = "C", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!wja", name = "B", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!wja", name = "E", descriptor = "Llga;")
    public static class47 field1330;

    @OriginalMember(owner = "client!wja", name = "f", descriptor = "(I)I")
    public static final int method964(int arg0) {
        try {
            ++field1325;
            if (class15.field198 == null) {
                return 0;
            } else {
                if (arg0 != 2) {
                    method966(-58L, -24);
                }
                return class15.field198.length * 2;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1333[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method965(Throwable arg0, int arg1) throws IOException {
        ++field1326;
        String var2;
        if (!(arg0 instanceof class643)) {
            var2 = "";
        } else {
            class643 var3 = (class643) arg0;
            var2 = var3.field9156 + field1333[3];
            arg0 = var3.field9157;
        }
        if (arg1 != -20419) {
            field1327 = null;
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
                return var2 + field1333[5] + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 != -1) {
                var12 = var9.substring(0, var10);
            } else {
                var12 = var9;
            }
            String var13 = var12.trim();
            String var14 = var13.substring(1 + var13.lastIndexOf(32));
            String var15 = var14.substring(1 + var14.lastIndexOf(9));
            String var16 = var2 + var15;
            if (~var10 != 0 && ~var11 != 0) {
                int var17 = var9.indexOf(field1333[4], var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method966(long arg0, int arg1) {
        try {
            ++field1324;
            if (~arg0 < -1L && arg0 < 6582952005840035281L) {
                if (~(arg0 % 37L) == -1L) {
                    return null;
                } else {
                    int var3 = 0;
                    long var4 = arg0;
                    if (arg1 != 5) {
                        method967(-79);
                    }
                    while (~var4 != -1L) {
                        ++var3;
                        var4 /= 37L;
                    }
                    StringBuffer var6 = new StringBuffer(var3);
                    while (~arg0 != -1L) {
                        long var7 = arg0;
                        arg0 /= 37L;
                        char var9 = class735.field10464[(int) (-(arg0 * 37L) + var7)];
                        if (~var9 == -96) {
                            int var10 = -1 + var6.length();
                            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                            var9 = 160;
                        }
                        var6.append(var9);
                    }
                    var6.reverse();
                    var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                    return var6.toString();
                }
            } else {
                return null;
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field1333[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "g", descriptor = "(I)V")
    public static void method967(int arg0) {
        try {
            field1332 = null;
            field1330 = null;
            if (arg0 != 32) {
                field1329 = -99;
            }
            field1328 = null;
            field1327 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1333[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "<init>", descriptor = "()V")
    public class98() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field1323;
            int var3 = 34 / ((-57 - arg1) / 55);
            int[] var4 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                int[][] var5 = this.method3943(0, arg0, -23583);
                int[] var6 = var5[0];
                int[] var7 = var5[1];
                int[] var8 = var5[2];
                for (int var9 = 0; ~class110.field1436 < ~var9; ++var9) {
                    var4[var9] = (var6[var9] + var8[var9] - -var7[var9]) / 3;
                }
            }
            return var4;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field1333[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method968(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 108);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method969(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 73;
                    break;
                default:
                    var10005 = 108;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
