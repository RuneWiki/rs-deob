import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class279 extends class303 {

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
    private int field4312 = -1;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public static int field4313 = 0;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "[I")
    public static int[] field4315 = new int[14];

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4320 = "wave:";

    @OriginalMember(owner = "client!lk", name = "V", descriptor = "I")
    public static int field4325 = 0;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!lk", name = "R", descriptor = "I")
    private int field4321;

    @OriginalMember(owner = "client!lk", name = "S", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!lk", name = "T", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!lk", name = "U", descriptor = "I")
    private int field4324;

    @OriginalMember(owner = "client!lk", name = "W", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "[I")
    private int[] field4310;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)[[I", line = 5)
    public final int[][] method74(int arg0, int arg1) {
        field4314++;
        if (arg1 != 82) {
            method1991(47, 40L);
        }
        int[][] var3 = this.field4772.method1175(-113, arg0);
        if (this.field4772.field2488 && this.method1996((byte) -123)) {
            int var4 = (class247.field3815 == this.field4324 ? arg0 : this.field4324 * arg0 / class247.field3815) * this.field4321;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class70.field1108 == this.field4321) {
                for (int var11 = 0; var11 < class70.field1108; var11++) {
                    int var12 = this.field4310[var4++];
                    var7[var11] = class280.method2001(255, var12) << 4;
                    var6[var11] = class280.method2001(var12, 65280) >> 4;
                    var5[var11] = class280.method2001(var12 >> 12, 4080);
                }
            } else {
                for (int var8 = 0; var8 < class70.field1108; var8++) {
                    int var9 = this.field4321 * var8 / class70.field1108;
                    int var10 = this.field4310[var4 + var9];
                    var7[var8] = class280.method2001(var10, 255) << 4;
                    var6[var8] = class280.method2001(var10 >> 4, 4080);
                    var5[var8] = class280.method2001(4080, var10 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IJ)V", line = 74)
    public static final void method1991(int arg0, long arg1) {
        field4326++;
        if (arg1 <= 0L || arg0 <= 87) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class4.method11(arg1 - 1L, -123);
            class4.method11(1L, -70);
        } else {
            class4.method11(arg1, -44);
        }
    }

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)V", line = 95)
    public static final void method1992(int arg0) {
        field4318++;
        if (!class265.field4126 || class318.field4946) {
            return;
        }
        class272[][][] var1 = class60.field946;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class272[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class272 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field4213 != null && var6.field4213.field1325 instanceof class171) {
                            class171 var7 = (class171) var6.field4213.field1325;
                            if ((Long.MIN_VALUE & var6.field4213.field1338) == 0L) {
                                var7.method1268(false, true, true, true, false, true, true);
                            } else {
                                var7.method1268(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field4219 != null) {
                            if (var6.field4219.field1863 instanceof class171) {
                                class171 var8 = (class171) var6.field4219.field1863;
                                if ((var6.field4219.field1865 & Long.MIN_VALUE) == 0L) {
                                    var8.method1268(false, true, true, true, false, true, true);
                                } else {
                                    var8.method1268(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field4219.field1860 instanceof class171) {
                                class171 var9 = (class171) var6.field4219.field1860;
                                if ((var6.field4219.field1865 & Long.MIN_VALUE) == 0L) {
                                    var9.method1268(false, true, true, true, false, true, true);
                                } else {
                                    var9.method1268(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field4236 != null) {
                            if (var6.field4236.field2996 instanceof class171) {
                                class171 var10 = (class171) var6.field4236.field2996;
                                if ((Long.MIN_VALUE & var6.field4236.field3008) == 0L) {
                                    var10.method1268(false, true, true, true, false, true, true);
                                } else {
                                    var10.method1268(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field4236.field2998 instanceof class171) {
                                class171 var11 = (class171) var6.field4236.field2998;
                                if ((Long.MIN_VALUE & var6.field4236.field3008) == 0L) {
                                    var11.method1268(false, true, true, true, false, true, true);
                                } else {
                                    var11.method1268(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field4220; var12++) {
                            if (var6.field4217[var12].field782 instanceof class171) {
                                class171 var13 = (class171) var6.field4217[var12].field782;
                                if ((Long.MIN_VALUE & var6.field4217[var12].field776) == 0L) {
                                    var13.method1268(false, true, true, true, false, true, true);
                                } else {
                                    var13.method1268(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class318.field4946 = true;
        if (arg0 != 32130) {
            field4315 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILpe;I)V", line = 241)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg0 == -4004) {
            if (arg2 == 0) {
                this.field4312 = arg1.method731(false);
            }
            field4323++;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZ)I", line = 255)
    public static final int method1993(int arg0, int arg1, boolean arg2) {
        field4317++;
        class62 var3 = (class62) class42.field748.method833(arg2, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field963.length) {
            return var3.field963[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V", line = 278)
    public class279() {
        super(0, false);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)I", line = 291)
    public final int method1994(byte arg0) {
        field4319++;
        if (arg0 != -4) {
            this.method74(55, 102);
        }
        return this.field4312;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V", line = 303)
    public final void method72(byte arg0) {
        super.method72(arg0);
        this.field4310 = null;
        field4311++;
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(B)V", line = 315)
    public static void method1995(byte arg0) {
        field4315 = null;
        field4320 = null;
        if (arg0 != 61) {
            method1991(29, -99L);
        }
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(B)Z", line = 326)
    private final boolean method1996(byte arg0) {
        field4322++;
        if (arg0 > -82) {
            field4313 = -15;
        }
        if (this.field4310 != null) {
            return true;
        } else if (this.field4312 < 0) {
            return false;
        } else {
            int var2 = class70.field1108;
            int var3 = class247.field3815;
            int var4 = class92.field1518.method1474(this.field4312, (byte) 64) ? 64 : 128;
            this.field4310 = class92.field1518.method1465(this.field4312, (byte) 109);
            this.field4324 = var4;
            this.field4321 = var4;
            class121.method923(false, var2, var3);
            return this.field4310 != null;
        }
    }
}
