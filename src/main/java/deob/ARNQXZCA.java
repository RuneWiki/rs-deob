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

@ObfuscatedName("ARNQXZCA")
public class ARNQXZCA extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("ARNQXZCA.e")
	public int field57 = 20;

	@ObfuscatedName("ARNQXZCA.f")
	public int field58 = 1;

	@ObfuscatedName("ARNQXZCA.g")
	public long[] field59 = new long[10];

	@ObfuscatedName("ARNQXZCA.i")
	public boolean field61 = false;

	@ObfuscatedName("ARNQXZCA.n")
	public INRTBCYJ[] field66 = new INRTBCYJ[6];

	@ObfuscatedName("ARNQXZCA.p")
	public boolean field68 = true;

	@ObfuscatedName("ARNQXZCA.q")
	public boolean field69 = true;

	@ObfuscatedName("ARNQXZCA.D")
	public int[] field82 = new int[128];

	@ObfuscatedName("ARNQXZCA.E")
	public int[] field83 = new int[128];

	@ObfuscatedName("ARNQXZCA.d")
	public int field56;

	@ObfuscatedName("ARNQXZCA.h")
	public int field60;

	@ObfuscatedName("ARNQXZCA.j")
	public int field62;

	@ObfuscatedName("ARNQXZCA.k")
	public int field63;

	@ObfuscatedName("ARNQXZCA.r")
	public int field70;

	@ObfuscatedName("ARNQXZCA.s")
	public int field71;

	@ObfuscatedName("ARNQXZCA.t")
	public int field72;

	@ObfuscatedName("ARNQXZCA.u")
	public int field73;

	@ObfuscatedName("ARNQXZCA.v")
	public int field74;

	@ObfuscatedName("ARNQXZCA.w")
	public int field75;

	@ObfuscatedName("ARNQXZCA.x")
	public int field76;

	@ObfuscatedName("ARNQXZCA.z")
	public int field78;

	@ObfuscatedName("ARNQXZCA.A")
	public int field79;

	@ObfuscatedName("ARNQXZCA.B")
	public int field80;

	@ObfuscatedName("ARNQXZCA.F")
	public int field84;

	@ObfuscatedName("ARNQXZCA.G")
	public int field85;

	@ObfuscatedName("ARNQXZCA.y")
	public long field77;

	@ObfuscatedName("ARNQXZCA.C")
	public long field81;

	@ObfuscatedName("ARNQXZCA.o")
	public BKXQAFLU field67;

	@ObfuscatedName("ARNQXZCA.m")
	public NMOELDRY field65;

	@ObfuscatedName("ARNQXZCA.l")
	public Graphics field64;

	@ObfuscatedName("ARNQXZCA.a(III)V")
	public final void method7(int arg0, int arg1) {
		field62 = arg1;
		field63 = arg0;
		field67 = new BKXQAFLU(field62, field63, this);
		field64 = method17().getGraphics();
		field65 = new NMOELDRY(field63, field62, method17());
		method18(this, 1);
	}

	@ObfuscatedName("ARNQXZCA.a(IBI)V")
	public final void method8(int arg0, int arg1) {
		field62 = arg0;
		field63 = arg1;
		field64 = method17().getGraphics();
		field65 = new NMOELDRY(field63, field62, method17());
		method18(this, 1);
	}

	public void run() {
		method17().addMouseListener(this);
		method17().addMouseMotionListener(this);
		method17().addKeyListener(this);
		method17().addFocusListener(this);

		if (field67 != null) {
			field67.addWindowListener(this);
		}

		method19(0, "Loading...");
		method12();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field59[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field56 < 0) {
					if (field56 == -1) {
						method9();
					}

					return;
				}

				if (field56 > 0) {
					field56--;
					if (field56 == 0) {
						method9();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field59[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field59[var1]) {
					var2 = (int) (field57 * 2560 / (var11 - field59[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field57 - (var11 - field59[var1]) / 10L);
				}

				if (var3 > field57) {
					var3 = field57;
				}

				field59[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field59[var13] != 0L) {
							field59[var13] += var3;
						}
					}
				}

				if (var3 < field58) {
					var3 = field58;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field78 = field74;
					field79 = field75;
					field80 = field76;
					field81 = field77;
					field74 = 0;
					method13();
					field84 = field85;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field57 > 0) {
					field60 = var2 * 1000 / (field57 * 256);
				}

				method15();
			} while (!field61);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field59[var15]);
			}

			System.out.println("fps:" + field60 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field57 + " mindel:" + field58);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field61 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("ARNQXZCA.a(I)V")
	public final void method9() {
		field56 = -2;
		method14();

		if (field67 != null) {
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

	@ObfuscatedName("ARNQXZCA.a(II)V")
	public final void method10(int arg0) {
		field57 = 1000 / arg0;
	}

	public final void start() {
		if (field56 >= 0) {
			field56 = 0;
		}
	}

	public final void stop() {
		if (field56 >= 0) {
			field56 = 4000 / field57;
		}
	}

	public final void destroy() {
		field56 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field56 == -1) {
			method9();
		}
	}

	public final void update(Graphics arg0) {
		if (field64 == null) {
			field64 = arg0;
		}

		field68 = true;
		method16();
	}

	public final void paint(Graphics arg0) {
		if (field64 == null) {
			field64 = arg0;
		}

		field68 = true;
		method16();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field67 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field70 = 0;
		field75 = var2;
		field76 = var3;
		field77 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field74 = 2;
			field71 = 2;
		} else {
			field74 = 1;
			field71 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field70 = 0;
		field71 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field70 = 0;
		field72 = -1;
		field73 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field67 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field70 = 0;
		field72 = var2;
		field73 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field67 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field70 = 0;
		field72 = var2;
		field73 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field70 = 0;
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
			field82[var3] = 1;
		}

		if (var3 > 4) {
			field83[field85] = var3;
			field85 = field85 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field70 = 0;
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
			field82[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("ARNQXZCA.b(I)I")
	public final int method11() {
		int var1 = -1;
		if (field85 != field84) {
			var1 = field83[field84];
			field84 = field84 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field69 = true;
		field68 = true;
		method16();
	}

	public final void focusLost(FocusEvent arg0) {
		field69 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field82[var2] = 0;
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

	@ObfuscatedName("ARNQXZCA.a()V")
	public void method12() {
	}

	@ObfuscatedName("ARNQXZCA.a(Z)V")
	public void method13() {
	}

	@ObfuscatedName("ARNQXZCA.c(I)V")
	public void method14() {
	}

	@ObfuscatedName("ARNQXZCA.d(I)V")
	public void method15() {
	}

	@ObfuscatedName("ARNQXZCA.b(Z)V")
	public void method16() {
	}

	@ObfuscatedName("ARNQXZCA.e(I)Ljava/awt/Component;")
	public Component method17() {
		if (field67 != null) {
			return field67;
		}

		return this;
	}

	@ObfuscatedName("ARNQXZCA.a(Ljava/lang/Runnable;I)V")
	public void method18(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("ARNQXZCA.a(IILjava/lang/String;)V")
	public void method19(int arg0, String arg1) {
		while (field64 == null) {
			field64 = method17().getGraphics();

			try {
				method17().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method17().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method17().getFontMetrics(var5);

		if (field68) {
			field64.setColor(Color.black);
			field64.fillRect(0, 0, field62, field63);
			field68 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field63 / 2 - 18;
		field64.setColor(var6);
		field64.drawRect(field62 / 2 - 152, var7, 304, 34);
		field64.fillRect(field62 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field64.setColor(Color.black);
		field64.fillRect(arg0 * 3 + field62 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field64.setFont(var3);
		field64.setColor(Color.white);
		field64.drawString(arg1, (field62 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
