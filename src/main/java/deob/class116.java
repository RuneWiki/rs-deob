package deob;

@ObfuscatedName("ed")
public class class116 {

	@ObfuscatedName("ed.af")
	public int field1514 = 0;

	@ObfuscatedName("ed.aw")
	public int field1520 = 0;

	@ObfuscatedName("ed.at")
	public byte[] field1516 = null;

	@ObfuscatedName("ed.af(II)I")
	public int method3332(int arg0) {
		int var2 = 0;
		int var3 = 0;
		while (arg0 >= 8 - this.field1520) {
			int var4 = 8 - this.field1520;
			int var5 = (0x1 << var4) - 1;
			var2 += (this.field1516[this.field1514] >> this.field1520 & var5) << var3;
			this.field1520 = 0;
			this.field1514++;
			var3 += var4;
			arg0 -= var4;
		}
		if (arg0 > 0) {
			int var6 = (0x1 << arg0) - 1;
			var2 += (this.field1516[this.field1514] >> this.field1520 & var6) << var3;
			this.field1520 += arg0;
		}
		return var2;
	}

	@ObfuscatedName("ed.aw(I)I")
	public int method3330() {
		int var1 = this.field1516[this.field1514] >> this.field1520 & 0x1;
		this.field1520++;
		this.field1514 += this.field1520 >> 3;
		this.field1520 &= 0x7;
		return var1;
	}

	@ObfuscatedName("ed.at([BII)V")
	public void method3327(byte[] arg0, int arg1) {
		this.field1516 = arg0;
		this.field1514 = arg1;
		this.field1520 = 0;
	}
}
