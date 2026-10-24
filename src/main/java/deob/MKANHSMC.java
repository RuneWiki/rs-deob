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

@ObfuscatedName("MKANHSMC")
public class MKANHSMC extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("MKANHSMC.g")
	public int field1034 = 20;

	@ObfuscatedName("MKANHSMC.h")
	public int field1035 = 1;

	@ObfuscatedName("MKANHSMC.i")
	public long[] field1036 = new long[10];

	@ObfuscatedName("MKANHSMC.k")
	public boolean field1038 = false;

	@ObfuscatedName("MKANHSMC.p")
	public GPLGZASP[] field1043 = new GPLGZASP[6];

	@ObfuscatedName("MKANHSMC.r")
	public boolean field1045 = true;

	@ObfuscatedName("MKANHSMC.s")
	public boolean field1046 = true;

	@ObfuscatedName("MKANHSMC.F")
	public int[] field1059 = new int[128];

	@ObfuscatedName("MKANHSMC.G")
	public int[] field1060 = new int[128];

	@ObfuscatedName("MKANHSMC.f")
	public int field1033;

	@ObfuscatedName("MKANHSMC.j")
	public int field1037;

	@ObfuscatedName("MKANHSMC.l")
	public int field1039;

	@ObfuscatedName("MKANHSMC.m")
	public int field1040;

	@ObfuscatedName("MKANHSMC.t")
	public int field1047;

	@ObfuscatedName("MKANHSMC.u")
	public int field1048;

	@ObfuscatedName("MKANHSMC.v")
	public int field1049;

	@ObfuscatedName("MKANHSMC.w")
	public int field1050;

	@ObfuscatedName("MKANHSMC.x")
	public int field1051;

	@ObfuscatedName("MKANHSMC.y")
	public int field1052;

	@ObfuscatedName("MKANHSMC.z")
	public int field1053;

	@ObfuscatedName("MKANHSMC.B")
	public int field1055;

	@ObfuscatedName("MKANHSMC.C")
	public int field1056;

	@ObfuscatedName("MKANHSMC.D")
	public int field1057;

	@ObfuscatedName("MKANHSMC.H")
	public int field1061;

	@ObfuscatedName("MKANHSMC.I")
	public int field1062;

	@ObfuscatedName("MKANHSMC.A")
	public long field1054;

	@ObfuscatedName("MKANHSMC.E")
	public long field1058;

	@ObfuscatedName("MKANHSMC.o")
	public DTPUNZHN field1042;

	@ObfuscatedName("MKANHSMC.q")
	public GLDYLWRM field1044;

	@ObfuscatedName("MKANHSMC.n")
	public Graphics field1041;

	@ObfuscatedName("MKANHSMC.a(III)V")
	public final void method353(int arg0, int arg1) {
		field1039 = arg1;
		field1040 = arg0;
		field1044 = new GLDYLWRM(this, field1040, field1039);
		field1041 = method135().getGraphics();
		field1042 = new DTPUNZHN(field1040, field1039, method135());
		method90(this, 1);
	}

	@ObfuscatedName("MKANHSMC.b(III)V")
	public final void method354(int arg0, int arg1) {
		field1039 = arg0;
		field1040 = arg1;
		field1041 = method135().getGraphics();
		field1042 = new DTPUNZHN(field1040, field1039, method135());
		method90(this, 1);
	}

	public void run() {
		method135().addMouseListener(this);
		method135().addMouseMotionListener(this);
		method135().addKeyListener(this);
		method135().addFocusListener(this);

		if (field1044 != null) {
			field1044.addWindowListener(this);
		}

		method125("Loading...", 0);
		method176();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field1036[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1033 < 0) {
					if (field1033 == -1) {
						method355();
					}

					return;
				}

				if (field1033 > 0) {
					field1033--;
					if (field1033 == 0) {
						method355();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field1036[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field1036[var1]) {
					var2 = (int) (field1034 * 2560 / (var11 - field1036[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field1034 - (var11 - field1036[var1]) / 10L);
				}

				if (var3 > field1034) {
					var3 = field1034;
				}

				field1036[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field1036[var13] != 0L) {
							field1036[var13] += var3;
						}
					}
				}

				if (var3 < field1035) {
					var3 = field1035;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field1055 = field1051;
					field1056 = field1052;
					field1057 = field1053;
					field1058 = field1054;
					field1051 = 0;
					method94();
					field1061 = field1062;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field1034 > 0) {
					field1037 = var2 * 1000 / (field1034 * 256);
				}

				method73();
			} while (!field1038);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field1036[var15]);
			}

			System.out.println("fps:" + field1037 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field1034 + " mindel:" + field1035);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field1038 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("MKANHSMC.a(I)V")
	public final void method355() {
		field1033 = -2;
		method64();

		if (field1044 != null) {
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

	@ObfuscatedName("MKANHSMC.a(IZ)V")
	public final void method356(int arg0) {
		field1034 = 1000 / arg0;
	}

	public final void start() {
		if (field1033 >= 0) {
			field1033 = 0;
		}
	}

	public final void stop() {
		if (field1033 >= 0) {
			field1033 = 4000 / field1034;
		}
	}

	public final void destroy() {
		field1033 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field1033 == -1) {
			method355();
		}
	}

	public final void update(Graphics arg0) {
		if (field1041 == null) {
			field1041 = arg0;
		}

		field1045 = true;
		method186();
	}

	public final void paint(Graphics arg0) {
		if (field1041 == null) {
			field1041 = arg0;
		}

		field1045 = true;
		method186();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1044 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1047 = 0;
		field1052 = var2;
		field1053 = var3;
		field1054 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field1051 = 2;
			field1048 = 2;
		} else {
			field1051 = 1;
			field1048 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field1047 = 0;
		field1048 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field1047 = 0;
		field1049 = -1;
		field1050 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1044 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1047 = 0;
		field1049 = var2;
		field1050 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1044 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1047 = 0;
		field1049 = var2;
		field1050 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field1047 = 0;
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
			field1059[var3] = 1;
		}

		if (var3 > 4) {
			field1060[field1062] = var3;
			field1062 = field1062 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field1047 = 0;
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
			field1059[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("MKANHSMC.b(I)I")
	public final int method357() {
		int var1 = -1;
		if (field1062 != field1061) {
			var1 = field1060[field1061];
			field1061 = field1061 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field1046 = true;
		field1045 = true;
		method186();
	}

	public final void focusLost(FocusEvent arg0) {
		field1046 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field1059[var2] = 0;
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

	@ObfuscatedName("MKANHSMC.a()V")
	public void method176() {
	}

	@ObfuscatedName("MKANHSMC.a(B)V")
	public void method94() {
	}

	@ObfuscatedName("MKANHSMC.c(I)V")
	public void method64() {
	}

	@ObfuscatedName("MKANHSMC.a(Z)V")
	public void method73() {
	}

	@ObfuscatedName("MKANHSMC.d(I)V")
	public void method186() {
	}

	@ObfuscatedName("MKANHSMC.b(B)Ljava/awt/Component;")
	public Component method135() {
		if (field1044 != null) {
			return field1044;
		}

		return this;
	}

	@ObfuscatedName("MKANHSMC.a(Ljava/lang/Runnable;I)V")
	public void method90(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("MKANHSMC.a(Ljava/lang/String;IB)V")
	public void method125(String arg0, int arg1) {
		while (field1041 == null) {
			field1041 = method135().getGraphics();

			try {
				method135().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method135().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method135().getFontMetrics(var5);

		if (field1045) {
			field1041.setColor(Color.black);
			field1041.fillRect(0, 0, field1039, field1040);
			field1045 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field1040 / 2 - 18;
		field1041.setColor(var6);
		field1041.drawRect(field1039 / 2 - 152, var7, 304, 34);
		field1041.fillRect(field1039 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field1041.setColor(Color.black);
		field1041.fillRect(arg1 * 3 + field1039 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field1041.setFont(var3);
		field1041.setColor(Color.white);
		field1041.drawString(arg0, (field1039 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
