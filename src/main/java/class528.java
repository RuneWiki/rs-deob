import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class528 extends class329 {

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
    public int field7783;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "[B")
    public byte[] field7782;

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
    public int field7781;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
    public int field7784;

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "Z")
    public boolean field7785;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lvg;)Llv;", line = 10)
    public final class528 method3138(class56 arg0) {
        this.field7782 = arg0.method410(this.field7782, (byte) -93);
        this.field7783 = arg0.method414((byte) -87, this.field7783);
        if (this.field7784 == this.field7781) {
            this.field7781 = this.field7784 = arg0.method413(true, this.field7781);
        } else {
            this.field7781 = arg0.method413(true, this.field7781);
            this.field7784 = arg0.method413(true, this.field7784);
            if (this.field7784 == this.field7781) {
                this.field7781--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class528(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field7783 = arg0;
        this.field7782 = arg1;
        this.field7781 = arg2;
        this.field7784 = arg3;
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class528(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field7783 = arg0;
        this.field7782 = arg1;
        this.field7781 = arg2;
        this.field7784 = arg3;
        this.field7785 = arg4;
    }
}
