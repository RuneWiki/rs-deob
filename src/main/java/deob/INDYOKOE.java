package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("INDYOKOE")
public final class INDYOKOE extends Frame {

	@ObfuscatedName("INDYOKOE.c")
	public EPVRYXOV field660;

	public INDYOKOE(int arg0, EPVRYXOV arg1, int arg2) {
		field660 = arg1;
		setTitle("Jagex");
		setResizable(false);
		show();
		toFront();
		resize(arg2 + 8, arg0 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		field660.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field660.paint(arg0);
	}
}
