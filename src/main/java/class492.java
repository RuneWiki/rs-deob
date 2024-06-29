import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class492 extends OutputStream {

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field7169 = 765;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Lls;")
    public static class121 field7166;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "[Ld;")
    public static class132[] field7164;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method2951(int arg0) {
        field7166 = null;
        if (arg0 != 765) {
            field7166 = null;
        }
        field7164 = null;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public static final void method2952(int arg0) {
        for (int var1 = arg0; var1 < class387.field5958; var1++) {
            int var2 = class362.field5141[var1];
            class411 var3 = (class411) class42.field456.method524((byte) 118, (long) var2);
            if (var3 != null) {
                class78 var4 = var3.field6254;
                class309.method2050(var4, 2, var4.field864.field8096);
            }
        }
        field7163++;
    }

    @OriginalMember(owner = "client!k", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field7168++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static final void method2953(byte arg0) {
        field7165++;
        class111.field1359 = 0;
        if (arg0 < -18) {
            class436.field6487.method718(-111);
            class436.field6487.method706(class608.field8879, true);
            class111.field1359++;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIII)V")
    public static final void method2954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 0) {
            field7164 = null;
        }
        field7167++;
        int var6 = class132.method818((byte) -93, arg2, class418.field6298, class461.field6877);
        int var7 = class132.method818((byte) -93, arg5, class418.field6298, class461.field6877);
        int var8 = class132.method818((byte) -93, arg4, class113.field1385, class4.field43);
        int var9 = class132.method818((byte) -93, arg1, class113.field1385, class4.field43);
        for (int var10 = var6; var10 <= var7; var10++) {
            class645.method3675(111, class402.field6087[var10], arg3, var8, var9);
        }
    }
}
