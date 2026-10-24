package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("ZQDWDFIV")
public final class ZQDWDFIV extends Frame {

	@ObfuscatedName("ZQDWDFIV.a")
	public UBLCAEEN field1499;

	public ZQDWDFIV(int arg0, int arg1, UBLCAEEN arg2) {
		field1499 = arg2;
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
		field1499.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field1499.paint(arg0);
	}
}
