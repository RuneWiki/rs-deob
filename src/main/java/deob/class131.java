package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bd")
public class class131 extends class129 implements MouseWheelListener {

    @ObfuscatedName("bd.v")
    public int field1947 = 0;

    @ObfuscatedName("bd.c(Ljava/awt/Component;B)V")
    public void method2208(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bd.b(Ljava/awt/Component;I)V")
    public void method2212(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1947 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bd.i(B)I")
    public synchronized int method2210() {
        int var1 = this.field1947;
        this.field1947 = 0;
        return var1;
    }
}
