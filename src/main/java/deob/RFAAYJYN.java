package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("RFAAYJYN")
public final class RFAAYJYN extends Frame {

	@ObfuscatedName("RFAAYJYN.c")
	public DKKOWNCZ field1108;

	public RFAAYJYN(int arg0, int arg1, DKKOWNCZ arg2) {
		field1108 = arg2;
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
		field1108.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field1108.paint(arg0);
	}
}
