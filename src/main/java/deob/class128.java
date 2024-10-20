package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("dt")
public final class class128 extends Canvas {

    @ObfuscatedName("dt.g")
    public Component field1980;

    public class128(Component arg0) {
        this.field1980 = arg0;
    }

    public final void update(Graphics arg0) {
        this.field1980.update(arg0);
    }

    public final void paint(Graphics arg0) {
        this.field1980.paint(arg0);
    }
}
