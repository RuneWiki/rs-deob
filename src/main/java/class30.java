import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class30 extends class199 {

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "[S")
    private short[] field346 = new short[512];

    @OriginalMember(owner = "client!rh", name = "fb", descriptor = "I")
    private int field349 = 2;

    @OriginalMember(owner = "client!rh", name = "eb", descriptor = "I")
    private int field348 = 2048;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
    private int field343 = 0;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
    private int field342 = 1;

    @OriginalMember(owner = "client!rh", name = "db", descriptor = "I")
    private int field347 = 5;

    @OriginalMember(owner = "client!rh", name = "gb", descriptor = "[B")
    private byte[] field350 = new byte[512];

    @OriginalMember(owner = "client!rh", name = "mb", descriptor = "I")
    private int field356 = 5;

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
    public static int field340 = 0;

    @OriginalMember(owner = "client!rh", name = "ib", descriptor = "Z")
    public static boolean field352 = false;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "Ljava/lang/String;")
    public static String field338 = "Checking for updates - ";

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "Lcc;")
    public static class327 field344 = new class327(2);

    @OriginalMember(owner = "client!rh", name = "kb", descriptor = "I")
    public static int field354 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!rh", name = "jb", descriptor = "[I")
    public static int[] field353 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!rh", name = "lb", descriptor = "I")
    public static volatile int field355 = -1;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!rh", name = "hb", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!rh", name = "nb", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!rh", name = "ob", descriptor = "Lma;")
    public static class145 field358;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(B)V", line = 5)
    public final void method189(byte arg0) {
        this.field350 = class94.method676(this.field343, -29382);
        int var2 = -127 / ((arg0 - 36) / 44);
        field337++;
        this.method191(97);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I", line = 21)
    public final int[] method190(int arg0, int arg1) {
        if (arg0 != -1735) {
            return (int[]) null;
        }
        field336++;
        int[] var3 = this.field2802.method2502(arg1, 103);
        if (this.field2802.field5637) {
            int var4 = class274.field3919[arg1] * this.field356 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class95.field1235; var7++) {
                class160.field2291 = Integer.MAX_VALUE;
                class55.field716 = Integer.MAX_VALUE;
                class351.field5482 = Integer.MAX_VALUE;
                class114.field1477 = Integer.MAX_VALUE;
                int var8 = (class82.field1062[var7] * this.field347) + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field350[(var11 >= this.field356 ? var11 - this.field356 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field350[var12 + (this.field347 <= var13 ? var13 - this.field347 : var13) & 0xFF] & 0xFF) * 2;
                        int var10000 = var8 - (var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 - this.field346[var14];
                        int var16 = var4 - (var11 << 12) - this.field346[var27];
                        int var17 = this.field342;
                        int var21;
                        if (var17 == 1) {
                            var21 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var15 >= 0 ? var15 : -var15;
                            int var25 = var16 < 0 ? -var16 : var16;
                            var21 = var25 >= var24 ? var25 : var24;
                        } else if (var17 == 4) {
                            int var18 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var19 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var20 = var18 + var19;
                            var21 = var20 * var20 >> 12;
                        } else if (var17 == 5) {
                            int var22 = var15 * var15;
                            int var23 = var16 * var16;
                            var21 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var22 + var23) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var21 = (var15 < 0 ? -var15 : var15) + (var16 >= 0 ? var16 : -var16);
                        } else {
                            var21 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var21 < class114.field1477) {
                            class160.field2291 = class55.field716;
                            class55.field716 = class351.field5482;
                            class351.field5482 = class114.field1477;
                            class114.field1477 = var21;
                        } else if (var21 < class351.field5482) {
                            class160.field2291 = class55.field716;
                            class55.field716 = class351.field5482;
                            class351.field5482 = var21;
                        } else if (var21 < class55.field716) {
                            class160.field2291 = class55.field716;
                            class55.field716 = var21;
                        } else if (class160.field2291 > var21) {
                            class160.field2291 = var21;
                        }
                    }
                }
                int var26 = this.field349;
                if (var26 == 0) {
                    var3[var7] = class114.field1477;
                } else if (var26 == 1) {
                    var3[var7] = class351.field5482;
                } else if (var26 == 3) {
                    var3[var7] = class55.field716;
                } else if (var26 == 4) {
                    var3[var7] = class160.field2291;
                } else if (var26 == 2) {
                    var3[var7] = class351.field5482 - class114.field1477;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V", line = 235)
    public class30() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V", line = 241)
    private final void method191(int arg0) {
        if (arg0 < 17) {
            return;
        }
        field339++;
        Random var2 = new Random((long) this.field343);
        this.field346 = new short[512];
        if (this.field348 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field346[var3] = (short) class294.method2011(var2, this.field348, 117);
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V", line = 277)
    public static final void method192(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 91 / ((arg2 + 69) / 37);
        class42 var5 = class166.method1242(9, arg1, -1249071392);
        field345++;
        var5.method307((byte) -115);
        var5.field536 = arg0;
        var5.field523 = arg3;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLfd;I)V", line = 310)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field347 = this.field356 = arg1.method2096((byte) -122);
        } else if (arg2 == 1) {
            this.field343 = arg1.method2096((byte) -122);
        } else if (arg2 == 2) {
            this.field348 = arg1.method2083((byte) -21);
        } else if (arg2 == 3) {
            this.field349 = arg1.method2096((byte) -122);
        } else if (arg2 == 4) {
            this.field342 = arg1.method2096((byte) -122);
        } else if (arg2 == 5) {
            this.field347 = arg1.method2096((byte) -122);
        } else if (arg2 == 6) {
            this.field356 = arg1.method2096((byte) -122);
        }
        field351++;
        if (arg0 != -43) {
            this.method189((byte) -115);
        }
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)V", line = 381)
    public static void method194(int arg0) {
        field344 = null;
        field358 = null;
        field338 = null;
        field353 = null;
        if (arg0 <= 39) {
            field338 = (String) null;
        }
    }
}
