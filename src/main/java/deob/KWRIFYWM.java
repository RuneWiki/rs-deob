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

@ObfuscatedName("KWRIFYWM")
public class KWRIFYWM extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("KWRIFYWM.e")
	public int field864 = 20;

	@ObfuscatedName("KWRIFYWM.f")
	public int field865 = 1;

	@ObfuscatedName("KWRIFYWM.g")
	public long[] field866 = new long[10];

	@ObfuscatedName("KWRIFYWM.i")
	public boolean field868 = false;

	@ObfuscatedName("KWRIFYWM.n")
	public HOSNGCXH[] field873 = new HOSNGCXH[6];

	@ObfuscatedName("KWRIFYWM.p")
	public boolean field875 = true;

	@ObfuscatedName("KWRIFYWM.q")
	public boolean field876 = true;

	@ObfuscatedName("KWRIFYWM.D")
	public int[] field889 = new int[128];

	@ObfuscatedName("KWRIFYWM.E")
	public int[] field890 = new int[128];

	@ObfuscatedName("KWRIFYWM.d")
	public int field863;

	@ObfuscatedName("KWRIFYWM.h")
	public int field867;

	@ObfuscatedName("KWRIFYWM.j")
	public int field869;

	@ObfuscatedName("KWRIFYWM.k")
	public int field870;

	@ObfuscatedName("KWRIFYWM.r")
	public int field877;

	@ObfuscatedName("KWRIFYWM.s")
	public int field878;

	@ObfuscatedName("KWRIFYWM.t")
	public int field879;

	@ObfuscatedName("KWRIFYWM.u")
	public int field880;

	@ObfuscatedName("KWRIFYWM.v")
	public int field881;

	@ObfuscatedName("KWRIFYWM.w")
	public int field882;

	@ObfuscatedName("KWRIFYWM.x")
	public int field883;

	@ObfuscatedName("KWRIFYWM.z")
	public int field885;

	@ObfuscatedName("KWRIFYWM.A")
	public int field886;

	@ObfuscatedName("KWRIFYWM.B")
	public int field887;

	@ObfuscatedName("KWRIFYWM.F")
	public int field891;

	@ObfuscatedName("KWRIFYWM.G")
	public int field892;

	@ObfuscatedName("KWRIFYWM.y")
	public long field884;

	@ObfuscatedName("KWRIFYWM.C")
	public long field888;

	@ObfuscatedName("KWRIFYWM.o")
	public HAQQOONQ field874;

	@ObfuscatedName("KWRIFYWM.m")
	public YJGBGRIO field872;

	@ObfuscatedName("KWRIFYWM.l")
	public Graphics field871;

	@ObfuscatedName("KWRIFYWM.a(IIZ)V")
	public final void method408(int arg0, int arg1) {
		field869 = arg1;
		field870 = arg0;
		field874 = new HAQQOONQ(field870, this, field869);
		field871 = method139().getGraphics();
		field872 = new YJGBGRIO(method139(), field869, field870);
		method51(this, 1);
	}

	@ObfuscatedName("KWRIFYWM.a(III)V")
	public final void method409(int arg0, int arg1) {
		field869 = arg1;
		field870 = arg0;
		field871 = method139().getGraphics();
		field872 = new YJGBGRIO(method139(), field869, field870);
		method51(this, 1);
	}

	public void run() {
		method139().addMouseListener(this);
		method139().addMouseMotionListener(this);
		method139().addKeyListener(this);
		method139().addFocusListener(this);

		if (field874 != null) {
			field874.addWindowListener(this);
		}

		method92("Loading...", 0);
		method151();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field866[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field863 < 0) {
					if (field863 == -1) {
						method410();
					}

					return;
				}

				if (field863 > 0) {
					field863--;
					if (field863 == 0) {
						method410();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field866[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field866[var1]) {
					var2 = (int) (field864 * 2560 / (var11 - field866[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field864 - (var11 - field866[var1]) / 10L);
				}

				if (var3 > field864) {
					var3 = field864;
				}

				field866[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field866[var13] != 0L) {
							field866[var13] += var3;
						}
					}
				}

				if (var3 < field865) {
					var3 = field865;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field885 = field881;
					field886 = field882;
					field887 = field883;
					field888 = field884;
					field881 = 0;
					method127();
					field891 = field892;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field864 > 0) {
					field867 = var2 * 1000 / (field864 * 256);
				}

				method150();
			} while (!field868);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field866[var15]);
			}

			System.out.println("fps:" + field867 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field864 + " mindel:" + field865);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field868 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("KWRIFYWM.a(I)V")
	public final void method410() {
		field863 = -2;
		method147();

		if (field874 != null) {
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

	@ObfuscatedName("KWRIFYWM.a(BI)V")
	public final void method411(int arg0) {
		field864 = 1000 / arg0;
	}

	public final void start() {
		if (field863 >= 0) {
			field863 = 0;
		}
	}

	public final void stop() {
		if (field863 >= 0) {
			field863 = 4000 / field864;
		}
	}

	public final void destroy() {
		field863 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field863 == -1) {
			method410();
		}
	}

	public final void update(Graphics arg0) {
		if (field871 == null) {
			field871 = arg0;
		}

		field875 = true;
		method109();
	}

	public final void paint(Graphics arg0) {
		if (field871 == null) {
			field871 = arg0;
		}

		field875 = true;
		method109();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field874 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field877 = 0;
		field882 = var2;
		field883 = var3;
		field884 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field881 = 2;
			field878 = 2;
		} else {
			field881 = 1;
			field878 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field877 = 0;
		field878 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field877 = 0;
		field879 = -1;
		field880 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field874 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field877 = 0;
		field879 = var2;
		field880 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field874 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field877 = 0;
		field879 = var2;
		field880 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field877 = 0;
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
			field889[var3] = 1;
		}

		if (var3 > 4) {
			field890[field892] = var3;
			field892 = field892 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field877 = 0;
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
			field889[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("KWRIFYWM.a(Z)I")
	public final int method412() {
		int var1 = -1;
		if (field892 != field891) {
			var1 = field890[field891];
			field891 = field891 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field876 = true;
		field875 = true;
		method109();
	}

	public final void focusLost(FocusEvent arg0) {
		field876 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field889[var2] = 0;
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

	@ObfuscatedName("KWRIFYWM.a()V")
	public void method151() {
	}

	@ObfuscatedName("KWRIFYWM.a(B)V")
	public void method127() {
	}

	@ObfuscatedName("KWRIFYWM.b(B)V")
	public void method147() {
	}

	@ObfuscatedName("KWRIFYWM.c(B)V")
	public void method150() {
	}

	@ObfuscatedName("KWRIFYWM.d(B)V")
	public void method109() {
	}

	@ObfuscatedName("KWRIFYWM.b(I)Ljava/awt/Component;")
	public Component method139() {
		if (field874 != null) {
			return field874;
		}

		return this;
	}

	@ObfuscatedName("KWRIFYWM.a(Ljava/lang/Runnable;I)V")
	public void method51(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("KWRIFYWM.a(Ljava/lang/String;IB)V")
	public void method92(String arg0, int arg1) {
		while (field871 == null) {
			field871 = method139().getGraphics();

			try {
				method139().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method139().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method139().getFontMetrics(var5);

		if (field875) {
			field871.setColor(Color.black);
			field871.fillRect(0, 0, field869, field870);
			field875 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field870 / 2 - 18;
		field871.setColor(var6);
		field871.drawRect(field869 / 2 - 152, var7, 304, 34);
		field871.fillRect(field869 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field871.setColor(Color.black);
		field871.fillRect(arg1 * 3 + field869 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field871.setFont(var3);
		field871.setColor(Color.white);
		field871.drawString(arg0, (field869 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
