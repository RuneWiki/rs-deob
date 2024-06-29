import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class60 {

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Lia;")
    public class83 field1035 = new class83();

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Lck;")
    public static class1 field1032 = new class1(64);

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "Z")
    public static boolean field1050 = false;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "[I")
    public static int[] field1051 = new int[2048];

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1049 = "Members object";

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "[I")
    public static int[] field1052 = new int[500];

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "Llk;")
    public static class174 field1048;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Lia;")
    private class83 field1044;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static final void method367(byte arg0) {
        field1036++;
        int var1 = -125 / ((arg0 + 59) / 54);
        class267.field4315.method58(0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Lia;")
    public final class83 method368(int arg0) {
        class83 var2 = this.field1035.field1506;
        if (arg0 != -1) {
            return null;
        }
        field1042++;
        if (this.field1035 == var2) {
            return null;
        } else {
            var2.method547(10026);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BII)I")
    public static final int method369(byte arg0, int arg1, int arg2) {
        if (arg0 == 118) {
            field1039++;
            int var3 = arg1 >> 31 & arg2 - 1;
            return (arg1 + (arg1 >>> 31)) % arg2 + var3;
        } else {
            return -49;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLeh;)V")
    public static final void method370(byte arg0, class101 arg1) {
        field1040++;
        int var2 = arg1.method692(27029);
        class203.field3320 = new class42[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class203.field3320[var3] = new class42();
            class203.field3320[var3].field621 = arg1.method692(27029);
            class203.field3320[var3].field624 = arg1.method695(9295);
        }
        class113.field2046 = arg1.method692(27029);
        int var4 = 17 / ((-arg0 - 19) / 56);
        class129.field2260 = arg1.method692(27029);
        class276.field4420 = arg1.method692(27029);
        class54.field939 = new class236[class129.field2260 + 1 - class113.field2046];
        for (int var5 = 0; var5 < class276.field4420; var5++) {
            int var6 = arg1.method692(27029);
            class236 var7 = class54.field939[var6] = new class236();
            var7.field3992 = arg1.method669((byte) 36);
            var7.field3980 = arg1.method655((byte) 59);
            var7.field3895 = class113.field2046 + var6;
            var7.field3894 = arg1.method695(9295);
            var7.field3896 = arg1.method695(9295);
        }
        class253.field4146 = arg1.method655((byte) 81);
        class83.field1513 = true;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIC)I")
    public static final int method371(int arg0, int arg1, char arg2) {
        field1045++;
        if (arg1 != 14528) {
            method367((byte) -106);
        }
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)Lia;")
    public final class83 method372(int arg0) {
        field1046++;
        int var2 = -121 / ((-arg0 - 57) / 42);
        class83 var3 = this.field1044;
        if (this.field1035 == var3) {
            this.field1044 = null;
            return null;
        } else {
            this.field1044 = var3.field1510;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V")
    public static void method373(int arg0) {
        field1051 = null;
        field1052 = null;
        if (arg0 != -1) {
            field1032 = null;
        }
        field1048 = null;
        field1032 = null;
        field1049 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILia;)V")
    public final void method374(int arg0, class83 arg1) {
        if (arg1.field1510 != null) {
            arg1.method547(10026);
        }
        field1037++;
        arg1.field1506 = this.field1035;
        arg1.field1510 = this.field1035.field1510;
        arg1.field1510.field1506 = arg1;
        arg1.field1506.field1510 = arg1;
        if (arg0 != -1) {
            field1051 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BILvh;)Z")
    public static final boolean method375(byte arg0, int arg1, class108 arg2) {
        if (arg0 != -39) {
            method370((byte) 28, (class101) null);
        }
        field1033++;
        byte[] var3 = arg2.method755((byte) -74, arg1);
        if (var3 == null) {
            return false;
        } else {
            class216.method1438(-128, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)Lia;")
    public final class83 method376(byte arg0) {
        class83 var2 = this.field1035.field1510;
        field1043++;
        if (this.field1035 == var2) {
            this.field1044 = null;
            return null;
        }
        this.field1044 = var2.field1510;
        if (arg0 <= 36) {
            this.method376((byte) -35);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
    public final void method377(int arg0) {
        if (arg0 < 100) {
            return;
        }
        field1041++;
        while (true) {
            class83 var2 = this.field1035.field1506;
            if (this.field1035 == var2) {
                this.field1044 = null;
                return;
            }
            var2.method547(10026);
        }
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)Lia;")
    public final class83 method378(int arg0) {
        field1034++;
        class83 var2 = this.field1044;
        int var3 = 33 % ((-arg0 - 6) / 36);
        if (this.field1035 == var2) {
            this.field1044 = null;
            return null;
        } else {
            this.field1044 = var2.field1506;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)Lia;")
    public final class83 method379(int arg0) {
        if (arg0 != 6347) {
            this.method372(-48);
        }
        field1038++;
        class83 var2 = this.field1035.field1506;
        if (this.field1035 == var2) {
            this.field1044 = null;
            return null;
        } else {
            this.field1044 = var2.field1506;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lia;I)V")
    public final void method380(class83 arg0, int arg1) {
        field1047++;
        if (arg0.field1510 != null) {
            arg0.method547(10026);
        }
        if (arg1 > 119) {
            arg0.field1506 = this.field1035.field1506;
            arg0.field1510 = this.field1035;
            arg0.field1510.field1506 = arg0;
            arg0.field1506.field1510 = arg0;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    public class60() {
        this.field1035.field1506 = this.field1035;
        this.field1035.field1510 = this.field1035;
    }
}
