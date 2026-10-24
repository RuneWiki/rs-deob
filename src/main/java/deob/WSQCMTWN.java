package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("WSQCMTWN")
public final class WSQCMTWN extends Frame {

	@ObfuscatedName("WSQCMTWN.a")
	public VTYHSWDE field1455;

	public WSQCMTWN(int arg0, VTYHSWDE arg1, int arg2) {
		field1455 = arg1;
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
		field1455.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field1455.paint(arg0);
	}
}
