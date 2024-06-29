import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class196 extends class112 {

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "Lwm;")
    public static class152 field3136 = class157.method1048("T", 97);

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public static int field3135 = 0;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "Lwm;")
    public static class152 field3140 = class157.method1048("Veuillez patienter)3)3)3", 93);

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "Lwm;")
    public static class152 field3141 = class157.method1048("Speicher wird zugewiesen)3", 92);

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "Lwm;")
    public static class152 field3145 = class157.method1048("blinken3:", 99);

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
    public static int field3144 = 1;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "Z")
    public static boolean field3147 = false;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "Lwm;")
    private static class152 field3149 = class157.method1048("Hidden", 116);

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "Lwm;")
    public static class152 field3143 = field3149;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "[Lui;")
    private class265[] field3142;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "(I)V", line = 5)
    public static void method1308(int arg0) {
        field3145 = null;
        field3143 = null;
        field3141 = null;
        field3136 = null;
        field3149 = null;
        field3140 = null;
        if (arg0 >= -20) {
            method1310(83, -102);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)Z", line = 20)
    public static final boolean method1309(int arg0, int arg1, int arg2, int arg3) {
        if (class224.method1544(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class150.method943(var4 + 1, class65.field984[arg0][arg1][arg2] + arg3, var5 + 1) && class150.method943(var4 + 128 - 1, class65.field984[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class150.method943(var4 + 128 - 1, class65.field984[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class150.method943(var4 + 1, class65.field984[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILhi;)V", line = 41)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg0 != 31164) {
            return;
        }
        field3146++;
        if (arg1 == 0) {
            this.field3142 = new class265[arg2.method2011(-121)];
            for (int var4 = 0; var4 < this.field3142.length; var4++) {
                int var5 = arg2.method2011(-65);
                if (var5 == 0) {
                    this.field3142[var4] = class134.method855(arg2, -1);
                } else if (var5 == 1) {
                    this.field3142[var4] = class2.method10((byte) -121, arg2);
                } else if (var5 == 2) {
                    this.field3142[var4] = class237.method1629((byte) -119, arg2);
                } else if (var5 == 3) {
                    this.field3142[var4] = class92.method605(-1, arg2);
                }
            }
        } else if (arg1 == 1) {
            this.field1591 = arg2.method2011(-27) == 1;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V", line = 113)
    public static final void method1310(int arg0, int arg1) {
        if (arg0 == 0) {
            field3139++;
            class123.field1727.method1617(arg1, arg0 ^ 0x32);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)[[I", line = 134)
    public final int[][] method55(int arg0, boolean arg1) {
        if (arg1) {
            method1309(73, 71, 7, 4);
        }
        field3137++;
        int[][] var3 = this.field1594.method656((byte) 125, arg0);
        if (this.field1594.field1402) {
            int var4 = class268.field4526;
            int var5 = class58.field889;
            int[][] var6 = new int[var4][var5];
            int[][][] var7 = this.field1594.method653(0);
            this.method1311(var6, 100);
            for (int var8 = 0; var8 < class268.field4526; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[2];
                int[] var13 = var10[1];
                for (int var14 = 0; var14 < class58.field889; var14++) {
                    int var15 = var9[var14];
                    var12[var14] = class34.method251(var15 << 4, 4080);
                    var13[var14] = class34.method251(4080, var15 >> 4);
                    var11[var14] = class34.method251(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)[I", line = 200)
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -3) {
            this.method55(-114, false);
        }
        field3148++;
        int[] var3 = this.field1585.method1952(arg1, (byte) 76);
        if (this.field1585.field4935) {
            this.method1311(this.field1585.method1953((byte) -66), 113);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 239)
    public class196() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([[II)V", line = 262)
    private final void method1311(int[][] arg0, int arg1) {
        field3138++;
        int var3 = class58.field889;
        if (arg1 < 28) {
            field3136 = (class152) null;
        }
        int var4 = class268.field4526;
        class92.method604(arg0, -113);
        class228.method1569(0, 0, class275.field4712, -116, class251.field4304);
        if (this.field3142 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field3142.length; var5++) {
            class265 var6 = this.field3142[var5];
            int var7 = var6.field4474;
            int var8 = var6.field4472;
            if (var7 >= 0) {
                if (var8 < 0) {
                    var6.method243(var3, var4, -118);
                } else {
                    var6.method248((byte) 83, var4, var3);
                }
            } else if (var8 >= 0) {
                var6.method247(var4, var3, 114);
            }
        }
    }
}
