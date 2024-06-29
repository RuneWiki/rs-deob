import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class76 {

    @OriginalMember(owner = "client!hu", name = "w", descriptor = "Lwc;")
    private class46 field1031 = new class46();

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
    private int field1016;

    @OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "Lad;")
    private class268 field1019;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "Ls;")
    public static class169 field1017 = new class169(13, 7);

    @OriginalMember(owner = "client!hu", name = "v", descriptor = "Z")
    public static boolean field1030 = false;

    @OriginalMember(owner = "client!hu", name = "x", descriptor = "[I")
    public static int[] field1032 = new int[32];

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "Lis;")
    public static class318 field1028;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 8)
    public final Object method493(byte arg0, long arg1) {
        field1023++;
        class308 var4 = (class308) this.field1019.method1528(arg1, 90);
        if (var4 == null) {
            return null;
        }
        if (arg0 != 19) {
            this.method497(119);
        }
        Object var5 = var4.method961((byte) 124);
        if (var5 == null) {
            var4.method2614((byte) -117);
            var4.method2441((byte) -74);
            this.field1016 += var4.field4074;
            return null;
        }
        if (var4.method962((byte) -120)) {
            class165 var6 = new class165(var5, var4.field4074);
            this.field1019.method1525((byte) 19, var6, var4.field6047);
            this.field1031.method336(arg0 + 35, var6);
            var6.field5532 = 0L;
            var4.method2614((byte) -104);
            var4.method2441((byte) -97);
        } else {
            this.field1031.method336(arg0 + 13, var4);
            var4.field5532 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)I", line = 51)
    public final int method494(int arg0) {
        field1014++;
        int var2 = 0;
        if (arg0 != 65280) {
            return 111;
        }
        for (class308 var3 = (class308) this.field1031.method332(17948); var3 != null; var3 = (class308) this.field1031.method331((byte) 110)) {
            if (!var3.method962((byte) -120)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V", line = 82)
    public final void method495(int arg0) {
        field1020++;
        this.field1031.method337((byte) 97);
        this.field1019.method1519(-16576);
        if (arg0 >= -68) {
            this.field1019 = null;
        }
        this.field1016 = this.field1033;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V", line = 95)
    public final void method496(int arg0, int arg1) {
        if (class223.field2964 != null) {
            for (class308 var3 = (class308) this.field1031.method332(17948); var3 != null; var3 = (class308) this.field1031.method331((byte) 93)) {
                if (var3.method962((byte) -120)) {
                    if (var3.method961((byte) 108) == null) {
                        var3.method2614((byte) -72);
                        var3.method2441((byte) -105);
                        this.field1016++;
                    }
                } else if ((++var3.field5532) > ((long) arg0)) {
                    class308 var4 = class223.field2964.method64(-30694, var3);
                    this.field1019.method1525((byte) 19, var4, var3.field6047);
                    class147.method874(var3, var4, false);
                    var3.method2614((byte) -118);
                    var3.method2441((byte) -113);
                }
            }
        }
        int var5 = 90 / ((arg1 - 16) / 41);
        field1015++;
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)I", line = 145)
    public final int method497(int arg0) {
        if (arg0 == 0) {
            field1009++;
            return this.field1016;
        } else {
            return -117;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IILjava/lang/Object;J)V", line = 156)
    private final void method498(int arg0, int arg1, Object arg2, long arg3) {
        field1026++;
        if (arg1 > this.field1033) {
            throw new IllegalStateException("s>cs");
        }
        this.method507(arg3, -5);
        this.field1016 -= arg1;
        while (this.field1016 < 0) {
            class308 var7 = (class308) this.field1031.method334(27830);
            this.method506(false, var7);
        }
        class165 var6 = new class165(arg2, arg1);
        this.field1019.method1525((byte) 19, var6, arg3);
        this.field1031.method336(-116, var6);
        var6.field5532 = (long) arg0;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 182)
    public final Object method499(boolean arg0) {
        field1010++;
        if (!arg0) {
            this.method495(8);
        }
        class308 var2 = (class308) this.field1019.method1517(-30942);
        while (var2 != null) {
            Object var3 = var2.method961((byte) 116);
            if (var3 != null) {
                return var3;
            }
            class308 var4 = var2;
            var2 = (class308) this.field1019.method1517(-30942);
            var4.method2614((byte) -86);
            var4.method2441((byte) -82);
            this.field1016 += var2.field4074;
        }
        return null;
    }

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 214)
    public final Object method500(int arg0) {
        field1022++;
        class308 var2 = (class308) this.field1019.method1518((byte) -66);
        while (var2 != null) {
            Object var3 = var2.method961((byte) 107);
            if (var3 != null) {
                return var3;
            }
            class308 var4 = var2;
            var2 = (class308) this.field1019.method1517(-30942);
            var4.method2614((byte) -125);
            var4.method2441((byte) -79);
            this.field1016 += var2.field4074;
        }
        if (arg0 > -111) {
            method504(22);
        }
        return null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)I", line = 246)
    public final int method501(byte arg0) {
        if (arg0 != 52) {
            field1030 = false;
        }
        field1021++;
        return this.field1033;
    }

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "(I)V", line = 261)
    public final void method502(int arg0) {
        field1011++;
        if (arg0 != 0) {
            return;
        }
        for (class308 var2 = (class308) this.field1031.method332(17948); var2 != null; var2 = (class308) this.field1031.method331((byte) 122)) {
            if (var2.method962((byte) -120)) {
                var2.method2614((byte) -107);
                var2.method2441((byte) -115);
                this.field1016 += var2.field4074;
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "(I)V", line = 290)
    public static final void method503(int arg0) {
        field1029++;
        if (class461.field6250 != null) {
            return;
        }
        class461.field6250 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = arg0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var11 = var16;
                    var9 = var8;
                } else if (var14 == 1) {
                    var11 = var16;
                    var10 = var8;
                    var9 = var17;
                } else if (var14 == 2) {
                    var11 = var18;
                    var10 = var8;
                    var9 = var16;
                } else if (var14 == 3) {
                    var10 = var17;
                    var9 = var16;
                    var11 = var8;
                } else if (var14 == 4) {
                    var10 = var16;
                    var9 = var18;
                    var11 = var8;
                } else if (var14 == 5) {
                    var9 = var8;
                    var10 = var16;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class461.field6250[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "(I)V", line = 408)
    public static final void method504(int arg0) {
        field1027++;
        if (class93.field1368 >= 0) {
            long var1 = class440.method2583(25267);
            class93.field1368 = (int) ((long) class93.field1368 - (var1 - class402.field5523));
            if (class93.field1368 > 0) {
                int var3 = (class93.field1368 << 8) / class384.field5313;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class392.field5439 = ((class373.field5080 & 0xFF00) * var3 + (class169.field2336.field358 & 0xFF00) * var4 & 0xFF0000) + ((class373.field5080 & 0xFF00FF) * var3 + (class169.field2336.field358 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                float var6 = 1.0F - var5;
                class467.field6466 = (class169.field2336.field353 - class16.field227) * var6 + class16.field227;
                class37.field554 = class77.field1040 * var3 + class169.field2336.field352 * var4 >> 8;
                class476.field6568 = ((class21.field284 & 0xFF00FF) * var3 + (class169.field2336.field364 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class21.field284 & 0xFF00) * var3 + (class169.field2336.field364 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class48.field641 = (class169.field2336.field347 - class487.field6780) * var6 + class487.field6780;
                class18.field257 = (class169.field2336.field351 - class488.field6815) * var6 + class488.field6815;
                class162.field2261 = (class169.field2336.field361 - class8.field108) * var6 + class8.field108;
                class375.field5172 = (class169.field2336.field362 - class12.field165) * var6 + class12.field165;
                class30.field404 = (class169.field2336.field345 - class195.field2646) * var6 + class195.field2646;
                if (class69.field946 != class169.field2336.field355) {
                    class27.field357 = class453.field6147.method2098(class69.field946, class169.field2336.field355, var6, class27.field357);
                }
            } else {
                class27.field357 = class169.field2336.field355;
                class37.field554 = class169.field2336.field352;
                class476.field6568 = class169.field2336.field364;
                class93.field1368 = -1;
                class48.field641 = class169.field2336.field347;
                class375.field5172 = class169.field2336.field362;
                class162.field2261 = class169.field2336.field361;
                class392.field5439 = class169.field2336.field358;
                class18.field257 = class169.field2336.field351;
                class467.field6466 = class169.field2336.field353;
                class30.field404 = class169.field2336.field345;
            }
            class402.field5523 = var1;
        }
        if (arg0 != 16711680) {
            field1028 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(JLjava/lang/Object;I)V", line = 466)
    public final void method505(long arg0, Object arg1, int arg2) {
        this.method498(0, 1, arg1, arg0);
        field1013++;
        if (arg2 < 15) {
            this.method500(78);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZLeu;)V", line = 482)
    private final void method506(boolean arg0, class308 arg1) {
        if (arg1 != null) {
            arg1.method2614((byte) -87);
            arg1.method2441((byte) -97);
            this.field1016 += arg1.field4074;
        }
        if (arg0) {
            this.method506(false, (class308) null);
        }
        field1025++;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(JI)V", line = 501)
    private final void method507(long arg0, int arg1) {
        if (arg1 == -5) {
            field1012++;
            class308 var4 = (class308) this.field1019.method1528(arg0, 63);
            this.method506(false, var4);
        }
    }

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "(I)V", line = 514)
    public static final void method508(int arg0) {
        class76 var1 = class142.field2052;
        synchronized (class142.field2052) {
            class142.field2052.method495(-123);
            if (arg0 != -8953) {
                field1028 = null;
            }
        }
        field1018++;
        class76 var2 = class26.field324;
        synchronized (class26.field324) {
            class26.field324.method495(-82);
        }
    }

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "(I)V", line = 530)
    public static void method509(int arg0) {
        field1017 = null;
        field1028 = null;
        int var1 = -107 % ((arg0 - 36) / 52);
        field1032 = null;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(I)V", line = 546)
    public class76(int arg0) {
        this.field1016 = arg0;
        this.field1033 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field1019 = new class268(var2);
    }
}
