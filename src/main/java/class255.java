import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public abstract class class255 {

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "Lsb;")
    public static class305 field3199 = new class305(1, 3);

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "Ldba;")
    public static class240 field3200 = new class240();

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "J")
    public static long field3201 = 0L;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IB)Z")
    public static final boolean method1506(int arg0, byte arg1) {
        field3197++;
        if (class507.field7282[arg0]) {
            return true;
        } else if (class551.field7882.method3882(87, arg0)) {
            int var2 = class551.field7882.method3883(arg0, arg1 - 113);
            if (var2 == 0) {
                class507.field7282[arg0] = true;
                return true;
            }
            if (class102.field1106[arg0] == null) {
                class102.field1106[arg0] = new class452[var2];
            }
            if (arg1 != 113) {
                field3201 = 27L;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class102.field1106[arg0][var3] == null) {
                    byte[] var4 = class551.field7882.method3854((byte) 79, arg0, var3);
                    if (var4 != null) {
                        class452 var5 = class102.field1106[arg0][var3] = new class452();
                        var5.field6339 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2596(-118, new class115(var4));
                    }
                }
            }
            class507.field7282[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(III[B)V")
    public abstract void method1507(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IB[BI)I")
    public abstract int method1508(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
    public abstract void method1509(int arg0);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BII)V")
    public static final void method1510(byte arg0, int arg1, int arg2) {
        field3198++;
        class76 var3 = class3.method28(1, (byte) 42, arg2);
        if (arg0 != 121) {
            field3200 = null;
        }
        var3.method403((byte) -117);
        var3.field785 = arg1;
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V")
    public static void method1511(int arg0) {
        field3199 = null;
        if (arg0 == 5504) {
            field3200 = null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(JZIIIIILtf;)V")
    public static final void method1512(long arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class701 arg7) {
        class597.field8420 = arg2;
        class145.field1598 = arg0;
        class469.field6710 = 10000;
        class168.field1878 = arg6;
        class370.field5061 = arg1;
        field3196++;
        class369.field5053 = arg5;
        class258.field3249 = arg4;
        class105.field1130 = arg3;
        class25.field217 = arg7;
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)V")
    public abstract void method1513(int arg0);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)Z")
    public abstract boolean method1514(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "(I)V")
    public static final void method1515(int arg0) {
        field3195++;
        class76 var1 = class3.method28(arg0, (byte) 42, 0);
        var1.method406(-975503968);
    }
}
