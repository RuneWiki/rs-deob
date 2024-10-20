package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eq")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("eq.b")
    public int field2065 = 0;

    @ObfuscatedName("eq.u(Ljava/awt/Component;I)V")
    public void method2454(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eq.x(Ljava/awt/Component;B)V")
    public void method2451(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2065 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eq.j(B)I")
    public synchronized int method2452() {
        int var1 = this.field2065;
        this.field2065 = 0;
        return var1;
    }
}
