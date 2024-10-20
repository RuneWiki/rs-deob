package deob;

import java.io.IOException;

@ObfuscatedName("b")
public class class12 {

    @ObfuscatedName("b.g")
    public static int field188 = 2;

    @ObfuscatedName("b.h")
    public boolean field186;

    @ObfuscatedName("b.s")
    public boolean field187;

    public class12() {
        this.method125(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2030 == null) {
            this.method125(true);
        } else {
            int var2 = arg0.method2499();
            if (var2 >= 0 && var2 <= field188) {
                if (arg0.method2499() == 1) {
                    this.field186 = true;
                }
                if (var2 > 1) {
                    this.field187 = arg0.method2499() == 1;
                }
            } else {
                this.method125(true);
            }
        }
    }

    @ObfuscatedName("b.g(ZI)V")
    public void method125(boolean arg0) {
    }

    @ObfuscatedName("b.h(I)Ldw;")
    public class127 method122() {
        class127 var1 = new class127(100);
        var1.method2485(field188);
        var1.method2485(this.field186 ? 1 : 0);
        var1.method2485(this.field187 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("er.s(I)Lb;")
    public static class12 method2783() {
        class29 var0 = null;
        class12 var1 = new class12();
        try {
            var0 = class82.method545("", Statics.field487.field2086, false);
            byte[] var2 = new byte[(int) var0.method558()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method555(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class12(new class127(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method574();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("fq.o(B)V")
    public static void method3258() {
        class29 var0 = null;
        try {
            var0 = class82.method545("", Statics.field487.field2086, true);
            class127 var1 = Statics.field78.method122();
            var0.method552(var1.field2030, 0, var1.field2027);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method574();
            }
        } catch (Exception var4) {
        }
    }
}
