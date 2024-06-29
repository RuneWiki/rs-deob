import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public abstract class class181 extends class339 {

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "Z")
    public volatile boolean field2536 = true;

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "I")
    public static int field2533 = -2;

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "Z")
    public static boolean field2534 = false;

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "Z")
    public boolean field2537;

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "Z")
    public boolean field2538;

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)I")
    public abstract int method438(byte arg0);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lga;I)V")
    public static final void method1212(class332 arg0, int arg1) {
        class455.field5988 = arg0;
        field2535++;
        if (arg1 != -2) {
            method1212(null, -65);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)[B")
    public abstract byte[] method437(int arg0);
}
