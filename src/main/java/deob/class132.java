package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("em")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("em.e")
    public int field2066 = 0;

    @ObfuscatedName("em.p(Ljava/awt/Component;I)V")
    public void method2439(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("em.a(Ljava/awt/Component;B)V")
    public void method2440(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2066 += arg0.getWheelRotation();
    }

    @ObfuscatedName("em.g(B)I")
    public synchronized int method2446() {
        int var1 = this.field2066;
        this.field2066 = 0;
        return var1;
    }
}
