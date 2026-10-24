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

@ObfuscatedName("ZAMJOSBM")
public class ZAMJOSBM extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("ZAMJOSBM.f")
	public int field1413 = 20;

	@ObfuscatedName("ZAMJOSBM.g")
	public int field1414 = 1;

	@ObfuscatedName("ZAMJOSBM.h")
	public long[] field1415 = new long[10];

	@ObfuscatedName("ZAMJOSBM.j")
	public boolean field1417 = false;

	@ObfuscatedName("ZAMJOSBM.o")
	public UFHMHWIH[] field1422 = new UFHMHWIH[6];

	@ObfuscatedName("ZAMJOSBM.q")
	public boolean field1424 = true;

	@ObfuscatedName("ZAMJOSBM.r")
	public boolean field1425 = true;

	@ObfuscatedName("ZAMJOSBM.E")
	public int[] field1438 = new int[128];

	@ObfuscatedName("ZAMJOSBM.F")
	public int[] field1439 = new int[128];

	@ObfuscatedName("ZAMJOSBM.e")
	public int field1412;

	@ObfuscatedName("ZAMJOSBM.i")
	public int field1416;

	@ObfuscatedName("ZAMJOSBM.k")
	public int field1418;

	@ObfuscatedName("ZAMJOSBM.l")
	public int field1419;

	@ObfuscatedName("ZAMJOSBM.s")
	public int field1426;

	@ObfuscatedName("ZAMJOSBM.t")
	public int field1427;

	@ObfuscatedName("ZAMJOSBM.u")
	public int field1428;

	@ObfuscatedName("ZAMJOSBM.v")
	public int field1429;

	@ObfuscatedName("ZAMJOSBM.w")
	public int field1430;

	@ObfuscatedName("ZAMJOSBM.x")
	public int field1431;

	@ObfuscatedName("ZAMJOSBM.y")
	public int field1432;

	@ObfuscatedName("ZAMJOSBM.A")
	public int field1434;

	@ObfuscatedName("ZAMJOSBM.B")
	public int field1435;

	@ObfuscatedName("ZAMJOSBM.C")
	public int field1436;

	@ObfuscatedName("ZAMJOSBM.G")
	public int field1440;

	@ObfuscatedName("ZAMJOSBM.H")
	public int field1441;

	@ObfuscatedName("ZAMJOSBM.z")
	public long field1433;

	@ObfuscatedName("ZAMJOSBM.D")
	public long field1437;

	@ObfuscatedName("ZAMJOSBM.n")
	public CPJIVKZX field1421;

	@ObfuscatedName("ZAMJOSBM.p")
	public VZVCZYAB field1423;

	@ObfuscatedName("ZAMJOSBM.m")
	public Graphics field1420;

	@ObfuscatedName("ZAMJOSBM.a(IIZ)V")
	public final void method576(int arg0, int arg1) {
		field1418 = arg1;
		field1419 = arg0;
		field1423 = new VZVCZYAB(this, field1418, field1419);
		field1420 = method42().getGraphics();
		field1421 = new CPJIVKZX(field1418, field1419, method42());
		method97(this, 1);
	}

	@ObfuscatedName("ZAMJOSBM.a(III)V")
	public final void method577(int arg0, int arg1) {
		field1418 = arg0;
		field1419 = arg1;
		field1420 = method42().getGraphics();
		field1421 = new CPJIVKZX(field1418, field1419, method42());
		method97(this, 1);
	}

	public void run() {
		method42().addMouseListener(this);
		method42().addMouseMotionListener(this);
		method42().addKeyListener(this);
		method42().addFocusListener(this);

		if (field1423 != null) {
			field1423.addWindowListener(this);
		}

		method87("Loading...", 0);
		method70();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field1415[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1412 < 0) {
					if (field1412 == -1) {
						method578();
					}

					return;
				}

				if (field1412 > 0) {
					field1412--;
					if (field1412 == 0) {
						method578();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field1415[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field1415[var1]) {
					var2 = (int) (field1413 * 2560 / (var11 - field1415[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field1413 - (var11 - field1415[var1]) / 10L);
				}

				if (var3 > field1413) {
					var3 = field1413;
				}

				field1415[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field1415[var13] != 0L) {
							field1415[var13] += var3;
						}
					}
				}

				if (var3 < field1414) {
					var3 = field1414;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field1434 = field1430;
					field1435 = field1431;
					field1436 = field1432;
					field1437 = field1433;
					field1430 = 0;
					method63();
					field1440 = field1441;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field1413 > 0) {
					field1416 = var2 * 1000 / (field1413 * 256);
				}

				method152();
			} while (!field1417);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field1415[var15]);
			}

			System.out.println("fps:" + field1416 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field1413 + " mindel:" + field1414);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field1417 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("ZAMJOSBM.a(I)V")
	public final void method578() {
		field1412 = -2;
		method96();

		if (field1423 != null) {
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

	@ObfuscatedName("ZAMJOSBM.a(ZI)V")
	public final void method579(int arg0) {
		field1413 = 1000 / arg0;
	}

	public final void start() {
		if (field1412 >= 0) {
			field1412 = 0;
		}
	}

	public final void stop() {
		if (field1412 >= 0) {
			field1412 = 4000 / field1413;
		}
	}

	public final void destroy() {
		field1412 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field1412 == -1) {
			method578();
		}
	}

	public final void update(Graphics arg0) {
		if (field1420 == null) {
			field1420 = arg0;
		}

		field1424 = true;
		method46();
	}

	public final void paint(Graphics arg0) {
		if (field1420 == null) {
			field1420 = arg0;
		}

		field1424 = true;
		method46();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1423 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1426 = 0;
		field1431 = var2;
		field1432 = var3;
		field1433 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field1430 = 2;
			field1427 = 2;
		} else {
			field1430 = 1;
			field1427 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field1426 = 0;
		field1427 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field1426 = 0;
		field1428 = -1;
		field1429 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1423 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1426 = 0;
		field1428 = var2;
		field1429 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1423 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1426 = 0;
		field1428 = var2;
		field1429 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field1426 = 0;
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
			field1438[var3] = 1;
		}

		if (var3 > 4) {
			field1439[field1441] = var3;
			field1441 = field1441 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field1426 = 0;
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
			field1438[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("ZAMJOSBM.b(I)I")
	public final int method580() {
		int var1 = -1;
		if (field1441 != field1440) {
			var1 = field1439[field1440];
			field1440 = field1440 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field1425 = true;
		field1424 = true;
		method46();
	}

	public final void focusLost(FocusEvent arg0) {
		field1425 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field1438[var2] = 0;
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

	@ObfuscatedName("ZAMJOSBM.a()V")
	public void method70() {
	}

	@ObfuscatedName("ZAMJOSBM.a(B)V")
	public void method63() {
	}

	@ObfuscatedName("ZAMJOSBM.b(B)V")
	public void method96() {
	}

	@ObfuscatedName("ZAMJOSBM.c(I)V")
	public void method152() {
	}

	@ObfuscatedName("ZAMJOSBM.d(I)V")
	public void method46() {
	}

	@ObfuscatedName("ZAMJOSBM.e(I)Ljava/awt/Component;")
	public Component method42() {
		if (field1423 != null) {
			return field1423;
		}

		return this;
	}

	@ObfuscatedName("ZAMJOSBM.a(Ljava/lang/Runnable;I)V")
	public void method97(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("ZAMJOSBM.a(Ljava/lang/String;IB)V")
	public void method87(String arg0, int arg1) {
		while (field1420 == null) {
			field1420 = method42().getGraphics();

			try {
				method42().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method42().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method42().getFontMetrics(var5);

		if (field1424) {
			field1420.setColor(Color.black);
			field1420.fillRect(0, 0, field1418, field1419);
			field1424 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field1419 / 2 - 18;
		field1420.setColor(var6);
		field1420.drawRect(field1418 / 2 - 152, var7, 304, 34);
		field1420.fillRect(field1418 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field1420.setColor(Color.black);
		field1420.fillRect(arg1 * 3 + field1418 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field1420.setFont(var3);
		field1420.setColor(Color.white);
		field1420.drawString(arg0, (field1418 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
