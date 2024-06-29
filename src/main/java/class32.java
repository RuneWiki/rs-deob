import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class class32 {

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Z")
    private boolean field640;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Z")
    private boolean field642;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    private int field623;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "Lqc;")
    private class146 field653;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "[I")
    public int[] field625;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "[I")
    private int[] field629;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "[I")
    public int[] field632;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "[I")
    public int[] field646;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "[I")
    private int[] field659;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "[Lqc;")
    private class146[] field645;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "[Ljava/lang/Object;")
    public Object[] field647;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "[[I")
    private int[][] field639;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "[[I")
    private int[][] field663;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field622;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "[[[B")
    public static byte[][][] field652;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)I")
    public final int method192(byte arg0) {
        int var2 = 18 / (-arg0 / 58);
        field641++;
        return this.field622.length;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([BI)V")
    public final void method193(byte[] arg0, int arg1) {
        this.field624 = class117.method907(arg0, (byte) 66, arg0.length);
        class66 var3 = new class66(class95.method795(arg0, (byte) 106));
        field658++;
        int var4 = var3.method509(127);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method464(-56);
        }
        int var5 = var3.method509(arg1 ^ 0x746A);
        this.field623 = var3.method511(-126);
        int var6 = 0;
        int var7 = -1;
        this.field659 = new int[this.field623];
        for (int var8 = 0; var8 < this.field623; var8++) {
            this.field659[var8] = var6 += var3.method511(-124);
            if (var7 < this.field659[var8]) {
                var7 = this.field659[var8];
            }
        }
        this.field647 = new Object[var7 + 1];
        if (arg1 != 29725) {
            return;
        }
        this.field639 = new int[var7 + 1][];
        this.field632 = new int[var7 + 1];
        this.field646 = new int[var7 + 1];
        this.field622 = new Object[var7 + 1][];
        this.field625 = new int[var7 + 1];
        if (var5 != 0) {
            this.field629 = new int[var7 + 1];
            for (int var9 = 0; var9 < var7 + 1; var9++) {
                this.field629[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field623; var10++) {
                this.field629[this.field659[var10]] = var3.method464(-85);
            }
            this.field653 = new class146(this.field629);
        }
        for (int var11 = 0; var11 < this.field623; var11++) {
            this.field646[this.field659[var11]] = var3.method464(-122);
        }
        for (int var12 = 0; var12 < this.field623; var12++) {
            this.field632[this.field659[var12]] = var3.method464(-83);
        }
        for (int var13 = 0; var13 < this.field623; var13++) {
            this.field625[this.field659[var13]] = var3.method511(67);
        }
        for (int var14 = 0; var14 < this.field623; var14++) {
            int var20 = 0;
            int var21 = this.field659[var14];
            int var22 = this.field625[var21];
            int var23 = -1;
            this.field639[var21] = new int[var22];
            for (int var24 = 0; var24 < var22; var24++) {
                int var25 = this.field639[var21][var24] = var20 += var3.method511(class102.method836(arg1, -29798));
                if (var25 > var23) {
                    var23 = var25;
                }
            }
            this.field622[var21] = new Object[var23 + 1];
        }
        if (var5 == 0) {
            return;
        }
        this.field645 = new class146[var7 + 1];
        this.field663 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field623; var15++) {
            int var16 = this.field659[var15];
            int var17 = this.field625[var16];
            this.field663[var16] = new int[this.field622[var16].length];
            for (int var18 = 0; var18 < this.field622[var16].length; var18++) {
                this.field663[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                this.field663[var16][this.field639[var16][var19]] = var3.method464(-87);
            }
            this.field645[var16] = new class146(this.field663[var16]);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)[B")
    public final byte[] method194(int arg0, int arg1, int arg2) {
        field662++;
        if (arg2 < 0 || this.field622.length <= arg2 || this.field622[arg2] == null || arg0 < 0 || arg0 >= this.field622[arg2].length) {
            return null;
        }
        if (this.field622[arg2][arg0] == null) {
            boolean var4 = this.method216(-25355, null, arg2);
            if (!var4) {
                this.method202(arg2, -1);
                boolean var5 = this.method216(-25355, null, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class65.method458(false, this.field622[arg2][arg0], -9);
        if (arg1 < 71) {
            method204(-101, 48, false, -95, null, 104);
        }
        return var6;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)[B")
    public final byte[] method195(int arg0, byte arg1) {
        field626++;
        if (this.field622.length == 1) {
            return this.method215(arg0, 0, 1);
        } else if (this.field622[arg0].length == 1) {
            return this.method215(0, arg0, 1);
        } else {
            if (arg1 != 94) {
                this.method212(null, -20, 74);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Z")
    public final boolean method196(int arg0, int arg1) {
        if (arg1 != -17104) {
            this.field663 = null;
        }
        field660++;
        if (this.field622.length == 1) {
            return this.method199(-9350, 0, arg0);
        } else if (this.field622[arg0].length == 1) {
            return this.method199(arg1 ^ 0x664A, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III[I)[B")
    public final byte[] method197(int arg0, int arg1, int arg2, int[] arg3) {
        field655++;
        if (arg2 < 0 || this.field622.length <= arg2 || this.field622[arg2] == null || arg1 < 0 || arg1 >= this.field622[arg2].length) {
            return null;
        }
        if (this.field622[arg2][arg1] == null) {
            boolean var5 = this.method216(-25355, arg3, arg2);
            if (!var5) {
                this.method202(arg2, -1);
                boolean var6 = this.method216(-25355, arg3, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class65.method458(false, this.field622[arg2][arg1], -9);
        if (arg0 > -40) {
            this.method215(65, 38, 105);
        }
        if (this.field640) {
            this.field622[arg2][arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Z")
    public final boolean method198(byte arg0) {
        field657++;
        boolean var2 = true;
        int var3 = 102 % ((arg0 + 40) / 37);
        for (int var4 = 0; var4 < this.field659.length; var4++) {
            int var5 = this.field659[var4];
            if (this.field647[var5] == null) {
                this.method202(var5, -1);
                if (this.field647[var5] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)Z")
    public final boolean method199(int arg0, int arg1, int arg2) {
        field635++;
        if (arg1 < 0 || arg1 >= this.field622.length || this.field622[arg1] == null || arg2 < 0 || arg2 >= this.field622[arg1].length) {
            return false;
        } else if (this.field622[arg1][arg2] != null) {
            return true;
        } else if (this.field647[arg1] == null) {
            if (arg0 != -9350) {
                this.method198((byte) 100);
            }
            this.method202(arg1, -1);
            return this.field647[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static final void method200(int arg0) {
        field638++;
        class172.method1209(class45.field1094, -1);
        class52.field1341++;
        if (class62.field1504 && class86.field2011) {
            int var1 = class176.field3568;
            int var2 = var1 - class102.field2300;
            int var3 = class10.field222;
            if (arg0 == 0) {
                int var4 = class45.field1094.field989;
                int var5 = var3 - class99.field2217;
                if (class144.field3006 > var2) {
                    var2 = class144.field3006;
                }
                if (class145.field3032 > var5) {
                    var5 = class145.field3032;
                }
                if (class144.field3006 + class179.field3625.field1052 < var2 - -class45.field1094.field1052) {
                    var2 = class144.field3006 + class179.field3625.field1052 - class45.field1094.field1052;
                }
                int var6 = var2 - class36.field762;
                if (class45.field1094.field964 + var5 > class145.field3032 + class179.field3625.field964) {
                    var5 = class145.field3032 + class179.field3625.field964 - class45.field1094.field964;
                }
                int var7 = var5 - class40.field886;
                if (class52.field1341 > class45.field1094.field961 && (var6 > var4 || var6 < -var4 || var7 > var4 || var7 < -var4)) {
                    class205.field4029 = true;
                }
                int var8 = var5 + class179.field3625.field1043 - class145.field3032;
                int var9 = var2 + class179.field3625.field982 - class144.field3006;
                if (class45.field1094.field1020 != null && class205.field4029) {
                    class48 var10 = new class48();
                    var10.field1151 = var8;
                    var10.field1153 = class45.field1094;
                    var10.field1166 = class45.field1094.field1020;
                    var10.field1155 = var9;
                    class113.method894(var10, (byte) 56);
                }
                if (class146.field3038 == 0) {
                    if (class205.field4029) {
                        if (class45.field1094.field1067 != null) {
                            class48 var11 = new class48();
                            var11.field1153 = class45.field1094;
                            var11.field1166 = class45.field1094.field1067;
                            var11.field1151 = var8;
                            var11.field1150 = class140.field2931;
                            var11.field1155 = var9;
                            class113.method894(var11, (byte) 126);
                        }
                        if (class140.field2931 != null && class109.method871(class45.field1094, false) != null) {
                            class111.field2483.method169(-1494101117, 78);
                            class183.field3661++;
                            class111.field2483.method497(false, class140.field2931.field1013);
                            class111.field2483.method476(19058, class45.field1094.field945);
                            class111.field2483.method496(arg0 ^ 0x3298E928, class140.field2931.field945);
                            class111.field2483.method478((byte) -120, class45.field1094.field1013);
                        }
                    } else if ((class9.field206 == 1 || class202.method1326(class94.field2121 - 1, 2000)) && class94.field2121 > 2) {
                        class151.method1057(72);
                    } else if (class94.field2121 > 0) {
                        class36.method240((byte) -122, class94.field2121 - 1);
                    }
                    class45.field1094 = null;
                }
            }
        } else if (class52.field1341 > 1) {
            class45.field1094 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(IB)V")
    public void method201(int arg0, byte arg1) {
        if (arg1 > -42) {
            this.field623 = 2;
        }
        field650++;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V")
    public void method202(int arg0, int arg1) {
        if (arg1 == -1) {
            field636++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(IB)[I")
    public final int[] method203(int arg0, byte arg1) {
        if (arg1 == 68) {
            field651++;
            return this.field639[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIZILdd;I)V")
    public static final void method204(int arg0, int arg1, boolean arg2, int arg3, class32 arg4, int arg5) {
        class8.field189 = arg5;
        class45.field1104 = 1;
        class52.field1340 = arg1;
        class92.field2083 = arg2;
        class196.field3860 = arg4;
        class105.field2350 = arg0;
        if (arg3 != -15793) {
            method217(82);
        }
        class36.field764 = 10000;
        field649++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lea;B)V")
    public final void method205(class38 arg0, byte arg1) {
        field661++;
        class38 var3 = arg0.method251(12131);
        int var4 = this.field653.method1045(-1, var3.method266((byte) -106));
        if (arg1 < 25) {
            this.method211(false);
        }
        if (var4 >= 0) {
            this.method201(var4, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZB)V")
    public static final void method206(boolean arg0, byte arg1) {
        class167.method1188(2);
        if (arg1 != -103) {
            field628 = 32;
        }
        class63.field1532++;
        field644++;
        if (class63.field1532 < 50 && !arg0) {
            return;
        }
        class63.field1532 = 0;
        if (class135.field2846 || class39.field876 == null) {
            return;
        }
        class120.field2596++;
        class111.field2483.method169(-1494101117, 186);
        try {
            class39.field876.method361(0, (byte) 116, class111.field2483.field1627, class111.field2483.field1620);
            class111.field2483.field1620 = 0;
        } catch (IOException var2) {
            class135.field2846 = true;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLea;)I")
    public final int method207(byte arg0, class38 arg1) {
        field634++;
        if (arg0 != 32) {
            this.method192((byte) 10);
        }
        class38 var3 = arg1.method251(12131);
        return this.field653.method1045(-1, var3.method266((byte) -126));
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)V")
    public final void method208(int arg0, int arg1) {
        field648++;
        for (int var3 = 0; var3 < this.field622[arg0].length; var3++) {
            this.field622[arg0][var3] = null;
        }
        if (arg1 < 36) {
            this.method210((byte) -86, null, null);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)Z")
    public final boolean method209(byte arg0, int arg1) {
        field637++;
        if (arg0 != -92) {
            field652 = null;
        }
        if (this.field647[arg1] == null) {
            this.method202(arg1, -1);
            return this.field647[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLea;Lea;)[B")
    public final byte[] method210(byte arg0, class38 arg1, class38 arg2) {
        class38 var4 = arg1.method251(12131);
        class38 var5 = arg2.method251(12131);
        field633++;
        int var6 = this.field653.method1045(-1, var4.method266((byte) -109));
        int var7 = 53 / ((36 - arg0) / 62);
        int var8 = this.field645[var6].method1045(-1, var5.method266((byte) -128));
        return this.method215(var8, var6, 1);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public final void method211(boolean arg0) {
        field656++;
        if (arg0) {
            field652 = null;
        }
        for (int var2 = 0; var2 < this.field622.length; var2++) {
            if (this.field622[var2] != null) {
                for (int var3 = 0; var3 < this.field622[var2].length; var3++) {
                    this.field622[var2][var3] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lea;II)I")
    public final int method212(class38 arg0, int arg1, int arg2) {
        if (arg1 >= -59) {
            this.method199(91, 91, -126);
        }
        class38 var4 = arg0.method251(12131);
        field643++;
        return this.field645[arg2].method1045(-1, var4.method266((byte) -118));
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(II)I")
    public final int method213(int arg0, int arg1) {
        if (arg0 != 10000) {
            this.method194(-8, 126, -89);
        }
        field664++;
        return this.field622[arg1].length;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lea;Lea;I)Z")
    public final boolean method214(class38 arg0, class38 arg1, int arg2) {
        class38 var4 = arg0.method251(12131);
        if (arg2 > -66) {
            this.field622 = null;
        }
        field630++;
        class38 var5 = arg1.method251(12131);
        int var6 = this.field653.method1045(-1, var4.method266((byte) -117));
        int var7 = this.field645[var6].method1045(-1, var5.method266((byte) -125));
        return this.method199(-9350, var6, var7);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(III)[B")
    public final byte[] method215(int arg0, int arg1, int arg2) {
        field627++;
        return arg2 == 1 ? this.method197(-113, arg0, arg1, null) : null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[II)Z")
    private final boolean method216(int arg0, int[] arg1, int arg2) {
        field654++;
        if (this.field647[arg2] == null) {
            return false;
        }
        int[] var4 = this.field639[arg2];
        Object[] var5 = this.field622[arg2];
        int var6 = this.field625[arg2];
        boolean var7 = true;
        for (int var8 = 0; var8 < var6; var8++) {
            if (var5[var4[var8]] == null) {
                var7 = false;
                break;
            }
        }
        if (arg0 != -25355) {
            this.field663 = null;
        }
        if (var7) {
            return true;
        }
        byte[] var9;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var9 = class65.method458(false, this.field647[arg2], -9);
        } else {
            var9 = class65.method458(true, this.field647[arg2], -9);
            class66 var10 = new class66(var9);
            var10.method512(var10.field1627.length, 5, (byte) -88, arg1);
        }
        byte[] var11;
        try {
            var11 = class95.method795(var9, (byte) 106);
        } catch (RuntimeException var28) {
            throw class46.method332(var28, "T3 - " + (arg1 != null) + "," + arg2 + "," + var9.length + "," + class117.method907(var9, (byte) 72, var9.length) + "," + class117.method907(var9, (byte) 80, var9.length - 2) + "," + this.field646[arg2] + "," + this.field624);
        }
        if (this.field642) {
            this.field647[arg2] = null;
        }
        if (var6 > 1) {
            int var13 = var11.length;
            int var29 = var13 - 1;
            int var14 = var11[var29] & 0xFF;
            class66 var15 = new class66(var11);
            int var16 = var29 - var14 * 4 * var6;
            var15.field1620 = var16;
            int[] var17 = new int[var6];
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var6; var20++) {
                    var19 += var15.method464(-43);
                    var17[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var6][];
            for (int var22 = 0; var22 < var6; var22++) {
                var21[var22] = new byte[var17[var22]];
                var17[var22] = 0;
            }
            var15.field1620 = var16;
            int var23 = 0;
            for (int var24 = 0; var24 < var14; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var6; var26++) {
                    var25 += var15.method464(-74);
                    class131.method964(var11, var23, var21[var26], var17[var26], var25);
                    var23 += var25;
                    var17[var26] += var25;
                }
            }
            for (int var27 = 0; var27 < var6; var27++) {
                if (this.field640) {
                    var5[var4[var27]] = var21[var27];
                } else {
                    var5[var4[var27]] = class202.method1327(false, var21[var27], (byte) 2);
                }
            }
        } else if (this.field640) {
            var5[var4[0]] = var11;
        } else {
            var5[var4[0]] = class202.method1327(false, var11, (byte) 2);
        }
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public static void method217(int arg0) {
        int var1 = -29 % ((arg0 - 1) / 53);
        field652 = null;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(ZZ)V")
    public class32(boolean arg0, boolean arg1) {
        this.field640 = arg1;
        this.field642 = arg0;
    }
}
