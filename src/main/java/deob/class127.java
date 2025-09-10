package deob;

@ObfuscatedName("em")
public class class127 extends class501 {

	@ObfuscatedName("em.af")
	public final boolean field1576;

	public class127(boolean arg0) {
		this.field1576 = arg0;
	}

	@ObfuscatedName("em.af(Lty;Lty;I)I")
	public int method3427(class504 arg0, class504 arg1) {
		if (arg0.field5412 == arg1.field5412) {
			return this.method9255(arg0, arg1);
		} else if (this.field1576) {
			return arg0.field5412 - arg1.field5412;
		} else {
			return arg1.field5412 - arg0.field5412;
		}
	}

	public int compare(Object arg0, Object arg1) {
		return this.method3427((class504) arg0, (class504) arg1);
	}
}
