package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("JWHKCZBF")
public final class JWHKCZBF extends Frame {

	@ObfuscatedName("JWHKCZBF.b")
	public GRXJFORE field804;

	public JWHKCZBF(GRXJFORE arg0, int arg1, int arg2) {
		field804 = arg0;
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
		field804.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field804.paint(arg0);
	}
}
