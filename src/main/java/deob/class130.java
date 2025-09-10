package deob;

@ObfuscatedName("ev")
public class class130 extends class501 {

	@ObfuscatedName("ev.af")
	public final boolean field1587;

	public class130(boolean arg0) {
		this.field1587 = arg0;
	}

	@ObfuscatedName("ev.af(Lty;Lty;I)I")
	public int method3449(class504 arg0, class504 arg1) {
		if (arg0.field5413 == arg1.field5413) {
			return this.method9255(arg0, arg1);
		} else if (this.field1587) {
			return arg0.field5413 - arg1.field5413;
		} else {
			return arg1.field5413 - arg0.field5413;
		}
	}

	public int compare(Object arg0, Object arg1) {
		return this.method3449((class504) arg0, (class504) arg1);
	}
}
