import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class64 implements class270 {

    @OriginalMember(owner = "client!in", name = "f", descriptor = "Lqi;")
    private class293 field999 = new class293(256);

    @OriginalMember(owner = "client!in", name = "b", descriptor = "Luu;")
    private class237 field995;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "Luu;")
    private class237 field996;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    private int field1001;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "[Lvk;")
    private class239[] field1003;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)J", line = 4)
    public static final long method513(int arg0) {
        if (arg0 == -3157) {
            field1005++;
            return class67.field1033.method2444(-53);
        } else {
            return -3L;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II)Lia;", line = 16)
    private final class157 method514(int arg0, int arg1) {
        field997++;
        class4 var3 = this.field999.method1945((byte) -52, (long) arg1);
        if (var3 != null) {
            return (class157) var3;
        }
        byte[] var4 = this.field996.method1583(arg1, -87);
        if (var4 == null) {
            return null;
        }
        if (arg0 != 1) {
            method516((byte) -76);
        }
        class157 var5 = new class157(new class63(var4));
        this.field999.method1940(var5, (byte) -27, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)I", line = 49)
    public final int method515(byte arg0) {
        if (arg0 >= -126) {
            return -40;
        } else {
            field994++;
            return this.field1001;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V", line = 62)
    public static final void method516(byte arg0) {
        class158.field2218 = 0;
        field1000++;
        int var1 = (class388.field5601.field4410 >> 9) + class113.field1509;
        if (arg0 != 48) {
            return;
        }
        int var2 = (class388.field5601.field4418 >> 9) + class587.field7995;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class158.field2218 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class158.field2218 = 1;
        }
        if (class158.field2218 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class158.field2218 = 0;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZ)Z", line = 88)
    public final boolean method517(int arg0, boolean arg1) {
        field1004++;
        if (!arg1) {
            this.method515((byte) -58);
        }
        class157 var3 = this.method514(1, arg0);
        return var3 != null && var3.method985(this, 125, this.field995);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(FIIIZI)[F", line = 101)
    public final float[] method518(float arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg2 != 8606) {
            this.method518(-0.3176466F, -94, -4, -92, false, -94);
        }
        field1006++;
        return this.method514(arg2 - 8605, arg1).method986(this.field1003[arg1].field3571, arg3, arg5, this.field995, this, -109);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIFIIZ)[I", line = 113)
    public final int[] method519(int arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5) {
        field998++;
        if (arg0 != -6839) {
            this.field995 = null;
        }
        return this.method514(1, arg1).method987((double) arg2, 1, arg5, this.field1003[arg1].field3571, this.field995, this, arg3, arg4);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IBIZIF)[I", line = 124)
    public final int[] method520(int arg0, byte arg1, int arg2, boolean arg3, int arg4, float arg5) {
        if (arg1 < 67) {
            this.field999 = null;
        }
        field1002++;
        return this.method514(1, arg4).method990((byte) 112, (double) arg5, arg0, this.field995, arg2, this.field1003[arg4].field3571, this);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)Lvk;", line = 139)
    public final class239 method521(int arg0, int arg1) {
        field1007++;
        if (arg1 <= 104) {
            this.field995 = null;
        }
        return this.field1003[arg0];
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Luu;Luu;Luu;)V", line = 154)
    public class64(class237 arg0, class237 arg1, class237 arg2) {
        this.field995 = arg2;
        this.field996 = arg1;
        class63 var4 = new class63(arg0.method1572(0, 0, 0));
        this.field1001 = var4.method482(-772591672);
        this.field1003 = new class239[this.field1001];
        for (int var5 = 0; var5 < this.field1001; var5++) {
            if (var4.method505((byte) -119) == 1) {
                this.field1003[var5] = new class239();
            }
        }
        for (int var6 = 0; var6 < this.field1001; var6++) {
            if (this.field1003[var6] != null) {
                this.field1003[var6].field3562 = var4.method505((byte) -119) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field1001; var7++) {
            if (this.field1003[var7] != null) {
                this.field1003[var7].field3556 = var4.method505((byte) -119) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field1001; var8++) {
            if (this.field1003[var8] != null) {
                this.field1003[var8].field3560 = var4.method505((byte) -119) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field1001; var9++) {
            if (this.field1003[var9] != null) {
                this.field1003[var9].field3578 = var4.method491(false);
            }
        }
        for (int var10 = 0; var10 < this.field1001; var10++) {
            if (this.field1003[var10] != null) {
                this.field1003[var10].field3570 = var4.method491(false);
            }
        }
        for (int var11 = 0; var11 < this.field1001; var11++) {
            if (this.field1003[var11] != null) {
                this.field1003[var11].field3561 = var4.method491(false);
            }
        }
        for (int var12 = 0; var12 < this.field1001; var12++) {
            if (this.field1003[var12] != null) {
                this.field1003[var12].field3567 = var4.method491(false);
            }
        }
        for (int var13 = 0; var13 < this.field1001; var13++) {
            if (this.field1003[var13] != null) {
                this.field1003[var13].field3566 = (short) var4.method482(-772591672);
            }
        }
        for (int var14 = 0; var14 < this.field1001; var14++) {
            if (this.field1003[var14] != null) {
                this.field1003[var14].field3579 = var4.method491(false);
            }
        }
        for (int var15 = 0; var15 < this.field1001; var15++) {
            if (this.field1003[var15] != null) {
                this.field1003[var15].field3573 = var4.method491(false);
            }
        }
        for (int var16 = 0; var16 < this.field1001; var16++) {
            if (this.field1003[var16] != null) {
                this.field1003[var16].field3577 = var4.method505((byte) -119) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field1001; var17++) {
            if (this.field1003[var17] != null) {
                this.field1003[var17].field3571 = var4.method505((byte) -119) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field1001; var18++) {
            if (this.field1003[var18] != null) {
                this.field1003[var18].field3575 = var4.method491(false);
            }
        }
        for (int var19 = 0; var19 < this.field1001; var19++) {
            if (this.field1003[var19] != null) {
                this.field1003[var19].field3569 = var4.method505((byte) -119) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field1001; var20++) {
            if (this.field1003[var20] != null) {
                this.field1003[var20].field3576 = var4.method505((byte) -119) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field1001; var21++) {
            if (this.field1003[var21] != null) {
                this.field1003[var21].field3572 = var4.method505((byte) -119) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field1001; var22++) {
            if (this.field1003[var22] != null) {
                this.field1003[var22].field3564 = var4.method505((byte) -119);
            }
        }
        for (int var23 = 0; var23 < this.field1001; var23++) {
            if (this.field1003[var23] != null) {
                this.field1003[var23].field3565 = var4.method457(-14532);
            }
        }
        for (int var24 = 0; var24 < this.field1001; var24++) {
            if (this.field1003[var24] != null) {
                this.field1003[var24].field3557 = var4.method505((byte) -119);
            }
        }
    }
}
