import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class58 extends class210 {

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "[B")
    public byte[] field1211;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "Ljd;")
    public static class92 field1214 = class202.method1325((byte) 90, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "Lud;")
    public static class192 field1220;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V")
    public static final void method354(int arg0, byte arg1) {
        int[] var2 = class139.field2784.field3281;
        field1212++;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 1;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class59.field1239[arg0][var21][var5] & 0x18) == 0) {
                    class75.method521(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class59.field1239[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class75.method521(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class139.field2784.method1089();
        int var6 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var7 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 238 + -10 << 8) + 238 - 10;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class59.field1239[arg0][var19][var8] & 0x18) == 0) {
                    class30.method185(arg0, 122, var8, var19, var6, var7);
                }
                if (arg0 < 3 && (class59.field1239[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class30.method185(arg0 + 1, 121, var8, var19, var6, var7);
                }
            }
        }
        if (arg1 < 15) {
            method358(null, null, (byte) 94);
        }
        class91.field1803 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                long var11 = class87.method586(class81.field1639, var9, var10);
                if (var11 != 0L) {
                    int var13 = class126.method846(0, (int) (var11 >>> 32) & Integer.MAX_VALUE).field4182;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class32.field729[class81.field1639].field2373;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 - 3 && (var16[var14 - 1][var15] & 0x12C0108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var9 + 3 > var14 && (var16[var14 + 1][var15] & 0x12C0180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var10 - 3 < var15 && (var16[var14][var15 - 1] & 0x12C0102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (var16[var14][var15 + 1] & 0x12C0120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class100.field2065[class91.field1803] = class70.field1442[var13];
                        class156.field3095[class91.field1803] = var14;
                        class212.field4099[class91.field1803] = var15;
                        class91.field1803++;
                    }
                }
            }
        }
        class77.field1605.method563(2);
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
    public static void method355(int arg0) {
        field1214 = null;
        if (arg0 == 103) {
            field1220 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILa;)Z")
    public static final boolean method356(int arg0, class1 arg1) {
        field1218++;
        if (arg1.field86 == null) {
            return false;
        } else if (arg0 >= -119) {
            return false;
        } else {
            for (int var2 = 0; var2 < arg1.field86.length; var2++) {
                int var3 = class99.method688(arg1, var2, -1501238288);
                int var4 = arg1.field113[var2];
                if (arg1.field86[var2] == 2) {
                    if (var4 <= var3) {
                        return false;
                    }
                } else if (arg1.field86[var2] == 3) {
                    if (var3 <= var4) {
                        return false;
                    }
                } else if (arg1.field86[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IJ)V")
    public static final void method357(int arg0, long arg1) {
        field1215++;
        if (arg0 != -24534) {
            field1219 = 91;
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class140.method931((byte) -25, arg1 - 1L);
            class140.method931((byte) -25, 1L);
        } else {
            class140.method931((byte) -25, arg1);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lnh;Lnh;B)V")
    public static final void method358(class133 arg0, class133 arg1, byte arg2) {
        field1213++;
        class120.field2422 = arg1;
        int var3 = -2 / ((-arg2 - 50) / 41);
        class168.field3284 = arg0;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "([B)V")
    public class58(byte[] arg0) {
        this.field1211 = arg0;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBIII)V")
    public static final void method359(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 26) {
            field1219 = -34;
        }
        field1221++;
    }
}
