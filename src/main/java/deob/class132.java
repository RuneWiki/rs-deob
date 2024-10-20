package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eq")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("eq.e")
    public int field2058 = 0;

    @ObfuscatedName("eq.o(Ljava/awt/Component;I)V")
    public void method2359(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eq.y(Ljava/awt/Component;B)V")
    public void method2360(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2058 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eq.b(B)I")
    public synchronized int method2373() {
        int var1 = this.field2058;
        this.field2058 = 0;
        return var1;
    }
}
