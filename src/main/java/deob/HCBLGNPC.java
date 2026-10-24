package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("HCBLGNPC")
public final class HCBLGNPC extends Frame {

	@ObfuscatedName("HCBLGNPC.b")
	public XHFSQKPU field660;

	public HCBLGNPC(int arg0, int arg1, XHFSQKPU arg2) {
		field660 = arg2;
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
		field660.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field660.paint(arg0);
	}
}
