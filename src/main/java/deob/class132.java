package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ec")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("ec.t")
    public int field2031 = 0;

    @ObfuscatedName("ec.o(Ljava/awt/Component;B)V")
    public void method2402(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ec.i(Ljava/awt/Component;I)V")
    public void method2404(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2031 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ec.p(I)I")
    public synchronized int method2405() {
        int var1 = this.field2031;
        this.field2031 = 0;
        return var1;
    }
}
