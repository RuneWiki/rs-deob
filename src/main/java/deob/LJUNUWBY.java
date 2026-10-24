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

@ObfuscatedName("LJUNUWBY")
public class LJUNUWBY extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("LJUNUWBY.f")
	public int field799 = 20;

	@ObfuscatedName("LJUNUWBY.g")
	public int field800 = 1;

	@ObfuscatedName("LJUNUWBY.h")
	public long[] field801 = new long[10];

	@ObfuscatedName("LJUNUWBY.j")
	public boolean field803 = false;

	@ObfuscatedName("LJUNUWBY.o")
	public AIRMECOM[] field808 = new AIRMECOM[6];

	@ObfuscatedName("LJUNUWBY.q")
	public boolean field810 = true;

	@ObfuscatedName("LJUNUWBY.r")
	public boolean field811 = true;

	@ObfuscatedName("LJUNUWBY.E")
	public int[] field824 = new int[128];

	@ObfuscatedName("LJUNUWBY.F")
	public int[] field825 = new int[128];

	@ObfuscatedName("LJUNUWBY.e")
	public int field798;

	@ObfuscatedName("LJUNUWBY.i")
	public int field802;

	@ObfuscatedName("LJUNUWBY.k")
	public int field804;

	@ObfuscatedName("LJUNUWBY.l")
	public int field805;

	@ObfuscatedName("LJUNUWBY.s")
	public int field812;

	@ObfuscatedName("LJUNUWBY.t")
	public int field813;

	@ObfuscatedName("LJUNUWBY.u")
	public int field814;

	@ObfuscatedName("LJUNUWBY.v")
	public int field815;

	@ObfuscatedName("LJUNUWBY.w")
	public int field816;

	@ObfuscatedName("LJUNUWBY.x")
	public int field817;

	@ObfuscatedName("LJUNUWBY.y")
	public int field818;

	@ObfuscatedName("LJUNUWBY.A")
	public int field820;

	@ObfuscatedName("LJUNUWBY.B")
	public int field821;

	@ObfuscatedName("LJUNUWBY.C")
	public int field822;

	@ObfuscatedName("LJUNUWBY.G")
	public int field826;

	@ObfuscatedName("LJUNUWBY.H")
	public int field827;

	@ObfuscatedName("LJUNUWBY.z")
	public long field819;

	@ObfuscatedName("LJUNUWBY.D")
	public long field823;

	@ObfuscatedName("LJUNUWBY.p")
	public MEWJABWI field809;

	@ObfuscatedName("LJUNUWBY.n")
	public PRSDKOTZ field807;

	@ObfuscatedName("LJUNUWBY.m")
	public Graphics field806;

	@ObfuscatedName("LJUNUWBY.a(ZII)V")
	public final void method295(int arg0, int arg1) {
		field804 = arg0;
		field805 = arg1;
		field809 = new MEWJABWI(field805, field804, this);
		field806 = method99().getGraphics();
		field807 = new PRSDKOTZ(field805, field804, method99());
		method54(this, 1);
	}

	@ObfuscatedName("LJUNUWBY.a(III)V")
	public final void method296(int arg0, int arg1) {
		field804 = arg0;
		field805 = arg1;
		field806 = method99().getGraphics();
		field807 = new PRSDKOTZ(field805, field804, method99());
		method54(this, 1);
	}

	public void run() {
		method99().addMouseListener(this);
		method99().addMouseMotionListener(this);
		method99().addKeyListener(this);
		method99().addFocusListener(this);

		if (field809 != null) {
			field809.addWindowListener(this);
		}

		method146(0, "Loading...");
		method134();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field801[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field798 < 0) {
					if (field798 == -1) {
						method297();
					}

					return;
				}

				if (field798 > 0) {
					field798--;
					if (field798 == 0) {
						method297();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field801[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field801[var1]) {
					var2 = (int) (field799 * 2560 / (var11 - field801[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field799 - (var11 - field801[var1]) / 10L);
				}

				if (var3 > field799) {
					var3 = field799;
				}

				field801[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field801[var13] != 0L) {
							field801[var13] += var3;
						}
					}
				}

				if (var3 < field800) {
					var3 = field800;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field820 = field816;
					field821 = field817;
					field822 = field818;
					field823 = field819;
					field816 = 0;
					method78();
					field826 = field827;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field799 > 0) {
					field802 = var2 * 1000 / (field799 * 256);
				}

				method73();
			} while (!field803);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field801[var15]);
			}

			System.out.println("fps:" + field802 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field799 + " mindel:" + field800);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field803 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("LJUNUWBY.a(I)V")
	public final void method297() {
		field798 = -2;
		method83();

		if (field809 != null) {
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

	@ObfuscatedName("LJUNUWBY.a(II)V")
	public final void method298(int arg0) {
		field799 = 1000 / arg0;
	}

	public final void start() {
		if (field798 >= 0) {
			field798 = 0;
		}
	}

	public final void stop() {
		if (field798 >= 0) {
			field798 = 4000 / field799;
		}
	}

	public final void destroy() {
		field798 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field798 == -1) {
			method297();
		}
	}

	public final void update(Graphics arg0) {
		if (field806 == null) {
			field806 = arg0;
		}

		field810 = true;
		method32();
	}

	public final void paint(Graphics arg0) {
		if (field806 == null) {
			field806 = arg0;
		}

		field810 = true;
		method32();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field809 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field812 = 0;
		field817 = var2;
		field818 = var3;
		field819 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field816 = 2;
			field813 = 2;
		} else {
			field816 = 1;
			field813 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field812 = 0;
		field813 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field812 = 0;
		field814 = -1;
		field815 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field809 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field812 = 0;
		field814 = var2;
		field815 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field809 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field812 = 0;
		field814 = var2;
		field815 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field812 = 0;
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
			field824[var3] = 1;
		}

		if (var3 > 4) {
			field825[field827] = var3;
			field827 = field827 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field812 = 0;
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
			field824[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("LJUNUWBY.b(I)I")
	public final int method299() {
		int var1 = -1;
		if (field827 != field826) {
			var1 = field825[field826];
			field826 = field826 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field811 = true;
		field810 = true;
		method32();
	}

	public final void focusLost(FocusEvent arg0) {
		field811 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field824[var2] = 0;
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

	@ObfuscatedName("LJUNUWBY.a()V")
	public void method134() {
	}

	@ObfuscatedName("LJUNUWBY.c(I)V")
	public void method78() {
	}

	@ObfuscatedName("LJUNUWBY.a(Z)V")
	public void method83() {
	}

	@ObfuscatedName("LJUNUWBY.a(B)V")
	public void method73() {
	}

	@ObfuscatedName("LJUNUWBY.b(Z)V")
	public void method32() {
	}

	@ObfuscatedName("LJUNUWBY.c(Z)Ljava/awt/Component;")
	public Component method99() {
		if (field809 != null) {
			return field809;
		}

		return this;
	}

	@ObfuscatedName("LJUNUWBY.a(Ljava/lang/Runnable;I)V")
	public void method54(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("LJUNUWBY.a(ILjava/lang/String;Z)V")
	public void method146(int arg0, String arg1) {
		while (field806 == null) {
			field806 = method99().getGraphics();

			try {
				method99().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method99().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method99().getFontMetrics(var5);

		if (field810) {
			field806.setColor(Color.black);
			field806.fillRect(0, 0, field804, field805);
			field810 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field805 / 2 - 18;
		field806.setColor(var6);
		field806.drawRect(field804 / 2 - 152, var7, 304, 34);
		field806.fillRect(field804 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field806.setColor(Color.black);
		field806.fillRect(arg0 * 3 + field804 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field806.setFont(var3);
		field806.setColor(Color.white);
		field806.drawString(arg1, (field804 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
