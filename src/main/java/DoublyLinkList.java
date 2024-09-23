import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BISVHPUN")
public class DoublyLinkList {

    @OriginalMember(owner = "BISVHPUN", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = false;

    @OriginalMember(owner = "BISVHPUN", name = "b", descriptor = "I")
    private int _flowObfuscator2 = -589;

    @OriginalMember(owner = "BISVHPUN", name = "c", descriptor = "LPPOHBEGB;")
    public DoublyLinkable sentinel = new DoublyLinkable();

    @OriginalMember(owner = "BISVHPUN", name = "d", descriptor = "LPPOHBEGB;")
    private DoublyLinkable cursor;

    @OriginalMember(owner = "BISVHPUN", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        if (arg0 != 0) {
            this._flowObfuscator2 = -25;
        }
        this.sentinel.nextDouble = this.sentinel;
        this.sentinel.prevDouble = this.sentinel;
    }

    @OriginalMember(owner = "BISVHPUN", name = "a", descriptor = "(LPPOHBEGB;)V")
    public void addTail(DoublyLinkable arg0) {
        if (arg0.prevDouble != null) {
            arg0.unlinkDouble();
        }
        arg0.prevDouble = this.sentinel.prevDouble;
        arg0.nextDouble = this.sentinel;
        arg0.prevDouble.nextDouble = arg0;
        arg0.nextDouble.prevDouble = arg0;
    }

    @OriginalMember(owner = "BISVHPUN", name = "a", descriptor = "()LPPOHBEGB;")
    public DoublyLinkable removeHead() {
        DoublyLinkable var1 = this.sentinel.nextDouble;
        if (this.sentinel == var1) {
            return null;
        } else {
            var1.unlinkDouble();
            return var1;
        }
    }

    @OriginalMember(owner = "BISVHPUN", name = "b", descriptor = "()LPPOHBEGB;")
    public DoublyLinkable head() {
        DoublyLinkable var1 = this.sentinel.nextDouble;
        if (this.sentinel == var1) {
            this.cursor = null;
            return null;
        } else {
            this.cursor = var1.nextDouble;
            return var1;
        }
    }

    @OriginalMember(owner = "BISVHPUN", name = "a", descriptor = "(Z)LPPOHBEGB;")
    public DoublyLinkable next(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        DoublyLinkable var2 = this.cursor;
        if (this.sentinel == var2) {
            this.cursor = null;
            return null;
        } else {
            this.cursor = var2.nextDouble;
            return var2;
        }
    }

    @OriginalMember(owner = "BISVHPUN", name = "c", descriptor = "()I")
    public int size() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.sentinel.nextDouble; var2 != this.sentinel; var2 = var2.nextDouble) {
            var1++;
        }
        return var1;
    }
}
