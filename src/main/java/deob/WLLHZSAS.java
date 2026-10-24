package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("WLLHZSAS")
public final class WLLHZSAS extends Frame {

	@ObfuscatedName("WLLHZSAS.a")
	public OGVKVTJB field1403;

	public WLLHZSAS(OGVKVTJB arg0, int arg1, int arg2) {
		field1403 = arg0;
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
		field1403.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field1403.paint(arg0);
	}
}
