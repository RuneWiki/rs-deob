package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("dg")
public class class107 extends class113 implements MouseWheelListener {

    @ObfuscatedName("dg.o")
    public int field1730 = 0;

    @ObfuscatedName("dg.o(Ljava/awt/Component;I)V")
    public void method1872(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("dg.m(Ljava/awt/Component;I)V")
    public void method1878(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1730 += arg0.getWheelRotation();
    }

    @ObfuscatedName("dg.b(I)I")
    public synchronized int method1874() {
        int var1 = this.field1730;
        this.field1730 = 0;
        return var1;
    }
}
