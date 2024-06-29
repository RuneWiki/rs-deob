import java.util.Date;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 {

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "[[I")
    private int[][] field1230;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lu;")
    public static class135 field1224 = class87.method676((byte) -57, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Lu;")
    public static class135 field1222 = class87.method676((byte) -90, "hel");

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Lu;")
    public static class135 field1238 = class87.method676((byte) -89, " ");

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
    public static int[] field1226 = new int[2000];

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field1231 = 50;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Lu;")
    public static class135 field1234 = class87.method676((byte) -55, "backhmid1");

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field1240 = 1;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1237 = new CRC32();

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "[I")
    public static int[] field1225;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "[[[B")
    public static byte[][][] field1241;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B[B)[B")
    public final byte[] method397(byte arg0, byte[] arg1) {
        if (this.field1230 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1227 / (long) this.field1232) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field1230[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1227 + var6;
                int var14 = var13 / this.field1232;
                var6 = var13 - this.field1232 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        field1223++;
        if (arg0 != -101) {
            method398(false, -40, -17, -124);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZIII)Lu;")
    public static final class135 method398(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 1 || arg3 > 36) {
            arg3 = 10;
        }
        field1229++;
        int var4 = 1;
        for (int var5 = arg1 / arg3; var5 != 0; var5 /= arg3) {
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        if (arg2 != -1001) {
            field1236 = 1;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg1 % arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            arg1 /= arg3;
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class135 var9 = new class135();
        var9.field3266 = var7;
        var9.field3255 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lve;[Ljava/lang/Object;IILve;II)V")
    public static final void method399(class146 arg0, Object[] arg1, int arg2, int arg3, class146 arg4, int arg5, int arg6) {
        int var7 = (Integer) arg1[0];
        field1233++;
        class152 var8 = class97.method797(var7, (byte) 102);
        if (var8 == null) {
            return;
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = -1;
        int[] var12 = var8.field3744;
        int[] var13 = var8.field3738;
        byte var14 = -1;
        try {
            if (arg5 != -2147483645) {
                field1234 = null;
            }
            class65.field1608 = new int[var8.field3741];
            int var15 = 0;
            int var16 = 0;
            class119.field2843 = new class135[var8.field3737];
            for (int var17 = 1; var17 < arg1.length; var17++) {
                if (arg1[var17] instanceof Integer) {
                    int var18 = (Integer) arg1[var17];
                    if (var18 == -2147483647) {
                        var18 = arg6;
                    }
                    if (var18 == -2147483646) {
                        var18 = arg2;
                    }
                    if (var18 == -2147483645) {
                        var18 = arg0 == null ? -1 : arg0.field3595;
                    }
                    if (var18 == -2147483644) {
                        var18 = arg3;
                    }
                    if (var18 == -2147483643) {
                        var18 = arg0 == null ? -1 : arg0.field3580;
                    }
                    if (var18 == -2147483642) {
                        var18 = arg4 == null ? -1 : arg4.field3595;
                    }
                    if (var18 == -2147483641) {
                        var18 = arg4 == null ? -1 : arg4.field3580;
                    }
                    class65.field1608[var15++] = var18;
                } else if (arg1[var17] instanceof class135) {
                    class119.field2843[var16++] = (class135) arg1[var17];
                }
            }
            int var19 = 0;
            label1308: while (true) {
                var19++;
                if (var19 > 200000) {
                    throw new RuntimeException("slow");
                }
                var11++;
                int var196 = var13[var11];
                if (var196 < 100) {
                    if (var196 == 0) {
                        class30.field724[var9++] = var12[var11];
                        continue;
                    }
                    if (var196 == 1) {
                        int var20 = var12[var11];
                        class30.field724[var9++] = class104.field2513[var20];
                        continue;
                    }
                    if (var196 == 2) {
                        int var21 = var12[var11];
                        var9--;
                        class104.field2513[var21] = class30.field724[var9];
                        continue;
                    }
                    if (var196 == 3) {
                        class87.field2076[var10++] = var8.field3750[var11];
                        continue;
                    }
                    if (var196 == 6) {
                        var11 += var12[var11];
                        continue;
                    }
                    if (var196 == 7) {
                        var9 -= 2;
                        if (class30.field724[var9 + 1] != class30.field724[var9]) {
                            var11 += var12[var11];
                        }
                        continue;
                    }
                    if (var196 == 8) {
                        var9 -= 2;
                        if (class30.field724[var9 + 1] == class30.field724[var9]) {
                            var11 += var12[var11];
                        }
                        continue;
                    }
                    if (var196 == 9) {
                        var9 -= 2;
                        if (class30.field724[var9 + 1] > class30.field724[var9]) {
                            var11 += var12[var11];
                        }
                        continue;
                    }
                    if (var196 == 10) {
                        var9 -= 2;
                        if (class30.field724[var9] > class30.field724[var9 + 1]) {
                            var11 += var12[var11];
                        }
                        continue;
                    }
                    if (var196 == 21) {
                        if (class9.field157 == 0) {
                            return;
                        }
                        class96 var22 = class138.field3359[--class9.field157];
                        class119.field2843 = var22.field2333;
                        class65.field1608 = var22.field2325;
                        var8 = var22.field2322;
                        var11 = var22.field2335;
                        var13 = var8.field3738;
                        var12 = var8.field3744;
                        continue;
                    }
                    if (var196 == 25) {
                        int var23 = var12[var11];
                        class30.field724[var9++] = class135.method1098(var23, 57);
                        continue;
                    }
                    if (var196 == 27) {
                        int var24 = var12[var11];
                        var9--;
                        class94.method773(var24, class30.field724[var9], true);
                        continue;
                    }
                    if (var196 == 31) {
                        var9 -= 2;
                        if (class30.field724[var9] <= class30.field724[var9 + 1]) {
                            var11 += var12[var11];
                        }
                        continue;
                    }
                    if (var196 == 32) {
                        var9 -= 2;
                        if (class30.field724[var9] >= class30.field724[var9 + 1]) {
                            var11 += var12[var11];
                        }
                        continue;
                    }
                    if (var196 == 33) {
                        class30.field724[var9++] = class65.field1608[var12[var11]];
                        continue;
                    }
                    int var10001;
                    if (var196 == 34) {
                        var10001 = var12[var11];
                        var9--;
                        class65.field1608[var10001] = class30.field724[var9];
                        continue;
                    }
                    if (var196 == 35) {
                        class87.field2076[var10++] = class119.field2843[var12[var11]];
                        continue;
                    }
                    if (var196 == 36) {
                        var10001 = var12[var11];
                        var10--;
                        class119.field2843[var10001] = class87.field2076[var10];
                        continue;
                    }
                    if (var196 == 37) {
                        int var25 = var12[var11];
                        var10 -= var25;
                        class135 var26 = class85.method667(var10, class87.field2076, (byte) -114, var25);
                        class87.field2076[var10++] = var26;
                        continue;
                    }
                    if (var196 == 38) {
                        var9--;
                        continue;
                    }
                    if (var196 == 39) {
                        var10--;
                        continue;
                    }
                    if (var196 == 40) {
                        int var27 = var12[var11];
                        class152 var28 = class97.method797(var27, (byte) 121);
                        int[] var29 = new int[var28.field3741];
                        class135[] var30 = new class135[var28.field3737];
                        for (int var31 = 0; var31 < var28.field3749; var31++) {
                            var29[var31] = class30.field724[var9 + var31 - var28.field3749];
                        }
                        for (int var32 = 0; var32 < var28.field3745; var32++) {
                            var30[var32] = class87.field2076[var10 + var32 - var28.field3745];
                        }
                        var9 -= var28.field3749;
                        var10 -= var28.field3745;
                        class96 var33 = new class96();
                        var33.field2335 = var11;
                        var33.field2325 = class65.field1608;
                        var11 = -1;
                        var33.field2322 = var8;
                        var8 = var28;
                        var33.field2333 = class119.field2843;
                        class138.field3359[class9.field157++] = var33;
                        var12 = var28.field3744;
                        class119.field2843 = var30;
                        class65.field1608 = var29;
                        var13 = var28.field3738;
                        continue;
                    }
                    if (var196 == 42) {
                        class30.field724[var9++] = class79.field1881[var12[var11]];
                        continue;
                    }
                    if (var196 == 43) {
                        var10001 = var12[var11];
                        var9--;
                        class79.field1881[var10001] = class30.field724[var9];
                        continue;
                    }
                    if (var196 == 44) {
                        int var34 = var12[var11] >> 16;
                        int var35 = var12[var11] & 0xFFFF;
                        var9--;
                        int var36 = class30.field724[var9];
                        if (var36 >= 0 && var36 <= 5000) {
                            class17.field373[var34] = var36;
                            byte var37 = -1;
                            if (var35 == 105) {
                                var37 = 0;
                            }
                            int var38 = 0;
                            while (true) {
                                if (var38 >= var36) {
                                    continue label1308;
                                }
                                client.field524[var34][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var196 == 45) {
                        var9--;
                        int var39 = class30.field724[var9];
                        int var40 = var12[var11];
                        if (var39 >= 0 && class17.field373[var40] > var39) {
                            class30.field724[var9++] = client.field524[var40][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var196 == 46) {
                        int var41 = var12[var11];
                        var9 -= 2;
                        int var42 = class30.field724[var9];
                        if (var42 >= 0 && class17.field373[var41] > var42) {
                            client.field524[var41][var42] = class30.field724[var9 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                }
                boolean var43;
                if (var12[var11] == 1) {
                    var43 = true;
                } else {
                    var43 = false;
                }
                if (var196 < 1000) {
                    if (var196 == 100) {
                        var9 -= 3;
                        int var181 = class30.field724[var9 + 1];
                        int var182 = class30.field724[var9];
                        int var183 = class30.field724[var9 + 2];
                        if (var181 == 0) {
                            throw new RuntimeException();
                        }
                        class146 var184 = class48.method360(-114, var182);
                        if (var184.field3574 == null) {
                            var184.field3574 = new class146[var183 + 1];
                        }
                        if (var184.field3574.length <= var183) {
                            class146[] var185 = new class146[var183 + 1];
                            for (int var186 = 0; var186 < var184.field3574.length; var186++) {
                                var185[var186] = var184.field3574[var186];
                            }
                            var184.field3574 = var185;
                        }
                        if (var183 > 0 && var184.field3574[var183 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var183 - 1));
                        }
                        class146 var187 = new class146();
                        var187.field3628 = true;
                        var187.field3564 = var181;
                        var187.field3580 = var183;
                        var187.field3611 = var187.field3595 = var184.field3595;
                        var184.field3574[var183] = var187;
                        if (var43) {
                            class141.field3463 = var187;
                        } else {
                            class78.field1847 = var187;
                        }
                        class37.method283(-104, var184);
                        continue;
                    }
                    if (var196 == 101) {
                        class146 var188 = var43 ? class141.field3463 : class78.field1847;
                        class146 var189 = class48.method360(-98, var188.field3595);
                        var189.field3574[var188.field3580] = null;
                        class37.method283(-107, var189);
                        continue;
                    }
                    if (var196 == 102) {
                        var9--;
                        class146 var190 = class48.method360(-111, class30.field724[var9]);
                        var190.field3574 = null;
                        class37.method283(-79, var190);
                        continue;
                    }
                    if (var196 == 200) {
                        var9 -= 2;
                        int var191 = class30.field724[var9 + 1];
                        int var192 = class30.field724[var9];
                        class146 var193 = class28.method227(var191, (byte) -113, var192);
                        if (var193 != null && var191 != -1) {
                            class30.field724[var9++] = 1;
                            if (var43) {
                                class141.field3463 = var193;
                            } else {
                                class78.field1847 = var193;
                            }
                            continue;
                        }
                        class30.field724[var9++] = 0;
                        continue;
                    }
                } else if (var196 >= 1000 && var196 < 1100 || !(var196 < 2000 || var196 >= 2100)) {
                    class146 var180;
                    if (var196 < 2000) {
                        var180 = var43 ? class141.field3463 : class78.field1847;
                    } else {
                        var9--;
                        var180 = class48.method360(-75, class30.field724[var9]);
                        var196 -= 1000;
                    }
                    class37.method283(arg5 + 2147483573, var180);
                    if (var196 == 1000) {
                        var9 -= 2;
                        var180.field3575 = class30.field724[var9];
                        var180.field3669 = class30.field724[var9 + 1];
                        continue;
                    }
                    if (var196 == 1001) {
                        var9 -= 2;
                        var180.field3623 = class30.field724[var9];
                        var180.field3661 = class30.field724[var9 + 1];
                        continue;
                    }
                    if (var196 == 1003) {
                        var9--;
                        var180.field3578 = class30.field724[var9] == 1;
                        continue;
                    }
                } else if (var196 >= 1100 && var196 < 1200 || var196 >= 2100 && var196 < 2200) {
                    class146 var179;
                    if (var196 < 2000) {
                        var179 = var43 ? class141.field3463 : class78.field1847;
                    } else {
                        var9--;
                        var179 = class48.method360(-119, class30.field724[var9]);
                        var196 -= 1000;
                    }
                    class37.method283(-105, var179);
                    if (var196 == 1100) {
                        var9 -= 2;
                        var179.field3664 = class30.field724[var9];
                        if (var179.field3664 > var179.field3555 - var179.field3623) {
                            var179.field3664 = var179.field3555 - var179.field3623;
                        }
                        if (var179.field3664 < 0) {
                            var179.field3664 = 0;
                        }
                        var179.field3671 = class30.field724[var9 + 1];
                        if (var179.field3619 - var179.field3661 < var179.field3671) {
                            var179.field3671 = var179.field3619 - var179.field3661;
                        }
                        if (var179.field3671 < 0) {
                            var179.field3671 = 0;
                        }
                        continue;
                    }
                    if (var196 == 1101) {
                        var9--;
                        var179.field3635 = class30.field724[var9];
                        continue;
                    }
                    if (var196 == 1102) {
                        var9--;
                        var179.field3641 = class30.field724[var9] == 1;
                        continue;
                    }
                    if (var196 == 1103) {
                        var9--;
                        var179.field3663 = class30.field724[var9];
                        continue;
                    }
                    if (var196 == 1104) {
                        var9--;
                        var179.field3603 = class30.field724[var9];
                        continue;
                    }
                    if (var196 == 1105) {
                        var9--;
                        var179.field3658 = class30.field724[var9];
                        continue;
                    }
                    if (var196 == 1106) {
                        var9--;
                        var179.field3600 = class30.field724[var9];
                        continue;
                    }
                    if (var196 == 1107) {
                        var9--;
                        var179.field3599 = class30.field724[var9] == 1;
                        continue;
                    }
                    if (var196 == 1108) {
                        var179.field3551 = 1;
                        var9--;
                        var179.field3625 = class30.field724[var9];
                        continue;
                    }
                    if (var196 == 1109) {
                        var9 -= 6;
                        var179.field3589 = class30.field724[var9];
                        var179.field3607 = class30.field724[var9 + 1];
                        var179.field3654 = class30.field724[var9 + 2];
                        var179.field3593 = class30.field724[var9 + 3];
                        var179.field3581 = class30.field724[var9 + 4];
                        var179.field3655 = class30.field724[var9 + 5];
                        continue;
                    }
                    if (var196 == 1110) {
                        var9--;
                        var179.field3624 = class30.field724[var9];
                        continue;
                    }
                    if (var196 == 1111) {
                        var9--;
                        var179.field3559 = class30.field724[var9] == 1;
                        continue;
                    }
                    if (var196 == 1112) {
                        var10--;
                        var179.field3568 = class87.field2076[var10];
                        continue;
                    }
                    if (var196 == 1113) {
                        var9--;
                        var179.field3633 = class30.field724[var9];
                        continue;
                    }
                    if (var196 == 1114) {
                        var9 -= 3;
                        var179.field3649 = class30.field724[var9];
                        var179.field3666 = class30.field724[var9 + 1];
                        var179.field3591 = class30.field724[var9 + 2];
                        continue;
                    }
                    if (var196 == 1115) {
                        var9--;
                        var179.field3549 = class30.field724[var9] == 1;
                        continue;
                    }
                    if (var196 == 1116) {
                        var9--;
                        var179.field3629 = class30.field724[var9];
                        continue;
                    }
                    if (var196 == 1117) {
                        var9--;
                        var179.field3606 = class30.field724[var9];
                        continue;
                    }
                    if (var196 == 1118) {
                        var9--;
                        var179.field3630 = class30.field724[var9] == 1;
                        continue;
                    }
                    if (var196 == 1119) {
                        var9--;
                        var179.field3651 = class30.field724[var9] == 1;
                        continue;
                    }
                    if (var196 == 1120) {
                        var9 -= 2;
                        var179.field3555 = class30.field724[var9];
                        var179.field3619 = class30.field724[var9 + 1];
                        continue;
                    }
                } else if (var196 >= 1200 && var196 < 1300 || var196 >= 2200 && var196 < 2300) {
                    class146 var44;
                    if (var196 < 2000) {
                        var44 = var43 ? class141.field3463 : class78.field1847;
                    } else {
                        var196 -= 1000;
                        var9--;
                        var44 = class48.method360(-98, class30.field724[var9]);
                    }
                    class37.method283(arg5 ^ 0x7FFFFF96, var44);
                    if (var196 == 1200) {
                        var9 -= 2;
                        int var45 = class30.field724[var9 + 1];
                        int var46 = class30.field724[var9];
                        var44.field3582 = var45;
                        var44.field3618 = var46;
                        class94 var47 = class41.method306(-92, var46);
                        var44.field3654 = var47.field2229;
                        var44.field3593 = var47.field2221;
                        var44.field3581 = var47.field2222;
                        var44.field3655 = var47.field2241;
                        var44.field3589 = var47.field2248;
                        var44.field3607 = var47.field2252;
                        if (var44.field3623 > 0) {
                            var44.field3655 = var44.field3655 * 32 / var44.field3623;
                        }
                        continue;
                    }
                    if (var196 == 1201) {
                        var44.field3551 = 2;
                        var9--;
                        var44.field3625 = class30.field724[var9];
                        continue;
                    }
                    if (var196 == 1202) {
                        var44.field3551 = 3;
                        var44.field3625 = class116.field2789.field3526.method203((byte) -74);
                        continue;
                    }
                } else {
                    int var10000;
                    if (var196 >= 1300 && var196 < 1400 || var196 >= 2300 && var196 < 2400) {
                        class146 var175;
                        if (var196 >= 2000) {
                            var10000 = arg5 + 2147483554;
                            var9--;
                            var175 = class48.method360(var10000, class30.field724[var9]);
                            var196 -= 1000;
                        } else {
                            var175 = var43 ? class141.field3463 : class78.field1847;
                        }
                        if (var196 == 1300) {
                            var9--;
                            int var176 = class30.field724[var9] - 1;
                            if (var176 >= 0 && var176 <= 9) {
                                var10--;
                                var175.method1197(class87.field2076[var10], var176, true);
                                continue;
                            }
                            var10--;
                            continue;
                        }
                        if (var196 == 1301) {
                            var9 -= 2;
                            int var177 = class30.field724[var9];
                            int var178 = class30.field724[var9 + 1];
                            var175.field3615 = class28.method227(var178, (byte) -101, var177);
                            continue;
                        }
                        if (var196 == 1302) {
                            var9--;
                            var175.field3656 = class30.field724[var9] == 1;
                            continue;
                        }
                        if (var196 == 1303) {
                            var9--;
                            var175.field3554 = class30.field724[var9];
                            continue;
                        }
                        if (var196 == 1304) {
                            var9--;
                            var175.field3552 = class30.field724[var9];
                            continue;
                        }
                        if (var196 == 1305) {
                            var10--;
                            var175.field3565 = class87.field2076[var10];
                            continue;
                        }
                        if (var196 == 1306) {
                            var10--;
                            var175.field3648 = class87.field2076[var10];
                            continue;
                        }
                    } else {
                        if (var196 >= 1400 && var196 < 1500 || var196 >= 2400 && var196 < 2500) {
                            class146 var48;
                            if (var196 < 2000) {
                                var48 = var43 ? class141.field3463 : class78.field1847;
                            } else {
                                var9--;
                                var48 = class48.method360(-122, class30.field724[var9]);
                                var196 -= 1000;
                            }
                            var10--;
                            class135 var49 = class87.field2076[var10];
                            Object[] var50 = new Object[var49.method1063(-64) + 1];
                            for (int var51 = var50.length - 1; var51 >= 1; var51--) {
                                if (var49.method1071(61, var51 - 1) == 115) {
                                    var10--;
                                    var50[var51] = class87.field2076[var10];
                                } else {
                                    var9--;
                                    var50[var51] = Integer.valueOf(class30.field724[var9]);
                                }
                            }
                            var9--;
                            int var52 = class30.field724[var9];
                            if (var52 == -1) {
                                var50 = null;
                            } else {
                                var50[0] = Integer.valueOf(var52);
                            }
                            var48.field3617 = true;
                            if (var196 == 1402) {
                                var48.field3586 = var50;
                            }
                            if (var196 == 1408) {
                                var48.field3631 = var50;
                            }
                            if (var196 == 1400) {
                                var48.field3569 = var50;
                            }
                            if (var196 == 1406) {
                                var48.field3576 = var50;
                            }
                            if (var196 == 1412) {
                                var48.field3616 = var50;
                            }
                            if (var196 == 1407) {
                                var48.field3645 = var50;
                            }
                            if (var196 == 1404) {
                                var48.field3667 = var50;
                            }
                            if (var196 == 1415) {
                                var48.field3643 = var50;
                            }
                            if (var196 == 1405) {
                                var48.field3668 = var50;
                            }
                            if (var196 == 1409) {
                                var48.field3598 = var50;
                            }
                            if (var196 == 1413) {
                                var48.field3665 = var50;
                            }
                            if (var196 == 1410) {
                                var48.field3604 = var50;
                            }
                            if (var196 == 1401) {
                                var48.field3613 = var50;
                            }
                            if (var196 == 1403) {
                                var48.field3610 = var50;
                            }
                            if (var196 == 1414) {
                                var48.field3596 = var50;
                            }
                            if (var196 == 1417) {
                                var48.field3626 = var50;
                            }
                            if (var196 == 1411) {
                                var48.field3642 = var50;
                            }
                            if (var196 == 1416) {
                                var48.field3594 = var50;
                            }
                            continue;
                        }
                        if (var196 < 1600) {
                            class146 var174 = var43 ? class141.field3463 : class78.field1847;
                            if (var196 == 1500) {
                                class30.field724[var9++] = var174.field3575;
                                continue;
                            }
                            if (var196 == 1501) {
                                class30.field724[var9++] = var174.field3669;
                                continue;
                            }
                            if (var196 == 1502) {
                                class30.field724[var9++] = var174.field3623;
                                continue;
                            }
                            if (var196 == 1503) {
                                class30.field724[var9++] = var174.field3661;
                                continue;
                            }
                            if (var196 == 1504) {
                                class30.field724[var9++] = var174.field3578 ? 1 : 0;
                                continue;
                            }
                            if (var196 == 1505) {
                                class30.field724[var9++] = var174.field3611;
                                continue;
                            }
                        } else if (var196 < 1700) {
                            class146 var53 = var43 ? class141.field3463 : class78.field1847;
                            if (var196 == 1600) {
                                class30.field724[var9++] = var53.field3664;
                                continue;
                            }
                            if (var196 == 1601) {
                                class30.field724[var9++] = var53.field3671;
                                continue;
                            }
                            if (var196 == 1602) {
                                class87.field2076[var10++] = var53.field3568;
                                continue;
                            }
                            if (var196 == 1603) {
                                class30.field724[var9++] = var53.field3555;
                                continue;
                            }
                            if (var196 == 1604) {
                                class30.field724[var9++] = var53.field3619;
                                continue;
                            }
                            if (var196 == 1605) {
                                class30.field724[var9++] = var53.field3655;
                                continue;
                            }
                        } else if (var196 < 1800) {
                            class146 var54 = var43 ? class141.field3463 : class78.field1847;
                            if (var196 == 1700) {
                                class30.field724[var9++] = var54.field3618;
                                continue;
                            }
                            if (var196 == 1701) {
                                if (var54.field3618 == -1) {
                                    class30.field724[var9++] = 0;
                                } else {
                                    class30.field724[var9++] = var54.field3582;
                                }
                                continue;
                            }
                            if (var196 == 1702) {
                                class30.field724[var9++] = var54.field3580;
                                continue;
                            }
                        } else if (var196 < 1900) {
                            class146 var173 = var43 ? class141.field3463 : class78.field1847;
                            if (var196 == 1800) {
                                class30.field724[var9++] = class105.method853(class23.method196(var173, (byte) -123), (byte) -120);
                                continue;
                            }
                        } else if (var196 < 2600) {
                            var10000 = arg5 + 2147483524;
                            var9--;
                            class146 var55 = class48.method360(var10000, class30.field724[var9]);
                            if (var196 == 2500) {
                                class30.field724[var9++] = var55.field3575;
                                continue;
                            }
                            if (var196 == 2501) {
                                class30.field724[var9++] = var55.field3669;
                                continue;
                            }
                            if (var196 == 2502) {
                                class30.field724[var9++] = var55.field3623;
                                continue;
                            }
                            if (var196 == 2503) {
                                class30.field724[var9++] = var55.field3661;
                                continue;
                            }
                            if (var196 == 2504) {
                                class30.field724[var9++] = var55.field3578 ? 1 : 0;
                                continue;
                            }
                            if (var196 == 2505) {
                                class30.field724[var9++] = var55.field3611;
                                continue;
                            }
                        } else if (var196 < 2700) {
                            var9--;
                            class146 var172 = class48.method360(-69, class30.field724[var9]);
                            if (var196 == 2600) {
                                class30.field724[var9++] = var172.field3664;
                                continue;
                            }
                            if (var196 == 2601) {
                                class30.field724[var9++] = var172.field3671;
                                continue;
                            }
                            if (var196 == 2602) {
                                class87.field2076[var10++] = var172.field3568;
                                continue;
                            }
                            if (var196 == 2603) {
                                class30.field724[var9++] = var172.field3555;
                                continue;
                            }
                            if (var196 == 2604) {
                                class30.field724[var9++] = var172.field3619;
                                continue;
                            }
                            if (var196 == 2605) {
                                class30.field724[var9++] = var172.field3655;
                                continue;
                            }
                        } else if (var196 < 2800) {
                            var9--;
                            class146 var171 = class48.method360(-119, class30.field724[var9]);
                            if (var196 == 2700) {
                                class30.field724[var9++] = var171.field3618;
                                continue;
                            }
                            if (var196 == 2701) {
                                if (var171.field3618 == -1) {
                                    class30.field724[var9++] = 0;
                                } else {
                                    class30.field724[var9++] = var171.field3582;
                                }
                                continue;
                            }
                        } else if (var196 < 2900) {
                            var9--;
                            class146 var170 = class48.method360(-94, class30.field724[var9]);
                            if (var196 == 2800) {
                                class30.field724[var9++] = class105.method853(class23.method196(var170, (byte) -127), (byte) -106);
                                continue;
                            }
                        } else if (var196 < 3200) {
                            if (var196 == 3100) {
                                var10--;
                                class135 var168 = class87.field2076[var10];
                                class82.method635(0, class131.field3165, (byte) 118, var168);
                                continue;
                            }
                            if (var196 == 3101) {
                                var9 -= 2;
                                class132.method1055(-4, class116.field2789, class30.field724[var9], class30.field724[var9 + 1]);
                                continue;
                            }
                            if (var196 == 3102) {
                                var9--;
                                int var169 = class30.field724[var9];
                                if (var169 >= 0 && class21.field491.length > var169 && class21.field491[var169] != -1) {
                                    class10.field244 = true;
                                    class49.field1167 = var169;
                                    class135.field3239 = true;
                                }
                                continue;
                            }
                            if (var196 == 3103) {
                                class96.method790((byte) -114);
                                continue;
                            }
                        } else if (var196 < 3300) {
                            if (var196 == 3200) {
                                var9 -= 3;
                                class56.method433(class30.field724[var9], class30.field724[var9 + 2], class30.field724[var9 + 1], -15);
                                continue;
                            }
                            if (var196 == 3201) {
                                var9--;
                                class77.method621(52, class30.field724[var9]);
                                continue;
                            }
                            if (var196 == 3202) {
                                var9 -= 2;
                                class122.method964(74, class30.field724[var9 + 1], class30.field724[var9]);
                                continue;
                            }
                        } else if (var196 < 3400) {
                            if (var196 == 3300) {
                                class30.field724[var9++] = class126.field2998;
                                continue;
                            }
                            if (var196 == 3301) {
                                var9 -= 2;
                                int var56 = class30.field724[var9 + 1];
                                int var57 = class30.field724[var9];
                                class30.field724[var9++] = class126.method982(true, var56, var57);
                                continue;
                            }
                            if (var196 == 3302) {
                                var9 -= 2;
                                int var58 = class30.field724[var9];
                                int var59 = class30.field724[var9 + 1];
                                class30.field724[var9++] = class98.method802((byte) 118, var58, var59);
                                continue;
                            }
                            if (var196 == 3303) {
                                var9 -= 2;
                                int var60 = class30.field724[var9];
                                int var61 = class30.field724[var9 + 1];
                                class30.field724[var9++] = class5.method20(var61, var60, true);
                                continue;
                            }
                            if (var196 == 3304) {
                                var9--;
                                int var62 = class30.field724[var9];
                                class30.field724[var9++] = class131.method1053((byte) 98, var62).field1539;
                                continue;
                            }
                            if (var196 == 3305) {
                                var9--;
                                int var63 = class30.field724[var9];
                                class30.field724[var9++] = class85.field2025[var63];
                                continue;
                            }
                            if (var196 == 3306) {
                                var9--;
                                int var64 = class30.field724[var9];
                                class30.field724[var9++] = class120.field2895[var64];
                                continue;
                            }
                            if (var196 == 3307) {
                                var9--;
                                int var65 = class30.field724[var9];
                                class30.field724[var9++] = class128.field3088[var65];
                                continue;
                            }
                            if (var196 == 3308) {
                                int var66 = class136.field3301;
                                int var67 = (class116.field2789.field173 >> 7) + class126.field3010;
                                int var68 = (class116.field2789.field172 >> 7) + class76.field1795;
                                class30.field724[var9++] = (var66 << 28) - (-(var67 << 14) - var68);
                                continue;
                            }
                            if (var196 == 3309) {
                                var9--;
                                int var69 = class30.field724[var9];
                                class30.field724[var9++] = class4.method19(16383, var69 >> 14);
                                continue;
                            }
                            if (var196 == 3310) {
                                var9--;
                                int var70 = class30.field724[var9];
                                class30.field724[var9++] = var70 >> 28;
                                continue;
                            }
                            if (var196 == 3311) {
                                var9--;
                                int var71 = class30.field724[var9];
                                class30.field724[var9++] = class4.method19(var71, 16383);
                                continue;
                            }
                            if (var196 == 3312) {
                                class30.field724[var9++] = class1.field26 ? 1 : 0;
                                continue;
                            }
                            if (var196 == 3313) {
                                var9 -= 2;
                                int var72 = class30.field724[var9 + 1];
                                int var73 = class30.field724[var9] + 32768;
                                class30.field724[var9++] = class126.method982(true, var72, var73);
                                continue;
                            }
                            if (var196 == 3314) {
                                var9 -= 2;
                                int var74 = class30.field724[var9 + 1];
                                int var75 = class30.field724[var9] + 32768;
                                class30.field724[var9++] = class98.method802((byte) 81, var75, var74);
                                continue;
                            }
                            if (var196 == 3315) {
                                var9 -= 2;
                                int var76 = class30.field724[var9] + 32768;
                                int var77 = class30.field724[var9 + 1];
                                class30.field724[var9++] = class5.method20(var77, var76, true);
                                continue;
                            }
                        } else if (var196 < 3500) {
                            if (var196 == 3400) {
                                var9 -= 2;
                                int var158 = class30.field724[var9];
                                int var159 = class30.field724[var9 + 1];
                                class38 var160 = class104.method852(0, var158);
                                for (int var161 = 0; var161 < var160.field864; var161++) {
                                    if (var160.field865[var161] == var159) {
                                        class87.field2076[var10++] = var160.field868[var161];
                                        var160 = null;
                                        break;
                                    }
                                }
                                if (var160 != null) {
                                    class87.field2076[var10++] = var160.field878;
                                }
                                continue;
                            }
                            if (var196 == 3408) {
                                var9 -= 4;
                                int var162 = class30.field724[var9];
                                int var163 = class30.field724[var9 + 2];
                                int var164 = class30.field724[var9 + 1];
                                int var165 = class30.field724[var9 + 3];
                                class38 var166 = class104.method852(arg5 ^ 0x80000003, var163);
                                if (var166.field867 == var162 && var166.field859 == var164) {
                                    for (int var167 = 0; var167 < var166.field864; var167++) {
                                        if (var166.field865[var167] == var165) {
                                            if (var164 == 115) {
                                                class87.field2076[var10++] = var166.field868[var167];
                                            } else {
                                                class30.field724[var9++] = var166.field871[var167];
                                            }
                                            var166 = null;
                                            break;
                                        }
                                    }
                                    if (var166 != null) {
                                        if (var164 == 115) {
                                            class87.field2076[var10++] = var166.field878;
                                        } else {
                                            class30.field724[var9++] = var166.field874;
                                        }
                                    }
                                    continue;
                                }
                                if (var164 == 115) {
                                    class87.field2076[var10++] = class49.field1176;
                                } else {
                                    class30.field724[var9++] = 0;
                                }
                                continue;
                            }
                        } else if (var196 < 3700) {
                            if (var196 == 3600) {
                                if (class63.field1573 == 0) {
                                    class30.field724[var9++] = -2;
                                } else if (class63.field1573 == 1) {
                                    class30.field724[var9++] = -1;
                                } else {
                                    class30.field724[var9++] = class79.field1885;
                                }
                                continue;
                            }
                            if (var196 == 3601) {
                                var9--;
                                int var78 = class30.field724[var9];
                                if (class63.field1573 == 2 && class79.field1885 > var78) {
                                    class87.field2076[var10++] = class23.field563[var78];
                                    continue;
                                }
                                class87.field2076[var10++] = class131.field3165;
                                continue;
                            }
                            if (var196 == 3602) {
                                var9--;
                                int var79 = class30.field724[var9];
                                if (class63.field1573 == 2 && var79 < class79.field1885) {
                                    class30.field724[var9++] = class94.field2281[var79];
                                    continue;
                                }
                                class30.field724[var9++] = 0;
                                continue;
                            }
                            if (var196 == 3603) {
                                var9--;
                                int var80 = class30.field724[var9];
                                if (class63.field1573 == 2 && var80 < class79.field1885) {
                                    class30.field724[var9++] = class28.field667[var80];
                                    continue;
                                }
                                class30.field724[var9++] = 0;
                                continue;
                            }
                            if (var196 == 3604) {
                                var10--;
                                class135 var81 = class87.field2076[var10];
                                var9--;
                                int var82 = class30.field724[var9];
                                class125.method979(var82, 154, var81);
                                continue;
                            }
                        } else if (var196 < 4100) {
                            if (var196 == 4000) {
                                var9 -= 2;
                                int var83 = class30.field724[var9 + 1];
                                int var84 = class30.field724[var9];
                                class30.field724[var9++] = var83 + var84;
                                continue;
                            }
                            if (var196 == 4001) {
                                var9 -= 2;
                                int var85 = class30.field724[var9];
                                int var86 = class30.field724[var9 + 1];
                                class30.field724[var9++] = var85 - var86;
                                continue;
                            }
                            if (var196 == 4002) {
                                var9 -= 2;
                                int var87 = class30.field724[var9 + 1];
                                int var88 = class30.field724[var9];
                                class30.field724[var9++] = var87 * var88;
                                continue;
                            }
                            if (var196 == 4003) {
                                var9 -= 2;
                                int var89 = class30.field724[var9];
                                int var90 = class30.field724[var9 + 1];
                                class30.field724[var9++] = var89 / var90;
                                continue;
                            }
                            if (var196 == 4004) {
                                var9--;
                                int var91 = class30.field724[var9];
                                class30.field724[var9++] = (int) (Math.random() * (double) var91);
                                continue;
                            }
                            if (var196 == 4005) {
                                var9--;
                                int var92 = class30.field724[var9];
                                class30.field724[var9++] = (int) ((double) (var92 + 1) * Math.random());
                                continue;
                            }
                            if (var196 == 4006) {
                                var9 -= 5;
                                int var93 = class30.field724[var9];
                                int var94 = class30.field724[var9 + 2];
                                int var95 = class30.field724[var9 + 3];
                                int var96 = class30.field724[var9 + 4];
                                int var97 = class30.field724[var9 + 1];
                                class30.field724[var9++] = (var97 - var93) * (-var94 + var96) / (var95 - var94) + var93;
                                continue;
                            }
                            if (var196 == 4007) {
                                var9 -= 2;
                                int var98 = class30.field724[var9];
                                int var99 = class30.field724[var9 + 1];
                                class30.field724[var9++] = var98 * var99 / 100 + var98;
                                continue;
                            }
                            if (var196 == 4008) {
                                var9 -= 2;
                                int var100 = class30.field724[var9 + 1];
                                int var101 = class30.field724[var9];
                                class30.field724[var9++] = class44.method346(var101, 0x1 << var100);
                                continue;
                            }
                            if (var196 == 4009) {
                                var9 -= 2;
                                int var102 = class30.field724[var9];
                                int var103 = class30.field724[var9 + 1];
                                class30.field724[var9++] = class4.method19(var102, -(0x1 << var103) - 1);
                                continue;
                            }
                            if (var196 == 4010) {
                                var9 -= 2;
                                int var104 = class30.field724[var9];
                                int var105 = class30.field724[var9 + 1];
                                class30.field724[var9++] = class4.method19(var104, 0x1 << var105) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var196 == 4011) {
                                var9 -= 2;
                                int var106 = class30.field724[var9 + 1];
                                int var107 = class30.field724[var9];
                                class30.field724[var9++] = var107 % var106;
                                continue;
                            }
                            if (var196 == 4012) {
                                var9 -= 2;
                                int var108 = class30.field724[var9];
                                int var109 = class30.field724[var9 + 1];
                                if (var108 == 0) {
                                    class30.field724[var9++] = 0;
                                } else {
                                    class30.field724[var9++] = (int) Math.pow((double) var108, (double) var109);
                                }
                                continue;
                            }
                            if (var196 == 4013) {
                                var9 -= 2;
                                int var110 = class30.field724[var9 + 1];
                                int var111 = class30.field724[var9];
                                if (var111 == 0) {
                                    class30.field724[var9++] = 0;
                                } else if (var110 == 0) {
                                    class30.field724[var9++] = Integer.MAX_VALUE;
                                } else {
                                    class30.field724[var9++] = (int) Math.pow((double) var111, 1.0D / (double) var110);
                                }
                                continue;
                            }
                            if (var196 == 4014) {
                                var9 -= 2;
                                int var112 = class30.field724[var9 + 1];
                                int var113 = class30.field724[var9];
                                class30.field724[var9++] = class4.method19(var113, var112);
                                continue;
                            }
                            if (var196 == 4015) {
                                var9 -= 2;
                                int var114 = class30.field724[var9];
                                int var115 = class30.field724[var9 + 1];
                                class30.field724[var9++] = class44.method346(var114, var115);
                                continue;
                            }
                        } else if (var196 < 4200) {
                            if (var196 == 4100) {
                                var10--;
                                class135 var130 = class87.field2076[var10];
                                var9--;
                                int var131 = class30.field724[var9];
                                class87.field2076[var10++] = class107.method867(arg5 + Integer.MAX_VALUE, new class135[] { var130, class68.method547(-1, var131) });
                                continue;
                            }
                            if (var196 == 4101) {
                                var10 -= 2;
                                class135 var132 = class87.field2076[var10];
                                class135 var133 = class87.field2076[var10 + 1];
                                class87.field2076[var10++] = class107.method867(arg5 + Integer.MAX_VALUE, new class135[] { var132, var133 });
                                continue;
                            }
                            if (var196 == 4102) {
                                var10--;
                                class135 var134 = class87.field2076[var10];
                                var9--;
                                int var135 = class30.field724[var9];
                                class87.field2076[var10++] = class107.method867(2, new class135[] { var134, class126.method983(var135, true, (byte) -65) });
                                continue;
                            }
                            if (var196 == 4103) {
                                var10--;
                                class135 var136 = class87.field2076[var10];
                                class87.field2076[var10++] = var136.method1097(-41);
                                continue;
                            }
                            if (var196 == 4104) {
                                var9--;
                                int var137 = class30.field724[var9];
                                long var138 = (long) var137 * 86400000L + 1014768000000L;
                                class43.field1030.setTime(new Date(var138));
                                int var140 = class43.field1030.get(5);
                                int var141 = class43.field1030.get(2);
                                int var142 = class43.field1030.get(1);
                                class87.field2076[var10++] = class107.method867(arg5 + Integer.MAX_VALUE, new class135[] { class68.method547(arg5 + 2147483644, var140), class119.field2867, class53.field1276[var141], class119.field2867, class68.method547(-1, var142) });
                                continue;
                            }
                            if (var196 == 4105) {
                                var10 -= 2;
                                class135 var143 = class87.field2076[var10 + 1];
                                class135 var144 = class87.field2076[var10];
                                if (class116.field2789.field3526 != null && class116.field2789.field3526.field594) {
                                    class87.field2076[var10++] = var143;
                                    continue;
                                }
                                class87.field2076[var10++] = var144;
                                continue;
                            }
                            if (var196 == 4106) {
                                var9--;
                                int var145 = class30.field724[var9];
                                class87.field2076[var10++] = class68.method547(class34.method268(arg5, 2147483644), var145);
                                continue;
                            }
                            if (var196 == 4107) {
                                var10 -= 2;
                                class30.field724[var9++] = class87.field2076[var10].method1099(class87.field2076[var10 + 1], -95);
                                continue;
                            }
                            if (var196 == 4108) {
                                var10--;
                                class135 var146 = class87.field2076[var10];
                                var9 -= 2;
                                int var147 = class30.field724[var9];
                                int var148 = class30.field724[var9 + 1];
                                byte[] var149 = class3.field79.method324(arg5 + 2147483645, 0, var148);
                                class18 var150 = new class18(var149);
                                class30.field724[var9++] = var150.method119(var146, var147);
                                continue;
                            }
                            if (var196 == 4109) {
                                var10--;
                                class135 var151 = class87.field2076[var10];
                                var9 -= 2;
                                int var152 = class30.field724[var9];
                                int var153 = class30.field724[var9 + 1];
                                byte[] var154 = class3.field79.method324(0, 0, var153);
                                class18 var155 = new class18(var154);
                                class30.field724[var9++] = var155.method131(var151, var152);
                                continue;
                            }
                            if (var196 == 4110) {
                                var10 -= 2;
                                class135 var156 = class87.field2076[var10];
                                class135 var157 = class87.field2076[var10 + 1];
                                var9--;
                                if (class30.field724[var9] == 1) {
                                    class87.field2076[var10++] = var156;
                                } else {
                                    class87.field2076[var10++] = var157;
                                }
                                continue;
                            }
                        } else if (var196 < 4300) {
                            if (var196 == 4200) {
                                var9--;
                                int var116 = class30.field724[var9];
                                class87.field2076[var10++] = class41.method306(-113, var116).field2284;
                                continue;
                            }
                            if (var196 == 4201) {
                                var9 -= 2;
                                int var117 = class30.field724[var9 + 1];
                                int var118 = class30.field724[var9];
                                class94 var119 = class41.method306(-112, var118);
                                if (var117 >= 1 && var117 <= 5 && var119.field2242[var117 - 1] != null) {
                                    class87.field2076[var10++] = var119.field2242[var117 - 1];
                                    continue;
                                }
                                class87.field2076[var10++] = class131.field3165;
                                continue;
                            }
                            if (var196 == 4202) {
                                var9 -= 2;
                                int var120 = class30.field724[var9];
                                int var121 = class30.field724[var9 + 1];
                                class94 var122 = class41.method306(-108, var120);
                                if (var121 >= 1 && var121 <= 5 && var122.field2256[var121 - 1] != null) {
                                    class87.field2076[var10++] = var122.field2256[var121 - 1];
                                    continue;
                                }
                                class87.field2076[var10++] = class131.field3165;
                                continue;
                            }
                            if (var196 == 4203) {
                                var9--;
                                int var123 = class30.field724[var9];
                                class30.field724[var9++] = class41.method306(-106, var123).field2273;
                                continue;
                            }
                            if (var196 == 4204) {
                                var9--;
                                int var124 = class30.field724[var9];
                                class30.field724[var9++] = class41.method306(-120, var124).field2272 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var196 == 4205) {
                                var9--;
                                int var125 = class30.field724[var9];
                                class94 var126 = class41.method306(arg5 ^ 0x7FFFFFA9, var125);
                                if (var126.field2268 == -1 && var126.field2259 >= 0) {
                                    class30.field724[var9++] = var126.field2259;
                                    continue;
                                }
                                class30.field724[var9++] = var125;
                                continue;
                            }
                            if (var196 == 4206) {
                                var9--;
                                int var127 = class30.field724[var9];
                                class94 var128 = class41.method306(arg5 + 2147483538, var127);
                                if (var128.field2268 >= 0 && var128.field2259 >= 0) {
                                    class30.field724[var9++] = var128.field2259;
                                    continue;
                                }
                                class30.field724[var9++] = var127;
                                continue;
                            }
                            if (var196 == 4207) {
                                var9--;
                                int var129 = class30.field724[var9];
                                class30.field724[var9++] = class41.method306(-67, var129).field2234 ? 1 : 0;
                                continue;
                            }
                        }
                    }
                }
                class34.method267("CS2 - nosuchop:" + var196, 35, null);
                return;
            }
        } catch (Exception var195) {
            class34.method267("CS2 - scr:" + var8.field951 + " op:" + var14, 35, var195);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method400(byte arg0) {
        field1238 = null;
        field1222 = null;
        field1234 = null;
        field1237 = null;
        if (arg0 != -49) {
            field1234 = null;
        }
        field1225 = null;
        field1226 = null;
        field1224 = null;
        field1241 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)I")
    public final int method401(int arg0, byte arg1) {
        int var3 = -15 % ((arg1 - 63) / 53);
        field1235++;
        if (this.field1230 != null) {
            arg0 = (int) ((long) this.field1227 * (long) arg0 / (long) this.field1232);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I")
    public final int method402(int arg0, int arg1) {
        field1239++;
        if (this.field1230 != null) {
            arg1 = (int) ((long) this.field1227 * (long) arg1 / (long) this.field1232) + 6;
        }
        if (arg0 > -96) {
            this.method401(74, (byte) 95);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(II)V")
    public class52(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class8.method39((byte) 82, arg1, arg0);
            int var4 = arg1 / var3;
            this.field1227 = var4;
            int var5 = arg0 / var3;
            this.field1232 = var5;
            this.field1230 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1230[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
