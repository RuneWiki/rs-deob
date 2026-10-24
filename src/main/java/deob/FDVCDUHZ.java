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

@ObfuscatedName("FDVCDUHZ")
public class FDVCDUHZ extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("FDVCDUHZ.f")
	public int field702 = 20;

	@ObfuscatedName("FDVCDUHZ.g")
	public int field703 = 1;

	@ObfuscatedName("FDVCDUHZ.h")
	public long[] field704 = new long[10];

	@ObfuscatedName("FDVCDUHZ.j")
	public boolean field706 = false;

	@ObfuscatedName("FDVCDUHZ.o")
	public XKULRNBA[] field711 = new XKULRNBA[6];

	@ObfuscatedName("FDVCDUHZ.q")
	public boolean field713 = true;

	@ObfuscatedName("FDVCDUHZ.r")
	public boolean field714 = true;

	@ObfuscatedName("FDVCDUHZ.E")
	public int[] field727 = new int[128];

	@ObfuscatedName("FDVCDUHZ.F")
	public int[] field728 = new int[128];

	@ObfuscatedName("FDVCDUHZ.e")
	public int field701;

	@ObfuscatedName("FDVCDUHZ.i")
	public int field705;

	@ObfuscatedName("FDVCDUHZ.k")
	public int field707;

	@ObfuscatedName("FDVCDUHZ.l")
	public int field708;

	@ObfuscatedName("FDVCDUHZ.s")
	public int field715;

	@ObfuscatedName("FDVCDUHZ.t")
	public int field716;

	@ObfuscatedName("FDVCDUHZ.u")
	public int field717;

	@ObfuscatedName("FDVCDUHZ.v")
	public int field718;

	@ObfuscatedName("FDVCDUHZ.w")
	public int field719;

	@ObfuscatedName("FDVCDUHZ.x")
	public int field720;

	@ObfuscatedName("FDVCDUHZ.y")
	public int field721;

	@ObfuscatedName("FDVCDUHZ.A")
	public int field723;

	@ObfuscatedName("FDVCDUHZ.B")
	public int field724;

	@ObfuscatedName("FDVCDUHZ.C")
	public int field725;

	@ObfuscatedName("FDVCDUHZ.G")
	public int field729;

	@ObfuscatedName("FDVCDUHZ.H")
	public int field730;

	@ObfuscatedName("FDVCDUHZ.z")
	public long field722;

	@ObfuscatedName("FDVCDUHZ.D")
	public long field726;

	@ObfuscatedName("FDVCDUHZ.n")
	public LWAVUJVV field710;

	@ObfuscatedName("FDVCDUHZ.p")
	public NYZFOQAO field712;

	@ObfuscatedName("FDVCDUHZ.m")
	public Graphics field709;

	@ObfuscatedName("FDVCDUHZ.a(III)V")
	public final void method252(int arg0, int arg1) {
		field707 = arg1;
		field708 = arg0;
		field712 = new NYZFOQAO(field707, field708, this);
		field709 = method136().getGraphics();
		field710 = new LWAVUJVV(field707, field708, method136());
		method113(this, 1);
	}

	@ObfuscatedName("FDVCDUHZ.a(IZI)V")
	public final void method253(int arg0, int arg1) {
		field707 = arg1;
		field708 = arg0;
		field709 = method136().getGraphics();
		field710 = new LWAVUJVV(field707, field708, method136());
		method113(this, 1);
	}

	public void run() {
		method136().addMouseListener(this);
		method136().addMouseMotionListener(this);
		method136().addKeyListener(this);
		method136().addFocusListener(this);

		if (field712 != null) {
			field712.addWindowListener(this);
		}

		method120("Loading...", 0);
		method149();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field704[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field701 < 0) {
					if (field701 == -1) {
						method254();
					}

					return;
				}

				if (field701 > 0) {
					field701--;
					if (field701 == 0) {
						method254();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field704[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field704[var1]) {
					var2 = (int) (field702 * 2560 / (var11 - field704[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field702 - (var11 - field704[var1]) / 10L);
				}

				if (var3 > field702) {
					var3 = field702;
				}

				field704[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field704[var13] != 0L) {
							field704[var13] += var3;
						}
					}
				}

				if (var3 < field703) {
					var3 = field703;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field723 = field719;
					field724 = field720;
					field725 = field721;
					field726 = field722;
					field719 = 0;
					method111();
					field729 = field730;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field702 > 0) {
					field705 = var2 * 1000 / (field702 * 256);
				}

				method114();
			} while (!field706);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field704[var15]);
			}

			System.out.println("fps:" + field705 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field702 + " mindel:" + field703);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field706 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("FDVCDUHZ.a(I)V")
	public final void method254() {
		field701 = -2;
		method52();

		if (field712 != null) {
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

	@ObfuscatedName("FDVCDUHZ.a(II)V")
	public final void method255(int arg0) {
		field702 = 1000 / arg0;
	}

	public final void start() {
		if (field701 >= 0) {
			field701 = 0;
		}
	}

	public final void stop() {
		if (field701 >= 0) {
			field701 = 4000 / field702;
		}
	}

	public final void destroy() {
		field701 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field701 == -1) {
			method254();
		}
	}

	public final void update(Graphics arg0) {
		if (field709 == null) {
			field709 = arg0;
		}

		field713 = true;
		method38();
	}

	public final void paint(Graphics arg0) {
		if (field709 == null) {
			field709 = arg0;
		}

		field713 = true;
		method38();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field712 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field715 = 0;
		field720 = var2;
		field721 = var3;
		field722 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field719 = 2;
			field716 = 2;
		} else {
			field719 = 1;
			field716 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field715 = 0;
		field716 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field715 = 0;
		field717 = -1;
		field718 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field712 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field715 = 0;
		field717 = var2;
		field718 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field712 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field715 = 0;
		field717 = var2;
		field718 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field715 = 0;
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
			field727[var3] = 1;
		}

		if (var3 > 4) {
			field728[field730] = var3;
			field730 = field730 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field715 = 0;
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
			field727[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("FDVCDUHZ.a(Z)I")
	public final int method256() {
		int var1 = -1;
		if (field730 != field729) {
			var1 = field728[field729];
			field729 = field729 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field714 = true;
		field713 = true;
		method38();
	}

	public final void focusLost(FocusEvent arg0) {
		field714 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field727[var2] = 0;
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

	@ObfuscatedName("FDVCDUHZ.a()V")
	public void method149() {
	}

	@ObfuscatedName("FDVCDUHZ.b(I)V")
	public void method111() {
	}

	@ObfuscatedName("FDVCDUHZ.b(Z)V")
	public void method52() {
	}

	@ObfuscatedName("FDVCDUHZ.c(I)V")
	public void method114() {
	}

	@ObfuscatedName("FDVCDUHZ.c(Z)V")
	public void method38() {
	}

	@ObfuscatedName("FDVCDUHZ.d(I)Ljava/awt/Component;")
	public Component method136() {
		if (field712 != null) {
			return field712;
		}

		return this;
	}

	@ObfuscatedName("FDVCDUHZ.a(Ljava/lang/Runnable;I)V")
	public void method113(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("FDVCDUHZ.a(Ljava/lang/String;II)V")
	public void method120(String arg0, int arg1) {
		while (field709 == null) {
			field709 = method136().getGraphics();

			try {
				method136().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method136().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method136().getFontMetrics(var5);

		if (field713) {
			field709.setColor(Color.black);
			field709.fillRect(0, 0, field707, field708);
			field713 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field708 / 2 - 18;
		field709.setColor(var6);
		field709.drawRect(field707 / 2 - 152, var7, 304, 34);
		field709.fillRect(field707 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field709.setColor(Color.black);
		field709.fillRect(arg1 * 3 + field707 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field709.setFont(var3);
		field709.setColor(Color.white);
		field709.drawString(arg0, (field707 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
