package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("df")
public class class107 extends class113 implements MouseWheelListener {

    @ObfuscatedName("df.b")
    public int field1722 = 0;

    @ObfuscatedName("df.b(Ljava/awt/Component;I)V")
    public void method1969(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("df.l(Ljava/awt/Component;S)V")
    public void method1970(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1722 += arg0.getWheelRotation();
    }

    @ObfuscatedName("df.i(B)I")
    public synchronized int method1976() {
        int var1 = this.field1722;
        this.field1722 = 0;
        return var1;
    }
}
