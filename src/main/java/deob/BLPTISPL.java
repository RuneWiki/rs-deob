package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("BLPTISPL")
public final class BLPTISPL extends Frame {

	@ObfuscatedName("BLPTISPL.b")
	public NCIKLCII field89;

	public BLPTISPL(int arg0, NCIKLCII arg1, int arg2) {
		field89 = arg1;
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
		field89.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field89.paint(arg0);
	}
}
