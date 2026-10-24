package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("SGXZRDZF")
public final class SGXZRDZF extends Frame {

	@ObfuscatedName("SGXZRDZF.b")
	public MKNKYTZT field1209;

	public SGXZRDZF(MKNKYTZT arg0, int arg1, int arg2) {
		field1209 = arg0;
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
		field1209.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field1209.paint(arg0);
	}
}
