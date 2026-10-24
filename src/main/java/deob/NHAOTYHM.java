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

@ObfuscatedName("NHAOTYHM")
public class NHAOTYHM extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("NHAOTYHM.h")
	public int field927 = 20;

	@ObfuscatedName("NHAOTYHM.i")
	public int field928 = 1;

	@ObfuscatedName("NHAOTYHM.j")
	public long[] field929 = new long[10];

	@ObfuscatedName("NHAOTYHM.l")
	public boolean field931 = false;

	@ObfuscatedName("NHAOTYHM.q")
	public ZSWNSCUQ[] field936 = new ZSWNSCUQ[6];

	@ObfuscatedName("NHAOTYHM.s")
	public boolean field938 = true;

	@ObfuscatedName("NHAOTYHM.t")
	public boolean field939 = true;

	@ObfuscatedName("NHAOTYHM.G")
	public int[] field952 = new int[128];

	@ObfuscatedName("NHAOTYHM.H")
	public int[] field953 = new int[128];

	@ObfuscatedName("NHAOTYHM.g")
	public int field926;

	@ObfuscatedName("NHAOTYHM.k")
	public int field930;

	@ObfuscatedName("NHAOTYHM.m")
	public int field932;

	@ObfuscatedName("NHAOTYHM.n")
	public int field933;

	@ObfuscatedName("NHAOTYHM.u")
	public int field940;

	@ObfuscatedName("NHAOTYHM.v")
	public int field941;

	@ObfuscatedName("NHAOTYHM.w")
	public int field942;

	@ObfuscatedName("NHAOTYHM.x")
	public int field943;

	@ObfuscatedName("NHAOTYHM.y")
	public int field944;

	@ObfuscatedName("NHAOTYHM.z")
	public int field945;

	@ObfuscatedName("NHAOTYHM.A")
	public int field946;

	@ObfuscatedName("NHAOTYHM.C")
	public int field948;

	@ObfuscatedName("NHAOTYHM.D")
	public int field949;

	@ObfuscatedName("NHAOTYHM.E")
	public int field950;

	@ObfuscatedName("NHAOTYHM.I")
	public int field954;

	@ObfuscatedName("NHAOTYHM.J")
	public int field955;

	@ObfuscatedName("NHAOTYHM.B")
	public long field947;

	@ObfuscatedName("NHAOTYHM.F")
	public long field951;

	@ObfuscatedName("NHAOTYHM.p")
	public HVBGFDBD field935;

	@ObfuscatedName("NHAOTYHM.r")
	public VZJCTUDQ field937;

	@ObfuscatedName("NHAOTYHM.o")
	public Graphics field934;

	@ObfuscatedName("NHAOTYHM.a(BII)V")
	public final void method317(int arg0, int arg1) {
		field932 = arg1;
		field933 = arg0;
		field937 = new VZJCTUDQ(this, field933, field932);
		field934 = method128().getGraphics();
		field935 = new HVBGFDBD(method128(), field933, field932);
		method123(this, 1);
	}

	@ObfuscatedName("NHAOTYHM.a(III)V")
	public final void method318(int arg0, int arg1) {
		field932 = arg1;
		field933 = arg0;
		field934 = method128().getGraphics();
		field935 = new HVBGFDBD(method128(), field933, field932);
		method123(this, 1);
	}

	public void run() {
		method128().addMouseListener(this);
		method128().addMouseMotionListener(this);
		method128().addKeyListener(this);
		method128().addFocusListener(this);

		if (field937 != null) {
			field937.addWindowListener(this);
		}

		method174("Loading...", 0);
		method113();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field929[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field926 < 0) {
					if (field926 == -1) {
						method319();
					}

					return;
				}

				if (field926 > 0) {
					field926--;
					if (field926 == 0) {
						method319();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field929[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field929[var1]) {
					var2 = (int) (field927 * 2560 / (var11 - field929[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field927 - (var11 - field929[var1]) / 10L);
				}

				if (var3 > field927) {
					var3 = field927;
				}

				field929[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field929[var13] != 0L) {
							field929[var13] += var3;
						}
					}
				}

				if (var3 < field928) {
					var3 = field928;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field948 = field944;
					field949 = field945;
					field950 = field946;
					field951 = field947;
					field944 = 0;
					method180();
					field954 = field955;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field927 > 0) {
					field930 = var2 * 1000 / (field927 * 256);
				}

				method161();
			} while (!field931);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field929[var15]);
			}

			System.out.println("fps:" + field930 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field927 + " mindel:" + field928);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field931 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("NHAOTYHM.a(I)V")
	public final void method319() {
		field926 = -2;
		method148();

		if (field937 != null) {
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

	@ObfuscatedName("NHAOTYHM.a(II)V")
	public final void method320(int arg0) {
		field927 = 1000 / arg0;
	}

	public final void start() {
		if (field926 >= 0) {
			field926 = 0;
		}
	}

	public final void stop() {
		if (field926 >= 0) {
			field926 = 4000 / field927;
		}
	}

	public final void destroy() {
		field926 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field926 == -1) {
			method319();
		}
	}

	public final void update(Graphics arg0) {
		if (field934 == null) {
			field934 = arg0;
		}

		field938 = true;
		method101();
	}

	public final void paint(Graphics arg0) {
		if (field934 == null) {
			field934 = arg0;
		}

		field938 = true;
		method101();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field937 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field940 = 0;
		field945 = var2;
		field946 = var3;
		field947 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field944 = 2;
			field941 = 2;
		} else {
			field944 = 1;
			field941 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field940 = 0;
		field941 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field940 = 0;
		field942 = -1;
		field943 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field937 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field940 = 0;
		field942 = var2;
		field943 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field937 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field940 = 0;
		field942 = var2;
		field943 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field940 = 0;
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
			field952[var3] = 1;
		}

		if (var3 > 4) {
			field953[field955] = var3;
			field955 = field955 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field940 = 0;
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
			field952[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("NHAOTYHM.a(B)I")
	public final int method321() {
		int var1 = -1;
		if (field955 != field954) {
			var1 = field953[field954];
			field954 = field954 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field939 = true;
		field938 = true;
		method101();
	}

	public final void focusLost(FocusEvent arg0) {
		field939 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field952[var2] = 0;
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

	@ObfuscatedName("NHAOTYHM.a()V")
	public void method113() {
	}

	@ObfuscatedName("NHAOTYHM.b(I)V")
	public void method180() {
	}

	@ObfuscatedName("NHAOTYHM.c(I)V")
	public void method148() {
	}

	@ObfuscatedName("NHAOTYHM.d(I)V")
	public void method161() {
	}

	@ObfuscatedName("NHAOTYHM.a(Z)V")
	public void method101() {
	}

	@ObfuscatedName("NHAOTYHM.e(I)Ljava/awt/Component;")
	public Component method128() {
		if (field937 != null) {
			return field937;
		}

		return this;
	}

	@ObfuscatedName("NHAOTYHM.a(Ljava/lang/Runnable;I)V")
	public void method123(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("NHAOTYHM.a(Ljava/lang/String;II)V")
	public void method174(String arg0, int arg1) {
		while (field934 == null) {
			field934 = method128().getGraphics();

			try {
				method128().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method128().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method128().getFontMetrics(var5);

		if (field938) {
			field934.setColor(Color.black);
			field934.fillRect(0, 0, field932, field933);
			field938 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field933 / 2 - 18;
		field934.setColor(var6);
		field934.drawRect(field932 / 2 - 152, var7, 304, 34);
		field934.fillRect(field932 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field934.setColor(Color.black);
		field934.fillRect(arg1 * 3 + field932 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field934.setFont(var3);
		field934.setColor(Color.white);
		field934.drawString(arg0, (field932 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
