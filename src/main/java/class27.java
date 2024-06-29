import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class27 {

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    private int field370 = 32;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "Z")
    private boolean field377 = false;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "J")
    private long field374 = class249.method1723((byte) 110);

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "J")
    private long field380 = 0L;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "J")
    private long field379 = 0L;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
    private int field381 = 0;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    private int field382 = 0;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "[Lfg;")
    private class43[] field384 = new class43[8];

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "Z")
    private boolean field389 = true;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    private int field388 = 0;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "I")
    private int field391 = 0;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "[Lfg;")
    private class43[] field392 = new class43[8];

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "Z")
    public static boolean field368 = false;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Lte;")
    public static class244 field365 = new class244(64);

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "[I")
    public static int[] field385 = new int[2048];

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "J")
    public static long field393 = 0L;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "[I")
    public static int[] field390 = new int[8];

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Leh;")
    public static class137 field363;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Lfg;")
    private class43 field359;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "[I")
    public int[] field362;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method154(int arg0) {
        field365 = null;
        field385 = null;
        field363 = null;
        field390 = null;
        if (arg0 != -11996) {
            field393 = -80L;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
    public final void method155(int arg0) {
        if (arg0 != 0) {
            this.field388 = -126;
        }
        this.field389 = true;
        field364++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()V")
    public void method6() throws Exception {
        field372++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
    public final synchronized void method156(boolean arg0) {
        field369++;
        if (class164.field2601 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class164.field2601.field2545[var3] == this) {
                    class164.field2601.field2545[var3] = null;
                }
                if (class164.field2601.field2545[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class164.field2601.field2551 = true;
                while (class164.field2601.field2552) {
                    class115.method752((byte) -62, 50L);
                }
                class164.field2601 = null;
            }
        }
        this.method4();
        this.field362 = null;
        this.field377 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "()V")
    public void method3() throws Exception {
        field387++;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "()I")
    public int method1() throws Exception {
        field366++;
        return this.field383;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method5(Component arg0) throws Exception {
        field378++;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V")
    public void method2(int arg0) throws Exception {
        field361++;
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V")
    public final synchronized void method157(int arg0) {
        field376++;
        this.field389 = true;
        try {
            this.method6();
        } catch (Exception var2) {
            this.method4();
            this.field379 = class249.method1723((byte) 74) + 2000L;
        }
        if (arg0 != 1) {
            this.field392 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "()V")
    public void method4() {
        field375++;
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V")
    public final synchronized void method158(int arg0) {
        field373++;
        if (this.field377) {
            return;
        }
        long var2 = class249.method1723((byte) 76);
        try {
            if (this.field374 + 500000L < var2) {
                this.field374 = var2 - 500000L;
            }
            while (var2 > this.field374 + 5000L) {
                this.method161(13630, 256);
                this.field374 += (long) (256000 / class280.field4448);
            }
        } catch (Exception var7) {
            this.field374 = var2;
        }
        if (this.field362 == null) {
            return;
        }
        try {
            if (this.field379 != 0L) {
                if (var2 < this.field379) {
                    return;
                }
                this.method2(this.field383);
                this.field379 = 0L;
                this.field389 = true;
            }
            int var4 = this.method1();
            if (arg0 == 8) {
                if ((this.field381 - var4) > this.field388) {
                    this.field388 = this.field381 - var4;
                }
                int var5 = this.field394 + this.field386;
                if (var5 + 256 > 16384) {
                    var5 = 16128;
                }
                if ((var5 + 256) > this.field383) {
                    this.field383 += 1024;
                    var4 = 0;
                    if (this.field383 > 16384) {
                        this.field383 = 16384;
                    }
                    this.method4();
                    this.method2(this.field383);
                    this.field389 = true;
                    if (this.field383 < (var5 + 256)) {
                        var5 = this.field383 - 256;
                        this.field386 = var5 - this.field394;
                    }
                }
                while (var5 > var4) {
                    this.method162(this.field362, 256);
                    this.method3();
                    var4 += 256;
                }
                if (this.field380 < var2) {
                    if (this.field389) {
                        this.field389 = false;
                    } else if (this.field388 == 0 && this.field382 == 0) {
                        this.method4();
                        this.field379 = var2 + 2000L;
                        return;
                    } else {
                        this.field386 = Math.min(this.field382, this.field388);
                        this.field382 = this.field388;
                    }
                    this.field380 = var2 + 2000L;
                    this.field388 = 0;
                }
                this.field381 = var4;
            }
        } catch (Exception var6) {
            this.method4();
            this.field379 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILfg;I)V")
    private final void method159(int arg0, class43 arg1, int arg2) {
        int var4 = arg2 >> 5;
        if (arg0 != -14556) {
            this.method156(false);
        }
        field367++;
        class43 var5 = this.field392[var4];
        if (var5 == null) {
            this.field384[var4] = arg1;
        } else {
            var5.field542 = arg1;
        }
        this.field392[var4] = arg1;
        arg1.field543 = arg2;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILfg;)V")
    public final synchronized void method160(int arg0, class43 arg1) {
        field371++;
        if (arg0 != 0) {
            this.method161(50, 123);
        }
        this.field359 = arg1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
    private final void method161(int arg0, int arg1) {
        if (arg0 != 13630) {
            this.field394 = 111;
        }
        this.field391 -= arg1;
        if (this.field391 < 0) {
            this.field391 = 0;
        }
        if (this.field359 != null) {
            this.field359.method236(arg1);
        }
        field360++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([II)V")
    private final void method162(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class226.field3636) {
            var3 = arg1 << 1;
        }
        class72.method406(arg0, 0, var3);
        this.field391 -= arg1;
        if (this.field359 != null && this.field391 <= 0) {
            this.field391 += class280.field4448 >> 4;
            class55.method312(this.field359, (byte) -16);
            this.method159(-14556, this.field359, this.field359.method240());
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
                        class43 var10 = null;
                        class43 var11 = this.field384[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class197 var12 = var11.field541;
                                if (var12 == null || var12.field3136 <= var8) {
                                    var11.field544 = true;
                                    int var13 = var11.method238();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3136 += var13;
                                    }
                                    if (var4 >= this.field370) {
                                        break label107;
                                    }
                                    class43 var14 = var11.method242();
                                    if (var14 != null) {
                                        int var15 = var11.field543;
                                        while (var14 != null) {
                                            this.method159(-14556, var14, var15 * var14.method240() >> 8);
                                            var14 = var11.method239();
                                        }
                                    }
                                    class43 var16 = var11.field542;
                                    var11.field542 = null;
                                    if (var10 == null) {
                                        this.field384[var7] = var16;
                                    } else {
                                        var10.field542 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field392[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field542;
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
                class43 var18 = this.field384[var17];
                this.field384[var17] = this.field392[var17] = null;
                while (var18 != null) {
                    class43 var19 = var18.field542;
                    var18.field542 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field391 < 0) {
            this.field391 = 0;
        }
        if (this.field359 != null) {
            this.field359.method237(arg0, 0, arg1);
        }
        this.field374 = class249.method1723((byte) 6);
    }
}
