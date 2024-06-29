import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class class47 {

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "Z")
    private boolean field1356;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "Z")
    private boolean field1336;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[I")
    public static int[] field1316 = new int[5];

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Lrd;")
    private static class117 field1320 = class95.method812("Hide", (byte) 8);

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Lrd;")
    private static class117 field1334 = class95.method812(" is already on your friend list", (byte) 8);

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field1329 = 0;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lrd;")
    private static class117 field1318 = class95.method812("Starting game engine)3)3)3", (byte) 8);

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "Lrd;")
    private static class117 field1340 = class95.method812("(U4", (byte) 8);

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "Lrd;")
    public static class117 field1350 = field1320;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field1349 = 0;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "Lrd;")
    public static class117 field1347 = field1334;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Lrd;")
    public static class117 field1317 = field1318;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Lja;")
    private class63 field1315;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[I")
    public int[] field1323;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "[I")
    public int[] field1335;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "[I")
    private int[] field1346;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "[I")
    private int[] field1348;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "[I")
    public int[] field1362;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "[Lja;")
    private class63[] field1324;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "[Ljava/lang/Object;")
    public Object[] field1342;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "[[I")
    private int[][] field1352;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "[[I")
    private int[][] field1361;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1345;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lrd;I)I")
    public final int method509(class117 arg0, int arg1) {
        if (arg1 != 0) {
            field1329 = -29;
        }
        class117 var3 = arg0.method972(-117);
        field1331++;
        return this.field1315.method641(var3.method941((byte) -1), 112);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([III)Z")
    private final boolean method510(int[] arg0, int arg1, int arg2) {
        field1332++;
        if (this.field1342[arg2] == null) {
            return false;
        }
        int var4 = this.field1362[arg2];
        int[] var5 = this.field1361[arg2];
        if (arg1 >= -48) {
            this.field1323 = null;
        }
        boolean var6 = true;
        Object[] var7 = this.field1345[arg2];
        for (int var8 = 0; var8 < var4; var8++) {
            if (var7[var5[var8]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var9;
        if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
            var9 = class142.method1129(false, true, this.field1342[arg2]);
        } else {
            var9 = class142.method1129(true, true, this.field1342[arg2]);
            class14 var10 = new class14(var9);
            var10.method161(arg0, var10.field326.length, 5, -1);
        }
        byte[] var11;
        try {
            var11 = class133.method1089(128, var9);
        } catch (RuntimeException var28) {
            throw class61.method614(var28, "T3 - " + (arg0 != null) + "," + arg2 + "," + var9.length + "," + class16.method176(var9.length, var9, -14792) + "," + class16.method176(var9.length - 2, var9, -14792) + "," + this.field1335[arg2] + "," + this.field1358);
        }
        if (this.field1356) {
            this.field1342[arg2] = null;
        }
        if (var4 <= 1) {
            var7[var5[0]] = class118.method979(false, var11, 2);
        } else {
            int var13 = var11.length;
            int var29 = var13 - 1;
            int var14 = var11[var29] & 0xFF;
            class14 var15 = new class14(var11);
            int[] var16 = new int[var4];
            int var17 = var29 - var4 * var14 * 4;
            var15.field314 = var17;
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var15.method121((byte) 127);
                    var16[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var4][];
            for (int var22 = 0; var22 < var4; var22++) {
                var21[var22] = new byte[var16[var22]];
                var16[var22] = 0;
            }
            var15.field314 = var17;
            int var23 = 0;
            for (int var24 = 0; var24 < var14; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var15.method121((byte) 50);
                    class91.method797(var11, var23, var21[var26], var16[var26], var25);
                    var23 += var25;
                    var16[var26] += var25;
                }
            }
            for (int var27 = 0; var27 < var4; var27++) {
                var7[var5[var27]] = class118.method979(false, var21[var27], 2);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
    public final int method511(int arg0) {
        field1321++;
        if (arg0 != 0) {
            this.method53((byte) -29, 34);
        }
        return this.field1345.length;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V")
    public void method53(byte arg0, int arg1) {
        int var3 = 31 / ((-arg0 - 53) / 53);
        field1333++;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public static final void method512(int arg0) {
        field1354++;
        try {
            if (arg0 == 1) {
                Graphics var1 = class42.field1216.getGraphics();
                class101.field2535.method485(4, 550, -6898, var1);
            }
        } catch (Exception var2) {
            class42.field1216.repaint();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
    public void method56(int arg0, int arg1) {
        field1364++;
        if (arg1 <= 104) {
            this.field1335 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)V")
    public final void method513(int arg0, int arg1) {
        field1341++;
        for (int var3 = arg0; var3 < this.field1345[arg1].length; var3++) {
            this.field1345[arg1][var3] = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)Z")
    public final boolean method514(int arg0, int arg1) {
        field1343++;
        if (this.field1342[arg1] != null) {
            return true;
        }
        this.method53((byte) 117, arg1);
        if (this.field1342[arg1] == null) {
            if (arg0 != 8) {
                this.method521(117, null);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILrd;Lrd;)Z")
    public final boolean method515(int arg0, class117 arg1, class117 arg2) {
        if (arg0 != -16594) {
            this.method515(21, null, null);
        }
        class117 var4 = arg1.method972(-95);
        field1357++;
        class117 var5 = arg2.method972(arg0 + 16705);
        int var6 = this.field1315.method641(var4.method941((byte) -1), arg0 + 16704);
        int var7 = this.field1324[var6].method641(var5.method941((byte) -1), 78);
        return this.method525(var6, (byte) 45, var7);
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Z")
    public final boolean method516(int arg0) {
        field1325++;
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1346.length; var3++) {
            int var4 = this.field1346[var3];
            if (this.field1342[var4] == null) {
                this.method53((byte) -110, var4);
                if (this.field1342[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 <= 18) {
            this.field1342 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public final void method517(byte arg0) {
        int var2 = 106 % ((arg0 + 31) / 49);
        for (int var3 = 0; var3 < this.field1345.length; var3++) {
            if (this.field1345[var3] != null) {
                for (int var4 = 0; var4 < this.field1345[var3].length; var4++) {
                    this.field1345[var3][var4] = null;
                }
            }
        }
        field1355++;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
    public static final void method518(int arg0) {
        field1360++;
        int var1 = class104.field2588.method741(8, -92);
        if (class96.field2419 > var1) {
            for (int var2 = var1; var2 < class96.field2419; var2++) {
                class105.field2616[class79.field2123++] = class137.field3292[var2];
            }
        }
        if (var1 > class96.field2419) {
            throw new RuntimeException("gppov1");
        }
        class96.field2419 = 0;
        if (arg0 <= 118) {
            field1350 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class137.field3292[var3];
            class101 var5 = class93.field2340[var4];
            int var6 = class104.field2588.method741(1, -79);
            if (var6 == 0) {
                class137.field3292[class96.field2419++] = var4;
                var5.field722 = class85.field2236;
            } else {
                int var7 = class104.field2588.method741(2, 120);
                if (var7 == 0) {
                    class137.field3292[class96.field2419++] = var4;
                    var5.field722 = class85.field2236;
                    class135.field3229[field1329++] = var4;
                } else if (var7 == 1) {
                    class137.field3292[class96.field2419++] = var4;
                    var5.field722 = class85.field2236;
                    int var8 = class104.field2588.method741(3, 123);
                    var5.method268(-1, var8, false);
                    int var9 = class104.field2588.method741(1, -2);
                    if (var9 == 1) {
                        class135.field3229[field1329++] = var4;
                    }
                } else if (var7 == 2) {
                    class137.field3292[class96.field2419++] = var4;
                    var5.field722 = class85.field2236;
                    int var10 = class104.field2588.method741(3, -61);
                    var5.method268(-1, var10, true);
                    int var11 = class104.field2588.method741(3, -122);
                    var5.method268(-1, var11, true);
                    int var12 = class104.field2588.method741(1, 127);
                    if (var12 == 1) {
                        class135.field3229[field1329++] = var4;
                    }
                } else if (var7 == 3) {
                    class105.field2616[class79.field2123++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(BI)I")
    public final int method519(byte arg0, int arg1) {
        if (arg0 > -121) {
            return 124;
        } else {
            field1330++;
            return this.field1345[arg1].length;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lrd;ZLrd;)[B")
    public final byte[] method520(class117 arg0, boolean arg1, class117 arg2) {
        field1353++;
        class117 var4 = arg2.method972(83);
        class117 var5 = arg0.method972(69);
        if (arg1) {
            return null;
        } else {
            int var6 = this.field1315.method641(var4.method941((byte) -1), 110);
            int var7 = this.field1324[var6].method641(var5.method941((byte) -1), 126);
            return this.method526((byte) 123, var6, var7);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILrd;)V")
    public final void method521(int arg0, class117 arg1) {
        field1326++;
        class117 var3 = arg1.method972(108);
        int var4 = this.field1315.method641(var3.method941((byte) -1), 67);
        if (var4 >= 0) {
            int var5 = -56 % ((-arg0 - 21) / 40);
            this.method56(var4, 127);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[IB)[B")
    public final byte[] method522(int arg0, int arg1, int[] arg2, byte arg3) {
        field1322++;
        if (arg1 < 0 || arg1 >= this.field1345.length || this.field1345[arg1] == null || arg0 < 0 || arg0 >= this.field1345[arg1].length) {
            return null;
        }
        if (this.field1345[arg1][arg0] == null) {
            boolean var5 = this.method510(arg2, -65, arg1);
            if (!var5) {
                this.method53((byte) 49, arg1);
                boolean var6 = this.method510(arg2, -53, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class142.method1129(false, true, this.field1345[arg1][arg0]);
        if (this.field1336) {
            this.field1345[arg1][arg0] = null;
        }
        if (arg3 >= -120) {
            this.field1352 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILrd;I)I")
    public final int method523(int arg0, class117 arg1, int arg2) {
        field1351++;
        class117 var4 = arg1.method972(-14);
        if (arg2 != -1) {
            this.method522(-76, -17, null, (byte) -92);
        }
        return this.field1324[arg0].method641(var4.method941((byte) -1), arg2 + 37);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lwa;ILrd;)Lrd;")
    public static final class117 method524(class144 arg0, int arg1, class117 arg2) {
        if (arg2.method948((byte) 89, client.field617) != -1) {
            label62: while (true) {
                int var3 = arg2.method948((byte) 90, class142.field3376);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method948((byte) 108, class79.field2120);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method948((byte) 114, class53.field1500);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method948((byte) 88, field1340);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method948((byte) 93, class97.field2422);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method948((byte) 88, class90.field2312);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class117 var9 = class134.field3215;
                                                        if (class5.field131 != null) {
                                                            var9 = class25.method266(class5.field131.field941, (byte) 26);
                                                            try {
                                                                if (class5.field131.field937 != null) {
                                                                    byte[] var10 = ((String) class5.field131.field937).getBytes("ISO-8859-1");
                                                                    var9 = class35.method443(0, (byte) 86, var10.length, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg2 = class18.method193(new class117[] { arg2.method963(var8, 0, (byte) -127), var9, arg2.method949(var8 + 4, 0) }, 105);
                                                    }
                                                }
                                                arg2 = class18.method193(new class117[] { arg2.method963(var7, 0, (byte) -127), class18.method197(30712, class74.method699(arg0, -1, 4)), arg2.method949(var7 + 2, 0) }, 121);
                                            }
                                        }
                                        arg2 = class18.method193(new class117[] { arg2.method963(var6, 0, (byte) -127), class18.method197(arg1 + 30710, class74.method699(arg0, -1, 3)), arg2.method949(var6 + 2, 0) }, 23);
                                    }
                                }
                                arg2 = class18.method193(new class117[] { arg2.method963(var5, 0, (byte) -127), class18.method197(30712, class74.method699(arg0, -1, 2)), arg2.method949(var5 + 2, 0) }, 101);
                            }
                        }
                        arg2 = class18.method193(new class117[] { arg2.method963(var4, 0, (byte) -127), class18.method197(30712, class74.method699(arg0, -1, 1)), arg2.method949(var4 + 2, arg1 ^ 0x2) }, arg1 ^ 0x1B);
                    }
                }
                arg2 = class18.method193(new class117[] { arg2.method963(var3, 0, (byte) -127), class18.method197(30712, class74.method699(arg0, -1, 0)), arg2.method949(var3 + 2, 0) }, arg1 + 65);
            }
        }
        field1319++;
        if (arg1 != 2) {
            method518(-122);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)Z")
    public final boolean method525(int arg0, byte arg1, int arg2) {
        if (arg1 != 45) {
            this.method510(null, 77, 52);
        }
        field1359++;
        if (arg0 < 0 || this.field1345.length <= arg0 || this.field1345[arg0] == null || arg2 < 0 || arg2 >= this.field1345[arg0].length) {
            return false;
        } else if (this.field1345[arg0][arg2] != null) {
            return true;
        } else if (this.field1342[arg0] == null) {
            this.method53((byte) -106, arg0);
            return this.field1342[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BII)[B")
    public final byte[] method526(byte arg0, int arg1, int arg2) {
        if (arg0 <= 112) {
            this.field1324 = null;
        }
        field1327++;
        return this.method522(arg2, arg1, null, (byte) -126);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)[B")
    public final byte[] method527(boolean arg0, int arg1) {
        field1344++;
        if (this.field1345.length == 1) {
            return this.method530(-45, arg1, 0);
        } else if (!arg0) {
            return null;
        } else if (this.field1345[arg1].length == 1) {
            return this.method530(-69, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
    public static void method528(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1316 = null;
        field1347 = null;
        field1318 = null;
        field1350 = null;
        field1317 = null;
        field1340 = null;
        field1320 = null;
        field1334 = null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(ZI)[I")
    public final int[] method529(boolean arg0, int arg1) {
        field1339++;
        if (arg0) {
            field1320 = null;
        }
        return this.field1361[arg1];
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(ZZ)V")
    public class47(boolean arg0, boolean arg1) {
        this.field1356 = arg0;
        this.field1336 = arg1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)[B")
    public final byte[] method530(int arg0, int arg1, int arg2) {
        field1337++;
        if (arg2 < 0 || arg2 >= this.field1345.length || this.field1345[arg2] == null || arg1 < 0 || arg1 >= this.field1345[arg2].length) {
            return null;
        } else if (arg0 > -17) {
            return null;
        } else {
            if (this.field1345[arg2][arg1] == null) {
                boolean var4 = this.method510(null, -115, arg2);
                if (!var4) {
                    this.method53((byte) -119, arg2);
                    boolean var5 = this.method510(null, -66, arg2);
                    if (!var5) {
                        return null;
                    }
                }
            }
            return class142.method1129(false, true, this.field1345[arg2][arg1]);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(ZI)Z")
    public final boolean method531(boolean arg0, int arg1) {
        field1363++;
        if (!arg0) {
            this.field1315 = null;
        }
        if (this.field1345.length == 1) {
            return this.method525(0, (byte) 45, arg1);
        } else if (this.field1345[arg1].length == 1) {
            return this.method525(arg1, (byte) 45, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[B)V")
    public final void method532(int arg0, byte[] arg1) {
        this.field1358 = class16.method176(arg1.length, arg1, -14792);
        field1338++;
        class14 var3 = new class14(class133.method1089(128, arg1));
        int var4 = var3.method153(true);
        if (var4 != 5 || arg0 != 100) {
            return;
        }
        int var5 = var3.method153(true);
        int var6 = -1;
        int var7 = 0;
        this.field1328 = var3.method138((byte) 94);
        this.field1346 = new int[this.field1328];
        for (int var8 = 0; var8 < this.field1328; var8++) {
            this.field1346[var8] = var7 += var3.method138((byte) 124);
            if (var6 < this.field1346[var8]) {
                var6 = this.field1346[var8];
            }
        }
        this.field1342 = new Object[var6 + 1];
        this.field1323 = new int[var6 + 1];
        this.field1362 = new int[var6 + 1];
        this.field1345 = new Object[var6 + 1][];
        this.field1335 = new int[var6 + 1];
        this.field1361 = new int[var6 + 1][];
        if (var5 != 0) {
            this.field1348 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field1328; var9++) {
                this.field1348[this.field1346[var9]] = var3.method121((byte) -99);
            }
            this.field1315 = new class63(this.field1348);
        }
        for (int var10 = 0; var10 < this.field1328; var10++) {
            this.field1335[this.field1346[var10]] = var3.method121((byte) 126);
        }
        for (int var11 = 0; var11 < this.field1328; var11++) {
            this.field1323[this.field1346[var11]] = var3.method121((byte) 111);
        }
        for (int var12 = 0; var12 < this.field1328; var12++) {
            this.field1362[this.field1346[var12]] = var3.method138((byte) 88);
        }
        for (int var13 = 0; var13 < this.field1328; var13++) {
            int var18 = 0;
            int var19 = -1;
            int var20 = this.field1346[var13];
            int var21 = this.field1362[var20];
            this.field1361[var20] = new int[var21];
            for (int var22 = 0; var22 < var21; var22++) {
                int var23 = this.field1361[var20][var22] = var18 += var3.method138((byte) 108);
                if (var19 < var23) {
                    var19 = var23;
                }
            }
            this.field1345[var20] = new Object[var19 + 1];
        }
        if (var5 == 0) {
            return;
        }
        this.field1352 = new int[var6 + 1][];
        this.field1324 = new class63[var6 + 1];
        for (int var14 = 0; var14 < this.field1328; var14++) {
            int var15 = this.field1346[var14];
            int var16 = this.field1362[var15];
            this.field1352[var15] = new int[this.field1345[var15].length];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field1352[var15][this.field1361[var15][var17]] = var3.method121((byte) -73);
            }
            this.field1324[var15] = new class63(this.field1352[var15]);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)[B")
    public final byte[] method533(int arg0, byte arg1) {
        field1365++;
        if (this.field1345.length == 1) {
            return this.method526((byte) 117, 0, arg0);
        } else if (this.field1345[arg0].length == 1) {
            return this.method526((byte) 125, arg0, 0);
        } else if (arg1 == 25) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }
}
