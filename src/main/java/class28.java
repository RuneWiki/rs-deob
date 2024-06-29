import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class28 {

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "I")
    private int field298 = 32;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "Z")
    private boolean field293 = false;

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "J")
    private long field305 = class84.method550((byte) -95);

    @OriginalMember(owner = "client!mca", name = "u", descriptor = "[Lbk;")
    private class317[] field313 = new class317[8];

    @OriginalMember(owner = "client!mca", name = "w", descriptor = "I")
    private int field315 = 0;

    @OriginalMember(owner = "client!mca", name = "x", descriptor = "[Lbk;")
    private class317[] field316 = new class317[8];

    @OriginalMember(owner = "client!mca", name = "y", descriptor = "J")
    private long field317 = 0L;

    @OriginalMember(owner = "client!mca", name = "C", descriptor = "J")
    private long field321 = 0L;

    @OriginalMember(owner = "client!mca", name = "B", descriptor = "I")
    private int field320 = 0;

    @OriginalMember(owner = "client!mca", name = "E", descriptor = "I")
    private int field323 = 0;

    @OriginalMember(owner = "client!mca", name = "D", descriptor = "Z")
    private boolean field322 = true;

    @OriginalMember(owner = "client!mca", name = "t", descriptor = "I")
    private int field312 = 0;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!mca", name = "h", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!mca", name = "q", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!mca", name = "s", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!mca", name = "v", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client!mca", name = "z", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "client!mca", name = "A", descriptor = "I")
    public int field319;

    @OriginalMember(owner = "client!mca", name = "F", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "Lbk;")
    private class317 field303;

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "[I")
    public int[] field304;

    static {
        new class474("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V", line = 12)
    public final synchronized void method161(int arg0) {
        field301++;
        if (this.field293) {
            return;
        }
        long var2 = class84.method550((byte) -90);
        try {
            if (var2 > (this.field305 + 500000L)) {
                this.field305 = var2 - 500000L;
            }
            if (arg0 <= 58) {
                this.method165(null, 86, -60);
            }
            while (var2 > this.field305 + 5000L) {
                this.method167(256, 0);
                this.field305 += (256000 / class292.field4050);
            }
        } catch (Exception var7) {
            this.field305 = var2;
        }
        if (this.field304 == null) {
            return;
        }
        try {
            if (this.field317 != 0L) {
                if (var2 < this.field317) {
                    return;
                }
                this.method41(this.field319);
                this.field317 = 0L;
                this.field322 = true;
            }
            int var4 = this.method43();
            if ((this.field315 - var4) > this.field323) {
                this.field323 = this.field315 - var4;
            }
            int var5 = this.field318 + this.field314;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field319 < var5 + 256) {
                this.field319 += 1024;
                if (this.field319 > 16384) {
                    this.field319 = 16384;
                }
                this.method40();
                this.method41(this.field319);
                var4 = 0;
                if (this.field319 < (var5 + 256)) {
                    var5 = this.field319 - 256;
                    this.field314 = var5 - this.field318;
                }
                this.field322 = true;
            }
            while (var5 > var4) {
                this.method163(this.field304, 256);
                this.method44();
                var4 += 256;
            }
            if (this.field321 < var2) {
                if (this.field322) {
                    this.field322 = false;
                } else if (this.field323 == 0 && this.field320 == 0) {
                    this.method40();
                    this.field317 = var2 + 2000L;
                    return;
                } else {
                    this.field314 = Math.min(this.field320, this.field323);
                    this.field320 = this.field323;
                }
                this.field323 = 0;
                this.field321 = var2 + 2000L;
            }
            this.field315 = var4;
        } catch (Exception var6) {
            this.method40();
            this.field317 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)V", line = 133)
    public final synchronized void method162(int arg0) {
        field309++;
        this.field322 = true;
        try {
            this.method45();
        } catch (Exception var2) {
            this.method40();
            this.field317 = class84.method550((byte) -100) + 2000L;
        }
        if (arg0 != 8) {
            this.field303 = null;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "([II)V", line = 160)
    private final void method163(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class325.field4696) {
            var3 = arg1 << 1;
        }
        class210.method1326(arg0, 0, var3);
        this.field312 -= arg1;
        if (this.field303 != null && this.field312 <= 0) {
            this.field312 += class292.field4050 >> 4;
            class177.method1001(this.field303, 0);
            this.method165(this.field303, this.field303.method1120(), -31287);
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
                        class317 var10 = null;
                        class317 var11 = this.field316[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class382 var12 = var11.field4610;
                                if (var12 == null || var12.field5777 <= var8) {
                                    var11.field4611 = true;
                                    int var13 = var11.method935();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field5777 += var13;
                                    }
                                    if (var4 >= this.field298) {
                                        break label107;
                                    }
                                    class317 var14 = var11.method926();
                                    if (var14 != null) {
                                        int var15 = var11.field4609;
                                        while (var14 != null) {
                                            this.method165(var14, var15 * var14.method1120() >> 8, -31287);
                                            var14 = var11.method925();
                                        }
                                    }
                                    class317 var16 = var11.field4612;
                                    var11.field4612 = null;
                                    if (var10 == null) {
                                        this.field316[var7] = var16;
                                    } else {
                                        var10.field4612 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field313[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4612;
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
                class317 var18 = this.field316[var17];
                this.field316[var17] = this.field313[var17] = null;
                while (var18 != null) {
                    class317 var19 = var18.field4612;
                    var18.field4612 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field312 < 0) {
            this.field312 = 0;
        }
        if (this.field303 != null) {
            this.field303.method930(arg0, 0, arg1);
        }
        this.field305 = class84.method550((byte) -93);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILqb;)V", line = 318)
    public static final void method164(int arg0, class191 arg1) {
        if (arg1 instanceof class78) {
            class78 var2 = (class78) arg1;
            if (var2.field864 != null) {
                class646.method3697(-31188, var2, class439.field6548.field1757 != var2.field1757);
            }
        } else if (arg1 instanceof class655) {
            class655 var3 = (class655) arg1;
            class650.method3716(class439.field6548.field1757 != var3.field1757, 0, var3);
        }
        if (arg0 == -20629) {
            field324++;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "()I", line = 347)
    public int method43() throws Exception {
        field302++;
        return this.field319;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lbk;II)V", line = 359)
    private final void method165(class317 arg0, int arg1, int arg2) {
        field296++;
        if (arg2 != -31287) {
            this.method163(null, -123);
        }
        int var4 = arg1 >> 5;
        class317 var5 = this.field313[var4];
        if (var5 == null) {
            this.field316[var4] = arg0;
        } else {
            var5.field4612 = arg0;
        }
        this.field313[var4] = arg0;
        arg0.field4609 = arg1;
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "()V", line = 382)
    public void method45() throws Exception {
        field295++;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 389)
    public void method42(Component arg0) throws Exception {
        field306++;
    }

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(I)V", line = 396)
    public final synchronized void method166(int arg0) {
        if (arg0 != 50) {
            return;
        }
        field300++;
        if (class248.field3524 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class248.field3524.field2132[var3] == this) {
                    class248.field3524.field2132[var3] = null;
                }
                if (class248.field3524.field2132[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class248.field3524.field2130 = true;
                while (class248.field3524.field2129) {
                    class646.method3696(1, 50L);
                }
                class248.field3524 = null;
            }
        }
        this.method40();
        this.field293 = true;
        this.field304 = null;
    }

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "()V", line = 444)
    public void method44() throws Exception {
        field299++;
    }

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "(I)V", line = 451)
    public void method41(int arg0) throws Exception {
        field297++;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)V", line = 459)
    private final void method167(int arg0, int arg1) {
        field310++;
        this.field312 -= arg0;
        if (this.field312 < arg1) {
            this.field312 = 0;
        }
        if (this.field303 != null) {
            this.field303.method929(arg0);
        }
    }

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "()V", line = 482)
    public void method40() {
        field308++;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lbk;I)V", line = 509)
    public final synchronized void method168(class317 arg0, int arg1) {
        this.field303 = arg0;
        int var3 = -93 / ((-arg1 - 54) / 36);
        field307++;
    }
}
