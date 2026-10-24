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

@ObfuscatedName("PKBEYUWN")
public class PKBEYUWN extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("PKBEYUWN.e")
	public int field949 = 20;

	@ObfuscatedName("PKBEYUWN.f")
	public int field950 = 1;

	@ObfuscatedName("PKBEYUWN.g")
	public long[] field951 = new long[10];

	@ObfuscatedName("PKBEYUWN.i")
	public boolean field953 = false;

	@ObfuscatedName("PKBEYUWN.n")
	public BISLJVZR[] field958 = new BISLJVZR[6];

	@ObfuscatedName("PKBEYUWN.p")
	public boolean field960 = true;

	@ObfuscatedName("PKBEYUWN.q")
	public boolean field961 = true;

	@ObfuscatedName("PKBEYUWN.D")
	public int[] field974 = new int[128];

	@ObfuscatedName("PKBEYUWN.E")
	public int[] field975 = new int[128];

	@ObfuscatedName("PKBEYUWN.d")
	public int field948;

	@ObfuscatedName("PKBEYUWN.h")
	public int field952;

	@ObfuscatedName("PKBEYUWN.j")
	public int field954;

	@ObfuscatedName("PKBEYUWN.k")
	public int field955;

	@ObfuscatedName("PKBEYUWN.r")
	public int field962;

	@ObfuscatedName("PKBEYUWN.s")
	public int field963;

	@ObfuscatedName("PKBEYUWN.t")
	public int field964;

	@ObfuscatedName("PKBEYUWN.u")
	public int field965;

	@ObfuscatedName("PKBEYUWN.v")
	public int field966;

	@ObfuscatedName("PKBEYUWN.w")
	public int field967;

	@ObfuscatedName("PKBEYUWN.x")
	public int field968;

	@ObfuscatedName("PKBEYUWN.z")
	public int field970;

	@ObfuscatedName("PKBEYUWN.A")
	public int field971;

	@ObfuscatedName("PKBEYUWN.B")
	public int field972;

	@ObfuscatedName("PKBEYUWN.F")
	public int field976;

	@ObfuscatedName("PKBEYUWN.G")
	public int field977;

	@ObfuscatedName("PKBEYUWN.y")
	public long field969;

	@ObfuscatedName("PKBEYUWN.C")
	public long field973;

	@ObfuscatedName("PKBEYUWN.o")
	public FRBOSPAH field959;

	@ObfuscatedName("PKBEYUWN.m")
	public IOGVZQTL field957;

	@ObfuscatedName("PKBEYUWN.l")
	public Graphics field956;

	@ObfuscatedName("PKBEYUWN.a(III)V")
	public final void method426(int arg0, int arg1) {
		field954 = arg1;
		field955 = arg0;
		field959 = new FRBOSPAH(field954, field955, this);
		field956 = method194().getGraphics();
		field957 = new IOGVZQTL(field954, field955, method194());
		method164(this, 1);
	}

	@ObfuscatedName("PKBEYUWN.b(III)V")
	public final void method427(int arg0, int arg1) {
		field954 = arg0;
		field955 = arg1;
		field956 = method194().getGraphics();
		field957 = new IOGVZQTL(field954, field955, method194());
		method164(this, 1);
	}

	public void run() {
		method194().addMouseListener(this);
		method194().addMouseMotionListener(this);
		method194().addKeyListener(this);
		method194().addFocusListener(this);

		if (field959 != null) {
			field959.addWindowListener(this);
		}

		method158(0, "Loading...");
		method128();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field951[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field948 < 0) {
					if (field948 == -1) {
						method428();
					}

					return;
				}

				if (field948 > 0) {
					field948--;
					if (field948 == 0) {
						method428();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field951[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field951[var1]) {
					var2 = (int) (field949 * 2560 / (var11 - field951[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field949 - (var11 - field951[var1]) / 10L);
				}

				if (var3 > field949) {
					var3 = field949;
				}

				field951[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field951[var13] != 0L) {
							field951[var13] += var3;
						}
					}
				}

				if (var3 < field950) {
					var3 = field950;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field970 = field966;
					field971 = field967;
					field972 = field968;
					field973 = field969;
					field966 = 0;
					method255();
					field976 = field977;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field949 > 0) {
					field952 = var2 * 1000 / (field949 * 256);
				}

				method233();
			} while (!field953);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field951[var15]);
			}

			System.out.println("fps:" + field952 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field949 + " mindel:" + field950);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field953 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("PKBEYUWN.a(I)V")
	public final void method428() {
		field948 = -2;
		method186();

		if (field959 != null) {
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

	@ObfuscatedName("PKBEYUWN.a(BI)V")
	public final void method429(int arg0) {
		field949 = 1000 / arg0;
	}

	public final void start() {
		if (field948 >= 0) {
			field948 = 0;
		}
	}

	public final void stop() {
		if (field948 >= 0) {
			field948 = 4000 / field949;
		}
	}

	public final void destroy() {
		field948 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field948 == -1) {
			method428();
		}
	}

	public final void update(Graphics arg0) {
		if (field956 == null) {
			field956 = arg0;
		}

		field960 = true;
		method182();
	}

	public final void paint(Graphics arg0) {
		if (field956 == null) {
			field956 = arg0;
		}

		field960 = true;
		method182();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field959 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field962 = 0;
		field967 = var2;
		field968 = var3;
		field969 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field966 = 2;
			field963 = 2;
		} else {
			field966 = 1;
			field963 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field962 = 0;
		field963 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field962 = 0;
		field964 = -1;
		field965 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field959 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field962 = 0;
		field964 = var2;
		field965 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field959 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field962 = 0;
		field964 = var2;
		field965 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field962 = 0;
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
			field974[var3] = 1;
		}

		if (var3 > 4) {
			field975[field977] = var3;
			field977 = field977 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field962 = 0;
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
			field974[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("PKBEYUWN.b(I)I")
	public final int method430() {
		int var1 = -1;
		if (field977 != field976) {
			var1 = field975[field976];
			field976 = field976 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field961 = true;
		field960 = true;
		method182();
	}

	public final void focusLost(FocusEvent arg0) {
		field961 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field974[var2] = 0;
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

	@ObfuscatedName("PKBEYUWN.a()V")
	public void method128() {
	}

	@ObfuscatedName("PKBEYUWN.c(I)V")
	public void method255() {
	}

	@ObfuscatedName("PKBEYUWN.a(Z)V")
	public void method186() {
	}

	@ObfuscatedName("PKBEYUWN.a(B)V")
	public void method233() {
	}

	@ObfuscatedName("PKBEYUWN.d(I)V")
	public void method182() {
	}

	@ObfuscatedName("PKBEYUWN.e(I)Ljava/awt/Component;")
	public Component method194() {
		if (field959 != null) {
			return field959;
		}

		return this;
	}

	@ObfuscatedName("PKBEYUWN.a(Ljava/lang/Runnable;I)V")
	public void method164(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("PKBEYUWN.a(BILjava/lang/String;)V")
	public void method158(int arg0, String arg1) {
		while (field956 == null) {
			field956 = method194().getGraphics();

			try {
				method194().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method194().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method194().getFontMetrics(var5);

		if (field960) {
			field956.setColor(Color.black);
			field956.fillRect(0, 0, field954, field955);
			field960 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field955 / 2 - 18;
		field956.setColor(var6);
		field956.drawRect(field954 / 2 - 152, var7, 304, 34);
		field956.fillRect(field954 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field956.setColor(Color.black);
		field956.fillRect(arg0 * 3 + field954 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field956.setFont(var3);
		field956.setColor(Color.white);
		field956.drawString(arg1, (field954 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
