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

@ObfuscatedName("OFXQYNOM")
public class OFXQYNOM extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("OFXQYNOM.f")
	public int field1041 = 20;

	@ObfuscatedName("OFXQYNOM.g")
	public int field1042 = 1;

	@ObfuscatedName("OFXQYNOM.h")
	public long[] field1043 = new long[10];

	@ObfuscatedName("OFXQYNOM.j")
	public boolean field1045 = false;

	@ObfuscatedName("OFXQYNOM.o")
	public TTWFVYGB[] field1050 = new TTWFVYGB[6];

	@ObfuscatedName("OFXQYNOM.q")
	public boolean field1052 = true;

	@ObfuscatedName("OFXQYNOM.r")
	public boolean field1053 = true;

	@ObfuscatedName("OFXQYNOM.E")
	public int[] field1066 = new int[128];

	@ObfuscatedName("OFXQYNOM.F")
	public int[] field1067 = new int[128];

	@ObfuscatedName("OFXQYNOM.e")
	public int field1040;

	@ObfuscatedName("OFXQYNOM.i")
	public int field1044;

	@ObfuscatedName("OFXQYNOM.k")
	public int field1046;

	@ObfuscatedName("OFXQYNOM.l")
	public int field1047;

	@ObfuscatedName("OFXQYNOM.s")
	public int field1054;

	@ObfuscatedName("OFXQYNOM.t")
	public int field1055;

	@ObfuscatedName("OFXQYNOM.u")
	public int field1056;

	@ObfuscatedName("OFXQYNOM.v")
	public int field1057;

	@ObfuscatedName("OFXQYNOM.w")
	public int field1058;

	@ObfuscatedName("OFXQYNOM.x")
	public int field1059;

	@ObfuscatedName("OFXQYNOM.y")
	public int field1060;

	@ObfuscatedName("OFXQYNOM.A")
	public int field1062;

	@ObfuscatedName("OFXQYNOM.B")
	public int field1063;

	@ObfuscatedName("OFXQYNOM.C")
	public int field1064;

	@ObfuscatedName("OFXQYNOM.G")
	public int field1068;

	@ObfuscatedName("OFXQYNOM.H")
	public int field1069;

	@ObfuscatedName("OFXQYNOM.z")
	public long field1061;

	@ObfuscatedName("OFXQYNOM.D")
	public long field1065;

	@ObfuscatedName("OFXQYNOM.p")
	public JYOWNEXJ field1051;

	@ObfuscatedName("OFXQYNOM.n")
	public MVSFNVJP field1049;

	@ObfuscatedName("OFXQYNOM.m")
	public Graphics field1048;

	@ObfuscatedName("OFXQYNOM.a(BII)V")
	public final void method403(int arg0, int arg1) {
		field1046 = arg1;
		field1047 = arg0;
		field1051 = new JYOWNEXJ(field1046, this, field1047);
		field1048 = method174().getGraphics();
		field1049 = new MVSFNVJP(method174(), field1047, field1046);
		method164(this, 1);
	}

	@ObfuscatedName("OFXQYNOM.a(IIB)V")
	public final void method404(int arg0, int arg1) {
		field1046 = arg0;
		field1047 = arg1;
		field1048 = method174().getGraphics();
		field1049 = new MVSFNVJP(method174(), field1047, field1046);
		method164(this, 1);
	}

	public void run() {
		method174().addMouseListener(this);
		method174().addMouseMotionListener(this);
		method174().addKeyListener(this);
		method174().addFocusListener(this);

		if (field1051 != null) {
			field1051.addWindowListener(this);
		}

		method188("Loading...", 0);
		method123();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field1043[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field1040 < 0) {
					if (field1040 == -1) {
						method405();
					}

					return;
				}

				if (field1040 > 0) {
					field1040--;
					if (field1040 == 0) {
						method405();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field1043[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field1043[var1]) {
					var2 = (int) (field1041 * 2560 / (var11 - field1043[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field1041 - (var11 - field1043[var1]) / 10L);
				}

				if (var3 > field1041) {
					var3 = field1041;
				}

				field1043[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field1043[var13] != 0L) {
							field1043[var13] += var3;
						}
					}
				}

				if (var3 < field1042) {
					var3 = field1042;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field1062 = field1058;
					field1063 = field1059;
					field1064 = field1060;
					field1065 = field1061;
					field1058 = 0;
					method184();
					field1068 = field1069;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field1041 > 0) {
					field1044 = var2 * 1000 / (field1041 * 256);
				}

				method137();
			} while (!field1045);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field1043[var15]);
			}

			System.out.println("fps:" + field1044 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field1041 + " mindel:" + field1042);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field1045 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("OFXQYNOM.a(I)V")
	public final void method405() {
		field1040 = -2;
		method108();

		if (field1051 != null) {
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

	@ObfuscatedName("OFXQYNOM.a(IZ)V")
	public final void method406(int arg0) {
		field1041 = 1000 / arg0;
	}

	public final void start() {
		if (field1040 >= 0) {
			field1040 = 0;
		}
	}

	public final void stop() {
		if (field1040 >= 0) {
			field1040 = 4000 / field1041;
		}
	}

	public final void destroy() {
		field1040 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field1040 == -1) {
			method405();
		}
	}

	public final void update(Graphics arg0) {
		if (field1048 == null) {
			field1048 = arg0;
		}

		field1052 = true;
		method162();
	}

	public final void paint(Graphics arg0) {
		if (field1048 == null) {
			field1048 = arg0;
		}

		field1052 = true;
		method162();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1051 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1054 = 0;
		field1059 = var2;
		field1060 = var3;
		field1061 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field1058 = 2;
			field1055 = 2;
		} else {
			field1058 = 1;
			field1055 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field1054 = 0;
		field1055 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field1054 = 0;
		field1056 = -1;
		field1057 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1051 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1054 = 0;
		field1056 = var2;
		field1057 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field1051 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field1054 = 0;
		field1056 = var2;
		field1057 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field1054 = 0;
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
			field1066[var3] = 1;
		}

		if (var3 > 4) {
			field1067[field1069] = var3;
			field1069 = field1069 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field1054 = 0;
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
			field1066[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("OFXQYNOM.a(Z)I")
	public final int method407() {
		int var1 = -1;
		if (field1069 != field1068) {
			var1 = field1067[field1068];
			field1068 = field1068 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field1053 = true;
		field1052 = true;
		method162();
	}

	public final void focusLost(FocusEvent arg0) {
		field1053 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field1066[var2] = 0;
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

	@ObfuscatedName("OFXQYNOM.a()V")
	public void method123() {
	}

	@ObfuscatedName("OFXQYNOM.b(I)V")
	public void method184() {
	}

	@ObfuscatedName("OFXQYNOM.a(B)V")
	public void method108() {
	}

	@ObfuscatedName("OFXQYNOM.c(I)V")
	public void method137() {
	}

	@ObfuscatedName("OFXQYNOM.d(I)V")
	public void method162() {
	}

	@ObfuscatedName("OFXQYNOM.b(Z)Ljava/awt/Component;")
	public Component method174() {
		if (field1051 != null) {
			return field1051;
		}

		return this;
	}

	@ObfuscatedName("OFXQYNOM.a(Ljava/lang/Runnable;I)V")
	public void method164(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("OFXQYNOM.a(ILjava/lang/String;I)V")
	public void method188(String arg0, int arg1) {
		while (field1048 == null) {
			field1048 = method174().getGraphics();

			try {
				method174().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method174().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method174().getFontMetrics(var5);

		if (field1052) {
			field1048.setColor(Color.black);
			field1048.fillRect(0, 0, field1046, field1047);
			field1052 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field1047 / 2 - 18;
		field1048.setColor(var6);
		field1048.drawRect(field1046 / 2 - 152, var7, 304, 34);
		field1048.fillRect(field1046 / 2 - 150, var7 + 2, arg1 * 3, 30);
		field1048.setColor(Color.black);
		field1048.fillRect(arg1 * 3 + field1046 / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		field1048.setFont(var3);
		field1048.setColor(Color.white);
		field1048.drawString(arg0, (field1046 - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
