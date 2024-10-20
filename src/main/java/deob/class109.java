package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bw")
public class class109 extends class114 implements MouseWheelListener {

    @ObfuscatedName("bw.j")
    public int field1756 = 0;

    @ObfuscatedName("bw.p(Ljava/awt/Component;B)V")
    public void method1885(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    @ObfuscatedName("bw.j(Ljava/awt/Component;I)V")
    public void method1886(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1756 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bw.o(B)I")
    public synchronized int method1888() {
        int var1 = this.field1756;
        this.field1756 = 0;
        return var1;
    }
}
