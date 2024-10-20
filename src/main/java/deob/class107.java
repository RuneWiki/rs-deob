package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("dw")
public class class107 extends class113 implements MouseWheelListener {

    @ObfuscatedName("dw.x")
    public int field1739 = 0;

    @ObfuscatedName("dw.x(Ljava/awt/Component;I)V")
    public void method1971(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("dw.j(Ljava/awt/Component;B)V")
    public void method1972(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1739 += arg0.getWheelRotation();
    }

    @ObfuscatedName("dw.c(I)I")
    public synchronized int method1973() {
        int var1 = this.field1739;
        this.field1739 = 0;
        return var1;
    }
}
