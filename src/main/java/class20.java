import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class20 extends class283 {

    @OriginalMember(owner = "client!hm", name = "S", descriptor = "I")
    private int field269 = 2;

    @OriginalMember(owner = "client!hm", name = "U", descriptor = "I")
    private int field271 = 2048;

    @OriginalMember(owner = "client!hm", name = "Z", descriptor = "I")
    private int field276 = 0;

    @OriginalMember(owner = "client!hm", name = "W", descriptor = "I")
    private int field273 = 1;

    @OriginalMember(owner = "client!hm", name = "jb", descriptor = "I")
    private int field286 = 5;

    @OriginalMember(owner = "client!hm", name = "X", descriptor = "[B")
    private byte[] field274 = new byte[512];

    @OriginalMember(owner = "client!hm", name = "ib", descriptor = "I")
    private int field285 = 5;

    @OriginalMember(owner = "client!hm", name = "eb", descriptor = "[S")
    private short[] field281 = new short[512];

    @OriginalMember(owner = "client!hm", name = "T", descriptor = "Lna;")
    public static class26 field270 = class69.method505(" ", (byte) -124);

    @OriginalMember(owner = "client!hm", name = "R", descriptor = "Lna;")
    public static class26 field268 = class69.method505("<img=1>", (byte) -117);

    @OriginalMember(owner = "client!hm", name = "Y", descriptor = "Lna;")
    public static class26 field275 = class69.method505("Fps:", (byte) -126);

    @OriginalMember(owner = "client!hm", name = "ab", descriptor = "I")
    public static int field277 = 0;

    @OriginalMember(owner = "client!hm", name = "fb", descriptor = "[Lba;")
    public static class166[] field282 = new class166[0];

    @OriginalMember(owner = "client!hm", name = "lb", descriptor = "Lna;")
    public static class26 field288 = class69.method505("Moteur son pr-Bpar-B", (byte) -124);

    @OriginalMember(owner = "client!hm", name = "P", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!hm", name = "V", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!hm", name = "bb", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!hm", name = "cb", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!hm", name = "db", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!hm", name = "hb", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!hm", name = "kb", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!hm", name = "gb", descriptor = "J")
    public static long field283;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "(B)V", line = 4)
    private final void method129(byte arg0) {
        field278++;
        Random var2 = new Random((long) this.field276);
        this.field281 = new short[512];
        if (arg0 == 37 && this.field271 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field281[var3] = (short) class24.method151((byte) 23, this.field271, var2);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)V", line = 31)
    public final void method130(int arg0) {
        if (arg0 != 16251) {
            field282 = (class166[]) null;
        }
        field272++;
        this.field274 = class302.method2122(arg0 ^ 0xFF3F84, this.field276);
        this.method129((byte) 37);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lna;B)I", line = 43)
    public static final int method131(class26 arg0, byte arg1) {
        field267++;
        if (arg1 != 13) {
            method133(-29);
        }
        for (int var2 = 0; var2 < class181.field2839.length; var2++) {
            if (class181.field2839[var2].method162(arg1 + 40, arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IB)[I", line = 80)
    public final int[] method8(int arg0, byte arg1) {
        field284++;
        int var3 = 68 % ((30 - arg1) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int var5 = class59.field955[arg0] * this.field286 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            for (int var8 = 0; var8 < class101.field1632; var8++) {
                class264.field4313 = Integer.MAX_VALUE;
                class22.field321 = Integer.MAX_VALUE;
                class299.field5148 = Integer.MAX_VALUE;
                class132.field2012 = Integer.MAX_VALUE;
                int var9 = class13.field184[var8] * this.field285 + 2048;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                for (int var12 = var6 - 1; var12 <= var7; var12++) {
                    int var13 = this.field274[(this.field286 <= var12 ? var12 - this.field286 : var12) & 0xFF] & 0xFF;
                    for (int var14 = var10 - 1; var14 <= var11; var14++) {
                        int var15 = (this.field274[(this.field285 <= var14 ? var14 - this.field285 : var14) + var13 & 0xFF] & 0xFF) * 2;
                        int var10000 = -(var14 << 12);
                        int var28 = var15 + 1;
                        int var16 = var10000 - (this.field281[var15] - var9);
                        int var17 = var5 - ((var12 << 12) + this.field281[var28]);
                        int var18 = this.field273;
                        int var21;
                        if (var18 == 1) {
                            var21 = var16 * var16 + var17 * var17 >> 12;
                        } else if (var18 == 3) {
                            int var19 = var16 < 0 ? -var16 : var16;
                            int var20 = var17 >= 0 ? var17 : -var17;
                            var21 = var20 >= var19 ? var20 : var19;
                        } else if (var18 == 4) {
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                            int var24 = var22 + var23;
                            var21 = var24 * var24 >> 12;
                        } else if (var18 == 5) {
                            int var25 = var16 * var16;
                            int var26 = var17 * var17;
                            var21 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var25 + var26) / 1.6777216E7F))) * 4096.0D);
                        } else if (var18 == 2) {
                            var21 = (var16 >= 0 ? var16 : -var16) + (var17 < 0 ? -var17 : var17);
                        } else {
                            var21 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var21 < class132.field2012) {
                            class264.field4313 = class22.field321;
                            class22.field321 = class299.field5148;
                            class299.field5148 = class132.field2012;
                            class132.field2012 = var21;
                        } else if (var21 < class299.field5148) {
                            class264.field4313 = class22.field321;
                            class22.field321 = class299.field5148;
                            class299.field5148 = var21;
                        } else if (class22.field321 > var21) {
                            class264.field4313 = class22.field321;
                            class22.field321 = var21;
                        } else if (var21 < class264.field4313) {
                            class264.field4313 = var21;
                        }
                    }
                }
                int var27 = this.field269;
                if (var27 == 0) {
                    var4[var8] = class132.field2012;
                } else if (var27 == 1) {
                    var4[var8] = class299.field5148;
                } else if (var27 == 3) {
                    var4[var8] = class22.field321;
                } else if (var27 == 4) {
                    var4[var8] = class264.field4313;
                } else if (var27 == 2) {
                    var4[var8] = class299.field5148 - class132.field2012;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V", line = 415)
    public class20() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V", line = 294)
    public static final void method132(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= arg3) {
            for (int var5 = arg1; var5 < arg3; var5++) {
                class45.field710[var5][arg2] = arg4;
            }
        } else {
            for (int var6 = arg3; var6 < arg1; var6++) {
                class45.field710[var6][arg2] = arg4;
            }
        }
        field279++;
        if (arg0 != 2) {
            field277 = -110;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILwa;Z)V", line = 329)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        field266++;
        if (!arg2) {
            this.method1(-122, (class82) null, false);
        }
        if (arg0 == 0) {
            this.field285 = this.field286 = arg1.method642((byte) -57);
        } else if (arg0 == 1) {
            this.field276 = arg1.method642((byte) -57);
        } else if (arg0 == 2) {
            this.field271 = arg1.method576(1);
        } else if (arg0 == 3) {
            this.field269 = arg1.method642((byte) -55);
        } else if (arg0 == 4) {
            this.field273 = arg1.method642((byte) -124);
        } else if (arg0 == 5) {
            this.field285 = arg1.method642((byte) -51);
        } else if (arg0 == 6) {
            this.field286 = arg1.method642((byte) -64);
        }
    }

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "(I)V", line = 419)
    public static void method133(int arg0) {
        field282 = null;
        field270 = null;
        field288 = null;
        if (arg0 != 0) {
            method133(111);
        }
        field268 = null;
        field275 = null;
    }
}
