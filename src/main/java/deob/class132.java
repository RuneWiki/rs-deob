package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ej")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("ej.j")
    public int field2070 = 0;

    @ObfuscatedName("ej.j(Ljava/awt/Component;I)V")
    public void method2446(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ej.z(Ljava/awt/Component;B)V")
    public void method2445(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2070 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ej.y(I)I")
    public synchronized int method2448() {
        int var1 = this.field2070;
        this.field2070 = 0;
        return var1;
    }
}
