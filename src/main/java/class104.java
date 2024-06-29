import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class104 implements class630 {

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!qba", name = "g", descriptor = "Lrq;")
    public class482 field1503;

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "I")
    public int field1504;

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "Lvfa;")
    public class92 field1498;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "Lsv;")
    public static class59 field1501;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(BII)Z")
    public static final boolean method702(byte arg0, int arg1, int arg2) {
        field1497++;
        if (arg0 < 114) {
            field1501 = null;
        }
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V")
    public static void method703(byte arg0) {
        field1501 = null;
        if (arg0 != -82) {
            method703((byte) 6);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)Lag;")
    public class214 method210(int arg0) {
        if (arg0 != 7288) {
            method702((byte) -107, -25, 72);
        }
        field1499++;
        return class491.field6597;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I[BIIIII)Z")
    public static final boolean method704(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -8246) {
            method704(-15, null, -49, -10, -98, -93, 22);
        }
        field1505++;
        int var7 = arg4 % arg3;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg3 - var7;
        }
        int var9 = -((arg0 + arg3 - 1) / arg3);
        int var10 = -((arg3 + arg4 - 1) / arg3);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg1[arg2] == 0) {
                    return true;
                }
                arg2 += arg3;
            }
            int var13 = arg2 - var8;
            if (arg1[var13 - 1] == 0) {
                return true;
            }
            arg2 = arg6 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZLtq;Ltq;)V")
    public static final void method705(boolean arg0, class513 arg1, class513 arg2) {
        if (arg0) {
            field1501 = null;
        }
        field1500++;
        if (arg1.field7164 != null) {
            arg1.method3065(-17363);
        }
        arg1.field7164 = arg2.field7164;
        arg1.field7165 = arg2;
        arg1.field7164.field7165 = arg1;
        arg1.field7165.field7164 = arg1;
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(ILvfa;Lrq;II)V")
    public class104(int arg0, class92 arg1, class482 arg2, int arg3, int arg4) {
        this.field1502 = arg4;
        this.field1503 = arg2;
        this.field1504 = arg0;
        this.field1506 = arg3;
        this.field1498 = arg1;
    }
}
