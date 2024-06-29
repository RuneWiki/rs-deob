import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class76 {

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "Lru;")
    private class680 field1122;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "Lrs;")
    private class166 field1113;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    private int field1130;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "[B")
    public byte[] field1115;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    private int field1127;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "I")
    private int field1125;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field1114 = 0;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public static int field1126 = 0;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "[[Lkf;")
    private class720[][] field1129;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIILr;)Z")
    public final boolean method684(int arg0, int arg1, int arg2, class706 arg3) {
        if (arg0 != 5123) {
            return false;
        }
        field1124++;
        class711 var5 = (class711) arg3;
        int var6 = var5.field10003 + arg1 + 1;
        int var7 = var5.field10013 + arg2 + 1;
        int var8 = this.field1117 * var6 + var7;
        int var9 = var5.field10017;
        int var10 = var5.field10007;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var8 += this.field1117 * var11;
            var9 -= var11;
            var6 = 1;
        }
        int var12 = this.field1117 - var10;
        if ((var6 + var9) >= this.field1130) {
            int var13 = var6 + var9 + 1 - this.field1130;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var12 += var14;
            var7 = 1;
            var8 += var14;
        }
        if (var7 + var10 >= this.field1117) {
            int var15 = var7 + var10 + 1 - this.field1117;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field1117 + var12;
            return class683.method3811(var8, (byte) -62, var17, var16, var9, var10, this.field1115);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
    public final void method685(byte arg0) {
        if (arg0 != 99) {
            this.field1117 = 36;
        }
        field1116++;
        this.field1129 = new class720[this.field1128][this.field1125];
        for (int var2 = 0; var2 < this.field1125; var2++) {
            for (int var3 = 0; var3 < this.field1128; var3++) {
                this.field1129[var3][var2] = new class720(this.field1113, this, this.field1122, var3, var2, this.field1127, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIZI)V")
    private final void method686(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1112++;
        if (this.field1129 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg4 + arg1 - 1 - 1 >> 7;
        if (!arg3) {
            this.method685((byte) -53);
        }
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 + arg2 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class720[] var11 = this.field1129[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field10089 = true;
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIILha;IIIBILei;)V")
    public static final void method687(int arg0, int arg1, int arg2, int arg3, int arg4, class544 arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, class180 arg11) {
        if (arg9 != -53) {
            field1126 = -13;
        }
        if (arg7 < arg1 && arg1 < arg3 + arg7 && arg2 - 13 < arg6 && arg6 < (arg2 + 3)) {
            arg10 = arg0;
        }
        field1119++;
        String var12 = class652.method3667(-101, arg11);
        class257.field4034.method2472(arg10, var12, 0, class625.field8753, class465.field6788, arg2, (byte) 4, arg7 + 3);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIZIB[[Z)V")
    public final void method688(int arg0, int arg1, boolean arg2, int arg3, byte arg4, boolean[][] arg5) {
        field1123++;
        int var7 = 83 / ((arg4 - 17) / 47);
        this.field1113.method1284(false, 5890);
        this.field1113.method1263((byte) 104, false);
        this.field1113.method1327(78, -2);
        this.field1113.method1334(0, 1);
        this.field1113.method1320(1, false);
        float var8 = 1.0F / (float) (this.field1113.field2758 * 128);
        if (arg2) {
            for (int var23 = 0; var23 < this.field1125; var23++) {
                int var24 = var23 << this.field1127;
                int var25 = var23 + 1 << this.field1127;
                label85: for (int var26 = 0; var26 < this.field1128; var26++) {
                    int var27 = var26 << this.field1127;
                    int var28 = var26 + 1 << this.field1127;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if ((var29 - arg0) >= (-arg1) && (var29 - arg0) <= arg1) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if ((var30 - arg3) >= (-arg1) && (var30 - arg3) <= arg1 && arg5[var29 + arg1 - arg0][arg1 + var30 - arg3]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var8, var8, 1.0F);
                                    OpenGL.glTranslatef((float) (-var26) / var8, (float) (-var23) / var8, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field1129[var26][var23].method3973((byte) -112);
                                    continue label85;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field1125; var9++) {
                int var10 = var9 << this.field1127;
                int var11 = var9 + 1 << this.field1127;
                for (int var12 = 0; var12 < this.field1128; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field1127;
                    int var15 = var12 + 1 << this.field1127;
                    class547 var16 = this.field1113.field2870;
                    var16.field4534 = 0;
                    for (int var17 = var10; var17 < var11; var17++) {
                        if (var17 - arg3 >= -arg1 && (var17 - arg3) <= arg1) {
                            int var18 = this.field1122.field4956 * var17 + var14;
                            for (int var19 = var14; var19 < var15; var19++) {
                                if ((-arg1) <= (var19 - arg0) && (var19 - arg0) <= arg1 && arg5[var19 + arg1 - arg0][var17 + arg1 - arg3]) {
                                    short[] var20 = this.field1122.field9616[var18];
                                    if (var20 != null) {
                                        if (this.field1113.field2796) {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                var16.method1939(var20[var22] & 0xFFFF, 1134947720);
                                                var13++;
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var16.method1969(var20[var21] & 0xFFFF, (byte) -100);
                                                var13++;
                                            }
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                    if (var13 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var8, var8, 1.0F);
                        OpenGL.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field1129[var12][var9].method3970(var16.field4543, false, var13, 5123);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILr;II)V")
    public final void method689(int arg0, class706 arg1, int arg2, int arg3) {
        field1121++;
        class711 var5 = (class711) arg1;
        int var6 = var5.field10003 + arg0 + 1;
        int var7 = var5.field10013 + arg2 + 1;
        int var8 = this.field1117 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field10017;
        if (arg3 < 62) {
            return;
        }
        int var11 = var5.field10007;
        int var12 = this.field1117 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var6 = 1;
            var8 += this.field1117 * var14;
            var10 -= var14;
        }
        if (this.field1130 <= var6 + var10) {
            int var15 = var10 + var6 + 1 - this.field1130;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var13 += var16;
            var11 -= var16;
            var8 += var16;
            var9 += var16;
            var12 += var16;
            var7 = 1;
        }
        if ((var7 + var11) >= this.field1117) {
            int var17 = var7 + var11 + 1 - this.field1117;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class565.method3281(var5.field10012, var13, this.field1115, var10, var8, var11, var9, var12, 0);
            this.method686(var6, var7, var10, true, var11);
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(ILr;II)V")
    public final void method690(int arg0, class706 arg1, int arg2, int arg3) {
        field1120++;
        class711 var5 = (class711) arg1;
        int var6 = var5.field10013 + arg0 + 1;
        int var7 = var5.field10003 + arg3 + 1;
        int var8 = this.field1117 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field10017;
        int var11 = var5.field10007;
        int var12 = this.field1117 - var11;
        if (var7 <= arg2) {
            int var13 = 1 - var7;
            var7 = 1;
            var10 -= var13;
            var9 += var11 * var13;
            var8 += this.field1117 * var13;
        }
        int var14 = 0;
        if (this.field1130 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field1130;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var11 -= var16;
            var12 += var16;
            var6 = 1;
            var8 += var16;
            var14 += var16;
        }
        if (var6 + var11 >= this.field1117) {
            int var17 = var11 + var6 + 1 - this.field1117;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class445.method2718(var5.field10012, var11, var9, var14, var8, this.field1115, var10, var12, false);
            this.method686(var7, var6, var10, true, var11);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I")
    public static final int method691(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class286.field4406 - 1; var2++) {
            if (arg0 < class671.field9501[var2] + class436.field6358[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class286.field4406 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lrs;Lru;)V")
    public class76(class166 arg0, class680 arg1) {
        this.field1122 = arg1;
        this.field1113 = arg0;
        this.field1117 = (this.field1122.field4958 * this.field1122.field4956 >> this.field1113.field2756) + 2;
        this.field1130 = (this.field1122.field4960 * this.field1122.field4958 >> this.field1113.field2756) + 2;
        this.field1115 = new byte[this.field1130 * this.field1117];
        this.field1127 = this.field1113.field2756 + 7 - this.field1122.field4962;
        this.field1128 = this.field1122.field4956 >> this.field1127;
        this.field1125 = this.field1122.field4960 >> this.field1127;
    }
}
