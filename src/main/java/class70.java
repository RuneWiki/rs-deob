import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class70 extends class197 {

    @OriginalMember(owner = "client!uh", name = "cb", descriptor = "I")
    private int field1223 = -1;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "Loh;")
    public static class258 field1210 = null;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "[Loh;")
    public static class258[] field1211 = new class258[1000];

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    public static int field1212 = 0;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "[I")
    public static int[] field1219 = new int[500];

    @OriginalMember(owner = "client!uh", name = "bb", descriptor = "[[S")
    public static short[][] field1222 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!uh", name = "db", descriptor = "[I")
    public static int[] field1224 = new int[2];

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "Lmi;")
    public static class12 field1218 = new class12();

    @OriginalMember(owner = "client!uh", name = "fb", descriptor = "[S")
    public static short[] field1226 = new short[256];

    @OriginalMember(owner = "client!uh", name = "gb", descriptor = "Loh;")
    public static class258 field1227 = class153.method1046("gelb:", 95);

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!uh", name = "eb", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "[I")
    public static int[] field1207;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "[I")
    private int[] field1220;

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 9)
    public class70() {
        super(0, false);
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(Z)Z", line = 13)
    private final boolean method524(boolean arg0) {
        if (arg0) {
            field1227 = (class258) null;
        }
        field1217++;
        if (this.field1220 != null) {
            return true;
        } else if (this.field1223 < 0) {
            return false;
        } else {
            int var2 = class190.field3362;
            int var3 = class214.field3723;
            int var4 = class265.field4627.method195(this.field1223, (byte) -123) ? 64 : 128;
            this.field1220 = class265.field4627.method185(this.field1223, 0);
            this.field1214 = var4;
            this.field1215 = var4;
            class301.method2115(var2, var3, (byte) 114);
            return this.field1220 != null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V", line = 52)
    public static void method525(int arg0) {
        int var1 = 34 % ((arg0 + 28) / 50);
        field1227 = null;
        field1219 = null;
        field1210 = null;
        field1226 = null;
        field1224 = null;
        field1207 = null;
        field1211 = null;
        field1218 = null;
        field1222 = (short[][]) null;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(IIIII)Z", line = 68)
    public static final boolean method526(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class310.field5249 * arg0 + class244.field4230 * arg3 >> 16;
        int var6 = class310.field5249 * arg3 - class244.field4230 * arg0 >> 16;
        int var7 = class52.field841 * var6 + class203.field3516 * arg1 >> 16;
        int var8 = class52.field841 * arg1 - class203.field3516 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class52.field841 * var6 + class203.field3516 * arg2 >> 16;
        int var12 = class52.field841 * arg2 - class203.field3516 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class193.field3411 && var13 < class193.field3411) {
            return false;
        } else if (var9 > class313.field5321 && var13 > class313.field5321) {
            return false;
        } else if (var10 < class301.field5153 && var14 < class301.field5153) {
            return false;
        } else {
            return var10 <= class280.field4815 || var14 <= class280.field4815;
        }
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(B)I", line = 119)
    public final int method527(byte arg0) {
        if (arg0 >= -43) {
            this.method98(121, (class235) null, -112);
        }
        field1209++;
        return this.field1223;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)[[I", line = 132)
    public final int[][] method101(int arg0, byte arg1) {
        field1221++;
        int[][] var3 = this.field3461.method1936(arg0, 17174);
        if (this.field3461.field4765 && this.method524(false)) {
            int var4 = (class214.field3723 == this.field1215 ? arg0 : this.field1215 * arg0 / class214.field3723) * this.field1214;
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (class190.field3362 == this.field1214) {
                for (int var11 = 0; var11 < class190.field3362; var11++) {
                    int var12 = this.field1220[var4++];
                    var6[var11] = class2.method15(var12 << 4, 4080);
                    var7[var11] = class2.method15(65280, var12) >> 4;
                    var5[var11] = class2.method15(var12 >> 12, 4080);
                }
            } else {
                for (int var8 = 0; var8 < class190.field3362; var8++) {
                    int var9 = this.field1214 * var8 / class190.field3362;
                    int var10 = this.field1220[var4 + var9];
                    var6[var8] = class2.method15(var10, 255) << 4;
                    var7[var8] = class2.method15(4080, var10 >> 4);
                    var5[var8] = class2.method15(16711680, var10) >> 12;
                }
            }
        }
        int var13 = 15 / ((1 - arg1) / 37);
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLnd;)V", line = 217)
    public static final void method528(byte arg0, class58 arg1) {
        if (class202.field3498 == arg1.field978 || arg1.field965 == -1 || arg1.field969 != 0 || arg1.field949 + 1 > class263.method1842(arg1.field965, (byte) -114).field35[arg1.field966]) {
            int var2 = arg1.field978 - arg1.field943;
            int var3 = class202.field3498 - arg1.field943;
            int var4 = arg1.field928 * 128 + (arg1.method447(18123) * 64);
            int var5 = arg1.field948 * 128 + (arg1.method447(18123) * 64);
            int var6 = arg1.field919 * 128 + arg1.method447(18123) * 64;
            int var7 = arg1.field942 * 128 + (arg1.method447(18123) * 64);
            arg1.field934 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg1.field912 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        if (arg0 != -113) {
            method526(-49, 97, 9, -96, 46);
        }
        field1213++;
        if (arg1.field982 == 0) {
            arg1.field961 = 1024;
        }
        if (arg1.field982 == 1) {
            arg1.field961 = 1536;
        }
        arg1.field958 = 0;
        if (arg1.field982 == 2) {
            arg1.field961 = 0;
        }
        if (arg1.field982 == 3) {
            arg1.field961 = 512;
        }
        arg1.field923 = arg1.field961;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILva;I)V", line = 265)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            this.method527((byte) -46);
        }
        if (arg2 == 0) {
            this.field1223 = arg1.method1615(40);
        }
        field1225++;
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(B)V", line = 279)
    public final void method529(byte arg0) {
        field1216++;
        super.method529((byte) 113);
        if (arg0 >= 91) {
            this.field1220 = null;
        }
    }
}
