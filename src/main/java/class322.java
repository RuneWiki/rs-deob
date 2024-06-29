import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class322 {

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public int field4114;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lda;")
    public static class59 field4116;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Ljava/lang/String;")
    public String field4112;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[I")
    public static int[] field4113;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method1924(int arg0) {
        if (arg0 != -15436) {
            method1924(-114);
        }
        field4113 = null;
        field4116 = null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method874(int arg0) throws IOException;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1925(int arg0) throws IOException {
        field4117++;
        if (arg0 != -30257) {
            method1924(-39);
        }
        return new Socket(this.field4112, this.field4114);
    }
}
