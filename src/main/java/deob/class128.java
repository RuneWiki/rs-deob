package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("dy")
public final class class128 extends Canvas {

    @ObfuscatedName("dy.v")
    public Component field1990;

    public class128(Component arg0) {
        this.field1990 = arg0;
    }

    public final void update(Graphics arg0) {
        this.field1990.update(arg0);
    }

    public final void paint(Graphics arg0) {
        this.field1990.paint(arg0);
    }
}
