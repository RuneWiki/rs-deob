package deob;

@ObfuscatedName("ex")
public class class126 extends class501 {

	@ObfuscatedName("ex.af")
	public final boolean field1573;

	public class126(boolean arg0) {
		this.field1573 = arg0;
	}

	@ObfuscatedName("ex.af(Lty;Lty;I)I")
	public int method3417(class504 arg0, class504 arg1) {
		if (arg0.field5412 == 0) {
			if (arg1.field5412 != 0) {
				return this.field1573 ? 1 : -1;
			}
		} else if (arg1.field5412 == 0) {
			return this.field1573 ? -1 : 1;
		}
		return this.method9255(arg0, arg1);
	}

	public int compare(Object arg0, Object arg1) {
		return this.method3417((class504) arg0, (class504) arg1);
	}
}
