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

@ObfuscatedName("MUZNSFEY")
public class MUZNSFEY extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("MUZNSFEY.f")
	public int field888 = 20;

	@ObfuscatedName("MUZNSFEY.g")
	public int field889 = 1;

	@ObfuscatedName("MUZNSFEY.h")
	public long[] field890 = new long[10];

	@ObfuscatedName("MUZNSFEY.j")
	public boolean field892 = false;

	@ObfuscatedName("MUZNSFEY.o")
	public DYPVESKW[] field897 = new DYPVESKW[6];

	@ObfuscatedName("MUZNSFEY.q")
	public boolean field899 = true;

	@ObfuscatedName("MUZNSFEY.r")
	public boolean field900 = true;

	@ObfuscatedName("MUZNSFEY.E")
	public int[] field913 = new int[128];

	@ObfuscatedName("MUZNSFEY.F")
	public int[] field914 = new int[128];

	@ObfuscatedName("MUZNSFEY.e")
	public int field887;

	@ObfuscatedName("MUZNSFEY.i")
	public int field891;

	@ObfuscatedName("MUZNSFEY.k")
	public int field893;

	@ObfuscatedName("MUZNSFEY.l")
	public int field894;

	@ObfuscatedName("MUZNSFEY.s")
	public int field901;

	@ObfuscatedName("MUZNSFEY.t")
	public int field902;

	@ObfuscatedName("MUZNSFEY.u")
	public int field903;

	@ObfuscatedName("MUZNSFEY.v")
	public int field904;

	@ObfuscatedName("MUZNSFEY.w")
	public int field905;

	@ObfuscatedName("MUZNSFEY.x")
	public int field906;

	@ObfuscatedName("MUZNSFEY.y")
	public int field907;

	@ObfuscatedName("MUZNSFEY.A")
	public int field909;

	@ObfuscatedName("MUZNSFEY.B")
	public int field910;

	@ObfuscatedName("MUZNSFEY.C")
	public int field911;

	@ObfuscatedName("MUZNSFEY.G")
	public int field915;

	@ObfuscatedName("MUZNSFEY.H")
	public int field916;

	@ObfuscatedName("MUZNSFEY.z")
	public long field908;

	@ObfuscatedName("MUZNSFEY.D")
	public long field912;

	@ObfuscatedName("MUZNSFEY.n")
	public OIDSBDUP field896;

	@ObfuscatedName("MUZNSFEY.p")
	public YNCFRRRI field898;

	@ObfuscatedName("MUZNSFEY.m")
	public Graphics field895;

	@ObfuscatedName("MUZNSFEY.a(IBI)V")
	public final void method333(int arg0, int arg1) {
		field893 = arg1;
		field894 = arg0;
		field898 = new YNCFRRRI(this, field893, field894);
		field895 = method45().getGraphics();
		field896 = new OIDSBDUP(method45(), field893, field894);
		method141(this, 1);
	}

	@ObfuscatedName("MUZNSFEY.a(IIB)V")
	public final void method334(int arg0, int arg1) {
		field893 = arg0;
		field894 = arg1;
		field895 = method45().getGraphics();
		field896 = new OIDSBDUP(method45(), field893, field894);
		method141(this, 1);
	}

	public void run() {
		method45().addMouseListener(this);
		method45().addMouseMotionListener(this);
		method45().addKeyListener(this);
		method45().addFocusListener(this);

		if (field898 != null) {
			field898.addWindowListener(this);
		}

		method156(0, "Loading...");
		method119();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field890[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field887 < 0) {
					if (field887 == -1) {
						method335();
					}

					return;
				}

				if (field887 > 0) {
					field887--;
					if (field887 == 0) {
						method335();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field890[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field890[var1]) {
					var2 = (int) (field888 * 2560 / (var11 - field890[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field888 - (var11 - field890[var1]) / 10L);
				}

				if (var3 > field888) {
					var3 = field888;
				}

				field890[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field890[var13] != 0L) {
							field890[var13] += var3;
						}
					}
				}

				if (var3 < field889) {
					var3 = field889;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field909 = field905;
					field910 = field906;
					field911 = field907;
					field912 = field908;
					field905 = 0;
					method40();
					field915 = field916;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field888 > 0) {
					field891 = var2 * 1000 / (field888 * 256);
				}

				method79();
			} while (!field892);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field890[var15]);
			}

			System.out.println("fps:" + field891 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field888 + " mindel:" + field889);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field892 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("MUZNSFEY.a(I)V")
	public final void method335() {
		field887 = -2;
		method142();

		if (field898 != null) {
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

	@ObfuscatedName("MUZNSFEY.a(ZI)V")
	public final void method336(int arg0) {
		field888 = 1000 / arg0;
	}

	public final void start() {
		if (field887 >= 0) {
			field887 = 0;
		}
	}

	public final void stop() {
		if (field887 >= 0) {
			field887 = 4000 / field888;
		}
	}

	public final void destroy() {
		field887 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field887 == -1) {
			method335();
		}
	}

	public final void update(Graphics arg0) {
		if (field895 == null) {
			field895 = arg0;
		}

		field899 = true;
		method27();
	}

	public final void paint(Graphics arg0) {
		if (field895 == null) {
			field895 = arg0;
		}

		field899 = true;
		method27();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field898 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field901 = 0;
		field906 = var2;
		field907 = var3;
		field908 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field905 = 2;
			field902 = 2;
		} else {
			field905 = 1;
			field902 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field901 = 0;
		field902 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field901 = 0;
		field903 = -1;
		field904 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field898 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field901 = 0;
		field903 = var2;
		field904 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field898 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field901 = 0;
		field903 = var2;
		field904 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field901 = 0;
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
			field913[var3] = 1;
		}

		if (var3 > 4) {
			field914[field916] = var3;
			field916 = field916 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field901 = 0;
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
			field913[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("MUZNSFEY.b(I)I")
	public final int method337() {
		int var1 = -1;
		if (field916 != field915) {
			var1 = field914[field915];
			field915 = field915 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field900 = true;
		field899 = true;
		method27();
	}

	public final void focusLost(FocusEvent arg0) {
		field900 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field913[var2] = 0;
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

	@ObfuscatedName("MUZNSFEY.a()V")
	public void method119() {
	}

	@ObfuscatedName("MUZNSFEY.a(B)V")
	public void method40() {
	}

	@ObfuscatedName("MUZNSFEY.c(I)V")
	public void method142() {
	}

	@ObfuscatedName("MUZNSFEY.d(I)V")
	public void method79() {
	}

	@ObfuscatedName("MUZNSFEY.a(Z)V")
	public void method27() {
	}

	@ObfuscatedName("MUZNSFEY.e(I)Ljava/awt/Component;")
	public Component method45() {
		if (field898 != null) {
			return field898;
		}

		return this;
	}

	@ObfuscatedName("MUZNSFEY.a(Ljava/lang/Runnable;I)V")
	public void method141(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("MUZNSFEY.a(BILjava/lang/String;)V")
	public void method156(int arg0, String arg1) {
		while (field895 == null) {
			field895 = method45().getGraphics();

			try {
				method45().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method45().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method45().getFontMetrics(var5);

		if (field899) {
			field895.setColor(Color.black);
			field895.fillRect(0, 0, field893, field894);
			field899 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field894 / 2 - 18;
		field895.setColor(var6);
		field895.drawRect(field893 / 2 - 152, var7, 304, 34);
		field895.fillRect(field893 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field895.setColor(Color.black);
		field895.fillRect(arg0 * 3 + field893 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field895.setFont(var3);
		field895.setColor(Color.white);
		field895.drawString(arg1, (field893 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
