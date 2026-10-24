package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("DQQGYYJG")
public final class DQQGYYJG extends Frame {

	@ObfuscatedName("DQQGYYJG.b")
	public HXQNMAEJ field540;

	public DQQGYYJG(int arg0, int arg1, HXQNMAEJ arg2) {
		field540 = arg2;
		setTitle("Jagex");
		setResizable(false);
		show();
		toFront();
		resize(arg1 + 8, arg0 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		field540.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field540.paint(arg0);
	}
}
