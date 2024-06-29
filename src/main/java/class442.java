import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class442 extends class507 {

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "Z")
    private boolean field6419 = true;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "Lao;")
    public static class191 field6416 = new class191(35, 14);

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "Z")
    public static boolean field6425 = false;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "[Z")
    public static boolean[] field6427 = new boolean[100];

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "Lak;")
    public class234 field6423;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "Lsv;")
    public static class472 field6426;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "[I")
    public int[] field6405;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "[I")
    private int[] field6428;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field6415;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "[[I")
    private int[][] field6422;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)Ljava/lang/String;", line = 7)
    public final String method2712(int arg0) {
        field6410++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field6415 == null) {
            return "";
        }
        var2.append(this.field6415[0]);
        if (arg0 != -5607) {
            method2720(-40, 100, -70, 0, -104, -16);
        }
        for (int var3 = 1; var3 < this.field6415.length; var3++) {
            var2.append("...");
            var2.append(this.field6415[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lug;I)Ljava/lang/String;", line = 36)
    public final String method2713(class396 arg0, int arg1) {
        field6418++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field6428 != null) {
            for (int var4 = 0; var4 < this.field6428.length; var4++) {
                var3.append(this.field6415[var4]);
                var3.append(this.field6423.method1482(this.field6422[var4], this.method2723(var4, 0), arg0.method2407(255, class106.method652(this.field6428[var4], (byte) -109).field724), (byte) -113));
            }
        }
        var3.append(this.field6415[this.field6415.length + arg1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(Z)V", line = 62)
    public static final void method2714(boolean arg0) {
        field6406++;
        class86 var1 = null;
        try {
            class236 var2 = class381.field5518.method850("3", false, arg0);
            while (var2.field3149 == 0) {
                class316.method1873(1L, !arg0);
            }
            if (var2.field3149 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class86) var2.field3151;
            byte[] var3 = new byte[(int) var1.method473((byte) 86)];
            if (var3.length == 0) {
                class524.field7707 = "";
                class289.field3809 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method471(0, var3.length - var4, var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class396 var6 = new class396(var3);
                int var7 = var6.method2388((byte) -116);
                if (var7 > 50) {
                    throw new RuntimeException("Bad length");
                }
                var6.field5729 = var7 + 1;
                if (!var6.method2423(4)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field5729 = 1;
                int var8 = var6.method2388((byte) -128);
                if (var8 != 0) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class524.field7707 = var6.method2436(-268435456);
                class289.field3809 = var6.method2436(-268435456);
            }
        } catch (Exception var10) {
            class289.field3809 = "";
            class524.field7707 = "";
        }
        try {
            if (var1 != null) {
                var1.method472(-29827);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)V", line = 144)
    public static final void method2715(int arg0) {
        if (arg0 != 32768) {
            method2720(59, 125, -66, 21, -87, -114);
        }
        class140.method866(22050, 2, true, class319.field4256.field4670);
        field6411++;
        class522.field7673 = new class98();
        class522.field7673.method599(arg0 ^ 0xFFFF7FA3, 128, 9);
        class235.field3146 = class99.method605((byte) -85, 0, 22050, class60.field701, class381.field5518);
        class235.field3146.method1039((byte) -127, class522.field7673);
        class136.method827(class287.field3782, class522.field7673, 8, class75.field938, class273.field3641);
        class153.field2005 = class99.method605((byte) -85, 1, 2048, class60.field701, class381.field5518);
        class465.field6928 = new class194();
        class153.field2005.method1039((byte) -114, class465.field6928);
        class266.field3571 = new class126(22050, class286.field3762);
        class283.field3750 = class96.field1214.method2148("scape main", 0);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILug;)V", line = 165)
    public final void method2716(int arg0, class396 arg1) {
        field6424++;
        while (true) {
            int var3 = arg1.method2388((byte) -112);
            if (var3 == 0) {
                int var4 = 27 / ((-arg0 - 38) / 42);
                return;
            }
            this.method2721((byte) -94, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 186)
    public final void method2717(byte arg0) {
        field6414++;
        if (this.field6405 != null) {
            for (int var2 = 0; var2 < this.field6405.length; var2++) {
                this.field6405[var2] = class219.method1381(this.field6405[var2], 32768);
            }
        }
        if (arg0 < 101) {
            field6427 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[B)[B", line = 208)
    public static final byte[] method2718(int arg0, byte[] arg1) {
        field6408++;
        if (arg0 < 22) {
            field6425 = false;
        }
        class396 var2 = new class396(arg1);
        int var3 = var2.method2388((byte) -119);
        int var4 = var2.method2406((byte) -74);
        if (var4 < 0 || class401.field5818 != 0 && class401.field5818 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2395((byte) 121, var5, 0, var4);
            return var5;
        } else {
            int var6 = var2.method2406((byte) -124);
            if (var6 < 0 || !(class401.field5818 == 0 || class401.field5818 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class18.method102(var7, var6, arg1, var4, 9);
            } else {
                class97.field1262.method245(var2, (byte) 127, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZLjava/lang/String;B)V", line = 263)
    public static final void method2719(boolean arg0, String arg1, byte arg2) {
        String var3 = arg1.toLowerCase();
        field6417++;
        short[] var4 = new short[16];
        int var5 = 0;
        if (arg2 != 58) {
            method2718(-23, null);
        }
        int var6 = arg0 ? 32768 : 0;
        int var7 = var6 + (arg0 ? class253.field3371.field3126 : class253.field3371.field3132);
        for (int var8 = var6; var8 < var7; var8++) {
            class442 var11 = class253.field3371.method1481(var8, (byte) -102);
            if (var11.field6419 && var11.method2712(-5607).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class530.field7780 = -1;
                    class374.field5076 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class474.field7029 = 0;
        class374.field5076 = var4;
        class530.field7780 = var5;
        String[] var9 = new String[class530.field7780];
        for (int var10 = 0; var10 < class530.field7780; var10++) {
            var9[var10] = class253.field3371.method1481(var4[var10], (byte) -121).method2712(arg2 - 5665);
        }
        class402.method2485(class374.field5076, (byte) -85, var9);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIII)V", line = 339)
    public static final void method2720(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6413++;
        int var6 = arg0 - arg4;
        int var7 = arg1 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class277.method1684(arg0, arg4, 0, arg2, arg3);
            }
        } else if (var6 == 0) {
            class40.method228(arg1, arg2, -128, arg3, arg4);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg2;
                int var10 = arg1;
                arg2 = arg4;
                arg4 = var9;
                arg1 = arg0;
                arg0 = var10;
            }
            if (arg2 > arg1) {
                int var11 = arg2;
                arg2 = arg1;
                int var12 = arg4;
                arg1 = var11;
                arg4 = arg0;
                arg0 = var12;
            }
            int var13 = arg4;
            int var14 = arg1 - arg2;
            int var15 = arg0 - arg4;
            int var16 = -(var14 >> 1);
            int var17 = arg0 <= arg4 ? -1 : 1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (arg5 != 1) {
                field6426 = null;
            }
            if (var8) {
                for (int var19 = arg2; var19 <= arg1; var19++) {
                    class5.field54[var19][var13] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var18 = arg2; var18 <= arg1; var18++) {
                    var16 += var15;
                    class5.field54[var13][var18] = arg3;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLug;I)V", line = 458)
    private final void method2721(byte arg0, class396 arg1, int arg2) {
        field6412++;
        if (arg2 == 1) {
            this.field6415 = class436.method2679((byte) 88, '<', arg1.method2432((byte) 125));
        } else if (arg2 == 2) {
            int var4 = arg1.method2388((byte) -125);
            this.field6405 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6405[var5] = arg1.method2386(-23648);
            }
        } else if (arg2 == 3) {
            int var6 = arg1.method2388((byte) -122);
            this.field6428 = new int[var6];
            this.field6422 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method2386(-23648);
                class63 var9 = class106.method652(var8, (byte) -126);
                if (var9 != null) {
                    this.field6428[var7] = var8;
                    this.field6422[var7] = new int[var9.field726];
                    for (int var10 = 0; var10 < var9.field726; var10++) {
                        this.field6422[var7][var10] = arg1.method2386(-23648);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field6419 = false;
        }
        if (arg0 >= -74) {
            method2715(106);
        }
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)V", line = 535)
    public static void method2722(int arg0) {
        field6426 = null;
        field6427 = null;
        if (arg0 != 32679) {
            method2715(34);
        }
        field6416 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Lsd;", line = 550)
    public final class63 method2723(int arg0, int arg1) {
        if (arg1 != 0) {
            method2719(true, null, (byte) -87);
        }
        field6409++;
        return this.field6428 == null || arg0 < 0 || this.field6428.length < arg0 ? null : class106.method652(this.field6428[arg0], (byte) -23);
    }

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "(I)I", line = 568)
    public final int method2724(int arg0) {
        field6421++;
        if (arg0 == 0) {
            return this.field6428 == null ? 0 : this.field6428.length;
        } else {
            return 26;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([ILug;B)V", line = 590)
    public final void method2725(int[] arg0, class396 arg1, byte arg2) {
        field6420++;
        if (this.field6428 == null) {
            return;
        }
        int var4 = 0;
        if (arg2 > -77) {
            method2722(119);
        }
        while (this.field6428.length > var4) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = this.method2723(var4, 0).field731;
            if (var5 > 0) {
                arg1.method2390((long) arg0[var4], 8, var5);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BII)I", line = 620)
    public final int method2726(byte arg0, int arg1, int arg2) {
        field6407++;
        if (arg0 < 9) {
            method2718(55, null);
        }
        if (this.field6428 == null || arg2 < 0 || arg2 > this.field6428.length) {
            return -1;
        } else if (this.field6422[arg2] == null || arg1 < 0 || this.field6422[arg2].length < arg1) {
            return -1;
        } else {
            return this.field6422[arg2][arg1];
        }
    }
}
