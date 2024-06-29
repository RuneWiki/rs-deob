import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class207 extends RuntimeException {

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3295;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Ljava/lang/String;")
    public String field3306;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field3297 = 0;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "Lck;")
    public static class119 field3301 = class298.method1987((byte) 109, "Ausw-=hlen");

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "[I")
    public static int[] field3294 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Lck;")
    public static class119 field3299 = class298.method1987((byte) 44, "gleiten:");

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field3302 = 2301979;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "Lgh;")
    public static class117 field3305;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "Ljb;")
    public static class289 field3303;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Lva;")
    public static class36 field3298;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V", line = 10)
    public static void method1302(byte arg0) {
        field3298 = null;
        if (arg0 > -127) {
            field3302 = 99;
        }
        field3294 = null;
        field3301 = null;
        field3299 = null;
        field3303 = null;
        field3305 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lfj;I)V", line = 37)
    public static final void method1303(class3 arg0, int arg1) {
        field3300++;
        byte[] var2 = new byte[24];
        if (class9.field175 != null) {
            try {
                int var3 = 0;
                class9.field175.method1118(0L, (byte) -1);
                class9.field175.method1108(var2, (byte) -108);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        if (arg1 < 100) {
            method1303((class3) null, 78);
        }
        arg0.method73(24, (byte) 125, 0, var2);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBII)I", line = 117)
    public static final int method1304(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 76) {
            method1304(21, (byte) 89, -17, -24);
        }
        int var4 = arg3 >> 7;
        field3293++;
        int var5 = arg2 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg0;
        int var7 = arg3 & 0x7F;
        int var8 = arg2 & 0x7F;
        if (arg0 < 3 && (class111.field1707[1][var5][var4] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var9 = (128 - var8) * class57.field926[var6][var5][var4] + (class57.field926[var6][var5 + 1][var4] * var8) >> 7;
        int var10 = (128 - var8) * class57.field926[var6][var5][var4 + 1] + class57.field926[var6][var5 + 1][var4 + 1] * var8 >> 7;
        return (128 - var7) * var9 + (var7 * var10) >> 7;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([BI)V", line = 158)
    public static final void method1305(byte[] arg0, int arg1) {
        if (arg1 != 61794726) {
            method1303((class3) null, 99);
        }
        int var2 = 0;
        field3296++;
        while (true) {
            while (arg0.length > var2) {
                int var3 = arg0[var2++] * 64 - class142.field2263;
                int var4 = arg0[var2++] * 64 - class221.field3552;
                if (var3 > 0 && var4 > 0 && var3 + 64 < class126.field1938 && var4 + 64 < class258.field4137) {
                    int var5 = var3 >> 6;
                    int var6 = class258.field4137 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg0[var2++];
                            if (var9 != 0) {
                                if ((var9 & 0x1) == 1) {
                                    byte var10 = arg0[var2++];
                                    if (class39.field570[var5][var6] == null) {
                                        class39.field570[var5][var6] = new byte[4096];
                                    }
                                    class39.field570[var5][var6][(-(var8 + 1) << 6) + var7] = (byte) var10;
                                }
                                if ((var9 & 0x2) == 2) {
                                    byte var11 = arg0[var2++];
                                    if (class229.field3702[var5][var6] == null) {
                                        class229.field3702[var5][var6] = new byte[4096];
                                    }
                                    class229.field3702[var5][var6][(-(var8 + 1) << 6) + var7] = (byte) (var11 - 28);
                                }
                                if ((var9 & 0x4) == 4) {
                                    var2 += 3;
                                    int var12 = (arg0[var2 - 1] & 0xFF) + ((arg0[var2 - 3] & 0xFF << 16) + (arg0[var2 - 2] & 0xFF << 8));
                                    if (class85.field1275[var5][var6] == null) {
                                        class85.field1275[var5][var6] = new int[4096];
                                    }
                                    var12--;
                                    class291 var13 = class291.method1939(0, var12);
                                    if (var13.field4817 != null) {
                                        var13 = var13.method1940(true);
                                        if (var13 == null || var13.field4794 == -1) {
                                            continue;
                                        }
                                    }
                                    class85.field1275[var5][var6][(-(var8 + 1) << 6) + var7] = var13.field4822 + 1;
                                    class224 var14 = new class224();
                                    var14.field3599 = var3;
                                    var14.field3594 = var13.field4794;
                                    var14.field3604 = class258.field4137 - var4;
                                    class249.field4017.method999(var14, (byte) -108);
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < 64; var15++) {
                        for (int var16 = -64; var16 < 0; var16++) {
                            byte var17 = arg0[var2++];
                            if (var17 != 0) {
                                if ((var17 & 0x1) == 1) {
                                    var2++;
                                }
                                if ((var17 & 0x2) == 2) {
                                    var2++;
                                }
                                if ((var17 & 0x4) == 4) {
                                    var2 += 3;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 291)
    public class207(Throwable arg0, String arg1) {
        this.field3295 = arg0;
        this.field3306 = arg1;
    }
}
