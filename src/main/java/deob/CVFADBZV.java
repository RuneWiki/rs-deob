package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("CVFADBZV")
public final class CVFADBZV extends Frame {

	@ObfuscatedName("CVFADBZV.b")
	public AHZQVBFX field651;

	public CVFADBZV(AHZQVBFX arg0, int arg1, int arg2) {
		field651 = arg0;
		setTitle("Jagex");
		setResizable(false);
		show();
		toFront();
		resize(arg1 + 8, arg2 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		field651.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field651.paint(arg0);
	}
}
