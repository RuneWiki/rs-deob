import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class117 extends class115 {

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "[S")
    private short[] field1386 = new short[257];

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
    private int field1382 = 0;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "I")
    public static int field1392 = 0;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "[I")
    private int[] field1380;

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "[I")
    private int[] field1387;

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "[[I")
    private int[][] field1391;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V", line = 3)
    public final void method140(int arg0) {
        ++field1389;
        if (this.field1391 == null) {
            this.field1391 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field1391.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field1382 == 2) {
                this.method659(0);
            }
            class170.method1131(arg0 ^ 256);
            this.method657(arg0 + arg0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 27)
    public class117() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLbk;I)V", line = 30)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg0 < 83) {
            method658((byte) -111);
        }
        ++field1390;
        if (~arg2 == -1) {
            this.field1382 = arg1.method1342((byte) -126);
            this.field1391 = new int[arg1.method1342((byte) -127)][2];
            for (int var4 = 0; var4 < this.field1391.length; ++var4) {
                this.field1391[var4][0] = arg1.method1355(32136);
                this.field1391[var4][1] = arg1.method1355(32136);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([S[Ljava/lang/String;I)V", line = 60)
    public static final void method655(short[] arg0, String[] arg1, int arg2) {
        if (arg2 > -8) {
            method658((byte) 90);
        }
        class16.method109(0, arg0, arg1.length - 1, arg1, (byte) 119);
        ++field1379;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 74)
    public static final boolean method656(String arg0, boolean arg1) {
        ++field1381;
        if (arg0 == null) {
            return false;
        } else {
            if (arg1) {
                method661((byte) 107, 47);
            }
            for (int var2 = 0; ~class166.field2326 < ~var2; ++var2) {
                if (arg0.equalsIgnoreCase(class19.field199[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class176.field2445[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)[I", line = 106)
    public final int[] method57(int arg0, int arg1) {
        ++field1383;
        if (arg1 != 0) {
            method662(-110, (class57) null);
        }
        int[] var3 = super.field1340.method14(41, arg0);
        if (super.field1340.field35) {
            int[] var4 = this.method631(true, 0, arg0);
            for (int var5 = 0; class218.field2979 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field1386[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "(I)V", line = 153)
    private final void method657(int arg0) {
        if (arg0 != 0) {
            this.field1391 = null;
        }
        int var2 = this.field1382;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field1391.length - 1 && var4 >= this.field1391[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field1391[var5 + -1];
                    int[] var7 = this.field1391[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = 4096 - class63.field726[255 & var8 >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field1386[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field1391.length - 1 && ~this.field1391[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field1391[var14 + -1];
                    int[] var16 = this.field1391[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field1386[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field1391.length + -1 && ~var21 <= ~this.field1391[var22][0]; ++var22) {
                }
                int[] var23 = this.field1391[var22 + -1];
                int[] var24 = this.field1391[var22];
                int var25 = this.method660(var22 - 2, (byte) -90)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method660(var22 + 1, (byte) -100)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 - (var25 - var26);
                int var32 = -var26 + var25 - var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var37 + var26 + var36;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field1386[var20] = (short) var38;
            }
        }
        ++field1388;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(B)V", line = 331)
    public static final void method658(byte arg0) {
        ++field1378;
        class331 var1 = class369.field5408;
        synchronized (class369.field5408) {
            class369.field5408.method2052(0);
        }
        int var2 = 103 % ((arg0 - -56) / 59);
    }

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "(I)V", line = 343)
    private final void method659(int arg0) {
        ++field1384;
        int[] var2 = this.field1391[0];
        int[] var3 = this.field1391[1];
        int[] var4 = this.field1391[this.field1391.length + -2];
        int[] var5 = this.field1391[this.field1391.length + -1];
        this.field1387 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - var3[1] + var2[1] };
        this.field1380 = new int[] { var4[0] - -var4[0] + -var5[arg0], var4[1] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)[I", line = 360)
    private final int[] method660(int arg0, byte arg1) {
        ++field1385;
        if (~arg0 > -1) {
            return this.field1387;
        } else {
            if (arg1 >= -12) {
                this.field1382 = -3;
            }
            return ~this.field1391.length >= ~arg0 ? this.field1380 : this.field1391[arg0];
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)Llm;", line = 388)
    public static final class290 method661(byte arg0, int arg1) {
        ++field1394;
        class290 var2 = (class290) class351.field5125.method2049(-123, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            if (arg0 < 27) {
                field1392 = -69;
            }
            byte[] var3 = class377.field5525.method361(36, 93, arg1);
            class290 var4 = new class290();
            var4.field4126 = arg1;
            if (var3 != null) {
                var4.method1857(new class211(var3), 15);
            }
            var4.method1855((byte) 94);
            class351.field5125.method2046((long) arg1, 0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILra;)V", line = 416)
    public static final void method662(int arg0, class57 arg1) {
        class404.field5892 = 0;
        class437.field6412 = 0;
        ++field1393;
        class268.field3774 = new class257();
        class402.field5866 = new class258[1024];
        if (arg0 == 18035) {
            class235.method1500(arg1, arg0 ^ 50803);
            class423.method2623(0, arg1);
        }
    }
}
