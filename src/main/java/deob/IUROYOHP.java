package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("IUROYOHP")
public final class IUROYOHP extends Frame {

	@ObfuscatedName("IUROYOHP.a")
	public EUDZGBGU field810;

	public IUROYOHP(int arg0, int arg1, EUDZGBGU arg2) {
		field810 = arg2;
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
		field810.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field810.paint(arg0);
	}
}
