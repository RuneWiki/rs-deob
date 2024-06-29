import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class523 extends InputStream {

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "[[[I")
    public static int[][][] field7048 = new int[2][][];

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "Lea;")
    public static class547 field7049 = new class547(22, 6);

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lgg;Z[[[BIB)Z")
    public static final boolean method2907(class176 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class735.field10263) {
            return false;
        }
        int var5 = arg0.field2170 >> class443.field6172;
        int var6 = var5;
        int var7 = arg0.field2165 >> class443.field6172;
        int var8 = var7;
        if (arg0 instanceof class752) {
            var6 = ((class752) arg0).field10426;
            var8 = ((class752) arg0).field10425;
            var5 = ((class752) arg0).field10422;
            var7 = ((class752) arg0).field10421;
        }
        for (int var9 = var5; var9 <= var6; var9++) {
            for (int var10 = var7; var10 <= var8; var10++) {
                if (arg0.field2167 < class307.field4170 && var9 >= class635.field8826 && var9 < class553.field7818 && var10 >= class712.field9939 && var10 < class170.field2115) {
                    if ((arg2 == null || arg0.field2175 < arg3 || arg2[arg0.field2175][var9][var10] != arg4) && arg0.method885(false) && !arg0.method882(class22.field158, (byte) 77)) {
                        return false;
                    }
                    if (!arg1 && var9 >= class610.field8512 - 16 && var9 <= class610.field8512 + 16 && var10 >= class39.field407 - 16 && var10 <= class39.field407 + 16) {
                        if (class181.field2224) {
                            class293.field3923[class195.field2330++].method3636((byte) 115, arg0);
                            class195.field2330 %= class360.field4767;
                        } else {
                            arg0.method136(class22.field158, -51);
                        }
                    }
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)V")
    public static void method2908(boolean arg0) {
        if (arg0) {
            method2908(true);
        }
        field7049 = null;
        field7048 = null;
    }

    @OriginalMember(owner = "client!baa", name = "read", descriptor = "()I")
    public final int read() {
        field7047++;
        class267.method1599(0, 30000L);
        return -1;
    }
}
