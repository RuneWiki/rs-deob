package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("LQFUVOUC")
public final class LQFUVOUC extends Frame {

	@ObfuscatedName("LQFUVOUC.b")
	public UNXTKTRJ field890;

	public LQFUVOUC(int arg0, int arg1, UNXTKTRJ arg2) {
		field890 = arg2;
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
		field890.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field890.paint(arg0);
	}
}
