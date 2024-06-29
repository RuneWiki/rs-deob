import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class3 extends class490 {

    @OriginalMember(owner = "client!uv", name = "x", descriptor = "[I")
    public static int[] field34 = new int[2];

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "F")
    public float field17;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "F")
    public float field21;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "F")
    public float field22;

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "F")
    public float field24;

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "F")
    public float field28;

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "F")
    public float field29;

    @OriginalMember(owner = "client!uv", name = "t", descriptor = "F")
    public float field30;

    @OriginalMember(owner = "client!uv", name = "w", descriptor = "F")
    public float field33;

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "F")
    public float field36;

    @OriginalMember(owner = "client!uv", name = "E", descriptor = "F")
    public float field41;

    @OriginalMember(owner = "client!uv", name = "G", descriptor = "F")
    public float field43;

    @OriginalMember(owner = "client!uv", name = "H", descriptor = "F")
    public float field44;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!uv", name = "u", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!uv", name = "v", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!uv", name = "y", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!uv", name = "A", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!uv", name = "B", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!uv", name = "C", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!uv", name = "D", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!uv", name = "F", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V", line = 3)
    public static void method14(byte arg0) {
        field34 = null;
        int var1 = 7 / ((arg0 - 10) / 47);
    }

    @OriginalMember(owner = "client!uv", name = "M", descriptor = "(Lq;)V", line = 13)
    public final void method15(class490 arg0) {
        field27++;
        class3 var2 = (class3) arg0;
        this.field29 = var2.field29;
        this.field44 = var2.field44;
        this.field21 = var2.field21;
        this.field17 = var2.field17;
        this.field41 = var2.field41;
        this.field28 = var2.field28;
        this.field43 = var2.field43;
        this.field22 = var2.field22;
        this.field30 = var2.field30;
        this.field24 = var2.field24;
        this.field36 = var2.field36;
        this.field33 = var2.field33;
    }

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "(I)V", line = 42)
    public final void method16(int arg0) {
        field19++;
        this.field21 = 1.0F;
        this.field33 = this.field17 = class108.field1163[arg0 & 0x3FFF];
        this.field29 = class108.field1169[arg0 & 0x3FFF];
        this.field41 = this.field22 = this.field43 = this.field30 = this.field36 = this.field28 = this.field44 = 0.0F;
        this.field24 = -this.field29;
    }

    @OriginalMember(owner = "client!uv", name = "J", descriptor = "(I)V", line = 56)
    public final void method17(int arg0) {
        field23++;
        this.field17 = 1.0F;
        this.field33 = this.field21 = class108.field1163[arg0 & 0x3FFF];
        this.field43 = class108.field1169[arg0 & 0x3FFF];
        this.field29 = this.field22 = this.field30 = this.field36 = this.field24 = this.field28 = this.field44 = 0.0F;
        this.field41 = -this.field43;
    }

    @OriginalMember(owner = "client!uv", name = "w", descriptor = "(I)V", line = 68)
    public final void method18(int arg0) {
        field25++;
        float var2 = class108.field1163[arg0 & 0x3FFF];
        float var3 = class108.field1169[arg0 & 0x3FFF];
        float var4 = this.field43;
        float var5 = this.field21;
        float var6 = this.field30;
        float var7 = this.field36;
        this.field43 = var2 * var4 - (this.field24 * var3);
        this.field21 = var2 * var5 - (this.field28 * var3);
        this.field24 = this.field24 * var2 + var3 * var4;
        this.field28 = this.field28 * var2 + var3 * var5;
        this.field30 = var2 * var6 - this.field17 * var3;
        this.field36 = var2 * var7 - (this.field44 * var3);
        this.field17 = this.field17 * var2 + var3 * var6;
        this.field44 = this.field44 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(III[I)V", line = 97)
    public final void method19(int arg0, int arg1, int arg2, int[] arg3) {
        field31++;
        arg3[0] = (int) ((float) arg2 * this.field29 + (float) arg0 * this.field33 + (float) arg1 * this.field41 + this.field22);
        arg3[1] = (int) ((float) arg2 * this.field30 + (float) arg0 * this.field43 + (float) arg1 * this.field21 + this.field36);
        arg3[2] = (int) ((float) arg2 * this.field17 + (float) arg0 * this.field24 + (float) arg1 * this.field28 + this.field44);
    }

    @OriginalMember(owner = "client!uv", name = "oa", descriptor = "(I)V", line = 107)
    public final void method20(int arg0) {
        field18++;
        this.field33 = 1.0F;
        this.field21 = this.field17 = class108.field1163[arg0 & 0x3FFF];
        this.field28 = class108.field1169[arg0 & 0x3FFF];
        this.field41 = this.field29 = this.field22 = this.field43 = this.field36 = this.field24 = this.field44 = 0.0F;
        this.field30 = -this.field28;
    }

    @OriginalMember(owner = "client!uv", name = "YA", descriptor = "([I)V", line = 121)
    public final void method21(int[] arg0) {
        field37++;
        float var2 = (float) arg0[0] - this.field22;
        float var3 = (float) arg0[1] - this.field36;
        float var4 = (float) arg0[2] - this.field44;
        arg0[2] = (int) (this.field17 * var4 + this.field30 * var3 + this.field29 * var2);
        arg0[0] = (int) (this.field24 * var4 + this.field43 * var3 + this.field33 * var2);
        arg0[1] = (int) (this.field28 * var4 + this.field41 * var2 + this.field21 * var3);
    }

    @OriginalMember(owner = "client!uv", name = "Y", descriptor = "()V", line = 140)
    public final void method22() {
        field26++;
        this.field43 = this.field24 = this.field41 = this.field28 = this.field29 = this.field30 = this.field22 = this.field36 = this.field44 = 0.0F;
        this.field33 = this.field21 = this.field17 = 1.0F;
    }

    @OriginalMember(owner = "client!uv", name = "NA", descriptor = "(III)V", line = 157)
    public final void method23(int arg0, int arg1, int arg2) {
        this.field33 = this.field21 = this.field17 = 1.0F;
        this.field43 = this.field24 = this.field41 = this.field28 = this.field29 = this.field30 = 0.0F;
        this.field44 = arg2;
        this.field36 = arg1;
        this.field22 = arg0;
        field39++;
    }

    @OriginalMember(owner = "client!uv", name = "ZA", descriptor = "(I)V", line = 178)
    public final void method24(int arg0) {
        field42++;
        float var2 = class108.field1163[arg0 & 0x3FFF];
        float var3 = class108.field1169[arg0 & 0x3FFF];
        float var4 = this.field33;
        float var5 = this.field41;
        float var6 = this.field29;
        this.field33 = this.field24 * var3 + var2 * var4;
        float var7 = this.field22;
        this.field41 = this.field28 * var3 + var2 * var5;
        this.field24 = this.field24 * var2 - var3 * var4;
        this.field28 = this.field28 * var2 - var3 * var5;
        this.field29 = this.field17 * var3 + var2 * var6;
        this.field22 = this.field44 * var3 + var2 * var7;
        this.field17 = this.field17 * var2 - var3 * var6;
        this.field44 = this.field44 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!uv", name = "na", descriptor = "(IIIIII)V", line = 206)
    public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field32++;
        float var7 = class108.field1163[arg3 & 0x3FFF];
        float var8 = class108.field1169[arg3 & 0x3FFF];
        float var9 = class108.field1163[arg4 & 0x3FFF];
        float var10 = class108.field1169[arg4 & 0x3FFF];
        float var11 = class108.field1163[arg5 & 0x3FFF];
        float var12 = class108.field1169[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field33 = var9 * var11 + var10 * var14;
        this.field17 = var7 * var9;
        this.field29 = -var10 * var11 + var9 * var14;
        this.field28 = -var8;
        this.field30 = var9 * var13 + var10 * var12;
        this.field24 = var7 * var10;
        this.field41 = var7 * var12;
        this.field21 = var7 * var11;
        this.field43 = -var9 * var12 + var10 * var13;
        this.field44 = (float) (-arg0) * this.field24 - (float) arg1 * this.field28 - (float) arg2 * this.field17;
        this.field36 = (float) (-arg0) * this.field43 - ((float) arg1 * this.field21) - ((float) arg2 * this.field30);
        this.field22 = (float) (-arg0) * this.field33 - ((float) arg1 * this.field41) - ((float) arg2 * this.field29);
    }

    @OriginalMember(owner = "client!uv", name = "AA", descriptor = "(I)V", line = 243)
    public final void method26(int arg0) {
        field16++;
        float var2 = class108.field1163[arg0 & 0x3FFF];
        float var3 = class108.field1169[arg0 & 0x3FFF];
        float var4 = this.field33;
        float var5 = this.field41;
        float var6 = this.field29;
        float var7 = this.field22;
        this.field33 = var2 * var4 - (this.field43 * var3);
        this.field43 = this.field43 * var2 + var3 * var4;
        this.field41 = var2 * var5 - (this.field21 * var3);
        this.field21 = this.field21 * var2 + var3 * var5;
        this.field29 = var2 * var6 - (this.field30 * var3);
        this.field30 = this.field30 * var2 + var3 * var6;
        this.field22 = var2 * var7 - (this.field36 * var3);
        this.field36 = this.field36 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "()Lq;", line = 279)
    public final class490 method27() {
        field40++;
        class3 var1 = new class3();
        var1.field22 = this.field22;
        var1.field36 = this.field36;
        var1.field28 = this.field28;
        var1.field24 = this.field24;
        var1.field43 = this.field43;
        var1.field41 = this.field41;
        var1.field21 = this.field21;
        var1.field29 = this.field29;
        var1.field33 = this.field33;
        var1.field30 = this.field30;
        var1.field17 = this.field17;
        var1.field44 = this.field44;
        return var1;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IBI)Lvf;", line = 307)
    public static final class76 method28(int arg0, byte arg1, int arg2) {
        field20++;
        if (arg1 != 42) {
            method14((byte) -118);
        }
        class76 var3 = (class76) class696.field9772.method3669((long) arg0 << 32 | (long) arg2, arg1 - 43);
        if (var3 == null) {
            var3 = new class76(arg0, arg2);
            class696.field9772.method3671(false, var3, var3.field4176);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uv", name = "wa", descriptor = "(III[I)V", line = 329)
    public final void method29(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field30 + (float) arg0 * this.field43 + (float) arg1 * this.field21);
        field35++;
        arg3[0] = (int) ((float) arg2 * this.field29 + (float) arg0 * this.field33 + (float) arg1 * this.field41);
        arg3[2] = (int) ((float) arg2 * this.field17 + (float) arg0 * this.field24 + (float) arg1 * this.field28);
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V", line = 341)
    public class3() {
        this.method22();
    }

    @OriginalMember(owner = "client!uv", name = "U", descriptor = "(III)V", line = 350)
    public final void method30(int arg0, int arg1, int arg2) {
        field38++;
        this.field36 += arg1;
        this.field22 += arg0;
        this.field44 += arg2;
    }
}
