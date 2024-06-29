import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class88 extends class213 {

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    private int field1764;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "[Z")
    private boolean[] field1763;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "[I")
    public int[] field1766;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "[[I")
    public int[][] field1759;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public static int field1750 = 0;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "Lob;")
    public static class141 field1765 = class175.method1195(40, "<col=00ff80>");

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public static int field1761 = 0;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "[I")
    public static int[] field1767 = new int[50];

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "[S")
    public static short[] field1752;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)Z")
    public static final boolean method595(boolean arg0) {
        field1762++;
        long var1 = class1.method2((byte) -100);
        int var3 = (int) (var1 - class178.field3514);
        if (var3 > 200) {
            var3 = 200;
        }
        class178.field3514 = var1;
        class78.field1579 += var3;
        if (class151.field2900 == 0 && class176.field3487 == 0 && class93.field1854 == 0 && class68.field1339 == 0) {
            return true;
        } else if (class176.field3494 == null) {
            return false;
        } else {
            try {
                if (class78.field1579 > 30000) {
                    throw new IOException();
                }
                while (class176.field3487 < 20 && class68.field1339 > 0) {
                    class209 var4 = (class209) class164.field3160.method799((byte) 117);
                    class146 var5 = new class146(4);
                    var5.method997(86, 1);
                    var5.method1011(-78, (int) var4.field4067);
                    class176.field3494.method1093(39, var5.field2859, 4, 0);
                    class154.field2974.method797(var4, var4.field4067, true);
                    class176.field3487++;
                    class68.field1339--;
                }
                while (class151.field2900 < 20 && class93.field1854 > 0) {
                    class209 var6 = (class209) class126.field2417.method814(15843);
                    class146 var7 = new class146(4);
                    var7.method997(81, 0);
                    var7.method1011(-128, (int) var6.field4067);
                    class176.field3494.method1093(39, var7.field2859, 4, 0);
                    var6.method1200((byte) 122);
                    class177.field3498.method797(var6, var6.field4067, true);
                    class93.field1854--;
                    class151.field2900++;
                }
                int var8 = 0;
                if (arg0) {
                    method599(59, 104);
                }
                while (var8 < 100) {
                    int var9 = class176.field3494.method1096(0);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class78.field1579 = 0;
                    byte var10 = 0;
                    if (class57.field1104 == null) {
                        var10 = 8;
                    } else if (class62.field1214 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class209.field3984.field2859.length - class57.field1104.field3944;
                        int var12 = 512 - class62.field1214;
                        if (var11 - class209.field3984.field2865 < var12) {
                            var12 = var11 - class209.field3984.field2865;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        class176.field3494.method1094(var12, (byte) 96, class209.field3984.field2859, class209.field3984.field2865);
                        if (class191.field3689 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class209.field3984.field2859[class209.field3984.field2865 + var13] = (byte) class157.method1091(class209.field3984.field2859[class209.field3984.field2865 + var13], class191.field3689);
                            }
                        }
                        class62.field1214 += var12;
                        class209.field3984.field2865 += var12;
                        if (class209.field3984.field2865 == var11) {
                            if (class57.field1104.field4067 == 16711935L) {
                                class86.field1709 = class209.field3984;
                                for (int var15 = 0; var15 < 256; var15++) {
                                    class22 var16 = class168.field3239[var15];
                                    if (var16 != null) {
                                        class86.field1709.field2865 = var15 * 8 + 5;
                                        int var17 = class86.field1709.method979(1029109968);
                                        int var18 = class86.field1709.method979(1029109968);
                                        var16.method135(var17, (byte) 88, var18);
                                    }
                                }
                            } else {
                                class204.field3914.reset();
                                class204.field3914.update(class209.field3984.field2859, 0, var11);
                                int var14 = (int) class204.field3914.getValue();
                                if (class57.field1104.field3979 != var14) {
                                    try {
                                        class176.field3494.method1089(-2);
                                    } catch (Exception var30) {
                                    }
                                    class176.field3494 = null;
                                    class11.field228++;
                                    class191.field3689 = (byte) (Math.random() * 255.0D + 1.0D);
                                    return false;
                                }
                                class38.field752 = 0;
                                class11.field228 = 0;
                                class57.field1104.field3981.method140((class57.field1104.field4067 & 0xFF0000L) == 16711680L, class209.field3984.field2859, class57.field1101, (int) (class57.field1104.field4067 & 0xFFFFL), (byte) 102);
                            }
                            class57.field1104.method1392(128);
                            class209.field3984 = null;
                            class62.field1214 = 0;
                            class57.field1104 = null;
                            if (class57.field1101) {
                                class176.field3487--;
                            } else {
                                class151.field2900--;
                            }
                        } else {
                            if (class62.field1214 != 512) {
                                break;
                            }
                            class62.field1214 = 0;
                        }
                    } else {
                        int var19 = var10 - class219.field4145.field2865;
                        if (var9 < var19) {
                            var19 = var9;
                        }
                        class176.field3494.method1094(var19, (byte) -127, class219.field4145.field2859, class219.field4145.field2865);
                        if (class191.field3689 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class219.field4145.field2859[class219.field4145.field2865 + var20] = (byte) class157.method1091(class219.field4145.field2859[class219.field4145.field2865 + var20], class191.field3689);
                            }
                        }
                        class219.field4145.field2865 += var19;
                        if (var10 > class219.field4145.field2865) {
                            break;
                        }
                        if (class57.field1104 == null) {
                            class219.field4145.field2865 = 0;
                            int var21 = class219.field4145.method991(255);
                            int var22 = class219.field4145.method1007(102);
                            int var23 = class219.field4145.method991(255);
                            int var24 = class219.field4145.method979(1029109968);
                            long var25 = (long) ((var21 << 16) + var22);
                            class209 var27 = (class209) class154.field2974.method792(var25, 22346);
                            class57.field1101 = true;
                            if (var27 == null) {
                                var27 = (class209) class177.field3498.method792(var25, 22346);
                                class57.field1101 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class57.field1104 = var27;
                            int var28 = var23 == 0 ? 5 : 9;
                            class209.field3984 = new class146(var24 + var28 + class57.field1104.field3944);
                            class209.field3984.method997(104, var23);
                            class209.field3984.method970(var24, (byte) -125);
                            class219.field4145.field2865 = 0;
                            class62.field1214 = 8;
                        } else if (class62.field1214 == 0) {
                            if (class219.field4145.field2859[0] == -1) {
                                class219.field4145.field2865 = 0;
                                class62.field1214 = 1;
                            } else {
                                class57.field1104 = null;
                            }
                        }
                    }
                    var8++;
                }
                return true;
            } catch (IOException var31) {
                try {
                    class176.field3494.method1089(-2);
                } catch (Exception var29) {
                }
                class38.field752++;
                class176.field3494 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method596(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg4;
            arg4 = var7;
        }
        int var8 = -105 % ((arg5 + 31) / 62);
        field1757++;
        int var9 = arg3 & 0x3;
        if (var9 == 0) {
            return arg1;
        } else if (var9 == 1) {
            return 1 + 7 - arg0 - arg6;
        } else if (var9 == 2) {
            return 7 + 1 - arg1 - arg4;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method597(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1756++;
        int var8 = arg2 + arg4;
        int var9 = arg2 + arg6;
        int var10 = arg5 - arg2;
        int var11 = arg7 - arg2;
        if (!arg0) {
            method595(true);
        }
        for (int var12 = arg4; var12 < var8; var12++) {
            class180.method1217(arg7, (byte) 52, arg6, arg1, class41.field805[var12]);
        }
        for (int var13 = arg5; var13 > var10; var13--) {
            class180.method1217(arg7, (byte) 52, arg6, arg1, class41.field805[var13]);
        }
        for (int var14 = var8; var14 <= var10; var14++) {
            int[] var15 = class41.field805[var14];
            class180.method1217(var9, (byte) 52, arg6, arg1, var15);
            class180.method1217(var11, (byte) 52, var9, arg3, var15);
            class180.method1217(arg7, (byte) 52, var11, arg1, var15);
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
    public static void method598(int arg0) {
        if (arg0 != 13786) {
            method599(17, 43);
        }
        field1765 = null;
        field1752 = null;
        field1767 = null;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)I")
    public static final int method599(int arg0, int arg1) {
        int var2 = 23 % ((-arg0 - 12) / 35);
        field1754++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILpe;ZLpe;)V")
    public static final void method600(int arg0, class154 arg1, boolean arg2, class154 arg3) {
        class190.field3679 = arg2;
        class77.field1566 = arg3;
        if (arg0 != -1888) {
            field1765 = null;
        }
        field1760++;
        class118.field2302 = arg1;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
    public static final void method601(int arg0) {
        class201.field3801 = null;
        class16.field291 = null;
        class224.field4225 = null;
        class30.field581 = null;
        if (arg0 >= -21) {
            field1750 = -43;
        }
        class30.field578 = null;
        field1758++;
        class114.field2186 = null;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(I[B)V")
    public class88(int arg0, byte[] arg1) {
        this.field1751 = arg0;
        class146 var3 = new class146(arg1);
        this.field1764 = var3.method991(255);
        this.field1763 = new boolean[this.field1764];
        this.field1766 = new int[this.field1764];
        this.field1759 = new int[this.field1764][];
        for (int var4 = 0; var4 < this.field1764; var4++) {
            this.field1766[var4] = var3.method991(255);
        }
        for (int var5 = 0; var5 < this.field1764; var5++) {
            this.field1763[var5] = var3.method991(255) == 1;
        }
        for (int var6 = 0; var6 < this.field1764; var6++) {
            this.field1759[var6] = new int[var3.method991(255)];
        }
        for (int var7 = 0; var7 < this.field1764; var7++) {
            for (int var8 = 0; var8 < this.field1759[var7].length; var8++) {
                this.field1759[var7][var8] = var3.method991(255);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(III)V")
    public static final void method602(int arg0, int arg1, int arg2) {
        field1753++;
        class31 var3 = class141.method904(arg1, arg2 - 23272);
        int var4 = var3.field622;
        if (arg2 != 23207) {
            field1750 = 68;
        }
        int var5 = var3.field619;
        int var6 = var3.field624;
        int var7 = class161.field3124[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class180.field3538[var4] = class57.method389(class15.method94(class180.field3538[var4], ~var8), class15.method94(var8, arg0 << var5));
    }
}
