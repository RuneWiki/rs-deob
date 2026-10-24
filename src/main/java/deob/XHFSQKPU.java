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

@ObfuscatedName("XHFSQKPU")
public class XHFSQKPU extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("XHFSQKPU.g")
	public int field1382 = 20;

	@ObfuscatedName("XHFSQKPU.h")
	public int field1383 = 1;

	@ObfuscatedName("XHFSQKPU.i")
	public long[] field1384 = new long[10];

	@ObfuscatedName("XHFSQKPU.k")
	public boolean field1386 = false;

	@ObfuscatedName("XHFSQKPU.p")
	public CUKAGIIJ[] field1391 = new CUKAGIIJ[6];

	@ObfuscatedName("XHFSQKPU.r")
	public boolean field1393 = true;

	@ObfuscatedName("XHFSQKPU.s")
	public boolean field1394 = true;

	@ObfuscatedName("XHFSQKPU.F")
	public int[] field1407 = new int[128];

	@ObfuscatedName("XHFSQKPU.G")
	public int[] field1408 = new int[128];

	@ObfuscatedName("XHFSQKPU.f")
	public int field1381;

	@ObfuscatedName("XHFSQKPU.j")
	public int field1385;

	@ObfuscatedName("XHFSQKPU.l")
	public int field1387;

	@ObfuscatedName("XHFSQKPU.m")
	public int field1388;

	@ObfuscatedName("XHFSQKPU.t")
	public int field1395;

	@ObfuscatedName("XHFSQKPU.u")
	public int field1396;

	@ObfuscatedName("XHFSQKPU.v")
	public int field1397;

	@ObfuscatedName("XHFSQKPU.w")
	public int field1398;

	@ObfuscatedName("XHFSQKPU.x")
	public int field1399;

	@ObfuscatedName("XHFSQKPU.y")
	public int field1400;

	@ObfuscatedName("XHFSQKPU.z")
	public int field1401;

	@ObfuscatedName("XHFSQKPU.B")
	public int field1403;

	@ObfuscatedName("XHFSQKPU.C")
	public int field1404;

	@ObfuscatedName("XHFSQKPU.D")
	public int field1405;

	@ObfuscatedName("XHFSQKPU.H")
	public int field1409;

	@ObfuscatedName("XHFSQKPU.I")
	public int field1410;

	@ObfuscatedName("XHFSQKPU.A")
	public long field1402;

	@ObfuscatedName("XHFSQKPU.E")
	public long field1406;

	@ObfuscatedName("XHFSQKPU.o")
	public EDCVNWGU field1390;

	@ObfuscatedName("XHFSQKPU.q")
	public HCBLGNPC field1392;

	@ObfuscatedName("XHFSQKPU.n")
	public Graphics field1389;

	@ObfuscatedName("XHFSQKPU.a(III)V")
	public final void method577(int arg0, int arg1) {
		field1387 = arg1;
		field1388 = arg0;
		field1392 = new HCBLGNPC(field1387, field1388, this);
		field1389 = method149().getGraphics();
		field1390 = new EDCVNWGU(method149(), field1388, field1387);
		method129(this, 1);
	}

	@ObfuscatedName("XHFSQKPU.b(III)V")
	public final void method578(int arg0, int arg1) {
		field1387 = arg1;
		field1388 = arg0;
		field1389 = method149().getGraphics();
		field1390 = new EDCVNWGU(method149(), field1388, field1387);
		method129(this, 1);
	}

	public void run() {
		method149().addMouseListener(this);
		method149().addMouseMotionListener(this);
		method149().addKeyListener(this);
		method149().addFocusListener(this);

		if (field1392 != null) {
			field1392.addWindowListener(this);
		}

		method206(0, "Loading...");
		method178();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field1384[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1381 < 0) {
					if (field1381 == -1) {
						method579();
					}

					return;
				}

				if (field1381 > 0) {
					field1381--;
					if (field1381 == 0) {
						method579();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field1384[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field1384[var1]) {
					var2 = (int) (field1382 * 2560 / (var11 - field1384[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field1382 - (var11 - field1384[var1]) / 10L);
				}

				if (var3 > field1382) {
					var3 = field1382;
				}

				field1384[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field1384[var13] != 0L) {
							field1384[var13] += var3;
						}
					}
				}

				if (var3 < field1383) {
					var3 = field1383;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field1403 = field1399;
					field1404 = field1400;
					field1405 = field1401;
					field1406 = field1402;
					field1399 = 0;
					method118();
					field1409 = field1410;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field1382 > 0) {
					field1385 = var2 * 1000 / (field1382 * 256);
				}

				method99();
			} while (!field1386);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field1384[var15]);
			}

			System.out.println("fps:" + field1385 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field1382 + " mindel:" + field1383);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field1386 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("XHFSQKPU.a(I)V")
	public final void method579() {
		field1381 = -2;
		method163();

		if (field1392 != null) {
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

	@ObfuscatedName("XHFSQKPU.a(II)V")
	public final void method580(int arg0) {
		field1382 = 1000 / arg0;
	}

	public final void start() {
		if (field1381 >= 0) {
			field1381 = 0;
		}
	}

	public final void stop() {
		if (field1381 >= 0) {
			field1381 = 4000 / field1382;
		}
	}

	public final void destroy() {
		field1381 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field1381 == -1) {
			method579();
		}
	}

	public final void update(Graphics arg0) {
		if (field1389 == null) {
			field1389 = arg0;
		}

		field1393 = true;
		method177();
	}

	public final void paint(Graphics arg0) {
		if (field1389 == null) {
			field1389 = arg0;
		}

		field1393 = true;
		method177();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1392 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1395 = 0;
		field1400 = var2;
		field1401 = var3;
		field1402 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field1399 = 2;
			field1396 = 2;
		} else {
			field1399 = 1;
			field1396 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field1395 = 0;
		field1396 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field1395 = 0;
		field1397 = -1;
		field1398 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1392 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1395 = 0;
		field1397 = var2;
		field1398 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1392 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1395 = 0;
		field1397 = var2;
		field1398 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field1395 = 0;
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
			field1407[var3] = 1;
		}

		if (var3 > 4) {
			field1408[field1410] = var3;
			field1410 = field1410 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field1395 = 0;
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
			field1407[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("XHFSQKPU.a(Z)I")
	public final int method581() {
		int var1 = -1;
		if (field1410 != field1409) {
			var1 = field1408[field1409];
			field1409 = field1409 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field1394 = true;
		field1393 = true;
		method177();
	}

	public final void focusLost(FocusEvent arg0) {
		field1394 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field1407[var2] = 0;
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

	@ObfuscatedName("XHFSQKPU.a()V")
	public void method178() {
	}

	@ObfuscatedName("XHFSQKPU.a(B)V")
	public void method118() {
	}

	@ObfuscatedName("XHFSQKPU.b(B)V")
	public void method163() {
	}

	@ObfuscatedName("XHFSQKPU.b(I)V")
	public void method99() {
	}

	@ObfuscatedName("XHFSQKPU.c(I)V")
	public void method177() {
	}

	@ObfuscatedName("XHFSQKPU.b(Z)Ljava/awt/Component;")
	public Component method149() {
		if (field1392 != null) {
			return field1392;
		}

		return this;
	}

	@ObfuscatedName("XHFSQKPU.a(Ljava/lang/Runnable;I)V")
	public void method129(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("XHFSQKPU.a(IILjava/lang/String;)V")
	public void method206(int arg0, String arg1) {
		while (field1389 == null) {
			field1389 = method149().getGraphics();

			try {
				method149().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method149().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method149().getFontMetrics(var5);

		if (field1393) {
			field1389.setColor(Color.black);
			field1389.fillRect(0, 0, field1387, field1388);
			field1393 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field1388 / 2 - 18;
		field1389.setColor(var6);
		field1389.drawRect(field1387 / 2 - 152, var7, 304, 34);
		field1389.fillRect(field1387 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field1389.setColor(Color.black);
		field1389.fillRect(arg0 * 3 + field1387 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field1389.setFont(var3);
		field1389.setColor(Color.white);
		field1389.drawString(arg1, (field1387 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
