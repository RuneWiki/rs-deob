package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("di")
public class class107 extends class113 implements MouseWheelListener {

    @ObfuscatedName("di.u")
    public int field1715 = 0;

    @ObfuscatedName("di.u(Ljava/awt/Component;S)V")
    public void method1890(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("di.x(Ljava/awt/Component;I)V")
    public void method1885(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1715 += arg0.getWheelRotation();
    }

    @ObfuscatedName("di.i(I)I")
    public synchronized int method1886() {
        int var1 = this.field1715;
        this.field1715 = 0;
        return var1;
    }
}
