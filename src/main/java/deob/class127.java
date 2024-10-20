package deob;

@ObfuscatedName("dx")
public class class127 extends class107 {

    @ObfuscatedName("dx.o")
    public static class104 field1624 = new class104(32);

    @ObfuscatedName("dx.c")
    public int[] field1623 = new int[] { -1 };

    @ObfuscatedName("dx.h")
    public int[] field1625 = new int[] { 0 };

    @ObfuscatedName("bg.r(IIS)I")
    public static int method717(int arg0, int arg1) {
        class127 var2 = (class127) field1624.method1290((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1623.length) {
            return var2.field1623[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bg.d(III)I")
    public static int method718(int arg0, int arg1) {
        class127 var2 = (class127) field1624.method1290((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1625.length) {
            return var2.field1625[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bm.v(I)V")
    public static void method885() {
        field1624 = new class104(32);
    }
}
