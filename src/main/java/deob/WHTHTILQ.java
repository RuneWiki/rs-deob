package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("WHTHTILQ")
public final class WHTHTILQ extends Frame {

	@ObfuscatedName("WHTHTILQ.b")
	public NZBGSSTU field1446;

	public WHTHTILQ(NZBGSSTU arg0, int arg1, int arg2) {
		field1446 = arg0;
		setTitle("Jagex");
		setResizable(false);
		show();
		toFront();
		resize(arg2 + 8, arg1 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		field1446.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field1446.paint(arg0);
	}
}
