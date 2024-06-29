import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class98 extends class415 {

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public int field1354;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public int field1355;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public int field1356;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!pj", name = "YA", descriptor = "(I)V")
    public final void method325(int arg0) {
        this.field1358 = 32768;
        this.field1357 = this.field1354 = class377.field5315[arg0 & 0x3FFF];
        this.field1355 = class377.field5316[arg0 & 0x3FFF];
        this.field1352 = -this.field1355;
        this.field1360 = this.field1362 = this.field1351 = this.field1361 = this.field1353 = this.field1356 = this.field1359 = 0;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
    public final void method336(int arg0) {
        int var2 = class377.field5315[arg0 & 0x3FFF];
        int var3 = class377.field5316[arg0 & 0x3FFF];
        int var4 = this.field1358;
        int var5 = this.field1360;
        int var6 = this.field1362;
        int var7 = this.field1351;
        this.field1358 = this.field1356 * var3 + var2 * var4 >> 15;
        this.field1356 = this.field1356 * var2 - var3 * var4 >> 15;
        this.field1360 = this.field1355 * var3 + var2 * var5 >> 15;
        this.field1355 = this.field1355 * var2 - var3 * var5 >> 15;
        this.field1362 = this.field1354 * var3 + var2 * var6 >> 15;
        this.field1354 = this.field1354 * var2 - var3 * var6 >> 15;
        this.field1351 = this.field1359 * var3 + var2 * var7 >> 15;
        this.field1359 = this.field1359 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!pj", name = "ma", descriptor = "(I)V")
    public final void method347(int arg0) {
        this.field1354 = 32768;
        this.field1358 = this.field1357 = class377.field5315[arg0 & 0x3FFF];
        this.field1361 = class377.field5316[arg0 & 0x3FFF];
        this.field1360 = -this.field1361;
        this.field1362 = this.field1351 = this.field1352 = this.field1353 = this.field1356 = this.field1355 = this.field1359 = 0;
    }

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "(IIIIII)V")
    public final void method341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class377.field5315[arg3 & 0x3FFF];
        int var8 = class377.field5316[arg3 & 0x3FFF];
        int var9 = class377.field5315[arg4 & 0x3FFF];
        int var10 = class377.field5316[arg4 & 0x3FFF];
        int var11 = class377.field5315[arg5 & 0x3FFF];
        int var12 = class377.field5316[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field1358 = var9 * var11 + var10 * var14 >> 15;
        this.field1361 = -var9 * var12 + var10 * var13 >> 15;
        this.field1356 = var7 * var10 >> 15;
        this.field1360 = var7 * var12 >> 15;
        this.field1357 = var7 * var11 >> 15;
        this.field1355 = -var8;
        this.field1362 = -var10 * var11 + var9 * var14 >> 15;
        this.field1352 = var9 * var13 + var10 * var12 >> 15;
        this.field1354 = var7 * var9 >> 15;
        this.field1351 = -arg0 * this.field1358 - this.field1360 * arg1 - this.field1362 * arg2 >> 15;
        this.field1353 = -arg0 * this.field1361 - this.field1357 * arg1 - this.field1352 * arg2 >> 15;
        this.field1359 = -arg0 * this.field1356 - this.field1355 * arg1 - this.field1354 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!pj", name = "na", descriptor = "(I)V")
    public final void method345(int arg0) {
        int var2 = class377.field5315[arg0 & 0x3FFF];
        int var3 = class377.field5316[arg0 & 0x3FFF];
        int var4 = this.field1361;
        int var5 = this.field1357;
        int var6 = this.field1352;
        int var7 = this.field1353;
        this.field1361 = var2 * var4 - this.field1356 * var3 >> 15;
        this.field1356 = this.field1356 * var2 + var3 * var4 >> 15;
        this.field1357 = var2 * var5 - this.field1355 * var3 >> 15;
        this.field1355 = this.field1355 * var2 + var3 * var5 >> 15;
        this.field1352 = var2 * var6 - this.field1354 * var3 >> 15;
        this.field1354 = this.field1354 * var2 + var3 * var6 >> 15;
        this.field1353 = var2 * var7 - this.field1359 * var3 >> 15;
        this.field1359 = this.field1359 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III[I)V")
    public final void method332(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field1362 * arg2 + this.field1360 * arg1 + this.field1358 * arg0 >> 15) + this.field1351;
        arg3[1] = (this.field1352 * arg2 + this.field1361 * arg0 + this.field1357 * arg1 >> 15) + this.field1353;
        arg3[2] = (this.field1354 * arg2 + this.field1356 * arg0 + this.field1355 * arg1 >> 15) + this.field1359;
    }

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "([I)V")
    public final void method327(int[] arg0) {
        int var2 = arg0[0] - this.field1351;
        int var3 = arg0[1] - this.field1353;
        int var4 = arg0[2] - this.field1359;
        arg0[0] = this.field1356 * var4 + this.field1361 * var3 + this.field1358 * var2 >> 15;
        arg0[1] = this.field1355 * var4 + this.field1360 * var2 + this.field1357 * var3 >> 15;
        arg0[2] = this.field1354 * var4 + this.field1362 * var2 + this.field1352 * var3 >> 15;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "()Lia;")
    public final class415 method346() {
        class98 var1 = new class98();
        var1.field1358 = this.field1358;
        var1.field1360 = this.field1360;
        var1.field1362 = this.field1362;
        var1.field1351 = this.field1351;
        var1.field1361 = this.field1361;
        var1.field1357 = this.field1357;
        var1.field1352 = this.field1352;
        var1.field1353 = this.field1353;
        var1.field1356 = this.field1356;
        var1.field1355 = this.field1355;
        var1.field1354 = this.field1354;
        var1.field1359 = this.field1359;
        return var1;
    }

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "(III[I)V")
    public final void method330(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field1362 * arg2 + this.field1360 * arg1 + this.field1358 * arg0 >> 15;
        arg3[1] = this.field1352 * arg2 + this.field1361 * arg0 + this.field1357 * arg1 >> 15;
        arg3[2] = this.field1354 * arg2 + this.field1356 * arg0 + this.field1355 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!pj", name = "HA", descriptor = "()V")
    public final void method328() {
        this.field1361 = this.field1356 = this.field1360 = this.field1355 = this.field1362 = this.field1352 = this.field1351 = this.field1353 = this.field1359 = 0;
        this.field1358 = this.field1357 = this.field1354 = 32768;
    }

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "(III)V")
    public final void method340(int arg0, int arg1, int arg2) {
        this.field1361 = this.field1356 = this.field1360 = this.field1355 = this.field1362 = this.field1352 = 0;
        this.field1358 = this.field1357 = this.field1354 = 32768;
        this.field1351 = arg0;
        this.field1353 = arg1;
        this.field1359 = arg2;
    }

    @OriginalMember(owner = "client!pj", name = "ZA", descriptor = "(III)V")
    public final void method335(int arg0, int arg1, int arg2) {
        this.field1351 += arg0;
        this.field1353 += arg1;
        this.field1359 += arg2;
    }

    @OriginalMember(owner = "client!pj", name = "ba", descriptor = "(Lia;)V")
    public final void method342(class415 arg0) {
        class98 var2 = (class98) arg0;
        this.field1358 = var2.field1358;
        this.field1360 = var2.field1360;
        this.field1362 = var2.field1362;
        this.field1351 = var2.field1351;
        this.field1361 = var2.field1361;
        this.field1357 = var2.field1357;
        this.field1352 = var2.field1352;
        this.field1353 = var2.field1353;
        this.field1356 = var2.field1356;
        this.field1355 = var2.field1355;
        this.field1354 = var2.field1354;
        this.field1359 = var2.field1359;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class98() {
        this.method328();
    }

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "(I)V")
    public final void method343(int arg0) {
        this.field1357 = 32768;
        this.field1358 = this.field1354 = class377.field5315[arg0 & 0x3FFF];
        this.field1362 = class377.field5316[arg0 & 0x3FFF];
        this.field1356 = -this.field1362;
        this.field1360 = this.field1351 = this.field1361 = this.field1352 = this.field1353 = this.field1355 = this.field1359 = 0;
    }
}
