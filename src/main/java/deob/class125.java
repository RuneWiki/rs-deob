package deob;

@ObfuscatedName("ee")
public class class125 extends class501 {

	@ObfuscatedName("ee.af")
	public final boolean field1571;

	public class125(boolean arg0) {
		this.field1571 = arg0;
	}

	@ObfuscatedName("ee.af(Lty;Lty;I)I")
	public int method3413(class504 arg0, class504 arg1) {
		if (arg0.field5412 == 0 || arg1.field5412 == 0) {
			return this.method9255(arg0, arg1);
		} else if (this.field1571) {
			return arg0.field5411 - arg1.field5411;
		} else {
			return arg1.field5411 - arg0.field5411;
		}
	}

	public int compare(Object arg0, Object arg1) {
		return this.method3413((class504) arg0, (class504) arg1);
	}
}
