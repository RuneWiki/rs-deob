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

@ObfuscatedName("OGVKVTJB")
public class OGVKVTJB extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("OGVKVTJB.j")
	public int field1020 = 20;

	@ObfuscatedName("OGVKVTJB.k")
	public int field1021 = 1;

	@ObfuscatedName("OGVKVTJB.l")
	public long[] field1022 = new long[10];

	@ObfuscatedName("OGVKVTJB.n")
	public boolean field1024 = false;

	@ObfuscatedName("OGVKVTJB.s")
	public TNNDDWAZ[] field1029 = new TNNDDWAZ[6];

	@ObfuscatedName("OGVKVTJB.u")
	public boolean field1031 = true;

	@ObfuscatedName("OGVKVTJB.v")
	public boolean field1032 = true;

	@ObfuscatedName("OGVKVTJB.I")
	public int[] field1045 = new int[128];

	@ObfuscatedName("OGVKVTJB.J")
	public int[] field1046 = new int[128];

	@ObfuscatedName("OGVKVTJB.i")
	public int field1019;

	@ObfuscatedName("OGVKVTJB.m")
	public int field1023;

	@ObfuscatedName("OGVKVTJB.o")
	public int field1025;

	@ObfuscatedName("OGVKVTJB.p")
	public int field1026;

	@ObfuscatedName("OGVKVTJB.w")
	public int field1033;

	@ObfuscatedName("OGVKVTJB.x")
	public int field1034;

	@ObfuscatedName("OGVKVTJB.y")
	public int field1035;

	@ObfuscatedName("OGVKVTJB.z")
	public int field1036;

	@ObfuscatedName("OGVKVTJB.A")
	public int field1037;

	@ObfuscatedName("OGVKVTJB.B")
	public int field1038;

	@ObfuscatedName("OGVKVTJB.C")
	public int field1039;

	@ObfuscatedName("OGVKVTJB.E")
	public int field1041;

	@ObfuscatedName("OGVKVTJB.F")
	public int field1042;

	@ObfuscatedName("OGVKVTJB.G")
	public int field1043;

	@ObfuscatedName("OGVKVTJB.K")
	public int field1047;

	@ObfuscatedName("OGVKVTJB.L")
	public int field1048;

	@ObfuscatedName("OGVKVTJB.D")
	public long field1040;

	@ObfuscatedName("OGVKVTJB.H")
	public long field1044;

	@ObfuscatedName("OGVKVTJB.r")
	public PFNLOREN field1028;

	@ObfuscatedName("OGVKVTJB.t")
	public WLLHZSAS field1030;

	@ObfuscatedName("OGVKVTJB.q")
	public Graphics field1027;

	@ObfuscatedName("OGVKVTJB.a(III)V")
	public final void method410(int arg0, int arg1) {
		field1025 = arg1;
		field1026 = arg0;
		field1030 = new WLLHZSAS(this, field1025, field1026);
		field1027 = method192().getGraphics();
		field1028 = new PFNLOREN(field1025, method192(), field1026);
		method102(this, 1);
	}

	@ObfuscatedName("OGVKVTJB.a(IIB)V")
	public final void method411(int arg0, int arg1) {
		field1025 = arg0;
		field1026 = arg1;
		field1027 = method192().getGraphics();
		field1028 = new PFNLOREN(field1025, method192(), field1026);
		method102(this, 1);
	}

	public void run() {
		method192().addMouseListener(this);
		method192().addMouseMotionListener(this);
		method192().addKeyListener(this);
		method192().addFocusListener(this);

		if (field1030 != null) {
			field1030.addWindowListener(this);
		}

		method70("Loading...", 0);
		method116();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field1022[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1019 < 0) {
					if (field1019 == -1) {
						method412();
					}

					return;
				}

				if (field1019 > 0) {
					field1019--;
					if (field1019 == 0) {
						method412();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field1022[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field1022[var1]) {
					var2 = (int) (field1020 * 2560 / (var11 - field1022[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field1020 - (var11 - field1022[var1]) / 10L);
				}

				if (var3 > field1020) {
					var3 = field1020;
				}

				field1022[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field1022[var13] != 0L) {
							field1022[var13] += var3;
						}
					}
				}

				if (var3 < field1021) {
					var3 = field1021;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field1041 = field1037;
					field1042 = field1038;
					field1043 = field1039;
					field1044 = field1040;
					field1037 = 0;
					method169();
					field1047 = field1048;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field1020 > 0) {
					field1023 = var2 * 1000 / (field1020 * 256);
				}

				method180();
			} while (!field1024);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field1022[var15]);
			}

			System.out.println("fps:" + field1023 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field1020 + " mindel:" + field1021);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field1024 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("OGVKVTJB.a(B)V")
	public final void method412() {
		field1019 = -2;
		method159();

		if (field1030 != null) {
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

	@ObfuscatedName("OGVKVTJB.a(BI)V")
	public final void method413(int arg0) {
		field1020 = 1000 / arg0;
	}

	public final void start() {
		if (field1019 >= 0) {
			field1019 = 0;
		}
	}

	public final void stop() {
		if (field1019 >= 0) {
			field1019 = 4000 / field1020;
		}
	}

	public final void destroy() {
		field1019 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field1019 == -1) {
			method412();
		}
	}

	public final void update(Graphics arg0) {
		if (field1027 == null) {
			field1027 = arg0;
		}

		field1031 = true;
		method189();
	}

	public final void paint(Graphics arg0) {
		if (field1027 == null) {
			field1027 = arg0;
		}

		field1031 = true;
		method189();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1030 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1033 = 0;
		field1038 = var2;
		field1039 = var3;
		field1040 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field1037 = 2;
			field1034 = 2;
		} else {
			field1037 = 1;
			field1034 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field1033 = 0;
		field1034 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field1033 = 0;
		field1035 = -1;
		field1036 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1030 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1033 = 0;
		field1035 = var2;
		field1036 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1030 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1033 = 0;
		field1035 = var2;
		field1036 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field1033 = 0;
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
			field1045[var3] = 1;
		}

		if (var3 > 4) {
			field1046[field1048] = var3;
			field1048 = field1048 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field1033 = 0;
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
			field1045[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("OGVKVTJB.b(B)I")
	public final int method414() {
		int var1 = -1;
		if (field1048 != field1047) {
			var1 = field1046[field1047];
			field1047 = field1047 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field1032 = true;
		field1031 = true;
		method189();
	}

	public final void focusLost(FocusEvent arg0) {
		field1032 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field1045[var2] = 0;
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

	@ObfuscatedName("OGVKVTJB.a()V")
	public void method116() {
	}

	@ObfuscatedName("OGVKVTJB.a(I)V")
	public void method169() {
	}

	@ObfuscatedName("OGVKVTJB.b(I)V")
	public void method159() {
	}

	@ObfuscatedName("OGVKVTJB.c(B)V")
	public void method180() {
	}

	@ObfuscatedName("OGVKVTJB.c(I)V")
	public void method189() {
	}

	@ObfuscatedName("OGVKVTJB.d(I)Ljava/awt/Component;")
	public Component method192() {
		if (field1030 != null) {
			return field1030;
		}

		return this;
	}

	@ObfuscatedName("OGVKVTJB.a(Ljava/lang/Runnable;I)V")
	public void method102(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("OGVKVTJB.a(Ljava/lang/String;IB)V")
	public void method70(String arg0, int arg1) {
		while (field1027 == null) {
			field1027 = method192().getGraphics();

			try {
				method192().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method192().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method192().getFontMetrics(var5);

		if (field1031) {
			field1027.setColor(Color.black);
			field1027.fillRect(0, 0, field1025, field1026);
			field1031 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field1026 / 2 - 18;
		field1027.setColor(var6);
		field1027.drawRect(field1025 / 2 - 152, var7, 304, 34);
		field1027.fillRect(field1025 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field1027.setColor(Color.black);
		field1027.fillRect(arg1 * 3 + field1025 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field1027.setFont(var3);
		field1027.setColor(Color.white);
		field1027.drawString(arg0, (field1025 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
