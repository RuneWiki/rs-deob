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

@ObfuscatedName("UNXTKTRJ")
public class UNXTKTRJ extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("UNXTKTRJ.g")
	public int field1311 = 20;

	@ObfuscatedName("UNXTKTRJ.h")
	public int field1312 = 1;

	@ObfuscatedName("UNXTKTRJ.i")
	public long[] field1313 = new long[10];

	@ObfuscatedName("UNXTKTRJ.k")
	public boolean field1315 = false;

	@ObfuscatedName("UNXTKTRJ.p")
	public YGMSKJOQ[] field1320 = new YGMSKJOQ[6];

	@ObfuscatedName("UNXTKTRJ.r")
	public boolean field1322 = true;

	@ObfuscatedName("UNXTKTRJ.s")
	public boolean field1323 = true;

	@ObfuscatedName("UNXTKTRJ.F")
	public int[] field1336 = new int[128];

	@ObfuscatedName("UNXTKTRJ.G")
	public int[] field1337 = new int[128];

	@ObfuscatedName("UNXTKTRJ.f")
	public int field1310;

	@ObfuscatedName("UNXTKTRJ.j")
	public int field1314;

	@ObfuscatedName("UNXTKTRJ.l")
	public int field1316;

	@ObfuscatedName("UNXTKTRJ.m")
	public int field1317;

	@ObfuscatedName("UNXTKTRJ.t")
	public int field1324;

	@ObfuscatedName("UNXTKTRJ.u")
	public int field1325;

	@ObfuscatedName("UNXTKTRJ.v")
	public int field1326;

	@ObfuscatedName("UNXTKTRJ.w")
	public int field1327;

	@ObfuscatedName("UNXTKTRJ.x")
	public int field1328;

	@ObfuscatedName("UNXTKTRJ.y")
	public int field1329;

	@ObfuscatedName("UNXTKTRJ.z")
	public int field1330;

	@ObfuscatedName("UNXTKTRJ.B")
	public int field1332;

	@ObfuscatedName("UNXTKTRJ.C")
	public int field1333;

	@ObfuscatedName("UNXTKTRJ.D")
	public int field1334;

	@ObfuscatedName("UNXTKTRJ.H")
	public int field1338;

	@ObfuscatedName("UNXTKTRJ.I")
	public int field1339;

	@ObfuscatedName("UNXTKTRJ.A")
	public long field1331;

	@ObfuscatedName("UNXTKTRJ.E")
	public long field1335;

	@ObfuscatedName("UNXTKTRJ.q")
	public LQFUVOUC field1321;

	@ObfuscatedName("UNXTKTRJ.o")
	public YQSLUNUN field1319;

	@ObfuscatedName("UNXTKTRJ.n")
	public Graphics field1318;

	@ObfuscatedName("UNXTKTRJ.a(III)V")
	public final void method481(int arg0, int arg1) {
		field1316 = arg1;
		field1317 = arg0;
		field1321 = new LQFUVOUC(field1316, field1317, this);
		field1318 = method28().getGraphics();
		field1319 = new YQSLUNUN(field1317, method28(), field1316);
		method106(this, 1);
	}

	@ObfuscatedName("UNXTKTRJ.a(IIB)V")
	public final void method482(int arg0, int arg1) {
		field1316 = arg1;
		field1317 = arg0;
		field1318 = method28().getGraphics();
		field1319 = new YQSLUNUN(field1317, method28(), field1316);
		method106(this, 1);
	}

	public void run() {
		method28().addMouseListener(this);
		method28().addMouseMotionListener(this);
		method28().addKeyListener(this);
		method28().addFocusListener(this);

		if (field1321 != null) {
			field1321.addWindowListener(this);
		}

		method107(0, "Loading...");
		method46();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field1313[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1310 < 0) {
					if (field1310 == -1) {
						method483();
					}

					return;
				}

				if (field1310 > 0) {
					field1310--;
					if (field1310 == 0) {
						method483();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field1313[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field1313[var1]) {
					var2 = (int) (field1311 * 2560 / (var11 - field1313[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field1311 - (var11 - field1313[var1]) / 10L);
				}

				if (var3 > field1311) {
					var3 = field1311;
				}

				field1313[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field1313[var13] != 0L) {
							field1313[var13] += var3;
						}
					}
				}

				if (var3 < field1312) {
					var3 = field1312;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field1332 = field1328;
					field1333 = field1329;
					field1334 = field1330;
					field1335 = field1331;
					field1328 = 0;
					method73();
					field1338 = field1339;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field1311 > 0) {
					field1314 = var2 * 1000 / (field1311 * 256);
				}

				method102();
			} while (!field1315);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field1313[var15]);
			}

			System.out.println("fps:" + field1314 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field1311 + " mindel:" + field1312);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field1315 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("UNXTKTRJ.a(B)V")
	public final void method483() {
		field1310 = -2;
		method69();

		if (field1321 != null) {
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

	@ObfuscatedName("UNXTKTRJ.a(II)V")
	public final void method484(int arg0) {
		field1311 = 1000 / arg0;
	}

	public final void start() {
		if (field1310 >= 0) {
			field1310 = 0;
		}
	}

	public final void stop() {
		if (field1310 >= 0) {
			field1310 = 4000 / field1311;
		}
	}

	public final void destroy() {
		field1310 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field1310 == -1) {
			method483();
		}
	}

	public final void update(Graphics arg0) {
		if (field1318 == null) {
			field1318 = arg0;
		}

		field1322 = true;
		method121();
	}

	public final void paint(Graphics arg0) {
		if (field1318 == null) {
			field1318 = arg0;
		}

		field1322 = true;
		method121();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1321 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1324 = 0;
		field1329 = var2;
		field1330 = var3;
		field1331 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field1328 = 2;
			field1325 = 2;
		} else {
			field1328 = 1;
			field1325 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field1324 = 0;
		field1325 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field1324 = 0;
		field1326 = -1;
		field1327 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1321 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1324 = 0;
		field1326 = var2;
		field1327 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1321 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1324 = 0;
		field1326 = var2;
		field1327 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field1324 = 0;
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
			field1336[var3] = 1;
		}

		if (var3 > 4) {
			field1337[field1339] = var3;
			field1339 = field1339 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field1324 = 0;
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
			field1336[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("UNXTKTRJ.b(B)I")
	public final int method485() {
		int var1 = -1;
		if (field1339 != field1338) {
			var1 = field1337[field1338];
			field1338 = field1338 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field1323 = true;
		field1322 = true;
		method121();
	}

	public final void focusLost(FocusEvent arg0) {
		field1323 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field1336[var2] = 0;
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

	@ObfuscatedName("UNXTKTRJ.a()V")
	public void method46() {
	}

	@ObfuscatedName("UNXTKTRJ.a(Z)V")
	public void method73() {
	}

	@ObfuscatedName("UNXTKTRJ.a(I)V")
	public void method69() {
	}

	@ObfuscatedName("UNXTKTRJ.c(B)V")
	public void method102() {
	}

	@ObfuscatedName("UNXTKTRJ.b(Z)V")
	public void method121() {
	}

	@ObfuscatedName("UNXTKTRJ.d(B)Ljava/awt/Component;")
	public Component method28() {
		if (field1321 != null) {
			return field1321;
		}

		return this;
	}

	@ObfuscatedName("UNXTKTRJ.a(Ljava/lang/Runnable;I)V")
	public void method106(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("UNXTKTRJ.a(IZLjava/lang/String;)V")
	public void method107(int arg0, String arg1) {
		while (field1318 == null) {
			field1318 = method28().getGraphics();

			try {
				method28().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method28().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method28().getFontMetrics(var5);

		if (field1322) {
			field1318.setColor(Color.black);
			field1318.fillRect(0, 0, field1316, field1317);
			field1322 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field1317 / 2 - 18;
		field1318.setColor(var6);
		field1318.drawRect(field1316 / 2 - 152, var7, 304, 34);
		field1318.fillRect(field1316 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field1318.setColor(Color.black);
		field1318.fillRect(arg0 * 3 + field1316 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field1318.setFont(var3);
		field1318.setColor(Color.white);
		field1318.drawString(arg1, (field1316 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
