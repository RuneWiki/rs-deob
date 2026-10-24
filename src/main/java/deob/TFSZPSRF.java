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

@ObfuscatedName("TFSZPSRF")
public class TFSZPSRF extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("TFSZPSRF.g")
	public int field1354 = 20;

	@ObfuscatedName("TFSZPSRF.h")
	public int field1355 = 1;

	@ObfuscatedName("TFSZPSRF.i")
	public long[] field1356 = new long[10];

	@ObfuscatedName("TFSZPSRF.k")
	public boolean field1358 = false;

	@ObfuscatedName("TFSZPSRF.p")
	public YZDAHXEQ[] field1363 = new YZDAHXEQ[6];

	@ObfuscatedName("TFSZPSRF.r")
	public boolean field1365 = true;

	@ObfuscatedName("TFSZPSRF.s")
	public boolean field1366 = true;

	@ObfuscatedName("TFSZPSRF.F")
	public int[] field1379 = new int[128];

	@ObfuscatedName("TFSZPSRF.G")
	public int[] field1380 = new int[128];

	@ObfuscatedName("TFSZPSRF.f")
	public int field1353;

	@ObfuscatedName("TFSZPSRF.j")
	public int field1357;

	@ObfuscatedName("TFSZPSRF.l")
	public int field1359;

	@ObfuscatedName("TFSZPSRF.m")
	public int field1360;

	@ObfuscatedName("TFSZPSRF.t")
	public int field1367;

	@ObfuscatedName("TFSZPSRF.u")
	public int field1368;

	@ObfuscatedName("TFSZPSRF.v")
	public int field1369;

	@ObfuscatedName("TFSZPSRF.w")
	public int field1370;

	@ObfuscatedName("TFSZPSRF.x")
	public int field1371;

	@ObfuscatedName("TFSZPSRF.y")
	public int field1372;

	@ObfuscatedName("TFSZPSRF.z")
	public int field1373;

	@ObfuscatedName("TFSZPSRF.B")
	public int field1375;

	@ObfuscatedName("TFSZPSRF.C")
	public int field1376;

	@ObfuscatedName("TFSZPSRF.D")
	public int field1377;

	@ObfuscatedName("TFSZPSRF.H")
	public int field1381;

	@ObfuscatedName("TFSZPSRF.I")
	public int field1382;

	@ObfuscatedName("TFSZPSRF.A")
	public long field1374;

	@ObfuscatedName("TFSZPSRF.E")
	public long field1378;

	@ObfuscatedName("TFSZPSRF.q")
	public APBCEOWT field1364;

	@ObfuscatedName("TFSZPSRF.o")
	public YOIXICCU field1362;

	@ObfuscatedName("TFSZPSRF.n")
	public Graphics field1361;

	@ObfuscatedName("TFSZPSRF.a(III)V")
	public final void method508(int arg0, int arg1) {
		field1359 = arg1;
		field1360 = arg0;
		field1364 = new APBCEOWT(this, field1360, field1359);
		field1361 = method143().getGraphics();
		field1362 = new YOIXICCU(field1359, method143(), field1360);
		method115(this, 1);
	}

	@ObfuscatedName("TFSZPSRF.a(ZII)V")
	public final void method509(int arg0, int arg1) {
		field1359 = arg0;
		field1360 = arg1;
		field1361 = method143().getGraphics();
		field1362 = new YOIXICCU(field1359, method143(), field1360);
		method115(this, 1);
	}

	public void run() {
		method143().addMouseListener(this);
		method143().addMouseMotionListener(this);
		method143().addKeyListener(this);
		method143().addFocusListener(this);

		if (field1364 != null) {
			field1364.addWindowListener(this);
		}

		method166("Loading...", 0);
		method146();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field1356[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1353 < 0) {
					if (field1353 == -1) {
						method510();
					}

					return;
				}

				if (field1353 > 0) {
					field1353--;
					if (field1353 == 0) {
						method510();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field1356[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field1356[var1]) {
					var2 = (int) (field1354 * 2560 / (var11 - field1356[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field1354 - (var11 - field1356[var1]) / 10L);
				}

				if (var3 > field1354) {
					var3 = field1354;
				}

				field1356[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field1356[var13] != 0L) {
							field1356[var13] += var3;
						}
					}
				}

				if (var3 < field1355) {
					var3 = field1355;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field1375 = field1371;
					field1376 = field1372;
					field1377 = field1373;
					field1378 = field1374;
					field1371 = 0;
					method108();
					field1381 = field1382;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field1354 > 0) {
					field1357 = var2 * 1000 / (field1354 * 256);
				}

				method119();
			} while (!field1358);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field1356[var15]);
			}

			System.out.println("fps:" + field1357 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field1354 + " mindel:" + field1355);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field1358 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("TFSZPSRF.a(Z)V")
	public final void method510() {
		field1353 = -2;
		method121();

		if (field1364 != null) {
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

	@ObfuscatedName("TFSZPSRF.a(II)V")
	public final void method511(int arg0) {
		field1354 = 1000 / arg0;
	}

	public final void start() {
		if (field1353 >= 0) {
			field1353 = 0;
		}
	}

	public final void stop() {
		if (field1353 >= 0) {
			field1353 = 4000 / field1354;
		}
	}

	public final void destroy() {
		field1353 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field1353 == -1) {
			method510();
		}
	}

	public final void update(Graphics arg0) {
		if (field1361 == null) {
			field1361 = arg0;
		}

		field1365 = true;
		method48();
	}

	public final void paint(Graphics arg0) {
		if (field1361 == null) {
			field1361 = arg0;
		}

		field1365 = true;
		method48();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1364 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1367 = 0;
		field1372 = var2;
		field1373 = var3;
		field1374 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field1371 = 2;
			field1368 = 2;
		} else {
			field1371 = 1;
			field1368 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field1367 = 0;
		field1368 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field1367 = 0;
		field1369 = -1;
		field1370 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1364 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1367 = 0;
		field1369 = var2;
		field1370 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1364 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1367 = 0;
		field1369 = var2;
		field1370 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field1367 = 0;
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
			field1379[var3] = 1;
		}

		if (var3 > 4) {
			field1380[field1382] = var3;
			field1382 = field1382 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field1367 = 0;
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
			field1379[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("TFSZPSRF.a(B)I")
	public final int method512() {
		int var1 = -1;
		if (field1382 != field1381) {
			var1 = field1380[field1381];
			field1381 = field1381 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field1366 = true;
		field1365 = true;
		method48();
	}

	public final void focusLost(FocusEvent arg0) {
		field1366 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field1379[var2] = 0;
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

	@ObfuscatedName("TFSZPSRF.a()V")
	public void method146() {
	}

	@ObfuscatedName("TFSZPSRF.a(I)V")
	public void method108() {
	}

	@ObfuscatedName("TFSZPSRF.b(I)V")
	public void method121() {
	}

	@ObfuscatedName("TFSZPSRF.b(Z)V")
	public void method119() {
	}

	@ObfuscatedName("TFSZPSRF.c(I)V")
	public void method48() {
	}

	@ObfuscatedName("TFSZPSRF.c(Z)Ljava/awt/Component;")
	public Component method143() {
		if (field1364 != null) {
			return field1364;
		}

		return this;
	}

	@ObfuscatedName("TFSZPSRF.a(Ljava/lang/Runnable;I)V")
	public void method115(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("TFSZPSRF.a(Ljava/lang/String;II)V")
	public void method166(String arg0, int arg1) {
		while (field1361 == null) {
			field1361 = method143().getGraphics();

			try {
				method143().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method143().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method143().getFontMetrics(var5);

		if (field1365) {
			field1361.setColor(Color.black);
			field1361.fillRect(0, 0, field1359, field1360);
			field1365 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field1360 / 2 - 18;
		field1361.setColor(var6);
		field1361.drawRect(field1359 / 2 - 152, var7, 304, 34);
		field1361.fillRect(field1359 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field1361.setColor(Color.black);
		field1361.fillRect(arg1 * 3 + field1359 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field1361.setFont(var3);
		field1361.setColor(Color.white);
		field1361.drawString(arg0, (field1359 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
