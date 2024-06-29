import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class416 extends class14 {

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "[Z")
    public static boolean[] field6341 = new boolean[8];

    @OriginalMember(owner = "client!gu", name = "K", descriptor = "I")
    public static int field6352 = 4;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "F")
    public float field6322;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "F")
    public float field6324;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "F")
    public float field6329;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "F")
    public float field6330;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "F")
    public float field6332;

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "F")
    public float field6334;

    @OriginalMember(owner = "client!gu", name = "y", descriptor = "F")
    public float field6340;

    @OriginalMember(owner = "client!gu", name = "F", descriptor = "F")
    public float field6347;

    @OriginalMember(owner = "client!gu", name = "G", descriptor = "F")
    public float field6348;

    @OriginalMember(owner = "client!gu", name = "J", descriptor = "F")
    public float field6351;

    @OriginalMember(owner = "client!gu", name = "L", descriptor = "F")
    public float field6353;

    @OriginalMember(owner = "client!gu", name = "M", descriptor = "F")
    public float field6354;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!gu", name = "w", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!gu", name = "x", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!gu", name = "A", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!gu", name = "B", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!gu", name = "C", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!gu", name = "D", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!gu", name = "E", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!gu", name = "H", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!gu", name = "I", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIFIFF)V", line = 4)
    public final void method2548(int arg0, int arg1, int arg2, float arg3, int arg4, float arg5, float arg6) {
        field6333++;
        if (arg4 == 0) {
            this.field6334 = this.field6354 = this.field6324 = this.field6351 = this.field6348 = this.field6330 = 0.0F;
            this.field6347 = arg2;
            this.field6340 = arg1;
            this.field6332 = 1.0F;
        } else {
            float var8 = class67.field953[arg4 & 0x3FFF];
            float var9 = class67.field952[arg4 & 0x3FFF];
            this.field6324 = (float) arg2 * -var9;
            this.field6334 = (float) arg1 * var9;
            this.field6354 = this.field6351 = this.field6348 = this.field6330 = 0.0F;
            this.field6340 = (float) arg1 * var8;
            this.field6347 = (float) arg2 * var8;
            this.field6332 = 1.0F;
        }
        if (arg0 <= -87) {
            this.field6322 = arg5;
            this.field6353 = arg3;
            this.field6329 = arg6;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V", line = 38)
    public static void method2549(int arg0) {
        if (arg0 != -8208) {
            method2552(-82, -80, 126);
        }
        field6341 = null;
    }

    @OriginalMember(owner = "client!gu", name = "ya", descriptor = "(Ln;)V", line = 50)
    public final void method151(class14 arg0) {
        field6336++;
        class416 var2 = (class416) arg0;
        this.field6332 = var2.field6332;
        this.field6348 = var2.field6348;
        this.field6334 = var2.field6334;
        this.field6329 = var2.field6329;
        this.field6347 = var2.field6347;
        this.field6322 = var2.field6322;
        this.field6340 = var2.field6340;
        this.field6324 = var2.field6324;
        this.field6351 = var2.field6351;
        this.field6330 = var2.field6330;
        this.field6353 = var2.field6353;
        this.field6354 = var2.field6354;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)[F", line = 75)
    public final float[] method2550(byte arg0) {
        class420.field6397[0] = this.field6340;
        class420.field6397[2] = this.field6354;
        class420.field6397[1] = this.field6334;
        field6342++;
        class420.field6397[9] = this.field6330;
        class420.field6397[14] = this.field6329;
        class420.field6397[6] = this.field6351;
        int var2 = 122 / ((arg0 - 53) / 37);
        class420.field6397[10] = this.field6332;
        class420.field6397[8] = this.field6348;
        class420.field6397[12] = this.field6353;
        class420.field6397[13] = this.field6322;
        class420.field6397[4] = this.field6324;
        class420.field6397[5] = this.field6347;
        return class420.field6397;
    }

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "(I)V", line = 98)
    public final void method150(int arg0) {
        this.field6347 = 1.0F;
        field6326++;
        this.field6340 = this.field6332 = class67.field953[arg0 & 0x3FFF];
        this.field6348 = class67.field952[arg0 & 0x3FFF];
        this.field6354 = -this.field6348;
        this.field6324 = this.field6353 = this.field6334 = this.field6330 = this.field6322 = this.field6351 = this.field6329 = 0.0F;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(III[I)V", line = 113)
    public final void method142(int arg0, int arg1, int arg2, int[] arg3) {
        field6344++;
        arg3[0] = (int) ((float) arg2 * this.field6348 + (float) arg0 * this.field6340 + (float) arg1 * this.field6324 + this.field6353);
        arg3[1] = (int) ((float) arg2 * this.field6330 + (float) arg0 * this.field6334 + (float) arg1 * this.field6347 + this.field6322);
        arg3[2] = (int) ((float) arg2 * this.field6332 + (float) arg0 * this.field6354 + (float) arg1 * this.field6351 + this.field6329);
    }

    @OriginalMember(owner = "client!gu", name = "M", descriptor = "([I)V", line = 130)
    public final void method149(int[] arg0) {
        field6328++;
        float var2 = (float) arg0[0] - this.field6353;
        float var3 = (float) arg0[1] - this.field6322;
        float var4 = (float) arg0[2] - this.field6329;
        arg0[0] = (int) (this.field6354 * var4 + this.field6340 * var2 + this.field6334 * var3);
        arg0[1] = (int) (this.field6351 * var4 + this.field6347 * var3 + this.field6324 * var2);
        arg0[2] = (int) (this.field6332 * var4 + this.field6348 * var2 + this.field6330 * var3);
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V", line = 149)
    public static final void method2551(int arg0) {
        field6323++;
        for (int var1 = 0; var1 < 5; var1++) {
            class17.field286[var1] = false;
        }
        class536.field7872 = class26.field384;
        class256.field3535 = -1;
        class205.field2739 = class199.field2646;
        class174.field2332 = 0;
        class340.field5269 = 5;
        class538.field7892 = -1;
        class507.field7462 = arg0;
        class96.field1433 = class296.field4378;
        class402.field6123 = class393.field6017;
        class282.field4150 = class49.field702;
        class67.field958 = class140.field1869;
    }

    @OriginalMember(owner = "client!gu", name = "K", descriptor = "()V", line = 181)
    public final void method148() {
        field6338++;
        this.field6334 = this.field6354 = this.field6324 = this.field6351 = this.field6348 = this.field6330 = this.field6353 = this.field6322 = this.field6329 = 0.0F;
        this.field6340 = this.field6347 = this.field6332 = 1.0F;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(III)Z", line = 190)
    public static final boolean method2552(int arg0, int arg1, int arg2) {
        int var3 = 0 % ((-arg1 - 24) / 43);
        field6345++;
        return class280.method1796(arg2, arg0, 32768) | (arg0 & 0x800) != 0 || class167.method1134(55, arg2, arg0);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Ln;I)V", line = 200)
    public final void method2553(class14 arg0, int arg1) {
        field6331++;
        class416 var3 = (class416) arg0;
        this.field6348 = var3.field6354;
        this.field6324 = var3.field6334;
        this.field6340 = var3.field6340;
        this.field6330 = var3.field6351;
        this.field6347 = var3.field6347;
        if (arg1 != 21394) {
            return;
        }
        this.field6354 = var3.field6348;
        this.field6334 = var3.field6324;
        this.field6353 = -(this.field6348 * var3.field6329 + this.field6340 * var3.field6353 + this.field6324 * var3.field6322);
        this.field6351 = var3.field6330;
        this.field6332 = var3.field6332;
        this.field6322 = -(this.field6330 * var3.field6329 + this.field6347 * var3.field6322 + this.field6334 * var3.field6353);
        this.field6329 = -(this.field6332 * var3.field6329 + this.field6354 * var3.field6353 + this.field6351 * var3.field6322);
    }

    @OriginalMember(owner = "client!gu", name = "N", descriptor = "(III[I)V", line = 225)
    public final void method147(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field6330 + (float) arg0 * this.field6334 + (float) arg1 * this.field6347);
        field6339++;
        arg3[0] = (int) ((float) arg2 * this.field6348 + (float) arg0 * this.field6340 + (float) arg1 * this.field6324);
        arg3[2] = (int) ((float) arg2 * this.field6332 + (float) arg0 * this.field6354 + (float) arg1 * this.field6351);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "()Ln;", line = 235)
    public final class14 method155() {
        field6335++;
        class416 var1 = new class416();
        var1.field6329 = this.field6329;
        var1.field6354 = this.field6354;
        var1.field6348 = this.field6348;
        var1.field6347 = this.field6347;
        var1.field6332 = this.field6332;
        var1.field6322 = this.field6322;
        var1.field6330 = this.field6330;
        var1.field6334 = this.field6334;
        var1.field6324 = this.field6324;
        var1.field6351 = this.field6351;
        var1.field6340 = this.field6340;
        var1.field6353 = this.field6353;
        return var1;
    }

    @OriginalMember(owner = "client!gu", name = "C", descriptor = "(III)V", line = 257)
    public final void method141(int arg0, int arg1, int arg2) {
        this.field6353 = arg0;
        this.field6329 = arg2;
        this.field6334 = this.field6354 = this.field6324 = this.field6351 = this.field6348 = this.field6330 = 0.0F;
        this.field6322 = arg1;
        this.field6340 = this.field6347 = this.field6332 = 1.0F;
        field6350++;
    }

    @OriginalMember(owner = "client!gu", name = "SA", descriptor = "(I)V", line = 269)
    public final void method145(int arg0) {
        field6337++;
        this.field6340 = 1.0F;
        this.field6347 = this.field6332 = class67.field953[arg0 & 0x3FFF];
        this.field6351 = class67.field952[arg0 & 0x3FFF];
        this.field6324 = this.field6348 = this.field6353 = this.field6334 = this.field6322 = this.field6354 = this.field6329 = 0.0F;
        this.field6330 = -this.field6351;
    }

    @OriginalMember(owner = "client!gu", name = "J", descriptor = "(III)V", line = 284)
    public final void method146(int arg0, int arg1, int arg2) {
        this.field6329 += arg2;
        this.field6353 += arg0;
        this.field6322 += arg1;
        field6349++;
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)[F", line = 302)
    public final float[] method2554(int arg0) {
        class420.field6397[5] = this.field6347;
        class420.field6397[14] = 0.0F;
        class420.field6397[2] = this.field6354;
        class420.field6397[9] = this.field6330;
        class420.field6397[8] = this.field6348;
        class420.field6397[6] = this.field6351;
        class420.field6397[4] = this.field6324;
        class420.field6397[13] = 0.0F;
        field6325++;
        class420.field6397[10] = this.field6332;
        class420.field6397[12] = 0.0F;
        class420.field6397[0] = this.field6340;
        class420.field6397[arg0] = this.field6334;
        return class420.field6397;
    }

    @OriginalMember(owner = "client!gu", name = "ba", descriptor = "(I)V", line = 323)
    public final void method152(int arg0) {
        field6327++;
        float var2 = class67.field953[arg0 & 0x3FFF];
        float var3 = class67.field952[arg0 & 0x3FFF];
        float var4 = this.field6334;
        float var5 = this.field6347;
        float var6 = this.field6330;
        float var7 = this.field6322;
        this.field6334 = var2 * var4 - (this.field6354 * var3);
        this.field6347 = var2 * var5 - this.field6351 * var3;
        this.field6354 = this.field6354 * var2 + var3 * var4;
        this.field6330 = var2 * var6 - (this.field6332 * var3);
        this.field6351 = this.field6351 * var2 + var3 * var5;
        this.field6322 = var2 * var7 - (this.field6329 * var3);
        this.field6332 = this.field6332 * var2 + var3 * var6;
        this.field6329 = this.field6329 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!gu", name = "WA", descriptor = "(I)V", line = 352)
    public final void method154(int arg0) {
        this.field6332 = 1.0F;
        field6343++;
        this.field6340 = this.field6347 = class67.field953[arg0 & 0x3FFF];
        this.field6334 = class67.field952[arg0 & 0x3FFF];
        this.field6324 = -this.field6334;
        this.field6348 = this.field6353 = this.field6330 = this.field6322 = this.field6354 = this.field6351 = this.field6329 = 0.0F;
    }

    @OriginalMember(owner = "client!gu", name = "CA", descriptor = "(I)V", line = 365)
    public final void method153(int arg0) {
        field6321++;
        float var2 = class67.field953[arg0 & 0x3FFF];
        float var3 = class67.field952[arg0 & 0x3FFF];
        float var4 = this.field6340;
        float var5 = this.field6324;
        float var6 = this.field6348;
        float var7 = this.field6353;
        this.field6340 = this.field6354 * var3 + var2 * var4;
        this.field6324 = this.field6351 * var3 + var2 * var5;
        this.field6354 = this.field6354 * var2 - (var3 * var4);
        this.field6351 = this.field6351 * var2 - (var3 * var5);
        this.field6348 = this.field6332 * var3 + var2 * var6;
        this.field6332 = this.field6332 * var2 - var3 * var6;
        this.field6353 = this.field6329 * var3 + var2 * var7;
        this.field6329 = this.field6329 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!gu", name = "IA", descriptor = "(IIIIII)V", line = 392)
    public final void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6346++;
        float var7 = class67.field953[arg3 & 0x3FFF];
        float var8 = class67.field952[arg3 & 0x3FFF];
        float var9 = class67.field953[arg4 & 0x3FFF];
        float var10 = class67.field952[arg4 & 0x3FFF];
        float var11 = class67.field953[arg5 & 0x3FFF];
        float var12 = class67.field952[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field6340 = var9 * var11 + var10 * var14;
        this.field6351 = -var8;
        this.field6334 = -var9 * var12 + var10 * var13;
        this.field6324 = var7 * var12;
        this.field6330 = var9 * var13 + var10 * var12;
        this.field6347 = var7 * var11;
        this.field6332 = var7 * var9;
        this.field6348 = -var10 * var11 + var9 * var14;
        this.field6354 = var7 * var10;
        this.field6329 = (float) (-arg0) * this.field6354 - (float) arg1 * this.field6351 - (float) arg2 * this.field6332;
        this.field6322 = (float) (-arg0) * this.field6334 - (float) arg1 * this.field6347 - (float) arg2 * this.field6330;
        this.field6353 = (float) (-arg0) * this.field6340 - ((float) arg1 * this.field6324) - ((float) arg2 * this.field6348);
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V", line = 433)
    public class416() {
        this.method148();
    }
}
