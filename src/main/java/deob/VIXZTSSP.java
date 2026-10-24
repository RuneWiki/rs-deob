package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("VIXZTSSP")
public final class VIXZTSSP extends Frame {

	@ObfuscatedName("VIXZTSSP.b")
	public IVVPRVRY field1424;

	public VIXZTSSP(IVVPRVRY arg0, int arg1, int arg2) {
		field1424 = arg0;
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
		field1424.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field1424.paint(arg0);
	}
}
