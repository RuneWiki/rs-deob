package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("CYMTUWTR")
public final class CYMTUWTR extends Frame {

	@ObfuscatedName("CYMTUWTR.a")
	public GYSHSTYO field490;

	public CYMTUWTR(int arg0, int arg1, GYSHSTYO arg2) {
		field490 = arg2;
		setTitle("Jagex");
		setResizable(false);
		show();
		toFront();
		resize(arg0 + 8, arg1 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		field490.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field490.paint(arg0);
	}
}
