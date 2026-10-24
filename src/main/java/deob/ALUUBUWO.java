package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("ALUUBUWO")
public final class ALUUBUWO extends Frame {

	@ObfuscatedName("ALUUBUWO.a")
	public AUOBNYCU field11;

	public ALUUBUWO(int arg0, AUOBNYCU arg1, int arg2) {
		field11 = arg1;
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
		field11.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field11.paint(arg0);
	}
}
