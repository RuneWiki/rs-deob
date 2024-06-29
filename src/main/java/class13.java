import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class13 extends class16 {

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    private int field153 = 16;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    private int field154 = 0;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    private int field151 = 4096;

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
    private int field163 = 2000;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "I")
    private int field157 = 0;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "I")
    public static int field164 = 255;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "Lc;")
    public static class320 field159;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILkb;)Lug;", line = 8)
    public static final class321 method73(int arg0, int arg1, class39 arg2) {
        field161++;
        if (class221.method1609(arg2, 5282, arg1)) {
            return arg0 == 16 ? class312.method2171(5701) : (class321) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(B)V", line = 22)
    public static void method74(byte arg0) {
        if (arg0 > -38) {
            field164 = -66;
        }
        field159 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V", line = 292)
    public class13() {
        super(0, true);
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V", line = 35)
    public static final void method75(int arg0) {
        field152++;
        if (arg0 != -17) {
            field159 = (class320) null;
        }
        if (class224.field3569) {
            return;
        }
        if (class325.field5079) {
            class329.field5112 = (float) ((int) class329.field5112 - 17 & 0xFFFFFFF0);
        } else {
            class218.field3504 += (-class218.field3504 - 12.0F) / 2.0F;
        }
        class224.field3569 = true;
        client.field4231 = true;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)I", line = 65)
    public static final int method76(byte arg0, int arg1) {
        field156++;
        return arg0 == 90 ? arg1 & 0x7F : 107;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V", line = 83)
    public final void method55(byte arg0) {
        field160++;
        class103.method723(false);
        if (arg0 != 0) {
            this.field163 = -117;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(ZI)[I", line = 95)
    public final int[] method8(boolean arg0, int arg1) {
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int var4 = this.field151 >> 1;
            int[][] var5 = this.field207.method1785(-51);
            Random var6 = new Random((long) this.field157);
            for (int var7 = 0; var7 < this.field163; var7++) {
                int var8 = this.field151 <= 0 ? this.field154 : this.field154 - (var4 - class66.method434(this.field151, var6, -27852));
                int var9 = class66.method434(class276.field4376, var6, -27852);
                int var10 = class66.method434(class294.field4619, var6, -27852);
                int var11 = (var8 & 0xFFB) >> 4;
                int var12 = (class34.field454[var11] * this.field153 >> 12) + var10;
                int var13 = var12 - var10;
                int var14 = (class229.field3652[var11] * this.field153 >> 12) + var9;
                int var15 = var14 - var9;
                if (var15 != 0 || var13 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    boolean var16 = var13 > var15;
                    if (var16) {
                        int var17 = var9;
                        int var18 = var14;
                        var9 = var10;
                        var14 = var12;
                        var12 = var18;
                        var10 = var17;
                    }
                    if (var14 < var9) {
                        int var19 = var10;
                        var10 = var12;
                        var12 = var19;
                        int var20 = var9;
                        var9 = var14;
                        var14 = var20;
                    }
                    int var21 = var10;
                    int var22 = var14 - var9;
                    int var23 = -var22 / 2;
                    int var24 = var12 - var10;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class66.method434(4096, var6, -27852) >> 2);
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    int var27 = var12 > var10 ? 1 : -1;
                    for (int var28 = var9; var28 < var14; var28++) {
                        var23 += var24;
                        int var29 = var21 & class240.field3798;
                        int var30 = var28 & class148.field2215;
                        if (var23 > 0) {
                            var23 += -var22;
                            var21 -= -var27;
                        }
                        int var31 = (var28 - var9) * var25 + (var26 + 1024);
                        if (var16) {
                            var5[var29][var30] = var31;
                        } else {
                            var5[var30][var29] = var31;
                        }
                    }
                }
            }
        }
        if (!arg0) {
            this.field163 = -14;
        }
        field155++;
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLim;I)V", line = 228)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        field162++;
        if (arg2 == 0) {
            this.field157 = arg1.method1399(arg0 ^ 0x45E13F91);
        } else if (arg2 == 1) {
            this.field163 = arg1.method1396(-69);
        } else if (arg2 == 2) {
            this.field153 = arg1.method1399(-1172389784);
        } else if (arg2 == 3) {
            this.field154 = arg1.method1396(-18);
        } else if (arg2 == 4) {
            this.field151 = arg1.method1396(-89);
        }
        if (arg0 != -7) {
            method73(96, -44, (class39) null);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)V", line = 299)
    public static final void method77(int arg0, int arg1) {
        field158++;
        class179 var2 = class319.method2220(arg1, (byte) -93, arg0);
        var2.method1239(true);
    }
}
