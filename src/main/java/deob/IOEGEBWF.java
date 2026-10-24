package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("IOEGEBWF")
public final class IOEGEBWF extends Frame {

	@ObfuscatedName("IOEGEBWF.b")
	public DZXWUJSL field850;

	public IOEGEBWF(int arg0, int arg1, DZXWUJSL arg2) {
		field850 = arg2;
		setTitle("Jagex");
		setResizable(false);
		show();
		toFront();
		resize(arg1 + 8, arg0 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		field850.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field850.paint(arg0);
	}
}
