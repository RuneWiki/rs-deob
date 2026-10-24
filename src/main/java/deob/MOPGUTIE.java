package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("MOPGUTIE")
public final class MOPGUTIE extends Frame {

	@ObfuscatedName("MOPGUTIE.a")
	public BTXFPMEV field894;

	public MOPGUTIE(BTXFPMEV arg0, int arg1, int arg2) {
		field894 = arg0;
		setTitle("Jagex");
		setResizable(false);
		show();
		toFront();
		resize(arg2 + 8, arg1 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		field894.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field894.paint(arg0);
	}
}
