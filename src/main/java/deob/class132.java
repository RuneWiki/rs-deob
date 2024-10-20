package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("em")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("em.n")
    public int field2040 = 0;

    @ObfuscatedName("em.n(Ljava/awt/Component;B)V")
    public void method2408(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("em.x(Ljava/awt/Component;B)V")
    public void method2409(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2040 += arg0.getWheelRotation();
    }

    @ObfuscatedName("em.k(I)I")
    public synchronized int method2407() {
        int var1 = this.field2040;
        this.field2040 = 0;
        return var1;
    }
}
