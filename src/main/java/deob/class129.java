package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("du")
public class class129 extends class115 implements MouseWheelListener {

    @ObfuscatedName("du.m")
    public int field2032 = 0;

    @ObfuscatedName("du.k(Ljava/awt/Component;I)V")
    public void method2430(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("du.y(Ljava/awt/Component;I)V")
    public void method2436(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2032 += arg0.getWheelRotation();
    }

    @ObfuscatedName("du.g(I)I")
    public synchronized int method2431() {
        int var1 = this.field2032;
        this.field2032 = 0;
        return var1;
    }
}
