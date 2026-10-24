package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("NYZFOQAO")
public final class NYZFOQAO extends Frame {

	@ObfuscatedName("NYZFOQAO.a")
	public FDVCDUHZ field1133;

	public NYZFOQAO(int arg0, int arg1, FDVCDUHZ arg2) {
		field1133 = arg2;
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
		field1133.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field1133.paint(arg0);
	}
}
