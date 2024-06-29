import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class49 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
    public static int[] field876 = new int[4096];

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "Lke;")
    public static class256 field900;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "Lke;")
    public static class256 field898;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "Z")
    public static boolean field897;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "J")
    private long field880;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "J")
    private long field882;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "Lqa;")
    public static class99 field895;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "Z")
    public boolean field892;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "[I")
    private int[] field886;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "[I")
    private int[] field888;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)I", line = 4)
    public final int method388(byte arg0) {
        field879++;
        int var2 = -35 % ((49 - arg0) / 63);
        return this.field889 == -1 ? (this.field886[4] << 20) + (this.field886[0] << 25) + (this.field888[11] << 5) + (this.field888[0] << 15) + this.field888[1] + (this.field888[8] << 10) : class321.method2230(this.field889, (byte) -91).field1385 + 305419896;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V", line = 20)
    public final void method389(int arg0, int arg1, int arg2) {
        field896++;
        int var4 = class222.field3891[arg2];
        if (this.field888[var4] != 0 && class165.method1208(arg1, 2) != null && arg0 < -50) {
            this.field888[var4] = class100.method721(Integer.MIN_VALUE, arg1);
            this.method390(true);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V", line = 43)
    private final void method390(boolean arg0) {
        field891++;
        long var2 = this.field880;
        this.field880 = -1L;
        long[] var4 = class292.field5038;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field880 = this.field880 >>> 8 ^ var4[(int) (((long) (this.field888[var5] >> 24) ^ this.field880) & 0xFFL)];
            this.field880 = this.field880 >>> 8 ^ var4[(int) ((this.field880 ^ (long) (this.field888[var5] >> 16)) & 0xFFL)];
            this.field880 = this.field880 >>> 8 ^ var4[(int) (((long) (this.field888[var5] >> 8) ^ this.field880) & 0xFFL)];
            this.field880 = var4[(int) (((long) this.field888[var5] ^ this.field880) & 0xFFL)] ^ this.field880 >>> 8;
        }
        if (!arg0) {
            this.method396((byte) -70, -94, (class117) null);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field880 = var4[(int) ((this.field880 ^ (long) this.field886[var6]) & 0xFFL)] ^ this.field880 >>> 8;
        }
        this.field880 = var4[(int) ((this.field880 ^ (long) (this.field892 ? 1 : 0)) & 0xFFL)] ^ this.field880 >>> 8;
        if (var2 != 0L && this.field880 != var2) {
            class59.field1071.method2082(var2, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZIILkd;I)V", line = 87)
    public static final void method391(int arg0, boolean arg1, int arg2, int arg3, class117 arg4, int arg5) {
        field899++;
        if (class23.field312 >= 50 || arg4.field2061 == null || arg3 >= arg4.field2061.length || arg4.field2061[arg3] == null) {
            return;
        }
        int var6 = arg4.field2061[arg3][0];
        int var7 = var6 >> 8;
        int var8 = (var6 & 0x75) >> 4;
        if (arg4.field2061[arg3].length > 1) {
            int var9 = (int) ((double) arg4.field2061[arg3].length * Math.random());
            if (var9 > 0) {
                var7 = arg4.field2061[arg3][var9];
            }
        }
        int var10 = var6 & 0xF;
        if (var10 == 0) {
            if (arg1) {
                class9.method61(var7, 0, var8, -111);
            }
        } else if (class70.field1292 != 0) {
            class34.field530[class23.field312] = var7;
            int var11 = (arg2 - 64) / 128;
            class105.field1875[class23.field312] = var8;
            class78.field1467[class23.field312] = 0;
            class54.field984[class23.field312] = null;
            if (arg5 != -11067) {
                method392((byte[]) null, (byte) -14, 44, -24);
            }
            int var12 = (arg0 - 64) / 128;
            class135.field2345[class23.field312] = (var12 << 16) + var10 + (var11 << 8);
            class23.field312++;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([BBII)Lke;", line = 146)
    public static final class256 method392(byte[] arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 92) {
            field890 = -35;
        }
        field885++;
        class256 var4 = new class256();
        var4.field4384 = 0;
        var4.field4380 = new byte[arg3];
        for (int var5 = arg2; var5 < (arg2 + arg3); var5++) {
            if (arg0[var5] != 0) {
                var4.field4380[var4.field4384++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 172)
    public static void method393(int arg0) {
        field895 = null;
        if (arg0 != -2044538552) {
            field894 = -22;
        }
        field900 = null;
        field876 = null;
        field898 = null;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V", line = 184)
    public static final void method394(boolean arg0) {
        if (arg0) {
            class41.field790 = class1.field4;
            class118.field2090 = class222.field3884;
            class240.field4095 = class237.field4041;
        } else {
            class41.field790 = class114.field2015;
            class118.field2090 = class72.field1329;
            class240.field4095 = class86.field1565;
        }
        class86.field1547 = class41.field790.length;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()V", line = 206)
    public static final void method395() {
        GL var0 = class253.field4319;
        var0.glDisableClientState(32886);
        class253.method1703(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class253.method1709();
        for (int var1 = 0; var1 < class86.field1565[0].length; var1++) {
            class113 var2 = class86.field1565[0][var1];
            if (var2.field2000 >= 0 && class136.field2373.method199(var2.field2000, (byte) 104) == 4) {
                var0.glColor4fv(class274.method1899(13093, var2.field1982), 0);
                float var3 = 201.5F - (var2.field1985 ? 1.0F : 0.5F);
                var2.method779(class41.field790, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class253.method1721();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class253.method1728();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BILkd;)Lha;", line = 243)
    public final class26 method396(byte arg0, int arg1, class117 arg2) {
        field893++;
        if (this.field889 != -1) {
            return class321.method2230(this.field889, (byte) -79).method560(arg2, arg1, 9998);
        }
        class26 var4 = (class26) class80.field1487.method2077(-13408, this.field880);
        if (arg0 != 57) {
            this.field889 = -73;
        }
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field888[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((var7 & Integer.MIN_VALUE) != 0 && !class165.method1208(var7 & 0x3FFFFFFF, 2).method1(0)) {
                        var5 = true;
                    }
                } else if (!class254.method1753(var7 & 0x3FFFFFFF, true).method250(this.field892, -58)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class315[] var8 = new class315[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field888[var10];
                if ((var11 & 0x40000000) != 0) {
                    class315 var13 = class254.method1753(var11 & 0x3FFFFFFF, true).method252(-1, this.field892);
                    if (var13 != null) {
                        var8[var9++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var11) != 0) {
                    class315 var12 = class165.method1208(var11 & 0x3FFFFFFF, arg0 - 55).method4((byte) -68);
                    if (var12 != null) {
                        var8[var9++] = var12;
                    }
                }
            }
            class315 var14 = new class315(var8, var9);
            for (int var15 = 0; var15 < 5; var15++) {
                if (class284.field4915[var15].length > this.field886[var15]) {
                    var14.method2175(class196.field3588[var15], class284.field4915[var15][this.field886[var15]]);
                }
                if (this.field886[var15] < class171.field3043[var15].length) {
                    var14.method2175(class34.field542[var15], class171.field3043[var15][this.field886[var15]]);
                }
            }
            var4 = var14.method2195(64, 768, -50, -10, -50);
            class80.field1487.method2074(var4, this.field880, -1);
        }
        if (arg2 != null) {
            var4 = arg2.method798(arg1, var4, arg0 ^ 0x989646);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BIILkd;I)Lha;", line = 354)
    public final class26 method397(byte arg0, int arg1, int arg2, class117 arg3, int arg4) {
        field881++;
        long var6 = (long) arg2 << 32 | (long) (arg4 << 16) | (long) arg2;
        class26 var8 = (class26) class80.field1487.method2077(-13408, var6);
        if (var8 == null) {
            class315[] var9 = new class315[2];
            int var10 = 0;
            if (!class165.method1208(arg2, 2).method1(0) || !class165.method1208(arg4, 2).method1(arg0 ^ 0xFFFFFF97)) {
                return null;
            }
            class315 var11 = class165.method1208(arg2, arg0 ^ 0xFFFFFF95).method4((byte) -68);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class315 var12 = class165.method1208(arg4, 2).method4((byte) -68);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class315 var13 = new class315(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field886[var14] < class284.field4915[var14].length) {
                    var13.method2175(class196.field3588[var14], class284.field4915[var14][this.field886[var14]]);
                }
                if (class171.field3043[var14].length > this.field886[var14]) {
                    var13.method2175(class34.field542[var14], class171.field3043[var14][this.field886[var14]]);
                }
            }
            var8 = var13.method2195(64, 768, -50, -10, -50);
            class80.field1487.method2074(var8, var6, arg0 ^ 0x68);
        }
        if (arg3 != null) {
            var8 = arg3.method798(arg1, var8, 9999999);
        }
        return arg0 == -105 ? var8 : (class26) null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBLkd;ZILkd;)Lha;", line = 417)
    public final class26 method398(int arg0, byte arg1, class117 arg2, boolean arg3, int arg4, class117 arg5) {
        field877++;
        if (this.field889 != -1) {
            return class321.method2230(this.field889, (byte) -26).method551(arg4, arg2, arg5, true, arg0);
        }
        long var7 = this.field880;
        int[] var9 = this.field888;
        if (arg2 != null && (arg2.field2042 >= 0 || arg2.field2065 >= 0)) {
            var9 = new int[12];
            for (int var10 = 0; var10 < 12; var10++) {
                var9[var10] = this.field888[var10];
            }
            if (arg2.field2042 >= 0) {
                if (arg2.field2042 == 65535) {
                    var9[5] = 0;
                    var7 ^= 0xFFFFFFFF00000000L;
                } else {
                    var9[5] = class100.method721(arg2.field2042, 1073741824);
                    var7 ^= (long) var9[5] << 32;
                }
            }
            if (arg2.field2065 >= 0) {
                if (arg2.field2065 == 65535) {
                    var7 ^= 0xFFFFFFFFL;
                    var9[3] = 0;
                } else {
                    var9[3] = class100.method721(arg2.field2065, 1073741824);
                    var7 ^= (long) var9[3];
                }
            }
        }
        class26 var11 = (class26) class59.field1071.method2077(-13408, var7);
        if (var11 == null) {
            boolean var12 = false;
            for (int var13 = 0; var13 < 12; var13++) {
                int var14 = var9[var13];
                if ((var14 & 0x40000000) == 0) {
                    if ((var14 & Integer.MIN_VALUE) != 0 && !class165.method1208(var14 & 0x3FFFFFFF, 2).method6((byte) 46)) {
                        var12 = true;
                    }
                } else if (!class254.method1753(var14 & 0x3FFFFFFF, true).method264(this.field892, (byte) -32)) {
                    var12 = true;
                }
            }
            if (var12) {
                if (this.field882 != -1L) {
                    var11 = (class26) class59.field1071.method2077(-13408, this.field882);
                }
                if (var11 == null) {
                    return null;
                }
            }
            if (var11 == null) {
                int var15 = 0;
                class315[] var16 = new class315[12];
                for (int var17 = 0; var17 < 12; var17++) {
                    int var18 = var9[var17];
                    if ((var18 & 0x40000000) != 0) {
                        class315 var20 = class254.method1753(var18 & 0x3FFFFFFF, true).method261(this.field892, (byte) -94);
                        if (var20 != null) {
                            var16[var15++] = var20;
                        }
                    } else if ((var18 & Integer.MIN_VALUE) != 0) {
                        class315 var19 = class165.method1208(var18 & 0x3FFFFFFF, 2).method2(0);
                        if (var19 != null) {
                            var16[var15++] = var19;
                        }
                    }
                }
                class315 var21 = new class315(var16, var15);
                for (int var22 = 0; var22 < 5; var22++) {
                    if (class284.field4915[var22].length > this.field886[var22]) {
                        var21.method2175(class196.field3588[var22], class284.field4915[var22][this.field886[var22]]);
                    }
                    if (class171.field3043[var22].length > this.field886[var22]) {
                        var21.method2175(class34.field542[var22], class171.field3043[var22][this.field886[var22]]);
                    }
                }
                var11 = var21.method2195(64, 850, -30, -50, -30);
                if (class253.field4323) {
                    ((class149) var11).method1087(false, false, true, true, false, false, true);
                }
                if (arg3) {
                    class59.field1071.method2074(var11, var7, -1);
                    this.field882 = var7;
                }
            }
        }
        int var23 = 83 % ((6 - arg1) / 53);
        if (arg2 == null && arg5 == null) {
            return var11;
        }
        class26 var24;
        if (arg2 != null && arg5 != null) {
            var24 = arg2.method796((byte) -74, var11, arg0, arg4, arg5);
        } else if (arg2 == null) {
            var24 = arg5.method801(var11, (byte) 49, arg4);
        } else {
            var24 = arg2.method801(var11, (byte) 118, arg0);
        }
        return var24;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZBI[I[I)V", line = 618)
    public final void method399(boolean arg0, byte arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 != -23) {
            method395();
        }
        field883++;
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class255.field4372; var7++) {
                    class1 var8 = class165.method1208(var7, 2);
                    if (var8 != null && !var8.field21 && var8.field5 == (arg0 ? 7 : 0) + var6) {
                        arg3[class222.field3891[var6]] = class100.method721(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field888 = arg3;
        this.field892 = arg0;
        this.field889 = arg2;
        this.field886 = arg4;
        this.method390(true);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field876[var0] = class78.method590(false, var0);
        }
        field900 = class316.method2202("clignotant2:", 27626);
        field898 = class316.method2202("::cardmem", 27626);
        field897 = false;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BZ)V", line = 693)
    public final void method400(byte arg0, boolean arg1) {
        if (arg0 != -21) {
            this.field880 = 73L;
        }
        this.field892 = arg1;
        this.method390(true);
        field878++;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)V", line = 722)
    public final void method401(int arg0, int arg1, int arg2) {
        this.field886[arg0] = arg1;
        this.method390(true);
        if (arg2 != -5578) {
            this.method390(true);
        }
        field884++;
    }
}
