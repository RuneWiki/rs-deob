package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("dg")
public final class class126 extends Canvas {

    @ObfuscatedName("dg.g")
    public Component field2000;

    public class126(Component arg0) {
        this.field2000 = arg0;
    }

    public final void update(Graphics arg0) {
        this.field2000.update(arg0);
    }

    public final void paint(Graphics arg0) {
        this.field2000.paint(arg0);
    }
}
