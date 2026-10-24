package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("BXWMHFQK")
public final class BXWMHFQK extends Frame {

	@ObfuscatedName("BXWMHFQK.a")
	public HJHAUOBE field94;

	public BXWMHFQK(int arg0, int arg1, HJHAUOBE arg2) {
		field94 = arg2;
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
		field94.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field94.paint(arg0);
	}
}
