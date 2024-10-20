package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ep")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("ep.i")
    public int field2055 = 0;

    @ObfuscatedName("ep.i(Ljava/awt/Component;I)V")
    public void method2454(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ep.c(Ljava/awt/Component;I)V")
    public void method2459(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2055 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ep.h(I)I")
    public synchronized int method2456() {
        int var1 = this.field2055;
        this.field2055 = 0;
        return var1;
    }
}
