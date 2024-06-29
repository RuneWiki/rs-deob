import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class243 {

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Z")
    private boolean field3480 = false;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    private int field3487 = 32;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "J")
    private long field3488 = class109.method731(33);

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    private int field3491 = 0;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    private int field3492 = 0;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "[Leha;")
    private class98[] field3494 = new class98[8];

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "Z")
    private boolean field3489 = true;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    private int field3496 = 0;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    private int field3498 = 0;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "[Leha;")
    private class98[] field3499 = new class98[8];

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "J")
    private long field3502 = 0L;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "J")
    private long field3497 = 0L;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "F")
    public static float field3478 = 0.0F;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public int field3490;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public int field3500;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    private int field3501;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Leha;")
    private class98 field3486;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "[I")
    public static int[] field3471;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
    public int[] field3475;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 4)
    public final synchronized void method1644(int arg0) {
        this.field3489 = true;
        field3493++;
        try {
            this.method1234();
        } catch (Exception var2) {
            this.method1232();
            this.field3502 = class109.method731(arg0 + 16690) + 2000L;
        }
        if (arg0 != -16659) {
            this.method1644(38);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILeha;)V", line = 28)
    private final void method1645(int arg0, int arg1, class98 arg2) {
        field3470++;
        int var4 = arg0 >> 5;
        class98 var5 = this.field3499[var4];
        if (var5 == null) {
            this.field3494[var4] = arg2;
        } else {
            var5.field1253 = arg2;
        }
        this.field3499[var4] = arg2;
        int var6 = -10 / ((10 - arg1) / 43);
        arg2.field1252 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([II)V", line = 49)
    private final void method1646(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class488.field6909) {
            var3 = arg1 << 1;
        }
        class42.method290(arg0, 0, var3);
        this.field3496 -= arg1;
        if (this.field3486 != null && this.field3496 <= 0) {
            this.field3496 += class110.field1367 >> 4;
            class113.method805(23190, this.field3486);
            this.method1645(this.field3486.method690(), -64, this.field3486);
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
                        class98 var10 = null;
                        class98 var11 = this.field3494[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class65 var12 = var11.field1254;
                                if (var12 == null || var12.field868 <= var8) {
                                    var11.field1251 = true;
                                    int var13 = var11.method691();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field868 += var13;
                                    }
                                    if (var4 >= this.field3487) {
                                        break label107;
                                    }
                                    class98 var14 = var11.method687();
                                    if (var14 != null) {
                                        int var15 = var11.field1252;
                                        while (var14 != null) {
                                            this.method1645(var15 * var14.method690() >> 8, 97, var14);
                                            var14 = var11.method688();
                                        }
                                    }
                                    class98 var16 = var11.field1253;
                                    var11.field1253 = null;
                                    if (var10 == null) {
                                        this.field3494[var7] = var16;
                                    } else {
                                        var10.field1253 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3499[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1253;
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
                class98 var18 = this.field3494[var17];
                this.field3494[var17] = this.field3499[var17] = null;
                while (var18 != null) {
                    class98 var19 = var18.field1253;
                    var18.field1253 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3496 < 0) {
            this.field3496 = 0;
        }
        if (this.field3486 != null) {
            this.field3486.method689(arg0, 0, arg1);
        }
        this.field3488 = class109.method731(95);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()I", line = 207)
    public int method1229() throws Exception {
        field3481++;
        return this.field3500;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 217)
    public static void method1647(int arg0) {
        if (arg0 != 0) {
            field3471 = null;
        }
        field3471 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 228)
    public final synchronized void method1648(byte arg0) {
        field3479++;
        if (this.field3480) {
            return;
        }
        long var2 = class109.method731(74);
        try {
            if (arg0 != 55) {
                return;
            }
            if (this.field3488 + 6000L < var2) {
                this.field3488 = var2 - 6000L;
            }
            while (var2 > (this.field3488 + 5000L)) {
                this.method1651(256, -119);
                this.field3488 += (256000 / class110.field1367);
                var2 = class109.method731(81);
            }
        } catch (Exception var7) {
            this.field3488 = var2;
        }
        if (this.field3475 == null) {
            return;
        }
        try {
            if (this.field3502 != 0L) {
                if (var2 < this.field3502) {
                    return;
                }
                this.method1231(this.field3500);
                this.field3489 = true;
                this.field3502 = 0L;
            }
            int var4 = this.method1229();
            if (this.field3492 < this.field3498 - var4) {
                this.field3492 = this.field3498 - var4;
            }
            int var5 = this.field3501 + this.field3490;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field3500) {
                this.field3500 += 1024;
                if (this.field3500 > 16384) {
                    this.field3500 = 16384;
                }
                this.method1232();
                this.method1231(this.field3500);
                var4 = 0;
                if (var5 + 256 > this.field3500) {
                    var5 = this.field3500 - 256;
                    this.field3501 = var5 - this.field3490;
                }
                this.field3489 = true;
            }
            while (var4 < var5) {
                this.method1646(this.field3475, 256);
                this.method1230();
                var4 += 256;
            }
            if (var2 > this.field3497) {
                if (this.field3489) {
                    this.field3489 = false;
                } else if (this.field3492 == 0 && this.field3491 == 0) {
                    this.method1232();
                    this.field3502 = var2 + 2000L;
                    return;
                } else {
                    this.field3501 = Math.min(this.field3491, this.field3492);
                    this.field3491 = this.field3492;
                }
                this.field3497 = var2 + 2000L;
                this.field3492 = 0;
            }
            this.field3498 = var4;
        } catch (Exception var6) {
            this.method1232();
            this.field3502 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 350)
    public void method1231(int arg0) throws Exception {
        field3495++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILeha;)V", line = 359)
    public final synchronized void method1649(int arg0, class98 arg1) {
        field3503++;
        this.field3486 = arg1;
        if (arg0 > -16) {
            method1650(43);
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)I", line = 371)
    public static final int method1650(int arg0) {
        if (arg0 != 11) {
            method1650(-20);
        }
        field3485++;
        return class61.field828;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V", line = 382)
    private final void method1651(int arg0, int arg1) {
        field3482++;
        this.field3496 -= arg0;
        if (this.field3496 < 0) {
            this.field3496 = 0;
        }
        if (this.field3486 != null) {
            this.field3486.method686(arg0);
        }
        int var3 = -59 % ((6 - arg1) / 47);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()V", line = 400)
    public void method1232() {
        field3474++;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "()V", line = 408)
    public void method1234() throws Exception {
        field3472++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 416)
    public void method1235(Component arg0) throws Exception {
        field3476++;
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V", line = 431)
    public final synchronized void method1652(int arg0) {
        if (class462.field6595 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class462.field6595.field8360[var3] == this) {
                    class462.field6595.field8360[var3] = null;
                }
                if (class462.field6595.field8360[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class462.field6595.field8362 = true;
                while (class462.field6595.field8361) {
                    class117.method820(false, 50L);
                }
                class462.field6595 = null;
            }
        }
        field3477++;
        this.method1232();
        this.field3480 = true;
        this.field3475 = null;
        if (arg0 != 6000) {
            this.method1652(-13);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIBI)V", line = 475)
    public static final void method1653(int arg0, int arg1, byte arg2, int arg3) {
        field3484++;
        class678 var4 = class630.method3597(29636, 11, (long) arg3);
        if (arg2 != -107) {
            field3478 = 0.065097176F;
        }
        var4.method3834((byte) -115);
        var4.field9639 = arg1;
        var4.field9649 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "()V", line = 532)
    public void method1230() throws Exception {
        field3473++;
    }
}
