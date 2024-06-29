import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class308 extends class197 {

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    private int field5222 = 2;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "I")
    private int field5226 = 5;

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "I")
    private int field5229 = 1;

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "[S")
    private short[] field5230 = new short[512];

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    private int field5219 = 2048;

    @OriginalMember(owner = "client!ej", name = "db", descriptor = "[B")
    private byte[] field5235 = new byte[512];

    @OriginalMember(owner = "client!ej", name = "ib", descriptor = "I")
    private int field5240 = 5;

    @OriginalMember(owner = "client!ej", name = "hb", descriptor = "I")
    private int field5239 = 0;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "Loh;")
    public static class258 field5223 = class153.method1046("<img=0>", 109);

    @OriginalMember(owner = "client!ej", name = "bb", descriptor = "Loh;")
    private static class258 field5233 = class153.method1046("Allocated memory", 122);

    @OriginalMember(owner = "client!ej", name = "eb", descriptor = "Loh;")
    public static class258 field5236 = field5233;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "Lmb;")
    public static class172 field5224 = new class172(100);

    @OriginalMember(owner = "client!ej", name = "gb", descriptor = "Loh;")
    public static class258 field5238 = class153.method1046("Opened titlescreen)3", 104);

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!ej", name = "ab", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!ej", name = "cb", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ej", name = "fb", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!ej", name = "jb", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "Lgb;")
    public static class213 field5221;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)I", line = 6)
    public static final int method2142(int arg0, int arg1) {
        field5228++;
        if (arg1 > -119) {
            method2144((byte[]) null, -14);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "(B)V", line = 18)
    public static final void method2143(byte arg0) {
        field5231++;
        if (class165.field2810 == 0) {
            return;
        }
        try {
            if (++class260.field4521 > 2000) {
                if (class73.field1289 != null) {
                    class73.field1289.method1122(-1);
                    class73.field1289 = null;
                }
                if (class74.field1293 >= 1) {
                    class246.field4275 = -5;
                    class165.field2810 = 0;
                    return;
                }
                class74.field1293++;
                class165.field2810 = 1;
                class260.field4521 = 0;
                if (class193.field3413 == class130.field2294) {
                    class193.field3413 = class118.field2090;
                } else {
                    class193.field3413 = class130.field2294;
                }
            }
            if (class165.field2810 == 1) {
                class15.field199 = class297.field5086.method2073(class120.field2112, -30885, class193.field3413);
                class165.field2810 = 2;
            }
            if (arg0 != 75) {
                method2147(-42, -6, 3, -108);
            }
            if (class165.field2810 == 2) {
                if (class15.field199.field2067 == 2) {
                    throw new IOException();
                }
                if (class15.field199.field2067 != 1) {
                    return;
                }
                class73.field1289 = new class169((Socket) class15.field199.field2063, class297.field5086);
                class15.field199 = null;
                class73.field1289.method1123(4900, 0, class159.field2710.field4051, class159.field2710.field4066);
                if (class76.field1322 != null) {
                    class76.field1322.method1007((byte) -13);
                }
                if (class152.field2602 != null) {
                    class152.field2602.method1007((byte) -13);
                }
                int var1 = class73.field1289.method1117(0);
                if (class76.field1322 != null) {
                    class76.field1322.method1007((byte) -13);
                }
                if (class152.field2602 != null) {
                    class152.field2602.method1007((byte) -13);
                }
                if (var1 != 21) {
                    class246.field4275 = var1;
                    class165.field2810 = 0;
                    class73.field1289.method1122(-1);
                    class73.field1289 = null;
                    return;
                }
                class165.field2810 = 3;
            }
            if (class165.field2810 == 3) {
                if (class73.field1289.method1124(true) < 1) {
                    return;
                }
                class36.field462 = new class258[class73.field1289.method1117(0)];
                class165.field2810 = 4;
            }
            if (class165.field2810 == 4) {
                if (class73.field1289.method1124(true) < (class36.field462.length * 8)) {
                    return;
                }
                class293.field5036.field4051 = 0;
                class73.field1289.method1120(false, 0, class36.field462.length * 8, class293.field5036.field4066);
                for (int var2 = 0; var2 < class36.field462.length; var2++) {
                    class36.field462[var2] = class162.method1085(arg0 + 27, class293.field5036.method1593(115));
                }
                class246.field4275 = 21;
                class165.field2810 = 0;
                class73.field1289.method1122(-1);
                class73.field1289 = null;
                return;
            }
        } catch (IOException var4) {
            if (class73.field1289 != null) {
                class73.field1289.method1122(-1);
                class73.field1289 = null;
            }
            if (class74.field1293 < 1) {
                class74.field1293++;
                if (class193.field3413 == class130.field2294) {
                    class193.field3413 = class118.field2090;
                } else {
                    class193.field3413 = class130.field2294;
                }
                class260.field4521 = 0;
                class165.field2810 = 1;
            } else {
                class165.field2810 = 0;
                class246.field4275 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 173)
    public class308() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILva;I)V", line = 179)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            field5221 = (class213) null;
        }
        if (arg2 == 0) {
            this.field5240 = this.field5226 = arg1.method1589(54);
        } else if (arg2 == 1) {
            this.field5239 = arg1.method1589(arg0 ^ 0x1F6D);
        } else if (arg2 == 2) {
            this.field5219 = arg1.method1615(-24);
        } else if (arg2 == 3) {
            this.field5222 = arg1.method1589(66);
        } else if (arg2 == 4) {
            this.field5229 = arg1.method1589(82);
        } else if (arg2 == 5) {
            this.field5240 = arg1.method1589(67);
        } else if (arg2 == 6) {
            this.field5226 = arg1.method1589(61);
        }
        field5232++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 264)
    public final void method223(int arg0) {
        if (arg0 != 11135) {
            this.method96(-69, 119);
        }
        this.field5235 = class86.method621(this.field5239, 85);
        field5241++;
        this.method2148(255);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([BI)[B", line = 286)
    public static final byte[] method2144(byte[] arg0, int arg1) {
        class235 var2 = new class235(arg0);
        field5218++;
        int var3 = var2.method1589(110);
        int var4 = var2.method1611(114);
        if (var4 < 0 || !(class250.field4309 == 0 || class250.field4309 >= var4)) {
            throw new RuntimeException();
        }
        if (arg1 != -11508) {
            method2146((class213) null, 49, (class216) null, (class213) null, false);
        }
        if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1596(295019472, var4, var7, 0);
            return var7;
        }
        int var5 = var2.method1611(-63);
        if (var5 < 0 || class250.field4309 != 0 && class250.field4309 < var5) {
            throw new RuntimeException();
        }
        byte[] var6 = new byte[var5];
        if (var3 == 1) {
            class143.method973(var6, var5, arg0, var4, 9);
        } else {
            class4.field55.method800(var6, 10, var2);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V", line = 342)
    public static void method2145(int arg0) {
        field5224 = null;
        field5238 = null;
        field5221 = null;
        field5223 = null;
        field5233 = null;
        if (arg0 >= 121) {
            field5236 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[I", line = 374)
    public final int[] method96(int arg0, int arg1) {
        if (arg0 != -16221) {
            return (int[]) null;
        }
        field5227++;
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            int var4 = class268.field4670[arg1] * this.field5226 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class190.field3362; var7++) {
                class2.field29 = Integer.MAX_VALUE;
                class119.field2104 = Integer.MAX_VALUE;
                class283.field4864 = Integer.MAX_VALUE;
                class105.field1891 = Integer.MAX_VALUE;
                int var8 = class166.field2822[var7] * this.field5240 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field5235[(this.field5226 <= var11 ? var11 - this.field5226 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field5235[var12 + (var13 < this.field5240 ? var13 : var13 - this.field5240) & 0xFF] & 0xFF) * 2;
                        int var10000 = -(var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 + var8 - this.field5230[var14];
                        int var16 = var4 - (var11 << 12) - this.field5230[var27];
                        int var17 = this.field5229;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + (var16 * var16) >> 12;
                        } else if (var17 == 3) {
                            int var24 = var15 >= 0 ? var15 : -var15;
                            int var25 = var16 >= 0 ? var16 : -var16;
                            var18 = var25 < var24 ? var24 : var25;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var19 = var15 * var15;
                            int var20 = var16 * var16;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var19 + var20) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 >= 0 ? var15 : -var15) + (var16 < 0 ? -var16 : var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var18 < class105.field1891) {
                            class2.field29 = class119.field2104;
                            class119.field2104 = class283.field4864;
                            class283.field4864 = class105.field1891;
                            class105.field1891 = var18;
                        } else if (var18 < class283.field4864) {
                            class2.field29 = class119.field2104;
                            class119.field2104 = class283.field4864;
                            class283.field4864 = var18;
                        } else if (class119.field2104 > var18) {
                            class2.field29 = class119.field2104;
                            class119.field2104 = var18;
                        } else if (class2.field29 > var18) {
                            class2.field29 = var18;
                        }
                    }
                }
                int var26 = this.field5222;
                if (var26 == 0) {
                    var3[var7] = class105.field1891;
                } else if (var26 == 1) {
                    var3[var7] = class283.field4864;
                } else if (var26 == 3) {
                    var3[var7] = class119.field2104;
                } else if (var26 == 4) {
                    var3[var7] = class2.field29;
                } else if (var26 == 2) {
                    var3[var7] = class283.field4864 - class105.field1891;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lgb;ILhg;Lgb;Z)V", line = 581)
    public static final void method2146(class213 arg0, int arg1, class216 arg2, class213 arg3, boolean arg4) {
        class122.field2170 = arg4;
        class251.field4325 = arg3;
        class94.field1656 = arg0;
        field5237++;
        int var5 = class251.field4325.method1444(true) - 1;
        if (arg1 >= -120) {
            method2142(-122, -104);
        }
        class137.field2336 = class251.field4325.method1435((byte) -21, var5) + var5 * 256;
        class281.field4829 = arg2;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)V", line = 599)
    public static final void method2147(int arg0, int arg1, int arg2, int arg3) {
        if (~class186.field3307 != arg2 && arg3 != 0 && class299.field5118 < 50 && arg1 != -1) {
            class147.field2492[class299.field5118] = arg1;
            class182.field3263[class299.field5118] = arg3;
            class307.field5212[class299.field5118] = arg0;
            class191.field3372[class299.field5118] = null;
            class114.field1964[class299.field5118] = 0;
            class299.field5118++;
        }
        field5225++;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V", line = 631)
    private final void method2148(int arg0) {
        if (arg0 != 255) {
            this.field5219 = -23;
        }
        Random var2 = new Random((long) this.field5239);
        field5220++;
        this.field5230 = new short[512];
        if (this.field5219 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field5230[var3] = (short) class285.method1996(1, var2, this.field5219);
            }
        }
    }
}
