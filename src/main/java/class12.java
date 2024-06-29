import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public abstract class class12 {

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    private int field78 = 0;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "[S")
    private short[] field83 = new short[512];

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    private int field82 = 4;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    private int field84 = 4;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    private int field88 = 4;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public int field89 = 4;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field90 = 0;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "[S")
    private short[] field85;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)V")
    public abstract void method59(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
    private final void method60(boolean arg0) {
        this.field85 = new short[this.field89];
        field80++;
        for (int var2 = 0; var2 < this.field89; var2++) {
            this.field85[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0) {
            this.method59(39, -87, 83);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public abstract void method61(int arg0);

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(Z)V")
    public abstract void method62(boolean arg0);

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([[[Lwr;IIIZI)Z")
    public static final boolean method63(class52[][][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var6 = 78 / ((arg3 + 48) / 47);
        field81++;
        byte var7 = arg4 ? 1 : (byte) (class392.field5407 & 0xFF);
        if (class486.field6878[class387.field5306][arg2][arg1] == var7) {
            return false;
        } else if ((class372.field5120[class387.field5306][arg2][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var8 = 0;
            class131.field1804[var8] = arg2;
            int var9 = 0;
            int var36 = var8 + 1;
            class445.field6346[var8] = arg1;
            class486.field6878[class387.field5306][arg2][arg1] = var7;
            while (var36 != var9) {
                int var10 = class131.field1804[var9] & 0xFFFF;
                int var11 = (class131.field1804[var9] & 0xFF3938) >> 16;
                int var12 = class131.field1804[var9] >> 24 & 0xFF;
                int var13 = class445.field6346[var9] & 0xFFFF;
                int var14 = (class445.field6346[var9] & 0xFFF06A) >> 16;
                var9 = var9 + 1 & 0xFFF;
                boolean var15 = false;
                if ((class372.field5120[class387.field5306][var10][var13] & 0x4) == 0) {
                    var15 = true;
                }
                boolean var16 = false;
                label233: for (int var17 = class387.field5306 + 1; var17 <= 3; var17++) {
                    if ((class372.field5120[var17][var10][var13] & 0x8) == 0) {
                        if (var15 && arg0[var17][var10][var13] != null) {
                            if (arg0[var17][var10][var13].field772 != null) {
                                int var21 = class241.method1675(127, var11);
                                if (arg0[var17][var10][var13].field772.field5824 == var21 || arg0[var17][var10][var13].field752 != null && arg0[var17][var10][var13].field752.field5824 == var21) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var22 = class241.method1675(125, var12);
                                    if (arg0[var17][var10][var13].field772.field5824 == var22 || arg0[var17][var10][var13].field752 != null && arg0[var17][var10][var13].field752.field5824 == var22) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var23 = class241.method1675(123, var14);
                                    if (arg0[var17][var10][var13].field772.field5824 == var23 || arg0[var17][var10][var13].field752 != null && arg0[var17][var10][var13].field752.field5824 == var23) {
                                        continue;
                                    }
                                }
                            }
                            class52 var24 = arg0[var17][var10][var13];
                            if (var24.field763 != null) {
                                for (class131 var25 = var24.field763; var25 != null; var25 = var25.field1796) {
                                    class325 var26 = var25.field1803;
                                    if (var26 instanceof class210) {
                                        class210 var27 = (class210) var26;
                                        int var28 = var27.method83((byte) 72);
                                        if (var28 == 21) {
                                            var28 = 19;
                                        }
                                        int var29 = var27.method71((byte) 99);
                                        int var30 = var29 << 6 | var28;
                                        if (var11 == var30 || var12 != 0 && var12 == var30 || var14 != 0 && var14 == var30) {
                                            continue label233;
                                        }
                                    }
                                }
                            }
                        }
                        class52 var31 = arg0[var17][var10][var13];
                        if (var31 != null && var31.field763 != null) {
                            for (class131 var32 = var31.field763; var32 != null; var32 = var32.field1796) {
                                class325 var33 = var32.field1803;
                                if (var33.field4535 != var33.field4526 || var33.field4539 != var33.field4534) {
                                    for (int var34 = var33.field4535; var34 <= var33.field4526; var34++) {
                                        for (int var35 = var33.field4539; var35 <= var33.field4534; var35++) {
                                            class486.field6878[var17][var34][var35] = var7;
                                        }
                                    }
                                }
                            }
                        }
                        class486.field6878[var17][var10][var13] = var7;
                        var16 = true;
                    }
                }
                if (var16) {
                    int var18 = class340.field4692[class387.field5306 + 1].method591(var10, var13);
                    if (var18 > class114.field1601[arg5]) {
                        class114.field1601[arg5] = var18;
                    }
                    int var19 = var10 << 7;
                    if (class363.field4999[arg5] > var19) {
                        class363.field4999[arg5] = var19;
                    } else if (class176.field2670[arg5] < var19) {
                        class176.field2670[arg5] = var19;
                    }
                    int var20 = var13 << 7;
                    if (var20 < class173.field2641[arg5]) {
                        class173.field2641[arg5] = var20;
                    } else if (class239.field3504[arg5] < var20) {
                        class239.field3504[arg5] = var20;
                    }
                }
                if (!var15) {
                    if (var10 >= 1 && class486.field6878[class387.field5306][var10 - 1][var13] != var7) {
                        class131.field1804[var36] = class142.method1024(class142.method1024(1179648, var10 - 1), -754974720);
                        class445.field6346[var36] = class142.method1024(var13, 1245184);
                        var36 = var36 + 1 & 0xFFF;
                        class486.field6878[class387.field5306][var10 - 1][var13] = var7;
                    }
                    var13++;
                    if (var13 < class68.field998) {
                        if ((var10 - 1) >= 0 && class486.field6878[class387.field5306][var10 - 1][var13] != var7 && (class372.field5120[class387.field5306][var10][var13] & 0x4) == 0 && (class372.field5120[class387.field5306][var10 - 1][var13 - 1] & 0x4) == 0) {
                            class131.field1804[var36] = class142.method1024(1375731712, class142.method1024(1179648, var10 - 1));
                            class445.field6346[var36] = class142.method1024(var13, 1245184);
                            var36 = var36 + 1 & 0xFFF;
                            class486.field6878[class387.field5306][var10 - 1][var13] = var7;
                        }
                        if (class486.field6878[class387.field5306][var10][var13] != var7) {
                            class131.field1804[var36] = class142.method1024(class142.method1024(var10, 5373952), 318767104);
                            class445.field6346[var36] = class142.method1024(5439488, var13);
                            class486.field6878[class387.field5306][var10][var13] = var7;
                            var36 = var36 + 1 & 0xFFF;
                        }
                        if (var10 + 1 < class36.field388 && class486.field6878[class387.field5306][var10 + 1][var13] != var7 && (class372.field5120[class387.field5306][var10][var13] & 0x4) == 0 && (class372.field5120[class387.field5306][var10 + 1][var13 - 1] & 0x4) == 0) {
                            class131.field1804[var36] = class142.method1024(class142.method1024(5373952, var10 + 1), -1845493760);
                            class445.field6346[var36] = class142.method1024(var13, 5439488);
                            class486.field6878[class387.field5306][var10 + 1][var13] = var7;
                            var36 = var36 + 1 & 0xFFF;
                        }
                    }
                    var13--;
                    if ((var10 + 1) < class36.field388 && class486.field6878[class387.field5306][var10 + 1][var13] != var7) {
                        class131.field1804[var36] = class142.method1024(class142.method1024(9568256, var10 + 1), 1392508928);
                        class445.field6346[var36] = class142.method1024(var13, 9633792);
                        class486.field6878[class387.field5306][var10 + 1][var13] = var7;
                        var36 = var36 + 1 & 0xFFF;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if (var10 - 1 >= 0 && class486.field6878[class387.field5306][var10 - 1][var13] != var7 && (class372.field5120[class387.field5306][var10][var13] & 0x4) == 0 && (class372.field5120[class387.field5306][var10 - 1][var13 + 1] & 0x4) == 0) {
                            class131.field1804[var36] = class142.method1024(301989888, class142.method1024(13762560, var10 - 1));
                            class445.field6346[var36] = class142.method1024(13828096, var13);
                            var36 = var36 + 1 & 0xFFF;
                            class486.field6878[class387.field5306][var10 - 1][var13] = var7;
                        }
                        if (class486.field6878[class387.field5306][var10][var13] != var7) {
                            class131.field1804[var36] = class142.method1024(class142.method1024(13762560, var10), -1828716544);
                            class445.field6346[var36] = class142.method1024(var13, 13828096);
                            var36 = var36 + 1 & 0xFFF;
                            class486.field6878[class387.field5306][var10][var13] = var7;
                        }
                        if ((var10 + 1) < class36.field388 && class486.field6878[class387.field5306][var10 + 1][var13] != var7 && (class372.field5120[class387.field5306][var10][var13] & 0x4) == 0 && (class372.field5120[class387.field5306][var10 + 1][var13 + 1] & 0x4) == 0) {
                            class131.field1804[var36] = class142.method1024(-771751936, class142.method1024(var10 + 1, 9568256));
                            class445.field6346[var36] = class142.method1024(9633792, var13);
                            class486.field6878[class387.field5306][var10 + 1][var13] = var7;
                            var36 = var36 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class114.field1601[arg5] != -1000000) {
                class114.field1601[arg5] += 10;
                class363.field4999[arg5] -= 50;
                class176.field2670[arg5] += 50;
                class239.field3504[arg5] += 50;
                class173.field2641[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
    private final void method64(int arg0) {
        field91++;
        Random var2 = new Random((long) this.field78);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field83[var3] = (short) var3;
        }
        if (arg0 <= 21) {
            field90 = -81;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class424.method2524(var2, var5, (byte) -76);
            short var7 = this.field83[var6];
            this.field83[var6] = this.field83[var5];
            this.field83[var5] = this.field83[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIII)V")
    public class12(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field78 = arg0;
        this.field82 = arg4;
        this.field89 = arg1;
        this.field88 = arg2;
        this.field84 = arg3;
        this.method60(false);
        this.method64(97);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIB)V")
    public final void method65(int arg0, int arg1, int arg2, byte arg3) {
        field86++;
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg0];
        if (arg3 != 89) {
            return;
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5[var8] = (var8 << 12) / arg2;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var7[var10] = (var10 << 12) / arg0;
        }
        this.method62(false);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field89; var14++) {
                        int var15 = this.field85[var14] << 12;
                        int var16 = var7[var11] * var15 >> 12;
                        int var17 = this.field82 * var15 >> 12;
                        int var18 = this.field88 * var15 >> 12;
                        int var19 = this.field84 * var15 >> 12;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field82 * var16;
                        int var23 = this.field88 * var20;
                        int var24 = this.field84 * var21;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var22 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var24 & 0xFFF;
                        int var34;
                        if (var19 <= var29) {
                            var34 = 0;
                        } else {
                            var34 = var29 & 0xFF;
                        }
                        int var35;
                        if (var32 < var17) {
                            var35 = var32 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36 = var23 & 0xFFF;
                        int var37;
                        if (var18 > var26) {
                            var37 = var26 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var31 & 0xFF;
                        int var39 = var22 & 0xFFF;
                        int var40 = class462.field6528[var39];
                        short var41 = this.field83[var38];
                        int var42 = var36 - 4096;
                        int var43 = class462.field6528[var33];
                        int var44 = var39 - 4096;
                        int var45 = class462.field6528[var36];
                        short var46 = this.field83[var35];
                        int var47 = var33 - 4096;
                        short var48 = this.field83[var30 + var46];
                        short var49 = this.field83[var34 + var41];
                        short var50 = this.field83[var30 + var41];
                        short var51 = this.field83[var34 + var46];
                        int var52 = class124.method944(32, var39, var33, var36, this.field83[var28 + var50]);
                        int var53 = class124.method944(arg3 - 57, var39, var33, var42, this.field83[var37 + var50]);
                        int var54 = ((var53 - var52) * var45 >> 12) + var52;
                        int var55 = class124.method944(32, var39, var47, var36, this.field83[var28 + var49]);
                        int var56 = class124.method944(32, var39, var47, var42, this.field83[var37 + var49]);
                        int var57 = var55 + ((var56 - var55) * var45 >> 12);
                        int var58 = class124.method944(32, var44, var33, var36, this.field83[var28 + var48]);
                        int var59 = ((var57 - var54) * var43 >> 12) + var54;
                        int var60 = class124.method944(32, var44, var33, var42, this.field83[var37 + var48]);
                        int var61 = ((var60 - var58) * var45 >> 12) + var58;
                        int var62 = class124.method944(32, var44, var47, var36, this.field83[var28 + var51]);
                        int var63 = class124.method944(32, var44, var47, var42, this.field83[var37 + var51]);
                        int var64 = ((var63 - var62) * var45 >> 12) + var62;
                        int var65 = ((var64 - var61) * var43 >> 12) + var61;
                        this.method59(var14, 25, var59 + ((var65 - var59) * var40 >> 12));
                    }
                    this.method61(4);
                }
            }
        }
    }
}
