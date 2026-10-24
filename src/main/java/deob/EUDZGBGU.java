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

@ObfuscatedName("EUDZGBGU")
public class EUDZGBGU extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("EUDZGBGU.g")
	public int field669 = 20;

	@ObfuscatedName("EUDZGBGU.h")
	public int field670 = 1;

	@ObfuscatedName("EUDZGBGU.i")
	public long[] field671 = new long[10];

	@ObfuscatedName("EUDZGBGU.k")
	public boolean field673 = false;

	@ObfuscatedName("EUDZGBGU.p")
	public PDMJJHOP[] field678 = new PDMJJHOP[6];

	@ObfuscatedName("EUDZGBGU.r")
	public boolean field680 = true;

	@ObfuscatedName("EUDZGBGU.s")
	public boolean field681 = true;

	@ObfuscatedName("EUDZGBGU.F")
	public int[] field694 = new int[128];

	@ObfuscatedName("EUDZGBGU.G")
	public int[] field695 = new int[128];

	@ObfuscatedName("EUDZGBGU.f")
	public int field668;

	@ObfuscatedName("EUDZGBGU.j")
	public int field672;

	@ObfuscatedName("EUDZGBGU.l")
	public int field674;

	@ObfuscatedName("EUDZGBGU.m")
	public int field675;

	@ObfuscatedName("EUDZGBGU.t")
	public int field682;

	@ObfuscatedName("EUDZGBGU.u")
	public int field683;

	@ObfuscatedName("EUDZGBGU.v")
	public int field684;

	@ObfuscatedName("EUDZGBGU.w")
	public int field685;

	@ObfuscatedName("EUDZGBGU.x")
	public int field686;

	@ObfuscatedName("EUDZGBGU.y")
	public int field687;

	@ObfuscatedName("EUDZGBGU.z")
	public int field688;

	@ObfuscatedName("EUDZGBGU.B")
	public int field690;

	@ObfuscatedName("EUDZGBGU.C")
	public int field691;

	@ObfuscatedName("EUDZGBGU.D")
	public int field692;

	@ObfuscatedName("EUDZGBGU.H")
	public int field696;

	@ObfuscatedName("EUDZGBGU.I")
	public int field697;

	@ObfuscatedName("EUDZGBGU.A")
	public long field689;

	@ObfuscatedName("EUDZGBGU.E")
	public long field693;

	@ObfuscatedName("EUDZGBGU.o")
	public BVMYRJQC field677;

	@ObfuscatedName("EUDZGBGU.q")
	public IUROYOHP field679;

	@ObfuscatedName("EUDZGBGU.n")
	public Graphics field676;

	@ObfuscatedName("EUDZGBGU.a(BII)V")
	public final void method207(int arg0, int arg1) {
		field674 = arg1;
		field675 = arg0;
		field679 = new IUROYOHP(field675, field674, this);
		field676 = method107().getGraphics();
		field677 = new BVMYRJQC(field675, method107(), field674);
		method47(this, 1);
	}

	@ObfuscatedName("EUDZGBGU.a(III)V")
	public final void method208(int arg0, int arg1) {
		field674 = arg1;
		field675 = arg0;
		field676 = method107().getGraphics();
		field677 = new BVMYRJQC(field675, method107(), field674);
		method47(this, 1);
	}

	public void run() {
		method107().addMouseListener(this);
		method107().addMouseMotionListener(this);
		method107().addKeyListener(this);
		method107().addFocusListener(this);

		if (field679 != null) {
			field679.addWindowListener(this);
		}

		method142(0, "Loading...");
		method81();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field671[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field668 < 0) {
					if (field668 == -1) {
						method209();
					}

					return;
				}

				if (field668 > 0) {
					field668--;
					if (field668 == 0) {
						method209();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field671[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field671[var1]) {
					var2 = (int) (field669 * 2560 / (var11 - field671[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field669 - (var11 - field671[var1]) / 10L);
				}

				if (var3 > field669) {
					var3 = field669;
				}

				field671[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field671[var13] != 0L) {
							field671[var13] += var3;
						}
					}
				}

				if (var3 < field670) {
					var3 = field670;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field690 = field686;
					field691 = field687;
					field692 = field688;
					field693 = field689;
					field686 = 0;
					method92();
					field696 = field697;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field669 > 0) {
					field672 = var2 * 1000 / (field669 * 256);
				}

				method182();
			} while (!field673);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field671[var15]);
			}

			System.out.println("fps:" + field672 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field669 + " mindel:" + field670);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field673 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("EUDZGBGU.a(Z)V")
	public final void method209() {
		field668 = -2;
		method53();

		if (field679 != null) {
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

	@ObfuscatedName("EUDZGBGU.a(II)V")
	public final void method210(int arg0) {
		field669 = 1000 / arg0;
	}

	public final void start() {
		if (field668 >= 0) {
			field668 = 0;
		}
	}

	public final void stop() {
		if (field668 >= 0) {
			field668 = 4000 / field669;
		}
	}

	public final void destroy() {
		field668 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field668 == -1) {
			method209();
		}
	}

	public final void update(Graphics arg0) {
		if (field676 == null) {
			field676 = arg0;
		}

		field680 = true;
		method91();
	}

	public final void paint(Graphics arg0) {
		if (field676 == null) {
			field676 = arg0;
		}

		field680 = true;
		method91();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field679 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field682 = 0;
		field687 = var2;
		field688 = var3;
		field689 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field686 = 2;
			field683 = 2;
		} else {
			field686 = 1;
			field683 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field682 = 0;
		field683 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field682 = 0;
		field684 = -1;
		field685 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field679 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field682 = 0;
		field684 = var2;
		field685 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field679 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field682 = 0;
		field684 = var2;
		field685 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field682 = 0;
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
			field694[var3] = 1;
		}

		if (var3 > 4) {
			field695[field697] = var3;
			field697 = field697 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field682 = 0;
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
			field694[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("EUDZGBGU.a(I)I")
	public final int method211() {
		int var1 = -1;
		if (field697 != field696) {
			var1 = field695[field696];
			field696 = field696 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field681 = true;
		field680 = true;
		method91();
	}

	public final void focusLost(FocusEvent arg0) {
		field681 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field694[var2] = 0;
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

	@ObfuscatedName("EUDZGBGU.a()V")
	public void method81() {
	}

	@ObfuscatedName("EUDZGBGU.b(I)V")
	public void method92() {
	}

	@ObfuscatedName("EUDZGBGU.c(I)V")
	public void method53() {
	}

	@ObfuscatedName("EUDZGBGU.a(B)V")
	public void method182() {
	}

	@ObfuscatedName("EUDZGBGU.b(B)V")
	public void method91() {
	}

	@ObfuscatedName("EUDZGBGU.d(I)Ljava/awt/Component;")
	public Component method107() {
		if (field679 != null) {
			return field679;
		}

		return this;
	}

	@ObfuscatedName("EUDZGBGU.a(Ljava/lang/Runnable;I)V")
	public void method47(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("EUDZGBGU.a(ILjava/lang/String;I)V")
	public void method142(int arg0, String arg1) {
		while (field676 == null) {
			field676 = method107().getGraphics();

			try {
				method107().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method107().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method107().getFontMetrics(var5);

		if (field680) {
			field676.setColor(Color.black);
			field676.fillRect(0, 0, field674, field675);
			field680 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field675 / 2 - 18;
		field676.setColor(var6);
		field676.drawRect(field674 / 2 - 152, var7, 304, 34);
		field676.fillRect(field674 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field676.setColor(Color.black);
		field676.fillRect(arg0 * 3 + field674 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field676.setFont(var3);
		field676.setColor(Color.white);
		field676.drawString(arg1, (field674 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
