package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("GDXGVBDZ")
public final class GDXGVBDZ extends Frame {

	@ObfuscatedName("GDXGVBDZ.c")
	public EBSHSFRY field830;

	public GDXGVBDZ(int arg0, int arg1, EBSHSFRY arg2) {
		field830 = arg2;
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
		field830.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field830.paint(arg0);
	}
}
