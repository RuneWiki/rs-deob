import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 extends class153 {

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "Ldf;")
    public class54 field195;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "Z")
    public static boolean field192 = false;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field196 = 3;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "[Lcj;")
    public static class115[] field193;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)V")
    public static void method111(boolean arg0) {
        if (arg0) {
            field196 = -33;
        }
        field193 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([BI)[B")
    public static final byte[] method112(byte[] arg0, int arg1) {
        field197++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        if (arg1 != -1) {
            field192 = true;
        }
        class171.method1182(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lie;B)V")
    public static final void method113(class32 arg0, byte arg1) {
        field194++;
        while (true) {
            while (arg0.field647 < arg0.field644.length) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg0.method316((byte) 126) == 1) {
                    var4 = arg0.method316((byte) -107);
                    var5 = arg0.method316((byte) 114);
                    var3 = true;
                }
                int var6 = arg0.method316((byte) -101);
                int var7 = arg0.method316((byte) 9);
                int var8 = var6 * 64 - class202.field3466;
                int var9 = class17.field296 + class115.field2017 - (var7 * 64) - 1;
                if (var8 >= 0 && var9 - 63 >= 0 && (var8 + 63) < class148.field2629 && var9 < class115.field2017) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || (var4 * 8) <= var12 && (var4 * 8 + 8) > var12 && var13 >= var5 * 8 && (var5 * 8 + 8) > var13) {
                                int var14 = arg0.method316((byte) -58);
                                if (var14 != 0) {
                                    if ((var14 & 0x1) == 1) {
                                        int var15 = arg0.method316((byte) 106);
                                        if (class21.field391[var10][var11] == null) {
                                            class21.field391[var10][var11] = new byte[4096];
                                        }
                                        class21.field391[var10][var11][(63 - var13 << 6) + var12] = (byte) var15;
                                    }
                                    if ((var14 & 0x2) == 2) {
                                        int var16 = arg0.method339(-16777216);
                                        if (class131.field2311[var10][var11] == null) {
                                            class131.field2311[var10][var11] = new short[4096];
                                        }
                                        class131.field2311[var10][var11][(63 - var13 << 6) + var12] = (short) var16;
                                    }
                                    if ((var14 & 0x4) == 4) {
                                        int var17 = ((arg0.method316((byte) 127) & 0xFF) << 16) + (arg0.method316((byte) -23) & 0xFF << 8) + (arg0.method316((byte) -57) & 0xFF);
                                        if (class261.field4470[var10][var11] == null) {
                                            class261.field4470[var10][var11] = new int[4096];
                                        }
                                        var17--;
                                        class28 var18 = class94.method700(-54, var17);
                                        if (var18.field537 != null) {
                                            var18 = var18.method262(true);
                                            if (var18 == null || var18.field553 == -1) {
                                                continue;
                                            }
                                        }
                                        class261.field4470[var10][var11][(63 - var13 << 6) + var12] = var18.field527 + 1;
                                        class96 var19 = new class96();
                                        var19.field1706 = var8;
                                        var19.field1713 = var18.field553;
                                        var19.field1704 = var9;
                                        class54.field1122.method675(var19, (byte) -114);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var20 = 0; var20 < (var3 ? 64 : 4096); var20++) {
                        int var21 = arg0.method316((byte) -50);
                        if (var21 != 0) {
                            if ((var21 & 0x1) == 1) {
                                arg0.field647++;
                            }
                            if ((var21 & 0x2) == 2) {
                                arg0.field647 += 2;
                            }
                            if ((var21 & 0x4) == 4) {
                                arg0.field647 += 3;
                            }
                        }
                    }
                }
            }
            int var2 = 31 % ((arg1 + 17) / 58);
            return;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(IB)I")
    public static final int method114(int arg0, byte arg1) {
        field191++;
        int var7 = arg0 - 1;
        if (arg1 > -92) {
            method111(true);
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Ldf;)V")
    public class10(class54 arg0) {
        this.field195 = arg0;
    }
}
