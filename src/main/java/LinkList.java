import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BOHLFXVX")
public class LinkList {

    @OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "I")
    private int field90 = -48545;

    @OriginalMember(owner = "client!BOHLFXVX", name = "c", descriptor = "LZUOIJLRD;")
    public Linkable field92 = new Linkable();

    @OriginalMember(owner = "client!BOHLFXVX", name = "b", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "client!BOHLFXVX", name = "d", descriptor = "LZUOIJLRD;")
    private Linkable field93;

    @OriginalMember(owner = "client!BOHLFXVX", name = "<init>", descriptor = "(Z)V")
    public LinkList(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field92.field1770 = this.field92;
        this.field92.field1771 = this.field92;
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "(LZUOIJLRD;)V")
    public void method3(Linkable arg0) {
        if (arg0.field1771 != null) {
            arg0.method604();
        }
        arg0.field1771 = this.field92.field1771;
        arg0.field1770 = this.field92;
        arg0.field1771.field1770 = arg0;
        arg0.field1770.field1771 = arg0;
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "(BLZUOIJLRD;)V")
    public void method4(byte arg0, Linkable arg1) {
        if (arg0 != -57) {
            this.field91 = -23;
        }
        if (arg1.field1771 != null) {
            arg1.method604();
        }
        arg1.field1771 = this.field92;
        arg1.field1770 = this.field92.field1770;
        arg1.field1771.field1770 = arg1;
        arg1.field1770.field1771 = arg1;
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "()LZUOIJLRD;")
    public Linkable method5() {
        Linkable var1 = this.field92.field1770;
        if (this.field92 == var1) {
            return null;
        } else {
            var1.method604();
            return var1;
        }
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "b", descriptor = "()LZUOIJLRD;")
    public Linkable method6() {
        Linkable var1 = this.field92.field1770;
        if (this.field92 == var1) {
            this.field93 = null;
            return null;
        } else {
            this.field93 = var1.field1770;
            return var1;
        }
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "(Z)LZUOIJLRD;")
    public Linkable method7(boolean arg0) {
        Linkable var2 = this.field92.field1771;
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field92 == var2) {
            this.field93 = null;
            return null;
        } else {
            this.field93 = var2.field1771;
            return var2;
        }
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "(I)LZUOIJLRD;")
    public Linkable method8(int arg0) {
        Linkable var2 = this.field93;
        if (this.field92 == var2) {
            this.field93 = null;
            return null;
        }
        this.field93 = var2.field1770;
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "b", descriptor = "(I)LZUOIJLRD;")
    public Linkable method9(int arg0) {
        Linkable var2 = this.field93;
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (this.field92 == var2) {
            this.field93 = null;
            return null;
        } else {
            this.field93 = var2.field1771;
            return var2;
        }
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "c", descriptor = "()V")
    public void method10() {
        if (this.field92.field1770 == this.field92) {
            return;
        }
        while (true) {
            Linkable var1 = this.field92.field1770;
            if (this.field92 == var1) {
                return;
            }
            var1.method604();
        }
    }
}
