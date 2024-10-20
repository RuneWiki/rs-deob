package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eg")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("eg.z")
    public int field2052 = 0;

    @ObfuscatedName("eg.j(Ljava/awt/Component;B)V")
    public void method2436(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eg.a(Ljava/awt/Component;B)V")
    public void method2437(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2052 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eg.y(I)I")
    public synchronized int method2438() {
        int var1 = this.field2052;
        this.field2052 = 0;
        return var1;
    }
}
