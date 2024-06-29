import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class111 extends class18 {

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public int field1354;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public int field1355;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public int field1356;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V", line = 4)
    public final void method128(int arg0) {
        this.field1362 = 32768;
        this.field1357 = this.field1360 = class158.field2059[arg0 & 0x3FFF];
        this.field1358 = class158.field2055[arg0 & 0x3FFF];
        this.field1364 = -this.field1358;
        this.field1359 = this.field1363 = this.field1361 = this.field1356 = this.field1353 = this.field1354 = this.field1355 = 0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lnc;)V", line = 12)
    public final void method132(class18 arg0) {
        class111 var2 = (class111) arg0;
        this.field1362 = var2.field1362;
        this.field1359 = var2.field1359;
        this.field1363 = var2.field1363;
        this.field1361 = var2.field1361;
        this.field1356 = var2.field1356;
        this.field1357 = var2.field1357;
        this.field1364 = var2.field1364;
        this.field1353 = var2.field1353;
        this.field1354 = var2.field1354;
        this.field1358 = var2.field1358;
        this.field1360 = var2.field1360;
        this.field1355 = var2.field1355;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V", line = 27)
    public final void method123(int arg0) {
        this.field1357 = 32768;
        this.field1362 = this.field1360 = class158.field2059[arg0 & 0x3FFF];
        this.field1363 = class158.field2055[arg0 & 0x3FFF];
        this.field1354 = -this.field1363;
        this.field1359 = this.field1361 = this.field1356 = this.field1364 = this.field1353 = this.field1358 = this.field1355 = 0;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(III)V", line = 35)
    public final void method125(int arg0, int arg1, int arg2) {
        this.field1361 += arg0;
        this.field1353 += arg1;
        this.field1355 += arg2;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()V", line = 40)
    public final void method129() {
        this.field1356 = this.field1354 = this.field1359 = this.field1358 = this.field1363 = this.field1364 = this.field1361 = this.field1353 = this.field1355 = 0;
        this.field1362 = this.field1357 = this.field1360 = 32768;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 47)
    public final void method119(int arg0) {
        int var2 = class158.field2059[arg0 & 0x3FFF];
        int var3 = class158.field2055[arg0 & 0x3FFF];
        int var4 = this.field1362;
        int var5 = this.field1359;
        int var6 = this.field1363;
        int var7 = this.field1361;
        this.field1362 = this.field1354 * var3 + var2 * var4 >> 15;
        this.field1354 = this.field1354 * var2 - var3 * var4 >> 15;
        this.field1359 = this.field1358 * var3 + var2 * var5 >> 15;
        this.field1358 = this.field1358 * var2 - var3 * var5 >> 15;
        this.field1363 = this.field1360 * var3 + var2 * var6 >> 15;
        this.field1360 = this.field1360 * var2 - var3 * var6 >> 15;
        this.field1361 = this.field1355 * var3 + var2 * var7 >> 15;
        this.field1355 = this.field1355 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([I)V", line = 69)
    public final void method121(int[] arg0) {
        int var2 = arg0[0] - this.field1361;
        int var3 = arg0[1] - this.field1353;
        int var4 = arg0[2] - this.field1355;
        arg0[0] = this.field1354 * var4 + this.field1362 * var2 + this.field1356 * var3 >> 15;
        arg0[1] = this.field1358 * var4 + this.field1359 * var2 + this.field1357 * var3 >> 15;
        arg0[2] = this.field1360 * var4 + this.field1364 * var3 + this.field1363 * var2 >> 15;
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V", line = 83)
    public final void method130(int arg0) {
        int var2 = class158.field2059[arg0 & 0x3FFF];
        int var3 = class158.field2055[arg0 & 0x3FFF];
        int var4 = this.field1356;
        int var5 = this.field1357;
        int var6 = this.field1364;
        int var7 = this.field1353;
        this.field1356 = var2 * var4 - this.field1354 * var3 >> 15;
        this.field1354 = this.field1354 * var2 + var3 * var4 >> 15;
        this.field1357 = var2 * var5 - this.field1358 * var3 >> 15;
        this.field1358 = this.field1358 * var2 + var3 * var5 >> 15;
        this.field1364 = var2 * var6 - this.field1360 * var3 >> 15;
        this.field1360 = this.field1360 * var2 + var3 * var6 >> 15;
        this.field1353 = var2 * var7 - this.field1355 * var3 >> 15;
        this.field1355 = this.field1355 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V", line = 104)
    public final void method116(int arg0, int arg1, int arg2) {
        this.field1356 = this.field1354 = this.field1359 = this.field1358 = this.field1363 = this.field1364 = 0;
        this.field1362 = this.field1357 = this.field1360 = 32768;
        this.field1361 = arg0;
        this.field1353 = arg1;
        this.field1355 = arg2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III[I)V", line = 113)
    public final void method122(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field1363 * arg2 + this.field1362 * arg0 + this.field1359 * arg1 >> 15) + this.field1361;
        arg3[1] = (this.field1364 * arg2 + this.field1357 * arg1 + this.field1356 * arg0 >> 15) + this.field1353;
        arg3[2] = (this.field1360 * arg2 + this.field1358 * arg1 + this.field1354 * arg0 >> 15) + this.field1355;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIII)V", line = 119)
    public final void method131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class158.field2059[arg3 & 0x3FFF];
        int var8 = class158.field2055[arg3 & 0x3FFF];
        int var9 = class158.field2059[arg4 & 0x3FFF];
        int var10 = class158.field2055[arg4 & 0x3FFF];
        int var11 = class158.field2059[arg5 & 0x3FFF];
        int var12 = class158.field2055[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field1362 = var9 * var11 + var10 * var14 >> 15;
        this.field1356 = -var9 * var12 + var10 * var13 >> 15;
        this.field1354 = var7 * var10 >> 15;
        this.field1359 = var7 * var12 >> 15;
        this.field1357 = var7 * var11 >> 15;
        this.field1358 = -var8;
        this.field1363 = -var10 * var11 + var9 * var14 >> 15;
        this.field1364 = var9 * var13 + var10 * var12 >> 15;
        this.field1360 = var7 * var9 >> 15;
        this.field1361 = -arg0 * this.field1362 - this.field1359 * arg1 - this.field1363 * arg2 >> 15;
        this.field1353 = -arg0 * this.field1356 - this.field1357 * arg1 - this.field1364 * arg2 >> 15;
        this.field1355 = -arg0 * this.field1354 - this.field1358 * arg1 - this.field1360 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 153)
    public final void method120(int arg0) {
        this.field1360 = 32768;
        this.field1362 = this.field1357 = class158.field2059[arg0 & 0x3FFF];
        this.field1356 = class158.field2055[arg0 & 0x3FFF];
        this.field1359 = -this.field1356;
        this.field1363 = this.field1361 = this.field1364 = this.field1353 = this.field1354 = this.field1358 = this.field1355 = 0;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 160)
    public class111() {
        this.method129();
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "()Loc;", line = 165)
    public final class111 method699() {
        class111 var1 = new class111();
        var1.field1362 = this.field1362;
        var1.field1359 = this.field1359;
        var1.field1363 = this.field1363;
        var1.field1361 = this.field1361;
        var1.field1356 = this.field1356;
        var1.field1357 = this.field1357;
        var1.field1364 = this.field1364;
        var1.field1353 = this.field1353;
        var1.field1354 = this.field1354;
        var1.field1358 = this.field1358;
        var1.field1360 = this.field1360;
        var1.field1355 = this.field1355;
        return var1;
    }
}
