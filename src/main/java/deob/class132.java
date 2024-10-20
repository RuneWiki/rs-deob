package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ez")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("ez.g")
    public int field2048 = 0;

    @ObfuscatedName("ez.s(Ljava/awt/Component;S)V")
    public void method2410(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ez.h(Ljava/awt/Component;B)V")
    public void method2403(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2048 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ez.m(I)I")
    public synchronized int method2404() {
        int var1 = this.field2048;
        this.field2048 = 0;
        return var1;
    }
}
