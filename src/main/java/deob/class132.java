package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eh")
public class class132 extends class118 implements MouseWheelListener {

    @ObfuscatedName("eh.k")
    public int field2067 = 0;

    @ObfuscatedName("eh.y(Ljava/awt/Component;I)V")
    public void method2438(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eh.s(Ljava/awt/Component;B)V")
    public void method2437(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2067 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eh.g(I)I")
    public synchronized int method2447() {
        int var1 = this.field2067;
        this.field2067 = 0;
        return var1;
    }
}
