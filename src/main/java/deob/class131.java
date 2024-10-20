package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bd")
public class class131 extends class112 implements MouseWheelListener {

    @ObfuscatedName("bd.b")
    public int field2071 = 0;

    @ObfuscatedName("bd.b(Ljava/awt/Component;I)V")
    public void method2018(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bd.h(Ljava/awt/Component;B)V")
    public void method2019(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2071 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bd.k(I)I")
    public synchronized int method2021() {
        int var1 = this.field2071;
        this.field2071 = 0;
        return var1;
    }
}
