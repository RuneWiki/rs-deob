package deob;

@ObfuscatedName("eq")
public class class104 extends class177 {

    @ObfuscatedName("eq.o")
    public class169 field1437 = new class169();

    @ObfuscatedName("eq.j")
    public class87 field1439;

    @ObfuscatedName("eq.p")
    public class13 field1442 = new class13();

    @ObfuscatedName("eq.k()Lam;")
    public class177 method1218() {
        class83 var1 = (class83) this.field1442.method253();
        if (var1 == null) {
            return null;
        } else if (var1.field963 == null) {
            return this.method1289();
        } else {
            return var1.field963;
        }
    }

    @ObfuscatedName("eq.d()I")
    public int method1220() {
        return 0;
    }

    @ObfuscatedName("eq.a([III)V")
    public void method1274(int[] arg0, int arg1, int arg2) {
        this.field1437.method1274(arg0, arg1, arg2);
        for (class83 var4 = (class83) this.field1442.method253(); var4 != null; var4 = (class83) this.field1442.method255()) {
            if (!this.field1439.method1223(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field947) {
                        this.method1537(var4, arg0, var5, var6, var5 + var6);
                        var4.field947 -= var6;
                        break;
                    }
                    this.method1537(var4, arg0, var5, var4.field947, var5 + var6);
                    var5 += var4.field947;
                    var6 -= var4.field947;
                } while (!this.field1439.method1269(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("eq.aa(I)V")
    public void method1221(int arg0) {
        this.field1437.method1221(arg0);
        for (class83 var2 = (class83) this.field1442.method253(); var2 != null; var2 = (class83) this.field1442.method255()) {
            if (!this.field1439.method1223(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field947) {
                        this.method1536(var2, var3);
                        var2.field947 -= var3;
                        break;
                    }
                    this.method1536(var2, var2.field947);
                    var3 -= var2.field947;
                } while (!this.field1439.method1269(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("eq.p(Lef;II)V")
    public void method1536(class83 arg0, int arg1) {
        if ((this.field1439.field1018[arg0.field943] & 0x4) != 0 && arg0.field956 < 0) {
            int var3 = this.field1439.field1032[arg0.field943] / Statics.field2851;
            int var4 = (var3 + 1048575 - arg0.field962) / var3;
            arg0.field962 = arg0.field962 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field1439.field1010[arg0.field943] == 0) {
                    arg0.field963 = class160.method2899(arg0.field950, arg0.field963.method3032(), arg0.field963.method2917(), arg0.field963.method2905());
                } else {
                    arg0.field963 = class160.method2899(arg0.field950, arg0.field963.method3032(), 0, arg0.field963.method2905());
                    this.field1439.method1202(arg0, arg0.field961.field572[arg0.field945] < 0);
                }
                if (arg0.field961.field572[arg0.field945] < 0) {
                    arg0.field963.method2901(-1);
                }
                arg1 = arg0.field962 / var3;
            }
        }
        arg0.field963.method1221(arg1);
    }

    @ObfuscatedName("eq.j(Lef;[IIIII)V")
    public void method1537(class83 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field1439.field1018[arg0.field943] & 0x4) != 0 && arg0.field956 < 0) {
            int var6 = this.field1439.field1032[arg0.field943] / Statics.field2851;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field962) / var6;
                if (var7 > arg3) {
                    arg0.field962 += arg3 * var6;
                    break;
                }
                arg0.field963.method1274(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field962 += var6 * var7 - 1048576;
                int var8 = Statics.field2851 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class160 var10 = arg0.field963;
                if (this.field1439.field1010[arg0.field943] == 0) {
                    arg0.field963 = class160.method2899(arg0.field950, var10.method3032(), var10.method2917(), var10.method2905());
                } else {
                    arg0.field963 = class160.method2899(arg0.field950, var10.method3032(), 0, var10.method2905());
                    this.field1439.method1202(arg0, arg0.field961.field572[arg0.field945] < 0);
                    arg0.field963.method2943(var8, var10.method2917());
                }
                if (arg0.field961.field572[arg0.field945] < 0) {
                    arg0.field963.method2901(-1);
                }
                var10.method2911(var8);
                var10.method1274(arg1, arg2, arg4 - arg2);
                if (var10.method2915()) {
                    this.field1437.method3240(var10);
                }
            }
        }
        arg0.field963.method1274(arg1, arg2, arg3);
    }

    public class104(class87 arg0) {
        this.field1439 = arg0;
    }

    @ObfuscatedName("eq.q()Lam;")
    public class177 method1289() {
        class83 var1;
        do {
            var1 = (class83) this.field1442.method255();
            if (var1 == null) {
                return null;
            }
        } while (var1.field963 == null);
        return var1.field963;
    }
}
