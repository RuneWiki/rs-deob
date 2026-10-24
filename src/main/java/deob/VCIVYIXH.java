package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("VCIVYIXH")
public final class VCIVYIXH extends Frame {

	@ObfuscatedName("VCIVYIXH.b")
	public BFZNZUKL field1350;

	public VCIVYIXH(int arg0, BFZNZUKL arg1, int arg2) {
		field1350 = arg1;
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
		field1350.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field1350.paint(arg0);
	}
}
