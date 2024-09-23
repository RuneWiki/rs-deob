import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class LinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "I")
    private int field727 = 20549;

    @OriginalMember(owner = "pb", name = "b", descriptor = "I")
    private int field728 = 933;

    @OriginalMember(owner = "pb", name = "c", descriptor = "Z")
    private boolean field729 = true;

    @OriginalMember(owner = "pb", name = "d", descriptor = "Lv;")
    public Linkable field730 = new Linkable();

    @OriginalMember(owner = "pb", name = "e", descriptor = "Lv;")
    private Linkable field731;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(B)V")
    public LinkList(byte arg0) {
        this.field730.field367 = this.field730;
        this.field730.field368 = this.field730;
        if (arg0 != 115) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lv;)V")
    public void method247(Linkable arg0) {
        if (arg0.field368 != null) {
            arg0.method118();
        }
        arg0.field368 = this.field730.field368;
        arg0.field367 = this.field730;
        arg0.field368.field367 = arg0;
        arg0.field367.field368 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lv;I)V")
    public void method248(Linkable arg0, int arg1) {
        if (arg0.field368 != null) {
            arg0.method118();
        }
        arg0.field368 = this.field730;
        arg0.field367 = this.field730.field367;
        arg0.field368.field367 = arg0;
        if (arg1 == -31692) {
            arg0.field367.field368 = arg0;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lv;")
    public Linkable method249() {
        Linkable var1 = this.field730.field367;
        if (this.field730 == var1) {
            return null;
        } else {
            var1.method118();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lv;")
    public Linkable method250() {
        Linkable var1 = this.field730.field367;
        if (this.field730 == var1) {
            this.field731 = null;
            return null;
        } else {
            this.field731 = var1.field367;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(B)Lv;")
    public Linkable method251(byte arg0) {
        Linkable var2 = this.field730.field368;
        if (this.field730 == var2) {
            this.field731 = null;
            return null;
        }
        this.field731 = var2.field368;
        if (arg0 != 127) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Z)Lv;")
    public Linkable method252(boolean arg0) {
        Linkable var2 = this.field731;
        if (this.field730 == var2) {
            this.field731 = null;
            return null;
        }
        this.field731 = var2.field367;
        if (!arg0) {
            this.field727 = 130;
        }
        return var2;
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "(B)Lv;")
    public Linkable method253(byte arg0) {
        if (arg0 != 15) {
            throw new NullPointerException();
        }
        Linkable var2 = this.field731;
        if (this.field730 == var2) {
            this.field731 = null;
            return null;
        } else {
            this.field731 = var2.field368;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()V")
    public void method254() {
        while (true) {
            Linkable var1 = this.field730.field367;
            if (this.field730 == var1) {
                return;
            }
            var1.method118();
        }
    }
}
