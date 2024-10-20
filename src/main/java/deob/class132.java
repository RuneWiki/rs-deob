package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("el")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("el.g")
    public int field2068 = 0;

    @ObfuscatedName("el.i(Ljava/awt/Component;I)V")
    public void method2421(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("el.k(Ljava/awt/Component;I)V")
    public void method2422(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2068 += arg0.getWheelRotation();
    }

    @ObfuscatedName("el.e(B)I")
    public synchronized int method2424() {
        int var1 = this.field2068;
        this.field2068 = 0;
        return var1;
    }
}
