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

@ObfuscatedName("AHZQVBFX")
public class AHZQVBFX extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("AHZQVBFX.g")
	public int field64 = 20;

	@ObfuscatedName("AHZQVBFX.h")
	public int field65 = 1;

	@ObfuscatedName("AHZQVBFX.i")
	public long[] field66 = new long[10];

	@ObfuscatedName("AHZQVBFX.k")
	public boolean field68 = false;

	@ObfuscatedName("AHZQVBFX.p")
	public OGPNACTP[] field73 = new OGPNACTP[6];

	@ObfuscatedName("AHZQVBFX.r")
	public boolean field75 = true;

	@ObfuscatedName("AHZQVBFX.s")
	public boolean field76 = true;

	@ObfuscatedName("AHZQVBFX.F")
	public int[] field89 = new int[128];

	@ObfuscatedName("AHZQVBFX.G")
	public int[] field90 = new int[128];

	@ObfuscatedName("AHZQVBFX.f")
	public int field63;

	@ObfuscatedName("AHZQVBFX.j")
	public int field67;

	@ObfuscatedName("AHZQVBFX.l")
	public int field69;

	@ObfuscatedName("AHZQVBFX.m")
	public int field70;

	@ObfuscatedName("AHZQVBFX.t")
	public int field77;

	@ObfuscatedName("AHZQVBFX.u")
	public int field78;

	@ObfuscatedName("AHZQVBFX.v")
	public int field79;

	@ObfuscatedName("AHZQVBFX.w")
	public int field80;

	@ObfuscatedName("AHZQVBFX.x")
	public int field81;

	@ObfuscatedName("AHZQVBFX.y")
	public int field82;

	@ObfuscatedName("AHZQVBFX.z")
	public int field83;

	@ObfuscatedName("AHZQVBFX.B")
	public int field85;

	@ObfuscatedName("AHZQVBFX.C")
	public int field86;

	@ObfuscatedName("AHZQVBFX.D")
	public int field87;

	@ObfuscatedName("AHZQVBFX.H")
	public int field91;

	@ObfuscatedName("AHZQVBFX.I")
	public int field92;

	@ObfuscatedName("AHZQVBFX.A")
	public long field84;

	@ObfuscatedName("AHZQVBFX.E")
	public long field88;

	@ObfuscatedName("AHZQVBFX.q")
	public CVFADBZV field74;

	@ObfuscatedName("AHZQVBFX.o")
	public HGHKUVEK field72;

	@ObfuscatedName("AHZQVBFX.n")
	public Graphics field71;

	@ObfuscatedName("AHZQVBFX.a(III)V")
	public final void method14(int arg0, int arg1) {
		field69 = arg0;
		field70 = arg1;
		field74 = new CVFADBZV(this, field69, field70);
		field71 = method24().getGraphics();
		field72 = new HGHKUVEK(method24(), field69, field70);
		method25(this, 1);
	}

	@ObfuscatedName("AHZQVBFX.b(III)V")
	public final void method15(int arg0, int arg1) {
		field69 = arg1;
		field70 = arg0;
		field71 = method24().getGraphics();
		field72 = new HGHKUVEK(method24(), field69, field70);
		method25(this, 1);
	}

	public void run() {
		method24().addMouseListener(this);
		method24().addMouseMotionListener(this);
		method24().addKeyListener(this);
		method24().addFocusListener(this);

		if (field74 != null) {
			field74.addWindowListener(this);
		}

		method26(0, "Loading...");
		method19();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field66[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field63 < 0) {
					if (field63 == -1) {
						method16();
					}

					return;
				}

				if (field63 > 0) {
					field63--;
					if (field63 == 0) {
						method16();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field66[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field66[var1]) {
					var2 = (int) (field64 * 2560 / (var11 - field66[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field64 - (var11 - field66[var1]) / 10L);
				}

				if (var3 > field64) {
					var3 = field64;
				}

				field66[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field66[var13] != 0L) {
							field66[var13] += var3;
						}
					}
				}

				if (var3 < field65) {
					var3 = field65;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field85 = field81;
					field86 = field82;
					field87 = field83;
					field88 = field84;
					field81 = 0;
					method20();
					field91 = field92;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field64 > 0) {
					field67 = var2 * 1000 / (field64 * 256);
				}

				method22();
			} while (!field68);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field66[var15]);
			}

			System.out.println("fps:" + field67 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field64 + " mindel:" + field65);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field68 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("AHZQVBFX.a(I)V")
	public final void method16() {
		field63 = -2;
		method21();

		if (field74 != null) {
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

	@ObfuscatedName("AHZQVBFX.a(II)V")
	public final void method17(int arg0) {
		field64 = 1000 / arg0;
	}

	public final void start() {
		if (field63 >= 0) {
			field63 = 0;
		}
	}

	public final void stop() {
		if (field63 >= 0) {
			field63 = 4000 / field64;
		}
	}

	public final void destroy() {
		field63 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field63 == -1) {
			method16();
		}
	}

	public final void update(Graphics arg0) {
		if (field71 == null) {
			field71 = arg0;
		}

		field75 = true;
		method23();
	}

	public final void paint(Graphics arg0) {
		if (field71 == null) {
			field71 = arg0;
		}

		field75 = true;
		method23();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field74 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field77 = 0;
		field82 = var2;
		field83 = var3;
		field84 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field81 = 2;
			field78 = 2;
		} else {
			field81 = 1;
			field78 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field77 = 0;
		field78 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field77 = 0;
		field79 = -1;
		field80 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field74 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field77 = 0;
		field79 = var2;
		field80 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field74 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field77 = 0;
		field79 = var2;
		field80 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field77 = 0;
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
			field89[var3] = 1;
		}

		if (var3 > 4) {
			field90[field92] = var3;
			field92 = field92 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field77 = 0;
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
			field89[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("AHZQVBFX.b(I)I")
	public final int method18() {
		int var1 = -1;
		if (field92 != field91) {
			var1 = field90[field91];
			field91 = field91 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field76 = true;
		field75 = true;
		method23();
	}

	public final void focusLost(FocusEvent arg0) {
		field76 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field89[var2] = 0;
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

	@ObfuscatedName("AHZQVBFX.a()V")
	public void method19() {
	}

	@ObfuscatedName("AHZQVBFX.c(I)V")
	public void method20() {
	}

	@ObfuscatedName("AHZQVBFX.d(I)V")
	public void method21() {
	}

	@ObfuscatedName("AHZQVBFX.e(I)V")
	public void method22() {
	}

	@ObfuscatedName("AHZQVBFX.f(I)V")
	public void method23() {
	}

	@ObfuscatedName("AHZQVBFX.g(I)Ljava/awt/Component;")
	public Component method24() {
		if (field74 != null) {
			return field74;
		}

		return this;
	}

	@ObfuscatedName("AHZQVBFX.a(Ljava/lang/Runnable;I)V")
	public void method25(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("AHZQVBFX.a(ILjava/lang/String;I)V")
	public void method26(int arg0, String arg1) {
		while (field71 == null) {
			field71 = method24().getGraphics();

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

		if (field75) {
			field71.setColor(Color.black);
			field71.fillRect(0, 0, field69, field70);
			field75 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field70 / 2 - 18;
		field71.setColor(var6);
		field71.drawRect(field69 / 2 - 152, var7, 304, 34);
		field71.fillRect(field69 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field71.setColor(Color.black);
		field71.fillRect(arg0 * 3 + field69 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field71.setFont(var3);
		field71.setColor(Color.white);
		field71.drawString(arg1, (field69 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
