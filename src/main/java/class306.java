import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class306 extends class197 {

    @OriginalMember(owner = "client!si", name = "O", descriptor = "I")
    private int field5195 = 0;

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "I")
    private int field5206 = 2000;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "I")
    private int field5201 = 4096;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "I")
    private int field5200 = 16;

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "I")
    private int field5207 = 0;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "Loh;")
    public static class258 field5194 = null;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "[Loh;")
    public static class258[] field5198 = new class258[200];

    @OriginalMember(owner = "client!si", name = "M", descriptor = "Loh;")
    public static class258 field5193 = class153.method1046("(U0a )2 in: ", 89);

    @OriginalMember(owner = "client!si", name = "X", descriptor = "Loh;")
    public static class258 field5204 = class153.method1046("Lade Wordpack )2 ", 97);

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!si", name = "W", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "Lgb;")
    public static class213 field5197;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 11)
    public static final void method2135(int arg0) {
        class29.field342.method1161(-92);
        if (arg0 != -106955808) {
            method2138(69, -34, 125L, 99);
        }
        field5205++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 27)
    public final void method223(int arg0) {
        field5202++;
        class72.method540((byte) 73);
        if (arg0 != 11135) {
            this.field5195 = -85;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[I", line = 44)
    public final int[] method96(int arg0, int arg1) {
        if (arg0 != -16221) {
            method2136(115, (byte) -89);
        }
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            int var4 = this.field5201 >> 1;
            int[][] var5 = this.field3456.method2108(false);
            Random var6 = new Random((long) this.field5195);
            for (int var7 = 0; var7 < this.field5206; var7++) {
                int var8 = this.field5201 > 0 ? this.field5207 - (var4 - class285.method1996(1, var6, this.field5201)) : this.field5207;
                int var9 = var8 >> 4 & 0xFF;
                int var10 = class285.method1996(arg0 + 16222, var6, class190.field3362);
                int var11 = class285.method1996(1, var6, class214.field3723);
                int var12 = var10 + (class193.field3405[var9] * this.field5200 >> 12);
                int var13 = (class72.field1278[var9] * this.field5200 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                        var12 = var19;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var22 / 2;
                    int var24 = 2048 / var22;
                    int var25 = var13 - var11;
                    int var26 = 1024 - (class285.method1996(arg0 + 16222, var6, 4096) >> 2);
                    if (var25 < 0) {
                        var25 = -var25;
                    }
                    int var27 = var13 > var11 ? 1 : -1;
                    for (int var28 = var10; var28 < var12; var28++) {
                        var23 += var25;
                        int var29 = (var28 - var10) * var24 + var26 + 1024;
                        int var30 = class48.field723 & var28;
                        int var31 = class155.field2662 & var21;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var23 > 0) {
                            var23 += -var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        field5203++;
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 205)
    public class306() {
        super(0, true);
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IB)V", line = 176)
    public static final void method2136(int arg0, byte arg1) {
        class26.field317.method1156(arg0, 0);
        if (arg1 != 27) {
            method2137(false);
        }
        field5196++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILva;I)V", line = 218)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            this.field5207 = 5;
        }
        if (arg2 == 0) {
            this.field5195 = arg1.method1589(54);
        } else if (arg2 == 1) {
            this.field5206 = arg1.method1615(97);
        } else if (arg2 == 2) {
            this.field5200 = arg1.method1589(89);
        } else if (arg2 == 3) {
            this.field5207 = arg1.method1615(-9);
        } else if (arg2 == 4) {
            this.field5201 = arg1.method1615(8);
        }
        field5199++;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(Z)V", line = 283)
    public static void method2137(boolean arg0) {
        field5197 = null;
        if (arg0) {
            field5193 = (class258) null;
        }
        field5204 = null;
        field5194 = null;
        field5193 = null;
        field5198 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIJI)Z", line = 304)
    public static final boolean method2138(int arg0, int arg1, long arg2, int arg3) {
        field5208++;
        int var5 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
        int var6 = (int) arg2 >> 20 & 0x3;
        int var7 = (int) arg2 >> 14 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class101 var8 = class123.method898(-935, var5);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field1839;
                var10 = var8.field1790;
            } else {
                var9 = var8.field1790;
                var10 = var8.field1839;
            }
            int var11 = var8.field1828;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class208.method1373(0, class152.field2606.field959[0], true, var9, 2, 0, arg1, (byte) 77, arg0, var10, var11, class152.field2606.field975[0]);
        } else {
            class208.method1373(var7 + 1, class152.field2606.field959[0], true, 0, 2, var6, arg1, (byte) 89, arg0, 0, 0, class152.field2606.field975[0]);
        }
        int var12 = -103 % ((arg3 - 15) / 51);
        class52.field837 = class173.field3103;
        class180.field3219 = 0;
        class260.field4524 = class219.field3791;
        class169.field2883 = 2;
        return true;
    }
}
