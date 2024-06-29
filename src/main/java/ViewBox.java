import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FPVKJCAH")
public class ViewBox extends Frame {

    @OriginalMember(owner = "client!FPVKJCAH", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = true;

    @OriginalMember(owner = "client!FPVKJCAH", name = "b", descriptor = "LKHACHIFW;")
    public GameShell shell;

    @OriginalMember(owner = "client!FPVKJCAH", name = "<init>", descriptor = "(LKHACHIFW;IBI)V")
    public ViewBox(GameShell arg0, int arg1, byte arg2, int arg3) {
        this.shell = arg0;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        if (arg2 != 5) {
            this._flowObfuscator1 = !this._flowObfuscator1;
        }
        this.toFront();
        this.resize(arg1 + 8, arg3 + 28);
    }

    @OriginalMember(owner = "client!FPVKJCAH", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
    public Graphics getGraphics() {
        Graphics var1 = super.getGraphics();
        var1.translate(4, 24);
        return var1;
    }

    @OriginalMember(owner = "client!FPVKJCAH", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.shell.update(arg0);
    }

    @OriginalMember(owner = "client!FPVKJCAH", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.shell.paint(arg0);
    }
}
