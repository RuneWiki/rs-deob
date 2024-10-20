package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ee")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("ee.g")
    public int field2080 = 0;

    @ObfuscatedName("ee.s(Ljava/awt/Component;I)V")
    public void method2368(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ee.v(Ljava/awt/Component;B)V")
    public void method2371(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2080 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ee.o(I)I")
    public synchronized int method2370() {
        int var1 = this.field2080;
        this.field2080 = 0;
        return var1;
    }
}
