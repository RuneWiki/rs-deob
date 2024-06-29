import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class64 extends class310 {

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
    private int field1136 = 0;

    @OriginalMember(owner = "client!tl", name = "S", descriptor = "I")
    private int field1143 = 4096;

    @OriginalMember(owner = "client!tl", name = "Q", descriptor = "I")
    private int field1141 = 0;

    @OriginalMember(owner = "client!tl", name = "U", descriptor = "I")
    private int field1145 = 16;

    @OriginalMember(owner = "client!tl", name = "T", descriptor = "I")
    private int field1144 = 2000;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "[[I")
    public static int[][] field1138 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "Z")
    public static volatile boolean field1135 = false;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
    public static int field1137 = 0;

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!tl", name = "V", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lqm;II)V", line = 18)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field1141 = arg0.method1720((byte) -72);
        } else if (arg2 == 1) {
            this.field1144 = arg0.method1765(true);
        } else if (arg2 == 2) {
            this.field1145 = arg0.method1720((byte) -89);
        } else if (arg2 == 3) {
            this.field1136 = arg0.method1765(true);
        } else if (arg2 == 4) {
            this.field1143 = arg0.method1765(true);
        }
        field1146++;
        if (arg1 != -2470) {
            this.field1143 = 3;
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)V", line = 69)
    public final void method553(byte arg0) {
        field1140++;
        if (arg0 >= -82) {
            method556(6, -116, (class250) null, -105, -76);
        }
        class26.method169(-84);
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)V", line = 81)
    public static void method554(byte arg0) {
        field1138 = (int[][]) null;
        if (arg0 >= -20) {
            field1135 = false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(III)J", line = 92)
    public static final long method555(int arg0, int arg1, int arg2) {
        class36 var3 = class129.field2184[arg0][arg1][arg2];
        return var3 == null || var3.field526 == null ? 0L : var3.field526.field5406;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V", line = 298)
    public class64() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILwf;II)V", line = 112)
    public static final void method556(int arg0, int arg1, class250 arg2, int arg3, int arg4) {
        if (class42.field607) {
            class244.method1871(arg1, arg3, arg2.field4081 + arg1, arg3 - -arg2.field4157);
        }
        if (class338.field5387 < 3) {
            if (class42.field607) {
                ((class58) class156.field2469).method495(arg1, arg3, arg2.field4081, arg2.field4157, class156.field2469.field197 / 2, class156.field2469.field199 / 2, (int) class261.field4396, 256, (class58) arg2.method1940((byte) 117, false));
            } else {
                ((class351) class156.field2469).method946(arg1, arg3, arg2.field4081, arg2.field4157, class156.field2469.field197 / 2, class156.field2469.field199 / 2, (int) class261.field4396, 256, arg2.field4208, arg2.field4188);
            }
        } else if (class42.field607) {
            class17 var5 = arg2.method1940((byte) -59, false);
            if (var5 != null) {
                var5.method89(arg1, arg3);
            }
        } else {
            class246.method1895(arg1, arg3, 0, arg2.field4208, arg2.field4188);
        }
        field1139++;
        class12.field115[arg4] = true;
        if (arg0 != 256) {
            field1135 = true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)[I", line = 156)
    public final int[] method77(int arg0, int arg1) {
        field1142++;
        int[] var3 = this.field4950.method930(arg0, arg1 + 13093);
        if (arg1 != -13093) {
            field1137 = 2;
        }
        if (this.field4950.field2001) {
            int var4 = this.field1143 >> 1;
            int[][] var5 = this.field4950.method932((byte) 32);
            Random var6 = new Random((long) this.field1141);
            for (int var7 = 0; var7 < this.field1144; var7++) {
                int var8 = this.field1143 > 0 ? this.field1136 + class2.method4(this.field1143, var6, -86) - var4 : this.field1136;
                int var9 = var8 >> 4 & 0xFF;
                int var10 = class2.method4(class261.field4405, var6, 117);
                int var11 = class2.method4(class254.field4279, var6, 121);
                int var12 = var10 + (class74.field1255[var9] * this.field1145 >> 12);
                int var13 = var11 + (class74.field1265[var9] * this.field1145 >> 12);
                int var14 = var12 - var10;
                int var15 = var13 - var11;
                if (var14 != 0 || var15 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 < var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var13 - var11;
                    if (var22 < 0) {
                        var22 = -var22;
                    }
                    int var23 = var12 - var10;
                    int var24 = 2048 / var23;
                    int var25 = 1024 - (class2.method4(4096, var6, arg1 + 13066) >> 2);
                    int var26 = var11 >= var13 ? -1 : 1;
                    int var27 = -var23 / 2;
                    for (int var28 = var10; var28 < var12; var28++) {
                        int var29 = class113.field1861 & var21;
                        int var30 = (var28 - var10) * var24 + var25 + 1024;
                        int var31 = var28 & class98.field1628;
                        if (var16) {
                            var5[var29][var31] = var30;
                        } else {
                            var5[var31][var29] = var30;
                        }
                        var27 += var22;
                        if (var27 > 0) {
                            var27 += -var23;
                            var21 += var26;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
