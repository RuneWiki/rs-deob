package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("dj")
public class class107 extends class113 implements MouseWheelListener {

    @ObfuscatedName("dj.n")
    public int field1725 = 0;

    @ObfuscatedName("dj.n(Ljava/awt/Component;I)V")
    public void method1938(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("dj.d(Ljava/awt/Component;I)V")
    public void method1940(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1725 += arg0.getWheelRotation();
    }

    @ObfuscatedName("dj.m(S)I")
    public synchronized int method1939() {
        int var1 = this.field1725;
        this.field1725 = 0;
        return var1;
    }
}
