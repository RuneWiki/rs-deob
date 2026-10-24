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

@ObfuscatedName("GRXJFORE")
public class GRXJFORE extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("GRXJFORE.g")
	public int field677 = 20;

	@ObfuscatedName("GRXJFORE.h")
	public int field678 = 1;

	@ObfuscatedName("GRXJFORE.i")
	public long[] field679 = new long[10];

	@ObfuscatedName("GRXJFORE.k")
	public boolean field681 = false;

	@ObfuscatedName("GRXJFORE.p")
	public WSNKRVXZ[] field686 = new WSNKRVXZ[6];

	@ObfuscatedName("GRXJFORE.r")
	public boolean field688 = true;

	@ObfuscatedName("GRXJFORE.s")
	public boolean field689 = true;

	@ObfuscatedName("GRXJFORE.F")
	public int[] field702 = new int[128];

	@ObfuscatedName("GRXJFORE.G")
	public int[] field703 = new int[128];

	@ObfuscatedName("GRXJFORE.f")
	public int field676;

	@ObfuscatedName("GRXJFORE.j")
	public int field680;

	@ObfuscatedName("GRXJFORE.l")
	public int field682;

	@ObfuscatedName("GRXJFORE.m")
	public int field683;

	@ObfuscatedName("GRXJFORE.t")
	public int field690;

	@ObfuscatedName("GRXJFORE.u")
	public int field691;

	@ObfuscatedName("GRXJFORE.v")
	public int field692;

	@ObfuscatedName("GRXJFORE.w")
	public int field693;

	@ObfuscatedName("GRXJFORE.x")
	public int field694;

	@ObfuscatedName("GRXJFORE.y")
	public int field695;

	@ObfuscatedName("GRXJFORE.z")
	public int field696;

	@ObfuscatedName("GRXJFORE.B")
	public int field698;

	@ObfuscatedName("GRXJFORE.C")
	public int field699;

	@ObfuscatedName("GRXJFORE.D")
	public int field700;

	@ObfuscatedName("GRXJFORE.H")
	public int field704;

	@ObfuscatedName("GRXJFORE.I")
	public int field705;

	@ObfuscatedName("GRXJFORE.A")
	public long field697;

	@ObfuscatedName("GRXJFORE.E")
	public long field701;

	@ObfuscatedName("GRXJFORE.o")
	public GYXQUUFC field685;

	@ObfuscatedName("GRXJFORE.q")
	public JWHKCZBF field687;

	@ObfuscatedName("GRXJFORE.n")
	public Graphics field684;

	@ObfuscatedName("GRXJFORE.a(III)V")
	public final void method240(int arg0, int arg1) {
		field682 = arg0;
		field683 = arg1;
		field687 = new JWHKCZBF(this, field683, field682);
		field684 = method117().getGraphics();
		field685 = new GYXQUUFC(field683, field682, method117());
		method31(this, 1);
	}

	@ObfuscatedName("GRXJFORE.b(III)V")
	public final void method241(int arg0, int arg1) {
		field682 = arg0;
		field683 = arg1;
		field684 = method117().getGraphics();
		field685 = new GYXQUUFC(field683, field682, method117());
		method31(this, 1);
	}

	public void run() {
		method117().addMouseListener(this);
		method117().addMouseMotionListener(this);
		method117().addKeyListener(this);
		method117().addFocusListener(this);

		if (field687 != null) {
			field687.addWindowListener(this);
		}

		method58(0, "Loading...");
		method102();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field679[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field676 < 0) {
					if (field676 == -1) {
						method242();
					}

					return;
				}

				if (field676 > 0) {
					field676--;
					if (field676 == 0) {
						method242();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field679[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field679[var1]) {
					var2 = (int) (field677 * 2560 / (var11 - field679[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field677 - (var11 - field679[var1]) / 10L);
				}

				if (var3 > field677) {
					var3 = field677;
				}

				field679[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field679[var13] != 0L) {
							field679[var13] += var3;
						}
					}
				}

				if (var3 < field678) {
					var3 = field678;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field698 = field694;
					field699 = field695;
					field700 = field696;
					field701 = field697;
					field694 = 0;
					method32();
					field704 = field705;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field677 > 0) {
					field680 = var2 * 1000 / (field677 * 256);
				}

				method157();
			} while (!field681);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field679[var15]);
			}

			System.out.println("fps:" + field680 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field677 + " mindel:" + field678);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field681 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("GRXJFORE.a(B)V")
	public final void method242() {
		field676 = -2;
		method168();

		if (field687 != null) {
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

	@ObfuscatedName("GRXJFORE.a(ZI)V")
	public final void method243(int arg0) {
		field677 = 1000 / arg0;
	}

	public final void start() {
		if (field676 >= 0) {
			field676 = 0;
		}
	}

	public final void stop() {
		if (field676 >= 0) {
			field676 = 4000 / field677;
		}
	}

	public final void destroy() {
		field676 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field676 == -1) {
			method242();
		}
	}

	public final void update(Graphics arg0) {
		if (field684 == null) {
			field684 = arg0;
		}

		field688 = true;
		method71();
	}

	public final void paint(Graphics arg0) {
		if (field684 == null) {
			field684 = arg0;
		}

		field688 = true;
		method71();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field687 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field690 = 0;
		field695 = var2;
		field696 = var3;
		field697 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field694 = 2;
			field691 = 2;
		} else {
			field694 = 1;
			field691 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field690 = 0;
		field691 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field690 = 0;
		field692 = -1;
		field693 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field687 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field690 = 0;
		field692 = var2;
		field693 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field687 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field690 = 0;
		field692 = var2;
		field693 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field690 = 0;
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
			field702[var3] = 1;
		}

		if (var3 > 4) {
			field703[field705] = var3;
			field705 = field705 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field690 = 0;
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
			field702[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("GRXJFORE.a(I)I")
	public final int method244() {
		int var1 = -1;
		if (field705 != field704) {
			var1 = field703[field704];
			field704 = field704 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field689 = true;
		field688 = true;
		method71();
	}

	public final void focusLost(FocusEvent arg0) {
		field689 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field702[var2] = 0;
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

	@ObfuscatedName("GRXJFORE.a()V")
	public void method102() {
	}

	@ObfuscatedName("GRXJFORE.b(I)V")
	public void method32() {
	}

	@ObfuscatedName("GRXJFORE.c(I)V")
	public void method168() {
	}

	@ObfuscatedName("GRXJFORE.d(I)V")
	public void method157() {
	}

	@ObfuscatedName("GRXJFORE.e(I)V")
	public void method71() {
	}

	@ObfuscatedName("GRXJFORE.f(I)Ljava/awt/Component;")
	public Component method117() {
		if (field687 != null) {
			return field687;
		}

		return this;
	}

	@ObfuscatedName("GRXJFORE.a(Ljava/lang/Runnable;I)V")
	public void method31(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("GRXJFORE.a(BILjava/lang/String;)V")
	public void method58(int arg0, String arg1) {
		while (field684 == null) {
			field684 = method117().getGraphics();

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

		if (field688) {
			field684.setColor(Color.black);
			field684.fillRect(0, 0, field682, field683);
			field688 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field683 / 2 - 18;
		field684.setColor(var6);
		field684.drawRect(field682 / 2 - 152, var7, 304, 34);
		field684.fillRect(field682 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field684.setColor(Color.black);
		field684.fillRect(arg0 * 3 + field682 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field684.setFont(var3);
		field684.setColor(Color.white);
		field684.drawString(arg1, (field682 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
