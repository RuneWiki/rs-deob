package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("FRBOSPAH")
public final class FRBOSPAH extends Frame {

	@ObfuscatedName("FRBOSPAH.b")
	public PKBEYUWN field568;

	public FRBOSPAH(int arg0, int arg1, PKBEYUWN arg2) {
		field568 = arg2;
		setTitle("Jagex");
		setResizable(false);
		show();
		toFront();
		resize(arg0 + 8, arg1 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		field568.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field568.paint(arg0);
	}
}
