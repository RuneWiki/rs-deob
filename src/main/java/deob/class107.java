package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("dd")
public class class107 extends class113 implements MouseWheelListener {

    @ObfuscatedName("dd.b")
    public int field1718 = 0;

    @ObfuscatedName("dd.b(Ljava/awt/Component;I)V")
    public void method1970(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("dd.e(Ljava/awt/Component;I)V")
    public void method1974(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1718 += arg0.getWheelRotation();
    }

    @ObfuscatedName("dd.c(I)I")
    public synchronized int method1972() {
        int var1 = this.field1718;
        this.field1718 = 0;
        return var1;
    }
}
