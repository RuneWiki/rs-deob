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

@ObfuscatedName("EOQQYERM")
public class EOQQYERM extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("EOQQYERM.i")
	public int field498 = 20;

	@ObfuscatedName("EOQQYERM.j")
	public int field499 = 1;

	@ObfuscatedName("EOQQYERM.k")
	public long[] field500 = new long[10];

	@ObfuscatedName("EOQQYERM.m")
	public boolean field502 = false;

	@ObfuscatedName("EOQQYERM.r")
	public KUDWIDHU[] field507 = new KUDWIDHU[6];

	@ObfuscatedName("EOQQYERM.t")
	public boolean field509 = true;

	@ObfuscatedName("EOQQYERM.u")
	public boolean field510 = true;

	@ObfuscatedName("EOQQYERM.H")
	public int[] field523 = new int[128];

	@ObfuscatedName("EOQQYERM.I")
	public int[] field524 = new int[128];

	@ObfuscatedName("EOQQYERM.h")
	public int field497;

	@ObfuscatedName("EOQQYERM.l")
	public int field501;

	@ObfuscatedName("EOQQYERM.n")
	public int field503;

	@ObfuscatedName("EOQQYERM.o")
	public int field504;

	@ObfuscatedName("EOQQYERM.v")
	public int field511;

	@ObfuscatedName("EOQQYERM.w")
	public int field512;

	@ObfuscatedName("EOQQYERM.x")
	public int field513;

	@ObfuscatedName("EOQQYERM.y")
	public int field514;

	@ObfuscatedName("EOQQYERM.z")
	public int field515;

	@ObfuscatedName("EOQQYERM.A")
	public int field516;

	@ObfuscatedName("EOQQYERM.B")
	public int field517;

	@ObfuscatedName("EOQQYERM.D")
	public int field519;

	@ObfuscatedName("EOQQYERM.E")
	public int field520;

	@ObfuscatedName("EOQQYERM.F")
	public int field521;

	@ObfuscatedName("EOQQYERM.J")
	public int field525;

	@ObfuscatedName("EOQQYERM.K")
	public int field526;

	@ObfuscatedName("EOQQYERM.C")
	public long field518;

	@ObfuscatedName("EOQQYERM.G")
	public long field522;

	@ObfuscatedName("EOQQYERM.q")
	public HZYGKZDT field506;

	@ObfuscatedName("EOQQYERM.s")
	public PXHNRURM field508;

	@ObfuscatedName("EOQQYERM.p")
	public Graphics field505;

	@ObfuscatedName("EOQQYERM.a(III)V")
	public final void method189(int arg0, int arg1) {
		field503 = arg0;
		field504 = arg1;
		field508 = new PXHNRURM(field503, field504, this);
		field505 = method109().getGraphics();
		field506 = new HZYGKZDT(method109(), field503, field504);
		method107(this, 1);
	}

	@ObfuscatedName("EOQQYERM.b(III)V")
	public final void method190(int arg0, int arg1) {
		field503 = arg0;
		field504 = arg1;
		field505 = method109().getGraphics();
		field506 = new HZYGKZDT(method109(), field503, field504);
		method107(this, 1);
	}

	public void run() {
		method109().addMouseListener(this);
		method109().addMouseMotionListener(this);
		method109().addKeyListener(this);
		method109().addFocusListener(this);

		if (field508 != null) {
			field508.addWindowListener(this);
		}

		method172("Loading...", 0);
		method120();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field500[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field497 < 0) {
					if (field497 == -1) {
						method191();
					}

					return;
				}

				if (field497 > 0) {
					field497--;
					if (field497 == 0) {
						method191();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field500[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field500[var1]) {
					var2 = (int) (field498 * 2560 / (var11 - field500[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field498 - (var11 - field500[var1]) / 10L);
				}

				if (var3 > field498) {
					var3 = field498;
				}

				field500[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field500[var13] != 0L) {
							field500[var13] += var3;
						}
					}
				}

				if (var3 < field499) {
					var3 = field499;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field519 = field515;
					field520 = field516;
					field521 = field517;
					field522 = field518;
					field515 = 0;
					method57();
					field525 = field526;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field498 > 0) {
					field501 = var2 * 1000 / (field498 * 256);
				}

				method61();
			} while (!field502);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field500[var15]);
			}

			System.out.println("fps:" + field501 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field498 + " mindel:" + field499);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field502 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("EOQQYERM.a(B)V")
	public final void method191() {
		field497 = -2;
		method103();

		if (field508 != null) {
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

	@ObfuscatedName("EOQQYERM.a(ZI)V")
	public final void method192(int arg0) {
		field498 = 1000 / arg0;
	}

	public final void start() {
		if (field497 >= 0) {
			field497 = 0;
		}
	}

	public final void stop() {
		if (field497 >= 0) {
			field497 = 4000 / field498;
		}
	}

	public final void destroy() {
		field497 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field497 == -1) {
			method191();
		}
	}

	public final void update(Graphics arg0) {
		if (field505 == null) {
			field505 = arg0;
		}

		field509 = true;
		method64();
	}

	public final void paint(Graphics arg0) {
		if (field505 == null) {
			field505 = arg0;
		}

		field509 = true;
		method64();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field508 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field511 = 0;
		field516 = var2;
		field517 = var3;
		field518 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field515 = 2;
			field512 = 2;
		} else {
			field515 = 1;
			field512 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field511 = 0;
		field512 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field511 = 0;
		field513 = -1;
		field514 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field508 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field511 = 0;
		field513 = var2;
		field514 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field508 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field511 = 0;
		field513 = var2;
		field514 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field511 = 0;
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
			field523[var3] = 1;
		}

		if (var3 > 4) {
			field524[field526] = var3;
			field526 = field526 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field511 = 0;
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
			field523[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("EOQQYERM.a(I)I")
	public final int method193() {
		int var1 = -1;
		if (field526 != field525) {
			var1 = field524[field525];
			field525 = field525 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field510 = true;
		field509 = true;
		method64();
	}

	public final void focusLost(FocusEvent arg0) {
		field510 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field523[var2] = 0;
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

	@ObfuscatedName("EOQQYERM.a()V")
	public void method120() {
	}

	@ObfuscatedName("EOQQYERM.b(I)V")
	public void method57() {
	}

	@ObfuscatedName("EOQQYERM.c(I)V")
	public void method103() {
	}

	@ObfuscatedName("EOQQYERM.d(I)V")
	public void method61() {
	}

	@ObfuscatedName("EOQQYERM.b(B)V")
	public void method64() {
	}

	@ObfuscatedName("EOQQYERM.e(I)Ljava/awt/Component;")
	public Component method109() {
		if (field508 != null) {
			return field508;
		}

		return this;
	}

	@ObfuscatedName("EOQQYERM.a(Ljava/lang/Runnable;I)V")
	public void method107(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("EOQQYERM.a(ILjava/lang/String;I)V")
	public void method172(String arg0, int arg1) {
		while (field505 == null) {
			field505 = method109().getGraphics();

			try {
				method109().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method109().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method109().getFontMetrics(var5);

		if (field509) {
			field505.setColor(Color.black);
			field505.fillRect(0, 0, field503, field504);
			field509 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field504 / 2 - 18;
		field505.setColor(var6);
		field505.drawRect(field503 / 2 - 152, var7, 304, 34);
		field505.fillRect(field503 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field505.setColor(Color.black);
		field505.fillRect(arg1 * 3 + field503 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field505.setFont(var3);
		field505.setColor(Color.white);
		field505.drawString(arg0, (field503 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
