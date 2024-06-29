import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class456 extends class508 {

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "[B")
    public byte[] field5829;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "[I")
    public static int[] field5830 = new int[13];

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "[I")
    public static int[] field5831 = new int[250];

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "[I")
    public static int[] field5832 = new int[1];

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "Loj;")
    public static class543 field5828;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
    public static void method2437(byte arg0) {
        int var1 = 43 % ((-arg0 - 13) / 48);
        field5832 = null;
        field5828 = null;
        field5831 = null;
        field5830 = null;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "([B)V")
    public class456(byte[] arg0) {
        this.field5829 = arg0;
    }
}
