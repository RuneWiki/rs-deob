import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZQDWDFIV")
public class class69 extends Frame {

    @OriginalMember(owner = "client!ZQDWDFIV", name = "a", descriptor = "LUBLCAEEN;")
    public class51 field1707;

    @OriginalMember(owner = "client!ZQDWDFIV", name = "<init>", descriptor = "(IIILUBLCAEEN;)V")
    public class69(int arg0, int arg1, int arg2, class51 arg3) {
        this.field1707 = arg3;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        int var5 = 39 / arg1;
        this.resize(arg2 + 8, arg0 + 28);
    }

    @OriginalMember(owner = "client!ZQDWDFIV", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!ZQDWDFIV", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1707.update(arg0);
    }

    @OriginalMember(owner = "client!ZQDWDFIV", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1707.paint(arg0);
    }
}
