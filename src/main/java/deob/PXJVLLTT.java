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

@ObfuscatedName("PXJVLLTT")
public class PXJVLLTT extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("PXJVLLTT.f")
	public int field1072 = 20;

	@ObfuscatedName("PXJVLLTT.g")
	public int field1073 = 1;

	@ObfuscatedName("PXJVLLTT.h")
	public long[] field1074 = new long[10];

	@ObfuscatedName("PXJVLLTT.j")
	public boolean field1076 = false;

	@ObfuscatedName("PXJVLLTT.o")
	public TTFRDWZK[] field1081 = new TTFRDWZK[6];

	@ObfuscatedName("PXJVLLTT.q")
	public boolean field1083 = true;

	@ObfuscatedName("PXJVLLTT.r")
	public boolean field1084 = true;

	@ObfuscatedName("PXJVLLTT.E")
	public int[] field1097 = new int[128];

	@ObfuscatedName("PXJVLLTT.F")
	public int[] field1098 = new int[128];

	@ObfuscatedName("PXJVLLTT.e")
	public int field1071;

	@ObfuscatedName("PXJVLLTT.i")
	public int field1075;

	@ObfuscatedName("PXJVLLTT.k")
	public int field1077;

	@ObfuscatedName("PXJVLLTT.l")
	public int field1078;

	@ObfuscatedName("PXJVLLTT.s")
	public int field1085;

	@ObfuscatedName("PXJVLLTT.t")
	public int field1086;

	@ObfuscatedName("PXJVLLTT.u")
	public int field1087;

	@ObfuscatedName("PXJVLLTT.v")
	public int field1088;

	@ObfuscatedName("PXJVLLTT.w")
	public int field1089;

	@ObfuscatedName("PXJVLLTT.x")
	public int field1090;

	@ObfuscatedName("PXJVLLTT.y")
	public int field1091;

	@ObfuscatedName("PXJVLLTT.A")
	public int field1093;

	@ObfuscatedName("PXJVLLTT.B")
	public int field1094;

	@ObfuscatedName("PXJVLLTT.C")
	public int field1095;

	@ObfuscatedName("PXJVLLTT.G")
	public int field1099;

	@ObfuscatedName("PXJVLLTT.H")
	public int field1100;

	@ObfuscatedName("PXJVLLTT.z")
	public long field1092;

	@ObfuscatedName("PXJVLLTT.D")
	public long field1096;

	@ObfuscatedName("PXJVLLTT.n")
	public BEVLZSVU field1080;

	@ObfuscatedName("PXJVLLTT.p")
	public RBKIQEVU field1082;

	@ObfuscatedName("PXJVLLTT.m")
	public Graphics field1079;

	@ObfuscatedName("PXJVLLTT.a(III)V")
	public final void method442(int arg0, int arg1) {
		field1077 = arg1;
		field1078 = arg0;
		field1082 = new RBKIQEVU(this, field1077, field1078);
		field1079 = method161().getGraphics();
		field1080 = new BEVLZSVU(field1078, field1077, method161());
		method135(this, 1);
	}

	@ObfuscatedName("PXJVLLTT.a(IBI)V")
	public final void method443(int arg0, int arg1) {
		field1077 = arg0;
		field1078 = arg1;
		field1079 = method161().getGraphics();
		field1080 = new BEVLZSVU(field1078, field1077, method161());
		method135(this, 1);
	}

	public void run() {
		method161().addMouseListener(this);
		method161().addMouseMotionListener(this);
		method161().addKeyListener(this);
		method161().addFocusListener(this);

		if (field1082 != null) {
			field1082.addWindowListener(this);
		}

		method138("Loading...", 0);
		method61();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field1074[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1071 < 0) {
					if (field1071 == -1) {
						method444();
					}

					return;
				}

				if (field1071 > 0) {
					field1071--;
					if (field1071 == 0) {
						method444();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field1074[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field1074[var1]) {
					var2 = (int) (field1072 * 2560 / (var11 - field1074[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field1072 - (var11 - field1074[var1]) / 10L);
				}

				if (var3 > field1072) {
					var3 = field1072;
				}

				field1074[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field1074[var13] != 0L) {
							field1074[var13] += var3;
						}
					}
				}

				if (var3 < field1073) {
					var3 = field1073;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field1093 = field1089;
					field1094 = field1090;
					field1095 = field1091;
					field1096 = field1092;
					field1089 = 0;
					method144();
					field1099 = field1100;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field1072 > 0) {
					field1075 = var2 * 1000 / (field1072 * 256);
				}

				method151();
			} while (!field1076);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field1074[var15]);
			}

			System.out.println("fps:" + field1075 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field1072 + " mindel:" + field1073);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field1076 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("PXJVLLTT.a(Z)V")
	public final void method444() {
		field1071 = -2;
		method167();

		if (field1082 != null) {
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

	@ObfuscatedName("PXJVLLTT.a(BI)V")
	public final void method445(int arg0) {
		field1072 = 1000 / arg0;
	}

	public final void start() {
		if (field1071 >= 0) {
			field1071 = 0;
		}
	}

	public final void stop() {
		if (field1071 >= 0) {
			field1071 = 4000 / field1072;
		}
	}

	public final void destroy() {
		field1071 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field1071 == -1) {
			method444();
		}
	}

	public final void update(Graphics arg0) {
		if (field1079 == null) {
			field1079 = arg0;
		}

		field1083 = true;
		method163();
	}

	public final void paint(Graphics arg0) {
		if (field1079 == null) {
			field1079 = arg0;
		}

		field1083 = true;
		method163();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1082 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1085 = 0;
		field1090 = var2;
		field1091 = var3;
		field1092 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field1089 = 2;
			field1086 = 2;
		} else {
			field1089 = 1;
			field1086 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field1085 = 0;
		field1086 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field1085 = 0;
		field1087 = -1;
		field1088 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1082 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1085 = 0;
		field1087 = var2;
		field1088 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1082 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1085 = 0;
		field1087 = var2;
		field1088 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field1085 = 0;
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
			field1097[var3] = 1;
		}

		if (var3 > 4) {
			field1098[field1100] = var3;
			field1100 = field1100 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field1085 = 0;
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
			field1097[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("PXJVLLTT.b(Z)I")
	public final int method446() {
		int var1 = -1;
		if (field1100 != field1099) {
			var1 = field1098[field1099];
			field1099 = field1099 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field1084 = true;
		field1083 = true;
		method163();
	}

	public final void focusLost(FocusEvent arg0) {
		field1084 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field1097[var2] = 0;
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

	@ObfuscatedName("PXJVLLTT.a()V")
	public void method61() {
	}

	@ObfuscatedName("PXJVLLTT.a(I)V")
	public void method144() {
	}

	@ObfuscatedName("PXJVLLTT.b(I)V")
	public void method167() {
	}

	@ObfuscatedName("PXJVLLTT.c(I)V")
	public void method151() {
	}

	@ObfuscatedName("PXJVLLTT.c(Z)V")
	public void method163() {
	}

	@ObfuscatedName("PXJVLLTT.d(I)Ljava/awt/Component;")
	public Component method161() {
		if (field1082 != null) {
			return field1082;
		}

		return this;
	}

	@ObfuscatedName("PXJVLLTT.a(Ljava/lang/Runnable;I)V")
	public void method135(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("PXJVLLTT.a(Ljava/lang/String;II)V")
	public void method138(String arg0, int arg1) {
		while (field1079 == null) {
			field1079 = method161().getGraphics();

			try {
				method161().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method161().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method161().getFontMetrics(var5);

		if (field1083) {
			field1079.setColor(Color.black);
			field1079.fillRect(0, 0, field1077, field1078);
			field1083 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field1078 / 2 - 18;
		field1079.setColor(var6);
		field1079.drawRect(field1077 / 2 - 152, var7, 304, 34);
		field1079.fillRect(field1077 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field1079.setColor(Color.black);
		field1079.fillRect(arg1 * 3 + field1077 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field1079.setFont(var3);
		field1079.setColor(Color.white);
		field1079.drawString(arg0, (field1077 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
