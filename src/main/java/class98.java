import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class98 implements class646 {

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "Lraa;")
    private class373 field1317;

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "[Lol;")
    private class262[] field1314;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!vfa", name = "j", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!vfa", name = "k", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "Lha;")
    private class570 field1313;

    @OriginalMember(owner = "client!vfa", name = "i", descriptor = "Z")
    private boolean field1320;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)I", line = 4)
    public final int method487(byte arg0) {
        field1322++;
        if (arg0 != -87) {
            this.method489(8, false);
        }
        int var2 = 0;
        class262[] var3 = this.field1314;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class262 var5 = var3[var4];
            if (var5 == null || var5.method1034(-32160)) {
                var2++;
            }
        }
        return var2 * 100 / this.field1314.length;
    }

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)V", line = 32)
    public final void method479(int arg0) {
        if (class576.field7320 != this.field1313) {
            this.field1313 = class576.field7320;
            this.field1320 = true;
        }
        field1321++;
        this.field1313.method907(0);
        if (arg0 != 21324) {
            this.field1317 = null;
        }
        class262[] var2 = this.field1314;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class262 var4 = var2[var3];
            if (var4 != null) {
                var4.method1035(arg0 + 6565);
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZ)V", line = 62)
    public final void method489(int arg0, boolean arg1) {
        boolean var3 = true;
        field1312++;
        int var4 = 71 % ((-arg0 - 60) / 61);
        class262[] var5 = this.field1314;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class262 var7 = var5[var6];
            if (var7 != null) {
                var7.method835(var3 || this.field1320, 24726);
            }
        }
        this.field1320 = false;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BJ)Z", line = 91)
    public final boolean method478(byte arg0, long arg1) {
        if (arg0 < 40) {
            return false;
        } else {
            field1316++;
            return class502.method2786(-7114) >= (arg1 + ((long) this.field1317.field4559));
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)I", line = 103)
    public final int method492(int arg0) {
        int var2 = 55 % ((-arg0 - 88) / 33);
        field1318++;
        return this.field1317.field4558;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III[B)Ljava/lang/String;", line = 115)
    public static final String method568(int arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -46 / ((arg0 - 56) / 34);
        field1315++;
        char[] var5 = new char[arg1];
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg1 + arg2;
        while (var7 < var8) {
            int var9 = arg3[var7++] & 0xFF;
            int var10;
            if (var9 >= 128) {
                if (var9 < 192) {
                    var10 = 65533;
                } else if (var9 >= 224) {
                    if (var9 < 240) {
                        if (var8 > (var7 + 1) && (arg3[var7] & 0xC0) == 128 && (arg3[var7 + 1] & 0xC0) == 128) {
                            var10 = (arg3[var7++] & 0x3F) << 6 | var9 & 0xF << 12 | arg3[var7++] & 0x3F;
                            if (var10 < 2048) {
                                var10 = 65533;
                            }
                        } else {
                            var10 = 65533;
                        }
                    } else if (var9 >= 248) {
                        var10 = 65533;
                    } else if (var8 > var7 + 2 && (arg3[var7] & 0xC0) == 128 && (arg3[var7 + 1] & 0xC0) == 128 && (arg3[var7 + 2] & 0xC0) == 128) {
                        int var11 = arg3[var7++] & 0x3F << 12 | (var9 & 0x7) << 18 | (arg3[var7++] & 0x3F) << 6 | arg3[var7++] & 0x3F;
                        if (var11 >= 65536 && var11 <= 1114111) {
                            var10 = 65533;
                        } else {
                            var10 = 65533;
                        }
                    } else {
                        var10 = 65533;
                    }
                } else if (var8 > var7 && (arg3[var7] & 0xC0) == 128) {
                    var10 = (var9 & 0x1F) << 6 | arg3[var7++] & 0x3F;
                    if (var10 < 128) {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (var9 == 0) {
                var10 = 65533;
            } else {
                var10 = var9;
            }
            var5[var6++] = (char) var10;
        }
        return new String(var5, 0, var6);
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V", line = 207)
    public final void method486(int arg0) {
        field1319++;
        if (arg0 <= 18) {
            this.field1320 = true;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lraa;Lfj;)V", line = 216)
    public class98(class373 arg0, class685 arg1) {
        this.field1317 = arg0;
        this.field1314 = new class262[this.field1317.field4561.length];
        for (int var3 = 0; var3 < this.field1314.length; var3++) {
            this.field1314[var3] = arg1.method3671(this.field1317.field4561[var3], (byte) 49);
        }
    }
}
