package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("dn")
public class class107 extends class113 implements MouseWheelListener {

    @ObfuscatedName("dn.k")
    public int field1727 = 0;

    @ObfuscatedName("dn.k(Ljava/awt/Component;B)V")
    public void method1900(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("dn.y(Ljava/awt/Component;S)V")
    public void method1914(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1727 += arg0.getWheelRotation();
    }

    @ObfuscatedName("dn.o(B)I")
    public synchronized int method1902() {
        int var1 = this.field1727;
        this.field1727 = 0;
        return var1;
    }
}
