package deob;

@ObfuscatedName("et")
public class class128 extends class501 {

	@ObfuscatedName("et.af")
	public final boolean field1579;

	public class128(boolean arg0) {
		this.field1579 = arg0;
	}

	@ObfuscatedName("et.af(Lty;Lty;I)I")
	public int method3432(class504 arg0, class504 arg1) {
		if (client.field326 == arg0.field5412 && client.field326 == arg1.field5412) {
			return this.field1579 ? arg0.method9244().method11025(arg1.method9244()) : arg1.method9244().method11025(arg0.method9244());
		} else {
			return this.method9255(arg0, arg1);
		}
	}

	public int compare(Object arg0, Object arg1) {
		return this.method3432((class504) arg0, (class504) arg1);
	}
}
