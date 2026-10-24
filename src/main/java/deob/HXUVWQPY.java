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

@ObfuscatedName("HXUVWQPY")
public class HXUVWQPY extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("HXUVWQPY.e")
	public int field786 = 20;

	@ObfuscatedName("HXUVWQPY.f")
	public int field787 = 1;

	@ObfuscatedName("HXUVWQPY.g")
	public long[] field788 = new long[10];

	@ObfuscatedName("HXUVWQPY.i")
	public boolean field790 = false;

	@ObfuscatedName("HXUVWQPY.n")
	public LOVQYTIZ[] field795 = new LOVQYTIZ[6];

	@ObfuscatedName("HXUVWQPY.p")
	public boolean field797 = true;

	@ObfuscatedName("HXUVWQPY.q")
	public boolean field798 = true;

	@ObfuscatedName("HXUVWQPY.D")
	public int[] field811 = new int[128];

	@ObfuscatedName("HXUVWQPY.E")
	public int[] field812 = new int[128];

	@ObfuscatedName("HXUVWQPY.d")
	public int field785;

	@ObfuscatedName("HXUVWQPY.h")
	public int field789;

	@ObfuscatedName("HXUVWQPY.j")
	public int field791;

	@ObfuscatedName("HXUVWQPY.k")
	public int field792;

	@ObfuscatedName("HXUVWQPY.r")
	public int field799;

	@ObfuscatedName("HXUVWQPY.s")
	public int field800;

	@ObfuscatedName("HXUVWQPY.t")
	public int field801;

	@ObfuscatedName("HXUVWQPY.u")
	public int field802;

	@ObfuscatedName("HXUVWQPY.v")
	public int field803;

	@ObfuscatedName("HXUVWQPY.w")
	public int field804;

	@ObfuscatedName("HXUVWQPY.x")
	public int field805;

	@ObfuscatedName("HXUVWQPY.z")
	public int field807;

	@ObfuscatedName("HXUVWQPY.A")
	public int field808;

	@ObfuscatedName("HXUVWQPY.B")
	public int field809;

	@ObfuscatedName("HXUVWQPY.F")
	public int field813;

	@ObfuscatedName("HXUVWQPY.G")
	public int field814;

	@ObfuscatedName("HXUVWQPY.y")
	public long field806;

	@ObfuscatedName("HXUVWQPY.C")
	public long field810;

	@ObfuscatedName("HXUVWQPY.m")
	public AKBGAGNS field794;

	@ObfuscatedName("HXUVWQPY.o")
	public LKLMGHHW field796;

	@ObfuscatedName("HXUVWQPY.l")
	public Graphics field793;

	@ObfuscatedName("HXUVWQPY.a(III)V")
	public final void method246(int arg0, int arg1) {
		field791 = arg0;
		field792 = arg1;
		field796 = new LKLMGHHW(this, field791, field792);
		field793 = method85().getGraphics();
		field794 = new AKBGAGNS(field792, method85(), field791);
		method154(this, 1);
	}

	@ObfuscatedName("HXUVWQPY.b(III)V")
	public final void method247(int arg0, int arg1) {
		field791 = arg1;
		field792 = arg0;
		field793 = method85().getGraphics();
		field794 = new AKBGAGNS(field792, method85(), field791);
		method154(this, 1);
	}

	public void run() {
		method85().addMouseListener(this);
		method85().addMouseMotionListener(this);
		method85().addKeyListener(this);
		method85().addFocusListener(this);

		if (field796 != null) {
			field796.addWindowListener(this);
		}

		method118(0, "Loading...");
		method124();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field788[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field785 < 0) {
					if (field785 == -1) {
						method248();
					}

					return;
				}

				if (field785 > 0) {
					field785--;
					if (field785 == 0) {
						method248();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field788[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field788[var1]) {
					var2 = (int) (field786 * 2560 / (var11 - field788[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field786 - (var11 - field788[var1]) / 10L);
				}

				if (var3 > field786) {
					var3 = field786;
				}

				field788[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field788[var13] != 0L) {
							field788[var13] += var3;
						}
					}
				}

				if (var3 < field787) {
					var3 = field787;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field807 = field803;
					field808 = field804;
					field809 = field805;
					field810 = field806;
					field803 = 0;
					method147();
					field813 = field814;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field786 > 0) {
					field789 = var2 * 1000 / (field786 * 256);
				}

				method102();
			} while (!field790);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field788[var15]);
			}

			System.out.println("fps:" + field789 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field786 + " mindel:" + field787);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field790 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("HXUVWQPY.a(I)V")
	public final void method248() {
		field785 = -2;
		method168();

		if (field796 != null) {
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

	@ObfuscatedName("HXUVWQPY.a(BI)V")
	public final void method249(int arg0) {
		field786 = 1000 / arg0;
	}

	public final void start() {
		if (field785 >= 0) {
			field785 = 0;
		}
	}

	public final void stop() {
		if (field785 >= 0) {
			field785 = 4000 / field786;
		}
	}

	public final void destroy() {
		field785 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field785 == -1) {
			method248();
		}
	}

	public final void update(Graphics arg0) {
		if (field793 == null) {
			field793 = arg0;
		}

		field797 = true;
		method51();
	}

	public final void paint(Graphics arg0) {
		if (field793 == null) {
			field793 = arg0;
		}

		field797 = true;
		method51();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field796 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field799 = 0;
		field804 = var2;
		field805 = var3;
		field806 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field803 = 2;
			field800 = 2;
		} else {
			field803 = 1;
			field800 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field799 = 0;
		field800 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field799 = 0;
		field801 = -1;
		field802 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field796 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field799 = 0;
		field801 = var2;
		field802 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field796 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field799 = 0;
		field801 = var2;
		field802 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field799 = 0;
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
			field811[var3] = 1;
		}

		if (var3 > 4) {
			field812[field814] = var3;
			field814 = field814 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field799 = 0;
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
			field811[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("HXUVWQPY.a(B)I")
	public final int method250() {
		int var1 = -1;
		if (field814 != field813) {
			var1 = field812[field813];
			field813 = field813 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field798 = true;
		field797 = true;
		method51();
	}

	public final void focusLost(FocusEvent arg0) {
		field798 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field811[var2] = 0;
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

	@ObfuscatedName("HXUVWQPY.a()V")
	public void method124() {
	}

	@ObfuscatedName("HXUVWQPY.b(I)V")
	public void method147() {
	}

	@ObfuscatedName("HXUVWQPY.c(I)V")
	public void method168() {
	}

	@ObfuscatedName("HXUVWQPY.d(I)V")
	public void method102() {
	}

	@ObfuscatedName("HXUVWQPY.a(Z)V")
	public void method51() {
	}

	@ObfuscatedName("HXUVWQPY.b(Z)Ljava/awt/Component;")
	public Component method85() {
		if (field796 != null) {
			return field796;
		}

		return this;
	}

	@ObfuscatedName("HXUVWQPY.a(Ljava/lang/Runnable;I)V")
	public void method154(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("HXUVWQPY.a(ILjava/lang/String;I)V")
	public void method118(int arg0, String arg1) {
		while (field793 == null) {
			field793 = method85().getGraphics();

			try {
				method85().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method85().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method85().getFontMetrics(var5);

		if (field797) {
			field793.setColor(Color.black);
			field793.fillRect(0, 0, field791, field792);
			field797 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field792 / 2 - 18;
		field793.setColor(var6);
		field793.drawRect(field791 / 2 - 152, var7, 304, 34);
		field793.fillRect(field791 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field793.setColor(Color.black);
		field793.fillRect(arg0 * 3 + field791 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field793.setFont(var3);
		field793.setColor(Color.white);
		field793.drawString(arg1, (field791 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
