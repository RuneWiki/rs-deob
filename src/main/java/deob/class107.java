package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("dk")
public class class107 extends class113 implements MouseWheelListener {

    @ObfuscatedName("dk.p")
    public int field1725 = 0;

    @ObfuscatedName("dk.p(Ljava/awt/Component;I)V")
    public void method1887(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("dk.g(Ljava/awt/Component;I)V")
    public void method1888(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1725 += arg0.getWheelRotation();
    }

    @ObfuscatedName("dk.x(I)I")
    public synchronized int method1890() {
        int var1 = this.field1725;
        this.field1725 = 0;
        return var1;
    }
}
