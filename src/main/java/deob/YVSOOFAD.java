package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("YVSOOFAD")
public final class YVSOOFAD extends Frame {

	@ObfuscatedName("YVSOOFAD.b")
	public AYIVJZQQ field1460;

	public YVSOOFAD(int arg0, int arg1, AYIVJZQQ arg2) {
		field1460 = arg2;
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
		field1460.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field1460.paint(arg0);
	}
}
