import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JTFJPMGL")
public class class28 {

    @OriginalMember(owner = "client!JTFJPMGL", name = "a", descriptor = "Z")
    private boolean field908 = true;

    @OriginalMember(owner = "client!JTFJPMGL", name = "b", descriptor = "LHZZJZIMV;")
    public class21 field909 = new class21();

    @OriginalMember(owner = "client!JTFJPMGL", name = "c", descriptor = "LHZZJZIMV;")
    private class21 field910;

    @OriginalMember(owner = "client!JTFJPMGL", name = "<init>", descriptor = "(I)V")
    public class28(int arg0) {
        while (arg0 >= 0) {
            this.field908 = !this.field908;
        }
        this.field909.field767 = this.field909;
        this.field909.field768 = this.field909;
    }

    @OriginalMember(owner = "client!JTFJPMGL", name = "a", descriptor = "(LHZZJZIMV;)V")
    public void method270(class21 arg0) {
        if (arg0.field768 != null) {
            arg0.method213();
        }
        arg0.field768 = this.field909.field768;
        arg0.field767 = this.field909;
        arg0.field768.field767 = arg0;
        arg0.field767.field768 = arg0;
    }

    @OriginalMember(owner = "client!JTFJPMGL", name = "a", descriptor = "()LHZZJZIMV;")
    public class21 method271() {
        class21 var1 = this.field909.field767;
        if (this.field909 == var1) {
            return null;
        } else {
            var1.method213();
            return var1;
        }
    }

    @OriginalMember(owner = "client!JTFJPMGL", name = "b", descriptor = "()LHZZJZIMV;")
    public class21 method272() {
        class21 var1 = this.field909.field767;
        if (this.field909 == var1) {
            this.field910 = null;
            return null;
        } else {
            this.field910 = var1.field767;
            return var1;
        }
    }

    @OriginalMember(owner = "client!JTFJPMGL", name = "a", descriptor = "(I)LHZZJZIMV;")
    public class21 method273(int arg0) {
        int var2 = 60 / arg0;
        class21 var3 = this.field910;
        if (this.field909 == var3) {
            this.field910 = null;
            return null;
        } else {
            this.field910 = var3.field767;
            return var3;
        }
    }

    @OriginalMember(owner = "client!JTFJPMGL", name = "c", descriptor = "()I")
    public int method274() {
        int var1 = 0;
        for (class21 var2 = this.field909.field767; var2 != this.field909; var2 = var2.field767) {
            var1++;
        }
        return var1;
    }
}
