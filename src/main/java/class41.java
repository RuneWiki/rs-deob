import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class41 extends class182 {

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    private int field887 = 2048;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    private int field874 = 5;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    private int field880 = 2;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "[B")
    private byte[] field886 = new byte[512];

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    private int field876 = 0;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "[S")
    private short[] field890 = new short[512];

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    private int field892 = 1;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    private int field893 = 5;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "[Lnj;")
    public static class252[] field894 = new class252[8];

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "Lme;")
    public static class210 field877;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 8)
    public static final String method316(long arg0, int arg1) {
        field883++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            if (arg1 != 30274) {
                method323((byte) 28, 68, 35, -126);
            }
            while (var4 != 0L) {
                var3++;
                var4 /= 37L;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class158.field2670[(int) (var7 - arg0 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)[I", line = 51)
    public final int[] method125(int arg0, int arg1) {
        if (arg0 != 2) {
            method320(true, false);
        }
        int[] var3 = this.field3166.method775(arg1, arg0 + 123);
        field878++;
        if (this.field3166.field1903) {
            int var4 = class248.field4066[arg1] * this.field893 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class26.field672; var7++) {
                class33.field727 = Integer.MAX_VALUE;
                class276.field4499 = Integer.MAX_VALUE;
                class341.field5401 = Integer.MAX_VALUE;
                class319.field5192 = Integer.MAX_VALUE;
                int var8 = class21.field539[var7] * this.field874 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field886[(var11 < this.field893 ? var11 : var11 - this.field893) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field886[var12 + (this.field874 > var13 ? var13 : var13 - this.field874) & 0xFF] & 0xFF) * 2;
                        int var10000 = var8 - (var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 - this.field890[var14];
                        int var16 = var4 - (var11 << 12) - this.field890[var27];
                        int var17 = this.field892;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var16 < 0 ? -var16 : var16;
                            int var25 = var15 < 0 ? -var15 : var15;
                            var18 = var24 >= var25 ? var24 : var25;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var19 = var15 * var15;
                            int var20 = var16 * var16;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var19 + var20) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var16 >= 0 ? var16 : -var16) + (var15 >= 0 ? var15 : -var15);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + (var16 * var16)) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var18 < class319.field5192) {
                            class33.field727 = class276.field4499;
                            class276.field4499 = class341.field5401;
                            class341.field5401 = class319.field5192;
                            class319.field5192 = var18;
                        } else if (class341.field5401 > var18) {
                            class33.field727 = class276.field4499;
                            class276.field4499 = class341.field5401;
                            class341.field5401 = var18;
                        } else if (class276.field4499 > var18) {
                            class33.field727 = class276.field4499;
                            class276.field4499 = var18;
                        } else if (var18 < class33.field727) {
                            class33.field727 = var18;
                        }
                    }
                }
                int var26 = this.field880;
                if (var26 == 0) {
                    var3[var7] = class319.field5192;
                } else if (var26 == 1) {
                    var3[var7] = class341.field5401;
                } else if (var26 == 3) {
                    var3[var7] = class276.field4499;
                } else if (var26 == 4) {
                    var3[var7] = class33.field727;
                } else if (var26 == 2) {
                    var3[var7] = class341.field5401 - class319.field5192;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILvm;I)V", line = 264)
    public static final void method317(int arg0, int arg1, int arg2, class88 arg3, int arg4) {
        field889++;
        if (class137.field2343 >= 400) {
            return;
        }
        if (arg3.field1552 != null) {
            arg3 = arg3.method681((byte) 15);
        }
        if (arg3 == null || !arg3.field1582) {
            return;
        }
        if (arg0 < 17) {
            field894 = (class252[]) null;
        }
        String var5 = arg3.field1531;
        if (arg3.field1597 != 0) {
            String var6 = class141.field2383 == 1 ? class346.field5528 : class278.field4541;
            var5 = var5 + class301.method2156(arg3.field1597, (byte) 77, class96.field1750.field1776) + " (" + var6 + arg3.field1597 + ")";
        }
        if (class222.field3674 == 1) {
            class358.method2530(class147.field2511 + " -> <col=ffff00>" + var5, (long) arg1, arg4, (short) 4, false, class363.field5744, arg2, class284.field4642);
            class255.field4179++;
        } else if (class52.field1046) {
            class321 var7 = class143.field2415 == -1 ? null : class346.method2467(class143.field2415, 11);
            if ((class332.field5295 & 0x2) != 0 && (var7 == null || arg3.method668(-65536, var7.field5223, class143.field2415) != var7.field5223)) {
                class86.field1508++;
                class358.method2530(class10.field287 + " -> <col=ffff00>" + var5, (long) arg1, arg4, (short) 37, false, class112.field2047, arg2, class13.field397);
            }
        } else {
            String[] var8 = arg3.field1537;
            if (class178.field2940) {
                var8 = class195.method1345(0, var8);
            }
            class220.field3655++;
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class141.field2383 != 0 || !var8[var9].equalsIgnoreCase(class353.field5648))) {
                        int var10 = -1;
                        if (arg3.field1560 == var9) {
                            var10 = arg3.field1576;
                        }
                        if (arg3.field1573 == var9) {
                            var10 = arg3.field1568;
                        }
                        class319.field5199++;
                        byte var11 = 0;
                        if (var9 == 0) {
                            var11 = 32;
                        }
                        if (var9 == 1) {
                            var11 = 6;
                        }
                        if (var9 == 2) {
                            var11 = 47;
                        }
                        if (var9 == 3) {
                            var11 = 46;
                        }
                        if (var9 == 4) {
                            var11 = 16;
                        }
                        class358.method2530("<col=ffff00>" + var5, (long) arg1, arg4, var11, false, var8[var9], arg2, var10);
                    }
                }
            }
            if (class141.field2383 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class353.field5648)) {
                        class54.field1083++;
                        short var13 = 0;
                        if (class96.field1750.field1776 < arg3.field1597) {
                            var13 = 2000;
                        }
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 32;
                        }
                        if (var12 == 1) {
                            var14 = 6;
                        }
                        if (var12 == 2) {
                            var14 = 47;
                        }
                        if (var12 == 3) {
                            var14 = 46;
                        }
                        if (var12 == 4) {
                            var14 = 16;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class358.method2530("<col=ffff00>" + var5, (long) arg1, arg4, var14, false, var8[var12], arg2, arg3.field1540);
                    }
                }
            }
            class358.method2530("<col=ffff00>" + var5, (long) arg1, arg4, (short) 1010, false, class21.field547, arg2, class153.field2624);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIZIIII)V", line = 426)
    public static final void method318(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field884++;
        if (arg3) {
            return;
        }
        if (class190.field3224 <= arg0 && arg1 <= class289.field4704 && arg5 >= class87.field1520 && class177.field2930 >= arg4) {
            class291.method2064(arg7, -1, arg5, arg4, arg6, arg0, arg2, arg1);
        } else {
            class284.method2021(arg7, arg0, arg4, arg5, arg1, arg2, 27809, arg6);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Loe;IB)V", line = 465)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field874 = this.field893 = arg0.method1005((byte) 122);
        } else if (arg1 == 1) {
            this.field876 = arg0.method1005((byte) 122);
        } else if (arg1 == 2) {
            this.field887 = arg0.method989(126);
        } else if (arg1 == 3) {
            this.field880 = arg0.method1005((byte) 122);
        } else if (arg1 == 4) {
            this.field892 = arg0.method1005((byte) 122);
        } else if (arg1 == 5) {
            this.field874 = arg0.method1005((byte) 122);
        } else if (arg1 == 6) {
            this.field893 = arg0.method1005((byte) 122);
        }
        field881++;
        if (arg2 != 60) {
            this.field880 = -15;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 629)
    public class41() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V", line = 529)
    public static final void method319(int arg0) {
        if (arg0 != 104) {
            return;
        }
        class347.field5542.method895(128);
        field888++;
        class359.field5714.method895(128);
        class176.field2907.method895(128);
        class20.field517.method895(128);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZZ)V", line = 543)
    public static final void method320(boolean arg0, boolean arg1) {
        class11.field367 = new int[104];
        field882++;
        class144.field2417 = new int[104];
        class144.field2418 = new int[5];
        class198.field3307 = new int[104];
        class298.field4848 = new int[104];
        class311.field5064 = 99;
        class58.field1145 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class355.field5656 = new byte[var2][104][104];
        if (arg0) {
            return;
        }
        class79.field1409 = new byte[var2][105][105];
        class99.field1811 = new byte[var2][104][104];
        class167.field2793 = new int[var2][105][105];
        class1.field23 = new byte[var2][104][104];
        class54.field1081 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)J", line = 573)
    public static final long method321(int arg0, String arg1) {
        if (arg0 != 4) {
            return 125L;
        }
        field885++;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)V", line = 602)
    private final void method322(int arg0) {
        field875++;
        Random var2 = new Random((long) this.field876);
        if (arg0 != 25850) {
            method316(6L, -45);
        }
        this.field890 = new short[512];
        if (this.field887 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field890[var3] = (short) class91.method696(var2, this.field887, 57);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BIII)V", line = 633)
    public static final void method323(byte arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1008) {
            class192.method1329(arg2, arg3, (byte) 41, 10);
        } else if (arg1 == 1006) {
            class192.method1329(arg2, arg3, (byte) 41, 11);
        } else if (arg1 == 1005) {
            class192.method1329(arg2, arg3, (byte) 41, 12);
        } else if (arg1 == 1003) {
            class192.method1329(arg2, arg3, (byte) 41, 13);
        } else if (arg1 == 1009) {
            class192.method1329(arg2, arg3, (byte) 41, 14);
        }
        field891++;
        if (arg0 != 51) {
            field877 = (class210) null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V", line = 664)
    public final void method163(int arg0) {
        this.field886 = class223.method1561(15844, this.field876);
        this.method322(25850);
        field879++;
        if (arg0 != 100) {
            this.method125(-108, 38);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)V", line = 689)
    public static void method324(boolean arg0) {
        field894 = null;
        field877 = null;
        if (arg0) {
            method320(true, true);
        }
    }
}
