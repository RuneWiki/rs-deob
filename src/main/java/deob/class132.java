package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("em")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("em.t")
    public int field2056 = 0;

    @ObfuscatedName("em.s(Ljava/awt/Component;I)V")
    public void method2412(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("em.f(Ljava/awt/Component;B)V")
    public void method2414(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2056 += arg0.getWheelRotation();
    }

    @ObfuscatedName("em.e(I)I")
    public synchronized int method2415() {
        int var1 = this.field2056;
        this.field2056 = 0;
        return var1;
    }
}
