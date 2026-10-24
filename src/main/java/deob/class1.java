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

@ObfuscatedName("a")
public class class1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("a.i")
	public int field1;

	@ObfuscatedName("a.j")
	public int field2 = 20;

	@ObfuscatedName("a.k")
	public int field3 = 1;

	@ObfuscatedName("a.l")
	public long[] field4 = new long[10];

	@ObfuscatedName("a.m")
	public int field5;

	@ObfuscatedName("a.n")
	public boolean field6 = false;

	@ObfuscatedName("a.o")
	public int field7;

	@ObfuscatedName("a.p")
	public int field8;

	@ObfuscatedName("a.q")
	public Graphics field9;

	@ObfuscatedName("a.r")
	public class44 field10;

	@ObfuscatedName("a.s")
	public class36[] field11 = new class36[6];

	@ObfuscatedName("a.t")
	public class2 field12;

	@ObfuscatedName("a.u")
	public boolean field13 = true;

	@ObfuscatedName("a.v")
	public int field14;

	@ObfuscatedName("a.w")
	public int field15;

	@ObfuscatedName("a.x")
	public int field16;

	@ObfuscatedName("a.y")
	public int field17;

	@ObfuscatedName("a.z")
	public int field18;

	@ObfuscatedName("a.C")
	public int[] field21 = new int[128];

	@ObfuscatedName("a.D")
	public int[] field22 = new int[128];

	@ObfuscatedName("a.A")
	public int field19;

	@ObfuscatedName("a.B")
	public int field20;

	@ObfuscatedName("a.E")
	public int field23;

	@ObfuscatedName("a.F")
	public int field24;

	@ObfuscatedName("a.a(III)V")
	public final void method1(int arg0, int arg1) {
		field7 = arg0;
		field8 = arg1;
		field12 = new class2(field7, field8, this);
		field9 = method11().getGraphics();
		field10 = new class44(field8, field7, method11());
		method12(this, 1);
	}

	@ObfuscatedName("a.b(III)V")
	public final void method2(int arg0, int arg1) {
		field7 = arg1;
		field8 = arg0;
		field9 = method11().getGraphics();
		field10 = new class44(field8, field7, method11());
		method12(this, 1);
	}

	public void run() {
		method11().addMouseListener(this);
		method11().addMouseMotionListener(this);
		method11().addKeyListener(this);
		method11().addFocusListener(this);

		if (field12 != null) {
			field12.addWindowListener(this);
		}

		method13("Loading...", 0);
		method6();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field4[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1 < 0) {
					if (field1 == -1) {
						method3();
					}

					return;
				}

				if (field1 > 0) {
					field1--;
					if (field1 == 0) {
						method3();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field4[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field4[var1]) {
					var2 = (int) (field2 * 2560 / (var11 - field4[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field2 - (var11 - field4[var1]) / 10L);
				}

				if (var3 > field2) {
					var3 = field2;
				}

				field4[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field4[var13] != 0L) {
							field4[var13] += var3;
						}
					}
				}

				if (var3 < field3) {
					var3 = field3;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					method7();
					field18 = 0;
					field23 = field24;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field2 > 0) {
					field5 = var2 * 1000 / (field2 * 256);
				}

				method9();
			} while (!field6);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field4[var15]);
			}

			System.out.println("fps:" + field5 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field2 + " mindel:" + field3);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field6 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("a.a(B)V")
	public final void method3() {
		field1 = -2;
		method8();

		try {
			Thread.sleep(1000L);
		} catch (Exception var2) {
		}

		try {
			System.exit(0);
		} catch (Throwable var1) {
		}
	}

	@ObfuscatedName("a.a(IB)V")
	public final void method4(int arg0) {
		field2 = 1000 / arg0;
	}

	public final void start() {
		if (field1 >= 0) {
			field1 = 0;
		}
	}

	public final void stop() {
		if (field1 >= 0) {
			field1 = 4000 / field2;
		}
	}

	public final void destroy() {
		field1 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field1 == -1) {
			method3();
		}
	}

	public final void update(Graphics arg0) {
		if (field9 == null) {
			field9 = arg0;
		}

		field13 = true;
		method10();
	}

	public final void paint(Graphics arg0) {
		if (field9 == null) {
			field9 = arg0;
		}

		field13 = true;
		method10();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field12 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field14 = 0;
		field19 = var2;
		field20 = var3;

		if (arg0.isMetaDown()) {
			field18 = 2;
			field15 = 2;
		} else {
			field18 = 1;
			field15 = 1;
		}

		if (class6.field122) {
			class6.method48(arg0.isMetaDown() ? 1 : 0, var2, var3);
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field14 = 0;
		field15 = 0;

		if (class6.field122) {
			class6.method49(arg0.isMetaDown() ? 1 : 0);
		}
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
		if (class6.field122) {
			class6.method55();
		}
	}

	public final void mouseExited(MouseEvent arg0) {
		if (class6.field122) {
			class6.method56();
		}
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field12 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field14 = 0;
		field16 = var2;
		field17 = var3;

		if (class6.field122) {
			class6.method50(var3, var2);
		}
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field12 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field14 = 0;
		field16 = var2;
		field17 = var3;

		if (class6.field122) {
			class6.method50(var3, var2);
		}
	}

	public final void keyPressed(KeyEvent arg0) {
		field14 = 0;
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
			field21[var3] = 1;
		}

		if (var3 > 4) {
			field22[field24] = var3;
			field24 = field24 + 1 & 0x7F;
		}

		if (class6.field122) {
			class6.method51(var3);
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field14 = 0;
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
			field21[var3] = 0;
		}

		if (class6.field122) {
			class6.method52(var3);
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	public final void focusGained(FocusEvent arg0) {
		field13 = true;
		method10();

		if (class6.field122) {
			class6.method53();
		}
	}

	public final void focusLost(FocusEvent arg0) {
		if (class6.field122) {
			class6.method54();
		}
	}

	@ObfuscatedName("a.b(B)I")
	public final int method5() {
		int var1 = -1;
		if (field24 != field23) {
			var1 = field22[field23];
			field23 = field23 + 1 & 0x7F;
		}

		return var1;
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

	@ObfuscatedName("a.a()V")
	public void method6() {
	}

	@ObfuscatedName("a.a(Z)V")
	public void method7() {
	}

	@ObfuscatedName("a.c(B)V")
	public void method8() {
	}

	@ObfuscatedName("a.a(I)V")
	public void method9() {
	}

	@ObfuscatedName("a.d(B)V")
	public void method10() {
	}

	@ObfuscatedName("a.e(B)Ljava/awt/Component;")
	public Component method11() {
		if (field12 != null) {
			return field12;
		}

		return this;
	}

	@ObfuscatedName("a.a(Ljava/lang/Runnable;I)V")
	public void method12(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("a.a(Ljava/lang/String;BI)V")
	public void method13(String arg0, int arg1) {
		while (field9 == null) {
			field9 = method11().getGraphics();

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

		if (field13) {
			field9.setColor(Color.black);
			field9.fillRect(0, 0, field7, field8);
			field13 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field8 / 2 - 18;
		field9.setColor(var6);
		field9.drawRect(field7 / 2 - 152, var7, 304, 34);
		field9.fillRect(field7 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field9.setColor(Color.black);
		field9.fillRect(arg1 * 3 + field7 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field9.setFont(var3);
		field9.setColor(Color.white);
		field9.drawString(arg0, (field7 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
