package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("dn")
public class class107 extends class113 implements MouseWheelListener {

    @ObfuscatedName("dn.i")
    public int field1709 = 0;

    @ObfuscatedName("dn.i(Ljava/awt/Component;S)V")
    public void method1887(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("dn.e(Ljava/awt/Component;I)V")
    public void method1884(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1709 += arg0.getWheelRotation();
    }

    @ObfuscatedName("dn.f(I)I")
    public synchronized int method1892() {
        int var1 = this.field1709;
        this.field1709 = 0;
        return var1;
    }
}
