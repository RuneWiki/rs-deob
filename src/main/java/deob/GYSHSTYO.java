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

@ObfuscatedName("GYSHSTYO")
public class GYSHSTYO extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("GYSHSTYO.g")
	public int field681 = 20;

	@ObfuscatedName("GYSHSTYO.h")
	public int field682 = 1;

	@ObfuscatedName("GYSHSTYO.i")
	public long[] field683 = new long[10];

	@ObfuscatedName("GYSHSTYO.k")
	public boolean field685 = false;

	@ObfuscatedName("GYSHSTYO.p")
	public VDSDFSIV[] field690 = new VDSDFSIV[6];

	@ObfuscatedName("GYSHSTYO.r")
	public boolean field692 = true;

	@ObfuscatedName("GYSHSTYO.s")
	public boolean field693 = true;

	@ObfuscatedName("GYSHSTYO.F")
	public int[] field706 = new int[128];

	@ObfuscatedName("GYSHSTYO.G")
	public int[] field707 = new int[128];

	@ObfuscatedName("GYSHSTYO.f")
	public int field680;

	@ObfuscatedName("GYSHSTYO.j")
	public int field684;

	@ObfuscatedName("GYSHSTYO.l")
	public int field686;

	@ObfuscatedName("GYSHSTYO.m")
	public int field687;

	@ObfuscatedName("GYSHSTYO.t")
	public int field694;

	@ObfuscatedName("GYSHSTYO.u")
	public int field695;

	@ObfuscatedName("GYSHSTYO.v")
	public int field696;

	@ObfuscatedName("GYSHSTYO.w")
	public int field697;

	@ObfuscatedName("GYSHSTYO.x")
	public int field698;

	@ObfuscatedName("GYSHSTYO.y")
	public int field699;

	@ObfuscatedName("GYSHSTYO.z")
	public int field700;

	@ObfuscatedName("GYSHSTYO.B")
	public int field702;

	@ObfuscatedName("GYSHSTYO.C")
	public int field703;

	@ObfuscatedName("GYSHSTYO.D")
	public int field704;

	@ObfuscatedName("GYSHSTYO.H")
	public int field708;

	@ObfuscatedName("GYSHSTYO.I")
	public int field709;

	@ObfuscatedName("GYSHSTYO.A")
	public long field701;

	@ObfuscatedName("GYSHSTYO.E")
	public long field705;

	@ObfuscatedName("GYSHSTYO.o")
	public CMDDPBTD field689;

	@ObfuscatedName("GYSHSTYO.q")
	public CYMTUWTR field691;

	@ObfuscatedName("GYSHSTYO.n")
	public Graphics field688;

	@ObfuscatedName("GYSHSTYO.a(IZI)V")
	public final void method284(int arg0, int arg1) {
		field686 = arg1;
		field687 = arg0;
		field691 = new CYMTUWTR(field686, field687, this);
		field688 = method140().getGraphics();
		field689 = new CMDDPBTD(field687, method140(), field686);
		method93(this, 1);
	}

	@ObfuscatedName("GYSHSTYO.a(III)V")
	public final void method285(int arg0, int arg1) {
		field686 = arg1;
		field687 = arg0;
		field688 = method140().getGraphics();
		field689 = new CMDDPBTD(field687, method140(), field686);
		method93(this, 1);
	}

	public void run() {
		method140().addMouseListener(this);
		method140().addMouseMotionListener(this);
		method140().addKeyListener(this);
		method140().addFocusListener(this);

		if (field691 != null) {
			field691.addWindowListener(this);
		}

		method110("Loading...", 0);
		method114();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field683[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field680 < 0) {
					if (field680 == -1) {
						method286();
					}

					return;
				}

				if (field680 > 0) {
					field680--;
					if (field680 == 0) {
						method286();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field683[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field683[var1]) {
					var2 = (int) (field681 * 2560 / (var11 - field683[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field681 - (var11 - field683[var1]) / 10L);
				}

				if (var3 > field681) {
					var3 = field681;
				}

				field683[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field683[var13] != 0L) {
							field683[var13] += var3;
						}
					}
				}

				if (var3 < field682) {
					var3 = field682;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field702 = field698;
					field703 = field699;
					field704 = field700;
					field705 = field701;
					field698 = 0;
					method156();
					field708 = field709;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field681 > 0) {
					field684 = var2 * 1000 / (field681 * 256);
				}

				method92();
			} while (!field685);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field683[var15]);
			}

			System.out.println("fps:" + field684 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field681 + " mindel:" + field682);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field685 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("GYSHSTYO.a(Z)V")
	public final void method286() {
		field680 = -2;
		method36();

		if (field691 != null) {
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

	@ObfuscatedName("GYSHSTYO.a(II)V")
	public final void method287(int arg0) {
		field681 = 1000 / arg0;
	}

	public final void start() {
		if (field680 >= 0) {
			field680 = 0;
		}
	}

	public final void stop() {
		if (field680 >= 0) {
			field680 = 4000 / field681;
		}
	}

	public final void destroy() {
		field680 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field680 == -1) {
			method286();
		}
	}

	public final void update(Graphics arg0) {
		if (field688 == null) {
			field688 = arg0;
		}

		field692 = true;
		method68();
	}

	public final void paint(Graphics arg0) {
		if (field688 == null) {
			field688 = arg0;
		}

		field692 = true;
		method68();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field691 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field694 = 0;
		field699 = var2;
		field700 = var3;
		field701 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field698 = 2;
			field695 = 2;
		} else {
			field698 = 1;
			field695 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field694 = 0;
		field695 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field694 = 0;
		field696 = -1;
		field697 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field691 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field694 = 0;
		field696 = var2;
		field697 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field691 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field694 = 0;
		field696 = var2;
		field697 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field694 = 0;
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
			field706[var3] = 1;
		}

		if (var3 > 4) {
			field707[field709] = var3;
			field709 = field709 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field694 = 0;
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
			field706[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("GYSHSTYO.a(I)I")
	public final int method288() {
		int var1 = -1;
		if (field709 != field708) {
			var1 = field707[field708];
			field708 = field708 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field693 = true;
		field692 = true;
		method68();
	}

	public final void focusLost(FocusEvent arg0) {
		field693 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field706[var2] = 0;
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

	@ObfuscatedName("GYSHSTYO.a()V")
	public void method114() {
	}

	@ObfuscatedName("GYSHSTYO.b(I)V")
	public void method156() {
	}

	@ObfuscatedName("GYSHSTYO.c(I)V")
	public void method36() {
	}

	@ObfuscatedName("GYSHSTYO.d(I)V")
	public void method92() {
	}

	@ObfuscatedName("GYSHSTYO.a(B)V")
	public void method68() {
	}

	@ObfuscatedName("GYSHSTYO.e(I)Ljava/awt/Component;")
	public Component method140() {
		if (field691 != null) {
			return field691;
		}

		return this;
	}

	@ObfuscatedName("GYSHSTYO.a(Ljava/lang/Runnable;I)V")
	public void method93(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("GYSHSTYO.a(Ljava/lang/String;IB)V")
	public void method110(String arg0, int arg1) {
		while (field688 == null) {
			field688 = method140().getGraphics();

			try {
				method140().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method140().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method140().getFontMetrics(var5);

		if (field692) {
			field688.setColor(Color.black);
			field688.fillRect(0, 0, field686, field687);
			field692 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field687 / 2 - 18;
		field688.setColor(var6);
		field688.drawRect(field686 / 2 - 152, var7, 304, 34);
		field688.fillRect(field686 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field688.setColor(Color.black);
		field688.fillRect(arg1 * 3 + field686 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field688.setFont(var3);
		field688.setColor(Color.white);
		field688.drawString(arg0, (field686 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
