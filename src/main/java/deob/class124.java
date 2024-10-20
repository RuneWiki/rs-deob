package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("dt")
public class class124 extends class354 {

    @ObfuscatedName("dt.s")
    public boolean field1432;

    @ObfuscatedName("dt.t")
    public boolean field1435 = true;

    @ObfuscatedName("dt.v")
    public List field1436;

    @ObfuscatedName("dt.j")
    public int[] field1433;

    @ObfuscatedName("dt.l")
    public long field1434;

    @ObfuscatedName("dt.n")
    public String field1430 = null;

    @ObfuscatedName("dt.w")
    public byte field1431;

    @ObfuscatedName("dt.f")
    public byte field1437;

    static {
        new BitSet(65536);
    }

    public class124(class385 arg0) {
        this.method2248(arg0);
    }

    @ObfuscatedName("dt.s(B)[I")
    public int[] method2247() {
        if (this.field1433 == null) {
            String[] var1 = new String[this.field1436.size()];
            this.field1433 = new int[this.field1436.size()];
            int var2 = 0;
            while (var2 < this.field1436.size()) {
                var1[var2] = ((class106) this.field1436.get(var2)).field1303.method6521();
                this.field1433[var2] = var2++;
            }
            class380.method4586(var1, this.field1433);
        }
        return this.field1433;
    }

    @ObfuscatedName("dt.t(Ldf;I)V")
    public void method2253(class106 arg0) {
        this.field1436.add(arg0);
        this.field1433 = null;
    }

    @ObfuscatedName("dt.v(II)V")
    public void method2244(int arg0) {
        this.field1436.remove(arg0);
        this.field1433 = null;
    }

    @ObfuscatedName("dt.j(I)I")
    public int method2254() {
        return this.field1436.size();
    }

    @ObfuscatedName("dt.l(Ljava/lang/String;I)I")
    public int method2246(String arg0) {
        if (!this.field1435) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1436.size(); var2++) {
            if (((class106) this.field1436.get(var2)).field1303.method6520().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("dt.n(Lnv;I)V")
    public void method2248(class385 arg0) {
        int var2 = arg0.method5958();
        if ((var2 & 0x1) != 0) {
            this.field1432 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1435 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method5958();
        }
        this.field3966 = arg0.method5964();
        this.field1434 = arg0.method5964();
        this.field1430 = arg0.method5967();
        arg0.method6188();
        this.field1437 = arg0.method5959();
        this.field1431 = arg0.method5959();
        int var4 = arg0.method6053();
        if (var4 <= 0) {
            return;
        }
        this.field1436 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class106 var6 = new class106();
            if (this.field1432) {
                arg0.method5964();
            }
            if (this.field1435) {
                var6.field1303 = new class406(arg0.method5967());
            }
            var6.field1306 = arg0.method5959();
            var6.field1302 = arg0.method6053();
            if (var3 >= 3) {
                arg0.method6188();
            }
            this.field1436.add(var5, var6);
        }
    }
}
