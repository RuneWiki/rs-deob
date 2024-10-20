package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eg")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("eg.y")
    public int field2065 = 0;

    @ObfuscatedName("eg.y(Ljava/awt/Component;I)V")
    public void method2417(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eg.u(Ljava/awt/Component;I)V")
    public void method2411(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2065 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eg.k(I)I")
    public synchronized int method2412() {
        int var1 = this.field2065;
        this.field2065 = 0;
        return var1;
    }
}
