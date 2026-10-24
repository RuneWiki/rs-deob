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

@ObfuscatedName("HJHAUOBE")
public class HJHAUOBE extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("HJHAUOBE.g")
	public int field828 = 20;

	@ObfuscatedName("HJHAUOBE.h")
	public int field829 = 1;

	@ObfuscatedName("HJHAUOBE.i")
	public long[] field830 = new long[10];

	@ObfuscatedName("HJHAUOBE.k")
	public boolean field832 = false;

	@ObfuscatedName("HJHAUOBE.p")
	public WQACZBNG[] field837 = new WQACZBNG[6];

	@ObfuscatedName("HJHAUOBE.r")
	public boolean field839 = true;

	@ObfuscatedName("HJHAUOBE.s")
	public boolean field840 = true;

	@ObfuscatedName("HJHAUOBE.F")
	public int[] field853 = new int[128];

	@ObfuscatedName("HJHAUOBE.G")
	public int[] field854 = new int[128];

	@ObfuscatedName("HJHAUOBE.f")
	public int field827;

	@ObfuscatedName("HJHAUOBE.j")
	public int field831;

	@ObfuscatedName("HJHAUOBE.l")
	public int field833;

	@ObfuscatedName("HJHAUOBE.m")
	public int field834;

	@ObfuscatedName("HJHAUOBE.t")
	public int field841;

	@ObfuscatedName("HJHAUOBE.u")
	public int field842;

	@ObfuscatedName("HJHAUOBE.v")
	public int field843;

	@ObfuscatedName("HJHAUOBE.w")
	public int field844;

	@ObfuscatedName("HJHAUOBE.x")
	public int field845;

	@ObfuscatedName("HJHAUOBE.y")
	public int field846;

	@ObfuscatedName("HJHAUOBE.z")
	public int field847;

	@ObfuscatedName("HJHAUOBE.B")
	public int field849;

	@ObfuscatedName("HJHAUOBE.C")
	public int field850;

	@ObfuscatedName("HJHAUOBE.D")
	public int field851;

	@ObfuscatedName("HJHAUOBE.H")
	public int field855;

	@ObfuscatedName("HJHAUOBE.I")
	public int field856;

	@ObfuscatedName("HJHAUOBE.A")
	public long field848;

	@ObfuscatedName("HJHAUOBE.E")
	public long field852;

	@ObfuscatedName("HJHAUOBE.q")
	public BXWMHFQK field838;

	@ObfuscatedName("HJHAUOBE.o")
	public DRNBRPSO field836;

	@ObfuscatedName("HJHAUOBE.n")
	public Graphics field835;

	@ObfuscatedName("HJHAUOBE.a(III)V")
	public final void method259(int arg0, int arg1) {
		field833 = arg0;
		field834 = arg1;
		field838 = new BXWMHFQK(field833, field834, this);
		field835 = method153().getGraphics();
		field836 = new DRNBRPSO(field834, field833, method153());
		method139(this, 1);
	}

	@ObfuscatedName("HJHAUOBE.b(III)V")
	public final void method260(int arg0, int arg1) {
		field833 = arg1;
		field834 = arg0;
		field835 = method153().getGraphics();
		field836 = new DRNBRPSO(field834, field833, method153());
		method139(this, 1);
	}

	public void run() {
		method153().addMouseListener(this);
		method153().addMouseMotionListener(this);
		method153().addKeyListener(this);
		method153().addFocusListener(this);

		if (field838 != null) {
			field838.addWindowListener(this);
		}

		method55("Loading...", 0);
		method121();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field830[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field827 < 0) {
					if (field827 == -1) {
						method261();
					}

					return;
				}

				if (field827 > 0) {
					field827--;
					if (field827 == 0) {
						method261();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field830[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field830[var1]) {
					var2 = (int) (field828 * 2560 / (var11 - field830[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field828 - (var11 - field830[var1]) / 10L);
				}

				if (var3 > field828) {
					var3 = field828;
				}

				field830[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field830[var13] != 0L) {
							field830[var13] += var3;
						}
					}
				}

				if (var3 < field829) {
					var3 = field829;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field849 = field845;
					field850 = field846;
					field851 = field847;
					field852 = field848;
					field845 = 0;
					method110();
					field855 = field856;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field828 > 0) {
					field831 = var2 * 1000 / (field828 * 256);
				}

				method106();
			} while (!field832);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field830[var15]);
			}

			System.out.println("fps:" + field831 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field828 + " mindel:" + field829);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field832 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("HJHAUOBE.a(I)V")
	public final void method261() {
		field827 = -2;
		method39();

		if (field838 != null) {
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

	@ObfuscatedName("HJHAUOBE.a(ZI)V")
	public final void method262(int arg0) {
		field828 = 1000 / arg0;
	}

	public final void start() {
		if (field827 >= 0) {
			field827 = 0;
		}
	}

	public final void stop() {
		if (field827 >= 0) {
			field827 = 4000 / field828;
		}
	}

	public final void destroy() {
		field827 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field827 == -1) {
			method261();
		}
	}

	public final void update(Graphics arg0) {
		if (field835 == null) {
			field835 = arg0;
		}

		field839 = true;
		method96();
	}

	public final void paint(Graphics arg0) {
		if (field835 == null) {
			field835 = arg0;
		}

		field839 = true;
		method96();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field838 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field841 = 0;
		field846 = var2;
		field847 = var3;
		field848 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field845 = 2;
			field842 = 2;
		} else {
			field845 = 1;
			field842 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field841 = 0;
		field842 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field841 = 0;
		field843 = -1;
		field844 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field838 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field841 = 0;
		field843 = var2;
		field844 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field838 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field841 = 0;
		field843 = var2;
		field844 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field841 = 0;
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
			field853[var3] = 1;
		}

		if (var3 > 4) {
			field854[field856] = var3;
			field856 = field856 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field841 = 0;
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
			field853[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("HJHAUOBE.b(I)I")
	public final int method263() {
		int var1 = -1;
		if (field856 != field855) {
			var1 = field854[field855];
			field855 = field855 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field840 = true;
		field839 = true;
		method96();
	}

	public final void focusLost(FocusEvent arg0) {
		field840 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field853[var2] = 0;
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

	@ObfuscatedName("HJHAUOBE.a()V")
	public void method121() {
	}

	@ObfuscatedName("HJHAUOBE.c(I)V")
	public void method110() {
	}

	@ObfuscatedName("HJHAUOBE.d(I)V")
	public void method39() {
	}

	@ObfuscatedName("HJHAUOBE.a(B)V")
	public void method106() {
	}

	@ObfuscatedName("HJHAUOBE.e(I)V")
	public void method96() {
	}

	@ObfuscatedName("HJHAUOBE.f(I)Ljava/awt/Component;")
	public Component method153() {
		if (field838 != null) {
			return field838;
		}

		return this;
	}

	@ObfuscatedName("HJHAUOBE.a(Ljava/lang/Runnable;I)V")
	public void method139(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("HJHAUOBE.a(Ljava/lang/String;ZI)V")
	public void method55(String arg0, int arg1) {
		while (field835 == null) {
			field835 = method153().getGraphics();

			try {
				method153().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method153().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method153().getFontMetrics(var5);

		if (field839) {
			field835.setColor(Color.black);
			field835.fillRect(0, 0, field833, field834);
			field839 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field834 / 2 - 18;
		field835.setColor(var6);
		field835.drawRect(field833 / 2 - 152, var7, 304, 34);
		field835.fillRect(field833 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field835.setColor(Color.black);
		field835.fillRect(arg1 * 3 + field833 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field835.setFont(var3);
		field835.setColor(Color.white);
		field835.drawString(arg0, (field833 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
