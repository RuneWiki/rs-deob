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

@ObfuscatedName("RMDQJLZZ")
public class RMDQJLZZ extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("RMDQJLZZ.e")
	public int field1169 = 20;

	@ObfuscatedName("RMDQJLZZ.f")
	public int field1170 = 1;

	@ObfuscatedName("RMDQJLZZ.g")
	public long[] field1171 = new long[10];

	@ObfuscatedName("RMDQJLZZ.i")
	public boolean field1173 = false;

	@ObfuscatedName("RMDQJLZZ.n")
	public TPUDHOHI[] field1178 = new TPUDHOHI[6];

	@ObfuscatedName("RMDQJLZZ.p")
	public boolean field1180 = true;

	@ObfuscatedName("RMDQJLZZ.q")
	public boolean field1181 = true;

	@ObfuscatedName("RMDQJLZZ.D")
	public int[] field1194 = new int[128];

	@ObfuscatedName("RMDQJLZZ.E")
	public int[] field1195 = new int[128];

	@ObfuscatedName("RMDQJLZZ.d")
	public int field1168;

	@ObfuscatedName("RMDQJLZZ.h")
	public int field1172;

	@ObfuscatedName("RMDQJLZZ.j")
	public int field1174;

	@ObfuscatedName("RMDQJLZZ.k")
	public int field1175;

	@ObfuscatedName("RMDQJLZZ.r")
	public int field1182;

	@ObfuscatedName("RMDQJLZZ.s")
	public int field1183;

	@ObfuscatedName("RMDQJLZZ.t")
	public int field1184;

	@ObfuscatedName("RMDQJLZZ.u")
	public int field1185;

	@ObfuscatedName("RMDQJLZZ.v")
	public int field1186;

	@ObfuscatedName("RMDQJLZZ.w")
	public int field1187;

	@ObfuscatedName("RMDQJLZZ.x")
	public int field1188;

	@ObfuscatedName("RMDQJLZZ.z")
	public int field1190;

	@ObfuscatedName("RMDQJLZZ.A")
	public int field1191;

	@ObfuscatedName("RMDQJLZZ.B")
	public int field1192;

	@ObfuscatedName("RMDQJLZZ.F")
	public int field1196;

	@ObfuscatedName("RMDQJLZZ.G")
	public int field1197;

	@ObfuscatedName("RMDQJLZZ.y")
	public long field1189;

	@ObfuscatedName("RMDQJLZZ.C")
	public long field1193;

	@ObfuscatedName("RMDQJLZZ.o")
	public IWUEUKZJ field1179;

	@ObfuscatedName("RMDQJLZZ.m")
	public VFZXUVTW field1177;

	@ObfuscatedName("RMDQJLZZ.l")
	public Graphics field1176;

	@ObfuscatedName("RMDQJLZZ.a(III)V")
	public final void method414(int arg0, int arg1) {
		field1174 = arg1;
		field1175 = arg0;
		field1179 = new IWUEUKZJ(field1174, this, field1175);
		field1176 = method167().getGraphics();
		field1177 = new VFZXUVTW(field1175, field1174, method167());
		method108(this, 1);
	}

	@ObfuscatedName("RMDQJLZZ.a(IIB)V")
	public final void method415(int arg0, int arg1) {
		field1174 = arg0;
		field1175 = arg1;
		field1176 = method167().getGraphics();
		field1177 = new VFZXUVTW(field1175, field1174, method167());
		method108(this, 1);
	}

	public void run() {
		method167().addMouseListener(this);
		method167().addMouseMotionListener(this);
		method167().addKeyListener(this);
		method167().addFocusListener(this);

		if (field1179 != null) {
			field1179.addWindowListener(this);
		}

		method61(0, "Loading...");
		method158();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field1171[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1168 < 0) {
					if (field1168 == -1) {
						method416();
					}

					return;
				}

				if (field1168 > 0) {
					field1168--;
					if (field1168 == 0) {
						method416();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field1171[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field1171[var1]) {
					var2 = (int) (field1169 * 2560 / (var11 - field1171[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field1169 - (var11 - field1171[var1]) / 10L);
				}

				if (var3 > field1169) {
					var3 = field1169;
				}

				field1171[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field1171[var13] != 0L) {
							field1171[var13] += var3;
						}
					}
				}

				if (var3 < field1170) {
					var3 = field1170;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field1190 = field1186;
					field1191 = field1187;
					field1192 = field1188;
					field1193 = field1189;
					field1186 = 0;
					method46();
					field1196 = field1197;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field1169 > 0) {
					field1172 = var2 * 1000 / (field1169 * 256);
				}

				method137();
			} while (!field1173);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field1171[var15]);
			}

			System.out.println("fps:" + field1172 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field1169 + " mindel:" + field1170);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field1173 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("RMDQJLZZ.a(I)V")
	public final void method416() {
		field1168 = -2;
		method132();

		if (field1179 != null) {
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

	@ObfuscatedName("RMDQJLZZ.a(II)V")
	public final void method417(int arg0) {
		field1169 = 1000 / arg0;
	}

	public final void start() {
		if (field1168 >= 0) {
			field1168 = 0;
		}
	}

	public final void stop() {
		if (field1168 >= 0) {
			field1168 = 4000 / field1169;
		}
	}

	public final void destroy() {
		field1168 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field1168 == -1) {
			method416();
		}
	}

	public final void update(Graphics arg0) {
		if (field1176 == null) {
			field1176 = arg0;
		}

		field1180 = true;
		method110();
	}

	public final void paint(Graphics arg0) {
		if (field1176 == null) {
			field1176 = arg0;
		}

		field1180 = true;
		method110();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1179 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1182 = 0;
		field1187 = var2;
		field1188 = var3;
		field1189 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field1186 = 2;
			field1183 = 2;
		} else {
			field1186 = 1;
			field1183 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field1182 = 0;
		field1183 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field1182 = 0;
		field1184 = -1;
		field1185 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1179 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1182 = 0;
		field1184 = var2;
		field1185 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1179 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1182 = 0;
		field1184 = var2;
		field1185 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field1182 = 0;
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
			field1194[var3] = 1;
		}

		if (var3 > 4) {
			field1195[field1197] = var3;
			field1197 = field1197 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field1182 = 0;
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
			field1194[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("RMDQJLZZ.a(Z)I")
	public final int method418() {
		int var1 = -1;
		if (field1197 != field1196) {
			var1 = field1195[field1196];
			field1196 = field1196 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field1181 = true;
		field1180 = true;
		method110();
	}

	public final void focusLost(FocusEvent arg0) {
		field1181 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field1194[var2] = 0;
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

	@ObfuscatedName("RMDQJLZZ.a()V")
	public void method158() {
	}

	@ObfuscatedName("RMDQJLZZ.b(I)V")
	public void method46() {
	}

	@ObfuscatedName("RMDQJLZZ.a(B)V")
	public void method132() {
	}

	@ObfuscatedName("RMDQJLZZ.b(B)V")
	public void method137() {
	}

	@ObfuscatedName("RMDQJLZZ.c(I)V")
	public void method110() {
	}

	@ObfuscatedName("RMDQJLZZ.d(I)Ljava/awt/Component;")
	public Component method167() {
		if (field1179 != null) {
			return field1179;
		}

		return this;
	}

	@ObfuscatedName("RMDQJLZZ.a(Ljava/lang/Runnable;I)V")
	public void method108(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("RMDQJLZZ.a(IBLjava/lang/String;)V")
	public void method61(int arg0, String arg1) {
		while (field1176 == null) {
			field1176 = method167().getGraphics();

			try {
				method167().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method167().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method167().getFontMetrics(var5);

		if (field1180) {
			field1176.setColor(Color.black);
			field1176.fillRect(0, 0, field1174, field1175);
			field1180 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field1175 / 2 - 18;
		field1176.setColor(var6);
		field1176.drawRect(field1174 / 2 - 152, var7, 304, 34);
		field1176.fillRect(field1174 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field1176.setColor(Color.black);
		field1176.fillRect(arg0 * 3 + field1174 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field1176.setFont(var3);
		field1176.setColor(Color.white);
		field1176.drawString(arg1, (field1174 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
