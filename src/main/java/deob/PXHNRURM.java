package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("PXHNRURM")
public final class PXHNRURM extends Frame {

	@ObfuscatedName("PXHNRURM.b")
	public EOQQYERM field967;

	public PXHNRURM(int arg0, int arg1, EOQQYERM arg2) {
		field967 = arg2;
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
		field967.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field967.paint(arg0);
	}
}
