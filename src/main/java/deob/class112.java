package deob;

@ObfuscatedName("bx")
public class class112 extends class185 {

    @ObfuscatedName("bx.o")
    public byte[] field1779;

    @ObfuscatedName("bx.h")
    public int field1781;

    @ObfuscatedName("bx.t")
    public int field1778;

    @ObfuscatedName("bx.r")
    public boolean field1780;

    @ObfuscatedName("bx.p")
    public int field1782;

    @ObfuscatedName("bx.j(Lbm;)Lbx;")
    public class112 method1932(class124 arg0) {
        this.field1779 = arg0.method2104(this.field1779);
        this.field1782 = arg0.method2101(this.field1782);
        if (this.field1781 == this.field1778) {
            this.field1778 = this.field1781 = arg0.method2103(this.field1778);
        } else {
            this.field1778 = arg0.method2103(this.field1778);
            this.field1781 = arg0.method2103(this.field1781);
            if (this.field1781 == this.field1778) {
                this.field1778--;
            }
        }
        return this;
    }

    public class112(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1782 = arg0;
        this.field1779 = arg1;
        this.field1778 = arg2;
        this.field1781 = arg3;
        this.field1780 = arg4;
    }

    public class112(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1782 = arg0;
        this.field1779 = arg1;
        this.field1778 = arg2;
        this.field1781 = arg3;
    }
}
