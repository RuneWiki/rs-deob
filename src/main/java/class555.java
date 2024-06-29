import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class555 {

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    private int field7841 = -1;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    private int field7838 = 0;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Ljia;")
    private class645 field7846 = new class645();

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Z")
    public boolean field7848 = false;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    private int field7834;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    private int field7843;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "[Lqe;")
    private class495[] field7833;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "[[[I")
    private int[][][] field7837;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Z")
    public static boolean field7835 = true;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field7840;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field7845;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Lda;")
    public static class67 field7842;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 6)
    public static final void method3194(byte arg0) {
        if (arg0 != -69) {
            return;
        }
        for (int var1 = 0; var1 < class57.field806; var1++) {
            class481 var3 = class531.field7189[var1];
            boolean var4 = false;
            if (var3.field6487 == null) {
                var3.field6495--;
                if (var3.field6495 >= (var3.method2756((byte) -127) ? -1500 : -10)) {
                    if (var3.field6489 == 1 && var3.field6498 == null) {
                        var3.field6498 = class40.method245(class312.field4256, var3.field6500, 0);
                        if (var3.field6498 == null) {
                            continue;
                        }
                        var3.field6495 += var3.field6498.method242();
                    } else if (var3.method2756((byte) -118) && (var3.field6496 == null || var3.field6499 == null)) {
                        if (var3.field6496 == null) {
                            var3.field6496 = class253.method1660(class295.field4032, var3.field6500);
                        }
                        if (var3.field6496 == null) {
                            continue;
                        }
                        if (var3.field6499 == null) {
                            var3.field6499 = var3.field6496.method1668(new int[] { 22050 });
                            if (var3.field6499 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field6495 < 0) {
                        int var5 = 8192;
                        int var7;
                        if (var3.field6486 == 0) {
                            var7 = var3.field6497 * (var3.field6489 == 3 ? class111.field1911.field6724.method925((byte) 102) : class111.field1911.field6762.method925((byte) 101)) >> 2;
                        } else {
                            int var6 = var3.field6486 >> 24 & 0x3;
                            if (class235.field3379.field7391 == var6) {
                                int var8 = (var3.field6486 & 0xFF) << 9;
                                int var9 = class235.field3379.method2342((byte) -121) << 8;
                                int var10 = var3.field6486 >> 16 & 0xFF;
                                int var11 = (var10 << 9) + var9 + 256 - class235.field3379.field7396;
                                int var12 = (var3.field6486 & 0xFF7A) >> 8;
                                int var13 = (var12 << 9) + var9 + 256 - class235.field3379.field7398;
                                int var14 = Math.abs(var11) + (Math.abs(var13) - 512);
                                if (var8 < var14) {
                                    var3.field6495 = -99999;
                                    continue;
                                }
                                if (var14 < 0) {
                                    var14 = 0;
                                }
                                var7 = (var8 - var14) * class111.field1911.field6766.method925((byte) 53) * var3.field6497 / var8 >> 2;
                                if (var3.field6490 != null && var3.field6490 instanceof class597) {
                                    class597 var15 = (class597) var3.field6490;
                                    short var16 = var15.field8368;
                                    short var17 = var15.field8369;
                                }
                                if (var11 != 0 || var13 != 0) {
                                    int var18 = -class460.field6249 - ((int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D)) - 4096 & 0x3FFF;
                                    if (var18 > 8192) {
                                        var18 = 16384 - var18;
                                    }
                                    int var19;
                                    if (var14 <= 0) {
                                        var19 = 8192;
                                    } else if (var14 >= 4096) {
                                        var19 = 16384;
                                    } else {
                                        var19 = ((8192 - var14) / 4096) + 8192;
                                    }
                                    var5 = (16384 - var19 >> 1) + var18 * var19 / 8192;
                                }
                            } else {
                                var7 = 0;
                            }
                        }
                        if (var7 > 0) {
                            class221 var20 = null;
                            if (var3.field6489 == 1) {
                                var20 = var3.field6498.method243().method1516(class508.field6983);
                            } else if (var3.method2756((byte) -121)) {
                                var20 = var3.field6499;
                            }
                            class161 var21 = var3.field6487 = class161.method1234(var20, var3.field6491, var7, var5);
                            var21.method1237(var3.field6488 - 1);
                            class456.field6213.method350(var21);
                        }
                    }
                } else {
                    var4 = true;
                }
            } else if (!var3.field6487.method1208(-104)) {
                var4 = true;
            }
            if (var4) {
                class57.field806--;
                for (int var22 = var1; var22 < class57.field806; var22++) {
                    class531.field7189[var22] = class531.field7189[var22 + 1];
                }
                var1--;
            }
        }
        field7836++;
        if (class299.field4117 && !class153.method1203((byte) -26)) {
            if (class111.field1911.field6752.method925((byte) 85) != 0 && class520.field7058 != -1) {
                if (class614.field8563 == null) {
                    class374.method2270(class520.field7058, 0, class357.field4898, arg0 ^ 0xFFFFFFBB, class111.field1911.field6752.method925((byte) 119), false);
                } else {
                    class594.method3393(class111.field1911.field6752.method925((byte) 124), (byte) -127, class520.field7058, false, class357.field4898, class614.field8563, 0);
                }
            }
            class614.field8563 = null;
            class299.field4117 = false;
        } else if (class111.field1911.field6752.method925((byte) 127) != 0 && class520.field7058 != -1 && !class153.method1203((byte) -26)) {
            class572.field8149++;
            class537 var2 = class476.method2729(class204.field3074, (byte) -46, class551.field7498);
            var2.field7295.method759(class520.field7058, 124);
            class173.method1314(false, var2);
            class520.field7058 = -1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 226)
    public static void method3195(int arg0) {
        field7842 = null;
        if (arg0 != -1) {
            field7835 = true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([Lkh;IB)V", line = 236)
    public static final void method3196(class17[] arg0, int arg1, byte arg2) {
        int var3 = 0;
        if (arg2 != 68) {
            field7845 = 15;
        }
        while (arg0.length > var3) {
            class17 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field352 == 0) {
                    if (var4.field320 != null) {
                        method3196(var4.field320, arg1, (byte) 68);
                    }
                    class637 var5 = (class637) class186.field2881.method337((long) var4.field372, 1);
                    if (var5 != null) {
                        class478.method2739(arg1, false, var5.field8789);
                    }
                }
                if (arg1 == 0 && var4.field322 != null) {
                    class255 var6 = new class255();
                    var6.field3583 = var4;
                    var6.field3586 = var4.field322;
                    class76.method644(var6);
                }
                if (arg1 == 1 && var4.field340 != null) {
                    label62: {
                        if (var4.field282 >= 0) {
                            class17 var7 = class379.method2309(var4.field372, 192);
                            if (var7 == null || var7.field320 == null || var4.field282 >= var7.field320.length || var7.field320[var4.field282] != var4) {
                                break label62;
                            }
                        }
                        class255 var8 = new class255();
                        var8.field3583 = var4;
                        var8.field3586 = var4.field340;
                        class76.method644(var8);
                    }
                }
            }
            var3++;
        }
        field7844++;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)[[[I", line = 315)
    public final int[][][] method3197(byte arg0) {
        field7839++;
        if (arg0 > -62) {
            return null;
        } else if (this.field7843 == this.field7834) {
            for (int var2 = 0; var2 < this.field7843; var2++) {
                this.field7833[var2] = class388.field5334;
            }
            return this.field7837;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 337)
    public final void method3198(boolean arg0) {
        field7840++;
        if (!arg0) {
            this.method3197((byte) 34);
        }
        for (int var2 = 0; var2 < this.field7843; var2++) {
            this.field7837[var2][0] = null;
            this.field7837[var2][1] = null;
            this.field7837[var2][2] = null;
            this.field7837[var2] = null;
        }
        this.field7833 = null;
        this.field7837 = null;
        this.field7846.method3590((byte) -120);
        this.field7846 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)[[I", line = 366)
    public final int[][] method3199(int arg0, byte arg1) {
        field7847++;
        if (arg1 != 103) {
            field7835 = true;
        }
        if (this.field7843 == this.field7834) {
            this.field7848 = this.field7833[arg0] == null;
            this.field7833[arg0] = class388.field5334;
            return this.field7837[arg0];
        } else if (this.field7843 == 1) {
            this.field7848 = this.field7841 != arg0;
            this.field7841 = arg0;
            return this.field7837[0];
        } else {
            class495 var3 = this.field7833[arg0];
            if (var3 == null) {
                this.field7848 = true;
                if (this.field7843 > this.field7838) {
                    var3 = new class495(arg0, this.field7838);
                    this.field7838++;
                } else {
                    class495 var4 = (class495) this.field7846.method3588((byte) -74);
                    var3 = new class495(arg0, var4.field6782);
                    this.field7833[var4.field6779] = null;
                    var4.method1207(103);
                }
                this.field7833[arg0] = var3;
            } else {
                this.field7848 = false;
            }
            this.field7846.method3587(0, var3);
            return this.field7837[var3.field6782];
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(III)V", line = 449)
    public class555(int arg0, int arg1, int arg2) {
        this.field7834 = arg1;
        this.field7843 = arg0;
        this.field7833 = new class495[this.field7834];
        this.field7837 = new int[this.field7843][3][arg2];
    }
}
