package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("bv")
public final class class110 extends Canvas {

    @ObfuscatedName("bv.b")
    public Component field1849;

    public final void update(Graphics arg0) {
        this.field1849.update(arg0);
    }

    public class110(Component arg0) {
        this.field1849 = arg0;
    }

    public final void paint(Graphics arg0) {
        this.field1849.paint(arg0);
    }
}
