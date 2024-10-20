package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("di")
public final class class123 extends Canvas {

    @ObfuscatedName("di.z")
    public Component field1975;

    public class123(Component arg0) {
        this.field1975 = arg0;
    }

    public final void update(Graphics arg0) {
        this.field1975.update(arg0);
    }

    public final void paint(Graphics arg0) {
        this.field1975.paint(arg0);
    }
}
