import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class333 extends class237 {

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "[I")
    private int[] field5318 = new int[this.field3642];

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "Ljava/lang/String;")
    public static String field5327 = "Drop";

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "Len;")
    public static class49 field5322 = new class49(5000);

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "[I")
    public static int[] field5332 = new int[200];

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    public static int field5331 = 0;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "B")
    public static byte field5333 = 0;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    private int field5324;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    private int field5326;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "[B")
    private byte[] field5323;

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIIIIF)V", line = 7)
    public class333(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field3642; var7++) {
            this.field5318[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BII)V", line = 25)
    public final void method1641(byte arg0, int arg1, int arg2) {
        field5319++;
        this.field5324 += this.field5318[arg2] * arg1 >> 12;
        if (arg0 >= -19) {
            this.method1641((byte) 84, -94, 84);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLhi;I)I", line = 39)
    public static final int method2302(byte arg0, class323 arg1, int arg2) {
        field5328++;
        if (arg1.field5042 == null || arg2 >= arg1.field5042.length) {
            return -2;
        }
        try {
            if (arg0 != -75) {
                field5331 = -121;
            }
            int[] var3 = arg1.field5042[arg2];
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var6;
                }
                if (var7 == 1) {
                    var8 = class344.field5464[var3[var4++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 2) {
                    var8 = class163.field2517[var3[var4++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 3) {
                    var8 = class322.field5009[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class323 var12 = class45.method277(-12866, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class190.method1302(var13, (byte) -27).field4867 || class33.field387)) {
                        for (int var14 = 0; var14 < var12.field5143.length; var14++) {
                            if (var13 + 1 == var12.field5143[var14]) {
                                var8 += var12.field5153[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class255.field4041[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class334.field5336[class163.field2517[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class255.field4041[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class11.field113.field840;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class146.field2322[var15]) {
                            var8 += class163.field2517[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class323 var18 = class45.method277(arg0 - 12791, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class190.method1302(var19, (byte) -114).field4867 || class33.field387)) {
                        for (int var20 = 0; var20 < var18.field5143.length; var20++) {
                            if ((var19 + 1) == var18.field5143[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class199.field3011;
                }
                if (var7 == 12) {
                    var8 = class263.field4175;
                }
                if (var7 == 13) {
                    int var21 = class255.field4041[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class201.method1396((byte) 105, var23);
                }
                if (var7 == 18) {
                    var8 = (class11.field113.field3767 >> 7) + class322.field4999;
                }
                if (var7 == 19) {
                    var8 = (class11.field113.field3763 >> 7) + class16.field160;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var6 += var8;
                    }
                    if (var5 == 1) {
                        var6 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var6 /= var8;
                    }
                    if (var5 == 3) {
                        var6 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 247)
    public final void method1637(int arg0) {
        field5321++;
        this.field5324 = Math.abs(this.field5324);
        if (this.field5324 >= 4096) {
            this.field5324 = 4095;
        }
        this.method1227(this.field5326++, (byte) (this.field5324 >> 4));
        if (arg0 <= -124) {
            this.field5324 = 0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V", line = 263)
    public final void method1643(byte arg0) {
        field5329++;
        this.field5324 = 0;
        if (arg0 == 12) {
            this.field5326 = 0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V", line = 276)
    public static void method2303(int arg0) {
        field5322 = null;
        field5327 = null;
        field5332 = null;
        if (arg0 > -94) {
            method2303(-40);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)V", line = 293)
    public void method1227(int arg0, byte arg1) {
        this.field5323[this.field5326++] = (byte) ((class261.method1840(255, arg1) >> 1) + 127);
        field5317++;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V", line = 301)
    public static final void method2304(int arg0) {
        field5330++;
        int var1 = class67.field834.length;
        if (arg0 > -48) {
            return;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class67.field834[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class29.field343; var4++) {
                    if (class281.field4451[var4] == class218.field3277[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class281.field4451[class29.field343] = class218.field3277[var2];
                    var3 = class29.field343++;
                }
                class143 var5 = new class143(class67.field834[var2]);
                int var6 = 0;
                while (var5.field2295 < class67.field834[var2].length && var6 < 511 && class296.field4667 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1051(1);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FDA) >> 7;
                    int var11 = (class218.field3277[var2] >> 8) * 64 + var10 - class322.field4999;
                    int var12 = var8 & 0x3F;
                    int var13 = (class218.field3277[var2] & 0xFF) * 64 + var12 - class16.field160;
                    class140 var14 = class178.method1229(var5.method1051(1), 8);
                    if (class251.field3974[var7] == null && (var14.field2155 & 0x1) > 0 && class207.field3127 == var9 && var11 >= 0 && (var11 + var14.field2111) < 104 && var13 >= 0 && (var14.field2111 + var13) < 104) {
                        class251.field3974[var7] = new class231();
                        class231 var15 = class251.field3974[var7];
                        class225.field3392[class296.field4667++] = var7;
                        var15.field3772 = class102.field1381;
                        var15.method1599(23299, var14);
                        var15.method1721(362, var15.field3503.field2111);
                        var15.field3806 = var15.field3760 = class28.field331[var15.field3503.field2109];
                        var15.field3729 = var15.field3503.field2134;
                        if (var15.field3729 == 0) {
                            var15.field3760 = 0;
                        }
                        var15.field3746 = var15.field3503.field2145;
                        var15.method1714(var11, var15.method412((byte) 74), false, var13, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(IB)I", line = 395)
    public static final int method2305(int arg0, byte arg1) {
        int var2 = 0;
        field5320++;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        int var3 = -50 % ((arg1 - 86) / 34);
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return var2 + arg0;
    }
}
