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

@ObfuscatedName("EBSHSFRY")
public class EBSHSFRY extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("EBSHSFRY.h")
	public int field696 = 20;

	@ObfuscatedName("EBSHSFRY.i")
	public int field697 = 1;

	@ObfuscatedName("EBSHSFRY.j")
	public long[] field698 = new long[10];

	@ObfuscatedName("EBSHSFRY.l")
	public boolean field700 = false;

	@ObfuscatedName("EBSHSFRY.q")
	public VZJVQLEE[] field705 = new VZJVQLEE[6];

	@ObfuscatedName("EBSHSFRY.s")
	public boolean field707 = true;

	@ObfuscatedName("EBSHSFRY.t")
	public boolean field708 = true;

	@ObfuscatedName("EBSHSFRY.G")
	public int[] field721 = new int[128];

	@ObfuscatedName("EBSHSFRY.H")
	public int[] field722 = new int[128];

	@ObfuscatedName("EBSHSFRY.g")
	public int field695;

	@ObfuscatedName("EBSHSFRY.k")
	public int field699;

	@ObfuscatedName("EBSHSFRY.m")
	public int field701;

	@ObfuscatedName("EBSHSFRY.n")
	public int field702;

	@ObfuscatedName("EBSHSFRY.u")
	public int field709;

	@ObfuscatedName("EBSHSFRY.v")
	public int field710;

	@ObfuscatedName("EBSHSFRY.w")
	public int field711;

	@ObfuscatedName("EBSHSFRY.x")
	public int field712;

	@ObfuscatedName("EBSHSFRY.y")
	public int field713;

	@ObfuscatedName("EBSHSFRY.z")
	public int field714;

	@ObfuscatedName("EBSHSFRY.A")
	public int field715;

	@ObfuscatedName("EBSHSFRY.C")
	public int field717;

	@ObfuscatedName("EBSHSFRY.D")
	public int field718;

	@ObfuscatedName("EBSHSFRY.E")
	public int field719;

	@ObfuscatedName("EBSHSFRY.I")
	public int field723;

	@ObfuscatedName("EBSHSFRY.J")
	public int field724;

	@ObfuscatedName("EBSHSFRY.B")
	public long field716;

	@ObfuscatedName("EBSHSFRY.F")
	public long field720;

	@ObfuscatedName("EBSHSFRY.r")
	public GDXGVBDZ field706;

	@ObfuscatedName("EBSHSFRY.p")
	public HURULSIZ field704;

	@ObfuscatedName("EBSHSFRY.o")
	public Graphics field703;

	@ObfuscatedName("EBSHSFRY.a(IBI)V")
	public final void method246(int arg0, int arg1) {
		field701 = arg1;
		field702 = arg0;
		field706 = new GDXGVBDZ(field701, field702, this);
		field703 = method65().getGraphics();
		field704 = new HURULSIZ(field702, field701, method65());
		method58(this, 1);
	}

	@ObfuscatedName("EBSHSFRY.b(IBI)V")
	public final void method247(int arg0, int arg1) {
		field701 = arg1;
		field702 = arg0;
		field703 = method65().getGraphics();
		field704 = new HURULSIZ(field702, field701, method65());
		method58(this, 1);
	}

	public void run() {
		method65().addMouseListener(this);
		method65().addMouseMotionListener(this);
		method65().addKeyListener(this);
		method65().addFocusListener(this);

		if (field706 != null) {
			field706.addWindowListener(this);
		}

		method51(0, "Loading...");
		method113();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field698[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field695 < 0) {
					if (field695 == -1) {
						method248();
					}

					return;
				}

				if (field695 > 0) {
					field695--;
					if (field695 == 0) {
						method248();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field698[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field698[var1]) {
					var2 = (int) (field696 * 2560 / (var11 - field698[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field696 - (var11 - field698[var1]) / 10L);
				}

				if (var3 > field696) {
					var3 = field696;
				}

				field698[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field698[var13] != 0L) {
							field698[var13] += var3;
						}
					}
				}

				if (var3 < field697) {
					var3 = field697;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field717 = field713;
					field718 = field714;
					field719 = field715;
					field720 = field716;
					field713 = 0;
					method140();
					field723 = field724;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field696 > 0) {
					field699 = var2 * 1000 / (field696 * 256);
				}

				method30();
			} while (!field700);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field698[var15]);
			}

			System.out.println("fps:" + field699 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field696 + " mindel:" + field697);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field700 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("EBSHSFRY.a(Z)V")
	public final void method248() {
		field695 = -2;
		method123();

		if (field706 != null) {
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

	@ObfuscatedName("EBSHSFRY.a(II)V")
	public final void method249(int arg0) {
		field696 = 1000 / arg0;
	}

	public final void start() {
		if (field695 >= 0) {
			field695 = 0;
		}
	}

	public final void stop() {
		if (field695 >= 0) {
			field695 = 4000 / field696;
		}
	}

	public final void destroy() {
		field695 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field695 == -1) {
			method248();
		}
	}

	public final void update(Graphics arg0) {
		if (field703 == null) {
			field703 = arg0;
		}

		field707 = true;
		method60();
	}

	public final void paint(Graphics arg0) {
		if (field703 == null) {
			field703 = arg0;
		}

		field707 = true;
		method60();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field706 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field709 = 0;
		field714 = var2;
		field715 = var3;
		field716 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field713 = 2;
			field710 = 2;
		} else {
			field713 = 1;
			field710 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field709 = 0;
		field710 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field709 = 0;
		field711 = -1;
		field712 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field706 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field709 = 0;
		field711 = var2;
		field712 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field706 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field709 = 0;
		field711 = var2;
		field712 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field709 = 0;
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
			field721[var3] = 1;
		}

		if (var3 > 4) {
			field722[field724] = var3;
			field724 = field724 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field709 = 0;
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
			field721[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("EBSHSFRY.b(Z)I")
	public final int method250() {
		int var1 = -1;
		if (field724 != field723) {
			var1 = field722[field723];
			field723 = field723 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field708 = true;
		field707 = true;
		method60();
	}

	public final void focusLost(FocusEvent arg0) {
		field708 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field721[var2] = 0;
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

	@ObfuscatedName("EBSHSFRY.a()V")
	public void method113() {
	}

	@ObfuscatedName("EBSHSFRY.a(I)V")
	public void method140() {
	}

	@ObfuscatedName("EBSHSFRY.b(I)V")
	public void method123() {
	}

	@ObfuscatedName("EBSHSFRY.c(I)V")
	public void method30() {
	}

	@ObfuscatedName("EBSHSFRY.d(I)V")
	public void method60() {
	}

	@ObfuscatedName("EBSHSFRY.c(Z)Ljava/awt/Component;")
	public Component method65() {
		if (field706 != null) {
			return field706;
		}

		return this;
	}

	@ObfuscatedName("EBSHSFRY.a(Ljava/lang/Runnable;I)V")
	public void method58(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("EBSHSFRY.a(ILjava/lang/String;I)V")
	public void method51(int arg0, String arg1) {
		while (field703 == null) {
			field703 = method65().getGraphics();

			try {
				method65().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method65().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method65().getFontMetrics(var5);

		if (field707) {
			field703.setColor(Color.black);
			field703.fillRect(0, 0, field701, field702);
			field707 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field702 / 2 - 18;
		field703.setColor(var6);
		field703.drawRect(field701 / 2 - 152, var7, 304, 34);
		field703.fillRect(field701 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field703.setColor(Color.black);
		field703.fillRect(arg0 * 3 + field701 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field703.setFont(var3);
		field703.setColor(Color.white);
		field703.drawString(arg1, (field701 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
