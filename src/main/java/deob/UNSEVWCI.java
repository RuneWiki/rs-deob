package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("UNSEVWCI")
public final class UNSEVWCI extends Frame {

	@ObfuscatedName("UNSEVWCI.b")
	public KISFBCOP field1305;

	public UNSEVWCI(KISFBCOP arg0, int arg1, int arg2) {
		field1305 = arg0;
		setTitle("Jagex");
		setResizable(false);
		show();
		toFront();
		resize(arg1 + 8, arg2 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		field1305.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field1305.paint(arg0);
	}
}
