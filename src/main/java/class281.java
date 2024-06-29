import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class281 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Z")
    public boolean field4312 = false;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public int field4321 = 2;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public int field4331 = 99;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Z")
    public boolean field4326 = false;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public int field4336 = -1;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public int field4316 = -1;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public int field4339 = -1;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public int field4338 = 5;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public int field4335 = -1;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Z")
    public boolean field4318 = false;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Z")
    public boolean field4323 = false;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public int field4342 = -1;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Z")
    public static boolean field4320 = true;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field4324 = 0;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "Lod;")
    public static class223 field4340 = new class223(128);

    @OriginalMember(owner = "client!a", name = "G", descriptor = "Z")
    public static boolean field4344 = false;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    public static volatile int field4345 = 0;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "[I")
    public static int[] field4347 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!a", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field4349 = new String[100];

    @OriginalMember(owner = "client!a", name = "L", descriptor = "Ljava/lang/String;")
    public static String field4348 = "Connecting to update server";

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public int field4322;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "Lsi;")
    public static class252 field4330;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "[I")
    private int[] field4317;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "[I")
    public int[] field4319;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "[I")
    public int[] field4328;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "[Z")
    public boolean[] field4334;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "[[I")
    public int[][] field4332;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIBIIIII)V", line = 4)
    public static final void method1986(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4337++;
        int var9 = 10 % ((arg3 + 1) / 49);
        if (class286.method2022((byte) -33, arg4)) {
            class311.method2173(class269.field4182[arg4], arg2, arg8, arg1, 58, -1, arg5, arg6, arg7, arg0);
        } else if (arg1 == -1) {
            for (int var10 = 0; var10 < 100; var10++) {
                class231.field3607[var10] = true;
            }
        } else {
            class231.field3607[arg1] = true;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lff;", line = 34)
    public static final class4 method1987(Throwable arg0, String arg1) {
        class4 var2;
        if (arg0 instanceof class4) {
            var2 = (class4) arg0;
            var2.field37 = var2.field37 + ' ' + arg1;
        } else {
            var2 = new class4(arg0, arg1);
        }
        field4314++;
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BIILjf;I)Ljf;", line = 52)
    public final class89 method1988(byte arg0, int arg1, int arg2, class89 arg3, int arg4) {
        int var6 = this.field4328[arg4];
        field4325++;
        int var7 = this.field4319[arg4];
        class193 var8 = class261.method1874(false, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method411(true, true, true);
        }
        class193 var10 = null;
        class193 var11 = null;
        class193 var12 = null;
        if (arg0 != 92) {
            this.field4338 = -120;
        }
        int var13 = 0;
        if ((this.field4312 || class270.field4191) && arg1 != -1 && this.field4319.length > arg1) {
            int var14 = this.field4319[arg1];
            var12 = class261.method1874(false, var14 >> 16);
            arg1 = var14 & 0xFFFF;
        }
        int var15 = 0;
        if (this.field4317 != null) {
            if (this.field4317.length > arg4) {
                var13 = this.field4317[arg4];
                if (var13 != 65535) {
                    var11 = class261.method1874(false, var13 >> 16);
                    var13 &= 0xFFFF;
                }
            }
            if ((this.field4312 || class270.field4191) && arg1 != -1 && this.field4317.length > arg1) {
                var15 = this.field4317[arg1];
                if (var15 != 65535) {
                    var10 = class261.method1874(false, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1428(-82, var9);
        boolean var17 = !var8.method1426(1, var9);
        if (var11 != null) {
            var16 &= !var11.method1428(-68, var13);
            var17 &= !var11.method1426(arg0 ^ 0x5D, var13);
        }
        if (var12 != null) {
            var16 &= !var12.method1428(arg0 ^ 0xFFFFFFF9, arg1);
            var17 &= !var12.method1426(1, arg1);
        }
        if (var10 != null) {
            var16 &= !var10.method1428(arg0 - 5, var15);
            var17 &= !var10.method1426(1, var15);
        }
        class89 var18 = arg3.method411(var16, var17, !this.field4323);
        var18.method643(var8, var9, var12, arg1, arg2 - 1, var6, this.field4323);
        if (var11 != null) {
            var18.method643(var11, var13, var10, var15, arg2 - 1, var6, this.field4323);
        }
        return var18;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBLvl;)V", line = 151)
    private final void method1989(int arg0, byte arg1, class6 arg2) {
        field4313++;
        if (arg1 != -121) {
            field4330 = (class252) null;
        }
        if (arg0 == 1) {
            int var4 = arg2.method39((byte) 102);
            this.field4328 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4328[var5] = arg2.method39((byte) 94);
            }
            this.field4319 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4319[var6] = arg2.method39((byte) 111);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4319[var7] = (arg2.method39((byte) 44) << 16) + this.field4319[var7];
            }
        } else if (arg0 == 2) {
            this.field4339 = arg2.method39((byte) 126);
        } else if (arg0 == 3) {
            this.field4334 = new boolean[256];
            int var8 = arg2.method58(-288140008);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4334[arg2.method58(-288140008)] = true;
            }
        } else if (arg0 == 4) {
            this.field4318 = true;
        } else if (arg0 == 5) {
            this.field4338 = arg2.method58(-288140008);
        } else if (arg0 == 6) {
            this.field4335 = arg2.method39((byte) 98);
        } else if (arg0 == 7) {
            this.field4336 = arg2.method39((byte) 61);
        } else if (arg0 == 8) {
            this.field4331 = arg2.method58(arg1 - 288139887);
        } else if (arg0 == 9) {
            this.field4316 = arg2.method58(-288140008);
        } else if (arg0 == 10) {
            this.field4342 = arg2.method58(-288140008);
        } else if (arg0 == 11) {
            this.field4321 = arg2.method58(-288140008);
        } else if (arg0 == 12) {
            int var14 = arg2.method58(-288140008);
            this.field4317 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field4317[var15] = arg2.method39((byte) 57);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field4317[var16] = (arg2.method39((byte) 62) << 16) + this.field4317[var16];
            }
        } else if (arg0 == 13) {
            int var10 = arg2.method39((byte) 112);
            this.field4332 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg2.method58(-288140008);
                if (var12 > 0) {
                    this.field4332[var11] = new int[var12];
                    this.field4332[var11][0] = arg2.method31(-22888);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field4332[var11][var13] = arg2.method39((byte) 28);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field4323 = true;
        } else if (arg0 == 15) {
            this.field4312 = true;
        } else if (arg0 == 16) {
            this.field4326 = true;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljf;IIII)Ljf;", line = 317)
    public final class89 method1990(class89 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4315++;
        int var6 = this.field4328[arg1];
        int var7 = this.field4319[arg1];
        int var8 = 125 / ((arg3 - 60) / 55);
        class193 var9 = class261.method1874(false, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return arg0.method381(true, true, true);
        }
        class193 var11 = null;
        if ((this.field4312 || class270.field4191) && arg2 != -1 && this.field4319.length > arg2) {
            int var12 = this.field4319[arg2];
            var11 = class261.method1874(false, var12 >> 16);
            arg2 = var12 & 0xFFFF;
        }
        class89 var13;
        if (var11 == null) {
            var13 = arg0.method381(!var9.method1428(-82, var10), !var9.method1426(1, var10), !this.field4323);
        } else {
            var13 = arg0.method381(!var9.method1428(-103, var10) & !var11.method1428(57, arg2), !var9.method1426(1, var10) & !var11.method1426(1, arg2), !this.field4323);
        }
        var13.method643(var9, var10, var11, arg2, arg4 - 1, var6, this.field4323);
        return var13;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IILjf;III)Ljf;", line = 355)
    public final class89 method1991(int arg0, int arg1, class89 arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field4328[arg0];
        int var8 = this.field4319[arg0];
        class193 var9 = class261.method1874(false, var8 >> 16);
        field4333++;
        int var10 = var8 & arg3;
        if (var9 == null) {
            return arg2.method411(true, true, true);
        }
        class193 var11 = null;
        int var12 = arg4 & 0x3;
        if ((this.field4312 || class270.field4191) && arg5 != -1 && arg5 < this.field4319.length) {
            int var13 = this.field4319[arg5];
            var11 = class261.method1874(false, var13 >> 16);
            arg5 = var13 & 0xFFFF;
        }
        class89 var14;
        if (var11 == null) {
            var14 = arg2.method411(!var9.method1428(21, var10), !var9.method1426(1, var10), !this.field4323);
        } else {
            var14 = arg2.method411(!var9.method1428(-94, var10) & !var11.method1428(64, arg5), !var9.method1426(arg3 - 65534, var10) & !var11.method1426(1, arg5), !this.field4323);
        }
        if (this.field4323 && class109.field1458) {
            if (var12 == 1) {
                ((class217) var14).method1593();
            } else if (var12 == 2) {
                ((class217) var14).method1583();
            } else if (var12 == 3) {
                ((class217) var14).method1592();
            }
        } else if (var12 == 1) {
            var14.method412();
        } else if (var12 == 2) {
            var14.method406();
        } else if (var12 == 3) {
            var14.method419();
        }
        var14.method643(var9, var10, var11, arg5, arg1 - 1, var7, this.field4323);
        if (this.field4323 && class109.field1458) {
            if (var12 == 1) {
                ((class217) var14).method1592();
            } else if (var12 == 2) {
                ((class217) var14).method1583();
            } else if (var12 == 3) {
                ((class217) var14).method1593();
            }
        } else if (var12 == 1) {
            var14.method419();
        } else if (var12 == 2) {
            var14.method406();
        } else if (var12 == 3) {
            var14.method412();
        }
        return var14;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIILjf;Z)Ljf;", line = 450)
    public final class89 method1992(int arg0, int arg1, int arg2, int arg3, class89 arg4, boolean arg5) {
        int var7 = this.field4328[arg0];
        if (!arg5) {
            return (class89) null;
        }
        int var8 = this.field4319[arg0];
        class193 var9 = class261.method1874(!arg5, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        field4341++;
        if (var9 == null) {
            return arg4.method399(true, true, true);
        }
        int var11 = arg2 & 0x3;
        class193 var12 = null;
        if ((this.field4312 || class270.field4191) && arg3 != -1 && arg3 < this.field4319.length) {
            int var13 = this.field4319[arg3];
            var12 = class261.method1874(false, var13 >> 16);
            arg3 = var13 & 0xFFFF;
        }
        class89 var14;
        if (var12 == null) {
            var14 = arg4.method399(!var9.method1428(-74, var10), !var9.method1426(1, var10), !this.field4323);
        } else {
            var14 = arg4.method399(!var9.method1428(-87, var10) & !var12.method1428(58, arg3), !var9.method1426(1, var10) & !var12.method1426(1, arg3), !this.field4323);
        }
        if (class109.field1458 && this.field4323) {
            if (var11 == 1) {
                ((class217) var14).method1593();
            } else if (var11 == 2) {
                ((class217) var14).method1583();
            } else if (var11 == 3) {
                ((class217) var14).method1592();
            }
        } else if (var11 == 1) {
            var14.method412();
        } else if (var11 == 2) {
            var14.method406();
        } else if (var11 == 3) {
            var14.method419();
        }
        var14.method643(var9, var10, var12, arg3, arg1 - 1, var7, this.field4323);
        if (class109.field1458 && this.field4323) {
            if (var11 == 1) {
                ((class217) var14).method1592();
            } else if (var11 == 2) {
                ((class217) var14).method1583();
            } else if (var11 == 3) {
                ((class217) var14).method1593();
            }
        } else if (var11 == 1) {
            var14.method419();
        } else if (var11 == 2) {
            var14.method406();
        } else if (var11 == 3) {
            var14.method412();
        }
        return var14;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 556)
    public final void method1993(int arg0) {
        if (this.field4316 == -1) {
            if (this.field4334 == null) {
                this.field4316 = 0;
            } else {
                this.field4316 = 2;
            }
        }
        if (arg0 <= 37) {
            this.field4338 = 122;
        }
        if (this.field4342 == -1) {
            if (this.field4334 == null) {
                this.field4342 = 0;
            } else {
                this.field4342 = 2;
            }
        }
        field4329++;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 586)
    public static void method1994(int arg0) {
        if (arg0 != 1009897296) {
            return;
        }
        field4347 = null;
        field4330 = null;
        field4349 = null;
        field4340 = null;
        field4348 = null;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V", line = 617)
    public static final void method1995(int arg0) {
        if (class97.field1278 != null) {
            class97.field1278.method1766(256000);
        }
        field4346++;
        if (class26.field388 != null) {
            class26.field388.method1766(256000);
        }
        class322.method2272(2, 86, class86.field1164, 22050);
        class97.field1278 = class146.method1077(0, class42.field581, class116.field1615, (byte) 102, 22050);
        if (arg0 <= 10) {
            field4340 = (class223) null;
        }
        class97.field1278.method1778(-22090, class160.field2543);
        class26.field388 = class146.method1077(1, class42.field581, class116.field1615, (byte) 126, 2048);
        class26.field388.method1778(-22090, class86.field1174);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lvl;I)V", line = 658)
    public final void method1996(class6 arg0, int arg1) {
        if (arg1 <= 101) {
            field4330 = (class252) null;
        }
        while (true) {
            int var3 = arg0.method58(-288140008);
            if (var3 == 0) {
                field4327++;
                return;
            }
            this.method1989(var3, (byte) -121, arg0);
        }
    }
}
