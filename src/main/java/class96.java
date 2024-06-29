import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class96 extends class417 {

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public int field1338;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public int field1339;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public int field1347;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III[I)V")
    public final void method692(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field1348 * arg2 + this.field1346 * arg0 + this.field1342 * arg1 >> 15) + this.field1347;
        arg3[1] = (this.field1341 * arg2 + this.field1344 * arg1 + this.field1337 * arg0 >> 15) + this.field1343;
        arg3[2] = (this.field1339 * arg2 + this.field1345 * arg0 + this.field1340 * arg1 >> 15) + this.field1338;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
    public final void method693() {
        this.field1337 = this.field1345 = this.field1342 = this.field1340 = this.field1348 = this.field1341 = this.field1347 = this.field1343 = this.field1338 = 0;
        this.field1346 = this.field1344 = this.field1339 = 32768;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIII)V")
    public final void method694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class133.field1908[arg3 & 0x3FFF];
        int var8 = class133.field1913[arg3 & 0x3FFF];
        int var9 = class133.field1908[arg4 & 0x3FFF];
        int var10 = class133.field1913[arg4 & 0x3FFF];
        int var11 = class133.field1908[arg5 & 0x3FFF];
        int var12 = class133.field1913[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field1346 = var9 * var11 + var10 * var14 >> 15;
        this.field1337 = -var9 * var12 + var10 * var13 >> 15;
        this.field1345 = var7 * var10 >> 15;
        this.field1342 = var7 * var12 >> 15;
        this.field1344 = var7 * var11 >> 15;
        this.field1340 = -var8;
        this.field1348 = -var10 * var11 + var9 * var14 >> 15;
        this.field1341 = var9 * var13 + var10 * var12 >> 15;
        this.field1339 = var7 * var9 >> 15;
        this.field1347 = -arg0 * this.field1346 - this.field1342 * arg1 - this.field1348 * arg2 >> 15;
        this.field1343 = -arg0 * this.field1337 - this.field1344 * arg1 - this.field1341 * arg2 >> 15;
        this.field1338 = -arg0 * this.field1345 - this.field1340 * arg1 - this.field1339 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
    public final void method695(int arg0) {
        int var2 = class133.field1908[arg0 & 0x3FFF];
        int var3 = class133.field1913[arg0 & 0x3FFF];
        int var4 = this.field1337;
        int var5 = this.field1344;
        int var6 = this.field1341;
        int var7 = this.field1343;
        this.field1337 = var2 * var4 - this.field1345 * var3 >> 15;
        this.field1345 = this.field1345 * var2 + var3 * var4 >> 15;
        this.field1344 = var2 * var5 - this.field1340 * var3 >> 15;
        this.field1340 = this.field1340 * var2 + var3 * var5 >> 15;
        this.field1341 = var2 * var6 - this.field1339 * var3 >> 15;
        this.field1339 = this.field1339 * var2 + var3 * var6 >> 15;
        this.field1343 = var2 * var7 - this.field1338 * var3 >> 15;
        this.field1338 = this.field1338 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V")
    public final void method696(int arg0, int arg1, int arg2) {
        this.field1347 += arg0;
        this.field1343 += arg1;
        this.field1338 += arg2;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "()Lei;")
    public final class96 method697() {
        class96 var1 = new class96();
        var1.field1346 = this.field1346;
        var1.field1342 = this.field1342;
        var1.field1348 = this.field1348;
        var1.field1347 = this.field1347;
        var1.field1337 = this.field1337;
        var1.field1344 = this.field1344;
        var1.field1341 = this.field1341;
        var1.field1343 = this.field1343;
        var1.field1345 = this.field1345;
        var1.field1340 = this.field1340;
        var1.field1339 = this.field1339;
        var1.field1338 = this.field1338;
        return var1;
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
    public final void method698(int arg0) {
        this.field1344 = 32768;
        this.field1346 = this.field1339 = class133.field1908[arg0 & 0x3FFF];
        this.field1348 = class133.field1913[arg0 & 0x3FFF];
        this.field1345 = -this.field1348;
        this.field1342 = this.field1347 = this.field1337 = this.field1341 = this.field1343 = this.field1340 = this.field1338 = 0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lic;)V")
    public final void method699(class417 arg0) {
        class96 var2 = (class96) arg0;
        this.field1346 = var2.field1346;
        this.field1342 = var2.field1342;
        this.field1348 = var2.field1348;
        this.field1347 = var2.field1347;
        this.field1337 = var2.field1337;
        this.field1344 = var2.field1344;
        this.field1341 = var2.field1341;
        this.field1343 = var2.field1343;
        this.field1345 = var2.field1345;
        this.field1340 = var2.field1340;
        this.field1339 = var2.field1339;
        this.field1338 = var2.field1338;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
    public final void method700(int arg0) {
        this.field1339 = 32768;
        this.field1346 = this.field1344 = class133.field1908[arg0 & 0x3FFF];
        this.field1337 = class133.field1913[arg0 & 0x3FFF];
        this.field1342 = -this.field1337;
        this.field1348 = this.field1347 = this.field1341 = this.field1343 = this.field1345 = this.field1340 = this.field1338 = 0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public final void method701(int arg0) {
        this.field1346 = 32768;
        this.field1344 = this.field1339 = class133.field1908[arg0 & 0x3FFF];
        this.field1340 = class133.field1913[arg0 & 0x3FFF];
        this.field1341 = -this.field1340;
        this.field1342 = this.field1348 = this.field1347 = this.field1337 = this.field1343 = this.field1345 = this.field1338 = 0;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(III)V")
    public final void method702(int arg0, int arg1, int arg2) {
        this.field1337 = this.field1345 = this.field1342 = this.field1340 = this.field1348 = this.field1341 = 0;
        this.field1346 = this.field1344 = this.field1339 = 32768;
        this.field1347 = arg0;
        this.field1343 = arg1;
        this.field1338 = arg2;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([I)V")
    public final void method703(int[] arg0) {
        int var2 = arg0[0] - this.field1347;
        int var3 = arg0[1] - this.field1343;
        int var4 = arg0[2] - this.field1338;
        arg0[0] = this.field1345 * var4 + this.field1346 * var2 + this.field1337 * var3 >> 15;
        arg0[1] = this.field1340 * var4 + this.field1344 * var3 + this.field1342 * var2 >> 15;
        arg0[2] = this.field1339 * var4 + this.field1348 * var2 + this.field1341 * var3 >> 15;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    public final void method704(int arg0) {
        int var2 = class133.field1908[arg0 & 0x3FFF];
        int var3 = class133.field1913[arg0 & 0x3FFF];
        int var4 = this.field1346;
        int var5 = this.field1342;
        int var6 = this.field1348;
        int var7 = this.field1347;
        this.field1346 = this.field1345 * var3 + var2 * var4 >> 15;
        this.field1345 = this.field1345 * var2 - var3 * var4 >> 15;
        this.field1342 = this.field1340 * var3 + var2 * var5 >> 15;
        this.field1340 = this.field1340 * var2 - var3 * var5 >> 15;
        this.field1348 = this.field1339 * var3 + var2 * var6 >> 15;
        this.field1339 = this.field1339 * var2 - var3 * var6 >> 15;
        this.field1347 = this.field1338 * var3 + var2 * var7 >> 15;
        this.field1338 = this.field1338 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class96() {
        this.method693();
    }
}
