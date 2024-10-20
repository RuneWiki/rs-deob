package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("dj")
public class class107 extends class113 implements MouseWheelListener {

    @ObfuscatedName("dj.s")
    public int field1728 = 0;

    @ObfuscatedName("dj.s(Ljava/awt/Component;B)V")
    public void method1862(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("dj.c(Ljava/awt/Component;B)V")
    public void method1863(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1728 += arg0.getWheelRotation();
    }

    @ObfuscatedName("dj.f(I)I")
    public synchronized int method1865() {
        int var1 = this.field1728;
        this.field1728 = 0;
        return var1;
    }
}
