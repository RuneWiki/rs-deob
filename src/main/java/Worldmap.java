import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class Worldmap {

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "[I")
    private int[] field348 = new int[1500];

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "I")
    private int field349 = 0;

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "[I")
    public int[] field352 = new int[1500];

    @OriginalMember(owner = "mapview!pa", name = "g", descriptor = "[I")
    public int[] field353 = new int[1500];

    @OriginalMember(owner = "mapview!pa", name = "h", descriptor = "[I")
    private int[] field354 = new int[1500];

    @OriginalMember(owner = "mapview!pa", name = "j", descriptor = "[I")
    public int[] field356 = new int[1500];

    @OriginalMember(owner = "mapview!pa", name = "o", descriptor = "[I")
    private int[] field361 = new int[1500];

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "I")
    public static int field350 = 500;

    @OriginalMember(owner = "mapview!pa", name = "i", descriptor = "[I")
    public static int[] field355 = new int[128];

    @OriginalMember(owner = "mapview!pa", name = "k", descriptor = "Lv;")
    public static JagString field357 = class1.method2(255, "Hunter Training");

    @OriginalMember(owner = "mapview!pa", name = "p", descriptor = "I")
    public static volatile int field362;

    @OriginalMember(owner = "mapview!pa", name = "q", descriptor = "I")
    public static volatile int field363;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "Lqa;")
    public static JavaMouse field347;

    @OriginalMember(owner = "mapview!pa", name = "r", descriptor = "Lv;")
    public static JagString field364;

    @OriginalMember(owner = "mapview!pa", name = "n", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "mapview!pa", name = "m", descriptor = "Lq;")
    public static WorldmapOverlay field359;

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "Ljava/lang/String;")
    public static String field351;

    @OriginalMember(owner = "mapview!pa", name = "s", descriptor = "[I")
    public static int[] field365;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(I)V", line = 4)
    public static void method157(int arg0) {
        field351 = null;
        field355 = null;
        field364 = null;
        field365 = null;
        field359 = null;
        if (arg0 <= 78) {
            field351 = null;
        }
        field357 = null;
        field347 = null;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(I[B)V", line = 29)
    private final void method158(int arg0, byte[] arg1) {
        int var3 = 0;
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - ByteArrayPool.field179;
                int var5 = (arg1[var3++] & 0xFF) * 64 - HashTable.field67;
                if (var4 > 0 && var5 > 0 && var4 + 64 < JavaKeyboard.field14 && GameCanvas.field42 > var5 + 64) {
                    JagException.field107 = GameCanvas.field42 - var5 - 1 >> 6;
                    JavaMouse.field381 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                Timer.method192(var9, false, 3, var4 + var6, GameCanvas.field42 - var5 + -65 + -var7);
                                if (GameShell.field207[JagException.field107][JavaMouse.field381] == null) {
                                    GameShell.field207[JagException.field107][JavaMouse.field381] = new WorldmapOverlay();
                                    GameShell.field207[JagException.field107][JavaMouse.field381].field375 = new byte[4096];
                                }
                                GameShell.field207[JagException.field107][JavaMouse.field381].field375[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (GameShell.field207[JagException.field107][JavaMouse.field381] != null) {
                        GameShell.field207[JagException.field107][JavaMouse.field381].method175((byte) 3);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg1[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            int var12 = 108 / ((71 - arg0) / 37);
            return;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(BII)V", line = 108)
    private final void method159(byte arg0, int arg1, int arg2) {
        int var4 = arg2 >> 6;
        int var5 = arg1 >> 6;
        class18.field165[3] = new byte[var4][var5][];
        class4.field28 = new int[var4][var5][];
        class18.field165[1] = new byte[var4][var5][];
        class18.field165[4] = new byte[var4][var5][];
        GameShell.field207 = new WorldmapOverlay[var4][var5];
        class18.field165[0] = new byte[var4][var5][];
        class18.field165[2] = new byte[var4][var5][];
        JavaPixMap.field188 = new WorldmapOverlay[var4][var5];
        if (arg0 >= -118) {
            this.field349 = 13;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(I[B)V", line = 142)
    public static final void method160(int arg0, byte[] arg1) {
        Packet var2 = new Packet(arg1);
        var2.pos = arg1.length - 2;
        ByteArray.field127 = var2.g2((byte) 0);
        class1.field4 = new int[ByteArray.field127];
        BZip2State.field506 = new int[ByteArray.field127];
        JagException.field105 = new int[ByteArray.field127];
        JavaKeyboard.field19 = new int[ByteArray.field127];
        JavaMouse.field385 = new byte[ByteArray.field127][];
        var2.pos = arg1.length - ByteArray.field127 * 8 - 7;
        int var3 = 94 % ((-arg0 - 21) / 40);
        GameShell.field204 = var2.g2((byte) 0);
        StringNode.field88 = var2.g2((byte) 0);
        int var4 = (var2.g1(false) & 0xFF) + 1;
        for (int var5 = 0; var5 < ByteArray.field127; var5++) {
            BZip2State.field506[var5] = var2.g2((byte) 0);
        }
        for (int var6 = 0; var6 < ByteArray.field127; var6++) {
            JagException.field105[var6] = var2.g2((byte) 0);
        }
        for (int var7 = 0; var7 < ByteArray.field127; var7++) {
            JavaKeyboard.field19[var7] = var2.g2((byte) 0);
        }
        for (int var8 = 0; var8 < ByteArray.field127; var8++) {
            class1.field4[var8] = var2.g2((byte) 0);
        }
        var2.pos = arg1.length - ByteArray.field127 * 8 - (var4 + -1) * 3 - 7;
        field365 = new int[var4];
        for (int var9 = 1; var9 < var4; var9++) {
            field365[var9] = var2.g3(-5567);
            if (field365[var9] == 0) {
                field365[var9] = 1;
            }
        }
        var2.pos = 0;
        for (int var10 = 0; var10 < ByteArray.field127; var10++) {
            int var11 = JavaKeyboard.field19[var10];
            int var12 = class1.field4[var10];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            JavaMouse.field385[var10] = var14;
            int var15 = var2.g1(false);
            if (var15 == 0) {
                for (int var18 = 0; var18 < var13; var18++) {
                    var14[var18] = var2.g1b(63);
                }
            } else if (var15 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        var14[var11 * var17 + var16] = var2.g1b(63);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "(I[B)V", line = 261)
    private final void method161(int arg0, byte[] arg1) {
        int var3 = 0;
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - ByteArrayPool.field179;
                int var5 = (arg1[var3++] & 0xFF) * 64 - HashTable.field67;
                if (var4 > 0 && var5 > 0 && JavaKeyboard.field14 > var4 + 64 && var5 + 64 < GameCanvas.field42) {
                    JagException.field107 = GameCanvas.field42 - var5 - 1 >> 6;
                    JavaMouse.field381 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                Timer.method192(var9, false, 4, var4 + var6, -var7 - 1 + -var5 + GameCanvas.field42 - 64);
                                if (JavaPixMap.field188[JagException.field107][JavaMouse.field381] == null) {
                                    JavaPixMap.field188[JagException.field107][JavaMouse.field381] = new WorldmapOverlay();
                                    JavaPixMap.field188[JagException.field107][JavaMouse.field381].field375 = new byte[4096];
                                }
                                JavaPixMap.field188[JagException.field107][JavaMouse.field381].field375[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (JavaPixMap.field188[JagException.field107][JavaMouse.field381] != null) {
                        JavaPixMap.field188[JagException.field107][JavaMouse.field381].method175((byte) 3);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg1[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            if (arg0 != -18282) {
                this.field349 = 21;
            }
            return;
        }
    }

    static {
        ByteArrayPool.midCount = 0;
        field362 = 0;
        field363 = 0;
        field347 = new JavaMouse();
        field364 = class1.method2(255, "Candle Shop");
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(IIIIIIIII)V", line = 353)
    public final void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg5 <= 18) {
            return;
        }
        this.field349 = 0;
        int var10 = arg6 - arg1;
        int var11 = arg8 - arg7;
        int var12 = (arg4 - arg0 << 16) / var10;
        int var13 = (arg2 - arg3 << 16) / var11;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 + 1) * var12 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                JavaMouse.method176(-120, arg7, arg1 + var14);
                for (int var18 = 0; var18 < var11; var18++) {
                    int var19 = (var18 + 1) * var13 >> 16;
                    int var20 = var13 * var18 >> 16;
                    int var21 = var19 - var20;
                    if (var21 > 0) {
                        int var22 = HashTable.method30(0) & 0xFF;
                        if (var22 != 0) {
                            int var23;
                            if (var17 == 1) {
                                var23 = var15;
                            } else {
                                var23 = var16 - 1;
                            }
                            int var24;
                            if (var21 == 1) {
                                var24 = var20;
                            } else {
                                var24 = var19 - 1;
                            }
                            int var25 = 13421772;
                            if (var22 >= 5 && var22 <= 8 || var22 >= 13 && var22 <= 16 || var22 >= 21 && var22 <= 24 || var22 == 27 || var22 == 28) {
                                var22 -= 4;
                                var25 = 13369344;
                            }
                            if (var22 == 1) {
                                Draw2D.drawVerticalLine(var15, var20, var21, var25);
                            } else if (var22 == 2) {
                                Draw2D.drawHorizontalLine(var15, var20, var17, var25);
                            } else if (var22 == 3) {
                                Draw2D.drawVerticalLine(var23, var20, var21, var25);
                            } else if (var22 == 4) {
                                Draw2D.drawHorizontalLine(var15, var24, var17, var25);
                            } else if (var22 == 9) {
                                Draw2D.drawVerticalLine(var15, var20, var21, 16777215);
                                Draw2D.drawHorizontalLine(var15, var20, var17, var25);
                            } else if (var22 == 10) {
                                Draw2D.drawVerticalLine(var23, var20, var21, 16777215);
                                Draw2D.drawHorizontalLine(var15, var20, var17, var25);
                            } else if (var22 == 11) {
                                Draw2D.drawVerticalLine(var23, var20, var21, 16777215);
                                Draw2D.drawHorizontalLine(var15, var24, var17, var25);
                            } else if (var22 == 12) {
                                Draw2D.drawVerticalLine(var15, var20, var21, 16777215);
                                Draw2D.drawHorizontalLine(var15, var24, var17, var25);
                            } else if (var22 == 17) {
                                Draw2D.drawHorizontalLine(var15, var20, 1, var25);
                            } else if (var22 == 18) {
                                Draw2D.drawHorizontalLine(var23, var20, 1, var25);
                            } else if (var22 == 19) {
                                Draw2D.drawHorizontalLine(var23, var24, 1, var25);
                            } else if (var22 == 20) {
                                Draw2D.drawHorizontalLine(var15, var24, 1, var25);
                            } else if (var22 == 25) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    Draw2D.drawHorizontalLine(var15 + var27, -var27 + var24, 1, var25);
                                }
                            } else if (var22 == 26) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    Draw2D.drawHorizontalLine(var15 + var26, var20 + var26, 1, var25);
                                }
                            }
                        }
                        int var28 = Timer.method190(0) & 0xFF;
                        if (var28 != 0) {
                            this.field348[this.field349] = var28 - 1;
                            this.field361[this.field349] = var17 / 2 + var15;
                            this.field354[this.field349] = var21 / 2 + var20;
                            this.field349++;
                        }
                    }
                    PixMap.method119(5615);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "(I[B)V", line = 533)
    private final void method163(int arg0, byte[] arg1) {
        int var3 = 0;
        if (arg0 != -14437) {
            this.method166(-47, true, 45, -69, -108, 125, 9, -116, 77);
        }
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - ByteArrayPool.field179;
                int var5 = (arg1[var3++] & 0xFF) * 64 - HashTable.field67;
                if (var4 > 0 && var5 > 0 && JavaKeyboard.field14 > var4 + 64 && var5 + 64 < GameCanvas.field42) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = GameCanvas.field42 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg1[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    Timer.method192((byte) var9, false, 0, var4 + var6, -var5 + GameCanvas.field42 + -var8 + -64 + -1);
                                } else if (var9 < 160) {
                                    Timer.method192((byte) (var9 - 28), false, 1, var4 + var6, GameCanvas.field42 - (var5 - -64) - (1 - -var8));
                                } else {
                                    Timer.method192((byte) (var9 - 159), false, 2, var4 + var6, -var8 - (1 - (-var5 + GameCanvas.field42 - 64)));
                                    if (Packet.field344 >= 1500) {
                                        break;
                                    }
                                    this.field352[Packet.field344] = var6 + var4;
                                    this.field356[Packet.field344] = var7;
                                    this.field353[Packet.field344] = var9 - 160;
                                    Packet.field344++;
                                }
                            }
                            var7--;
                        }
                    }
                } else {
                    for (int var10 = 0; var10 < 64; var10++) {
                        byte var12;
                        for (int var11 = -64; var11 < 0; var11++) {
                            do {
                                var12 = arg1[var3++];
                            } while (var12 != 0);
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(BLj;)V", line = 637)
    public final void method164(byte arg0, Js5 arg1) {
        int var3 = -44 % ((arg0 + 33) / 42);
        Packet var4 = new Packet(arg1.method130(HashTable.field62, JagException.field104, (byte) -128));
        int var5 = var4.g2((byte) 0);
        int var6 = var4.g2((byte) 0);
        int var7 = var4.g2((byte) 0);
        int var8 = var4.g2((byte) 0);
        int var9 = var4.g2((byte) 0);
        int var10 = var4.g2((byte) 0);
        var4.gjstr((byte) -43);
        HashTable.field67 = var6 * 64;
        GameCanvas.field42 = (var8 - var6) * 64 + 64;
        JavaPixMap.field196 = HashTable.field67 + GameCanvas.field42 - var10 * 64;
        ByteArrayPool.field179 = var5 * 64;
        PixMap.field312 = var9 * 64 - ByteArrayPool.field179;
        JavaKeyboard.field14 = (var7 + 1 - var5) * 64;
        this.method159((byte) -127, JavaKeyboard.field14, GameCanvas.field42);
        Packet var11 = new Packet(arg1.method130(mapview.field291, JagException.field104, (byte) -128));
        int var12 = var11.g2((byte) 0);
        JagString.field476 = new int[var12 + 1];
        for (int var13 = 0; var13 < var12; var13++) {
            JagString.field476[var13 + 1] = var11.method155(65280);
        }
        int var14 = var11.g2((byte) 0);
        Packet.field340 = new int[var14 + 1];
        for (int var15 = 0; var15 < var14; var15++) {
            Packet.field340[var15 + 1] = var11.method155(65280);
        }
        byte[] var16 = arg1.method130(HashTable.field69, JagException.field104, (byte) -128);
        byte[][] var17 = new byte[JavaKeyboard.field14][GameCanvas.field42];
        this.method169(var16, 64, var17);
        byte[] var18 = arg1.method130(JagException.field106, JagException.field104, (byte) -128);
        this.method158(108, var18);
        byte[] var19 = arg1.method130(StringNode.field84, JagException.field104, (byte) -128);
        this.method161(-18282, var19);
        byte[] var20 = arg1.method130(Timer.field407, JagException.field104, (byte) -128);
        Packet.field344 = 0;
        this.method163(-14437, var20);
        this.method170(11441, var17);
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(II)I", line = 706)
    public static int method165(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(IZIIIIIII)V", line = 716)
    public final void method166(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg8 - arg0;
        int var11 = arg3 - arg2;
        int var12 = (arg5 - arg6 << 16) / var11;
        if (!arg1) {
            field365 = null;
        }
        int var13 = (arg4 - arg7 << 16) / var10;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var13 * var14 >> 16;
            int var16 = (var14 + 1) * var13 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg7 + var16;
                JavaMouse.method176(-127, arg2, arg0 + var14);
                int var19 = arg7 + var15;
                for (int var20 = 0; var20 < var11; var20++) {
                    int var21 = var12 * var20 >> 16;
                    int var22 = (var20 + 1) * var12 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg6 + var21;
                        int var25 = arg6 + var22;
                        int var26 = class1.method3((byte) -5);
                        int var27 = JagException.method47(58);
                        if (var26 == 0 && var27 == 0) {
                            Draw2D.fillRect(var19, var24, var18 - var19, -var24 + var25, IntHashTable.method28(-94));
                        } else {
                            byte var28 = DoublyLinkable.method20(26068);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                Draw2D.fillRect(var19, var24, var17, var23, var26);
                            } else {
                                this.method168(var29 >> 2, var28 & 0x3, Draw2D.width * var24 + var19, var17, IntHashTable.method28(-128), true, Draw2D.data, var26, var23, -113);
                            }
                            if (var27 > 0) {
                                byte var30 = JavaMouse.method179((byte) 126);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    Draw2D.fillRect(var19, var24, var17, var23, var27);
                                }
                                this.method168(var31 >> 2, var30 & 0x3, Draw2D.width * var24 + var19, var17, IntHashTable.method28(-124), var26 == 0, Draw2D.data, var27, var23, -113);
                            }
                        }
                    }
                    PixMap.method119(5615);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(IIIBIIIIIII)V", line = 816)
    public final void method167(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field349 == 0) {
            int var12 = arg0 - arg1;
            int var13 = arg8 - arg10;
            int var14 = (arg7 - arg9 << 16) / var12;
            int var15 = (arg5 - arg6 << 16) / var13;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = (var16 + 1) * var14 >> 16;
                int var18 = var14 * var16 >> 16;
                int var19 = var17 - var18;
                if (var19 > 0) {
                    JavaMouse.method176(-76, arg10, var16 + arg1);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = Timer.method190(0) & 0xFF;
                            if (var24 != 0) {
                                this.field348[this.field349] = var24 - 1;
                                this.field361[this.field349] = var19 / 2 + var18;
                                this.field354[this.field349] = var23 / 2 + var21;
                                this.field349++;
                            }
                        }
                        PixMap.method119(5615);
                    }
                }
            }
        }
        for (int var25 = 0; var25 < this.field349; var25++) {
            if (class1.field8[this.field348[var25]] != null) {
                class1.field8[this.field348[var25]].method10(this.field361[var25] - 7, this.field354[var25] + -7);
            }
        }
        if (arg3 <= 83) {
            this.method166(-23, true, -87, 105, 46, -98, -88, 86, 72);
        }
        if (arg2 > 0) {
            for (int var26 = 0; var26 < this.field349; var26++) {
                if (this.field348[var26] == arg4) {
                    class1.field8[this.field348[var26]].method10(this.field361[var26] - 7, this.field354[var26] + -7);
                    if (arg2 % 10 < 5) {
                        Draw2D.fillCircle(this.field361[var26], this.field354[var26], 15, 16776960, 128);
                        Draw2D.fillCircle(this.field361[var26], this.field354[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field349 = 0;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(IIIIIZ[IIII)V", line = 933)
    private final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, int arg9) {
        if (arg0 == 9) {
            arg0 = 1;
            arg1 = arg1 + 1 & 0x3;
        }
        if (arg0 == 10) {
            arg1 = arg1 + 3 & 0x3;
            arg0 = 1;
        }
        int var11 = Draw2D.width - arg3;
        if (arg0 == 11) {
            arg0 = 8;
            arg1 = arg1 + 3 & 0x3;
        }
        if (arg0 == 1) {
            if (arg1 == 0) {
                for (int var18 = 0; var18 < arg8; var18++) {
                    for (int var19 = 0; var19 < arg3; var19++) {
                        if (var18 >= var19) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg1 == 1) {
                for (int var12 = arg8 - 1; var12 >= 0; var12--) {
                    for (int var13 = 0; var13 < arg3; var13++) {
                        if (var12 >= var13) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg1 == 2) {
                for (int var14 = 0; var14 < arg8; var14++) {
                    for (int var15 = 0; var15 < arg3; var15++) {
                        if (var15 >= var14) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg1 == 3) {
                for (int var16 = arg8 - 1; var16 >= 0; var16--) {
                    for (int var17 = 0; var17 < arg3; var17++) {
                        if (var16 <= var17) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            }
        } else if (arg0 == 2) {
            if (arg1 == 0) {
                for (int var74 = arg8 - 1; var74 >= 0; var74--) {
                    for (int var75 = 0; var75 < arg3; var75++) {
                        if (var75 <= var74 >> 1) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg1 == 1) {
                for (int var72 = 0; var72 < arg8; var72++) {
                    for (int var73 = 0; var73 < arg3; var73++) {
                        if (var72 << 1 <= var73) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg1 == 2) {
                for (int var68 = 0; var68 < arg8; var68++) {
                    for (int var69 = arg3 - 1; var69 >= 0; var69--) {
                        if (var69 <= var68 >> 1) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg1 == 3) {
                for (int var70 = arg8 - 1; var70 >= 0; var70--) {
                    for (int var71 = arg3 - 1; var71 >= 0; var71--) {
                        if (var70 << 1 <= var71) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            }
        } else if (arg0 == 3) {
            if (arg1 == 0) {
                for (int var60 = arg8 - 1; var60 >= 0; var60--) {
                    for (int var61 = arg3 - 1; var61 >= 0; var61--) {
                        if (var61 <= var60 >> 1) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg1 == 1) {
                for (int var62 = arg8 - 1; var62 >= 0; var62--) {
                    for (int var63 = 0; var63 < arg3; var63++) {
                        if (var63 >= var62 << 1) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg1 == 2) {
                for (int var64 = 0; var64 < arg8; var64++) {
                    for (int var65 = 0; var65 < arg3; var65++) {
                        if (var65 <= var64 >> 1) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg1 == 3) {
                for (int var66 = 0; var66 < arg8; var66++) {
                    for (int var67 = arg3 - 1; var67 >= 0; var67--) {
                        if (var67 >= var66 << 1) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            }
        } else if (arg0 == 4) {
            if (arg1 == 0) {
                for (int var26 = arg8 - 1; var26 >= 0; var26--) {
                    for (int var27 = 0; var27 < arg3; var27++) {
                        if (var27 >= var26 >> 1) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg1 == 1) {
                for (int var24 = 0; var24 < arg8; var24++) {
                    for (int var25 = 0; var25 < arg3; var25++) {
                        if (var24 << 1 >= var25) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg1 == 2) {
                for (int var22 = 0; var22 < arg8; var22++) {
                    for (int var23 = arg3 - 1; var23 >= 0; var23--) {
                        if (var22 >> 1 <= var23) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            } else if (arg1 == 3) {
                for (int var20 = arg8 - 1; var20 >= 0; var20--) {
                    for (int var21 = arg3 - 1; var21 >= 0; var21--) {
                        if (var21 <= var20 << 1) {
                            arg6[arg2] = arg7;
                        } else if (arg5) {
                            arg6[arg2] = arg4;
                        }
                        arg2++;
                    }
                    arg2 += var11;
                }
            }
        } else if (arg0 != 5) {
            if (arg0 == 6) {
                if (arg1 == 0) {
                    for (int var36 = 0; var36 < arg8; var36++) {
                        for (int var37 = 0; var37 < arg3; var37++) {
                            if (var37 <= arg3 / 2) {
                                arg6[arg2] = arg7;
                            } else if (arg5) {
                                arg6[arg2] = arg4;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var38 = 0; var38 < arg8; var38++) {
                        for (int var39 = 0; var39 < arg3; var39++) {
                            if (arg8 / 2 >= var38) {
                                arg6[arg2] = arg7;
                            } else if (arg5) {
                                arg6[arg2] = arg4;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var40 = 0; var40 < arg8; var40++) {
                        for (int var41 = 0; var41 < arg3; var41++) {
                            if (var41 >= arg3 / 2) {
                                arg6[arg2] = arg7;
                            } else if (arg5) {
                                arg6[arg2] = arg4;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var42 = 0; var42 < arg8; var42++) {
                        for (int var43 = 0; var43 < arg3; var43++) {
                            if (arg8 / 2 <= var42) {
                                arg6[arg2] = arg7;
                            } else if (arg5) {
                                arg6[arg2] = arg4;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
            }
            if (arg0 == 7) {
                if (arg1 == 0) {
                    for (int var50 = 0; var50 < arg8; var50++) {
                        for (int var51 = 0; var51 < arg3; var51++) {
                            if (var50 - arg8 / 2 >= var51) {
                                arg6[arg2] = arg7;
                            } else if (arg5) {
                                arg6[arg2] = arg4;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var44 = arg8 - 1; var44 >= 0; var44--) {
                        for (int var45 = 0; var45 < arg3; var45++) {
                            if (var44 - arg8 / 2 >= var45) {
                                arg6[arg2] = arg7;
                            } else if (arg5) {
                                arg6[arg2] = arg4;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var48 = arg8 - 1; var48 >= 0; var48--) {
                        for (int var49 = arg3 - 1; var49 >= 0; var49--) {
                            if (var48 - arg8 / 2 >= var49) {
                                arg6[arg2] = arg7;
                            } else if (arg5) {
                                arg6[arg2] = arg4;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var46 = 0; var46 < arg8; var46++) {
                        for (int var47 = arg3 - 1; var47 >= 0; var47--) {
                            if (var47 <= var46 - arg8 / 2) {
                                arg6[arg2] = arg7;
                            } else if (arg5) {
                                arg6[arg2] = arg4;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
            }
            if (arg0 == 8) {
                if (arg1 == 0) {
                    for (int var58 = 0; var58 < arg8; var58++) {
                        for (int var59 = 0; var59 < arg3; var59++) {
                            if (var59 >= var58 - arg8 / 2) {
                                arg6[arg2] = arg7;
                            } else if (arg5) {
                                arg6[arg2] = arg4;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var56 = arg8 - 1; var56 >= 0; var56--) {
                        for (int var57 = 0; var57 < arg3; var57++) {
                            if (var57 >= var56 - arg8 / 2) {
                                arg6[arg2] = arg7;
                            } else if (arg5) {
                                arg6[arg2] = arg4;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var54 = arg8 - 1; var54 >= 0; var54--) {
                        for (int var55 = arg3 - 1; var55 >= 0; var55--) {
                            if (var54 - arg8 / 2 <= var55) {
                                arg6[arg2] = arg7;
                            } else if (arg5) {
                                arg6[arg2] = arg4;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var52 = 0; var52 < arg8; var52++) {
                        for (int var53 = arg3 - 1; var53 >= 0; var53--) {
                            if (var52 - arg8 / 2 <= var53) {
                                arg6[arg2] = arg7;
                            } else if (arg5) {
                                arg6[arg2] = arg4;
                            }
                            arg2++;
                        }
                        arg2 += var11;
                    }
                    return;
                }
            }
            if (arg9 > -112) {
                this.field361 = null;
            }
        } else if (arg1 == 0) {
            for (int var28 = arg8 - 1; var28 >= 0; var28--) {
                for (int var29 = arg3 - 1; var29 >= 0; var29--) {
                    if (var29 >= var28 >> 1) {
                        arg6[arg2] = arg7;
                    } else if (arg5) {
                        arg6[arg2] = arg4;
                    }
                    arg2++;
                }
                arg2 += var11;
            }
        } else if (arg1 == 1) {
            for (int var30 = arg8 - 1; var30 >= 0; var30--) {
                for (int var31 = 0; var31 < arg3; var31++) {
                    if (var30 << 1 >= var31) {
                        arg6[arg2] = arg7;
                    } else if (arg5) {
                        arg6[arg2] = arg4;
                    }
                    arg2++;
                }
                arg2 += var11;
            }
        } else if (arg1 == 2) {
            for (int var34 = 0; var34 < arg8; var34++) {
                for (int var35 = 0; var35 < arg3; var35++) {
                    if (var35 >= var34 >> 1) {
                        arg6[arg2] = arg7;
                    } else if (arg5) {
                        arg6[arg2] = arg4;
                    }
                    arg2++;
                }
                arg2 += var11;
            }
        } else if (arg1 == 3) {
            for (int var32 = 0; var32 < arg8; var32++) {
                for (int var33 = arg3 - 1; var33 >= 0; var33--) {
                    if (var32 << 1 >= var33) {
                        arg6[arg2] = arg7;
                    } else if (arg5) {
                        arg6[arg2] = arg4;
                    }
                    arg2++;
                }
                arg2 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "([BI[[B)V", line = 2061)
    private final void method169(byte[] arg0, int arg1, byte[][] arg2) {
        int var4 = 0;
        while (true) {
            while (arg0.length > var4) {
                int var5 = (arg0[var4++] & 0xFF) * 64 - ByteArrayPool.field179;
                int var6 = (arg0[var4++] & 0xFF) * 64 - HashTable.field67;
                if (var5 > 0 && var6 > 0 && var5 + 64 < JavaKeyboard.field14 && GameCanvas.field42 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg2[var5 + var7];
                        int var9 = GameCanvas.field42 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg0[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            if (arg1 != 64) {
                this.method172(0.7455680953797985D, -96, -0.20692329595346623D, -1.1913536755605199D);
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(I[[B)V", line = 2118)
    private final void method170(int arg0, byte[][] arg1) {
        int var3 = JavaKeyboard.field14;
        int var4 = GameCanvas.field42;
        if (arg0 != 11441) {
            this.method164((byte) -57, null);
        }
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg1[var7 + 5];
            byte[] var9 = arg1[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = JagString.field476[var9[var10] & 0xFF];
                int var12 = JagString.field476[var8[var10] & 0xFF];
                if (var12 <= 0 && PixMap.method120(var7 + 5, false, var10) > 0) {
                    var12 = 64;
                }
                if (var11 <= 0 && PixMap.method120(var7 - 5, false, var10) > 0) {
                    var11 = 64;
                }
                var5[var10] += var12 - var11;
            }
            if (var7 > 10 && var3 - 10 > var7) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var4 - 5; var16++) {
                    int var17 = var5[var16 + 5];
                    int var18 = var5[var16 - 5];
                    var14 += (var17 & 0x3FF) - (var18 & 0x3FF);
                    var15 += (var17 >> 20) - (var18 >> 20);
                    var13 += (var17 >> 10 & 0x3FF) - (var18 >> 10 & 0x3FF);
                    if (var14 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class4.field28[var20][var19] == null) {
                            class4.field28[var20][var19] = new int[4096];
                        }
                        if ((arg1[var7][var16] & 0xFF) <= 0) {
                            class4.field28[var20][var19][Timer.method189(63, var7) + (Timer.method189(63, var16) << 6)] = 0;
                        } else {
                            class4.field28[var20][var19][(Timer.method189(63, var16) << 6) + Timer.method189(var7, 63)] = this.method172((double) var14 / 8533.0D, -111, (double) var15 / 8533.0D, (double) var13 / 8533.0D);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(B[Lv;)V", line = 2218)
    public static final void method171(byte arg0, JagString[] arg1) {
        int var2 = -68 / ((arg0 + 49) / 46);
        class1.method4(arg1, -21657, 0, arg1.length);
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(DIDD)I", line = 2231)
    private final int method172(double arg0, int arg1, double arg2, double arg3) {
        double var8 = arg0;
        double var10 = arg0;
        if (arg1 >= -91) {
            ByteArrayPool.midCount = -70;
        }
        double var12 = arg0;
        if (arg3 != 0.0D) {
            double var16;
            if (arg0 < 0.5D) {
                var16 = (arg3 + 1.0D) * arg0;
            } else {
                var16 = arg0 + arg3 - arg0 * arg3;
            }
            double var18 = arg2 + 0.3333333333333333D;
            double var20 = arg0 * 2.0D - var16;
            if (var18 > 1.0D) {
                var18--;
            }
            if (arg2 * 6.0D < 1.0D) {
                var10 = (var16 - var20) * 6.0D * arg2 + var20;
            } else if (arg2 * 2.0D < 1.0D) {
                var10 = var16;
            } else if (arg2 * 3.0D < 2.0D) {
                var10 = (0.6666666666666666D - arg2) * (-var20 + var16) * 6.0D + var20;
            } else {
                var10 = var20;
            }
            if (var18 * 6.0D < 1.0D) {
                var8 = (var16 - var20) * 6.0D * var18 + var20;
            } else if (var18 * 2.0D < 1.0D) {
                var8 = var16;
            } else if (var18 * 3.0D < 2.0D) {
                var8 = (var16 - var20) * (0.6666666666666666D - var18) * 6.0D + var20;
            } else {
                var8 = var20;
            }
            double var22 = arg2 - 0.3333333333333333D;
            if (var22 < 0.0D) {
                var22++;
            }
            if (var22 * 6.0D < 1.0D) {
                var12 = (var16 - var20) * 6.0D * var22 + var20;
            } else if (var22 * 2.0D < 1.0D) {
                var12 = var16;
            } else if (var22 * 3.0D < 2.0D) {
                var12 = (var16 - var20) * (-var22 + 0.6666666666666666D) * 6.0D + var20;
            } else {
                var12 = var20;
            }
        }
        int var24 = (int) (var10 * 256.0D);
        int var25 = (int) (var8 * 256.0D);
        int var26 = (int) (var12 * 256.0D);
        return (var25 << 16) + ((var24 << 8) + var26);
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(IZIIDIIIII)V", line = 2330)
    public final void method173(int arg0, boolean arg1, int arg2, int arg3, double arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (!arg1) {
            this.field356 = null;
        }
        int var12 = arg5 - arg3;
        int var13 = (arg8 - arg0 << 16) / var12;
        int var14 = arg6 - arg7;
        int var15 = (arg9 - arg2 << 16) / var14;
        if (arg8 - arg0 < -arg3 + arg5) {
            return;
        }
        this.field349 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            int var17 = var13 * var16 >> 16;
            int var18 = (var16 + 1) * var13 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                JavaMouse.method176(-60, arg7, arg3 + var16);
                for (int var20 = 0; var20 < var14; var20++) {
                    int var21 = var15 * var20 >> 16;
                    int var22 = (var20 + 1) * var15 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = GameShell.method85((byte) 119) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                StringNode.field89[var24 - 1].method37(var17, var21, var19 * 2 + 1, var23 * 2 + 1);
                                if (!(arg4 < 4.0D) && arg4 > 4.2D && arg4 > 6.2D) {
                                }
                            } else {
                                StringNode.field89[var24 - 1].method37(var17 - var19 / 2, -(var23 / 2) + var21, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    PixMap.method119(5615);
                }
            }
        }
    }
}
