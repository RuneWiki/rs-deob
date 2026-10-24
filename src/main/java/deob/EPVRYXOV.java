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

@ObfuscatedName("EPVRYXOV")
public class EPVRYXOV extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("EPVRYXOV.h")
	public int field538 = 20;

	@ObfuscatedName("EPVRYXOV.i")
	public int field539 = 1;

	@ObfuscatedName("EPVRYXOV.j")
	public long[] field540 = new long[10];

	@ObfuscatedName("EPVRYXOV.l")
	public boolean field542 = false;

	@ObfuscatedName("EPVRYXOV.q")
	public FKNRMZJV[] field547 = new FKNRMZJV[6];

	@ObfuscatedName("EPVRYXOV.s")
	public boolean field549 = true;

	@ObfuscatedName("EPVRYXOV.t")
	public boolean field550 = true;

	@ObfuscatedName("EPVRYXOV.G")
	public int[] field563 = new int[128];

	@ObfuscatedName("EPVRYXOV.H")
	public int[] field564 = new int[128];

	@ObfuscatedName("EPVRYXOV.g")
	public int field537;

	@ObfuscatedName("EPVRYXOV.k")
	public int field541;

	@ObfuscatedName("EPVRYXOV.m")
	public int field543;

	@ObfuscatedName("EPVRYXOV.n")
	public int field544;

	@ObfuscatedName("EPVRYXOV.u")
	public int field551;

	@ObfuscatedName("EPVRYXOV.v")
	public int field552;

	@ObfuscatedName("EPVRYXOV.w")
	public int field553;

	@ObfuscatedName("EPVRYXOV.x")
	public int field554;

	@ObfuscatedName("EPVRYXOV.y")
	public int field555;

	@ObfuscatedName("EPVRYXOV.z")
	public int field556;

	@ObfuscatedName("EPVRYXOV.A")
	public int field557;

	@ObfuscatedName("EPVRYXOV.C")
	public int field559;

	@ObfuscatedName("EPVRYXOV.D")
	public int field560;

	@ObfuscatedName("EPVRYXOV.E")
	public int field561;

	@ObfuscatedName("EPVRYXOV.I")
	public int field565;

	@ObfuscatedName("EPVRYXOV.J")
	public int field566;

	@ObfuscatedName("EPVRYXOV.B")
	public long field558;

	@ObfuscatedName("EPVRYXOV.F")
	public long field562;

	@ObfuscatedName("EPVRYXOV.p")
	public ERQSZFRT field546;

	@ObfuscatedName("EPVRYXOV.r")
	public INDYOKOE field548;

	@ObfuscatedName("EPVRYXOV.o")
	public Graphics field545;

	@ObfuscatedName("EPVRYXOV.a(IIZ)V")
	public final void method168(int arg0, int arg1) {
		field543 = arg0;
		field544 = arg1;
		field548 = new INDYOKOE(field544, this, field543);
		field545 = method73().getGraphics();
		field546 = new ERQSZFRT(field544, field543, method73());
		method142(this, 1);
	}

	@ObfuscatedName("EPVRYXOV.a(III)V")
	public final void method169(int arg0, int arg1) {
		field543 = arg1;
		field544 = arg0;
		field545 = method73().getGraphics();
		field546 = new ERQSZFRT(field544, field543, method73());
		method142(this, 1);
	}

	public void run() {
		method73().addMouseListener(this);
		method73().addMouseMotionListener(this);
		method73().addKeyListener(this);
		method73().addFocusListener(this);

		if (field548 != null) {
			field548.addWindowListener(this);
		}

		method101(0, "Loading...");
		method132();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field540[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field537 < 0) {
					if (field537 == -1) {
						method170();
					}

					return;
				}

				if (field537 > 0) {
					field537--;
					if (field537 == 0) {
						method170();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field540[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field540[var1]) {
					var2 = (int) (field538 * 2560 / (var11 - field540[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field538 - (var11 - field540[var1]) / 10L);
				}

				if (var3 > field538) {
					var3 = field538;
				}

				field540[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field540[var13] != 0L) {
							field540[var13] += var3;
						}
					}
				}

				if (var3 < field539) {
					var3 = field539;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field559 = field555;
					field560 = field556;
					field561 = field557;
					field562 = field558;
					field555 = 0;
					method81();
					field565 = field566;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field538 > 0) {
					field541 = var2 * 1000 / (field538 * 256);
				}

				method137();
			} while (!field542);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field540[var15]);
			}

			System.out.println("fps:" + field541 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field538 + " mindel:" + field539);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field542 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("EPVRYXOV.a(I)V")
	public final void method170() {
		field537 = -2;
		method136();

		if (field548 != null) {
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

	@ObfuscatedName("EPVRYXOV.a(IB)V")
	public final void method171(int arg0) {
		field538 = 1000 / arg0;
	}

	public final void start() {
		if (field537 >= 0) {
			field537 = 0;
		}
	}

	public final void stop() {
		if (field537 >= 0) {
			field537 = 4000 / field538;
		}
	}

	public final void destroy() {
		field537 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field537 == -1) {
			method170();
		}
	}

	public final void update(Graphics arg0) {
		if (field545 == null) {
			field545 = arg0;
		}

		field549 = true;
		method114();
	}

	public final void paint(Graphics arg0) {
		if (field545 == null) {
			field545 = arg0;
		}

		field549 = true;
		method114();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field548 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field551 = 0;
		field556 = var2;
		field557 = var3;
		field558 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field555 = 2;
			field552 = 2;
		} else {
			field555 = 1;
			field552 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field551 = 0;
		field552 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field551 = 0;
		field553 = -1;
		field554 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field548 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field551 = 0;
		field553 = var2;
		field554 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field548 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field551 = 0;
		field553 = var2;
		field554 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field551 = 0;
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
			field563[var3] = 1;
		}

		if (var3 > 4) {
			field564[field566] = var3;
			field566 = field566 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field551 = 0;
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
			field563[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("EPVRYXOV.b(I)I")
	public final int method172() {
		int var1 = -1;
		if (field566 != field565) {
			var1 = field564[field565];
			field565 = field565 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field550 = true;
		field549 = true;
		method114();
	}

	public final void focusLost(FocusEvent arg0) {
		field550 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field563[var2] = 0;
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

	@ObfuscatedName("EPVRYXOV.a()V")
	public void method132() {
	}

	@ObfuscatedName("EPVRYXOV.a(Z)V")
	public void method81() {
	}

	@ObfuscatedName("EPVRYXOV.c(I)V")
	public void method136() {
	}

	@ObfuscatedName("EPVRYXOV.d(I)V")
	public void method137() {
	}

	@ObfuscatedName("EPVRYXOV.e(I)V")
	public void method114() {
	}

	@ObfuscatedName("EPVRYXOV.f(I)Ljava/awt/Component;")
	public Component method73() {
		if (field548 != null) {
			return field548;
		}

		return this;
	}

	@ObfuscatedName("EPVRYXOV.a(Ljava/lang/Runnable;I)V")
	public void method142(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("EPVRYXOV.a(IILjava/lang/String;)V")
	public void method101(int arg0, String arg1) {
		while (field545 == null) {
			field545 = method73().getGraphics();

			try {
				method73().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method73().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method73().getFontMetrics(var5);

		if (field549) {
			field545.setColor(Color.black);
			field545.fillRect(0, 0, field543, field544);
			field549 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field544 / 2 - 18;
		field545.setColor(var6);
		field545.drawRect(field543 / 2 - 152, var7, 304, 34);
		field545.fillRect(field543 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field545.setColor(Color.black);
		field545.fillRect(arg0 * 3 + field543 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field545.setFont(var3);
		field545.setColor(Color.white);
		field545.drawString(arg1, (field543 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
