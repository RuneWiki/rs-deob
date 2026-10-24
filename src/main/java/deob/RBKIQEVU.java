package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("RBKIQEVU")
public final class RBKIQEVU extends Frame {

	@ObfuscatedName("RBKIQEVU.a")
	public PXJVLLTT field1140;

	public RBKIQEVU(PXJVLLTT arg0, int arg1, int arg2) {
		field1140 = arg0;
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
		field1140.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field1140.paint(arg0);
	}
}
