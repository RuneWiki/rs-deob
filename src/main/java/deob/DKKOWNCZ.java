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

@ObfuscatedName("DKKOWNCZ")
public class DKKOWNCZ extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("DKKOWNCZ.f")
	public int field499 = 20;

	@ObfuscatedName("DKKOWNCZ.g")
	public int field500 = 1;

	@ObfuscatedName("DKKOWNCZ.h")
	public long[] field501 = new long[10];

	@ObfuscatedName("DKKOWNCZ.j")
	public boolean field503 = false;

	@ObfuscatedName("DKKOWNCZ.o")
	public EYTQJNEM[] field508 = new EYTQJNEM[6];

	@ObfuscatedName("DKKOWNCZ.q")
	public boolean field510 = true;

	@ObfuscatedName("DKKOWNCZ.r")
	public boolean field511 = true;

	@ObfuscatedName("DKKOWNCZ.E")
	public int[] field524 = new int[128];

	@ObfuscatedName("DKKOWNCZ.F")
	public int[] field525 = new int[128];

	@ObfuscatedName("DKKOWNCZ.e")
	public int field498;

	@ObfuscatedName("DKKOWNCZ.i")
	public int field502;

	@ObfuscatedName("DKKOWNCZ.k")
	public int field504;

	@ObfuscatedName("DKKOWNCZ.l")
	public int field505;

	@ObfuscatedName("DKKOWNCZ.s")
	public int field512;

	@ObfuscatedName("DKKOWNCZ.t")
	public int field513;

	@ObfuscatedName("DKKOWNCZ.u")
	public int field514;

	@ObfuscatedName("DKKOWNCZ.v")
	public int field515;

	@ObfuscatedName("DKKOWNCZ.w")
	public int field516;

	@ObfuscatedName("DKKOWNCZ.x")
	public int field517;

	@ObfuscatedName("DKKOWNCZ.y")
	public int field518;

	@ObfuscatedName("DKKOWNCZ.A")
	public int field520;

	@ObfuscatedName("DKKOWNCZ.B")
	public int field521;

	@ObfuscatedName("DKKOWNCZ.C")
	public int field522;

	@ObfuscatedName("DKKOWNCZ.G")
	public int field526;

	@ObfuscatedName("DKKOWNCZ.H")
	public int field527;

	@ObfuscatedName("DKKOWNCZ.z")
	public long field519;

	@ObfuscatedName("DKKOWNCZ.D")
	public long field523;

	@ObfuscatedName("DKKOWNCZ.n")
	public ARAKDHLD field507;

	@ObfuscatedName("DKKOWNCZ.p")
	public RFAAYJYN field509;

	@ObfuscatedName("DKKOWNCZ.m")
	public Graphics field506;

	@ObfuscatedName("DKKOWNCZ.a(ZII)V")
	public final void method179(int arg0, int arg1) {
		field504 = arg1;
		field505 = arg0;
		field509 = new RFAAYJYN(field504, field505, this);
		field506 = method135().getGraphics();
		field507 = new ARAKDHLD(field505, method135(), field504);
		method101(this, 1);
	}

	@ObfuscatedName("DKKOWNCZ.a(III)V")
	public final void method180(int arg0, int arg1) {
		field504 = arg0;
		field505 = arg1;
		field506 = method135().getGraphics();
		field507 = new ARAKDHLD(field505, method135(), field504);
		method101(this, 1);
	}

	public void run() {
		method135().addMouseListener(this);
		method135().addMouseMotionListener(this);
		method135().addKeyListener(this);
		method135().addFocusListener(this);

		if (field509 != null) {
			field509.addWindowListener(this);
		}

		method79("Loading...", 0);
		method62();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field501[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field498 < 0) {
					if (field498 == -1) {
						method181();
					}

					return;
				}

				if (field498 > 0) {
					field498--;
					if (field498 == 0) {
						method181();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field501[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field501[var1]) {
					var2 = (int) (field499 * 2560 / (var11 - field501[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field499 - (var11 - field501[var1]) / 10L);
				}

				if (var3 > field499) {
					var3 = field499;
				}

				field501[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field501[var13] != 0L) {
							field501[var13] += var3;
						}
					}
				}

				if (var3 < field500) {
					var3 = field500;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field520 = field516;
					field521 = field517;
					field522 = field518;
					field523 = field519;
					field516 = 0;
					method126();
					field526 = field527;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field499 > 0) {
					field502 = var2 * 1000 / (field499 * 256);
				}

				method123();
			} while (!field503);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field501[var15]);
			}

			System.out.println("fps:" + field502 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field499 + " mindel:" + field500);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field503 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("DKKOWNCZ.a(B)V")
	public final void method181() {
		field498 = -2;
		method31();

		if (field509 != null) {
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

	@ObfuscatedName("DKKOWNCZ.a(II)V")
	public final void method182(int arg0) {
		field499 = 1000 / arg0;
	}

	public final void start() {
		if (field498 >= 0) {
			field498 = 0;
		}
	}

	public final void stop() {
		if (field498 >= 0) {
			field498 = 4000 / field499;
		}
	}

	public final void destroy() {
		field498 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field498 == -1) {
			method181();
		}
	}

	public final void update(Graphics arg0) {
		if (field506 == null) {
			field506 = arg0;
		}

		field510 = true;
		method141();
	}

	public final void paint(Graphics arg0) {
		if (field506 == null) {
			field506 = arg0;
		}

		field510 = true;
		method141();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field509 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field512 = 0;
		field517 = var2;
		field518 = var3;
		field519 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field516 = 2;
			field513 = 2;
		} else {
			field516 = 1;
			field513 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field512 = 0;
		field513 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field512 = 0;
		field514 = -1;
		field515 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field509 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field512 = 0;
		field514 = var2;
		field515 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field509 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field512 = 0;
		field514 = var2;
		field515 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field512 = 0;
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
			field524[var3] = 1;
		}

		if (var3 > 4) {
			field525[field527] = var3;
			field527 = field527 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field512 = 0;
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
			field524[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("DKKOWNCZ.a(I)I")
	public final int method183() {
		int var1 = -1;
		if (field527 != field526) {
			var1 = field525[field526];
			field526 = field526 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field511 = true;
		field510 = true;
		method141();
	}

	public final void focusLost(FocusEvent arg0) {
		field511 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field524[var2] = 0;
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

	@ObfuscatedName("DKKOWNCZ.a()V")
	public void method62() {
	}

	@ObfuscatedName("DKKOWNCZ.b(B)V")
	public void method126() {
	}

	@ObfuscatedName("DKKOWNCZ.c(B)V")
	public void method31() {
	}

	@ObfuscatedName("DKKOWNCZ.a(Z)V")
	public void method123() {
	}

	@ObfuscatedName("DKKOWNCZ.b(Z)V")
	public void method141() {
	}

	@ObfuscatedName("DKKOWNCZ.b(I)Ljava/awt/Component;")
	public Component method135() {
		if (field509 != null) {
			return field509;
		}

		return this;
	}

	@ObfuscatedName("DKKOWNCZ.a(Ljava/lang/Runnable;I)V")
	public void method101(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("DKKOWNCZ.a(ILjava/lang/String;I)V")
	public void method79(String arg0, int arg1) {
		while (field506 == null) {
			field506 = method135().getGraphics();

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

		if (field510) {
			field506.setColor(Color.black);
			field506.fillRect(0, 0, field504, field505);
			field510 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field505 / 2 - 18;
		field506.setColor(var6);
		field506.drawRect(field504 / 2 - 152, var7, 304, 34);
		field506.fillRect(field504 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field506.setColor(Color.black);
		field506.fillRect(arg1 * 3 + field504 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field506.setFont(var3);
		field506.setColor(Color.white);
		field506.drawString(arg0, (field504 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
