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

@ObfuscatedName("VTYHSWDE")
public class VTYHSWDE extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("VTYHSWDE.f")
	public int field1366 = 20;

	@ObfuscatedName("VTYHSWDE.g")
	public int field1367 = 1;

	@ObfuscatedName("VTYHSWDE.h")
	public long[] field1368 = new long[10];

	@ObfuscatedName("VTYHSWDE.j")
	public boolean field1370 = false;

	@ObfuscatedName("VTYHSWDE.o")
	public OMAKLDKI[] field1375 = new OMAKLDKI[6];

	@ObfuscatedName("VTYHSWDE.q")
	public boolean field1377 = true;

	@ObfuscatedName("VTYHSWDE.r")
	public boolean field1378 = true;

	@ObfuscatedName("VTYHSWDE.E")
	public int[] field1391 = new int[128];

	@ObfuscatedName("VTYHSWDE.F")
	public int[] field1392 = new int[128];

	@ObfuscatedName("VTYHSWDE.e")
	public int field1365;

	@ObfuscatedName("VTYHSWDE.i")
	public int field1369;

	@ObfuscatedName("VTYHSWDE.k")
	public int field1371;

	@ObfuscatedName("VTYHSWDE.l")
	public int field1372;

	@ObfuscatedName("VTYHSWDE.s")
	public int field1379;

	@ObfuscatedName("VTYHSWDE.t")
	public int field1380;

	@ObfuscatedName("VTYHSWDE.u")
	public int field1381;

	@ObfuscatedName("VTYHSWDE.v")
	public int field1382;

	@ObfuscatedName("VTYHSWDE.w")
	public int field1383;

	@ObfuscatedName("VTYHSWDE.x")
	public int field1384;

	@ObfuscatedName("VTYHSWDE.y")
	public int field1385;

	@ObfuscatedName("VTYHSWDE.A")
	public int field1387;

	@ObfuscatedName("VTYHSWDE.B")
	public int field1388;

	@ObfuscatedName("VTYHSWDE.C")
	public int field1389;

	@ObfuscatedName("VTYHSWDE.G")
	public int field1393;

	@ObfuscatedName("VTYHSWDE.H")
	public int field1394;

	@ObfuscatedName("VTYHSWDE.z")
	public long field1386;

	@ObfuscatedName("VTYHSWDE.D")
	public long field1390;

	@ObfuscatedName("VTYHSWDE.n")
	public KJGJRATW field1374;

	@ObfuscatedName("VTYHSWDE.p")
	public WSQCMTWN field1376;

	@ObfuscatedName("VTYHSWDE.m")
	public Graphics field1373;

	@ObfuscatedName("VTYHSWDE.a(III)V")
	public final void method553(int arg0, int arg1) {
		field1371 = arg0;
		field1372 = arg1;
		field1376 = new WSQCMTWN(field1372, this, field1371);
		field1373 = method82().getGraphics();
		field1374 = new KJGJRATW(method82(), field1371, field1372);
		method87(this, 1);
	}

	@ObfuscatedName("VTYHSWDE.b(III)V")
	public final void method554(int arg0, int arg1) {
		field1371 = arg0;
		field1372 = arg1;
		field1373 = method82().getGraphics();
		field1374 = new KJGJRATW(method82(), field1371, field1372);
		method87(this, 1);
	}

	public void run() {
		method82().addMouseListener(this);
		method82().addMouseMotionListener(this);
		method82().addKeyListener(this);
		method82().addFocusListener(this);

		if (field1376 != null) {
			field1376.addWindowListener(this);
		}

		method141(0, "Loading...");
		method155();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field1368[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1365 < 0) {
					if (field1365 == -1) {
						method555();
					}

					return;
				}

				if (field1365 > 0) {
					field1365--;
					if (field1365 == 0) {
						method555();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field1368[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field1368[var1]) {
					var2 = (int) (field1366 * 2560 / (var11 - field1368[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field1366 - (var11 - field1368[var1]) / 10L);
				}

				if (var3 > field1366) {
					var3 = field1366;
				}

				field1368[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field1368[var13] != 0L) {
							field1368[var13] += var3;
						}
					}
				}

				if (var3 < field1367) {
					var3 = field1367;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field1387 = field1383;
					field1388 = field1384;
					field1389 = field1385;
					field1390 = field1386;
					field1383 = 0;
					method79();
					field1393 = field1394;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field1366 > 0) {
					field1369 = var2 * 1000 / (field1366 * 256);
				}

				method77();
			} while (!field1370);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field1368[var15]);
			}

			System.out.println("fps:" + field1369 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field1366 + " mindel:" + field1367);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field1370 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("VTYHSWDE.a(B)V")
	public final void method555() {
		field1365 = -2;
		method112();

		if (field1376 != null) {
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

	@ObfuscatedName("VTYHSWDE.a(II)V")
	public final void method556(int arg0) {
		field1366 = 1000 / arg0;
	}

	public final void start() {
		if (field1365 >= 0) {
			field1365 = 0;
		}
	}

	public final void stop() {
		if (field1365 >= 0) {
			field1365 = 4000 / field1366;
		}
	}

	public final void destroy() {
		field1365 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field1365 == -1) {
			method555();
		}
	}

	public final void update(Graphics arg0) {
		if (field1373 == null) {
			field1373 = arg0;
		}

		field1377 = true;
		method145();
	}

	public final void paint(Graphics arg0) {
		if (field1373 == null) {
			field1373 = arg0;
		}

		field1377 = true;
		method145();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1376 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1379 = 0;
		field1384 = var2;
		field1385 = var3;
		field1386 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field1383 = 2;
			field1380 = 2;
		} else {
			field1383 = 1;
			field1380 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field1379 = 0;
		field1380 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field1379 = 0;
		field1381 = -1;
		field1382 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1376 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1379 = 0;
		field1381 = var2;
		field1382 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1376 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1379 = 0;
		field1381 = var2;
		field1382 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field1379 = 0;
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
			field1391[var3] = 1;
		}

		if (var3 > 4) {
			field1392[field1394] = var3;
			field1394 = field1394 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field1379 = 0;
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
			field1391[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("VTYHSWDE.a(I)I")
	public final int method557() {
		int var1 = -1;
		if (field1394 != field1393) {
			var1 = field1392[field1393];
			field1393 = field1393 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field1378 = true;
		field1377 = true;
		method145();
	}

	public final void focusLost(FocusEvent arg0) {
		field1378 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field1391[var2] = 0;
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

	@ObfuscatedName("VTYHSWDE.a()V")
	public void method155() {
	}

	@ObfuscatedName("VTYHSWDE.a(Z)V")
	public void method79() {
	}

	@ObfuscatedName("VTYHSWDE.b(B)V")
	public void method112() {
	}

	@ObfuscatedName("VTYHSWDE.b(Z)V")
	public void method77() {
	}

	@ObfuscatedName("VTYHSWDE.b(I)V")
	public void method145() {
	}

	@ObfuscatedName("VTYHSWDE.c(I)Ljava/awt/Component;")
	public Component method82() {
		if (field1376 != null) {
			return field1376;
		}

		return this;
	}

	@ObfuscatedName("VTYHSWDE.a(Ljava/lang/Runnable;I)V")
	public void method87(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("VTYHSWDE.a(ZILjava/lang/String;)V")
	public void method141(int arg0, String arg1) {
		while (field1373 == null) {
			field1373 = method82().getGraphics();

			try {
				method82().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method82().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method82().getFontMetrics(var5);

		if (field1377) {
			field1373.setColor(Color.black);
			field1373.fillRect(0, 0, field1371, field1372);
			field1377 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field1372 / 2 - 18;
		field1373.setColor(var6);
		field1373.drawRect(field1371 / 2 - 152, var7, 304, 34);
		field1373.fillRect(field1371 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field1373.setColor(Color.black);
		field1373.fillRect(arg0 * 3 + field1371 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field1373.setFont(var3);
		field1373.setColor(Color.white);
		field1373.drawString(arg1, (field1371 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
