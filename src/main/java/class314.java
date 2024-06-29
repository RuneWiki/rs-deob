import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class314 {

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public int field4608 = -1;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Z")
    public boolean field4617 = false;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public int field4626 = 2;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public int field4625 = -1;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "Z")
    public boolean field4629 = false;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public int field4632 = -1;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public int field4619 = -1;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public int field4628 = 99;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "Z")
    public boolean field4630 = false;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    public int field4636 = -1;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "Z")
    public boolean field4633 = false;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
    public int field4638 = 5;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field4618 = 0;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "Ljava/lang/String;")
    public static String field4635 = "";

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public int field4606;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Lfh;")
    public static class140 field4614;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "[I")
    private int[] field4609;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "[I")
    public int[] field4627;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "[I")
    public int[] field4631;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "[Luj;")
    public static class158[] field4624;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[Z")
    public boolean[] field4607;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "[[I")
    public int[][] field4637;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIILvg;II)Lvg;", line = 6)
    public final class81 method2170(boolean arg0, int arg1, int arg2, class81 arg3, int arg4, int arg5) {
        field4615++;
        int var7 = this.field4627[arg2];
        int var8 = this.field4631[arg2];
        class261 var9 = class270.method1843(var8 >> 16, -1);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method590(true, true, true);
        }
        class261 var11 = null;
        int var12 = arg4 & 0x3;
        if ((this.field4617 || class354.field5523) && arg1 != -1 && this.field4631.length > arg1) {
            int var13 = this.field4631[arg1];
            var11 = class270.method1843(var13 >> 16, -1);
            arg1 = var13 & 0xFFFF;
        }
        if (arg0) {
            this.field4627 = (int[]) null;
        }
        class81 var14;
        if (var11 == null) {
            var14 = arg3.method590(!var9.method1796((byte) -39, var10), !var9.method1797(3, var10), !this.field4630);
        } else {
            var14 = arg3.method590(!var9.method1796((byte) -39, var10) & !var11.method1796((byte) -39, arg1), !var9.method1797(3, var10) & !var11.method1797(3, arg1), !this.field4630);
        }
        if (this.field4630 && class47.field623) {
            if (var12 == 1) {
                ((class128) var14).method947();
            } else if (var12 == 2) {
                ((class128) var14).method948();
            } else if (var12 == 3) {
                ((class128) var14).method963();
            }
        } else if (var12 == 1) {
            var14.method586();
        } else if (var12 == 2) {
            var14.method587();
        } else if (var12 == 3) {
            var14.method577();
        }
        var14.method594(var9, var10, var11, arg1, arg5 - 1, var7, this.field4630);
        if (this.field4630 && class47.field623) {
            if (var12 == 1) {
                ((class128) var14).method963();
            } else if (var12 == 2) {
                ((class128) var14).method948();
            } else if (var12 == 3) {
                ((class128) var14).method947();
            }
        } else if (var12 == 1) {
            var14.method577();
        } else if (var12 == 2) {
            var14.method587();
        } else if (var12 == 3) {
            var14.method586();
        }
        return var14;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIIII)V", line = 102)
    public static final void method2171(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4610++;
        if (class207.field2937 <= arg4 && arg4 <= class25.field292) {
            int var5 = class289.method1984(class245.field3574, arg1, 1, class321.field4722);
            int var6 = class289.method1984(class245.field3574, arg2, 1, class321.field4722);
            class109.method774(var5, false, var6, arg3, arg4);
        }
        if (!arg0) {
            method2175(21, -94, -102, -35, (byte) 68);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lfd;Z)V", line = 123)
    public final void method2172(class299 arg0, boolean arg1) {
        if (arg1) {
            this.field4625 = 76;
        }
        field4621++;
        while (true) {
            int var3 = arg0.method2096((byte) -122);
            if (var3 == 0) {
                return;
            }
            this.method2176(arg0, var3, 4282);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIILvg;I)Lvg;", line = 161)
    public final class81 method2173(boolean arg0, int arg1, int arg2, class81 arg3, int arg4) {
        field4616++;
        int var6 = this.field4627[arg4];
        if (arg0) {
            this.field4627 = (int[]) null;
        }
        int var7 = this.field4631[arg4];
        class261 var8 = class270.method1843(var7 >> 16, -1);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method590(true, true, true);
        }
        class261 var10 = null;
        if ((this.field4617 || class354.field5523) && arg2 != -1 && arg2 < this.field4631.length) {
            int var11 = this.field4631[arg2];
            var10 = class270.method1843(var11 >> 16, -1);
            arg2 = var11 & 0xFFFF;
        }
        class261 var12 = null;
        int var13 = 0;
        int var14 = 0;
        class261 var15 = null;
        if (this.field4609 != null) {
            if (arg4 < this.field4609.length) {
                var14 = this.field4609[arg4];
                if (var14 != 65535) {
                    var12 = class270.method1843(var14 >> 16, -1);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field4617 || class354.field5523) && arg2 != -1 && arg2 < this.field4609.length) {
                var13 = this.field4609[arg2];
                if (var13 != 65535) {
                    var15 = class270.method1843(var13 >> 16, -1);
                    var13 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1796((byte) -39, var9);
        boolean var17 = !var8.method1797(3, var9);
        if (var12 != null) {
            var16 &= !var12.method1796((byte) -39, var14);
            var17 &= !var12.method1797(3, var14);
        }
        if (var10 != null) {
            var16 &= !var10.method1796((byte) -39, arg2);
            var17 &= !var10.method1797(3, arg2);
        }
        if (var15 != null) {
            var16 &= !var15.method1796((byte) -39, var13);
            var17 &= !var15.method1797(3, var13);
        }
        class81 var18 = arg3.method590(var16, var17, !this.field4630);
        var18.method594(var8, var9, var10, arg2, arg1 - 1, var6, this.field4630);
        if (var12 != null) {
            var18.method594(var12, var14, var15, var13, arg1 - 1, var6, this.field4630);
        }
        return var18;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILvg;I)Lvg;", line = 259)
    public final class81 method2174(int arg0, int arg1, int arg2, class81 arg3, int arg4) {
        field4634++;
        int var6 = this.field4627[arg1];
        int var7 = 10 / ((28 - arg0) / 60);
        int var8 = this.field4631[arg1];
        class261 var9 = class270.method1843(var8 >> 16, -1);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method595(true, true, true);
        }
        class261 var11 = null;
        if ((this.field4617 || class354.field5523) && arg4 != -1 && arg4 < this.field4631.length) {
            int var12 = this.field4631[arg4];
            var11 = class270.method1843(var12 >> 16, -1);
            arg4 = var12 & 0xFFFF;
        }
        class81 var13;
        if (var11 == null) {
            var13 = arg3.method595(!var9.method1796((byte) -39, var10), !var9.method1797(3, var10), !this.field4630);
        } else {
            var13 = arg3.method595(!var9.method1796((byte) -39, var10) & !var11.method1796((byte) -39, arg4), !var9.method1797(3, var10) & !var11.method1797(3, arg4), !this.field4630);
        }
        var13.method594(var9, var10, var11, arg4, arg2 - 1, var6, this.field4630);
        return var13;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIB)V", line = 307)
    public static final void method2175(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4611++;
        class42 var5 = class166.method1242(8, arg3, arg4 ^ 0xB58CAEBC);
        var5.method307((byte) -106);
        var5.field536 = arg0;
        if (arg4 == 92) {
            var5.field525 = arg1;
            var5.field523 = arg2;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lfd;II)V", line = 331)
    private final void method2176(class299 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            int var4 = arg0.method2083((byte) -108);
            this.field4627 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4627[var5] = arg0.method2083((byte) -67);
            }
            this.field4631 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4631[var6] = arg0.method2083((byte) -117);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4631[var7] = (arg0.method2083((byte) -64) << 16) + this.field4631[var7];
            }
        } else if (arg1 == 2) {
            this.field4636 = arg0.method2083((byte) -123);
        } else if (arg1 == 3) {
            this.field4607 = new boolean[256];
            int var15 = arg0.method2096((byte) -122);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field4607[arg0.method2096((byte) -122)] = true;
            }
        } else if (arg1 == 4) {
            this.field4633 = true;
        } else if (arg1 == 5) {
            this.field4638 = arg0.method2096((byte) -122);
        } else if (arg1 == 6) {
            this.field4608 = arg0.method2083((byte) -96);
        } else if (arg1 == 7) {
            this.field4619 = arg0.method2083((byte) -97);
        } else if (arg1 == 8) {
            this.field4628 = arg0.method2096((byte) -122);
        } else if (arg1 == 9) {
            this.field4632 = arg0.method2096((byte) -122);
        } else if (arg1 == 10) {
            this.field4625 = arg0.method2096((byte) -122);
        } else if (arg1 == 11) {
            this.field4626 = arg0.method2096((byte) -122);
        } else if (arg1 == 12) {
            int var12 = arg0.method2096((byte) -122);
            this.field4609 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field4609[var13] = arg0.method2083((byte) -57);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field4609[var14] += arg0.method2083((byte) -118) << 16;
            }
        } else if (arg1 == 13) {
            int var8 = arg0.method2083((byte) -77);
            this.field4637 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg0.method2096((byte) -122);
                if (var10 > 0) {
                    this.field4637[var9] = new int[var10];
                    this.field4637[var9][0] = arg0.method2085((byte) 109);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field4637[var9][var11] = arg0.method2083((byte) -89);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field4630 = true;
        } else if (arg1 == 15) {
            this.field4617 = true;
        } else if (arg1 == 16) {
            this.field4629 = true;
        }
        field4620++;
        if (arg2 != 4282) {
            this.method2177(-37, -40, -57, -61, -47, (class81) null);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIILvg;)Lvg;", line = 490)
    public final class81 method2177(int arg0, int arg1, int arg2, int arg3, int arg4, class81 arg5) {
        field4622++;
        int var7 = this.field4627[arg3];
        int var8 = this.field4631[arg3];
        class261 var9 = class270.method1843(var8 >> 16, -1);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method592(true, true, true);
        }
        int var11 = arg4 & 0x3;
        class261 var12 = null;
        if ((this.field4617 || class354.field5523) && arg0 != -1 && arg0 < this.field4631.length) {
            int var13 = this.field4631[arg0];
            var12 = class270.method1843(var13 >> 16, -1);
            arg0 = var13 & 0xFFFF;
        }
        class81 var14;
        if (var12 == null) {
            var14 = arg5.method592(!var9.method1796((byte) -39, var10), !var9.method1797(3, var10), !this.field4630);
        } else {
            var14 = arg5.method592(!var9.method1796((byte) -39, var10) & !var12.method1796((byte) -39, arg0), !var9.method1797(arg2 ^ 0x9928DF13, var10) & !var12.method1797(3, arg0), !this.field4630);
        }
        if (arg2 != -1725374704) {
            return (class81) null;
        }
        if (class47.field623 && this.field4630) {
            if (var11 == 1) {
                ((class128) var14).method947();
            } else if (var11 == 2) {
                ((class128) var14).method948();
            } else if (var11 == 3) {
                ((class128) var14).method963();
            }
        } else if (var11 == 1) {
            var14.method586();
        } else if (var11 == 2) {
            var14.method587();
        } else if (var11 == 3) {
            var14.method577();
        }
        var14.method594(var9, var10, var12, arg0, arg1 - 1, var7, this.field4630);
        if (class47.field623 && this.field4630) {
            if (var11 == 1) {
                ((class128) var14).method963();
            } else if (var11 == 2) {
                ((class128) var14).method948();
            } else if (var11 == 3) {
                ((class128) var14).method947();
            }
        } else if (var11 == 1) {
            var14.method577();
        } else if (var11 == 2) {
            var14.method587();
        } else if (var11 == 3) {
            var14.method586();
        }
        return var14;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 591)
    public final void method2178(byte arg0) {
        field4623++;
        if (arg0 != 89) {
            return;
        }
        if (this.field4632 == -1) {
            if (this.field4607 == null) {
                this.field4632 = 0;
            } else {
                this.field4632 = 2;
            }
        }
        if (this.field4625 != -1) {
            return;
        }
        if (this.field4607 == null) {
            this.field4625 = 0;
        } else {
            this.field4625 = 2;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 635)
    public static void method2179(int arg0) {
        field4635 = null;
        field4624 = null;
        field4614 = null;
        if (arg0 != 1) {
            field4618 = 102;
        }
    }
}
