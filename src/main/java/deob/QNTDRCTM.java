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

@ObfuscatedName("QNTDRCTM")
public class QNTDRCTM extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("QNTDRCTM.h")
	public int field1014 = 20;

	@ObfuscatedName("QNTDRCTM.i")
	public int field1015 = 1;

	@ObfuscatedName("QNTDRCTM.j")
	public long[] field1016 = new long[10];

	@ObfuscatedName("QNTDRCTM.l")
	public boolean field1018 = false;

	@ObfuscatedName("QNTDRCTM.q")
	public BFUTXOBU[] field1023 = new BFUTXOBU[6];

	@ObfuscatedName("QNTDRCTM.s")
	public boolean field1025 = true;

	@ObfuscatedName("QNTDRCTM.t")
	public boolean field1026 = true;

	@ObfuscatedName("QNTDRCTM.G")
	public int[] field1039 = new int[128];

	@ObfuscatedName("QNTDRCTM.H")
	public int[] field1040 = new int[128];

	@ObfuscatedName("QNTDRCTM.g")
	public int field1013;

	@ObfuscatedName("QNTDRCTM.k")
	public int field1017;

	@ObfuscatedName("QNTDRCTM.m")
	public int field1019;

	@ObfuscatedName("QNTDRCTM.n")
	public int field1020;

	@ObfuscatedName("QNTDRCTM.u")
	public int field1027;

	@ObfuscatedName("QNTDRCTM.v")
	public int field1028;

	@ObfuscatedName("QNTDRCTM.w")
	public int field1029;

	@ObfuscatedName("QNTDRCTM.x")
	public int field1030;

	@ObfuscatedName("QNTDRCTM.y")
	public int field1031;

	@ObfuscatedName("QNTDRCTM.z")
	public int field1032;

	@ObfuscatedName("QNTDRCTM.A")
	public int field1033;

	@ObfuscatedName("QNTDRCTM.C")
	public int field1035;

	@ObfuscatedName("QNTDRCTM.D")
	public int field1036;

	@ObfuscatedName("QNTDRCTM.E")
	public int field1037;

	@ObfuscatedName("QNTDRCTM.I")
	public int field1041;

	@ObfuscatedName("QNTDRCTM.J")
	public int field1042;

	@ObfuscatedName("QNTDRCTM.B")
	public long field1034;

	@ObfuscatedName("QNTDRCTM.F")
	public long field1038;

	@ObfuscatedName("QNTDRCTM.r")
	public GBQVGMFE field1024;

	@ObfuscatedName("QNTDRCTM.p")
	public SBWJLPSR field1022;

	@ObfuscatedName("QNTDRCTM.o")
	public Graphics field1021;

	@ObfuscatedName("QNTDRCTM.a(IBI)V")
	public final void method385(int arg0, int arg1) {
		field1019 = arg0;
		field1020 = arg1;
		field1024 = new GBQVGMFE(this, field1020, field1019);
		field1021 = method73().getGraphics();
		field1022 = new SBWJLPSR(field1020, field1019, method73());
		method102(this, 1);
	}

	@ObfuscatedName("QNTDRCTM.a(III)V")
	public final void method386(int arg0, int arg1) {
		field1019 = arg0;
		field1020 = arg1;
		field1021 = method73().getGraphics();
		field1022 = new SBWJLPSR(field1020, field1019, method73());
		method102(this, 1);
	}

	public void run() {
		method73().addMouseListener(this);
		method73().addMouseMotionListener(this);
		method73().addKeyListener(this);
		method73().addFocusListener(this);

		if (field1024 != null) {
			field1024.addWindowListener(this);
		}

		method163(0, "Loading...");
		method44();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field1016[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1013 < 0) {
					if (field1013 == -1) {
						method387();
					}

					return;
				}

				if (field1013 > 0) {
					field1013--;
					if (field1013 == 0) {
						method387();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field1016[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field1016[var1]) {
					var2 = (int) (field1014 * 2560 / (var11 - field1016[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field1014 - (var11 - field1016[var1]) / 10L);
				}

				if (var3 > field1014) {
					var3 = field1014;
				}

				field1016[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field1016[var13] != 0L) {
							field1016[var13] += var3;
						}
					}
				}

				if (var3 < field1015) {
					var3 = field1015;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field1035 = field1031;
					field1036 = field1032;
					field1037 = field1033;
					field1038 = field1034;
					field1031 = 0;
					method147();
					field1041 = field1042;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field1014 > 0) {
					field1017 = var2 * 1000 / (field1014 * 256);
				}

				method105();
			} while (!field1018);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field1016[var15]);
			}

			System.out.println("fps:" + field1017 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field1014 + " mindel:" + field1015);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field1018 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("QNTDRCTM.a(Z)V")
	public final void method387() {
		field1013 = -2;
		method56();

		if (field1024 != null) {
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

	@ObfuscatedName("QNTDRCTM.a(IZ)V")
	public final void method388(int arg0) {
		field1014 = 1000 / arg0;
	}

	public final void start() {
		if (field1013 >= 0) {
			field1013 = 0;
		}
	}

	public final void stop() {
		if (field1013 >= 0) {
			field1013 = 4000 / field1014;
		}
	}

	public final void destroy() {
		field1013 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field1013 == -1) {
			method387();
		}
	}

	public final void update(Graphics arg0) {
		if (field1021 == null) {
			field1021 = arg0;
		}

		field1025 = true;
		method143();
	}

	public final void paint(Graphics arg0) {
		if (field1021 == null) {
			field1021 = arg0;
		}

		field1025 = true;
		method143();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1024 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1027 = 0;
		field1032 = var2;
		field1033 = var3;
		field1034 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field1031 = 2;
			field1028 = 2;
		} else {
			field1031 = 1;
			field1028 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field1027 = 0;
		field1028 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field1027 = 0;
		field1029 = -1;
		field1030 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1024 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1027 = 0;
		field1029 = var2;
		field1030 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1024 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1027 = 0;
		field1029 = var2;
		field1030 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field1027 = 0;
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
			field1039[var3] = 1;
		}

		if (var3 > 4) {
			field1040[field1042] = var3;
			field1042 = field1042 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field1027 = 0;
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
			field1039[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("QNTDRCTM.a(I)I")
	public final int method389() {
		int var1 = -1;
		if (field1042 != field1041) {
			var1 = field1040[field1041];
			field1041 = field1041 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field1026 = true;
		field1025 = true;
		method143();
	}

	public final void focusLost(FocusEvent arg0) {
		field1026 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field1039[var2] = 0;
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

	@ObfuscatedName("QNTDRCTM.a()V")
	public void method44() {
	}

	@ObfuscatedName("QNTDRCTM.b(I)V")
	public void method147() {
	}

	@ObfuscatedName("QNTDRCTM.c(I)V")
	public void method56() {
	}

	@ObfuscatedName("QNTDRCTM.d(I)V")
	public void method105() {
	}

	@ObfuscatedName("QNTDRCTM.e(I)V")
	public void method143() {
	}

	@ObfuscatedName("QNTDRCTM.f(I)Ljava/awt/Component;")
	public Component method73() {
		if (field1024 != null) {
			return field1024;
		}

		return this;
	}

	@ObfuscatedName("QNTDRCTM.a(Ljava/lang/Runnable;I)V")
	public void method102(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("QNTDRCTM.a(ZILjava/lang/String;)V")
	public void method163(int arg0, String arg1) {
		while (field1021 == null) {
			field1021 = method73().getGraphics();

			try {
				method73().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method73().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method73().getFontMetrics(var5);

		if (field1025) {
			field1021.setColor(Color.black);
			field1021.fillRect(0, 0, field1019, field1020);
			field1025 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field1020 / 2 - 18;
		field1021.setColor(var6);
		field1021.drawRect(field1019 / 2 - 152, var7, 304, 34);
		field1021.fillRect(field1019 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field1021.setColor(Color.black);
		field1021.fillRect(arg0 * 3 + field1019 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field1021.setFont(var3);
		field1021.setColor(Color.white);
		field1021.drawString(arg1, (field1019 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
