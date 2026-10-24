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

@ObfuscatedName("VZUGTFOW")
public class VZUGTFOW extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("VZUGTFOW.f")
	public int field1282 = 20;

	@ObfuscatedName("VZUGTFOW.g")
	public int field1283 = 1;

	@ObfuscatedName("VZUGTFOW.h")
	public long[] field1284 = new long[10];

	@ObfuscatedName("VZUGTFOW.j")
	public boolean field1286 = false;

	@ObfuscatedName("VZUGTFOW.o")
	public YHASUFYG[] field1291 = new YHASUFYG[6];

	@ObfuscatedName("VZUGTFOW.q")
	public boolean field1293 = true;

	@ObfuscatedName("VZUGTFOW.r")
	public boolean field1294 = true;

	@ObfuscatedName("VZUGTFOW.E")
	public int[] field1307 = new int[128];

	@ObfuscatedName("VZUGTFOW.F")
	public int[] field1308 = new int[128];

	@ObfuscatedName("VZUGTFOW.e")
	public int field1281;

	@ObfuscatedName("VZUGTFOW.i")
	public int field1285;

	@ObfuscatedName("VZUGTFOW.k")
	public int field1287;

	@ObfuscatedName("VZUGTFOW.l")
	public int field1288;

	@ObfuscatedName("VZUGTFOW.s")
	public int field1295;

	@ObfuscatedName("VZUGTFOW.t")
	public int field1296;

	@ObfuscatedName("VZUGTFOW.u")
	public int field1297;

	@ObfuscatedName("VZUGTFOW.v")
	public int field1298;

	@ObfuscatedName("VZUGTFOW.w")
	public int field1299;

	@ObfuscatedName("VZUGTFOW.x")
	public int field1300;

	@ObfuscatedName("VZUGTFOW.y")
	public int field1301;

	@ObfuscatedName("VZUGTFOW.A")
	public int field1303;

	@ObfuscatedName("VZUGTFOW.B")
	public int field1304;

	@ObfuscatedName("VZUGTFOW.C")
	public int field1305;

	@ObfuscatedName("VZUGTFOW.G")
	public int field1309;

	@ObfuscatedName("VZUGTFOW.H")
	public int field1310;

	@ObfuscatedName("VZUGTFOW.z")
	public long field1302;

	@ObfuscatedName("VZUGTFOW.D")
	public long field1306;

	@ObfuscatedName("VZUGTFOW.p")
	public PNNSUEUM field1292;

	@ObfuscatedName("VZUGTFOW.n")
	public SKZHQGHX field1290;

	@ObfuscatedName("VZUGTFOW.m")
	public Graphics field1289;

	@ObfuscatedName("VZUGTFOW.a(III)V")
	public final void method511(int arg0, int arg1) {
		field1287 = arg0;
		field1288 = arg1;
		field1292 = new PNNSUEUM(field1287, field1288, this);
		field1289 = method44().getGraphics();
		field1290 = new SKZHQGHX(field1288, field1287, method44());
		method36(this, 1);
	}

	@ObfuscatedName("VZUGTFOW.b(III)V")
	public final void method512(int arg0, int arg1) {
		field1287 = arg1;
		field1288 = arg0;
		field1289 = method44().getGraphics();
		field1290 = new SKZHQGHX(field1288, field1287, method44());
		method36(this, 1);
	}

	public void run() {
		method44().addMouseListener(this);
		method44().addMouseMotionListener(this);
		method44().addKeyListener(this);
		method44().addFocusListener(this);

		if (field1292 != null) {
			field1292.addWindowListener(this);
		}

		method83(0, "Loading...");
		method116();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field1284[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1281 < 0) {
					if (field1281 == -1) {
						method513();
					}

					return;
				}

				if (field1281 > 0) {
					field1281--;
					if (field1281 == 0) {
						method513();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field1284[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field1284[var1]) {
					var2 = (int) (field1282 * 2560 / (var11 - field1284[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field1282 - (var11 - field1284[var1]) / 10L);
				}

				if (var3 > field1282) {
					var3 = field1282;
				}

				field1284[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field1284[var13] != 0L) {
							field1284[var13] += var3;
						}
					}
				}

				if (var3 < field1283) {
					var3 = field1283;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field1303 = field1299;
					field1304 = field1300;
					field1305 = field1301;
					field1306 = field1302;
					field1299 = 0;
					method152();
					field1309 = field1310;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field1282 > 0) {
					field1285 = var2 * 1000 / (field1282 * 256);
				}

				method53();
			} while (!field1286);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field1284[var15]);
			}

			System.out.println("fps:" + field1285 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field1282 + " mindel:" + field1283);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field1286 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("VZUGTFOW.a(I)V")
	public final void method513() {
		field1281 = -2;
		method110();

		if (field1292 != null) {
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

	@ObfuscatedName("VZUGTFOW.a(II)V")
	public final void method514(int arg0) {
		field1282 = 1000 / arg0;
	}

	public final void start() {
		if (field1281 >= 0) {
			field1281 = 0;
		}
	}

	public final void stop() {
		if (field1281 >= 0) {
			field1281 = 4000 / field1282;
		}
	}

	public final void destroy() {
		field1281 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field1281 == -1) {
			method513();
		}
	}

	public final void update(Graphics arg0) {
		if (field1289 == null) {
			field1289 = arg0;
		}

		field1293 = true;
		method96();
	}

	public final void paint(Graphics arg0) {
		if (field1289 == null) {
			field1289 = arg0;
		}

		field1293 = true;
		method96();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1292 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1295 = 0;
		field1300 = var2;
		field1301 = var3;
		field1302 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field1299 = 2;
			field1296 = 2;
		} else {
			field1299 = 1;
			field1296 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field1295 = 0;
		field1296 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field1295 = 0;
		field1297 = -1;
		field1298 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1292 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1295 = 0;
		field1297 = var2;
		field1298 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1292 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1295 = 0;
		field1297 = var2;
		field1298 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field1295 = 0;
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
			field1307[var3] = 1;
		}

		if (var3 > 4) {
			field1308[field1310] = var3;
			field1310 = field1310 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field1295 = 0;
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
			field1307[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("VZUGTFOW.b(I)I")
	public final int method515() {
		int var1 = -1;
		if (field1310 != field1309) {
			var1 = field1308[field1309];
			field1309 = field1309 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field1294 = true;
		field1293 = true;
		method96();
	}

	public final void focusLost(FocusEvent arg0) {
		field1294 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field1307[var2] = 0;
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

	@ObfuscatedName("VZUGTFOW.a()V")
	public void method116() {
	}

	@ObfuscatedName("VZUGTFOW.c(I)V")
	public void method152() {
	}

	@ObfuscatedName("VZUGTFOW.d(I)V")
	public void method110() {
	}

	@ObfuscatedName("VZUGTFOW.a(B)V")
	public void method53() {
	}

	@ObfuscatedName("VZUGTFOW.e(I)V")
	public void method96() {
	}

	@ObfuscatedName("VZUGTFOW.b(B)Ljava/awt/Component;")
	public Component method44() {
		if (field1292 != null) {
			return field1292;
		}

		return this;
	}

	@ObfuscatedName("VZUGTFOW.a(Ljava/lang/Runnable;I)V")
	public void method36(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("VZUGTFOW.a(ZILjava/lang/String;)V")
	public void method83(int arg0, String arg1) {
		while (field1289 == null) {
			field1289 = method44().getGraphics();

			try {
				method44().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method44().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method44().getFontMetrics(var5);

		if (field1293) {
			field1289.setColor(Color.black);
			field1289.fillRect(0, 0, field1287, field1288);
			field1293 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field1288 / 2 - 18;
		field1289.setColor(var6);
		field1289.drawRect(field1287 / 2 - 152, var7, 304, 34);
		field1289.fillRect(field1287 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field1289.setColor(Color.black);
		field1289.fillRect(arg0 * 3 + field1287 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field1289.setFont(var3);
		field1289.setColor(Color.white);
		field1289.drawString(arg1, (field1287 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
