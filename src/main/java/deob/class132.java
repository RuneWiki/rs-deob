package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ef")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("ef.g")
    public int field2076 = 0;

    @ObfuscatedName("ef.v(Ljava/awt/Component;S)V")
    public void method2428(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ef.z(Ljava/awt/Component;I)V")
    public void method2425(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2076 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ef.h(I)I")
    public synchronized int method2416() {
        int var1 = this.field2076;
        this.field2076 = 0;
        return var1;
    }
}
