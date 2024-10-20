package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("da")
public class class107 extends class113 implements MouseWheelListener {

    @ObfuscatedName("da.f")
    public int field1752 = 0;

    @ObfuscatedName("da.f(Ljava/awt/Component;I)V")
    public void method1946(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("da.i(Ljava/awt/Component;B)V")
    public void method1950(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1752 += arg0.getWheelRotation();
    }

    @ObfuscatedName("da.u(B)I")
    public synchronized int method1948() {
        int var1 = this.field1752;
        this.field1752 = 0;
        return var1;
    }
}
