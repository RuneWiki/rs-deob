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

	@ObfuscatedName("a.f")
	public int field1;

	@ObfuscatedName("a.g")
	public int field2 = 20;

	@ObfuscatedName("a.h")
	public int field3 = 1;

	@ObfuscatedName("a.i")
	public long[] field4 = new long[10];

	@ObfuscatedName("a.j")
	public int field5;

	@ObfuscatedName("a.k")
	public int field6;

	@ObfuscatedName("a.l")
	public int field7;

	@ObfuscatedName("a.m")
	public Graphics field8;

	@ObfuscatedName("a.n")
	public class42 field9;

	@ObfuscatedName("a.o")
	public class33[] field10 = new class33[6];

	@ObfuscatedName("a.p")
	public class2 field11;

	@ObfuscatedName("a.q")
	public boolean field12 = true;

	@ObfuscatedName("a.r")
	public int field13;

	@ObfuscatedName("a.s")
	public int field14;

	@ObfuscatedName("a.t")
	public int field15;

	@ObfuscatedName("a.u")
	public int field16;

	@ObfuscatedName("a.v")
	public int field17;

	@ObfuscatedName("a.w")
	public int field18;

	@ObfuscatedName("a.x")
	public int field19;

	@ObfuscatedName("a.y")
	public int[] field20 = new int[128];

	@ObfuscatedName("a.z")
	public int[] field21 = new int[128];

	@ObfuscatedName("a.A")
	public int field22;

	@ObfuscatedName("a.B")
	public int field23;

	@ObfuscatedName("a.a(IBI)V")
	public final void method1(int arg0, int arg1) {
		field6 = arg1;
		field7 = arg0;
		field11 = new class2(field6, this, field7);
		field8 = method11().getGraphics();
		field9 = new class42(field7, field6, method11());
		method12(this, 1);
	}

	@ObfuscatedName("a.b(IBI)V")
	public final void method2(int arg0, int arg1) {
		field6 = arg1;
		field7 = arg0;
		field8 = method11().getGraphics();
		field9 = new class42(field7, field6, method11());
		method12(this, 1);
	}

	public void run() {
		System.out.println("Registering event listeners");
		method11().addMouseListener(this);
		method11().addMouseMotionListener(this);
		method11().addKeyListener(this);
		method11().addFocusListener(this);

		if (field11 != null) {
			field11.addWindowListener(this);
		}

		method13("Loading...", 0);
		method6();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;

		for (int var5 = 0; var5 < 10; var5++) {
			field4[var5] = System.currentTimeMillis();
		}

		long var6 = System.currentTimeMillis();

		while (field1 >= 0) {
			if (field1 > 0) {
				field1--;
				if (field1 == 0) {
					method3();
					return;
				}
			}

			int var8 = var2;
			int var9 = var3;
			var2 = 300;
			var3 = 1;
			long var10 = System.currentTimeMillis();
			if (field4[var1] == 0L) {
				var2 = var8;
				var3 = var9;
			} else if (var10 > field4[var1]) {
				var2 = (int) (field2 * 2560 / (var10 - field4[var1]));
			}

			if (var2 < 25) {
				var2 = 25;
			}

			if (var2 > 256) {
				var2 = 256;
				var3 = (int) (field2 - (var10 - field4[var1]) / 10L);
			}

			field4[var1] = var10;
			var1 = (var1 + 1) % 10;

			if (var3 > 1) {
				for (int var12 = 0; var12 < 10; var12++) {
					if (field4[var12] != 0L) {
						field4[var12] += var3;
					}
				}
			}

			if (var3 < field3) {
				var3 = field3;
			}

			try {
				Thread.sleep(var3);
			} catch (InterruptedException var13) {
			}

			while (var4 < 256) {
				method7();
				field17 = 0;
				field22 = field23;
				var4 += var2;
			}

			var4 &= 0xFF;

			if (field2 > 0) {
				field5 = var2 * 1000 / (field2 * 256);
			}

			method9();
		}

		if (field1 == -1) {
			method3();
		}
	}

	@ObfuscatedName("a.a(B)V")
	public final void method3() {
		field1 = -2;
		System.out.println("Closing program");
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

	@ObfuscatedName("a.a(II)V")
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
			System.out.println("5 seconds expired, forcing kill");
			method3();
		}
	}

	public final void update(Graphics arg0) {
		field12 = true;
		method10();
	}

	public final void paint(Graphics arg0) {
		field12 = true;
		method10();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field11 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field13 = 0;
		field18 = var2;
		field19 = var3;

		if (arg0.isMetaDown()) {
			field17 = 2;
			field14 = 2;
		} else {
			field17 = 1;
			field14 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field13 = 0;
		field14 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field11 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field13 = 0;
		field15 = var2;
		field16 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field11 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field13 = 0;
		field15 = var2;
		field16 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field13 = 0;
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
			field20[var3] = 1;
		}

		if (var3 > 4) {
			field21[field23] = var3;
			field23 = field23 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field13 = 0;
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
			field20[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	public final void focusGained(FocusEvent arg0) {
		field12 = true;
		method10();
	}

	public final void focusLost(FocusEvent arg0) {
	}

	@ObfuscatedName("a.a(Z)I")
	public final int method5() {
		int var1 = -1;
		if (field23 != field22) {
			var1 = field21[field22];
			field22 = field22 + 1 & 0x7F;
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

	@ObfuscatedName("a.a(I)V")
	public void method7() {
	}

	@ObfuscatedName("a.b(B)V")
	public void method8() {
	}

	@ObfuscatedName("a.b(I)V")
	public void method9() {
	}

	@ObfuscatedName("a.c(I)V")
	public void method10() {
	}

	@ObfuscatedName("a.c(B)Ljava/awt/Component;")
	public Component method11() {
		if (field11 != null) {
			return field11;
		}

		return this;
	}

	@ObfuscatedName("a.a(Ljava/lang/Runnable;I)V")
	public void method12(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("a.a(Ljava/lang/String;IZ)V")
	public void method13(String arg0, int arg1) {
		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method11().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method11().getFontMetrics(var5);

		if (field12) {
			field8.setColor(Color.black);
			field8.fillRect(0, 0, field6, field7);
			field12 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field7 / 2 - 18;
		field8.setColor(var6);
		field8.drawRect(field6 / 2 - 152, var7, 304, 34);
		field8.fillRect(field6 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field8.setColor(Color.black);
		field8.fillRect(arg1 * 3 + field6 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field8.setFont(var3);
		field8.setColor(Color.white);
		field8.drawString(arg0, (field6 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
