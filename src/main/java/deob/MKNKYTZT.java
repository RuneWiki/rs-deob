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

@ObfuscatedName("MKNKYTZT")
public class MKNKYTZT extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("MKNKYTZT.d")
	public int field941 = 20;

	@ObfuscatedName("MKNKYTZT.e")
	public int field942 = 1;

	@ObfuscatedName("MKNKYTZT.f")
	public long[] field943 = new long[10];

	@ObfuscatedName("MKNKYTZT.h")
	public boolean field945 = false;

	@ObfuscatedName("MKNKYTZT.m")
	public EFVUNBHT[] field950 = new EFVUNBHT[6];

	@ObfuscatedName("MKNKYTZT.o")
	public boolean field952 = true;

	@ObfuscatedName("MKNKYTZT.p")
	public boolean field953 = true;

	@ObfuscatedName("MKNKYTZT.C")
	public int[] field966 = new int[128];

	@ObfuscatedName("MKNKYTZT.D")
	public int[] field967 = new int[128];

	@ObfuscatedName("MKNKYTZT.c")
	public int field940;

	@ObfuscatedName("MKNKYTZT.g")
	public int field944;

	@ObfuscatedName("MKNKYTZT.i")
	public int field946;

	@ObfuscatedName("MKNKYTZT.j")
	public int field947;

	@ObfuscatedName("MKNKYTZT.q")
	public int field954;

	@ObfuscatedName("MKNKYTZT.r")
	public int field955;

	@ObfuscatedName("MKNKYTZT.s")
	public int field956;

	@ObfuscatedName("MKNKYTZT.t")
	public int field957;

	@ObfuscatedName("MKNKYTZT.u")
	public int field958;

	@ObfuscatedName("MKNKYTZT.v")
	public int field959;

	@ObfuscatedName("MKNKYTZT.w")
	public int field960;

	@ObfuscatedName("MKNKYTZT.y")
	public int field962;

	@ObfuscatedName("MKNKYTZT.z")
	public int field963;

	@ObfuscatedName("MKNKYTZT.A")
	public int field964;

	@ObfuscatedName("MKNKYTZT.E")
	public int field968;

	@ObfuscatedName("MKNKYTZT.F")
	public int field969;

	@ObfuscatedName("MKNKYTZT.x")
	public long field961;

	@ObfuscatedName("MKNKYTZT.B")
	public long field965;

	@ObfuscatedName("MKNKYTZT.n")
	public SGXZRDZF field951;

	@ObfuscatedName("MKNKYTZT.l")
	public YZGYDKDO field949;

	@ObfuscatedName("MKNKYTZT.k")
	public Graphics field948;

	@ObfuscatedName("MKNKYTZT.a(III)V")
	public final void method386(int arg0, int arg1) {
		field946 = arg1;
		field947 = arg0;
		field951 = new SGXZRDZF(this, field946, field947);
		field948 = method57().getGraphics();
		field949 = new YZGYDKDO(method57(), field946, field947);
		method139(this, 1);
	}

	@ObfuscatedName("MKNKYTZT.b(III)V")
	public final void method387(int arg0, int arg1) {
		field946 = arg1;
		field947 = arg0;
		field948 = method57().getGraphics();
		field949 = new YZGYDKDO(method57(), field946, field947);
		method139(this, 1);
	}

	public void run() {
		method57().addMouseListener(this);
		method57().addMouseMotionListener(this);
		method57().addKeyListener(this);
		method57().addFocusListener(this);

		if (field951 != null) {
			field951.addWindowListener(this);
		}

		method98(0, "Loading...");
		method133();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field943[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field940 < 0) {
					if (field940 == -1) {
						method388();
					}

					return;
				}

				if (field940 > 0) {
					field940--;
					if (field940 == 0) {
						method388();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field943[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field943[var1]) {
					var2 = (int) (field941 * 2560 / (var11 - field943[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field941 - (var11 - field943[var1]) / 10L);
				}

				if (var3 > field941) {
					var3 = field941;
				}

				field943[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field943[var13] != 0L) {
							field943[var13] += var3;
						}
					}
				}

				if (var3 < field942) {
					var3 = field942;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field962 = field958;
					field963 = field959;
					field964 = field960;
					field965 = field961;
					field958 = 0;
					method158();
					field968 = field969;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field941 > 0) {
					field944 = var2 * 1000 / (field941 * 256);
				}

				method81();
			} while (!field945);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field943[var15]);
			}

			System.out.println("fps:" + field944 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field941 + " mindel:" + field942);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field945 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("MKNKYTZT.a(I)V")
	public final void method388() {
		field940 = -2;
		method130();

		if (field951 != null) {
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

	@ObfuscatedName("MKNKYTZT.a(II)V")
	public final void method389(int arg0) {
		field941 = 1000 / arg0;
	}

	public final void start() {
		if (field940 >= 0) {
			field940 = 0;
		}
	}

	public final void stop() {
		if (field940 >= 0) {
			field940 = 4000 / field941;
		}
	}

	public final void destroy() {
		field940 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field940 == -1) {
			method388();
		}
	}

	public final void update(Graphics arg0) {
		if (field948 == null) {
			field948 = arg0;
		}

		field952 = true;
		method84();
	}

	public final void paint(Graphics arg0) {
		if (field948 == null) {
			field948 = arg0;
		}

		field952 = true;
		method84();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field951 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field954 = 0;
		field959 = var2;
		field960 = var3;
		field961 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field958 = 2;
			field955 = 2;
		} else {
			field958 = 1;
			field955 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field954 = 0;
		field955 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field954 = 0;
		field956 = -1;
		field957 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field951 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field954 = 0;
		field956 = var2;
		field957 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field951 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field954 = 0;
		field956 = var2;
		field957 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field954 = 0;
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
			field966[var3] = 1;
		}

		if (var3 > 4) {
			field967[field969] = var3;
			field969 = field969 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field954 = 0;
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
			field966[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("MKNKYTZT.b(I)I")
	public final int method390() {
		int var1 = -1;
		if (field969 != field968) {
			var1 = field967[field968];
			field968 = field968 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field953 = true;
		field952 = true;
		method84();
	}

	public final void focusLost(FocusEvent arg0) {
		field953 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field966[var2] = 0;
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

	@ObfuscatedName("MKNKYTZT.a()V")
	public void method133() {
	}

	@ObfuscatedName("MKNKYTZT.c(I)V")
	public void method158() {
	}

	@ObfuscatedName("MKNKYTZT.d(I)V")
	public void method130() {
	}

	@ObfuscatedName("MKNKYTZT.a(Z)V")
	public void method81() {
	}

	@ObfuscatedName("MKNKYTZT.e(I)V")
	public void method84() {
	}

	@ObfuscatedName("MKNKYTZT.f(I)Ljava/awt/Component;")
	public Component method57() {
		if (field951 != null) {
			return field951;
		}

		return this;
	}

	@ObfuscatedName("MKNKYTZT.a(Ljava/lang/Runnable;I)V")
	public void method139(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("MKNKYTZT.a(ILjava/lang/String;B)V")
	public void method98(int arg0, String arg1) {
		while (field948 == null) {
			field948 = method57().getGraphics();

			try {
				method57().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method57().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method57().getFontMetrics(var5);

		if (field952) {
			field948.setColor(Color.black);
			field948.fillRect(0, 0, field946, field947);
			field952 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field947 / 2 - 18;
		field948.setColor(var6);
		field948.drawRect(field946 / 2 - 152, var7, 304, 34);
		field948.fillRect(field946 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field948.setColor(Color.black);
		field948.fillRect(arg0 * 3 + field946 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field948.setFont(var3);
		field948.setColor(Color.white);
		field948.drawString(arg1, (field946 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
