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

@ObfuscatedName("NZBGSSTU")
public class NZBGSSTU extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("NZBGSSTU.f")
	public int field1100 = 20;

	@ObfuscatedName("NZBGSSTU.g")
	public int field1101 = 1;

	@ObfuscatedName("NZBGSSTU.h")
	public long[] field1102 = new long[10];

	@ObfuscatedName("NZBGSSTU.j")
	public boolean field1104 = false;

	@ObfuscatedName("NZBGSSTU.o")
	public IBHUFTPE[] field1109 = new IBHUFTPE[6];

	@ObfuscatedName("NZBGSSTU.q")
	public boolean field1111 = true;

	@ObfuscatedName("NZBGSSTU.r")
	public boolean field1112 = true;

	@ObfuscatedName("NZBGSSTU.E")
	public int[] field1125 = new int[128];

	@ObfuscatedName("NZBGSSTU.F")
	public int[] field1126 = new int[128];

	@ObfuscatedName("NZBGSSTU.e")
	public int field1099;

	@ObfuscatedName("NZBGSSTU.i")
	public int field1103;

	@ObfuscatedName("NZBGSSTU.k")
	public int field1105;

	@ObfuscatedName("NZBGSSTU.l")
	public int field1106;

	@ObfuscatedName("NZBGSSTU.s")
	public int field1113;

	@ObfuscatedName("NZBGSSTU.t")
	public int field1114;

	@ObfuscatedName("NZBGSSTU.u")
	public int field1115;

	@ObfuscatedName("NZBGSSTU.v")
	public int field1116;

	@ObfuscatedName("NZBGSSTU.w")
	public int field1117;

	@ObfuscatedName("NZBGSSTU.x")
	public int field1118;

	@ObfuscatedName("NZBGSSTU.y")
	public int field1119;

	@ObfuscatedName("NZBGSSTU.A")
	public int field1121;

	@ObfuscatedName("NZBGSSTU.B")
	public int field1122;

	@ObfuscatedName("NZBGSSTU.C")
	public int field1123;

	@ObfuscatedName("NZBGSSTU.G")
	public int field1127;

	@ObfuscatedName("NZBGSSTU.H")
	public int field1128;

	@ObfuscatedName("NZBGSSTU.z")
	public long field1120;

	@ObfuscatedName("NZBGSSTU.D")
	public long field1124;

	@ObfuscatedName("NZBGSSTU.n")
	public ESGPTMPA field1108;

	@ObfuscatedName("NZBGSSTU.p")
	public WHTHTILQ field1110;

	@ObfuscatedName("NZBGSSTU.m")
	public Graphics field1107;

	@ObfuscatedName("NZBGSSTU.a(BII)V")
	public final void method405(int arg0, int arg1) {
		field1105 = arg0;
		field1106 = arg1;
		field1110 = new WHTHTILQ(this, field1106, field1105);
		field1107 = method119().getGraphics();
		field1108 = new ESGPTMPA(field1106, field1105, method119());
		method169(this, 1);
	}

	@ObfuscatedName("NZBGSSTU.a(IIZ)V")
	public final void method406(int arg0, int arg1) {
		field1105 = arg1;
		field1106 = arg0;
		field1107 = method119().getGraphics();
		field1108 = new ESGPTMPA(field1106, field1105, method119());
		method169(this, 1);
	}

	public void run() {
		method119().addMouseListener(this);
		method119().addMouseMotionListener(this);
		method119().addKeyListener(this);
		method119().addFocusListener(this);

		if (field1110 != null) {
			field1110.addWindowListener(this);
		}

		method72(0, "Loading...");
		method147();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field1102[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1099 < 0) {
					if (field1099 == -1) {
						method407();
					}

					return;
				}

				if (field1099 > 0) {
					field1099--;
					if (field1099 == 0) {
						method407();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field1102[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field1102[var1]) {
					var2 = (int) (field1100 * 2560 / (var11 - field1102[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field1100 - (var11 - field1102[var1]) / 10L);
				}

				if (var3 > field1100) {
					var3 = field1100;
				}

				field1102[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field1102[var13] != 0L) {
							field1102[var13] += var3;
						}
					}
				}

				if (var3 < field1101) {
					var3 = field1101;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field1121 = field1117;
					field1122 = field1118;
					field1123 = field1119;
					field1124 = field1120;
					field1117 = 0;
					method153();
					field1127 = field1128;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field1100 > 0) {
					field1103 = var2 * 1000 / (field1100 * 256);
				}

				method75();
			} while (!field1104);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field1102[var15]);
			}

			System.out.println("fps:" + field1103 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field1100 + " mindel:" + field1101);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field1104 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("NZBGSSTU.a(Z)V")
	public final void method407() {
		field1099 = -2;
		method148();

		if (field1110 != null) {
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

	@ObfuscatedName("NZBGSSTU.a(II)V")
	public final void method408(int arg0) {
		field1100 = 1000 / arg0;
	}

	public final void start() {
		if (field1099 >= 0) {
			field1099 = 0;
		}
	}

	public final void stop() {
		if (field1099 >= 0) {
			field1099 = 4000 / field1100;
		}
	}

	public final void destroy() {
		field1099 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field1099 == -1) {
			method407();
		}
	}

	public final void update(Graphics arg0) {
		if (field1107 == null) {
			field1107 = arg0;
		}

		field1111 = true;
		method191();
	}

	public final void paint(Graphics arg0) {
		if (field1107 == null) {
			field1107 = arg0;
		}

		field1111 = true;
		method191();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1110 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1113 = 0;
		field1118 = var2;
		field1119 = var3;
		field1120 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field1117 = 2;
			field1114 = 2;
		} else {
			field1117 = 1;
			field1114 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field1113 = 0;
		field1114 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field1113 = 0;
		field1115 = -1;
		field1116 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1110 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1113 = 0;
		field1115 = var2;
		field1116 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1110 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1113 = 0;
		field1115 = var2;
		field1116 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field1113 = 0;
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
			field1125[var3] = 1;
		}

		if (var3 > 4) {
			field1126[field1128] = var3;
			field1128 = field1128 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field1113 = 0;
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
			field1125[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("NZBGSSTU.a(I)I")
	public final int method409() {
		int var1 = -1;
		if (field1128 != field1127) {
			var1 = field1126[field1127];
			field1127 = field1127 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field1112 = true;
		field1111 = true;
		method191();
	}

	public final void focusLost(FocusEvent arg0) {
		field1112 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field1125[var2] = 0;
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

	@ObfuscatedName("NZBGSSTU.a()V")
	public void method147() {
	}

	@ObfuscatedName("NZBGSSTU.b(Z)V")
	public void method153() {
	}

	@ObfuscatedName("NZBGSSTU.c(Z)V")
	public void method148() {
	}

	@ObfuscatedName("NZBGSSTU.d(Z)V")
	public void method75() {
	}

	@ObfuscatedName("NZBGSSTU.b(I)V")
	public void method191() {
	}

	@ObfuscatedName("NZBGSSTU.c(I)Ljava/awt/Component;")
	public Component method119() {
		if (field1110 != null) {
			return field1110;
		}

		return this;
	}

	@ObfuscatedName("NZBGSSTU.a(Ljava/lang/Runnable;I)V")
	public void method169(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("NZBGSSTU.a(IILjava/lang/String;)V")
	public void method72(int arg0, String arg1) {
		while (field1107 == null) {
			field1107 = method119().getGraphics();

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

		if (field1111) {
			field1107.setColor(Color.black);
			field1107.fillRect(0, 0, field1105, field1106);
			field1111 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field1106 / 2 - 18;
		field1107.setColor(var6);
		field1107.drawRect(field1105 / 2 - 152, var7, 304, 34);
		field1107.fillRect(field1105 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field1107.setColor(Color.black);
		field1107.fillRect(arg0 * 3 + field1105 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field1107.setFont(var3);
		field1107.setColor(Color.white);
		field1107.drawString(arg1, (field1105 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
