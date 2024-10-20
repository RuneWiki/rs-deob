package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("et")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("et.e")
    public int field2058 = 0;

    @ObfuscatedName("et.e(Ljava/awt/Component;B)V")
    public void method2428(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("et.v(Ljava/awt/Component;I)V")
    public void method2431(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2058 += arg0.getWheelRotation();
    }

    @ObfuscatedName("et.i(B)I")
    public synchronized int method2423() {
        int var1 = this.field2058;
        this.field2058 = 0;
        return var1;
    }
}
