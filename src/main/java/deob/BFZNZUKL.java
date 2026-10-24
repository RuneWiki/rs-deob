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

@ObfuscatedName("BFZNZUKL")
public class BFZNZUKL extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("BFZNZUKL.f")
	public int field14 = 20;

	@ObfuscatedName("BFZNZUKL.g")
	public int field15 = 1;

	@ObfuscatedName("BFZNZUKL.h")
	public long[] field16 = new long[10];

	@ObfuscatedName("BFZNZUKL.j")
	public boolean field18 = false;

	@ObfuscatedName("BFZNZUKL.o")
	public QEHNWGKD[] field23 = new QEHNWGKD[6];

	@ObfuscatedName("BFZNZUKL.q")
	public boolean field25 = true;

	@ObfuscatedName("BFZNZUKL.r")
	public boolean field26 = true;

	@ObfuscatedName("BFZNZUKL.E")
	public int[] field39 = new int[128];

	@ObfuscatedName("BFZNZUKL.F")
	public int[] field40 = new int[128];

	@ObfuscatedName("BFZNZUKL.e")
	public int field13;

	@ObfuscatedName("BFZNZUKL.i")
	public int field17;

	@ObfuscatedName("BFZNZUKL.k")
	public int field19;

	@ObfuscatedName("BFZNZUKL.l")
	public int field20;

	@ObfuscatedName("BFZNZUKL.s")
	public int field27;

	@ObfuscatedName("BFZNZUKL.t")
	public int field28;

	@ObfuscatedName("BFZNZUKL.u")
	public int field29;

	@ObfuscatedName("BFZNZUKL.v")
	public int field30;

	@ObfuscatedName("BFZNZUKL.w")
	public int field31;

	@ObfuscatedName("BFZNZUKL.x")
	public int field32;

	@ObfuscatedName("BFZNZUKL.y")
	public int field33;

	@ObfuscatedName("BFZNZUKL.A")
	public int field35;

	@ObfuscatedName("BFZNZUKL.B")
	public int field36;

	@ObfuscatedName("BFZNZUKL.C")
	public int field37;

	@ObfuscatedName("BFZNZUKL.G")
	public int field41;

	@ObfuscatedName("BFZNZUKL.H")
	public int field42;

	@ObfuscatedName("BFZNZUKL.z")
	public long field34;

	@ObfuscatedName("BFZNZUKL.D")
	public long field38;

	@ObfuscatedName("BFZNZUKL.n")
	public MEXICRKY field22;

	@ObfuscatedName("BFZNZUKL.p")
	public VCIVYIXH field24;

	@ObfuscatedName("BFZNZUKL.m")
	public Graphics field21;

	@ObfuscatedName("BFZNZUKL.a(IZI)V")
	public final void method1(int arg0, int arg1) {
		field19 = arg0;
		field20 = arg1;
		field24 = new VCIVYIXH(field20, this, field19);
		field21 = method11().getGraphics();
		field22 = new MEXICRKY(field20, field19, method11());
		method12(this, 1);
	}

	@ObfuscatedName("BFZNZUKL.a(IIB)V")
	public final void method2(int arg0, int arg1) {
		field19 = arg0;
		field20 = arg1;
		field21 = method11().getGraphics();
		field22 = new MEXICRKY(field20, field19, method11());
		method12(this, 1);
	}

	public void run() {
		method11().addMouseListener(this);
		method11().addMouseMotionListener(this);
		method11().addKeyListener(this);
		method11().addFocusListener(this);

		if (field24 != null) {
			field24.addWindowListener(this);
		}

		method13(0, "Loading...");
		method6();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field16[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field13 < 0) {
					if (field13 == -1) {
						method3();
					}

					return;
				}

				if (field13 > 0) {
					field13--;
					if (field13 == 0) {
						method3();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field16[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field16[var1]) {
					var2 = (int) (field14 * 2560 / (var11 - field16[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field14 - (var11 - field16[var1]) / 10L);
				}

				if (var3 > field14) {
					var3 = field14;
				}

				field16[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field16[var13] != 0L) {
							field16[var13] += var3;
						}
					}
				}

				if (var3 < field15) {
					var3 = field15;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field35 = field31;
					field36 = field32;
					field37 = field33;
					field38 = field34;
					field31 = 0;
					method7();
					field41 = field42;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field14 > 0) {
					field17 = var2 * 1000 / (field14 * 256);
				}

				method9();
			} while (!field18);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field16[var15]);
			}

			System.out.println("fps:" + field17 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field14 + " mindel:" + field15);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field18 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("BFZNZUKL.a(Z)V")
	public final void method3() {
		field13 = -2;
		method8();

		if (field24 != null) {
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

	@ObfuscatedName("BFZNZUKL.a(II)V")
	public final void method4(int arg0) {
		field14 = 1000 / arg0;
	}

	public final void start() {
		if (field13 >= 0) {
			field13 = 0;
		}
	}

	public final void stop() {
		if (field13 >= 0) {
			field13 = 4000 / field14;
		}
	}

	public final void destroy() {
		field13 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field13 == -1) {
			method3();
		}
	}

	public final void update(Graphics arg0) {
		if (field21 == null) {
			field21 = arg0;
		}

		field25 = true;
		method10();
	}

	public final void paint(Graphics arg0) {
		if (field21 == null) {
			field21 = arg0;
		}

		field25 = true;
		method10();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field24 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field27 = 0;
		field32 = var2;
		field33 = var3;
		field34 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field31 = 2;
			field28 = 2;
		} else {
			field31 = 1;
			field28 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field27 = 0;
		field28 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field27 = 0;
		field29 = -1;
		field30 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field24 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field27 = 0;
		field29 = var2;
		field30 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field24 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field27 = 0;
		field29 = var2;
		field30 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field27 = 0;
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
			field39[var3] = 1;
		}

		if (var3 > 4) {
			field40[field42] = var3;
			field42 = field42 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field27 = 0;
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
			field39[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("BFZNZUKL.a(I)I")
	public final int method5() {
		int var1 = -1;
		if (field42 != field41) {
			var1 = field40[field41];
			field41 = field41 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field26 = true;
		field25 = true;
		method10();
	}

	public final void focusLost(FocusEvent arg0) {
		field26 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field39[var2] = 0;
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

	@ObfuscatedName("BFZNZUKL.a()V")
	public void method6() {
	}

	@ObfuscatedName("BFZNZUKL.b(I)V")
	public void method7() {
	}

	@ObfuscatedName("BFZNZUKL.b(Z)V")
	public void method8() {
	}

	@ObfuscatedName("BFZNZUKL.c(I)V")
	public void method9() {
	}

	@ObfuscatedName("BFZNZUKL.d(I)V")
	public void method10() {
	}

	@ObfuscatedName("BFZNZUKL.e(I)Ljava/awt/Component;")
	public Component method11() {
		if (field24 != null) {
			return field24;
		}

		return this;
	}

	@ObfuscatedName("BFZNZUKL.a(Ljava/lang/Runnable;I)V")
	public void method12(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("BFZNZUKL.a(IBLjava/lang/String;)V")
	public void method13(int arg0, String arg1) {
		while (field21 == null) {
			field21 = method11().getGraphics();

			try {
				method11().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method11().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method11().getFontMetrics(var5);

		if (field25) {
			field21.setColor(Color.black);
			field21.fillRect(0, 0, field19, field20);
			field25 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field20 / 2 - 18;
		field21.setColor(var6);
		field21.drawRect(field19 / 2 - 152, var7, 304, 34);
		field21.fillRect(field19 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field21.setColor(Color.black);
		field21.fillRect(arg0 * 3 + field19 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field21.setFont(var3);
		field21.setColor(Color.white);
		field21.drawString(arg1, (field19 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
