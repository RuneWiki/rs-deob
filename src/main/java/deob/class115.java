package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("dh")
public class class115 extends class28 implements MouseWheelListener {

    @ObfuscatedName("dh.q")
    public int field1562 = 0;

    @ObfuscatedName("dh.l(Ljava/awt/Component;I)V")
    public void method327(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("dh.a(Ljava/awt/Component;I)V")
    public void method335(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1562 += arg0.getWheelRotation();
    }

    @ObfuscatedName("dh.o(I)I")
    public synchronized int method330() {
        int var1 = this.field1562;
        this.field1562 = 0;
        return var1;
    }
}
