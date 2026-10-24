package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("UUMODXDR")
public final class UUMODXDR extends Frame {

	@ObfuscatedName("UUMODXDR.a")
	public AMZQHNGA field1310;

	public UUMODXDR(int arg0, AMZQHNGA arg1, int arg2) {
		field1310 = arg1;
		setTitle("Jagex");
		setResizable(false);
		show();
		toFront();
		resize(arg0 + 8, arg2 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		field1310.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field1310.paint(arg0);
	}
}
