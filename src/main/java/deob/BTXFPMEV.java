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

@ObfuscatedName("BTXFPMEV")
public class BTXFPMEV extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("BTXFPMEV.h")
	public int field67 = 20;

	@ObfuscatedName("BTXFPMEV.i")
	public int field68 = 1;

	@ObfuscatedName("BTXFPMEV.j")
	public long[] field69 = new long[10];

	@ObfuscatedName("BTXFPMEV.l")
	public boolean field71 = false;

	@ObfuscatedName("BTXFPMEV.q")
	public DLNMSHLT[] field76 = new DLNMSHLT[6];

	@ObfuscatedName("BTXFPMEV.s")
	public boolean field78 = true;

	@ObfuscatedName("BTXFPMEV.t")
	public boolean field79 = true;

	@ObfuscatedName("BTXFPMEV.G")
	public int[] field92 = new int[128];

	@ObfuscatedName("BTXFPMEV.H")
	public int[] field93 = new int[128];

	@ObfuscatedName("BTXFPMEV.g")
	public int field66;

	@ObfuscatedName("BTXFPMEV.k")
	public int field70;

	@ObfuscatedName("BTXFPMEV.m")
	public int field72;

	@ObfuscatedName("BTXFPMEV.n")
	public int field73;

	@ObfuscatedName("BTXFPMEV.u")
	public int field80;

	@ObfuscatedName("BTXFPMEV.v")
	public int field81;

	@ObfuscatedName("BTXFPMEV.w")
	public int field82;

	@ObfuscatedName("BTXFPMEV.x")
	public int field83;

	@ObfuscatedName("BTXFPMEV.y")
	public int field84;

	@ObfuscatedName("BTXFPMEV.z")
	public int field85;

	@ObfuscatedName("BTXFPMEV.A")
	public int field86;

	@ObfuscatedName("BTXFPMEV.C")
	public int field88;

	@ObfuscatedName("BTXFPMEV.D")
	public int field89;

	@ObfuscatedName("BTXFPMEV.E")
	public int field90;

	@ObfuscatedName("BTXFPMEV.I")
	public int field94;

	@ObfuscatedName("BTXFPMEV.J")
	public int field95;

	@ObfuscatedName("BTXFPMEV.B")
	public long field87;

	@ObfuscatedName("BTXFPMEV.F")
	public long field91;

	@ObfuscatedName("BTXFPMEV.p")
	public CMFQLMCT field75;

	@ObfuscatedName("BTXFPMEV.r")
	public MOPGUTIE field77;

	@ObfuscatedName("BTXFPMEV.o")
	public Graphics field74;

	@ObfuscatedName("BTXFPMEV.a(III)V")
	public final void method47(int arg0, int arg1) {
		field72 = arg1;
		field73 = arg0;
		field77 = new MOPGUTIE(this, field73, field72);
		field74 = method57().getGraphics();
		field75 = new CMFQLMCT(field72, method57(), field73);
		method58(this, 1);
	}

	@ObfuscatedName("BTXFPMEV.a(ZII)V")
	public final void method48(int arg0, int arg1) {
		field72 = arg1;
		field73 = arg0;
		field74 = method57().getGraphics();
		field75 = new CMFQLMCT(field72, method57(), field73);
		method58(this, 1);
	}

	public void run() {
		method57().addMouseListener(this);
		method57().addMouseMotionListener(this);
		method57().addKeyListener(this);
		method57().addFocusListener(this);

		if (field77 != null) {
			field77.addWindowListener(this);
		}

		method59("Loading...", 0);
		method52();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field69[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field66 < 0) {
					if (field66 == -1) {
						method49();
					}

					return;
				}

				if (field66 > 0) {
					field66--;
					if (field66 == 0) {
						method49();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field69[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field69[var1]) {
					var2 = (int) (field67 * 2560 / (var11 - field69[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field67 - (var11 - field69[var1]) / 10L);
				}

				if (var3 > field67) {
					var3 = field67;
				}

				field69[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field69[var13] != 0L) {
							field69[var13] += var3;
						}
					}
				}

				if (var3 < field68) {
					var3 = field68;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field88 = field84;
					field89 = field85;
					field90 = field86;
					field91 = field87;
					field84 = 0;
					method53();
					field94 = field95;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field67 > 0) {
					field70 = var2 * 1000 / (field67 * 256);
				}

				method55();
			} while (!field71);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field69[var15]);
			}

			System.out.println("fps:" + field70 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field67 + " mindel:" + field68);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field71 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("BTXFPMEV.a(I)V")
	public final void method49() {
		field66 = -2;
		method54();

		if (field77 != null) {
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

	@ObfuscatedName("BTXFPMEV.a(II)V")
	public final void method50(int arg0) {
		field67 = 1000 / arg0;
	}

	public final void start() {
		if (field66 >= 0) {
			field66 = 0;
		}
	}

	public final void stop() {
		if (field66 >= 0) {
			field66 = 4000 / field67;
		}
	}

	public final void destroy() {
		field66 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field66 == -1) {
			method49();
		}
	}

	public final void update(Graphics arg0) {
		if (field74 == null) {
			field74 = arg0;
		}

		field78 = true;
		method56();
	}

	public final void paint(Graphics arg0) {
		if (field74 == null) {
			field74 = arg0;
		}

		field78 = true;
		method56();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field77 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field80 = 0;
		field85 = var2;
		field86 = var3;
		field87 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field84 = 2;
			field81 = 2;
		} else {
			field84 = 1;
			field81 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field80 = 0;
		field81 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field80 = 0;
		field82 = -1;
		field83 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field77 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field80 = 0;
		field82 = var2;
		field83 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field77 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field80 = 0;
		field82 = var2;
		field83 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field80 = 0;
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
			field92[var3] = 1;
		}

		if (var3 > 4) {
			field93[field95] = var3;
			field95 = field95 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field80 = 0;
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
			field92[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("BTXFPMEV.b(I)I")
	public final int method51() {
		int var1 = -1;
		if (field95 != field94) {
			var1 = field93[field94];
			field94 = field94 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field79 = true;
		field78 = true;
		method56();
	}

	public final void focusLost(FocusEvent arg0) {
		field79 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field92[var2] = 0;
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

	@ObfuscatedName("BTXFPMEV.a()V")
	public void method52() {
	}

	@ObfuscatedName("BTXFPMEV.c(I)V")
	public void method53() {
	}

	@ObfuscatedName("BTXFPMEV.a(B)V")
	public void method54() {
	}

	@ObfuscatedName("BTXFPMEV.d(I)V")
	public void method55() {
	}

	@ObfuscatedName("BTXFPMEV.e(I)V")
	public void method56() {
	}

	@ObfuscatedName("BTXFPMEV.b(B)Ljava/awt/Component;")
	public Component method57() {
		if (field77 != null) {
			return field77;
		}

		return this;
	}

	@ObfuscatedName("BTXFPMEV.a(Ljava/lang/Runnable;I)V")
	public void method58(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("BTXFPMEV.a(Ljava/lang/String;IB)V")
	public void method59(String arg0, int arg1) {
		while (field74 == null) {
			field74 = method57().getGraphics();

			try {
				method57().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method57().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method57().getFontMetrics(var5);

		if (field78) {
			field74.setColor(Color.black);
			field74.fillRect(0, 0, field72, field73);
			field78 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field73 / 2 - 18;
		field74.setColor(var6);
		field74.drawRect(field72 / 2 - 152, var7, 304, 34);
		field74.fillRect(field72 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field74.setColor(Color.black);
		field74.fillRect(arg1 * 3 + field72 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field74.setFont(var3);
		field74.setColor(Color.white);
		field74.drawString(arg0, (field72 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
