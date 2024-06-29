import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 {

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    private int field388 = 32;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "J")
    private long field382 = class10.method47(18889);

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "J")
    private long field401 = 0L;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    private int field399 = 0;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "[Lac;")
    private class4[] field398 = new class4[8];

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "[Lac;")
    private class4[] field403 = new class4[8];

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    private int field406 = 0;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "Z")
    private boolean field404 = true;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    private int field400 = 0;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    private int field407 = 0;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "J")
    private long field408 = 0L;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lod;")
    private static class101 field383 = class46.method335(110, "Prepared sound engine");

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Lod;")
    private static class101 field380 = class46.method335(109, "Prepared visibility map");

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "[Lj;")
    public static class62[] field376 = new class62[32768];

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "Lod;")
    public static class101 field391 = class46.method335(-119, ")3");

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "Lod;")
    public static class101 field390 = field380;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "[I")
    public static int[] field373 = new int[4000];

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lod;")
    public static class101 field381 = field383;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Lod;")
    public static class101 field384 = class46.method335(97, "ams");

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "Lod;")
    private static class101 field393 = class46.method335(-89, "This computers address has been blocked");

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Lod;")
    public static class101 field389 = field393;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "Lac;")
    private class4 field392;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "[I")
    public int[] field370;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public final synchronized void method142(int arg0) {
        field377++;
        if (class79.field1664 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class79.field1664.field2241[var3] == this) {
                    class79.field1664.field2241[var3] = null;
                }
                if (class79.field1664.field2241[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class79.field1664.field2236 = true;
                while (class79.field1664.field2245) {
                    class127.method981((byte) -86, 50L);
                }
                class79.field1664 = null;
            }
        }
        if (arg0 != 3) {
            this.field407 = 75;
        }
        this.method129();
        this.field370 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([II)V")
    private final void method143(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class7.field105) {
            var3 = arg1 << 1;
        }
        class60.method416(arg0, 0, var3);
        this.field406 -= arg1;
        if (this.field392 != null && this.field406 <= 0) {
            this.field406 += class140.field3224 >> 4;
            class120.method900(this.field392, -112);
            this.method150((byte) -125, this.field392.method16(), this.field392);
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
                        class4 var10 = null;
                        class4 var11 = this.field398[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class37 var12 = var11.field60;
                                if (var12 == null || var12.field921 <= var8) {
                                    var11.field61 = true;
                                    int var13 = var11.method20();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field921 += var13;
                                    }
                                    if (var4 >= this.field388) {
                                        break label107;
                                    }
                                    class4 var14 = var11.method18();
                                    if (var14 != null) {
                                        int var15 = var11.field59;
                                        while (var14 != null) {
                                            this.method150((byte) -125, var15 * var14.method16() >> 8, var14);
                                            var14 = var11.method15();
                                        }
                                    }
                                    class4 var16 = var11.field58;
                                    var11.field58 = null;
                                    if (var10 == null) {
                                        this.field398[var7] = var16;
                                    } else {
                                        var10.field58 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field403[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field58;
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
                class4 var18 = this.field398[var17];
                this.field398[var17] = this.field403[var17] = null;
                while (var18 != null) {
                    class4 var19 = var18.field58;
                    var18.field58 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field406 < 0) {
            this.field406 = 0;
        }
        if (this.field392 != null) {
            this.field392.method17(arg0, 0, arg1);
        }
        this.field382 = class10.method47(18889);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLac;)V")
    public final synchronized void method144(byte arg0, class4 arg1) {
        field378++;
        this.field392 = arg1;
        if (arg0 != 96) {
            this.method142(39);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method133(Component arg0) throws Exception {
        field387++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()I")
    public int method127() throws Exception {
        field374++;
        return this.field397;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
    private final void method145(int arg0, int arg1) {
        field394++;
        int var3 = -88 / ((46 - arg1) / 46);
        this.field406 -= arg0;
        if (this.field406 < 0) {
            this.field406 = 0;
        }
        if (this.field392 != null) {
            this.field392.method21(arg0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()V")
    public void method131() throws Exception {
        field395++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public final void method146(byte arg0) {
        if (arg0 < 16) {
            this.method143(null, 34);
        }
        this.field404 = true;
        field371++;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public void method128(int arg0) throws Exception {
        field396++;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "()V")
    public void method130() throws Exception {
        field375++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public static void method147(boolean arg0) {
        if (!arg0) {
            field380 = null;
        }
        field384 = null;
        field390 = null;
        field383 = null;
        field380 = null;
        field381 = null;
        field376 = null;
        field389 = null;
        field391 = null;
        field373 = null;
        field393 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public final synchronized void method148(byte arg0) {
        field379++;
        if (this.field370 == null) {
            return;
        }
        long var2 = class10.method47(arg0 + 18860);
        try {
            if (this.field401 != 0L) {
                if (this.field401 > var2) {
                    return;
                }
                this.method128(this.field397);
                this.field401 = 0L;
                this.field404 = true;
            }
            int var4 = this.method127();
            int var5 = this.field405 + this.field402;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field400 - var4 > this.field399) {
                this.field399 = this.field400 - var4;
            }
            if (var5 + 256 > this.field397) {
                this.field397 += 1024;
                var4 = 0;
                if (this.field397 > 16384) {
                    this.field397 = 16384;
                }
                this.method129();
                this.method128(this.field397);
                this.field404 = true;
                if (var5 + 256 > this.field397) {
                    var5 = this.field397 - 256;
                    this.field405 = var5 - this.field402;
                }
            }
            while (var5 > var4) {
                var4 += 256;
                this.method143(this.field370, 256);
                this.method130();
            }
            if (this.field408 < var2) {
                if (this.field404) {
                    this.field404 = false;
                } else if (this.field399 == 0 && this.field407 == 0) {
                    this.method129();
                    this.field401 = var2 + 2000L;
                    return;
                } else {
                    this.field405 = Math.min(this.field407, this.field399);
                    this.field407 = this.field399;
                }
                this.field399 = 0;
                this.field408 = var2 + 2000L;
            }
            if (arg0 != 29) {
                return;
            }
            this.field400 = var4;
        } catch (Exception var7) {
            this.method129();
            this.field401 = var2 + 2000L;
        }
        try {
            if (var2 > this.field382 + 500000L) {
                var2 = this.field382;
            }
            while (var2 > this.field382 + 5000L) {
                this.method145(256, arg0 + 79);
                this.field382 += 256000 / class140.field3224;
            }
        } catch (Exception var6) {
            this.field382 = var2;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public final synchronized void method149(int arg0) {
        this.field404 = true;
        field385++;
        try {
            this.method131();
            if (arg0 != 0) {
                this.field405 = 62;
            }
        } catch (Exception var2) {
            this.method129();
            this.field401 = class10.method47(18889) + 2000L;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BILac;)V")
    private final void method150(byte arg0, int arg1, class4 arg2) {
        field372++;
        int var4 = arg1 >> 5;
        if (arg0 > -124) {
            field389 = null;
        }
        class4 var5 = this.field403[var4];
        if (var5 == null) {
            this.field398[var4] = arg2;
        } else {
            var5.field58 = arg2;
        }
        this.field403[var4] = arg2;
        arg2.field59 = arg1;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "()V")
    public void method129() {
        field386++;
    }
}
