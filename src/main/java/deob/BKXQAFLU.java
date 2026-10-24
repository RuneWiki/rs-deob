package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("BKXQAFLU")
public final class BKXQAFLU extends Frame {

	@ObfuscatedName("BKXQAFLU.a")
	public ARNQXZCA field170;

	public BKXQAFLU(int arg0, int arg1, ARNQXZCA arg2) {
		field170 = arg2;
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
		field170.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field170.paint(arg0);
	}
}
