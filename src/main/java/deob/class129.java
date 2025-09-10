package deob;

@ObfuscatedName("eh")
public class class129 extends class501 {

	@ObfuscatedName("eh.af")
	public final boolean field1583;

	public class129(boolean arg0) {
		this.field1583 = arg0;
	}

	@ObfuscatedName("eh.af(Lty;Lty;I)I")
	public int method3441(class504 arg0, class504 arg1) {
		if (client.field326 == arg0.field5412 && client.field326 == arg1.field5412) {
			return this.field1583 ? arg0.field5411 - arg1.field5411 : arg1.field5411 - arg0.field5411;
		} else {
			return this.method9255(arg0, arg1);
		}
	}

	public int compare(Object arg0, Object arg1) {
		return this.method3441((class504) arg0, (class504) arg1);
	}
}
