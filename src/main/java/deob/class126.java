package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("dc")
public final class class126 extends Canvas {

    @ObfuscatedName("dc.u")
    public Component field1995;

    public class126(Component arg0) {
        this.field1995 = arg0;
    }

    public final void update(Graphics arg0) {
        this.field1995.update(arg0);
    }

    public final void paint(Graphics arg0) {
        this.field1995.paint(arg0);
    }
}
