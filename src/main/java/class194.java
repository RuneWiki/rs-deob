import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class194 extends class86 {

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "[S")
    private short[] field3051 = new short[257];

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "I")
    private int field3059 = 0;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public static volatile int field3047 = 0;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
    public static int field3052 = 0;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    public static volatile int field3050 = -1;

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field3065 = "Loaded wordpack";

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "[I")
    private int[] field3060;

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "[I")
    private int[] field3062;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "[[I")
    private int[][] field3057;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)V", line = 7)
    private final void method1474(boolean arg0) {
        field3064++;
        if (arg0) {
            method1477(85);
        }
        int[] var2 = this.field3057[0];
        int[] var3 = this.field3057[1];
        int[] var4 = this.field3057[this.field3057.length - 2];
        int[] var5 = this.field3057[this.field3057.length - 1];
        this.field3060 = new int[] { var2[0] + var2[0] - var3[0], -var3[1] - (-var2[1] - var2[1]) };
        this.field3062 = new int[] { var4[0] + var4[0] - var5[0], var4[1] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZI)[I", line = 27)
    private final int[] method1475(boolean arg0, int arg1) {
        field3046++;
        if (arg1 < 0) {
            return this.field3060;
        } else if (arg0) {
            return arg1 < this.field3057.length ? this.field3057[arg1] : this.field3062;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)[I", line = 50)
    public final int[] method158(int arg0, int arg1) {
        int[] var3 = this.field1225.method1914(arg0, 121);
        field3055++;
        if (this.field1225.field3995) {
            int[] var4 = this.method774(0, arg0, 0);
            for (int var5 = 0; var5 < class93.field1424; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3051[var6];
            }
        }
        if (arg1 < 7) {
            method1477(2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 98)
    public class194() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(Z)V", line = 109)
    private final void method1476(boolean arg0) {
        if (arg0) {
            return;
        }
        field3048++;
        int var2 = this.field3059;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; this.field3057.length - 1 > var5 && this.field3057[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field3057[var5];
                int[] var7 = this.field3057[var5 - 1];
                int var8 = this.method1475(true, var5 - 2)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = var9 - var8;
                int var12 = this.method1475(true, var5 + 1)[1];
                int var13 = var12 + var10 - var8 - var9;
                int var14 = var8 - var13 - var10;
                int var16 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var17 = var16 * var16 >> 12;
                int var18 = var14 * var17 >> 12;
                int var19 = var11 * var16 >> 12;
                int var20 = (var13 * var16 >> 12) * var17 >> 12;
                int var21 = var19 + var20 + var18 + var10;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field3051[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; var24 < this.field3057.length - 1 && var23 >= this.field3057[var24][0]; var24++) {
                }
                int[] var25 = this.field3057[var24 - 1];
                int[] var26 = this.field3057[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - class239.field3711[(var27 & 0x1FFD) >> 5] >> 1;
                int var29 = 4096 - var28;
                int var30 = var25[1] * var29 + var26[1] * var28 >> 12;
                if (var30 <= -32768) {
                    var30 = -32767;
                }
                if (var30 >= 32768) {
                    var30 = 32767;
                }
                this.field3051[var22] = (short) var30;
            }
        } else {
            for (int var31 = 0; var31 < 257; var31++) {
                int var32 = var31 << 4;
                int var33;
                for (var33 = 1; (this.field3057.length - 1) > var33 && this.field3057[var33][0] <= var32; var33++) {
                }
                int[] var34 = this.field3057[var33];
                int[] var35 = this.field3057[var33 - 1];
                int var36 = (var32 - var35[0] << 12) / (var34[0] - var35[0]);
                int var37 = 4096 - var36;
                int var38 = var34[1] * var36 + var35[1] * var37 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3051[var31] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)V", line = 297)
    public static final void method1477(int arg0) {
        field3058++;
        if (arg0 != 227670764) {
            field3065 = (String) null;
        }
        class99.field1491.method1628((byte) -48, 204);
        class268.field4135++;
        for (class36 var1 = (class36) class135.field2251.method371(-19139); var1 != null; var1 = (class36) class135.field2251.method378((byte) -123)) {
            if (var1.field543 == 0) {
                class81.method732(22, true, var1);
            }
        }
        if (class356.field5672 != null) {
            class339.method2380(class356.field5672, 113);
            class356.field5672 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)J", line = 331)
    public static final long method1478(byte arg0) {
        if (arg0 < 70) {
            field3047 = -57;
        }
        field3049++;
        return class66.field1019.method2(0);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZLug;)V", line = 344)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg0 == 0) {
            this.field3059 = arg2.method281(94);
            this.field3057 = new int[arg2.method281(-124)][2];
            for (int var4 = 0; var4 < this.field3057.length; var4++) {
                this.field3057[var4][0] = arg2.method314((byte) 115);
                this.field3057[var4][1] = arg2.method314((byte) 38);
            }
        }
        field3053++;
        if (arg1) {
            this.method1474(true);
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V", line = 372)
    public final void method476(int arg0) {
        if (this.field3057 == null) {
            this.field3057 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field3056++;
        if (this.field3057.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field3059 == 2) {
            this.method1474(false);
        }
        class164.method1307((byte) 0);
        if (arg0 != 0) {
            this.field3059 = 96;
        }
        this.method1476(false);
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)V", line = 396)
    public static void method1479(byte arg0) {
        int var1 = 43 / ((arg0 + 75) / 32);
        field3065 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BC)Z", line = 405)
    public static final boolean method1480(byte arg0, char arg1) {
        field3063++;
        if (arg0 == 5) {
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return false;
        }
    }
}
