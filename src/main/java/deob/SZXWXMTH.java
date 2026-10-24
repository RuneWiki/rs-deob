package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("SZXWXMTH")
public final class SZXWXMTH extends Frame {

	@ObfuscatedName("SZXWXMTH.b")
	public SXKUAOFD field1230;

	public SZXWXMTH(int arg0, int arg1, SXKUAOFD arg2) {
		field1230 = arg2;
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
		field1230.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field1230.paint(arg0);
	}
}
