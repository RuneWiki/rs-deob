import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class389 {

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "Z")
    public boolean field5352 = false;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public int field5357 = -1;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    private int field5353 = 0;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    private int field5354 = 0;

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "I")
    private int field5366 = 128;

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "I")
    private int field5363 = 0;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
    private int field5356 = 128;

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "B")
    public byte field5371 = 0;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
    private int field5364 = -1;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5349 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!gt", name = "C", descriptor = "Z")
    public static boolean field5375 = false;

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "Lada;")
    public static class144 field5372 = new class144(32, 0);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "I")
    private int field5362;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "I")
    public int field5365;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!gt", name = "B", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "Lfn;")
    public class120 field5373;

    @OriginalMember(owner = "client!gt", name = "D", descriptor = "Lwca;")
    public static class583 field5376;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "[S")
    private short[] field5350;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "[S")
    private short[] field5351;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "[S")
    private short[] field5361;

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "[S")
    private short[] field5369;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
    public static final void method2315(int arg0) {
        class359.field4885 = 0;
        field5377++;
        class378.field5206 = new class300[50];
        int var1 = 16 % ((arg0 - 21) / 44);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lgw;B)V")
    public final void method2316(class148 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1032((byte) -33);
            if (var3 == 0) {
                field5360++;
                int var4 = -88 % ((arg1 + 80) / 45);
                return;
            }
            this.method2322(arg0, var3, -118);
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V")
    public static void method2317(int arg0) {
        field5349 = null;
        field5372 = null;
        if (arg0 <= -80) {
            field5376 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILsa;Lht;IIZLsa;ILqa;BZI)Lr;")
    private final class159 method2318(int arg0, int arg1, int arg2, class176 arg3, class499 arg4, int arg5, int arg6, boolean arg7, class176 arg8, int arg9, class208 arg10, byte arg11, boolean arg12, int arg13) {
        field5374++;
        int var15 = arg13;
        class78 var16 = this.field5357 == -1 || arg5 == -1 ? null : arg4.method2983(this.field5357, -119);
        boolean var17 = arg12 & this.field5371 != 0;
        if (var16 != null) {
            var15 = arg13 | var16.method600(false, arg9, arg5, false);
        }
        if (var17) {
            var15 |= this.field5371 == 3 ? 7 : 2;
        }
        if (this.field5366 != 128) {
            var15 |= 0x2;
        }
        if (arg7) {
            return null;
        }
        if (this.field5356 != 128 || this.field5353 != 0) {
            var15 |= 0x5;
        }
        class117 var18 = this.field5373.field1693;
        class159 var19;
        synchronized (this.field5373.field1693) {
            var19 = (class159) this.field5373.field1693.method842(0, (long) (this.field5365 |= arg10.field3090 << 29));
        }
        if (var19 == null || arg10.method528(var19.method90(), var15) != 0) {
            if (var19 != null) {
                var15 = arg10.method478(var15, var19.method90());
            }
            int var20 = var15;
            if (this.field5369 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field5361 != null) {
                var20 |= 0x8000;
            }
            class451 var21 = class537.method3254(this.field5362, (byte) 1, this.field5373.field1680, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field6378 < 13) {
                var21.method2730(0, 0);
            }
            var19 = arg10.method491(var21, var20, this.field5373.field1694, this.field5354 + 64, this.field5363 + 850);
            if (this.field5369 != null) {
                for (int var22 = 0; var22 < this.field5369.length; var22++) {
                    var19.method95(this.field5369[var22], this.field5350[var22]);
                }
            }
            if (this.field5361 != null) {
                for (int var23 = 0; var23 < this.field5361.length; var23++) {
                    var19.method80(this.field5361[var23], this.field5351[var23]);
                }
            }
            var19.method79(var15);
            class117 var24 = this.field5373.field1693;
            synchronized (this.field5373.field1693) {
                this.field5373.field1693.method835((byte) 117, (long) (this.field5365 |= arg10.field3090 << 29), var19);
            }
        }
        class159 var25 = var16 == null ? var19.method94(arg11, var15, true) : var16.method599(var15, arg9, (byte) -83, arg5, var19, arg11, arg2, 0);
        if (this.field5356 != 128 || this.field5366 != 128) {
            var25.method76(this.field5356, this.field5366, this.field5356);
        }
        if (this.field5353 != 0) {
            if (this.field5353 == 90) {
                var25.method61(4096);
            }
            if (this.field5353 == 180) {
                var25.method61(8192);
            }
            if (this.field5353 == 270) {
                var25.method61(12288);
            }
        }
        if (var17) {
            var25.method69(this.field5371, this.field5364, arg8, arg3, arg1, arg6, arg0);
        }
        var25.method79(arg13);
        return var25;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[[BLhf;)V")
    public static final void method2319(int arg0, byte[][] arg1, class335 arg2) {
        field5370++;
        if (arg0 != 4973) {
            field5349 = null;
        }
        int var3 = class58.field741.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class340.field4706[var4] >> 8) * 64 - class473.field6687;
                int var7 = (class340.field4706[var4] & 0xFF) * 64 - class38.field463;
                class539.method3268(5);
                arg2.method2041(class99.field1445, var6, class127.field1774, var7, var5, 109);
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILht;IIIBLqa;)Lr;")
    public final class159 method2320(int arg0, class499 arg1, int arg2, int arg3, int arg4, byte arg5, class208 arg6) {
        field5367++;
        if (arg5 != 0) {
            method2315(-117);
        }
        return this.method2318(0, 0, arg0, null, arg1, arg2, 0, false, null, arg3, arg6, (byte) 2, false, arg4);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IBIIIIIIIIIIII)V")
    public static final void method2321(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field5358++;
        if (class165.field2609 == null) {
            return;
        }
        class136 var14 = null;
        if (arg0 < 0) {
            int var15 = -arg0 - 1;
            if (class183.field2758 == var15) {
                var14 = class541.field8119;
            } else {
                var14 = class293.field4036[var15];
            }
        } else {
            int var16 = arg0 - 1;
            class505 var17 = (class505) class510.field7260.method2799((long) var16, true);
            if (var17 != null) {
                var14 = var17.field7148;
            }
        }
        if (var14 == null) {
            return;
        }
        class145 var18 = class216.field3172.method1505(-24044, arg3);
        int var19;
        int var20;
        if (arg10 == 1 || arg10 == 3) {
            var19 = var18.field2067;
            var20 = var18.field2108;
        } else {
            var19 = var18.field2108;
            var20 = var18.field2067;
        }
        int var21 = (var19 >> 1) + arg4;
        int var22 = (var19 + 1 >> 1) + arg4;
        int var23 = (var20 >> 1) + arg7;
        int var24 = (var20 + 1 >> 1) + arg7;
        class176 var25 = class165.field2609[arg6];
        int var26 = var25.method1239(var21, var23) + var25.method1239(var22, var23) + (var25.method1239(var21, var24) - -var25.method1239(var22, var24)) >> 2;
        class457 var27 = new class457();
        if (arg1 >= -4) {
            field5372 = null;
        }
        var27.field6451 = arg4;
        var27.field6449 = arg10;
        var27.field6464 = class617.field9123 + arg11;
        var27.field6457 = var14.field8501;
        var27.field6459 = arg7;
        var27.field6454 = arg3;
        var27.field6466 = class617.field9123 + arg12;
        var27.field6452 = arg9;
        if (arg2 > arg13) {
            int var28 = arg2;
            arg2 = arg13;
            arg13 = var28;
        }
        var27.field6446 = arg4 + arg13;
        var27.field6462 = arg2 + arg4;
        if (arg5 < arg8) {
            int var29 = arg8;
            arg8 = arg5;
            arg5 = var29;
        }
        var27.field6458 = (var27.field6451 << 7) + (var19 << 6);
        var27.field6456 = arg7 + arg8;
        var27.field6453 = (var27.field6459 << 7) + (var20 << 6);
        var27.field6461 = var26;
        var27.field6448 = arg5 + arg7;
        class140.field1988.method131(var27, 0);
        var14.field1949 = var27;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lgw;II)V")
    private final void method2322(class148 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field5362 = arg0.method1045(true);
        } else if (arg1 == 2) {
            this.field5357 = arg0.method1045(true);
        } else if (arg1 == 4) {
            this.field5356 = arg0.method1045(true);
        } else if (arg1 == 5) {
            this.field5366 = arg0.method1045(true);
        } else if (arg1 == 6) {
            this.field5353 = arg0.method1045(true);
        } else if (arg1 == 7) {
            this.field5354 = arg0.method1032((byte) -33);
        } else if (arg1 == 8) {
            this.field5363 = arg0.method1032((byte) -33);
        } else if (arg1 == 9) {
            this.field5371 = 3;
            this.field5364 = 8224;
        } else if (arg1 == 10) {
            this.field5352 = true;
        } else if (arg1 == 11) {
            this.field5371 = 1;
        } else if (arg1 == 12) {
            this.field5371 = 4;
        } else if (arg1 == 13) {
            this.field5371 = 5;
        } else if (arg1 == 14) {
            this.field5371 = 2;
            this.field5364 = arg0.method1032((byte) -33) * 256;
        } else if (arg1 == 15) {
            this.field5371 = 3;
            this.field5364 = arg0.method1045(true);
        } else if (arg1 == 16) {
            this.field5371 = 3;
            this.field5364 = arg0.method1026(-917302120);
        } else if (arg1 == 40) {
            int var4 = arg0.method1032((byte) -33);
            this.field5369 = new short[var4];
            this.field5350 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5369[var5] = (short) arg0.method1045(true);
                this.field5350[var5] = (short) arg0.method1045(true);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method1032((byte) -33);
            this.field5351 = new short[var6];
            this.field5361 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5361[var7] = (short) arg0.method1045(true);
                this.field5351[var7] = (short) arg0.method1045(true);
            }
        }
        field5368++;
        int var8 = -116 % ((-arg2 - 33) / 33);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIII)V")
    public static final void method2323(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 16) {
            return;
        }
        field5355++;
        int var4 = arg0 << 3;
        int var5 = arg3 << 3;
        int var6 = arg1 << 3;
        class539.field8023 = var6;
        if (class531.field7929 == 2) {
            class234.field3396 = var5;
            class517.field7371 = var4;
            class222.field3222 = var6;
        }
        class278.field3902 = var4;
        class84.method634(1);
        class24.field226 = true;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZILqa;ILsa;IILht;IILsa;II)Lr;")
    public final class159 method2324(boolean arg0, int arg1, class208 arg2, int arg3, class176 arg4, int arg5, int arg6, class499 arg7, int arg8, int arg9, class176 arg10, int arg11, int arg12) {
        if (arg8 == -1172910271) {
            field5359++;
            return this.method2318(arg9, arg3, arg6, arg10, arg7, arg1, arg11, false, arg4, arg5, arg2, (byte) 2, arg0, arg12);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lht;Lqa;IIIII)Lr;")
    public final class159 method2325(class499 arg0, class208 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 <= 40) {
            this.method2316(null, (byte) -76);
        }
        field5348++;
        return this.method2318(0, 0, arg5, null, arg0, arg2, 0, false, null, arg4, arg1, (byte) 5, false, arg6);
    }
}
