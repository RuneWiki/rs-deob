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

@ObfuscatedName("IVVPRVRY")
public class IVVPRVRY extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("IVVPRVRY.g")
	public int field934 = 20;

	@ObfuscatedName("IVVPRVRY.h")
	public int field935 = 1;

	@ObfuscatedName("IVVPRVRY.i")
	public long[] field936 = new long[10];

	@ObfuscatedName("IVVPRVRY.k")
	public boolean field938 = false;

	@ObfuscatedName("IVVPRVRY.p")
	public JONKABPT[] field943 = new JONKABPT[6];

	@ObfuscatedName("IVVPRVRY.r")
	public boolean field945 = true;

	@ObfuscatedName("IVVPRVRY.s")
	public boolean field946 = true;

	@ObfuscatedName("IVVPRVRY.F")
	public int[] field959 = new int[128];

	@ObfuscatedName("IVVPRVRY.G")
	public int[] field960 = new int[128];

	@ObfuscatedName("IVVPRVRY.f")
	public int field933;

	@ObfuscatedName("IVVPRVRY.j")
	public int field937;

	@ObfuscatedName("IVVPRVRY.l")
	public int field939;

	@ObfuscatedName("IVVPRVRY.m")
	public int field940;

	@ObfuscatedName("IVVPRVRY.t")
	public int field947;

	@ObfuscatedName("IVVPRVRY.u")
	public int field948;

	@ObfuscatedName("IVVPRVRY.v")
	public int field949;

	@ObfuscatedName("IVVPRVRY.w")
	public int field950;

	@ObfuscatedName("IVVPRVRY.x")
	public int field951;

	@ObfuscatedName("IVVPRVRY.y")
	public int field952;

	@ObfuscatedName("IVVPRVRY.z")
	public int field953;

	@ObfuscatedName("IVVPRVRY.B")
	public int field955;

	@ObfuscatedName("IVVPRVRY.C")
	public int field956;

	@ObfuscatedName("IVVPRVRY.D")
	public int field957;

	@ObfuscatedName("IVVPRVRY.H")
	public int field961;

	@ObfuscatedName("IVVPRVRY.I")
	public int field962;

	@ObfuscatedName("IVVPRVRY.A")
	public long field954;

	@ObfuscatedName("IVVPRVRY.E")
	public long field958;

	@ObfuscatedName("IVVPRVRY.o")
	public FETXLXVZ field942;

	@ObfuscatedName("IVVPRVRY.q")
	public VIXZTSSP field944;

	@ObfuscatedName("IVVPRVRY.n")
	public Graphics field941;

	@ObfuscatedName("IVVPRVRY.a(IBI)V")
	public final void method399(int arg0, int arg1) {
		field939 = arg1;
		field940 = arg0;
		field944 = new VIXZTSSP(this, field939, field940);
		field941 = method190().getGraphics();
		field942 = new FETXLXVZ(method190(), field939, field940);
		method117(this, 1);
	}

	@ObfuscatedName("IVVPRVRY.a(ZII)V")
	public final void method400(int arg0, int arg1) {
		field939 = arg1;
		field940 = arg0;
		field941 = method190().getGraphics();
		field942 = new FETXLXVZ(method190(), field939, field940);
		method117(this, 1);
	}

	public void run() {
		method190().addMouseListener(this);
		method190().addMouseMotionListener(this);
		method190().addKeyListener(this);
		method190().addFocusListener(this);

		if (field944 != null) {
			field944.addWindowListener(this);
		}

		method200("Loading...", 0);
		method197();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field936[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field933 < 0) {
					if (field933 == -1) {
						method401();
					}

					return;
				}

				if (field933 > 0) {
					field933--;
					if (field933 == 0) {
						method401();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field936[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field936[var1]) {
					var2 = (int) (field934 * 2560 / (var11 - field936[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field934 - (var11 - field936[var1]) / 10L);
				}

				if (var3 > field934) {
					var3 = field934;
				}

				field936[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field936[var13] != 0L) {
							field936[var13] += var3;
						}
					}
				}

				if (var3 < field935) {
					var3 = field935;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field955 = field951;
					field956 = field952;
					field957 = field953;
					field958 = field954;
					field951 = 0;
					method136();
					field961 = field962;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field934 > 0) {
					field937 = var2 * 1000 / (field934 * 256);
				}

				method115();
			} while (!field938);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field936[var15]);
			}

			System.out.println("fps:" + field937 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field934 + " mindel:" + field935);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field938 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("IVVPRVRY.a(B)V")
	public final void method401() {
		field933 = -2;
		method176();

		if (field944 != null) {
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

	@ObfuscatedName("IVVPRVRY.a(BI)V")
	public final void method402(int arg0) {
		field934 = 1000 / arg0;
	}

	public final void start() {
		if (field933 >= 0) {
			field933 = 0;
		}
	}

	public final void stop() {
		if (field933 >= 0) {
			field933 = 4000 / field934;
		}
	}

	public final void destroy() {
		field933 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field933 == -1) {
			method401();
		}
	}

	public final void update(Graphics arg0) {
		if (field941 == null) {
			field941 = arg0;
		}

		field945 = true;
		method86();
	}

	public final void paint(Graphics arg0) {
		if (field941 == null) {
			field941 = arg0;
		}

		field945 = true;
		method86();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field944 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field947 = 0;
		field952 = var2;
		field953 = var3;
		field954 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field951 = 2;
			field948 = 2;
		} else {
			field951 = 1;
			field948 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field947 = 0;
		field948 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field947 = 0;
		field949 = -1;
		field950 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field944 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field947 = 0;
		field949 = var2;
		field950 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field944 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field947 = 0;
		field949 = var2;
		field950 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field947 = 0;
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
			field959[var3] = 1;
		}

		if (var3 > 4) {
			field960[field962] = var3;
			field962 = field962 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field947 = 0;
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
			field959[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("IVVPRVRY.a(I)I")
	public final int method403() {
		int var1 = -1;
		if (field962 != field961) {
			var1 = field960[field961];
			field961 = field961 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field946 = true;
		field945 = true;
		method86();
	}

	public final void focusLost(FocusEvent arg0) {
		field946 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field959[var2] = 0;
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

	@ObfuscatedName("IVVPRVRY.a()V")
	public void method197() {
	}

	@ObfuscatedName("IVVPRVRY.b(I)V")
	public void method136() {
	}

	@ObfuscatedName("IVVPRVRY.a(Z)V")
	public void method176() {
	}

	@ObfuscatedName("IVVPRVRY.b(B)V")
	public void method115() {
	}

	@ObfuscatedName("IVVPRVRY.b(Z)V")
	public void method86() {
	}

	@ObfuscatedName("IVVPRVRY.c(I)Ljava/awt/Component;")
	public Component method190() {
		if (field944 != null) {
			return field944;
		}

		return this;
	}

	@ObfuscatedName("IVVPRVRY.a(Ljava/lang/Runnable;I)V")
	public void method117(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("IVVPRVRY.a(Ljava/lang/String;II)V")
	public void method200(String arg0, int arg1) {
		while (field941 == null) {
			field941 = method190().getGraphics();

			try {
				method190().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method190().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method190().getFontMetrics(var5);

		if (field945) {
			field941.setColor(Color.black);
			field941.fillRect(0, 0, field939, field940);
			field945 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field940 / 2 - 18;
		field941.setColor(var6);
		field941.drawRect(field939 / 2 - 152, var7, 304, 34);
		field941.fillRect(field939 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field941.setColor(Color.black);
		field941.fillRect(arg1 * 3 + field939 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field941.setFont(var3);
		field941.setColor(Color.white);
		field941.drawString(arg0, (field939 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
