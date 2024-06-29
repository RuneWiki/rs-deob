import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class700 {

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    private int field9866 = -1;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "Z")
    public boolean field9879 = true;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "Lml;")
    private class355 field9865;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
    private int field9883;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    private int field9863;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "Lrr;")
    private class332 field9864;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
    private int field9875;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    private int field9869;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "Lbo;")
    private class679 field9881;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public int field9867;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "Lmca;")
    private class29 field9870;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    public static int field9878 = -1;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
    public static int field9880 = 0;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
    public static int field9882 = 1407;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    public static int field9872;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public static int field9873;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
    public static int field9874;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public static int field9877;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
    private final void method3947(byte arg0) {
        field9871++;
        if (!this.field9879) {
            return;
        }
        this.field9879 = false;
        byte[] var2 = this.field9865.field5670;
        int var3 = 0;
        int var4 = this.field9865.field5676;
        int var5 = this.field9865.field5676 * this.field9883 + this.field9863;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var18 = -128; var18 < 0; var18++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field9870 != null && this.field9866 == var3) {
            this.field9879 = false;
            return;
        }
        int var7 = -106 % ((32 - arg0) / 43);
        this.field9866 = var3;
        int var8 = 0;
        int var9 = this.field9863 + (this.field9883 * var4);
        if (!this.field9864.method164(class134.field2197, class203.field3311, 107)) {
            if (class475.field7032 == null) {
                class475.field7032 = new int[16384];
            }
            int[] var14 = class475.field7032;
            for (int var15 = -128; var15 < 0; var15++) {
                for (int var16 = -128; var16 < 0; var16++) {
                    if (var2[var9] == 0) {
                        int var17 = 0;
                        if (var2[var9 - 1] != 0) {
                            var17++;
                        }
                        if (var2[var9 + 1] != 0) {
                            var17++;
                        }
                        if (var2[var9 - var4] != 0) {
                            var17++;
                        }
                        if (var2[var4 + var9] != 0) {
                            var17++;
                        }
                        var14[var8++] = var17 * 17 << 24;
                    } else {
                        var14[var8++] = 1140850688;
                    }
                    var9++;
                }
                var9 += this.field9865.field5676 - 128;
            }
            if (this.field9870 == null) {
                this.field9870 = this.field9864.method2243(class475.field7032, 128, false, 128, (byte) -20);
                this.field9870.method364(false, false, (byte) 123);
            } else {
                this.field9870.method372(13353, 128, class475.field7032, 0, 128, 0, 128, 0);
            }
            return;
        }
        if (class4.field30 == null) {
            class4.field30 = new byte[16384];
        }
        byte[] var10 = class4.field30;
        for (int var11 = -128; var11 < 0; var11++) {
            for (int var12 = -128; var12 < 0; var12++) {
                if (var2[var9] == 0) {
                    int var13 = 0;
                    if (var2[var9 - 1] != 0) {
                        var13++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var13++;
                    }
                    if (var2[var9 - var4] != 0) {
                        var13++;
                    }
                    if (var2[var4 + var9] != 0) {
                        var13++;
                    }
                    var10[var8++] = (byte) (var13 * 17);
                } else {
                    var10[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field9865.field5676 - 128;
        }
        if (this.field9870 == null) {
            this.field9870 = this.field9864.method2241(class4.field30, -128, false, class203.field3311, 128, 128);
            this.field9870.method364(false, false, (byte) -122);
        } else {
            this.field9870.method362(0, class203.field3311, 0, 3348, class4.field30, 128, 128, 0, 128);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILri;)V")
    public static final void method3948(int arg0, class97 arg1) {
        class341.field5530 = arg1.method928(false, "hitmarks");
        field9877++;
        class81.field1003 = arg1.method928(false, "hitbar_default");
        if (arg0 != 3) {
            field9878 = -5;
        }
        class375.field5857 = arg1.method928(false, "timerbar_default");
        class200.field3268 = arg1.method928(false, "headicons_pk");
        class341.field5522 = arg1.method928(false, "headicons_prayer");
        class475.field7034 = arg1.method928(false, "hint_headicons");
        class425.field6465 = arg1.method928(false, "hint_mapmarkers");
        class690.field9674 = arg1.method928(false, "mapflag");
        class157.field2685 = arg1.method928(false, "cross");
        class200.field3250 = arg1.method928(false, "mapdots");
        class263.field4307 = arg1.method928(false, "scrollbar");
        class606.field8622 = arg1.method928(false, "name_icons");
        class247.field3947 = arg1.method928(false, "floorshadows");
        class404.field6237 = arg1.method928(false, "compass");
        class73.field924 = arg1.method928(false, "otherlevel");
        class294.field4618 = arg1.method928(false, "hint_mapedge");
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLbo;I)V")
    public final void method3949(byte arg0, class679 arg1, int arg2) {
        if (arg2 > 0) {
            this.method3947((byte) -42);
            this.field9864.method2271(this.field9870, 5180);
            this.field9864.method120(class646.field9077, this.field9869 + 1 - this.field9875, arg1, 0, 121, arg2, this.field9875);
        }
        field9873++;
        int var4 = -45 % ((70 - arg0) / 39);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V")
    public final void method3950(boolean arg0) {
        if (!arg0) {
            this.method3949((byte) 119, this.field9881, this.field9867);
            field9868++;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static final void method3951(int arg0) {
        field9874++;
        class453.field6808 = false;
        class133.method1153(class492.field7207, class254.field4051, false, class508.field7436, class579.field8257);
        if (arg0 != 0) {
            method3952(121, -110, -27, 65, -84, 5, -106, 81, 75);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3952(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 < 38) {
            field9880 = 113;
        }
        field9876++;
        if (arg2 < 1 || arg8 < 1 || arg2 > class275.field4426 - 2 || (class417.field6374 - 2) < arg8) {
            return;
        }
        int var9 = arg5;
        if (arg5 < 3 && class437.method2774(true, arg2, arg8)) {
            var9 = arg5 + 1;
        }
        if (!class17.field282.method2089(class497.field7259, -1) && !class612.method3563(-125, arg8, class70.field887, var9, arg2)) {
            return;
        }
        if (class454.field6818 == null) {
            return;
        }
        class673.field9483.method1492(arg6, class627.field8857, arg8, class10.field172[arg5], arg2, -115, arg5);
        if (arg7 < 0) {
            return;
        }
        boolean var10 = class17.field282.field4881;
        class17.field282.field4881 = true;
        class673.field9483.method1497(class10.field172[arg5], arg7, arg4, var9, arg2, arg8, class627.field8857, arg5, arg3, arg0, -2);
        class17.field282.field4881 = var10;
        return;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
    public static final void method3953(int arg0) {
        class589.field8381 = new String[500];
        class475.field7033 = class125.field2057.field8893 + class125.field2057.field8890 + 2;
        class615.field8742 = class35.field508.field8893 + class35.field508.field8890 + 2;
        int var1 = -40 % ((-arg0 - 58) / 36);
        field9872++;
        for (int var2 = 0; var2 < class589.field8381.length; var2++) {
            class589.field8381[var2] = "";
        }
        class529.method3200(class122.field1972.method1091(class135.field2206, 1), -87);
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lrr;Lml;Lhm;IIIII)V")
    public class700(class332 arg0, class355 arg1, class203 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field9865 = arg1;
        this.field9883 = arg7;
        this.field9863 = arg6;
        this.field9864 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field510 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field3286[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field9870 = null;
            this.field9867 = 0;
        } else {
            this.field9875 = Integer.MAX_VALUE;
            this.field9869 = Integer.MIN_VALUE;
            this.field9881 = this.field9864.method113(false, 125);
            this.field9881.method424((byte) -80, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field9881.method430(true, (byte) -107);
                if (var15 != null) {
                    Stream var16 = this.field9864.method2286(var15, (byte) -55);
                    if (Stream.method3620()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field510 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field3286[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field9869 < var22) {
                                            this.field9869 = var22;
                                        }
                                        if (this.field9875 > var22) {
                                            this.field9875 = var22;
                                        }
                                        var16.method3628(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field510 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field3286[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field9875 > var28) {
                                            this.field9875 = var28;
                                        }
                                        if (this.field9869 < var28) {
                                            this.field9869 = var28;
                                        }
                                        var16.method3623(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3626();
                    if (this.field9881.method425(30899)) {
                        break;
                    }
                }
            }
            this.field9867 = var10 / 3;
        }
    }
}
