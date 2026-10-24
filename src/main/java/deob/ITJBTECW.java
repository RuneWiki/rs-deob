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

@ObfuscatedName("ITJBTECW")
public class ITJBTECW extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("ITJBTECW.j")
	public int field810 = 20;

	@ObfuscatedName("ITJBTECW.k")
	public int field811 = 1;

	@ObfuscatedName("ITJBTECW.l")
	public long[] field812 = new long[10];

	@ObfuscatedName("ITJBTECW.n")
	public boolean field814 = false;

	@ObfuscatedName("ITJBTECW.s")
	public LXRBRCRX[] field819 = new LXRBRCRX[6];

	@ObfuscatedName("ITJBTECW.u")
	public boolean field821 = true;

	@ObfuscatedName("ITJBTECW.v")
	public boolean field822 = true;

	@ObfuscatedName("ITJBTECW.I")
	public int[] field835 = new int[128];

	@ObfuscatedName("ITJBTECW.J")
	public int[] field836 = new int[128];

	@ObfuscatedName("ITJBTECW.i")
	public int field809;

	@ObfuscatedName("ITJBTECW.m")
	public int field813;

	@ObfuscatedName("ITJBTECW.o")
	public int field815;

	@ObfuscatedName("ITJBTECW.p")
	public int field816;

	@ObfuscatedName("ITJBTECW.w")
	public int field823;

	@ObfuscatedName("ITJBTECW.x")
	public int field824;

	@ObfuscatedName("ITJBTECW.y")
	public int field825;

	@ObfuscatedName("ITJBTECW.z")
	public int field826;

	@ObfuscatedName("ITJBTECW.A")
	public int field827;

	@ObfuscatedName("ITJBTECW.B")
	public int field828;

	@ObfuscatedName("ITJBTECW.C")
	public int field829;

	@ObfuscatedName("ITJBTECW.E")
	public int field831;

	@ObfuscatedName("ITJBTECW.F")
	public int field832;

	@ObfuscatedName("ITJBTECW.G")
	public int field833;

	@ObfuscatedName("ITJBTECW.K")
	public int field837;

	@ObfuscatedName("ITJBTECW.L")
	public int field838;

	@ObfuscatedName("ITJBTECW.D")
	public long field830;

	@ObfuscatedName("ITJBTECW.H")
	public long field834;

	@ObfuscatedName("ITJBTECW.t")
	public CGMKGPCO field820;

	@ObfuscatedName("ITJBTECW.r")
	public ECAKBTRA field818;

	@ObfuscatedName("ITJBTECW.q")
	public Graphics field817;

	@ObfuscatedName("ITJBTECW.a(III)V")
	public final void method231(int arg0, int arg1) {
		field815 = arg0;
		field816 = arg1;
		field820 = new CGMKGPCO(field815, field816, this);
		field817 = method49().getGraphics();
		field818 = new ECAKBTRA(field816, method49(), field815);
		method124(this, 1);
	}

	@ObfuscatedName("ITJBTECW.b(III)V")
	public final void method232(int arg0, int arg1) {
		field815 = arg0;
		field816 = arg1;
		field817 = method49().getGraphics();
		field818 = new ECAKBTRA(field816, method49(), field815);
		method124(this, 1);
	}

	public void run() {
		method49().addMouseListener(this);
		method49().addMouseMotionListener(this);
		method49().addKeyListener(this);
		method49().addFocusListener(this);

		if (field820 != null) {
			field820.addWindowListener(this);
		}

		method81(0, "Loading...");
		method173();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field812[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field809 < 0) {
					if (field809 == -1) {
						method233();
					}

					return;
				}

				if (field809 > 0) {
					field809--;
					if (field809 == 0) {
						method233();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field812[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field812[var1]) {
					var2 = (int) (field810 * 2560 / (var11 - field812[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field810 - (var11 - field812[var1]) / 10L);
				}

				if (var3 > field810) {
					var3 = field810;
				}

				field812[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field812[var13] != 0L) {
							field812[var13] += var3;
						}
					}
				}

				if (var3 < field811) {
					var3 = field811;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field831 = field827;
					field832 = field828;
					field833 = field829;
					field834 = field830;
					field827 = 0;
					method169();
					field837 = field838;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field810 > 0) {
					field813 = var2 * 1000 / (field810 * 256);
				}

				method160();
			} while (!field814);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field812[var15]);
			}

			System.out.println("fps:" + field813 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field810 + " mindel:" + field811);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field814 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("ITJBTECW.a(I)V")
	public final void method233() {
		field809 = -2;
		method141();

		if (field820 != null) {
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

	@ObfuscatedName("ITJBTECW.a(IZ)V")
	public final void method234(int arg0) {
		field810 = 1000 / arg0;
	}

	public final void start() {
		if (field809 >= 0) {
			field809 = 0;
		}
	}

	public final void stop() {
		if (field809 >= 0) {
			field809 = 4000 / field810;
		}
	}

	public final void destroy() {
		field809 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field809 == -1) {
			method233();
		}
	}

	public final void update(Graphics arg0) {
		if (field817 == null) {
			field817 = arg0;
		}

		field821 = true;
		method79();
	}

	public final void paint(Graphics arg0) {
		if (field817 == null) {
			field817 = arg0;
		}

		field821 = true;
		method79();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field820 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field823 = 0;
		field828 = var2;
		field829 = var3;
		field830 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field827 = 2;
			field824 = 2;
		} else {
			field827 = 1;
			field824 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field823 = 0;
		field824 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field823 = 0;
		field825 = -1;
		field826 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field820 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field823 = 0;
		field825 = var2;
		field826 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field820 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field823 = 0;
		field825 = var2;
		field826 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field823 = 0;
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
			field835[var3] = 1;
		}

		if (var3 > 4) {
			field836[field838] = var3;
			field838 = field838 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field823 = 0;
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
			field835[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("ITJBTECW.b(I)I")
	public final int method235() {
		int var1 = -1;
		if (field838 != field837) {
			var1 = field836[field837];
			field837 = field837 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field822 = true;
		field821 = true;
		method79();
	}

	public final void focusLost(FocusEvent arg0) {
		field822 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field835[var2] = 0;
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

	@ObfuscatedName("ITJBTECW.a()V")
	public void method173() {
	}

	@ObfuscatedName("ITJBTECW.c(I)V")
	public void method169() {
	}

	@ObfuscatedName("ITJBTECW.a(B)V")
	public void method141() {
	}

	@ObfuscatedName("ITJBTECW.d(I)V")
	public void method160() {
	}

	@ObfuscatedName("ITJBTECW.b(B)V")
	public void method79() {
	}

	@ObfuscatedName("ITJBTECW.e(I)Ljava/awt/Component;")
	public Component method49() {
		if (field820 != null) {
			return field820;
		}

		return this;
	}

	@ObfuscatedName("ITJBTECW.a(Ljava/lang/Runnable;I)V")
	public void method124(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("ITJBTECW.a(IILjava/lang/String;)V")
	public void method81(int arg0, String arg1) {
		while (field817 == null) {
			field817 = method49().getGraphics();

			try {
				method49().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method49().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method49().getFontMetrics(var5);

		if (field821) {
			field817.setColor(Color.black);
			field817.fillRect(0, 0, field815, field816);
			field821 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field816 / 2 - 18;
		field817.setColor(var6);
		field817.drawRect(field815 / 2 - 152, var7, 304, 34);
		field817.fillRect(field815 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field817.setColor(Color.black);
		field817.fillRect(arg0 * 3 + field815 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field817.setFont(var3);
		field817.setColor(Color.white);
		field817.drawString(arg1, (field815 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
