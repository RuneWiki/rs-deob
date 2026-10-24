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

@ObfuscatedName("SXKUAOFD")
public class SXKUAOFD extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("SXKUAOFD.g")
	public int field1201 = 20;

	@ObfuscatedName("SXKUAOFD.h")
	public int field1202 = 1;

	@ObfuscatedName("SXKUAOFD.i")
	public long[] field1203 = new long[10];

	@ObfuscatedName("SXKUAOFD.k")
	public boolean field1205 = false;

	@ObfuscatedName("SXKUAOFD.p")
	public NDGQUJMA[] field1210 = new NDGQUJMA[6];

	@ObfuscatedName("SXKUAOFD.r")
	public boolean field1212 = true;

	@ObfuscatedName("SXKUAOFD.s")
	public boolean field1213 = true;

	@ObfuscatedName("SXKUAOFD.F")
	public int[] field1226 = new int[128];

	@ObfuscatedName("SXKUAOFD.G")
	public int[] field1227 = new int[128];

	@ObfuscatedName("SXKUAOFD.f")
	public int field1200;

	@ObfuscatedName("SXKUAOFD.j")
	public int field1204;

	@ObfuscatedName("SXKUAOFD.l")
	public int field1206;

	@ObfuscatedName("SXKUAOFD.m")
	public int field1207;

	@ObfuscatedName("SXKUAOFD.t")
	public int field1214;

	@ObfuscatedName("SXKUAOFD.u")
	public int field1215;

	@ObfuscatedName("SXKUAOFD.v")
	public int field1216;

	@ObfuscatedName("SXKUAOFD.w")
	public int field1217;

	@ObfuscatedName("SXKUAOFD.x")
	public int field1218;

	@ObfuscatedName("SXKUAOFD.y")
	public int field1219;

	@ObfuscatedName("SXKUAOFD.z")
	public int field1220;

	@ObfuscatedName("SXKUAOFD.B")
	public int field1222;

	@ObfuscatedName("SXKUAOFD.C")
	public int field1223;

	@ObfuscatedName("SXKUAOFD.D")
	public int field1224;

	@ObfuscatedName("SXKUAOFD.H")
	public int field1228;

	@ObfuscatedName("SXKUAOFD.I")
	public int field1229;

	@ObfuscatedName("SXKUAOFD.A")
	public long field1221;

	@ObfuscatedName("SXKUAOFD.E")
	public long field1225;

	@ObfuscatedName("SXKUAOFD.q")
	public SZXWXMTH field1211;

	@ObfuscatedName("SXKUAOFD.o")
	public ZTWZAULT field1209;

	@ObfuscatedName("SXKUAOFD.n")
	public Graphics field1208;

	@ObfuscatedName("SXKUAOFD.a(III)V")
	public final void method514(int arg0, int arg1) {
		field1206 = arg0;
		field1207 = arg1;
		field1211 = new SZXWXMTH(field1207, field1206, this);
		field1208 = method271().getGraphics();
		field1209 = new ZTWZAULT(method271(), field1206, field1207);
		method180(this, 1);
	}

	@ObfuscatedName("SXKUAOFD.b(III)V")
	public final void method515(int arg0, int arg1) {
		field1206 = arg0;
		field1207 = arg1;
		field1208 = method271().getGraphics();
		field1209 = new ZTWZAULT(method271(), field1206, field1207);
		method180(this, 1);
	}

	public void run() {
		method271().addMouseListener(this);
		method271().addMouseMotionListener(this);
		method271().addKeyListener(this);
		method271().addFocusListener(this);

		if (field1211 != null) {
			field1211.addWindowListener(this);
		}

		method169("Loading...", 0);
		method162();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field1203[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1200 < 0) {
					if (field1200 == -1) {
						method516();
					}

					return;
				}

				if (field1200 > 0) {
					field1200--;
					if (field1200 == 0) {
						method516();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field1203[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field1203[var1]) {
					var2 = (int) (field1201 * 2560 / (var11 - field1203[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field1201 - (var11 - field1203[var1]) / 10L);
				}

				if (var3 > field1201) {
					var3 = field1201;
				}

				field1203[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field1203[var13] != 0L) {
							field1203[var13] += var3;
						}
					}
				}

				if (var3 < field1202) {
					var3 = field1202;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field1222 = field1218;
					field1223 = field1219;
					field1224 = field1220;
					field1225 = field1221;
					field1218 = 0;
					method279();
					field1228 = field1229;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field1201 > 0) {
					field1204 = var2 * 1000 / (field1201 * 256);
				}

				method276();
			} while (!field1205);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field1203[var15]);
			}

			System.out.println("fps:" + field1204 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field1201 + " mindel:" + field1202);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field1205 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("SXKUAOFD.a(I)V")
	public final void method516() {
		field1200 = -2;
		method216();

		if (field1211 != null) {
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

	@ObfuscatedName("SXKUAOFD.a(ZI)V")
	public final void method517(int arg0) {
		field1201 = 1000 / arg0;
	}

	public final void start() {
		if (field1200 >= 0) {
			field1200 = 0;
		}
	}

	public final void stop() {
		if (field1200 >= 0) {
			field1200 = 4000 / field1201;
		}
	}

	public final void destroy() {
		field1200 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field1200 == -1) {
			method516();
		}
	}

	public final void update(Graphics arg0) {
		if (field1208 == null) {
			field1208 = arg0;
		}

		field1212 = true;
		method261();
	}

	public final void paint(Graphics arg0) {
		if (field1208 == null) {
			field1208 = arg0;
		}

		field1212 = true;
		method261();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1211 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1214 = 0;
		field1219 = var2;
		field1220 = var3;
		field1221 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field1218 = 2;
			field1215 = 2;
		} else {
			field1218 = 1;
			field1215 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field1214 = 0;
		field1215 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field1214 = 0;
		field1216 = -1;
		field1217 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1211 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1214 = 0;
		field1216 = var2;
		field1217 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1211 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1214 = 0;
		field1216 = var2;
		field1217 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field1214 = 0;
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
			field1226[var3] = 1;
		}

		if (var3 > 4) {
			field1227[field1229] = var3;
			field1229 = field1229 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field1214 = 0;
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
			field1226[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("SXKUAOFD.a(Z)I")
	public final int method518() {
		int var1 = -1;
		if (field1229 != field1228) {
			var1 = field1227[field1228];
			field1228 = field1228 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field1213 = true;
		field1212 = true;
		method261();
	}

	public final void focusLost(FocusEvent arg0) {
		field1213 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field1226[var2] = 0;
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

	@ObfuscatedName("SXKUAOFD.a()V")
	public void method162() {
	}

	@ObfuscatedName("SXKUAOFD.b(Z)V")
	public void method279() {
	}

	@ObfuscatedName("SXKUAOFD.c(Z)V")
	public void method216() {
	}

	@ObfuscatedName("SXKUAOFD.b(I)V")
	public void method276() {
	}

	@ObfuscatedName("SXKUAOFD.c(I)V")
	public void method261() {
	}

	@ObfuscatedName("SXKUAOFD.d(I)Ljava/awt/Component;")
	public Component method271() {
		if (field1211 != null) {
			return field1211;
		}

		return this;
	}

	@ObfuscatedName("SXKUAOFD.a(Ljava/lang/Runnable;I)V")
	public void method180(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("SXKUAOFD.a(Ljava/lang/String;IB)V")
	public void method169(String arg0, int arg1) {
		while (field1208 == null) {
			field1208 = method271().getGraphics();

			try {
				method271().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method271().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method271().getFontMetrics(var5);

		if (field1212) {
			field1208.setColor(Color.black);
			field1208.fillRect(0, 0, field1206, field1207);
			field1212 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field1207 / 2 - 18;
		field1208.setColor(var6);
		field1208.drawRect(field1206 / 2 - 152, var7, 304, 34);
		field1208.fillRect(field1206 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field1208.setColor(Color.black);
		field1208.fillRect(arg1 * 3 + field1206 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field1208.setFont(var3);
		field1208.setColor(Color.white);
		field1208.drawString(arg0, (field1206 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
