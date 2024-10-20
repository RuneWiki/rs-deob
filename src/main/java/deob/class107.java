package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("du")
public class class107 extends class113 implements MouseWheelListener {

    @ObfuscatedName("du.q")
    public int field1731 = 0;

    @ObfuscatedName("du.q(Ljava/awt/Component;I)V")
    public void method1989(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("du.d(Ljava/awt/Component;I)V")
    public void method1994(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1731 += arg0.getWheelRotation();
    }

    @ObfuscatedName("du.h(I)I")
    public synchronized int method1990() {
        int var1 = this.field1731;
        this.field1731 = 0;
        return var1;
    }
}
