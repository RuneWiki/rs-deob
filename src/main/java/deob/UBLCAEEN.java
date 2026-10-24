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

@ObfuscatedName("UBLCAEEN")
public class UBLCAEEN extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("UBLCAEEN.b")
	public boolean field1190 = true;

	@ObfuscatedName("UBLCAEEN.f")
	public int field1192 = 20;

	@ObfuscatedName("UBLCAEEN.g")
	public int field1193 = 1;

	@ObfuscatedName("UBLCAEEN.h")
	public long[] field1194 = new long[10];

	@ObfuscatedName("UBLCAEEN.j")
	public boolean field1196 = false;

	@ObfuscatedName("UBLCAEEN.o")
	public TFHGRYAS[] field1201 = new TFHGRYAS[6];

	@ObfuscatedName("UBLCAEEN.q")
	public boolean field1203 = true;

	@ObfuscatedName("UBLCAEEN.r")
	public boolean field1204 = true;

	@ObfuscatedName("UBLCAEEN.E")
	public int[] field1217 = new int[128];

	@ObfuscatedName("UBLCAEEN.F")
	public int[] field1218 = new int[128];

	@ObfuscatedName("UBLCAEEN.e")
	public int field1191;

	@ObfuscatedName("UBLCAEEN.i")
	public int field1195;

	@ObfuscatedName("UBLCAEEN.k")
	public int field1197;

	@ObfuscatedName("UBLCAEEN.l")
	public int field1198;

	@ObfuscatedName("UBLCAEEN.s")
	public int field1205;

	@ObfuscatedName("UBLCAEEN.t")
	public int field1206;

	@ObfuscatedName("UBLCAEEN.u")
	public int field1207;

	@ObfuscatedName("UBLCAEEN.v")
	public int field1208;

	@ObfuscatedName("UBLCAEEN.w")
	public int field1209;

	@ObfuscatedName("UBLCAEEN.x")
	public int field1210;

	@ObfuscatedName("UBLCAEEN.y")
	public int field1211;

	@ObfuscatedName("UBLCAEEN.A")
	public int field1213;

	@ObfuscatedName("UBLCAEEN.B")
	public int field1214;

	@ObfuscatedName("UBLCAEEN.C")
	public int field1215;

	@ObfuscatedName("UBLCAEEN.G")
	public int field1219;

	@ObfuscatedName("UBLCAEEN.H")
	public int field1220;

	@ObfuscatedName("UBLCAEEN.z")
	public long field1212;

	@ObfuscatedName("UBLCAEEN.D")
	public long field1216;

	@ObfuscatedName("UBLCAEEN.n")
	public XBLPPVAP field1200;

	@ObfuscatedName("UBLCAEEN.p")
	public ZQDWDFIV field1202;

	@ObfuscatedName("UBLCAEEN.m")
	public Graphics field1199;

	@ObfuscatedName("UBLCAEEN.a(III)V")
	public final void method432(int arg0, int arg1) {
		field1197 = arg1;
		field1198 = arg0;
		field1202 = new ZQDWDFIV(field1198, field1197, this);
		field1199 = method119().getGraphics();
		field1200 = new XBLPPVAP(method119(), field1197, field1198);
		method185(this, 1);
	}

	@ObfuscatedName("UBLCAEEN.b(III)V")
	public final void method433(int arg0, int arg1) {
		field1197 = arg1;
		field1198 = arg0;
		field1199 = method119().getGraphics();
		field1200 = new XBLPPVAP(method119(), field1197, field1198);
		method185(this, 1);
	}

	public void run() {
		method119().addMouseListener(this);
		method119().addMouseMotionListener(this);
		method119().addKeyListener(this);
		method119().addFocusListener(this);

		if (field1202 != null) {
			field1202.addWindowListener(this);
		}

		method98("Loading...", 0);
		method81();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field1194[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1191 < 0) {
					if (field1191 == -1) {
						method434();
					}

					return;
				}

				if (field1191 > 0) {
					field1191--;
					if (field1191 == 0) {
						method434();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field1194[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field1194[var1]) {
					var2 = (int) (field1192 * 2560 / (var11 - field1194[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field1192 - (var11 - field1194[var1]) / 10L);
				}

				if (var3 > field1192) {
					var3 = field1192;
				}

				field1194[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field1194[var13] != 0L) {
							field1194[var13] += var3;
						}
					}
				}

				if (var3 < field1193) {
					var3 = field1193;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field1213 = field1209;
					field1214 = field1210;
					field1215 = field1211;
					field1216 = field1212;
					field1209 = 0;
					method52(field1190);
					field1219 = field1220;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field1192 > 0) {
					field1195 = var2 * 1000 / (field1192 * 256);
				}

				method90();
			} while (!field1196);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field1194[var15]);
			}

			System.out.println("fps:" + field1195 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field1192 + " mindel:" + field1193);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field1196 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("UBLCAEEN.a(Z)V")
	public final void method434() {
		field1191 = -2;
		method48();

		if (field1202 != null) {
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

	@ObfuscatedName("UBLCAEEN.a(II)V")
	public final void method435(int arg0) {
		field1192 = 1000 / arg0;
	}

	public final void start() {
		if (field1191 >= 0) {
			field1191 = 0;
		}
	}

	public final void stop() {
		if (field1191 >= 0) {
			field1191 = 4000 / field1192;
		}
	}

	public final void destroy() {
		field1191 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field1191 == -1) {
			method434();
		}
	}

	public final void update(Graphics arg0) {
		if (field1199 == null) {
			field1199 = arg0;
		}

		field1203 = true;
		method108();
	}

	public final void paint(Graphics arg0) {
		if (field1199 == null) {
			field1199 = arg0;
		}

		field1203 = true;
		method108();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1202 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1205 = 0;
		field1210 = var2;
		field1211 = var3;
		field1212 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field1209 = 2;
			field1206 = 2;
		} else {
			field1209 = 1;
			field1206 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field1205 = 0;
		field1206 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field1205 = 0;
		field1207 = -1;
		field1208 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1202 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1205 = 0;
		field1207 = var2;
		field1208 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1202 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1205 = 0;
		field1207 = var2;
		field1208 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field1205 = 0;
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
			field1217[var3] = 1;
		}

		if (var3 > 4) {
			field1218[field1220] = var3;
			field1220 = field1220 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field1205 = 0;
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
			field1217[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("UBLCAEEN.a(I)I")
	public final int method436() {
		int var1 = -1;
		if (field1220 != field1219) {
			var1 = field1218[field1219];
			field1219 = field1219 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field1204 = true;
		field1203 = true;
		method108();
	}

	public final void focusLost(FocusEvent arg0) {
		field1204 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field1217[var2] = 0;
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

	@ObfuscatedName("UBLCAEEN.a()V")
	public void method81() {
	}

	@ObfuscatedName("UBLCAEEN.b(Z)V")
	public void method52(boolean arg0) {
		if (!arg0) {
			field1190 = !field1190;
		}
	}

	@ObfuscatedName("UBLCAEEN.b(I)V")
	public void method48() {
	}

	@ObfuscatedName("UBLCAEEN.a(B)V")
	public void method90() {
	}

	@ObfuscatedName("UBLCAEEN.c(Z)V")
	public void method108() {
	}

	@ObfuscatedName("UBLCAEEN.b(B)Ljava/awt/Component;")
	public Component method119() {
		if (field1202 != null) {
			return field1202;
		}

		return this;
	}

	@ObfuscatedName("UBLCAEEN.a(Ljava/lang/Runnable;I)V")
	public void method185(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("UBLCAEEN.a(Ljava/lang/String;IB)V")
	public void method98(String arg0, int arg1) {
		while (field1199 == null) {
			field1199 = method119().getGraphics();

			try {
				method119().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method119().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method119().getFontMetrics(var5);

		if (field1203) {
			field1199.setColor(Color.black);
			field1199.fillRect(0, 0, field1197, field1198);
			field1203 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field1198 / 2 - 18;
		field1199.setColor(var6);
		field1199.drawRect(field1197 / 2 - 152, var7, 304, 34);
		field1199.fillRect(field1197 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field1199.setColor(Color.black);
		field1199.fillRect(arg1 * 3 + field1197 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field1199.setFont(var3);
		field1199.setColor(Color.white);
		field1199.drawString(arg0, (field1197 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
