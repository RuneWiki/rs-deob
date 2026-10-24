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

@ObfuscatedName("HXQNMAEJ")
public class HXQNMAEJ extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("HXQNMAEJ.g")
	public int field810 = 20;

	@ObfuscatedName("HXQNMAEJ.h")
	public int field811 = 1;

	@ObfuscatedName("HXQNMAEJ.i")
	public long[] field812 = new long[10];

	@ObfuscatedName("HXQNMAEJ.k")
	public boolean field814 = false;

	@ObfuscatedName("HXQNMAEJ.p")
	public DUMEPGRH[] field819 = new DUMEPGRH[6];

	@ObfuscatedName("HXQNMAEJ.r")
	public boolean field821 = true;

	@ObfuscatedName("HXQNMAEJ.s")
	public boolean field822 = true;

	@ObfuscatedName("HXQNMAEJ.F")
	public int[] field835 = new int[128];

	@ObfuscatedName("HXQNMAEJ.G")
	public int[] field836 = new int[128];

	@ObfuscatedName("HXQNMAEJ.f")
	public int field809;

	@ObfuscatedName("HXQNMAEJ.j")
	public int field813;

	@ObfuscatedName("HXQNMAEJ.l")
	public int field815;

	@ObfuscatedName("HXQNMAEJ.m")
	public int field816;

	@ObfuscatedName("HXQNMAEJ.t")
	public int field823;

	@ObfuscatedName("HXQNMAEJ.u")
	public int field824;

	@ObfuscatedName("HXQNMAEJ.v")
	public int field825;

	@ObfuscatedName("HXQNMAEJ.w")
	public int field826;

	@ObfuscatedName("HXQNMAEJ.x")
	public int field827;

	@ObfuscatedName("HXQNMAEJ.y")
	public int field828;

	@ObfuscatedName("HXQNMAEJ.z")
	public int field829;

	@ObfuscatedName("HXQNMAEJ.B")
	public int field831;

	@ObfuscatedName("HXQNMAEJ.C")
	public int field832;

	@ObfuscatedName("HXQNMAEJ.D")
	public int field833;

	@ObfuscatedName("HXQNMAEJ.H")
	public int field837;

	@ObfuscatedName("HXQNMAEJ.I")
	public int field838;

	@ObfuscatedName("HXQNMAEJ.A")
	public long field830;

	@ObfuscatedName("HXQNMAEJ.E")
	public long field834;

	@ObfuscatedName("HXQNMAEJ.q")
	public DQQGYYJG field820;

	@ObfuscatedName("HXQNMAEJ.o")
	public TWKZMYGD field818;

	@ObfuscatedName("HXQNMAEJ.n")
	public Graphics field817;

	@ObfuscatedName("HXQNMAEJ.a(III)V")
	public final void method368(int arg0, int arg1) {
		field815 = arg0;
		field816 = arg1;
		field820 = new DQQGYYJG(field816, field815, this);
		field817 = method71().getGraphics();
		field818 = new TWKZMYGD(field816, field815, method71());
		method64(this, 1);
	}

	@ObfuscatedName("HXQNMAEJ.b(III)V")
	public final void method369(int arg0, int arg1) {
		field815 = arg0;
		field816 = arg1;
		field817 = method71().getGraphics();
		field818 = new TWKZMYGD(field816, field815, method71());
		method64(this, 1);
	}

	public void run() {
		method71().addMouseListener(this);
		method71().addMouseMotionListener(this);
		method71().addKeyListener(this);
		method71().addFocusListener(this);

		if (field820 != null) {
			field820.addWindowListener(this);
		}

		method23("Loading...", 0);
		method83();
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
						method370();
					}

					return;
				}

				if (field809 > 0) {
					field809--;
					if (field809 == 0) {
						method370();
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
					method61();
					field837 = field838;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field810 > 0) {
					field813 = var2 * 1000 / (field810 * 256);
				}

				method11();
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

	@ObfuscatedName("HXQNMAEJ.a(B)V")
	public final void method370() {
		field809 = -2;
		method37();

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

	@ObfuscatedName("HXQNMAEJ.a(II)V")
	public final void method371(int arg0) {
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
			method370();
		}
	}

	public final void update(Graphics arg0) {
		if (field817 == null) {
			field817 = arg0;
		}

		field821 = true;
		method90();
	}

	public final void paint(Graphics arg0) {
		if (field817 == null) {
			field817 = arg0;
		}

		field821 = true;
		method90();
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

	@ObfuscatedName("HXQNMAEJ.a(Z)I")
	public final int method372() {
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
		method90();
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

	@ObfuscatedName("HXQNMAEJ.a()V")
	public void method83() {
	}

	@ObfuscatedName("HXQNMAEJ.b(Z)V")
	public void method61() {
	}

	@ObfuscatedName("HXQNMAEJ.a(I)V")
	public void method37() {
	}

	@ObfuscatedName("HXQNMAEJ.b(B)V")
	public void method11() {
	}

	@ObfuscatedName("HXQNMAEJ.c(B)V")
	public void method90() {
	}

	@ObfuscatedName("HXQNMAEJ.b(I)Ljava/awt/Component;")
	public Component method71() {
		if (field820 != null) {
			return field820;
		}

		return this;
	}

	@ObfuscatedName("HXQNMAEJ.a(Ljava/lang/Runnable;I)V")
	public void method64(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("HXQNMAEJ.a(ILjava/lang/String;I)V")
	public void method23(String arg0, int arg1) {
		while (field817 == null) {
			field817 = method71().getGraphics();

			try {
				method71().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method71().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method71().getFontMetrics(var5);

		if (field821) {
			field817.setColor(Color.black);
			field817.fillRect(0, 0, field815, field816);
			field821 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field816 / 2 - 18;
		field817.setColor(var6);
		field817.drawRect(field815 / 2 - 152, var7, 304, 34);
		field817.fillRect(field815 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field817.setColor(Color.black);
		field817.fillRect(arg1 * 3 + field815 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field817.setFont(var3);
		field817.setColor(Color.white);
		field817.drawString(arg0, (field815 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
