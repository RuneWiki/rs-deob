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

@ObfuscatedName("DZXWUJSL")
public class DZXWUJSL extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("DZXWUJSL.g")
	public int field635 = 20;

	@ObfuscatedName("DZXWUJSL.h")
	public int field636 = 1;

	@ObfuscatedName("DZXWUJSL.i")
	public long[] field637 = new long[10];

	@ObfuscatedName("DZXWUJSL.k")
	public boolean field639 = false;

	@ObfuscatedName("DZXWUJSL.p")
	public SWNASVGQ[] field644 = new SWNASVGQ[6];

	@ObfuscatedName("DZXWUJSL.r")
	public boolean field646 = true;

	@ObfuscatedName("DZXWUJSL.s")
	public boolean field647 = true;

	@ObfuscatedName("DZXWUJSL.F")
	public int[] field660 = new int[128];

	@ObfuscatedName("DZXWUJSL.G")
	public int[] field661 = new int[128];

	@ObfuscatedName("DZXWUJSL.f")
	public int field634;

	@ObfuscatedName("DZXWUJSL.j")
	public int field638;

	@ObfuscatedName("DZXWUJSL.l")
	public int field640;

	@ObfuscatedName("DZXWUJSL.m")
	public int field641;

	@ObfuscatedName("DZXWUJSL.t")
	public int field648;

	@ObfuscatedName("DZXWUJSL.u")
	public int field649;

	@ObfuscatedName("DZXWUJSL.v")
	public int field650;

	@ObfuscatedName("DZXWUJSL.w")
	public int field651;

	@ObfuscatedName("DZXWUJSL.x")
	public int field652;

	@ObfuscatedName("DZXWUJSL.y")
	public int field653;

	@ObfuscatedName("DZXWUJSL.z")
	public int field654;

	@ObfuscatedName("DZXWUJSL.B")
	public int field656;

	@ObfuscatedName("DZXWUJSL.C")
	public int field657;

	@ObfuscatedName("DZXWUJSL.D")
	public int field658;

	@ObfuscatedName("DZXWUJSL.H")
	public int field662;

	@ObfuscatedName("DZXWUJSL.I")
	public int field663;

	@ObfuscatedName("DZXWUJSL.A")
	public long field655;

	@ObfuscatedName("DZXWUJSL.E")
	public long field659;

	@ObfuscatedName("DZXWUJSL.q")
	public IOEGEBWF field645;

	@ObfuscatedName("DZXWUJSL.o")
	public WOKQCNXG field643;

	@ObfuscatedName("DZXWUJSL.n")
	public Graphics field642;

	@ObfuscatedName("DZXWUJSL.a(IZI)V")
	public final void method219(int arg0, int arg1) {
		field640 = arg1;
		field641 = arg0;
		field645 = new IOEGEBWF(field641, field640, this);
		field642 = method122().getGraphics();
		field643 = new WOKQCNXG(field640, field641, method122());
		method131(this, 1);
	}

	@ObfuscatedName("DZXWUJSL.a(III)V")
	public final void method220(int arg0, int arg1) {
		field640 = arg0;
		field641 = arg1;
		field642 = method122().getGraphics();
		field643 = new WOKQCNXG(field640, field641, method122());
		method131(this, 1);
	}

	public void run() {
		method122().addMouseListener(this);
		method122().addMouseMotionListener(this);
		method122().addKeyListener(this);
		method122().addFocusListener(this);

		if (field645 != null) {
			field645.addWindowListener(this);
		}

		method142(0, "Loading...");
		method208();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field637[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field634 < 0) {
					if (field634 == -1) {
						method221();
					}

					return;
				}

				if (field634 > 0) {
					field634--;
					if (field634 == 0) {
						method221();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field637[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field637[var1]) {
					var2 = (int) (field635 * 2560 / (var11 - field637[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field635 - (var11 - field637[var1]) / 10L);
				}

				if (var3 > field635) {
					var3 = field635;
				}

				field637[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field637[var13] != 0L) {
							field637[var13] += var3;
						}
					}
				}

				if (var3 < field636) {
					var3 = field636;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field656 = field652;
					field657 = field653;
					field658 = field654;
					field659 = field655;
					field652 = 0;
					method93();
					field662 = field663;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field635 > 0) {
					field638 = var2 * 1000 / (field635 * 256);
				}

				method100();
			} while (!field639);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field637[var15]);
			}

			System.out.println("fps:" + field638 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field635 + " mindel:" + field636);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field639 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("DZXWUJSL.a(I)V")
	public final void method221() {
		field634 = -2;
		method204();

		if (field645 != null) {
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

	@ObfuscatedName("DZXWUJSL.a(BI)V")
	public final void method222(int arg0) {
		field635 = 1000 / arg0;
	}

	public final void start() {
		if (field634 >= 0) {
			field634 = 0;
		}
	}

	public final void stop() {
		if (field634 >= 0) {
			field634 = 4000 / field635;
		}
	}

	public final void destroy() {
		field634 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field634 == -1) {
			method221();
		}
	}

	public final void update(Graphics arg0) {
		if (field642 == null) {
			field642 = arg0;
		}

		field646 = true;
		method98();
	}

	public final void paint(Graphics arg0) {
		if (field642 == null) {
			field642 = arg0;
		}

		field646 = true;
		method98();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field645 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field648 = 0;
		field653 = var2;
		field654 = var3;
		field655 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field652 = 2;
			field649 = 2;
		} else {
			field652 = 1;
			field649 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field648 = 0;
		field649 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field648 = 0;
		field650 = -1;
		field651 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field645 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field648 = 0;
		field650 = var2;
		field651 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field645 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field648 = 0;
		field650 = var2;
		field651 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field648 = 0;
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
			field660[var3] = 1;
		}

		if (var3 > 4) {
			field661[field663] = var3;
			field663 = field663 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field648 = 0;
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
			field660[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("DZXWUJSL.a(B)I")
	public final int method223() {
		int var1 = -1;
		if (field663 != field662) {
			var1 = field661[field662];
			field662 = field662 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field647 = true;
		field646 = true;
		method98();
	}

	public final void focusLost(FocusEvent arg0) {
		field647 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field660[var2] = 0;
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

	@ObfuscatedName("DZXWUJSL.a()V")
	public void method208() {
	}

	@ObfuscatedName("DZXWUJSL.a(Z)V")
	public void method93() {
	}

	@ObfuscatedName("DZXWUJSL.b(I)V")
	public void method204() {
	}

	@ObfuscatedName("DZXWUJSL.c(I)V")
	public void method100() {
	}

	@ObfuscatedName("DZXWUJSL.d(I)V")
	public void method98() {
	}

	@ObfuscatedName("DZXWUJSL.b(Z)Ljava/awt/Component;")
	public Component method122() {
		if (field645 != null) {
			return field645;
		}

		return this;
	}

	@ObfuscatedName("DZXWUJSL.a(Ljava/lang/Runnable;I)V")
	public void method131(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("DZXWUJSL.a(ILjava/lang/String;Z)V")
	public void method142(int arg0, String arg1) {
		while (field642 == null) {
			field642 = method122().getGraphics();

			try {
				method122().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method122().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method122().getFontMetrics(var5);

		if (field646) {
			field642.setColor(Color.black);
			field642.fillRect(0, 0, field640, field641);
			field646 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field641 / 2 - 18;
		field642.setColor(var6);
		field642.drawRect(field640 / 2 - 152, var7, 304, 34);
		field642.fillRect(field640 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field642.setColor(Color.black);
		field642.fillRect(arg0 * 3 + field640 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field642.setFont(var3);
		field642.setColor(Color.white);
		field642.drawString(arg1, (field640 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
