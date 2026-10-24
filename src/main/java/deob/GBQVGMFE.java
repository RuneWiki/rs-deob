package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("GBQVGMFE")
public final class GBQVGMFE extends Frame {

	@ObfuscatedName("GBQVGMFE.b")
	public QNTDRCTM field700;

	public GBQVGMFE(QNTDRCTM arg0, int arg1, int arg2) {
		field700 = arg0;
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
		field700.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field700.paint(arg0);
	}
}
