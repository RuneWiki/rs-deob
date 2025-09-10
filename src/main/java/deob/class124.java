package deob;

@ObfuscatedName("ei")
public class class124 extends class501 {

	@ObfuscatedName("ei.af")
	public final boolean field1568;

	public class124(boolean arg0) {
		this.field1568 = arg0;
	}

	@ObfuscatedName("ei.af(Lty;Lty;B)I")
	public int method3402(class504 arg0, class504 arg1) {
		if (client.field326 == arg0.field5412) {
			if (client.field326 != arg1.field5412) {
				return this.field1568 ? -1 : 1;
			}
		} else if (client.field326 == arg1.field5412) {
			return this.field1568 ? 1 : -1;
		}
		return this.method9255(arg0, arg1);
	}

	public int compare(Object arg0, Object arg1) {
		return this.method3402((class504) arg0, (class504) arg1);
	}
}
