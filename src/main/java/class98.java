import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class98 implements class38 {

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "[F")
    private float[] field1494 = new float[4];

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Z")
    public static boolean field1495 = false;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "F")
    public static float field1496;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "[Z")
    public static boolean[] field1501;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([BB)V", line = 8)
    public static final void method655(byte[] arg0, byte arg1) {
        int var2 = 0;
        if (arg1 < 117) {
            field1501 = (boolean[]) null;
        }
        field1487++;
        while (true) {
            while (arg0.length > var2) {
                int var3 = (arg0[var2++] & 0xFF) * 64 - class142.field2263;
                int var4 = (arg0[var2++] & 0xFF) * 64 - class221.field3552;
                if (var3 > 0 && var4 > 0 && (var3 + 64) < class126.field1938 && (var4 + 64) < class258.field4137) {
                    int var5 = var3 >> 6;
                    int var6 = class258.field4137 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg0[var2++];
                            if (var9 != 0) {
                                if (class283.field4674[var5][var6] == null) {
                                    class283.field4674[var5][var6] = new byte[4096];
                                }
                                class283.field4674[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg0[var2++];
                                if (class144.field2294[var5][var6] == null) {
                                    class144.field2294[var5][var6] = new byte[4096];
                                }
                                class144.field2294[var5][var6][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg0[var2++];
                        if (var12 != 0) {
                            var2++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 95)
    public static final void method656(int arg0) {
        class103.field1559.method486((byte) 93);
        field1497++;
        int var1 = -47 / ((44 - arg0) / 54);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "()I", line = 111)
    public final int method296() {
        field1502++;
        return 0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 120)
    private final void method657(byte arg0) {
        GL var2 = class264.field4313;
        this.field1492 = var2.glGenLists(2);
        var2.glNewList(this.field1492, 4864);
        field1490++;
        var2.glActiveTexture(33985);
        if (class136.field2197) {
            var2.glBindTexture(32879, class136.field2202);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        if (arg0 != -10) {
            this.field1492 = -50;
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field1492 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class136.field2197) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        var2.glDisable(3168);
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()V", line = 164)
    public final void method295() {
        field1499++;
        GL var1 = class264.field4313;
        var1.glCallList(this.field1492);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()V", line = 174)
    public final void method293() {
        field1488++;
        GL var1 = class264.field4313;
        var1.glCallList(this.field1492 + 1);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIZIII)V", line = 185)
    public static final void method658(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1489++;
        class132.field2012++;
        if (!arg2) {
            class68.method495(0, true);
            class26.method195(arg4 ^ 0x544E, true);
            class68.method495(arg4, false);
        }
        class26.method195(21582, false);
        if (!arg2) {
            class73.method519((byte) 110);
        }
        class117.method737(2295);
        class42.method323(true, arg5, arg1, arg0, arg3, arg4 ^ 0x57);
        int var6 = class249.field4028;
        int var7 = class90.field1382;
        int var8 = class298.field5023;
        int var9 = class170.field2683;
        if (class68.field1063 == 1) {
            int var10 = class4.field114;
            if (var10 < class27.field397 / 256) {
                var10 = class27.field397 / 256;
            }
            int var11 = class30.field432 + class140.field2253 & 0x7FF;
            if (class55.field883[4] && var10 < (class55.field886[4] + 128)) {
                var10 = class55.field886[4] + 128;
            }
            class100.method667(var10 * 3 + 600, class273.field4486, var11, class207.method1304(class10.field189, (byte) 122, class124.field1917.field4949, class124.field1917.field4991) - 50, 0, var10, class295.field4890, var6);
        }
        int var12 = class62.field987;
        int var13 = class281.field4638;
        int var14 = class70.field1097;
        int var15 = class140.field2251;
        int var16 = class86.field1290;
        for (int var17 = 0; var17 < 5; var17++) {
            if (class55.field883[var17]) {
                int var18 = (int) (Math.random() * (double) (class231.field3735[var17] * 2 + 1) + Math.sin((double) class241.field3872[var17] / 100.0D * (double) class150.field2377[var17]) * (double) class55.field886[var17] - (double) class231.field3735[var17]);
                if (var17 == 3) {
                    class140.field2251 = class140.field2251 + var18 & 0x7FF;
                }
                if (var17 == 2) {
                    class70.field1097 += var18;
                }
                if (var17 == 4) {
                    class86.field1290 += var18;
                    if (class86.field1290 < 128) {
                        class86.field1290 = 128;
                    }
                    if (class86.field1290 > 383) {
                        class86.field1290 = 383;
                    }
                }
                if (var17 == 0) {
                    class62.field987 += var18;
                }
                if (var17 == 1) {
                    class281.field4638 += var18;
                }
            }
        }
        int var19 = 3;
        if (!class29.field417 && !class260.field4166) {
            var19 = class10.field189;
        }
        if (class64.method479(301989888) && class29.field417 && !class260.field4166) {
            if (class124.field1909 == null) {
                class124.field1909 = new byte[4][104][104];
            }
            byte var20 = (byte) (class132.field2012 - 4 & 0xFF);
            int var21 = class132.field2012 % 104;
            for (int var22 = 0; var22 < 4; var22++) {
                for (int var23 = 0; var23 < 104; var23++) {
                    class124.field1909[var22][var21][var23] = var20;
                }
            }
        }
        boolean var24 = false;
        if (class64.method479(301989888) && class29.field417 && !class260.field4166 && class10.field189 != 3) {
            for (int var25 = 0; var25 < 2; var25++) {
                class240.field3864[var25] = -1000000;
                class142.field2275[var25] = 1000000;
                class10.field192[var25] = 0;
                class276.field4537[var25] = 1000000;
                class108.field1653[var25] = 0;
            }
            if (class68.field1063 == 1) {
                if ((class111.field1707[class10.field189][class124.field1917.field4949 >> 7][class124.field1917.field4991 >> 7] & 0x4) != 0) {
                    var24 = true;
                    class64.method475(0, class124.field1917.field4949 >> 7, arg4 + 60, class124.field1917.field4991 >> 7, class150.field2390);
                }
                if (class86.field1290 < 310) {
                    int var27 = class62.field987 >> 7;
                    int var28 = class70.field1097 >> 7;
                    int var29 = class124.field1917.field4949 >> 7;
                    int var30;
                    if (var27 >= var29) {
                        var30 = var27 - var29;
                    } else {
                        var30 = var29 - var27;
                    }
                    int var31 = class124.field1917.field4991 >> 7;
                    int var32;
                    if (var28 >= var31) {
                        var32 = var28 - var31;
                    } else {
                        var32 = var31 - var28;
                    }
                    if (var32 >= var30) {
                        int var33 = var30 * 65536 / var32;
                        int var34 = 32768;
                        while (var28 != var31) {
                            if (var28 < var31) {
                                var28++;
                            } else if (var31 < var28) {
                                var28--;
                            }
                            if ((class111.field1707[class10.field189][var27][var28] & 0x4) != 0) {
                                var24 = true;
                                class64.method475(1, var27, arg4 + 62, var28, class150.field2390);
                                break;
                            }
                            var34 += var33;
                            if (var34 >= 65536) {
                                if (var29 > var27) {
                                    var27++;
                                } else if (var27 > var29) {
                                    var27--;
                                }
                                var34 -= 65536;
                                if ((class111.field1707[class10.field189][var27][var28] & 0x4) != 0) {
                                    class64.method475(1, var27, 96, var28, class150.field2390);
                                    var24 = true;
                                    break;
                                }
                            }
                        }
                    } else {
                        int var35 = 32768;
                        int var36 = var32 * 65536 / var30;
                        while (var27 != var29) {
                            if (var29 > var27) {
                                var27++;
                            } else if (var29 < var27) {
                                var27--;
                            }
                            if ((class111.field1707[class10.field189][var27][var28] & 0x4) != 0) {
                                class64.method475(1, var27, 82, var28, class150.field2390);
                                var24 = true;
                                break;
                            }
                            var35 += var36;
                            if (var35 >= 65536) {
                                if (var28 < var31) {
                                    var28++;
                                } else if (var31 < var28) {
                                    var28--;
                                }
                                var35 -= 65536;
                                if ((class111.field1707[class10.field189][var27][var28] & 0x4) != 0) {
                                    var24 = true;
                                    class64.method475(1, var27, 114, var28, class150.field2390);
                                    break;
                                }
                            }
                        }
                    }
                }
            } else {
                int var26 = class207.method1304(class10.field189, (byte) 94, class62.field987, class70.field1097);
                if (var26 - class281.field4638 < 800 && (class111.field1707[class10.field189][class62.field987 >> 7][class70.field1097 >> 7] & 0x4) != 0) {
                    var24 = true;
                    class64.method475(1, class62.field987 >> 7, arg4 + 100, class70.field1097 >> 7, class150.field2390);
                }
            }
        }
        class121.method804(var8, var9, var7 + var8, var6 + var9);
        float var37 = (float) class86.field1290 * 0.17578125F;
        float var38 = (float) class140.field2251 * 0.17578125F;
        if (class68.field1063 == 3) {
            var37 = field1496 * 360.0F / 6.2831855F;
            var38 = class296.field4929 * 360.0F / 6.2831855F;
        }
        class264.method1709(var8, var9, var7, var6, var7 / 2 + var8, var9 - -(var6 / 2), var37, var38, class20.field272, class20.field272);
        int var39 = class129.field1984;
        int var40 = class65.field1024;
        if (var8 <= var39 && var7 + var8 > var39 && var9 <= var40 && var40 < var9 + var6) {
            class214.field3405 = 0;
            class46.field679 = true;
            int var41 = class120.field1892;
            int var42 = class85.field1276;
            int var43 = class124.field1904;
            class35.field482 = (class129.field1984 - var8) * (var42 - var41) / var7 + var41;
            int var44 = class118.field1782;
            class150.field2385 = (class65.field1024 - var9) * (var44 - var43) / var6 + var43;
        } else {
            class214.field3405 = 0;
            class46.field679 = false;
        }
        class91.method624(4096);
        class264.method1736();
        class264.method1726(true);
        class264.method1718(true);
        int var46;
        if (class214.field3407 == 10 || class214.field3407 == 20) {
            var46 = class187.method1180(class99.field1503, class164.field2592, class62.field987 >> 10, class70.field1097 >> 10, -5925);
        } else {
            var46 = class187.method1180(class99.field1503, class164.field2592, class124.field1917.field4963[0] >> 3, class124.field1917.field4973[0] >> 3, -5925);
        }
        class125.method837(class1.field15, !class129.field1979);
        class264.method1730(var46);
        class14.method118(13724, class62.field987, class281.field4638, class140.field2251, class86.field1290, class70.field1097);
        class264.field4319 = class1.field15;
        if (var24) {
            class129.method861(class62.field987, class281.field4638, class70.field1097, class86.field1290, class140.field2251, var19, class124.field1909, class240.field3864, class142.field2275, class10.field192, class108.field1653, class276.field4537, class10.field189 + 1, (byte) class132.field2012, class124.field1917.field4949 >> 7, class124.field1917.field4991 >> 7);
        } else {
            class129.method861(class62.field987, class281.field4638, class70.field1097, class86.field1290, class140.field2251, var19, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 0, (byte) 0, class124.field1917.field4949 >> 7, class124.field1917.field4991 >> 7);
        }
        class132.field2010 = true;
        class125.method830();
        class14.method118(arg4 ^ 0x359C, 0, 0, 0, 0, 0);
        class91.method624(arg4 ^ 0x1000);
        class146.method953();
        class193.method1241(var6, var8, class20.field272, true, var7, class20.field272, var9);
        class109.method704(class20.field272, var9, var6, var7, arg4 + 12, var8, class20.field272);
        ((class216) class284.field4692).method1367(class164.field2592, arg4 + 4746);
        class89.method604(var8, var7, var9, var6, 0);
        class140.field2251 = var15;
        class62.field987 = var12;
        class70.field1097 = var14;
        class281.field4638 = var13;
        class86.field1290 = var16;
        if (class13.field202 && class254.method1634(true, false, 0) == 0) {
            class13.field202 = false;
        }
        if (class13.field202) {
            class121.method811(var8, var9, var7, var6, 0);
            class142.method930(false, class244.field3961, arg4 + 250);
        }
        if (!arg2 && !class13.field202 && !class104.field1612 && var39 >= var8 && (var7 + var8) > var39 && var9 <= var40 && var40 < (var6 + var9)) {
            class124.method828(var40, var39, var6, var7, -65, var9, var8);
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 699)
    public class98() {
        this.method657((byte) -10);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V", line = 578)
    public static final void method659(byte arg0) {
        field1500++;
        class171.field2704.method486((byte) 93);
        class200.field3190.method486((byte) 93);
        if (arg0 <= 6) {
            field1501 = (boolean[]) null;
        }
        class174.field2765.method486((byte) 93);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V", line = 593)
    public static void method660(int arg0) {
        if (arg0 != 0) {
            method662(-72, 119);
        }
        field1501 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)I", line = 603)
    public static final int method661(int arg0, int arg1) {
        if (arg0 != 0) {
            method659((byte) 82);
        }
        field1493++;
        return arg1 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 619)
    public final void method294(int arg0) {
        field1498++;
        float var2 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        GL var4 = class264.field4313;
        boolean var5 = (arg0 & 0x80) != 0;
        float var6 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        if (var5) {
            this.field1494[0] = var6;
            this.field1494[2] = 0.0F;
            this.field1494[3] = 0.0F;
            this.field1494[1] = 0.0F;
        } else {
            this.field1494[1] = 0.0F;
            this.field1494[0] = 0.0F;
            this.field1494[3] = 0.0F;
            this.field1494[2] = var6;
        }
        var4.glActiveTexture(33985);
        var4.glMatrixMode(5888);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var4.glRotatef((float) class270.field4458 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var4.glRotatef((float) class297.field5008 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var4.glTranslatef((float) (-class254.field4089), (float) (-class81.field1233), (float) (-class164.field2589));
        var4.glTexGenfv(8192, 9474, this.field1494, 0);
        this.field1494[3] = (float) class264.field4319 * var2;
        this.field1494[0] = 0.0F;
        this.field1494[2] = 0.0F;
        this.field1494[1] = var6;
        var4.glTexGenfv(8193, 9474, this.field1494, 0);
        var4.glPopMatrix();
        if (class136.field2197) {
            this.field1494[2] = 0.0F;
            this.field1494[3] = (float) class264.field4319 * var3;
            this.field1494[1] = 0.0F;
            this.field1494[0] = 0.0F;
            var4.glTexGenfv(8194, 9473, this.field1494, 0);
        } else {
            int var7 = (int) ((float) class264.field4319 * var3 * 64.0F);
            var4.glBindTexture(3553, class136.field2199[var7 % 64]);
        }
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)I", line = 682)
    public static final int method662(int arg0, int arg1) {
        if (arg0 == -201505369) {
            field1491++;
            return arg1 >>> 7;
        } else {
            return -36;
        }
    }
}
