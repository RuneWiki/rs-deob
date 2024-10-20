package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("x")
public final class class10 implements class132, MouseWheelListener {

    @ObfuscatedName("x.s")
    public int field31 = 0;

    @ObfuscatedName("x.s(Ljava/awt/Component;I)V")
    public void method64(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("x.t(Ljava/awt/Component;I)V")
    public void method66(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field31 += arg0.getWheelRotation();
    }

    @ObfuscatedName("x.v(I)I")
    public synchronized int method67() {
        int var1 = this.field31;
        this.field31 = 0;
        return var1;
    }
}
