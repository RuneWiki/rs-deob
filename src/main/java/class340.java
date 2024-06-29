import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class340 {

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Llh;")
    private class364 field5195 = new class364(64);

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public int field5200 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lhh;")
    private class84 field5193;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public int field5196;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lgf;")
    public static class180 field5198 = new class180("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Lui;")
    public static class151 field5201;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public final void method2220(int arg0) {
        class364 var2 = this.field5195;
        synchronized (this.field5195) {
            this.field5195.method2349(0);
        }
        if (arg0 != 4) {
            field5198 = null;
        }
        field5197++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
    public final void method2221(int arg0, int arg1) {
        class364 var3 = this.field5195;
        synchronized (this.field5195) {
            if (arg1 != 4) {
                this.method2221(-41, -26);
            }
            this.field5195.method2348(arg0, arg1 ^ 0xFFFFFF85);
        }
        field5192++;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)Lon;")
    public final class220 method2222(int arg0, int arg1) {
        field5194++;
        class364 var3 = this.field5195;
        class220 var4;
        synchronized (this.field5195) {
            if (arg0 != -21925) {
                method2224(true);
            }
            var4 = (class220) this.field5195.method2339(-65, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5193.method683(4, arg1, arg0 + 21930);
        class220 var6 = new class220();
        var6.field3186 = arg1;
        var6.field3174 = this;
        if (var5 != null) {
            var6.method1457(0, new class303(var5));
        }
        var6.method1458((byte) 73);
        class364 var7 = this.field5195;
        synchronized (this.field5195) {
            this.field5195.method2342((long) arg1, var6, 102);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public final void method2223(int arg0) {
        class364 var2 = this.field5195;
        synchronized (this.field5195) {
            if (arg0 <= 12) {
                field5201 = null;
            }
            this.field5195.method2350((byte) 112);
        }
        field5199++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public static void method2224(boolean arg0) {
        field5198 = null;
        if (arg0) {
            method2224(false);
        }
        field5201 = null;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lmt;ILhh;)V")
    public class340(class271 arg0, int arg1, class84 arg2) {
        this.field5193 = arg2;
        this.field5196 = this.field5193.method656((byte) 122, 4);
    }
}
