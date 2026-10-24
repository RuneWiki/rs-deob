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

@ObfuscatedName("AUOBNYCU")
public class AUOBNYCU extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("AUOBNYCU.f")
	public int field68 = 20;

	@ObfuscatedName("AUOBNYCU.g")
	public int field69 = 1;

	@ObfuscatedName("AUOBNYCU.h")
	public long[] field70 = new long[10];

	@ObfuscatedName("AUOBNYCU.j")
	public boolean field72 = false;

	@ObfuscatedName("AUOBNYCU.o")
	public ODBDSPMH[] field77 = new ODBDSPMH[6];

	@ObfuscatedName("AUOBNYCU.q")
	public boolean field79 = true;

	@ObfuscatedName("AUOBNYCU.r")
	public boolean field80 = true;

	@ObfuscatedName("AUOBNYCU.E")
	public int[] field93 = new int[128];

	@ObfuscatedName("AUOBNYCU.F")
	public int[] field94 = new int[128];

	@ObfuscatedName("AUOBNYCU.e")
	public int field67;

	@ObfuscatedName("AUOBNYCU.i")
	public int field71;

	@ObfuscatedName("AUOBNYCU.k")
	public int field73;

	@ObfuscatedName("AUOBNYCU.l")
	public int field74;

	@ObfuscatedName("AUOBNYCU.s")
	public int field81;

	@ObfuscatedName("AUOBNYCU.t")
	public int field82;

	@ObfuscatedName("AUOBNYCU.u")
	public int field83;

	@ObfuscatedName("AUOBNYCU.v")
	public int field84;

	@ObfuscatedName("AUOBNYCU.w")
	public int field85;

	@ObfuscatedName("AUOBNYCU.x")
	public int field86;

	@ObfuscatedName("AUOBNYCU.y")
	public int field87;

	@ObfuscatedName("AUOBNYCU.A")
	public int field89;

	@ObfuscatedName("AUOBNYCU.B")
	public int field90;

	@ObfuscatedName("AUOBNYCU.C")
	public int field91;

	@ObfuscatedName("AUOBNYCU.G")
	public int field95;

	@ObfuscatedName("AUOBNYCU.H")
	public int field96;

	@ObfuscatedName("AUOBNYCU.z")
	public long field88;

	@ObfuscatedName("AUOBNYCU.D")
	public long field92;

	@ObfuscatedName("AUOBNYCU.p")
	public ALUUBUWO field78;

	@ObfuscatedName("AUOBNYCU.n")
	public UKPRFGXO field76;

	@ObfuscatedName("AUOBNYCU.m")
	public Graphics field75;

	@ObfuscatedName("AUOBNYCU.a(IBI)V")
	public final void method12(int arg0, int arg1) {
		field73 = arg0;
		field74 = arg1;
		field78 = new ALUUBUWO(field74, this, field73);
		field75 = method22().getGraphics();
		field76 = new UKPRFGXO(field73, method22(), field74);
		method23(this, 1);
	}

	@ObfuscatedName("AUOBNYCU.a(III)V")
	public final void method13(int arg0, int arg1) {
		field73 = arg0;
		field74 = arg1;
		field75 = method22().getGraphics();
		field76 = new UKPRFGXO(field73, method22(), field74);
		method23(this, 1);
	}

	public void run() {
		method22().addMouseListener(this);
		method22().addMouseMotionListener(this);
		method22().addKeyListener(this);
		method22().addFocusListener(this);

		if (field78 != null) {
			field78.addWindowListener(this);
		}

		method24("Loading...", 0);
		method17();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field70[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field67 < 0) {
					if (field67 == -1) {
						method14();
					}

					return;
				}

				if (field67 > 0) {
					field67--;
					if (field67 == 0) {
						method14();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field70[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field70[var1]) {
					var2 = (int) (field68 * 2560 / (var11 - field70[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field68 - (var11 - field70[var1]) / 10L);
				}

				if (var3 > field68) {
					var3 = field68;
				}

				field70[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field70[var13] != 0L) {
							field70[var13] += var3;
						}
					}
				}

				if (var3 < field69) {
					var3 = field69;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field89 = field85;
					field90 = field86;
					field91 = field87;
					field92 = field88;
					field85 = 0;
					method18();
					field95 = field96;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field68 > 0) {
					field71 = var2 * 1000 / (field68 * 256);
				}

				method20();
			} while (!field72);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field70[var15]);
			}

			System.out.println("fps:" + field71 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field68 + " mindel:" + field69);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field72 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("AUOBNYCU.a(I)V")
	public final void method14() {
		field67 = -2;
		method19();

		if (field78 != null) {
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

	@ObfuscatedName("AUOBNYCU.a(ZI)V")
	public final void method15(int arg0) {
		field68 = 1000 / arg0;
	}

	public final void start() {
		if (field67 >= 0) {
			field67 = 0;
		}
	}

	public final void stop() {
		if (field67 >= 0) {
			field67 = 4000 / field68;
		}
	}

	public final void destroy() {
		field67 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field67 == -1) {
			method14();
		}
	}

	public final void update(Graphics arg0) {
		if (field75 == null) {
			field75 = arg0;
		}

		field79 = true;
		method21();
	}

	public final void paint(Graphics arg0) {
		if (field75 == null) {
			field75 = arg0;
		}

		field79 = true;
		method21();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field78 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field81 = 0;
		field86 = var2;
		field87 = var3;
		field88 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field85 = 2;
			field82 = 2;
		} else {
			field85 = 1;
			field82 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field81 = 0;
		field82 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field81 = 0;
		field83 = -1;
		field84 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field78 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field81 = 0;
		field83 = var2;
		field84 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field78 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field81 = 0;
		field83 = var2;
		field84 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field81 = 0;
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
			field93[var3] = 1;
		}

		if (var3 > 4) {
			field94[field96] = var3;
			field96 = field96 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field81 = 0;
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
			field93[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("AUOBNYCU.b(I)I")
	public final int method16() {
		int var1 = -1;
		if (field96 != field95) {
			var1 = field94[field95];
			field95 = field95 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field80 = true;
		field79 = true;
		method21();
	}

	public final void focusLost(FocusEvent arg0) {
		field80 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field93[var2] = 0;
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

	@ObfuscatedName("AUOBNYCU.a()V")
	public void method17() {
	}

	@ObfuscatedName("AUOBNYCU.c(I)V")
	public void method18() {
	}

	@ObfuscatedName("AUOBNYCU.d(I)V")
	public void method19() {
	}

	@ObfuscatedName("AUOBNYCU.e(I)V")
	public void method20() {
	}

	@ObfuscatedName("AUOBNYCU.a(B)V")
	public void method21() {
	}

	@ObfuscatedName("AUOBNYCU.a(Z)Ljava/awt/Component;")
	public Component method22() {
		if (field78 != null) {
			return field78;
		}

		return this;
	}

	@ObfuscatedName("AUOBNYCU.a(Ljava/lang/Runnable;I)V")
	public void method23(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("AUOBNYCU.a(Ljava/lang/String;BI)V")
	public void method24(String arg0, int arg1) {
		while (field75 == null) {
			field75 = method22().getGraphics();

			try {
				method22().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method22().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method22().getFontMetrics(var5);

		if (field79) {
			field75.setColor(Color.black);
			field75.fillRect(0, 0, field73, field74);
			field79 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field74 / 2 - 18;
		field75.setColor(var6);
		field75.drawRect(field73 / 2 - 152, var7, 304, 34);
		field75.fillRect(field73 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field75.setColor(Color.black);
		field75.fillRect(arg1 * 3 + field73 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field75.setFont(var3);
		field75.setColor(Color.white);
		field75.drawString(arg0, (field73 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
