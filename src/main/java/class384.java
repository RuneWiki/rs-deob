import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class384 extends class392 {

    @OriginalMember(owner = "client!mba", name = "n", descriptor = "Len;")
    public static class290 field5435 = new class290("", 11);

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "F")
    public float field5430;

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "F")
    public float field5432;

    @OriginalMember(owner = "client!mba", name = "m", descriptor = "F")
    public float field5434;

    @OriginalMember(owner = "client!mba", name = "p", descriptor = "F")
    public float field5437;

    @OriginalMember(owner = "client!mba", name = "q", descriptor = "F")
    public float field5438;

    @OriginalMember(owner = "client!mba", name = "r", descriptor = "F")
    public float field5439;

    @OriginalMember(owner = "client!mba", name = "t", descriptor = "F")
    public float field5441;

    @OriginalMember(owner = "client!mba", name = "v", descriptor = "F")
    public float field5443;

    @OriginalMember(owner = "client!mba", name = "z", descriptor = "F")
    public float field5447;

    @OriginalMember(owner = "client!mba", name = "C", descriptor = "F")
    public float field5450;

    @OriginalMember(owner = "client!mba", name = "F", descriptor = "F")
    public float field5453;

    @OriginalMember(owner = "client!mba", name = "G", descriptor = "F")
    public float field5454;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!mba", name = "o", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!mba", name = "s", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!mba", name = "u", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!mba", name = "w", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!mba", name = "x", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!mba", name = "y", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!mba", name = "A", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!mba", name = "B", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!mba", name = "D", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!mba", name = "E", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!mba", name = "H", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!mba", name = "I", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!mba", name = "J", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!mba", name = "K", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!mba", name = "B", descriptor = "(III[I)V")
    public final void method676(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field5441);
        int var6 = (int) ((float) arg1 - this.field5438);
        field5427++;
        int var7 = (int) ((float) arg2 - this.field5443);
        arg3[1] = (int) ((float) var7 * this.field5437 + (float) var5 * this.field5430 + (float) var6 * this.field5447);
        arg3[2] = (int) ((float) var7 * this.field5439 + (float) var5 * this.field5453 + (float) var6 * this.field5434);
        arg3[0] = (int) ((float) var7 * this.field5454 + (float) var5 * this.field5432 + (float) var6 * this.field5450);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lrc;B)I")
    public static final int method2277(class499 arg0, byte arg1) {
        field5429++;
        String var2 = class91.method664(arg0, 122);
        if (arg1 <= 36) {
            return -104;
        }
        int[] var3 = null;
        if (class420.method2434(arg0.field6780, (byte) -112)) {
            var3 = class599.field8366.method3949(0, (int) arg0.field6787).field9200;
        } else if (arg0.field6779 != -1) {
            var3 = class599.field8366.method3949(0, arg0.field6779).field9200;
        } else if (class628.method3514(arg0.field6780, (byte) 49)) {
            class393 var6 = (class393) class299.field4071.method970((byte) 89, (long) ((int) arg0.field6787));
            if (var6 != null) {
                class61 var7 = var6.field5552;
                class568 var8 = var7.field674;
                if (var8.field8079 != null) {
                    var8 = var8.method3259((byte) 92, class578.field8156);
                }
                if (var8 != null) {
                    var3 = var8.field8056;
                }
            }
        } else if (class556.method3115(30916, arg0.field6780)) {
            Object var4 = null;
            class301 var5;
            if (arg0.field6780 == 1010) {
                var5 = class475.field6543.method2685((int) arg0.field6787, -57);
            } else {
                var5 = class475.field6543.method2685((int) (arg0.field6787 >>> 32 & 0x7FFFFFFFL), -52);
            }
            if (var5.field4113 != null) {
                var5 = var5.method1833(-114, class578.field8156);
            }
            if (var5 != null) {
                var3 = var5.field4120;
            }
        }
        if (var3 != null) {
            var2 = var2 + class90.method656(var3, (byte) -101);
        }
        int var9 = class377.field5030.method1741(var2, class66.field862, 1);
        if (arg0.field6784) {
            var9 += class164.field2361.method1658() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!mba", name = "na", descriptor = "(IIIIII)V")
    public final void method680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5436++;
        float var7 = class141.field2003[arg3 & 0x3FFF];
        float var8 = class141.field2002[arg3 & 0x3FFF];
        float var9 = class141.field2003[arg4 & 0x3FFF];
        float var10 = class141.field2002[arg4 & 0x3FFF];
        float var11 = class141.field2003[arg5 & 0x3FFF];
        float var12 = class141.field2002[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field5430 = var7 * var12;
        this.field5439 = var7 * var9;
        this.field5437 = -var8;
        this.field5434 = var9 * var13 + var10 * var12;
        this.field5447 = var7 * var11;
        this.field5450 = -var9 * var12 + var10 * var13;
        this.field5453 = -var10 * var11 + var9 * var14;
        this.field5432 = var9 * var11 + var10 * var14;
        this.field5454 = var7 * var10;
        this.field5441 = (float) (-arg0) * this.field5432 - (float) arg1 * this.field5430 - ((float) arg2 * this.field5453);
        this.field5443 = (float) (-arg0) * this.field5454 - ((float) arg1 * this.field5437) - (float) arg2 * this.field5439;
        this.field5438 = (float) (-arg0) * this.field5450 - (float) arg1 * this.field5447 - (float) arg2 * this.field5434;
    }

    @OriginalMember(owner = "client!mba", name = "w", descriptor = "(I)V")
    public final void method684(int arg0) {
        field5455++;
        float var2 = class141.field2003[arg0 & 0x3FFF];
        float var3 = class141.field2002[arg0 & 0x3FFF];
        float var4 = this.field5450;
        float var5 = this.field5447;
        float var6 = this.field5434;
        this.field5450 = var2 * var4 - this.field5454 * var3;
        float var7 = this.field5438;
        this.field5447 = var2 * var5 - (this.field5437 * var3);
        this.field5454 = this.field5454 * var2 + var3 * var4;
        this.field5437 = this.field5437 * var2 + var3 * var5;
        this.field5434 = var2 * var6 - this.field5439 * var3;
        this.field5439 = this.field5439 * var2 + var3 * var6;
        this.field5438 = var2 * var7 - (this.field5443 * var3);
        this.field5443 = this.field5443 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!mba", name = "YA", descriptor = "([I)V")
    public final void method677(int[] arg0) {
        field5442++;
        float var2 = (float) arg0[0] - this.field5441;
        float var3 = (float) arg0[1] - this.field5438;
        float var4 = (float) arg0[2] - this.field5443;
        arg0[0] = (int) (this.field5454 * var4 + this.field5450 * var3 + this.field5432 * var2);
        arg0[1] = (int) (this.field5437 * var4 + this.field5447 * var3 + this.field5430 * var2);
        arg0[2] = (int) (this.field5439 * var4 + this.field5453 * var2 + this.field5434 * var3);
    }

    @OriginalMember(owner = "client!mba", name = "o", descriptor = "(I)V")
    public final void method685(int arg0) {
        this.field5447 = 1.0F;
        field5451++;
        this.field5432 = this.field5439 = class141.field2003[arg0 & 0x3FFF];
        this.field5453 = class141.field2002[arg0 & 0x3FFF];
        this.field5430 = this.field5441 = this.field5450 = this.field5434 = this.field5438 = this.field5437 = this.field5443 = 0.0F;
        this.field5454 = -this.field5453;
    }

    @OriginalMember(owner = "client!mba", name = "wa", descriptor = "(III[I)V")
    public final void method690(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field5439 + (float) arg0 * this.field5454 + (float) arg1 * this.field5437);
        arg3[0] = (int) ((float) arg2 * this.field5453 + (float) arg0 * this.field5432 + (float) arg1 * this.field5430);
        arg3[1] = (int) ((float) arg2 * this.field5434 + (float) arg0 * this.field5450 + (float) arg1 * this.field5447);
        field5433++;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
    public static final void method2278(int arg0, String[] arg1, short[] arg2) {
        field5431++;
        class594.method3358(65535, arg1, arg1.length - arg0, arg2, 0);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "()Lq;")
    public final class392 method681() {
        field5452++;
        class384 var1 = new class384();
        var1.field5439 = this.field5439;
        var1.field5453 = this.field5453;
        var1.field5443 = this.field5443;
        var1.field5432 = this.field5432;
        var1.field5441 = this.field5441;
        var1.field5454 = this.field5454;
        var1.field5447 = this.field5447;
        var1.field5434 = this.field5434;
        var1.field5430 = this.field5430;
        var1.field5450 = this.field5450;
        var1.field5437 = this.field5437;
        var1.field5438 = this.field5438;
        return var1;
    }

    @OriginalMember(owner = "client!mba", name = "U", descriptor = "(III)V")
    public final void method687(int arg0, int arg1, int arg2) {
        this.field5441 += arg0;
        this.field5438 += arg1;
        field5458++;
        this.field5443 += arg2;
    }

    @OriginalMember(owner = "client!mba", name = "M", descriptor = "(Lq;)V")
    public final void method675(class392 arg0) {
        field5428++;
        class384 var2 = (class384) arg0;
        this.field5430 = var2.field5430;
        this.field5453 = var2.field5453;
        this.field5450 = var2.field5450;
        this.field5438 = var2.field5438;
        this.field5447 = var2.field5447;
        this.field5437 = var2.field5437;
        this.field5439 = var2.field5439;
        this.field5441 = var2.field5441;
        this.field5434 = var2.field5434;
        this.field5443 = var2.field5443;
        this.field5454 = var2.field5454;
        this.field5432 = var2.field5432;
    }

    @OriginalMember(owner = "client!mba", name = "Y", descriptor = "()V")
    public final void method679() {
        this.field5450 = this.field5454 = this.field5430 = this.field5437 = this.field5453 = this.field5434 = this.field5441 = this.field5438 = this.field5443 = 0.0F;
        this.field5432 = this.field5447 = this.field5439 = 1.0F;
        field5446++;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V")
    public static void method2279(byte arg0) {
        field5435 = null;
        if (arg0 != 96) {
            field5456 = -81;
        }
    }

    @OriginalMember(owner = "client!mba", name = "NA", descriptor = "(III)V")
    public final void method689(int arg0, int arg1, int arg2) {
        this.field5432 = this.field5447 = this.field5439 = 1.0F;
        this.field5450 = this.field5454 = this.field5430 = this.field5437 = this.field5453 = this.field5434 = 0.0F;
        this.field5443 = arg2;
        this.field5441 = arg0;
        this.field5438 = arg1;
        field5444++;
    }

    @OriginalMember(owner = "client!mba", name = "ZA", descriptor = "(I)V")
    public final void method674(int arg0) {
        field5457++;
        float var2 = class141.field2003[arg0 & 0x3FFF];
        float var3 = class141.field2002[arg0 & 0x3FFF];
        float var4 = this.field5432;
        float var5 = this.field5430;
        float var6 = this.field5453;
        this.field5432 = this.field5454 * var3 + var2 * var4;
        float var7 = this.field5441;
        this.field5454 = this.field5454 * var2 - var3 * var4;
        this.field5430 = this.field5437 * var3 + var2 * var5;
        this.field5453 = this.field5439 * var3 + var2 * var6;
        this.field5437 = this.field5437 * var2 - (var3 * var5);
        this.field5441 = this.field5443 * var3 + var2 * var7;
        this.field5439 = this.field5439 * var2 - (var3 * var6);
        this.field5443 = this.field5443 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(III[I)V")
    public final void method682(int arg0, int arg1, int arg2, int[] arg3) {
        field5440++;
        arg3[0] = (int) ((float) arg2 * this.field5453 + (float) arg0 * this.field5432 + (float) arg1 * this.field5430 + this.field5441);
        arg3[2] = (int) ((float) arg2 * this.field5439 + (float) arg0 * this.field5454 + (float) arg1 * this.field5437 + this.field5443);
        arg3[1] = (int) ((float) arg2 * this.field5434 + (float) arg0 * this.field5450 + (float) arg1 * this.field5447 + this.field5438);
    }

    @OriginalMember(owner = "client!mba", name = "J", descriptor = "(I)V")
    public final void method686(int arg0) {
        field5445++;
        this.field5439 = 1.0F;
        this.field5432 = this.field5447 = class141.field2003[arg0 & 0x3FFF];
        this.field5450 = class141.field2002[arg0 & 0x3FFF];
        this.field5430 = -this.field5450;
        this.field5453 = this.field5441 = this.field5434 = this.field5438 = this.field5454 = this.field5437 = this.field5443 = 0.0F;
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "()V")
    public class384() {
        this.method679();
    }

    @OriginalMember(owner = "client!mba", name = "oa", descriptor = "(I)V")
    public final void method678(int arg0) {
        this.field5432 = 1.0F;
        field5449++;
        this.field5447 = this.field5439 = class141.field2003[arg0 & 0x3FFF];
        this.field5437 = class141.field2002[arg0 & 0x3FFF];
        this.field5434 = -this.field5437;
        this.field5430 = this.field5453 = this.field5441 = this.field5450 = this.field5438 = this.field5454 = this.field5443 = 0.0F;
    }

    @OriginalMember(owner = "client!mba", name = "AA", descriptor = "(I)V")
    public final void method673(int arg0) {
        field5448++;
        float var2 = class141.field2003[arg0 & 0x3FFF];
        float var3 = class141.field2002[arg0 & 0x3FFF];
        float var4 = this.field5432;
        float var5 = this.field5430;
        float var6 = this.field5453;
        float var7 = this.field5441;
        this.field5432 = var2 * var4 - (this.field5450 * var3);
        this.field5430 = var2 * var5 - (this.field5447 * var3);
        this.field5450 = this.field5450 * var2 + var3 * var4;
        this.field5447 = this.field5447 * var2 + var3 * var5;
        this.field5453 = var2 * var6 - (this.field5434 * var3);
        this.field5434 = this.field5434 * var2 + var3 * var6;
        this.field5441 = var2 * var7 - this.field5438 * var3;
        this.field5438 = this.field5438 * var2 + var3 * var7;
    }
}
