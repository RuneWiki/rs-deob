package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("di")
public final class class126 extends Canvas {

    @ObfuscatedName("di.z")
    public Component field1978;

    public class126(Component arg0) {
        this.field1978 = arg0;
    }

    public final void update(Graphics arg0) {
        this.field1978.update(arg0);
    }

    public final void paint(Graphics arg0) {
        this.field1978.paint(arg0);
    }
}
