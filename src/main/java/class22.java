import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class22 {

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    private int field346 = 32;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Z")
    private boolean field355 = false;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "J")
    private long field354 = class102.method743((byte) 127);

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Z")
    private boolean field364 = true;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    private int field372 = 0;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[Lp;")
    private class24[] field367 = new class24[8];

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "J")
    private long field373 = 0L;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    private int field371 = 0;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "[Lp;")
    private class24[] field363 = new class24[8];

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "J")
    private long field370 = 0L;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    private int field366 = 0;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    private int field374 = 0;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lp;")
    private class24 field343;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "[I")
    public int[] field349;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V", line = 4)
    private final void method218(int arg0, int arg1) {
        if (arg1 < 31) {
            return;
        }
        this.field366 -= arg0;
        field352++;
        if (this.field366 < 0) {
            this.field366 = 0;
        }
        if (this.field343 != null) {
            this.field343.method235(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V", line = 22)
    public void method98() {
        field361++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 32)
    public final synchronized void method219(int arg0) {
        if (class68.field1127 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class68.field1127.field2430[var3] == this) {
                    class68.field1127.field2430[var3] = null;
                }
                if (class68.field1127.field2430[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class68.field1127.field2422 = true;
                while (class68.field1127.field2421) {
                    class5.method26(0, 50L);
                }
                class68.field1127 = null;
            }
        }
        int var4 = -27 / ((arg0 - 9) / 50);
        field359++;
        this.method98();
        this.field355 = true;
        this.field349 = null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 82)
    public final void method220(int arg0) {
        this.field364 = true;
        field350++;
        if (arg0 != 1) {
            this.method223(-55, (class24) null, 69);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 104)
    public void method96(Component arg0) throws Exception {
        field351++;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V", line = 112)
    public void method94() throws Exception {
        field358++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILp;)V", line = 119)
    public final synchronized void method221(int arg0, class24 arg1) {
        this.field343 = arg1;
        if (arg0 >= 89) {
            field353++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()I", line = 130)
    public int method97() throws Exception {
        field347++;
        return this.field368;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([II)V", line = 138)
    private final void method222(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class156.field2337) {
            var3 = arg1 << 1;
        }
        class343.method2370(arg0, 0, var3);
        this.field366 -= arg1;
        if (this.field343 != null && this.field366 <= 0) {
            this.field366 += class220.field3413 >> 4;
            class242.method1681(0, this.field343);
            this.method223(this.field343.method236(), this.field343, -33);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
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
                        class24 var10 = null;
                        class24 var11 = this.field367[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class255 var12 = var11.field388;
                                if (var12 == null || var12.field4000 <= var8) {
                                    var11.field390 = true;
                                    int var13 = var11.method237();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4000 += var13;
                                    }
                                    if (var4 >= this.field346) {
                                        break label105;
                                    }
                                    class24 var14 = var11.method232();
                                    if (var14 != null) {
                                        int var15 = var11.field389;
                                        while (var14 != null) {
                                            this.method223(var15 * var14.method236() >> 8, var14, -26);
                                            var14 = var11.method233();
                                        }
                                    }
                                    class24 var16 = var11.field391;
                                    var11.field391 = null;
                                    if (var10 == null) {
                                        this.field367[var7] = var16;
                                    } else {
                                        var10.field391 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field363[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field391;
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
                class24 var18 = this.field367[var17];
                this.field367[var17] = this.field363[var17] = null;
                while (var18 != null) {
                    class24 var19 = var18.field391;
                    var18.field391 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field366 < 0) {
            this.field366 = 0;
        }
        if (this.field343 != null) {
            this.field343.method234(arg0, 0, arg1);
        }
        this.field354 = class102.method743((byte) 111);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()V", line = 299)
    public void method100() throws Exception {
        field360++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILp;I)V", line = 307)
    private final void method223(int arg0, class24 arg1, int arg2) {
        field356++;
        int var4 = arg0 >> 5;
        class24 var5 = this.field363[var4];
        if (var5 == null) {
            this.field367[var4] = arg1;
        } else {
            var5.field391 = arg1;
        }
        if (arg2 <= -7) {
            this.field363[var4] = arg1;
            arg1.field389 = arg0;
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 327)
    public void method95(int arg0) throws Exception {
        field345++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 342)
    public final synchronized void method224(byte arg0) {
        field357++;
        this.field364 = true;
        try {
            this.method100();
            if (arg0 < 18) {
                this.method224((byte) 29);
            }
        } catch (Exception var3) {
            this.method98();
            this.field370 = class102.method743((byte) 100) + 2000L;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 369)
    public final synchronized void method225(boolean arg0) {
        field362++;
        if (this.field355) {
            return;
        }
        long var2 = class102.method743((byte) 73);
        try {
            if (var2 > (this.field354 + 500000L)) {
                this.field354 = var2 - 500000L;
            }
            while ((this.field354 + 5000L) < var2) {
                this.method218(256, 63);
                this.field354 += (long) (256000 / class220.field3413);
            }
        } catch (Exception var9) {
            this.field354 = var2;
        }
        if (!arg0) {
            this.field346 = 57;
        }
        if (this.field349 == null) {
            return;
        }
        try {
            if (this.field370 != 0L) {
                if (var2 < this.field370) {
                    return;
                }
                this.method95(this.field368);
                this.field370 = 0L;
                this.field364 = true;
            }
            int var5 = this.method97();
            if (this.field371 < (this.field374 - var5)) {
                this.field371 = this.field374 - var5;
            }
            int var6 = this.field369 + this.field365;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if (this.field368 < var6 + 256) {
                this.field368 += 1024;
                if (this.field368 > 16384) {
                    this.field368 = 16384;
                }
                this.method98();
                this.method95(this.field368);
                if (this.field368 < (var6 + 256)) {
                    var6 = this.field368 - 256;
                    this.field369 = var6 - this.field365;
                }
                var5 = 0;
                this.field364 = true;
            }
            while (var6 > var5) {
                var5 += 256;
                this.method222(this.field349, 256);
                this.method94();
            }
            if (this.field373 < var2) {
                if (this.field364) {
                    this.field364 = false;
                } else if (this.field371 == 0 && this.field372 == 0) {
                    this.method98();
                    this.field370 = var2 + 2000L;
                    return;
                } else {
                    this.field369 = Math.min(this.field372, this.field371);
                    this.field372 = this.field371;
                }
                this.field371 = 0;
                this.field373 = var2 + 2000L;
            }
            this.field374 = var5;
        } catch (Exception var8) {
            this.method98();
            this.field370 = var2 + 2000L;
        }
    }
}
