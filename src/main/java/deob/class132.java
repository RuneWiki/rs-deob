package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("el")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("el.p")
    public int field2052 = 0;

    @ObfuscatedName("el.g(Ljava/awt/Component;I)V")
    public void method2478(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("el.x(Ljava/awt/Component;I)V")
    public void method2480(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2052 += arg0.getWheelRotation();
    }

    @ObfuscatedName("el.c(S)I")
    public synchronized int method2492() {
        int var1 = this.field2052;
        this.field2052 = 0;
        return var1;
    }
}
