import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public abstract class class20 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "Lbj;")
    public static class162 field314 = new class162(51, 3);

    @OriginalMember(owner = "client!an", name = "d", descriptor = "Los;")
    public static class309 field317 = new class309(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!an", name = "e", descriptor = "Lju;")
    public static class83 field318 = new class83();

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Z", line = 7)
    public final boolean method133(int arg0) {
        field315++;
        if (arg0 != 23284) {
            this.method131((byte) -114);
        }
        return this.method131((byte) 119) || this.method140((byte) 120) || this.method138((byte) 105);
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V", line = 25)
    public static void method135(int arg0) {
        field314 = null;
        field318 = null;
        if (arg0 != 3) {
            field317 = null;
        }
        field317 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Z")
    public abstract boolean method131(byte arg0);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)I")
    public abstract int method132(int arg0);

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V")
    public abstract void method134(byte arg0);

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(B)V")
    public abstract void method136(byte arg0);

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(B)Lqj;")
    public abstract class356 method137(byte arg0);

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(B)Z")
    public abstract boolean method138(byte arg0);

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(I)I")
    public abstract int method139(int arg0);

    @OriginalMember(owner = "client!an", name = "f", descriptor = "(B)Z")
    public abstract boolean method140(byte arg0);
}
