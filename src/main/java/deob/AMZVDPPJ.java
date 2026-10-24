package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("AMZVDPPJ")
public final class AMZVDPPJ extends Frame {

	@ObfuscatedName("AMZVDPPJ.b")
	public AMTYETOI field31;

	public AMZVDPPJ(AMTYETOI arg0, int arg1, int arg2) {
		field31 = arg0;
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
		field31.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field31.paint(arg0);
	}
}
