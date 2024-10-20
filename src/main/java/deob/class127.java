package deob;

@ObfuscatedName("dk")
public class class127 extends class207 {

    @ObfuscatedName("dk.c")
    public int field1777;

    @ObfuscatedName("dk.q")
    public int field1776;

    @ObfuscatedName("dk.m")
    public int[] field1781;

    @ObfuscatedName("dk.j")
    public int[][] field1778;

    public class127(int arg0, byte[] arg1) {
        this.field1777 = arg0;
        class185 var3 = new class185(arg1);
        this.field1776 = var3.method3243();
        this.field1781 = new int[this.field1776];
        this.field1778 = new int[this.field1776][];
        for (int var4 = 0; var4 < this.field1776; var4++) {
            this.field1781[var4] = var3.method3243();
        }
        for (int var5 = 0; var5 < this.field1776; var5++) {
            this.field1778[var5] = new int[var3.method3243()];
        }
        for (int var6 = 0; var6 < this.field1776; var6++) {
            for (int var7 = 0; var7 < this.field1778[var6].length; var7++) {
                this.field1778[var6][var7] = var3.method3243();
            }
        }
    }
}
