package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("JYOWNEXJ")
public final class JYOWNEXJ extends Frame {

	@ObfuscatedName("JYOWNEXJ.a")
	public OFXQYNOM field811;

	public JYOWNEXJ(int arg0, OFXQYNOM arg1, int arg2) {
		field811 = arg1;
		setTitle("Jagex");
		setResizable(false);
		show();
		toFront();
		resize(arg0 + 8, arg2 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		field811.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field811.paint(arg0);
	}
}
