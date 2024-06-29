import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class95 implements class126 {

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "Lmv;")
    private class252 field1425 = new class252(256);

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "Lpc;")
    private class473 field1420;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "Lpc;")
    private class473 field1429;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "[Loh;")
    private class278[] field1419;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field1422 = -60;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "Lcu;")
    public static class145 field1418 = new class145(80, -1);

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public static void method675(int arg0) {
        if (arg0 == 80) {
            field1418 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZZIIFI)[F")
    public final float[] method676(boolean arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5) {
        if (arg0) {
            field1423++;
            return this.method679((byte) -53, arg5).method2087(this.field1419[arg5].field3644, arg2, this.field1420, arg3, this, -1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(II)Loh;")
    public final class278 method677(int arg0, int arg1) {
        field1417++;
        if (arg0 != 2459) {
            method675(-64);
        }
        return this.field1419[arg1];
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(FIIZII)[I")
    public final int[] method678(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg2 != 24201) {
            this.field1420 = null;
        }
        field1424++;
        return this.method679((byte) -53, arg1).method2085(this.field1420, arg4, arg3, this, arg5, this.field1419[arg1].field3644, (byte) -128, (double) arg0);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BI)Ldn;")
    private final class356 method679(byte arg0, int arg1) {
        field1427++;
        class499 var3 = this.field1425.method1515(0, (long) arg1);
        if (var3 != null) {
            return (class356) var3;
        }
        byte[] var4 = this.field1429.method2707(arg1, 0);
        if (arg0 != -53) {
            field1422 = -38;
        }
        if (var4 == null) {
            return null;
        } else {
            class356 var5 = new class356(new class379(var4));
            this.field1425.method1518(var5, (byte) 123, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Z")
    public final boolean method680(int arg0, int arg1) {
        if (arg0 != -16576) {
            this.method678(2.2894652F, 56, 74, true, -119, -127);
        }
        field1426++;
        class356 var3 = this.method679((byte) -53, arg1);
        return var3 != null && var3.method2081(this.field1420, this, arg0 ^ 0x40D9);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(FZIIII)[I")
    public final int[] method681(float arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 1519) {
            this.method677(-1, 57);
        }
        field1421++;
        return this.method679((byte) -53, arg5).method2086((double) arg0, (byte) 79, this.field1420, arg3, this.field1419[arg5].field3644, this, arg2);
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lpc;Lpc;Lpc;)V")
    public class95(class473 arg0, class473 arg1, class473 arg2) {
        this.field1420 = arg2;
        this.field1429 = arg1;
        class379 var4 = new class379(arg0.method2708(0, 0, (byte) 54));
        int var5 = var4.method2212((byte) 83);
        this.field1419 = new class278[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2238(255) == 1) {
                this.field1419[var6] = new class278();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field1419[var7] != null) {
                this.field1419[var7].field3638 = var4.method2238(255) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field1419[var8] != null) {
                this.field1419[var8].field3637 = var4.method2238(255) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1419[var9] != null) {
                this.field1419[var9].field3632 = var4.method2238(255) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field1419[var10] != null) {
                this.field1419[var10].field3646 = var4.method2238(255) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field1419[var11] != null) {
                this.field1419[var11].field3640 = var4.method2194(-1);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field1419[var12] != null) {
                this.field1419[var12].field3649 = var4.method2194(-1);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field1419[var13] != null) {
                this.field1419[var13].field3651 = var4.method2194(-1);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field1419[var14] != null) {
                this.field1419[var14].field3634 = var4.method2194(-1);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field1419[var15] != null) {
                this.field1419[var15].field3647 = (short) var4.method2212((byte) 83);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field1419[var16] != null) {
                this.field1419[var16].field3648 = var4.method2194(-1);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field1419[var17] != null) {
                this.field1419[var17].field3643 = var4.method2194(-1);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field1419[var18] != null) {
                this.field1419[var18].field3652 = var4.method2238(255) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field1419[var19] != null) {
                this.field1419[var19].field3644 = var4.method2238(255) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field1419[var20] != null) {
                this.field1419[var20].field3650 = var4.method2194(-1);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field1419[var21] != null) {
                this.field1419[var21].field3636 = var4.method2238(255) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field1419[var22] != null) {
                this.field1419[var22].field3641 = var4.method2238(255) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field1419[var23] != null) {
                this.field1419[var23].field3635 = var4.method2238(255) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field1419[var24] != null) {
                this.field1419[var24].field3642 = var4.method2238(255);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field1419[var25] != null) {
                this.field1419[var25].field3639 = var4.method2232((byte) 127);
            }
        }
    }
}
