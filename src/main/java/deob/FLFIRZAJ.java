package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("FLFIRZAJ")
public final class FLFIRZAJ extends Frame {

	@ObfuscatedName("FLFIRZAJ.b")
	public CMOCHGYM field618;

	public FLFIRZAJ(CMOCHGYM arg0, int arg1, int arg2) {
		field618 = arg0;
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
		field618.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field618.paint(arg0);
	}
}
