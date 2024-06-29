import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class509 implements class277 {

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Llt;")
    private class475 field7513 = new class475(256);

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Lfs;")
    private class387 field7508;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Lfs;")
    private class387 field7515;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "[Lvf;")
    private class104[] field7517;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field7505 = -1;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field7511 = 0;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field7518 = -1;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)Lvf;", line = 4)
    public final class104 method1780(int arg0, int arg1) {
        field7506++;
        if (arg0 != -31305) {
            this.field7515 = null;
        }
        return this.field7517[arg1];
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZIZFII)[I", line = 16)
    public final int[] method1779(boolean arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5) {
        field7509++;
        if (arg2) {
            this.method1778(-0.10881342F, -4, 5, false, -14, 121);
        }
        return this.method3033(arg1, -22934).method1237(arg5, (byte) 110, this.field7508, this, arg4, (double) arg3, this.field7517[arg1].field1456);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZIIFII)[I", line = 30)
    public final int[] method1777(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5) {
        if (arg1 != 5754) {
            field7504 = 95;
        }
        field7516++;
        return this.method3033(arg2, -22934).method1232(this, -40, arg0, this.field7517[arg2].field1456, this.field7508, (double) arg3, arg5, arg4);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(FIIZII)[F", line = 42)
    public final float[] method1778(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg5 != 15752) {
            field7511 = -59;
        }
        field7507++;
        return this.method3033(arg1, -22934).method1238(false, this, this.field7508, arg4, this.field7517[arg1].field1456, arg2);
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(II)Lkv;", line = 53)
    private final class176 method3033(int arg0, int arg1) {
        field7514++;
        class376 var3 = this.field7513.method2871((long) arg0, (byte) 76);
        if (var3 != null) {
            return (class176) var3;
        }
        if (arg1 != -22934) {
            field7511 = -92;
        }
        byte[] var4 = this.field7515.method2381(arg0, -1);
        if (var4 == null) {
            return null;
        } else {
            class176 var5 = new class176(new class65(var4));
            this.field7513.method2868((long) arg0, var5, -8869);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Z", line = 90)
    public final boolean method1776(int arg0, int arg1) {
        field7510++;
        if (arg1 == 19378) {
            class176 var3 = this.method3033(arg0, arg1 - 42312);
            return var3 != null && var3.method1231((byte) -127, this.field7508, this);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lfs;Lfs;Lfs;)V", line = 108)
    public class509(class387 arg0, class387 arg1, class387 arg2) {
        this.field7508 = arg2;
        this.field7515 = arg1;
        class65 var4 = new class65(arg0.method2363(0, 0, 84));
        int var5 = var4.method623((byte) -127);
        this.field7517 = new class104[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method577(255) == 1) {
                this.field7517[var6] = new class104();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field7517[var7] != null) {
                this.field7517[var7].field1439 = var4.method577(255) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field7517[var8] != null) {
                this.field7517[var8].field1440 = var4.method577(255) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field7517[var9] != null) {
                this.field7517[var9].field1435 = var4.method577(255) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field7517[var10] != null) {
                this.field7517[var10].field1448 = var4.method577(255) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field7517[var11] != null) {
                this.field7517[var11].field1438 = var4.method629(false);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field7517[var12] != null) {
                this.field7517[var12].field1444 = var4.method629(false);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field7517[var13] != null) {
                this.field7517[var13].field1443 = var4.method629(false);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field7517[var14] != null) {
                this.field7517[var14].field1442 = var4.method629(false);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field7517[var15] != null) {
                this.field7517[var15].field1454 = (short) var4.method623((byte) -37);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field7517[var16] != null) {
                this.field7517[var16].field1445 = var4.method629(false);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field7517[var17] != null) {
                this.field7517[var17].field1450 = var4.method629(false);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field7517[var18] != null) {
                this.field7517[var18].field1447 = var4.method577(255) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field7517[var19] != null) {
                this.field7517[var19].field1456 = var4.method577(255) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field7517[var20] != null) {
                this.field7517[var20].field1449 = var4.method629(false);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field7517[var21] != null) {
                this.field7517[var21].field1452 = var4.method577(255) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field7517[var22] != null) {
                this.field7517[var22].field1453 = var4.method577(255) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field7517[var23] != null) {
                this.field7517[var23].field1437 = var4.method577(255) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field7517[var24] != null) {
                this.field7517[var24].field1441 = var4.method577(255);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field7517[var25] != null) {
                this.field7517[var25].field1436 = var4.method616((byte) 112);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/awt/Component;)Lup;", line = 311)
    public static final class180 method3034(byte arg0, Component arg1) {
        field7512++;
        if (arg0 <= 14) {
            field7505 = -72;
        }
        return new class90(arg1);
    }
}
