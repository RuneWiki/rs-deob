package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("di")
public final class class128 extends Canvas {

    @ObfuscatedName("di.l")
    public Component field1988;

    public class128(Component arg0) {
        this.field1988 = arg0;
    }

    public final void update(Graphics arg0) {
        this.field1988.update(arg0);
    }

    public final void paint(Graphics arg0) {
        this.field1988.paint(arg0);
    }
}
