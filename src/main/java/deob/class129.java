package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("dj")
public class class129 extends class115 implements MouseWheelListener {

    @ObfuscatedName("dj.z")
    public int field2050 = 0;

    @ObfuscatedName("dj.z(Ljava/awt/Component;I)V")
    public void method2456(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("dj.n(Ljava/awt/Component;I)V")
    public void method2457(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2050 += arg0.getWheelRotation();
    }

    @ObfuscatedName("dj.u(I)I")
    public synchronized int method2458() {
        int var1 = this.field2050;
        this.field2050 = 0;
        return var1;
    }
}
