package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("da")
public class class107 extends class113 implements MouseWheelListener {

    @ObfuscatedName("da.x")
    public int field1732 = 0;

    @ObfuscatedName("da.x(Ljava/awt/Component;I)V")
    public void method2004(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("da.n(Ljava/awt/Component;B)V")
    public void method2009(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1732 += arg0.getWheelRotation();
    }

    @ObfuscatedName("da.g(B)I")
    public synchronized int method2003() {
        int var1 = this.field1732;
        this.field1732 = 0;
        return var1;
    }
}
