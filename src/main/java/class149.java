import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class149 extends class263 {

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    public static int field1788 = 0;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public int field1774;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public int field1775;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public int field1776;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public int field1777;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public int field1778;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public int field1780;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public int field1781;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public int field1783;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public int field1784;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public int field1785;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public int field1790;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public int field1791;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public int field1792;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    public int field1793;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public int field1794;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Ljs;")
    public class309 field1772;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "Lft;")
    public class4 field1782;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "Lfh;")
    public class609 field1786;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Ljv;")
    public class74 field1779;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILjava/net/Socket;)Lhca;")
    public static final class457 method932(int arg0, int arg1, Socket arg2) throws IOException {
        field1789++;
        return arg1 == -7656 ? new class504(arg2, arg0) : null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public final void method933(int arg0) {
        this.field1772 = null;
        if (arg0 == 0) {
            this.field1786 = null;
            this.field1782 = null;
            field1773++;
            this.field1779 = null;
        }
    }
}
