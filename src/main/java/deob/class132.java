package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ef")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("ef.k")
    public int field2061 = 0;

    @ObfuscatedName("ef.k(Ljava/awt/Component;B)V")
    public void method2424(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ef.r(Ljava/awt/Component;B)V")
    public void method2414(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2061 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ef.y(B)I")
    public synchronized int method2422() {
        int var1 = this.field2061;
        this.field2061 = 0;
        return var1;
    }
}
