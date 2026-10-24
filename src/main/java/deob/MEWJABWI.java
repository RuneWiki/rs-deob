package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("MEWJABWI")
public final class MEWJABWI extends Frame {

	@ObfuscatedName("MEWJABWI.b")
	public LJUNUWBY field848;

	public MEWJABWI(int arg0, int arg1, LJUNUWBY arg2) {
		field848 = arg2;
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
		field848.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field848.paint(arg0);
	}
}
