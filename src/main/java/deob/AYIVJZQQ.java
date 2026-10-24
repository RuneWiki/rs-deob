package deob;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@ObfuscatedName("AYIVJZQQ")
public class AYIVJZQQ extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("AYIVJZQQ.g")
	public int field53 = 20;

	@ObfuscatedName("AYIVJZQQ.h")
	public int field54 = 1;

	@ObfuscatedName("AYIVJZQQ.i")
	public long[] field55 = new long[10];

	@ObfuscatedName("AYIVJZQQ.k")
	public boolean field57 = false;

	@ObfuscatedName("AYIVJZQQ.p")
	public INVDQNJU[] field62 = new INVDQNJU[6];

	@ObfuscatedName("AYIVJZQQ.r")
	public boolean field64 = true;

	@ObfuscatedName("AYIVJZQQ.s")
	public boolean field65 = true;

	@ObfuscatedName("AYIVJZQQ.F")
	public int[] field78 = new int[128];

	@ObfuscatedName("AYIVJZQQ.G")
	public int[] field79 = new int[128];

	@ObfuscatedName("AYIVJZQQ.f")
	public int field52;

	@ObfuscatedName("AYIVJZQQ.j")
	public int field56;

	@ObfuscatedName("AYIVJZQQ.l")
	public int field58;

	@ObfuscatedName("AYIVJZQQ.m")
	public int field59;

	@ObfuscatedName("AYIVJZQQ.t")
	public int field66;

	@ObfuscatedName("AYIVJZQQ.u")
	public int field67;

	@ObfuscatedName("AYIVJZQQ.v")
	public int field68;

	@ObfuscatedName("AYIVJZQQ.w")
	public int field69;

	@ObfuscatedName("AYIVJZQQ.x")
	public int field70;

	@ObfuscatedName("AYIVJZQQ.y")
	public int field71;

	@ObfuscatedName("AYIVJZQQ.z")
	public int field72;

	@ObfuscatedName("AYIVJZQQ.B")
	public int field74;

	@ObfuscatedName("AYIVJZQQ.C")
	public int field75;

	@ObfuscatedName("AYIVJZQQ.D")
	public int field76;

	@ObfuscatedName("AYIVJZQQ.H")
	public int field80;

	@ObfuscatedName("AYIVJZQQ.I")
	public int field81;

	@ObfuscatedName("AYIVJZQQ.A")
	public long field73;

	@ObfuscatedName("AYIVJZQQ.E")
	public long field77;

	@ObfuscatedName("AYIVJZQQ.o")
	public NUXCAHZM field61;

	@ObfuscatedName("AYIVJZQQ.q")
	public YVSOOFAD field63;

	@ObfuscatedName("AYIVJZQQ.n")
	public Graphics field60;

	@ObfuscatedName("AYIVJZQQ.a(III)V")
	public final void method14(int arg0, int arg1) {
		field58 = arg1;
		field59 = arg0;
		field63 = new YVSOOFAD(field59, field58, this);
		field60 = method24().getGraphics();
		field61 = new NUXCAHZM(field59, field58, method24());
		method25(this, 1);
	}

	@ObfuscatedName("AYIVJZQQ.a(IBI)V")
	public final void method15(int arg0, int arg1) {
		field58 = arg0;
		field59 = arg1;
		field60 = method24().getGraphics();
		field61 = new NUXCAHZM(field59, field58, method24());
		method25(this, 1);
	}

	public void run() {
		method24().addMouseListener(this);
		method24().addMouseMotionListener(this);
		method24().addKeyListener(this);
		method24().addFocusListener(this);

		if (field63 != null) {
			field63.addWindowListener(this);
		}

		method26(0, "Loading...");
		method19();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field55[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field52 < 0) {
					if (field52 == -1) {
						method16();
					}

					return;
				}

				if (field52 > 0) {
					field52--;
					if (field52 == 0) {
						method16();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field55[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field55[var1]) {
					var2 = (int) (field53 * 2560 / (var11 - field55[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field53 - (var11 - field55[var1]) / 10L);
				}

				if (var3 > field53) {
					var3 = field53;
				}

				field55[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field55[var13] != 0L) {
							field55[var13] += var3;
						}
					}
				}

				if (var3 < field54) {
					var3 = field54;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field74 = field70;
					field75 = field71;
					field76 = field72;
					field77 = field73;
					field70 = 0;
					method20();
					field80 = field81;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field53 > 0) {
					field56 = var2 * 1000 / (field53 * 256);
				}

				method22();
			} while (!field57);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field55[var15]);
			}

			System.out.println("fps:" + field56 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field53 + " mindel:" + field54);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field57 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("AYIVJZQQ.a(B)V")
	public final void method16() {
		field52 = -2;
		method21();

		if (field63 != null) {
			try {
				Thread.sleep(1000L);
			} catch (Exception var2) {
			}

			try {
				System.exit(0);
			} catch (Throwable var1) {
			}
		}
	}

	@ObfuscatedName("AYIVJZQQ.a(IB)V")
	public final void method17(int arg0) {
		field53 = 1000 / arg0;
	}

	public final void start() {
		if (field52 >= 0) {
			field52 = 0;
		}
	}

	public final void stop() {
		if (field52 >= 0) {
			field52 = 4000 / field53;
		}
	}

	public final void destroy() {
		field52 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field52 == -1) {
			method16();
		}
	}

	public final void update(Graphics arg0) {
		if (field60 == null) {
			field60 = arg0;
		}

		field64 = true;
		method23();
	}

	public final void paint(Graphics arg0) {
		if (field60 == null) {
			field60 = arg0;
		}

		field64 = true;
		method23();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field63 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field66 = 0;
		field71 = var2;
		field72 = var3;
		field73 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field70 = 2;
			field67 = 2;
		} else {
			field70 = 1;
			field67 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field66 = 0;
		field67 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field66 = 0;
		field68 = -1;
		field69 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field63 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field66 = 0;
		field68 = var2;
		field69 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field63 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field66 = 0;
		field68 = var2;
		field69 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field66 = 0;
		int var2 = arg0.getKeyCode();
		int var3 = arg0.getKeyChar();
		if (var3 < 30) {
			var3 = 0;
		}

		if (var2 == 37) {
			var3 = 1;
		}

		if (var2 == 39) {
			var3 = 2;
		}

		if (var2 == 38) {
			var3 = 3;
		}

		if (var2 == 40) {
			var3 = 4;
		}

		if (var2 == 17) {
			var3 = 5;
		}

		if (var2 == 8) {
			var3 = 8;
		}

		if (var2 == 127) {
			var3 = 8;
		}

		if (var2 == 9) {
			var3 = 9;
		}

		if (var2 == 10) {
			var3 = 10;
		}

		if (var2 >= 112 && var2 <= 123) {
			var3 = var2 + 1008 - 112;
		}

		if (var2 == 36) {
			var3 = 1000;
		}

		if (var2 == 35) {
			var3 = 1001;
		}

		if (var2 == 33) {
			var3 = 1002;
		}

		if (var2 == 34) {
			var3 = 1003;
		}

		if (var3 > 0 && var3 < 128) {
			field78[var3] = 1;
		}

		if (var3 > 4) {
			field79[field81] = var3;
			field81 = field81 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field66 = 0;
		int var2 = arg0.getKeyCode();
		char var3 = arg0.getKeyChar();
		if (var3 < 30) {
			var3 = 0;
		}

		if (var2 == 37) {
			var3 = 1;
		}

		if (var2 == 39) {
			var3 = 2;
		}

		if (var2 == 38) {
			var3 = 3;
		}

		if (var2 == 40) {
			var3 = 4;
		}

		if (var2 == 17) {
			var3 = 5;
		}

		if (var2 == 8) {
			var3 = '\b';
		}

		if (var2 == 127) {
			var3 = '\b';
		}

		if (var2 == 9) {
			var3 = '\t';
		}

		if (var2 == 10) {
			var3 = '\n';
		}

		if (var3 > 0 && var3 < 128) {
			field78[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("AYIVJZQQ.a(Z)I")
	public final int method18() {
		int var1 = -1;
		if (field81 != field80) {
			var1 = field79[field80];
			field80 = field80 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field65 = true;
		field64 = true;
		method23();
	}

	public final void focusLost(FocusEvent arg0) {
		field65 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field78[var2] = 0;
		}
	}

	public final void windowActivated(WindowEvent arg0) {
	}

	public final void windowClosed(WindowEvent arg0) {
	}

	public final void windowClosing(WindowEvent arg0) {
		destroy();
	}

	public final void windowDeactivated(WindowEvent arg0) {
	}

	public final void windowDeiconified(WindowEvent arg0) {
	}

	public final void windowIconified(WindowEvent arg0) {
	}

	public final void windowOpened(WindowEvent arg0) {
	}

	@ObfuscatedName("AYIVJZQQ.a()V")
	public void method19() {
	}

	@ObfuscatedName("AYIVJZQQ.b(B)V")
	public void method20() {
	}

	@ObfuscatedName("AYIVJZQQ.a(I)V")
	public void method21() {
	}

	@ObfuscatedName("AYIVJZQQ.b(I)V")
	public void method22() {
	}

	@ObfuscatedName("AYIVJZQQ.c(I)V")
	public void method23() {
	}

	@ObfuscatedName("AYIVJZQQ.d(I)Ljava/awt/Component;")
	public Component method24() {
		if (field63 != null) {
			return field63;
		}

		return this;
	}

	@ObfuscatedName("AYIVJZQQ.a(Ljava/lang/Runnable;I)V")
	public void method25(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("AYIVJZQQ.a(BILjava/lang/String;)V")
	public void method26(int arg0, String arg1) {
		while (field60 == null) {
			field60 = method24().getGraphics();

			try {
				method24().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method24().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method24().getFontMetrics(var5);

		if (field64) {
			field60.setColor(Color.black);
			field60.fillRect(0, 0, field58, field59);
			field64 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field59 / 2 - 18;
		field60.setColor(var6);
		field60.drawRect(field58 / 2 - 152, var7, 304, 34);
		field60.fillRect(field58 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field60.setColor(Color.black);
		field60.fillRect(arg0 * 3 + field58 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field60.setFont(var3);
		field60.setColor(Color.white);
		field60.drawString(arg1, (field58 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
