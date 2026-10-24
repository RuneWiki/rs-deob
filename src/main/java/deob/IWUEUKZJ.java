package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("IWUEUKZJ")
public final class IWUEUKZJ extends Frame {

	@ObfuscatedName("IWUEUKZJ.a")
	public RMDQJLZZ field682;

	public IWUEUKZJ(int arg0, RMDQJLZZ arg1, int arg2) {
		field682 = arg1;
		setTitle("Jagex");
		setResizable(false);
		show();
		toFront();
		resize(arg0 + 8, arg2 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		field682.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field682.paint(arg0);
	}
}
