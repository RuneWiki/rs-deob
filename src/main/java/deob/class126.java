package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("dr")
public final class class126 extends Canvas {

    @ObfuscatedName("dr.b")
    public Component field1994;

    public class126(Component arg0) {
        this.field1994 = arg0;
    }

    public final void update(Graphics arg0) {
        this.field1994.update(arg0);
    }

    public final void paint(Graphics arg0) {
        this.field1994.paint(arg0);
    }
}
