package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("di")
public final class class130 extends Canvas {

    @ObfuscatedName("di.v")
    public Component field2008;

    public class130(Component arg0) {
        this.field2008 = arg0;
    }

    public final void update(Graphics arg0) {
        this.field2008.update(arg0);
    }

    public final void paint(Graphics arg0) {
        this.field2008.paint(arg0);
    }
}
