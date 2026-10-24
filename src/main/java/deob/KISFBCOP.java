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

@ObfuscatedName("KISFBCOP")
public class KISFBCOP extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("KISFBCOP.g")
	public int field774 = 20;

	@ObfuscatedName("KISFBCOP.h")
	public int field775 = 1;

	@ObfuscatedName("KISFBCOP.i")
	public long[] field776 = new long[10];

	@ObfuscatedName("KISFBCOP.k")
	public boolean field778 = false;

	@ObfuscatedName("KISFBCOP.p")
	public XANVNPIN[] field783 = new XANVNPIN[6];

	@ObfuscatedName("KISFBCOP.r")
	public boolean field785 = true;

	@ObfuscatedName("KISFBCOP.s")
	public boolean field786 = true;

	@ObfuscatedName("KISFBCOP.F")
	public int[] field799 = new int[128];

	@ObfuscatedName("KISFBCOP.G")
	public int[] field800 = new int[128];

	@ObfuscatedName("KISFBCOP.f")
	public int field773;

	@ObfuscatedName("KISFBCOP.j")
	public int field777;

	@ObfuscatedName("KISFBCOP.l")
	public int field779;

	@ObfuscatedName("KISFBCOP.m")
	public int field780;

	@ObfuscatedName("KISFBCOP.t")
	public int field787;

	@ObfuscatedName("KISFBCOP.u")
	public int field788;

	@ObfuscatedName("KISFBCOP.v")
	public int field789;

	@ObfuscatedName("KISFBCOP.w")
	public int field790;

	@ObfuscatedName("KISFBCOP.x")
	public int field791;

	@ObfuscatedName("KISFBCOP.y")
	public int field792;

	@ObfuscatedName("KISFBCOP.z")
	public int field793;

	@ObfuscatedName("KISFBCOP.B")
	public int field795;

	@ObfuscatedName("KISFBCOP.C")
	public int field796;

	@ObfuscatedName("KISFBCOP.D")
	public int field797;

	@ObfuscatedName("KISFBCOP.H")
	public int field801;

	@ObfuscatedName("KISFBCOP.I")
	public int field802;

	@ObfuscatedName("KISFBCOP.A")
	public long field794;

	@ObfuscatedName("KISFBCOP.E")
	public long field798;

	@ObfuscatedName("KISFBCOP.o")
	public TRQPVNER field782;

	@ObfuscatedName("KISFBCOP.q")
	public UNSEVWCI field784;

	@ObfuscatedName("KISFBCOP.n")
	public Graphics field781;

	@ObfuscatedName("KISFBCOP.a(III)V")
	public final void method297(int arg0, int arg1) {
		field779 = arg0;
		field780 = arg1;
		field784 = new UNSEVWCI(this, field779, field780);
		field781 = method73().getGraphics();
		field782 = new TRQPVNER(field779, method73(), field780);
		method86(this, 1);
	}

	@ObfuscatedName("KISFBCOP.a(IZI)V")
	public final void method298(int arg0, int arg1) {
		field779 = arg1;
		field780 = arg0;
		field781 = method73().getGraphics();
		field782 = new TRQPVNER(field779, method73(), field780);
		method86(this, 1);
	}

	public void run() {
		method73().addMouseListener(this);
		method73().addMouseMotionListener(this);
		method73().addKeyListener(this);
		method73().addFocusListener(this);

		if (field784 != null) {
			field784.addWindowListener(this);
		}

		method27(0, "Loading...");
		method93();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field776[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field773 < 0) {
					if (field773 == -1) {
						method299();
					}

					return;
				}

				if (field773 > 0) {
					field773--;
					if (field773 == 0) {
						method299();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field776[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field776[var1]) {
					var2 = (int) (field774 * 2560 / (var11 - field776[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field774 - (var11 - field776[var1]) / 10L);
				}

				if (var3 > field774) {
					var3 = field774;
				}

				field776[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field776[var13] != 0L) {
							field776[var13] += var3;
						}
					}
				}

				if (var3 < field775) {
					var3 = field775;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field795 = field791;
					field796 = field792;
					field797 = field793;
					field798 = field794;
					field791 = 0;
					method56();
					field801 = field802;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field774 > 0) {
					field777 = var2 * 1000 / (field774 * 256);
				}

				method58();
			} while (!field778);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field776[var15]);
			}

			System.out.println("fps:" + field777 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field774 + " mindel:" + field775);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field778 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("KISFBCOP.a(B)V")
	public final void method299() {
		field773 = -2;
		method81();

		if (field784 != null) {
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

	@ObfuscatedName("KISFBCOP.a(II)V")
	public final void method300(int arg0) {
		field774 = 1000 / arg0;
	}

	public final void start() {
		if (field773 >= 0) {
			field773 = 0;
		}
	}

	public final void stop() {
		if (field773 >= 0) {
			field773 = 4000 / field774;
		}
	}

	public final void destroy() {
		field773 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (field773 == -1) {
			method299();
		}
	}

	public final void update(Graphics arg0) {
		if (field781 == null) {
			field781 = arg0;
		}

		field785 = true;
		method89();
	}

	public final void paint(Graphics arg0) {
		if (field781 == null) {
			field781 = arg0;
		}

		field785 = true;
		method89();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field784 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field787 = 0;
		field792 = var2;
		field793 = var3;
		field794 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field791 = 2;
			field788 = 2;
		} else {
			field791 = 1;
			field788 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field787 = 0;
		field788 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field787 = 0;
		field789 = -1;
		field790 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field784 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field787 = 0;
		field789 = var2;
		field790 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field784 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field787 = 0;
		field789 = var2;
		field790 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field787 = 0;
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
			field799[var3] = 1;
		}

		if (var3 > 4) {
			field800[field802] = var3;
			field802 = field802 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field787 = 0;
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
			field799[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("KISFBCOP.a(Z)I")
	public final int method301() {
		int var1 = -1;
		if (field802 != field801) {
			var1 = field800[field801];
			field801 = field801 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field786 = true;
		field785 = true;
		method89();
	}

	public final void focusLost(FocusEvent arg0) {
		field786 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field799[var2] = 0;
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

	@ObfuscatedName("KISFBCOP.a()V")
	public void method93() {
	}

	@ObfuscatedName("KISFBCOP.a(I)V")
	public void method56() {
	}

	@ObfuscatedName("KISFBCOP.b(Z)V")
	public void method81() {
	}

	@ObfuscatedName("KISFBCOP.b(B)V")
	public void method58() {
	}

	@ObfuscatedName("KISFBCOP.b(I)V")
	public void method89() {
	}

	@ObfuscatedName("KISFBCOP.c(B)Ljava/awt/Component;")
	public Component method73() {
		if (field784 != null) {
			return field784;
		}

		return this;
	}

	@ObfuscatedName("KISFBCOP.a(Ljava/lang/Runnable;I)V")
	public void method86(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("KISFBCOP.a(ILjava/lang/String;I)V")
	public void method27(int arg0, String arg1) {
		while (field781 == null) {
			field781 = method73().getGraphics();

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

		if (field785) {
			field781.setColor(Color.black);
			field781.fillRect(0, 0, field779, field780);
			field785 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field780 / 2 - 18;
		field781.setColor(var6);
		field781.drawRect(field779 / 2 - 152, var7, 304, 34);
		field781.fillRect(field779 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field781.setColor(Color.black);
		field781.fillRect(arg0 * 3 + field779 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field781.setFont(var3);
		field781.setColor(Color.white);
		field781.drawString(arg1, (field779 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
