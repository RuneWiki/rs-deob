package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("dl")
public class class107 extends class113 implements MouseWheelListener {

    @ObfuscatedName("dl.d")
    public int field1714 = 0;

    @ObfuscatedName("dl.d(Ljava/awt/Component;B)V")
    public void method1924(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("dl.c(Ljava/awt/Component;B)V")
    public void method1929(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1714 += arg0.getWheelRotation();
    }

    @ObfuscatedName("dl.n(I)I")
    public synchronized int method1923() {
        int var1 = this.field1714;
        this.field1714 = 0;
        return var1;
    }
}
