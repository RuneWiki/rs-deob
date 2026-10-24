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

@ObfuscatedName("CMOCHGYM")
public class CMOCHGYM extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("CMOCHGYM.e")
	public int field468 = 20;

	@ObfuscatedName("CMOCHGYM.f")
	public int field469 = 1;

	@ObfuscatedName("CMOCHGYM.g")
	public long[] field470 = new long[10];

	@ObfuscatedName("CMOCHGYM.i")
	public boolean field472 = false;

	@ObfuscatedName("CMOCHGYM.n")
	public ZWUMKFUX[] field477 = new ZWUMKFUX[6];

	@ObfuscatedName("CMOCHGYM.p")
	public boolean field479 = true;

	@ObfuscatedName("CMOCHGYM.q")
	public boolean field480 = true;

	@ObfuscatedName("CMOCHGYM.D")
	public int[] field493 = new int[128];

	@ObfuscatedName("CMOCHGYM.E")
	public int[] field494 = new int[128];

	@ObfuscatedName("CMOCHGYM.d")
	public int field467;

	@ObfuscatedName("CMOCHGYM.h")
	public int field471;

	@ObfuscatedName("CMOCHGYM.j")
	public int field473;

	@ObfuscatedName("CMOCHGYM.k")
	public int field474;

	@ObfuscatedName("CMOCHGYM.r")
	public int field481;

	@ObfuscatedName("CMOCHGYM.s")
	public int field482;

	@ObfuscatedName("CMOCHGYM.t")
	public int field483;

	@ObfuscatedName("CMOCHGYM.u")
	public int field484;

	@ObfuscatedName("CMOCHGYM.v")
	public int field485;

	@ObfuscatedName("CMOCHGYM.w")
	public int field486;

	@ObfuscatedName("CMOCHGYM.x")
	public int field487;

	@ObfuscatedName("CMOCHGYM.z")
	public int field489;

	@ObfuscatedName("CMOCHGYM.A")
	public int field490;

	@ObfuscatedName("CMOCHGYM.B")
	public int field491;

	@ObfuscatedName("CMOCHGYM.F")
	public int field495;

	@ObfuscatedName("CMOCHGYM.G")
	public int field496;

	@ObfuscatedName("CMOCHGYM.y")
	public long field488;

	@ObfuscatedName("CMOCHGYM.C")
	public long field492;

	@ObfuscatedName("CMOCHGYM.o")
	public FLFIRZAJ field478;

	@ObfuscatedName("CMOCHGYM.m")
	public VOQVBLJN field476;

	@ObfuscatedName("CMOCHGYM.l")
	public Graphics field475;

	@ObfuscatedName("CMOCHGYM.a(ZII)V")
	public final void method151(int arg0, int arg1) {
		field473 = arg1;
		field474 = arg0;
		field478 = new FLFIRZAJ(this, field473, field474);
		field475 = method92().getGraphics();
		field476 = new VOQVBLJN(field474, field473, method92());
		method74(this, 1);
	}

	@ObfuscatedName("CMOCHGYM.a(III)V")
	public final void method152(int arg0, int arg1) {
		field473 = arg1;
		field474 = arg0;
		field475 = method92().getGraphics();
		field476 = new VOQVBLJN(field474, field473, method92());
		method74(this, 1);
	}

	public void run() {
		method92().addMouseListener(this);
		method92().addMouseMotionListener(this);
		method92().addKeyListener(this);
		method92().addFocusListener(this);

		if (field478 != null) {
			field478.addWindowListener(this);
		}

		method32(0, "Loading...");
		method116();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field470[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field467 < 0) {
					if (field467 == -1) {
						method153();
					}

					return;
				}

				if (field467 > 0) {
					field467--;
					if (field467 == 0) {
						method153();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field470[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field470[var1]) {
					var2 = (int) (field468 * 2560 / (var11 - field470[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field468 - (var11 - field470[var1]) / 10L);
				}

				if (var3 > field468) {
					var3 = field468;
				}

				field470[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field470[var13] != 0L) {
							field470[var13] += var3;
						}
					}
				}

				if (var3 < field469) {
					var3 = field469;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field489 = field485;
					field490 = field486;
					field491 = field487;
					field492 = field488;
					field485 = 0;
					method46();
					field495 = field496;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field468 > 0) {
					field471 = var2 * 1000 / (field468 * 256);
				}

				method49();
			} while (!field472);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field470[var15]);
			}

			System.out.println("fps:" + field471 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field468 + " mindel:" + field469);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field472 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("CMOCHGYM.a(I)V")
	public final void method153() {
		field467 = -2;
		method31();

		if (field478 != null) {
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

	@ObfuscatedName("CMOCHGYM.a(II)V")
	public final void method154(int arg0) {
		field468 = 1000 / arg0;
	}

	public final void start() {
		if (field467 >= 0) {
			field467 = 0;
		}
	}

	public final void stop() {
		if (field467 >= 0) {
			field467 = 4000 / field468;
		}
	}

	public final void destroy() {
		field467 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field467 == -1) {
			method153();
		}
	}

	public final void update(Graphics arg0) {
		if (field475 == null) {
			field475 = arg0;
		}

		field479 = true;
		method33();
	}

	public final void paint(Graphics arg0) {
		if (field475 == null) {
			field475 = arg0;
		}

		field479 = true;
		method33();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field478 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field481 = 0;
		field486 = var2;
		field487 = var3;
		field488 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field485 = 2;
			field482 = 2;
		} else {
			field485 = 1;
			field482 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field481 = 0;
		field482 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field481 = 0;
		field483 = -1;
		field484 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field478 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field481 = 0;
		field483 = var2;
		field484 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field478 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field481 = 0;
		field483 = var2;
		field484 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field481 = 0;
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
			field493[var3] = 1;
		}

		if (var3 > 4) {
			field494[field496] = var3;
			field496 = field496 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field481 = 0;
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
			field493[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("CMOCHGYM.b(I)I")
	public final int method155() {
		int var1 = -1;
		if (field496 != field495) {
			var1 = field494[field495];
			field495 = field495 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field480 = true;
		field479 = true;
		method33();
	}

	public final void focusLost(FocusEvent arg0) {
		field480 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field493[var2] = 0;
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

	@ObfuscatedName("CMOCHGYM.a()V")
	public void method116() {
	}

	@ObfuscatedName("CMOCHGYM.a(Z)V")
	public void method46() {
	}

	@ObfuscatedName("CMOCHGYM.c(I)V")
	public void method31() {
	}

	@ObfuscatedName("CMOCHGYM.d(I)V")
	public void method49() {
	}

	@ObfuscatedName("CMOCHGYM.e(I)V")
	public void method33() {
	}

	@ObfuscatedName("CMOCHGYM.b(Z)Ljava/awt/Component;")
	public Component method92() {
		if (field478 != null) {
			return field478;
		}

		return this;
	}

	@ObfuscatedName("CMOCHGYM.a(Ljava/lang/Runnable;I)V")
	public void method74(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("CMOCHGYM.a(IILjava/lang/String;)V")
	public void method32(int arg0, String arg1) {
		while (field475 == null) {
			field475 = method92().getGraphics();

			try {
				method92().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method92().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method92().getFontMetrics(var5);

		if (field479) {
			field475.setColor(Color.black);
			field475.fillRect(0, 0, field473, field474);
			field479 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field474 / 2 - 18;
		field475.setColor(var6);
		field475.drawRect(field473 / 2 - 152, var7, 304, 34);
		field475.fillRect(field473 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field475.setColor(Color.black);
		field475.fillRect(arg0 * 3 + field473 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field475.setFont(var3);
		field475.setColor(Color.white);
		field475.drawString(arg1, (field473 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
