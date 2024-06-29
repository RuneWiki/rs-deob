import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class22 {

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "Z")
    private boolean field410 = false;

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
    private int field415 = 32;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "J")
    private long field407 = class60.method371(false);

    @OriginalMember(owner = "client!cv", name = "A", descriptor = "Z")
    private boolean field422 = true;

    @OriginalMember(owner = "client!cv", name = "B", descriptor = "[Lac;")
    private class659[] field423 = new class659[8];

    @OriginalMember(owner = "client!cv", name = "v", descriptor = "J")
    private long field417 = 0L;

    @OriginalMember(owner = "client!cv", name = "w", descriptor = "I")
    private int field418 = 0;

    @OriginalMember(owner = "client!cv", name = "H", descriptor = "J")
    private long field429 = 0L;

    @OriginalMember(owner = "client!cv", name = "y", descriptor = "I")
    private int field420 = 0;

    @OriginalMember(owner = "client!cv", name = "G", descriptor = "[Lac;")
    private class659[] field428 = new class659[8];

    @OriginalMember(owner = "client!cv", name = "D", descriptor = "I")
    private int field425 = 0;

    @OriginalMember(owner = "client!cv", name = "F", descriptor = "I")
    private int field427 = 0;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "Z")
    public static boolean field401 = false;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field400 = 0;

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "Lvf;")
    public static class87 field404 = new class87();

    @OriginalMember(owner = "client!cv", name = "J", descriptor = "I")
    public static int field430 = -2;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!cv", name = "u", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!cv", name = "x", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "client!cv", name = "C", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!cv", name = "E", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "Lac;")
    private class659 field402;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "[I")
    public int[] field412;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
    public final synchronized void method143(byte arg0) {
        field398++;
        if (this.field410) {
            return;
        }
        long var2 = class60.method371(false);
        try {
            if (var2 > (this.field407 + 500000L)) {
                this.field407 = var2 - 500000L;
            }
            while ((this.field407 + 5000L) < var2) {
                this.method154(60, 256);
                this.field407 += (256000 / class82.field1321);
            }
        } catch (Exception var8) {
            this.field407 = var2;
        }
        if (this.field412 == null) {
            return;
        }
        try {
            if (this.field429 != 0L) {
                if (var2 < this.field429) {
                    return;
                }
                this.method149(this.field424);
                this.field429 = 0L;
                this.field422 = true;
            }
            int var4 = this.method148();
            if ((this.field420 - var4) > this.field425) {
                this.field425 = this.field420 - var4;
            }
            int var5 = this.field421 + this.field419;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field424) {
                this.field424 += 1024;
                if (this.field424 > 16384) {
                    this.field424 = 16384;
                }
                this.method146();
                this.method149(this.field424);
                var4 = 0;
                if ((var5 + 256) > this.field424) {
                    var5 = this.field424 - 256;
                    this.field419 = var5 - this.field421;
                }
                this.field422 = true;
            }
            int var6 = -76 / ((-arg0 - 53) / 36);
            while (var5 > var4) {
                this.method155(this.field412, 256);
                var4 += 256;
                this.method145();
            }
            if (this.field417 < var2) {
                if (this.field422) {
                    this.field422 = false;
                } else if (this.field425 == 0 && this.field418 == 0) {
                    this.method146();
                    this.field429 = var2 + 2000L;
                    return;
                } else {
                    this.field419 = Math.min(this.field418, this.field425);
                    this.field418 = this.field425;
                }
                this.field425 = 0;
                this.field417 = var2 + 2000L;
            }
            this.field420 = var4;
        } catch (Exception var7) {
            this.method146();
            this.field429 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
    public static void method144(int arg0) {
        if (arg0 > -65) {
            method144(65);
        }
        field404 = null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "()V")
    public void method145() throws Exception {
        field406++;
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "()V")
    public void method146() {
        field397++;
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "()V")
    public void method147() throws Exception {
        field411++;
    }

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "()I")
    public int method148() throws Exception {
        field408++;
        return this.field424;
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
    public void method149(int arg0) throws Exception {
        field396++;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method150(Component arg0) throws Exception {
        field416++;
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(I)V")
    public final synchronized void method151(int arg0) {
        if (arg0 != -4501) {
            return;
        }
        field399++;
        this.field422 = true;
        try {
            this.method147();
        } catch (Exception var2) {
            this.method146();
            this.field429 = class60.method371(false) + 2000L;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lac;II)V")
    private final void method152(class659 arg0, int arg1, int arg2) {
        field405++;
        if (arg1 <= 111) {
            method144(-8);
        }
        int var4 = arg2 >> 5;
        class659 var5 = this.field428[var4];
        if (var5 == null) {
            this.field423[var4] = arg0;
        } else {
            var5.field9406 = arg0;
        }
        this.field428[var4] = arg0;
        arg0.field9405 = arg2;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BLac;)V")
    public final synchronized void method153(byte arg0, class659 arg1) {
        field414++;
        this.field402 = arg1;
        if (arg0 != 76) {
            field401 = true;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)V")
    private final void method154(int arg0, int arg1) {
        field409++;
        this.field427 -= arg1;
        if (this.field427 < 0) {
            this.field427 = 0;
        }
        if (this.field402 != null) {
            this.field402.method526(arg1);
        }
        int var3 = -118 / ((-arg0 - 15) / 46);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "([II)V")
    private final void method155(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class550.field8108) {
            var3 = arg1 << 1;
        }
        class667.method3743(arg0, 0, var3);
        this.field427 -= arg1;
        if (this.field402 != null && this.field427 <= 0) {
            this.field427 += class82.field1321 >> 4;
            class243.method1492(this.field402, true);
            this.method152(this.field402, 122, this.field402.method557());
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
                        class659 var10 = null;
                        class659 var11 = this.field423[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class253 var12 = var11.field9404;
                                if (var12 == null || var12.field3306 <= var8) {
                                    var11.field9407 = true;
                                    int var13 = var11.method545();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3306 += var13;
                                    }
                                    if (var4 >= this.field415) {
                                        break label107;
                                    }
                                    class659 var14 = var11.method531();
                                    if (var14 != null) {
                                        int var15 = var11.field9405;
                                        while (var14 != null) {
                                            this.method152(var14, 117, var15 * var14.method557() >> 8);
                                            var14 = var11.method534();
                                        }
                                    }
                                    class659 var16 = var11.field9406;
                                    var11.field9406 = null;
                                    if (var10 == null) {
                                        this.field423[var7] = var16;
                                    } else {
                                        var10.field9406 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field428[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field9406;
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
                class659 var18 = this.field423[var17];
                this.field423[var17] = this.field428[var17] = null;
                while (var18 != null) {
                    class659 var19 = var18.field9406;
                    var18.field9406 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field427 < 0) {
            this.field427 = 0;
        }
        if (this.field402 != null) {
            this.field402.method549(arg0, 0, arg1);
        }
        this.field407 = class60.method371(false);
    }

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)V")
    public final synchronized void method156(int arg0) {
        if (class526.field7480 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class526.field7480.field9012[var3] == this) {
                    class526.field7480.field9012[var3] = null;
                }
                if (class526.field7480.field9012[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class526.field7480.field9008 = true;
                while (class526.field7480.field9009) {
                    class687.method3846(50L, -97);
                }
                class526.field7480 = null;
            }
        }
        field403++;
        this.method146();
        int var4 = 44 % ((-arg0 - 68) / 53);
        this.field410 = true;
        this.field412 = null;
    }
}
