import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class98 extends class232 {

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "I")
    private int field1771 = 4096;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "Z")
    private boolean field1765 = true;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "[Lmi;")
    public static class208[] field1764 = new class208[28];

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "[I")
    public static int[] field1772 = new int[32];

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "Lhi;")
    public static class82 field1770 = class95.method664((byte) -89, ": ");

    @OriginalMember(owner = "client!bj", name = "bb", descriptor = "Lhi;")
    public static class82 field1776;

    @OriginalMember(owner = "client!bj", name = "ab", descriptor = "[I")
    public static int[] field1775;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!bj", name = "Y", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!bj", name = "Z", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)[[I", line = 10)
    public final int[][] method146(int arg0, byte arg1) {
        if (arg1 != -82) {
            method677((byte) -1);
        }
        int[][] var3 = this.field3996.method136(0, arg0);
        if (this.field3996.field278) {
            int[] var4 = this.method1649(0, (byte) 61, class209.field3684 & arg0 - 1);
            int[] var5 = this.method1649(0, (byte) 73, arg0);
            int[] var6 = this.method1649(0, (byte) 65, arg0 + 1 & class209.field3684);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; var10 < class54.field858; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field1771;
                int var12 = (var5[var10 + 1 & class65.field1024] - var5[class65.field1024 & var10 - 1]) * this.field1771;
                int var13 = var11 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 + var14 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var12 / var17;
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                }
                if (this.field1765) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var18;
                var9[var10] = var20;
                var8[var10] = var19;
            }
        }
        field1766++;
        return var3;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1772[var1] = var0 - 1;
            var0 += var0;
        }
        field1776 = class95.method664((byte) -92, " est d-Bj-9 dans votre liste d(Wamis)3");
        field1775 = new int[2];
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIILrm;Lrm;IIJ)V", line = 95)
    public static final void method673(int arg0, int arg1, int arg2, int arg3, class175 arg4, class175 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class90 var10 = new class90();
        var10.field1622 = arg8;
        var10.field1620 = arg1 * 128 + 64;
        var10.field1621 = arg2 * 128 + 64;
        var10.field1619 = arg3;
        var10.field1626 = arg4;
        var10.field1617 = arg5;
        var10.field1629 = arg6;
        var10.field1624 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class15.field120[var11][arg1][arg2] == null) {
                class15.field120[var11][arg1][arg2] = new class16(var11, arg1, arg2);
            }
        }
        class15.field120[arg0][arg1][arg2].field171 = var10;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)I", line = 121)
    public static int method674(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "(I)[Lve;", line = 135)
    public static final class212[] method675(int arg0) {
        field1769++;
        class212[] var1 = new class212[class212.field3714];
        for (int var2 = 0; var2 < class212.field3714; var2++) {
            if (class147.field2485) {
                var1[var2] = new class225(class285.field4793, class28.field381, class86.field1536[var2], class20.field262[var2], class107.field1897[var2], class42.field747[var2], class260.field4453[var2], class142.field2427);
            } else {
                var1[var2] = new class186(class285.field4793, class28.field381, class86.field1536[var2], class20.field262[var2], class107.field1897[var2], class42.field747[var2], class260.field4453[var2], class142.field2427);
            }
        }
        if (arg0 >= -13) {
            field1776 = (class82) null;
        }
        class3.method23(286013516);
        return var1;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 160)
    public class98() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(B)Z", line = 169)
    public static final boolean method676(byte arg0) {
        field1773++;
        if (arg0 != -67) {
            field1772 = (int[]) null;
        }
        try {
            return class4.method29((byte) -98);
        } catch (IOException var5) {
            class171.method1207(-106);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class187.field3155 + "," + class184.field3129 + "," + class220.field3819 + " - " + class199.field3421 + "," + (class230.field3976 + class168.field2932.field1723[0]) + "," + (class168.field2932.field1720[0] + class226.field3916) + " - ";
            for (int var4 = 0; var4 < class199.field3421 && var4 < 50; var4++) {
                var3 = var3 + class35.field545.field2598[var4] + ",";
            }
            class48.method348(-2, var3, var6);
            class222.method1571(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBLbc;)V", line = 202)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        field1774++;
        if (arg1 != -19) {
            method678(26, -17);
        }
        if (arg0 == 0) {
            this.field1771 = arg2.method1090(false);
        } else if (arg0 == 1) {
            this.field1765 = arg2.method1082(-51) == 1;
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(B)V", line = 239)
    public static void method677(byte arg0) {
        field1764 = null;
        field1772 = null;
        field1776 = null;
        if (arg0 > -46) {
            field1775 = (int[]) null;
        }
        field1775 = null;
        field1770 = null;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(II)I", line = 257)
    public static final int method678(int arg0, int arg1) {
        field1767++;
        if (!(arg1 < 65 || arg1 > 90) || !(arg1 < 192 || arg1 > 222 || arg1 == 215)) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else {
            if (arg0 != -10) {
                field1772 = (int[]) null;
            }
            return arg1 == 140 ? 156 : arg1;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILme;I)I", line = 297)
    public static final int method679(int arg0, class75 arg1, int arg2) {
        field1768++;
        if (arg1.field1152 == null || arg0 >= arg1.field1152.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field1152[arg0];
            int var4 = 0;
            if (arg2 != -1) {
                field1770 = (class82) null;
            }
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 1) {
                    var8 = class331.field5631[var3[var4++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 2) {
                    var8 = class22.field296[var3[var4++]];
                }
                if (var7 == 3) {
                    var8 = class208.field3645[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class75 var12 = class282.method1965(var11, (byte) 6);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class273.method1912(var13, -51).field5340 || class323.field5547)) {
                        for (int var14 = 0; var14 < var12.field1170.length; var14++) {
                            if (var13 + 1 == var12.field1170[var14]) {
                                var8 += var12.field1144[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class312.field5398[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class282.field4739[class22.field296[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class312.field5398[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class168.field2932.field1407;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class269.field4560[var15]) {
                            var8 += class22.field296[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class75 var18 = class282.method1965(var17, (byte) 6);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class273.method1912(var19, arg2 ^ 0x64).field5340 || class323.field5547)) {
                        for (int var20 = 0; var20 < var18.field1170.length; var20++) {
                            if ((var19 + 1) == var18.field1170[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class235.field4091;
                }
                if (var7 == 12) {
                    var8 = class325.field5580;
                }
                if (var7 == 13) {
                    int var21 = class312.field5398[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class161.method1169(var23, 0);
                }
                if (var7 == 18) {
                    var8 = (class168.field2932.field1685 >> 7) + class230.field3976;
                }
                if (var7 == 19) {
                    var8 = (class168.field2932.field1689 >> 7) + class226.field3916;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var8;
                    }
                    if (var6 == 1) {
                        var5 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var6 == 3) {
                        var5 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }
}
