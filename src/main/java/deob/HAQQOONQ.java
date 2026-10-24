package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("HAQQOONQ")
public final class HAQQOONQ extends Frame {

	@ObfuscatedName("HAQQOONQ.a")
	public KWRIFYWM field683;

	public HAQQOONQ(int arg0, KWRIFYWM arg1, int arg2) {
		field683 = arg1;
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
		field683.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field683.paint(arg0);
	}
}
