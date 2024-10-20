package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("df")
public class class114 extends class28 implements MouseWheelListener {

    @ObfuscatedName("df.t")
    public int field1547 = 0;

    @ObfuscatedName("df.t(Ljava/awt/Component;I)V")
    public void method353(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("df.n(Ljava/awt/Component;I)V")
    public void method348(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1547 += arg0.getWheelRotation();
    }

    @ObfuscatedName("df.q(I)I")
    public synchronized int method349() {
        int var1 = this.field1547;
        this.field1547 = 0;
        return var1;
    }
}
