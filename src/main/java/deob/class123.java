package deob;

import java.util.Comparator;

@ObfuscatedName("ej")
public class class123 implements Comparator {

	@ObfuscatedName("ej.af")
	public final boolean field1564;

	public class123(boolean arg0) {
		this.field1564 = arg0;
	}

	@ObfuscatedName("ej.af(Lty;Lty;S)I")
	public int method3394(class504 arg0, class504 arg1) {
		return this.field1564 ? arg0.field5411 - arg1.field5411 : arg1.field5411 - arg0.field5411;
	}

	public int compare(Object arg0, Object arg1) {
		return this.method3394((class504) arg0, (class504) arg1);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}
