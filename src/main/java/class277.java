import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class277 {

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public int field4169;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field4178 = 0;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4179 = null;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "S")
    public static short field4185 = 1;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public int field4166;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public int field4171;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public int field4173;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "Ltl;")
    public class68 field4175;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "[I")
    public int[] field4164;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "[I")
    public int[] field4165;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "[I")
    public int[] field4172;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "[I")
    public int[] field4174;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "[I")
    public int[] field4176;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "[I")
    public int[] field4180;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "[Ltl;")
    public class68[] field4181;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "[[I")
    public int[][] field4167;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "[[I")
    public int[][] field4168;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIB)V")
    public static final void method1835(int arg0, int arg1, int arg2, byte arg3) {
        field4170++;
        class187 var4 = class120.method762((byte) -120, 11, arg2);
        var4.method1167(-120);
        var4.field2837 = arg1;
        var4.field2844 = arg0;
        if (arg3 != 114) {
            field4177 = -24;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIII)Lea;")
    public static final class38 method1836(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4184++;
        long var5 = (long) arg0 & 0xFFFFL | 0xFFFFL << 48 & (long) arg4 << 48 | 0xFFFFL << 32 & (long) arg1 << 32 | ((long) arg2 & 0xFFFFL) << 16;
        class38 var7 = (class38) class24.field297.method1777(var5, (byte) 112);
        if (var7 != null) {
            return var7;
        }
        class95[] var8 = null;
        int var9 = -96 / ((arg3 + 17) / 54);
        class221 var10 = class25.method159(false, arg0);
        if (var10.field3331 != null) {
            var8 = new class95[var10.field3331.length];
            for (int var11 = 0; var11 < var8.length; var11++) {
                class292 var12 = class144.method883(var10.field3331[var11], (byte) -128);
                var8[var11] = new class95(var12.field4600, var12.field4587, var12.field4595, var12.field4592, var12.field4588, var12.field4602, var12.field4604, var12.field4601);
            }
        }
        class38 var13 = new class38(var10.field3330, var8, var10.field3324, arg4, arg1, arg2);
        class24.field297.method1784(var5, var13, 0);
        return var13;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B[B)V")
    private final void method1837(byte arg0, byte[] arg1) {
        field4183++;
        class248 var3 = new class248(class26.method163(arg1, (byte) -121));
        int var4 = var3.method1593((byte) 27);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        int var5 = 0;
        if (var4 >= 6) {
            this.field4166 = var3.method1576(-17672);
        } else {
            this.field4166 = 0;
        }
        int var6 = var3.method1593((byte) 27);
        this.field4173 = var3.method1575(false);
        this.field4174 = new int[this.field4173];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field4173; var8++) {
            this.field4174[var8] = var5 += var3.method1575(false);
            if (this.field4174[var8] > var7) {
                var7 = this.field4174[var8];
            }
        }
        this.field4171 = var7 + 1;
        if (arg0 != -45) {
            method1838(38, 122);
        }
        this.field4168 = new int[this.field4171][];
        this.field4164 = new int[this.field4171];
        this.field4172 = new int[this.field4171];
        this.field4180 = new int[this.field4171];
        this.field4176 = new int[this.field4171];
        if (var6 != 0) {
            this.field4165 = new int[this.field4171];
            for (int var9 = 0; var9 < this.field4171; var9++) {
                this.field4165[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4173; var10++) {
                this.field4165[this.field4174[var10]] = var3.method1576(-17672);
            }
            this.field4175 = new class68(this.field4165);
        }
        for (int var11 = 0; var11 < this.field4173; var11++) {
            this.field4176[this.field4174[var11]] = var3.method1576(-17672);
        }
        for (int var12 = 0; var12 < this.field4173; var12++) {
            this.field4164[this.field4174[var12]] = var3.method1576(arg0 - 17627);
        }
        for (int var13 = 0; var13 < this.field4173; var13++) {
            this.field4172[this.field4174[var13]] = var3.method1575(false);
        }
        for (int var14 = 0; var14 < this.field4173; var14++) {
            int var21 = 0;
            int var22 = -1;
            int var23 = this.field4174[var14];
            int var24 = this.field4172[var23];
            this.field4168[var23] = new int[var24];
            for (int var25 = 0; var25 < var24; var25++) {
                int var26 = this.field4168[var23][var25] = var21 += var3.method1575(false);
                if (var22 < var26) {
                    var22 = var26;
                }
            }
            this.field4180[var23] = var22 + 1;
            if ((var22 + 1) == var24) {
                this.field4168[var23] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field4167 = new int[var7 + 1][];
        this.field4181 = new class68[var7 + 1];
        for (int var15 = 0; var15 < this.field4173; var15++) {
            int var16 = this.field4174[var15];
            int var17 = this.field4172[var16];
            this.field4167[var16] = new int[this.field4180[var16]];
            for (int var18 = 0; var18 < this.field4180[var16]; var18++) {
                this.field4167[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field4168[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field4168[var16][var19];
                }
                this.field4167[var16][var20] = var3.method1576(-17672);
            }
            this.field4181[var16] = new class68(this.field4167[var16]);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Lhg;")
    public static final class181 method1838(int arg0, int arg1) {
        field4182++;
        class181 var2 = (class181) class246.field3681.method1777((long) arg1, (byte) 112);
        if (var2 != null) {
            return var2;
        }
        if (arg0 < 114) {
            method1839(true);
        }
        byte[] var3 = class58.field917.method1973(1, arg1, 0);
        class181 var4 = new class181(var3);
        var4.method1014(class143.field2101, (int[]) null);
        class246.field3681.method1784((long) arg1, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
    public static void method1839(boolean arg0) {
        field4179 = null;
        if (arg0) {
            field4179 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "([BI)V")
    public class277(byte[] arg0, int arg1) {
        this.field4169 = class167.method1043((byte) -94, arg0.length, arg0);
        if (this.field4169 != arg1) {
            throw new RuntimeException();
        }
        this.method1837((byte) -45, arg0);
    }
}
