package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ei")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("ei.k")
    public int field2068 = 0;

    @ObfuscatedName("ei.k(Ljava/awt/Component;I)V")
    public void method2426(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ei.b(Ljava/awt/Component;B)V")
    public void method2425(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2068 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ei.e(S)I")
    public synchronized int method2429() {
        int var1 = this.field2068;
        this.field2068 = 0;
        return var1;
    }
}
