import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class38 {

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public int field565 = 99;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "Z")
    public boolean field566 = false;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public int field562 = -1;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public int field564 = -1;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    public int field579 = -1;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    public int field575 = 2;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "Z")
    public boolean field577 = false;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
    public int field585 = -1;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
    public int field583 = 5;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public int field567 = -1;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "Z")
    public boolean field560 = false;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "Z")
    public boolean field581 = false;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "J")
    public static long field572 = 0L;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    public static int field586 = -1;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "Lgd;")
    public static class325 field578 = new class325(4);

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "Lub;")
    public static class23 field570;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "[I")
    public int[] field568;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "[I")
    public int[] field584;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "[I")
    private int[] field589;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "[Z")
    public boolean[] field573;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "[[I")
    public int[][] field582;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILaj;)V", line = 5)
    public final void method331(int arg0, class1 arg1) {
        if (arg0 <= 65) {
            field570 = (class23) null;
        }
        field580++;
        while (true) {
            int var3 = arg1.method15((byte) 85);
            if (var3 == 0) {
                return;
            }
            this.method333((byte) 13, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lpk;I)V", line = 28)
    public static final void method332(class120 arg0, int arg1) {
        class172.field2767 = class5.method90((byte) 96, arg0, class45.field701);
        class101.field1668 = new int[256];
        int var2 = -7 / ((-arg1 - 57) / 40);
        for (int var3 = 0; var3 < 3; var3++) {
            float var4 = (float) (class87.field1393[var3] >> 16 & 0xFF);
            int var5 = class87.field1393[var3 + 1] >> 16 & 0xFF;
            float var6 = ((float) var5 - var4) / 64.0F;
            float var7 = (float) ((class87.field1393[var3] & 0xFF00) >> 8);
            float var8 = (float) (class87.field1393[var3] & 0xFF);
            int var9 = class87.field1393[var3 + 1] >> 8 & 0xFF;
            float var10 = ((float) var9 - var7) / 64.0F;
            int var11 = class87.field1393[var3 + 1] & 0xFF;
            float var12 = ((float) var11 - var8) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class101.field1668[var3 * 64 + var13] = class251.method1740((int) var8, class251.method1740((int) var4 << 16, (int) var7 << 8));
                var4 += var6;
                var8 += var12;
                var7 += var10;
            }
        }
        field588++;
        for (int var14 = 192; var14 < 255; var14++) {
            class101.field1668[var14] = class87.field1393[3];
        }
        class12.field268 = new int[32768];
        class140.field2261 = new int[32768];
        class84.method669((class186) null, false);
        class137.field2233 = new int[32768];
        class214.field3343 = new int[32768];
        class299.field4788 = new class317(128, 254);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BILaj;)V", line = 92)
    private final void method333(byte arg0, int arg1, class1 arg2) {
        if (arg0 != 13) {
            method332((class120) null, -17);
        }
        if (arg1 == 1) {
            int var13 = arg2.method56(arg0 + 19599);
            this.field568 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field568[var14] = arg2.method56(19612);
            }
            this.field584 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field584[var15] = arg2.method56(19612);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field584[var16] += arg2.method56(19612) << 16;
            }
        } else if (arg1 == 2) {
            this.field564 = arg2.method56(19612);
        } else if (arg1 == 3) {
            this.field573 = new boolean[256];
            int var11 = arg2.method15((byte) -74);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field573[arg2.method15((byte) 112)] = true;
            }
        } else if (arg1 == 4) {
            this.field581 = true;
        } else if (arg1 == 5) {
            this.field583 = arg2.method15((byte) 87);
        } else if (arg1 == 6) {
            this.field562 = arg2.method56(19612);
        } else if (arg1 == 7) {
            this.field579 = arg2.method56(19612);
        } else if (arg1 == 8) {
            this.field565 = arg2.method15((byte) -18);
        } else if (arg1 == 9) {
            this.field585 = arg2.method15((byte) -84);
        } else if (arg1 == 10) {
            this.field567 = arg2.method15((byte) -84);
        } else if (arg1 == 11) {
            this.field575 = arg2.method15((byte) -20);
        } else if (arg1 == 12) {
            int var8 = arg2.method15((byte) -84);
            this.field589 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field589[var9] = arg2.method56(class85.method677(arg0, 19601));
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field589[var10] = (arg2.method56(19612) << 16) + this.field589[var10];
            }
        } else if (arg1 == 13) {
            int var4 = arg2.method56(19612);
            this.field582 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method15((byte) -23);
                if (var6 > 0) {
                    this.field582[var5] = new int[var6];
                    this.field582[var5][0] = arg2.method4(true);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field582[var5][var7] = arg2.method56(class85.method677(arg0, 19601));
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field560 = true;
        } else if (arg1 == 15) {
            this.field577 = true;
        } else if (arg1 == 16) {
            this.field566 = true;
        }
        field576++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)V", line = 253)
    public static final void method334(int arg0, byte arg1) {
        field569++;
        class261.method1816(class261.field3887, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        class261.method1813(-50.0F, -60.0F, -50.0F);
        class261.method1809(class261.field3886, 0, false);
        if (arg1 < -76) {
            class261.method1814();
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIILie;I)Lie;", line = 268)
    public final class94 method335(int arg0, int arg1, int arg2, int arg3, class94 arg4, int arg5) {
        field559++;
        int var7 = this.field568[arg3];
        if (arg5 != 17633) {
            return (class94) null;
        }
        int var8 = this.field584[arg3];
        class64 var9 = class66.method533(arg5 ^ 0xFFFFBB48, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method743(true, true, true);
        }
        int var11 = arg2 & 0x3;
        class64 var12 = null;
        if ((this.field577 || class197.field3039) && arg1 != -1 && this.field584.length > arg1) {
            int var13 = this.field584[arg1];
            var12 = class66.method533(76, var13 >> 16);
            arg1 = var13 & 0xFFFF;
        }
        class94 var14;
        if (var12 == null) {
            var14 = arg4.method743(!var9.method510(107, var10), !var9.method514(arg5 - 17583, var10), !this.field560);
        } else {
            var14 = arg4.method743(!var9.method510(127, var10) & !var12.method510(arg5 ^ 0x4482, arg1), !var9.method514(50, var10) & !var12.method514(50, arg1), !this.field560);
        }
        if (this.field560 && class162.field2623) {
            if (var11 == 1) {
                ((class206) var14).method1493();
            } else if (var11 == 2) {
                ((class206) var14).method1505();
            } else if (var11 == 3) {
                ((class206) var14).method1517();
            }
        } else if (var11 == 1) {
            var14.method747();
        } else if (var11 == 2) {
            var14.method749();
        } else if (var11 == 3) {
            var14.method748();
        }
        var14.method751(var9, var10, var12, arg1, arg0 - 1, var7, this.field560);
        if (this.field560 && class162.field2623) {
            if (var11 == 1) {
                ((class206) var14).method1517();
            } else if (var11 == 2) {
                ((class206) var14).method1505();
            } else if (var11 == 3) {
                ((class206) var14).method1493();
            }
        } else if (var11 == 1) {
            var14.method748();
        } else if (var11 == 2) {
            var14.method749();
        } else if (var11 == 3) {
            var14.method747();
        }
        return var14;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILie;II)Lie;", line = 366)
    public final class94 method336(int arg0, int arg1, class94 arg2, int arg3, int arg4) {
        field563++;
        int var6 = this.field568[arg1];
        int var7 = this.field584[arg1];
        class64 var8 = class66.method533(-127, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg2.method743(true, true, true);
        }
        class64 var10 = null;
        class64 var11 = null;
        class64 var12 = null;
        int var13 = 0;
        if ((this.field577 || class197.field3039) && arg3 != -1 && arg3 < this.field584.length) {
            int var14 = this.field584[arg3];
            var12 = class66.method533(-31, var14 >> 16);
            arg3 = var14 & 0xFFFF;
        }
        int var15 = 0;
        if (this.field589 != null) {
            if (this.field589.length > arg1) {
                var13 = this.field589[arg1];
                if (var13 != 65535) {
                    var10 = class66.method533(arg0 + 2089654889, var13 >> 16);
                    var13 &= 0xFFFF;
                }
            }
            if ((this.field577 || class197.field3039) && arg3 != -1 && arg3 < this.field589.length) {
                var15 = this.field589[arg3];
                if (var15 != 65535) {
                    var11 = class66.method533(78, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method510(112, var9);
        if (arg0 != -2089655000) {
            field572 = 66L;
        }
        boolean var17 = !var8.method514(50, var9);
        if (var10 != null) {
            var16 &= !var10.method510(93, var13);
            var17 &= !var10.method514(50, var13);
        }
        if (var12 != null) {
            var16 &= !var12.method510(125, arg3);
            var17 &= !var12.method514(arg0 ^ 0x8372651A, arg3);
        }
        if (var11 != null) {
            var16 &= !var11.method510(94, var15);
            var17 &= !var11.method514(arg0 + 2089655050, var15);
        }
        class94 var18 = arg2.method743(var16, var17, !this.field560);
        var18.method751(var8, var9, var12, arg3, arg4 - 1, var6, this.field560);
        if (var10 != null) {
            var18.method751(var10, var13, var11, var15, arg4 - 1, var6, this.field560);
        }
        return var18;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 483)
    public static void method337(int arg0) {
        int var1 = -108 / ((arg0 - 47) / 57);
        field570 = null;
        field578 = null;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 492)
    public final void method338(int arg0) {
        if (this.field567 == -1) {
            if (this.field573 == null) {
                this.field567 = 0;
            } else {
                this.field567 = 2;
            }
        }
        if (arg0 >= -15) {
            this.method338(-48);
        }
        if (this.field585 == -1) {
            if (this.field573 == null) {
                this.field585 = 0;
            } else {
                this.field585 = 2;
            }
        }
        field561++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIBLie;)Lie;", line = 526)
    public final class94 method339(int arg0, int arg1, int arg2, byte arg3, class94 arg4) {
        field571++;
        int var6 = this.field568[arg1];
        int var7 = 23 / ((arg3 + 25) / 53);
        int var8 = this.field584[arg1];
        class64 var9 = class66.method533(86, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method764(true, true, true);
        }
        class64 var11 = null;
        if ((this.field577 || class197.field3039) && arg0 != -1 && arg0 < this.field584.length) {
            int var12 = this.field584[arg0];
            var11 = class66.method533(126, var12 >> 16);
            arg0 = var12 & 0xFFFF;
        }
        class94 var13;
        if (var11 == null) {
            var13 = arg4.method764(!var9.method510(124, var10), !var9.method514(50, var10), !this.field560);
        } else {
            var13 = arg4.method764(!var9.method510(91, var10) & !var11.method510(101, arg0), !var9.method514(50, var10) & !var11.method514(50, arg0), !this.field560);
        }
        var13.method751(var9, var10, var11, arg0, arg2 - 1, var6, this.field560);
        return var13;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BIIILie;I)Lie;", line = 572)
    public final class94 method340(byte arg0, int arg1, int arg2, int arg3, class94 arg4, int arg5) {
        field587++;
        int var7 = 127 / ((arg0 + 50) / 57);
        int var8 = this.field568[arg3];
        int var9 = this.field584[arg3];
        class64 var10 = class66.method533(-92, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            return arg4.method769(true, true, true);
        }
        int var12 = arg2 & 0x3;
        class64 var13 = null;
        if ((this.field577 || class197.field3039) && arg1 != -1 && this.field584.length > arg1) {
            int var14 = this.field584[arg1];
            var13 = class66.method533(-36, var14 >> 16);
            arg1 = var14 & 0xFFFF;
        }
        class94 var15;
        if (var13 == null) {
            var15 = arg4.method769(!var10.method510(115, var11), !var10.method514(50, var11), !this.field560);
        } else {
            var15 = arg4.method769(!var10.method510(107, var11) & !var13.method510(123, arg1), !var10.method514(50, var11) & !var13.method514(50, arg1), !this.field560);
        }
        if (class162.field2623 && this.field560) {
            if (var12 == 1) {
                ((class206) var15).method1493();
            } else if (var12 == 2) {
                ((class206) var15).method1505();
            } else if (var12 == 3) {
                ((class206) var15).method1517();
            }
        } else if (var12 == 1) {
            var15.method747();
        } else if (var12 == 2) {
            var15.method749();
        } else if (var12 == 3) {
            var15.method748();
        }
        var15.method751(var10, var11, var13, arg1, arg5 - 1, var8, this.field560);
        if (class162.field2623 && this.field560) {
            if (var12 == 1) {
                ((class206) var15).method1517();
            } else if (var12 == 2) {
                ((class206) var15).method1505();
            } else if (var12 == 3) {
                ((class206) var15).method1493();
            }
        } else if (var12 == 1) {
            var15.method748();
        } else if (var12 == 2) {
            var15.method749();
        } else if (var12 == 3) {
            var15.method747();
        }
        return var15;
    }
}
