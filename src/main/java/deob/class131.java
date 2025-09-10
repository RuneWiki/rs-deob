package deob;

@ObfuscatedName("fv")
public class class131 extends class501 {

	@ObfuscatedName("fv.af")
	public final boolean field1594;

	public class131(boolean arg0) {
		this.field1594 = arg0;
	}

	@ObfuscatedName("fv.af(Lty;Lty;I)I")
	public int method3454(class504 arg0, class504 arg1) {
		if (arg0.field5412 == 0 || arg1.field5412 == 0) {
			return this.method9255(arg0, arg1);
		} else if (this.field1594) {
			return arg0.method9244().method11025(arg1.method9244());
		} else {
			return arg1.method9244().method11025(arg0.method9244());
		}
	}

	public int compare(Object arg0, Object arg1) {
		return this.method3454((class504) arg0, (class504) arg1);
	}
}
