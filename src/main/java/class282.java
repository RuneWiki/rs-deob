import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public abstract class class282 {

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "J")
    public static long field4180 = -1L;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)[B")
    public abstract byte[] method429(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I[B)V")
    public abstract void method428(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)[B")
    public abstract byte[] method427(byte arg0);
}
