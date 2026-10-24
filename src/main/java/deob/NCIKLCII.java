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

@ObfuscatedName("NCIKLCII")
public class NCIKLCII extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("NCIKLCII.i")
	public int field930 = 20;

	@ObfuscatedName("NCIKLCII.j")
	public int field931 = 1;

	@ObfuscatedName("NCIKLCII.k")
	public long[] field932 = new long[10];

	@ObfuscatedName("NCIKLCII.m")
	public boolean field934 = false;

	@ObfuscatedName("NCIKLCII.r")
	public TPIBHECB[] field939 = new TPIBHECB[6];

	@ObfuscatedName("NCIKLCII.t")
	public boolean field941 = true;

	@ObfuscatedName("NCIKLCII.u")
	public boolean field942 = true;

	@ObfuscatedName("NCIKLCII.H")
	public int[] field955 = new int[128];

	@ObfuscatedName("NCIKLCII.I")
	public int[] field956 = new int[128];

	@ObfuscatedName("NCIKLCII.h")
	public int field929;

	@ObfuscatedName("NCIKLCII.l")
	public int field933;

	@ObfuscatedName("NCIKLCII.n")
	public int field935;

	@ObfuscatedName("NCIKLCII.o")
	public int field936;

	@ObfuscatedName("NCIKLCII.v")
	public int field943;

	@ObfuscatedName("NCIKLCII.w")
	public int field944;

	@ObfuscatedName("NCIKLCII.x")
	public int field945;

	@ObfuscatedName("NCIKLCII.y")
	public int field946;

	@ObfuscatedName("NCIKLCII.z")
	public int field947;

	@ObfuscatedName("NCIKLCII.A")
	public int field948;

	@ObfuscatedName("NCIKLCII.B")
	public int field949;

	@ObfuscatedName("NCIKLCII.D")
	public int field951;

	@ObfuscatedName("NCIKLCII.E")
	public int field952;

	@ObfuscatedName("NCIKLCII.F")
	public int field953;

	@ObfuscatedName("NCIKLCII.J")
	public int field957;

	@ObfuscatedName("NCIKLCII.K")
	public int field958;

	@ObfuscatedName("NCIKLCII.C")
	public long field950;

	@ObfuscatedName("NCIKLCII.G")
	public long field954;

	@ObfuscatedName("NCIKLCII.s")
	public BLPTISPL field940;

	@ObfuscatedName("NCIKLCII.q")
	public IUZTBIWV field938;

	@ObfuscatedName("NCIKLCII.p")
	public Graphics field937;

	@ObfuscatedName("NCIKLCII.a(III)V")
	public final void method397(int arg0, int arg1) {
		field935 = arg1;
		field936 = arg0;
		field940 = new BLPTISPL(field936, this, field935);
		field937 = method117().getGraphics();
		field938 = new IUZTBIWV(method117(), field935, field936);
		method97(this, 1);
	}

	@ObfuscatedName("NCIKLCII.b(III)V")
	public final void method398(int arg0, int arg1) {
		field935 = arg0;
		field936 = arg1;
		field937 = method117().getGraphics();
		field938 = new IUZTBIWV(method117(), field935, field936);
		method97(this, 1);
	}

	public void run() {
		method117().addMouseListener(this);
		method117().addMouseMotionListener(this);
		method117().addKeyListener(this);
		method117().addFocusListener(this);

		if (field940 != null) {
			field940.addWindowListener(this);
		}

		method149("Loading...", 0);
		method176();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field932[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field929 < 0) {
					if (field929 == -1) {
						method399();
					}

					return;
				}

				if (field929 > 0) {
					field929--;
					if (field929 == 0) {
						method399();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field932[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field932[var1]) {
					var2 = (int) (field930 * 2560 / (var11 - field932[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field930 - (var11 - field932[var1]) / 10L);
				}

				if (var3 > field930) {
					var3 = field930;
				}

				field932[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field932[var13] != 0L) {
							field932[var13] += var3;
						}
					}
				}

				if (var3 < field931) {
					var3 = field931;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field951 = field947;
					field952 = field948;
					field953 = field949;
					field954 = field950;
					field947 = 0;
					method122();
					field957 = field958;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field930 > 0) {
					field933 = var2 * 1000 / (field930 * 256);
				}

				method146();
			} while (!field934);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field932[var15]);
			}

			System.out.println("fps:" + field933 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field930 + " mindel:" + field931);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field934 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("NCIKLCII.a(B)V")
	public final void method399() {
		field929 = -2;
		method168();

		if (field940 != null) {
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

	@ObfuscatedName("NCIKLCII.a(BI)V")
	public final void method400(int arg0) {
		field930 = 1000 / arg0;
	}

	public final void start() {
		if (field929 >= 0) {
			field929 = 0;
		}
	}

	public final void stop() {
		if (field929 >= 0) {
			field929 = 4000 / field930;
		}
	}

	public final void destroy() {
		field929 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field929 == -1) {
			method399();
		}
	}

	public final void update(Graphics arg0) {
		if (field937 == null) {
			field937 = arg0;
		}

		field941 = true;
		method45();
	}

	public final void paint(Graphics arg0) {
		if (field937 == null) {
			field937 = arg0;
		}

		field941 = true;
		method45();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field940 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field943 = 0;
		field948 = var2;
		field949 = var3;
		field950 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field947 = 2;
			field944 = 2;
		} else {
			field947 = 1;
			field944 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field943 = 0;
		field944 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field943 = 0;
		field945 = -1;
		field946 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field940 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field943 = 0;
		field945 = var2;
		field946 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field940 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field943 = 0;
		field945 = var2;
		field946 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field943 = 0;
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
			field955[var3] = 1;
		}

		if (var3 > 4) {
			field956[field958] = var3;
			field958 = field958 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field943 = 0;
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
			field955[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("NCIKLCII.b(B)I")
	public final int method401() {
		int var1 = -1;
		if (field958 != field957) {
			var1 = field956[field957];
			field957 = field957 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field942 = true;
		field941 = true;
		method45();
	}

	public final void focusLost(FocusEvent arg0) {
		field942 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field955[var2] = 0;
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

	@ObfuscatedName("NCIKLCII.a()V")
	public void method176() {
	}

	@ObfuscatedName("NCIKLCII.a(Z)V")
	public void method122() {
	}

	@ObfuscatedName("NCIKLCII.a(I)V")
	public void method168() {
	}

	@ObfuscatedName("NCIKLCII.b(I)V")
	public void method146() {
	}

	@ObfuscatedName("NCIKLCII.b(Z)V")
	public void method45() {
	}

	@ObfuscatedName("NCIKLCII.c(B)Ljava/awt/Component;")
	public Component method117() {
		if (field940 != null) {
			return field940;
		}

		return this;
	}

	@ObfuscatedName("NCIKLCII.a(Ljava/lang/Runnable;I)V")
	public void method97(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("NCIKLCII.a(Ljava/lang/String;IZ)V")
	public void method149(String arg0, int arg1) {
		while (field937 == null) {
			field937 = method117().getGraphics();

			try {
				method117().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method117().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method117().getFontMetrics(var5);

		if (field941) {
			field937.setColor(Color.black);
			field937.fillRect(0, 0, field935, field936);
			field941 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field936 / 2 - 18;
		field937.setColor(var6);
		field937.drawRect(field935 / 2 - 152, var7, 304, 34);
		field937.fillRect(field935 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field937.setColor(Color.black);
		field937.fillRect(arg1 * 3 + field935 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field937.setFont(var3);
		field937.setColor(Color.white);
		field937.drawString(arg0, (field935 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
