import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class139 extends class170 {

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
    private int field2375 = 2;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    private int field2374 = 5;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
    private int field2379 = 5;

    @OriginalMember(owner = "client!ab", name = "ib", descriptor = "[B")
    private byte[] field2388 = new byte[512];

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "I")
    private int field2382 = 1;

    @OriginalMember(owner = "client!ab", name = "kb", descriptor = "[S")
    private short[] field2390 = new short[512];

    @OriginalMember(owner = "client!ab", name = "gb", descriptor = "I")
    private int field2386 = 0;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    private int field2378 = 2048;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "[J")
    public static long[] field2372 = new long[32];

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public static int field2373 = 0;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "Lmh;")
    public static class128 field2380 = class22.method156(125, "Ablegen");

    @OriginalMember(owner = "client!ab", name = "lb", descriptor = "I")
    public static int field2391 = 255;

    @OriginalMember(owner = "client!ab", name = "mb", descriptor = "I")
    public static int field2392 = 0;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!ab", name = "jb", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ab", name = "hb", descriptor = "J")
    public static long field2387;

    @OriginalMember(owner = "client!ab", name = "eb", descriptor = "Lmd;")
    public static class241 field2384;

    @OriginalMember(owner = "client!ab", name = "fb", descriptor = "Lclient;")
    public static client field2385;

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "[Z")
    public static boolean[] field2383;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(B)V", line = 4)
    private final void method916(byte arg0) {
        if (arg0 != 15) {
            this.method916((byte) -103);
        }
        field2377++;
        Random var2 = new Random((long) this.field2386);
        this.field2390 = new short[512];
        if (this.field2378 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field2390[var3] = (short) class103.method638((byte) 15, this.field2378, var2);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V", line = 31)
    public final void method267(int arg0) {
        this.field2388 = class187.method1257((byte) -123, this.field2386);
        this.method916((byte) 15);
        field2376++;
        if (arg0 != -2718) {
            this.method63(-2, (class194) null, (byte) 22);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)[I", line = 47)
    public final int[] method69(byte arg0, int arg1) {
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int var4 = (class307.field5221[arg1] * this.field2374) + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class185.field3225; var7++) {
                class45.field904 = Integer.MAX_VALUE;
                class105.field1795 = Integer.MAX_VALUE;
                class86.field1498 = Integer.MAX_VALUE;
                class268.field4663 = Integer.MAX_VALUE;
                int var8 = class118.field2002[var7] * this.field2379 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field2388[(this.field2374 <= var11 ? var11 - this.field2374 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field2388[(this.field2379 > var13 ? var13 : var13 - this.field2379) + var12 & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = var8 - this.field2390[var14] - (var13 << 12);
                        int var16 = var4 - (var11 << 12) - this.field2390[var27];
                        int var17 = this.field2382;
                        int var20;
                        if (var17 == 1) {
                            var20 = var15 * var15 + (var16 * var16) >> 12;
                        } else if (var17 == 3) {
                            int var18 = var16 >= 0 ? var16 : -var16;
                            int var19 = var15 >= 0 ? var15 : -var15;
                            var20 = var18 < var19 ? var19 : var18;
                        } else if (var17 == 4) {
                            int var23 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var24 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var25 = var23 + var24;
                            var20 = var25 * var25 >> 12;
                        } else if (var17 == 5) {
                            int var21 = var15 * var15;
                            int var22 = var16 * var16;
                            var20 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var20 = (var15 >= 0 ? var15 : -var15) + (var16 >= 0 ? var16 : -var16);
                        } else {
                            var20 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class268.field4663 > var20) {
                            class45.field904 = class105.field1795;
                            class105.field1795 = class86.field1498;
                            class86.field1498 = class268.field4663;
                            class268.field4663 = var20;
                        } else if (var20 < class86.field1498) {
                            class45.field904 = class105.field1795;
                            class105.field1795 = class86.field1498;
                            class86.field1498 = var20;
                        } else if (class105.field1795 > var20) {
                            class45.field904 = class105.field1795;
                            class105.field1795 = var20;
                        } else if (var20 < class45.field904) {
                            class45.field904 = var20;
                        }
                    }
                }
                int var26 = this.field2375;
                if (var26 == 0) {
                    var3[var7] = class268.field4663;
                } else if (var26 == 1) {
                    var3[var7] = class86.field1498;
                } else if (var26 == 3) {
                    var3[var7] = class105.field1795;
                } else if (var26 == 4) {
                    var3[var7] = class45.field904;
                } else if (var26 == 2) {
                    var3[var7] = class86.field1498 - class268.field4663;
                }
            }
        }
        if (arg0 != 85) {
            field2384 = (class241) null;
        }
        field2371++;
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(B)V", line = 277)
    public static void method917(byte arg0) {
        field2385 = null;
        field2380 = null;
        field2383 = null;
        field2372 = null;
        if (arg0 > -121) {
            method917((byte) -64);
        }
        field2384 = null;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 306)
    public class139() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Llb;ILoe;)Lac;", line = 328)
    public static final class154 method918(class201 arg0, int arg1, class120 arg2) {
        if (arg1 != 255) {
            method918((class201) null, 90, (class120) null);
        }
        field2389++;
        long var3 = ((long) arg0.field3563 << 56) + ((long) arg0.field3558 << 32) - (long) (-(arg0.field3566 + 1 << 16) - arg0.field3561);
        class154 var5 = (class154) arg2.method728(false, var3);
        if (var5 == null) {
            var5 = new class154(arg0.field3566, (float) arg0.field3561, true, false, arg0.field3558);
            arg2.method730(var5, var3, (byte) 120);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILbg;B)V", line = 349)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field2381++;
        if (arg2 != 13) {
            this.method63(-73, (class194) null, (byte) 12);
        }
        if (arg0 == 0) {
            this.field2379 = this.field2374 = arg1.method1325(7627);
        } else if (arg0 == 1) {
            this.field2386 = arg1.method1325(arg2 + 7614);
        } else if (arg0 == 2) {
            this.field2378 = arg1.method1308(-60);
        } else if (arg0 == 3) {
            this.field2375 = arg1.method1325(arg2 ^ 0x1DC6);
        } else if (arg0 == 4) {
            this.field2382 = arg1.method1325(7627);
        } else if (arg0 == 5) {
            this.field2379 = arg1.method1325(7627);
        } else if (arg0 == 6) {
            this.field2374 = arg1.method1325(7627);
        }
    }
}
