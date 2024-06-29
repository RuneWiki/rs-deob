import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class507 {

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Z")
    private boolean field7330 = false;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    private int field7337 = 32;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "J")
    private long field7334 = class165.method1188((byte) 26);

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    private int field7342 = 0;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    private int field7341 = 0;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "[Lpo;")
    private class398[] field7339 = new class398[8];

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "J")
    private long field7347 = 0L;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    private int field7349 = 0;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Z")
    private boolean field7343 = true;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "J")
    private long field7348 = 0L;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    private int field7344 = 0;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "[Lpo;")
    private class398[] field7350 = new class398[8];

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public int field7340;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public int field7345;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    private int field7346;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Lpo;")
    private class398 field7329;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "[I")
    public int[] field7328;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([II)V", line = 4)
    private final void method2953(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class385.field5498) {
            var3 = arg1 << 1;
        }
        class282.method1823(arg0, 0, var3);
        this.field7344 -= arg1;
        if (this.field7329 != null && this.field7344 <= 0) {
            this.field7344 += class120.field1877 >> 4;
            class419.method2499((byte) -46, this.field7329);
            this.method2960(this.field7329, this.field7329.method702(), (byte) -19);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class398 var10 = null;
                        class398 var11 = this.field7350[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class223 var12 = var11.field5652;
                                if (var12 == null || var12.field3397 <= var8) {
                                    var11.field5651 = true;
                                    int var13 = var11.method692();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3397 += var13;
                                    }
                                    if (var4 >= this.field7337) {
                                        break label107;
                                    }
                                    class398 var14 = var11.method693();
                                    if (var14 != null) {
                                        int var15 = var11.field5654;
                                        while (var14 != null) {
                                            this.method2960(var14, var15 * var14.method702() >> 8, (byte) -19);
                                            var14 = var11.method700();
                                        }
                                    }
                                    class398 var16 = var11.field5653;
                                    var11.field5653 = null;
                                    if (var10 == null) {
                                        this.field7350[var7] = var16;
                                    } else {
                                        var10.field5653 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field7339[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field5653;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class398 var18 = this.field7350[var17];
                this.field7350[var17] = this.field7339[var17] = null;
                while (var18 != null) {
                    class398 var19 = var18.field5653;
                    var18.field5653 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field7344 < 0) {
            this.field7344 = 0;
        }
        if (this.field7329 != null) {
            this.field7329.method717(arg0, 0, arg1);
        }
        this.field7334 = class165.method1188((byte) 26);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V", line = 163)
    public static final void method2954(boolean arg0) {
        class406.field5776++;
        if (arg0) {
            return;
        }
        field7323++;
        class228.method1528(true, class256.field3798);
        class276.field4124.method3048(-2034159384, class360.method2235(32397));
        class276.field4124.method3016(class50.field927, -86);
        class276.field4124.method3016(class76.field1247, -14);
        class276.field4124.method3048(-2034159384, class220.field3371.field2576);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "()V", line = 184)
    public static final void method2955() {
        class246.method1611(1, class251.field3740);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 189)
    public final synchronized void method2956(int arg0) {
        field7324++;
        if (this.field7330) {
            return;
        }
        long var2 = class165.method1188((byte) 26);
        try {
            if (var2 > this.field7334 + 500000L) {
                this.field7334 = var2 - 500000L;
            }
            while (var2 > (this.field7334 + 5000L)) {
                this.method2959(256, (byte) -103);
                this.field7334 += (256000 / class120.field1877);
            }
        } catch (Exception var7) {
            this.field7334 = var2;
        }
        if (this.field7328 == null) {
            return;
        }
        try {
            if (this.field7348 != 0L) {
                if (this.field7348 > var2) {
                    return;
                }
                this.method1567(this.field7345);
                this.field7343 = true;
                this.field7348 = 0L;
            }
            int var4 = this.method1569();
            if (this.field7342 < (this.field7341 - var4)) {
                this.field7342 = this.field7341 - var4;
            }
            int var5 = this.field7340 + this.field7346;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field7345) {
                this.field7345 += 1024;
                if (this.field7345 > 16384) {
                    this.field7345 = 16384;
                }
                this.method1568();
                var4 = 0;
                this.method1567(this.field7345);
                if (this.field7345 < var5 + 256) {
                    var5 = this.field7345 - 256;
                    this.field7346 = var5 - this.field7340;
                }
                this.field7343 = true;
            }
            while (var4 < var5) {
                this.method2953(this.field7328, 256);
                this.method1570();
                var4 += 256;
            }
            if (arg0 != -16385) {
                this.field7349 = 65;
            }
            if (this.field7347 < var2) {
                if (this.field7343) {
                    this.field7343 = false;
                } else if (this.field7342 == 0 && this.field7349 == 0) {
                    this.method1568();
                    this.field7348 = var2 + 2000L;
                    return;
                } else {
                    this.field7346 = Math.min(this.field7349, this.field7342);
                    this.field7349 = this.field7342;
                }
                this.field7342 = 0;
                this.field7347 = var2 + 2000L;
            }
            this.field7341 = var4;
        } catch (Exception var6) {
            this.method1568();
            this.field7348 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lpo;I)V", line = 306)
    public final synchronized void method2957(class398 arg0, int arg1) {
        this.field7329 = arg0;
        if (arg1 == 7) {
            field7321++;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "()I", line = 319)
    public int method1569() throws Exception {
        field7331++;
        return this.field7345;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 327)
    public void method1572(Component arg0) throws Exception {
        field7333++;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "()V", line = 337)
    public void method1568() {
        field7335++;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V", line = 351)
    public final synchronized void method2958(int arg0) {
        this.field7343 = true;
        field7336++;
        try {
            this.method1571();
            if (arg0 != 2000) {
                this.field7340 = 40;
            }
        } catch (Exception var2) {
            this.method1568();
            this.field7348 = class165.method1188((byte) 26) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V", line = 371)
    public void method1567(int arg0) throws Exception {
        field7322++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)V", line = 379)
    private final void method2959(int arg0, byte arg1) {
        this.field7344 -= arg0;
        field7327++;
        if (arg1 > -18) {
            this.field7350 = null;
        }
        if (this.field7344 < 0) {
            this.field7344 = 0;
        }
        if (this.field7329 != null) {
            this.field7329.method697(arg0);
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "()V", line = 398)
    public void method1571() throws Exception {
        field7325++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lpo;IB)V", line = 408)
    private final void method2960(class398 arg0, int arg1, byte arg2) {
        field7338++;
        int var4 = arg1 >> 5;
        class398 var5 = this.field7339[var4];
        if (arg2 != -19) {
            return;
        }
        if (var5 == null) {
            this.field7350[var4] = arg0;
        } else {
            var5.field5653 = arg0;
        }
        this.field7339[var4] = arg0;
        arg0.field5654 = arg1;
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "()V", line = 429)
    public void method1570() throws Exception {
        field7326++;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V", line = 457)
    public final synchronized void method2961(int arg0) {
        if (class468.field6792 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class468.field6792.field4807[var3] == this) {
                    class468.field6792.field4807[var3] = null;
                }
                if (class468.field6792.field4807[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class468.field6792.field4812 = true;
                while (class468.field6792.field4805) {
                    class477.method2826(50L, 0);
                }
                class468.field6792 = null;
            }
        }
        field7332++;
        this.method1568();
        this.field7330 = true;
        if (arg0 <= 107) {
            this.field7348 = 85L;
        }
        this.field7328 = null;
    }
}
